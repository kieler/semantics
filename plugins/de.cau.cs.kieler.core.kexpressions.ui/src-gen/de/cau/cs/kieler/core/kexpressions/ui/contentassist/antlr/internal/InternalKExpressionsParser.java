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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'|'", "'&'", "'!'", "'+'", "'-'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'=='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'('", "')'", "'['", "']'", "','", "'@'", "'.'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_ID=5;
    public static final int T__40=40;
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
            case 37:
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
            case 38:
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
            case 35:
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
            else if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_HOSTCODE)||LA9_0==RULE_BOOLEAN||LA9_0==16||LA9_0==25||LA9_0==29||LA9_0==34) ) {
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
            else if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_BOOLEAN)||LA10_0==16||LA10_0==25||LA10_0==29||LA10_0==34) ) {
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
            case 34:
                {
                alt11=3;
                }
                break;
            case 29:
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


    // $ANTLR start "rule__Annotation__Alternatives"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1579:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1583:1: ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) )
            int alt15=7;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1584:1: ( ruleCommentAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1584:1: ( ruleCommentAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1585:1: ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives3313);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1590:6: ( ruleTagAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1590:6: ( ruleTagAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1591:1: ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives3330);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1596:6: ( ruleKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1596:6: ( ruleKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1597:1: ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives3347);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1602:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1602:6: ( ruleTypedKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1603:1: ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives3364);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1608:6: ( ruleKeyBooleanValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1608:6: ( ruleKeyBooleanValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1609:1: ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives3381);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1614:6: ( ruleKeyIntValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1614:6: ( ruleKeyIntValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1615:1: ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives3398);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1620:6: ( ruleKeyFloatValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1620:6: ( ruleKeyFloatValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1621:1: ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives3415);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1632:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1636:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1637:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1637:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1638:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives3448); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1643:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1643:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1644:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives3465); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1654:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1658:1: ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt17=1;
                }
                break;
            case 29:
                {
                alt17=2;
                }
                break;
            case 30:
                {
                alt17=3;
                }
                break;
            case 31:
                {
                alt17=4;
                }
                break;
            case 32:
                {
                alt17=5;
                }
                break;
            case 33:
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1659:1: ( ( '==' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1659:1: ( ( '==' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1660:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1661:1: ( '==' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1661:3: '=='
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__CompareOperator__Alternatives3498); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1666:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1666:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1667:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1668:1: ( '<' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1668:3: '<'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__CompareOperator__Alternatives3519); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1673:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1673:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1674:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1675:1: ( '<=' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1675:3: '<='
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__CompareOperator__Alternatives3540); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1680:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1680:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1681:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1682:1: ( '>' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1682:3: '>'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__CompareOperator__Alternatives3561); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1687:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1687:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1688:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1689:1: ( '>=' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1689:3: '>='
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_rule__CompareOperator__Alternatives3582); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1694:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1694:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1695:1: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1696:1: ( '<>' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1696:3: '<>'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__CompareOperator__Alternatives3603); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1710:1: rule__OrAndExpression__Group__0 : rule__OrAndExpression__Group__0__Impl rule__OrAndExpression__Group__1 ;
    public final void rule__OrAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1714:1: ( rule__OrAndExpression__Group__0__Impl rule__OrAndExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1715:2: rule__OrAndExpression__Group__0__Impl rule__OrAndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group__0__Impl_in_rule__OrAndExpression__Group__03638);
            rule__OrAndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group__1_in_rule__OrAndExpression__Group__03641);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1722:1: rule__OrAndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__OrAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1726:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1727:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1727:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1728:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__OrAndExpression__Group__0__Impl3668);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1739:1: rule__OrAndExpression__Group__1 : rule__OrAndExpression__Group__1__Impl ;
    public final void rule__OrAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1743:1: ( rule__OrAndExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1744:2: rule__OrAndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group__1__Impl_in_rule__OrAndExpression__Group__13697);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1750:1: rule__OrAndExpression__Group__1__Impl : ( ( rule__OrAndExpression__Alternatives_1 ) ) ;
    public final void rule__OrAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1754:1: ( ( ( rule__OrAndExpression__Alternatives_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1755:1: ( ( rule__OrAndExpression__Alternatives_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1755:1: ( ( rule__OrAndExpression__Alternatives_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1756:1: ( rule__OrAndExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getAlternatives_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1757:1: ( rule__OrAndExpression__Alternatives_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1757:2: rule__OrAndExpression__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Alternatives_1_in_rule__OrAndExpression__Group__1__Impl3724);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1771:1: rule__OrAndExpression__Group_1_0__0 : rule__OrAndExpression__Group_1_0__0__Impl rule__OrAndExpression__Group_1_0__1 ;
    public final void rule__OrAndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1775:1: ( rule__OrAndExpression__Group_1_0__0__Impl rule__OrAndExpression__Group_1_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1776:2: rule__OrAndExpression__Group_1_0__0__Impl rule__OrAndExpression__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_0__0__Impl_in_rule__OrAndExpression__Group_1_0__03758);
            rule__OrAndExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_0__1_in_rule__OrAndExpression__Group_1_0__03761);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1783:1: rule__OrAndExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__OrAndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1787:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1788:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1788:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1789:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1790:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1792:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1802:1: rule__OrAndExpression__Group_1_0__1 : rule__OrAndExpression__Group_1_0__1__Impl rule__OrAndExpression__Group_1_0__2 ;
    public final void rule__OrAndExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1806:1: ( rule__OrAndExpression__Group_1_0__1__Impl rule__OrAndExpression__Group_1_0__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1807:2: rule__OrAndExpression__Group_1_0__1__Impl rule__OrAndExpression__Group_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_0__1__Impl_in_rule__OrAndExpression__Group_1_0__13819);
            rule__OrAndExpression__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_0__2_in_rule__OrAndExpression__Group_1_0__13822);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1814:1: rule__OrAndExpression__Group_1_0__1__Impl : ( ( rule__OrAndExpression__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__OrAndExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1818:1: ( ( ( rule__OrAndExpression__OperatorAssignment_1_0_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1819:1: ( ( rule__OrAndExpression__OperatorAssignment_1_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1819:1: ( ( rule__OrAndExpression__OperatorAssignment_1_0_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1820:1: ( rule__OrAndExpression__OperatorAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getOperatorAssignment_1_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1821:1: ( rule__OrAndExpression__OperatorAssignment_1_0_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1821:2: rule__OrAndExpression__OperatorAssignment_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__OperatorAssignment_1_0_1_in_rule__OrAndExpression__Group_1_0__1__Impl3849);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1831:1: rule__OrAndExpression__Group_1_0__2 : rule__OrAndExpression__Group_1_0__2__Impl ;
    public final void rule__OrAndExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1835:1: ( rule__OrAndExpression__Group_1_0__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1836:2: rule__OrAndExpression__Group_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_0__2__Impl_in_rule__OrAndExpression__Group_1_0__23879);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1842:1: rule__OrAndExpression__Group_1_0__2__Impl : ( ( rule__OrAndExpression__SubExpressionsAssignment_1_0_2 ) ) ;
    public final void rule__OrAndExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1846:1: ( ( ( rule__OrAndExpression__SubExpressionsAssignment_1_0_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1847:1: ( ( rule__OrAndExpression__SubExpressionsAssignment_1_0_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1847:1: ( ( rule__OrAndExpression__SubExpressionsAssignment_1_0_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1848:1: ( rule__OrAndExpression__SubExpressionsAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getSubExpressionsAssignment_1_0_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1849:1: ( rule__OrAndExpression__SubExpressionsAssignment_1_0_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1849:2: rule__OrAndExpression__SubExpressionsAssignment_1_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__SubExpressionsAssignment_1_0_2_in_rule__OrAndExpression__Group_1_0__2__Impl3906);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1865:1: rule__OrAndExpression__Group_1_1__0 : rule__OrAndExpression__Group_1_1__0__Impl rule__OrAndExpression__Group_1_1__1 ;
    public final void rule__OrAndExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1869:1: ( rule__OrAndExpression__Group_1_1__0__Impl rule__OrAndExpression__Group_1_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1870:2: rule__OrAndExpression__Group_1_1__0__Impl rule__OrAndExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_1__0__Impl_in_rule__OrAndExpression__Group_1_1__03942);
            rule__OrAndExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_1__1_in_rule__OrAndExpression__Group_1_1__03945);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1877:1: rule__OrAndExpression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__OrAndExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1881:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1882:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1882:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1883:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1884:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1886:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1896:1: rule__OrAndExpression__Group_1_1__1 : rule__OrAndExpression__Group_1_1__1__Impl rule__OrAndExpression__Group_1_1__2 ;
    public final void rule__OrAndExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1900:1: ( rule__OrAndExpression__Group_1_1__1__Impl rule__OrAndExpression__Group_1_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1901:2: rule__OrAndExpression__Group_1_1__1__Impl rule__OrAndExpression__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_1__1__Impl_in_rule__OrAndExpression__Group_1_1__14003);
            rule__OrAndExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_1__2_in_rule__OrAndExpression__Group_1_1__14006);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1908:1: rule__OrAndExpression__Group_1_1__1__Impl : ( ( rule__OrAndExpression__OperatorAssignment_1_1_1 ) ) ;
    public final void rule__OrAndExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1912:1: ( ( ( rule__OrAndExpression__OperatorAssignment_1_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1913:1: ( ( rule__OrAndExpression__OperatorAssignment_1_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1913:1: ( ( rule__OrAndExpression__OperatorAssignment_1_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1914:1: ( rule__OrAndExpression__OperatorAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getOperatorAssignment_1_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1915:1: ( rule__OrAndExpression__OperatorAssignment_1_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1915:2: rule__OrAndExpression__OperatorAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__OperatorAssignment_1_1_1_in_rule__OrAndExpression__Group_1_1__1__Impl4033);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1925:1: rule__OrAndExpression__Group_1_1__2 : rule__OrAndExpression__Group_1_1__2__Impl ;
    public final void rule__OrAndExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1929:1: ( rule__OrAndExpression__Group_1_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1930:2: rule__OrAndExpression__Group_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__Group_1_1__2__Impl_in_rule__OrAndExpression__Group_1_1__24063);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1936:1: rule__OrAndExpression__Group_1_1__2__Impl : ( ( rule__OrAndExpression__SubExpressionsAssignment_1_1_2 ) ) ;
    public final void rule__OrAndExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1940:1: ( ( ( rule__OrAndExpression__SubExpressionsAssignment_1_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1941:1: ( ( rule__OrAndExpression__SubExpressionsAssignment_1_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1941:1: ( ( rule__OrAndExpression__SubExpressionsAssignment_1_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1942:1: ( rule__OrAndExpression__SubExpressionsAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getSubExpressionsAssignment_1_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1943:1: ( rule__OrAndExpression__SubExpressionsAssignment_1_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1943:2: rule__OrAndExpression__SubExpressionsAssignment_1_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__SubExpressionsAssignment_1_1_2_in_rule__OrAndExpression__Group_1_1__2__Impl4090);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1959:1: rule__CompareOperation__Group_0__0 : rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 ;
    public final void rule__CompareOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1963:1: ( rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1964:2: rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__04126);
            rule__CompareOperation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__04129);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1971:1: rule__CompareOperation__Group_0__0__Impl : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1975:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1976:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1976:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1977:1: ruleNotOrValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl4156);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1988:1: rule__CompareOperation__Group_0__1 : rule__CompareOperation__Group_0__1__Impl ;
    public final void rule__CompareOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1992:1: ( rule__CompareOperation__Group_0__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1993:2: rule__CompareOperation__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__14185);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1999:1: rule__CompareOperation__Group_0__1__Impl : ( ( rule__CompareOperation__Group_0_1__0 ) ) ;
    public final void rule__CompareOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2003:1: ( ( ( rule__CompareOperation__Group_0_1__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2004:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2004:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2005:1: ( rule__CompareOperation__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2006:1: ( rule__CompareOperation__Group_0_1__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2006:2: rule__CompareOperation__Group_0_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl4212);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2020:1: rule__CompareOperation__Group_0_1__0 : rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 ;
    public final void rule__CompareOperation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2024:1: ( rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2025:2: rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__04246);
            rule__CompareOperation__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__04249);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2032:1: rule__CompareOperation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2036:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2037:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2037:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2038:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2039:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2041:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2051:1: rule__CompareOperation__Group_0_1__1 : rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 ;
    public final void rule__CompareOperation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2055:1: ( rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2056:2: rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__14307);
            rule__CompareOperation__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__14310);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2063:1: rule__CompareOperation__Group_0_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__CompareOperation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2067:1: ( ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2068:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2068:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2069:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_0_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2070:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2070:2: rule__CompareOperation__OperatorAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl4337);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2080:1: rule__CompareOperation__Group_0_1__2 : rule__CompareOperation__Group_0_1__2__Impl ;
    public final void rule__CompareOperation__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2084:1: ( rule__CompareOperation__Group_0_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2085:2: rule__CompareOperation__Group_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__24367);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2091:1: rule__CompareOperation__Group_0_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) ;
    public final void rule__CompareOperation__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2095:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2096:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2096:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2097:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_0_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2098:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2098:2: rule__CompareOperation__SubExpressionsAssignment_0_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl4394);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2114:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2118:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2119:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__04430);
            rule__NotExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__04433);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2126:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2130:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2131:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2131:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2132:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2133:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2135:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2145:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2149:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2150:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__14491);
            rule__NotExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__14494);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2157:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2161:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2162:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2162:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2163:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2164:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2164:2: rule__NotExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl4521);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2174:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2178:1: ( rule__NotExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2179:2: rule__NotExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__24551);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2185:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2189:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2190:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2190:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2191:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2192:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2192:2: rule__NotExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl4578);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2208:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2212:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2213:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__04614);
            rule__AddExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__04617);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2220:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2224:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2225:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2225:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2226:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl4644);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2237:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2241:1: ( rule__AddExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2242:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__14673);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2248:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2252:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2253:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2253:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2254:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2255:1: ( rule__AddExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2255:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl4700);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2269:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2273:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2274:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__04735);
            rule__AddExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__04738);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2281:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2285:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2286:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2286:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2287:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2288:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2290:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2300:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2304:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2305:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__14796);
            rule__AddExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__14799);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2312:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2316:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2317:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2317:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2318:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2319:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2319:2: rule__AddExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl4826);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2329:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2333:1: ( rule__AddExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2334:2: rule__AddExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__24856);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2340:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2344:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2345:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2345:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2346:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2347:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2347:2: rule__AddExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl4883);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2363:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2367:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2368:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__04919);
            rule__SubExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__04922);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2375:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2379:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2380:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2380:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2381:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl4949);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2392:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2396:1: ( rule__SubExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2397:2: rule__SubExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__14978);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2403:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2407:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2408:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2408:1: ( ( rule__SubExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2409:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2410:1: ( rule__SubExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2410:2: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl5005);
            	    rule__SubExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2424:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2428:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2429:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__05040);
            rule__SubExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__05043);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2436:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2440:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2441:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2441:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2442:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2443:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2445:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2455:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2459:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2460:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__15101);
            rule__SubExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__15104);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2467:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2471:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2472:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2472:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2473:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2474:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2474:2: rule__SubExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl5131);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2484:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2488:1: ( rule__SubExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2489:2: rule__SubExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__25161);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2495:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2499:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2500:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2500:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2501:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2502:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2502:2: rule__SubExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5188);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2518:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2522:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2523:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05224);
            rule__MultExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05227);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2530:1: rule__MultExpression__Group__0__Impl : ( ruleDivExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2534:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2535:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2535:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2536:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_rule__MultExpression__Group__0__Impl5254);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2547:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2551:1: ( rule__MultExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2552:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15283);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2558:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2562:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2563:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2563:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2564:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2565:1: ( rule__MultExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2565:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5310);
            	    rule__MultExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2579:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2583:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2584:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__05345);
            rule__MultExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__05348);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2591:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2595:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2596:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2596:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2597:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2598:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2600:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2610:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2614:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2615:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__15406);
            rule__MultExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__15409);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2622:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2626:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2627:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2627:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2628:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2629:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2629:2: rule__MultExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl5436);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2639:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2643:1: ( rule__MultExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2644:2: rule__MultExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__25466);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2650:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2654:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2655:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2655:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2656:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2657:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2657:2: rule__MultExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl5493);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2673:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2677:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2678:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__05529);
            rule__DivExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__05532);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2685:1: rule__DivExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2689:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2690:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2690:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2691:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__DivExpression__Group__0__Impl5559);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2702:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2706:1: ( rule__DivExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2707:2: rule__DivExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__15588);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2713:1: rule__DivExpression__Group__1__Impl : ( ( rule__DivExpression__Group_1__0 )? ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2717:1: ( ( ( rule__DivExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2718:1: ( ( rule__DivExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2718:1: ( ( rule__DivExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2719:1: ( rule__DivExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2720:1: ( rule__DivExpression__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2720:2: rule__DivExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__0_in_rule__DivExpression__Group__1__Impl5615);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2734:1: rule__DivExpression__Group_1__0 : rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 ;
    public final void rule__DivExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2738:1: ( rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2739:2: rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__0__Impl_in_rule__DivExpression__Group_1__05650);
            rule__DivExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__1_in_rule__DivExpression__Group_1__05653);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2746:1: rule__DivExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DivExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2750:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2751:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2751:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2752:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2753:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2755:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2765:1: rule__DivExpression__Group_1__1 : rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 ;
    public final void rule__DivExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2769:1: ( rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2770:2: rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__1__Impl_in_rule__DivExpression__Group_1__15711);
            rule__DivExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__2_in_rule__DivExpression__Group_1__15714);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2777:1: rule__DivExpression__Group_1__1__Impl : ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__DivExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2781:1: ( ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2782:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2782:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2783:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2784:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2784:2: rule__DivExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__OperatorAssignment_1_1_in_rule__DivExpression__Group_1__1__Impl5741);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2794:1: rule__DivExpression__Group_1__2 : rule__DivExpression__Group_1__2__Impl ;
    public final void rule__DivExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2798:1: ( rule__DivExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2799:2: rule__DivExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__2__Impl_in_rule__DivExpression__Group_1__25771);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2805:1: rule__DivExpression__Group_1__2__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2809:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2810:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2810:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2811:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2812:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2812:2: rule__DivExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__SubExpressionsAssignment_1_2_in_rule__DivExpression__Group_1__2__Impl5798);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2828:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2832:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2833:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__05834);
            rule__ModExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__05837);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2840:1: rule__ModExpression__Group__0__Impl : ( ruleNegExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2844:1: ( ( ruleNegExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2845:1: ( ruleNegExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2845:1: ( ruleNegExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2846:1: ruleNegExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_rule__ModExpression__Group__0__Impl5864);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2857:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2861:1: ( rule__ModExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2862:2: rule__ModExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__15893);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2868:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2872:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2873:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2873:1: ( ( rule__ModExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2874:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2875:1: ( rule__ModExpression__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2875:2: rule__ModExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl5920);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2889:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2893:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2894:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__05955);
            rule__ModExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__05958);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2901:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2905:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2906:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2906:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2907:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2908:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2910:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2920:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2924:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2925:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__16016);
            rule__ModExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__16019);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2932:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2936:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2937:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2937:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2938:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2939:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2939:2: rule__ModExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl6046);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2949:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2953:1: ( rule__ModExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2954:2: rule__ModExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__26076);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2960:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2964:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2965:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2965:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2966:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2967:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2967:2: rule__ModExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl6103);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2983:1: rule__NegExpression__Group_0__0 : rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 ;
    public final void rule__NegExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2987:1: ( rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2988:2: rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__0__Impl_in_rule__NegExpression__Group_0__06139);
            rule__NegExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__1_in_rule__NegExpression__Group_0__06142);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2995:1: rule__NegExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NegExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2999:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3000:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3000:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3001:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3002:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3004:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3014:1: rule__NegExpression__Group_0__1 : rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 ;
    public final void rule__NegExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3018:1: ( rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3019:2: rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__1__Impl_in_rule__NegExpression__Group_0__16200);
            rule__NegExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__2_in_rule__NegExpression__Group_0__16203);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3026:1: rule__NegExpression__Group_0__1__Impl : ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NegExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3030:1: ( ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3031:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3031:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3032:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3033:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3033:2: rule__NegExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__OperatorAssignment_0_1_in_rule__NegExpression__Group_0__1__Impl6230);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3043:1: rule__NegExpression__Group_0__2 : rule__NegExpression__Group_0__2__Impl ;
    public final void rule__NegExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3047:1: ( rule__NegExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3048:2: rule__NegExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__2__Impl_in_rule__NegExpression__Group_0__26260);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3054:1: rule__NegExpression__Group_0__2__Impl : ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NegExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3058:1: ( ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3059:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3059:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3060:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3061:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3061:2: rule__NegExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__SubExpressionsAssignment_0_2_in_rule__NegExpression__Group_0__2__Impl6287);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3077:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3081:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3082:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__06323);
            rule__AtomicExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__06326);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3089:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3093:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3094:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3094:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3095:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__AtomicExpression__Group_2__0__Impl6354); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3108:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3112:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3113:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__16385);
            rule__AtomicExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__16388);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3120:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBoolExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3124:1: ( ( ruleBoolExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3125:1: ( ruleBoolExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3125:1: ( ruleBoolExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3126:1: ruleBoolExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_rule__AtomicExpression__Group_2__1__Impl6415);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3137:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3141:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3142:2: rule__AtomicExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__26444);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3148:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3152:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3153:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3153:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3154:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AtomicExpression__Group_2__2__Impl6472); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3173:1: rule__AtomicValuedExpression__Group_2__0 : rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 ;
    public final void rule__AtomicValuedExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3177:1: ( rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3178:2: rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__06509);
            rule__AtomicValuedExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__06512);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3185:1: rule__AtomicValuedExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3189:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3190:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3190:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3191:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__AtomicValuedExpression__Group_2__0__Impl6540); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3204:1: rule__AtomicValuedExpression__Group_2__1 : rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 ;
    public final void rule__AtomicValuedExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3208:1: ( rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3209:2: rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__16571);
            rule__AtomicValuedExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__16574);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3216:1: rule__AtomicValuedExpression__Group_2__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3220:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3221:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3221:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3222:1: ruleValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl6601);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3233:1: rule__AtomicValuedExpression__Group_2__2 : rule__AtomicValuedExpression__Group_2__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3237:1: ( rule__AtomicValuedExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3238:2: rule__AtomicValuedExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__26630);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3244:1: rule__AtomicValuedExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3248:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3249:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3249:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3250:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AtomicValuedExpression__Group_2__2__Impl6658); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3269:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3273:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3274:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__06695);
            rule__ValuedObjectTestExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__06698);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3281:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3285:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3286:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3286:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3287:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3288:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3290:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3300:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3304:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3305:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__16756);
            rule__ValuedObjectTestExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__16759);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3312:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3316:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3317:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3317:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3318:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3319:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3319:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl6786);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3329:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3333:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3334:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__26816);
            rule__ValuedObjectTestExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__26819);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3341:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3345:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3346:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3346:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3347:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ValuedObjectTestExpression__Group_0__2__Impl6847); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3360:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3364:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3365:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__36878);
            rule__ValuedObjectTestExpression__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__36881);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3372:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3376:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3377:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3377:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3378:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3379:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3379:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl6908);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3389:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3393:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3394:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__46938);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3400:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3404:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3405:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3405:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3406:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ValuedObjectTestExpression__Group_0__4__Impl6966); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3429:1: rule__ValuedObjectReference__Group__0 : rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1 ;
    public final void rule__ValuedObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3433:1: ( rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3434:2: rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group__0__Impl_in_rule__ValuedObjectReference__Group__07007);
            rule__ValuedObjectReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group__1_in_rule__ValuedObjectReference__Group__07010);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3441:1: rule__ValuedObjectReference__Group__0__Impl : ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) ;
    public final void rule__ValuedObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3445:1: ( ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3446:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3446:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3447:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3448:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3448:2: rule__ValuedObjectReference__ValuedObjectAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__ValuedObjectAssignment_0_in_rule__ValuedObjectReference__Group__0__Impl7037);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3458:1: rule__ValuedObjectReference__Group__1 : rule__ValuedObjectReference__Group__1__Impl ;
    public final void rule__ValuedObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3462:1: ( rule__ValuedObjectReference__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3463:2: rule__ValuedObjectReference__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group__1__Impl_in_rule__ValuedObjectReference__Group__17067);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3469:1: rule__ValuedObjectReference__Group__1__Impl : ( ( rule__ValuedObjectReference__Group_1__0 )* ) ;
    public final void rule__ValuedObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3473:1: ( ( ( rule__ValuedObjectReference__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3474:1: ( ( rule__ValuedObjectReference__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3474:1: ( ( rule__ValuedObjectReference__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3475:1: ( rule__ValuedObjectReference__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3476:1: ( rule__ValuedObjectReference__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3476:2: rule__ValuedObjectReference__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group_1__0_in_rule__ValuedObjectReference__Group__1__Impl7094);
            	    rule__ValuedObjectReference__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3490:1: rule__ValuedObjectReference__Group_1__0 : rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1 ;
    public final void rule__ValuedObjectReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3494:1: ( rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3495:2: rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group_1__0__Impl_in_rule__ValuedObjectReference__Group_1__07129);
            rule__ValuedObjectReference__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group_1__1_in_rule__ValuedObjectReference__Group_1__07132);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3502:1: rule__ValuedObjectReference__Group_1__0__Impl : ( '[' ) ;
    public final void rule__ValuedObjectReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3506:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3507:1: ( '[' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3507:1: ( '[' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3508:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ValuedObjectReference__Group_1__0__Impl7160); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3521:1: rule__ValuedObjectReference__Group_1__1 : rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2 ;
    public final void rule__ValuedObjectReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3525:1: ( rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3526:2: rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group_1__1__Impl_in_rule__ValuedObjectReference__Group_1__17191);
            rule__ValuedObjectReference__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group_1__2_in_rule__ValuedObjectReference__Group_1__17194);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3533:1: rule__ValuedObjectReference__Group_1__1__Impl : ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) ) ;
    public final void rule__ValuedObjectReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3537:1: ( ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3538:1: ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3538:1: ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3539:1: ( rule__ValuedObjectReference__IndicesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getIndicesAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3540:1: ( rule__ValuedObjectReference__IndicesAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3540:2: rule__ValuedObjectReference__IndicesAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__IndicesAssignment_1_1_in_rule__ValuedObjectReference__Group_1__1__Impl7221);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3550:1: rule__ValuedObjectReference__Group_1__2 : rule__ValuedObjectReference__Group_1__2__Impl ;
    public final void rule__ValuedObjectReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3554:1: ( rule__ValuedObjectReference__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3555:2: rule__ValuedObjectReference__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__Group_1__2__Impl_in_rule__ValuedObjectReference__Group_1__27251);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3561:1: rule__ValuedObjectReference__Group_1__2__Impl : ( ']' ) ;
    public final void rule__ValuedObjectReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3565:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3566:1: ( ']' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3566:1: ( ']' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3567:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ValuedObjectReference__Group_1__2__Impl7279); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3586:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3590:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3591:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__07316);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__07319);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3598:1: rule__FunctionCall__Group__0__Impl : ( '<' ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3602:1: ( ( '<' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3603:1: ( '<' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3603:1: ( '<' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3604:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__FunctionCall__Group__0__Impl7347); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3617:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3621:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3622:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__17378);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__17381);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3629:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__FunctionNameAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3633:1: ( ( ( rule__FunctionCall__FunctionNameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3634:1: ( ( rule__FunctionCall__FunctionNameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3634:1: ( ( rule__FunctionCall__FunctionNameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3635:1: ( rule__FunctionCall__FunctionNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3636:1: ( rule__FunctionCall__FunctionNameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3636:2: rule__FunctionCall__FunctionNameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__FunctionNameAssignment_1_in_rule__FunctionCall__Group__1__Impl7408);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3646:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3650:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3651:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__27438);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__27441);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3658:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__Group_2__0 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3662:1: ( ( ( rule__FunctionCall__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3663:1: ( ( rule__FunctionCall__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3663:1: ( ( rule__FunctionCall__Group_2__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3664:1: ( rule__FunctionCall__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3665:1: ( rule__FunctionCall__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3665:2: rule__FunctionCall__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2__0_in_rule__FunctionCall__Group__2__Impl7468);
                    rule__FunctionCall__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3675:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3679:1: ( rule__FunctionCall__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3680:2: rule__FunctionCall__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__37499);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3686:1: rule__FunctionCall__Group__3__Impl : ( '>' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3690:1: ( ( '>' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3691:1: ( '>' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3691:1: ( '>' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3692:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__FunctionCall__Group__3__Impl7527); if (state.failed) return ;
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


    // $ANTLR start "rule__FunctionCall__Group_2__0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3713:1: rule__FunctionCall__Group_2__0 : rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 ;
    public final void rule__FunctionCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3717:1: ( rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3718:2: rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2__0__Impl_in_rule__FunctionCall__Group_2__07566);
            rule__FunctionCall__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2__1_in_rule__FunctionCall__Group_2__07569);
            rule__FunctionCall__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__0"


    // $ANTLR start "rule__FunctionCall__Group_2__0__Impl"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3725:1: rule__FunctionCall__Group_2__0__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3729:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3730:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3730:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3731:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__FunctionCall__Group_2__0__Impl7597); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2__1"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3744:1: rule__FunctionCall__Group_2__1 : rule__FunctionCall__Group_2__1__Impl rule__FunctionCall__Group_2__2 ;
    public final void rule__FunctionCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3748:1: ( rule__FunctionCall__Group_2__1__Impl rule__FunctionCall__Group_2__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3749:2: rule__FunctionCall__Group_2__1__Impl rule__FunctionCall__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2__1__Impl_in_rule__FunctionCall__Group_2__17628);
            rule__FunctionCall__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2__2_in_rule__FunctionCall__Group_2__17631);
            rule__FunctionCall__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__1"


    // $ANTLR start "rule__FunctionCall__Group_2__1__Impl"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3756:1: rule__FunctionCall__Group_2__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_1 ) ) ;
    public final void rule__FunctionCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3760:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3761:1: ( ( rule__FunctionCall__ParametersAssignment_2_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3761:1: ( ( rule__FunctionCall__ParametersAssignment_2_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3762:1: ( rule__FunctionCall__ParametersAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3763:1: ( rule__FunctionCall__ParametersAssignment_2_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3763:2: rule__FunctionCall__ParametersAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__ParametersAssignment_2_1_in_rule__FunctionCall__Group_2__1__Impl7658);
            rule__FunctionCall__ParametersAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2__2"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3773:1: rule__FunctionCall__Group_2__2 : rule__FunctionCall__Group_2__2__Impl rule__FunctionCall__Group_2__3 ;
    public final void rule__FunctionCall__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3777:1: ( rule__FunctionCall__Group_2__2__Impl rule__FunctionCall__Group_2__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3778:2: rule__FunctionCall__Group_2__2__Impl rule__FunctionCall__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2__2__Impl_in_rule__FunctionCall__Group_2__27688);
            rule__FunctionCall__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2__3_in_rule__FunctionCall__Group_2__27691);
            rule__FunctionCall__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__2"


    // $ANTLR start "rule__FunctionCall__Group_2__2__Impl"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3785:1: rule__FunctionCall__Group_2__2__Impl : ( ( rule__FunctionCall__Group_2_2__0 )* ) ;
    public final void rule__FunctionCall__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3789:1: ( ( ( rule__FunctionCall__Group_2_2__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3790:1: ( ( rule__FunctionCall__Group_2_2__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3790:1: ( ( rule__FunctionCall__Group_2_2__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3791:1: ( rule__FunctionCall__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_2_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3792:1: ( rule__FunctionCall__Group_2_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3792:2: rule__FunctionCall__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_2__0_in_rule__FunctionCall__Group_2__2__Impl7718);
            	    rule__FunctionCall__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2__3"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3802:1: rule__FunctionCall__Group_2__3 : rule__FunctionCall__Group_2__3__Impl ;
    public final void rule__FunctionCall__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3806:1: ( rule__FunctionCall__Group_2__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3807:2: rule__FunctionCall__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2__3__Impl_in_rule__FunctionCall__Group_2__37749);
            rule__FunctionCall__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__3"


    // $ANTLR start "rule__FunctionCall__Group_2__3__Impl"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3813:1: rule__FunctionCall__Group_2__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3817:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3818:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3818:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3819:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__FunctionCall__Group_2__3__Impl7777); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_2__0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3840:1: rule__FunctionCall__Group_2_2__0 : rule__FunctionCall__Group_2_2__0__Impl rule__FunctionCall__Group_2_2__1 ;
    public final void rule__FunctionCall__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3844:1: ( rule__FunctionCall__Group_2_2__0__Impl rule__FunctionCall__Group_2_2__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3845:2: rule__FunctionCall__Group_2_2__0__Impl rule__FunctionCall__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_2__0__Impl_in_rule__FunctionCall__Group_2_2__07816);
            rule__FunctionCall__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_2__1_in_rule__FunctionCall__Group_2_2__07819);
            rule__FunctionCall__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_2__0"


    // $ANTLR start "rule__FunctionCall__Group_2_2__0__Impl"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3852:1: rule__FunctionCall__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3856:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3857:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3857:1: ( ',' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3858:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__FunctionCall__Group_2_2__0__Impl7847); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_2__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_2_2__1"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3871:1: rule__FunctionCall__Group_2_2__1 : rule__FunctionCall__Group_2_2__1__Impl ;
    public final void rule__FunctionCall__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3875:1: ( rule__FunctionCall__Group_2_2__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3876:2: rule__FunctionCall__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__Group_2_2__1__Impl_in_rule__FunctionCall__Group_2_2__17878);
            rule__FunctionCall__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_2__1"


    // $ANTLR start "rule__FunctionCall__Group_2_2__1__Impl"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3882:1: rule__FunctionCall__Group_2_2__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__FunctionCall__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3886:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_2_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3887:1: ( ( rule__FunctionCall__ParametersAssignment_2_2_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3887:1: ( ( rule__FunctionCall__ParametersAssignment_2_2_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3888:1: ( rule__FunctionCall__ParametersAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_2_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3889:1: ( rule__FunctionCall__ParametersAssignment_2_2_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3889:2: rule__FunctionCall__ParametersAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FunctionCall__ParametersAssignment_2_2_1_in_rule__FunctionCall__Group_2_2__1__Impl7905);
            rule__FunctionCall__ParametersAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_2_2__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3903:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3907:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3908:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__07939);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__07942);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3915:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__CallByReferenceAssignment_0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3919:1: ( ( ( rule__Parameter__CallByReferenceAssignment_0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3920:1: ( ( rule__Parameter__CallByReferenceAssignment_0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3920:1: ( ( rule__Parameter__CallByReferenceAssignment_0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3921:1: ( rule__Parameter__CallByReferenceAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3922:1: ( rule__Parameter__CallByReferenceAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3922:2: rule__Parameter__CallByReferenceAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Parameter__CallByReferenceAssignment_0_in_rule__Parameter__Group__0__Impl7969);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3932:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3936:1: ( rule__Parameter__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3937:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__18000);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3943:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ExpressionAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3947:1: ( ( ( rule__Parameter__ExpressionAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3948:1: ( ( rule__Parameter__ExpressionAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3948:1: ( ( rule__Parameter__ExpressionAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3949:1: ( rule__Parameter__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getExpressionAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3950:1: ( rule__Parameter__ExpressionAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3950:2: rule__Parameter__ExpressionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__ExpressionAssignment_1_in_rule__Parameter__Group__1__Impl8027);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3964:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3968:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3969:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__08061);
            rule__TagAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__08064);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3976:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3980:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3981:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3981:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3982:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__TagAnnotation__Group__0__Impl8092); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3995:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3999:1: ( rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4000:2: rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__18123);
            rule__TagAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__18126);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4007:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4011:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4012:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4012:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4013:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4014:1: ( rule__TagAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4014:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl8153);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4024:1: rule__TagAnnotation__Group__2 : rule__TagAnnotation__Group__2__Impl ;
    public final void rule__TagAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4028:1: ( rule__TagAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4029:2: rule__TagAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__28183);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4035:1: rule__TagAnnotation__Group__2__Impl : ( ( rule__TagAnnotation__Group_2__0 )? ) ;
    public final void rule__TagAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4039:1: ( ( ( rule__TagAnnotation__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4040:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4040:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4041:1: ( rule__TagAnnotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4042:1: ( rule__TagAnnotation__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4042:2: rule__TagAnnotation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl8210);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4058:1: rule__TagAnnotation__Group_2__0 : rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 ;
    public final void rule__TagAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4062:1: ( rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4063:2: rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__08247);
            rule__TagAnnotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__08250);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4070:1: rule__TagAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TagAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4074:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4075:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4075:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4076:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__TagAnnotation__Group_2__0__Impl8278); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4089:1: rule__TagAnnotation__Group_2__1 : rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 ;
    public final void rule__TagAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4093:1: ( rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4094:2: rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__18309);
            rule__TagAnnotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__18312);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4101:1: rule__TagAnnotation__Group_2__1__Impl : ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) ;
    public final void rule__TagAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4105:1: ( ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4106:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4106:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4107:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4108:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_COMMENT_ANNOTATION||LA28_0==39) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4108:2: rule__TagAnnotation__AnnotationsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl8339);
            	    rule__TagAnnotation__AnnotationsAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4118:1: rule__TagAnnotation__Group_2__2 : rule__TagAnnotation__Group_2__2__Impl ;
    public final void rule__TagAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4122:1: ( rule__TagAnnotation__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4123:2: rule__TagAnnotation__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__28370);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4129:1: rule__TagAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TagAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4133:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4134:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4134:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4135:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__TagAnnotation__Group_2__2__Impl8398); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4154:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4158:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4159:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__08435);
            rule__KeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__08438);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4166:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4170:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4171:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4171:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4172:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__KeyStringValueAnnotation__Group__0__Impl8466); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4185:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4189:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4190:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__18497);
            rule__KeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__18500);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4197:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4201:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4202:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4202:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4203:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4204:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4204:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl8527);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4214:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4218:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4219:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__28557);
            rule__KeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__28560);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4226:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4230:1: ( ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4231:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4231:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4232:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4233:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4233:2: rule__KeyStringValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl8587);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4243:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4247:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4248:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__38617);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4254:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4258:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4259:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4259:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4260:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4261:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4261:2: rule__KeyStringValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl8644);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4279:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4283:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4284:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__08683);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__08686);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4291:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4295:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4296:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4296:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4297:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyStringValueAnnotation__Group_3__0__Impl8714); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4310:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4314:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4315:2: rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__18745);
            rule__KeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__18748);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4322:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4326:1: ( ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4327:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4327:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4328:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4329:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_COMMENT_ANNOTATION||LA30_0==39) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4329:2: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl8775);
            	    rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4339:1: rule__KeyStringValueAnnotation__Group_3__2 : rule__KeyStringValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4343:1: ( rule__KeyStringValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4344:2: rule__KeyStringValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__28806);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4350:1: rule__KeyStringValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4354:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4355:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4355:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4356:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyStringValueAnnotation__Group_3__2__Impl8834); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4375:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4379:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4380:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__08871);
            rule__TypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__08874);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4387:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4391:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4392:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4392:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4393:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl8902); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4406:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4410:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4411:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__18933);
            rule__TypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__18936);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4418:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4422:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4423:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4423:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4424:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4425:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4425:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl8963);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4435:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4439:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4440:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__28993);
            rule__TypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__28996);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4447:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4451:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4452:1: ( '[' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4452:1: ( '[' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4453:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl9024); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4466:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4470:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4471:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__39055);
            rule__TypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__39058);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4478:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4482:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4483:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4483:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4484:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4485:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4485:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl9085);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4495:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4499:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4500:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__49115);
            rule__TypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__49118);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4507:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4511:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4512:1: ( ']' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4512:1: ( ']' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4513:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl9146); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4526:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4530:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4531:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__59177);
            rule__TypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__59180);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4538:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4542:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4543:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4543:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4544:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueAssignment_5()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4545:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4545:2: rule__TypedKeyStringValueAnnotation__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl9207);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4555:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4559:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4560:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__69237);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4566:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4570:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4571:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4571:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4572:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4573:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4573:2: rule__TypedKeyStringValueAnnotation__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl9264);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4597:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4601:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4602:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__09309);
            rule__TypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__09312);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4609:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4613:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4614:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4614:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4615:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl9340); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4628:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4632:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4633:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__19371);
            rule__TypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__19374);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4640:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4644:1: ( ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4645:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4645:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4646:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAssignment_6_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4647:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_COMMENT_ANNOTATION||LA32_0==39) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4647:2: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl9401);
            	    rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4657:1: rule__TypedKeyStringValueAnnotation__Group_6__2 : rule__TypedKeyStringValueAnnotation__Group_6__2__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4661:1: ( rule__TypedKeyStringValueAnnotation__Group_6__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4662:2: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__29432);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4668:1: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl : ( ')' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4672:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4673:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4673:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4674:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl9460); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4693:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4697:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4698:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__09497);
            rule__KeyBooleanValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__09500);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4705:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4709:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4710:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4710:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4711:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__KeyBooleanValueAnnotation__Group__0__Impl9528); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4724:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4728:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4729:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__19559);
            rule__KeyBooleanValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__19562);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4736:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4740:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4741:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4741:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4742:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4743:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4743:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl9589);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4753:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4757:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4758:2: rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__29619);
            rule__KeyBooleanValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__29622);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4765:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4769:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4770:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4770:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4771:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4772:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4772:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl9649);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4782:1: rule__KeyBooleanValueAnnotation__Group__3 : rule__KeyBooleanValueAnnotation__Group__3__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4786:1: ( rule__KeyBooleanValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4787:2: rule__KeyBooleanValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__39679);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4793:1: rule__KeyBooleanValueAnnotation__Group__3__Impl : ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4797:1: ( ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4798:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4798:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4799:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4800:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4800:2: rule__KeyBooleanValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl9706);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4818:1: rule__KeyBooleanValueAnnotation__Group_3__0 : rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4822:1: ( rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4823:2: rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__09745);
            rule__KeyBooleanValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__09748);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4830:1: rule__KeyBooleanValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4834:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4835:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4835:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4836:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl9776); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4849:1: rule__KeyBooleanValueAnnotation__Group_3__1 : rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4853:1: ( rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4854:2: rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__19807);
            rule__KeyBooleanValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__19810);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4861:1: rule__KeyBooleanValueAnnotation__Group_3__1__Impl : ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4865:1: ( ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4866:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4866:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4867:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4868:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_COMMENT_ANNOTATION||LA34_0==39) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4868:2: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl9837);
            	    rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4878:1: rule__KeyBooleanValueAnnotation__Group_3__2 : rule__KeyBooleanValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4882:1: ( rule__KeyBooleanValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4883:2: rule__KeyBooleanValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__29868);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4889:1: rule__KeyBooleanValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4893:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4894:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4894:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4895:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl9896); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4914:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4918:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4919:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__09933);
            rule__KeyIntValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__09936);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4926:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4930:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4931:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4931:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4932:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__KeyIntValueAnnotation__Group__0__Impl9964); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4945:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4949:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4950:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__19995);
            rule__KeyIntValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__19998);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4957:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4961:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4962:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4962:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4963:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4964:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4964:2: rule__KeyIntValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl10025);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4974:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4978:1: ( rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4979:2: rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__210055);
            rule__KeyIntValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__210058);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4986:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4990:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4991:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4991:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4992:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4993:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4993:2: rule__KeyIntValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl10085);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5003:1: rule__KeyIntValueAnnotation__Group__3 : rule__KeyIntValueAnnotation__Group__3__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5007:1: ( rule__KeyIntValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5008:2: rule__KeyIntValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__310115);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5014:1: rule__KeyIntValueAnnotation__Group__3__Impl : ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyIntValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5018:1: ( ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5019:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5019:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5020:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5021:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5021:2: rule__KeyIntValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl10142);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5039:1: rule__KeyIntValueAnnotation__Group_3__0 : rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 ;
    public final void rule__KeyIntValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5043:1: ( rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5044:2: rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__010181);
            rule__KeyIntValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__010184);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5051:1: rule__KeyIntValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5055:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5056:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5056:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5057:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyIntValueAnnotation__Group_3__0__Impl10212); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5070:1: rule__KeyIntValueAnnotation__Group_3__1 : rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 ;
    public final void rule__KeyIntValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5074:1: ( rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5075:2: rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__110243);
            rule__KeyIntValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__110246);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5082:1: rule__KeyIntValueAnnotation__Group_3__1__Impl : ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5086:1: ( ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5087:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5087:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5088:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5089:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_COMMENT_ANNOTATION||LA36_0==39) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5089:2: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl10273);
            	    rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5099:1: rule__KeyIntValueAnnotation__Group_3__2 : rule__KeyIntValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5103:1: ( rule__KeyIntValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5104:2: rule__KeyIntValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__210304);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5110:1: rule__KeyIntValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5114:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5115:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5115:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5116:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyIntValueAnnotation__Group_3__2__Impl10332); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5135:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5139:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5140:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__010369);
            rule__KeyFloatValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__010372);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5147:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5151:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5152:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5152:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5153:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__KeyFloatValueAnnotation__Group__0__Impl10400); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5166:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5170:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5171:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__110431);
            rule__KeyFloatValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__110434);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5178:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5182:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5183:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5183:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5184:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5185:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5185:2: rule__KeyFloatValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl10461);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5195:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5199:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5200:2: rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__210491);
            rule__KeyFloatValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__210494);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5207:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5211:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5212:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5212:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5213:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5214:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5214:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl10521);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5224:1: rule__KeyFloatValueAnnotation__Group__3 : rule__KeyFloatValueAnnotation__Group__3__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5228:1: ( rule__KeyFloatValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5229:2: rule__KeyFloatValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__310551);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5235:1: rule__KeyFloatValueAnnotation__Group__3__Impl : ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyFloatValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5239:1: ( ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5240:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5240:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5241:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5242:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5242:2: rule__KeyFloatValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl10578);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5260:1: rule__KeyFloatValueAnnotation__Group_3__0 : rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5264:1: ( rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5265:2: rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__010617);
            rule__KeyFloatValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__010620);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5272:1: rule__KeyFloatValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5276:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5277:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5277:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5278:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl10648); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5291:1: rule__KeyFloatValueAnnotation__Group_3__1 : rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5295:1: ( rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5296:2: rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__110679);
            rule__KeyFloatValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__110682);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5303:1: rule__KeyFloatValueAnnotation__Group_3__1__Impl : ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5307:1: ( ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5308:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5308:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5309:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5310:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_COMMENT_ANNOTATION||LA38_0==39) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5310:2: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl10709);
            	    rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5320:1: rule__KeyFloatValueAnnotation__Group_3__2 : rule__KeyFloatValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5324:1: ( rule__KeyFloatValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5325:2: rule__KeyFloatValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__210740);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5331:1: rule__KeyFloatValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5335:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5336:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5336:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5337:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl10768); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5357:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5361:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5362:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__010806);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__010809);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5369:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5373:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5374:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5374:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5375:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl10836); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5386:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5390:1: ( rule__ExtendedID__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5391:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__110865);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5397:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5401:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5402:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5402:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5403:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5404:1: ( rule__ExtendedID__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==40) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5404:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl10892);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5418:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5422:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5423:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__010927);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__010930);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5430:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5434:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5435:1: ( '.' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5435:1: ( '.' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5436:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__ExtendedID__Group_1__0__Impl10958); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5449:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5453:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5454:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__110989);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5460:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5464:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5465:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5465:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5466:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl11016); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5482:1: rule__OrAndExpression__OperatorAssignment_1_0_1 : ( ( rule__OrAndExpression__OperatorAlternatives_1_0_1_0 ) ) ;
    public final void rule__OrAndExpression__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5486:1: ( ( ( rule__OrAndExpression__OperatorAlternatives_1_0_1_0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5487:1: ( ( rule__OrAndExpression__OperatorAlternatives_1_0_1_0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5487:1: ( ( rule__OrAndExpression__OperatorAlternatives_1_0_1_0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5488:1: ( rule__OrAndExpression__OperatorAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getOperatorAlternatives_1_0_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5489:1: ( rule__OrAndExpression__OperatorAlternatives_1_0_1_0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5489:2: rule__OrAndExpression__OperatorAlternatives_1_0_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__OperatorAlternatives_1_0_1_0_in_rule__OrAndExpression__OperatorAssignment_1_0_111054);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5498:1: rule__OrAndExpression__SubExpressionsAssignment_1_0_2 : ( ruleCompareOperation ) ;
    public final void rule__OrAndExpression__SubExpressionsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5502:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5503:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5503:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5504:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__OrAndExpression__SubExpressionsAssignment_1_0_211087);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5513:1: rule__OrAndExpression__OperatorAssignment_1_1_1 : ( ( rule__OrAndExpression__OperatorAlternatives_1_1_1_0 ) ) ;
    public final void rule__OrAndExpression__OperatorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5517:1: ( ( ( rule__OrAndExpression__OperatorAlternatives_1_1_1_0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5518:1: ( ( rule__OrAndExpression__OperatorAlternatives_1_1_1_0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5518:1: ( ( rule__OrAndExpression__OperatorAlternatives_1_1_1_0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5519:1: ( rule__OrAndExpression__OperatorAlternatives_1_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getOperatorAlternatives_1_1_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5520:1: ( rule__OrAndExpression__OperatorAlternatives_1_1_1_0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5520:2: rule__OrAndExpression__OperatorAlternatives_1_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrAndExpression__OperatorAlternatives_1_1_1_0_in_rule__OrAndExpression__OperatorAssignment_1_1_111118);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5529:1: rule__OrAndExpression__SubExpressionsAssignment_1_1_2 : ( ruleCompareOperation ) ;
    public final void rule__OrAndExpression__SubExpressionsAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5533:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5534:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5534:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5535:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__OrAndExpression__SubExpressionsAssignment_1_1_211151);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5544:1: rule__CompareOperation__OperatorAssignment_0_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5548:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5549:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5549:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5550:1: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_111182);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5559:1: rule__CompareOperation__SubExpressionsAssignment_0_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5563:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5564:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5564:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5565:1: ruleNotOrValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_211213);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5574:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5578:1: ( ( ruleNotOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5579:1: ( ruleNotOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5579:1: ( ruleNotOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5580:1: ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_111244);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5589:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5593:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5594:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5594:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5595:1: ruleNotExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_211275);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5604:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5608:1: ( ( ruleAddOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5609:1: ( ruleAddOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5609:1: ( ruleAddOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5610:1: ruleAddOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_111306);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5619:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5623:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5624:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5624:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5625:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_211337);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5634:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5638:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5639:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5639:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5640:1: ruleSubOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_111368);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5649:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5653:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5654:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5654:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5655:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_211399);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5664:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5668:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5669:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5669:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5670:1: ruleMultOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_111430);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5679:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5683:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5684:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5684:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5685:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_rule__MultExpression__SubExpressionsAssignment_1_211461);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5694:1: rule__DivExpression__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5698:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5699:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5699:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5700:1: ruleDivOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_1_111492);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5709:1: rule__DivExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5713:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5714:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5714:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5715:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__DivExpression__SubExpressionsAssignment_1_211523);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5724:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5728:1: ( ( ruleModOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5729:1: ( ruleModOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5729:1: ( ruleModOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5730:1: ruleModOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_111554);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5739:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5743:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5744:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5744:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5745:1: ruleAtomicValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_211585);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5754:1: rule__NegExpression__OperatorAssignment_0_1 : ( ruleSubOperator ) ;
    public final void rule__NegExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5758:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5759:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5759:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5760:1: ruleSubOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_rule__NegExpression__OperatorAssignment_0_111616);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5769:1: rule__NegExpression__SubExpressionsAssignment_0_2 : ( ruleNegExpression ) ;
    public final void rule__NegExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5773:1: ( ( ruleNegExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5774:1: ( ruleNegExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5774:1: ( ruleNegExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5775:1: ruleNegExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_rule__NegExpression__SubExpressionsAssignment_0_211647);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5784:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5788:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5789:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5789:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5790:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAlternatives_0_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5791:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5791:2: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_111678);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5800:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5804:1: ( ( ruleValuedObjectTestExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5805:1: ( ruleValuedObjectTestExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5805:1: ( ruleValuedObjectTestExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5806:1: ruleValuedObjectTestExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_311711);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5815:1: rule__ValuedObjectReference__ValuedObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5819:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5820:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5820:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5821:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5822:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5823:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment_011746); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5834:1: rule__ValuedObjectReference__IndicesAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__ValuedObjectReference__IndicesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5838:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5839:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5839:1: ( ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5840:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__ValuedObjectReference__IndicesAssignment_1_111781);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5849:1: rule__FunctionCall__FunctionNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionCall__FunctionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5853:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5854:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5854:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5855:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FunctionCall__FunctionNameAssignment_111812); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_2_1"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5864:1: rule__FunctionCall__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5868:1: ( ( ruleParameter ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5869:1: ( ruleParameter )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5869:1: ( ruleParameter )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5870:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__FunctionCall__ParametersAssignment_2_111843);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_2_1"


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_2_2_1"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5879:1: rule__FunctionCall__ParametersAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5883:1: ( ( ruleParameter ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5884:1: ( ruleParameter )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5884:1: ( ruleParameter )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5885:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__FunctionCall__ParametersAssignment_2_2_111874);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_2_2_1"


    // $ANTLR start "rule__Parameter__CallByReferenceAssignment_0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5894:1: rule__Parameter__CallByReferenceAssignment_0 : ( ( '&' ) ) ;
    public final void rule__Parameter__CallByReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5898:1: ( ( ( '&' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5899:1: ( ( '&' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5899:1: ( ( '&' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5900:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5901:1: ( '&' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5902:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Parameter__CallByReferenceAssignment_011910); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5917:1: rule__Parameter__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Parameter__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5921:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5922:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5922:1: ( ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5923:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Parameter__ExpressionAssignment_111949);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5932:1: rule__TextExpression__TextAssignment : ( RULE_HOSTCODE ) ;
    public final void rule__TextExpression__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5936:1: ( ( RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5937:1: ( RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5937:1: ( RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5938:1: RULE_HOSTCODE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTextHOSTCODETerminalRuleCall_0()); 
            }
            match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_rule__TextExpression__TextAssignment11980); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5947:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5951:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5952:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5952:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5953:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment12011); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5962:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5966:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5967:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5967:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5968:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment12042); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5977:1: rule__BoolValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BoolValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5981:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5982:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5982:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5983:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__BoolValue__ValueAssignment12073); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5992:1: rule__CommentAnnotation__ValueAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5996:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5997:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5997:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5998:1: RULE_COMMENT_ANNOTATION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment12104); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6007:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6011:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6012:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6012:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6013:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_112135);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6022:1: rule__TagAnnotation__AnnotationsAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__TagAnnotation__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6026:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6027:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6027:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6028:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_112166);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6037:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6041:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6042:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6042:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6043:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_112197);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6052:1: rule__KeyStringValueAnnotation__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6056:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6057:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6057:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6058:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_212228);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6067:1: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6071:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6072:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6072:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6073:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_112259);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6082:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6086:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6087:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6087:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6088:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_112290);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6097:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6101:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6102:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6102:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6103:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_312321);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6112:1: rule__TypedKeyStringValueAnnotation__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6116:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6117:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6117:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6118:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_512352);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6127:1: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 : ( ruleAnnotation ) ;
    public final void rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6131:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6132:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6132:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6133:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_112383);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6142:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6146:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6147:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6147:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6148:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_112414);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6157:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6161:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6162:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6162:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6163:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_212445); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6172:1: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6176:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6177:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6177:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6178:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_112476);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6187:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6191:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6192:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6192:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6193:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_112507);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6202:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6206:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6207:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6207:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6208:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_212538); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6217:1: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6221:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6222:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6222:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6223:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_112569);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6232:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6236:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6237:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6237:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6238:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_112600);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6247:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6251:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6252:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6252:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6253:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFLOATTerminalRuleCall_2_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_212631); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6262:1: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6266:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6267:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6267:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:6268:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_112662);
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
        loop40:
        do {
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==17||LA40_0==26) ) {
                alt40=1;
            }


            switch (alt40) {
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
        	    break loop40;
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
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA1_eotS =
        "\15\uffff";
    static final String DFA1_eofS =
        "\15\uffff";
    static final String DFA1_minS =
        "\1\5\12\0\2\uffff";
    static final String DFA1_maxS =
        "\1\42\12\0\2\uffff";
    static final String DFA1_acceptS =
        "\13\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\10\1\12\1\2\1\3\1\5\6\uffff\1\6\2\uffff\1\13\1\uffff\1\1\3\uffff\1\7\3\uffff\1\11\4\uffff\1\4",
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
        "\1\42\3\uffff\10\0\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\12\uffff\1\2";
    static final String DFA7_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\10\1\12\2\1\1\5\6\uffff\1\6\2\uffff\1\13\1\uffff\1\1\3\uffff\1\7\3\uffff\1\11\4\uffff\1\4",
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
        "\1\42\3\uffff\7\0\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA8_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\10\1\12\2\1\1\5\6\uffff\1\6\2\uffff\1\13\1\uffff\1\1\3\uffff\1\7\3\uffff\1\11\4\uffff\1\4",
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
        "\1\42\2\uffff\1\0\7\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\5\uffff\1\3";
    static final String DFA12_specialS =
        "\3\uffff\1\0\7\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\4\1\1\1\2\1\4\6\uffff\1\4\10\uffff\1\4\3\uffff\1\4\4\uffff\1\3",
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
    static final String DFA15_eotS =
        "\14\uffff";
    static final String DFA15_eofS =
        "\3\uffff\1\6\7\uffff\1\6";
    static final String DFA15_minS =
        "\1\12\1\uffff\1\5\1\4\1\5\6\uffff\1\4";
    static final String DFA15_maxS =
        "\1\47\1\uffff\1\5\1\50\1\5\6\uffff\1\50";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\3\uffff\1\7\1\2\1\4\1\3\1\6\1\5\1\uffff";
    static final String DFA15_specialS =
        "\14\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\34\uffff\1\2",
            "",
            "\1\3",
            "\2\10\1\uffff\1\11\1\5\1\12\1\6\27\uffff\2\6\1\7\2\uffff\1\6\1\4",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\10\1\uffff\1\11\1\5\1\12\1\6\27\uffff\2\6\1\7\2\uffff\1\6\1\4"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1579:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );";
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
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives3313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives3330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives3347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives3364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives3381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives3398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives3415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives3448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives3465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CompareOperator__Alternatives3498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CompareOperator__Alternatives3519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__CompareOperator__Alternatives3540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__CompareOperator__Alternatives3561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__CompareOperator__Alternatives3582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__CompareOperator__Alternatives3603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group__0__Impl_in_rule__OrAndExpression__Group__03638 = new BitSet(new long[]{0x000000000C060000L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group__1_in_rule__OrAndExpression__Group__03641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__OrAndExpression__Group__0__Impl3668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group__1__Impl_in_rule__OrAndExpression__Group__13697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Alternatives_1_in_rule__OrAndExpression__Group__1__Impl3724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_0__0__Impl_in_rule__OrAndExpression__Group_1_0__03758 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_0__1_in_rule__OrAndExpression__Group_1_0__03761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_0__1__Impl_in_rule__OrAndExpression__Group_1_0__13819 = new BitSet(new long[]{0x00000004222903E0L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_0__2_in_rule__OrAndExpression__Group_1_0__13822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__OperatorAssignment_1_0_1_in_rule__OrAndExpression__Group_1_0__1__Impl3849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_0__2__Impl_in_rule__OrAndExpression__Group_1_0__23879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__SubExpressionsAssignment_1_0_2_in_rule__OrAndExpression__Group_1_0__2__Impl3906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_1__0__Impl_in_rule__OrAndExpression__Group_1_1__03942 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_1__1_in_rule__OrAndExpression__Group_1_1__03945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_1__1__Impl_in_rule__OrAndExpression__Group_1_1__14003 = new BitSet(new long[]{0x00000004222903E0L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_1__2_in_rule__OrAndExpression__Group_1_1__14006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__OperatorAssignment_1_1_1_in_rule__OrAndExpression__Group_1_1__1__Impl4033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_1__2__Impl_in_rule__OrAndExpression__Group_1_1__24063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__SubExpressionsAssignment_1_1_2_in_rule__OrAndExpression__Group_1_1__2__Impl4090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__04126 = new BitSet(new long[]{0x00000003F0000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__04129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl4156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__14185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__04246 = new BitSet(new long[]{0x00000003F0000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__04249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__14307 = new BitSet(new long[]{0x00000004222903E0L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__14310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl4337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__24367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl4394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__04430 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__04433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__14491 = new BitSet(new long[]{0x00000004222903E0L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__14494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl4521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__24551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl4578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__04614 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__04617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl4644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__14673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl4700 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__04735 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__04738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__14796 = new BitSet(new long[]{0x00000004222103E0L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__14799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl4826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__24856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl4883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__04919 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__04922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl4949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__14978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl5005 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__05040 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__05043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__15101 = new BitSet(new long[]{0x00000004222103E0L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__15104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl5131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__25161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05224 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_rule__MultExpression__Group__0__Impl5254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5310 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__05345 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__05348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__15406 = new BitSet(new long[]{0x00000004222103E0L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__15409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl5436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__25466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl5493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__05529 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__05532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__DivExpression__Group__0__Impl5559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__15588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__0_in_rule__DivExpression__Group__1__Impl5615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__0__Impl_in_rule__DivExpression__Group_1__05650 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__1_in_rule__DivExpression__Group_1__05653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__1__Impl_in_rule__DivExpression__Group_1__15711 = new BitSet(new long[]{0x00000004222103E0L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__2_in_rule__DivExpression__Group_1__15714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__OperatorAssignment_1_1_in_rule__DivExpression__Group_1__1__Impl5741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__2__Impl_in_rule__DivExpression__Group_1__25771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__SubExpressionsAssignment_1_2_in_rule__DivExpression__Group_1__2__Impl5798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__05834 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__05837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_rule__ModExpression__Group__0__Impl5864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__15893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl5920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__05955 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__05958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__16016 = new BitSet(new long[]{0x00000004222103E0L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__16019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl6046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__26076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl6103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__0__Impl_in_rule__NegExpression__Group_0__06139 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__1_in_rule__NegExpression__Group_0__06142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__1__Impl_in_rule__NegExpression__Group_0__16200 = new BitSet(new long[]{0x00000004222103E0L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__2_in_rule__NegExpression__Group_0__16203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__OperatorAssignment_0_1_in_rule__NegExpression__Group_0__1__Impl6230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__2__Impl_in_rule__NegExpression__Group_0__26260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__SubExpressionsAssignment_0_2_in_rule__NegExpression__Group_0__2__Impl6287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__06323 = new BitSet(new long[]{0x00000004222903E0L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__06326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__AtomicExpression__Group_2__0__Impl6354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__16385 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__16388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_rule__AtomicExpression__Group_2__1__Impl6415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__26444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AtomicExpression__Group_2__2__Impl6472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__06509 = new BitSet(new long[]{0x00000004222103E0L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__06512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__AtomicValuedExpression__Group_2__0__Impl6540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__16571 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__16574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl6601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__26630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AtomicValuedExpression__Group_2__2__Impl6658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__06695 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__06698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__16756 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__16759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl6786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__26816 = new BitSet(new long[]{0x0000000002010020L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__26819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ValuedObjectTestExpression__Group_0__2__Impl6847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__36878 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__36881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl6908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__46938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ValuedObjectTestExpression__Group_0__4__Impl6966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group__0__Impl_in_rule__ValuedObjectReference__Group__07007 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group__1_in_rule__ValuedObjectReference__Group__07010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__ValuedObjectAssignment_0_in_rule__ValuedObjectReference__Group__0__Impl7037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group__1__Impl_in_rule__ValuedObjectReference__Group__17067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group_1__0_in_rule__ValuedObjectReference__Group__1__Impl7094 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group_1__0__Impl_in_rule__ValuedObjectReference__Group_1__07129 = new BitSet(new long[]{0x00000004222903E0L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group_1__1_in_rule__ValuedObjectReference__Group_1__07132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ValuedObjectReference__Group_1__0__Impl7160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group_1__1__Impl_in_rule__ValuedObjectReference__Group_1__17191 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group_1__2_in_rule__ValuedObjectReference__Group_1__17194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__IndicesAssignment_1_1_in_rule__ValuedObjectReference__Group_1__1__Impl7221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__Group_1__2__Impl_in_rule__ValuedObjectReference__Group_1__27251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ValuedObjectReference__Group_1__2__Impl7279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__07316 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__07319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__FunctionCall__Group__0__Impl7347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__17378 = new BitSet(new long[]{0x0000000480000000L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__17381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__FunctionNameAssignment_1_in_rule__FunctionCall__Group__1__Impl7408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__27438 = new BitSet(new long[]{0x0000000480000000L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__27441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2__0_in_rule__FunctionCall__Group__2__Impl7468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__37499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__FunctionCall__Group__3__Impl7527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2__0__Impl_in_rule__FunctionCall__Group_2__07566 = new BitSet(new long[]{0x00000004222D03E0L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2__1_in_rule__FunctionCall__Group_2__07569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__FunctionCall__Group_2__0__Impl7597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2__1__Impl_in_rule__FunctionCall__Group_2__17628 = new BitSet(new long[]{0x0000004800000000L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2__2_in_rule__FunctionCall__Group_2__17631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__ParametersAssignment_2_1_in_rule__FunctionCall__Group_2__1__Impl7658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2__2__Impl_in_rule__FunctionCall__Group_2__27688 = new BitSet(new long[]{0x0000004800000000L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2__3_in_rule__FunctionCall__Group_2__27691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_2__0_in_rule__FunctionCall__Group_2__2__Impl7718 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2__3__Impl_in_rule__FunctionCall__Group_2__37749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__FunctionCall__Group_2__3__Impl7777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_2__0__Impl_in_rule__FunctionCall__Group_2_2__07816 = new BitSet(new long[]{0x00000004222D03E0L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_2__1_in_rule__FunctionCall__Group_2_2__07819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__FunctionCall__Group_2_2__0__Impl7847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__Group_2_2__1__Impl_in_rule__FunctionCall__Group_2_2__17878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FunctionCall__ParametersAssignment_2_2_1_in_rule__FunctionCall__Group_2_2__1__Impl7905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__07939 = new BitSet(new long[]{0x00000004222D03E0L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__07942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__CallByReferenceAssignment_0_in_rule__Parameter__Group__0__Impl7969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__18000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__ExpressionAssignment_1_in_rule__Parameter__Group__1__Impl8027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__08061 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__08064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__TagAnnotation__Group__0__Impl8092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__18123 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__18126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl8153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__28183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl8210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__08247 = new BitSet(new long[]{0x0000008800000400L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__08250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__TagAnnotation__Group_2__0__Impl8278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__18309 = new BitSet(new long[]{0x0000008800000400L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__18312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl8339 = new BitSet(new long[]{0x0000008000000402L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__28370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__TagAnnotation__Group_2__2__Impl8398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__08435 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__08438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__KeyStringValueAnnotation__Group__0__Impl8466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__18497 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__18500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl8527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__28557 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__28560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl8587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__38617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl8644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__08683 = new BitSet(new long[]{0x0000008800000400L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__08686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyStringValueAnnotation__Group_3__0__Impl8714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__18745 = new BitSet(new long[]{0x0000008800000400L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__18748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl8775 = new BitSet(new long[]{0x0000008000000402L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__28806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyStringValueAnnotation__Group_3__2__Impl8834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__08871 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__08874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl8902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__18933 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__18936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl8963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__28993 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__28996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl9024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__39055 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__39058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl9085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__49115 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__49118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl9146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__59177 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__59180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl9207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__69237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl9264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__09309 = new BitSet(new long[]{0x0000008800000400L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__09312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl9340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__19371 = new BitSet(new long[]{0x0000008800000400L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__19374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl9401 = new BitSet(new long[]{0x0000008000000402L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__29432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl9460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__09497 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__09500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__KeyBooleanValueAnnotation__Group__0__Impl9528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__19559 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__19562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl9589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__29619 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__29622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl9649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__39679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl9706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__09745 = new BitSet(new long[]{0x0000008800000400L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__09748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl9776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__19807 = new BitSet(new long[]{0x0000008800000400L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__19810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl9837 = new BitSet(new long[]{0x0000008000000402L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__29868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl9896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__09933 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__09936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__KeyIntValueAnnotation__Group__0__Impl9964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__19995 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__19998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl10025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__210055 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__210058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl10085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__310115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl10142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__010181 = new BitSet(new long[]{0x0000008800000400L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__010184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyIntValueAnnotation__Group_3__0__Impl10212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__110243 = new BitSet(new long[]{0x0000008800000400L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__110246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl10273 = new BitSet(new long[]{0x0000008000000402L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__210304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyIntValueAnnotation__Group_3__2__Impl10332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__010369 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__010372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__KeyFloatValueAnnotation__Group__0__Impl10400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__110431 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__110434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl10461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__210491 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__210494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl10521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__310551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl10578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__010617 = new BitSet(new long[]{0x0000008800000400L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__010620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl10648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__110679 = new BitSet(new long[]{0x0000008800000400L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__110682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl10709 = new BitSet(new long[]{0x0000008000000402L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__210740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl10768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__010806 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__010809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl10836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__110865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl10892 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__010927 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__010930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__ExtendedID__Group_1__0__Impl10958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__110989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl11016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__OperatorAlternatives_1_0_1_0_in_rule__OrAndExpression__OperatorAssignment_1_0_111054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__OrAndExpression__SubExpressionsAssignment_1_0_211087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__OperatorAlternatives_1_1_1_0_in_rule__OrAndExpression__OperatorAssignment_1_1_111118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__OrAndExpression__SubExpressionsAssignment_1_1_211151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_111182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_211213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_111244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_211275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_111306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_211337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_111368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_211399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_111430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_rule__MultExpression__SubExpressionsAssignment_1_211461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_1_111492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__DivExpression__SubExpressionsAssignment_1_211523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_111554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_211585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_rule__NegExpression__OperatorAssignment_0_111616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_rule__NegExpression__SubExpressionsAssignment_0_211647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_111678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_311711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment_011746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__ValuedObjectReference__IndicesAssignment_1_111781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionCall__FunctionNameAssignment_111812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__FunctionCall__ParametersAssignment_2_111843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__FunctionCall__ParametersAssignment_2_2_111874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Parameter__CallByReferenceAssignment_011910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Parameter__ExpressionAssignment_111949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_rule__TextExpression__TextAssignment11980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment12011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment12042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BoolValue__ValueAssignment12073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment12104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_112135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_112166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_112197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_212228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_112259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_112290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_312321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_512352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_112383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_112414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_212445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_112476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_112507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_212538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_112569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_112600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_212631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_112662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred1_InternalKExpressions2629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrAndExpression__Group_1_0__0_in_synpred3_InternalKExpressions2678 = new BitSet(new long[]{0x0000000004020002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_synpred7_InternalKExpressions2829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred8_InternalKExpressions2879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_synpred17_InternalKExpressions3163 = new BitSet(new long[]{0x0000000000000002L});
    }


}