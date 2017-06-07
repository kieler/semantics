package de.cau.cs.kieler.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.services.KVisGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKVisParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ID", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'<'", "'<='", "'>'", "'>='", "'!='", "'set color'", "'set text'", "'rotate'", "'move'", "'set visible'", "'image'", "':'", "'animate'", "'{'", "'}'", "'using'", "','", "'is'", "'..'", "'when'", "'['", "']'", "'.'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=12;
    public static final int RULE_DIGIT=8;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_FLOAT=5;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalKVisParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKVisParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKVisParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKVis.g"; }


     
     	private KVisGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(KVisGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleVisualization"
    // InternalKVis.g:61:1: entryRuleVisualization : ruleVisualization EOF ;
    public final void entryRuleVisualization() throws RecognitionException {
        try {
            // InternalKVis.g:62:1: ( ruleVisualization EOF )
            // InternalKVis.g:63:1: ruleVisualization EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVisualization();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVisualizationRule()); 
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
    // $ANTLR end "entryRuleVisualization"


    // $ANTLR start "ruleVisualization"
    // InternalKVis.g:70:1: ruleVisualization : ( ( rule__Visualization__Group__0 ) ) ;
    public final void ruleVisualization() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:74:2: ( ( ( rule__Visualization__Group__0 ) ) )
            // InternalKVis.g:75:1: ( ( rule__Visualization__Group__0 ) )
            {
            // InternalKVis.g:75:1: ( ( rule__Visualization__Group__0 ) )
            // InternalKVis.g:76:1: ( rule__Visualization__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationAccess().getGroup()); 
            }
            // InternalKVis.g:77:1: ( rule__Visualization__Group__0 )
            // InternalKVis.g:77:2: rule__Visualization__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Visualization__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVisualizationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisualization"


    // $ANTLR start "entryRuleElement"
    // InternalKVis.g:89:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalKVis.g:90:1: ( ruleElement EOF )
            // InternalKVis.g:91:1: ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalKVis.g:98:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:102:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalKVis.g:103:1: ( ( rule__Element__Group__0 ) )
            {
            // InternalKVis.g:103:1: ( ( rule__Element__Group__0 ) )
            // InternalKVis.g:104:1: ( rule__Element__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getGroup()); 
            }
            // InternalKVis.g:105:1: ( rule__Element__Group__0 )
            // InternalKVis.g:105:2: rule__Element__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Element__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleAnimation"
    // InternalKVis.g:117:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // InternalKVis.g:118:1: ( ruleAnimation EOF )
            // InternalKVis.g:119:1: ruleAnimation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAnimation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationRule()); 
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
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // InternalKVis.g:126:1: ruleAnimation : ( ( rule__Animation__Group__0 ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:130:2: ( ( ( rule__Animation__Group__0 ) ) )
            // InternalKVis.g:131:1: ( ( rule__Animation__Group__0 ) )
            {
            // InternalKVis.g:131:1: ( ( rule__Animation__Group__0 ) )
            // InternalKVis.g:132:1: ( rule__Animation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getGroup()); 
            }
            // InternalKVis.g:133:1: ( rule__Animation__Group__0 )
            // InternalKVis.g:133:2: rule__Animation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleAttributeMapping"
    // InternalKVis.g:145:1: entryRuleAttributeMapping : ruleAttributeMapping EOF ;
    public final void entryRuleAttributeMapping() throws RecognitionException {
        try {
            // InternalKVis.g:146:1: ( ruleAttributeMapping EOF )
            // InternalKVis.g:147:1: ruleAttributeMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMappingRule()); 
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
    // $ANTLR end "entryRuleAttributeMapping"


    // $ANTLR start "ruleAttributeMapping"
    // InternalKVis.g:154:1: ruleAttributeMapping : ( ( rule__AttributeMapping__Group__0 ) ) ;
    public final void ruleAttributeMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:158:2: ( ( ( rule__AttributeMapping__Group__0 ) ) )
            // InternalKVis.g:159:1: ( ( rule__AttributeMapping__Group__0 ) )
            {
            // InternalKVis.g:159:1: ( ( rule__AttributeMapping__Group__0 ) )
            // InternalKVis.g:160:1: ( rule__AttributeMapping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getGroup()); 
            }
            // InternalKVis.g:161:1: ( rule__AttributeMapping__Group__0 )
            // InternalKVis.g:161:2: rule__AttributeMapping__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeMapping__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMappingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeMapping"


    // $ANTLR start "entryRuleMapping"
    // InternalKVis.g:173:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalKVis.g:174:1: ( ruleMapping EOF )
            // InternalKVis.g:175:1: ruleMapping EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingRule()); 
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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalKVis.g:182:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:186:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalKVis.g:187:1: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalKVis.g:187:1: ( ( rule__Mapping__Group__0 ) )
            // InternalKVis.g:188:1: ( rule__Mapping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getGroup()); 
            }
            // InternalKVis.g:189:1: ( rule__Mapping__Group__0 )
            // InternalKVis.g:189:2: rule__Mapping__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Mapping__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleVariableDomain"
    // InternalKVis.g:201:1: entryRuleVariableDomain : ruleVariableDomain EOF ;
    public final void entryRuleVariableDomain() throws RecognitionException {
        try {
            // InternalKVis.g:202:1: ( ruleVariableDomain EOF )
            // InternalKVis.g:203:1: ruleVariableDomain EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDomainRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVariableDomain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDomainRule()); 
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
    // $ANTLR end "entryRuleVariableDomain"


    // $ANTLR start "ruleVariableDomain"
    // InternalKVis.g:210:1: ruleVariableDomain : ( ( rule__VariableDomain__Alternatives ) ) ;
    public final void ruleVariableDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:214:2: ( ( ( rule__VariableDomain__Alternatives ) ) )
            // InternalKVis.g:215:1: ( ( rule__VariableDomain__Alternatives ) )
            {
            // InternalKVis.g:215:1: ( ( rule__VariableDomain__Alternatives ) )
            // InternalKVis.g:216:1: ( rule__VariableDomain__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDomainAccess().getAlternatives()); 
            }
            // InternalKVis.g:217:1: ( rule__VariableDomain__Alternatives )
            // InternalKVis.g:217:2: rule__VariableDomain__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDomain__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDomainAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDomain"


    // $ANTLR start "entryRuleInterval"
    // InternalKVis.g:229:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // InternalKVis.g:230:1: ( ruleInterval EOF )
            // InternalKVis.g:231:1: ruleInterval EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInterval();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalRule()); 
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
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // InternalKVis.g:238:1: ruleInterval : ( ( rule__Interval__Group__0 ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:242:2: ( ( ( rule__Interval__Group__0 ) ) )
            // InternalKVis.g:243:1: ( ( rule__Interval__Group__0 ) )
            {
            // InternalKVis.g:243:1: ( ( rule__Interval__Group__0 ) )
            // InternalKVis.g:244:1: ( rule__Interval__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getGroup()); 
            }
            // InternalKVis.g:245:1: ( rule__Interval__Group__0 )
            // InternalKVis.g:245:2: rule__Interval__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleAttributeDomain"
    // InternalKVis.g:257:1: entryRuleAttributeDomain : ruleAttributeDomain EOF ;
    public final void entryRuleAttributeDomain() throws RecognitionException {
        try {
            // InternalKVis.g:258:1: ( ruleAttributeDomain EOF )
            // InternalKVis.g:259:1: ruleAttributeDomain EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeDomainRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeDomain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeDomainRule()); 
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
    // $ANTLR end "entryRuleAttributeDomain"


    // $ANTLR start "ruleAttributeDomain"
    // InternalKVis.g:266:1: ruleAttributeDomain : ( ruleVariableDomain ) ;
    public final void ruleAttributeDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:270:2: ( ( ruleVariableDomain ) )
            // InternalKVis.g:271:1: ( ruleVariableDomain )
            {
            // InternalKVis.g:271:1: ( ruleVariableDomain )
            // InternalKVis.g:272:1: ruleVariableDomain
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeDomainAccess().getVariableDomainParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVariableDomain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeDomainAccess().getVariableDomainParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeDomain"


    // $ANTLR start "entryRuleCondition"
    // InternalKVis.g:285:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalKVis.g:286:1: ( ruleCondition EOF )
            // InternalKVis.g:287:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalKVis.g:294:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:298:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalKVis.g:299:1: ( ( rule__Condition__Group__0 ) )
            {
            // InternalKVis.g:299:1: ( ( rule__Condition__Group__0 ) )
            // InternalKVis.g:300:1: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalKVis.g:301:1: ( rule__Condition__Group__0 )
            // InternalKVis.g:301:2: rule__Condition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleVariableReference"
    // InternalKVis.g:313:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // InternalKVis.g:314:1: ( ruleVariableReference EOF )
            // InternalKVis.g:315:1: ruleVariableReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVariableReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceRule()); 
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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalKVis.g:322:1: ruleVariableReference : ( ( rule__VariableReference__Group__0 ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:326:2: ( ( ( rule__VariableReference__Group__0 ) ) )
            // InternalKVis.g:327:1: ( ( rule__VariableReference__Group__0 ) )
            {
            // InternalKVis.g:327:1: ( ( rule__VariableReference__Group__0 ) )
            // InternalKVis.g:328:1: ( rule__VariableReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup()); 
            }
            // InternalKVis.g:329:1: ( rule__VariableReference__Group__0 )
            // InternalKVis.g:329:2: rule__VariableReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleModelReference"
    // InternalKVis.g:341:1: entryRuleModelReference : ruleModelReference EOF ;
    public final void entryRuleModelReference() throws RecognitionException {
        try {
            // InternalKVis.g:342:1: ( ruleModelReference EOF )
            // InternalKVis.g:343:1: ruleModelReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleModelReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelReferenceRule()); 
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
    // $ANTLR end "entryRuleModelReference"


    // $ANTLR start "ruleModelReference"
    // InternalKVis.g:350:1: ruleModelReference : ( ( rule__ModelReference__Group__0 ) ) ;
    public final void ruleModelReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:354:2: ( ( ( rule__ModelReference__Group__0 ) ) )
            // InternalKVis.g:355:1: ( ( rule__ModelReference__Group__0 ) )
            {
            // InternalKVis.g:355:1: ( ( rule__ModelReference__Group__0 ) )
            // InternalKVis.g:356:1: ( rule__ModelReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getGroup()); 
            }
            // InternalKVis.g:357:1: ( rule__ModelReference__Group__0 )
            // InternalKVis.g:357:2: rule__ModelReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModelReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelReferenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelReference"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalKVis.g:369:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalKVis.g:370:1: ( ruleBooleanExpression EOF )
            // InternalKVis.g:371:1: ruleBooleanExpression EOF
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
    // InternalKVis.g:378:1: ruleBooleanExpression : ( ruleComparison ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:382:2: ( ( ruleComparison ) )
            // InternalKVis.g:383:1: ( ruleComparison )
            {
            // InternalKVis.g:383:1: ( ruleComparison )
            // InternalKVis.g:384:1: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getComparisonParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getComparisonParserRuleCall()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleComparison"
    // InternalKVis.g:397:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalKVis.g:398:1: ( ruleComparison EOF )
            // InternalKVis.g:399:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalKVis.g:406:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:410:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalKVis.g:411:1: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalKVis.g:411:1: ( ( rule__Comparison__Group__0 ) )
            // InternalKVis.g:412:1: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalKVis.g:413:1: ( rule__Comparison__Group__0 )
            // InternalKVis.g:413:2: rule__Comparison__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleOperand"
    // InternalKVis.g:425:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // InternalKVis.g:426:1: ( ruleOperand EOF )
            // InternalKVis.g:427:1: ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperandRule()); 
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
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalKVis.g:434:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:438:2: ( ( ( rule__Operand__Alternatives ) ) )
            // InternalKVis.g:439:1: ( ( rule__Operand__Alternatives ) )
            {
            // InternalKVis.g:439:1: ( ( rule__Operand__Alternatives ) )
            // InternalKVis.g:440:1: ( rule__Operand__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandAccess().getAlternatives()); 
            }
            // InternalKVis.g:441:1: ( rule__Operand__Alternatives )
            // InternalKVis.g:441:2: rule__Operand__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Operand__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperandAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleLiteral"
    // InternalKVis.g:453:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalKVis.g:454:1: ( ruleLiteral EOF )
            // InternalKVis.g:455:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalKVis.g:462:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:466:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalKVis.g:467:1: ( ( rule__Literal__Alternatives ) )
            {
            // InternalKVis.g:467:1: ( ( rule__Literal__Alternatives ) )
            // InternalKVis.g:468:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalKVis.g:469:1: ( rule__Literal__Alternatives )
            // InternalKVis.g:469:2: rule__Literal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "ruleCompareOperator"
    // InternalKVis.g:482:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:486:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalKVis.g:487:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalKVis.g:487:1: ( ( rule__CompareOperator__Alternatives ) )
            // InternalKVis.g:488:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalKVis.g:489:1: ( rule__CompareOperator__Alternatives )
            // InternalKVis.g:489:2: rule__CompareOperator__Alternatives
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


    // $ANTLR start "ruleAnimationType"
    // InternalKVis.g:501:1: ruleAnimationType : ( ( rule__AnimationType__Alternatives ) ) ;
    public final void ruleAnimationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:505:1: ( ( ( rule__AnimationType__Alternatives ) ) )
            // InternalKVis.g:506:1: ( ( rule__AnimationType__Alternatives ) )
            {
            // InternalKVis.g:506:1: ( ( rule__AnimationType__Alternatives ) )
            // InternalKVis.g:507:1: ( rule__AnimationType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationTypeAccess().getAlternatives()); 
            }
            // InternalKVis.g:508:1: ( rule__AnimationType__Alternatives )
            // InternalKVis.g:508:2: rule__AnimationType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnimationType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimationType"


    // $ANTLR start "rule__AttributeMapping__Alternatives_2"
    // InternalKVis.g:521:1: rule__AttributeMapping__Alternatives_2 : ( ( ( rule__AttributeMapping__LiteralAssignment_2_0 ) ) | ( ( rule__AttributeMapping__Group_2_1__0 ) ) );
    public final void rule__AttributeMapping__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:525:1: ( ( ( rule__AttributeMapping__LiteralAssignment_2_0 ) ) | ( ( rule__AttributeMapping__Group_2_1__0 ) ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=32 && LA1_1<=33)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||LA1_1==RULE_ID||LA1_1==29) ) {
                    alt1=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==EOF||LA1_2==RULE_ID||LA1_2==29) ) {
                    alt1=1;
                }
                else if ( ((LA1_2>=32 && LA1_2<=33)) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA1_3 = input.LA(2);

                if ( ((LA1_3>=32 && LA1_3<=33)) ) {
                    alt1=2;
                }
                else if ( (LA1_3==EOF||LA1_3==RULE_ID||LA1_3==29) ) {
                    alt1=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
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
                    // InternalKVis.g:526:1: ( ( rule__AttributeMapping__LiteralAssignment_2_0 ) )
                    {
                    // InternalKVis.g:526:1: ( ( rule__AttributeMapping__LiteralAssignment_2_0 ) )
                    // InternalKVis.g:527:1: ( rule__AttributeMapping__LiteralAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeMappingAccess().getLiteralAssignment_2_0()); 
                    }
                    // InternalKVis.g:528:1: ( rule__AttributeMapping__LiteralAssignment_2_0 )
                    // InternalKVis.g:528:2: rule__AttributeMapping__LiteralAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AttributeMapping__LiteralAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeMappingAccess().getLiteralAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:532:6: ( ( rule__AttributeMapping__Group_2_1__0 ) )
                    {
                    // InternalKVis.g:532:6: ( ( rule__AttributeMapping__Group_2_1__0 ) )
                    // InternalKVis.g:533:1: ( rule__AttributeMapping__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeMappingAccess().getGroup_2_1()); 
                    }
                    // InternalKVis.g:534:1: ( rule__AttributeMapping__Group_2_1__0 )
                    // InternalKVis.g:534:2: rule__AttributeMapping__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AttributeMapping__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeMappingAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__AttributeMapping__Alternatives_2"


    // $ANTLR start "rule__VariableDomain__Alternatives"
    // InternalKVis.g:543:1: rule__VariableDomain__Alternatives : ( ( ( rule__VariableDomain__ValueAssignment_0 ) ) | ( ( rule__VariableDomain__RangeAssignment_1 ) ) );
    public final void rule__VariableDomain__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:547:1: ( ( ( rule__VariableDomain__ValueAssignment_0 ) ) | ( ( rule__VariableDomain__RangeAssignment_1 ) ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==33) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==RULE_ID||LA2_1==29||(LA2_1>=31 && LA2_1<=32)) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==33) ) {
                    alt2=2;
                }
                else if ( (LA2_2==EOF||LA2_2==RULE_ID||LA2_2==29||(LA2_2>=31 && LA2_2<=32)) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==33) ) {
                    alt2=2;
                }
                else if ( (LA2_3==EOF||LA2_3==RULE_ID||LA2_3==29||(LA2_3>=31 && LA2_3<=32)) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalKVis.g:548:1: ( ( rule__VariableDomain__ValueAssignment_0 ) )
                    {
                    // InternalKVis.g:548:1: ( ( rule__VariableDomain__ValueAssignment_0 ) )
                    // InternalKVis.g:549:1: ( rule__VariableDomain__ValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableDomainAccess().getValueAssignment_0()); 
                    }
                    // InternalKVis.g:550:1: ( rule__VariableDomain__ValueAssignment_0 )
                    // InternalKVis.g:550:2: rule__VariableDomain__ValueAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__VariableDomain__ValueAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableDomainAccess().getValueAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:554:6: ( ( rule__VariableDomain__RangeAssignment_1 ) )
                    {
                    // InternalKVis.g:554:6: ( ( rule__VariableDomain__RangeAssignment_1 ) )
                    // InternalKVis.g:555:1: ( rule__VariableDomain__RangeAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableDomainAccess().getRangeAssignment_1()); 
                    }
                    // InternalKVis.g:556:1: ( rule__VariableDomain__RangeAssignment_1 )
                    // InternalKVis.g:556:2: rule__VariableDomain__RangeAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__VariableDomain__RangeAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableDomainAccess().getRangeAssignment_1()); 
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
    // $ANTLR end "rule__VariableDomain__Alternatives"


    // $ANTLR start "rule__Operand__Alternatives"
    // InternalKVis.g:565:1: rule__Operand__Alternatives : ( ( ( rule__Operand__VariableAssignment_0 ) ) | ( ( rule__Operand__LiteralAssignment_1 ) ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:569:1: ( ( ( rule__Operand__VariableAssignment_0 ) ) | ( ( rule__Operand__LiteralAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_STRING)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKVis.g:570:1: ( ( rule__Operand__VariableAssignment_0 ) )
                    {
                    // InternalKVis.g:570:1: ( ( rule__Operand__VariableAssignment_0 ) )
                    // InternalKVis.g:571:1: ( rule__Operand__VariableAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getVariableAssignment_0()); 
                    }
                    // InternalKVis.g:572:1: ( rule__Operand__VariableAssignment_0 )
                    // InternalKVis.g:572:2: rule__Operand__VariableAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Operand__VariableAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperandAccess().getVariableAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:576:6: ( ( rule__Operand__LiteralAssignment_1 ) )
                    {
                    // InternalKVis.g:576:6: ( ( rule__Operand__LiteralAssignment_1 ) )
                    // InternalKVis.g:577:1: ( rule__Operand__LiteralAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getLiteralAssignment_1()); 
                    }
                    // InternalKVis.g:578:1: ( rule__Operand__LiteralAssignment_1 )
                    // InternalKVis.g:578:2: rule__Operand__LiteralAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Operand__LiteralAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperandAccess().getLiteralAssignment_1()); 
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
    // $ANTLR end "rule__Operand__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalKVis.g:587:1: rule__Literal__Alternatives : ( ( RULE_INT ) | ( RULE_FLOAT ) | ( RULE_STRING ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:591:1: ( ( RULE_INT ) | ( RULE_FLOAT ) | ( RULE_STRING ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
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
                    // InternalKVis.g:592:1: ( RULE_INT )
                    {
                    // InternalKVis.g:592:1: ( RULE_INT )
                    // InternalKVis.g:593:1: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    }
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:598:6: ( RULE_FLOAT )
                    {
                    // InternalKVis.g:598:6: ( RULE_FLOAT )
                    // InternalKVis.g:599:1: RULE_FLOAT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFLOATTerminalRuleCall_1()); 
                    }
                    match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getFLOATTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKVis.g:604:6: ( RULE_STRING )
                    {
                    // InternalKVis.g:604:6: ( RULE_STRING )
                    // InternalKVis.g:605:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_2()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalKVis.g:615:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '!=' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:619:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '!=' ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            case 18:
                {
                alt5=5;
                }
                break;
            case 19:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalKVis.g:620:1: ( ( '=' ) )
                    {
                    // InternalKVis.g:620:1: ( ( '=' ) )
                    // InternalKVis.g:621:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalKVis.g:622:1: ( '=' )
                    // InternalKVis.g:622:3: '='
                    {
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:627:6: ( ( '<' ) )
                    {
                    // InternalKVis.g:627:6: ( ( '<' ) )
                    // InternalKVis.g:628:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // InternalKVis.g:629:1: ( '<' )
                    // InternalKVis.g:629:3: '<'
                    {
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKVis.g:634:6: ( ( '<=' ) )
                    {
                    // InternalKVis.g:634:6: ( ( '<=' ) )
                    // InternalKVis.g:635:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalKVis.g:636:1: ( '<=' )
                    // InternalKVis.g:636:3: '<='
                    {
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKVis.g:641:6: ( ( '>' ) )
                    {
                    // InternalKVis.g:641:6: ( ( '>' ) )
                    // InternalKVis.g:642:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // InternalKVis.g:643:1: ( '>' )
                    // InternalKVis.g:643:3: '>'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKVis.g:648:6: ( ( '>=' ) )
                    {
                    // InternalKVis.g:648:6: ( ( '>=' ) )
                    // InternalKVis.g:649:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalKVis.g:650:1: ( '>=' )
                    // InternalKVis.g:650:3: '>='
                    {
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKVis.g:655:6: ( ( '!=' ) )
                    {
                    // InternalKVis.g:655:6: ( ( '!=' ) )
                    // InternalKVis.g:656:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // InternalKVis.g:657:1: ( '!=' )
                    // InternalKVis.g:657:3: '!='
                    {
                    match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;

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


    // $ANTLR start "rule__AnimationType__Alternatives"
    // InternalKVis.g:667:1: rule__AnimationType__Alternatives : ( ( ( 'set color' ) ) | ( ( 'set text' ) ) | ( ( 'rotate' ) ) | ( ( 'move' ) ) | ( ( 'set visible' ) ) );
    public final void rule__AnimationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:671:1: ( ( ( 'set color' ) ) | ( ( 'set text' ) ) | ( ( 'rotate' ) ) | ( ( 'move' ) ) | ( ( 'set visible' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            case 24:
                {
                alt6=5;
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
                    // InternalKVis.g:672:1: ( ( 'set color' ) )
                    {
                    // InternalKVis.g:672:1: ( ( 'set color' ) )
                    // InternalKVis.g:673:1: ( 'set color' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnimationTypeAccess().getCOLOREnumLiteralDeclaration_0()); 
                    }
                    // InternalKVis.g:674:1: ( 'set color' )
                    // InternalKVis.g:674:3: 'set color'
                    {
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnimationTypeAccess().getCOLOREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:679:6: ( ( 'set text' ) )
                    {
                    // InternalKVis.g:679:6: ( ( 'set text' ) )
                    // InternalKVis.g:680:1: ( 'set text' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnimationTypeAccess().getTEXTEnumLiteralDeclaration_1()); 
                    }
                    // InternalKVis.g:681:1: ( 'set text' )
                    // InternalKVis.g:681:3: 'set text'
                    {
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnimationTypeAccess().getTEXTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKVis.g:686:6: ( ( 'rotate' ) )
                    {
                    // InternalKVis.g:686:6: ( ( 'rotate' ) )
                    // InternalKVis.g:687:1: ( 'rotate' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnimationTypeAccess().getROTATEEnumLiteralDeclaration_2()); 
                    }
                    // InternalKVis.g:688:1: ( 'rotate' )
                    // InternalKVis.g:688:3: 'rotate'
                    {
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnimationTypeAccess().getROTATEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKVis.g:693:6: ( ( 'move' ) )
                    {
                    // InternalKVis.g:693:6: ( ( 'move' ) )
                    // InternalKVis.g:694:1: ( 'move' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnimationTypeAccess().getMOVEEnumLiteralDeclaration_3()); 
                    }
                    // InternalKVis.g:695:1: ( 'move' )
                    // InternalKVis.g:695:3: 'move'
                    {
                    match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnimationTypeAccess().getMOVEEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKVis.g:700:6: ( ( 'set visible' ) )
                    {
                    // InternalKVis.g:700:6: ( ( 'set visible' ) )
                    // InternalKVis.g:701:1: ( 'set visible' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnimationTypeAccess().getVISIBILITYEnumLiteralDeclaration_4()); 
                    }
                    // InternalKVis.g:702:1: ( 'set visible' )
                    // InternalKVis.g:702:3: 'set visible'
                    {
                    match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnimationTypeAccess().getVISIBILITYEnumLiteralDeclaration_4()); 
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
    // $ANTLR end "rule__AnimationType__Alternatives"


    // $ANTLR start "rule__Visualization__Group__0"
    // InternalKVis.g:715:1: rule__Visualization__Group__0 : rule__Visualization__Group__0__Impl rule__Visualization__Group__1 ;
    public final void rule__Visualization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:719:1: ( rule__Visualization__Group__0__Impl rule__Visualization__Group__1 )
            // InternalKVis.g:720:2: rule__Visualization__Group__0__Impl rule__Visualization__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Visualization__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Visualization__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group__0"


    // $ANTLR start "rule__Visualization__Group__0__Impl"
    // InternalKVis.g:727:1: rule__Visualization__Group__0__Impl : ( 'image' ) ;
    public final void rule__Visualization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:731:1: ( ( 'image' ) )
            // InternalKVis.g:732:1: ( 'image' )
            {
            // InternalKVis.g:732:1: ( 'image' )
            // InternalKVis.g:733:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationAccess().getImageKeyword_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVisualizationAccess().getImageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group__0__Impl"


    // $ANTLR start "rule__Visualization__Group__1"
    // InternalKVis.g:746:1: rule__Visualization__Group__1 : rule__Visualization__Group__1__Impl rule__Visualization__Group__2 ;
    public final void rule__Visualization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:750:1: ( rule__Visualization__Group__1__Impl rule__Visualization__Group__2 )
            // InternalKVis.g:751:2: rule__Visualization__Group__1__Impl rule__Visualization__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Visualization__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Visualization__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group__1"


    // $ANTLR start "rule__Visualization__Group__1__Impl"
    // InternalKVis.g:758:1: rule__Visualization__Group__1__Impl : ( ':' ) ;
    public final void rule__Visualization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:762:1: ( ( ':' ) )
            // InternalKVis.g:763:1: ( ':' )
            {
            // InternalKVis.g:763:1: ( ':' )
            // InternalKVis.g:764:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationAccess().getColonKeyword_1()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVisualizationAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group__1__Impl"


    // $ANTLR start "rule__Visualization__Group__2"
    // InternalKVis.g:777:1: rule__Visualization__Group__2 : rule__Visualization__Group__2__Impl rule__Visualization__Group__3 ;
    public final void rule__Visualization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:781:1: ( rule__Visualization__Group__2__Impl rule__Visualization__Group__3 )
            // InternalKVis.g:782:2: rule__Visualization__Group__2__Impl rule__Visualization__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Visualization__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Visualization__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group__2"


    // $ANTLR start "rule__Visualization__Group__2__Impl"
    // InternalKVis.g:789:1: rule__Visualization__Group__2__Impl : ( ( rule__Visualization__ImageAssignment_2 ) ) ;
    public final void rule__Visualization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:793:1: ( ( ( rule__Visualization__ImageAssignment_2 ) ) )
            // InternalKVis.g:794:1: ( ( rule__Visualization__ImageAssignment_2 ) )
            {
            // InternalKVis.g:794:1: ( ( rule__Visualization__ImageAssignment_2 ) )
            // InternalKVis.g:795:1: ( rule__Visualization__ImageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationAccess().getImageAssignment_2()); 
            }
            // InternalKVis.g:796:1: ( rule__Visualization__ImageAssignment_2 )
            // InternalKVis.g:796:2: rule__Visualization__ImageAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Visualization__ImageAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVisualizationAccess().getImageAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group__2__Impl"


    // $ANTLR start "rule__Visualization__Group__3"
    // InternalKVis.g:806:1: rule__Visualization__Group__3 : rule__Visualization__Group__3__Impl ;
    public final void rule__Visualization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:810:1: ( rule__Visualization__Group__3__Impl )
            // InternalKVis.g:811:2: rule__Visualization__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Visualization__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group__3"


    // $ANTLR start "rule__Visualization__Group__3__Impl"
    // InternalKVis.g:817:1: rule__Visualization__Group__3__Impl : ( ( rule__Visualization__ElementsAssignment_3 )* ) ;
    public final void rule__Visualization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:821:1: ( ( ( rule__Visualization__ElementsAssignment_3 )* ) )
            // InternalKVis.g:822:1: ( ( rule__Visualization__ElementsAssignment_3 )* )
            {
            // InternalKVis.g:822:1: ( ( rule__Visualization__ElementsAssignment_3 )* )
            // InternalKVis.g:823:1: ( rule__Visualization__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationAccess().getElementsAssignment_3()); 
            }
            // InternalKVis.g:824:1: ( rule__Visualization__ElementsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKVis.g:824:2: rule__Visualization__ElementsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__Visualization__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVisualizationAccess().getElementsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__Group__3__Impl"


    // $ANTLR start "rule__Element__Group__0"
    // InternalKVis.g:842:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:846:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalKVis.g:847:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Element__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Element__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__0"


    // $ANTLR start "rule__Element__Group__0__Impl"
    // InternalKVis.g:854:1: rule__Element__Group__0__Impl : ( 'animate' ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:858:1: ( ( 'animate' ) )
            // InternalKVis.g:859:1: ( 'animate' )
            {
            // InternalKVis.g:859:1: ( 'animate' )
            // InternalKVis.g:860:1: 'animate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAnimateKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getAnimateKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__0__Impl"


    // $ANTLR start "rule__Element__Group__1"
    // InternalKVis.g:873:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:877:1: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
            // InternalKVis.g:878:2: rule__Element__Group__1__Impl rule__Element__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Element__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Element__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__1"


    // $ANTLR start "rule__Element__Group__1__Impl"
    // InternalKVis.g:885:1: rule__Element__Group__1__Impl : ( ( rule__Element__NameAssignment_1 ) ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:889:1: ( ( ( rule__Element__NameAssignment_1 ) ) )
            // InternalKVis.g:890:1: ( ( rule__Element__NameAssignment_1 ) )
            {
            // InternalKVis.g:890:1: ( ( rule__Element__NameAssignment_1 ) )
            // InternalKVis.g:891:1: ( rule__Element__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getNameAssignment_1()); 
            }
            // InternalKVis.g:892:1: ( rule__Element__NameAssignment_1 )
            // InternalKVis.g:892:2: rule__Element__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Element__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__1__Impl"


    // $ANTLR start "rule__Element__Group__2"
    // InternalKVis.g:902:1: rule__Element__Group__2 : rule__Element__Group__2__Impl rule__Element__Group__3 ;
    public final void rule__Element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:906:1: ( rule__Element__Group__2__Impl rule__Element__Group__3 )
            // InternalKVis.g:907:2: rule__Element__Group__2__Impl rule__Element__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Element__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Element__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__2"


    // $ANTLR start "rule__Element__Group__2__Impl"
    // InternalKVis.g:914:1: rule__Element__Group__2__Impl : ( '{' ) ;
    public final void rule__Element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:918:1: ( ( '{' ) )
            // InternalKVis.g:919:1: ( '{' )
            {
            // InternalKVis.g:919:1: ( '{' )
            // InternalKVis.g:920:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__2__Impl"


    // $ANTLR start "rule__Element__Group__3"
    // InternalKVis.g:933:1: rule__Element__Group__3 : rule__Element__Group__3__Impl rule__Element__Group__4 ;
    public final void rule__Element__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:937:1: ( rule__Element__Group__3__Impl rule__Element__Group__4 )
            // InternalKVis.g:938:2: rule__Element__Group__3__Impl rule__Element__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Element__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Element__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__3"


    // $ANTLR start "rule__Element__Group__3__Impl"
    // InternalKVis.g:945:1: rule__Element__Group__3__Impl : ( ( ( rule__Element__AnimationsAssignment_3 ) ) ( ( rule__Element__AnimationsAssignment_3 )* ) ) ;
    public final void rule__Element__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:949:1: ( ( ( ( rule__Element__AnimationsAssignment_3 ) ) ( ( rule__Element__AnimationsAssignment_3 )* ) ) )
            // InternalKVis.g:950:1: ( ( ( rule__Element__AnimationsAssignment_3 ) ) ( ( rule__Element__AnimationsAssignment_3 )* ) )
            {
            // InternalKVis.g:950:1: ( ( ( rule__Element__AnimationsAssignment_3 ) ) ( ( rule__Element__AnimationsAssignment_3 )* ) )
            // InternalKVis.g:951:1: ( ( rule__Element__AnimationsAssignment_3 ) ) ( ( rule__Element__AnimationsAssignment_3 )* )
            {
            // InternalKVis.g:951:1: ( ( rule__Element__AnimationsAssignment_3 ) )
            // InternalKVis.g:952:1: ( rule__Element__AnimationsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAnimationsAssignment_3()); 
            }
            // InternalKVis.g:953:1: ( rule__Element__AnimationsAssignment_3 )
            // InternalKVis.g:953:2: rule__Element__AnimationsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Element__AnimationsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getAnimationsAssignment_3()); 
            }

            }

            // InternalKVis.g:956:1: ( ( rule__Element__AnimationsAssignment_3 )* )
            // InternalKVis.g:957:1: ( rule__Element__AnimationsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAnimationsAssignment_3()); 
            }
            // InternalKVis.g:958:1: ( rule__Element__AnimationsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=20 && LA8_0<=24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKVis.g:958:2: rule__Element__AnimationsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    rule__Element__AnimationsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getAnimationsAssignment_3()); 
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
    // $ANTLR end "rule__Element__Group__3__Impl"


    // $ANTLR start "rule__Element__Group__4"
    // InternalKVis.g:969:1: rule__Element__Group__4 : rule__Element__Group__4__Impl ;
    public final void rule__Element__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:973:1: ( rule__Element__Group__4__Impl )
            // InternalKVis.g:974:2: rule__Element__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Element__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__4"


    // $ANTLR start "rule__Element__Group__4__Impl"
    // InternalKVis.g:980:1: rule__Element__Group__4__Impl : ( '}' ) ;
    public final void rule__Element__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:984:1: ( ( '}' ) )
            // InternalKVis.g:985:1: ( '}' )
            {
            // InternalKVis.g:985:1: ( '}' )
            // InternalKVis.g:986:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__4__Impl"


    // $ANTLR start "rule__Animation__Group__0"
    // InternalKVis.g:1009:1: rule__Animation__Group__0 : rule__Animation__Group__0__Impl rule__Animation__Group__1 ;
    public final void rule__Animation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1013:1: ( rule__Animation__Group__0__Impl rule__Animation__Group__1 )
            // InternalKVis.g:1014:2: rule__Animation__Group__0__Impl rule__Animation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Animation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__0"


    // $ANTLR start "rule__Animation__Group__0__Impl"
    // InternalKVis.g:1021:1: rule__Animation__Group__0__Impl : ( ( rule__Animation__TypeAssignment_0 ) ) ;
    public final void rule__Animation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1025:1: ( ( ( rule__Animation__TypeAssignment_0 ) ) )
            // InternalKVis.g:1026:1: ( ( rule__Animation__TypeAssignment_0 ) )
            {
            // InternalKVis.g:1026:1: ( ( rule__Animation__TypeAssignment_0 ) )
            // InternalKVis.g:1027:1: ( rule__Animation__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getTypeAssignment_0()); 
            }
            // InternalKVis.g:1028:1: ( rule__Animation__TypeAssignment_0 )
            // InternalKVis.g:1028:2: rule__Animation__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__0__Impl"


    // $ANTLR start "rule__Animation__Group__1"
    // InternalKVis.g:1038:1: rule__Animation__Group__1 : rule__Animation__Group__1__Impl rule__Animation__Group__2 ;
    public final void rule__Animation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1042:1: ( rule__Animation__Group__1__Impl rule__Animation__Group__2 )
            // InternalKVis.g:1043:2: rule__Animation__Group__1__Impl rule__Animation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Animation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__1"


    // $ANTLR start "rule__Animation__Group__1__Impl"
    // InternalKVis.g:1050:1: rule__Animation__Group__1__Impl : ( ( rule__Animation__Group_1__0 )? ) ;
    public final void rule__Animation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1054:1: ( ( ( rule__Animation__Group_1__0 )? ) )
            // InternalKVis.g:1055:1: ( ( rule__Animation__Group_1__0 )? )
            {
            // InternalKVis.g:1055:1: ( ( rule__Animation__Group_1__0 )? )
            // InternalKVis.g:1056:1: ( rule__Animation__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getGroup_1()); 
            }
            // InternalKVis.g:1057:1: ( rule__Animation__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKVis.g:1057:2: rule__Animation__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Animation__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__1__Impl"


    // $ANTLR start "rule__Animation__Group__2"
    // InternalKVis.g:1067:1: rule__Animation__Group__2 : rule__Animation__Group__2__Impl rule__Animation__Group__3 ;
    public final void rule__Animation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1071:1: ( rule__Animation__Group__2__Impl rule__Animation__Group__3 )
            // InternalKVis.g:1072:2: rule__Animation__Group__2__Impl rule__Animation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Animation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__2"


    // $ANTLR start "rule__Animation__Group__2__Impl"
    // InternalKVis.g:1079:1: rule__Animation__Group__2__Impl : ( '{' ) ;
    public final void rule__Animation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1083:1: ( ( '{' ) )
            // InternalKVis.g:1084:1: ( '{' )
            {
            // InternalKVis.g:1084:1: ( '{' )
            // InternalKVis.g:1085:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__2__Impl"


    // $ANTLR start "rule__Animation__Group__3"
    // InternalKVis.g:1098:1: rule__Animation__Group__3 : rule__Animation__Group__3__Impl rule__Animation__Group__4 ;
    public final void rule__Animation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1102:1: ( rule__Animation__Group__3__Impl rule__Animation__Group__4 )
            // InternalKVis.g:1103:2: rule__Animation__Group__3__Impl rule__Animation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Animation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__3"


    // $ANTLR start "rule__Animation__Group__3__Impl"
    // InternalKVis.g:1110:1: rule__Animation__Group__3__Impl : ( ( rule__Animation__MappingsAssignment_3 )* ) ;
    public final void rule__Animation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1114:1: ( ( ( rule__Animation__MappingsAssignment_3 )* ) )
            // InternalKVis.g:1115:1: ( ( rule__Animation__MappingsAssignment_3 )* )
            {
            // InternalKVis.g:1115:1: ( ( rule__Animation__MappingsAssignment_3 )* )
            // InternalKVis.g:1116:1: ( rule__Animation__MappingsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getMappingsAssignment_3()); 
            }
            // InternalKVis.g:1117:1: ( rule__Animation__MappingsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKVis.g:1117:2: rule__Animation__MappingsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__Animation__MappingsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getMappingsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__3__Impl"


    // $ANTLR start "rule__Animation__Group__4"
    // InternalKVis.g:1127:1: rule__Animation__Group__4 : rule__Animation__Group__4__Impl rule__Animation__Group__5 ;
    public final void rule__Animation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1131:1: ( rule__Animation__Group__4__Impl rule__Animation__Group__5 )
            // InternalKVis.g:1132:2: rule__Animation__Group__4__Impl rule__Animation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Animation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__4"


    // $ANTLR start "rule__Animation__Group__4__Impl"
    // InternalKVis.g:1139:1: rule__Animation__Group__4__Impl : ( '}' ) ;
    public final void rule__Animation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1143:1: ( ( '}' ) )
            // InternalKVis.g:1144:1: ( '}' )
            {
            // InternalKVis.g:1144:1: ( '}' )
            // InternalKVis.g:1145:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__4__Impl"


    // $ANTLR start "rule__Animation__Group__5"
    // InternalKVis.g:1158:1: rule__Animation__Group__5 : rule__Animation__Group__5__Impl ;
    public final void rule__Animation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1162:1: ( rule__Animation__Group__5__Impl )
            // InternalKVis.g:1163:2: rule__Animation__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__5"


    // $ANTLR start "rule__Animation__Group__5__Impl"
    // InternalKVis.g:1169:1: rule__Animation__Group__5__Impl : ( ( rule__Animation__ConditionAssignment_5 )? ) ;
    public final void rule__Animation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1173:1: ( ( ( rule__Animation__ConditionAssignment_5 )? ) )
            // InternalKVis.g:1174:1: ( ( rule__Animation__ConditionAssignment_5 )? )
            {
            // InternalKVis.g:1174:1: ( ( rule__Animation__ConditionAssignment_5 )? )
            // InternalKVis.g:1175:1: ( rule__Animation__ConditionAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getConditionAssignment_5()); 
            }
            // InternalKVis.g:1176:1: ( rule__Animation__ConditionAssignment_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKVis.g:1176:2: rule__Animation__ConditionAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Animation__ConditionAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getConditionAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__5__Impl"


    // $ANTLR start "rule__Animation__Group_1__0"
    // InternalKVis.g:1198:1: rule__Animation__Group_1__0 : rule__Animation__Group_1__0__Impl rule__Animation__Group_1__1 ;
    public final void rule__Animation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1202:1: ( rule__Animation__Group_1__0__Impl rule__Animation__Group_1__1 )
            // InternalKVis.g:1203:2: rule__Animation__Group_1__0__Impl rule__Animation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Animation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1__0"


    // $ANTLR start "rule__Animation__Group_1__0__Impl"
    // InternalKVis.g:1210:1: rule__Animation__Group_1__0__Impl : ( 'using' ) ;
    public final void rule__Animation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1214:1: ( ( 'using' ) )
            // InternalKVis.g:1215:1: ( 'using' )
            {
            // InternalKVis.g:1215:1: ( 'using' )
            // InternalKVis.g:1216:1: 'using'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getUsingKeyword_1_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getUsingKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1__0__Impl"


    // $ANTLR start "rule__Animation__Group_1__1"
    // InternalKVis.g:1229:1: rule__Animation__Group_1__1 : rule__Animation__Group_1__1__Impl ;
    public final void rule__Animation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1233:1: ( rule__Animation__Group_1__1__Impl )
            // InternalKVis.g:1234:2: rule__Animation__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1__1"


    // $ANTLR start "rule__Animation__Group_1__1__Impl"
    // InternalKVis.g:1240:1: rule__Animation__Group_1__1__Impl : ( ( rule__Animation__VariableAssignment_1_1 ) ) ;
    public final void rule__Animation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1244:1: ( ( ( rule__Animation__VariableAssignment_1_1 ) ) )
            // InternalKVis.g:1245:1: ( ( rule__Animation__VariableAssignment_1_1 ) )
            {
            // InternalKVis.g:1245:1: ( ( rule__Animation__VariableAssignment_1_1 ) )
            // InternalKVis.g:1246:1: ( rule__Animation__VariableAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getVariableAssignment_1_1()); 
            }
            // InternalKVis.g:1247:1: ( rule__Animation__VariableAssignment_1_1 )
            // InternalKVis.g:1247:2: rule__Animation__VariableAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__VariableAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getVariableAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeMapping__Group__0"
    // InternalKVis.g:1261:1: rule__AttributeMapping__Group__0 : rule__AttributeMapping__Group__0__Impl rule__AttributeMapping__Group__1 ;
    public final void rule__AttributeMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1265:1: ( rule__AttributeMapping__Group__0__Impl rule__AttributeMapping__Group__1 )
            // InternalKVis.g:1266:2: rule__AttributeMapping__Group__0__Impl rule__AttributeMapping__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__AttributeMapping__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeMapping__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group__0"


    // $ANTLR start "rule__AttributeMapping__Group__0__Impl"
    // InternalKVis.g:1273:1: rule__AttributeMapping__Group__0__Impl : ( ( rule__AttributeMapping__AttributeAssignment_0 ) ) ;
    public final void rule__AttributeMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1277:1: ( ( ( rule__AttributeMapping__AttributeAssignment_0 ) ) )
            // InternalKVis.g:1278:1: ( ( rule__AttributeMapping__AttributeAssignment_0 ) )
            {
            // InternalKVis.g:1278:1: ( ( rule__AttributeMapping__AttributeAssignment_0 ) )
            // InternalKVis.g:1279:1: ( rule__AttributeMapping__AttributeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getAttributeAssignment_0()); 
            }
            // InternalKVis.g:1280:1: ( rule__AttributeMapping__AttributeAssignment_0 )
            // InternalKVis.g:1280:2: rule__AttributeMapping__AttributeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeMapping__AttributeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMappingAccess().getAttributeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group__0__Impl"


    // $ANTLR start "rule__AttributeMapping__Group__1"
    // InternalKVis.g:1290:1: rule__AttributeMapping__Group__1 : rule__AttributeMapping__Group__1__Impl rule__AttributeMapping__Group__2 ;
    public final void rule__AttributeMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1294:1: ( rule__AttributeMapping__Group__1__Impl rule__AttributeMapping__Group__2 )
            // InternalKVis.g:1295:2: rule__AttributeMapping__Group__1__Impl rule__AttributeMapping__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__AttributeMapping__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeMapping__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group__1"


    // $ANTLR start "rule__AttributeMapping__Group__1__Impl"
    // InternalKVis.g:1302:1: rule__AttributeMapping__Group__1__Impl : ( ':' ) ;
    public final void rule__AttributeMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1306:1: ( ( ':' ) )
            // InternalKVis.g:1307:1: ( ':' )
            {
            // InternalKVis.g:1307:1: ( ':' )
            // InternalKVis.g:1308:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getColonKeyword_1()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMappingAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group__1__Impl"


    // $ANTLR start "rule__AttributeMapping__Group__2"
    // InternalKVis.g:1321:1: rule__AttributeMapping__Group__2 : rule__AttributeMapping__Group__2__Impl ;
    public final void rule__AttributeMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1325:1: ( rule__AttributeMapping__Group__2__Impl )
            // InternalKVis.g:1326:2: rule__AttributeMapping__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeMapping__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group__2"


    // $ANTLR start "rule__AttributeMapping__Group__2__Impl"
    // InternalKVis.g:1332:1: rule__AttributeMapping__Group__2__Impl : ( ( rule__AttributeMapping__Alternatives_2 ) ) ;
    public final void rule__AttributeMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1336:1: ( ( ( rule__AttributeMapping__Alternatives_2 ) ) )
            // InternalKVis.g:1337:1: ( ( rule__AttributeMapping__Alternatives_2 ) )
            {
            // InternalKVis.g:1337:1: ( ( rule__AttributeMapping__Alternatives_2 ) )
            // InternalKVis.g:1338:1: ( rule__AttributeMapping__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getAlternatives_2()); 
            }
            // InternalKVis.g:1339:1: ( rule__AttributeMapping__Alternatives_2 )
            // InternalKVis.g:1339:2: rule__AttributeMapping__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeMapping__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMappingAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group__2__Impl"


    // $ANTLR start "rule__AttributeMapping__Group_2_1__0"
    // InternalKVis.g:1355:1: rule__AttributeMapping__Group_2_1__0 : rule__AttributeMapping__Group_2_1__0__Impl rule__AttributeMapping__Group_2_1__1 ;
    public final void rule__AttributeMapping__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1359:1: ( rule__AttributeMapping__Group_2_1__0__Impl rule__AttributeMapping__Group_2_1__1 )
            // InternalKVis.g:1360:2: rule__AttributeMapping__Group_2_1__0__Impl rule__AttributeMapping__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__AttributeMapping__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeMapping__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group_2_1__0"


    // $ANTLR start "rule__AttributeMapping__Group_2_1__0__Impl"
    // InternalKVis.g:1367:1: rule__AttributeMapping__Group_2_1__0__Impl : ( ( rule__AttributeMapping__MappingsAssignment_2_1_0 ) ) ;
    public final void rule__AttributeMapping__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1371:1: ( ( ( rule__AttributeMapping__MappingsAssignment_2_1_0 ) ) )
            // InternalKVis.g:1372:1: ( ( rule__AttributeMapping__MappingsAssignment_2_1_0 ) )
            {
            // InternalKVis.g:1372:1: ( ( rule__AttributeMapping__MappingsAssignment_2_1_0 ) )
            // InternalKVis.g:1373:1: ( rule__AttributeMapping__MappingsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getMappingsAssignment_2_1_0()); 
            }
            // InternalKVis.g:1374:1: ( rule__AttributeMapping__MappingsAssignment_2_1_0 )
            // InternalKVis.g:1374:2: rule__AttributeMapping__MappingsAssignment_2_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeMapping__MappingsAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMappingAccess().getMappingsAssignment_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group_2_1__0__Impl"


    // $ANTLR start "rule__AttributeMapping__Group_2_1__1"
    // InternalKVis.g:1384:1: rule__AttributeMapping__Group_2_1__1 : rule__AttributeMapping__Group_2_1__1__Impl ;
    public final void rule__AttributeMapping__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1388:1: ( rule__AttributeMapping__Group_2_1__1__Impl )
            // InternalKVis.g:1389:2: rule__AttributeMapping__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeMapping__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group_2_1__1"


    // $ANTLR start "rule__AttributeMapping__Group_2_1__1__Impl"
    // InternalKVis.g:1395:1: rule__AttributeMapping__Group_2_1__1__Impl : ( ( rule__AttributeMapping__Group_2_1_1__0 )* ) ;
    public final void rule__AttributeMapping__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1399:1: ( ( ( rule__AttributeMapping__Group_2_1_1__0 )* ) )
            // InternalKVis.g:1400:1: ( ( rule__AttributeMapping__Group_2_1_1__0 )* )
            {
            // InternalKVis.g:1400:1: ( ( rule__AttributeMapping__Group_2_1_1__0 )* )
            // InternalKVis.g:1401:1: ( rule__AttributeMapping__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getGroup_2_1_1()); 
            }
            // InternalKVis.g:1402:1: ( rule__AttributeMapping__Group_2_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKVis.g:1402:2: rule__AttributeMapping__Group_2_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__AttributeMapping__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMappingAccess().getGroup_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group_2_1__1__Impl"


    // $ANTLR start "rule__AttributeMapping__Group_2_1_1__0"
    // InternalKVis.g:1416:1: rule__AttributeMapping__Group_2_1_1__0 : rule__AttributeMapping__Group_2_1_1__0__Impl rule__AttributeMapping__Group_2_1_1__1 ;
    public final void rule__AttributeMapping__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1420:1: ( rule__AttributeMapping__Group_2_1_1__0__Impl rule__AttributeMapping__Group_2_1_1__1 )
            // InternalKVis.g:1421:2: rule__AttributeMapping__Group_2_1_1__0__Impl rule__AttributeMapping__Group_2_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__AttributeMapping__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeMapping__Group_2_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group_2_1_1__0"


    // $ANTLR start "rule__AttributeMapping__Group_2_1_1__0__Impl"
    // InternalKVis.g:1428:1: rule__AttributeMapping__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__AttributeMapping__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1432:1: ( ( ',' ) )
            // InternalKVis.g:1433:1: ( ',' )
            {
            // InternalKVis.g:1433:1: ( ',' )
            // InternalKVis.g:1434:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMappingAccess().getCommaKeyword_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__AttributeMapping__Group_2_1_1__1"
    // InternalKVis.g:1447:1: rule__AttributeMapping__Group_2_1_1__1 : rule__AttributeMapping__Group_2_1_1__1__Impl ;
    public final void rule__AttributeMapping__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1451:1: ( rule__AttributeMapping__Group_2_1_1__1__Impl )
            // InternalKVis.g:1452:2: rule__AttributeMapping__Group_2_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeMapping__Group_2_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group_2_1_1__1"


    // $ANTLR start "rule__AttributeMapping__Group_2_1_1__1__Impl"
    // InternalKVis.g:1458:1: rule__AttributeMapping__Group_2_1_1__1__Impl : ( ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 ) ) ;
    public final void rule__AttributeMapping__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1462:1: ( ( ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 ) ) )
            // InternalKVis.g:1463:1: ( ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 ) )
            {
            // InternalKVis.g:1463:1: ( ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 ) )
            // InternalKVis.g:1464:1: ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getMappingsAssignment_2_1_1_1()); 
            }
            // InternalKVis.g:1465:1: ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 )
            // InternalKVis.g:1465:2: rule__AttributeMapping__MappingsAssignment_2_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeMapping__MappingsAssignment_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMappingAccess().getMappingsAssignment_2_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Mapping__Group__0"
    // InternalKVis.g:1479:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1483:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalKVis.g:1484:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Mapping__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Mapping__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // InternalKVis.g:1491:1: rule__Mapping__Group__0__Impl : ( ( rule__Mapping__VariableDomainAssignment_0 ) ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1495:1: ( ( ( rule__Mapping__VariableDomainAssignment_0 ) ) )
            // InternalKVis.g:1496:1: ( ( rule__Mapping__VariableDomainAssignment_0 ) )
            {
            // InternalKVis.g:1496:1: ( ( rule__Mapping__VariableDomainAssignment_0 ) )
            // InternalKVis.g:1497:1: ( rule__Mapping__VariableDomainAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getVariableDomainAssignment_0()); 
            }
            // InternalKVis.g:1498:1: ( rule__Mapping__VariableDomainAssignment_0 )
            // InternalKVis.g:1498:2: rule__Mapping__VariableDomainAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Mapping__VariableDomainAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getVariableDomainAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // InternalKVis.g:1508:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1512:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalKVis.g:1513:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Mapping__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Mapping__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // InternalKVis.g:1520:1: rule__Mapping__Group__1__Impl : ( 'is' ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1524:1: ( ( 'is' ) )
            // InternalKVis.g:1525:1: ( 'is' )
            {
            // InternalKVis.g:1525:1: ( 'is' )
            // InternalKVis.g:1526:1: 'is'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getIsKeyword_1()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getIsKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__Mapping__Group__2"
    // InternalKVis.g:1539:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1543:1: ( rule__Mapping__Group__2__Impl )
            // InternalKVis.g:1544:2: rule__Mapping__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Mapping__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2"


    // $ANTLR start "rule__Mapping__Group__2__Impl"
    // InternalKVis.g:1550:1: rule__Mapping__Group__2__Impl : ( ( rule__Mapping__AttributeDomainAssignment_2 ) ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1554:1: ( ( ( rule__Mapping__AttributeDomainAssignment_2 ) ) )
            // InternalKVis.g:1555:1: ( ( rule__Mapping__AttributeDomainAssignment_2 ) )
            {
            // InternalKVis.g:1555:1: ( ( rule__Mapping__AttributeDomainAssignment_2 ) )
            // InternalKVis.g:1556:1: ( rule__Mapping__AttributeDomainAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getAttributeDomainAssignment_2()); 
            }
            // InternalKVis.g:1557:1: ( rule__Mapping__AttributeDomainAssignment_2 )
            // InternalKVis.g:1557:2: rule__Mapping__AttributeDomainAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Mapping__AttributeDomainAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getAttributeDomainAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2__Impl"


    // $ANTLR start "rule__Interval__Group__0"
    // InternalKVis.g:1573:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1577:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // InternalKVis.g:1578:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__Interval__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__0"


    // $ANTLR start "rule__Interval__Group__0__Impl"
    // InternalKVis.g:1585:1: rule__Interval__Group__0__Impl : ( ( rule__Interval__FromAssignment_0 ) ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1589:1: ( ( ( rule__Interval__FromAssignment_0 ) ) )
            // InternalKVis.g:1590:1: ( ( rule__Interval__FromAssignment_0 ) )
            {
            // InternalKVis.g:1590:1: ( ( rule__Interval__FromAssignment_0 ) )
            // InternalKVis.g:1591:1: ( rule__Interval__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getFromAssignment_0()); 
            }
            // InternalKVis.g:1592:1: ( rule__Interval__FromAssignment_0 )
            // InternalKVis.g:1592:2: rule__Interval__FromAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__FromAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getFromAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__0__Impl"


    // $ANTLR start "rule__Interval__Group__1"
    // InternalKVis.g:1602:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1606:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // InternalKVis.g:1607:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Interval__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__1"


    // $ANTLR start "rule__Interval__Group__1__Impl"
    // InternalKVis.g:1614:1: rule__Interval__Group__1__Impl : ( '..' ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1618:1: ( ( '..' ) )
            // InternalKVis.g:1619:1: ( '..' )
            {
            // InternalKVis.g:1619:1: ( '..' )
            // InternalKVis.g:1620:1: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__1__Impl"


    // $ANTLR start "rule__Interval__Group__2"
    // InternalKVis.g:1633:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1637:1: ( rule__Interval__Group__2__Impl )
            // InternalKVis.g:1638:2: rule__Interval__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__2"


    // $ANTLR start "rule__Interval__Group__2__Impl"
    // InternalKVis.g:1644:1: rule__Interval__Group__2__Impl : ( ( rule__Interval__ToAssignment_2 ) ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1648:1: ( ( ( rule__Interval__ToAssignment_2 ) ) )
            // InternalKVis.g:1649:1: ( ( rule__Interval__ToAssignment_2 ) )
            {
            // InternalKVis.g:1649:1: ( ( rule__Interval__ToAssignment_2 ) )
            // InternalKVis.g:1650:1: ( rule__Interval__ToAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getToAssignment_2()); 
            }
            // InternalKVis.g:1651:1: ( rule__Interval__ToAssignment_2 )
            // InternalKVis.g:1651:2: rule__Interval__ToAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__ToAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getToAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalKVis.g:1667:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1671:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalKVis.g:1672:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalKVis.g:1679:1: rule__Condition__Group__0__Impl : ( 'when' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1683:1: ( ( 'when' ) )
            // InternalKVis.g:1684:1: ( 'when' )
            {
            // InternalKVis.g:1684:1: ( 'when' )
            // InternalKVis.g:1685:1: 'when'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getWhenKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getWhenKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalKVis.g:1698:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1702:1: ( rule__Condition__Group__1__Impl )
            // InternalKVis.g:1703:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Condition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalKVis.g:1709:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ExpressionAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1713:1: ( ( ( rule__Condition__ExpressionAssignment_1 ) ) )
            // InternalKVis.g:1714:1: ( ( rule__Condition__ExpressionAssignment_1 ) )
            {
            // InternalKVis.g:1714:1: ( ( rule__Condition__ExpressionAssignment_1 ) )
            // InternalKVis.g:1715:1: ( rule__Condition__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExpressionAssignment_1()); 
            }
            // InternalKVis.g:1716:1: ( rule__Condition__ExpressionAssignment_1 )
            // InternalKVis.g:1716:2: rule__Condition__ExpressionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Condition__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getExpressionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__VariableReference__Group__0"
    // InternalKVis.g:1730:1: rule__VariableReference__Group__0 : rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 ;
    public final void rule__VariableReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1734:1: ( rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 )
            // InternalKVis.g:1735:2: rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__VariableReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__0"


    // $ANTLR start "rule__VariableReference__Group__0__Impl"
    // InternalKVis.g:1742:1: rule__VariableReference__Group__0__Impl : ( ( rule__VariableReference__ModelAssignment_0 )? ) ;
    public final void rule__VariableReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1746:1: ( ( ( rule__VariableReference__ModelAssignment_0 )? ) )
            // InternalKVis.g:1747:1: ( ( rule__VariableReference__ModelAssignment_0 )? )
            {
            // InternalKVis.g:1747:1: ( ( rule__VariableReference__ModelAssignment_0 )? )
            // InternalKVis.g:1748:1: ( rule__VariableReference__ModelAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getModelAssignment_0()); 
            }
            // InternalKVis.g:1749:1: ( rule__VariableReference__ModelAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==37) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalKVis.g:1749:2: rule__VariableReference__ModelAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__VariableReference__ModelAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getModelAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__0__Impl"


    // $ANTLR start "rule__VariableReference__Group__1"
    // InternalKVis.g:1759:1: rule__VariableReference__Group__1 : rule__VariableReference__Group__1__Impl rule__VariableReference__Group__2 ;
    public final void rule__VariableReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1763:1: ( rule__VariableReference__Group__1__Impl rule__VariableReference__Group__2 )
            // InternalKVis.g:1764:2: rule__VariableReference__Group__1__Impl rule__VariableReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__VariableReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableReference__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__1"


    // $ANTLR start "rule__VariableReference__Group__1__Impl"
    // InternalKVis.g:1771:1: rule__VariableReference__Group__1__Impl : ( ( rule__VariableReference__NameAssignment_1 ) ) ;
    public final void rule__VariableReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1775:1: ( ( ( rule__VariableReference__NameAssignment_1 ) ) )
            // InternalKVis.g:1776:1: ( ( rule__VariableReference__NameAssignment_1 ) )
            {
            // InternalKVis.g:1776:1: ( ( rule__VariableReference__NameAssignment_1 ) )
            // InternalKVis.g:1777:1: ( rule__VariableReference__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getNameAssignment_1()); 
            }
            // InternalKVis.g:1778:1: ( rule__VariableReference__NameAssignment_1 )
            // InternalKVis.g:1778:2: rule__VariableReference__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableReference__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__1__Impl"


    // $ANTLR start "rule__VariableReference__Group__2"
    // InternalKVis.g:1788:1: rule__VariableReference__Group__2 : rule__VariableReference__Group__2__Impl ;
    public final void rule__VariableReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1792:1: ( rule__VariableReference__Group__2__Impl )
            // InternalKVis.g:1793:2: rule__VariableReference__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableReference__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__2"


    // $ANTLR start "rule__VariableReference__Group__2__Impl"
    // InternalKVis.g:1799:1: rule__VariableReference__Group__2__Impl : ( ( rule__VariableReference__Group_2__0 )* ) ;
    public final void rule__VariableReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1803:1: ( ( ( rule__VariableReference__Group_2__0 )* ) )
            // InternalKVis.g:1804:1: ( ( rule__VariableReference__Group_2__0 )* )
            {
            // InternalKVis.g:1804:1: ( ( rule__VariableReference__Group_2__0 )* )
            // InternalKVis.g:1805:1: ( rule__VariableReference__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup_2()); 
            }
            // InternalKVis.g:1806:1: ( rule__VariableReference__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKVis.g:1806:2: rule__VariableReference__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    rule__VariableReference__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group__2__Impl"


    // $ANTLR start "rule__VariableReference__Group_2__0"
    // InternalKVis.g:1822:1: rule__VariableReference__Group_2__0 : rule__VariableReference__Group_2__0__Impl rule__VariableReference__Group_2__1 ;
    public final void rule__VariableReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1826:1: ( rule__VariableReference__Group_2__0__Impl rule__VariableReference__Group_2__1 )
            // InternalKVis.g:1827:2: rule__VariableReference__Group_2__0__Impl rule__VariableReference__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__VariableReference__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableReference__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group_2__0"


    // $ANTLR start "rule__VariableReference__Group_2__0__Impl"
    // InternalKVis.g:1834:1: rule__VariableReference__Group_2__0__Impl : ( '[' ) ;
    public final void rule__VariableReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1838:1: ( ( '[' ) )
            // InternalKVis.g:1839:1: ( '[' )
            {
            // InternalKVis.g:1839:1: ( '[' )
            // InternalKVis.g:1840:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getLeftSquareBracketKeyword_2_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getLeftSquareBracketKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group_2__0__Impl"


    // $ANTLR start "rule__VariableReference__Group_2__1"
    // InternalKVis.g:1853:1: rule__VariableReference__Group_2__1 : rule__VariableReference__Group_2__1__Impl rule__VariableReference__Group_2__2 ;
    public final void rule__VariableReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1857:1: ( rule__VariableReference__Group_2__1__Impl rule__VariableReference__Group_2__2 )
            // InternalKVis.g:1858:2: rule__VariableReference__Group_2__1__Impl rule__VariableReference__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__VariableReference__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableReference__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group_2__1"


    // $ANTLR start "rule__VariableReference__Group_2__1__Impl"
    // InternalKVis.g:1865:1: rule__VariableReference__Group_2__1__Impl : ( ( rule__VariableReference__IndicesAssignment_2_1 ) ) ;
    public final void rule__VariableReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1869:1: ( ( ( rule__VariableReference__IndicesAssignment_2_1 ) ) )
            // InternalKVis.g:1870:1: ( ( rule__VariableReference__IndicesAssignment_2_1 ) )
            {
            // InternalKVis.g:1870:1: ( ( rule__VariableReference__IndicesAssignment_2_1 ) )
            // InternalKVis.g:1871:1: ( rule__VariableReference__IndicesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getIndicesAssignment_2_1()); 
            }
            // InternalKVis.g:1872:1: ( rule__VariableReference__IndicesAssignment_2_1 )
            // InternalKVis.g:1872:2: rule__VariableReference__IndicesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableReference__IndicesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getIndicesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group_2__1__Impl"


    // $ANTLR start "rule__VariableReference__Group_2__2"
    // InternalKVis.g:1882:1: rule__VariableReference__Group_2__2 : rule__VariableReference__Group_2__2__Impl ;
    public final void rule__VariableReference__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1886:1: ( rule__VariableReference__Group_2__2__Impl )
            // InternalKVis.g:1887:2: rule__VariableReference__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableReference__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group_2__2"


    // $ANTLR start "rule__VariableReference__Group_2__2__Impl"
    // InternalKVis.g:1893:1: rule__VariableReference__Group_2__2__Impl : ( ']' ) ;
    public final void rule__VariableReference__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1897:1: ( ( ']' ) )
            // InternalKVis.g:1898:1: ( ']' )
            {
            // InternalKVis.g:1898:1: ( ']' )
            // InternalKVis.g:1899:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getRightSquareBracketKeyword_2_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getRightSquareBracketKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__Group_2__2__Impl"


    // $ANTLR start "rule__ModelReference__Group__0"
    // InternalKVis.g:1918:1: rule__ModelReference__Group__0 : rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1 ;
    public final void rule__ModelReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1922:1: ( rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1 )
            // InternalKVis.g:1923:2: rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__ModelReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModelReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelReference__Group__0"


    // $ANTLR start "rule__ModelReference__Group__0__Impl"
    // InternalKVis.g:1930:1: rule__ModelReference__Group__0__Impl : ( ( rule__ModelReference__NameAssignment_0 ) ) ;
    public final void rule__ModelReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1934:1: ( ( ( rule__ModelReference__NameAssignment_0 ) ) )
            // InternalKVis.g:1935:1: ( ( rule__ModelReference__NameAssignment_0 ) )
            {
            // InternalKVis.g:1935:1: ( ( rule__ModelReference__NameAssignment_0 ) )
            // InternalKVis.g:1936:1: ( rule__ModelReference__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getNameAssignment_0()); 
            }
            // InternalKVis.g:1937:1: ( rule__ModelReference__NameAssignment_0 )
            // InternalKVis.g:1937:2: rule__ModelReference__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModelReference__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelReferenceAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelReference__Group__0__Impl"


    // $ANTLR start "rule__ModelReference__Group__1"
    // InternalKVis.g:1947:1: rule__ModelReference__Group__1 : rule__ModelReference__Group__1__Impl ;
    public final void rule__ModelReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1951:1: ( rule__ModelReference__Group__1__Impl )
            // InternalKVis.g:1952:2: rule__ModelReference__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ModelReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelReference__Group__1"


    // $ANTLR start "rule__ModelReference__Group__1__Impl"
    // InternalKVis.g:1958:1: rule__ModelReference__Group__1__Impl : ( '.' ) ;
    public final void rule__ModelReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1962:1: ( ( '.' ) )
            // InternalKVis.g:1963:1: ( '.' )
            {
            // InternalKVis.g:1963:1: ( '.' )
            // InternalKVis.g:1964:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getFullStopKeyword_1()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelReferenceAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelReference__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalKVis.g:1981:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1985:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalKVis.g:1986:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalKVis.g:1993:1: rule__Comparison__Group__0__Impl : ( ( rule__Comparison__LeftSideAssignment_0 ) ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1997:1: ( ( ( rule__Comparison__LeftSideAssignment_0 ) ) )
            // InternalKVis.g:1998:1: ( ( rule__Comparison__LeftSideAssignment_0 ) )
            {
            // InternalKVis.g:1998:1: ( ( rule__Comparison__LeftSideAssignment_0 ) )
            // InternalKVis.g:1999:1: ( rule__Comparison__LeftSideAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLeftSideAssignment_0()); 
            }
            // InternalKVis.g:2000:1: ( rule__Comparison__LeftSideAssignment_0 )
            // InternalKVis.g:2000:2: rule__Comparison__LeftSideAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Comparison__LeftSideAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLeftSideAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalKVis.g:2010:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2014:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // InternalKVis.g:2015:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__Comparison__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Comparison__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalKVis.g:2022:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__RelationAssignment_1 ) ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2026:1: ( ( ( rule__Comparison__RelationAssignment_1 ) ) )
            // InternalKVis.g:2027:1: ( ( rule__Comparison__RelationAssignment_1 ) )
            {
            // InternalKVis.g:2027:1: ( ( rule__Comparison__RelationAssignment_1 ) )
            // InternalKVis.g:2028:1: ( rule__Comparison__RelationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRelationAssignment_1()); 
            }
            // InternalKVis.g:2029:1: ( rule__Comparison__RelationAssignment_1 )
            // InternalKVis.g:2029:2: rule__Comparison__RelationAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Comparison__RelationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRelationAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group__2"
    // InternalKVis.g:2039:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2043:1: ( rule__Comparison__Group__2__Impl )
            // InternalKVis.g:2044:2: rule__Comparison__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Comparison__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__2"


    // $ANTLR start "rule__Comparison__Group__2__Impl"
    // InternalKVis.g:2050:1: rule__Comparison__Group__2__Impl : ( ( rule__Comparison__RightSideAssignment_2 ) ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2054:1: ( ( ( rule__Comparison__RightSideAssignment_2 ) ) )
            // InternalKVis.g:2055:1: ( ( rule__Comparison__RightSideAssignment_2 ) )
            {
            // InternalKVis.g:2055:1: ( ( rule__Comparison__RightSideAssignment_2 ) )
            // InternalKVis.g:2056:1: ( rule__Comparison__RightSideAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightSideAssignment_2()); 
            }
            // InternalKVis.g:2057:1: ( rule__Comparison__RightSideAssignment_2 )
            // InternalKVis.g:2057:2: rule__Comparison__RightSideAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Comparison__RightSideAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightSideAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__2__Impl"


    // $ANTLR start "rule__Visualization__ImageAssignment_2"
    // InternalKVis.g:2074:1: rule__Visualization__ImageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Visualization__ImageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2078:1: ( ( RULE_STRING ) )
            // InternalKVis.g:2079:1: ( RULE_STRING )
            {
            // InternalKVis.g:2079:1: ( RULE_STRING )
            // InternalKVis.g:2080:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationAccess().getImageSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVisualizationAccess().getImageSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__ImageAssignment_2"


    // $ANTLR start "rule__Visualization__ElementsAssignment_3"
    // InternalKVis.g:2089:1: rule__Visualization__ElementsAssignment_3 : ( ruleElement ) ;
    public final void rule__Visualization__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2093:1: ( ( ruleElement ) )
            // InternalKVis.g:2094:1: ( ruleElement )
            {
            // InternalKVis.g:2094:1: ( ruleElement )
            // InternalKVis.g:2095:1: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationAccess().getElementsElementParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVisualizationAccess().getElementsElementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visualization__ElementsAssignment_3"


    // $ANTLR start "rule__Element__NameAssignment_1"
    // InternalKVis.g:2104:1: rule__Element__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Element__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2108:1: ( ( RULE_ID ) )
            // InternalKVis.g:2109:1: ( RULE_ID )
            {
            // InternalKVis.g:2109:1: ( RULE_ID )
            // InternalKVis.g:2110:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__NameAssignment_1"


    // $ANTLR start "rule__Element__AnimationsAssignment_3"
    // InternalKVis.g:2119:1: rule__Element__AnimationsAssignment_3 : ( ruleAnimation ) ;
    public final void rule__Element__AnimationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2123:1: ( ( ruleAnimation ) )
            // InternalKVis.g:2124:1: ( ruleAnimation )
            {
            // InternalKVis.g:2124:1: ( ruleAnimation )
            // InternalKVis.g:2125:1: ruleAnimation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAnimationsAnimationParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnimation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getAnimationsAnimationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__AnimationsAssignment_3"


    // $ANTLR start "rule__Animation__TypeAssignment_0"
    // InternalKVis.g:2134:1: rule__Animation__TypeAssignment_0 : ( ruleAnimationType ) ;
    public final void rule__Animation__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2138:1: ( ( ruleAnimationType ) )
            // InternalKVis.g:2139:1: ( ruleAnimationType )
            {
            // InternalKVis.g:2139:1: ( ruleAnimationType )
            // InternalKVis.g:2140:1: ruleAnimationType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getTypeAnimationTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnimationType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getTypeAnimationTypeEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__TypeAssignment_0"


    // $ANTLR start "rule__Animation__VariableAssignment_1_1"
    // InternalKVis.g:2149:1: rule__Animation__VariableAssignment_1_1 : ( ruleVariableReference ) ;
    public final void rule__Animation__VariableAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2153:1: ( ( ruleVariableReference ) )
            // InternalKVis.g:2154:1: ( ruleVariableReference )
            {
            // InternalKVis.g:2154:1: ( ruleVariableReference )
            // InternalKVis.g:2155:1: ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getVariableVariableReferenceParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVariableReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getVariableVariableReferenceParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__VariableAssignment_1_1"


    // $ANTLR start "rule__Animation__MappingsAssignment_3"
    // InternalKVis.g:2164:1: rule__Animation__MappingsAssignment_3 : ( ruleAttributeMapping ) ;
    public final void rule__Animation__MappingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2168:1: ( ( ruleAttributeMapping ) )
            // InternalKVis.g:2169:1: ( ruleAttributeMapping )
            {
            // InternalKVis.g:2169:1: ( ruleAttributeMapping )
            // InternalKVis.g:2170:1: ruleAttributeMapping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getMappingsAttributeMappingParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttributeMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getMappingsAttributeMappingParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__MappingsAssignment_3"


    // $ANTLR start "rule__Animation__ConditionAssignment_5"
    // InternalKVis.g:2179:1: rule__Animation__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__Animation__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2183:1: ( ( ruleCondition ) )
            // InternalKVis.g:2184:1: ( ruleCondition )
            {
            // InternalKVis.g:2184:1: ( ruleCondition )
            // InternalKVis.g:2185:1: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getConditionConditionParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getConditionConditionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__ConditionAssignment_5"


    // $ANTLR start "rule__AttributeMapping__AttributeAssignment_0"
    // InternalKVis.g:2194:1: rule__AttributeMapping__AttributeAssignment_0 : ( RULE_ID ) ;
    public final void rule__AttributeMapping__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2198:1: ( ( RULE_ID ) )
            // InternalKVis.g:2199:1: ( RULE_ID )
            {
            // InternalKVis.g:2199:1: ( RULE_ID )
            // InternalKVis.g:2200:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getAttributeIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMappingAccess().getAttributeIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__AttributeAssignment_0"


    // $ANTLR start "rule__AttributeMapping__LiteralAssignment_2_0"
    // InternalKVis.g:2209:1: rule__AttributeMapping__LiteralAssignment_2_0 : ( ruleLiteral ) ;
    public final void rule__AttributeMapping__LiteralAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2213:1: ( ( ruleLiteral ) )
            // InternalKVis.g:2214:1: ( ruleLiteral )
            {
            // InternalKVis.g:2214:1: ( ruleLiteral )
            // InternalKVis.g:2215:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getLiteralLiteralParserRuleCall_2_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMappingAccess().getLiteralLiteralParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__LiteralAssignment_2_0"


    // $ANTLR start "rule__AttributeMapping__MappingsAssignment_2_1_0"
    // InternalKVis.g:2224:1: rule__AttributeMapping__MappingsAssignment_2_1_0 : ( ruleMapping ) ;
    public final void rule__AttributeMapping__MappingsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2228:1: ( ( ruleMapping ) )
            // InternalKVis.g:2229:1: ( ruleMapping )
            {
            // InternalKVis.g:2229:1: ( ruleMapping )
            // InternalKVis.g:2230:1: ruleMapping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getMappingsMappingParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMappingAccess().getMappingsMappingParserRuleCall_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__MappingsAssignment_2_1_0"


    // $ANTLR start "rule__AttributeMapping__MappingsAssignment_2_1_1_1"
    // InternalKVis.g:2239:1: rule__AttributeMapping__MappingsAssignment_2_1_1_1 : ( ruleMapping ) ;
    public final void rule__AttributeMapping__MappingsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2243:1: ( ( ruleMapping ) )
            // InternalKVis.g:2244:1: ( ruleMapping )
            {
            // InternalKVis.g:2244:1: ( ruleMapping )
            // InternalKVis.g:2245:1: ruleMapping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getMappingsMappingParserRuleCall_2_1_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeMappingAccess().getMappingsMappingParserRuleCall_2_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeMapping__MappingsAssignment_2_1_1_1"


    // $ANTLR start "rule__Mapping__VariableDomainAssignment_0"
    // InternalKVis.g:2254:1: rule__Mapping__VariableDomainAssignment_0 : ( ruleVariableDomain ) ;
    public final void rule__Mapping__VariableDomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2258:1: ( ( ruleVariableDomain ) )
            // InternalKVis.g:2259:1: ( ruleVariableDomain )
            {
            // InternalKVis.g:2259:1: ( ruleVariableDomain )
            // InternalKVis.g:2260:1: ruleVariableDomain
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getVariableDomainVariableDomainParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVariableDomain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getVariableDomainVariableDomainParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__VariableDomainAssignment_0"


    // $ANTLR start "rule__Mapping__AttributeDomainAssignment_2"
    // InternalKVis.g:2269:1: rule__Mapping__AttributeDomainAssignment_2 : ( ruleAttributeDomain ) ;
    public final void rule__Mapping__AttributeDomainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2273:1: ( ( ruleAttributeDomain ) )
            // InternalKVis.g:2274:1: ( ruleAttributeDomain )
            {
            // InternalKVis.g:2274:1: ( ruleAttributeDomain )
            // InternalKVis.g:2275:1: ruleAttributeDomain
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getAttributeDomainAttributeDomainParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttributeDomain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMappingAccess().getAttributeDomainAttributeDomainParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__AttributeDomainAssignment_2"


    // $ANTLR start "rule__VariableDomain__ValueAssignment_0"
    // InternalKVis.g:2284:1: rule__VariableDomain__ValueAssignment_0 : ( ruleLiteral ) ;
    public final void rule__VariableDomain__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2288:1: ( ( ruleLiteral ) )
            // InternalKVis.g:2289:1: ( ruleLiteral )
            {
            // InternalKVis.g:2289:1: ( ruleLiteral )
            // InternalKVis.g:2290:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDomainAccess().getValueLiteralParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDomainAccess().getValueLiteralParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDomain__ValueAssignment_0"


    // $ANTLR start "rule__VariableDomain__RangeAssignment_1"
    // InternalKVis.g:2299:1: rule__VariableDomain__RangeAssignment_1 : ( ruleInterval ) ;
    public final void rule__VariableDomain__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2303:1: ( ( ruleInterval ) )
            // InternalKVis.g:2304:1: ( ruleInterval )
            {
            // InternalKVis.g:2304:1: ( ruleInterval )
            // InternalKVis.g:2305:1: ruleInterval
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDomainAccess().getRangeIntervalParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInterval();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDomainAccess().getRangeIntervalParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDomain__RangeAssignment_1"


    // $ANTLR start "rule__Interval__FromAssignment_0"
    // InternalKVis.g:2314:1: rule__Interval__FromAssignment_0 : ( ruleLiteral ) ;
    public final void rule__Interval__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2318:1: ( ( ruleLiteral ) )
            // InternalKVis.g:2319:1: ( ruleLiteral )
            {
            // InternalKVis.g:2319:1: ( ruleLiteral )
            // InternalKVis.g:2320:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getFromLiteralParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getFromLiteralParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__FromAssignment_0"


    // $ANTLR start "rule__Interval__ToAssignment_2"
    // InternalKVis.g:2329:1: rule__Interval__ToAssignment_2 : ( ruleLiteral ) ;
    public final void rule__Interval__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2333:1: ( ( ruleLiteral ) )
            // InternalKVis.g:2334:1: ( ruleLiteral )
            {
            // InternalKVis.g:2334:1: ( ruleLiteral )
            // InternalKVis.g:2335:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getToLiteralParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getToLiteralParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__ToAssignment_2"


    // $ANTLR start "rule__Condition__ExpressionAssignment_1"
    // InternalKVis.g:2344:1: rule__Condition__ExpressionAssignment_1 : ( ruleBooleanExpression ) ;
    public final void rule__Condition__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2348:1: ( ( ruleBooleanExpression ) )
            // InternalKVis.g:2349:1: ( ruleBooleanExpression )
            {
            // InternalKVis.g:2349:1: ( ruleBooleanExpression )
            // InternalKVis.g:2350:1: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExpressionBooleanExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getExpressionBooleanExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ExpressionAssignment_1"


    // $ANTLR start "rule__VariableReference__ModelAssignment_0"
    // InternalKVis.g:2359:1: rule__VariableReference__ModelAssignment_0 : ( ruleModelReference ) ;
    public final void rule__VariableReference__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2363:1: ( ( ruleModelReference ) )
            // InternalKVis.g:2364:1: ( ruleModelReference )
            {
            // InternalKVis.g:2364:1: ( ruleModelReference )
            // InternalKVis.g:2365:1: ruleModelReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getModelModelReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleModelReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getModelModelReferenceParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__ModelAssignment_0"


    // $ANTLR start "rule__VariableReference__NameAssignment_1"
    // InternalKVis.g:2374:1: rule__VariableReference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableReference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2378:1: ( ( RULE_ID ) )
            // InternalKVis.g:2379:1: ( RULE_ID )
            {
            // InternalKVis.g:2379:1: ( RULE_ID )
            // InternalKVis.g:2380:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__NameAssignment_1"


    // $ANTLR start "rule__VariableReference__IndicesAssignment_2_1"
    // InternalKVis.g:2389:1: rule__VariableReference__IndicesAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__VariableReference__IndicesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2393:1: ( ( RULE_INT ) )
            // InternalKVis.g:2394:1: ( RULE_INT )
            {
            // InternalKVis.g:2394:1: ( RULE_INT )
            // InternalKVis.g:2395:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getIndicesINTTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableReferenceAccess().getIndicesINTTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__IndicesAssignment_2_1"


    // $ANTLR start "rule__ModelReference__NameAssignment_0"
    // InternalKVis.g:2404:1: rule__ModelReference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ModelReference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2408:1: ( ( RULE_ID ) )
            // InternalKVis.g:2409:1: ( RULE_ID )
            {
            // InternalKVis.g:2409:1: ( RULE_ID )
            // InternalKVis.g:2410:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelReferenceAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelReference__NameAssignment_0"


    // $ANTLR start "rule__Comparison__LeftSideAssignment_0"
    // InternalKVis.g:2419:1: rule__Comparison__LeftSideAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Comparison__LeftSideAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2423:1: ( ( ruleVariableReference ) )
            // InternalKVis.g:2424:1: ( ruleVariableReference )
            {
            // InternalKVis.g:2424:1: ( ruleVariableReference )
            // InternalKVis.g:2425:1: ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLeftSideVariableReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVariableReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLeftSideVariableReferenceParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__LeftSideAssignment_0"


    // $ANTLR start "rule__Comparison__RelationAssignment_1"
    // InternalKVis.g:2434:1: rule__Comparison__RelationAssignment_1 : ( ruleCompareOperator ) ;
    public final void rule__Comparison__RelationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2438:1: ( ( ruleCompareOperator ) )
            // InternalKVis.g:2439:1: ( ruleCompareOperator )
            {
            // InternalKVis.g:2439:1: ( ruleCompareOperator )
            // InternalKVis.g:2440:1: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRelationCompareOperatorEnumRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCompareOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRelationCompareOperatorEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RelationAssignment_1"


    // $ANTLR start "rule__Comparison__RightSideAssignment_2"
    // InternalKVis.g:2449:1: rule__Comparison__RightSideAssignment_2 : ( ruleOperand ) ;
    public final void rule__Comparison__RightSideAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2453:1: ( ( ruleOperand ) )
            // InternalKVis.g:2454:1: ( ruleOperand )
            {
            // InternalKVis.g:2454:1: ( ruleOperand )
            // InternalKVis.g:2455:1: ruleOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightSideOperandParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightSideOperandParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightSideAssignment_2"


    // $ANTLR start "rule__Operand__VariableAssignment_0"
    // InternalKVis.g:2464:1: rule__Operand__VariableAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Operand__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2468:1: ( ( ruleVariableReference ) )
            // InternalKVis.g:2469:1: ( ruleVariableReference )
            {
            // InternalKVis.g:2469:1: ( ruleVariableReference )
            // InternalKVis.g:2470:1: ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVariableReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperandAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__VariableAssignment_0"


    // $ANTLR start "rule__Operand__LiteralAssignment_1"
    // InternalKVis.g:2479:1: rule__Operand__LiteralAssignment_1 : ( ruleLiteral ) ;
    public final void rule__Operand__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2483:1: ( ( ruleLiteral ) )
            // InternalKVis.g:2484:1: ( ruleLiteral )
            {
            // InternalKVis.g:2484:1: ( ruleLiteral )
            // InternalKVis.g:2485:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandAccess().getLiteralLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperandAccess().getLiteralLiteralParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__LiteralAssignment_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001F00000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001F00002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000050000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000080L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000000FC000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000000000F0L});
    }


}