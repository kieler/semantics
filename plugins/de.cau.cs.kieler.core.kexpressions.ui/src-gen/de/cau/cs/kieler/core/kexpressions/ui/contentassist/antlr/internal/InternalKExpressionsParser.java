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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'|'", "'&'", "'!'", "'+'", "'-'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'()'", "'=='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'('", "')'", "'['", "']'", "','", "'@'", "'.'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_ID=5;
    public static final int T__40=40;
    public static final int T__41=41;
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
    public static final int T__39=39;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:126:1: ruleBoolExpression : ( ruleOrAndExpression ) ;
    public final void ruleBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:130:2: ( ( ruleOrAndExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:131:1: ( ruleOrAndExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:131:1: ( ruleOrAndExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:132:1: ruleOrAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolExpressionAccess().getOrAndExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrAndExpression_in_ruleBoolExpression219);
            ruleOrAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolExpressionAccess().getOrAndExpressionParserRuleCall()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleOrAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:145:1: entryRuleOrAndExpression : ruleOrAndExpression EOF ;
    public final void entryRuleOrAndExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:146:1: ( ruleOrAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:147:1: ruleOrAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrAndExpression_in_entryRuleOrAndExpression245);
            ruleOrAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAndExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrAndExpression252); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrAndExpression"


    // $ANTLR start "ruleOrAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:154:1: ruleOrAndExpression : ( ( rule__OrAndExpression__Group__0 ) ) ;
    public final void ruleOrAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:158:2: ( ( ( rule__OrAndExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:159:1: ( ( rule__OrAndExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:159:1: ( ( rule__OrAndExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:160:1: ( rule__OrAndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:161:1: ( rule__OrAndExpression__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:161:2: rule__OrAndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group__0_in_ruleOrAndExpression278);
            rule__OrAndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAndExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:173:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:174:1: ( ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:175:1: ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation305);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation312); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:182:1: ruleCompareOperation : ( ( rule__CompareOperation__Alternatives ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:186:2: ( ( ( rule__CompareOperation__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:187:1: ( ( rule__CompareOperation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:187:1: ( ( rule__CompareOperation__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:188:1: ( rule__CompareOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:189:1: ( rule__CompareOperation__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:189:2: rule__CompareOperation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Alternatives_in_ruleCompareOperation338);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:201:1: entryRuleNotOrValuedExpression : ruleNotOrValuedExpression EOF ;
    public final void entryRuleNotOrValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:202:1: ( ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:203:1: ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression365);
            ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression372); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:210:1: ruleNotOrValuedExpression : ( ( rule__NotOrValuedExpression__Alternatives ) ) ;
    public final void ruleNotOrValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:214:2: ( ( ( rule__NotOrValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:215:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:215:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:216:1: ( rule__NotOrValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:217:1: ( rule__NotOrValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:217:2: rule__NotOrValuedExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotOrValuedExpression__Alternatives_in_ruleNotOrValuedExpression398);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:229:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:230:1: ( ruleNotExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:231:1: ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression425);
            ruleNotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression432); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:238:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:242:2: ( ( ( rule__NotExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:243:1: ( ( rule__NotExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:243:1: ( ( rule__NotExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:244:1: ( rule__NotExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:245:1: ( rule__NotExpression__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:245:2: rule__NotExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression458);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:257:1: entryRuleValuedExpression : ruleValuedExpression EOF ;
    public final void entryRuleValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:258:1: ( ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:259:1: ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression485);
            ruleValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression492); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:266:1: ruleValuedExpression : ( ruleAddExpression ) ;
    public final void ruleValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:270:2: ( ( ruleAddExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:271:1: ( ruleAddExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:271:1: ( ruleAddExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:272:1: ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression518);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:285:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:286:1: ( ruleAddExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:287:1: ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression544);
            ruleAddExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression551); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:294:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:298:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:299:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:299:1: ( ( rule__AddExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:300:1: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:301:1: ( rule__AddExpression__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:301:2: rule__AddExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression577);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:313:1: entryRuleSubExpression : ruleSubExpression EOF ;
    public final void entryRuleSubExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:314:1: ( ruleSubExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:315:1: ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression604);
            ruleSubExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression611); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:322:1: ruleSubExpression : ( ( rule__SubExpression__Group__0 ) ) ;
    public final void ruleSubExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:326:2: ( ( ( rule__SubExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:327:1: ( ( rule__SubExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:327:1: ( ( rule__SubExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:328:1: ( rule__SubExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:329:1: ( rule__SubExpression__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:329:2: rule__SubExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__0_in_ruleSubExpression637);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:341:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:342:1: ( ruleMultExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:343:1: ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression664);
            ruleMultExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression671); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:350:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:354:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:355:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:355:1: ( ( rule__MultExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:356:1: ( rule__MultExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:357:1: ( rule__MultExpression__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:357:2: rule__MultExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression697);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:369:1: entryRuleDivExpression : ruleDivExpression EOF ;
    public final void entryRuleDivExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:370:1: ( ruleDivExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:371:1: ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression724);
            ruleDivExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression731); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:378:1: ruleDivExpression : ( ( rule__DivExpression__Group__0 ) ) ;
    public final void ruleDivExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:382:2: ( ( ( rule__DivExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:383:1: ( ( rule__DivExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:383:1: ( ( rule__DivExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:384:1: ( rule__DivExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:385:1: ( rule__DivExpression__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:385:2: rule__DivExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression757);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:397:1: entryRuleModExpression : ruleModExpression EOF ;
    public final void entryRuleModExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:398:1: ( ruleModExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:399:1: ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression784);
            ruleModExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression791); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:406:1: ruleModExpression : ( ( rule__ModExpression__Group__0 ) ) ;
    public final void ruleModExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:410:2: ( ( ( rule__ModExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:411:1: ( ( rule__ModExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:411:1: ( ( rule__ModExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:412:1: ( rule__ModExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:413:1: ( rule__ModExpression__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:413:2: rule__ModExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression817);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:425:1: entryRuleNegExpression : ruleNegExpression EOF ;
    public final void entryRuleNegExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:426:1: ( ruleNegExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:427:1: ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_entryRuleNegExpression844);
            ruleNegExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExpression851); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:434:1: ruleNegExpression : ( ( rule__NegExpression__Alternatives ) ) ;
    public final void ruleNegExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:438:2: ( ( ( rule__NegExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:439:1: ( ( rule__NegExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:439:1: ( ( rule__NegExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:440:1: ( rule__NegExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:441:1: ( rule__NegExpression__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:441:2: rule__NegExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Alternatives_in_ruleNegExpression877);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:453:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:454:1: ( ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:455:1: ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression904);
            ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression911); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:462:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:466:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:467:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:467:1: ( ( rule__AtomicExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:468:1: ( rule__AtomicExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:469:1: ( rule__AtomicExpression__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:469:2: rule__AtomicExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression937);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:481:1: entryRuleAtomicValuedExpression : ruleAtomicValuedExpression EOF ;
    public final void entryRuleAtomicValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:482:1: ( ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:483:1: ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression964);
            ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression971); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:490:1: ruleAtomicValuedExpression : ( ( rule__AtomicValuedExpression__Alternatives ) ) ;
    public final void ruleAtomicValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:494:2: ( ( ( rule__AtomicValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:495:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:495:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:496:1: ( rule__AtomicValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:497:1: ( rule__AtomicValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:497:2: rule__AtomicValuedExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression997);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:509:1: entryRuleValuedObjectTestExpression : ruleValuedObjectTestExpression EOF ;
    public final void entryRuleValuedObjectTestExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:510:1: ( ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:511:1: ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression1024);
            ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression1031); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:518:1: ruleValuedObjectTestExpression : ( ( rule__ValuedObjectTestExpression__Alternatives ) ) ;
    public final void ruleValuedObjectTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:522:2: ( ( ( rule__ValuedObjectTestExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:523:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:523:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:524:1: ( rule__ValuedObjectTestExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:525:1: ( rule__ValuedObjectTestExpression__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:525:2: rule__ValuedObjectTestExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Alternatives_in_ruleValuedObjectTestExpression1057);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:537:1: entryRuleValuedObjectReference : ruleValuedObjectReference EOF ;
    public final void entryRuleValuedObjectReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:538:1: ( ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:539:1: ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference1084);
            ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference1091); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:546:1: ruleValuedObjectReference : ( ( rule__ValuedObjectReference__Group__0 ) ) ;
    public final void ruleValuedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:550:2: ( ( ( rule__ValuedObjectReference__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:551:1: ( ( rule__ValuedObjectReference__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:551:1: ( ( rule__ValuedObjectReference__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:552:1: ( rule__ValuedObjectReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:553:1: ( rule__ValuedObjectReference__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:553:2: rule__ValuedObjectReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group__0_in_ruleValuedObjectReference1117);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:565:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:566:1: ( ruleFunctionCall EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:567:1: ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall1144);
            ruleFunctionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionCall1151); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:574:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:578:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:579:1: ( ( rule__FunctionCall__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:579:1: ( ( rule__FunctionCall__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:580:1: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:581:1: ( rule__FunctionCall__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:581:2: rule__FunctionCall__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group__0_in_ruleFunctionCall1177);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:593:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:594:1: ( ruleParameter EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:595:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter1204);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter1211); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:602:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:606:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:607:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:607:1: ( ( rule__Parameter__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:608:1: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:609:1: ( rule__Parameter__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:609:2: rule__Parameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0_in_ruleParameter1237);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:621:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:622:1: ( ruleTextExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:623:1: ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression1264);
            ruleTextExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression1271); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:630:1: ruleTextExpression : ( ( rule__TextExpression__TextAssignment ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:634:2: ( ( ( rule__TextExpression__TextAssignment ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:635:1: ( ( rule__TextExpression__TextAssignment ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:635:1: ( ( rule__TextExpression__TextAssignment ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:636:1: ( rule__TextExpression__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTextAssignment()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:637:1: ( rule__TextExpression__TextAssignment )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:637:2: rule__TextExpression__TextAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__TextAssignment_in_ruleTextExpression1297);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:649:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:650:1: ( ruleIntValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:651:1: ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue1324);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue1331); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:658:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:662:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:663:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:663:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:664:1: ( rule__IntValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:665:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:665:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1357);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:677:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:678:1: ( ruleFloatValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:679:1: ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue1384);
            ruleFloatValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue1391); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:686:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:690:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:691:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:691:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:692:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:693:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:693:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1417);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:705:1: entryRuleBoolValue : ruleBoolValue EOF ;
    public final void entryRuleBoolValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:706:1: ( ruleBoolValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:707:1: ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_entryRuleBoolValue1444);
            ruleBoolValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoolValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolValue1451); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:714:1: ruleBoolValue : ( ( rule__BoolValue__ValueAssignment ) ) ;
    public final void ruleBoolValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:718:2: ( ( ( rule__BoolValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:719:1: ( ( rule__BoolValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:719:1: ( ( rule__BoolValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:720:1: ( rule__BoolValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:721:1: ( rule__BoolValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:721:2: rule__BoolValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__BoolValue__ValueAssignment_in_ruleBoolValue1477);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1179:1: ruleModOperator : ( ( '%' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1183:1: ( ( ( '%' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1184:1: ( ( '%' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1184:1: ( ( '%' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1185:1: ( '%' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1186:1: ( '%' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1186:3: '%'
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


    // $ANTLR start "ruleLogicalOrOperator"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1239:1: ruleLogicalOrOperator : ( ( '||' ) ) ;
    public final void ruleLogicalOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1243:1: ( ( ( '||' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1244:1: ( ( '||' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1244:1: ( ( '||' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1245:1: ( '||' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1246:1: ( '||' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1246:3: '||'
            {
            match(input,26,FollowSets000.FOLLOW_26_in_ruleLogicalOrOperator2547); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1259:1: ruleLogicalAndOperator : ( ( '&&' ) ) ;
    public final void ruleLogicalAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1263:1: ( ( ( '&&' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1264:1: ( ( '&&' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1264:1: ( ( '&&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1265:1: ( '&&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1266:1: ( '&&' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1266:3: '&&'
            {
            match(input,27,FollowSets000.FOLLOW_27_in_ruleLogicalAndOperator2586); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1284:1: rule__Expression__Alternatives : ( ( ruleBoolExpression ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1288:1: ( ( ruleBoolExpression ) | ( ruleValuedExpression ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1289:1: ( ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1289:1: ( ruleBoolExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1290:1: ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_rule__Expression__Alternatives2629);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1295:6: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1295:6: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1296:1: ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2646);
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


    // $ANTLR start "rule__OrAndExpression__Alternatives_1"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1306:1: rule__OrAndExpression__Alternatives_1 : ( ( ( rule__OrAndExpression__Group_1_0__0 )* ) | ( ( rule__OrAndExpression__Group_1_1__0 )* ) );
    public final void rule__OrAndExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1310:1: ( ( ( rule__OrAndExpression__Group_1_0__0 )* ) | ( ( rule__OrAndExpression__Group_1_1__0 )* ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 17:
            case 26:
                {
                alt4=1;
                }
                break;
            case EOF:
                {
                int LA4_2 = input.LA(2);

                if ( (synpred3_InternalKExpressions()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA4_3 = input.LA(2);

                if ( (synpred3_InternalKExpressions()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                int LA4_4 = input.LA(2);

                if ( (synpred3_InternalKExpressions()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                int LA4_5 = input.LA(2);

                if ( (synpred3_InternalKExpressions()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            case 18:
            case 27:
                {
                alt4=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1311:1: ( ( rule__OrAndExpression__Group_1_0__0 )* )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1311:1: ( ( rule__OrAndExpression__Group_1_0__0 )* )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1312:1: ( rule__OrAndExpression__Group_1_0__0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAndExpressionAccess().getGroup_1_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1313:1: ( rule__OrAndExpression__Group_1_0__0 )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17||LA2_0==26) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1313:2: rule__OrAndExpression__Group_1_0__0
                    	    {
                    	    pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_0__0_in_rule__OrAndExpression__Alternatives_12678);
                    	    rule__OrAndExpression__Group_1_0__0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrAndExpressionAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1317:6: ( ( rule__OrAndExpression__Group_1_1__0 )* )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1317:6: ( ( rule__OrAndExpression__Group_1_1__0 )* )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1318:1: ( rule__OrAndExpression__Group_1_1__0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAndExpressionAccess().getGroup_1_1()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1319:1: ( rule__OrAndExpression__Group_1_1__0 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18||LA3_0==27) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1319:2: rule__OrAndExpression__Group_1_1__0
                    	    {
                    	    pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_1__0_in_rule__OrAndExpression__Alternatives_12697);
                    	    rule__OrAndExpression__Group_1_1__0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrAndExpressionAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__OrAndExpression__Alternatives_1"


    // $ANTLR start "rule__OrAndExpression__OperatorAlternatives_1_0_1_0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1328:1: rule__OrAndExpression__OperatorAlternatives_1_0_1_0 : ( ( ruleOrOperator ) | ( ruleLogicalOrOperator ) );
    public final void rule__OrAndExpression__OperatorAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1332:1: ( ( ruleOrOperator ) | ( ruleLogicalOrOperator ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==26) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1333:1: ( ruleOrOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1333:1: ( ruleOrOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1334:1: ruleOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAndExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_0_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_rule__OrAndExpression__OperatorAlternatives_1_0_1_02731);
                    ruleOrOperator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrAndExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1339:6: ( ruleLogicalOrOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1339:6: ( ruleLogicalOrOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1340:1: ruleLogicalOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_0_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_rule__OrAndExpression__OperatorAlternatives_1_0_1_02748);
                    ruleLogicalOrOperator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_0_1_0_1()); 
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
    // $ANTLR end "rule__OrAndExpression__OperatorAlternatives_1_0_1_0"


    // $ANTLR start "rule__OrAndExpression__OperatorAlternatives_1_1_1_0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1350:1: rule__OrAndExpression__OperatorAlternatives_1_1_1_0 : ( ( ruleAndOperator ) | ( ruleLogicalAndOperator ) );
    public final void rule__OrAndExpression__OperatorAlternatives_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1354:1: ( ( ruleAndOperator ) | ( ruleLogicalAndOperator ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==27) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1355:1: ( ruleAndOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1355:1: ( ruleAndOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1356:1: ruleAndOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_rule__OrAndExpression__OperatorAlternatives_1_1_1_02780);
                    ruleAndOperator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1361:6: ( ruleLogicalAndOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1361:6: ( ruleLogicalAndOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1362:1: ruleLogicalAndOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndOperator_in_rule__OrAndExpression__OperatorAlternatives_1_1_1_02797);
                    ruleLogicalAndOperator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_1_0_1()); 
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
    // $ANTLR end "rule__OrAndExpression__OperatorAlternatives_1_1_1_0"


    // $ANTLR start "rule__CompareOperation__Alternatives"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1372:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );
    public final void rule__CompareOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1376:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1377:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1377:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1378:1: ( rule__CompareOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1379:1: ( rule__CompareOperation__Group_0__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1379:2: rule__CompareOperation__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives2829);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1383:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1383:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1384:1: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2847);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1394:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1398:1: ( ( ruleValuedExpression ) | ( ruleNotExpression ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1399:1: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1399:1: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1400:1: ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2879);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1405:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1405:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1406:1: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2896);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1416:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1420:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_HOSTCODE)||LA9_0==RULE_BOOLEAN||LA9_0==16||LA9_0==25||LA9_0==30||LA9_0==35) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1421:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1421:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1422:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1423:1: ( rule__NotExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1423:2: rule__NotExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2928);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1427:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1427:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1428:1: ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2946);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1438:1: rule__NegExpression__Alternatives : ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) );
    public final void rule__NegExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1442:1: ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_BOOLEAN)||LA10_0==16||LA10_0==25||LA10_0==30||LA10_0==35) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1443:1: ( ( rule__NegExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1443:1: ( ( rule__NegExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1444:1: ( rule__NegExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1445:1: ( rule__NegExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1445:2: rule__NegExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__0_in_rule__NegExpression__Alternatives2978);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1449:6: ( ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1449:6: ( ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1450:1: ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__NegExpression__Alternatives2996);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1460:1: rule__AtomicExpression__Alternatives : ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1464:1: ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleTextExpression ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
            case 16:
            case 25:
                {
                alt11=2;
                }
                break;
            case 35:
                {
                alt11=3;
                }
                break;
            case 30:
                {
                alt11=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt11=5;
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1465:1: ( ruleBoolValue )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1465:1: ( ruleBoolValue )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1466:1: ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_rule__AtomicExpression__Alternatives3028);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1471:6: ( ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1471:6: ( ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1472:1: ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives3045);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1477:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1477:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1478:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1479:1: ( rule__AtomicExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1479:2: rule__AtomicExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives3062);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1483:6: ( ruleFunctionCall )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1483:6: ( ruleFunctionCall )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1484:1: ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionCall_in_rule__AtomicExpression__Alternatives3080);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1489:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1489:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1490:1: ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives3097);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1500:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1504:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1505:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1505:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1506:1: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives3129);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1511:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1511:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1512:1: ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives3146);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1517:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1517:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1518:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1519:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1519:2: rule__AtomicValuedExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_rule__AtomicValuedExpression__Alternatives3163);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1523:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1523:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1524:1: ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives3181);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1534:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1538:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16||LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1539:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1539:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1540:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1541:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1541:2: rule__ValuedObjectTestExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives3213);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1545:6: ( ruleValuedObjectReference )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1545:6: ( ruleValuedObjectReference )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1546:1: ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives3231);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1556:1: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 : ( ( rulePreOperator ) | ( ruleValOperator ) );
    public final void rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1560:1: ( ( rulePreOperator ) | ( ruleValOperator ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            else if ( (LA14_0==25) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1561:1: ( rulePreOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1561:1: ( rulePreOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1562:1: rulePreOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03263);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1567:6: ( ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1567:6: ( ruleValOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1568:1: ruleValOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03280);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1578:1: rule__FunctionCall__Alternatives_2 : ( ( ( rule__FunctionCall__Group_2_0__0 ) ) | ( '()' ) );
    public final void rule__FunctionCall__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1582:1: ( ( ( rule__FunctionCall__Group_2_0__0 ) ) | ( '()' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1583:1: ( ( rule__FunctionCall__Group_2_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1583:1: ( ( rule__FunctionCall__Group_2_0__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1584:1: ( rule__FunctionCall__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getGroup_2_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1585:1: ( rule__FunctionCall__Group_2_0__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1585:2: rule__FunctionCall__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_0__0_in_rule__FunctionCall__Alternatives_23312);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1589:6: ( '()' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1589:6: ( '()' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1590:1: '()'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1()); 
                    }
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__FunctionCall__Alternatives_23331); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1603:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1607:1: ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) )
            int alt16=7;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1608:1: ( ruleCommentAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1608:1: ( ruleCommentAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1609:1: ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives3366);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1614:6: ( ruleTagAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1614:6: ( ruleTagAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1615:1: ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives3383);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1620:6: ( ruleKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1620:6: ( ruleKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1621:1: ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives3400);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1626:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1626:6: ( ruleTypedKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1627:1: ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives3417);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1632:6: ( ruleKeyBooleanValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1632:6: ( ruleKeyBooleanValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1633:1: ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives3434);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1638:6: ( ruleKeyIntValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1638:6: ( ruleKeyIntValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1639:1: ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives3451);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1644:6: ( ruleKeyFloatValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1644:6: ( ruleKeyFloatValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1645:1: ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives3468);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1656:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1660:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1661:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1661:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1662:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives3501); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1667:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1667:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1668:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives3518); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1678:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1682:1: ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt18=1;
                }
                break;
            case 30:
                {
                alt18=2;
                }
                break;
            case 31:
                {
                alt18=3;
                }
                break;
            case 32:
                {
                alt18=4;
                }
                break;
            case 33:
                {
                alt18=5;
                }
                break;
            case 34:
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1683:1: ( ( '==' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1683:1: ( ( '==' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1684:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1685:1: ( '==' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1685:3: '=='
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__CompareOperator__Alternatives3551); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1690:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1690:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1691:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1692:1: ( '<' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1692:3: '<'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__CompareOperator__Alternatives3572); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1697:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1697:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1698:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1699:1: ( '<=' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1699:3: '<='
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__CompareOperator__Alternatives3593); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1704:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1704:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1705:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1706:1: ( '>' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1706:3: '>'
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_rule__CompareOperator__Alternatives3614); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1711:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1711:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1712:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1713:1: ( '>=' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1713:3: '>='
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__CompareOperator__Alternatives3635); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1718:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1718:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1719:1: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1720:1: ( '<>' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1720:3: '<>'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__CompareOperator__Alternatives3656); if (state.failed) return ;

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


    // $ANTLR start "rule__OrAndExpression__Group__0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1734:1: rule__OrAndExpression__Group__0 : rule__OrAndExpression__Group__0__Impl rule__OrAndExpression__Group__1 ;
    public final void rule__OrAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1738:1: ( rule__OrAndExpression__Group__0__Impl rule__OrAndExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1739:2: rule__OrAndExpression__Group__0__Impl rule__OrAndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group__0__Impl_in_rule__OrAndExpression__Group__03691);
            rule__OrAndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group__1_in_rule__OrAndExpression__Group__03694);
            rule__OrAndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group__0"


    // $ANTLR start "rule__OrAndExpression__Group__0__Impl"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1746:1: rule__OrAndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__OrAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1750:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1751:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1751:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1752:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__OrAndExpression__Group__0__Impl3721);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group__0__Impl"


    // $ANTLR start "rule__OrAndExpression__Group__1"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1763:1: rule__OrAndExpression__Group__1 : rule__OrAndExpression__Group__1__Impl ;
    public final void rule__OrAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1767:1: ( rule__OrAndExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1768:2: rule__OrAndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group__1__Impl_in_rule__OrAndExpression__Group__13750);
            rule__OrAndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group__1"


    // $ANTLR start "rule__OrAndExpression__Group__1__Impl"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1774:1: rule__OrAndExpression__Group__1__Impl : ( ( rule__OrAndExpression__Alternatives_1 ) ) ;
    public final void rule__OrAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1778:1: ( ( ( rule__OrAndExpression__Alternatives_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1779:1: ( ( rule__OrAndExpression__Alternatives_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1779:1: ( ( rule__OrAndExpression__Alternatives_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1780:1: ( rule__OrAndExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1781:1: ( rule__OrAndExpression__Alternatives_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1781:2: rule__OrAndExpression__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Alternatives_1_in_rule__OrAndExpression__Group__1__Impl3777);
            rule__OrAndExpression__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAndExpressionAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group__1__Impl"


    // $ANTLR start "rule__OrAndExpression__Group_1_0__0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1795:1: rule__OrAndExpression__Group_1_0__0 : rule__OrAndExpression__Group_1_0__0__Impl rule__OrAndExpression__Group_1_0__1 ;
    public final void rule__OrAndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1799:1: ( rule__OrAndExpression__Group_1_0__0__Impl rule__OrAndExpression__Group_1_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1800:2: rule__OrAndExpression__Group_1_0__0__Impl rule__OrAndExpression__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_0__0__Impl_in_rule__OrAndExpression__Group_1_0__03811);
            rule__OrAndExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_0__1_in_rule__OrAndExpression__Group_1_0__03814);
            rule__OrAndExpression__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group_1_0__0"


    // $ANTLR start "rule__OrAndExpression__Group_1_0__0__Impl"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1807:1: rule__OrAndExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__OrAndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1811:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1812:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1812:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1813:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1814:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1816:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__OrAndExpression__Group_1_0__1"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1826:1: rule__OrAndExpression__Group_1_0__1 : rule__OrAndExpression__Group_1_0__1__Impl rule__OrAndExpression__Group_1_0__2 ;
    public final void rule__OrAndExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1830:1: ( rule__OrAndExpression__Group_1_0__1__Impl rule__OrAndExpression__Group_1_0__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1831:2: rule__OrAndExpression__Group_1_0__1__Impl rule__OrAndExpression__Group_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_0__1__Impl_in_rule__OrAndExpression__Group_1_0__13872);
            rule__OrAndExpression__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_0__2_in_rule__OrAndExpression__Group_1_0__13875);
            rule__OrAndExpression__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group_1_0__1"


    // $ANTLR start "rule__OrAndExpression__Group_1_0__1__Impl"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1838:1: rule__OrAndExpression__Group_1_0__1__Impl : ( ( rule__OrAndExpression__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__OrAndExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1842:1: ( ( ( rule__OrAndExpression__OperatorAssignment_1_0_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1843:1: ( ( rule__OrAndExpression__OperatorAssignment_1_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1843:1: ( ( rule__OrAndExpression__OperatorAssignment_1_0_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1844:1: ( rule__OrAndExpression__OperatorAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getOperatorAssignment_1_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1845:1: ( rule__OrAndExpression__OperatorAssignment_1_0_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1845:2: rule__OrAndExpression__OperatorAssignment_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__OperatorAssignment_1_0_1_in_rule__OrAndExpression__Group_1_0__1__Impl3902);
            rule__OrAndExpression__OperatorAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAndExpressionAccess().getOperatorAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__OrAndExpression__Group_1_0__2"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1855:1: rule__OrAndExpression__Group_1_0__2 : rule__OrAndExpression__Group_1_0__2__Impl ;
    public final void rule__OrAndExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1859:1: ( rule__OrAndExpression__Group_1_0__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1860:2: rule__OrAndExpression__Group_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_0__2__Impl_in_rule__OrAndExpression__Group_1_0__23932);
            rule__OrAndExpression__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group_1_0__2"


    // $ANTLR start "rule__OrAndExpression__Group_1_0__2__Impl"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1866:1: rule__OrAndExpression__Group_1_0__2__Impl : ( ( rule__OrAndExpression__SubExpressionsAssignment_1_0_2 ) ) ;
    public final void rule__OrAndExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1870:1: ( ( ( rule__OrAndExpression__SubExpressionsAssignment_1_0_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1871:1: ( ( rule__OrAndExpression__SubExpressionsAssignment_1_0_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1871:1: ( ( rule__OrAndExpression__SubExpressionsAssignment_1_0_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1872:1: ( rule__OrAndExpression__SubExpressionsAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getSubExpressionsAssignment_1_0_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1873:1: ( rule__OrAndExpression__SubExpressionsAssignment_1_0_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1873:2: rule__OrAndExpression__SubExpressionsAssignment_1_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__SubExpressionsAssignment_1_0_2_in_rule__OrAndExpression__Group_1_0__2__Impl3959);
            rule__OrAndExpression__SubExpressionsAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAndExpressionAccess().getSubExpressionsAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group_1_0__2__Impl"


    // $ANTLR start "rule__OrAndExpression__Group_1_1__0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1889:1: rule__OrAndExpression__Group_1_1__0 : rule__OrAndExpression__Group_1_1__0__Impl rule__OrAndExpression__Group_1_1__1 ;
    public final void rule__OrAndExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1893:1: ( rule__OrAndExpression__Group_1_1__0__Impl rule__OrAndExpression__Group_1_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1894:2: rule__OrAndExpression__Group_1_1__0__Impl rule__OrAndExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_1__0__Impl_in_rule__OrAndExpression__Group_1_1__03995);
            rule__OrAndExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_1__1_in_rule__OrAndExpression__Group_1_1__03998);
            rule__OrAndExpression__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group_1_1__0"


    // $ANTLR start "rule__OrAndExpression__Group_1_1__0__Impl"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1901:1: rule__OrAndExpression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__OrAndExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1905:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1906:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1906:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1907:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1908:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1910:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__OrAndExpression__Group_1_1__1"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1920:1: rule__OrAndExpression__Group_1_1__1 : rule__OrAndExpression__Group_1_1__1__Impl rule__OrAndExpression__Group_1_1__2 ;
    public final void rule__OrAndExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1924:1: ( rule__OrAndExpression__Group_1_1__1__Impl rule__OrAndExpression__Group_1_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1925:2: rule__OrAndExpression__Group_1_1__1__Impl rule__OrAndExpression__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_1__1__Impl_in_rule__OrAndExpression__Group_1_1__14056);
            rule__OrAndExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_1__2_in_rule__OrAndExpression__Group_1_1__14059);
            rule__OrAndExpression__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group_1_1__1"


    // $ANTLR start "rule__OrAndExpression__Group_1_1__1__Impl"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1932:1: rule__OrAndExpression__Group_1_1__1__Impl : ( ( rule__OrAndExpression__OperatorAssignment_1_1_1 ) ) ;
    public final void rule__OrAndExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1936:1: ( ( ( rule__OrAndExpression__OperatorAssignment_1_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1937:1: ( ( rule__OrAndExpression__OperatorAssignment_1_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1937:1: ( ( rule__OrAndExpression__OperatorAssignment_1_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1938:1: ( rule__OrAndExpression__OperatorAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getOperatorAssignment_1_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1939:1: ( rule__OrAndExpression__OperatorAssignment_1_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1939:2: rule__OrAndExpression__OperatorAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__OperatorAssignment_1_1_1_in_rule__OrAndExpression__Group_1_1__1__Impl4086);
            rule__OrAndExpression__OperatorAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAndExpressionAccess().getOperatorAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__OrAndExpression__Group_1_1__2"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1949:1: rule__OrAndExpression__Group_1_1__2 : rule__OrAndExpression__Group_1_1__2__Impl ;
    public final void rule__OrAndExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1953:1: ( rule__OrAndExpression__Group_1_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1954:2: rule__OrAndExpression__Group_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_1__2__Impl_in_rule__OrAndExpression__Group_1_1__24116);
            rule__OrAndExpression__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group_1_1__2"


    // $ANTLR start "rule__OrAndExpression__Group_1_1__2__Impl"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1960:1: rule__OrAndExpression__Group_1_1__2__Impl : ( ( rule__OrAndExpression__SubExpressionsAssignment_1_1_2 ) ) ;
    public final void rule__OrAndExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1964:1: ( ( ( rule__OrAndExpression__SubExpressionsAssignment_1_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1965:1: ( ( rule__OrAndExpression__SubExpressionsAssignment_1_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1965:1: ( ( rule__OrAndExpression__SubExpressionsAssignment_1_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1966:1: ( rule__OrAndExpression__SubExpressionsAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getSubExpressionsAssignment_1_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1967:1: ( rule__OrAndExpression__SubExpressionsAssignment_1_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1967:2: rule__OrAndExpression__SubExpressionsAssignment_1_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__SubExpressionsAssignment_1_1_2_in_rule__OrAndExpression__Group_1_1__2__Impl4143);
            rule__OrAndExpression__SubExpressionsAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAndExpressionAccess().getSubExpressionsAssignment_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__Group_1_1__2__Impl"


    // $ANTLR start "rule__CompareOperation__Group_0__0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1983:1: rule__CompareOperation__Group_0__0 : rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 ;
    public final void rule__CompareOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1987:1: ( rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1988:2: rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__04179);
            rule__CompareOperation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__04182);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1995:1: rule__CompareOperation__Group_0__0__Impl : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1999:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2000:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2000:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2001:1: ruleNotOrValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl4209);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2012:1: rule__CompareOperation__Group_0__1 : rule__CompareOperation__Group_0__1__Impl ;
    public final void rule__CompareOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2016:1: ( rule__CompareOperation__Group_0__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2017:2: rule__CompareOperation__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__14238);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2023:1: rule__CompareOperation__Group_0__1__Impl : ( ( rule__CompareOperation__Group_0_1__0 ) ) ;
    public final void rule__CompareOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2027:1: ( ( ( rule__CompareOperation__Group_0_1__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2028:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2028:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2029:1: ( rule__CompareOperation__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2030:1: ( rule__CompareOperation__Group_0_1__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2030:2: rule__CompareOperation__Group_0_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl4265);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2044:1: rule__CompareOperation__Group_0_1__0 : rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 ;
    public final void rule__CompareOperation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2048:1: ( rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2049:2: rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__04299);
            rule__CompareOperation__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__04302);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2056:1: rule__CompareOperation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2060:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2061:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2061:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2062:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2063:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2065:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2075:1: rule__CompareOperation__Group_0_1__1 : rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 ;
    public final void rule__CompareOperation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2079:1: ( rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2080:2: rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__14360);
            rule__CompareOperation__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__14363);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2087:1: rule__CompareOperation__Group_0_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__CompareOperation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2091:1: ( ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2092:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2092:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2093:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_0_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2094:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2094:2: rule__CompareOperation__OperatorAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl4390);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2104:1: rule__CompareOperation__Group_0_1__2 : rule__CompareOperation__Group_0_1__2__Impl ;
    public final void rule__CompareOperation__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2108:1: ( rule__CompareOperation__Group_0_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2109:2: rule__CompareOperation__Group_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__24420);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2115:1: rule__CompareOperation__Group_0_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) ;
    public final void rule__CompareOperation__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2119:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2120:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2120:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2121:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_0_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2122:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2122:2: rule__CompareOperation__SubExpressionsAssignment_0_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl4447);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2138:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2142:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2143:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__04483);
            rule__NotExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__04486);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2150:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2154:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2155:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2155:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2156:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2157:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2159:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2169:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2173:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2174:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__14544);
            rule__NotExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__14547);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2181:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2185:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2186:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2186:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2187:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2188:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2188:2: rule__NotExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl4574);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2198:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2202:1: ( rule__NotExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2203:2: rule__NotExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__24604);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2209:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2213:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2214:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2214:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2215:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2216:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2216:2: rule__NotExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl4631);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2232:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2236:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2237:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__04667);
            rule__AddExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__04670);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2244:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2248:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2249:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2249:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2250:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl4697);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2261:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2265:1: ( rule__AddExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2266:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__14726);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2272:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2276:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2277:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2277:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2278:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2279:1: ( rule__AddExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2279:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl4753);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2293:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2297:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2298:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__04788);
            rule__AddExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__04791);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2305:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2309:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2310:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2310:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2311:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2312:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2314:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2324:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2328:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2329:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__14849);
            rule__AddExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__14852);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2336:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2340:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2341:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2341:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2342:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2343:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2343:2: rule__AddExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl4879);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2353:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2357:1: ( rule__AddExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2358:2: rule__AddExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__24909);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2364:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2368:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2369:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2369:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2370:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2371:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2371:2: rule__AddExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl4936);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2387:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2391:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2392:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__04972);
            rule__SubExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__04975);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2399:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2403:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2404:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2404:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2405:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl5002);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2416:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2420:1: ( rule__SubExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2421:2: rule__SubExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__15031);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2427:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2431:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2432:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2432:1: ( ( rule__SubExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2433:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2434:1: ( rule__SubExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2434:2: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl5058);
            	    rule__SubExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2448:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2452:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2453:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__05093);
            rule__SubExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__05096);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2460:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2464:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2465:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2465:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2466:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2467:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2469:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2479:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2483:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2484:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__15154);
            rule__SubExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__15157);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2491:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2495:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2496:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2496:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2497:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2498:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2498:2: rule__SubExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl5184);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2508:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2512:1: ( rule__SubExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2513:2: rule__SubExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__25214);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2519:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2523:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2524:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2524:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2525:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2526:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2526:2: rule__SubExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5241);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2542:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2546:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2547:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05277);
            rule__MultExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05280);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2554:1: rule__MultExpression__Group__0__Impl : ( ruleDivExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2558:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2559:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2559:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2560:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_rule__MultExpression__Group__0__Impl5307);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2571:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2575:1: ( rule__MultExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2576:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15336);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2582:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2586:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2587:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2587:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2588:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2589:1: ( rule__MultExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2589:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5363);
            	    rule__MultExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2603:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2607:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2608:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__05398);
            rule__MultExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__05401);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2615:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2619:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2620:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2620:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2621:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2622:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2624:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2634:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2638:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2639:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__15459);
            rule__MultExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__15462);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2646:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2650:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2651:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2651:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2652:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2653:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2653:2: rule__MultExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl5489);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2663:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2667:1: ( rule__MultExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2668:2: rule__MultExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__25519);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2674:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2678:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2679:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2679:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2680:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2681:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2681:2: rule__MultExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl5546);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2697:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2701:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2702:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__05582);
            rule__DivExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__05585);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2709:1: rule__DivExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2713:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2714:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2714:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2715:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__DivExpression__Group__0__Impl5612);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2726:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2730:1: ( rule__DivExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2731:2: rule__DivExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__15641);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2737:1: rule__DivExpression__Group__1__Impl : ( ( rule__DivExpression__Group_1__0 )? ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2741:1: ( ( ( rule__DivExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2742:1: ( ( rule__DivExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2742:1: ( ( rule__DivExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2743:1: ( rule__DivExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2744:1: ( rule__DivExpression__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2744:2: rule__DivExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__0_in_rule__DivExpression__Group__1__Impl5668);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2758:1: rule__DivExpression__Group_1__0 : rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 ;
    public final void rule__DivExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2762:1: ( rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2763:2: rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__0__Impl_in_rule__DivExpression__Group_1__05703);
            rule__DivExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__1_in_rule__DivExpression__Group_1__05706);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2770:1: rule__DivExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DivExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2774:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2775:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2775:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2776:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2777:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2779:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2789:1: rule__DivExpression__Group_1__1 : rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 ;
    public final void rule__DivExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2793:1: ( rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2794:2: rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__1__Impl_in_rule__DivExpression__Group_1__15764);
            rule__DivExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__2_in_rule__DivExpression__Group_1__15767);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2801:1: rule__DivExpression__Group_1__1__Impl : ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__DivExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2805:1: ( ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2806:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2806:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2807:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2808:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2808:2: rule__DivExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__OperatorAssignment_1_1_in_rule__DivExpression__Group_1__1__Impl5794);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2818:1: rule__DivExpression__Group_1__2 : rule__DivExpression__Group_1__2__Impl ;
    public final void rule__DivExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2822:1: ( rule__DivExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2823:2: rule__DivExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__2__Impl_in_rule__DivExpression__Group_1__25824);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2829:1: rule__DivExpression__Group_1__2__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2833:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2834:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2834:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2835:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2836:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2836:2: rule__DivExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__SubExpressionsAssignment_1_2_in_rule__DivExpression__Group_1__2__Impl5851);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2852:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2856:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2857:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__05887);
            rule__ModExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__05890);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2864:1: rule__ModExpression__Group__0__Impl : ( ruleNegExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2868:1: ( ( ruleNegExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2869:1: ( ruleNegExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2869:1: ( ruleNegExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2870:1: ruleNegExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_rule__ModExpression__Group__0__Impl5917);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2881:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2885:1: ( rule__ModExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2886:2: rule__ModExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__15946);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2892:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2896:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2897:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2897:1: ( ( rule__ModExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2898:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2899:1: ( rule__ModExpression__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2899:2: rule__ModExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl5973);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2913:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2917:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2918:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__06008);
            rule__ModExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__06011);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2925:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2929:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2930:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2930:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2931:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2932:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2934:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2944:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2948:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2949:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__16069);
            rule__ModExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__16072);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2956:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2960:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2961:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2961:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2962:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2963:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2963:2: rule__ModExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl6099);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2973:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2977:1: ( rule__ModExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2978:2: rule__ModExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__26129);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2984:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2988:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2989:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2989:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2990:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2991:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2991:2: rule__ModExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl6156);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3007:1: rule__NegExpression__Group_0__0 : rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 ;
    public final void rule__NegExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3011:1: ( rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3012:2: rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__0__Impl_in_rule__NegExpression__Group_0__06192);
            rule__NegExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__1_in_rule__NegExpression__Group_0__06195);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3019:1: rule__NegExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NegExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3023:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3024:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3024:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3025:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3026:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3028:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3038:1: rule__NegExpression__Group_0__1 : rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 ;
    public final void rule__NegExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3042:1: ( rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3043:2: rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__1__Impl_in_rule__NegExpression__Group_0__16253);
            rule__NegExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__2_in_rule__NegExpression__Group_0__16256);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3050:1: rule__NegExpression__Group_0__1__Impl : ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NegExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3054:1: ( ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3055:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3055:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3056:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3057:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3057:2: rule__NegExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__OperatorAssignment_0_1_in_rule__NegExpression__Group_0__1__Impl6283);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3067:1: rule__NegExpression__Group_0__2 : rule__NegExpression__Group_0__2__Impl ;
    public final void rule__NegExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3071:1: ( rule__NegExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3072:2: rule__NegExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__2__Impl_in_rule__NegExpression__Group_0__26313);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3078:1: rule__NegExpression__Group_0__2__Impl : ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NegExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3082:1: ( ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3083:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3083:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3084:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3085:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3085:2: rule__NegExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__SubExpressionsAssignment_0_2_in_rule__NegExpression__Group_0__2__Impl6340);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3101:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3105:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3106:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__06376);
            rule__AtomicExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__06379);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3113:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3117:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3118:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3118:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3119:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AtomicExpression__Group_2__0__Impl6407); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3132:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3136:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3137:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__16438);
            rule__AtomicExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__16441);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3144:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBoolExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3148:1: ( ( ruleBoolExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3149:1: ( ruleBoolExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3149:1: ( ruleBoolExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3150:1: ruleBoolExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_rule__AtomicExpression__Group_2__1__Impl6468);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3161:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3165:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3166:2: rule__AtomicExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__26497);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3172:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3176:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3177:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3177:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3178:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__AtomicExpression__Group_2__2__Impl6525); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3197:1: rule__AtomicValuedExpression__Group_2__0 : rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 ;
    public final void rule__AtomicValuedExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3201:1: ( rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3202:2: rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__06562);
            rule__AtomicValuedExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__06565);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3209:1: rule__AtomicValuedExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3213:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3214:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3214:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3215:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AtomicValuedExpression__Group_2__0__Impl6593); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3228:1: rule__AtomicValuedExpression__Group_2__1 : rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 ;
    public final void rule__AtomicValuedExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3232:1: ( rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3233:2: rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__16624);
            rule__AtomicValuedExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__16627);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3240:1: rule__AtomicValuedExpression__Group_2__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3244:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3245:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3245:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3246:1: ruleValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl6654);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3257:1: rule__AtomicValuedExpression__Group_2__2 : rule__AtomicValuedExpression__Group_2__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3261:1: ( rule__AtomicValuedExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3262:2: rule__AtomicValuedExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__26683);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3268:1: rule__AtomicValuedExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3272:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3273:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3273:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3274:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__AtomicValuedExpression__Group_2__2__Impl6711); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3293:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3297:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3298:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__06748);
            rule__ValuedObjectTestExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__06751);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3305:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3309:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3310:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3310:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3311:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3312:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3314:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3324:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3328:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3329:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__16809);
            rule__ValuedObjectTestExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__16812);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3336:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3340:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3341:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3341:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3342:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3343:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3343:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl6839);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3353:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3357:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3358:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__26869);
            rule__ValuedObjectTestExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__26872);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3365:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3369:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3370:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3370:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3371:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ValuedObjectTestExpression__Group_0__2__Impl6900); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3384:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3388:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3389:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__36931);
            rule__ValuedObjectTestExpression__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__36934);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3396:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3400:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3401:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3401:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3402:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3403:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3403:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl6961);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3413:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3417:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3418:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__46991);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3424:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3428:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3429:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3429:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3430:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ValuedObjectTestExpression__Group_0__4__Impl7019); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3453:1: rule__ValuedObjectReference__Group__0 : rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1 ;
    public final void rule__ValuedObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3457:1: ( rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3458:2: rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group__0__Impl_in_rule__ValuedObjectReference__Group__07060);
            rule__ValuedObjectReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group__1_in_rule__ValuedObjectReference__Group__07063);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3465:1: rule__ValuedObjectReference__Group__0__Impl : ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) ;
    public final void rule__ValuedObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3469:1: ( ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3470:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3470:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3471:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3472:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3472:2: rule__ValuedObjectReference__ValuedObjectAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__ValuedObjectAssignment_0_in_rule__ValuedObjectReference__Group__0__Impl7090);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3482:1: rule__ValuedObjectReference__Group__1 : rule__ValuedObjectReference__Group__1__Impl ;
    public final void rule__ValuedObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3486:1: ( rule__ValuedObjectReference__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3487:2: rule__ValuedObjectReference__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group__1__Impl_in_rule__ValuedObjectReference__Group__17120);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3493:1: rule__ValuedObjectReference__Group__1__Impl : ( ( rule__ValuedObjectReference__Group_1__0 )* ) ;
    public final void rule__ValuedObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3497:1: ( ( ( rule__ValuedObjectReference__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3498:1: ( ( rule__ValuedObjectReference__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3498:1: ( ( rule__ValuedObjectReference__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3499:1: ( rule__ValuedObjectReference__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3500:1: ( rule__ValuedObjectReference__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==37) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3500:2: rule__ValuedObjectReference__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group_1__0_in_rule__ValuedObjectReference__Group__1__Impl7147);
            	    rule__ValuedObjectReference__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3514:1: rule__ValuedObjectReference__Group_1__0 : rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1 ;
    public final void rule__ValuedObjectReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3518:1: ( rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3519:2: rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group_1__0__Impl_in_rule__ValuedObjectReference__Group_1__07182);
            rule__ValuedObjectReference__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group_1__1_in_rule__ValuedObjectReference__Group_1__07185);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3526:1: rule__ValuedObjectReference__Group_1__0__Impl : ( '[' ) ;
    public final void rule__ValuedObjectReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3530:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3531:1: ( '[' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3531:1: ( '[' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3532:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ValuedObjectReference__Group_1__0__Impl7213); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3545:1: rule__ValuedObjectReference__Group_1__1 : rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2 ;
    public final void rule__ValuedObjectReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3549:1: ( rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3550:2: rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group_1__1__Impl_in_rule__ValuedObjectReference__Group_1__17244);
            rule__ValuedObjectReference__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group_1__2_in_rule__ValuedObjectReference__Group_1__17247);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3557:1: rule__ValuedObjectReference__Group_1__1__Impl : ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) ) ;
    public final void rule__ValuedObjectReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3561:1: ( ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3562:1: ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3562:1: ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3563:1: ( rule__ValuedObjectReference__IndicesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getIndicesAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3564:1: ( rule__ValuedObjectReference__IndicesAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3564:2: rule__ValuedObjectReference__IndicesAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__IndicesAssignment_1_1_in_rule__ValuedObjectReference__Group_1__1__Impl7274);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3574:1: rule__ValuedObjectReference__Group_1__2 : rule__ValuedObjectReference__Group_1__2__Impl ;
    public final void rule__ValuedObjectReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3578:1: ( rule__ValuedObjectReference__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3579:2: rule__ValuedObjectReference__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group_1__2__Impl_in_rule__ValuedObjectReference__Group_1__27304);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3585:1: rule__ValuedObjectReference__Group_1__2__Impl : ( ']' ) ;
    public final void rule__ValuedObjectReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3589:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3590:1: ( ']' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3590:1: ( ']' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3591:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__ValuedObjectReference__Group_1__2__Impl7332); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3610:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3614:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3615:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__07369);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__07372);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3622:1: rule__FunctionCall__Group__0__Impl : ( '<' ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3626:1: ( ( '<' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3627:1: ( '<' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3627:1: ( '<' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3628:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__FunctionCall__Group__0__Impl7400); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3641:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3645:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3646:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__17431);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__17434);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3653:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__FunctionNameAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3657:1: ( ( ( rule__FunctionCall__FunctionNameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3658:1: ( ( rule__FunctionCall__FunctionNameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3658:1: ( ( rule__FunctionCall__FunctionNameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3659:1: ( rule__FunctionCall__FunctionNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3660:1: ( rule__FunctionCall__FunctionNameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3660:2: rule__FunctionCall__FunctionNameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__FunctionNameAssignment_1_in_rule__FunctionCall__Group__1__Impl7461);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3670:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3674:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3675:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__27491);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__27494);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3682:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__Alternatives_2 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3686:1: ( ( ( rule__FunctionCall__Alternatives_2 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3687:1: ( ( rule__FunctionCall__Alternatives_2 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3687:1: ( ( rule__FunctionCall__Alternatives_2 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3688:1: ( rule__FunctionCall__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3689:1: ( rule__FunctionCall__Alternatives_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28||LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3689:2: rule__FunctionCall__Alternatives_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Alternatives_2_in_rule__FunctionCall__Group__2__Impl7521);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3699:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3703:1: ( rule__FunctionCall__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3704:2: rule__FunctionCall__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__37552);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3710:1: rule__FunctionCall__Group__3__Impl : ( '>' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3714:1: ( ( '>' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3715:1: ( '>' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3715:1: ( '>' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3716:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__FunctionCall__Group__3__Impl7580); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3737:1: rule__FunctionCall__Group_2_0__0 : rule__FunctionCall__Group_2_0__0__Impl rule__FunctionCall__Group_2_0__1 ;
    public final void rule__FunctionCall__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3741:1: ( rule__FunctionCall__Group_2_0__0__Impl rule__FunctionCall__Group_2_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3742:2: rule__FunctionCall__Group_2_0__0__Impl rule__FunctionCall__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_0__0__Impl_in_rule__FunctionCall__Group_2_0__07619);
            rule__FunctionCall__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_0__1_in_rule__FunctionCall__Group_2_0__07622);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3749:1: rule__FunctionCall__Group_2_0__0__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3753:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3754:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3754:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3755:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__FunctionCall__Group_2_0__0__Impl7650); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3768:1: rule__FunctionCall__Group_2_0__1 : rule__FunctionCall__Group_2_0__1__Impl rule__FunctionCall__Group_2_0__2 ;
    public final void rule__FunctionCall__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3772:1: ( rule__FunctionCall__Group_2_0__1__Impl rule__FunctionCall__Group_2_0__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3773:2: rule__FunctionCall__Group_2_0__1__Impl rule__FunctionCall__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_0__1__Impl_in_rule__FunctionCall__Group_2_0__17681);
            rule__FunctionCall__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_0__2_in_rule__FunctionCall__Group_2_0__17684);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3780:1: rule__FunctionCall__Group_2_0__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) ) ;
    public final void rule__FunctionCall__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3784:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3785:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3785:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3786:1: ( rule__FunctionCall__ParametersAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3787:1: ( rule__FunctionCall__ParametersAssignment_2_0_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3787:2: rule__FunctionCall__ParametersAssignment_2_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__ParametersAssignment_2_0_1_in_rule__FunctionCall__Group_2_0__1__Impl7711);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3797:1: rule__FunctionCall__Group_2_0__2 : rule__FunctionCall__Group_2_0__2__Impl rule__FunctionCall__Group_2_0__3 ;
    public final void rule__FunctionCall__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3801:1: ( rule__FunctionCall__Group_2_0__2__Impl rule__FunctionCall__Group_2_0__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3802:2: rule__FunctionCall__Group_2_0__2__Impl rule__FunctionCall__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_0__2__Impl_in_rule__FunctionCall__Group_2_0__27741);
            rule__FunctionCall__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_0__3_in_rule__FunctionCall__Group_2_0__27744);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3809:1: rule__FunctionCall__Group_2_0__2__Impl : ( ( rule__FunctionCall__Group_2_0_2__0 )* ) ;
    public final void rule__FunctionCall__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3813:1: ( ( ( rule__FunctionCall__Group_2_0_2__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3814:1: ( ( rule__FunctionCall__Group_2_0_2__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3814:1: ( ( rule__FunctionCall__Group_2_0_2__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3815:1: ( rule__FunctionCall__Group_2_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_2_0_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3816:1: ( rule__FunctionCall__Group_2_0_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==39) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3816:2: rule__FunctionCall__Group_2_0_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_0_2__0_in_rule__FunctionCall__Group_2_0__2__Impl7771);
            	    rule__FunctionCall__Group_2_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3826:1: rule__FunctionCall__Group_2_0__3 : rule__FunctionCall__Group_2_0__3__Impl ;
    public final void rule__FunctionCall__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3830:1: ( rule__FunctionCall__Group_2_0__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3831:2: rule__FunctionCall__Group_2_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_0__3__Impl_in_rule__FunctionCall__Group_2_0__37802);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3837:1: rule__FunctionCall__Group_2_0__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3841:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3842:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3842:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3843:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__FunctionCall__Group_2_0__3__Impl7830); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3864:1: rule__FunctionCall__Group_2_0_2__0 : rule__FunctionCall__Group_2_0_2__0__Impl rule__FunctionCall__Group_2_0_2__1 ;
    public final void rule__FunctionCall__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3868:1: ( rule__FunctionCall__Group_2_0_2__0__Impl rule__FunctionCall__Group_2_0_2__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3869:2: rule__FunctionCall__Group_2_0_2__0__Impl rule__FunctionCall__Group_2_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_0_2__0__Impl_in_rule__FunctionCall__Group_2_0_2__07869);
            rule__FunctionCall__Group_2_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_0_2__1_in_rule__FunctionCall__Group_2_0_2__07872);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3876:1: rule__FunctionCall__Group_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3880:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3881:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3881:1: ( ',' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3882:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__FunctionCall__Group_2_0_2__0__Impl7900); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3895:1: rule__FunctionCall__Group_2_0_2__1 : rule__FunctionCall__Group_2_0_2__1__Impl ;
    public final void rule__FunctionCall__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3899:1: ( rule__FunctionCall__Group_2_0_2__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3900:2: rule__FunctionCall__Group_2_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_0_2__1__Impl_in_rule__FunctionCall__Group_2_0_2__17931);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3906:1: rule__FunctionCall__Group_2_0_2__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) ) ;
    public final void rule__FunctionCall__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3910:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3911:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3911:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3912:1: ( rule__FunctionCall__ParametersAssignment_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0_2_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3913:1: ( rule__FunctionCall__ParametersAssignment_2_0_2_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3913:2: rule__FunctionCall__ParametersAssignment_2_0_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__ParametersAssignment_2_0_2_1_in_rule__FunctionCall__Group_2_0_2__1__Impl7958);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3927:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3931:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3932:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__07992);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__07995);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3939:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__CallByReferenceAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3943:1: ( ( ( rule__Parameter__CallByReferenceAssignment_0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3944:1: ( ( rule__Parameter__CallByReferenceAssignment_0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3944:1: ( ( rule__Parameter__CallByReferenceAssignment_0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3945:1: ( rule__Parameter__CallByReferenceAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3946:1: ( rule__Parameter__CallByReferenceAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3946:2: rule__Parameter__CallByReferenceAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__CallByReferenceAssignment_0_in_rule__Parameter__Group__0__Impl8022);
                    rule__Parameter__CallByReferenceAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getCallByReferenceAssignment_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3956:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3960:1: ( rule__Parameter__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3961:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__18053);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3967:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ExpressionAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3971:1: ( ( ( rule__Parameter__ExpressionAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3972:1: ( ( rule__Parameter__ExpressionAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3972:1: ( ( rule__Parameter__ExpressionAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3973:1: ( rule__Parameter__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getExpressionAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3974:1: ( rule__Parameter__ExpressionAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3974:2: rule__Parameter__ExpressionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__ExpressionAssignment_1_in_rule__Parameter__Group__1__Impl8080);
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


    // $ANTLR start "rule__TagAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3988:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3992:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3993:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__08114);
            rule__TagAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__08117);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4000:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4004:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4005:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4005:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4006:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__TagAnnotation__Group__0__Impl8145); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4019:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4023:1: ( rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4024:2: rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__18176);
            rule__TagAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__18179);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4031:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4035:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4036:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4036:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4037:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4038:1: ( rule__TagAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4038:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl8206);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4048:1: rule__TagAnnotation__Group__2 : rule__TagAnnotation__Group__2__Impl ;
    public final void rule__TagAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4052:1: ( rule__TagAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4053:2: rule__TagAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__28236);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4059:1: rule__TagAnnotation__Group__2__Impl : ( ( rule__TagAnnotation__Group_2__0 )? ) ;
    public final void rule__TagAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4063:1: ( ( ( rule__TagAnnotation__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4064:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4064:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4065:1: ( rule__TagAnnotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4066:1: ( rule__TagAnnotation__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4066:2: rule__TagAnnotation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl8263);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4082:1: rule__TagAnnotation__Group_2__0 : rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 ;
    public final void rule__TagAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4086:1: ( rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4087:2: rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__08300);
            rule__TagAnnotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__08303);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4094:1: rule__TagAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TagAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4098:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4099:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4099:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4100:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__TagAnnotation__Group_2__0__Impl8331); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4113:1: rule__TagAnnotation__Group_2__1 : rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 ;
    public final void rule__TagAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4117:1: ( rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4118:2: rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__18362);
            rule__TagAnnotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__18365);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4125:1: rule__TagAnnotation__Group_2__1__Impl : ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) ;
    public final void rule__TagAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4129:1: ( ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4130:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4130:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4131:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4132:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_COMMENT_ANNOTATION||LA29_0==40) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4132:2: rule__TagAnnotation__AnnotationsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl8392);
            	    rule__TagAnnotation__AnnotationsAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4142:1: rule__TagAnnotation__Group_2__2 : rule__TagAnnotation__Group_2__2__Impl ;
    public final void rule__TagAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4146:1: ( rule__TagAnnotation__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4147:2: rule__TagAnnotation__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__28423);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4153:1: rule__TagAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TagAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4157:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4158:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4158:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4159:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__TagAnnotation__Group_2__2__Impl8451); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4178:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4182:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4183:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__08488);
            rule__KeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__08491);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4190:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4194:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4195:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4195:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4196:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__KeyStringValueAnnotation__Group__0__Impl8519); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4209:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4213:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4214:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__18550);
            rule__KeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__18553);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4221:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4225:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4226:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4226:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4227:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4228:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4228:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl8580);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4238:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4242:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4243:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__28610);
            rule__KeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__28613);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4250:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4254:1: ( ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4255:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4255:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4256:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4257:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4257:2: rule__KeyStringValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl8640);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4267:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4271:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4272:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__38670);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4278:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4282:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4283:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4283:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4284:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4285:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4285:2: rule__KeyStringValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl8697);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4303:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4307:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4308:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__08736);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__08739);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4315:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4319:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4320:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4320:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4321:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyStringValueAnnotation__Group_3__0__Impl8767); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4334:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4338:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4339:2: rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__18798);
            rule__KeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__18801);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4346:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4350:1: ( ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4351:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4351:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4352:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4353:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_COMMENT_ANNOTATION||LA31_0==40) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4353:2: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl8828);
            	    rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4363:1: rule__KeyStringValueAnnotation__Group_3__2 : rule__KeyStringValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4367:1: ( rule__KeyStringValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4368:2: rule__KeyStringValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__28859);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4374:1: rule__KeyStringValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4378:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4379:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4379:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4380:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__KeyStringValueAnnotation__Group_3__2__Impl8887); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4399:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4403:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4404:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__08924);
            rule__TypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__08927);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4411:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4415:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4416:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4416:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4417:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl8955); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4430:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4434:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4435:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__18986);
            rule__TypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__18989);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4442:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4446:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4447:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4447:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4448:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4449:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4449:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl9016);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4459:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4463:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4464:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__29046);
            rule__TypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__29049);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4471:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4475:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4476:1: ( '[' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4476:1: ( '[' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4477:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl9077); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4490:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4494:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4495:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__39108);
            rule__TypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__39111);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4502:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4506:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4507:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4507:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4508:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4509:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4509:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl9138);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4519:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4523:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4524:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__49168);
            rule__TypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__49171);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4531:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4535:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4536:1: ( ']' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4536:1: ( ']' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4537:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl9199); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4550:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4554:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4555:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__59230);
            rule__TypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__59233);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4562:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4566:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4567:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4567:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4568:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueAssignment_5()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4569:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4569:2: rule__TypedKeyStringValueAnnotation__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl9260);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4579:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4583:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4584:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__69290);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4590:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4594:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4595:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4595:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4596:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4597:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4597:2: rule__TypedKeyStringValueAnnotation__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl9317);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4621:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4625:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4626:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__09362);
            rule__TypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__09365);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4633:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4637:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4638:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4638:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4639:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl9393); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4652:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4656:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4657:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__19424);
            rule__TypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__19427);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4664:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4668:1: ( ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4669:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4669:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4670:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAssignment_6_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4671:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_COMMENT_ANNOTATION||LA33_0==40) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4671:2: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl9454);
            	    rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4681:1: rule__TypedKeyStringValueAnnotation__Group_6__2 : rule__TypedKeyStringValueAnnotation__Group_6__2__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4685:1: ( rule__TypedKeyStringValueAnnotation__Group_6__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4686:2: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__29485);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4692:1: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl : ( ')' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4696:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4697:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4697:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4698:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl9513); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4717:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4721:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4722:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__09550);
            rule__KeyBooleanValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__09553);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4729:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4733:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4734:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4734:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4735:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__KeyBooleanValueAnnotation__Group__0__Impl9581); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4748:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4752:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4753:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__19612);
            rule__KeyBooleanValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__19615);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4760:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4764:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4765:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4765:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4766:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4767:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4767:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl9642);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4777:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4781:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4782:2: rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__29672);
            rule__KeyBooleanValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__29675);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4789:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4793:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4794:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4794:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4795:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4796:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4796:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl9702);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4806:1: rule__KeyBooleanValueAnnotation__Group__3 : rule__KeyBooleanValueAnnotation__Group__3__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4810:1: ( rule__KeyBooleanValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4811:2: rule__KeyBooleanValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__39732);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4817:1: rule__KeyBooleanValueAnnotation__Group__3__Impl : ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4821:1: ( ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4822:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4822:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4823:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4824:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4824:2: rule__KeyBooleanValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl9759);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4842:1: rule__KeyBooleanValueAnnotation__Group_3__0 : rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4846:1: ( rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4847:2: rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__09798);
            rule__KeyBooleanValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__09801);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4854:1: rule__KeyBooleanValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4858:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4859:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4859:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4860:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl9829); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4873:1: rule__KeyBooleanValueAnnotation__Group_3__1 : rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4877:1: ( rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4878:2: rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__19860);
            rule__KeyBooleanValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__19863);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4885:1: rule__KeyBooleanValueAnnotation__Group_3__1__Impl : ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4889:1: ( ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4890:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4890:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4891:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4892:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_COMMENT_ANNOTATION||LA35_0==40) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4892:2: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl9890);
            	    rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4902:1: rule__KeyBooleanValueAnnotation__Group_3__2 : rule__KeyBooleanValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4906:1: ( rule__KeyBooleanValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4907:2: rule__KeyBooleanValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__29921);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4913:1: rule__KeyBooleanValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4917:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4918:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4918:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4919:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl9949); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4938:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4942:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4943:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__09986);
            rule__KeyIntValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__09989);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4950:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4954:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4955:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4955:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4956:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__KeyIntValueAnnotation__Group__0__Impl10017); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4969:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4973:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4974:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__110048);
            rule__KeyIntValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__110051);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4981:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4985:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4986:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4986:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4987:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4988:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4988:2: rule__KeyIntValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl10078);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4998:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5002:1: ( rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5003:2: rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__210108);
            rule__KeyIntValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__210111);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5010:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5014:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5015:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5015:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5016:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5017:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5017:2: rule__KeyIntValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl10138);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5027:1: rule__KeyIntValueAnnotation__Group__3 : rule__KeyIntValueAnnotation__Group__3__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5031:1: ( rule__KeyIntValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5032:2: rule__KeyIntValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__310168);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5038:1: rule__KeyIntValueAnnotation__Group__3__Impl : ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyIntValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5042:1: ( ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5043:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5043:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5044:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5045:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5045:2: rule__KeyIntValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl10195);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5063:1: rule__KeyIntValueAnnotation__Group_3__0 : rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 ;
    public final void rule__KeyIntValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5067:1: ( rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5068:2: rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__010234);
            rule__KeyIntValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__010237);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5075:1: rule__KeyIntValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5079:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5080:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5080:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5081:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyIntValueAnnotation__Group_3__0__Impl10265); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5094:1: rule__KeyIntValueAnnotation__Group_3__1 : rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 ;
    public final void rule__KeyIntValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5098:1: ( rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5099:2: rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__110296);
            rule__KeyIntValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__110299);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5106:1: rule__KeyIntValueAnnotation__Group_3__1__Impl : ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5110:1: ( ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5111:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5111:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5112:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5113:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_COMMENT_ANNOTATION||LA37_0==40) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5113:2: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl10326);
            	    rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5123:1: rule__KeyIntValueAnnotation__Group_3__2 : rule__KeyIntValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5127:1: ( rule__KeyIntValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5128:2: rule__KeyIntValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__210357);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5134:1: rule__KeyIntValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5138:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5139:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5139:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5140:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__KeyIntValueAnnotation__Group_3__2__Impl10385); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5159:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5163:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5164:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__010422);
            rule__KeyFloatValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__010425);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5171:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5175:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5176:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5176:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5177:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__KeyFloatValueAnnotation__Group__0__Impl10453); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5190:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5194:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5195:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__110484);
            rule__KeyFloatValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__110487);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5202:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5206:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5207:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5207:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5208:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5209:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5209:2: rule__KeyFloatValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl10514);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5219:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5223:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5224:2: rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__210544);
            rule__KeyFloatValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__210547);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5231:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5235:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5236:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5236:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5237:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5238:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5238:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl10574);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5248:1: rule__KeyFloatValueAnnotation__Group__3 : rule__KeyFloatValueAnnotation__Group__3__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5252:1: ( rule__KeyFloatValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5253:2: rule__KeyFloatValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__310604);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5259:1: rule__KeyFloatValueAnnotation__Group__3__Impl : ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyFloatValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5263:1: ( ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5264:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5264:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5265:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5266:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==35) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5266:2: rule__KeyFloatValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl10631);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5284:1: rule__KeyFloatValueAnnotation__Group_3__0 : rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5288:1: ( rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5289:2: rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__010670);
            rule__KeyFloatValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__010673);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5296:1: rule__KeyFloatValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5300:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5301:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5301:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5302:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl10701); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5315:1: rule__KeyFloatValueAnnotation__Group_3__1 : rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5319:1: ( rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5320:2: rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__110732);
            rule__KeyFloatValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__110735);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5327:1: rule__KeyFloatValueAnnotation__Group_3__1__Impl : ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5331:1: ( ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5332:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5332:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5333:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5334:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_COMMENT_ANNOTATION||LA39_0==40) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5334:2: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl10762);
            	    rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5344:1: rule__KeyFloatValueAnnotation__Group_3__2 : rule__KeyFloatValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5348:1: ( rule__KeyFloatValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5349:2: rule__KeyFloatValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__210793);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5355:1: rule__KeyFloatValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5359:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5360:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5360:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5361:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl10821); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5381:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5385:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5386:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__010859);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__010862);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5393:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5397:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5398:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5398:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5399:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl10889); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5410:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5414:1: ( rule__ExtendedID__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5415:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__110918);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5421:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5425:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5426:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5426:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5427:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5428:1: ( rule__ExtendedID__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==41) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5428:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl10945);
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


    // $ANTLR start "rule__ExtendedID__Group_1__0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5442:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5446:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5447:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__010980);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__010983);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5454:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5458:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5459:1: ( '.' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5459:1: ( '.' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5460:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__ExtendedID__Group_1__0__Impl11011); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5473:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5477:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5478:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__111042);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5484:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5488:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5489:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5489:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5490:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl11069); if (state.failed) return ;
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


    // $ANTLR start "rule__OrAndExpression__OperatorAssignment_1_0_1"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5506:1: rule__OrAndExpression__OperatorAssignment_1_0_1 : ( ( rule__OrAndExpression__OperatorAlternatives_1_0_1_0 ) ) ;
    public final void rule__OrAndExpression__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5510:1: ( ( ( rule__OrAndExpression__OperatorAlternatives_1_0_1_0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5511:1: ( ( rule__OrAndExpression__OperatorAlternatives_1_0_1_0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5511:1: ( ( rule__OrAndExpression__OperatorAlternatives_1_0_1_0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5512:1: ( rule__OrAndExpression__OperatorAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getOperatorAlternatives_1_0_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5513:1: ( rule__OrAndExpression__OperatorAlternatives_1_0_1_0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5513:2: rule__OrAndExpression__OperatorAlternatives_1_0_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__OperatorAlternatives_1_0_1_0_in_rule__OrAndExpression__OperatorAssignment_1_0_111107);
            rule__OrAndExpression__OperatorAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAndExpressionAccess().getOperatorAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__OperatorAssignment_1_0_1"


    // $ANTLR start "rule__OrAndExpression__SubExpressionsAssignment_1_0_2"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5522:1: rule__OrAndExpression__SubExpressionsAssignment_1_0_2 : ( ruleCompareOperation ) ;
    public final void rule__OrAndExpression__SubExpressionsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5526:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5527:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5527:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5528:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__OrAndExpression__SubExpressionsAssignment_1_0_211140);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__SubExpressionsAssignment_1_0_2"


    // $ANTLR start "rule__OrAndExpression__OperatorAssignment_1_1_1"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5537:1: rule__OrAndExpression__OperatorAssignment_1_1_1 : ( ( rule__OrAndExpression__OperatorAlternatives_1_1_1_0 ) ) ;
    public final void rule__OrAndExpression__OperatorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5541:1: ( ( ( rule__OrAndExpression__OperatorAlternatives_1_1_1_0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5542:1: ( ( rule__OrAndExpression__OperatorAlternatives_1_1_1_0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5542:1: ( ( rule__OrAndExpression__OperatorAlternatives_1_1_1_0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5543:1: ( rule__OrAndExpression__OperatorAlternatives_1_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getOperatorAlternatives_1_1_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5544:1: ( rule__OrAndExpression__OperatorAlternatives_1_1_1_0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5544:2: rule__OrAndExpression__OperatorAlternatives_1_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__OperatorAlternatives_1_1_1_0_in_rule__OrAndExpression__OperatorAssignment_1_1_111171);
            rule__OrAndExpression__OperatorAlternatives_1_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAndExpressionAccess().getOperatorAlternatives_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__OperatorAssignment_1_1_1"


    // $ANTLR start "rule__OrAndExpression__SubExpressionsAssignment_1_1_2"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5553:1: rule__OrAndExpression__SubExpressionsAssignment_1_1_2 : ( ruleCompareOperation ) ;
    public final void rule__OrAndExpression__SubExpressionsAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5557:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5558:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5558:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5559:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__OrAndExpression__SubExpressionsAssignment_1_1_211204);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAndExpression__SubExpressionsAssignment_1_1_2"


    // $ANTLR start "rule__CompareOperation__OperatorAssignment_0_1_1"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5568:1: rule__CompareOperation__OperatorAssignment_0_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5572:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5573:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5573:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5574:1: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_111235);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5583:1: rule__CompareOperation__SubExpressionsAssignment_0_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5587:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5588:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5588:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5589:1: ruleNotOrValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_211266);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5598:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5602:1: ( ( ruleNotOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5603:1: ( ruleNotOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5603:1: ( ruleNotOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5604:1: ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_111297);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5613:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5617:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5618:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5618:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5619:1: ruleNotExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_211328);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5628:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5632:1: ( ( ruleAddOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5633:1: ( ruleAddOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5633:1: ( ruleAddOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5634:1: ruleAddOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_111359);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5643:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5647:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5648:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5648:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5649:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_211390);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5658:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5662:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5663:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5663:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5664:1: ruleSubOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_111421);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5673:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5677:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5678:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5678:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5679:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_211452);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5688:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5692:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5693:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5693:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5694:1: ruleMultOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_111483);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5703:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5707:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5708:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5708:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5709:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_rule__MultExpression__SubExpressionsAssignment_1_211514);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5718:1: rule__DivExpression__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5722:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5723:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5723:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5724:1: ruleDivOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_1_111545);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5733:1: rule__DivExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5737:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5738:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5738:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5739:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__DivExpression__SubExpressionsAssignment_1_211576);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5748:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5752:1: ( ( ruleModOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5753:1: ( ruleModOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5753:1: ( ruleModOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5754:1: ruleModOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_111607);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5763:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5767:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5768:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5768:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5769:1: ruleAtomicValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_211638);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5778:1: rule__NegExpression__OperatorAssignment_0_1 : ( ruleSubOperator ) ;
    public final void rule__NegExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5782:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5783:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5783:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5784:1: ruleSubOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_rule__NegExpression__OperatorAssignment_0_111669);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5793:1: rule__NegExpression__SubExpressionsAssignment_0_2 : ( ruleNegExpression ) ;
    public final void rule__NegExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5797:1: ( ( ruleNegExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5798:1: ( ruleNegExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5798:1: ( ruleNegExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5799:1: ruleNegExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_rule__NegExpression__SubExpressionsAssignment_0_211700);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5808:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5812:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5813:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5813:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5814:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAlternatives_0_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5815:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5815:2: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_111731);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5824:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5828:1: ( ( ruleValuedObjectTestExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5829:1: ( ruleValuedObjectTestExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5829:1: ( ruleValuedObjectTestExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5830:1: ruleValuedObjectTestExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_311764);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5839:1: rule__ValuedObjectReference__ValuedObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5843:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5844:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5844:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5845:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5846:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5847:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment_011799); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5858:1: rule__ValuedObjectReference__IndicesAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__ValuedObjectReference__IndicesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5862:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5863:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5863:1: ( ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5864:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ValuedObjectReference__IndicesAssignment_1_111834);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5873:1: rule__FunctionCall__FunctionNameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__FunctionCall__FunctionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5877:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5878:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5878:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5879:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__FunctionCall__FunctionNameAssignment_111865);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5888:1: rule__FunctionCall__ParametersAssignment_2_0_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5892:1: ( ( ruleParameter ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5893:1: ( ruleParameter )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5893:1: ( ruleParameter )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5894:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__FunctionCall__ParametersAssignment_2_0_111896);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5903:1: rule__FunctionCall__ParametersAssignment_2_0_2_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5907:1: ( ( ruleParameter ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5908:1: ( ruleParameter )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5908:1: ( ruleParameter )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5909:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__FunctionCall__ParametersAssignment_2_0_2_111927);
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


    // $ANTLR start "rule__Parameter__CallByReferenceAssignment_0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5918:1: rule__Parameter__CallByReferenceAssignment_0 : ( ( '&' ) ) ;
    public final void rule__Parameter__CallByReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5922:1: ( ( ( '&' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5923:1: ( ( '&' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5923:1: ( ( '&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5924:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5925:1: ( '&' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5926:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Parameter__CallByReferenceAssignment_011963); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__CallByReferenceAssignment_0"


    // $ANTLR start "rule__Parameter__ExpressionAssignment_1"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5941:1: rule__Parameter__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Parameter__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5945:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5946:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5946:1: ( ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5947:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Parameter__ExpressionAssignment_112002);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5956:1: rule__TextExpression__TextAssignment : ( RULE_HOSTCODE ) ;
    public final void rule__TextExpression__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5960:1: ( ( RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5961:1: ( RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5961:1: ( RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5962:1: RULE_HOSTCODE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTextHOSTCODETerminalRuleCall_0()); 
            }
            match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_rule__TextExpression__TextAssignment12033); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5971:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5975:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5976:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5976:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5977:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment12064); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5986:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5990:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5991:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5991:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5992:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment12095); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6001:1: rule__BoolValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BoolValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6005:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6006:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6006:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6007:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__BoolValue__ValueAssignment12126); if (state.failed) return ;
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


    // $ANTLR start "rule__CommentAnnotation__ValueAssignment"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6016:1: rule__CommentAnnotation__ValueAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6020:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6021:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6021:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6022:1: RULE_COMMENT_ANNOTATION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment12157); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6031:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6035:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6036:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6036:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6037:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_112188);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6046:1: rule__TagAnnotation__AnnotationsAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__TagAnnotation__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6050:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6051:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6051:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6052:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_112219);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6061:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6065:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6066:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6066:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6067:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_112250);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6076:1: rule__KeyStringValueAnnotation__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6080:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6081:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6081:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6082:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_212281);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6091:1: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6095:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6096:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6096:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6097:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_112312);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6106:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6110:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6111:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6111:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6112:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_112343);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6121:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6125:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6126:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6126:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6127:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_312374);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6136:1: rule__TypedKeyStringValueAnnotation__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6140:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6141:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6141:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6142:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_512405);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6151:1: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 : ( ruleAnnotation ) ;
    public final void rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6155:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6156:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6156:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6157:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_112436);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6166:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6170:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6171:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6171:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6172:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_112467);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6181:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6185:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6186:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6186:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6187:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_212498); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6196:1: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6200:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6201:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6201:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6202:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_112529);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6211:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6215:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6216:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6216:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6217:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_112560);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6226:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6230:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6231:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6231:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6232:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_212591); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6241:1: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6245:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6246:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6246:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6247:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_112622);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6256:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6260:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6261:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6261:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6262:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_112653);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6271:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6275:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6276:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6276:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6277:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFLOATTerminalRuleCall_2_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_212684); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6286:1: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6290:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6291:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6291:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6292:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_112715);
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
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1289:1: ( ( ruleBoolExpression ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1289:1: ( ruleBoolExpression )
        {
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1289:1: ( ruleBoolExpression )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1290:1: ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred1_InternalKExpressions2629);
        ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalKExpressions

    // $ANTLR start synpred3_InternalKExpressions
    public final void synpred3_InternalKExpressions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1311:1: ( ( ( rule__OrAndExpression__Group_1_0__0 )* ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1311:1: ( ( rule__OrAndExpression__Group_1_0__0 )* )
        {
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1311:1: ( ( rule__OrAndExpression__Group_1_0__0 )* )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1312:1: ( rule__OrAndExpression__Group_1_0__0 )*
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getOrAndExpressionAccess().getGroup_1_0()); 
        }
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1313:1: ( rule__OrAndExpression__Group_1_0__0 )*
        loop41:
        do {
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==17||LA41_0==26) ) {
                alt41=1;
            }


            switch (alt41) {
        	case 1 :
        	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1313:2: rule__OrAndExpression__Group_1_0__0
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_0__0_in_synpred3_InternalKExpressions2678);
        	    rule__OrAndExpression__Group_1_0__0();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop41;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred3_InternalKExpressions

    // $ANTLR start synpred7_InternalKExpressions
    public final void synpred7_InternalKExpressions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1377:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1377:1: ( ( rule__CompareOperation__Group_0__0 ) )
        {
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1377:1: ( ( rule__CompareOperation__Group_0__0 ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1378:1: ( rule__CompareOperation__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
        }
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1379:1: ( rule__CompareOperation__Group_0__0 )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1379:2: rule__CompareOperation__Group_0__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0_in_synpred7_InternalKExpressions2829);
        rule__CompareOperation__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalKExpressions

    // $ANTLR start synpred8_InternalKExpressions
    public final void synpred8_InternalKExpressions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1399:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1399:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1399:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1400:1: ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred8_InternalKExpressions2879);
        ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalKExpressions

    // $ANTLR start synpred17_InternalKExpressions
    public final void synpred17_InternalKExpressions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1517:6: ( ( ( rule__AtomicValuedExpression__Group_2__0 ) ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1517:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        {
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1517:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1518:1: ( rule__AtomicValuedExpression__Group_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
        }
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1519:1: ( rule__AtomicValuedExpression__Group_2__0 )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1519:2: rule__AtomicValuedExpression__Group_2__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_synpred17_InternalKExpressions3163);
        rule__AtomicValuedExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17_InternalKExpressions

    // Delegated rules

    public final boolean synpred7_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalKExpressions_fragment(); // can never throw exception
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA1_eotS =
        "\15\uffff";
    static final String DFA1_eofS =
        "\15\uffff";
    static final String DFA1_minS =
        "\1\5\12\0\2\uffff";
    static final String DFA1_maxS =
        "\1\43\12\0\2\uffff";
    static final String DFA1_acceptS =
        "\13\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\10\1\12\1\2\1\3\1\5\6\uffff\1\6\2\uffff\1\13\1\uffff\1\1"+
            "\3\uffff\1\7\4\uffff\1\11\4\uffff\1\4",
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
            return "1284:1: rule__Expression__Alternatives : ( ( ruleBoolExpression ) | ( ruleValuedExpression ) );";
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

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index1_10);
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
    static final String DFA7_eotS =
        "\15\uffff";
    static final String DFA7_eofS =
        "\15\uffff";
    static final String DFA7_minS =
        "\1\5\3\uffff\10\0\1\uffff";
    static final String DFA7_maxS =
        "\1\43\3\uffff\10\0\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\12\uffff\1\2";
    static final String DFA7_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\10\1\12\2\1\1\5\6\uffff\1\6\2\uffff\1\13\1\uffff\1\1\3\uffff"+
            "\1\7\4\uffff\1\11\4\uffff\1\4",
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
            return "1372:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_4 = input.LA(1);

                         
                        int index7_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_7 = input.LA(1);

                         
                        int index7_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_8 = input.LA(1);

                         
                        int index7_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_9 = input.LA(1);

                         
                        int index7_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_10 = input.LA(1);

                         
                        int index7_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA7_11 = input.LA(1);

                         
                        int index7_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_11);
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
    static final String DFA8_eotS =
        "\14\uffff";
    static final String DFA8_eofS =
        "\14\uffff";
    static final String DFA8_minS =
        "\1\5\3\uffff\7\0\1\uffff";
    static final String DFA8_maxS =
        "\1\43\3\uffff\7\0\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA8_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\10\1\12\2\1\1\5\6\uffff\1\6\2\uffff\1\13\1\uffff\1\1\3\uffff"+
            "\1\7\4\uffff\1\11\4\uffff\1\4",
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

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1394:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );";
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
                        if ( (synpred8_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_8 = input.LA(1);

                         
                        int index8_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_9 = input.LA(1);

                         
                        int index8_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_10 = input.LA(1);

                         
                        int index8_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index8_10);
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
    static final String DFA12_eotS =
        "\13\uffff";
    static final String DFA12_eofS =
        "\13\uffff";
    static final String DFA12_minS =
        "\1\5\2\uffff\1\0\7\uffff";
    static final String DFA12_maxS =
        "\1\43\2\uffff\1\0\7\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\5\uffff\1\3";
    static final String DFA12_specialS =
        "\3\uffff\1\0\7\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\4\1\1\1\2\1\4\6\uffff\1\4\10\uffff\1\4\4\uffff\1\4\4\uffff"+
            "\1\3",
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

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1500:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\14\uffff";
    static final String DFA16_eofS =
        "\3\uffff\1\5\7\uffff\1\5";
    static final String DFA16_minS =
        "\1\12\1\uffff\1\5\1\4\1\5\6\uffff\1\4";
    static final String DFA16_maxS =
        "\1\50\1\uffff\1\5\1\51\1\5\6\uffff\1\51";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\1\4\1\6\1\5\1\7\1\3\1\uffff";
    static final String DFA16_specialS =
        "\14\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\35\uffff\1\2",
            "",
            "\1\3",
            "\2\12\1\uffff\1\7\1\11\1\10\1\5\30\uffff\2\5\1\6\2\uffff\1"+
            "\5\1\4",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\12\1\uffff\1\7\1\11\1\10\1\5\30\uffff\2\5\1\6\2\uffff\1"+
            "\5\1\4"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1603:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );";
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
        public static final BitSet FOLLOW_ruleOrAndExpression_in_ruleBoolExpression219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrAndExpression_in_entryRuleOrAndExpression245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrAndExpression252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group__0_in_ruleOrAndExpression278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Alternatives_in_ruleCompareOperation338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression365 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotOrValuedExpression__Alternatives_in_ruleNotOrValuedExpression398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression544 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression604 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__0_in_ruleSubExpression637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression664 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression724 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression784 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Alternatives_in_ruleNegExpression877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression904 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression964 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression1024 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression1031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Alternatives_in_ruleValuedObjectTestExpression1057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference1084 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group__0_in_ruleValuedObjectReference1117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall1144 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall1151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group__0_in_ruleFunctionCall1177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1204 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression1264 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__TextAssignment_in_ruleTextExpression1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1324 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue1444 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue1451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BoolValue__ValueAssignment_in_ruleBoolValue1477 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_26_in_ruleLogicalOrOperator2547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleLogicalAndOperator2586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_rule__Expression__Alternatives2629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_0__0_in_rule__OrAndExpression__Alternatives_12678 = new BitSet(new long[]{0x0000000004020002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_1__0_in_rule__OrAndExpression__Alternatives_12697 = new BitSet(new long[]{0x0000000008040002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_rule__OrAndExpression__OperatorAlternatives_1_0_1_02731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_rule__OrAndExpression__OperatorAlternatives_1_0_1_02748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperator_in_rule__OrAndExpression__OperatorAlternatives_1_1_1_02780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndOperator_in_rule__OrAndExpression__OperatorAlternatives_1_1_1_02797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives2829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__0_in_rule__NegExpression__Alternatives2978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__NegExpression__Alternatives2996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_rule__AtomicExpression__Alternatives3028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives3045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives3062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionCall_in_rule__AtomicExpression__Alternatives3080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives3097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives3129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives3146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_rule__AtomicValuedExpression__Alternatives3163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives3181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives3213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives3231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_0__0_in_rule__FunctionCall__Alternatives_23312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__FunctionCall__Alternatives_23331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives3366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives3383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives3400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives3417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives3434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives3451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives3468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives3501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives3518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CompareOperator__Alternatives3551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__CompareOperator__Alternatives3572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__CompareOperator__Alternatives3593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__CompareOperator__Alternatives3614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__CompareOperator__Alternatives3635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__CompareOperator__Alternatives3656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group__0__Impl_in_rule__OrAndExpression__Group__03691 = new BitSet(new long[]{0x000000000C060000L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group__1_in_rule__OrAndExpression__Group__03694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__OrAndExpression__Group__0__Impl3721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group__1__Impl_in_rule__OrAndExpression__Group__13750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Alternatives_1_in_rule__OrAndExpression__Group__1__Impl3777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_0__0__Impl_in_rule__OrAndExpression__Group_1_0__03811 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_0__1_in_rule__OrAndExpression__Group_1_0__03814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_0__1__Impl_in_rule__OrAndExpression__Group_1_0__13872 = new BitSet(new long[]{0x00000008422903E0L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_0__2_in_rule__OrAndExpression__Group_1_0__13875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__OperatorAssignment_1_0_1_in_rule__OrAndExpression__Group_1_0__1__Impl3902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_0__2__Impl_in_rule__OrAndExpression__Group_1_0__23932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__SubExpressionsAssignment_1_0_2_in_rule__OrAndExpression__Group_1_0__2__Impl3959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_1__0__Impl_in_rule__OrAndExpression__Group_1_1__03995 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_1__1_in_rule__OrAndExpression__Group_1_1__03998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_1__1__Impl_in_rule__OrAndExpression__Group_1_1__14056 = new BitSet(new long[]{0x00000008422903E0L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_1__2_in_rule__OrAndExpression__Group_1_1__14059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__OperatorAssignment_1_1_1_in_rule__OrAndExpression__Group_1_1__1__Impl4086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_1__2__Impl_in_rule__OrAndExpression__Group_1_1__24116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__SubExpressionsAssignment_1_1_2_in_rule__OrAndExpression__Group_1_1__2__Impl4143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__04179 = new BitSet(new long[]{0x00000007E0000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__04182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl4209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__14238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl4265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__04299 = new BitSet(new long[]{0x00000007E0000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__04302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__14360 = new BitSet(new long[]{0x00000008422903E0L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__14363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl4390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__24420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl4447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__04483 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__04486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__14544 = new BitSet(new long[]{0x00000008422903E0L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__14547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl4574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__24604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__04667 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__04670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl4697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__14726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl4753 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__04788 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__04791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__14849 = new BitSet(new long[]{0x00000008422103E0L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__14852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl4879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__24909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl4936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__04972 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__04975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl5002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__15031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl5058 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__05093 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__05096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__15154 = new BitSet(new long[]{0x00000008422103E0L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__15157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl5184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__25214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05277 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_rule__MultExpression__Group__0__Impl5307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5363 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__05398 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__05401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__15459 = new BitSet(new long[]{0x00000008422103E0L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__15462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl5489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__25519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl5546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__05582 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__05585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__DivExpression__Group__0__Impl5612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__15641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__0_in_rule__DivExpression__Group__1__Impl5668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__0__Impl_in_rule__DivExpression__Group_1__05703 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__1_in_rule__DivExpression__Group_1__05706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__1__Impl_in_rule__DivExpression__Group_1__15764 = new BitSet(new long[]{0x00000008422103E0L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__2_in_rule__DivExpression__Group_1__15767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__OperatorAssignment_1_1_in_rule__DivExpression__Group_1__1__Impl5794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__2__Impl_in_rule__DivExpression__Group_1__25824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__SubExpressionsAssignment_1_2_in_rule__DivExpression__Group_1__2__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__05887 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__05890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_rule__ModExpression__Group__0__Impl5917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__15946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl5973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__06008 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__06011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__16069 = new BitSet(new long[]{0x00000008422103E0L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__16072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl6099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__26129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl6156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__0__Impl_in_rule__NegExpression__Group_0__06192 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__1_in_rule__NegExpression__Group_0__06195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__1__Impl_in_rule__NegExpression__Group_0__16253 = new BitSet(new long[]{0x00000008422103E0L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__2_in_rule__NegExpression__Group_0__16256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__OperatorAssignment_0_1_in_rule__NegExpression__Group_0__1__Impl6283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__2__Impl_in_rule__NegExpression__Group_0__26313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__SubExpressionsAssignment_0_2_in_rule__NegExpression__Group_0__2__Impl6340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__06376 = new BitSet(new long[]{0x00000008422903E0L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__06379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AtomicExpression__Group_2__0__Impl6407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__16438 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__16441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_rule__AtomicExpression__Group_2__1__Impl6468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__26497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__AtomicExpression__Group_2__2__Impl6525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__06562 = new BitSet(new long[]{0x00000008422103E0L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__06565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AtomicValuedExpression__Group_2__0__Impl6593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__16624 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__16627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl6654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__26683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__AtomicValuedExpression__Group_2__2__Impl6711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__06748 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__06751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__16809 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__16812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl6839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__26869 = new BitSet(new long[]{0x0000000002010020L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__26872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ValuedObjectTestExpression__Group_0__2__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__36931 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__36934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl6961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__46991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ValuedObjectTestExpression__Group_0__4__Impl7019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group__0__Impl_in_rule__ValuedObjectReference__Group__07060 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group__1_in_rule__ValuedObjectReference__Group__07063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__ValuedObjectAssignment_0_in_rule__ValuedObjectReference__Group__0__Impl7090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group__1__Impl_in_rule__ValuedObjectReference__Group__17120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group_1__0_in_rule__ValuedObjectReference__Group__1__Impl7147 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group_1__0__Impl_in_rule__ValuedObjectReference__Group_1__07182 = new BitSet(new long[]{0x00000008422903E0L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group_1__1_in_rule__ValuedObjectReference__Group_1__07185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ValuedObjectReference__Group_1__0__Impl7213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group_1__1__Impl_in_rule__ValuedObjectReference__Group_1__17244 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group_1__2_in_rule__ValuedObjectReference__Group_1__17247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__IndicesAssignment_1_1_in_rule__ValuedObjectReference__Group_1__1__Impl7274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group_1__2__Impl_in_rule__ValuedObjectReference__Group_1__27304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__ValuedObjectReference__Group_1__2__Impl7332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__07369 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__07372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__FunctionCall__Group__0__Impl7400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__17431 = new BitSet(new long[]{0x0000000910000000L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__17434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__FunctionNameAssignment_1_in_rule__FunctionCall__Group__1__Impl7461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__27491 = new BitSet(new long[]{0x0000000910000000L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__27494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Alternatives_2_in_rule__FunctionCall__Group__2__Impl7521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__37552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__FunctionCall__Group__3__Impl7580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_0__0__Impl_in_rule__FunctionCall__Group_2_0__07619 = new BitSet(new long[]{0x00000008422D03E0L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_0__1_in_rule__FunctionCall__Group_2_0__07622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__FunctionCall__Group_2_0__0__Impl7650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_0__1__Impl_in_rule__FunctionCall__Group_2_0__17681 = new BitSet(new long[]{0x0000009000000000L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_0__2_in_rule__FunctionCall__Group_2_0__17684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__ParametersAssignment_2_0_1_in_rule__FunctionCall__Group_2_0__1__Impl7711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_0__2__Impl_in_rule__FunctionCall__Group_2_0__27741 = new BitSet(new long[]{0x0000009000000000L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_0__3_in_rule__FunctionCall__Group_2_0__27744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_0_2__0_in_rule__FunctionCall__Group_2_0__2__Impl7771 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_0__3__Impl_in_rule__FunctionCall__Group_2_0__37802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__FunctionCall__Group_2_0__3__Impl7830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_0_2__0__Impl_in_rule__FunctionCall__Group_2_0_2__07869 = new BitSet(new long[]{0x00000008422D03E0L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_0_2__1_in_rule__FunctionCall__Group_2_0_2__07872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__FunctionCall__Group_2_0_2__0__Impl7900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_0_2__1__Impl_in_rule__FunctionCall__Group_2_0_2__17931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__ParametersAssignment_2_0_2_1_in_rule__FunctionCall__Group_2_0_2__1__Impl7958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__07992 = new BitSet(new long[]{0x00000008422D03E0L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__07995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__CallByReferenceAssignment_0_in_rule__Parameter__Group__0__Impl8022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__18053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__ExpressionAssignment_1_in_rule__Parameter__Group__1__Impl8080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__08114 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__08117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__TagAnnotation__Group__0__Impl8145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__18176 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__18179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl8206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__28236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl8263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__08300 = new BitSet(new long[]{0x0000011000000400L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__08303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__TagAnnotation__Group_2__0__Impl8331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__18362 = new BitSet(new long[]{0x0000011000000400L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__18365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl8392 = new BitSet(new long[]{0x0000010000000402L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__28423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__TagAnnotation__Group_2__2__Impl8451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__08488 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__08491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__KeyStringValueAnnotation__Group__0__Impl8519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__18550 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__18553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl8580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__28610 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__28613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl8640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__38670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl8697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__08736 = new BitSet(new long[]{0x0000011000000400L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__08739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyStringValueAnnotation__Group_3__0__Impl8767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__18798 = new BitSet(new long[]{0x0000011000000400L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__18801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl8828 = new BitSet(new long[]{0x0000010000000402L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__28859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__KeyStringValueAnnotation__Group_3__2__Impl8887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__08924 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__08927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl8955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__18986 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__18989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl9016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__29046 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__29049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl9077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__39108 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__39111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl9138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__49168 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__49171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl9199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__59230 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__59233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl9260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__69290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl9317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__09362 = new BitSet(new long[]{0x0000011000000400L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__09365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl9393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__19424 = new BitSet(new long[]{0x0000011000000400L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__19427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl9454 = new BitSet(new long[]{0x0000010000000402L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__29485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl9513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__09550 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__09553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__KeyBooleanValueAnnotation__Group__0__Impl9581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__19612 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__19615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl9642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__29672 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__29675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl9702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__39732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl9759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__09798 = new BitSet(new long[]{0x0000011000000400L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__09801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl9829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__19860 = new BitSet(new long[]{0x0000011000000400L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__19863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl9890 = new BitSet(new long[]{0x0000010000000402L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__29921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl9949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__09986 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__09989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__KeyIntValueAnnotation__Group__0__Impl10017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__110048 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__110051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl10078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__210108 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__210111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl10138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__310168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl10195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__010234 = new BitSet(new long[]{0x0000011000000400L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__010237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyIntValueAnnotation__Group_3__0__Impl10265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__110296 = new BitSet(new long[]{0x0000011000000400L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__110299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl10326 = new BitSet(new long[]{0x0000010000000402L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__210357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__KeyIntValueAnnotation__Group_3__2__Impl10385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__010422 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__010425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__KeyFloatValueAnnotation__Group__0__Impl10453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__110484 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__110487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl10514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__210544 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__210547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl10574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__310604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl10631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__010670 = new BitSet(new long[]{0x0000011000000400L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__010673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl10701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__110732 = new BitSet(new long[]{0x0000011000000400L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__110735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl10762 = new BitSet(new long[]{0x0000010000000402L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__210793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl10821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__010859 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__010862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl10889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__110918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl10945 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__010980 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__010983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__ExtendedID__Group_1__0__Impl11011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__111042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl11069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__OperatorAlternatives_1_0_1_0_in_rule__OrAndExpression__OperatorAssignment_1_0_111107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__OrAndExpression__SubExpressionsAssignment_1_0_211140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__OperatorAlternatives_1_1_1_0_in_rule__OrAndExpression__OperatorAssignment_1_1_111171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__OrAndExpression__SubExpressionsAssignment_1_1_211204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_111235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_211266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_111297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_211328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_111359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_211390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_111421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_211452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_111483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_rule__MultExpression__SubExpressionsAssignment_1_211514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_1_111545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__DivExpression__SubExpressionsAssignment_1_211576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_111607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_211638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_rule__NegExpression__OperatorAssignment_0_111669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_rule__NegExpression__SubExpressionsAssignment_0_211700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_111731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_311764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment_011799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ValuedObjectReference__IndicesAssignment_1_111834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__FunctionCall__FunctionNameAssignment_111865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__FunctionCall__ParametersAssignment_2_0_111896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__FunctionCall__ParametersAssignment_2_0_2_111927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Parameter__CallByReferenceAssignment_011963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Parameter__ExpressionAssignment_112002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_rule__TextExpression__TextAssignment12033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment12064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment12095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BoolValue__ValueAssignment12126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment12157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_112188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_112219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_112250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_212281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_112312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_112343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_312374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_512405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_112436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_112467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_212498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_112529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_112560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_212591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_112622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_112653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_212684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_112715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred1_InternalKExpressions2629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_0__0_in_synpred3_InternalKExpressions2678 = new BitSet(new long[]{0x0000000004020002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_synpred7_InternalKExpressions2829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred8_InternalKExpressions2879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_synpred17_InternalKExpressions3163 = new BitSet(new long[]{0x0000000000000002L});
    }


}