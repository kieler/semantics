package de.cau.cs.kieler.core.kexpressions.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.core.kexpressions.services.KExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'|'", "'&'", "'!'", "'+'", "'-'", "'*'", "'mod'", "'/'", "'val'", "'=='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'('", "')'", "'@'", "'['", "']'", "'.'"
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
    public static final int RULE_INT=7;
    public static final int RULE_WS=14;
    public static final int RULE_COMMENT_ANNOTATION=10;

    // delegates
    // delegators


        public InternalKExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g"; }


     
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:61:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:62:1: ( ruleRoot EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:63:1: ruleRoot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRoot_in_entryRuleRoot67);
            ruleRoot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoot74); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:70:1: ruleRoot : ( ruleExpression ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:74:2: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:75:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:75:1: ( ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:76:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootAccess().getExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleRoot100);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:89:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:90:1: ( ruleExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:91:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression126);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression133); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:98:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:102:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:103:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:103:1: ( ( rule__Expression__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:104:1: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:105:1: ( rule__Expression__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:105:2: rule__Expression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Alternatives_in_ruleExpression159);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:117:1: entryRuleBoolExpression : ruleBoolExpression EOF ;
    public final void entryRuleBoolExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:118:1: ( ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:119:1: ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression186);
            ruleBoolExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolExpression193); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:126:1: ruleBoolExpression : ( ruleOrExpression ) ;
    public final void ruleBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:130:2: ( ( ruleOrExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:131:1: ( ruleOrExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:131:1: ( ruleOrExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:132:1: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExpressionAccess().getOrExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleBoolExpression219);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:145:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:146:1: ( ruleOrExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:147:1: ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression245);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression252); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:154:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:158:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:159:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:159:1: ( ( rule__OrExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:160:1: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:161:1: ( rule__OrExpression__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:161:2: rule__OrExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression278);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:173:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:174:1: ( ruleAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:175:1: ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression305);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression312); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:182:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:186:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:187:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:187:1: ( ( rule__AndExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:188:1: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:189:1: ( rule__AndExpression__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:189:2: rule__AndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression338);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:201:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:202:1: ( ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:203:1: ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation365);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation372); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:210:1: ruleCompareOperation : ( ( rule__CompareOperation__Alternatives ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:214:2: ( ( ( rule__CompareOperation__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:215:1: ( ( rule__CompareOperation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:215:1: ( ( rule__CompareOperation__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:216:1: ( rule__CompareOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:217:1: ( rule__CompareOperation__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:217:2: rule__CompareOperation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Alternatives_in_ruleCompareOperation398);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:229:1: entryRuleNotOrValuedExpression : ruleNotOrValuedExpression EOF ;
    public final void entryRuleNotOrValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:230:1: ( ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:231:1: ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression425);
            ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression432); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:238:1: ruleNotOrValuedExpression : ( ( rule__NotOrValuedExpression__Alternatives ) ) ;
    public final void ruleNotOrValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:242:2: ( ( ( rule__NotOrValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:243:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:243:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:244:1: ( rule__NotOrValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:245:1: ( rule__NotOrValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:245:2: rule__NotOrValuedExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotOrValuedExpression__Alternatives_in_ruleNotOrValuedExpression458);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:257:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:258:1: ( ruleNotExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:259:1: ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression485);
            ruleNotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression492); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:266:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:270:2: ( ( ( rule__NotExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:271:1: ( ( rule__NotExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:271:1: ( ( rule__NotExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:272:1: ( rule__NotExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:273:1: ( rule__NotExpression__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:273:2: rule__NotExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression518);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:285:1: entryRuleValuedExpression : ruleValuedExpression EOF ;
    public final void entryRuleValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:286:1: ( ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:287:1: ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression545);
            ruleValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression552); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:294:1: ruleValuedExpression : ( ruleAddExpression ) ;
    public final void ruleValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:298:2: ( ( ruleAddExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:299:1: ( ruleAddExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:299:1: ( ruleAddExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:300:1: ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression578);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:313:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:314:1: ( ruleAddExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:315:1: ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression604);
            ruleAddExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression611); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:322:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:326:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:327:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:327:1: ( ( rule__AddExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:328:1: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:329:1: ( rule__AddExpression__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:329:2: rule__AddExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression637);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:341:1: entryRuleSubExpression : ruleSubExpression EOF ;
    public final void entryRuleSubExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:342:1: ( ruleSubExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:343:1: ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression664);
            ruleSubExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression671); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:350:1: ruleSubExpression : ( ( rule__SubExpression__Group__0 ) ) ;
    public final void ruleSubExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:354:2: ( ( ( rule__SubExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:355:1: ( ( rule__SubExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:355:1: ( ( rule__SubExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:356:1: ( rule__SubExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:357:1: ( rule__SubExpression__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:357:2: rule__SubExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__0_in_ruleSubExpression697);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:369:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:370:1: ( ruleMultExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:371:1: ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression724);
            ruleMultExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression731); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:378:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:382:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:383:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:383:1: ( ( rule__MultExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:384:1: ( rule__MultExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:385:1: ( rule__MultExpression__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:385:2: rule__MultExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression757);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:397:1: entryRuleDivExpression : ruleDivExpression EOF ;
    public final void entryRuleDivExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:398:1: ( ruleDivExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:399:1: ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression784);
            ruleDivExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression791); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:406:1: ruleDivExpression : ( ( rule__DivExpression__Group__0 ) ) ;
    public final void ruleDivExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:410:2: ( ( ( rule__DivExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:411:1: ( ( rule__DivExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:411:1: ( ( rule__DivExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:412:1: ( rule__DivExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:413:1: ( rule__DivExpression__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:413:2: rule__DivExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression817);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:425:1: entryRuleModExpression : ruleModExpression EOF ;
    public final void entryRuleModExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:426:1: ( ruleModExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:427:1: ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression844);
            ruleModExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression851); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:434:1: ruleModExpression : ( ( rule__ModExpression__Group__0 ) ) ;
    public final void ruleModExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:438:2: ( ( ( rule__ModExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:439:1: ( ( rule__ModExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:439:1: ( ( rule__ModExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:440:1: ( rule__ModExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:441:1: ( rule__ModExpression__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:441:2: rule__ModExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression877);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:453:1: entryRuleNegExpression : ruleNegExpression EOF ;
    public final void entryRuleNegExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:454:1: ( ruleNegExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:455:1: ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_entryRuleNegExpression904);
            ruleNegExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExpression911); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:462:1: ruleNegExpression : ( ( rule__NegExpression__Alternatives ) ) ;
    public final void ruleNegExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:466:2: ( ( ( rule__NegExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:467:1: ( ( rule__NegExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:467:1: ( ( rule__NegExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:468:1: ( rule__NegExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:469:1: ( rule__NegExpression__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:469:2: rule__NegExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Alternatives_in_ruleNegExpression937);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:481:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:482:1: ( ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:483:1: ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression964);
            ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression971); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:490:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:494:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:495:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:495:1: ( ( rule__AtomicExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:496:1: ( rule__AtomicExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:497:1: ( rule__AtomicExpression__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:497:2: rule__AtomicExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression997);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:509:1: entryRuleAtomicValuedExpression : ruleAtomicValuedExpression EOF ;
    public final void entryRuleAtomicValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:510:1: ( ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:511:1: ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression1024);
            ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression1031); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:518:1: ruleAtomicValuedExpression : ( ( rule__AtomicValuedExpression__Alternatives ) ) ;
    public final void ruleAtomicValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:522:2: ( ( ( rule__AtomicValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:523:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:523:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:524:1: ( rule__AtomicValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:525:1: ( rule__AtomicValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:525:2: rule__AtomicValuedExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression1057);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:537:1: entryRuleValuedObjectTestExpression : ruleValuedObjectTestExpression EOF ;
    public final void entryRuleValuedObjectTestExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:538:1: ( ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:539:1: ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression1084);
            ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression1091); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:546:1: ruleValuedObjectTestExpression : ( ( rule__ValuedObjectTestExpression__Alternatives ) ) ;
    public final void ruleValuedObjectTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:550:2: ( ( ( rule__ValuedObjectTestExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:551:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:551:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:552:1: ( rule__ValuedObjectTestExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:553:1: ( rule__ValuedObjectTestExpression__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:553:2: rule__ValuedObjectTestExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Alternatives_in_ruleValuedObjectTestExpression1117);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:565:1: entryRuleValuedObjectReference : ruleValuedObjectReference EOF ;
    public final void entryRuleValuedObjectReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:566:1: ( ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:567:1: ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference1144);
            ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference1151); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:574:1: ruleValuedObjectReference : ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) ) ;
    public final void ruleValuedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:578:2: ( ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:579:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:579:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:580:1: ( rule__ValuedObjectReference__ValuedObjectAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:581:1: ( rule__ValuedObjectReference__ValuedObjectAssignment )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:581:2: rule__ValuedObjectReference__ValuedObjectAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__ValuedObjectAssignment_in_ruleValuedObjectReference1177);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:593:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:594:1: ( ruleTextExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:595:1: ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression1204);
            ruleTextExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression1211); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:602:1: ruleTextExpression : ( ( rule__TextExpression__TextAssignment ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:606:2: ( ( ( rule__TextExpression__TextAssignment ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:607:1: ( ( rule__TextExpression__TextAssignment ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:607:1: ( ( rule__TextExpression__TextAssignment ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:608:1: ( rule__TextExpression__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTextAssignment()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:609:1: ( rule__TextExpression__TextAssignment )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:609:2: rule__TextExpression__TextAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__TextAssignment_in_ruleTextExpression1237);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:621:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:622:1: ( ruleIntValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:623:1: ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue1264);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue1271); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:630:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:634:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:635:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:635:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:636:1: ( rule__IntValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:637:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:637:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1297);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:649:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:650:1: ( ruleFloatValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:651:1: ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue1324);
            ruleFloatValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue1331); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:658:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:662:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:663:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:663:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:664:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:665:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:665:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1357);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:677:1: entryRuleBoolValue : ruleBoolValue EOF ;
    public final void entryRuleBoolValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:678:1: ( ruleBoolValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:679:1: ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_entryRuleBoolValue1384);
            ruleBoolValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolValue1391); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:686:1: ruleBoolValue : ( ( rule__BoolValue__ValueAssignment ) ) ;
    public final void ruleBoolValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:690:2: ( ( ( rule__BoolValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:691:1: ( ( rule__BoolValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:691:1: ( ( rule__BoolValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:692:1: ( rule__BoolValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:693:1: ( rule__BoolValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:693:2: rule__BoolValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolValue__ValueAssignment_in_ruleBoolValue1417);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:705:1: entryRuleDoubleValue : ruleDoubleValue EOF ;
    public final void entryRuleDoubleValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:706:1: ( ruleDoubleValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:707:1: ruleDoubleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue1444);
            ruleDoubleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoubleValue1451); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:714:1: ruleDoubleValue : ( ( rule__DoubleValue__ValueAssignment ) ) ;
    public final void ruleDoubleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:718:2: ( ( ( rule__DoubleValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:719:1: ( ( rule__DoubleValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:719:1: ( ( rule__DoubleValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:720:1: ( rule__DoubleValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:721:1: ( rule__DoubleValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:721:2: rule__DoubleValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoubleValue__ValueAssignment_in_ruleDoubleValue1477);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:735:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:736:1: ( ruleAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:737:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation1506);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation1513); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:744:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:748:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:749:1: ( ( rule__Annotation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:749:1: ( ( rule__Annotation__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:750:1: ( rule__Annotation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:751:1: ( rule__Annotation__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:751:2: rule__Annotation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1539);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:765:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:766:1: ( ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:767:1: ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1568);
            ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation1575); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:774:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValueAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:778:2: ( ( ( rule__CommentAnnotation__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:779:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:779:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:780:1: ( rule__CommentAnnotation__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:781:1: ( rule__CommentAnnotation__ValueAssignment )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:781:2: rule__CommentAnnotation__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1601);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:793:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:794:1: ( ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:795:1: ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation1628);
            ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation1635); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:802:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:806:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:807:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:807:1: ( ( rule__TagAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:808:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:809:1: ( rule__TagAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:809:2: rule__TagAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation1661);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:821:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:822:1: ( ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:823:1: ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation1688);
            ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation1695); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:830:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:834:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:835:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:835:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:836:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:837:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:837:2: rule__KeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation1721);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:849:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:850:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:851:1: ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation1748);
            ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation1755); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:858:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:862:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:863:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:863:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:864:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:865:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:865:2: rule__TypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation1781);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:877:1: entryRuleKeyBooleanValueAnnotation : ruleKeyBooleanValueAnnotation EOF ;
    public final void entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:878:1: ( ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:879:1: ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation1808);
            ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation1815); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:886:1: ruleKeyBooleanValueAnnotation : ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyBooleanValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:890:2: ( ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:891:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:891:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:892:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:893:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:893:2: rule__KeyBooleanValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation1841);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:905:1: entryRuleKeyIntValueAnnotation : ruleKeyIntValueAnnotation EOF ;
    public final void entryRuleKeyIntValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:906:1: ( ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:907:1: ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation1868);
            ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation1875); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:914:1: ruleKeyIntValueAnnotation : ( ( rule__KeyIntValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyIntValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:918:2: ( ( ( rule__KeyIntValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:919:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:919:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:920:1: ( rule__KeyIntValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:921:1: ( rule__KeyIntValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:921:2: rule__KeyIntValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation1901);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:933:1: entryRuleKeyFloatValueAnnotation : ruleKeyFloatValueAnnotation EOF ;
    public final void entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:934:1: ( ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:935:1: ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1928);
            ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1935); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:942:1: ruleKeyFloatValueAnnotation : ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyFloatValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:946:2: ( ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:947:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:947:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:948:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:949:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:949:2: rule__KeyFloatValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation1961);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:963:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:964:1: ( ruleEString EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:965:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1990);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1997); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:972:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:976:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:977:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:977:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:978:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:979:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:979:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString2023);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:991:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:992:1: ( ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:993:1: ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID2050);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID2057); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1000:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1004:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1005:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1005:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1006:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1007:1: ( rule__ExtendedID__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1007:2: rule__ExtendedID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID2083);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1020:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1024:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1025:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1025:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1026:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1027:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1027:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator2120);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1039:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1043:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1044:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1044:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1045:1: ( 'pre' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1046:1: ( 'pre' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1046:3: 'pre'
            {
            match(input,16,FollowSets000.FOLLOW_16_in_rulePreOperator2157); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1059:1: ruleOrOperator : ( ( '|' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1063:1: ( ( ( '|' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1064:1: ( ( '|' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1064:1: ( ( '|' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1065:1: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1066:1: ( '|' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1066:3: '|'
            {
            match(input,17,FollowSets000.FOLLOW_17_in_ruleOrOperator2196); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1079:1: ruleAndOperator : ( ( '&' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1083:1: ( ( ( '&' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1084:1: ( ( '&' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1084:1: ( ( '&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1085:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1086:1: ( '&' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1086:3: '&'
            {
            match(input,18,FollowSets000.FOLLOW_18_in_ruleAndOperator2235); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1099:1: ruleNotOperator : ( ( '!' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1103:1: ( ( ( '!' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1104:1: ( ( '!' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1104:1: ( ( '!' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1105:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1106:1: ( '!' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1106:3: '!'
            {
            match(input,19,FollowSets000.FOLLOW_19_in_ruleNotOperator2274); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1119:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1123:1: ( ( ( '+' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1124:1: ( ( '+' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1124:1: ( ( '+' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1125:1: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1126:1: ( '+' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1126:3: '+'
            {
            match(input,20,FollowSets000.FOLLOW_20_in_ruleAddOperator2313); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1139:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1143:1: ( ( ( '-' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1144:1: ( ( '-' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1144:1: ( ( '-' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1145:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1146:1: ( '-' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1146:3: '-'
            {
            match(input,21,FollowSets000.FOLLOW_21_in_ruleSubOperator2352); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1159:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1163:1: ( ( ( '*' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1164:1: ( ( '*' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1164:1: ( ( '*' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1165:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1166:1: ( '*' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1166:3: '*'
            {
            match(input,22,FollowSets000.FOLLOW_22_in_ruleMultOperator2391); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1179:1: ruleModOperator : ( ( 'mod' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1183:1: ( ( ( 'mod' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1184:1: ( ( 'mod' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1184:1: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1185:1: ( 'mod' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1186:1: ( 'mod' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1186:3: 'mod'
            {
            match(input,23,FollowSets000.FOLLOW_23_in_ruleModOperator2430); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1199:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1203:1: ( ( ( '/' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1204:1: ( ( '/' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1204:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1205:1: ( '/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1206:1: ( '/' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1206:3: '/'
            {
            match(input,24,FollowSets000.FOLLOW_24_in_ruleDivOperator2469); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1219:1: ruleValOperator : ( ( 'val' ) ) ;
    public final void ruleValOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1223:1: ( ( ( 'val' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1224:1: ( ( 'val' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1224:1: ( ( 'val' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1225:1: ( 'val' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1226:1: ( 'val' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1226:3: 'val'
            {
            match(input,25,FollowSets000.FOLLOW_25_in_ruleValOperator2508); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1242:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBoolExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1246:1: ( ( ruleValuedExpression ) | ( ruleBoolExpression ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1247:1: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1247:1: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1248:1: ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2549);
                    ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1253:6: ( ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1253:6: ( ruleBoolExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1254:1: ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_rule__Expression__Alternatives2566);
                    ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_1()); 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1264:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );
    public final void rule__CompareOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1268:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1269:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1269:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1270:1: ( rule__CompareOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1271:1: ( rule__CompareOperation__Group_0__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1271:2: rule__CompareOperation__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives2598);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1275:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1275:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1276:1: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2616);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1286:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1290:1: ( ( ruleValuedExpression ) | ( ruleNotExpression ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1291:1: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1291:1: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1292:1: ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2648);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1297:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1297:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1298:1: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2665);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1308:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1312:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_HOSTCODE)||LA4_0==RULE_BOOLEAN||LA4_0==16||LA4_0==25||LA4_0==32) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1313:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1313:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1314:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1315:1: ( rule__NotExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1315:2: rule__NotExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2697);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1319:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1319:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1320:1: ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2715);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1330:1: rule__NegExpression__Alternatives : ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) );
    public final void rule__NegExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1334:1: ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_BOOLEAN)||LA5_0==16||LA5_0==25||LA5_0==32) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1335:1: ( ( rule__NegExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1335:1: ( ( rule__NegExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1336:1: ( rule__NegExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1337:1: ( rule__NegExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1337:2: rule__NegExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__0_in_rule__NegExpression__Alternatives2747);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1341:6: ( ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1341:6: ( ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1342:1: ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__NegExpression__Alternatives2765);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1352:1: rule__AtomicExpression__Alternatives : ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1356:1: ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) )
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
            case 32:
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1357:1: ( ruleBoolValue )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1357:1: ( ruleBoolValue )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1358:1: ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_rule__AtomicExpression__Alternatives2797);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1363:6: ( ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1363:6: ( ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1364:1: ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives2814);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1369:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1369:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1370:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1371:1: ( rule__AtomicExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1371:2: rule__AtomicExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2831);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1375:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1375:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1376:1: ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives2849);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1386:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleDoubleValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1390:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleDoubleValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) )
            int alt7=5;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1391:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1391:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1392:1: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2881);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1397:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1397:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1398:1: ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2898);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1403:6: ( ruleDoubleValue )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1403:6: ( ruleDoubleValue )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1404:1: ruleDoubleValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getDoubleValueParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDoubleValue_in_rule__AtomicValuedExpression__Alternatives2915);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1409:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1409:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1410:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1411:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1411:2: rule__AtomicValuedExpression__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_rule__AtomicValuedExpression__Alternatives2932);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1415:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1415:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1416:1: ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives2950);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1426:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1430:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) )
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1431:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1431:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1432:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1433:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1433:2: rule__ValuedObjectTestExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives2982);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1437:6: ( ruleValuedObjectReference )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1437:6: ( ruleValuedObjectReference )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1438:1: ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives3000);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1448:1: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 : ( ( rulePreOperator ) | ( ruleValOperator ) );
    public final void rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1452:1: ( ( rulePreOperator ) | ( ruleValOperator ) )
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1453:1: ( rulePreOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1453:1: ( rulePreOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1454:1: rulePreOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03032);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1459:6: ( ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1459:6: ( ruleValOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1460:1: ruleValOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03049);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1471:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1475:1: ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) )
            int alt10=7;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1476:1: ( ruleCommentAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1476:1: ( ruleCommentAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1477:1: ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives3082);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1482:6: ( ruleTagAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1482:6: ( ruleTagAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1483:1: ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives3099);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1488:6: ( ruleKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1488:6: ( ruleKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1489:1: ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives3116);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1494:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1494:6: ( ruleTypedKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1495:1: ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives3133);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1500:6: ( ruleKeyBooleanValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1500:6: ( ruleKeyBooleanValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1501:1: ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives3150);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1506:6: ( ruleKeyIntValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1506:6: ( ruleKeyIntValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1507:1: ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives3167);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1512:6: ( ruleKeyFloatValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1512:6: ( ruleKeyFloatValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1513:1: ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives3184);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1524:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1528:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1529:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1529:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1530:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives3217); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1535:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1535:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1536:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives3234); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1546:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1550:1: ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1551:1: ( ( '==' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1551:1: ( ( '==' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1552:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1553:1: ( '==' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1553:3: '=='
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__CompareOperator__Alternatives3267); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1558:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1558:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1559:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1560:1: ( '<' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1560:3: '<'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__CompareOperator__Alternatives3288); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1565:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1565:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1566:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1567:1: ( '<=' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1567:3: '<='
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__CompareOperator__Alternatives3309); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1572:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1572:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1573:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1574:1: ( '>' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1574:3: '>'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__CompareOperator__Alternatives3330); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1579:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1579:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1580:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1581:1: ( '>=' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1581:3: '>='
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__CompareOperator__Alternatives3351); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1586:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1586:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1587:1: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1588:1: ( '<>' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1588:3: '<>'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__CompareOperator__Alternatives3372); if (state.failed) return ;

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


    // $ANTLR start "rule__OrExpression__Group__0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1602:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1606:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1607:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__03407);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__03410);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1614:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1618:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1619:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1619:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1620:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl3437);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1631:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1635:1: ( rule__OrExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1636:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__13466);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1642:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1646:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1647:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1647:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1648:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1649:1: ( rule__OrExpression__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1649:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl3493);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1663:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1667:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1668:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__03528);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__03531);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1675:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1679:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1680:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1680:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1681:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1682:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1684:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1694:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1698:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1699:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__13589);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__13592);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1706:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1710:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1711:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1711:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1712:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1713:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1713:2: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl3619);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1723:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1727:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1728:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__23649);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1734:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1738:1: ( ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1739:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1739:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1740:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1741:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1741:2: rule__OrExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl3676);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1757:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1761:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1762:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__03712);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__03715);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1769:1: rule__AndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1773:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1774:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1774:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1775:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl3742);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1786:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1790:1: ( rule__AndExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1791:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__13771);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1797:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1801:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1802:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1802:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1803:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1804:1: ( rule__AndExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1804:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl3798);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1818:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1822:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1823:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__03833);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__03836);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1830:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1834:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1835:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1835:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1836:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1837:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1839:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1849:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1853:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1854:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__13894);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__13897);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1861:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1865:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1866:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1866:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1867:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1868:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1868:2: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl3924);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1878:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1882:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1883:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__23954);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1889:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1893:1: ( ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1894:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1894:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1895:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1896:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1896:2: rule__AndExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl3981);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1912:1: rule__CompareOperation__Group_0__0 : rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 ;
    public final void rule__CompareOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1916:1: ( rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1917:2: rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__04017);
            rule__CompareOperation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__04020);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1924:1: rule__CompareOperation__Group_0__0__Impl : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1928:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1929:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1929:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1930:1: ruleNotOrValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl4047);
            ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1941:1: rule__CompareOperation__Group_0__1 : rule__CompareOperation__Group_0__1__Impl ;
    public final void rule__CompareOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1945:1: ( rule__CompareOperation__Group_0__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1946:2: rule__CompareOperation__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__14076);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1952:1: rule__CompareOperation__Group_0__1__Impl : ( ( rule__CompareOperation__Group_0_1__0 ) ) ;
    public final void rule__CompareOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1956:1: ( ( ( rule__CompareOperation__Group_0_1__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1957:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1957:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1958:1: ( rule__CompareOperation__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1959:1: ( rule__CompareOperation__Group_0_1__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1959:2: rule__CompareOperation__Group_0_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl4103);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1973:1: rule__CompareOperation__Group_0_1__0 : rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 ;
    public final void rule__CompareOperation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1977:1: ( rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1978:2: rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__04137);
            rule__CompareOperation__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__04140);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1985:1: rule__CompareOperation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1989:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1990:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1990:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1991:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1992:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1994:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2004:1: rule__CompareOperation__Group_0_1__1 : rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 ;
    public final void rule__CompareOperation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2008:1: ( rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2009:2: rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__14198);
            rule__CompareOperation__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__14201);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2016:1: rule__CompareOperation__Group_0_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__CompareOperation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2020:1: ( ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2021:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2021:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2022:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_0_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2023:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2023:2: rule__CompareOperation__OperatorAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl4228);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2033:1: rule__CompareOperation__Group_0_1__2 : rule__CompareOperation__Group_0_1__2__Impl ;
    public final void rule__CompareOperation__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2037:1: ( rule__CompareOperation__Group_0_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2038:2: rule__CompareOperation__Group_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__24258);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2044:1: rule__CompareOperation__Group_0_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) ;
    public final void rule__CompareOperation__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2048:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2049:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2049:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2050:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_0_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2051:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2051:2: rule__CompareOperation__SubExpressionsAssignment_0_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl4285);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2067:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2071:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2072:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__04321);
            rule__NotExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__04324);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2079:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2083:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2084:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2084:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2085:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2086:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2088:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2098:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2102:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2103:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__14382);
            rule__NotExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__14385);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2110:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2114:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2115:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2115:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2116:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2117:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2117:2: rule__NotExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl4412);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2127:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2131:1: ( rule__NotExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2132:2: rule__NotExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__24442);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2138:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2142:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2143:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2143:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2144:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2145:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2145:2: rule__NotExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl4469);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2161:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2165:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2166:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__04505);
            rule__AddExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__04508);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2173:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2177:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2178:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2178:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2179:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl4535);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2190:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2194:1: ( rule__AddExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2195:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__14564);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2201:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2205:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2206:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2206:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2207:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2208:1: ( rule__AddExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2208:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl4591);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2222:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2226:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2227:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__04626);
            rule__AddExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__04629);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2234:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2238:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2239:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2239:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2240:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2241:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2243:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2253:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2257:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2258:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__14687);
            rule__AddExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__14690);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2265:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2269:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2270:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2270:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2271:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2272:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2272:2: rule__AddExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl4717);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2282:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2286:1: ( rule__AddExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2287:2: rule__AddExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__24747);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2293:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2297:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2298:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2298:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2299:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2300:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2300:2: rule__AddExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl4774);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2316:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2320:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2321:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__04810);
            rule__SubExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__04813);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2328:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2332:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2333:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2333:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2334:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl4840);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2345:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2349:1: ( rule__SubExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2350:2: rule__SubExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__14869);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2356:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2360:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2361:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2361:1: ( ( rule__SubExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2362:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2363:1: ( rule__SubExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2363:2: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl4896);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2377:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2381:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2382:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__04931);
            rule__SubExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__04934);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2389:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2393:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2394:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2394:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2395:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2396:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2398:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2408:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2412:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2413:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__14992);
            rule__SubExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__14995);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2420:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2424:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2425:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2425:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2426:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2427:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2427:2: rule__SubExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl5022);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2437:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2441:1: ( rule__SubExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2442:2: rule__SubExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__25052);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2448:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2452:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2453:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2453:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2454:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2455:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2455:2: rule__SubExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5079);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2471:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2475:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2476:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05115);
            rule__MultExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05118);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2483:1: rule__MultExpression__Group__0__Impl : ( ruleDivExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2487:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2488:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2488:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2489:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_rule__MultExpression__Group__0__Impl5145);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2500:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2504:1: ( rule__MultExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2505:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15174);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2511:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2515:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2516:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2516:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2517:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2518:1: ( rule__MultExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2518:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5201);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2532:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2536:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2537:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__05236);
            rule__MultExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__05239);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2544:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2548:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2549:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2549:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2550:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2551:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2553:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2563:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2567:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2568:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__15297);
            rule__MultExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__15300);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2575:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2579:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2580:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2580:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2581:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2582:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2582:2: rule__MultExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl5327);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2592:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2596:1: ( rule__MultExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2597:2: rule__MultExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__25357);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2603:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2607:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2608:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2608:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2609:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2610:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2610:2: rule__MultExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl5384);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2626:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2630:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2631:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__05420);
            rule__DivExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__05423);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2638:1: rule__DivExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2642:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2643:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2643:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2644:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__DivExpression__Group__0__Impl5450);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2655:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2659:1: ( rule__DivExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2660:2: rule__DivExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__15479);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2666:1: rule__DivExpression__Group__1__Impl : ( ( rule__DivExpression__Group_1__0 )? ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2670:1: ( ( ( rule__DivExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2671:1: ( ( rule__DivExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2671:1: ( ( rule__DivExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2672:1: ( rule__DivExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2673:1: ( rule__DivExpression__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2673:2: rule__DivExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__0_in_rule__DivExpression__Group__1__Impl5506);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2687:1: rule__DivExpression__Group_1__0 : rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 ;
    public final void rule__DivExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2691:1: ( rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2692:2: rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__0__Impl_in_rule__DivExpression__Group_1__05541);
            rule__DivExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__1_in_rule__DivExpression__Group_1__05544);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2699:1: rule__DivExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DivExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2703:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2704:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2704:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2705:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2706:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2708:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2718:1: rule__DivExpression__Group_1__1 : rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 ;
    public final void rule__DivExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2722:1: ( rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2723:2: rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__1__Impl_in_rule__DivExpression__Group_1__15602);
            rule__DivExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__2_in_rule__DivExpression__Group_1__15605);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2730:1: rule__DivExpression__Group_1__1__Impl : ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__DivExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2734:1: ( ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2735:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2735:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2736:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2737:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2737:2: rule__DivExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__OperatorAssignment_1_1_in_rule__DivExpression__Group_1__1__Impl5632);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2747:1: rule__DivExpression__Group_1__2 : rule__DivExpression__Group_1__2__Impl ;
    public final void rule__DivExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2751:1: ( rule__DivExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2752:2: rule__DivExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__2__Impl_in_rule__DivExpression__Group_1__25662);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2758:1: rule__DivExpression__Group_1__2__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2762:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2763:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2763:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2764:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2765:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2765:2: rule__DivExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__SubExpressionsAssignment_1_2_in_rule__DivExpression__Group_1__2__Impl5689);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2781:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2785:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2786:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__05725);
            rule__ModExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__05728);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2793:1: rule__ModExpression__Group__0__Impl : ( ruleNegExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2797:1: ( ( ruleNegExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2798:1: ( ruleNegExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2798:1: ( ruleNegExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2799:1: ruleNegExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_rule__ModExpression__Group__0__Impl5755);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2810:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2814:1: ( rule__ModExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2815:2: rule__ModExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__15784);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2821:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2825:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2826:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2826:1: ( ( rule__ModExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2827:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2828:1: ( rule__ModExpression__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2828:2: rule__ModExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl5811);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2842:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2846:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2847:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__05846);
            rule__ModExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__05849);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2854:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2858:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2859:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2859:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2860:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2861:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2863:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2873:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2877:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2878:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__15907);
            rule__ModExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__15910);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2885:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2889:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2890:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2890:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2891:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2892:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2892:2: rule__ModExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl5937);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2902:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2906:1: ( rule__ModExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2907:2: rule__ModExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__25967);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2913:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2917:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2918:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2918:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2919:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2920:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2920:2: rule__ModExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl5994);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2936:1: rule__NegExpression__Group_0__0 : rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 ;
    public final void rule__NegExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2940:1: ( rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2941:2: rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__0__Impl_in_rule__NegExpression__Group_0__06030);
            rule__NegExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__1_in_rule__NegExpression__Group_0__06033);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2948:1: rule__NegExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NegExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2952:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2953:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2953:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2954:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2955:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2957:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2967:1: rule__NegExpression__Group_0__1 : rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 ;
    public final void rule__NegExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2971:1: ( rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2972:2: rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__1__Impl_in_rule__NegExpression__Group_0__16091);
            rule__NegExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__2_in_rule__NegExpression__Group_0__16094);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2979:1: rule__NegExpression__Group_0__1__Impl : ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NegExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2983:1: ( ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2984:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2984:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2985:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2986:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2986:2: rule__NegExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__OperatorAssignment_0_1_in_rule__NegExpression__Group_0__1__Impl6121);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2996:1: rule__NegExpression__Group_0__2 : rule__NegExpression__Group_0__2__Impl ;
    public final void rule__NegExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3000:1: ( rule__NegExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3001:2: rule__NegExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__2__Impl_in_rule__NegExpression__Group_0__26151);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3007:1: rule__NegExpression__Group_0__2__Impl : ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NegExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3011:1: ( ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3012:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3012:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3013:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3014:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3014:2: rule__NegExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__SubExpressionsAssignment_0_2_in_rule__NegExpression__Group_0__2__Impl6178);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3030:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3034:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3035:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__06214);
            rule__AtomicExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__06217);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3042:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3046:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3047:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3047:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3048:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__AtomicExpression__Group_2__0__Impl6245); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3061:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3065:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3066:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__16276);
            rule__AtomicExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__16279);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3073:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBoolExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3077:1: ( ( ruleBoolExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3078:1: ( ruleBoolExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3078:1: ( ruleBoolExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3079:1: ruleBoolExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_rule__AtomicExpression__Group_2__1__Impl6306);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3090:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3094:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3095:2: rule__AtomicExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__26335);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3101:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3105:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3106:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3106:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3107:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__AtomicExpression__Group_2__2__Impl6363); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3126:1: rule__AtomicValuedExpression__Group_3__0 : rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 ;
    public final void rule__AtomicValuedExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3130:1: ( rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3131:2: rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__0__Impl_in_rule__AtomicValuedExpression__Group_3__06400);
            rule__AtomicValuedExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__1_in_rule__AtomicValuedExpression__Group_3__06403);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3138:1: rule__AtomicValuedExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3142:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3143:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3143:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3144:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__AtomicValuedExpression__Group_3__0__Impl6431); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3157:1: rule__AtomicValuedExpression__Group_3__1 : rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 ;
    public final void rule__AtomicValuedExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3161:1: ( rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3162:2: rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__1__Impl_in_rule__AtomicValuedExpression__Group_3__16462);
            rule__AtomicValuedExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__2_in_rule__AtomicValuedExpression__Group_3__16465);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3169:1: rule__AtomicValuedExpression__Group_3__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3173:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3174:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3174:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3175:1: ruleValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_3__1__Impl6492);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3186:1: rule__AtomicValuedExpression__Group_3__2 : rule__AtomicValuedExpression__Group_3__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3190:1: ( rule__AtomicValuedExpression__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3191:2: rule__AtomicValuedExpression__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__2__Impl_in_rule__AtomicValuedExpression__Group_3__26521);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3197:1: rule__AtomicValuedExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3201:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3202:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3202:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3203:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__AtomicValuedExpression__Group_3__2__Impl6549); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3222:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3226:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3227:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__06586);
            rule__ValuedObjectTestExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__06589);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3234:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3238:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3239:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3239:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3240:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3241:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3243:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3253:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3257:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3258:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__16647);
            rule__ValuedObjectTestExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__16650);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3265:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3269:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3270:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3270:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3271:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3272:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3272:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl6677);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3282:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3286:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3287:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__26707);
            rule__ValuedObjectTestExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__26710);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3294:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3298:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3299:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3299:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3300:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__ValuedObjectTestExpression__Group_0__2__Impl6738); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3313:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3317:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3318:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__36769);
            rule__ValuedObjectTestExpression__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__36772);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3325:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3329:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3330:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3330:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3331:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3332:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3332:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl6799);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3342:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3346:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3347:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__46829);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3353:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3357:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3358:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3358:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3359:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__ValuedObjectTestExpression__Group_0__4__Impl6857); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3382:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3386:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3387:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__06898);
            rule__TagAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__06901);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3394:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3398:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3399:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3399:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3400:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__TagAnnotation__Group__0__Impl6929); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3413:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3417:1: ( rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3418:2: rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__16960);
            rule__TagAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__16963);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3425:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3429:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3430:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3430:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3431:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3432:1: ( rule__TagAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3432:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl6990);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3442:1: rule__TagAnnotation__Group__2 : rule__TagAnnotation__Group__2__Impl ;
    public final void rule__TagAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3446:1: ( rule__TagAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3447:2: rule__TagAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__27020);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3453:1: rule__TagAnnotation__Group__2__Impl : ( ( rule__TagAnnotation__Group_2__0 )? ) ;
    public final void rule__TagAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3457:1: ( ( ( rule__TagAnnotation__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3458:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3458:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3459:1: ( rule__TagAnnotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3460:1: ( rule__TagAnnotation__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3460:2: rule__TagAnnotation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl7047);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3476:1: rule__TagAnnotation__Group_2__0 : rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 ;
    public final void rule__TagAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3480:1: ( rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3481:2: rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__07084);
            rule__TagAnnotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__07087);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3488:1: rule__TagAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TagAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3492:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3493:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3493:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3494:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__TagAnnotation__Group_2__0__Impl7115); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3507:1: rule__TagAnnotation__Group_2__1 : rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 ;
    public final void rule__TagAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3511:1: ( rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3512:2: rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__17146);
            rule__TagAnnotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__17149);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3519:1: rule__TagAnnotation__Group_2__1__Impl : ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) ;
    public final void rule__TagAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3523:1: ( ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3524:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3524:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3525:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3526:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMENT_ANNOTATION||LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3526:2: rule__TagAnnotation__AnnotationsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl7176);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3536:1: rule__TagAnnotation__Group_2__2 : rule__TagAnnotation__Group_2__2__Impl ;
    public final void rule__TagAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3540:1: ( rule__TagAnnotation__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3541:2: rule__TagAnnotation__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__27207);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3547:1: rule__TagAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TagAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3551:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3552:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3552:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3553:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__TagAnnotation__Group_2__2__Impl7235); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3572:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3576:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3577:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__07272);
            rule__KeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__07275);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3584:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3588:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3589:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3589:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3590:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyStringValueAnnotation__Group__0__Impl7303); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3603:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3607:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3608:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__17334);
            rule__KeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__17337);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3615:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3619:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3620:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3620:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3621:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3622:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3622:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl7364);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3632:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3636:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3637:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__27394);
            rule__KeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__27397);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3644:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3648:1: ( ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3649:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3649:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3650:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3651:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3651:2: rule__KeyStringValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl7424);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3661:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3665:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3666:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__37454);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3672:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3676:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3677:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3677:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3678:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3679:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3679:2: rule__KeyStringValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl7481);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3697:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3701:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3702:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__07520);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__07523);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3709:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3713:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3714:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3714:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3715:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__KeyStringValueAnnotation__Group_3__0__Impl7551); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3728:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3732:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3733:2: rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__17582);
            rule__KeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__17585);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3740:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3744:1: ( ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3745:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3745:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3746:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3747:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_COMMENT_ANNOTATION||LA23_0==34) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3747:2: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl7612);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3757:1: rule__KeyStringValueAnnotation__Group_3__2 : rule__KeyStringValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3761:1: ( rule__KeyStringValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3762:2: rule__KeyStringValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__27643);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3768:1: rule__KeyStringValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3772:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3773:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3773:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3774:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__KeyStringValueAnnotation__Group_3__2__Impl7671); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3793:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3797:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3798:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__07708);
            rule__TypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__07711);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3805:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3809:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3810:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3810:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3811:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl7739); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3824:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3828:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3829:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__17770);
            rule__TypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__17773);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3836:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3840:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3841:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3841:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3842:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3843:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3843:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl7800);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3853:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3857:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3858:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__27830);
            rule__TypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__27833);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3865:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3869:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3870:1: ( '[' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3870:1: ( '[' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3871:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl7861); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3884:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3888:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3889:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__37892);
            rule__TypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__37895);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3896:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3900:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3901:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3901:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3902:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3903:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3903:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl7922);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3913:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3917:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3918:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__47952);
            rule__TypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__47955);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3925:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3929:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3930:1: ( ']' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3930:1: ( ']' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3931:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl7983); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3944:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3948:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3949:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__58014);
            rule__TypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__58017);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3956:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3960:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3961:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3961:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3962:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueAssignment_5()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3963:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3963:2: rule__TypedKeyStringValueAnnotation__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl8044);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3973:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3977:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3978:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__68074);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3984:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3988:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3989:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3989:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3990:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3991:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3991:2: rule__TypedKeyStringValueAnnotation__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl8101);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4015:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4019:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4020:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__08146);
            rule__TypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__08149);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4027:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4031:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4032:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4032:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4033:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl8177); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4046:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4050:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4051:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__18208);
            rule__TypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__18211);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4058:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4062:1: ( ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4063:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4063:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4064:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAssignment_6_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4065:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_COMMENT_ANNOTATION||LA25_0==34) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4065:2: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl8238);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4075:1: rule__TypedKeyStringValueAnnotation__Group_6__2 : rule__TypedKeyStringValueAnnotation__Group_6__2__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4079:1: ( rule__TypedKeyStringValueAnnotation__Group_6__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4080:2: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__28269);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4086:1: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl : ( ')' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4090:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4091:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4091:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4092:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl8297); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4111:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4115:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4116:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__08334);
            rule__KeyBooleanValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__08337);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4123:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4127:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4128:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4128:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4129:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyBooleanValueAnnotation__Group__0__Impl8365); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4142:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4146:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4147:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__18396);
            rule__KeyBooleanValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__18399);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4154:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4158:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4159:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4159:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4160:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4161:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4161:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl8426);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4171:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4175:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4176:2: rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__28456);
            rule__KeyBooleanValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__28459);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4183:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4187:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4188:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4188:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4189:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4190:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4190:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl8486);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4200:1: rule__KeyBooleanValueAnnotation__Group__3 : rule__KeyBooleanValueAnnotation__Group__3__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4204:1: ( rule__KeyBooleanValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4205:2: rule__KeyBooleanValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__38516);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4211:1: rule__KeyBooleanValueAnnotation__Group__3__Impl : ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4215:1: ( ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4216:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4216:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4217:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4218:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4218:2: rule__KeyBooleanValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl8543);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4236:1: rule__KeyBooleanValueAnnotation__Group_3__0 : rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4240:1: ( rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4241:2: rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__08582);
            rule__KeyBooleanValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__08585);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4248:1: rule__KeyBooleanValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4252:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4253:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4253:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4254:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl8613); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4267:1: rule__KeyBooleanValueAnnotation__Group_3__1 : rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4271:1: ( rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4272:2: rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__18644);
            rule__KeyBooleanValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__18647);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4279:1: rule__KeyBooleanValueAnnotation__Group_3__1__Impl : ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4283:1: ( ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4284:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4284:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4285:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4286:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_COMMENT_ANNOTATION||LA27_0==34) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4286:2: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl8674);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4296:1: rule__KeyBooleanValueAnnotation__Group_3__2 : rule__KeyBooleanValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4300:1: ( rule__KeyBooleanValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4301:2: rule__KeyBooleanValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__28705);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4307:1: rule__KeyBooleanValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4311:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4312:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4312:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4313:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl8733); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4332:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4336:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4337:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__08770);
            rule__KeyIntValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__08773);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4344:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4348:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4349:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4349:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4350:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyIntValueAnnotation__Group__0__Impl8801); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4363:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4367:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4368:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__18832);
            rule__KeyIntValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__18835);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4375:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4379:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4380:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4380:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4381:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4382:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4382:2: rule__KeyIntValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl8862);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4392:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4396:1: ( rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4397:2: rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__28892);
            rule__KeyIntValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__28895);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4404:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4408:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4409:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4409:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4410:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4411:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4411:2: rule__KeyIntValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl8922);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4421:1: rule__KeyIntValueAnnotation__Group__3 : rule__KeyIntValueAnnotation__Group__3__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4425:1: ( rule__KeyIntValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4426:2: rule__KeyIntValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__38952);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4432:1: rule__KeyIntValueAnnotation__Group__3__Impl : ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyIntValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4436:1: ( ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4437:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4437:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4438:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4439:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4439:2: rule__KeyIntValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl8979);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4457:1: rule__KeyIntValueAnnotation__Group_3__0 : rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 ;
    public final void rule__KeyIntValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4461:1: ( rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4462:2: rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__09018);
            rule__KeyIntValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__09021);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4469:1: rule__KeyIntValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4473:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4474:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4474:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4475:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__KeyIntValueAnnotation__Group_3__0__Impl9049); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4488:1: rule__KeyIntValueAnnotation__Group_3__1 : rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 ;
    public final void rule__KeyIntValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4492:1: ( rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4493:2: rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__19080);
            rule__KeyIntValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__19083);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4500:1: rule__KeyIntValueAnnotation__Group_3__1__Impl : ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4504:1: ( ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4505:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4505:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4506:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4507:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_COMMENT_ANNOTATION||LA29_0==34) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4507:2: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl9110);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4517:1: rule__KeyIntValueAnnotation__Group_3__2 : rule__KeyIntValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4521:1: ( rule__KeyIntValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4522:2: rule__KeyIntValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__29141);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4528:1: rule__KeyIntValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4532:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4533:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4533:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4534:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__KeyIntValueAnnotation__Group_3__2__Impl9169); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4553:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4557:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4558:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__09206);
            rule__KeyFloatValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__09209);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4565:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4569:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4570:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4570:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4571:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyFloatValueAnnotation__Group__0__Impl9237); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4584:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4588:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4589:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__19268);
            rule__KeyFloatValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__19271);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4596:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4600:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4601:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4601:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4602:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4603:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4603:2: rule__KeyFloatValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl9298);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4613:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4617:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4618:2: rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__29328);
            rule__KeyFloatValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__29331);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4625:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4629:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4630:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4630:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4631:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4632:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4632:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl9358);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4642:1: rule__KeyFloatValueAnnotation__Group__3 : rule__KeyFloatValueAnnotation__Group__3__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4646:1: ( rule__KeyFloatValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4647:2: rule__KeyFloatValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__39388);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4653:1: rule__KeyFloatValueAnnotation__Group__3__Impl : ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyFloatValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4657:1: ( ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4658:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4658:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4659:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4660:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4660:2: rule__KeyFloatValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl9415);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4678:1: rule__KeyFloatValueAnnotation__Group_3__0 : rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4682:1: ( rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4683:2: rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__09454);
            rule__KeyFloatValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__09457);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4690:1: rule__KeyFloatValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4694:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4695:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4695:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4696:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl9485); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4709:1: rule__KeyFloatValueAnnotation__Group_3__1 : rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4713:1: ( rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4714:2: rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__19516);
            rule__KeyFloatValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__19519);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4721:1: rule__KeyFloatValueAnnotation__Group_3__1__Impl : ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4725:1: ( ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4726:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4726:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4727:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4728:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_COMMENT_ANNOTATION||LA31_0==34) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4728:2: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl9546);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4738:1: rule__KeyFloatValueAnnotation__Group_3__2 : rule__KeyFloatValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4742:1: ( rule__KeyFloatValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4743:2: rule__KeyFloatValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__29577);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4749:1: rule__KeyFloatValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4753:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4754:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4754:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4755:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl9605); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4775:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4779:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4780:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__09643);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__09646);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4787:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4791:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4792:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4792:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4793:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl9673); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4804:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4808:1: ( rule__ExtendedID__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4809:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__19702);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4815:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4819:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4820:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4820:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4821:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4822:1: ( rule__ExtendedID__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==37) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4822:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl9729);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4836:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4840:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4841:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__09764);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__09767);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4848:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4852:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4853:1: ( '.' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4853:1: ( '.' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4854:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ExtendedID__Group_1__0__Impl9795); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4867:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4871:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4872:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__19826);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4878:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4882:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4883:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4883:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4884:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl9853); if (state.failed) return ;
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


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_1"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4900:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4904:1: ( ( ruleOrOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4905:1: ( ruleOrOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4905:1: ( ruleOrOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4906:1: ruleOrOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_19891);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4915:1: rule__OrExpression__SubExpressionsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4919:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4920:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4920:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4921:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_29922);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4930:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4934:1: ( ( ruleAndOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4935:1: ( ruleAndOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4935:1: ( ruleAndOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4936:1: ruleAndOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_19953);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4945:1: rule__AndExpression__SubExpressionsAssignment_1_2 : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4949:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4950:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4950:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4951:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_29984);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4960:1: rule__CompareOperation__OperatorAssignment_0_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4964:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4965:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4965:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4966:1: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_110015);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4975:1: rule__CompareOperation__SubExpressionsAssignment_0_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4979:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4980:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4980:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4981:1: ruleNotOrValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_210046);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4990:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4994:1: ( ( ruleNotOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4995:1: ( ruleNotOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4995:1: ( ruleNotOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4996:1: ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_110077);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5005:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5009:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5010:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5010:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5011:1: ruleNotExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_210108);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5020:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5024:1: ( ( ruleAddOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5025:1: ( ruleAddOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5025:1: ( ruleAddOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5026:1: ruleAddOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_110139);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5035:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5039:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5040:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5040:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5041:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_210170);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5050:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5054:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5055:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5055:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5056:1: ruleSubOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_110201);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5065:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5069:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5070:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5070:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5071:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_210232);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5080:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5084:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5085:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5085:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5086:1: ruleMultOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_110263);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5095:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5099:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5100:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5100:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5101:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_rule__MultExpression__SubExpressionsAssignment_1_210294);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5110:1: rule__DivExpression__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5114:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5115:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5115:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5116:1: ruleDivOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_1_110325);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5125:1: rule__DivExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5129:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5130:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5130:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5131:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__DivExpression__SubExpressionsAssignment_1_210356);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5140:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5144:1: ( ( ruleModOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5145:1: ( ruleModOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5145:1: ( ruleModOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5146:1: ruleModOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_110387);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5155:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5159:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5160:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5160:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5161:1: ruleAtomicValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_210418);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5170:1: rule__NegExpression__OperatorAssignment_0_1 : ( ruleSubOperator ) ;
    public final void rule__NegExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5174:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5175:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5175:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5176:1: ruleSubOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_rule__NegExpression__OperatorAssignment_0_110449);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5185:1: rule__NegExpression__SubExpressionsAssignment_0_2 : ( ruleNegExpression ) ;
    public final void rule__NegExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5189:1: ( ( ruleNegExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5190:1: ( ruleNegExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5190:1: ( ruleNegExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5191:1: ruleNegExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_rule__NegExpression__SubExpressionsAssignment_0_210480);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5200:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5204:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5205:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5205:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5206:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAlternatives_0_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5207:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5207:2: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_110511);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5216:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5220:1: ( ( ruleValuedObjectTestExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5221:1: ( ruleValuedObjectTestExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5221:1: ( ruleValuedObjectTestExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5222:1: ruleValuedObjectTestExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_310544);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5231:1: rule__ValuedObjectReference__ValuedObjectAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5235:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5236:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5236:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5237:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5238:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5239:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment10579); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5250:1: rule__TextExpression__TextAssignment : ( RULE_HOSTCODE ) ;
    public final void rule__TextExpression__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5254:1: ( ( RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5255:1: ( RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5255:1: ( RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5256:1: RULE_HOSTCODE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTextHOSTCODETerminalRuleCall_0()); 
            }
            match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_rule__TextExpression__TextAssignment10614); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5265:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5269:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5270:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5270:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5271:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment10645); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5280:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5284:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5285:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5285:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5286:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment10676); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5295:1: rule__BoolValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BoolValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5299:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5300:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5300:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5301:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__BoolValue__ValueAssignment10707); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5310:1: rule__DoubleValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__DoubleValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5314:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5315:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5315:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5316:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleValueAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__DoubleValue__ValueAssignment10738); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5325:1: rule__CommentAnnotation__ValueAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5329:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5330:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5330:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5331:1: RULE_COMMENT_ANNOTATION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment10769); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5340:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5344:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5345:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5345:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5346:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_110800);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5355:1: rule__TagAnnotation__AnnotationsAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__TagAnnotation__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5359:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5360:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5360:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5361:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_110831);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5370:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5374:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5375:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5375:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5376:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_110862);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5385:1: rule__KeyStringValueAnnotation__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5389:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5390:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5390:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5391:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_210893);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5400:1: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5404:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5405:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5405:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5406:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_110924);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5415:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5419:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5420:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5420:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5421:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_110955);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5430:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5434:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5435:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5435:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5436:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_310986);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5445:1: rule__TypedKeyStringValueAnnotation__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5449:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5450:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5450:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5451:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_511017);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5460:1: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 : ( ruleAnnotation ) ;
    public final void rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5464:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5465:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5465:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5466:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_111048);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5475:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5479:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5480:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5480:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5481:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_111079);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5490:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5494:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5495:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5495:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5496:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_211110); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5505:1: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5509:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5510:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5510:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5511:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_111141);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5520:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5524:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5525:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5525:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5526:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_111172);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5535:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5539:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5540:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5540:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5541:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_211203); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5550:1: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5554:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5555:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5555:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5556:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_111234);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5565:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5569:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5570:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5570:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5571:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_111265);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5580:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5584:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5585:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5585:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5586:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFLOATTerminalRuleCall_2_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_211296); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5595:1: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5599:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5600:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5600:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5601:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_111327);
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

    // $ANTLR start synpred1_InternalKExpressions
    public final void synpred1_InternalKExpressions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1247:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1247:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1247:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1248:1: ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred1_InternalKExpressions2549);
        ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalKExpressions

    // $ANTLR start synpred2_InternalKExpressions
    public final void synpred2_InternalKExpressions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1269:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1269:1: ( ( rule__CompareOperation__Group_0__0 ) )
        {
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1269:1: ( ( rule__CompareOperation__Group_0__0 ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1270:1: ( rule__CompareOperation__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
        }
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1271:1: ( rule__CompareOperation__Group_0__0 )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1271:2: rule__CompareOperation__Group_0__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0_in_synpred2_InternalKExpressions2598);
        rule__CompareOperation__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalKExpressions

    // $ANTLR start synpred3_InternalKExpressions
    public final void synpred3_InternalKExpressions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1291:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1291:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1291:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1292:1: ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred3_InternalKExpressions2648);
        ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalKExpressions

    // $ANTLR start synpred10_InternalKExpressions
    public final void synpred10_InternalKExpressions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1397:6: ( ( ruleFloatValue ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1397:6: ( ruleFloatValue )
        {
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1397:6: ( ruleFloatValue )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1398:1: ruleFloatValue
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_synpred10_InternalKExpressions2898);
        ruleFloatValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalKExpressions

    // $ANTLR start synpred11_InternalKExpressions
    public final void synpred11_InternalKExpressions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1403:6: ( ( ruleDoubleValue ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1403:6: ( ruleDoubleValue )
        {
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1403:6: ( ruleDoubleValue )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1404:1: ruleDoubleValue
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getDoubleValueParserRuleCall_2()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleDoubleValue_in_synpred11_InternalKExpressions2915);
        ruleDoubleValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalKExpressions

    // $ANTLR start synpred12_InternalKExpressions
    public final void synpred12_InternalKExpressions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1409:6: ( ( ( rule__AtomicValuedExpression__Group_3__0 ) ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1409:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        {
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1409:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1410:1: ( rule__AtomicValuedExpression__Group_3__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
        }
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1411:1: ( rule__AtomicValuedExpression__Group_3__0 )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1411:2: rule__AtomicValuedExpression__Group_3__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_synpred12_InternalKExpressions2932);
        rule__AtomicValuedExpression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalKExpressions

    // Delegated rules

    public final boolean synpred10_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalKExpressions_fragment(); // can never throw exception
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
        "\1\40\11\0\2\uffff";
    static final String DFA1_acceptS =
        "\12\uffff\1\2\1\1";
    static final String DFA1_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\10\1\11\1\2\1\3\1\5\6\uffff\1\6\2\uffff\1\12\1\uffff\1\1"+
            "\3\uffff\1\7\6\uffff\1\4",
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
            return "1242:1: rule__Expression__Alternatives : ( ( ruleValuedExpression ) | ( ruleBoolExpression ) );";
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
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
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
        "\1\40\3\uffff\7\0\1\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA2_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\10\1\11\2\1\1\5\6\uffff\1\6\2\uffff\1\12\1\uffff\1\1\3\uffff"+
            "\1\7\6\uffff\1\4",
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
            return "1264:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );";
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
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_10 = input.LA(1);

                         
                        int index2_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalKExpressions()) ) {s = 1;}

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
        "\1\40\3\uffff\6\0\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\10\uffff\1\2";
    static final String DFA3_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\10\1\11\2\1\1\5\6\uffff\1\6\2\uffff\1\12\1\uffff\1\1\3\uffff"+
            "\1\7\6\uffff\1\4",
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
            return "1286:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );";
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

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_9 = input.LA(1);

                         
                        int index3_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalKExpressions()) ) {s = 1;}

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
        "\1\40\1\uffff\2\0\10\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\4\uffff\1\2\1\3\1\4";
    static final String DFA7_specialS =
        "\2\uffff\1\0\1\1\10\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\4\1\1\1\2\1\4\6\uffff\1\4\10\uffff\1\4\6\uffff\1\3",
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
            return "1386:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleDoubleValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );";
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
                        if ( (synpred10_InternalKExpressions()) ) {s = 9;}

                        else if ( (synpred11_InternalKExpressions()) ) {s = 10;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalKExpressions()) ) {s = 11;}

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
        "\3\uffff\1\12\7\uffff\1\12";
    static final String DFA10_minS =
        "\1\12\1\uffff\1\5\1\4\1\5\6\uffff\1\4";
    static final String DFA10_maxS =
        "\1\42\1\uffff\1\5\1\45\1\5\6\uffff\1\45";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\3\uffff\1\6\1\7\1\3\1\5\1\4\1\2\1\uffff";
    static final String DFA10_specialS =
        "\14\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\27\uffff\1\2",
            "",
            "\1\3",
            "\2\7\1\uffff\1\5\1\6\1\10\1\12\25\uffff\3\12\1\11\1\uffff"+
            "\1\4",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\7\1\uffff\1\5\1\6\1\10\1\12\25\uffff\3\12\1\11\1\uffff"+
            "\1\4"
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
            return "1471:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoot74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleRoot100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression126 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression186 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleBoolExpression219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation365 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Alternatives_in_ruleCompareOperation398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotOrValuedExpression__Alternatives_in_ruleNotOrValuedExpression458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression545 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression604 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression664 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__0_in_ruleSubExpression697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression724 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression784 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression904 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Alternatives_in_ruleNegExpression937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression964 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression1024 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression1031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression1057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression1084 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Alternatives_in_ruleValuedObjectTestExpression1117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference1144 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference1151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__ValuedObjectAssignment_in_ruleValuedObjectReference1177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression1204 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__TextAssignment_in_ruleTextExpression1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1264 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1324 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue1384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue1391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolValue__ValueAssignment_in_ruleBoolValue1417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue1444 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoubleValue1451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoubleValue__ValueAssignment_in_ruleDoubleValue1477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1506 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1568 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation1575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation1628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation1635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation1661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation1688 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation1695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation1721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation1748 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation1755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation1781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation1808 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation1815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation1841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation1868 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation1875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation1901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1928 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation1961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1990 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString2023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID2050 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID2057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID2083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator2120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulePreOperator2157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleOrOperator2196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleAndOperator2235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleNotOperator2274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAddOperator2313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleSubOperator2352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleMultOperator2391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleModOperator2430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleDivOperator2469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleValOperator2508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_rule__Expression__Alternatives2566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives2598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__0_in_rule__NegExpression__Alternatives2747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__NegExpression__Alternatives2765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_rule__AtomicExpression__Alternatives2797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives2814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives2849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleValue_in_rule__AtomicValuedExpression__Alternatives2915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_rule__AtomicValuedExpression__Alternatives2932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives2950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives2982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives3000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives3082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives3099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives3116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives3133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives3150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives3167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives3184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives3217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives3234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__CompareOperator__Alternatives3267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CompareOperator__Alternatives3288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CompareOperator__Alternatives3309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CompareOperator__Alternatives3330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__CompareOperator__Alternatives3351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__CompareOperator__Alternatives3372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__03407 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__03410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl3437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__13466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl3493 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__03528 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__03531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__13589 = new BitSet(new long[]{0x00000001022903E0L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__13592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__23649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl3676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__03712 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__03715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl3742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__13771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl3798 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__03833 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__03836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__13894 = new BitSet(new long[]{0x00000001022903E0L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__13897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl3924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__23954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl3981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__04017 = new BitSet(new long[]{0x00000000FC000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__04020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl4047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__14076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl4103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__04137 = new BitSet(new long[]{0x00000000FC000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__04140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__14198 = new BitSet(new long[]{0x00000001022903E0L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__14201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl4228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__24258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl4285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__04321 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__04324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__14382 = new BitSet(new long[]{0x00000001022903E0L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__14385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl4412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__24442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl4469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__04505 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__04508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl4535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__14564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl4591 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__04626 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__04629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__14687 = new BitSet(new long[]{0x00000001022103E0L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__14690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl4717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__24747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl4774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__04810 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__04813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl4840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__14869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl4896 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__04931 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__04934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__14992 = new BitSet(new long[]{0x00000001022103E0L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__14995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl5022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__25052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05115 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_rule__MultExpression__Group__0__Impl5145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5201 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__05236 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__05239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__15297 = new BitSet(new long[]{0x00000001022103E0L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__15300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl5327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__25357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl5384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__05420 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__05423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__DivExpression__Group__0__Impl5450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__15479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__0_in_rule__DivExpression__Group__1__Impl5506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__0__Impl_in_rule__DivExpression__Group_1__05541 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__1_in_rule__DivExpression__Group_1__05544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__1__Impl_in_rule__DivExpression__Group_1__15602 = new BitSet(new long[]{0x00000001022103E0L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__2_in_rule__DivExpression__Group_1__15605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__OperatorAssignment_1_1_in_rule__DivExpression__Group_1__1__Impl5632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__2__Impl_in_rule__DivExpression__Group_1__25662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__SubExpressionsAssignment_1_2_in_rule__DivExpression__Group_1__2__Impl5689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__05725 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__05728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_rule__ModExpression__Group__0__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__15784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl5811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__05846 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__05849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__15907 = new BitSet(new long[]{0x00000001022103E0L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__15910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl5937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__25967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl5994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__0__Impl_in_rule__NegExpression__Group_0__06030 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__1_in_rule__NegExpression__Group_0__06033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__1__Impl_in_rule__NegExpression__Group_0__16091 = new BitSet(new long[]{0x00000001022103E0L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__2_in_rule__NegExpression__Group_0__16094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__OperatorAssignment_0_1_in_rule__NegExpression__Group_0__1__Impl6121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__2__Impl_in_rule__NegExpression__Group_0__26151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__SubExpressionsAssignment_0_2_in_rule__NegExpression__Group_0__2__Impl6178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__06214 = new BitSet(new long[]{0x00000001022903E0L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__06217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__AtomicExpression__Group_2__0__Impl6245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__16276 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__16279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_rule__AtomicExpression__Group_2__1__Impl6306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__26335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__AtomicExpression__Group_2__2__Impl6363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0__Impl_in_rule__AtomicValuedExpression__Group_3__06400 = new BitSet(new long[]{0x00000001022103E0L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__1_in_rule__AtomicValuedExpression__Group_3__06403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__AtomicValuedExpression__Group_3__0__Impl6431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__1__Impl_in_rule__AtomicValuedExpression__Group_3__16462 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__2_in_rule__AtomicValuedExpression__Group_3__16465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_3__1__Impl6492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__2__Impl_in_rule__AtomicValuedExpression__Group_3__26521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__AtomicValuedExpression__Group_3__2__Impl6549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__06586 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__06589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__16647 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__16650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl6677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__26707 = new BitSet(new long[]{0x0000000002010020L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__26710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__ValuedObjectTestExpression__Group_0__2__Impl6738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__36769 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__36772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl6799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__46829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ValuedObjectTestExpression__Group_0__4__Impl6857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__06898 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__06901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__TagAnnotation__Group__0__Impl6929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__16960 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__16963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl6990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__27020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl7047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__07084 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__07087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__TagAnnotation__Group_2__0__Impl7115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__17146 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__17149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl7176 = new BitSet(new long[]{0x0000000400000402L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__27207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__TagAnnotation__Group_2__2__Impl7235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__07272 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__07275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyStringValueAnnotation__Group__0__Impl7303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__17334 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__17337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl7364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__27394 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__27397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl7424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__37454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl7481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__07520 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__07523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__KeyStringValueAnnotation__Group_3__0__Impl7551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__17582 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__17585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl7612 = new BitSet(new long[]{0x0000000400000402L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__27643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__KeyStringValueAnnotation__Group_3__2__Impl7671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__07708 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__07711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl7739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__17770 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__17773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl7800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__27830 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__27833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl7861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__37892 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__37895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl7922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__47952 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__47955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl7983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__58014 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__58017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl8044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__68074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl8101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__08146 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__08149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl8177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__18208 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__18211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl8238 = new BitSet(new long[]{0x0000000400000402L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__28269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl8297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__08334 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__08337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyBooleanValueAnnotation__Group__0__Impl8365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__18396 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__18399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl8426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__28456 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__28459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl8486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__38516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl8543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__08582 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__08585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl8613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__18644 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__18647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl8674 = new BitSet(new long[]{0x0000000400000402L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__28705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl8733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__08770 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__08773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyIntValueAnnotation__Group__0__Impl8801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__18832 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__18835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl8862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__28892 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__28895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl8922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__38952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl8979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__09018 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__09021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__KeyIntValueAnnotation__Group_3__0__Impl9049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__19080 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__19083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl9110 = new BitSet(new long[]{0x0000000400000402L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__29141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__KeyIntValueAnnotation__Group_3__2__Impl9169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__09206 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__09209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyFloatValueAnnotation__Group__0__Impl9237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__19268 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__19271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl9298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__29328 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__29331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl9358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__39388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl9415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__09454 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__09457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl9485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__19516 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__19519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl9546 = new BitSet(new long[]{0x0000000400000402L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__29577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl9605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__09643 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__09646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl9673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__19702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl9729 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__09764 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__09767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ExtendedID__Group_1__0__Impl9795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__19826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl9853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_19891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_29922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_19953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_29984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_110015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_210046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_110077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_210108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_110139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_210170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_110201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_210232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_110263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_rule__MultExpression__SubExpressionsAssignment_1_210294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_1_110325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__DivExpression__SubExpressionsAssignment_1_210356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_110387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_210418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_rule__NegExpression__OperatorAssignment_0_110449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_rule__NegExpression__SubExpressionsAssignment_0_210480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_110511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_310544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment10579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_rule__TextExpression__TextAssignment10614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment10645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment10676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BoolValue__ValueAssignment10707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__DoubleValue__ValueAssignment10738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment10769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_110800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_110831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_110862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_210893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_110924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_110955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_310986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_511017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_111048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_111079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_211110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_111141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_111172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_211203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_111234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_111265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_211296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_111327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred1_InternalKExpressions2549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_synpred2_InternalKExpressions2598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred3_InternalKExpressions2648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_synpred10_InternalKExpressions2898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleValue_in_synpred11_InternalKExpressions2915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_3__0_in_synpred12_InternalKExpressions2932 = new BitSet(new long[]{0x0000000000000002L});
    }


}