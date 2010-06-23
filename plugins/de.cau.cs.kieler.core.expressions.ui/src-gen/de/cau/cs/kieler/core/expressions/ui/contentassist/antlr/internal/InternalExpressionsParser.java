package de.cau.cs.kieler.core.expressions.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.cau.cs.kieler.core.expressions.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'mod'", "'/'", "'?'", "'E'", "'e'", "'true'", "'false'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'('", "')'", "'.'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

        public InternalExpressionsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[297+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g"; }


     
     	private ExpressionsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpressionsGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:62:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:63:1: ( ruleExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:64:1: ruleExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression67);
            ruleExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression74); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:71:1: ruleExpression : ( ruleBooleanExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:75:2: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:76:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:76:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:77:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleExpression100);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleBooleanExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:90:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:91:1: ( ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:92:1: ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression126);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanExpression133); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBooleanExpression


    // $ANTLR start ruleBooleanExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:99:1: ruleBooleanExpression : ( ruleOrExpression ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:103:2: ( ( ruleOrExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:104:1: ( ruleOrExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:104:1: ( ruleOrExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:105:1: ruleOrExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleBooleanExpression159);
            ruleOrExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end ruleBooleanExpression


    // $ANTLR start entryRuleOrExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:118:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:119:1: ( ruleOrExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:120:1: ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression185);
            ruleOrExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression192); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleOrExpression


    // $ANTLR start ruleOrExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:127:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:131:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:132:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:132:1: ( ( rule__OrExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:133:1: ( rule__OrExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:134:1: ( rule__OrExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:134:2: rule__OrExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression218);
            rule__OrExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleOrExpression


    // $ANTLR start entryRuleAndExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:146:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:147:1: ( ruleAndExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:148:1: ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression245);
            ruleAndExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression252); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAndExpression


    // $ANTLR start ruleAndExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:155:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:159:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:160:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:160:1: ( ( rule__AndExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:161:1: ( rule__AndExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:162:1: ( rule__AndExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:162:2: rule__AndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression278);
            rule__AndExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleAndExpression


    // $ANTLR start entryRuleNotExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:174:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:175:1: ( ruleNotExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:176:1: ruleNotExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression305);
            ruleNotExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression312); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleNotExpression


    // $ANTLR start ruleNotExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:183:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:187:2: ( ( ( rule__NotExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:188:1: ( ( rule__NotExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:188:1: ( ( rule__NotExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:189:1: ( rule__NotExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:190:1: ( rule__NotExpression__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:190:2: rule__NotExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression338);
            rule__NotExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleNotExpression


    // $ANTLR start entryRuleAtomicExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:202:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:203:1: ( ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:204:1: ruleAtomicExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression365);
            ruleAtomicExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression372); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAtomicExpression


    // $ANTLR start ruleAtomicExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:211:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:215:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:216:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:216:1: ( ( rule__AtomicExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:217:1: ( rule__AtomicExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:218:1: ( rule__AtomicExpression__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:218:2: rule__AtomicExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression398);
            rule__AtomicExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleAtomicExpression


    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:230:1: entryRuleSignalReference : ruleSignalReference EOF ;
    public final void entryRuleSignalReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:231:1: ( ruleSignalReference EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:232:1: ruleSignalReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignalReference_in_entryRuleSignalReference425);
            ruleSignalReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignalReference432); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSignalReference


    // $ANTLR start ruleSignalReference
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:239:1: ruleSignalReference : ( ( rule__SignalReference__SignalAssignment ) ) ;
    public final void ruleSignalReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:243:2: ( ( ( rule__SignalReference__SignalAssignment ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:244:1: ( ( rule__SignalReference__SignalAssignment ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:244:1: ( ( rule__SignalReference__SignalAssignment ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:245:1: ( rule__SignalReference__SignalAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalAssignment()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:246:1: ( rule__SignalReference__SignalAssignment )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:246:2: rule__SignalReference__SignalAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__SignalReference__SignalAssignment_in_ruleSignalReference458);
            rule__SignalReference__SignalAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getSignalAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSignalReference


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:258:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:259:1: ( ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:260:1: ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation485);
            ruleCompareOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation492); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleCompareOperation


    // $ANTLR start ruleCompareOperation
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:267:1: ruleCompareOperation : ( ( rule__CompareOperation__Group__0 ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:271:2: ( ( ( rule__CompareOperation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:272:1: ( ( rule__CompareOperation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:272:1: ( ( rule__CompareOperation__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:273:1: ( rule__CompareOperation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:274:1: ( rule__CompareOperation__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:274:2: rule__CompareOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group__0_in_ruleCompareOperation518);
            rule__CompareOperation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleCompareOperation


    // $ANTLR start entryRuleValuedExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:286:1: entryRuleValuedExpression : ruleValuedExpression EOF ;
    public final void entryRuleValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:287:1: ( ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:288:1: ruleValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression545);
            ruleValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression552); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleValuedExpression


    // $ANTLR start ruleValuedExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:295:1: ruleValuedExpression : ( ruleAddExpression ) ;
    public final void ruleValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:299:2: ( ( ruleAddExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:300:1: ( ruleAddExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:300:1: ( ruleAddExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:301:1: ruleAddExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression578);
            ruleAddExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end ruleValuedExpression


    // $ANTLR start entryRuleAddExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:314:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:315:1: ( ruleAddExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:316:1: ruleAddExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression604);
            ruleAddExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAddExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression611); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAddExpression


    // $ANTLR start ruleAddExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:323:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:327:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:328:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:328:1: ( ( rule__AddExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:329:1: ( rule__AddExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:330:1: ( rule__AddExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:330:2: rule__AddExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression637);
            rule__AddExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleAddExpression


    // $ANTLR start entryRuleSubExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:342:1: entryRuleSubExpression : ruleSubExpression EOF ;
    public final void entryRuleSubExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:343:1: ( ruleSubExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:344:1: ruleSubExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression664);
            ruleSubExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSubExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression671); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSubExpression


    // $ANTLR start ruleSubExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:351:1: ruleSubExpression : ( ( rule__SubExpression__Group__0 ) ) ;
    public final void ruleSubExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:355:2: ( ( ( rule__SubExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:356:1: ( ( rule__SubExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:356:1: ( ( rule__SubExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:357:1: ( rule__SubExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:358:1: ( rule__SubExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:358:2: rule__SubExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__0_in_ruleSubExpression697);
            rule__SubExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleSubExpression


    // $ANTLR start entryRuleMultExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:370:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:371:1: ( ruleMultExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:372:1: ruleMultExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression724);
            ruleMultExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression731); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMultExpression


    // $ANTLR start ruleMultExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:379:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:383:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:384:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:384:1: ( ( rule__MultExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:385:1: ( rule__MultExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:386:1: ( rule__MultExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:386:2: rule__MultExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression757);
            rule__MultExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleMultExpression


    // $ANTLR start entryRuleModExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:398:1: entryRuleModExpression : ruleModExpression EOF ;
    public final void entryRuleModExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:399:1: ( ruleModExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:400:1: ruleModExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression784);
            ruleModExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getModExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression791); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleModExpression


    // $ANTLR start ruleModExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:407:1: ruleModExpression : ( ( rule__ModExpression__Group__0 ) ) ;
    public final void ruleModExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:411:2: ( ( ( rule__ModExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:412:1: ( ( rule__ModExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:412:1: ( ( rule__ModExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:413:1: ( rule__ModExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:414:1: ( rule__ModExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:414:2: rule__ModExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression817);
            rule__ModExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleModExpression


    // $ANTLR start entryRuleAtomicValuedExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:426:1: entryRuleAtomicValuedExpression : ruleAtomicValuedExpression EOF ;
    public final void entryRuleAtomicValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:427:1: ( ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:428:1: ruleAtomicValuedExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression844);
            ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression851); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAtomicValuedExpression


    // $ANTLR start ruleAtomicValuedExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:435:1: ruleAtomicValuedExpression : ( ( rule__AtomicValuedExpression__Alternatives ) ) ;
    public final void ruleAtomicValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:439:2: ( ( ( rule__AtomicValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:440:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:440:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:441:1: ( rule__AtomicValuedExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:442:1: ( rule__AtomicValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:442:2: rule__AtomicValuedExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression877);
            rule__AtomicValuedExpression__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleAtomicValuedExpression


    // $ANTLR start entryRuleDivExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:454:1: entryRuleDivExpression : ruleDivExpression EOF ;
    public final void entryRuleDivExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:455:1: ( ruleDivExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:456:1: ruleDivExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression904);
            ruleDivExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression911); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDivExpression


    // $ANTLR start ruleDivExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:463:1: ruleDivExpression : ( ( rule__DivExpression__Group__0 ) ) ;
    public final void ruleDivExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:467:2: ( ( ( rule__DivExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:468:1: ( ( rule__DivExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:468:1: ( ( rule__DivExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:469:1: ( rule__DivExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:470:1: ( rule__DivExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:470:2: rule__DivExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression937);
            rule__DivExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleDivExpression


    // $ANTLR start entryRuleVariableReference
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:482:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:483:1: ( ruleVariableReference EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:484:1: ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_entryRuleVariableReference964);
            ruleVariableReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableReference971); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleVariableReference


    // $ANTLR start ruleVariableReference
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:491:1: ruleVariableReference : ( ( rule__VariableReference__VariableAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:495:2: ( ( ( rule__VariableReference__VariableAssignment ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:496:1: ( ( rule__VariableReference__VariableAssignment ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:496:1: ( ( rule__VariableReference__VariableAssignment ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:497:1: ( rule__VariableReference__VariableAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableAssignment()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:498:1: ( rule__VariableReference__VariableAssignment )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:498:2: rule__VariableReference__VariableAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableReference__VariableAssignment_in_ruleVariableReference997);
            rule__VariableReference__VariableAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVariableReference


    // $ANTLR start entryRuleValueTestExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:510:1: entryRuleValueTestExpression : ruleValueTestExpression EOF ;
    public final void entryRuleValueTestExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:511:1: ( ruleValueTestExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:512:1: ruleValueTestExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTestExpression_in_entryRuleValueTestExpression1024);
            ruleValueTestExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValueTestExpression1031); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleValueTestExpression


    // $ANTLR start ruleValueTestExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:519:1: ruleValueTestExpression : ( ( rule__ValueTestExpression__Group__0 ) ) ;
    public final void ruleValueTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:523:2: ( ( ( rule__ValueTestExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:524:1: ( ( rule__ValueTestExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:524:1: ( ( rule__ValueTestExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:525:1: ( rule__ValueTestExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:526:1: ( rule__ValueTestExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:526:2: rule__ValueTestExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValueTestExpression__Group__0_in_ruleValueTestExpression1057);
            rule__ValueTestExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleValueTestExpression


    // $ANTLR start entryRulePreValueTestExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:538:1: entryRulePreValueTestExpression : rulePreValueTestExpression EOF ;
    public final void entryRulePreValueTestExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:539:1: ( rulePreValueTestExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:540:1: rulePreValueTestExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreValueTestExpression_in_entryRulePreValueTestExpression1084);
            rulePreValueTestExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePreValueTestExpression1091); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePreValueTestExpression


    // $ANTLR start rulePreValueTestExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:547:1: rulePreValueTestExpression : ( ( rule__PreValueTestExpression__Group__0 ) ) ;
    public final void rulePreValueTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:551:2: ( ( ( rule__PreValueTestExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:552:1: ( ( rule__PreValueTestExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:552:1: ( ( rule__PreValueTestExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:553:1: ( rule__PreValueTestExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:554:1: ( rule__PreValueTestExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:554:2: rule__PreValueTestExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreValueTestExpression__Group__0_in_rulePreValueTestExpression1117);
            rule__PreValueTestExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePreValueTestExpression


    // $ANTLR start entryRuleTextExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:566:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:567:1: ( ruleTextExpression EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:568:1: ruleTextExpression EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression1144);
            ruleTextExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression1151); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTextExpression


    // $ANTLR start ruleTextExpression
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:575:1: ruleTextExpression : ( ( rule__TextExpression__Group__0 ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:579:2: ( ( ( rule__TextExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:580:1: ( ( rule__TextExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:580:1: ( ( rule__TextExpression__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:581:1: ( rule__TextExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:582:1: ( rule__TextExpression__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:582:2: rule__TextExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__0_in_ruleTextExpression1177);
            rule__TextExpression__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleTextExpression


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:594:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:595:1: ( ruleIntValue EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:596:1: ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue1204);
            ruleIntValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue1211); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleIntValue


    // $ANTLR start ruleIntValue
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:603:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:607:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:608:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:608:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:609:1: ( rule__IntValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:610:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:610:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1237);
            rule__IntValue__ValueAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleIntValue


    // $ANTLR start entryRuleFloatValue
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:622:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:623:1: ( ruleFloatValue EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:624:1: ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue1264);
            ruleFloatValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue1271); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFloatValue


    // $ANTLR start ruleFloatValue
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:631:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:635:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:636:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:636:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:637:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:638:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:638:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1297);
            rule__FloatValue__ValueAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleFloatValue


    // $ANTLR start entryRuleBooleanValue
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:650:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:651:1: ( ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:652:1: ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1324);
            ruleBooleanValue();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue1331); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBooleanValue


    // $ANTLR start ruleBooleanValue
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:659:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:663:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:664:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:664:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:665:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:666:1: ( rule__BooleanValue__ValueAssignment )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:666:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1357);
            rule__BooleanValue__ValueAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleBooleanValue


    // $ANTLR start entryRuleEIntegerObject
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:678:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:679:1: ( ruleEIntegerObject EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:680:1: ruleEIntegerObject EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEIntegerObjectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1384);
            ruleEIntegerObject();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEIntegerObjectRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEIntegerObject1391); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEIntegerObject


    // $ANTLR start ruleEIntegerObject
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:687:1: ruleEIntegerObject : ( ( rule__EIntegerObject__Group__0 ) ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:691:2: ( ( ( rule__EIntegerObject__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:692:1: ( ( rule__EIntegerObject__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:692:1: ( ( rule__EIntegerObject__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:693:1: ( rule__EIntegerObject__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEIntegerObjectAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:694:1: ( rule__EIntegerObject__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:694:2: rule__EIntegerObject__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EIntegerObject__Group__0_in_ruleEIntegerObject1417);
            rule__EIntegerObject__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEIntegerObjectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEIntegerObject


    // $ANTLR start entryRuleEFloatObject
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:706:1: entryRuleEFloatObject : ruleEFloatObject EOF ;
    public final void entryRuleEFloatObject() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:707:1: ( ruleEFloatObject EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:708:1: ruleEFloatObject EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1444);
            ruleEFloatObject();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloatObject1451); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEFloatObject


    // $ANTLR start ruleEFloatObject
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:715:1: ruleEFloatObject : ( ( rule__EFloatObject__Group__0 ) ) ;
    public final void ruleEFloatObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:719:2: ( ( ( rule__EFloatObject__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:720:1: ( ( rule__EFloatObject__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:720:1: ( ( rule__EFloatObject__Group__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:721:1: ( rule__EFloatObject__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:722:1: ( rule__EFloatObject__Group__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:722:2: rule__EFloatObject__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject1477);
            rule__EFloatObject__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEFloatObject


    // $ANTLR start entryRuleEBooleanObject
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:734:1: entryRuleEBooleanObject : ruleEBooleanObject EOF ;
    public final void entryRuleEBooleanObject() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:735:1: ( ruleEBooleanObject EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:736:1: ruleEBooleanObject EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEBooleanObjectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBooleanObject_in_entryRuleEBooleanObject1504);
            ruleEBooleanObject();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEBooleanObjectRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBooleanObject1511); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEBooleanObject


    // $ANTLR start ruleEBooleanObject
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:743:1: ruleEBooleanObject : ( ( rule__EBooleanObject__Alternatives ) ) ;
    public final void ruleEBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:747:2: ( ( ( rule__EBooleanObject__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:748:1: ( ( rule__EBooleanObject__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:748:1: ( ( rule__EBooleanObject__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:749:1: ( rule__EBooleanObject__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:750:1: ( rule__EBooleanObject__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:750:2: rule__EBooleanObject__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBooleanObject__Alternatives_in_ruleEBooleanObject1537);
            rule__EBooleanObject__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEBooleanObject


    // $ANTLR start entryRuleEString
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:762:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:763:1: ( ruleEString EOF )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:764:1: ruleEString EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1564);
            ruleEString();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1571); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEString


    // $ANTLR start ruleEString
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:771:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:775:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:776:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:776:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:777:1: ( rule__EString__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:778:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:778:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString1597);
            rule__EString__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleEString


    // $ANTLR start ruleCompareOperator
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:791:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:795:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:796:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:796:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:797:1: ( rule__CompareOperator__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:798:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:798:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1634);
            rule__CompareOperator__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleCompareOperator


    // $ANTLR start rulePreOperator
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:810:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:814:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:815:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:815:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:816:1: ( 'pre' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:817:1: ( 'pre' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:817:3: 'pre'
            {
            match(input,11,FollowSets000.FOLLOW_11_in_rulePreOperator1671); if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rulePreOperator


    // $ANTLR start ruleOrOperator
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:830:1: ruleOrOperator : ( ( 'or' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:834:1: ( ( ( 'or' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:835:1: ( ( 'or' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:835:1: ( ( 'or' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:836:1: ( 'or' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:837:1: ( 'or' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:837:3: 'or'
            {
            match(input,12,FollowSets000.FOLLOW_12_in_ruleOrOperator1710); if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleOrOperator


    // $ANTLR start ruleAndOperator
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:850:1: ruleAndOperator : ( ( 'and' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:854:1: ( ( ( 'and' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:855:1: ( ( 'and' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:855:1: ( ( 'and' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:856:1: ( 'and' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:857:1: ( 'and' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:857:3: 'and'
            {
            match(input,13,FollowSets000.FOLLOW_13_in_ruleAndOperator1749); if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleAndOperator


    // $ANTLR start ruleNotOperator
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:870:1: ruleNotOperator : ( ( 'not' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:874:1: ( ( ( 'not' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:875:1: ( ( 'not' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:875:1: ( ( 'not' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:876:1: ( 'not' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:877:1: ( 'not' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:877:3: 'not'
            {
            match(input,14,FollowSets000.FOLLOW_14_in_ruleNotOperator1788); if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleNotOperator


    // $ANTLR start ruleAddOperator
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:890:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:894:1: ( ( ( '+' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:895:1: ( ( '+' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:895:1: ( ( '+' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:896:1: ( '+' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:897:1: ( '+' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:897:3: '+'
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleAddOperator1827); if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleAddOperator


    // $ANTLR start ruleSubOperator
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:910:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:914:1: ( ( ( '-' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:915:1: ( ( '-' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:915:1: ( ( '-' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:916:1: ( '-' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:917:1: ( '-' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:917:3: '-'
            {
            match(input,16,FollowSets000.FOLLOW_16_in_ruleSubOperator1866); if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleSubOperator


    // $ANTLR start ruleMultOperator
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:930:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:934:1: ( ( ( '*' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:935:1: ( ( '*' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:935:1: ( ( '*' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:936:1: ( '*' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:937:1: ( '*' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:937:3: '*'
            {
            match(input,17,FollowSets000.FOLLOW_17_in_ruleMultOperator1905); if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleMultOperator


    // $ANTLR start ruleModOperator
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:950:1: ruleModOperator : ( ( 'mod' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:954:1: ( ( ( 'mod' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:955:1: ( ( 'mod' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:955:1: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:956:1: ( 'mod' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:957:1: ( 'mod' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:957:3: 'mod'
            {
            match(input,18,FollowSets000.FOLLOW_18_in_ruleModOperator1944); if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleModOperator


    // $ANTLR start ruleDivOperator
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:970:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:974:1: ( ( ( '/' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:975:1: ( ( '/' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:975:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:976:1: ( '/' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:977:1: ( '/' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:977:3: '/'
            {
            match(input,19,FollowSets000.FOLLOW_19_in_ruleDivOperator1983); if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleDivOperator


    // $ANTLR start ruleValueTestOperator
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:990:1: ruleValueTestOperator : ( ( '?' ) ) ;
    public final void ruleValueTestOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:994:1: ( ( ( '?' ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:995:1: ( ( '?' ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:995:1: ( ( '?' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:996:1: ( '?' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:997:1: ( '?' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:997:3: '?'
            {
            match(input,20,FollowSets000.FOLLOW_20_in_ruleValueTestOperator2022); if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleValueTestOperator


    // $ANTLR start rule__NotExpression__Alternatives
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1013:1: rule__NotExpression__Alternatives : ( ( ruleAtomicExpression ) | ( ( rule__NotExpression__Group_1__0 ) ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1017:1: ( ( ruleAtomicExpression ) | ( ( rule__NotExpression__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)||LA1_0==11||(LA1_0>=23 && LA1_0<=24)||LA1_0==31) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1013:1: rule__NotExpression__Alternatives : ( ( ruleAtomicExpression ) | ( ( rule__NotExpression__Group_1__0 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1018:1: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1018:1: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1019:1: ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2063);
                    ruleAtomicExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1024:6: ( ( rule__NotExpression__Group_1__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1024:6: ( ( rule__NotExpression__Group_1__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1025:1: ( rule__NotExpression__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1026:1: ( rule__NotExpression__Group_1__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1026:2: rule__NotExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_1__0_in_rule__NotExpression__Alternatives2080);
                    rule__NotExpression__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getNotExpressionAccess().getGroup_1()); 
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
    // $ANTLR end rule__NotExpression__Alternatives


    // $ANTLR start rule__AtomicExpression__Alternatives
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1035:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1039:1: ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            case 31:
                {
                switch ( input.LA(2) ) {
                case RULE_INT:
                case 16:
                case 20:
                case 33:
                    {
                    alt2=4;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA2_6 = input.LA(3);

                    if ( ((LA2_6>=12 && LA2_6<=13)||LA2_6==32) ) {
                        alt2=5;
                    }
                    else if ( ((LA2_6>=15 && LA2_6<=18)||(LA2_6>=25 && LA2_6<=31)) ) {
                        alt2=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1035:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 2, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA2_7 = input.LA(3);

                    if ( ((LA2_7>=15 && LA2_7<=18)||(LA2_7>=25 && LA2_7<=30)) ) {
                        alt2=4;
                    }
                    else if ( ((LA2_7>=12 && LA2_7<=13)||LA2_7==32) ) {
                        alt2=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1035:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 2, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case 11:
                    {
                    int LA2_8 = input.LA(3);

                    if ( (LA2_8==31) ) {
                        int LA2_11 = input.LA(4);

                        if ( (LA2_11==20) ) {
                            alt2=4;
                        }
                        else if ( ((LA2_11>=RULE_STRING && LA2_11<=RULE_ID)) ) {
                            alt2=5;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("1035:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 2, 11, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1035:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 2, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 31:
                    {
                    int LA2_9 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt2=4;
                    }
                    else if ( (true) ) {
                        alt2=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1035:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 2, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                case 23:
                case 24:
                    {
                    alt2=5;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1035:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 2, 4, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1035:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleSignalReference ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ( rule__AtomicExpression__Group_3__0 ) ) | ( ( rule__AtomicExpression__Group_4__0 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1040:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1040:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1041:1: ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives2113);
                    ruleBooleanValue();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1046:6: ( ruleSignalReference )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1046:6: ( ruleSignalReference )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1047:1: ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getSignalReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSignalReference_in_rule__AtomicExpression__Alternatives2130);
                    ruleSignalReference();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getSignalReferenceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1052:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1052:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1053:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1054:1: ( rule__AtomicExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1054:2: rule__AtomicExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2147);
                    rule__AtomicExpression__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1058:6: ( ( rule__AtomicExpression__Group_3__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1058:6: ( ( rule__AtomicExpression__Group_3__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1059:1: ( rule__AtomicExpression__Group_3__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1060:1: ( rule__AtomicExpression__Group_3__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1060:2: rule__AtomicExpression__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_3__0_in_rule__AtomicExpression__Alternatives2165);
                    rule__AtomicExpression__Group_3__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1064:6: ( ( rule__AtomicExpression__Group_4__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1064:6: ( ( rule__AtomicExpression__Group_4__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1065:1: ( rule__AtomicExpression__Group_4__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_4()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1066:1: ( rule__AtomicExpression__Group_4__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1066:2: rule__AtomicExpression__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_4__0_in_rule__AtomicExpression__Alternatives2183);
                    rule__AtomicExpression__Group_4__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicExpressionAccess().getGroup_4()); 
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
    // $ANTLR end rule__AtomicExpression__Alternatives


    // $ANTLR start rule__AtomicValuedExpression__Alternatives
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1075:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1079:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_INT) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==EOF||(LA3_2>=15 && LA3_2<=19)||(LA3_2>=25 && LA3_2<=30)||LA3_2==32) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==33) ) {
                        alt3=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("1075:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 3, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_1==33) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1075:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||(LA3_2>=15 && LA3_2<=19)||(LA3_2>=25 && LA3_2<=30)||LA3_2==32) ) {
                    alt3=1;
                }
                else if ( (LA3_2==33) ) {
                    alt3=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1075:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
                {
                int LA3_4 = input.LA(2);

                if ( (synpred8()) ) {
                    alt3=3;
                }
                else if ( (true) ) {
                    alt3=8;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1075:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 11:
                {
                alt3=5;
                }
                break;
            case 31:
                {
                int LA3_8 = input.LA(2);

                if ( (synpred11()) ) {
                    alt3=6;
                }
                else if ( (synpred12()) ) {
                    alt3=7;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1075:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 3, 8, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1075:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleVariableReference ) | ( ruleValueTestExpression ) | ( rulePreValueTestExpression ) | ( ( rule__AtomicValuedExpression__Group_5__0 ) ) | ( ( rule__AtomicValuedExpression__Group_6__0 ) ) | ( ruleTextExpression ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1080:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1080:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1081:1: ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2216);
                    ruleIntValue();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1086:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1086:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1087:1: ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2233);
                    ruleFloatValue();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1092:6: ( ruleVariableReference )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1092:6: ( ruleVariableReference )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1093:1: ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getVariableReferenceParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_rule__AtomicValuedExpression__Alternatives2250);
                    ruleVariableReference();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getVariableReferenceParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1098:6: ( ruleValueTestExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1098:6: ( ruleValueTestExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1099:1: ruleValueTestExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getValueTestExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTestExpression_in_rule__AtomicValuedExpression__Alternatives2267);
                    ruleValueTestExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getValueTestExpressionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1104:6: ( rulePreValueTestExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1104:6: ( rulePreValueTestExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1105:1: rulePreValueTestExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getPreValueTestExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePreValueTestExpression_in_rule__AtomicValuedExpression__Alternatives2284);
                    rulePreValueTestExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getPreValueTestExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1110:6: ( ( rule__AtomicValuedExpression__Group_5__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1110:6: ( ( rule__AtomicValuedExpression__Group_5__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1111:1: ( rule__AtomicValuedExpression__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_5()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1112:1: ( rule__AtomicValuedExpression__Group_5__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1112:2: rule__AtomicValuedExpression__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_5__0_in_rule__AtomicValuedExpression__Alternatives2301);
                    rule__AtomicValuedExpression__Group_5__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1116:6: ( ( rule__AtomicValuedExpression__Group_6__0 ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1116:6: ( ( rule__AtomicValuedExpression__Group_6__0 ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1117:1: ( rule__AtomicValuedExpression__Group_6__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_6()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1118:1: ( rule__AtomicValuedExpression__Group_6__0 )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1118:2: rule__AtomicValuedExpression__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_6__0_in_rule__AtomicValuedExpression__Alternatives2319);
                    rule__AtomicValuedExpression__Group_6__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1122:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1122:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1123:1: ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getTextExpressionParserRuleCall_7()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_rule__AtomicValuedExpression__Alternatives2337);
                    ruleTextExpression();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomicValuedExpressionAccess().getTextExpressionParserRuleCall_7()); 
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
    // $ANTLR end rule__AtomicValuedExpression__Alternatives


    // $ANTLR start rule__EFloatObject__Alternatives_4_0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1133:1: rule__EFloatObject__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloatObject__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1137:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1133:1: rule__EFloatObject__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1138:1: ( 'E' )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1138:1: ( 'E' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1139:1: 'E'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_0()); 
                    }
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__EFloatObject__Alternatives_4_02370); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1146:6: ( 'e' )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1146:6: ( 'e' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1147:1: 'e'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_1()); 
                    }
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__EFloatObject__Alternatives_4_02390); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_1()); 
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
    // $ANTLR end rule__EFloatObject__Alternatives_4_0


    // $ANTLR start rule__EBooleanObject__Alternatives
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1159:1: rule__EBooleanObject__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1163:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1159:1: rule__EBooleanObject__Alternatives : ( ( 'true' ) | ( 'false' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1164:1: ( 'true' )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1164:1: ( 'true' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1165:1: 'true'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 
                    }
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__EBooleanObject__Alternatives2425); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1172:6: ( 'false' )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1172:6: ( 'false' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1173:1: 'false'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1()); 
                    }
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__EBooleanObject__Alternatives2445); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1()); 
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
    // $ANTLR end rule__EBooleanObject__Alternatives


    // $ANTLR start rule__EString__Alternatives
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1185:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1189:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1185:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1190:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1190:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1191:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives2479); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1196:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1196:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1197:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives2496); if (failed) return ;
                    if ( backtracking==0 ) {
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
    // $ANTLR end rule__EString__Alternatives


    // $ANTLR start rule__CompareOperator__Alternatives
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1207:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1211:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            case 28:
                {
                alt7=4;
                }
                break;
            case 29:
                {
                alt7=5;
                }
                break;
            case 30:
                {
                alt7=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1207:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1212:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1212:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1213:1: ( '=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1214:1: ( '=' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1214:3: '='
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__CompareOperator__Alternatives2529); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1219:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1219:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1220:1: ( '<' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1221:1: ( '<' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1221:3: '<'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__CompareOperator__Alternatives2550); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1226:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1226:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1227:1: ( '<=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1228:1: ( '<=' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1228:3: '<='
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__CompareOperator__Alternatives2571); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1233:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1233:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1234:1: ( '>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1235:1: ( '>' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1235:3: '>'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__CompareOperator__Alternatives2592); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1240:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1240:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1241:1: ( '>=' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1242:1: ( '>=' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1242:3: '>='
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__CompareOperator__Alternatives2613); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1247:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1247:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1248:1: ( '<>' )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1249:1: ( '<>' )
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1249:3: '<>'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__CompareOperator__Alternatives2634); if (failed) return ;

                    }

                    if ( backtracking==0 ) {
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
    // $ANTLR end rule__CompareOperator__Alternatives


    // $ANTLR start rule__OrExpression__Group__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1263:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1267:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1268:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__02669);
            rule__OrExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__02672);
            rule__OrExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__Group__0


    // $ANTLR start rule__OrExpression__Group__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1275:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1279:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1280:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1280:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1281:1: ruleAndExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl2699);
            ruleAndExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__OrExpression__Group__0__Impl


    // $ANTLR start rule__OrExpression__Group__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1292:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1296:1: ( rule__OrExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1297:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__12728);
            rule__OrExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__Group__1


    // $ANTLR start rule__OrExpression__Group__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1303:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1307:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1308:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1308:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1309:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1310:1: ( rule__OrExpression__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1310:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl2755);
            	    rule__OrExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__OrExpression__Group__1__Impl


    // $ANTLR start rule__OrExpression__Group_1__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1324:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1328:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1329:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__02790);
            rule__OrExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__02793);
            rule__OrExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__Group_1__0


    // $ANTLR start rule__OrExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1336:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1340:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1341:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1341:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1342:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1343:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1345:1: 
            {
            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__OrExpression__Group_1__0__Impl


    // $ANTLR start rule__OrExpression__Group_1__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1355:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1359:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1360:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__12851);
            rule__OrExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__12854);
            rule__OrExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__Group_1__1


    // $ANTLR start rule__OrExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1367:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1371:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1372:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1372:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1373:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1374:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1374:2: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl2881);
            rule__OrExpression__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__OrExpression__Group_1__1__Impl


    // $ANTLR start rule__OrExpression__Group_1__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1384:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1388:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1389:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__22911);
            rule__OrExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExpression__Group_1__2


    // $ANTLR start rule__OrExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1395:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1399:1: ( ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1400:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1400:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1401:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1402:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1402:2: rule__OrExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl2938);
            rule__OrExpression__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__OrExpression__Group_1__2__Impl


    // $ANTLR start rule__AndExpression__Group__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1418:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1422:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1423:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__02974);
            rule__AndExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__02977);
            rule__AndExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group__0


    // $ANTLR start rule__AndExpression__Group__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1430:1: rule__AndExpression__Group__0__Impl : ( ruleNotExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1434:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1435:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1435:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1436:1: ruleNotExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getNotExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__AndExpression__Group__0__Impl3004);
            ruleNotExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getNotExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group__0__Impl


    // $ANTLR start rule__AndExpression__Group__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1447:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1451:1: ( rule__AndExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1452:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__13033);
            rule__AndExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group__1


    // $ANTLR start rule__AndExpression__Group__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1458:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1462:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1463:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1463:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1464:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1465:1: ( rule__AndExpression__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1465:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl3060);
            	    rule__AndExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__AndExpression__Group__1__Impl


    // $ANTLR start rule__AndExpression__Group_1__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1479:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1483:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1484:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__03095);
            rule__AndExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__03098);
            rule__AndExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group_1__0


    // $ANTLR start rule__AndExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1491:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1495:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1496:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1496:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1497:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1498:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1500:1: 
            {
            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__AndExpression__Group_1__0__Impl


    // $ANTLR start rule__AndExpression__Group_1__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1510:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1514:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1515:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__13156);
            rule__AndExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__13159);
            rule__AndExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group_1__1


    // $ANTLR start rule__AndExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1522:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1526:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1527:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1527:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1528:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1529:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1529:2: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl3186);
            rule__AndExpression__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__AndExpression__Group_1__1__Impl


    // $ANTLR start rule__AndExpression__Group_1__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1539:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1543:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1544:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__23216);
            rule__AndExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__Group_1__2


    // $ANTLR start rule__AndExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1550:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1554:1: ( ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1555:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1555:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1556:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1557:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1557:2: rule__AndExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl3243);
            rule__AndExpression__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__AndExpression__Group_1__2__Impl


    // $ANTLR start rule__NotExpression__Group_1__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1573:1: rule__NotExpression__Group_1__0 : rule__NotExpression__Group_1__0__Impl rule__NotExpression__Group_1__1 ;
    public final void rule__NotExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1577:1: ( rule__NotExpression__Group_1__0__Impl rule__NotExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1578:2: rule__NotExpression__Group_1__0__Impl rule__NotExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_1__0__Impl_in_rule__NotExpression__Group_1__03279);
            rule__NotExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_1__1_in_rule__NotExpression__Group_1__03282);
            rule__NotExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_1__0


    // $ANTLR start rule__NotExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1585:1: rule__NotExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1589:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1590:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1590:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1591:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1592:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1594:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_1__0__Impl


    // $ANTLR start rule__NotExpression__Group_1__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1604:1: rule__NotExpression__Group_1__1 : rule__NotExpression__Group_1__1__Impl rule__NotExpression__Group_1__2 ;
    public final void rule__NotExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1608:1: ( rule__NotExpression__Group_1__1__Impl rule__NotExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1609:2: rule__NotExpression__Group_1__1__Impl rule__NotExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_1__1__Impl_in_rule__NotExpression__Group_1__13340);
            rule__NotExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_1__2_in_rule__NotExpression__Group_1__13343);
            rule__NotExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_1__1


    // $ANTLR start rule__NotExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1616:1: rule__NotExpression__Group_1__1__Impl : ( ( rule__NotExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__NotExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1620:1: ( ( ( rule__NotExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1621:1: ( ( rule__NotExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1621:1: ( ( rule__NotExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1622:1: ( rule__NotExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1623:1: ( rule__NotExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1623:2: rule__NotExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__OperatorAssignment_1_1_in_rule__NotExpression__Group_1__1__Impl3370);
            rule__NotExpression__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_1__1__Impl


    // $ANTLR start rule__NotExpression__Group_1__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1633:1: rule__NotExpression__Group_1__2 : rule__NotExpression__Group_1__2__Impl ;
    public final void rule__NotExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1637:1: ( rule__NotExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1638:2: rule__NotExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_1__2__Impl_in_rule__NotExpression__Group_1__23400);
            rule__NotExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_1__2


    // $ANTLR start rule__NotExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1644:1: rule__NotExpression__Group_1__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__NotExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1648:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1649:1: ( ( rule__NotExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1649:1: ( ( rule__NotExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1650:1: ( rule__NotExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1651:1: ( rule__NotExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1651:2: rule__NotExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__SubExpressionsAssignment_1_2_in_rule__NotExpression__Group_1__2__Impl3427);
            rule__NotExpression__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__Group_1__2__Impl


    // $ANTLR start rule__AtomicExpression__Group_2__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1667:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1671:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1672:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__03463);
            rule__AtomicExpression__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__03466);
            rule__AtomicExpression__Group_2__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__0


    // $ANTLR start rule__AtomicExpression__Group_2__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1679:1: rule__AtomicExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1683:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1684:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1684:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1685:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getOperatorExpressionAction_2_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1686:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1688:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getOperatorExpressionAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__0__Impl


    // $ANTLR start rule__AtomicExpression__Group_2__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1698:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1702:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1703:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__13524);
            rule__AtomicExpression__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__13527);
            rule__AtomicExpression__Group_2__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__1


    // $ANTLR start rule__AtomicExpression__Group_2__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1710:1: rule__AtomicExpression__Group_2__1__Impl : ( ( rule__AtomicExpression__OperatorAssignment_2_1 ) ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1714:1: ( ( ( rule__AtomicExpression__OperatorAssignment_2_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1715:1: ( ( rule__AtomicExpression__OperatorAssignment_2_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1715:1: ( ( rule__AtomicExpression__OperatorAssignment_2_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1716:1: ( rule__AtomicExpression__OperatorAssignment_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getOperatorAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1717:1: ( rule__AtomicExpression__OperatorAssignment_2_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1717:2: rule__AtomicExpression__OperatorAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__OperatorAssignment_2_1_in_rule__AtomicExpression__Group_2__1__Impl3554);
            rule__AtomicExpression__OperatorAssignment_2_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getOperatorAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__1__Impl


    // $ANTLR start rule__AtomicExpression__Group_2__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1727:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl rule__AtomicExpression__Group_2__3 ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1731:1: ( rule__AtomicExpression__Group_2__2__Impl rule__AtomicExpression__Group_2__3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1732:2: rule__AtomicExpression__Group_2__2__Impl rule__AtomicExpression__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__23584);
            rule__AtomicExpression__Group_2__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__3_in_rule__AtomicExpression__Group_2__23587);
            rule__AtomicExpression__Group_2__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__2


    // $ANTLR start rule__AtomicExpression__Group_2__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1739:1: rule__AtomicExpression__Group_2__2__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1743:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1744:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1744:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1745:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_2()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__AtomicExpression__Group_2__2__Impl3615); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__2__Impl


    // $ANTLR start rule__AtomicExpression__Group_2__3
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1758:1: rule__AtomicExpression__Group_2__3 : rule__AtomicExpression__Group_2__3__Impl rule__AtomicExpression__Group_2__4 ;
    public final void rule__AtomicExpression__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1762:1: ( rule__AtomicExpression__Group_2__3__Impl rule__AtomicExpression__Group_2__4 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1763:2: rule__AtomicExpression__Group_2__3__Impl rule__AtomicExpression__Group_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__3__Impl_in_rule__AtomicExpression__Group_2__33646);
            rule__AtomicExpression__Group_2__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__4_in_rule__AtomicExpression__Group_2__33649);
            rule__AtomicExpression__Group_2__4();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__3


    // $ANTLR start rule__AtomicExpression__Group_2__3__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1770:1: rule__AtomicExpression__Group_2__3__Impl : ( ( rule__AtomicExpression__SubExpressionsAssignment_2_3 ) ) ;
    public final void rule__AtomicExpression__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1774:1: ( ( ( rule__AtomicExpression__SubExpressionsAssignment_2_3 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1775:1: ( ( rule__AtomicExpression__SubExpressionsAssignment_2_3 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1775:1: ( ( rule__AtomicExpression__SubExpressionsAssignment_2_3 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1776:1: ( rule__AtomicExpression__SubExpressionsAssignment_2_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getSubExpressionsAssignment_2_3()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1777:1: ( rule__AtomicExpression__SubExpressionsAssignment_2_3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1777:2: rule__AtomicExpression__SubExpressionsAssignment_2_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__SubExpressionsAssignment_2_3_in_rule__AtomicExpression__Group_2__3__Impl3676);
            rule__AtomicExpression__SubExpressionsAssignment_2_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getSubExpressionsAssignment_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__3__Impl


    // $ANTLR start rule__AtomicExpression__Group_2__4
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1787:1: rule__AtomicExpression__Group_2__4 : rule__AtomicExpression__Group_2__4__Impl ;
    public final void rule__AtomicExpression__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1791:1: ( rule__AtomicExpression__Group_2__4__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1792:2: rule__AtomicExpression__Group_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__4__Impl_in_rule__AtomicExpression__Group_2__43706);
            rule__AtomicExpression__Group_2__4__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__4


    // $ANTLR start rule__AtomicExpression__Group_2__4__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1798:1: rule__AtomicExpression__Group_2__4__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1802:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1803:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1803:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1804:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_4()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__AtomicExpression__Group_2__4__Impl3734); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_2__4__Impl


    // $ANTLR start rule__AtomicExpression__Group_3__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1827:1: rule__AtomicExpression__Group_3__0 : rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 ;
    public final void rule__AtomicExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1831:1: ( rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1832:2: rule__AtomicExpression__Group_3__0__Impl rule__AtomicExpression__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_3__0__Impl_in_rule__AtomicExpression__Group_3__03775);
            rule__AtomicExpression__Group_3__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_3__1_in_rule__AtomicExpression__Group_3__03778);
            rule__AtomicExpression__Group_3__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_3__0


    // $ANTLR start rule__AtomicExpression__Group_3__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1839:1: rule__AtomicExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1843:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1844:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1844:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1845:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__AtomicExpression__Group_3__0__Impl3806); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_3__0__Impl


    // $ANTLR start rule__AtomicExpression__Group_3__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1858:1: rule__AtomicExpression__Group_3__1 : rule__AtomicExpression__Group_3__1__Impl rule__AtomicExpression__Group_3__2 ;
    public final void rule__AtomicExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1862:1: ( rule__AtomicExpression__Group_3__1__Impl rule__AtomicExpression__Group_3__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1863:2: rule__AtomicExpression__Group_3__1__Impl rule__AtomicExpression__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_3__1__Impl_in_rule__AtomicExpression__Group_3__13837);
            rule__AtomicExpression__Group_3__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_3__2_in_rule__AtomicExpression__Group_3__13840);
            rule__AtomicExpression__Group_3__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_3__1


    // $ANTLR start rule__AtomicExpression__Group_3__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1870:1: rule__AtomicExpression__Group_3__1__Impl : ( ruleCompareOperation ) ;
    public final void rule__AtomicExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1874:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1875:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1875:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1876:1: ruleCompareOperation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getCompareOperationParserRuleCall_3_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__AtomicExpression__Group_3__1__Impl3867);
            ruleCompareOperation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getCompareOperationParserRuleCall_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_3__1__Impl


    // $ANTLR start rule__AtomicExpression__Group_3__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1887:1: rule__AtomicExpression__Group_3__2 : rule__AtomicExpression__Group_3__2__Impl ;
    public final void rule__AtomicExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1891:1: ( rule__AtomicExpression__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1892:2: rule__AtomicExpression__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_3__2__Impl_in_rule__AtomicExpression__Group_3__23896);
            rule__AtomicExpression__Group_3__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_3__2


    // $ANTLR start rule__AtomicExpression__Group_3__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1898:1: rule__AtomicExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1902:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1903:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1903:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1904:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__AtomicExpression__Group_3__2__Impl3924); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_3__2__Impl


    // $ANTLR start rule__AtomicExpression__Group_4__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1923:1: rule__AtomicExpression__Group_4__0 : rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1 ;
    public final void rule__AtomicExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1927:1: ( rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1928:2: rule__AtomicExpression__Group_4__0__Impl rule__AtomicExpression__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_4__0__Impl_in_rule__AtomicExpression__Group_4__03961);
            rule__AtomicExpression__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_4__1_in_rule__AtomicExpression__Group_4__03964);
            rule__AtomicExpression__Group_4__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_4__0


    // $ANTLR start rule__AtomicExpression__Group_4__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1935:1: rule__AtomicExpression__Group_4__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1939:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1940:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1940:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1941:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__AtomicExpression__Group_4__0__Impl3992); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_4__0__Impl


    // $ANTLR start rule__AtomicExpression__Group_4__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1954:1: rule__AtomicExpression__Group_4__1 : rule__AtomicExpression__Group_4__1__Impl rule__AtomicExpression__Group_4__2 ;
    public final void rule__AtomicExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1958:1: ( rule__AtomicExpression__Group_4__1__Impl rule__AtomicExpression__Group_4__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1959:2: rule__AtomicExpression__Group_4__1__Impl rule__AtomicExpression__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_4__1__Impl_in_rule__AtomicExpression__Group_4__14023);
            rule__AtomicExpression__Group_4__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_4__2_in_rule__AtomicExpression__Group_4__14026);
            rule__AtomicExpression__Group_4__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_4__1


    // $ANTLR start rule__AtomicExpression__Group_4__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1966:1: rule__AtomicExpression__Group_4__1__Impl : ( ruleBooleanExpression ) ;
    public final void rule__AtomicExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1970:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1971:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1971:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1972:1: ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_4_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_4__1__Impl4053);
            ruleBooleanExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_4__1__Impl


    // $ANTLR start rule__AtomicExpression__Group_4__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1983:1: rule__AtomicExpression__Group_4__2 : rule__AtomicExpression__Group_4__2__Impl ;
    public final void rule__AtomicExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1987:1: ( rule__AtomicExpression__Group_4__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1988:2: rule__AtomicExpression__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_4__2__Impl_in_rule__AtomicExpression__Group_4__24082);
            rule__AtomicExpression__Group_4__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_4__2


    // $ANTLR start rule__AtomicExpression__Group_4__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1994:1: rule__AtomicExpression__Group_4__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1998:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1999:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1999:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2000:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__AtomicExpression__Group_4__2__Impl4110); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__Group_4__2__Impl


    // $ANTLR start rule__CompareOperation__Group__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2019:1: rule__CompareOperation__Group__0 : rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2023:1: ( rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2024:2: rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group__0__Impl_in_rule__CompareOperation__Group__04147);
            rule__CompareOperation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__04150);
            rule__CompareOperation__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group__0


    // $ANTLR start rule__CompareOperation__Group__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2031:1: rule__CompareOperation__Group__0__Impl : ( ruleValuedExpression ) ;
    public final void rule__CompareOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2035:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2036:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2036:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2037:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__CompareOperation__Group__0__Impl4177);
            ruleValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getValuedExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group__0__Impl


    // $ANTLR start rule__CompareOperation__Group__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2048:1: rule__CompareOperation__Group__1 : rule__CompareOperation__Group__1__Impl ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2052:1: ( rule__CompareOperation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2053:2: rule__CompareOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group__1__Impl_in_rule__CompareOperation__Group__14206);
            rule__CompareOperation__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group__1


    // $ANTLR start rule__CompareOperation__Group__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2059:1: rule__CompareOperation__Group__1__Impl : ( ( rule__CompareOperation__Group_1__0 ) ) ;
    public final void rule__CompareOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2063:1: ( ( ( rule__CompareOperation__Group_1__0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2064:1: ( ( rule__CompareOperation__Group_1__0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2064:1: ( ( rule__CompareOperation__Group_1__0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2065:1: ( rule__CompareOperation__Group_1__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2066:1: ( rule__CompareOperation__Group_1__0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2066:2: rule__CompareOperation__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__1__Impl4233);
            rule__CompareOperation__Group_1__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__CompareOperation__Group__1__Impl


    // $ANTLR start rule__CompareOperation__Group_1__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2080:1: rule__CompareOperation__Group_1__0 : rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2084:1: ( rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2085:2: rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__0__Impl_in_rule__CompareOperation__Group_1__04267);
            rule__CompareOperation__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__04270);
            rule__CompareOperation__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group_1__0


    // $ANTLR start rule__CompareOperation__Group_1__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2092:1: rule__CompareOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2096:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2097:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2097:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2098:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2099:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2101:1: 
            {
            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__CompareOperation__Group_1__0__Impl


    // $ANTLR start rule__CompareOperation__Group_1__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2111:1: rule__CompareOperation__Group_1__1 : rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 ;
    public final void rule__CompareOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2115:1: ( rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2116:2: rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__1__Impl_in_rule__CompareOperation__Group_1__14328);
            rule__CompareOperation__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__14331);
            rule__CompareOperation__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group_1__1


    // $ANTLR start rule__CompareOperation__Group_1__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2123:1: rule__CompareOperation__Group_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompareOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2127:1: ( ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2128:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2128:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2129:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2130:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2130:2: rule__CompareOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__1__Impl4358);
            rule__CompareOperation__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__CompareOperation__Group_1__1__Impl


    // $ANTLR start rule__CompareOperation__Group_1__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2140:1: rule__CompareOperation__Group_1__2 : rule__CompareOperation__Group_1__2__Impl ;
    public final void rule__CompareOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2144:1: ( rule__CompareOperation__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2145:2: rule__CompareOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_1__2__Impl_in_rule__CompareOperation__Group_1__24388);
            rule__CompareOperation__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__Group_1__2


    // $ANTLR start rule__CompareOperation__Group_1__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2151:1: rule__CompareOperation__Group_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__CompareOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2155:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2156:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2156:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2157:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2158:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2158:2: rule__CompareOperation__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__2__Impl4415);
            rule__CompareOperation__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__CompareOperation__Group_1__2__Impl


    // $ANTLR start rule__AddExpression__Group__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2174:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2178:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2179:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__04451);
            rule__AddExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__04454);
            rule__AddExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__Group__0


    // $ANTLR start rule__AddExpression__Group__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2186:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2190:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2191:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2191:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2192:1: ruleSubExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl4481);
            ruleSubExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__AddExpression__Group__0__Impl


    // $ANTLR start rule__AddExpression__Group__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2203:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2207:1: ( rule__AddExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2208:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__14510);
            rule__AddExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__Group__1


    // $ANTLR start rule__AddExpression__Group__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2214:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2218:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2219:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2219:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2220:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2221:1: ( rule__AddExpression__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2221:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl4537);
            	    rule__AddExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__AddExpression__Group__1__Impl


    // $ANTLR start rule__AddExpression__Group_1__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2235:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2239:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2240:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__04572);
            rule__AddExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__04575);
            rule__AddExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__Group_1__0


    // $ANTLR start rule__AddExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2247:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2251:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2252:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2252:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2253:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2254:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2256:1: 
            {
            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__AddExpression__Group_1__0__Impl


    // $ANTLR start rule__AddExpression__Group_1__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2266:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2270:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2271:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__14633);
            rule__AddExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__14636);
            rule__AddExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__Group_1__1


    // $ANTLR start rule__AddExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2278:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2282:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2283:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2283:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2284:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2285:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2285:2: rule__AddExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl4663);
            rule__AddExpression__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__AddExpression__Group_1__1__Impl


    // $ANTLR start rule__AddExpression__Group_1__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2295:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2299:1: ( rule__AddExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2300:2: rule__AddExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__24693);
            rule__AddExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AddExpression__Group_1__2


    // $ANTLR start rule__AddExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2306:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2310:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2311:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2311:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2312:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2313:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2313:2: rule__AddExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl4720);
            rule__AddExpression__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__AddExpression__Group_1__2__Impl


    // $ANTLR start rule__SubExpression__Group__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2329:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2333:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2334:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__04756);
            rule__SubExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__04759);
            rule__SubExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__Group__0


    // $ANTLR start rule__SubExpression__Group__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2341:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2345:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2346:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2346:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2347:1: ruleMultExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl4786);
            ruleMultExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__SubExpression__Group__0__Impl


    // $ANTLR start rule__SubExpression__Group__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2358:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2362:1: ( rule__SubExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2363:2: rule__SubExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__14815);
            rule__SubExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__Group__1


    // $ANTLR start rule__SubExpression__Group__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2369:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2373:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2374:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2374:1: ( ( rule__SubExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2375:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2376:1: ( rule__SubExpression__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2376:2: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl4842);
            	    rule__SubExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__SubExpression__Group__1__Impl


    // $ANTLR start rule__SubExpression__Group_1__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2390:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2394:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2395:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__04877);
            rule__SubExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__04880);
            rule__SubExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__Group_1__0


    // $ANTLR start rule__SubExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2402:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2406:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2407:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2407:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2408:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2409:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2411:1: 
            {
            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__SubExpression__Group_1__0__Impl


    // $ANTLR start rule__SubExpression__Group_1__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2421:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2425:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2426:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__14938);
            rule__SubExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__14941);
            rule__SubExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__Group_1__1


    // $ANTLR start rule__SubExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2433:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2437:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2438:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2438:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2439:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2440:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2440:2: rule__SubExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl4968);
            rule__SubExpression__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__SubExpression__Group_1__1__Impl


    // $ANTLR start rule__SubExpression__Group_1__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2450:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2454:1: ( rule__SubExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2455:2: rule__SubExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__24998);
            rule__SubExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SubExpression__Group_1__2


    // $ANTLR start rule__SubExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2461:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2465:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2466:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2466:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2467:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2468:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2468:2: rule__SubExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5025);
            rule__SubExpression__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__SubExpression__Group_1__2__Impl


    // $ANTLR start rule__MultExpression__Group__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2484:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2488:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2489:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05061);
            rule__MultExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05064);
            rule__MultExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group__0


    // $ANTLR start rule__MultExpression__Group__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2496:1: rule__MultExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2500:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2501:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2501:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2502:1: ruleModExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getModExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__MultExpression__Group__0__Impl5091);
            ruleModExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getModExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group__0__Impl


    // $ANTLR start rule__MultExpression__Group__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2513:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2517:1: ( rule__MultExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2518:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15120);
            rule__MultExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group__1


    // $ANTLR start rule__MultExpression__Group__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2524:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2528:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2529:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2529:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2530:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2531:1: ( rule__MultExpression__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2531:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5147);
            	    rule__MultExpression__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__MultExpression__Group__1__Impl


    // $ANTLR start rule__MultExpression__Group_1__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2545:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2549:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2550:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__05182);
            rule__MultExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__05185);
            rule__MultExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group_1__0


    // $ANTLR start rule__MultExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2557:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2561:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2562:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2562:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2563:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2564:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2566:1: 
            {
            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__MultExpression__Group_1__0__Impl


    // $ANTLR start rule__MultExpression__Group_1__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2576:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2580:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2581:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__15243);
            rule__MultExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__15246);
            rule__MultExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group_1__1


    // $ANTLR start rule__MultExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2588:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2592:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2593:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2593:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2594:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2595:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2595:2: rule__MultExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl5273);
            rule__MultExpression__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__MultExpression__Group_1__1__Impl


    // $ANTLR start rule__MultExpression__Group_1__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2605:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2609:1: ( rule__MultExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2610:2: rule__MultExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__25303);
            rule__MultExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__Group_1__2


    // $ANTLR start rule__MultExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2616:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2620:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2621:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2621:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2622:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2623:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2623:2: rule__MultExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl5330);
            rule__MultExpression__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__MultExpression__Group_1__2__Impl


    // $ANTLR start rule__ModExpression__Group__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2639:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2643:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2644:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__05366);
            rule__ModExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__05369);
            rule__ModExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group__0


    // $ANTLR start rule__ModExpression__Group__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2651:1: rule__ModExpression__Group__0__Impl : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2655:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2656:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2656:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2657:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__Group__0__Impl5396);
            ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group__0__Impl


    // $ANTLR start rule__ModExpression__Group__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2668:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2672:1: ( rule__ModExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2673:2: rule__ModExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__15425);
            rule__ModExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group__1


    // $ANTLR start rule__ModExpression__Group__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2679:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2683:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2684:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2684:1: ( ( rule__ModExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2685:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2686:1: ( rule__ModExpression__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2686:2: rule__ModExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl5452);
                    rule__ModExpression__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__ModExpression__Group__1__Impl


    // $ANTLR start rule__ModExpression__Group_1__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2700:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2704:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2705:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__05487);
            rule__ModExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__05490);
            rule__ModExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group_1__0


    // $ANTLR start rule__ModExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2712:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2716:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2717:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2717:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2718:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2719:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2721:1: 
            {
            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__ModExpression__Group_1__0__Impl


    // $ANTLR start rule__ModExpression__Group_1__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2731:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2735:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2736:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__15548);
            rule__ModExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__15551);
            rule__ModExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group_1__1


    // $ANTLR start rule__ModExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2743:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2747:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2748:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2748:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2749:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2750:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2750:2: rule__ModExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl5578);
            rule__ModExpression__OperatorAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__ModExpression__Group_1__1__Impl


    // $ANTLR start rule__ModExpression__Group_1__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2760:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2764:1: ( rule__ModExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2765:2: rule__ModExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__25608);
            rule__ModExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ModExpression__Group_1__2


    // $ANTLR start rule__ModExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2771:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2775:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2776:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2776:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2777:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2778:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2778:2: rule__ModExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl5635);
            rule__ModExpression__SubExpressionsAssignment_1_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__ModExpression__Group_1__2__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_5__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2794:1: rule__AtomicValuedExpression__Group_5__0 : rule__AtomicValuedExpression__Group_5__0__Impl rule__AtomicValuedExpression__Group_5__1 ;
    public final void rule__AtomicValuedExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2798:1: ( rule__AtomicValuedExpression__Group_5__0__Impl rule__AtomicValuedExpression__Group_5__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2799:2: rule__AtomicValuedExpression__Group_5__0__Impl rule__AtomicValuedExpression__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_5__0__Impl_in_rule__AtomicValuedExpression__Group_5__05671);
            rule__AtomicValuedExpression__Group_5__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_5__1_in_rule__AtomicValuedExpression__Group_5__05674);
            rule__AtomicValuedExpression__Group_5__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_5__0


    // $ANTLR start rule__AtomicValuedExpression__Group_5__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2806:1: rule__AtomicValuedExpression__Group_5__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2810:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2811:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2811:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2812:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__AtomicValuedExpression__Group_5__0__Impl5702); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_5__0__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_5__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2825:1: rule__AtomicValuedExpression__Group_5__1 : rule__AtomicValuedExpression__Group_5__1__Impl rule__AtomicValuedExpression__Group_5__2 ;
    public final void rule__AtomicValuedExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2829:1: ( rule__AtomicValuedExpression__Group_5__1__Impl rule__AtomicValuedExpression__Group_5__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2830:2: rule__AtomicValuedExpression__Group_5__1__Impl rule__AtomicValuedExpression__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_5__1__Impl_in_rule__AtomicValuedExpression__Group_5__15733);
            rule__AtomicValuedExpression__Group_5__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_5__2_in_rule__AtomicValuedExpression__Group_5__15736);
            rule__AtomicValuedExpression__Group_5__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_5__1


    // $ANTLR start rule__AtomicValuedExpression__Group_5__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2837:1: rule__AtomicValuedExpression__Group_5__1__Impl : ( ruleDivExpression ) ;
    public final void rule__AtomicValuedExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2841:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2842:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2842:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2843:1: ruleDivExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getDivExpressionParserRuleCall_5_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_rule__AtomicValuedExpression__Group_5__1__Impl5763);
            ruleDivExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getDivExpressionParserRuleCall_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_5__1__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_5__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2854:1: rule__AtomicValuedExpression__Group_5__2 : rule__AtomicValuedExpression__Group_5__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2858:1: ( rule__AtomicValuedExpression__Group_5__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2859:2: rule__AtomicValuedExpression__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_5__2__Impl_in_rule__AtomicValuedExpression__Group_5__25792);
            rule__AtomicValuedExpression__Group_5__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_5__2


    // $ANTLR start rule__AtomicValuedExpression__Group_5__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2865:1: rule__AtomicValuedExpression__Group_5__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2869:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2870:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2870:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2871:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__AtomicValuedExpression__Group_5__2__Impl5820); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_5__2__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_6__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2890:1: rule__AtomicValuedExpression__Group_6__0 : rule__AtomicValuedExpression__Group_6__0__Impl rule__AtomicValuedExpression__Group_6__1 ;
    public final void rule__AtomicValuedExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2894:1: ( rule__AtomicValuedExpression__Group_6__0__Impl rule__AtomicValuedExpression__Group_6__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2895:2: rule__AtomicValuedExpression__Group_6__0__Impl rule__AtomicValuedExpression__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_6__0__Impl_in_rule__AtomicValuedExpression__Group_6__05857);
            rule__AtomicValuedExpression__Group_6__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_6__1_in_rule__AtomicValuedExpression__Group_6__05860);
            rule__AtomicValuedExpression__Group_6__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_6__0


    // $ANTLR start rule__AtomicValuedExpression__Group_6__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2902:1: rule__AtomicValuedExpression__Group_6__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2906:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2907:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2907:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2908:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__AtomicValuedExpression__Group_6__0__Impl5888); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_6__0__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_6__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2921:1: rule__AtomicValuedExpression__Group_6__1 : rule__AtomicValuedExpression__Group_6__1__Impl rule__AtomicValuedExpression__Group_6__2 ;
    public final void rule__AtomicValuedExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2925:1: ( rule__AtomicValuedExpression__Group_6__1__Impl rule__AtomicValuedExpression__Group_6__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2926:2: rule__AtomicValuedExpression__Group_6__1__Impl rule__AtomicValuedExpression__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_6__1__Impl_in_rule__AtomicValuedExpression__Group_6__15919);
            rule__AtomicValuedExpression__Group_6__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_6__2_in_rule__AtomicValuedExpression__Group_6__15922);
            rule__AtomicValuedExpression__Group_6__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_6__1


    // $ANTLR start rule__AtomicValuedExpression__Group_6__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2933:1: rule__AtomicValuedExpression__Group_6__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2937:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2938:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2938:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2939:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_6_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_6__1__Impl5949);
            ruleValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_6__1__Impl


    // $ANTLR start rule__AtomicValuedExpression__Group_6__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2950:1: rule__AtomicValuedExpression__Group_6__2 : rule__AtomicValuedExpression__Group_6__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2954:1: ( rule__AtomicValuedExpression__Group_6__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2955:2: rule__AtomicValuedExpression__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_6__2__Impl_in_rule__AtomicValuedExpression__Group_6__25978);
            rule__AtomicValuedExpression__Group_6__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_6__2


    // $ANTLR start rule__AtomicValuedExpression__Group_6__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2961:1: rule__AtomicValuedExpression__Group_6__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2965:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2966:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2966:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2967:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__AtomicValuedExpression__Group_6__2__Impl6006); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicValuedExpression__Group_6__2__Impl


    // $ANTLR start rule__DivExpression__Group__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2986:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2990:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2991:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__06043);
            rule__DivExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__06046);
            rule__DivExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__0


    // $ANTLR start rule__DivExpression__Group__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2998:1: rule__DivExpression__Group__0__Impl : ( ruleAtomicValuedExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3002:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3003:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3003:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3004:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__Group__0__Impl6073);
            ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getAtomicValuedExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__0__Impl


    // $ANTLR start rule__DivExpression__Group__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3015:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2 ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3019:1: ( rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3020:2: rule__DivExpression__Group__1__Impl rule__DivExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__16102);
            rule__DivExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__2_in_rule__DivExpression__Group__16105);
            rule__DivExpression__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__1


    // $ANTLR start rule__DivExpression__Group__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3027:1: rule__DivExpression__Group__1__Impl : ( () ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3031:1: ( ( () ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3032:1: ( () )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3032:1: ( () )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3033:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3034:1: ()
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3036:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__1__Impl


    // $ANTLR start rule__DivExpression__Group__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3046:1: rule__DivExpression__Group__2 : rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3 ;
    public final void rule__DivExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3050:1: ( rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3051:2: rule__DivExpression__Group__2__Impl rule__DivExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__2__Impl_in_rule__DivExpression__Group__26163);
            rule__DivExpression__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__3_in_rule__DivExpression__Group__26166);
            rule__DivExpression__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__2


    // $ANTLR start rule__DivExpression__Group__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3058:1: rule__DivExpression__Group__2__Impl : ( ( rule__DivExpression__OperatorAssignment_2 ) ) ;
    public final void rule__DivExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3062:1: ( ( ( rule__DivExpression__OperatorAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3063:1: ( ( rule__DivExpression__OperatorAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3063:1: ( ( rule__DivExpression__OperatorAssignment_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3064:1: ( rule__DivExpression__OperatorAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3065:1: ( rule__DivExpression__OperatorAssignment_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3065:2: rule__DivExpression__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__OperatorAssignment_2_in_rule__DivExpression__Group__2__Impl6193);
            rule__DivExpression__OperatorAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getOperatorAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__2__Impl


    // $ANTLR start rule__DivExpression__Group__3
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3075:1: rule__DivExpression__Group__3 : rule__DivExpression__Group__3__Impl ;
    public final void rule__DivExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3079:1: ( rule__DivExpression__Group__3__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3080:2: rule__DivExpression__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__3__Impl_in_rule__DivExpression__Group__36223);
            rule__DivExpression__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__3


    // $ANTLR start rule__DivExpression__Group__3__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3086:1: rule__DivExpression__Group__3__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_3 ) ) ;
    public final void rule__DivExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3090:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3091:1: ( ( rule__DivExpression__SubExpressionsAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3091:1: ( ( rule__DivExpression__SubExpressionsAssignment_3 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3092:1: ( rule__DivExpression__SubExpressionsAssignment_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_3()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3093:1: ( rule__DivExpression__SubExpressionsAssignment_3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3093:2: rule__DivExpression__SubExpressionsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__SubExpressionsAssignment_3_in_rule__DivExpression__Group__3__Impl6250);
            rule__DivExpression__SubExpressionsAssignment_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__Group__3__Impl


    // $ANTLR start rule__ValueTestExpression__Group__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3111:1: rule__ValueTestExpression__Group__0 : rule__ValueTestExpression__Group__0__Impl rule__ValueTestExpression__Group__1 ;
    public final void rule__ValueTestExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3115:1: ( rule__ValueTestExpression__Group__0__Impl rule__ValueTestExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3116:2: rule__ValueTestExpression__Group__0__Impl rule__ValueTestExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValueTestExpression__Group__0__Impl_in_rule__ValueTestExpression__Group__06288);
            rule__ValueTestExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValueTestExpression__Group__1_in_rule__ValueTestExpression__Group__06291);
            rule__ValueTestExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__0


    // $ANTLR start rule__ValueTestExpression__Group__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3123:1: rule__ValueTestExpression__Group__0__Impl : ( ( rule__ValueTestExpression__OperatorAssignment_0 ) ) ;
    public final void rule__ValueTestExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3127:1: ( ( ( rule__ValueTestExpression__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3128:1: ( ( rule__ValueTestExpression__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3128:1: ( ( rule__ValueTestExpression__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3129:1: ( rule__ValueTestExpression__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3130:1: ( rule__ValueTestExpression__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3130:2: rule__ValueTestExpression__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValueTestExpression__OperatorAssignment_0_in_rule__ValueTestExpression__Group__0__Impl6318);
            rule__ValueTestExpression__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionAccess().getOperatorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__0__Impl


    // $ANTLR start rule__ValueTestExpression__Group__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3140:1: rule__ValueTestExpression__Group__1 : rule__ValueTestExpression__Group__1__Impl rule__ValueTestExpression__Group__2 ;
    public final void rule__ValueTestExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3144:1: ( rule__ValueTestExpression__Group__1__Impl rule__ValueTestExpression__Group__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3145:2: rule__ValueTestExpression__Group__1__Impl rule__ValueTestExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValueTestExpression__Group__1__Impl_in_rule__ValueTestExpression__Group__16348);
            rule__ValueTestExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValueTestExpression__Group__2_in_rule__ValueTestExpression__Group__16351);
            rule__ValueTestExpression__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__1


    // $ANTLR start rule__ValueTestExpression__Group__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3152:1: rule__ValueTestExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__ValueTestExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3156:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3157:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3157:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3158:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ValueTestExpression__Group__1__Impl6379); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__1__Impl


    // $ANTLR start rule__ValueTestExpression__Group__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3171:1: rule__ValueTestExpression__Group__2 : rule__ValueTestExpression__Group__2__Impl rule__ValueTestExpression__Group__3 ;
    public final void rule__ValueTestExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3175:1: ( rule__ValueTestExpression__Group__2__Impl rule__ValueTestExpression__Group__3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3176:2: rule__ValueTestExpression__Group__2__Impl rule__ValueTestExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValueTestExpression__Group__2__Impl_in_rule__ValueTestExpression__Group__26410);
            rule__ValueTestExpression__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValueTestExpression__Group__3_in_rule__ValueTestExpression__Group__26413);
            rule__ValueTestExpression__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__2


    // $ANTLR start rule__ValueTestExpression__Group__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3183:1: rule__ValueTestExpression__Group__2__Impl : ( ( rule__ValueTestExpression__SubExpressionsAssignment_2 ) ) ;
    public final void rule__ValueTestExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3187:1: ( ( ( rule__ValueTestExpression__SubExpressionsAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3188:1: ( ( rule__ValueTestExpression__SubExpressionsAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3188:1: ( ( rule__ValueTestExpression__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3189:1: ( rule__ValueTestExpression__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3190:1: ( rule__ValueTestExpression__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3190:2: rule__ValueTestExpression__SubExpressionsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValueTestExpression__SubExpressionsAssignment_2_in_rule__ValueTestExpression__Group__2__Impl6440);
            rule__ValueTestExpression__SubExpressionsAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionAccess().getSubExpressionsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__2__Impl


    // $ANTLR start rule__ValueTestExpression__Group__3
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3200:1: rule__ValueTestExpression__Group__3 : rule__ValueTestExpression__Group__3__Impl ;
    public final void rule__ValueTestExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3204:1: ( rule__ValueTestExpression__Group__3__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3205:2: rule__ValueTestExpression__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValueTestExpression__Group__3__Impl_in_rule__ValueTestExpression__Group__36470);
            rule__ValueTestExpression__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__3


    // $ANTLR start rule__ValueTestExpression__Group__3__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3211:1: rule__ValueTestExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__ValueTestExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3215:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3216:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3216:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3217:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__ValueTestExpression__Group__3__Impl6498); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__Group__3__Impl


    // $ANTLR start rule__PreValueTestExpression__Group__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3238:1: rule__PreValueTestExpression__Group__0 : rule__PreValueTestExpression__Group__0__Impl rule__PreValueTestExpression__Group__1 ;
    public final void rule__PreValueTestExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3242:1: ( rule__PreValueTestExpression__Group__0__Impl rule__PreValueTestExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3243:2: rule__PreValueTestExpression__Group__0__Impl rule__PreValueTestExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreValueTestExpression__Group__0__Impl_in_rule__PreValueTestExpression__Group__06537);
            rule__PreValueTestExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PreValueTestExpression__Group__1_in_rule__PreValueTestExpression__Group__06540);
            rule__PreValueTestExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__0


    // $ANTLR start rule__PreValueTestExpression__Group__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3250:1: rule__PreValueTestExpression__Group__0__Impl : ( ( rule__PreValueTestExpression__OperatorAssignment_0 ) ) ;
    public final void rule__PreValueTestExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3254:1: ( ( ( rule__PreValueTestExpression__OperatorAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3255:1: ( ( rule__PreValueTestExpression__OperatorAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3255:1: ( ( rule__PreValueTestExpression__OperatorAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3256:1: ( rule__PreValueTestExpression__OperatorAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getOperatorAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3257:1: ( rule__PreValueTestExpression__OperatorAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3257:2: rule__PreValueTestExpression__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreValueTestExpression__OperatorAssignment_0_in_rule__PreValueTestExpression__Group__0__Impl6567);
            rule__PreValueTestExpression__OperatorAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionAccess().getOperatorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__0__Impl


    // $ANTLR start rule__PreValueTestExpression__Group__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3267:1: rule__PreValueTestExpression__Group__1 : rule__PreValueTestExpression__Group__1__Impl rule__PreValueTestExpression__Group__2 ;
    public final void rule__PreValueTestExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3271:1: ( rule__PreValueTestExpression__Group__1__Impl rule__PreValueTestExpression__Group__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3272:2: rule__PreValueTestExpression__Group__1__Impl rule__PreValueTestExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreValueTestExpression__Group__1__Impl_in_rule__PreValueTestExpression__Group__16597);
            rule__PreValueTestExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PreValueTestExpression__Group__2_in_rule__PreValueTestExpression__Group__16600);
            rule__PreValueTestExpression__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__1


    // $ANTLR start rule__PreValueTestExpression__Group__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3279:1: rule__PreValueTestExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__PreValueTestExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3283:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3284:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3284:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3285:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__PreValueTestExpression__Group__1__Impl6628); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__1__Impl


    // $ANTLR start rule__PreValueTestExpression__Group__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3298:1: rule__PreValueTestExpression__Group__2 : rule__PreValueTestExpression__Group__2__Impl rule__PreValueTestExpression__Group__3 ;
    public final void rule__PreValueTestExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3302:1: ( rule__PreValueTestExpression__Group__2__Impl rule__PreValueTestExpression__Group__3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3303:2: rule__PreValueTestExpression__Group__2__Impl rule__PreValueTestExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreValueTestExpression__Group__2__Impl_in_rule__PreValueTestExpression__Group__26659);
            rule__PreValueTestExpression__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__PreValueTestExpression__Group__3_in_rule__PreValueTestExpression__Group__26662);
            rule__PreValueTestExpression__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__2


    // $ANTLR start rule__PreValueTestExpression__Group__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3310:1: rule__PreValueTestExpression__Group__2__Impl : ( ( rule__PreValueTestExpression__SubExpressionsAssignment_2 ) ) ;
    public final void rule__PreValueTestExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3314:1: ( ( ( rule__PreValueTestExpression__SubExpressionsAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3315:1: ( ( rule__PreValueTestExpression__SubExpressionsAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3315:1: ( ( rule__PreValueTestExpression__SubExpressionsAssignment_2 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3316:1: ( rule__PreValueTestExpression__SubExpressionsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getSubExpressionsAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3317:1: ( rule__PreValueTestExpression__SubExpressionsAssignment_2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3317:2: rule__PreValueTestExpression__SubExpressionsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreValueTestExpression__SubExpressionsAssignment_2_in_rule__PreValueTestExpression__Group__2__Impl6689);
            rule__PreValueTestExpression__SubExpressionsAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionAccess().getSubExpressionsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__2__Impl


    // $ANTLR start rule__PreValueTestExpression__Group__3
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3327:1: rule__PreValueTestExpression__Group__3 : rule__PreValueTestExpression__Group__3__Impl ;
    public final void rule__PreValueTestExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3331:1: ( rule__PreValueTestExpression__Group__3__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3332:2: rule__PreValueTestExpression__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PreValueTestExpression__Group__3__Impl_in_rule__PreValueTestExpression__Group__36719);
            rule__PreValueTestExpression__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__3


    // $ANTLR start rule__PreValueTestExpression__Group__3__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3338:1: rule__PreValueTestExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__PreValueTestExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3342:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3343:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3343:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3344:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__PreValueTestExpression__Group__3__Impl6747); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__Group__3__Impl


    // $ANTLR start rule__TextExpression__Group__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3365:1: rule__TextExpression__Group__0 : rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 ;
    public final void rule__TextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3369:1: ( rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3370:2: rule__TextExpression__Group__0__Impl rule__TextExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__06786);
            rule__TextExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__06789);
            rule__TextExpression__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextExpression__Group__0


    // $ANTLR start rule__TextExpression__Group__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3377:1: rule__TextExpression__Group__0__Impl : ( ( rule__TextExpression__CodeAssignment_0 ) ) ;
    public final void rule__TextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3381:1: ( ( ( rule__TextExpression__CodeAssignment_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3382:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3382:1: ( ( rule__TextExpression__CodeAssignment_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3383:1: ( rule__TextExpression__CodeAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeAssignment_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3384:1: ( rule__TextExpression__CodeAssignment_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3384:2: rule__TextExpression__CodeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl6816);
            rule__TextExpression__CodeAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__TextExpression__Group__0__Impl


    // $ANTLR start rule__TextExpression__Group__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3394:1: rule__TextExpression__Group__1 : rule__TextExpression__Group__1__Impl ;
    public final void rule__TextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3398:1: ( rule__TextExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3399:2: rule__TextExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__16846);
            rule__TextExpression__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextExpression__Group__1


    // $ANTLR start rule__TextExpression__Group__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3405:1: rule__TextExpression__Group__1__Impl : ( ( rule__TextExpression__Group_1__0 )? ) ;
    public final void rule__TextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3409:1: ( ( ( rule__TextExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3410:1: ( ( rule__TextExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3410:1: ( ( rule__TextExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3411:1: ( rule__TextExpression__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3412:1: ( rule__TextExpression__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3412:2: rule__TextExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl6873);
                    rule__TextExpression__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__TextExpression__Group__1__Impl


    // $ANTLR start rule__TextExpression__Group_1__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3426:1: rule__TextExpression__Group_1__0 : rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 ;
    public final void rule__TextExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3430:1: ( rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3431:2: rule__TextExpression__Group_1__0__Impl rule__TextExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__06908);
            rule__TextExpression__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__06911);
            rule__TextExpression__Group_1__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextExpression__Group_1__0


    // $ANTLR start rule__TextExpression__Group_1__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3438:1: rule__TextExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__TextExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3442:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3443:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3443:1: ( '(' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3444:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__TextExpression__Group_1__0__Impl6939); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__TextExpression__Group_1__0__Impl


    // $ANTLR start rule__TextExpression__Group_1__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3457:1: rule__TextExpression__Group_1__1 : rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 ;
    public final void rule__TextExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3461:1: ( rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3462:2: rule__TextExpression__Group_1__1__Impl rule__TextExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__16970);
            rule__TextExpression__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__16973);
            rule__TextExpression__Group_1__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextExpression__Group_1__1


    // $ANTLR start rule__TextExpression__Group_1__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3469:1: rule__TextExpression__Group_1__1__Impl : ( ( rule__TextExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__TextExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3473:1: ( ( ( rule__TextExpression__TypeAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3474:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3474:1: ( ( rule__TextExpression__TypeAssignment_1_1 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3475:1: ( rule__TextExpression__TypeAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3476:1: ( rule__TextExpression__TypeAssignment_1_1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3476:2: rule__TextExpression__TypeAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl7000);
            rule__TextExpression__TypeAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__TextExpression__Group_1__1__Impl


    // $ANTLR start rule__TextExpression__Group_1__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3486:1: rule__TextExpression__Group_1__2 : rule__TextExpression__Group_1__2__Impl ;
    public final void rule__TextExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3490:1: ( rule__TextExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3491:2: rule__TextExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__27030);
            rule__TextExpression__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextExpression__Group_1__2


    // $ANTLR start rule__TextExpression__Group_1__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3497:1: rule__TextExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__TextExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3501:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3502:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3502:1: ( ')' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3503:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__TextExpression__Group_1__2__Impl7058); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__TextExpression__Group_1__2__Impl


    // $ANTLR start rule__EIntegerObject__Group__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3522:1: rule__EIntegerObject__Group__0 : rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 ;
    public final void rule__EIntegerObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3526:1: ( rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3527:2: rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EIntegerObject__Group__0__Impl_in_rule__EIntegerObject__Group__07095);
            rule__EIntegerObject__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EIntegerObject__Group__1_in_rule__EIntegerObject__Group__07098);
            rule__EIntegerObject__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EIntegerObject__Group__0


    // $ANTLR start rule__EIntegerObject__Group__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3534:1: rule__EIntegerObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EIntegerObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3538:1: ( ( ( '-' )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3539:1: ( ( '-' )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3539:1: ( ( '-' )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3540:1: ( '-' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3541:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3542:2: '-'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__EIntegerObject__Group__0__Impl7127); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EIntegerObject__Group__0__Impl


    // $ANTLR start rule__EIntegerObject__Group__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3553:1: rule__EIntegerObject__Group__1 : rule__EIntegerObject__Group__1__Impl ;
    public final void rule__EIntegerObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3557:1: ( rule__EIntegerObject__Group__1__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3558:2: rule__EIntegerObject__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EIntegerObject__Group__1__Impl_in_rule__EIntegerObject__Group__17160);
            rule__EIntegerObject__Group__1__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EIntegerObject__Group__1


    // $ANTLR start rule__EIntegerObject__Group__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3564:1: rule__EIntegerObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EIntegerObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3568:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3569:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3569:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3570:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EIntegerObject__Group__1__Impl7187); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EIntegerObject__Group__1__Impl


    // $ANTLR start rule__EFloatObject__Group__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3585:1: rule__EFloatObject__Group__0 : rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 ;
    public final void rule__EFloatObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3589:1: ( rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3590:2: rule__EFloatObject__Group__0__Impl rule__EFloatObject__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__07220);
            rule__EFloatObject__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__07223);
            rule__EFloatObject__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__0


    // $ANTLR start rule__EFloatObject__Group__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3597:1: rule__EFloatObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3601:1: ( ( ( '-' )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3602:1: ( ( '-' )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3602:1: ( ( '-' )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3603:1: ( '-' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3604:1: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3605:2: '-'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__EFloatObject__Group__0__Impl7252); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__0__Impl


    // $ANTLR start rule__EFloatObject__Group__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3616:1: rule__EFloatObject__Group__1 : rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 ;
    public final void rule__EFloatObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3620:1: ( rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3621:2: rule__EFloatObject__Group__1__Impl rule__EFloatObject__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__17285);
            rule__EFloatObject__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__17288);
            rule__EFloatObject__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__1


    // $ANTLR start rule__EFloatObject__Group__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3628:1: rule__EFloatObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloatObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3632:1: ( ( ( RULE_INT )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3633:1: ( ( RULE_INT )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3633:1: ( ( RULE_INT )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3634:1: ( RULE_INT )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3635:1: ( RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3635:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl7316); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__1__Impl


    // $ANTLR start rule__EFloatObject__Group__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3645:1: rule__EFloatObject__Group__2 : rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 ;
    public final void rule__EFloatObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3649:1: ( rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3650:2: rule__EFloatObject__Group__2__Impl rule__EFloatObject__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__27347);
            rule__EFloatObject__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__27350);
            rule__EFloatObject__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__2


    // $ANTLR start rule__EFloatObject__Group__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3657:1: rule__EFloatObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloatObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3661:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3662:1: ( '.' )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3662:1: ( '.' )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3663:1: '.'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__EFloatObject__Group__2__Impl7378); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__2__Impl


    // $ANTLR start rule__EFloatObject__Group__3
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3676:1: rule__EFloatObject__Group__3 : rule__EFloatObject__Group__3__Impl rule__EFloatObject__Group__4 ;
    public final void rule__EFloatObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3680:1: ( rule__EFloatObject__Group__3__Impl rule__EFloatObject__Group__4 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3681:2: rule__EFloatObject__Group__3__Impl rule__EFloatObject__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__37409);
            rule__EFloatObject__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group__4_in_rule__EFloatObject__Group__37412);
            rule__EFloatObject__Group__4();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__3


    // $ANTLR start rule__EFloatObject__Group__3__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3688:1: rule__EFloatObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3692:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3693:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3693:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3694:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl7439); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__3__Impl


    // $ANTLR start rule__EFloatObject__Group__4
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3705:1: rule__EFloatObject__Group__4 : rule__EFloatObject__Group__4__Impl ;
    public final void rule__EFloatObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3709:1: ( rule__EFloatObject__Group__4__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3710:2: rule__EFloatObject__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group__4__Impl_in_rule__EFloatObject__Group__47468);
            rule__EFloatObject__Group__4__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__4


    // $ANTLR start rule__EFloatObject__Group__4__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3716:1: rule__EFloatObject__Group__4__Impl : ( ( rule__EFloatObject__Group_4__0 )? ) ;
    public final void rule__EFloatObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3720:1: ( ( ( rule__EFloatObject__Group_4__0 )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3721:1: ( ( rule__EFloatObject__Group_4__0 )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3721:1: ( ( rule__EFloatObject__Group_4__0 )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3722:1: ( rule__EFloatObject__Group_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getGroup_4()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3723:1: ( rule__EFloatObject__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=21 && LA18_0<=22)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3723:2: rule__EFloatObject__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group_4__0_in_rule__EFloatObject__Group__4__Impl7495);
                    rule__EFloatObject__Group_4__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group__4__Impl


    // $ANTLR start rule__EFloatObject__Group_4__0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3743:1: rule__EFloatObject__Group_4__0 : rule__EFloatObject__Group_4__0__Impl rule__EFloatObject__Group_4__1 ;
    public final void rule__EFloatObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3747:1: ( rule__EFloatObject__Group_4__0__Impl rule__EFloatObject__Group_4__1 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3748:2: rule__EFloatObject__Group_4__0__Impl rule__EFloatObject__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group_4__0__Impl_in_rule__EFloatObject__Group_4__07536);
            rule__EFloatObject__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group_4__1_in_rule__EFloatObject__Group_4__07539);
            rule__EFloatObject__Group_4__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group_4__0


    // $ANTLR start rule__EFloatObject__Group_4__0__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3755:1: rule__EFloatObject__Group_4__0__Impl : ( ( rule__EFloatObject__Alternatives_4_0 ) ) ;
    public final void rule__EFloatObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3759:1: ( ( ( rule__EFloatObject__Alternatives_4_0 ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3760:1: ( ( rule__EFloatObject__Alternatives_4_0 ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3760:1: ( ( rule__EFloatObject__Alternatives_4_0 ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3761:1: ( rule__EFloatObject__Alternatives_4_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getAlternatives_4_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3762:1: ( rule__EFloatObject__Alternatives_4_0 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3762:2: rule__EFloatObject__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Alternatives_4_0_in_rule__EFloatObject__Group_4__0__Impl7566);
            rule__EFloatObject__Alternatives_4_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getAlternatives_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group_4__0__Impl


    // $ANTLR start rule__EFloatObject__Group_4__1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3772:1: rule__EFloatObject__Group_4__1 : rule__EFloatObject__Group_4__1__Impl rule__EFloatObject__Group_4__2 ;
    public final void rule__EFloatObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3776:1: ( rule__EFloatObject__Group_4__1__Impl rule__EFloatObject__Group_4__2 )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3777:2: rule__EFloatObject__Group_4__1__Impl rule__EFloatObject__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group_4__1__Impl_in_rule__EFloatObject__Group_4__17596);
            rule__EFloatObject__Group_4__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group_4__2_in_rule__EFloatObject__Group_4__17599);
            rule__EFloatObject__Group_4__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group_4__1


    // $ANTLR start rule__EFloatObject__Group_4__1__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3784:1: rule__EFloatObject__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloatObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3788:1: ( ( ( '-' )? ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3789:1: ( ( '-' )? )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3789:1: ( ( '-' )? )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3790:1: ( '-' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_4_1()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3791:1: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==16) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3792:2: '-'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__EFloatObject__Group_4__1__Impl7628); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group_4__1__Impl


    // $ANTLR start rule__EFloatObject__Group_4__2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3803:1: rule__EFloatObject__Group_4__2 : rule__EFloatObject__Group_4__2__Impl ;
    public final void rule__EFloatObject__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3807:1: ( rule__EFloatObject__Group_4__2__Impl )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3808:2: rule__EFloatObject__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EFloatObject__Group_4__2__Impl_in_rule__EFloatObject__Group_4__27661);
            rule__EFloatObject__Group_4__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group_4__2


    // $ANTLR start rule__EFloatObject__Group_4__2__Impl
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3814:1: rule__EFloatObject__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloatObject__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3818:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3819:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3819:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3820:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_4_2()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EFloatObject__Group_4__2__Impl7688); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EFloatObject__Group_4__2__Impl


    // $ANTLR start rule__OrExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3838:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3842:1: ( ( ruleOrOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3843:1: ( ruleOrOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3843:1: ( ruleOrOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3844:1: ruleOrOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_17728);
            ruleOrOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__OrExpression__OperatorAssignment_1_1


    // $ANTLR start rule__OrExpression__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3853:1: rule__OrExpression__SubExpressionsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3857:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3858:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3858:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3859:1: ruleAndExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_27759);
            ruleAndExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__OrExpression__SubExpressionsAssignment_1_2


    // $ANTLR start rule__AndExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3868:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3872:1: ( ( ruleAndOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3873:1: ( ruleAndOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3873:1: ( ruleAndOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3874:1: ruleAndOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_17790);
            ruleAndOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__AndExpression__OperatorAssignment_1_1


    // $ANTLR start rule__AndExpression__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3883:1: rule__AndExpression__SubExpressionsAssignment_1_2 : ( ruleNotExpression ) ;
    public final void rule__AndExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3887:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3888:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3888:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3889:1: ruleNotExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__AndExpression__SubExpressionsAssignment_1_27821);
            ruleNotExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExpression__SubExpressionsAssignment_1_2


    // $ANTLR start rule__NotExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3898:1: rule__NotExpression__OperatorAssignment_1_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3902:1: ( ( ruleNotOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3903:1: ( ruleNotOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3903:1: ( ruleNotOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3904:1: ruleNotOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_1_17852);
            ruleNotOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__OperatorAssignment_1_1


    // $ANTLR start rule__NotExpression__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3913:1: rule__NotExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3917:1: ( ( ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3918:1: ( ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3918:1: ( ruleAtomicExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3919:1: ruleAtomicExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAtomicExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__NotExpression__SubExpressionsAssignment_1_27883);
            ruleAtomicExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubExpressionsAtomicExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NotExpression__SubExpressionsAssignment_1_2


    // $ANTLR start rule__AtomicExpression__OperatorAssignment_2_1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3928:1: rule__AtomicExpression__OperatorAssignment_2_1 : ( rulePreOperator ) ;
    public final void rule__AtomicExpression__OperatorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3932:1: ( ( rulePreOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3933:1: ( rulePreOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3933:1: ( rulePreOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3934:1: rulePreOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getOperatorPreOperatorEnumRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_rule__AtomicExpression__OperatorAssignment_2_17914);
            rulePreOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getOperatorPreOperatorEnumRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__OperatorAssignment_2_1


    // $ANTLR start rule__AtomicExpression__SubExpressionsAssignment_2_3
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3943:1: rule__AtomicExpression__SubExpressionsAssignment_2_3 : ( ruleSignalReference ) ;
    public final void rule__AtomicExpression__SubExpressionsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3947:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3948:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3948:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3949:1: ruleSignalReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignalReference_in_rule__AtomicExpression__SubExpressionsAssignment_2_37945);
            ruleSignalReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AtomicExpression__SubExpressionsAssignment_2_3


    // $ANTLR start rule__SignalReference__SignalAssignment
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3958:1: rule__SignalReference__SignalAssignment : ( ( ruleEString ) ) ;
    public final void rule__SignalReference__SignalAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3962:1: ( ( ( ruleEString ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3963:1: ( ( ruleEString ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3963:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3964:1: ( ruleEString )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3965:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3966:1: ruleEString
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSignalReferenceAccess().getSignalSignalEStringParserRuleCall_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SignalReference__SignalAssignment7980);
            ruleEString();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getSignalSignalEStringParserRuleCall_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignalReference__SignalAssignment


    // $ANTLR start rule__CompareOperation__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3977:1: rule__CompareOperation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3981:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3982:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3982:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3983:1: ruleCompareOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_18015);
            ruleCompareOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__CompareOperation__OperatorAssignment_1_1


    // $ANTLR start rule__CompareOperation__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3992:1: rule__CompareOperation__SubExpressionsAssignment_1_2 : ( ruleValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3996:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3997:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3997:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:3998:1: ruleValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_28046);
            ruleValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCompareOperationAccess().getSubExpressionsValuedExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CompareOperation__SubExpressionsAssignment_1_2


    // $ANTLR start rule__AddExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4007:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4011:1: ( ( ruleAddOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4012:1: ( ruleAddOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4012:1: ( ruleAddOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4013:1: ruleAddOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_18077);
            ruleAddOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__AddExpression__OperatorAssignment_1_1


    // $ANTLR start rule__AddExpression__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4022:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4026:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4027:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4027:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4028:1: ruleSubExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_28108);
            ruleSubExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__AddExpression__SubExpressionsAssignment_1_2


    // $ANTLR start rule__SubExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4037:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4041:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4042:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4042:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4043:1: ruleSubOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_18139);
            ruleSubOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__SubExpression__OperatorAssignment_1_1


    // $ANTLR start rule__SubExpression__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4052:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4056:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4057:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4057:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4058:1: ruleMultExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_28170);
            ruleMultExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__SubExpression__SubExpressionsAssignment_1_2


    // $ANTLR start rule__MultExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4067:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4071:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4072:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4072:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4073:1: ruleMultOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_18201);
            ruleMultOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__MultExpression__OperatorAssignment_1_1


    // $ANTLR start rule__MultExpression__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4082:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4086:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4087:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4087:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4088:1: ruleModExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__MultExpression__SubExpressionsAssignment_1_28232);
            ruleModExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MultExpression__SubExpressionsAssignment_1_2


    // $ANTLR start rule__ModExpression__OperatorAssignment_1_1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4097:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4101:1: ( ( ruleModOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4102:1: ( ruleModOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4102:1: ( ruleModOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4103:1: ruleModOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_18263);
            ruleModOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__ModExpression__OperatorAssignment_1_1


    // $ANTLR start rule__ModExpression__SubExpressionsAssignment_1_2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4112:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4116:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4117:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4117:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4118:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_28294);
            ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__ModExpression__SubExpressionsAssignment_1_2


    // $ANTLR start rule__DivExpression__OperatorAssignment_2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4127:1: rule__DivExpression__OperatorAssignment_2 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4131:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4132:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4132:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4133:1: ruleDivOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_28325);
            ruleDivOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__OperatorAssignment_2


    // $ANTLR start rule__DivExpression__SubExpressionsAssignment_3
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4142:1: rule__DivExpression__SubExpressionsAssignment_3 : ( ruleAtomicValuedExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4146:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4147:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4147:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4148:1: ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__SubExpressionsAssignment_38356);
            ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DivExpression__SubExpressionsAssignment_3


    // $ANTLR start rule__VariableReference__VariableAssignment
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4157:1: rule__VariableReference__VariableAssignment : ( ( ruleEString ) ) ;
    public final void rule__VariableReference__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4161:1: ( ( ( ruleEString ) ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4162:1: ( ( ruleEString ) )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4162:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4163:1: ( ruleEString )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4164:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4165:1: ruleEString
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getVariableVariableEStringParserRuleCall_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__VariableReference__VariableAssignment8391);
            ruleEString();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableVariableEStringParserRuleCall_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VariableReference__VariableAssignment


    // $ANTLR start rule__ValueTestExpression__OperatorAssignment_0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4176:1: rule__ValueTestExpression__OperatorAssignment_0 : ( ruleValueTestOperator ) ;
    public final void rule__ValueTestExpression__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4180:1: ( ( ruleValueTestOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4181:1: ( ruleValueTestOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4181:1: ( ruleValueTestOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4182:1: ruleValueTestOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTestOperator_in_rule__ValueTestExpression__OperatorAssignment_08426);
            ruleValueTestOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__OperatorAssignment_0


    // $ANTLR start rule__ValueTestExpression__SubExpressionsAssignment_2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4191:1: rule__ValueTestExpression__SubExpressionsAssignment_2 : ( ruleSignalReference ) ;
    public final void rule__ValueTestExpression__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4195:1: ( ( ruleSignalReference ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4196:1: ( ruleSignalReference )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4196:1: ( ruleSignalReference )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4197:1: ruleSignalReference
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getValueTestExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignalReference_in_rule__ValueTestExpression__SubExpressionsAssignment_28457);
            ruleSignalReference();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getValueTestExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ValueTestExpression__SubExpressionsAssignment_2


    // $ANTLR start rule__PreValueTestExpression__OperatorAssignment_0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4206:1: rule__PreValueTestExpression__OperatorAssignment_0 : ( rulePreOperator ) ;
    public final void rule__PreValueTestExpression__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4210:1: ( ( rulePreOperator ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4211:1: ( rulePreOperator )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4211:1: ( rulePreOperator )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4212:1: rulePreOperator
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_rule__PreValueTestExpression__OperatorAssignment_08488);
            rulePreOperator();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__OperatorAssignment_0


    // $ANTLR start rule__PreValueTestExpression__SubExpressionsAssignment_2
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4221:1: rule__PreValueTestExpression__SubExpressionsAssignment_2 : ( ruleValueTestExpression ) ;
    public final void rule__PreValueTestExpression__SubExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4225:1: ( ( ruleValueTestExpression ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4226:1: ( ruleValueTestExpression )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4226:1: ( ruleValueTestExpression )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4227:1: ruleValueTestExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPreValueTestExpressionAccess().getSubExpressionsValueTestExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueTestExpression_in_rule__PreValueTestExpression__SubExpressionsAssignment_28519);
            ruleValueTestExpression();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPreValueTestExpressionAccess().getSubExpressionsValueTestExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PreValueTestExpression__SubExpressionsAssignment_2


    // $ANTLR start rule__TextExpression__CodeAssignment_0
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4236:1: rule__TextExpression__CodeAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TextExpression__CodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4240:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4241:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4241:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4242:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_08550); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTextExpressionAccess().getCodeSTRINGTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TextExpression__CodeAssignment_0


    // $ANTLR start rule__TextExpression__TypeAssignment_1_1
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4251:1: rule__TextExpression__TypeAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__TextExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4255:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4256:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4256:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4257:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_18581); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__TextExpression__TypeAssignment_1_1


    // $ANTLR start rule__IntValue__ValueAssignment
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4266:1: rule__IntValue__ValueAssignment : ( ruleEIntegerObject ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4270:1: ( ( ruleEIntegerObject ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4271:1: ( ruleEIntegerObject )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4271:1: ( ruleEIntegerObject )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4272:1: ruleEIntegerObject
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_rule__IntValue__ValueAssignment8612);
            ruleEIntegerObject();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getIntValueAccess().getValueEIntegerObjectParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntValue__ValueAssignment


    // $ANTLR start rule__FloatValue__ValueAssignment
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4281:1: rule__FloatValue__ValueAssignment : ( ruleEFloatObject ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4285:1: ( ( ruleEFloatObject ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4286:1: ( ruleEFloatObject )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4286:1: ( ruleEFloatObject )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4287:1: ruleEFloatObject
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment8643);
            ruleEFloatObject();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FloatValue__ValueAssignment


    // $ANTLR start rule__BooleanValue__ValueAssignment
    // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4296:1: rule__BooleanValue__ValueAssignment : ( ruleEBooleanObject ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4300:1: ( ( ruleEBooleanObject ) )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4301:1: ( ruleEBooleanObject )
            {
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4301:1: ( ruleEBooleanObject )
            // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:4302:1: ruleEBooleanObject
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueEBooleanObjectParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEBooleanObject_in_rule__BooleanValue__ValueAssignment8674);
            ruleEBooleanObject();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueEBooleanObjectParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BooleanValue__ValueAssignment

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1058:6: ( ( ( rule__AtomicExpression__Group_3__0 ) ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1058:6: ( ( rule__AtomicExpression__Group_3__0 ) )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1058:6: ( ( rule__AtomicExpression__Group_3__0 ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1059:1: ( rule__AtomicExpression__Group_3__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicExpressionAccess().getGroup_3()); 
        }
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1060:1: ( rule__AtomicExpression__Group_3__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1060:2: rule__AtomicExpression__Group_3__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_3__0_in_synpred52165);
        rule__AtomicExpression__Group_3__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1092:6: ( ( ruleVariableReference ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1092:6: ( ruleVariableReference )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1092:6: ( ruleVariableReference )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1093:1: ruleVariableReference
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getVariableReferenceParserRuleCall_2()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleVariableReference_in_synpred82250);
        ruleVariableReference();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1110:6: ( ( ( rule__AtomicValuedExpression__Group_5__0 ) ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1110:6: ( ( rule__AtomicValuedExpression__Group_5__0 ) )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1110:6: ( ( rule__AtomicValuedExpression__Group_5__0 ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1111:1: ( rule__AtomicValuedExpression__Group_5__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_5()); 
        }
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1112:1: ( rule__AtomicValuedExpression__Group_5__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1112:2: rule__AtomicValuedExpression__Group_5__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_5__0_in_synpred112301);
        rule__AtomicValuedExpression__Group_5__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1116:6: ( ( ( rule__AtomicValuedExpression__Group_6__0 ) ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1116:6: ( ( rule__AtomicValuedExpression__Group_6__0 ) )
        {
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1116:6: ( ( rule__AtomicValuedExpression__Group_6__0 ) )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1117:1: ( rule__AtomicValuedExpression__Group_6__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_6()); 
        }
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1118:1: ( rule__AtomicValuedExpression__Group_6__0 )
        // ../de.cau.cs.kieler.core.expressions.ui/src-gen/de/cau/cs/kieler/core/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1118:2: rule__AtomicValuedExpression__Group_6__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_6__0_in_synpred122319);
        rule__AtomicValuedExpression__Group_6__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12

    public final boolean synpred12() {
        backtracking++;
        int start = input.mark();
        try {
            synpred12_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred11() {
        backtracking++;
        int start = input.mark();
        try {
            synpred11_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred8() {
        backtracking++;
        int start = input.mark();
        try {
            synpred8_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleExpression100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression126 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleBooleanExpression159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression185 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression365 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SignalReference__SignalAssignment_in_ruleSignalReference458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group__0_in_ruleCompareOperation518 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression784 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression904 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference964 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableReference__VariableAssignment_in_ruleVariableReference997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTestExpression_in_entryRuleValueTestExpression1024 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValueTestExpression1031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValueTestExpression__Group__0_in_ruleValueTestExpression1057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreValueTestExpression_in_entryRulePreValueTestExpression1084 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePreValueTestExpression1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__0_in_rulePreValueTestExpression1117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression1144 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression1151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__0_in_ruleTextExpression1177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1204 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1264 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1324 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject1384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject1391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EIntegerObject__Group__0_in_ruleEIntegerObject1417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject1444 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject1451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group__0_in_ruleEFloatObject1477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBooleanObject_in_entryRuleEBooleanObject1504 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBooleanObject1511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBooleanObject__Alternatives_in_ruleEBooleanObject1537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1564 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString1597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rulePreOperator1671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleOrOperator1710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleAndOperator1749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleNotOperator1788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleAddOperator1827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleSubOperator1866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleMultOperator1905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleModOperator1944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleDivOperator1983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleValueTestOperator2022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_1__0_in_rule__NotExpression__Alternatives2080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives2113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignalReference_in_rule__AtomicExpression__Alternatives2130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives2147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__0_in_rule__AtomicExpression__Alternatives2165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__0_in_rule__AtomicExpression__Alternatives2183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives2216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives2233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_rule__AtomicValuedExpression__Alternatives2250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTestExpression_in_rule__AtomicValuedExpression__Alternatives2267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreValueTestExpression_in_rule__AtomicValuedExpression__Alternatives2284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__0_in_rule__AtomicValuedExpression__Alternatives2301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__0_in_rule__AtomicValuedExpression__Alternatives2319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_rule__AtomicValuedExpression__Alternatives2337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EFloatObject__Alternatives_4_02370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__EFloatObject__Alternatives_4_02390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__EBooleanObject__Alternatives2425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EBooleanObject__Alternatives2445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__CompareOperator__Alternatives2529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__CompareOperator__Alternatives2550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CompareOperator__Alternatives2571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CompareOperator__Alternatives2592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CompareOperator__Alternatives2613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__CompareOperator__Alternatives2634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__02669 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__02672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl2699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__12728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl2755 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__02790 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__02793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__12851 = new BitSet(new long[]{0x0000000081804830L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__12854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl2881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__22911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__02974 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__02977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__AndExpression__Group__0__Impl3004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__13033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl3060 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__03095 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__03098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__13156 = new BitSet(new long[]{0x0000000081804830L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__13159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__23216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl3243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_1__0__Impl_in_rule__NotExpression__Group_1__03279 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_1__1_in_rule__NotExpression__Group_1__03282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_1__1__Impl_in_rule__NotExpression__Group_1__13340 = new BitSet(new long[]{0x0000000081800830L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_1__2_in_rule__NotExpression__Group_1__13343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__OperatorAssignment_1_1_in_rule__NotExpression__Group_1__1__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_1__2__Impl_in_rule__NotExpression__Group_1__23400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__SubExpressionsAssignment_1_2_in_rule__NotExpression__Group_1__2__Impl3427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__03463 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__03466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__13524 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__13527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__OperatorAssignment_2_1_in_rule__AtomicExpression__Group_2__1__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__23584 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__3_in_rule__AtomicExpression__Group_2__23587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__AtomicExpression__Group_2__2__Impl3615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__3__Impl_in_rule__AtomicExpression__Group_2__33646 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__4_in_rule__AtomicExpression__Group_2__33649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__SubExpressionsAssignment_2_3_in_rule__AtomicExpression__Group_2__3__Impl3676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__4__Impl_in_rule__AtomicExpression__Group_2__43706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__AtomicExpression__Group_2__4__Impl3734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__0__Impl_in_rule__AtomicExpression__Group_3__03775 = new BitSet(new long[]{0x0000000280110870L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__1_in_rule__AtomicExpression__Group_3__03778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__AtomicExpression__Group_3__0__Impl3806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__1__Impl_in_rule__AtomicExpression__Group_3__13837 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__2_in_rule__AtomicExpression__Group_3__13840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AtomicExpression__Group_3__1__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__2__Impl_in_rule__AtomicExpression__Group_3__23896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__AtomicExpression__Group_3__2__Impl3924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__0__Impl_in_rule__AtomicExpression__Group_4__03961 = new BitSet(new long[]{0x0000000081804830L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__1_in_rule__AtomicExpression__Group_4__03964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__AtomicExpression__Group_4__0__Impl3992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__1__Impl_in_rule__AtomicExpression__Group_4__14023 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__2_in_rule__AtomicExpression__Group_4__14026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_4__1__Impl4053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_4__2__Impl_in_rule__AtomicExpression__Group_4__24082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__AtomicExpression__Group_4__2__Impl4110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group__0__Impl_in_rule__CompareOperation__Group__04147 = new BitSet(new long[]{0x000000007E000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group__1_in_rule__CompareOperation__Group__04150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__CompareOperation__Group__0__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group__1__Impl_in_rule__CompareOperation__Group__14206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0_in_rule__CompareOperation__Group__1__Impl4233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__0__Impl_in_rule__CompareOperation__Group_1__04267 = new BitSet(new long[]{0x000000007E000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1_in_rule__CompareOperation__Group_1__04270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__1__Impl_in_rule__CompareOperation__Group_1__14328 = new BitSet(new long[]{0x0000000280110870L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2_in_rule__CompareOperation__Group_1__14331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_1_1_in_rule__CompareOperation__Group_1__1__Impl4358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_1__2__Impl_in_rule__CompareOperation__Group_1__24388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_1_2_in_rule__CompareOperation__Group_1__2__Impl4415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__04451 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__04454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl4481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__14510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl4537 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__04572 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__04575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__14633 = new BitSet(new long[]{0x0000000280110870L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__14636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl4663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__24693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl4720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__04756 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__04759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl4786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__14815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl4842 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__04877 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__04880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__14938 = new BitSet(new long[]{0x0000000280110870L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__14941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl4968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__24998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl5025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__05061 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__05064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__MultExpression__Group__0__Impl5091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__15120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl5147 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__05182 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__05185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__15243 = new BitSet(new long[]{0x0000000280110870L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__15246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl5273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__25303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl5330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__05366 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__05369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__Group__0__Impl5396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__15425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl5452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__05487 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__05490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__15548 = new BitSet(new long[]{0x0000000280110870L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__15551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl5578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__25608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl5635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__0__Impl_in_rule__AtomicValuedExpression__Group_5__05671 = new BitSet(new long[]{0x0000000280110870L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__1_in_rule__AtomicValuedExpression__Group_5__05674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__AtomicValuedExpression__Group_5__0__Impl5702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__1__Impl_in_rule__AtomicValuedExpression__Group_5__15733 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__2_in_rule__AtomicValuedExpression__Group_5__15736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_rule__AtomicValuedExpression__Group_5__1__Impl5763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__2__Impl_in_rule__AtomicValuedExpression__Group_5__25792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__AtomicValuedExpression__Group_5__2__Impl5820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__0__Impl_in_rule__AtomicValuedExpression__Group_6__05857 = new BitSet(new long[]{0x0000000280110870L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__1_in_rule__AtomicValuedExpression__Group_6__05860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__AtomicValuedExpression__Group_6__0__Impl5888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__1__Impl_in_rule__AtomicValuedExpression__Group_6__15919 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__2_in_rule__AtomicValuedExpression__Group_6__15922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_6__1__Impl5949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__2__Impl_in_rule__AtomicValuedExpression__Group_6__25978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__AtomicValuedExpression__Group_6__2__Impl6006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__06043 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__06046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__Group__0__Impl6073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__16102 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__2_in_rule__DivExpression__Group__16105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__2__Impl_in_rule__DivExpression__Group__26163 = new BitSet(new long[]{0x0000000280110870L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__3_in_rule__DivExpression__Group__26166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__OperatorAssignment_2_in_rule__DivExpression__Group__2__Impl6193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__3__Impl_in_rule__DivExpression__Group__36223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__SubExpressionsAssignment_3_in_rule__DivExpression__Group__3__Impl6250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValueTestExpression__Group__0__Impl_in_rule__ValueTestExpression__Group__06288 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ValueTestExpression__Group__1_in_rule__ValueTestExpression__Group__06291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValueTestExpression__OperatorAssignment_0_in_rule__ValueTestExpression__Group__0__Impl6318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValueTestExpression__Group__1__Impl_in_rule__ValueTestExpression__Group__16348 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ValueTestExpression__Group__2_in_rule__ValueTestExpression__Group__16351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ValueTestExpression__Group__1__Impl6379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValueTestExpression__Group__2__Impl_in_rule__ValueTestExpression__Group__26410 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__ValueTestExpression__Group__3_in_rule__ValueTestExpression__Group__26413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValueTestExpression__SubExpressionsAssignment_2_in_rule__ValueTestExpression__Group__2__Impl6440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValueTestExpression__Group__3__Impl_in_rule__ValueTestExpression__Group__36470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__ValueTestExpression__Group__3__Impl6498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__0__Impl_in_rule__PreValueTestExpression__Group__06537 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__1_in_rule__PreValueTestExpression__Group__06540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreValueTestExpression__OperatorAssignment_0_in_rule__PreValueTestExpression__Group__0__Impl6567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__1__Impl_in_rule__PreValueTestExpression__Group__16597 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__2_in_rule__PreValueTestExpression__Group__16600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__PreValueTestExpression__Group__1__Impl6628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__2__Impl_in_rule__PreValueTestExpression__Group__26659 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__3_in_rule__PreValueTestExpression__Group__26662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreValueTestExpression__SubExpressionsAssignment_2_in_rule__PreValueTestExpression__Group__2__Impl6689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PreValueTestExpression__Group__3__Impl_in_rule__PreValueTestExpression__Group__36719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__PreValueTestExpression__Group__3__Impl6747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__0__Impl_in_rule__TextExpression__Group__06786 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__1_in_rule__TextExpression__Group__06789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__CodeAssignment_0_in_rule__TextExpression__Group__0__Impl6816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group__1__Impl_in_rule__TextExpression__Group__16846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__0_in_rule__TextExpression__Group__1__Impl6873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__0__Impl_in_rule__TextExpression__Group_1__06908 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__1_in_rule__TextExpression__Group_1__06911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__TextExpression__Group_1__0__Impl6939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__1__Impl_in_rule__TextExpression__Group_1__16970 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__2_in_rule__TextExpression__Group_1__16973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__TypeAssignment_1_1_in_rule__TextExpression__Group_1__1__Impl7000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__Group_1__2__Impl_in_rule__TextExpression__Group_1__27030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__TextExpression__Group_1__2__Impl7058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EIntegerObject__Group__0__Impl_in_rule__EIntegerObject__Group__07095 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EIntegerObject__Group__1_in_rule__EIntegerObject__Group__07098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__EIntegerObject__Group__0__Impl7127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EIntegerObject__Group__1__Impl_in_rule__EIntegerObject__Group__17160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EIntegerObject__Group__1__Impl7187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group__0__Impl_in_rule__EFloatObject__Group__07220 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group__1_in_rule__EFloatObject__Group__07223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__EFloatObject__Group__0__Impl7252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group__1__Impl_in_rule__EFloatObject__Group__17285 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group__2_in_rule__EFloatObject__Group__17288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__1__Impl7316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group__2__Impl_in_rule__EFloatObject__Group__27347 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group__3_in_rule__EFloatObject__Group__27350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__EFloatObject__Group__2__Impl7378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group__3__Impl_in_rule__EFloatObject__Group__37409 = new BitSet(new long[]{0x0000000000600002L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group__4_in_rule__EFloatObject__Group__37412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group__3__Impl7439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group__4__Impl_in_rule__EFloatObject__Group__47468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group_4__0_in_rule__EFloatObject__Group__4__Impl7495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group_4__0__Impl_in_rule__EFloatObject__Group_4__07536 = new BitSet(new long[]{0x0000000000010040L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group_4__1_in_rule__EFloatObject__Group_4__07539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloatObject__Alternatives_4_0_in_rule__EFloatObject__Group_4__0__Impl7566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group_4__1__Impl_in_rule__EFloatObject__Group_4__17596 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group_4__2_in_rule__EFloatObject__Group_4__17599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__EFloatObject__Group_4__1__Impl7628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EFloatObject__Group_4__2__Impl_in_rule__EFloatObject__Group_4__27661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EFloatObject__Group_4__2__Impl7688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_17728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_27759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_17790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__AndExpression__SubExpressionsAssignment_1_27821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_1_17852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__NotExpression__SubExpressionsAssignment_1_27883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_rule__AtomicExpression__OperatorAssignment_2_17914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignalReference_in_rule__AtomicExpression__SubExpressionsAssignment_2_37945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SignalReference__SignalAssignment7980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_1_18015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_1_28046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_18077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_28108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_18139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_28170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_18201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__MultExpression__SubExpressionsAssignment_1_28232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_18263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_28294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_28325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__DivExpression__SubExpressionsAssignment_38356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__VariableReference__VariableAssignment8391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTestOperator_in_rule__ValueTestExpression__OperatorAssignment_08426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignalReference_in_rule__ValueTestExpression__SubExpressionsAssignment_28457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_rule__PreValueTestExpression__OperatorAssignment_08488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTestExpression_in_rule__PreValueTestExpression__SubExpressionsAssignment_28519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TextExpression__CodeAssignment_08550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TextExpression__TypeAssignment_1_18581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_rule__IntValue__ValueAssignment8612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloatObject_in_rule__FloatValue__ValueAssignment8643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBooleanObject_in_rule__BooleanValue__ValueAssignment8674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_3__0_in_synpred52165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableReference_in_synpred82250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_5__0_in_synpred112301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_6__0_in_synpred122319 = new BitSet(new long[]{0x0000000000000002L});
    }


}