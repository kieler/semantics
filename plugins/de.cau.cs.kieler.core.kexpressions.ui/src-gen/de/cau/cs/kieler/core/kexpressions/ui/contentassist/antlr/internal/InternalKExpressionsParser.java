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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'mod'", "'/'", "'val'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'('", "')'", "'@'", "'['", "']'", "'.'"
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


    // $ANTLR start "entryRuleBooleanExpression"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:117:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:118:1: ( ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:119:1: ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression186);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanExpression193); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:126:1: ruleBooleanExpression : ( ruleOrExpression ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:130:2: ( ( ruleOrExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:131:1: ( ruleOrExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:131:1: ( ruleOrExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:132:1: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleBooleanExpression219);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:602:1: ruleTextExpression : ( ( rule__TextExpression__Group__0 ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:606:2: ( ( ( rule__TextExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:607:1: ( ( rule__TextExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:607:1: ( ( rule__TextExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:608:1: ( rule__TextExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:609:1: ( rule__TextExpression__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:609:2: rule__TextExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__0_in_ruleTextExpression1237);
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


    // $ANTLR start "entryRuleBooleanValue"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:677:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:678:1: ( ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:679:1: ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1384);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue1391); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:686:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:690:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:691:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:691:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:692:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:693:1: ( rule__BooleanValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:693:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1417);
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


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:707:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:708:1: ( ruleAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:709:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation1446);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation1453); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:716:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:720:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:721:1: ( ( rule__Annotation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:721:1: ( ( rule__Annotation__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:722:1: ( rule__Annotation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:723:1: ( rule__Annotation__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:723:2: rule__Annotation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1479);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:737:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:738:1: ( ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:739:1: ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1508);
            ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation1515); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:746:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValueAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:750:2: ( ( ( rule__CommentAnnotation__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:751:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:751:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:752:1: ( rule__CommentAnnotation__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:753:1: ( rule__CommentAnnotation__ValueAssignment )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:753:2: rule__CommentAnnotation__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1541);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:765:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:766:1: ( ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:767:1: ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation1568);
            ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation1575); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:774:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:778:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:779:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:779:1: ( ( rule__TagAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:780:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:781:1: ( rule__TagAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:781:2: rule__TagAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation1601);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:793:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:794:1: ( ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:795:1: ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation1628);
            ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation1635); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:802:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:806:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:807:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:807:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:808:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:809:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:809:2: rule__KeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation1661);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:821:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:822:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:823:1: ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation1688);
            ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation1695); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:830:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:834:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:835:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:835:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:836:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:837:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:837:2: rule__TypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation1721);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:849:1: entryRuleKeyBooleanValueAnnotation : ruleKeyBooleanValueAnnotation EOF ;
    public final void entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:850:1: ( ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:851:1: ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation1748);
            ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation1755); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:858:1: ruleKeyBooleanValueAnnotation : ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyBooleanValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:862:2: ( ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:863:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:863:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:864:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:865:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:865:2: rule__KeyBooleanValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation1781);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:877:1: entryRuleKeyIntValueAnnotation : ruleKeyIntValueAnnotation EOF ;
    public final void entryRuleKeyIntValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:878:1: ( ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:879:1: ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation1808);
            ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation1815); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:886:1: ruleKeyIntValueAnnotation : ( ( rule__KeyIntValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyIntValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:890:2: ( ( ( rule__KeyIntValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:891:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:891:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:892:1: ( rule__KeyIntValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:893:1: ( rule__KeyIntValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:893:2: rule__KeyIntValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation1841);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:905:1: entryRuleKeyFloatValueAnnotation : ruleKeyFloatValueAnnotation EOF ;
    public final void entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:906:1: ( ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:907:1: ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1868);
            ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1875); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:914:1: ruleKeyFloatValueAnnotation : ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyFloatValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:918:2: ( ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:919:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:919:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:920:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:921:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:921:2: rule__KeyFloatValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation1901);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:935:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:936:1: ( ruleEString EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:937:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1930);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1937); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:944:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:948:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:949:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:949:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:950:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:951:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:951:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString1963);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:963:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:964:1: ( ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:965:1: ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID1990);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID1997); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:972:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:976:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:977:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:977:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:978:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:979:1: ( rule__ExtendedID__Group__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:979:2: rule__ExtendedID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID2023);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:992:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:996:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:997:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:997:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:998:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:999:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:999:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator2060);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1011:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1015:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1016:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1016:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1017:1: ( 'pre' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1018:1: ( 'pre' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1018:3: 'pre'
            {
            match(input,16,FollowSets000.FOLLOW_16_in_rulePreOperator2097); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1031:1: ruleOrOperator : ( ( 'or' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1035:1: ( ( ( 'or' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1036:1: ( ( 'or' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1036:1: ( ( 'or' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1037:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1038:1: ( 'or' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1038:3: 'or'
            {
            match(input,17,FollowSets000.FOLLOW_17_in_ruleOrOperator2136); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1051:1: ruleAndOperator : ( ( 'and' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1055:1: ( ( ( 'and' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1056:1: ( ( 'and' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1056:1: ( ( 'and' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1057:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1058:1: ( 'and' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1058:3: 'and'
            {
            match(input,18,FollowSets000.FOLLOW_18_in_ruleAndOperator2175); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1071:1: ruleNotOperator : ( ( 'not' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1075:1: ( ( ( 'not' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1076:1: ( ( 'not' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1076:1: ( ( 'not' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1077:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1078:1: ( 'not' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1078:3: 'not'
            {
            match(input,19,FollowSets000.FOLLOW_19_in_ruleNotOperator2214); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1091:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1095:1: ( ( ( '+' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1096:1: ( ( '+' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1096:1: ( ( '+' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1097:1: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1098:1: ( '+' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1098:3: '+'
            {
            match(input,20,FollowSets000.FOLLOW_20_in_ruleAddOperator2253); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1111:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1115:1: ( ( ( '-' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1116:1: ( ( '-' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1116:1: ( ( '-' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1117:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1118:1: ( '-' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1118:3: '-'
            {
            match(input,21,FollowSets000.FOLLOW_21_in_ruleSubOperator2292); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1131:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1135:1: ( ( ( '*' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1136:1: ( ( '*' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1136:1: ( ( '*' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1137:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1138:1: ( '*' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1138:3: '*'
            {
            match(input,22,FollowSets000.FOLLOW_22_in_ruleMultOperator2331); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1151:1: ruleModOperator : ( ( 'mod' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1155:1: ( ( ( 'mod' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1156:1: ( ( 'mod' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1156:1: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1157:1: ( 'mod' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1158:1: ( 'mod' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1158:3: 'mod'
            {
            match(input,23,FollowSets000.FOLLOW_23_in_ruleModOperator2370); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1171:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1175:1: ( ( ( '/' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1176:1: ( ( '/' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1176:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1177:1: ( '/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1178:1: ( '/' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1178:3: '/'
            {
            match(input,24,FollowSets000.FOLLOW_24_in_ruleDivOperator2409); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1191:1: ruleValOperator : ( ( 'val' ) ) ;
    public final void ruleValOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1195:1: ( ( ( 'val' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1196:1: ( ( 'val' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1196:1: ( ( 'val' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1197:1: ( 'val' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1198:1: ( 'val' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1198:3: 'val'
            {
            match(input,25,FollowSets000.FOLLOW_25_in_ruleValOperator2448); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1214:1: rule__Expression__Alternatives : ( ( ( ruleBooleanExpression ) ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1218:1: ( ( ( ruleBooleanExpression ) ) | ( ruleValuedExpression ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1219:1: ( ( ruleBooleanExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1219:1: ( ( ruleBooleanExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1220:1: ( ruleBooleanExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1221:1: ( ruleBooleanExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1221:3: ruleBooleanExpression
                    {
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2490);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1225:6: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1225:6: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1226:1: ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2508);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1236:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );
    public final void rule__CompareOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1240:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1241:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1241:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1242:1: ( rule__CompareOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1243:1: ( rule__CompareOperation__Group_0__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1243:2: rule__CompareOperation__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives2540);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1247:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1247:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1248:1: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2558);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1258:1: rule__NotOrValuedExpression__Alternatives : ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1262:1: ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1263:1: ( ( ruleValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1263:1: ( ( ruleValuedExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1264:1: ( ruleValuedExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1265:1: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1265:3: ruleValuedExpression
                    {
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2591);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1269:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1269:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1270:1: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2609);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1280:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1284:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1285:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1285:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1286:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1287:1: ( rule__NotExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1287:2: rule__NotExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2641);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1291:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1291:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1292:1: ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2659);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1302:1: rule__NegExpression__Alternatives : ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) );
    public final void rule__NegExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1306:1: ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) )
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1307:1: ( ( rule__NegExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1307:1: ( ( rule__NegExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1308:1: ( rule__NegExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1309:1: ( rule__NegExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1309:2: rule__NegExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__0_in_rule__NegExpression__Alternatives2691);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1313:6: ( ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1313:6: ( ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1314:1: ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__NegExpression__Alternatives2709);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1324:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1328:1: ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) )
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1329:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1329:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1330:1: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives2741);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1335:6: ( ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1335:6: ( ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1336:1: ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives2758);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1341:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1341:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1342:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1343:1: ( rule__AtomicExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1343:2: rule__AtomicExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2775);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1347:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1347:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1348:1: ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives2793);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1358:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1362:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) )
            int alt7=4;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1363:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1363:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1364:1: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2825);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1369:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1369:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1370:1: ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2842);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1375:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1375:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1376:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1377:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1377:2: rule__AtomicValuedExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_rule__AtomicValuedExpression__Alternatives2859);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1381:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1381:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1382:1: ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives2877);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1392:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1396:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) )
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1397:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1397:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1398:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1399:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1399:2: rule__ValuedObjectTestExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives2909);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1403:6: ( ruleValuedObjectReference )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1403:6: ( ruleValuedObjectReference )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1404:1: ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives2927);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1414:1: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 : ( ( rulePreOperator ) | ( ruleValOperator ) );
    public final void rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1418:1: ( ( rulePreOperator ) | ( ruleValOperator ) )
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1419:1: ( rulePreOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1419:1: ( rulePreOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1420:1: rulePreOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_02959);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1425:6: ( ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1425:6: ( ruleValOperator )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1426:1: ruleValOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_02976);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1437:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1441:1: ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) )
            int alt10=7;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1442:1: ( ruleCommentAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1442:1: ( ruleCommentAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1443:1: ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives3009);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1448:6: ( ruleTagAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1448:6: ( ruleTagAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1449:1: ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives3026);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1454:6: ( ruleKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1454:6: ( ruleKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1455:1: ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives3043);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1460:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1460:6: ( ruleTypedKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1461:1: ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives3060);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1466:6: ( ruleKeyBooleanValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1466:6: ( ruleKeyBooleanValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1467:1: ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives3077);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1472:6: ( ruleKeyIntValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1472:6: ( ruleKeyIntValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1473:1: ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives3094);
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1478:6: ( ruleKeyFloatValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1478:6: ( ruleKeyFloatValueAnnotation )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1479:1: ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives3111);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1490:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1494:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1495:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1495:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1496:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives3144); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1501:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1501:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1502:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives3161); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1512:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1516:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
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
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1517:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1517:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1518:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1519:1: ( '=' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1519:3: '='
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__CompareOperator__Alternatives3194); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1524:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1524:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1525:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1526:1: ( '<' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1526:3: '<'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__CompareOperator__Alternatives3215); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1531:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1531:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1532:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1533:1: ( '<=' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1533:3: '<='
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__CompareOperator__Alternatives3236); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1538:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1538:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1539:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1540:1: ( '>' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1540:3: '>'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__CompareOperator__Alternatives3257); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1545:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1545:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1546:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1547:1: ( '>=' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1547:3: '>='
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__CompareOperator__Alternatives3278); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1552:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1552:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1553:1: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1554:1: ( '<>' )
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1554:3: '<>'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__CompareOperator__Alternatives3299); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1568:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1572:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1573:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__03334);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__03337);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1580:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1584:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1585:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1585:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1586:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl3364);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1597:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1601:1: ( rule__OrExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1602:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__13393);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1608:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1612:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1613:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1613:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1614:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1615:1: ( rule__OrExpression__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1615:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl3420);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1629:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1633:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1634:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__03455);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__03458);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1641:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1645:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1646:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1646:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1647:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1648:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1650:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1660:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1664:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1665:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__13516);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__13519);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1672:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1676:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1677:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1677:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1678:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1679:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1679:2: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl3546);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1689:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1693:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1694:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__23576);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1700:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1704:1: ( ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1705:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1705:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1706:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1707:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1707:2: rule__OrExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl3603);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1723:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1727:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1728:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__03639);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__03642);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1735:1: rule__AndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1739:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1740:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1740:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1741:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl3669);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1752:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1756:1: ( rule__AndExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1757:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__13698);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1763:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1767:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1768:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1768:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1769:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1770:1: ( rule__AndExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1770:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl3725);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1784:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1788:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1789:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__03760);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__03763);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1796:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1800:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1801:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1801:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1802:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1803:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1805:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1815:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1819:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1820:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__13821);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__13824);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1827:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1831:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1832:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1832:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1833:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1834:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1834:2: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl3851);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1844:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1848:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1849:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__23881);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1855:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1859:1: ( ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1860:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1860:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1861:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1862:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1862:2: rule__AndExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl3908);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1878:1: rule__CompareOperation__Group_0__0 : rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 ;
    public final void rule__CompareOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1882:1: ( rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1883:2: rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__03944);
            rule__CompareOperation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__03947);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1890:1: rule__CompareOperation__Group_0__0__Impl : ( ( ruleNotOrValuedExpression ) ) ;
    public final void rule__CompareOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1894:1: ( ( ( ruleNotOrValuedExpression ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1895:1: ( ( ruleNotOrValuedExpression ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1895:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1896:1: ( ruleNotOrValuedExpression )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1897:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1897:3: ruleNotOrValuedExpression
            {
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl3975);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1907:1: rule__CompareOperation__Group_0__1 : rule__CompareOperation__Group_0__1__Impl ;
    public final void rule__CompareOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1911:1: ( rule__CompareOperation__Group_0__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1912:2: rule__CompareOperation__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__14005);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1918:1: rule__CompareOperation__Group_0__1__Impl : ( ( rule__CompareOperation__Group_0_1__0 ) ) ;
    public final void rule__CompareOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1922:1: ( ( ( rule__CompareOperation__Group_0_1__0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1923:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1923:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1924:1: ( rule__CompareOperation__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1925:1: ( rule__CompareOperation__Group_0_1__0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1925:2: rule__CompareOperation__Group_0_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl4032);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1939:1: rule__CompareOperation__Group_0_1__0 : rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 ;
    public final void rule__CompareOperation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1943:1: ( rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1944:2: rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__04066);
            rule__CompareOperation__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__04069);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1951:1: rule__CompareOperation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1955:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1956:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1956:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1957:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1958:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1960:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1970:1: rule__CompareOperation__Group_0_1__1 : rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 ;
    public final void rule__CompareOperation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1974:1: ( rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1975:2: rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__14127);
            rule__CompareOperation__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__14130);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1982:1: rule__CompareOperation__Group_0_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__CompareOperation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1986:1: ( ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1987:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1987:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1988:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_0_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1989:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1989:2: rule__CompareOperation__OperatorAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl4157);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1999:1: rule__CompareOperation__Group_0_1__2 : rule__CompareOperation__Group_0_1__2__Impl ;
    public final void rule__CompareOperation__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2003:1: ( rule__CompareOperation__Group_0_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2004:2: rule__CompareOperation__Group_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__24187);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2010:1: rule__CompareOperation__Group_0_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) ;
    public final void rule__CompareOperation__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2014:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2015:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2015:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2016:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_0_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2017:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2017:2: rule__CompareOperation__SubExpressionsAssignment_0_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl4214);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2033:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2037:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2038:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__04250);
            rule__NotExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__04253);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2045:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2049:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2050:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2050:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2051:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2052:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2054:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2064:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2068:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2069:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__14311);
            rule__NotExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__14314);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2076:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2080:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2081:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2081:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2082:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2083:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2083:2: rule__NotExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl4341);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2093:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2097:1: ( rule__NotExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2098:2: rule__NotExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__24371);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2104:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2108:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2109:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2109:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2110:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2111:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2111:2: rule__NotExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl4398);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2127:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2131:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2132:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__04434);
            rule__AddExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__04437);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2139:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2143:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2144:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2144:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2145:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl4464);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2156:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2160:1: ( rule__AddExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2161:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__14493);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2167:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2171:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2172:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2172:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2173:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2174:1: ( rule__AddExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2174:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl4520);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2188:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2192:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2193:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__04555);
            rule__AddExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__04558);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2200:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2204:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2205:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2205:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2206:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2207:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2209:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2219:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2223:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2224:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__14616);
            rule__AddExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__14619);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2231:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2235:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2236:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2236:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2237:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2238:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2238:2: rule__AddExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl4646);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2248:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2252:1: ( rule__AddExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2253:2: rule__AddExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__24676);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2259:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2263:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2264:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2264:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2265:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2266:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2266:2: rule__AddExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl4703);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2282:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2286:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2287:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__04739);
            rule__SubExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__04742);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2294:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2298:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2299:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2299:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2300:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl4769);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2311:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2315:1: ( rule__SubExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2316:2: rule__SubExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__14798);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2322:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2326:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2327:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2327:1: ( ( rule__SubExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2328:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2329:1: ( rule__SubExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2329:2: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl4825);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2343:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2347:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2348:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__04860);
            rule__SubExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__04863);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2355:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2359:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2360:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2360:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2361:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2362:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2364:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2374:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2378:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2379:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__14921);
            rule__SubExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__14924);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2386:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2390:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2391:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2391:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2392:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2393:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2393:2: rule__SubExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl4951);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2403:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2407:1: ( rule__SubExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2408:2: rule__SubExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__24981);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2414:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2418:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2419:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2419:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2420:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2421:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2421:2: rule__SubExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5008);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2437:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2441:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2442:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05044);
            rule__MultExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05047);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2449:1: rule__MultExpression__Group__0__Impl : ( ruleDivExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2453:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2454:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2454:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2455:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_rule__MultExpression__Group__0__Impl5074);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2466:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2470:1: ( rule__MultExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2471:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15103);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2477:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2481:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2482:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2482:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2483:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2484:1: ( rule__MultExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2484:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5130);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2498:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2502:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2503:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__05165);
            rule__MultExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__05168);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2510:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2514:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2515:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2515:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2516:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2517:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2519:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2529:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2533:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2534:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__15226);
            rule__MultExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__15229);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2541:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2545:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2546:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2546:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2547:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2548:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2548:2: rule__MultExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl5256);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2558:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2562:1: ( rule__MultExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2563:2: rule__MultExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__25286);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2569:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2573:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2574:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2574:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2575:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2576:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2576:2: rule__MultExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl5313);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2592:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2596:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2597:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__05349);
            rule__DivExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__05352);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2604:1: rule__DivExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2608:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2609:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2609:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2610:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__DivExpression__Group__0__Impl5379);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2621:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2625:1: ( rule__DivExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2626:2: rule__DivExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__15408);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2632:1: rule__DivExpression__Group__1__Impl : ( ( rule__DivExpression__Group_1__0 )? ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2636:1: ( ( ( rule__DivExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2637:1: ( ( rule__DivExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2637:1: ( ( rule__DivExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2638:1: ( rule__DivExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2639:1: ( rule__DivExpression__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2639:2: rule__DivExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__0_in_rule__DivExpression__Group__1__Impl5435);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2653:1: rule__DivExpression__Group_1__0 : rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 ;
    public final void rule__DivExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2657:1: ( rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2658:2: rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__0__Impl_in_rule__DivExpression__Group_1__05470);
            rule__DivExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__1_in_rule__DivExpression__Group_1__05473);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2665:1: rule__DivExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DivExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2669:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2670:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2670:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2671:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2672:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2674:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2684:1: rule__DivExpression__Group_1__1 : rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 ;
    public final void rule__DivExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2688:1: ( rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2689:2: rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__1__Impl_in_rule__DivExpression__Group_1__15531);
            rule__DivExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__2_in_rule__DivExpression__Group_1__15534);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2696:1: rule__DivExpression__Group_1__1__Impl : ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__DivExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2700:1: ( ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2701:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2701:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2702:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2703:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2703:2: rule__DivExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__OperatorAssignment_1_1_in_rule__DivExpression__Group_1__1__Impl5561);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2713:1: rule__DivExpression__Group_1__2 : rule__DivExpression__Group_1__2__Impl ;
    public final void rule__DivExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2717:1: ( rule__DivExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2718:2: rule__DivExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__2__Impl_in_rule__DivExpression__Group_1__25591);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2724:1: rule__DivExpression__Group_1__2__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2728:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2729:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2729:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2730:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2731:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2731:2: rule__DivExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__SubExpressionsAssignment_1_2_in_rule__DivExpression__Group_1__2__Impl5618);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2747:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2751:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2752:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__05654);
            rule__ModExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__05657);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2759:1: rule__ModExpression__Group__0__Impl : ( ruleNegExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2763:1: ( ( ruleNegExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2764:1: ( ruleNegExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2764:1: ( ruleNegExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2765:1: ruleNegExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_rule__ModExpression__Group__0__Impl5684);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2776:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2780:1: ( rule__ModExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2781:2: rule__ModExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__15713);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2787:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2791:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2792:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2792:1: ( ( rule__ModExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2793:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2794:1: ( rule__ModExpression__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2794:2: rule__ModExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl5740);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2808:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2812:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2813:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__05775);
            rule__ModExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__05778);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2820:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2824:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2825:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2825:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2826:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2827:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2829:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2839:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2843:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2844:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__15836);
            rule__ModExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__15839);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2851:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2855:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2856:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2856:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2857:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2858:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2858:2: rule__ModExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl5866);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2868:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2872:1: ( rule__ModExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2873:2: rule__ModExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__25896);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2879:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2883:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2884:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2884:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2885:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2886:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2886:2: rule__ModExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl5923);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2902:1: rule__NegExpression__Group_0__0 : rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 ;
    public final void rule__NegExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2906:1: ( rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2907:2: rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__0__Impl_in_rule__NegExpression__Group_0__05959);
            rule__NegExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__1_in_rule__NegExpression__Group_0__05962);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2914:1: rule__NegExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NegExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2918:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2919:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2919:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2920:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2921:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2923:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2933:1: rule__NegExpression__Group_0__1 : rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 ;
    public final void rule__NegExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2937:1: ( rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2938:2: rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__1__Impl_in_rule__NegExpression__Group_0__16020);
            rule__NegExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__2_in_rule__NegExpression__Group_0__16023);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2945:1: rule__NegExpression__Group_0__1__Impl : ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NegExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2949:1: ( ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2950:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2950:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2951:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2952:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2952:2: rule__NegExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__OperatorAssignment_0_1_in_rule__NegExpression__Group_0__1__Impl6050);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2962:1: rule__NegExpression__Group_0__2 : rule__NegExpression__Group_0__2__Impl ;
    public final void rule__NegExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2966:1: ( rule__NegExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2967:2: rule__NegExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__2__Impl_in_rule__NegExpression__Group_0__26080);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2973:1: rule__NegExpression__Group_0__2__Impl : ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NegExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2977:1: ( ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2978:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2978:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2979:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2980:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2980:2: rule__NegExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__SubExpressionsAssignment_0_2_in_rule__NegExpression__Group_0__2__Impl6107);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:2996:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3000:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3001:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__06143);
            rule__AtomicExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__06146);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3008:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3012:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3013:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3013:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3014:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__AtomicExpression__Group_2__0__Impl6174); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3027:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3031:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3032:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__16205);
            rule__AtomicExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__16208);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3039:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBooleanExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3043:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3044:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3044:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3045:1: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_2__1__Impl6235);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3056:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3060:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3061:2: rule__AtomicExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__26264);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3067:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3071:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3072:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3072:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3073:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__AtomicExpression__Group_2__2__Impl6292); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3092:1: rule__AtomicValuedExpression__Group_2__0 : rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 ;
    public final void rule__AtomicValuedExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3096:1: ( rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3097:2: rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__06329);
            rule__AtomicValuedExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__06332);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3104:1: rule__AtomicValuedExpression__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__AtomicValuedExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3108:1: ( ( ( '(' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3109:1: ( ( '(' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3109:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3110:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3111:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3112:2: '('
            {
            match(input,32,FollowSets000.FOLLOW_32_in_rule__AtomicValuedExpression__Group_2__0__Impl6361); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3123:1: rule__AtomicValuedExpression__Group_2__1 : rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 ;
    public final void rule__AtomicValuedExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3127:1: ( rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3128:2: rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__16393);
            rule__AtomicValuedExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__16396);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3135:1: rule__AtomicValuedExpression__Group_2__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3139:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3140:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3140:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3141:1: ruleValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl6423);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3152:1: rule__AtomicValuedExpression__Group_2__2 : rule__AtomicValuedExpression__Group_2__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3156:1: ( rule__AtomicValuedExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3157:2: rule__AtomicValuedExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__26452);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3163:1: rule__AtomicValuedExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3167:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3168:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3168:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3169:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__AtomicValuedExpression__Group_2__2__Impl6480); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3188:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3192:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3193:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__06517);
            rule__ValuedObjectTestExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__06520);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3200:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3204:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3205:1: ( () )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3205:1: ( () )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3206:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3207:1: ()
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3209:1: 
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3219:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3223:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3224:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__16578);
            rule__ValuedObjectTestExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__16581);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3231:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3235:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3236:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3236:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3237:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3238:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3238:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl6608);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3248:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3252:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3253:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__26638);
            rule__ValuedObjectTestExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__26641);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3260:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3264:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3265:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3265:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3266:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__ValuedObjectTestExpression__Group_0__2__Impl6669); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3279:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3283:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3284:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__36700);
            rule__ValuedObjectTestExpression__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__36703);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3291:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3295:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3296:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3296:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3297:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3298:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3298:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl6730);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3308:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3312:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3313:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__46760);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3319:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3323:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3324:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3324:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3325:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__ValuedObjectTestExpression__Group_0__4__Impl6788); if (state.failed) return ;
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


    // $ANTLR start "rule__TextExpression__Group__0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3348:1: rule__TextExpression__Group__0 : rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 ;
    public final void rule__TextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3352:1: ( rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3353:2: rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__06829);
            rule__TextExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__06832);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3360:1: rule__TextExpression__Group__0__Impl : ( ( rule__TextExpression__CodeAssignment_0 ) ) ;
    public final void rule__TextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3364:1: ( ( ( rule__TextExpression__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3365:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3365:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3366:1: ( rule__TextExpression__CodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3367:1: ( rule__TextExpression__CodeAssignment_0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3367:2: rule__TextExpression__CodeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl6859);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3377:1: rule__TextExpression__Group__1 : rule__TextExpression__Group__1__Impl ;
    public final void rule__TextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3381:1: ( rule__TextExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3382:2: rule__TextExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__16889);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3388:1: rule__TextExpression__Group__1__Impl : ( ( rule__TextExpression__Group_1__0 )? ) ;
    public final void rule__TextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3392:1: ( ( ( rule__TextExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3393:1: ( ( rule__TextExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3393:1: ( ( rule__TextExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3394:1: ( rule__TextExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3395:1: ( rule__TextExpression__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3395:2: rule__TextExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl6916);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3409:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3413:1: ( rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3414:2: rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__06951);
            rule__TextExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__06954);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3421:1: rule__TextExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3425:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3426:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3426:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3427:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__TextExpression__Group_1__0__Impl6982); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3440:1: rule__TextExpression__Group_1__1 : rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 ;
    public final void rule__TextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3444:1: ( rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3445:2: rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__17013);
            rule__TextExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__17016);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3452:1: rule__TextExpression__Group_1__1__Impl : ( ( rule__TextExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__TextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3456:1: ( ( ( rule__TextExpression__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3457:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3457:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3458:1: ( rule__TextExpression__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3459:1: ( rule__TextExpression__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3459:2: rule__TextExpression__TypeAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl7043);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3469:1: rule__TextExpression__Group_1__2 : rule__TextExpression__Group_1__2__Impl ;
    public final void rule__TextExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3473:1: ( rule__TextExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3474:2: rule__TextExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__27073);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3480:1: rule__TextExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3484:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3485:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3485:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3486:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__TextExpression__Group_1__2__Impl7101); if (state.failed) return ;
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


    // $ANTLR start "rule__TagAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3505:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3509:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3510:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__07138);
            rule__TagAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__07141);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3517:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3521:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3522:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3522:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3523:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__TagAnnotation__Group__0__Impl7169); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3536:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3540:1: ( rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3541:2: rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__17200);
            rule__TagAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__17203);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3548:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3552:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3553:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3553:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3554:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3555:1: ( rule__TagAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3555:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl7230);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3565:1: rule__TagAnnotation__Group__2 : rule__TagAnnotation__Group__2__Impl ;
    public final void rule__TagAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3569:1: ( rule__TagAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3570:2: rule__TagAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__27260);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3576:1: rule__TagAnnotation__Group__2__Impl : ( ( rule__TagAnnotation__Group_2__0 )? ) ;
    public final void rule__TagAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3580:1: ( ( ( rule__TagAnnotation__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3581:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3581:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3582:1: ( rule__TagAnnotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3583:1: ( rule__TagAnnotation__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3583:2: rule__TagAnnotation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl7287);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3599:1: rule__TagAnnotation__Group_2__0 : rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 ;
    public final void rule__TagAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3603:1: ( rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3604:2: rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__07324);
            rule__TagAnnotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__07327);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3611:1: rule__TagAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TagAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3615:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3616:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3616:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3617:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__TagAnnotation__Group_2__0__Impl7355); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3630:1: rule__TagAnnotation__Group_2__1 : rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 ;
    public final void rule__TagAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3634:1: ( rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3635:2: rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__17386);
            rule__TagAnnotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__17389);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3642:1: rule__TagAnnotation__Group_2__1__Impl : ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) ;
    public final void rule__TagAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3646:1: ( ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3647:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3647:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3648:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3649:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_COMMENT_ANNOTATION||LA22_0==34) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3649:2: rule__TagAnnotation__AnnotationsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl7416);
            	    rule__TagAnnotation__AnnotationsAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3659:1: rule__TagAnnotation__Group_2__2 : rule__TagAnnotation__Group_2__2__Impl ;
    public final void rule__TagAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3663:1: ( rule__TagAnnotation__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3664:2: rule__TagAnnotation__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__27447);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3670:1: rule__TagAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TagAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3674:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3675:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3675:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3676:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__TagAnnotation__Group_2__2__Impl7475); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3695:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3699:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3700:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__07512);
            rule__KeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__07515);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3707:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3711:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3712:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3712:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3713:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyStringValueAnnotation__Group__0__Impl7543); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3726:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3730:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3731:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__17574);
            rule__KeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__17577);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3738:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3742:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3743:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3743:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3744:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3745:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3745:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl7604);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3755:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3759:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3760:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__27634);
            rule__KeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__27637);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3767:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3771:1: ( ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3772:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3772:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3773:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3774:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3774:2: rule__KeyStringValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl7664);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3784:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3788:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3789:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__37694);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3795:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3799:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3800:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3800:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3801:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3802:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3802:2: rule__KeyStringValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl7721);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3820:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3824:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3825:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__07760);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__07763);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3832:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3836:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3837:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3837:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3838:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__KeyStringValueAnnotation__Group_3__0__Impl7791); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3851:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3855:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3856:2: rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__17822);
            rule__KeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__17825);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3863:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3867:1: ( ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3868:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3868:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3869:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3870:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_COMMENT_ANNOTATION||LA24_0==34) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3870:2: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl7852);
            	    rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3880:1: rule__KeyStringValueAnnotation__Group_3__2 : rule__KeyStringValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3884:1: ( rule__KeyStringValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3885:2: rule__KeyStringValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__27883);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3891:1: rule__KeyStringValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3895:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3896:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3896:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3897:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__KeyStringValueAnnotation__Group_3__2__Impl7911); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3916:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3920:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3921:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__07948);
            rule__TypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__07951);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3928:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3932:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3933:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3933:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3934:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl7979); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3947:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3951:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3952:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__18010);
            rule__TypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__18013);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3959:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3963:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3964:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3964:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3965:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3966:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3966:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl8040);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3976:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3980:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3981:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__28070);
            rule__TypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__28073);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3988:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3992:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3993:1: ( '[' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3993:1: ( '[' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:3994:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl8101); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4007:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4011:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4012:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__38132);
            rule__TypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__38135);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4019:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4023:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4024:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4024:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4025:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4026:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4026:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl8162);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4036:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4040:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4041:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__48192);
            rule__TypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__48195);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4048:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4052:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4053:1: ( ']' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4053:1: ( ']' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4054:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl8223); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4067:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4071:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4072:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__58254);
            rule__TypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__58257);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4079:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4083:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4084:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4084:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4085:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueAssignment_5()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4086:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4086:2: rule__TypedKeyStringValueAnnotation__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl8284);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4096:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4100:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4101:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__68314);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4107:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4111:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4112:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4112:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4113:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4114:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4114:2: rule__TypedKeyStringValueAnnotation__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl8341);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4138:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4142:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4143:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__08386);
            rule__TypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__08389);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4150:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4154:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4155:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4155:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4156:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl8417); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4169:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4173:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4174:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__18448);
            rule__TypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__18451);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4181:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4185:1: ( ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4186:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4186:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4187:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAssignment_6_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4188:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_COMMENT_ANNOTATION||LA26_0==34) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4188:2: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl8478);
            	    rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4198:1: rule__TypedKeyStringValueAnnotation__Group_6__2 : rule__TypedKeyStringValueAnnotation__Group_6__2__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4202:1: ( rule__TypedKeyStringValueAnnotation__Group_6__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4203:2: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__28509);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4209:1: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl : ( ')' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4213:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4214:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4214:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4215:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl8537); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4234:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4238:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4239:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__08574);
            rule__KeyBooleanValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__08577);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4246:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4250:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4251:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4251:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4252:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyBooleanValueAnnotation__Group__0__Impl8605); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4265:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4269:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4270:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__18636);
            rule__KeyBooleanValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__18639);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4277:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4281:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4282:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4282:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4283:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4284:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4284:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl8666);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4294:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4298:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4299:2: rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__28696);
            rule__KeyBooleanValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__28699);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4306:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4310:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4311:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4311:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4312:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4313:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4313:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl8726);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4323:1: rule__KeyBooleanValueAnnotation__Group__3 : rule__KeyBooleanValueAnnotation__Group__3__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4327:1: ( rule__KeyBooleanValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4328:2: rule__KeyBooleanValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__38756);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4334:1: rule__KeyBooleanValueAnnotation__Group__3__Impl : ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4338:1: ( ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4339:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4339:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4340:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4341:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4341:2: rule__KeyBooleanValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl8783);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4359:1: rule__KeyBooleanValueAnnotation__Group_3__0 : rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4363:1: ( rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4364:2: rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__08822);
            rule__KeyBooleanValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__08825);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4371:1: rule__KeyBooleanValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4375:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4376:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4376:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4377:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl8853); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4390:1: rule__KeyBooleanValueAnnotation__Group_3__1 : rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4394:1: ( rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4395:2: rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__18884);
            rule__KeyBooleanValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__18887);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4402:1: rule__KeyBooleanValueAnnotation__Group_3__1__Impl : ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4406:1: ( ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4407:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4407:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4408:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4409:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_COMMENT_ANNOTATION||LA28_0==34) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4409:2: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl8914);
            	    rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4419:1: rule__KeyBooleanValueAnnotation__Group_3__2 : rule__KeyBooleanValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4423:1: ( rule__KeyBooleanValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4424:2: rule__KeyBooleanValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__28945);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4430:1: rule__KeyBooleanValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4434:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4435:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4435:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4436:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl8973); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4455:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4459:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4460:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__09010);
            rule__KeyIntValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__09013);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4467:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4471:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4472:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4472:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4473:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyIntValueAnnotation__Group__0__Impl9041); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4486:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4490:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4491:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__19072);
            rule__KeyIntValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__19075);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4498:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4502:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4503:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4503:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4504:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4505:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4505:2: rule__KeyIntValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl9102);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4515:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4519:1: ( rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4520:2: rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__29132);
            rule__KeyIntValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__29135);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4527:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4531:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4532:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4532:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4533:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4534:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4534:2: rule__KeyIntValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl9162);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4544:1: rule__KeyIntValueAnnotation__Group__3 : rule__KeyIntValueAnnotation__Group__3__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4548:1: ( rule__KeyIntValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4549:2: rule__KeyIntValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__39192);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4555:1: rule__KeyIntValueAnnotation__Group__3__Impl : ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyIntValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4559:1: ( ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4560:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4560:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4561:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4562:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4562:2: rule__KeyIntValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl9219);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4580:1: rule__KeyIntValueAnnotation__Group_3__0 : rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 ;
    public final void rule__KeyIntValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4584:1: ( rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4585:2: rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__09258);
            rule__KeyIntValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__09261);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4592:1: rule__KeyIntValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4596:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4597:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4597:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4598:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__KeyIntValueAnnotation__Group_3__0__Impl9289); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4611:1: rule__KeyIntValueAnnotation__Group_3__1 : rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 ;
    public final void rule__KeyIntValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4615:1: ( rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4616:2: rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__19320);
            rule__KeyIntValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__19323);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4623:1: rule__KeyIntValueAnnotation__Group_3__1__Impl : ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4627:1: ( ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4628:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4628:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4629:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4630:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_COMMENT_ANNOTATION||LA30_0==34) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4630:2: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl9350);
            	    rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4640:1: rule__KeyIntValueAnnotation__Group_3__2 : rule__KeyIntValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4644:1: ( rule__KeyIntValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4645:2: rule__KeyIntValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__29381);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4651:1: rule__KeyIntValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4655:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4656:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4656:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4657:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__KeyIntValueAnnotation__Group_3__2__Impl9409); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4676:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4680:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4681:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__09446);
            rule__KeyFloatValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__09449);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4688:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4692:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4693:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4693:1: ( '@' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4694:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyFloatValueAnnotation__Group__0__Impl9477); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4707:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4711:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4712:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__19508);
            rule__KeyFloatValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__19511);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4719:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4723:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4724:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4724:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4725:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4726:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4726:2: rule__KeyFloatValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl9538);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4736:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4740:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4741:2: rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__29568);
            rule__KeyFloatValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__29571);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4748:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4752:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4753:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4753:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4754:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4755:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4755:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl9598);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4765:1: rule__KeyFloatValueAnnotation__Group__3 : rule__KeyFloatValueAnnotation__Group__3__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4769:1: ( rule__KeyFloatValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4770:2: rule__KeyFloatValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__39628);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4776:1: rule__KeyFloatValueAnnotation__Group__3__Impl : ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyFloatValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4780:1: ( ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4781:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4781:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4782:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4783:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4783:2: rule__KeyFloatValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl9655);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4801:1: rule__KeyFloatValueAnnotation__Group_3__0 : rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4805:1: ( rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4806:2: rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__09694);
            rule__KeyFloatValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__09697);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4813:1: rule__KeyFloatValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4817:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4818:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4818:1: ( '(' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4819:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl9725); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4832:1: rule__KeyFloatValueAnnotation__Group_3__1 : rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4836:1: ( rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4837:2: rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__19756);
            rule__KeyFloatValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__19759);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4844:1: rule__KeyFloatValueAnnotation__Group_3__1__Impl : ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4848:1: ( ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4849:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4849:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4850:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4851:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_COMMENT_ANNOTATION||LA32_0==34) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4851:2: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl9786);
            	    rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4861:1: rule__KeyFloatValueAnnotation__Group_3__2 : rule__KeyFloatValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4865:1: ( rule__KeyFloatValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4866:2: rule__KeyFloatValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__29817);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4872:1: rule__KeyFloatValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4876:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4877:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4877:1: ( ')' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4878:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl9845); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4898:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4902:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4903:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__09883);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__09886);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4910:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4914:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4915:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4915:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4916:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl9913); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4927:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4931:1: ( rule__ExtendedID__Group__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4932:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__19942);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4938:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4942:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4943:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4943:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4944:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4945:1: ( rule__ExtendedID__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==37) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4945:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl9969);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4959:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4963:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4964:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__010004);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__010007);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4971:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4975:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4976:1: ( '.' )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4976:1: ( '.' )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4977:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ExtendedID__Group_1__0__Impl10035); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4990:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4994:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:4995:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__110066);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5001:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5005:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5006:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5006:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5007:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl10093); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5023:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5027:1: ( ( ruleOrOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5028:1: ( ruleOrOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5028:1: ( ruleOrOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5029:1: ruleOrOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_110131);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5038:1: rule__OrExpression__SubExpressionsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5042:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5043:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5043:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5044:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_210162);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5053:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5057:1: ( ( ruleAndOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5058:1: ( ruleAndOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5058:1: ( ruleAndOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5059:1: ruleAndOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_110193);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5068:1: rule__AndExpression__SubExpressionsAssignment_1_2 : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5072:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5073:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5073:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5074:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_210224);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5083:1: rule__CompareOperation__OperatorAssignment_0_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5087:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5088:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5088:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5089:1: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_110255);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5098:1: rule__CompareOperation__SubExpressionsAssignment_0_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5102:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5103:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5103:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5104:1: ruleNotOrValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_210286);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5113:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5117:1: ( ( ruleNotOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5118:1: ( ruleNotOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5118:1: ( ruleNotOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5119:1: ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_110317);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5128:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5132:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5133:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5133:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5134:1: ruleNotExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_210348);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5143:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5147:1: ( ( ruleAddOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5148:1: ( ruleAddOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5148:1: ( ruleAddOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5149:1: ruleAddOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_110379);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5158:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5162:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5163:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5163:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5164:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_210410);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5173:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5177:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5178:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5178:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5179:1: ruleSubOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_110441);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5188:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5192:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5193:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5193:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5194:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_210472);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5203:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5207:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5208:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5208:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5209:1: ruleMultOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_110503);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5218:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5222:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5223:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5223:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5224:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_rule__MultExpression__SubExpressionsAssignment_1_210534);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5233:1: rule__DivExpression__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5237:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5238:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5238:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5239:1: ruleDivOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_1_110565);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5248:1: rule__DivExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5252:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5253:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5253:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5254:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__DivExpression__SubExpressionsAssignment_1_210596);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5263:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5267:1: ( ( ruleModOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5268:1: ( ruleModOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5268:1: ( ruleModOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5269:1: ruleModOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_110627);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5278:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5282:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5283:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5283:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5284:1: ruleAtomicValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_210658);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5293:1: rule__NegExpression__OperatorAssignment_0_1 : ( ruleSubOperator ) ;
    public final void rule__NegExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5297:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5298:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5298:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5299:1: ruleSubOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_rule__NegExpression__OperatorAssignment_0_110689);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5308:1: rule__NegExpression__SubExpressionsAssignment_0_2 : ( ruleNegExpression ) ;
    public final void rule__NegExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5312:1: ( ( ruleNegExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5313:1: ( ruleNegExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5313:1: ( ruleNegExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5314:1: ruleNegExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_rule__NegExpression__SubExpressionsAssignment_0_210720);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5323:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5327:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5328:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5328:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5329:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAlternatives_0_1_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5330:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5330:2: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_110751);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5339:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5343:1: ( ( ruleValuedObjectTestExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5344:1: ( ruleValuedObjectTestExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5344:1: ( ruleValuedObjectTestExpression )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5345:1: ruleValuedObjectTestExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_310784);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5354:1: rule__ValuedObjectReference__ValuedObjectAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5358:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5359:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5359:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5360:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5361:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5362:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment10819); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5373:1: rule__TextExpression__CodeAssignment_0 : ( RULE_HOSTCODE ) ;
    public final void rule__TextExpression__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5377:1: ( ( RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5378:1: ( RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5378:1: ( RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5379:1: RULE_HOSTCODE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeHOSTCODETerminalRuleCall_0_0()); 
            }
            match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_rule__TextExpression__CodeAssignment_010854); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5388:1: rule__TextExpression__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5392:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5393:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5393:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5394:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_110885); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5403:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5407:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5408:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5408:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5409:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment10916); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5418:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5422:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5423:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5423:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5424:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment10947); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5433:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5437:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5438:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5438:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5439:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment10978); if (state.failed) return ;
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


    // $ANTLR start "rule__CommentAnnotation__ValueAssignment"
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5448:1: rule__CommentAnnotation__ValueAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5452:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5453:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5453:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5454:1: RULE_COMMENT_ANNOTATION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment11009); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5463:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5467:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5468:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5468:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5469:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_111040);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5478:1: rule__TagAnnotation__AnnotationsAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__TagAnnotation__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5482:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5483:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5483:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5484:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_111071);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5493:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5497:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5498:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5498:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5499:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_111102);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5508:1: rule__KeyStringValueAnnotation__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5512:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5513:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5513:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5514:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_211133);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5523:1: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5527:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5528:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5528:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5529:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_111164);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5538:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5542:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5543:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5543:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5544:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_111195);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5553:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5557:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5558:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5558:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5559:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_311226);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5568:1: rule__TypedKeyStringValueAnnotation__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5572:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5573:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5573:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5574:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_511257);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5583:1: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 : ( ruleAnnotation ) ;
    public final void rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5587:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5588:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5588:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5589:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_111288);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5598:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5602:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5603:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5603:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5604:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_111319);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5613:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5617:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5618:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5618:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5619:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_211350); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5628:1: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5632:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5633:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5633:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5634:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_111381);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5643:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5647:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5648:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5648:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5649:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_111412);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5658:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5662:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5663:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5663:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5664:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_211443); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5673:1: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5677:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5678:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5678:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5679:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_111474);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5688:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5692:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5693:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5693:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5694:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_111505);
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5703:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5707:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5708:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5708:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5709:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFLOATTerminalRuleCall_2_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_211536); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5718:1: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5722:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5723:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5723:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:5724:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_111567);
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
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1219:1: ( ( ( ruleBooleanExpression ) ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1219:1: ( ( ruleBooleanExpression ) )
        {
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1219:1: ( ( ruleBooleanExpression ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1220:1: ( ruleBooleanExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
        }
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1221:1: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1221:3: ruleBooleanExpression
        {
        pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_synpred1_InternalKExpressions2490);
        ruleBooleanExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalKExpressions

    // $ANTLR start synpred2_InternalKExpressions
    public final void synpred2_InternalKExpressions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1241:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1241:1: ( ( rule__CompareOperation__Group_0__0 ) )
        {
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1241:1: ( ( rule__CompareOperation__Group_0__0 ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1242:1: ( rule__CompareOperation__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
        }
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1243:1: ( rule__CompareOperation__Group_0__0 )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1243:2: rule__CompareOperation__Group_0__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0_in_synpred2_InternalKExpressions2540);
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
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1263:1: ( ( ( ruleValuedExpression ) ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1263:1: ( ( ruleValuedExpression ) )
        {
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1263:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1264:1: ( ruleValuedExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1265:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1265:3: ruleValuedExpression
        {
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred3_InternalKExpressions2591);
        ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalKExpressions

    // $ANTLR start synpred11_InternalKExpressions
    public final void synpred11_InternalKExpressions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1375:6: ( ( ( rule__AtomicValuedExpression__Group_2__0 ) ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1375:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        {
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1375:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1376:1: ( rule__AtomicValuedExpression__Group_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
        }
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1377:1: ( rule__AtomicValuedExpression__Group_2__0 )
        // ../de.cau.cs.kieler.core.kexpressions.ui/src-gen/de/cau/cs/kieler/core/kexpressions/ui/contentassist/antlr/internal/InternalKExpressions.g:1377:2: rule__AtomicValuedExpression__Group_2__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_synpred11_InternalKExpressions2859);
        rule__AtomicValuedExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11_InternalKExpressions

    // Delegated rules

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
        "\12\uffff\1\1\1\2";
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
            return "1214:1: rule__Expression__Alternatives : ( ( ( ruleBooleanExpression ) ) | ( ruleValuedExpression ) );";
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
                        if ( (synpred1_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 10;}

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
            return "1236:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );";
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
            return "1258:1: rule__NotOrValuedExpression__Alternatives : ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) );";
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
        "\12\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\5\2\uffff\1\0\6\uffff";
    static final String DFA7_maxS =
        "\1\40\2\uffff\1\0\6\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\4\uffff\1\3";
    static final String DFA7_specialS =
        "\3\uffff\1\0\6\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\4\1\1\1\2\1\4\6\uffff\1\4\10\uffff\1\4\6\uffff\1\3",
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
            return "1358:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKExpressions()) ) {s = 9;}

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
        "\3\uffff\1\11\7\uffff\1\11";
    static final String DFA10_minS =
        "\1\12\1\uffff\1\5\1\4\1\5\6\uffff\1\4";
    static final String DFA10_maxS =
        "\1\42\1\uffff\1\5\1\45\1\5\6\uffff\1\45";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\3\uffff\1\6\1\5\1\7\1\4\1\2\1\3\1\uffff";
    static final String DFA10_specialS =
        "\14\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\27\uffff\1\2",
            "",
            "\1\3",
            "\2\12\1\uffff\1\5\1\7\1\6\1\11\25\uffff\3\11\1\10\1\uffff"+
            "\1\4",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\12\1\uffff\1\5\1\7\1\6\1\11\25\uffff\3\11\1\10\1\uffff"+
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
            return "1437:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoot74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleRoot100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression126 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression186 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleBooleanExpression219 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_rule__TextExpression__Group__0_in_ruleTextExpression1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1264 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1324 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1446 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1508 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation1515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation1568 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation1575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation1601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation1628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation1635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation1661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation1688 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation1695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation1721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation1748 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation1755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation1781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation1808 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation1815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation1841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1868 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation1901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1930 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID1990 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID1997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID2023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator2060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulePreOperator2097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleOrOperator2136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleAndOperator2175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleNotOperator2214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAddOperator2253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleSubOperator2292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleMultOperator2331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleModOperator2370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleDivOperator2409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleValOperator2448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives2540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__0_in_rule__NegExpression__Alternatives2691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__NegExpression__Alternatives2709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives2741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives2758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives2793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_rule__AtomicValuedExpression__Alternatives2859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives2877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives2909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives2927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_02959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_02976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives3009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives3026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives3043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives3060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives3077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives3094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives3111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives3144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives3161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__CompareOperator__Alternatives3194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CompareOperator__Alternatives3215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CompareOperator__Alternatives3236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CompareOperator__Alternatives3257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__CompareOperator__Alternatives3278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__CompareOperator__Alternatives3299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__03334 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__03337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__13393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl3420 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__03455 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__03458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__13516 = new BitSet(new long[]{0x00000001022903E0L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__13519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl3546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__23576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__03639 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__03642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl3669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__13698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl3725 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__03760 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__03763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__13821 = new BitSet(new long[]{0x00000001022903E0L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__13824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl3851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__23881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl3908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__03944 = new BitSet(new long[]{0x00000000FC000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__03947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl3975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__14005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl4032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__04066 = new BitSet(new long[]{0x00000000FC000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__04069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__14127 = new BitSet(new long[]{0x00000001022903E0L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__14130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl4157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__24187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl4214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__04250 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__04253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__14311 = new BitSet(new long[]{0x00000001022903E0L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__14314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl4341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__24371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__04434 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__04437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl4464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__14493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl4520 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__04555 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__04558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__14616 = new BitSet(new long[]{0x00000001022103E0L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__14619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl4646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__24676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl4703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__04739 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__04742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl4769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__14798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl4825 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__04860 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__04863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__14921 = new BitSet(new long[]{0x00000001022103E0L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__14924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl4951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__24981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05044 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_rule__MultExpression__Group__0__Impl5074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5130 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__05165 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__05168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__15226 = new BitSet(new long[]{0x00000001022103E0L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__15229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl5256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__25286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl5313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__05349 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__05352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__DivExpression__Group__0__Impl5379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__15408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__0_in_rule__DivExpression__Group__1__Impl5435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__0__Impl_in_rule__DivExpression__Group_1__05470 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__1_in_rule__DivExpression__Group_1__05473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__1__Impl_in_rule__DivExpression__Group_1__15531 = new BitSet(new long[]{0x00000001022103E0L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__2_in_rule__DivExpression__Group_1__15534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__OperatorAssignment_1_1_in_rule__DivExpression__Group_1__1__Impl5561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__2__Impl_in_rule__DivExpression__Group_1__25591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__SubExpressionsAssignment_1_2_in_rule__DivExpression__Group_1__2__Impl5618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__05654 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__05657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_rule__ModExpression__Group__0__Impl5684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__15713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl5740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__05775 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__05778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__15836 = new BitSet(new long[]{0x00000001022103E0L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__15839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl5866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__25896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl5923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__0__Impl_in_rule__NegExpression__Group_0__05959 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__1_in_rule__NegExpression__Group_0__05962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__1__Impl_in_rule__NegExpression__Group_0__16020 = new BitSet(new long[]{0x00000001022103E0L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__2_in_rule__NegExpression__Group_0__16023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__OperatorAssignment_0_1_in_rule__NegExpression__Group_0__1__Impl6050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__2__Impl_in_rule__NegExpression__Group_0__26080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__SubExpressionsAssignment_0_2_in_rule__NegExpression__Group_0__2__Impl6107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__06143 = new BitSet(new long[]{0x00000001022903E0L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__06146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__AtomicExpression__Group_2__0__Impl6174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__16205 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__16208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_2__1__Impl6235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__26264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__AtomicExpression__Group_2__2__Impl6292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__06329 = new BitSet(new long[]{0x00000001022103E0L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__06332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__AtomicValuedExpression__Group_2__0__Impl6361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__16393 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__16396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl6423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__26452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__AtomicValuedExpression__Group_2__2__Impl6480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__06517 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__06520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__16578 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__16581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl6608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__26638 = new BitSet(new long[]{0x0000000002010020L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__26641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__ValuedObjectTestExpression__Group_0__2__Impl6669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__36700 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__36703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl6730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__46760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ValuedObjectTestExpression__Group_0__4__Impl6788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__06829 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__06832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl6859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__16889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl6916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__06951 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__06954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__TextExpression__Group_1__0__Impl6982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__17013 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__17016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl7043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__27073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__TextExpression__Group_1__2__Impl7101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__07138 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__07141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__TagAnnotation__Group__0__Impl7169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__17200 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__17203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl7230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__27260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl7287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__07324 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__07327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__TagAnnotation__Group_2__0__Impl7355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__17386 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__17389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl7416 = new BitSet(new long[]{0x0000000400000402L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__27447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__TagAnnotation__Group_2__2__Impl7475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__07512 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__07515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyStringValueAnnotation__Group__0__Impl7543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__17574 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__17577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl7604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__27634 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__27637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl7664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__37694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl7721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__07760 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__07763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__KeyStringValueAnnotation__Group_3__0__Impl7791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__17822 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__17825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl7852 = new BitSet(new long[]{0x0000000400000402L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__27883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__KeyStringValueAnnotation__Group_3__2__Impl7911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__07948 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__07951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl7979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__18010 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__18013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl8040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__28070 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__28073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl8101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__38132 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__38135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl8162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__48192 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__48195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl8223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__58254 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__58257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl8284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__68314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl8341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__08386 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__08389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl8417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__18448 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__18451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl8478 = new BitSet(new long[]{0x0000000400000402L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__28509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl8537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__08574 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__08577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyBooleanValueAnnotation__Group__0__Impl8605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__18636 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__18639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl8666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__28696 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__28699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl8726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__38756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl8783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__08822 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__08825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl8853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__18884 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__18887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl8914 = new BitSet(new long[]{0x0000000400000402L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__28945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl8973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__09010 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__09013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyIntValueAnnotation__Group__0__Impl9041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__19072 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__19075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl9102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__29132 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__29135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl9162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__39192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl9219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__09258 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__09261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__KeyIntValueAnnotation__Group_3__0__Impl9289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__19320 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__19323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl9350 = new BitSet(new long[]{0x0000000400000402L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__29381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__KeyIntValueAnnotation__Group_3__2__Impl9409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__09446 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__09449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyFloatValueAnnotation__Group__0__Impl9477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__19508 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__19511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl9538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__29568 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__29571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl9598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__39628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl9655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__09694 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__09697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl9725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__19756 = new BitSet(new long[]{0x0000000600000400L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__19759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl9786 = new BitSet(new long[]{0x0000000400000402L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__29817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl9845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__09883 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__09886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl9913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__19942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl9969 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__010004 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__010007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ExtendedID__Group_1__0__Impl10035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__110066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl10093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_110131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_210162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_110193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_210224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_110255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_210286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_110317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_210348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_110379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_210410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_110441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_210472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_110503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_rule__MultExpression__SubExpressionsAssignment_1_210534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_1_110565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__DivExpression__SubExpressionsAssignment_1_210596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_110627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_210658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_rule__NegExpression__OperatorAssignment_0_110689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_rule__NegExpression__SubExpressionsAssignment_0_210720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_110751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_310784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment10819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_rule__TextExpression__CodeAssignment_010854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_110885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment10916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment10947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment10978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment11009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_111040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_111071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_111102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_211133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_111164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_111195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_311226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_511257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_111288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_111319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_211350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_111381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_111412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_211443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_111474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_111505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_211536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_111567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred1_InternalKExpressions2490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_synpred2_InternalKExpressions2540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred3_InternalKExpressions2591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_synpred11_InternalKExpressions2859 = new BitSet(new long[]{0x0000000000000002L});
    }


}