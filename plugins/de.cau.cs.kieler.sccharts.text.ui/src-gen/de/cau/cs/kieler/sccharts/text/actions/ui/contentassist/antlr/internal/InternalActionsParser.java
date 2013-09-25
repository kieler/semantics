package de.cau.cs.kieler.sccharts.text.actions.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.sccharts.text.actions.services.ActionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalActionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'pre'", "'|'", "'&'", "'!'", "'+'", "'-'", "'*'", "'mod'", "'val'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'/'", "';'", "'('", "')'", "':='", "'@'", "'['", "']'", "'.'"
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
    public static final int RULE_HOSTCODE=7;
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
    public static final int RULE_INT=6;
    public static final int RULE_WS=14;
    public static final int RULE_COMMENT_ANNOTATION=10;

    // delegates
    // delegators


        public InternalActionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActionsParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g"; }


     
     	private ActionsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ActionsGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleTransition"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:61:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:62:1: ( ruleTransition EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:63:1: ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition67);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:70:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:74:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:75:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:75:1: ( ( rule__Transition__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:76:1: ( rule__Transition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:77:1: ( rule__Transition__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:77:2: rule__Transition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0_in_ruleTransition100);
            rule__Transition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEffect"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:97:1: entryRuleEffect : ruleEffect EOF ;
    public final void entryRuleEffect() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:98:1: ( ruleEffect EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:99:1: ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEffect_in_entryRuleEffect135);
            ruleEffect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEffectRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEffect142); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:106:1: ruleEffect : ( ( rule__Effect__Alternatives ) ) ;
    public final void ruleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:110:2: ( ( ( rule__Effect__Alternatives ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:111:1: ( ( rule__Effect__Alternatives ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:111:1: ( ( rule__Effect__Alternatives ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:112:1: ( rule__Effect__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEffectAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:113:1: ( rule__Effect__Alternatives )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:113:2: rule__Effect__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Effect__Alternatives_in_ruleEffect168);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:125:1: entryRuleEmission : ruleEmission EOF ;
    public final void entryRuleEmission() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:126:1: ( ruleEmission EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:127:1: ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmission_in_entryRuleEmission195);
            ruleEmission();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmission202); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:134:1: ruleEmission : ( ( rule__Emission__Group__0 ) ) ;
    public final void ruleEmission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:138:2: ( ( ( rule__Emission__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:139:1: ( ( rule__Emission__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:139:1: ( ( rule__Emission__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:140:1: ( rule__Emission__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:141:1: ( rule__Emission__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:141:2: rule__Emission__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emission__Group__0_in_ruleEmission228);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:153:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:154:1: ( ruleAssignment EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:155:1: ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment255);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment262); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:162:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:166:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:167:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:167:1: ( ( rule__Assignment__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:168:1: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:169:1: ( rule__Assignment__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:169:2: rule__Assignment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__0_in_ruleAssignment288);
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


    // $ANTLR start "entryRuleTextEffect"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:181:1: entryRuleTextEffect : ruleTextEffect EOF ;
    public final void entryRuleTextEffect() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:182:1: ( ruleTextEffect EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:183:1: ruleTextEffect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_entryRuleTextEffect315);
            ruleTextEffect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextEffectRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextEffect322); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextEffect"


    // $ANTLR start "ruleTextEffect"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:190:1: ruleTextEffect : ( ( rule__TextEffect__TextAssignment ) ) ;
    public final void ruleTextEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:194:2: ( ( ( rule__TextEffect__TextAssignment ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:195:1: ( ( rule__TextEffect__TextAssignment ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:195:1: ( ( rule__TextEffect__TextAssignment ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:196:1: ( rule__TextEffect__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getTextAssignment()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:197:1: ( rule__TextEffect__TextAssignment )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:197:2: rule__TextEffect__TextAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextEffect__TextAssignment_in_ruleTextEffect348);
            rule__TextEffect__TextAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextEffectAccess().getTextAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextEffect"


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:211:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:212:1: ( ruleExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:213:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression377);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression384); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:220:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:224:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:225:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:225:1: ( ( rule__Expression__Alternatives ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:226:1: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:227:1: ( rule__Expression__Alternatives )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:227:2: rule__Expression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Alternatives_in_ruleExpression410);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:239:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:240:1: ( ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:241:1: ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression437);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanExpression444); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:248:1: ruleBooleanExpression : ( ruleOrExpression ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:252:2: ( ( ruleOrExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:253:1: ( ruleOrExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:253:1: ( ruleOrExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:254:1: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleBooleanExpression470);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:267:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:268:1: ( ruleOrExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:269:1: ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression496);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression503); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:276:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:280:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:281:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:281:1: ( ( rule__OrExpression__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:282:1: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:283:1: ( rule__OrExpression__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:283:2: rule__OrExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression529);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:295:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:296:1: ( ruleAndExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:297:1: ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression556);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression563); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:304:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:308:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:309:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:309:1: ( ( rule__AndExpression__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:310:1: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:311:1: ( rule__AndExpression__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:311:2: rule__AndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression589);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:323:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:324:1: ( ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:325:1: ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation616);
            ruleCompareOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation623); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:332:1: ruleCompareOperation : ( ( rule__CompareOperation__Alternatives ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:336:2: ( ( ( rule__CompareOperation__Alternatives ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:337:1: ( ( rule__CompareOperation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:337:1: ( ( rule__CompareOperation__Alternatives ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:338:1: ( rule__CompareOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:339:1: ( rule__CompareOperation__Alternatives )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:339:2: rule__CompareOperation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Alternatives_in_ruleCompareOperation649);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:351:1: entryRuleNotOrValuedExpression : ruleNotOrValuedExpression EOF ;
    public final void entryRuleNotOrValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:352:1: ( ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:353:1: ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression676);
            ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression683); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:360:1: ruleNotOrValuedExpression : ( ( rule__NotOrValuedExpression__Alternatives ) ) ;
    public final void ruleNotOrValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:364:2: ( ( ( rule__NotOrValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:365:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:365:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:366:1: ( rule__NotOrValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:367:1: ( rule__NotOrValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:367:2: rule__NotOrValuedExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotOrValuedExpression__Alternatives_in_ruleNotOrValuedExpression709);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:379:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:380:1: ( ruleNotExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:381:1: ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression736);
            ruleNotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression743); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:388:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:392:2: ( ( ( rule__NotExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:393:1: ( ( rule__NotExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:393:1: ( ( rule__NotExpression__Alternatives ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:394:1: ( rule__NotExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:395:1: ( rule__NotExpression__Alternatives )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:395:2: rule__NotExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression769);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:407:1: entryRuleValuedExpression : ruleValuedExpression EOF ;
    public final void entryRuleValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:408:1: ( ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:409:1: ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression796);
            ruleValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression803); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:416:1: ruleValuedExpression : ( ruleAddExpression ) ;
    public final void ruleValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:420:2: ( ( ruleAddExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:421:1: ( ruleAddExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:421:1: ( ruleAddExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:422:1: ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression829);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:435:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:436:1: ( ruleAddExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:437:1: ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression855);
            ruleAddExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression862); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:444:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:448:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:449:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:449:1: ( ( rule__AddExpression__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:450:1: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:451:1: ( rule__AddExpression__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:451:2: rule__AddExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression888);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:463:1: entryRuleSubExpression : ruleSubExpression EOF ;
    public final void entryRuleSubExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:464:1: ( ruleSubExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:465:1: ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression915);
            ruleSubExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression922); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:472:1: ruleSubExpression : ( ( rule__SubExpression__Group__0 ) ) ;
    public final void ruleSubExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:476:2: ( ( ( rule__SubExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:477:1: ( ( rule__SubExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:477:1: ( ( rule__SubExpression__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:478:1: ( rule__SubExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:479:1: ( rule__SubExpression__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:479:2: rule__SubExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__0_in_ruleSubExpression948);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:491:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:492:1: ( ruleMultExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:493:1: ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression975);
            ruleMultExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression982); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:500:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:504:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:505:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:505:1: ( ( rule__MultExpression__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:506:1: ( rule__MultExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:507:1: ( rule__MultExpression__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:507:2: rule__MultExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression1008);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:519:1: entryRuleDivExpression : ruleDivExpression EOF ;
    public final void entryRuleDivExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:520:1: ( ruleDivExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:521:1: ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression1035);
            ruleDivExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression1042); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:528:1: ruleDivExpression : ( ( rule__DivExpression__Group__0 ) ) ;
    public final void ruleDivExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:532:2: ( ( ( rule__DivExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:533:1: ( ( rule__DivExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:533:1: ( ( rule__DivExpression__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:534:1: ( rule__DivExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:535:1: ( rule__DivExpression__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:535:2: rule__DivExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression1068);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:547:1: entryRuleModExpression : ruleModExpression EOF ;
    public final void entryRuleModExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:548:1: ( ruleModExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:549:1: ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression1095);
            ruleModExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression1102); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:556:1: ruleModExpression : ( ( rule__ModExpression__Group__0 ) ) ;
    public final void ruleModExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:560:2: ( ( ( rule__ModExpression__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:561:1: ( ( rule__ModExpression__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:561:1: ( ( rule__ModExpression__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:562:1: ( rule__ModExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:563:1: ( rule__ModExpression__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:563:2: rule__ModExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression1128);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:575:1: entryRuleNegExpression : ruleNegExpression EOF ;
    public final void entryRuleNegExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:576:1: ( ruleNegExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:577:1: ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_entryRuleNegExpression1155);
            ruleNegExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExpression1162); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:584:1: ruleNegExpression : ( ( rule__NegExpression__Alternatives ) ) ;
    public final void ruleNegExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:588:2: ( ( ( rule__NegExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:589:1: ( ( rule__NegExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:589:1: ( ( rule__NegExpression__Alternatives ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:590:1: ( rule__NegExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:591:1: ( rule__NegExpression__Alternatives )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:591:2: rule__NegExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Alternatives_in_ruleNegExpression1188);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:603:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:604:1: ( ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:605:1: ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression1215);
            ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression1222); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:612:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:616:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:617:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:617:1: ( ( rule__AtomicExpression__Alternatives ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:618:1: ( rule__AtomicExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:619:1: ( rule__AtomicExpression__Alternatives )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:619:2: rule__AtomicExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression1248);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:631:1: entryRuleAtomicValuedExpression : ruleAtomicValuedExpression EOF ;
    public final void entryRuleAtomicValuedExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:632:1: ( ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:633:1: ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression1275);
            ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression1282); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:640:1: ruleAtomicValuedExpression : ( ( rule__AtomicValuedExpression__Alternatives ) ) ;
    public final void ruleAtomicValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:644:2: ( ( ( rule__AtomicValuedExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:645:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:645:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:646:1: ( rule__AtomicValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:647:1: ( rule__AtomicValuedExpression__Alternatives )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:647:2: rule__AtomicValuedExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression1308);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:659:1: entryRuleValuedObjectTestExpression : ruleValuedObjectTestExpression EOF ;
    public final void entryRuleValuedObjectTestExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:660:1: ( ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:661:1: ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression1335);
            ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression1342); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:668:1: ruleValuedObjectTestExpression : ( ( rule__ValuedObjectTestExpression__Alternatives ) ) ;
    public final void ruleValuedObjectTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:672:2: ( ( ( rule__ValuedObjectTestExpression__Alternatives ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:673:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:673:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:674:1: ( rule__ValuedObjectTestExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:675:1: ( rule__ValuedObjectTestExpression__Alternatives )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:675:2: rule__ValuedObjectTestExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Alternatives_in_ruleValuedObjectTestExpression1368);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:687:1: entryRuleValuedObjectReference : ruleValuedObjectReference EOF ;
    public final void entryRuleValuedObjectReference() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:688:1: ( ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:689:1: ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference1395);
            ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuedObjectReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference1402); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:696:1: ruleValuedObjectReference : ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) ) ;
    public final void ruleValuedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:700:2: ( ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:701:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:701:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:702:1: ( rule__ValuedObjectReference__ValuedObjectAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:703:1: ( rule__ValuedObjectReference__ValuedObjectAssignment )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:703:2: rule__ValuedObjectReference__ValuedObjectAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectReference__ValuedObjectAssignment_in_ruleValuedObjectReference1428);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:715:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:716:1: ( ruleTextExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:717:1: ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression1455);
            ruleTextExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression1462); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:724:1: ruleTextExpression : ( ( rule__TextExpression__TextAssignment ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:728:2: ( ( ( rule__TextExpression__TextAssignment ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:729:1: ( ( rule__TextExpression__TextAssignment ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:729:1: ( ( rule__TextExpression__TextAssignment ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:730:1: ( rule__TextExpression__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTextAssignment()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:731:1: ( rule__TextExpression__TextAssignment )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:731:2: rule__TextExpression__TextAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextExpression__TextAssignment_in_ruleTextExpression1488);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:743:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:744:1: ( ruleIntValue EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:745:1: ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue1515);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue1522); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:752:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:756:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:757:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:757:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:758:1: ( rule__IntValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:759:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:759:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1548);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:771:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:772:1: ( ruleFloatValue EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:773:1: ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue1575);
            ruleFloatValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue1582); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:780:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:784:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:785:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:785:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:786:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:787:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:787:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1608);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:799:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:800:1: ( ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:801:1: ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1635);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue1642); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:808:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:812:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:813:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:813:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:814:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:815:1: ( rule__BooleanValue__ValueAssignment )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:815:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1668);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:829:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:830:1: ( ruleAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:831:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation1697);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation1704); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:838:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:842:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:843:1: ( ( rule__Annotation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:843:1: ( ( rule__Annotation__Alternatives ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:844:1: ( rule__Annotation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:845:1: ( rule__Annotation__Alternatives )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:845:2: rule__Annotation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1730);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:859:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:860:1: ( ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:861:1: ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1759);
            ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation1766); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:868:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValueAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:872:2: ( ( ( rule__CommentAnnotation__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:873:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:873:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:874:1: ( rule__CommentAnnotation__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:875:1: ( rule__CommentAnnotation__ValueAssignment )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:875:2: rule__CommentAnnotation__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1792);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:887:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:888:1: ( ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:889:1: ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation1819);
            ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation1826); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:896:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:900:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:901:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:901:1: ( ( rule__TagAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:902:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:903:1: ( rule__TagAnnotation__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:903:2: rule__TagAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation1852);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:915:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:916:1: ( ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:917:1: ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation1879);
            ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation1886); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:924:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:928:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:929:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:929:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:930:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:931:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:931:2: rule__KeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation1912);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:943:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:944:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:945:1: ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation1939);
            ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation1946); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:952:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:956:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:957:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:957:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:958:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:959:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:959:2: rule__TypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation1972);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:971:1: entryRuleKeyBooleanValueAnnotation : ruleKeyBooleanValueAnnotation EOF ;
    public final void entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:972:1: ( ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:973:1: ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation1999);
            ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation2006); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:980:1: ruleKeyBooleanValueAnnotation : ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyBooleanValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:984:2: ( ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:985:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:985:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:986:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:987:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:987:2: rule__KeyBooleanValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation2032);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:999:1: entryRuleKeyIntValueAnnotation : ruleKeyIntValueAnnotation EOF ;
    public final void entryRuleKeyIntValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1000:1: ( ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1001:1: ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation2059);
            ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation2066); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1008:1: ruleKeyIntValueAnnotation : ( ( rule__KeyIntValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyIntValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1012:2: ( ( ( rule__KeyIntValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1013:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1013:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1014:1: ( rule__KeyIntValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1015:1: ( rule__KeyIntValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1015:2: rule__KeyIntValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation2092);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1027:1: entryRuleKeyFloatValueAnnotation : ruleKeyFloatValueAnnotation EOF ;
    public final void entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1028:1: ( ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1029:1: ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation2119);
            ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation2126); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1036:1: ruleKeyFloatValueAnnotation : ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyFloatValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1040:2: ( ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1041:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1041:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1042:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1043:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1043:2: rule__KeyFloatValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation2152);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1057:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1058:1: ( ruleEString EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1059:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2181);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2188); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1066:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1070:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1071:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1071:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1072:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1073:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1073:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString2214);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1085:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1086:1: ( ruleExtendedID EOF )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1087:1: ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID2241);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID2248); if (state.failed) return ;

            }

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1094:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1098:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1099:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1099:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1100:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1101:1: ( rule__ExtendedID__Group__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1101:2: rule__ExtendedID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID2274);
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


    // $ANTLR start "ruleDivOperator"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1114:1: ruleDivOperator : ( ( ':' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1118:1: ( ( ( ':' ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1119:1: ( ( ':' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1119:1: ( ( ':' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1120:1: ( ':' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1121:1: ( ':' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1121:3: ':'
            {
            match(input,16,FollowSets000.FOLLOW_16_in_ruleDivOperator2312); if (state.failed) return ;

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


    // $ANTLR start "ruleCompareOperator"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1134:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1138:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1139:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1139:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1140:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1141:1: ( rule__CompareOperator__Alternatives )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1141:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator2350);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1153:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1157:1: ( ( ( 'pre' ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1158:1: ( ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1158:1: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1159:1: ( 'pre' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:1: ( 'pre' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1160:3: 'pre'
            {
            match(input,17,FollowSets000.FOLLOW_17_in_rulePreOperator2387); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1173:1: ruleOrOperator : ( ( '|' ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1177:1: ( ( ( '|' ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1178:1: ( ( '|' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1178:1: ( ( '|' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1179:1: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1180:1: ( '|' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1180:3: '|'
            {
            match(input,18,FollowSets000.FOLLOW_18_in_ruleOrOperator2426); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1193:1: ruleAndOperator : ( ( '&' ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1197:1: ( ( ( '&' ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1198:1: ( ( '&' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1198:1: ( ( '&' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1199:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1200:1: ( '&' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1200:3: '&'
            {
            match(input,19,FollowSets000.FOLLOW_19_in_ruleAndOperator2465); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1213:1: ruleNotOperator : ( ( '!' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1217:1: ( ( ( '!' ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1218:1: ( ( '!' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1218:1: ( ( '!' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1219:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1220:1: ( '!' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1220:3: '!'
            {
            match(input,20,FollowSets000.FOLLOW_20_in_ruleNotOperator2504); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1233:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1237:1: ( ( ( '+' ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1238:1: ( ( '+' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1238:1: ( ( '+' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1239:1: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1240:1: ( '+' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1240:3: '+'
            {
            match(input,21,FollowSets000.FOLLOW_21_in_ruleAddOperator2543); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1253:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1257:1: ( ( ( '-' ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1258:1: ( ( '-' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1258:1: ( ( '-' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1259:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1260:1: ( '-' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1260:3: '-'
            {
            match(input,22,FollowSets000.FOLLOW_22_in_ruleSubOperator2582); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1273:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1277:1: ( ( ( '*' ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:1: ( ( '*' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1278:1: ( ( '*' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1279:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1280:1: ( '*' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1280:3: '*'
            {
            match(input,23,FollowSets000.FOLLOW_23_in_ruleMultOperator2621); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1293:1: ruleModOperator : ( ( 'mod' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1297:1: ( ( ( 'mod' ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1298:1: ( ( 'mod' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1298:1: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1299:1: ( 'mod' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1300:1: ( 'mod' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1300:3: 'mod'
            {
            match(input,24,FollowSets000.FOLLOW_24_in_ruleModOperator2660); if (state.failed) return ;

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


    // $ANTLR start "ruleValOperator"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1313:1: ruleValOperator : ( ( 'val' ) ) ;
    public final void ruleValOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1317:1: ( ( ( 'val' ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1318:1: ( ( 'val' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1318:1: ( ( 'val' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1319:1: ( 'val' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1320:1: ( 'val' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1320:3: 'val'
            {
            match(input,25,FollowSets000.FOLLOW_25_in_ruleValOperator2699); if (state.failed) return ;

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


    // $ANTLR start "rule__Effect__Alternatives"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1336:1: rule__Effect__Alternatives : ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) );
    public final void rule__Effect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1340:1: ( ( ruleEmission ) | ( ruleAssignment ) | ( ruleTextEffect ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||(LA1_1>=33 && LA1_1<=34)) ) {
                    alt1=1;
                }
                else if ( (LA1_1==36) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_HOSTCODE) ) {
                alt1=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1341:1: ( ruleEmission )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1341:1: ( ruleEmission )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1342:1: ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmission_in_rule__Effect__Alternatives2740);
                    ruleEmission();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1347:6: ( ruleAssignment )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1347:6: ( ruleAssignment )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1348:1: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2757);
                    ruleAssignment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1353:6: ( ruleTextEffect )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1353:6: ( ruleTextEffect )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1354:1: ruleTextEffect
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_rule__Effect__Alternatives2774);
                    ruleTextEffect();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2()); 
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


    // $ANTLR start "rule__Expression__Alternatives"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1364:1: rule__Expression__Alternatives : ( ( ( ruleBooleanExpression ) ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1368:1: ( ( ( ruleBooleanExpression ) ) | ( ruleValuedExpression ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1369:1: ( ( ruleBooleanExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1369:1: ( ( ruleBooleanExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1370:1: ( ruleBooleanExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
                    }
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1371:1: ( ruleBooleanExpression )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1371:3: ruleBooleanExpression
                    {
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2807);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1375:6: ( ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1375:6: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1376:1: ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2825);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1386:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );
    public final void rule__CompareOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1390:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1391:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1391:1: ( ( rule__CompareOperation__Group_0__0 ) )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1392:1: ( rule__CompareOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1393:1: ( rule__CompareOperation__Group_0__0 )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1393:2: rule__CompareOperation__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives2857);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1397:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1397:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1398:1: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2875);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1408:1: rule__NotOrValuedExpression__Alternatives : ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1412:1: ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1413:1: ( ( ruleValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1413:1: ( ( ruleValuedExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1414:1: ( ruleValuedExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                    }
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1415:1: ( ruleValuedExpression )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1415:3: ruleValuedExpression
                    {
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2908);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1419:6: ( ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1419:6: ( ruleNotExpression )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1420:1: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2926);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1430:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1434:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID||LA5_0==RULE_HOSTCODE||LA5_0==RULE_BOOLEAN||LA5_0==17||LA5_0==25||LA5_0==34) ) {
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1435:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1435:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1436:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1437:1: ( rule__NotExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1437:2: rule__NotExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2958);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1441:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1441:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1442:1: ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2976);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1452:1: rule__NegExpression__Alternatives : ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) );
    public final void rule__NegExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1456:1: ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_BOOLEAN)||LA6_0==17||LA6_0==25||LA6_0==34) ) {
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1457:1: ( ( rule__NegExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1457:1: ( ( rule__NegExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1458:1: ( rule__NegExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1459:1: ( rule__NegExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1459:2: rule__NegExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__0_in_rule__NegExpression__Alternatives3008);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1463:6: ( ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1463:6: ( ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1464:1: ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__NegExpression__Alternatives3026);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1474:1: rule__AtomicExpression__Alternatives : ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1478:1: ( ( ruleBooleanValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleTextExpression ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
            case 17:
            case 25:
                {
                alt7=2;
                }
                break;
            case 34:
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1479:1: ( ruleBooleanValue )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1479:1: ( ruleBooleanValue )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1480:1: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives3058);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1485:6: ( ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1485:6: ( ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1486:1: ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives3075);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1491:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1491:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1492:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1493:1: ( rule__AtomicExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1493:2: rule__AtomicExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives3092);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1497:6: ( ruleTextExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1497:6: ( ruleTextExpression )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1498:1: ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives3110);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1508:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1512:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1513:1: ( ruleIntValue )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1513:1: ( ruleIntValue )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1514:1: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives3142);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1519:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1519:6: ( ruleFloatValue )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1520:1: ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives3159);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1525:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1525:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1526:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
                    }
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1527:1: ( rule__AtomicValuedExpression__Group_2__0 )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1527:2: rule__AtomicValuedExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_rule__AtomicValuedExpression__Alternatives3176);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1531:6: ( ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1531:6: ( ruleAtomicExpression )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1532:1: ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives3194);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1542:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1546:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17||LA9_0==25) ) {
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1547:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1547:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1548:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1549:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1549:2: rule__ValuedObjectTestExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives3226);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1553:6: ( ruleValuedObjectReference )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1553:6: ( ruleValuedObjectReference )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1554:1: ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives3244);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1564:1: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 : ( ( rulePreOperator ) | ( ruleValOperator ) );
    public final void rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1568:1: ( ( rulePreOperator ) | ( ruleValOperator ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1569:1: ( rulePreOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1569:1: ( rulePreOperator )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1570:1: rulePreOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03276);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1575:6: ( ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1575:6: ( ruleValOperator )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1576:1: ruleValOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03293);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1587:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1591:1: ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) )
            int alt11=7;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_COMMENT_ANNOTATION) ) {
                alt11=1;
            }
            else if ( (LA11_0==37) ) {
                int LA11_2 = input.LA(2);

                if ( (synpred17_InternalActions()) ) {
                    alt11=2;
                }
                else if ( (synpred18_InternalActions()) ) {
                    alt11=3;
                }
                else if ( (synpred19_InternalActions()) ) {
                    alt11=4;
                }
                else if ( (synpred20_InternalActions()) ) {
                    alt11=5;
                }
                else if ( (synpred21_InternalActions()) ) {
                    alt11=6;
                }
                else if ( (true) ) {
                    alt11=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1592:1: ( ruleCommentAnnotation )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1592:1: ( ruleCommentAnnotation )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1593:1: ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives3326);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1598:6: ( ruleTagAnnotation )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1598:6: ( ruleTagAnnotation )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1599:1: ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives3343);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1604:6: ( ruleKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1604:6: ( ruleKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1605:1: ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives3360);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1610:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1610:6: ( ruleTypedKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1611:1: ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives3377);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1616:6: ( ruleKeyBooleanValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1616:6: ( ruleKeyBooleanValueAnnotation )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1617:1: ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives3394);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1622:6: ( ruleKeyIntValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1622:6: ( ruleKeyIntValueAnnotation )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1623:1: ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives3411);
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1628:6: ( ruleKeyFloatValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1628:6: ( ruleKeyFloatValueAnnotation )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1629:1: ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives3428);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1640:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1644:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1645:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1645:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1646:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives3461); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1651:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1651:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1652:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives3478); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1662:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1666:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<>' ) ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            case 29:
                {
                alt13=4;
                }
                break;
            case 30:
                {
                alt13=5;
                }
                break;
            case 31:
                {
                alt13=6;
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
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1667:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1667:1: ( ( '=' ) )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1668:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1669:1: ( '=' )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1669:3: '='
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__CompareOperator__Alternatives3511); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1674:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1674:6: ( ( '<' ) )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1675:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1676:1: ( '<' )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1676:3: '<'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__CompareOperator__Alternatives3532); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1681:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1681:6: ( ( '<=' ) )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1682:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1683:1: ( '<=' )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1683:3: '<='
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__CompareOperator__Alternatives3553); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1688:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1688:6: ( ( '>' ) )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1689:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1690:1: ( '>' )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1690:3: '>'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__CompareOperator__Alternatives3574); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1695:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1695:6: ( ( '>=' ) )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1696:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1697:1: ( '>=' )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1697:3: '>='
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__CompareOperator__Alternatives3595); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1702:6: ( ( '<>' ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1702:6: ( ( '<>' ) )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1703:1: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1704:1: ( '<>' )
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1704:3: '<>'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__CompareOperator__Alternatives3616); if (state.failed) return ;

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


    // $ANTLR start "rule__Transition__Group__0"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1718:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1722:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1723:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__03651);
            rule__Transition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__03654);
            rule__Transition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1730:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1734:1: ( ( () ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1735:1: ( () )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1735:1: ( () )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1736:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1737:1: ()
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1739:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1749:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1753:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1754:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__13712);
            rule__Transition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__13715);
            rule__Transition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1761:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__AnnotationsAssignment_1 )* ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1765:1: ( ( ( rule__Transition__AnnotationsAssignment_1 )* ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1766:1: ( ( rule__Transition__AnnotationsAssignment_1 )* )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1766:1: ( ( rule__Transition__AnnotationsAssignment_1 )* )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1767:1: ( rule__Transition__AnnotationsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getAnnotationsAssignment_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1768:1: ( rule__Transition__AnnotationsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMENT_ANNOTATION||LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1768:2: rule__Transition__AnnotationsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__AnnotationsAssignment_1_in_rule__Transition__Group__1__Impl3742);
            	    rule__Transition__AnnotationsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getAnnotationsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1778:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1782:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1783:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23773);
            rule__Transition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__23776);
            rule__Transition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1790:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__DelayAssignment_2 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1794:1: ( ( ( rule__Transition__DelayAssignment_2 )? ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1795:1: ( ( rule__Transition__DelayAssignment_2 )? )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1795:1: ( ( rule__Transition__DelayAssignment_2 )? )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1796:1: ( rule__Transition__DelayAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getDelayAssignment_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1797:1: ( rule__Transition__DelayAssignment_2 )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1797:2: rule__Transition__DelayAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__DelayAssignment_2_in_rule__Transition__Group__2__Impl3803);
                    rule__Transition__DelayAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getDelayAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1807:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1811:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1812:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__33834);
            rule__Transition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__33837);
            rule__Transition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1819:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__TriggerAssignment_3 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1823:1: ( ( ( rule__Transition__TriggerAssignment_3 )? ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1824:1: ( ( rule__Transition__TriggerAssignment_3 )? )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1824:1: ( ( rule__Transition__TriggerAssignment_3 )? )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1825:1: ( rule__Transition__TriggerAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTriggerAssignment_3()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1826:1: ( rule__Transition__TriggerAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_BOOLEAN)||LA16_0==17||LA16_0==20||LA16_0==22||LA16_0==25||LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1826:2: rule__Transition__TriggerAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__TriggerAssignment_3_in_rule__Transition__Group__3__Impl3864);
                    rule__Transition__TriggerAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTriggerAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1836:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1840:1: ( rule__Transition__Group__4__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1841:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__43895);
            rule__Transition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1847:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1851:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1852:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1852:1: ( ( rule__Transition__Group_4__0 )? )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1853:1: ( rule__Transition__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup_4()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1854:1: ( rule__Transition__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1854:2: rule__Transition__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl3922);
                    rule__Transition__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group_4__0"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1874:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1878:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1879:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__03963);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__03966);
            rule__Transition__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0"


    // $ANTLR start "rule__Transition__Group_4__0__Impl"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1886:1: rule__Transition__Group_4__0__Impl : ( '/' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1890:1: ( ( '/' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1891:1: ( '/' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1891:1: ( '/' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1892:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getSolidusKeyword_4_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Transition__Group_4__0__Impl3994); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getSolidusKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0__Impl"


    // $ANTLR start "rule__Transition__Group_4__1"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1905:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1909:1: ( rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1910:2: rule__Transition__Group_4__1__Impl rule__Transition__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__14025);
            rule__Transition__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__2_in_rule__Transition__Group_4__14028);
            rule__Transition__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1"


    // $ANTLR start "rule__Transition__Group_4__1__Impl"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1917:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__EffectsAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1921:1: ( ( ( rule__Transition__EffectsAssignment_4_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1922:1: ( ( rule__Transition__EffectsAssignment_4_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1922:1: ( ( rule__Transition__EffectsAssignment_4_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1923:1: ( rule__Transition__EffectsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEffectsAssignment_4_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1924:1: ( rule__Transition__EffectsAssignment_4_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1924:2: rule__Transition__EffectsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__EffectsAssignment_4_1_in_rule__Transition__Group_4__1__Impl4055);
            rule__Transition__EffectsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getEffectsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1__Impl"


    // $ANTLR start "rule__Transition__Group_4__2"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1934:1: rule__Transition__Group_4__2 : rule__Transition__Group_4__2__Impl ;
    public final void rule__Transition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1938:1: ( rule__Transition__Group_4__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1939:2: rule__Transition__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4__2__Impl_in_rule__Transition__Group_4__24085);
            rule__Transition__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__2"


    // $ANTLR start "rule__Transition__Group_4__2__Impl"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1945:1: rule__Transition__Group_4__2__Impl : ( ( rule__Transition__Group_4_2__0 )* ) ;
    public final void rule__Transition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1949:1: ( ( ( rule__Transition__Group_4_2__0 )* ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1950:1: ( ( rule__Transition__Group_4_2__0 )* )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1950:1: ( ( rule__Transition__Group_4_2__0 )* )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1951:1: ( rule__Transition__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup_4_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1952:1: ( rule__Transition__Group_4_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1952:2: rule__Transition__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_2__0_in_rule__Transition__Group_4__2__Impl4112);
            	    rule__Transition__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__2__Impl"


    // $ANTLR start "rule__Transition__Group_4_2__0"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1968:1: rule__Transition__Group_4_2__0 : rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 ;
    public final void rule__Transition__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1972:1: ( rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1973:2: rule__Transition__Group_4_2__0__Impl rule__Transition__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_2__0__Impl_in_rule__Transition__Group_4_2__04149);
            rule__Transition__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_2__1_in_rule__Transition__Group_4_2__04152);
            rule__Transition__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_2__0"


    // $ANTLR start "rule__Transition__Group_4_2__0__Impl"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1980:1: rule__Transition__Group_4_2__0__Impl : ( ';' ) ;
    public final void rule__Transition__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1984:1: ( ( ';' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1985:1: ( ';' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1985:1: ( ';' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1986:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getSemicolonKeyword_4_2_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Transition__Group_4_2__0__Impl4180); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getSemicolonKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_4_2__1"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1999:1: rule__Transition__Group_4_2__1 : rule__Transition__Group_4_2__1__Impl ;
    public final void rule__Transition__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2003:1: ( rule__Transition__Group_4_2__1__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2004:2: rule__Transition__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group_4_2__1__Impl_in_rule__Transition__Group_4_2__14211);
            rule__Transition__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_2__1"


    // $ANTLR start "rule__Transition__Group_4_2__1__Impl"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2010:1: rule__Transition__Group_4_2__1__Impl : ( ( rule__Transition__EffectsAssignment_4_2_1 ) ) ;
    public final void rule__Transition__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2014:1: ( ( ( rule__Transition__EffectsAssignment_4_2_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2015:1: ( ( rule__Transition__EffectsAssignment_4_2_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2015:1: ( ( rule__Transition__EffectsAssignment_4_2_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2016:1: ( rule__Transition__EffectsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEffectsAssignment_4_2_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2017:1: ( rule__Transition__EffectsAssignment_4_2_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2017:2: rule__Transition__EffectsAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__EffectsAssignment_4_2_1_in_rule__Transition__Group_4_2__1__Impl4238);
            rule__Transition__EffectsAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getEffectsAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4_2__1__Impl"


    // $ANTLR start "rule__Emission__Group__0"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2041:1: rule__Emission__Group__0 : rule__Emission__Group__0__Impl rule__Emission__Group__1 ;
    public final void rule__Emission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2045:1: ( rule__Emission__Group__0__Impl rule__Emission__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2046:2: rule__Emission__Group__0__Impl rule__Emission__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emission__Group__0__Impl_in_rule__Emission__Group__04282);
            rule__Emission__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__04285);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2053:1: rule__Emission__Group__0__Impl : ( ( rule__Emission__ValuedObjectAssignment_0 ) ) ;
    public final void rule__Emission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2057:1: ( ( ( rule__Emission__ValuedObjectAssignment_0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2058:1: ( ( rule__Emission__ValuedObjectAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2058:1: ( ( rule__Emission__ValuedObjectAssignment_0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2059:1: ( rule__Emission__ValuedObjectAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getValuedObjectAssignment_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2060:1: ( rule__Emission__ValuedObjectAssignment_0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2060:2: rule__Emission__ValuedObjectAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emission__ValuedObjectAssignment_0_in_rule__Emission__Group__0__Impl4312);
            rule__Emission__ValuedObjectAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getValuedObjectAssignment_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2070:1: rule__Emission__Group__1 : rule__Emission__Group__1__Impl ;
    public final void rule__Emission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2074:1: ( rule__Emission__Group__1__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2075:2: rule__Emission__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emission__Group__1__Impl_in_rule__Emission__Group__14342);
            rule__Emission__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2081:1: rule__Emission__Group__1__Impl : ( ( rule__Emission__Group_1__0 )? ) ;
    public final void rule__Emission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2085:1: ( ( ( rule__Emission__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2086:1: ( ( rule__Emission__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2086:1: ( ( rule__Emission__Group_1__0 )? )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2087:1: ( rule__Emission__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2088:1: ( rule__Emission__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2088:2: rule__Emission__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Emission__Group_1__0_in_rule__Emission__Group__1__Impl4369);
                    rule__Emission__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getGroup_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Emission__Group_1__0"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2102:1: rule__Emission__Group_1__0 : rule__Emission__Group_1__0__Impl rule__Emission__Group_1__1 ;
    public final void rule__Emission__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2106:1: ( rule__Emission__Group_1__0__Impl rule__Emission__Group_1__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2107:2: rule__Emission__Group_1__0__Impl rule__Emission__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emission__Group_1__0__Impl_in_rule__Emission__Group_1__04404);
            rule__Emission__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Emission__Group_1__1_in_rule__Emission__Group_1__04407);
            rule__Emission__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group_1__0"


    // $ANTLR start "rule__Emission__Group_1__0__Impl"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2114:1: rule__Emission__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Emission__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2118:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2119:1: ( '(' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2119:1: ( '(' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2120:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Emission__Group_1__0__Impl4435); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group_1__0__Impl"


    // $ANTLR start "rule__Emission__Group_1__1"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2133:1: rule__Emission__Group_1__1 : rule__Emission__Group_1__1__Impl rule__Emission__Group_1__2 ;
    public final void rule__Emission__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2137:1: ( rule__Emission__Group_1__1__Impl rule__Emission__Group_1__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2138:2: rule__Emission__Group_1__1__Impl rule__Emission__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emission__Group_1__1__Impl_in_rule__Emission__Group_1__14466);
            rule__Emission__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Emission__Group_1__2_in_rule__Emission__Group_1__14469);
            rule__Emission__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group_1__1"


    // $ANTLR start "rule__Emission__Group_1__1__Impl"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2145:1: rule__Emission__Group_1__1__Impl : ( ( rule__Emission__NewValueAssignment_1_1 ) ) ;
    public final void rule__Emission__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2149:1: ( ( ( rule__Emission__NewValueAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2150:1: ( ( rule__Emission__NewValueAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2150:1: ( ( rule__Emission__NewValueAssignment_1_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2151:1: ( rule__Emission__NewValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2152:1: ( rule__Emission__NewValueAssignment_1_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2152:2: rule__Emission__NewValueAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emission__NewValueAssignment_1_1_in_rule__Emission__Group_1__1__Impl4496);
            rule__Emission__NewValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group_1__1__Impl"


    // $ANTLR start "rule__Emission__Group_1__2"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2162:1: rule__Emission__Group_1__2 : rule__Emission__Group_1__2__Impl ;
    public final void rule__Emission__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2166:1: ( rule__Emission__Group_1__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2167:2: rule__Emission__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Emission__Group_1__2__Impl_in_rule__Emission__Group_1__24526);
            rule__Emission__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group_1__2"


    // $ANTLR start "rule__Emission__Group_1__2__Impl"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2173:1: rule__Emission__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Emission__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2177:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2178:1: ( ')' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2178:1: ( ')' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2179:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Emission__Group_1__2__Impl4554); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__Group_1__2__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2198:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2202:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2203:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04591);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04594);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2210:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__ValuedObjectAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2214:1: ( ( ( rule__Assignment__ValuedObjectAssignment_0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2215:1: ( ( rule__Assignment__ValuedObjectAssignment_0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2215:1: ( ( rule__Assignment__ValuedObjectAssignment_0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2216:1: ( rule__Assignment__ValuedObjectAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValuedObjectAssignment_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2217:1: ( rule__Assignment__ValuedObjectAssignment_0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2217:2: rule__Assignment__ValuedObjectAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__ValuedObjectAssignment_0_in_rule__Assignment__Group__0__Impl4621);
            rule__Assignment__ValuedObjectAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValuedObjectAssignment_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2227:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2231:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2232:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14651);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14654);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2239:1: rule__Assignment__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2243:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2244:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2244:1: ( ':=' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2245:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Assignment__Group__1__Impl4682); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2258:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2262:1: ( rule__Assignment__Group__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2263:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24713);
            rule__Assignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2269:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2273:1: ( ( ( rule__Assignment__ExpressionAssignment_2 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2274:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2274:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2275:1: ( rule__Assignment__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2276:1: ( rule__Assignment__ExpressionAssignment_2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2276:2: rule__Assignment__ExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__ExpressionAssignment_2_in_rule__Assignment__Group__2__Impl4740);
            rule__Assignment__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__OrExpression__Group__0"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2292:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2296:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2297:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04776);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04779);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2304:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2308:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2309:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2309:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2310:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl4806);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2321:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2325:1: ( rule__OrExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2326:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14835);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2332:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2336:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2337:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2337:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2338:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2339:1: ( rule__OrExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2339:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4862);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2353:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2357:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2358:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04897);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04900);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2365:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2369:1: ( ( () ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2370:1: ( () )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2370:1: ( () )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2371:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2372:1: ()
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2374:1: 
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2384:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2388:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2389:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14958);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__14961);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2396:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2400:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2401:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2401:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2402:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2403:1: ( rule__OrExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2403:2: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl4988);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2413:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2417:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2418:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__25018);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2424:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2428:1: ( ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2429:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2429:1: ( ( rule__OrExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2430:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2431:1: ( rule__OrExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2431:2: rule__OrExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl5045);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2447:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2451:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2452:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__05081);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__05084);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2459:1: rule__AndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2463:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2464:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2464:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2465:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl5111);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2476:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2480:1: ( rule__AndExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2481:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__15140);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2487:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2491:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2492:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2492:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2493:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2494:1: ( rule__AndExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2494:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl5167);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2508:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2512:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2513:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__05202);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__05205);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2520:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2524:1: ( ( () ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2525:1: ( () )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2525:1: ( () )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2526:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2527:1: ()
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2529:1: 
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2539:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2543:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2544:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__15263);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__15266);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2551:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2555:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2556:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2556:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2557:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2558:1: ( rule__AndExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2558:2: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl5293);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2568:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2572:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2573:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__25323);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2579:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2583:1: ( ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2584:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2584:1: ( ( rule__AndExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2585:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2586:1: ( rule__AndExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2586:2: rule__AndExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl5350);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2602:1: rule__CompareOperation__Group_0__0 : rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 ;
    public final void rule__CompareOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2606:1: ( rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2607:2: rule__CompareOperation__Group_0__0__Impl rule__CompareOperation__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__05386);
            rule__CompareOperation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__05389);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2614:1: rule__CompareOperation__Group_0__0__Impl : ( ( ruleNotOrValuedExpression ) ) ;
    public final void rule__CompareOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2618:1: ( ( ( ruleNotOrValuedExpression ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2619:1: ( ( ruleNotOrValuedExpression ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2619:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2620:1: ( ruleNotOrValuedExpression )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2621:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2621:3: ruleNotOrValuedExpression
            {
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl5417);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2631:1: rule__CompareOperation__Group_0__1 : rule__CompareOperation__Group_0__1__Impl ;
    public final void rule__CompareOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2635:1: ( rule__CompareOperation__Group_0__1__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2636:2: rule__CompareOperation__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__15447);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2642:1: rule__CompareOperation__Group_0__1__Impl : ( ( rule__CompareOperation__Group_0_1__0 ) ) ;
    public final void rule__CompareOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2646:1: ( ( ( rule__CompareOperation__Group_0_1__0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2647:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2647:1: ( ( rule__CompareOperation__Group_0_1__0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2648:1: ( rule__CompareOperation__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_0_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2649:1: ( rule__CompareOperation__Group_0_1__0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2649:2: rule__CompareOperation__Group_0_1__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl5474);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2663:1: rule__CompareOperation__Group_0_1__0 : rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 ;
    public final void rule__CompareOperation__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2667:1: ( rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2668:2: rule__CompareOperation__Group_0_1__0__Impl rule__CompareOperation__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__05508);
            rule__CompareOperation__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__05511);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2675:1: rule__CompareOperation__Group_0_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2679:1: ( ( () ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2680:1: ( () )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2680:1: ( () )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2681:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2682:1: ()
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2684:1: 
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2694:1: rule__CompareOperation__Group_0_1__1 : rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 ;
    public final void rule__CompareOperation__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2698:1: ( rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2699:2: rule__CompareOperation__Group_0_1__1__Impl rule__CompareOperation__Group_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__15569);
            rule__CompareOperation__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__15572);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2706:1: rule__CompareOperation__Group_0_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) ;
    public final void rule__CompareOperation__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2710:1: ( ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2711:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2711:1: ( ( rule__CompareOperation__OperatorAssignment_0_1_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2712:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_0_1_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2713:1: ( rule__CompareOperation__OperatorAssignment_0_1_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2713:2: rule__CompareOperation__OperatorAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl5599);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2723:1: rule__CompareOperation__Group_0_1__2 : rule__CompareOperation__Group_0_1__2__Impl ;
    public final void rule__CompareOperation__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2727:1: ( rule__CompareOperation__Group_0_1__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2728:2: rule__CompareOperation__Group_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__25629);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2734:1: rule__CompareOperation__Group_0_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) ;
    public final void rule__CompareOperation__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2738:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2739:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2739:1: ( ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2740:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_0_1_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2741:1: ( rule__CompareOperation__SubExpressionsAssignment_0_1_2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2741:2: rule__CompareOperation__SubExpressionsAssignment_0_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl5656);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2757:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2761:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2762:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__05692);
            rule__NotExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__05695);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2769:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2773:1: ( ( () ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2774:1: ( () )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2774:1: ( () )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2775:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2776:1: ()
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2778:1: 
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2788:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2792:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2793:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__15753);
            rule__NotExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__15756);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2800:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2804:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2805:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2805:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2806:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2807:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2807:2: rule__NotExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl5783);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2817:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2821:1: ( rule__NotExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2822:2: rule__NotExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__25813);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2828:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2832:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2833:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2833:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2834:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2835:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2835:2: rule__NotExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl5840);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2851:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2855:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2856:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__05876);
            rule__AddExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__05879);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2863:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2867:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2868:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2868:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2869:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl5906);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2880:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2884:1: ( rule__AddExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2885:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__15935);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2891:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2895:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2896:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2896:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2897:1: ( rule__AddExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2898:1: ( rule__AddExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2898:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl5962);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2912:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2916:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2917:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__05997);
            rule__AddExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__06000);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2924:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2928:1: ( ( () ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2929:1: ( () )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2929:1: ( () )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2930:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2931:1: ()
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2933:1: 
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2943:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2947:1: ( rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2948:2: rule__AddExpression__Group_1__1__Impl rule__AddExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__16058);
            rule__AddExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__16061);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2955:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2959:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2960:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2960:1: ( ( rule__AddExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2961:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2962:1: ( rule__AddExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2962:2: rule__AddExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl6088);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2972:1: rule__AddExpression__Group_1__2 : rule__AddExpression__Group_1__2__Impl ;
    public final void rule__AddExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2976:1: ( rule__AddExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2977:2: rule__AddExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__26118);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2983:1: rule__AddExpression__Group_1__2__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__AddExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2987:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2988:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2988:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2989:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2990:1: ( rule__AddExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:2990:2: rule__AddExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl6145);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3006:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3010:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3011:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__06181);
            rule__SubExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__06184);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3018:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3022:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3023:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3023:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3024:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl6211);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3035:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3039:1: ( rule__SubExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3040:2: rule__SubExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__16240);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3046:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )* ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3050:1: ( ( ( rule__SubExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3051:1: ( ( rule__SubExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3051:1: ( ( rule__SubExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3052:1: ( rule__SubExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3053:1: ( rule__SubExpression__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==22) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3053:2: rule__SubExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl6267);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3067:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3071:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3072:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__06302);
            rule__SubExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__06305);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3079:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3083:1: ( ( () ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3084:1: ( () )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3084:1: ( () )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3085:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3086:1: ()
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3088:1: 
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3098:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3102:1: ( rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3103:2: rule__SubExpression__Group_1__1__Impl rule__SubExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__16363);
            rule__SubExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__16366);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3110:1: rule__SubExpression__Group_1__1__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3114:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3115:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3115:1: ( ( rule__SubExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3116:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3117:1: ( rule__SubExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3117:2: rule__SubExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl6393);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3127:1: rule__SubExpression__Group_1__2 : rule__SubExpression__Group_1__2__Impl ;
    public final void rule__SubExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3131:1: ( rule__SubExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3132:2: rule__SubExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__26423);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3138:1: rule__SubExpression__Group_1__2__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__SubExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3142:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3143:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3143:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3144:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3145:1: ( rule__SubExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3145:2: rule__SubExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl6450);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3161:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3165:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3166:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__06486);
            rule__MultExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__06489);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3173:1: rule__MultExpression__Group__0__Impl : ( ruleDivExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3177:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3178:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3178:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3179:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_rule__MultExpression__Group__0__Impl6516);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3190:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3194:1: ( rule__MultExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3195:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__16545);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3201:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3205:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3206:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3206:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3207:1: ( rule__MultExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3208:1: ( rule__MultExpression__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==23) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3208:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl6572);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3222:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3226:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3227:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__06607);
            rule__MultExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__06610);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3234:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3238:1: ( ( () ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3239:1: ( () )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3239:1: ( () )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3240:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3241:1: ()
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3243:1: 
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3253:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3257:1: ( rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3258:2: rule__MultExpression__Group_1__1__Impl rule__MultExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__16668);
            rule__MultExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__16671);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3265:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3269:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3270:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3270:1: ( ( rule__MultExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3271:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3272:1: ( rule__MultExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3272:2: rule__MultExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl6698);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3282:1: rule__MultExpression__Group_1__2 : rule__MultExpression__Group_1__2__Impl ;
    public final void rule__MultExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3286:1: ( rule__MultExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3287:2: rule__MultExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__26728);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3293:1: rule__MultExpression__Group_1__2__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__MultExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3297:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3298:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3298:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3299:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3300:1: ( rule__MultExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3300:2: rule__MultExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl6755);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3316:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3320:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3321:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__06791);
            rule__DivExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__06794);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3328:1: rule__DivExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3332:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3333:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3333:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3334:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__DivExpression__Group__0__Impl6821);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3345:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3349:1: ( rule__DivExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3350:2: rule__DivExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__16850);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3356:1: rule__DivExpression__Group__1__Impl : ( ( rule__DivExpression__Group_1__0 )? ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3360:1: ( ( ( rule__DivExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3361:1: ( ( rule__DivExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3361:1: ( ( rule__DivExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3362:1: ( rule__DivExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3363:1: ( rule__DivExpression__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==16) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3363:2: rule__DivExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__0_in_rule__DivExpression__Group__1__Impl6877);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3377:1: rule__DivExpression__Group_1__0 : rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 ;
    public final void rule__DivExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3381:1: ( rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3382:2: rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__0__Impl_in_rule__DivExpression__Group_1__06912);
            rule__DivExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__1_in_rule__DivExpression__Group_1__06915);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3389:1: rule__DivExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DivExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3393:1: ( ( () ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3394:1: ( () )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3394:1: ( () )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3395:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3396:1: ()
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3398:1: 
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3408:1: rule__DivExpression__Group_1__1 : rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 ;
    public final void rule__DivExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3412:1: ( rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3413:2: rule__DivExpression__Group_1__1__Impl rule__DivExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__1__Impl_in_rule__DivExpression__Group_1__16973);
            rule__DivExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__2_in_rule__DivExpression__Group_1__16976);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3420:1: rule__DivExpression__Group_1__1__Impl : ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__DivExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3424:1: ( ( ( rule__DivExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3425:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3425:1: ( ( rule__DivExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3426:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3427:1: ( rule__DivExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3427:2: rule__DivExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__OperatorAssignment_1_1_in_rule__DivExpression__Group_1__1__Impl7003);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3437:1: rule__DivExpression__Group_1__2 : rule__DivExpression__Group_1__2__Impl ;
    public final void rule__DivExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3441:1: ( rule__DivExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3442:2: rule__DivExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__Group_1__2__Impl_in_rule__DivExpression__Group_1__27033);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3448:1: rule__DivExpression__Group_1__2__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__DivExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3452:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3453:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3453:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3454:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3455:1: ( rule__DivExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3455:2: rule__DivExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DivExpression__SubExpressionsAssignment_1_2_in_rule__DivExpression__Group_1__2__Impl7060);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3471:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3475:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3476:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__07096);
            rule__ModExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__07099);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3483:1: rule__ModExpression__Group__0__Impl : ( ruleNegExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3487:1: ( ( ruleNegExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3488:1: ( ruleNegExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3488:1: ( ruleNegExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3489:1: ruleNegExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_rule__ModExpression__Group__0__Impl7126);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3500:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3504:1: ( rule__ModExpression__Group__1__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3505:2: rule__ModExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__17155);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3511:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3515:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3516:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3516:1: ( ( rule__ModExpression__Group_1__0 )? )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3517:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3518:1: ( rule__ModExpression__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3518:2: rule__ModExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl7182);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3532:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3536:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3537:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__07217);
            rule__ModExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__07220);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3544:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3548:1: ( ( () ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3549:1: ( () )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3549:1: ( () )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3550:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3551:1: ()
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3553:1: 
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3563:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3567:1: ( rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3568:2: rule__ModExpression__Group_1__1__Impl rule__ModExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__17278);
            rule__ModExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__17281);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3575:1: rule__ModExpression__Group_1__1__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3579:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3580:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3580:1: ( ( rule__ModExpression__OperatorAssignment_1_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3581:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3582:1: ( rule__ModExpression__OperatorAssignment_1_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3582:2: rule__ModExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl7308);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3592:1: rule__ModExpression__Group_1__2 : rule__ModExpression__Group_1__2__Impl ;
    public final void rule__ModExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3596:1: ( rule__ModExpression__Group_1__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3597:2: rule__ModExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__27338);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3603:1: rule__ModExpression__Group_1__2__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__ModExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3607:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3608:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3608:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_2 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3609:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3610:1: ( rule__ModExpression__SubExpressionsAssignment_1_2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3610:2: rule__ModExpression__SubExpressionsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl7365);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3626:1: rule__NegExpression__Group_0__0 : rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 ;
    public final void rule__NegExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3630:1: ( rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3631:2: rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__0__Impl_in_rule__NegExpression__Group_0__07401);
            rule__NegExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__1_in_rule__NegExpression__Group_0__07404);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3638:1: rule__NegExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NegExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3642:1: ( ( () ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3643:1: ( () )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3643:1: ( () )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3644:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3645:1: ()
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3647:1: 
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3657:1: rule__NegExpression__Group_0__1 : rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 ;
    public final void rule__NegExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3661:1: ( rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3662:2: rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__1__Impl_in_rule__NegExpression__Group_0__17462);
            rule__NegExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__2_in_rule__NegExpression__Group_0__17465);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3669:1: rule__NegExpression__Group_0__1__Impl : ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NegExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3673:1: ( ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3674:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3674:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3675:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3676:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3676:2: rule__NegExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__OperatorAssignment_0_1_in_rule__NegExpression__Group_0__1__Impl7492);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3686:1: rule__NegExpression__Group_0__2 : rule__NegExpression__Group_0__2__Impl ;
    public final void rule__NegExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3690:1: ( rule__NegExpression__Group_0__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3691:2: rule__NegExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__Group_0__2__Impl_in_rule__NegExpression__Group_0__27522);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3697:1: rule__NegExpression__Group_0__2__Impl : ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NegExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3701:1: ( ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3702:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3702:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3703:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3704:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3704:2: rule__NegExpression__SubExpressionsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NegExpression__SubExpressionsAssignment_0_2_in_rule__NegExpression__Group_0__2__Impl7549);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3720:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3724:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3725:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__07585);
            rule__AtomicExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__07588);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3732:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3736:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3737:1: ( '(' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3737:1: ( '(' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3738:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__AtomicExpression__Group_2__0__Impl7616); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3751:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3755:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3756:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__17647);
            rule__AtomicExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__17650);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3763:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBooleanExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3767:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3768:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3768:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3769:1: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_2__1__Impl7677);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3780:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3784:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3785:2: rule__AtomicExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__27706);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3791:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3795:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3796:1: ( ')' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3796:1: ( ')' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3797:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AtomicExpression__Group_2__2__Impl7734); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3816:1: rule__AtomicValuedExpression__Group_2__0 : rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 ;
    public final void rule__AtomicValuedExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3820:1: ( rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3821:2: rule__AtomicValuedExpression__Group_2__0__Impl rule__AtomicValuedExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__07771);
            rule__AtomicValuedExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__07774);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3828:1: rule__AtomicValuedExpression__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__AtomicValuedExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3832:1: ( ( ( '(' ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3833:1: ( ( '(' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3833:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3834:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3835:1: ( '(' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3836:2: '('
            {
            match(input,34,FollowSets000.FOLLOW_34_in_rule__AtomicValuedExpression__Group_2__0__Impl7803); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3847:1: rule__AtomicValuedExpression__Group_2__1 : rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 ;
    public final void rule__AtomicValuedExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3851:1: ( rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3852:2: rule__AtomicValuedExpression__Group_2__1__Impl rule__AtomicValuedExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__17835);
            rule__AtomicValuedExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__17838);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3859:1: rule__AtomicValuedExpression__Group_2__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3863:1: ( ( ruleValuedExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3864:1: ( ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3864:1: ( ruleValuedExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3865:1: ruleValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_2_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl7865);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3876:1: rule__AtomicValuedExpression__Group_2__2 : rule__AtomicValuedExpression__Group_2__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3880:1: ( rule__AtomicValuedExpression__Group_2__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3881:2: rule__AtomicValuedExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__27894);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3887:1: rule__AtomicValuedExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3891:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3892:1: ( ')' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3892:1: ( ')' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3893:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AtomicValuedExpression__Group_2__2__Impl7922); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3912:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3916:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3917:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__07959);
            rule__ValuedObjectTestExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__07962);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3924:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3928:1: ( ( () ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3929:1: ( () )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3929:1: ( () )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3930:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3931:1: ()
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3933:1: 
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3943:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3947:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3948:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__18020);
            rule__ValuedObjectTestExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__18023);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3955:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3959:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3960:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3960:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3961:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3962:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3962:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl8050);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3972:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3976:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3977:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__28080);
            rule__ValuedObjectTestExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__28083);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3984:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3988:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3989:1: ( '(' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3989:1: ( '(' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:3990:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ValuedObjectTestExpression__Group_0__2__Impl8111); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4003:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4007:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4008:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__38142);
            rule__ValuedObjectTestExpression__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__38145);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4015:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4019:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4020:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4020:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4021:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4022:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4022:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl8172);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4032:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4036:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4037:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__48202);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4043:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4047:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4048:1: ( ')' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4048:1: ( ')' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4049:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ValuedObjectTestExpression__Group_0__4__Impl8230); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4072:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4076:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4077:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__08271);
            rule__TagAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__08274);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4084:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4088:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4089:1: ( '@' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4089:1: ( '@' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4090:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__TagAnnotation__Group__0__Impl8302); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4103:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4107:1: ( rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4108:2: rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__18333);
            rule__TagAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__18336);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4115:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4119:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4120:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4120:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4121:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4122:1: ( rule__TagAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4122:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl8363);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4132:1: rule__TagAnnotation__Group__2 : rule__TagAnnotation__Group__2__Impl ;
    public final void rule__TagAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4136:1: ( rule__TagAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4137:2: rule__TagAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__28393);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4143:1: rule__TagAnnotation__Group__2__Impl : ( ( rule__TagAnnotation__Group_2__0 )? ) ;
    public final void rule__TagAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4147:1: ( ( ( rule__TagAnnotation__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4148:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4148:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4149:1: ( rule__TagAnnotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4150:1: ( rule__TagAnnotation__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_COMMENT_ANNOTATION||LA27_1==35||LA27_1==37) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4150:2: rule__TagAnnotation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl8420);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4166:1: rule__TagAnnotation__Group_2__0 : rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 ;
    public final void rule__TagAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4170:1: ( rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4171:2: rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__08457);
            rule__TagAnnotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__08460);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4178:1: rule__TagAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TagAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4182:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4183:1: ( '(' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4183:1: ( '(' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4184:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__TagAnnotation__Group_2__0__Impl8488); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4197:1: rule__TagAnnotation__Group_2__1 : rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 ;
    public final void rule__TagAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4201:1: ( rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4202:2: rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__18519);
            rule__TagAnnotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__18522);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4209:1: rule__TagAnnotation__Group_2__1__Impl : ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) ;
    public final void rule__TagAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4213:1: ( ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4214:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4214:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4215:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4216:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_COMMENT_ANNOTATION||LA28_0==37) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4216:2: rule__TagAnnotation__AnnotationsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl8549);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4226:1: rule__TagAnnotation__Group_2__2 : rule__TagAnnotation__Group_2__2__Impl ;
    public final void rule__TagAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4230:1: ( rule__TagAnnotation__Group_2__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4231:2: rule__TagAnnotation__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__28580);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4237:1: rule__TagAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TagAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4241:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4242:1: ( ')' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4242:1: ( ')' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4243:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__TagAnnotation__Group_2__2__Impl8608); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4262:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4266:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4267:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__08645);
            rule__KeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__08648);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4274:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4278:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4279:1: ( '@' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4279:1: ( '@' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4280:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__KeyStringValueAnnotation__Group__0__Impl8676); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4293:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4297:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4298:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__18707);
            rule__KeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__18710);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4305:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4309:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4310:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4310:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4311:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4312:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4312:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl8737);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4322:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4326:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4327:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__28767);
            rule__KeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__28770);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4334:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4338:1: ( ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4339:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4339:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4340:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4341:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4341:2: rule__KeyStringValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl8797);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4351:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4355:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4356:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__38827);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4362:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4366:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4367:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4367:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4368:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4369:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==RULE_COMMENT_ANNOTATION||LA29_1==35||LA29_1==37) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4369:2: rule__KeyStringValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl8854);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4387:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4391:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4392:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__08893);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__08896);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4399:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4403:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4404:1: ( '(' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4404:1: ( '(' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4405:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyStringValueAnnotation__Group_3__0__Impl8924); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4418:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4422:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4423:2: rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__18955);
            rule__KeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__18958);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4430:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4434:1: ( ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4435:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4435:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4436:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4437:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_COMMENT_ANNOTATION||LA30_0==37) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4437:2: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl8985);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4447:1: rule__KeyStringValueAnnotation__Group_3__2 : rule__KeyStringValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4451:1: ( rule__KeyStringValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4452:2: rule__KeyStringValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__29016);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4458:1: rule__KeyStringValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4462:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4463:1: ( ')' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4463:1: ( ')' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4464:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyStringValueAnnotation__Group_3__2__Impl9044); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4483:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4487:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4488:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__09081);
            rule__TypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__09084);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4495:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4499:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4500:1: ( '@' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4500:1: ( '@' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4501:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl9112); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4514:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4518:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4519:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__19143);
            rule__TypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__19146);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4526:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4530:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4531:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4531:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4532:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4533:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4533:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl9173);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4543:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4547:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4548:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__29203);
            rule__TypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__29206);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4555:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4559:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4560:1: ( '[' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4560:1: ( '[' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4561:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl9234); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4574:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4578:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4579:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__39265);
            rule__TypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__39268);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4586:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4590:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4591:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4591:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4592:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4593:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4593:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl9295);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4603:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4607:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4608:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__49325);
            rule__TypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__49328);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4615:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4619:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4620:1: ( ']' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4620:1: ( ']' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4621:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl9356); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4634:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4638:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4639:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__59387);
            rule__TypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__59390);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4646:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4650:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4651:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4651:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4652:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueAssignment_5()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4653:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4653:2: rule__TypedKeyStringValueAnnotation__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl9417);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4663:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4667:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4668:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__69447);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4674:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4678:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4679:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4679:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4680:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4681:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==RULE_COMMENT_ANNOTATION||LA31_1==35||LA31_1==37) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4681:2: rule__TypedKeyStringValueAnnotation__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl9474);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4705:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4709:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4710:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__09519);
            rule__TypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__09522);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4717:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4721:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4722:1: ( '(' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4722:1: ( '(' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4723:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl9550); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4736:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4740:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4741:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__19581);
            rule__TypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__19584);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4748:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4752:1: ( ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4753:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4753:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4754:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAssignment_6_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4755:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_COMMENT_ANNOTATION||LA32_0==37) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4755:2: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl9611);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4765:1: rule__TypedKeyStringValueAnnotation__Group_6__2 : rule__TypedKeyStringValueAnnotation__Group_6__2__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4769:1: ( rule__TypedKeyStringValueAnnotation__Group_6__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4770:2: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__29642);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4776:1: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl : ( ')' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4780:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4781:1: ( ')' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4781:1: ( ')' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4782:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl9670); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4801:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4805:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4806:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__09707);
            rule__KeyBooleanValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__09710);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4813:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4817:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4818:1: ( '@' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4818:1: ( '@' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4819:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__KeyBooleanValueAnnotation__Group__0__Impl9738); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4832:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4836:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4837:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__19769);
            rule__KeyBooleanValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__19772);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4844:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4848:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4849:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4849:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4850:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4851:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4851:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl9799);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4861:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4865:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4866:2: rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__29829);
            rule__KeyBooleanValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__29832);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4873:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4877:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4878:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4878:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4879:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4880:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4880:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl9859);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4890:1: rule__KeyBooleanValueAnnotation__Group__3 : rule__KeyBooleanValueAnnotation__Group__3__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4894:1: ( rule__KeyBooleanValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4895:2: rule__KeyBooleanValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__39889);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4901:1: rule__KeyBooleanValueAnnotation__Group__3__Impl : ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4905:1: ( ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4906:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4906:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4907:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4908:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==RULE_COMMENT_ANNOTATION||LA33_1==35||LA33_1==37) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4908:2: rule__KeyBooleanValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl9916);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4926:1: rule__KeyBooleanValueAnnotation__Group_3__0 : rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4930:1: ( rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4931:2: rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__09955);
            rule__KeyBooleanValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__09958);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4938:1: rule__KeyBooleanValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4942:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4943:1: ( '(' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4943:1: ( '(' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4944:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl9986); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4957:1: rule__KeyBooleanValueAnnotation__Group_3__1 : rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4961:1: ( rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4962:2: rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__110017);
            rule__KeyBooleanValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__110020);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4969:1: rule__KeyBooleanValueAnnotation__Group_3__1__Impl : ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4973:1: ( ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4974:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4974:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4975:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4976:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_COMMENT_ANNOTATION||LA34_0==37) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4976:2: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl10047);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4986:1: rule__KeyBooleanValueAnnotation__Group_3__2 : rule__KeyBooleanValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4990:1: ( rule__KeyBooleanValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4991:2: rule__KeyBooleanValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__210078);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:4997:1: rule__KeyBooleanValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5001:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5002:1: ( ')' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5002:1: ( ')' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5003:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl10106); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5022:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5026:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5027:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__010143);
            rule__KeyIntValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__010146);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5034:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5038:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5039:1: ( '@' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5039:1: ( '@' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5040:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__KeyIntValueAnnotation__Group__0__Impl10174); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5053:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5057:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5058:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__110205);
            rule__KeyIntValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__110208);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5065:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5069:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5070:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5070:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5071:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5072:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5072:2: rule__KeyIntValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl10235);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5082:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5086:1: ( rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5087:2: rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__210265);
            rule__KeyIntValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__210268);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5094:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5098:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5099:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5099:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5100:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5101:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5101:2: rule__KeyIntValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl10295);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5111:1: rule__KeyIntValueAnnotation__Group__3 : rule__KeyIntValueAnnotation__Group__3__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5115:1: ( rule__KeyIntValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5116:2: rule__KeyIntValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__310325);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5122:1: rule__KeyIntValueAnnotation__Group__3__Impl : ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyIntValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5126:1: ( ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5127:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5127:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5128:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5129:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==RULE_COMMENT_ANNOTATION||LA35_1==35||LA35_1==37) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5129:2: rule__KeyIntValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl10352);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5147:1: rule__KeyIntValueAnnotation__Group_3__0 : rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 ;
    public final void rule__KeyIntValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5151:1: ( rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5152:2: rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__010391);
            rule__KeyIntValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__010394);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5159:1: rule__KeyIntValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5163:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5164:1: ( '(' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5164:1: ( '(' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5165:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyIntValueAnnotation__Group_3__0__Impl10422); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5178:1: rule__KeyIntValueAnnotation__Group_3__1 : rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 ;
    public final void rule__KeyIntValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5182:1: ( rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5183:2: rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__110453);
            rule__KeyIntValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__110456);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5190:1: rule__KeyIntValueAnnotation__Group_3__1__Impl : ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5194:1: ( ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5195:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5195:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5196:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5197:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_COMMENT_ANNOTATION||LA36_0==37) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5197:2: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl10483);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5207:1: rule__KeyIntValueAnnotation__Group_3__2 : rule__KeyIntValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5211:1: ( rule__KeyIntValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5212:2: rule__KeyIntValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__210514);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5218:1: rule__KeyIntValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5222:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5223:1: ( ')' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5223:1: ( ')' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5224:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyIntValueAnnotation__Group_3__2__Impl10542); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5243:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5247:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5248:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__010579);
            rule__KeyFloatValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__010582);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5255:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5259:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5260:1: ( '@' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5260:1: ( '@' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5261:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__KeyFloatValueAnnotation__Group__0__Impl10610); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5274:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5278:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5279:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__110641);
            rule__KeyFloatValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__110644);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5286:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5290:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5291:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5291:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5292:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5293:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5293:2: rule__KeyFloatValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl10671);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5303:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5307:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5308:2: rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__210701);
            rule__KeyFloatValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__210704);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5315:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5319:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5320:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5320:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5321:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5322:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5322:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl10731);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5332:1: rule__KeyFloatValueAnnotation__Group__3 : rule__KeyFloatValueAnnotation__Group__3__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5336:1: ( rule__KeyFloatValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5337:2: rule__KeyFloatValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__310761);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5343:1: rule__KeyFloatValueAnnotation__Group__3__Impl : ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyFloatValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5347:1: ( ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5348:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5348:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5349:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5350:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_COMMENT_ANNOTATION||LA37_1==35||LA37_1==37) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5350:2: rule__KeyFloatValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl10788);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5368:1: rule__KeyFloatValueAnnotation__Group_3__0 : rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5372:1: ( rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5373:2: rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__010827);
            rule__KeyFloatValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__010830);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5380:1: rule__KeyFloatValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5384:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5385:1: ( '(' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5385:1: ( '(' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5386:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl10858); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5399:1: rule__KeyFloatValueAnnotation__Group_3__1 : rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5403:1: ( rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5404:2: rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__110889);
            rule__KeyFloatValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__110892);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5411:1: rule__KeyFloatValueAnnotation__Group_3__1__Impl : ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5415:1: ( ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5416:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5416:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5417:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5418:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_COMMENT_ANNOTATION||LA38_0==37) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5418:2: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl10919);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5428:1: rule__KeyFloatValueAnnotation__Group_3__2 : rule__KeyFloatValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5432:1: ( rule__KeyFloatValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5433:2: rule__KeyFloatValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__210950);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5439:1: rule__KeyFloatValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5443:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5444:1: ( ')' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5444:1: ( ')' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5445:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl10978); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5465:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5469:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5470:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__011016);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__011019);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5477:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5481:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5482:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5482:1: ( RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5483:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl11046); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5494:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5498:1: ( rule__ExtendedID__Group__1__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5499:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__111075);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5505:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5509:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5510:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5510:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5511:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5512:1: ( rule__ExtendedID__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==40) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5512:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl11102);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5526:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5530:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5531:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__011137);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__011140);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5538:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5542:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5543:1: ( '.' )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5543:1: ( '.' )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5544:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__ExtendedID__Group_1__0__Impl11168); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5557:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5561:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5562:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__111199);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5568:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5572:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5573:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5573:1: ( RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5574:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl11226); if (state.failed) return ;
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


    // $ANTLR start "rule__Transition__AnnotationsAssignment_1"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5590:1: rule__Transition__AnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__Transition__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5594:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5595:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5595:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5596:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__Transition__AnnotationsAssignment_111264);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__AnnotationsAssignment_1"


    // $ANTLR start "rule__Transition__DelayAssignment_2"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5605:1: rule__Transition__DelayAssignment_2 : ( RULE_INT ) ;
    public final void rule__Transition__DelayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5609:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5610:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5610:1: ( RULE_INT )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5611:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getDelayINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Transition__DelayAssignment_211295); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getDelayINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__DelayAssignment_2"


    // $ANTLR start "rule__Transition__TriggerAssignment_3"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5620:1: rule__Transition__TriggerAssignment_3 : ( ruleBooleanExpression ) ;
    public final void rule__Transition__TriggerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5624:1: ( ( ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5625:1: ( ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5625:1: ( ruleBooleanExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5626:1: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTriggerBooleanExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_rule__Transition__TriggerAssignment_311326);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTriggerBooleanExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TriggerAssignment_3"


    // $ANTLR start "rule__Transition__EffectsAssignment_4_1"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5635:1: rule__Transition__EffectsAssignment_4_1 : ( ruleEffect ) ;
    public final void rule__Transition__EffectsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5639:1: ( ( ruleEffect ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5640:1: ( ruleEffect )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5640:1: ( ruleEffect )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5641:1: ruleEffect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEffect_in_rule__Transition__EffectsAssignment_4_111357);
            ruleEffect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EffectsAssignment_4_1"


    // $ANTLR start "rule__Transition__EffectsAssignment_4_2_1"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5650:1: rule__Transition__EffectsAssignment_4_2_1 : ( ruleEffect ) ;
    public final void rule__Transition__EffectsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5654:1: ( ( ruleEffect ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5655:1: ( ruleEffect )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5655:1: ( ruleEffect )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5656:1: ruleEffect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEffect_in_rule__Transition__EffectsAssignment_4_2_111388);
            ruleEffect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EffectsAssignment_4_2_1"


    // $ANTLR start "rule__Emission__ValuedObjectAssignment_0"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5677:1: rule__Emission__ValuedObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Emission__ValuedObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5681:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5682:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5682:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5683:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5684:1: ( RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5685:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Emission__ValuedObjectAssignment_011435); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__ValuedObjectAssignment_0"


    // $ANTLR start "rule__Emission__NewValueAssignment_1_1"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5696:1: rule__Emission__NewValueAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Emission__NewValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5700:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5701:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5701:1: ( ruleExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5702:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Emission__NewValueAssignment_1_111470);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emission__NewValueAssignment_1_1"


    // $ANTLR start "rule__Assignment__ValuedObjectAssignment_0"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5711:1: rule__Assignment__ValuedObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__ValuedObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5715:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5716:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5716:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5717:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5718:1: ( RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5719:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Assignment__ValuedObjectAssignment_011505); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValuedObjectAssignment_0"


    // $ANTLR start "rule__Assignment__ExpressionAssignment_2"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5730:1: rule__Assignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5734:1: ( ( ruleExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5735:1: ( ruleExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5735:1: ( ruleExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5736:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Assignment__ExpressionAssignment_211540);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ExpressionAssignment_2"


    // $ANTLR start "rule__TextEffect__TextAssignment"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5745:1: rule__TextEffect__TextAssignment : ( RULE_HOSTCODE ) ;
    public final void rule__TextEffect__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5749:1: ( ( RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5750:1: ( RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5750:1: ( RULE_HOSTCODE )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5751:1: RULE_HOSTCODE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextEffectAccess().getTextHOSTCODETerminalRuleCall_0()); 
            }
            match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_rule__TextEffect__TextAssignment11571); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextEffectAccess().getTextHOSTCODETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextEffect__TextAssignment"


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_1"
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5760:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5764:1: ( ( ruleOrOperator ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5765:1: ( ruleOrOperator )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5765:1: ( ruleOrOperator )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5766:1: ruleOrOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_111602);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5775:1: rule__OrExpression__SubExpressionsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5779:1: ( ( ruleAndExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5780:1: ( ruleAndExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5780:1: ( ruleAndExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5781:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_211633);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5790:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5794:1: ( ( ruleAndOperator ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5795:1: ( ruleAndOperator )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5795:1: ( ruleAndOperator )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5796:1: ruleAndOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_111664);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5805:1: rule__AndExpression__SubExpressionsAssignment_1_2 : ( ruleCompareOperation ) ;
    public final void rule__AndExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5809:1: ( ( ruleCompareOperation ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5810:1: ( ruleCompareOperation )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5810:1: ( ruleCompareOperation )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5811:1: ruleCompareOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_211695);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5820:1: rule__CompareOperation__OperatorAssignment_0_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5824:1: ( ( ruleCompareOperator ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5825:1: ( ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5825:1: ( ruleCompareOperator )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5826:1: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_111726);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5835:1: rule__CompareOperation__SubExpressionsAssignment_0_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5839:1: ( ( ruleNotOrValuedExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5840:1: ( ruleNotOrValuedExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5840:1: ( ruleNotOrValuedExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5841:1: ruleNotOrValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_211757);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5850:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5854:1: ( ( ruleNotOperator ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5855:1: ( ruleNotOperator )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5855:1: ( ruleNotOperator )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5856:1: ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_111788);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5865:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5869:1: ( ( ruleNotExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5870:1: ( ruleNotExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5870:1: ( ruleNotExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5871:1: ruleNotExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_211819);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5880:1: rule__AddExpression__OperatorAssignment_1_1 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5884:1: ( ( ruleAddOperator ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5885:1: ( ruleAddOperator )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5885:1: ( ruleAddOperator )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5886:1: ruleAddOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_111850);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5895:1: rule__AddExpression__SubExpressionsAssignment_1_2 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5899:1: ( ( ruleSubExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5900:1: ( ruleSubExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5900:1: ( ruleSubExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5901:1: ruleSubExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_211881);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5910:1: rule__SubExpression__OperatorAssignment_1_1 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5914:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5915:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5915:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5916:1: ruleSubOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_111912);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5925:1: rule__SubExpression__SubExpressionsAssignment_1_2 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5929:1: ( ( ruleMultExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5930:1: ( ruleMultExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5930:1: ( ruleMultExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5931:1: ruleMultExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_211943);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5940:1: rule__MultExpression__OperatorAssignment_1_1 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5944:1: ( ( ruleMultOperator ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5945:1: ( ruleMultOperator )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5945:1: ( ruleMultOperator )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5946:1: ruleMultOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_111974);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5955:1: rule__MultExpression__SubExpressionsAssignment_1_2 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5959:1: ( ( ruleDivExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5960:1: ( ruleDivExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5960:1: ( ruleDivExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5961:1: ruleDivExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_rule__MultExpression__SubExpressionsAssignment_1_212005);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5970:1: rule__DivExpression__OperatorAssignment_1_1 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5974:1: ( ( ruleDivOperator ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5975:1: ( ruleDivOperator )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5975:1: ( ruleDivOperator )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5976:1: ruleDivOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_1_112036);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5985:1: rule__DivExpression__SubExpressionsAssignment_1_2 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5989:1: ( ( ruleModExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5990:1: ( ruleModExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5990:1: ( ruleModExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:5991:1: ruleModExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_rule__DivExpression__SubExpressionsAssignment_1_212067);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6000:1: rule__ModExpression__OperatorAssignment_1_1 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6004:1: ( ( ruleModOperator ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6005:1: ( ruleModOperator )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6005:1: ( ruleModOperator )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6006:1: ruleModOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_112098);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6015:1: rule__ModExpression__SubExpressionsAssignment_1_2 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6019:1: ( ( ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6020:1: ( ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6020:1: ( ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6021:1: ruleAtomicValuedExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_212129);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6030:1: rule__NegExpression__OperatorAssignment_0_1 : ( ruleSubOperator ) ;
    public final void rule__NegExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6034:1: ( ( ruleSubOperator ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6035:1: ( ruleSubOperator )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6035:1: ( ruleSubOperator )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6036:1: ruleSubOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_rule__NegExpression__OperatorAssignment_0_112160);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6045:1: rule__NegExpression__SubExpressionsAssignment_0_2 : ( ruleNegExpression ) ;
    public final void rule__NegExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6049:1: ( ( ruleNegExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6050:1: ( ruleNegExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6050:1: ( ruleNegExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6051:1: ruleNegExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_rule__NegExpression__SubExpressionsAssignment_0_212191);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6060:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6064:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6065:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6065:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6066:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAlternatives_0_1_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6067:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6067:2: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_112222);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6076:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6080:1: ( ( ruleValuedObjectTestExpression ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6081:1: ( ruleValuedObjectTestExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6081:1: ( ruleValuedObjectTestExpression )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6082:1: ruleValuedObjectTestExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_312255);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6091:1: rule__ValuedObjectReference__ValuedObjectAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6095:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6096:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6096:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6097:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0()); 
            }
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6098:1: ( RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6099:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment12290); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6110:1: rule__TextExpression__TextAssignment : ( RULE_HOSTCODE ) ;
    public final void rule__TextExpression__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6114:1: ( ( RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6115:1: ( RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6115:1: ( RULE_HOSTCODE )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6116:1: RULE_HOSTCODE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTextHOSTCODETerminalRuleCall_0()); 
            }
            match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_rule__TextExpression__TextAssignment12325); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6125:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6129:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6130:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6130:1: ( RULE_INT )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6131:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment12356); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6140:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6144:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6145:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6145:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6146:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment12387); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6155:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6159:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6160:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6160:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6161:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment12418); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6170:1: rule__CommentAnnotation__ValueAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6174:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6175:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6175:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6176:1: RULE_COMMENT_ANNOTATION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment12449); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6185:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6189:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6190:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6190:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6191:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_112480);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6200:1: rule__TagAnnotation__AnnotationsAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__TagAnnotation__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6204:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6205:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6205:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6206:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_112511);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6215:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6219:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6220:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6220:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6221:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_112542);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6230:1: rule__KeyStringValueAnnotation__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6234:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6235:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6235:1: ( ruleEString )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6236:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_212573);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6245:1: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6249:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6250:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6250:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6251:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_112604);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6260:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6264:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6265:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6265:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6266:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_112635);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6275:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6279:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6280:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6280:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6281:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_312666);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6290:1: rule__TypedKeyStringValueAnnotation__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6294:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6295:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6295:1: ( ruleEString )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6296:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_512697);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6305:1: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 : ( ruleAnnotation ) ;
    public final void rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6309:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6310:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6310:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6311:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_112728);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6320:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6324:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6325:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6325:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6326:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_112759);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6335:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6339:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6340:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6340:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6341:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_212790); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6350:1: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6354:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6355:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6355:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6356:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_112821);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6365:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6369:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6370:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6370:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6371:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_112852);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6380:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6384:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6385:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6385:1: ( RULE_INT )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6386:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_212883); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6395:1: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6399:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6400:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6400:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6401:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_112914);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6410:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6414:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6415:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6415:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6416:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_112945);
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6425:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6429:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6430:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6430:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6431:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFLOATTerminalRuleCall_2_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_212976); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6440:1: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6444:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6445:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6445:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:6446:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_113007);
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

    // $ANTLR start synpred3_InternalActions
    public final void synpred3_InternalActions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1369:1: ( ( ( ruleBooleanExpression ) ) )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1369:1: ( ( ruleBooleanExpression ) )
        {
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1369:1: ( ( ruleBooleanExpression ) )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1370:1: ( ruleBooleanExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0()); 
        }
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1371:1: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1371:3: ruleBooleanExpression
        {
        pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_synpred3_InternalActions2807);
        ruleBooleanExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalActions

    // $ANTLR start synpred4_InternalActions
    public final void synpred4_InternalActions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1391:1: ( ( ( rule__CompareOperation__Group_0__0 ) ) )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1391:1: ( ( rule__CompareOperation__Group_0__0 ) )
        {
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1391:1: ( ( rule__CompareOperation__Group_0__0 ) )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1392:1: ( rule__CompareOperation__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCompareOperationAccess().getGroup_0()); 
        }
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1393:1: ( rule__CompareOperation__Group_0__0 )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1393:2: rule__CompareOperation__Group_0__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__CompareOperation__Group_0__0_in_synpred4_InternalActions2857);
        rule__CompareOperation__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalActions

    // $ANTLR start synpred5_InternalActions
    public final void synpred5_InternalActions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1413:1: ( ( ( ruleValuedExpression ) ) )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1413:1: ( ( ruleValuedExpression ) )
        {
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1413:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1414:1: ( ruleValuedExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
        }
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1415:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1415:3: ruleValuedExpression
        {
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred5_InternalActions2908);
        ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalActions

    // $ANTLR start synpred13_InternalActions
    public final void synpred13_InternalActions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1525:6: ( ( ( rule__AtomicValuedExpression__Group_2__0 ) ) )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1525:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        {
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1525:6: ( ( rule__AtomicValuedExpression__Group_2__0 ) )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1526:1: ( rule__AtomicValuedExpression__Group_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_2()); 
        }
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1527:1: ( rule__AtomicValuedExpression__Group_2__0 )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1527:2: rule__AtomicValuedExpression__Group_2__0
        {
        pushFollow(FollowSets000.FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_synpred13_InternalActions3176);
        rule__AtomicValuedExpression__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13_InternalActions

    // $ANTLR start synpred17_InternalActions
    public final void synpred17_InternalActions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1598:6: ( ( ruleTagAnnotation ) )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1598:6: ( ruleTagAnnotation )
        {
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1598:6: ( ruleTagAnnotation )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1599:1: ruleTagAnnotation
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_synpred17_InternalActions3343);
        ruleTagAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalActions

    // $ANTLR start synpred18_InternalActions
    public final void synpred18_InternalActions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1604:6: ( ( ruleKeyStringValueAnnotation ) )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1604:6: ( ruleKeyStringValueAnnotation )
        {
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1604:6: ( ruleKeyStringValueAnnotation )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1605:1: ruleKeyStringValueAnnotation
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_synpred18_InternalActions3360);
        ruleKeyStringValueAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalActions

    // $ANTLR start synpred19_InternalActions
    public final void synpred19_InternalActions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1610:6: ( ( ruleTypedKeyStringValueAnnotation ) )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1610:6: ( ruleTypedKeyStringValueAnnotation )
        {
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1610:6: ( ruleTypedKeyStringValueAnnotation )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1611:1: ruleTypedKeyStringValueAnnotation
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_synpred19_InternalActions3377);
        ruleTypedKeyStringValueAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalActions

    // $ANTLR start synpred20_InternalActions
    public final void synpred20_InternalActions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1616:6: ( ( ruleKeyBooleanValueAnnotation ) )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1616:6: ( ruleKeyBooleanValueAnnotation )
        {
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1616:6: ( ruleKeyBooleanValueAnnotation )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1617:1: ruleKeyBooleanValueAnnotation
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_synpred20_InternalActions3394);
        ruleKeyBooleanValueAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalActions

    // $ANTLR start synpred21_InternalActions
    public final void synpred21_InternalActions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1622:6: ( ( ruleKeyIntValueAnnotation ) )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1622:6: ( ruleKeyIntValueAnnotation )
        {
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1622:6: ( ruleKeyIntValueAnnotation )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1623:1: ruleKeyIntValueAnnotation
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
        }
        pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_synpred21_InternalActions3411);
        ruleKeyIntValueAnnotation();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalActions

    // $ANTLR start synpred29_InternalActions
    public final void synpred29_InternalActions_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1797:2: ( rule__Transition__DelayAssignment_2 )
        // ../de.cau.cs.kieler.sccharts.text.ui/src-gen/de/cau/cs/kieler/sccharts/text/actions/ui/contentassist/antlr/internal/InternalActions.g:1797:2: rule__Transition__DelayAssignment_2
        {
        pushFollow(FollowSets000.FOLLOW_rule__Transition__DelayAssignment_2_in_synpred29_InternalActions3803);
        rule__Transition__DelayAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalActions

    // Delegated rules

    public final boolean synpred13_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalActions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalActions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalActions_fragment(); // can never throw exception
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
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA2_eotS =
        "\14\uffff";
    static final String DFA2_eofS =
        "\14\uffff";
    static final String DFA2_minS =
        "\1\5\11\0\2\uffff";
    static final String DFA2_maxS =
        "\1\42\11\0\2\uffff";
    static final String DFA2_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA2_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\10\1\2\1\11\1\3\1\5\7\uffff\1\6\2\uffff\1\12\1\uffff\1\1"+
            "\2\uffff\1\7\10\uffff\1\4",
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
            return "1364:1: rule__Expression__Alternatives : ( ( ( ruleBooleanExpression ) ) | ( ruleValuedExpression ) );";
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
                        if ( (synpred3_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalActions()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalActions()) ) {s = 10;}

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
    static final String DFA3_eotS =
        "\14\uffff";
    static final String DFA3_eofS =
        "\14\uffff";
    static final String DFA3_minS =
        "\1\5\3\uffff\7\0\1\uffff";
    static final String DFA3_maxS =
        "\1\42\3\uffff\7\0\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA3_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\10\1\1\1\11\1\1\1\5\7\uffff\1\6\2\uffff\1\12\1\uffff\1\1"+
            "\2\uffff\1\7\10\uffff\1\4",
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
            return "1386:1: rule__CompareOperation__Alternatives : ( ( ( rule__CompareOperation__Group_0__0 ) ) | ( ruleNotExpression ) );";
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
                        if ( (synpred4_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_6 = input.LA(1);

                         
                        int index3_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA3_9 = input.LA(1);

                         
                        int index3_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA3_10 = input.LA(1);

                         
                        int index3_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalActions()) ) {s = 1;}

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
    static final String DFA4_eotS =
        "\13\uffff";
    static final String DFA4_eofS =
        "\13\uffff";
    static final String DFA4_minS =
        "\1\5\3\uffff\6\0\1\uffff";
    static final String DFA4_maxS =
        "\1\42\3\uffff\6\0\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\10\uffff\1\2";
    static final String DFA4_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\10\1\1\1\11\1\1\1\5\7\uffff\1\6\2\uffff\1\12\1\uffff\1\1"+
            "\2\uffff\1\7\10\uffff\1\4",
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1408:1: rule__NotOrValuedExpression__Alternatives : ( ( ( ruleValuedExpression ) ) | ( ruleNotExpression ) );";
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
                        if ( (synpred5_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalActions()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index4_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_9 = input.LA(1);

                         
                        int index4_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalActions()) ) {s = 1;}

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
    static final String DFA8_eotS =
        "\12\uffff";
    static final String DFA8_eofS =
        "\12\uffff";
    static final String DFA8_minS =
        "\1\5\2\uffff\1\0\6\uffff";
    static final String DFA8_maxS =
        "\1\42\2\uffff\1\0\6\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\4\uffff\1\3";
    static final String DFA8_specialS =
        "\3\uffff\1\0\6\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\4\1\1\1\4\1\2\1\4\7\uffff\1\4\7\uffff\1\4\10\uffff\1\3",
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
            return "1508:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ( rule__AtomicValuedExpression__Group_2__0 ) ) | ( ruleAtomicExpression ) );";
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
                        if ( (synpred13_InternalActions()) ) {s = 9;}

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
    static final String DFA15_eotS =
        "\16\uffff";
    static final String DFA15_eofS =
        "\1\2\15\uffff";
    static final String DFA15_minS =
        "\1\5\1\0\14\uffff";
    static final String DFA15_maxS =
        "\1\42\1\0\14\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\12\uffff\1\1";
    static final String DFA15_specialS =
        "\1\uffff\1\0\14\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\1\3\2\7\uffff\1\2\2\uffff\1\2\1\uffff\1\2\2\uffff\1"+
            "\2\6\uffff\1\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "1797:1: ( rule__Transition__DelayAssignment_2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalActions()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect135 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEffect142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Effect__Alternatives_in_ruleEffect168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission195 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmission202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emission__Group__0_in_ruleEmission228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment255 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextEffect__TextAssignment_in_ruleTextEffect348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression377 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression437 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleBooleanExpression470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression556 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation616 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Alternatives_in_ruleCompareOperation649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression676 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotOrValuedExpression__Alternatives_in_ruleNotOrValuedExpression709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression736 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Alternatives_in_ruleNotExpression769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression796 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression855 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__0_in_ruleSubExpression948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression975 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression1008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression1035 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression1042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__0_in_ruleDivExpression1068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression1095 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression1102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__0_in_ruleModExpression1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression1155 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression1162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Alternatives_in_ruleNegExpression1188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression1215 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression1222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Alternatives_in_ruleAtomicExpression1248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression1275 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression1282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Alternatives_in_ruleAtomicValuedExpression1308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression1335 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression1342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Alternatives_in_ruleValuedObjectTestExpression1368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference1395 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference1402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectReference__ValuedObjectAssignment_in_ruleValuedObjectReference1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression1455 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression1462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextExpression__TextAssignment_in_ruleTextExpression1488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue1515 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue1522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1575 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue1608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1635 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1697 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1759 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation1766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation1819 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation1826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation1852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation1879 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation1886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation1912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation1939 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation1946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation1972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation1999 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation2006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation2032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation2059 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation2066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation2092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation2119 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation2126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation2152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString2214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID2241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID2248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID2274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleDivOperator2312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator2350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rulePreOperator2387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleOrOperator2426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAndOperator2465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleNotOperator2504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleAddOperator2543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleSubOperator2582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleMultOperator2621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleModOperator2660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleValOperator2699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_rule__Effect__Alternatives2740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Effect__Alternatives2757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_rule__Effect__Alternatives2774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Expression__Alternatives2807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__Expression__Alternatives2825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_rule__CompareOperation__Alternatives2857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__CompareOperation__Alternatives2875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__NotOrValuedExpression__Alternatives2908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotOrValuedExpression__Alternatives2926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__0_in_rule__NotExpression__Alternatives2958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__NotExpression__Alternatives2976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__0_in_rule__NegExpression__Alternatives3008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__NegExpression__Alternatives3026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_rule__AtomicExpression__Alternatives3058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__AtomicExpression__Alternatives3075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0_in_rule__AtomicExpression__Alternatives3092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_rule__AtomicExpression__Alternatives3110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_rule__AtomicValuedExpression__Alternatives3142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_rule__AtomicValuedExpression__Alternatives3159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_rule__AtomicValuedExpression__Alternatives3176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_rule__AtomicValuedExpression__Alternatives3194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0_in_rule__ValuedObjectTestExpression__Alternatives3226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_rule__ValuedObjectTestExpression__Alternatives3244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValOperator_in_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_03293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives3326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives3343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives3360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives3377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives3394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives3411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives3428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives3461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives3478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__CompareOperator__Alternatives3511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CompareOperator__Alternatives3532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CompareOperator__Alternatives3553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CompareOperator__Alternatives3574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__CompareOperator__Alternatives3595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__CompareOperator__Alternatives3616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__03651 = new BitSet(new long[]{0x00000025025207E0L});
        public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__03654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__13712 = new BitSet(new long[]{0x00000025025207E0L});
        public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__13715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__AnnotationsAssignment_1_in_rule__Transition__Group__1__Impl3742 = new BitSet(new long[]{0x0000002000000402L});
        public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23773 = new BitSet(new long[]{0x00000025025207E0L});
        public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__23776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__DelayAssignment_2_in_rule__Transition__Group__2__Impl3803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__33834 = new BitSet(new long[]{0x00000025025207E0L});
        public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__33837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__TriggerAssignment_3_in_rule__Transition__Group__3__Impl3864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__43895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl3922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__03963 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__03966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Transition__Group_4__0__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__14025 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__2_in_rule__Transition__Group_4__14028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__EffectsAssignment_4_1_in_rule__Transition__Group_4__1__Impl4055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4__2__Impl_in_rule__Transition__Group_4__24085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_2__0_in_rule__Transition__Group_4__2__Impl4112 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_2__0__Impl_in_rule__Transition__Group_4_2__04149 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_2__1_in_rule__Transition__Group_4_2__04152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Transition__Group_4_2__0__Impl4180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group_4_2__1__Impl_in_rule__Transition__Group_4_2__14211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__EffectsAssignment_4_2_1_in_rule__Transition__Group_4_2__1__Impl4238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emission__Group__0__Impl_in_rule__Emission__Group__04282 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Emission__Group__1_in_rule__Emission__Group__04285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emission__ValuedObjectAssignment_0_in_rule__Emission__Group__0__Impl4312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emission__Group__1__Impl_in_rule__Emission__Group__14342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emission__Group_1__0_in_rule__Emission__Group__1__Impl4369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emission__Group_1__0__Impl_in_rule__Emission__Group_1__04404 = new BitSet(new long[]{0x00000004025203E0L});
        public static final BitSet FOLLOW_rule__Emission__Group_1__1_in_rule__Emission__Group_1__04407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Emission__Group_1__0__Impl4435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emission__Group_1__1__Impl_in_rule__Emission__Group_1__14466 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Emission__Group_1__2_in_rule__Emission__Group_1__14469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emission__NewValueAssignment_1_1_in_rule__Emission__Group_1__1__Impl4496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Emission__Group_1__2__Impl_in_rule__Emission__Group_1__24526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Emission__Group_1__2__Impl4554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__04591 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__04594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__ValuedObjectAssignment_0_in_rule__Assignment__Group__0__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__14651 = new BitSet(new long[]{0x00000004025203E0L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__14654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Assignment__Group__1__Impl4682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__24713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__ExpressionAssignment_2_in_rule__Assignment__Group__2__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04776 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl4806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4862 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04897 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14958 = new BitSet(new long[]{0x00000004025203E0L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__14961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__OperatorAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl4988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__25018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__SubExpressionsAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl5045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__05081 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__05084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__Group__0__Impl5111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__15140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl5167 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__05202 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__05205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__15263 = new BitSet(new long[]{0x00000004025203E0L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__15266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__OperatorAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl5293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__25323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__SubExpressionsAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl5350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0__Impl_in_rule__CompareOperation__Group_0__05386 = new BitSet(new long[]{0x00000000FC000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1_in_rule__CompareOperation__Group_0__05389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__Group_0__0__Impl5417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__1__Impl_in_rule__CompareOperation__Group_0__15447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0_in_rule__CompareOperation__Group_0__1__Impl5474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__0__Impl_in_rule__CompareOperation__Group_0_1__05508 = new BitSet(new long[]{0x00000000FC000000L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1_in_rule__CompareOperation__Group_0_1__05511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__1__Impl_in_rule__CompareOperation__Group_0_1__15569 = new BitSet(new long[]{0x00000004025203E0L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2_in_rule__CompareOperation__Group_0_1__15572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__OperatorAssignment_0_1_1_in_rule__CompareOperation__Group_0_1__1__Impl5599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0_1__2__Impl_in_rule__CompareOperation__Group_0_1__25629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__SubExpressionsAssignment_0_1_2_in_rule__CompareOperation__Group_0_1__2__Impl5656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__0__Impl_in_rule__NotExpression__Group_0__05692 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1_in_rule__NotExpression__Group_0__05695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__1__Impl_in_rule__NotExpression__Group_0__15753 = new BitSet(new long[]{0x00000004025203E0L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2_in_rule__NotExpression__Group_0__15756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__OperatorAssignment_0_1_in_rule__NotExpression__Group_0__1__Impl5783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__Group_0__2__Impl_in_rule__NotExpression__Group_0__25813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NotExpression__SubExpressionsAssignment_0_2_in_rule__NotExpression__Group_0__2__Impl5840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__05876 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__05879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__Group__0__Impl5906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__15935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl5962 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__05997 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__06000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__16058 = new BitSet(new long[]{0x00000004024203E0L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2_in_rule__AddExpression__Group_1__16061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__OperatorAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl6088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__2__Impl_in_rule__AddExpression__Group_1__26118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__SubExpressionsAssignment_1_2_in_rule__AddExpression__Group_1__2__Impl6145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__0__Impl_in_rule__SubExpression__Group__06181 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1_in_rule__SubExpression__Group__06184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__Group__0__Impl6211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group__1__Impl_in_rule__SubExpression__Group__16240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0_in_rule__SubExpression__Group__1__Impl6267 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__0__Impl_in_rule__SubExpression__Group_1__06302 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1_in_rule__SubExpression__Group_1__06305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__1__Impl_in_rule__SubExpression__Group_1__16363 = new BitSet(new long[]{0x00000004024203E0L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2_in_rule__SubExpression__Group_1__16366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__OperatorAssignment_1_1_in_rule__SubExpression__Group_1__1__Impl6393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__Group_1__2__Impl_in_rule__SubExpression__Group_1__26423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubExpression__SubExpressionsAssignment_1_2_in_rule__SubExpression__Group_1__2__Impl6450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__06486 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__06489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_rule__MultExpression__Group__0__Impl6516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__16545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl6572 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__06607 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__06610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__16668 = new BitSet(new long[]{0x00000004024203E0L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2_in_rule__MultExpression__Group_1__16671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__OperatorAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl6698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__2__Impl_in_rule__MultExpression__Group_1__26728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__SubExpressionsAssignment_1_2_in_rule__MultExpression__Group_1__2__Impl6755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__0__Impl_in_rule__DivExpression__Group__06791 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1_in_rule__DivExpression__Group__06794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__DivExpression__Group__0__Impl6821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group__1__Impl_in_rule__DivExpression__Group__16850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__0_in_rule__DivExpression__Group__1__Impl6877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__0__Impl_in_rule__DivExpression__Group_1__06912 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__1_in_rule__DivExpression__Group_1__06915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__1__Impl_in_rule__DivExpression__Group_1__16973 = new BitSet(new long[]{0x00000004024203E0L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__2_in_rule__DivExpression__Group_1__16976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__OperatorAssignment_1_1_in_rule__DivExpression__Group_1__1__Impl7003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__Group_1__2__Impl_in_rule__DivExpression__Group_1__27033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DivExpression__SubExpressionsAssignment_1_2_in_rule__DivExpression__Group_1__2__Impl7060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__0__Impl_in_rule__ModExpression__Group__07096 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1_in_rule__ModExpression__Group__07099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_rule__ModExpression__Group__0__Impl7126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group__1__Impl_in_rule__ModExpression__Group__17155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0_in_rule__ModExpression__Group__1__Impl7182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__0__Impl_in_rule__ModExpression__Group_1__07217 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1_in_rule__ModExpression__Group_1__07220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__1__Impl_in_rule__ModExpression__Group_1__17278 = new BitSet(new long[]{0x00000004024203E0L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2_in_rule__ModExpression__Group_1__17281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__OperatorAssignment_1_1_in_rule__ModExpression__Group_1__1__Impl7308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__Group_1__2__Impl_in_rule__ModExpression__Group_1__27338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ModExpression__SubExpressionsAssignment_1_2_in_rule__ModExpression__Group_1__2__Impl7365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__0__Impl_in_rule__NegExpression__Group_0__07401 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__1_in_rule__NegExpression__Group_0__07404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__1__Impl_in_rule__NegExpression__Group_0__17462 = new BitSet(new long[]{0x00000004024203E0L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__2_in_rule__NegExpression__Group_0__17465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__OperatorAssignment_0_1_in_rule__NegExpression__Group_0__1__Impl7492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__Group_0__2__Impl_in_rule__NegExpression__Group_0__27522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NegExpression__SubExpressionsAssignment_0_2_in_rule__NegExpression__Group_0__2__Impl7549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__0__Impl_in_rule__AtomicExpression__Group_2__07585 = new BitSet(new long[]{0x00000004025203E0L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1_in_rule__AtomicExpression__Group_2__07588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__AtomicExpression__Group_2__0__Impl7616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__1__Impl_in_rule__AtomicExpression__Group_2__17647 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2_in_rule__AtomicExpression__Group_2__17650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__AtomicExpression__Group_2__1__Impl7677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExpression__Group_2__2__Impl_in_rule__AtomicExpression__Group_2__27706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AtomicExpression__Group_2__2__Impl7734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0__Impl_in_rule__AtomicValuedExpression__Group_2__07771 = new BitSet(new long[]{0x00000004024203E0L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1_in_rule__AtomicValuedExpression__Group_2__07774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__AtomicValuedExpression__Group_2__0__Impl7803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__1__Impl_in_rule__AtomicValuedExpression__Group_2__17835 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2_in_rule__AtomicValuedExpression__Group_2__17838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_rule__AtomicValuedExpression__Group_2__1__Impl7865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__2__Impl_in_rule__AtomicValuedExpression__Group_2__27894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AtomicValuedExpression__Group_2__2__Impl7922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__0__Impl_in_rule__ValuedObjectTestExpression__Group_0__07959 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1_in_rule__ValuedObjectTestExpression__Group_0__07962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__1__Impl_in_rule__ValuedObjectTestExpression__Group_0__18020 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2_in_rule__ValuedObjectTestExpression__Group_0__18023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAssignment_0_1_in_rule__ValuedObjectTestExpression__Group_0__1__Impl8050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__2__Impl_in_rule__ValuedObjectTestExpression__Group_0__28080 = new BitSet(new long[]{0x0000000002020020L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3_in_rule__ValuedObjectTestExpression__Group_0__28083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ValuedObjectTestExpression__Group_0__2__Impl8111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__3__Impl_in_rule__ValuedObjectTestExpression__Group_0__38142 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4_in_rule__ValuedObjectTestExpression__Group_0__38145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3_in_rule__ValuedObjectTestExpression__Group_0__3__Impl8172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__Group_0__4__Impl_in_rule__ValuedObjectTestExpression__Group_0__48202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ValuedObjectTestExpression__Group_0__4__Impl8230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__08271 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__08274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__TagAnnotation__Group__0__Impl8302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__18333 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__18336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl8363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__28393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl8420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__08457 = new BitSet(new long[]{0x0000002800000400L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__08460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__TagAnnotation__Group_2__0__Impl8488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__18519 = new BitSet(new long[]{0x0000002800000400L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__18522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl8549 = new BitSet(new long[]{0x0000002000000402L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__28580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__TagAnnotation__Group_2__2__Impl8608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__08645 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__08648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__KeyStringValueAnnotation__Group__0__Impl8676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__18707 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__18710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl8737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__28767 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__28770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl8797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__38827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl8854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__08893 = new BitSet(new long[]{0x0000002800000400L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__08896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyStringValueAnnotation__Group_3__0__Impl8924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__18955 = new BitSet(new long[]{0x0000002800000400L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__18958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl8985 = new BitSet(new long[]{0x0000002000000402L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__29016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyStringValueAnnotation__Group_3__2__Impl9044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__09081 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__09084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl9112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__19143 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__19146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl9173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__29203 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__29206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl9234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__39265 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__39268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl9295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__49325 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__49328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl9356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__59387 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__59390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl9417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__69447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl9474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__09519 = new BitSet(new long[]{0x0000002800000400L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__09522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl9550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__19581 = new BitSet(new long[]{0x0000002800000400L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__19584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl9611 = new BitSet(new long[]{0x0000002000000402L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__29642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl9670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__09707 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__09710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__KeyBooleanValueAnnotation__Group__0__Impl9738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__19769 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__19772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl9799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__29829 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__29832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl9859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__39889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl9916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__09955 = new BitSet(new long[]{0x0000002800000400L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__09958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl9986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__110017 = new BitSet(new long[]{0x0000002800000400L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__110020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl10047 = new BitSet(new long[]{0x0000002000000402L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__210078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl10106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__010143 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__010146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__KeyIntValueAnnotation__Group__0__Impl10174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__110205 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__110208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl10235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__210265 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__210268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl10295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__310325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl10352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__010391 = new BitSet(new long[]{0x0000002800000400L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__010394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyIntValueAnnotation__Group_3__0__Impl10422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__110453 = new BitSet(new long[]{0x0000002800000400L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__110456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl10483 = new BitSet(new long[]{0x0000002000000402L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__210514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyIntValueAnnotation__Group_3__2__Impl10542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__010579 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__010582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__KeyFloatValueAnnotation__Group__0__Impl10610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__110641 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__110644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl10671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__210701 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__210704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl10731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__310761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl10788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__010827 = new BitSet(new long[]{0x0000002800000400L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__010830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl10858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__110889 = new BitSet(new long[]{0x0000002800000400L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__110892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl10919 = new BitSet(new long[]{0x0000002000000402L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__210950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl10978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__011016 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__011019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl11046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__111075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl11102 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__011137 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__011140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__ExtendedID__Group_1__0__Impl11168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__111199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl11226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__Transition__AnnotationsAssignment_111264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Transition__DelayAssignment_211295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Transition__TriggerAssignment_311326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEffect_in_rule__Transition__EffectsAssignment_4_111357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEffect_in_rule__Transition__EffectsAssignment_4_2_111388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Emission__ValuedObjectAssignment_011435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Emission__NewValueAssignment_1_111470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__ValuedObjectAssignment_011505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Assignment__ExpressionAssignment_211540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_rule__TextEffect__TextAssignment11571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_rule__OrExpression__OperatorAssignment_1_111602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__SubExpressionsAssignment_1_211633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperator_in_rule__AndExpression__OperatorAssignment_1_111664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_rule__AndExpression__SubExpressionsAssignment_1_211695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_rule__CompareOperation__OperatorAssignment_0_1_111726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_rule__CompareOperation__SubExpressionsAssignment_0_1_211757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_rule__NotExpression__OperatorAssignment_0_111788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_rule__NotExpression__SubExpressionsAssignment_0_211819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_rule__AddExpression__OperatorAssignment_1_111850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_rule__AddExpression__SubExpressionsAssignment_1_211881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_rule__SubExpression__OperatorAssignment_1_111912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__SubExpression__SubExpressionsAssignment_1_211943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_rule__MultExpression__OperatorAssignment_1_111974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_rule__MultExpression__SubExpressionsAssignment_1_212005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_rule__DivExpression__OperatorAssignment_1_112036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_rule__DivExpression__SubExpressionsAssignment_1_212067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_rule__ModExpression__OperatorAssignment_1_112098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rule__ModExpression__SubExpressionsAssignment_1_212129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_rule__NegExpression__OperatorAssignment_0_112160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_rule__NegExpression__SubExpressionsAssignment_0_212191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0_in_rule__ValuedObjectTestExpression__OperatorAssignment_0_112222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_312255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ValuedObjectReference__ValuedObjectAssignment12290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_rule__TextExpression__TextAssignment12325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment12356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment12387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment12418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment12449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_112480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_112511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_112542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_212573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_112604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_112635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_312666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_512697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_112728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_112759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_212790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_112821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_112852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_212883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_112914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_112945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_212976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_113007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred3_InternalActions2807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperation__Group_0__0_in_synpred4_InternalActions2857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred5_InternalActions2908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicValuedExpression__Group_2__0_in_synpred13_InternalActions3176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_synpred17_InternalActions3343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_synpred18_InternalActions3360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_synpred19_InternalActions3377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_synpred20_InternalActions3394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_synpred21_InternalActions3411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__DelayAssignment_2_in_synpred29_InternalActions3803 = new BitSet(new long[]{0x0000000000000002L});
    }


}