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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ID", "RULE_DIGIT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'<'", "'<='", "'>'", "'>='", "'!='", "'and'", "'or'", "'image'", "':'", "'animate'", "'{'", "'}'", "'set'", "'using'", "'color'", "'text'", "'visible'", "'rotation'", "'movement'", "','", "'is'", "'..'", "'when'", "'['", "']'", "'.'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int T__40=40;
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


    // $ANTLR start "entryRuleAnimationRule"
    // InternalKVis.g:117:1: entryRuleAnimationRule : ruleAnimationRule EOF ;
    public final void entryRuleAnimationRule() throws RecognitionException {
        try {
            // InternalKVis.g:118:1: ( ruleAnimationRule EOF )
            // InternalKVis.g:119:1: ruleAnimationRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationRuleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAnimationRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationRuleRule()); 
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
    // $ANTLR end "entryRuleAnimationRule"


    // $ANTLR start "ruleAnimationRule"
    // InternalKVis.g:126:1: ruleAnimationRule : ( ( rule__AnimationRule__Group__0 ) ) ;
    public final void ruleAnimationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:130:2: ( ( ( rule__AnimationRule__Group__0 ) ) )
            // InternalKVis.g:131:1: ( ( rule__AnimationRule__Group__0 ) )
            {
            // InternalKVis.g:131:1: ( ( rule__AnimationRule__Group__0 ) )
            // InternalKVis.g:132:1: ( rule__AnimationRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationRuleAccess().getGroup()); 
            }
            // InternalKVis.g:133:1: ( rule__AnimationRule__Group__0 )
            // InternalKVis.g:133:2: rule__AnimationRule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnimationRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimationRule"


    // $ANTLR start "entryRuleAnimation"
    // InternalKVis.g:145:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // InternalKVis.g:146:1: ( ruleAnimation EOF )
            // InternalKVis.g:147:1: ruleAnimation EOF
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
    // InternalKVis.g:154:1: ruleAnimation : ( ( rule__Animation__Alternatives ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:158:2: ( ( ( rule__Animation__Alternatives ) ) )
            // InternalKVis.g:159:1: ( ( rule__Animation__Alternatives ) )
            {
            // InternalKVis.g:159:1: ( ( rule__Animation__Alternatives ) )
            // InternalKVis.g:160:1: ( rule__Animation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getAlternatives()); 
            }
            // InternalKVis.g:161:1: ( rule__Animation__Alternatives )
            // InternalKVis.g:161:2: rule__Animation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // InternalKVis.g:173:1: entryRuleAttributeMapping : ruleAttributeMapping EOF ;
    public final void entryRuleAttributeMapping() throws RecognitionException {
        try {
            // InternalKVis.g:174:1: ( ruleAttributeMapping EOF )
            // InternalKVis.g:175:1: ruleAttributeMapping EOF
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
    // InternalKVis.g:182:1: ruleAttributeMapping : ( ( rule__AttributeMapping__Group__0 ) ) ;
    public final void ruleAttributeMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:186:2: ( ( ( rule__AttributeMapping__Group__0 ) ) )
            // InternalKVis.g:187:1: ( ( rule__AttributeMapping__Group__0 ) )
            {
            // InternalKVis.g:187:1: ( ( rule__AttributeMapping__Group__0 ) )
            // InternalKVis.g:188:1: ( rule__AttributeMapping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getGroup()); 
            }
            // InternalKVis.g:189:1: ( rule__AttributeMapping__Group__0 )
            // InternalKVis.g:189:2: rule__AttributeMapping__Group__0
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
    // InternalKVis.g:201:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalKVis.g:202:1: ( ruleMapping EOF )
            // InternalKVis.g:203:1: ruleMapping EOF
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
    // InternalKVis.g:210:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:214:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalKVis.g:215:1: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalKVis.g:215:1: ( ( rule__Mapping__Group__0 ) )
            // InternalKVis.g:216:1: ( rule__Mapping__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getGroup()); 
            }
            // InternalKVis.g:217:1: ( rule__Mapping__Group__0 )
            // InternalKVis.g:217:2: rule__Mapping__Group__0
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
    // InternalKVis.g:229:1: entryRuleVariableDomain : ruleVariableDomain EOF ;
    public final void entryRuleVariableDomain() throws RecognitionException {
        try {
            // InternalKVis.g:230:1: ( ruleVariableDomain EOF )
            // InternalKVis.g:231:1: ruleVariableDomain EOF
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
    // InternalKVis.g:238:1: ruleVariableDomain : ( ( rule__VariableDomain__Alternatives ) ) ;
    public final void ruleVariableDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:242:2: ( ( ( rule__VariableDomain__Alternatives ) ) )
            // InternalKVis.g:243:1: ( ( rule__VariableDomain__Alternatives ) )
            {
            // InternalKVis.g:243:1: ( ( rule__VariableDomain__Alternatives ) )
            // InternalKVis.g:244:1: ( rule__VariableDomain__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDomainAccess().getAlternatives()); 
            }
            // InternalKVis.g:245:1: ( rule__VariableDomain__Alternatives )
            // InternalKVis.g:245:2: rule__VariableDomain__Alternatives
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
    // InternalKVis.g:257:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // InternalKVis.g:258:1: ( ruleInterval EOF )
            // InternalKVis.g:259:1: ruleInterval EOF
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
    // InternalKVis.g:266:1: ruleInterval : ( ( rule__Interval__Group__0 ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:270:2: ( ( ( rule__Interval__Group__0 ) ) )
            // InternalKVis.g:271:1: ( ( rule__Interval__Group__0 ) )
            {
            // InternalKVis.g:271:1: ( ( rule__Interval__Group__0 ) )
            // InternalKVis.g:272:1: ( rule__Interval__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getGroup()); 
            }
            // InternalKVis.g:273:1: ( rule__Interval__Group__0 )
            // InternalKVis.g:273:2: rule__Interval__Group__0
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
    // InternalKVis.g:285:1: entryRuleAttributeDomain : ruleAttributeDomain EOF ;
    public final void entryRuleAttributeDomain() throws RecognitionException {
        try {
            // InternalKVis.g:286:1: ( ruleAttributeDomain EOF )
            // InternalKVis.g:287:1: ruleAttributeDomain EOF
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
    // InternalKVis.g:294:1: ruleAttributeDomain : ( ruleVariableDomain ) ;
    public final void ruleAttributeDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:298:2: ( ( ruleVariableDomain ) )
            // InternalKVis.g:299:1: ( ruleVariableDomain )
            {
            // InternalKVis.g:299:1: ( ruleVariableDomain )
            // InternalKVis.g:300:1: ruleVariableDomain
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
    // InternalKVis.g:313:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalKVis.g:314:1: ( ruleCondition EOF )
            // InternalKVis.g:315:1: ruleCondition EOF
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
    // InternalKVis.g:322:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:326:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalKVis.g:327:1: ( ( rule__Condition__Group__0 ) )
            {
            // InternalKVis.g:327:1: ( ( rule__Condition__Group__0 ) )
            // InternalKVis.g:328:1: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalKVis.g:329:1: ( rule__Condition__Group__0 )
            // InternalKVis.g:329:2: rule__Condition__Group__0
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
    // InternalKVis.g:341:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // InternalKVis.g:342:1: ( ruleVariableReference EOF )
            // InternalKVis.g:343:1: ruleVariableReference EOF
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
    // InternalKVis.g:350:1: ruleVariableReference : ( ( rule__VariableReference__Group__0 ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:354:2: ( ( ( rule__VariableReference__Group__0 ) ) )
            // InternalKVis.g:355:1: ( ( rule__VariableReference__Group__0 ) )
            {
            // InternalKVis.g:355:1: ( ( rule__VariableReference__Group__0 ) )
            // InternalKVis.g:356:1: ( rule__VariableReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup()); 
            }
            // InternalKVis.g:357:1: ( rule__VariableReference__Group__0 )
            // InternalKVis.g:357:2: rule__VariableReference__Group__0
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
    // InternalKVis.g:369:1: entryRuleModelReference : ruleModelReference EOF ;
    public final void entryRuleModelReference() throws RecognitionException {
        try {
            // InternalKVis.g:370:1: ( ruleModelReference EOF )
            // InternalKVis.g:371:1: ruleModelReference EOF
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
    // InternalKVis.g:378:1: ruleModelReference : ( ( rule__ModelReference__Group__0 ) ) ;
    public final void ruleModelReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:382:2: ( ( ( rule__ModelReference__Group__0 ) ) )
            // InternalKVis.g:383:1: ( ( rule__ModelReference__Group__0 ) )
            {
            // InternalKVis.g:383:1: ( ( rule__ModelReference__Group__0 ) )
            // InternalKVis.g:384:1: ( rule__ModelReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getGroup()); 
            }
            // InternalKVis.g:385:1: ( rule__ModelReference__Group__0 )
            // InternalKVis.g:385:2: rule__ModelReference__Group__0
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
    // InternalKVis.g:397:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalKVis.g:398:1: ( ruleBooleanExpression EOF )
            // InternalKVis.g:399:1: ruleBooleanExpression EOF
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
    // InternalKVis.g:406:1: ruleBooleanExpression : ( ( rule__BooleanExpression__Group__0 ) ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:410:2: ( ( ( rule__BooleanExpression__Group__0 ) ) )
            // InternalKVis.g:411:1: ( ( rule__BooleanExpression__Group__0 ) )
            {
            // InternalKVis.g:411:1: ( ( rule__BooleanExpression__Group__0 ) )
            // InternalKVis.g:412:1: ( rule__BooleanExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getGroup()); 
            }
            // InternalKVis.g:413:1: ( rule__BooleanExpression__Group__0 )
            // InternalKVis.g:413:2: rule__BooleanExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getGroup()); 
            }

            }


            }

        }
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
    // InternalKVis.g:425:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalKVis.g:426:1: ( ruleComparison EOF )
            // InternalKVis.g:427:1: ruleComparison EOF
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
    // InternalKVis.g:434:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:438:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalKVis.g:439:1: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalKVis.g:439:1: ( ( rule__Comparison__Group__0 ) )
            // InternalKVis.g:440:1: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalKVis.g:441:1: ( rule__Comparison__Group__0 )
            // InternalKVis.g:441:2: rule__Comparison__Group__0
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
    // InternalKVis.g:453:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // InternalKVis.g:454:1: ( ruleOperand EOF )
            // InternalKVis.g:455:1: ruleOperand EOF
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
    // InternalKVis.g:462:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:466:2: ( ( ( rule__Operand__Alternatives ) ) )
            // InternalKVis.g:467:1: ( ( rule__Operand__Alternatives ) )
            {
            // InternalKVis.g:467:1: ( ( rule__Operand__Alternatives ) )
            // InternalKVis.g:468:1: ( rule__Operand__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandAccess().getAlternatives()); 
            }
            // InternalKVis.g:469:1: ( rule__Operand__Alternatives )
            // InternalKVis.g:469:2: rule__Operand__Alternatives
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
    // InternalKVis.g:481:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalKVis.g:482:1: ( ruleLiteral EOF )
            // InternalKVis.g:483:1: ruleLiteral EOF
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
    // InternalKVis.g:490:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:494:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalKVis.g:495:1: ( ( rule__Literal__Alternatives ) )
            {
            // InternalKVis.g:495:1: ( ( rule__Literal__Alternatives ) )
            // InternalKVis.g:496:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalKVis.g:497:1: ( rule__Literal__Alternatives )
            // InternalKVis.g:497:2: rule__Literal__Alternatives
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
    // InternalKVis.g:510:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:514:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalKVis.g:515:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalKVis.g:515:1: ( ( rule__CompareOperator__Alternatives ) )
            // InternalKVis.g:516:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalKVis.g:517:1: ( rule__CompareOperator__Alternatives )
            // InternalKVis.g:517:2: rule__CompareOperator__Alternatives
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


    // $ANTLR start "ruleBooleanOperator"
    // InternalKVis.g:529:1: ruleBooleanOperator : ( ( rule__BooleanOperator__Alternatives ) ) ;
    public final void ruleBooleanOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:533:1: ( ( ( rule__BooleanOperator__Alternatives ) ) )
            // InternalKVis.g:534:1: ( ( rule__BooleanOperator__Alternatives ) )
            {
            // InternalKVis.g:534:1: ( ( rule__BooleanOperator__Alternatives ) )
            // InternalKVis.g:535:1: ( rule__BooleanOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanOperatorAccess().getAlternatives()); 
            }
            // InternalKVis.g:536:1: ( rule__BooleanOperator__Alternatives )
            // InternalKVis.g:536:2: rule__BooleanOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanOperator"


    // $ANTLR start "rule__Animation__Alternatives"
    // InternalKVis.g:547:1: rule__Animation__Alternatives : ( ( ( rule__Animation__Group_0__0 ) ) | ( ( rule__Animation__Group_1__0 ) ) | ( ( rule__Animation__Group_2__0 ) ) | ( ( rule__Animation__Group_3__0 ) ) | ( ( rule__Animation__Group_4__0 ) ) );
    public final void rule__Animation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:551:1: ( ( ( rule__Animation__Group_0__0 ) ) | ( ( rule__Animation__Group_1__0 ) ) | ( ( rule__Animation__Group_2__0 ) ) | ( ( rule__Animation__Group_3__0 ) ) | ( ( rule__Animation__Group_4__0 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 31:
                {
                alt1=3;
                }
                break;
            case 32:
                {
                alt1=4;
                }
                break;
            case 33:
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
                    // InternalKVis.g:552:1: ( ( rule__Animation__Group_0__0 ) )
                    {
                    // InternalKVis.g:552:1: ( ( rule__Animation__Group_0__0 ) )
                    // InternalKVis.g:553:1: ( rule__Animation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnimationAccess().getGroup_0()); 
                    }
                    // InternalKVis.g:554:1: ( rule__Animation__Group_0__0 )
                    // InternalKVis.g:554:2: rule__Animation__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Animation__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnimationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:558:6: ( ( rule__Animation__Group_1__0 ) )
                    {
                    // InternalKVis.g:558:6: ( ( rule__Animation__Group_1__0 ) )
                    // InternalKVis.g:559:1: ( rule__Animation__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnimationAccess().getGroup_1()); 
                    }
                    // InternalKVis.g:560:1: ( rule__Animation__Group_1__0 )
                    // InternalKVis.g:560:2: rule__Animation__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Animation__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnimationAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKVis.g:564:6: ( ( rule__Animation__Group_2__0 ) )
                    {
                    // InternalKVis.g:564:6: ( ( rule__Animation__Group_2__0 ) )
                    // InternalKVis.g:565:1: ( rule__Animation__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnimationAccess().getGroup_2()); 
                    }
                    // InternalKVis.g:566:1: ( rule__Animation__Group_2__0 )
                    // InternalKVis.g:566:2: rule__Animation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Animation__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnimationAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKVis.g:570:6: ( ( rule__Animation__Group_3__0 ) )
                    {
                    // InternalKVis.g:570:6: ( ( rule__Animation__Group_3__0 ) )
                    // InternalKVis.g:571:1: ( rule__Animation__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnimationAccess().getGroup_3()); 
                    }
                    // InternalKVis.g:572:1: ( rule__Animation__Group_3__0 )
                    // InternalKVis.g:572:2: rule__Animation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Animation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnimationAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKVis.g:576:6: ( ( rule__Animation__Group_4__0 ) )
                    {
                    // InternalKVis.g:576:6: ( ( rule__Animation__Group_4__0 ) )
                    // InternalKVis.g:577:1: ( rule__Animation__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnimationAccess().getGroup_4()); 
                    }
                    // InternalKVis.g:578:1: ( rule__Animation__Group_4__0 )
                    // InternalKVis.g:578:2: rule__Animation__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Animation__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnimationAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Animation__Alternatives"


    // $ANTLR start "rule__AttributeMapping__Alternatives_2"
    // InternalKVis.g:587:1: rule__AttributeMapping__Alternatives_2 : ( ( ( rule__AttributeMapping__LiteralAssignment_2_0 ) ) | ( ( rule__AttributeMapping__Group_2_1__0 ) ) );
    public final void rule__AttributeMapping__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:591:1: ( ( ( rule__AttributeMapping__LiteralAssignment_2_0 ) ) | ( ( rule__AttributeMapping__Group_2_1__0 ) ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=35 && LA2_1<=36)) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==RULE_ID||LA2_1==26) ) {
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

                if ( (LA2_2==EOF||LA2_2==RULE_ID||LA2_2==26) ) {
                    alt2=1;
                }
                else if ( (LA2_2==35) ) {
                    alt2=2;
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

                if ( (LA2_3==35) ) {
                    alt2=2;
                }
                else if ( (LA2_3==EOF||LA2_3==RULE_ID||LA2_3==26) ) {
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
                    // InternalKVis.g:592:1: ( ( rule__AttributeMapping__LiteralAssignment_2_0 ) )
                    {
                    // InternalKVis.g:592:1: ( ( rule__AttributeMapping__LiteralAssignment_2_0 ) )
                    // InternalKVis.g:593:1: ( rule__AttributeMapping__LiteralAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeMappingAccess().getLiteralAssignment_2_0()); 
                    }
                    // InternalKVis.g:594:1: ( rule__AttributeMapping__LiteralAssignment_2_0 )
                    // InternalKVis.g:594:2: rule__AttributeMapping__LiteralAssignment_2_0
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
                    // InternalKVis.g:598:6: ( ( rule__AttributeMapping__Group_2_1__0 ) )
                    {
                    // InternalKVis.g:598:6: ( ( rule__AttributeMapping__Group_2_1__0 ) )
                    // InternalKVis.g:599:1: ( rule__AttributeMapping__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeMappingAccess().getGroup_2_1()); 
                    }
                    // InternalKVis.g:600:1: ( rule__AttributeMapping__Group_2_1__0 )
                    // InternalKVis.g:600:2: rule__AttributeMapping__Group_2_1__0
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
    // InternalKVis.g:609:1: rule__VariableDomain__Alternatives : ( ( ( rule__VariableDomain__ValueAssignment_0 ) ) | ( ( rule__VariableDomain__RangeAssignment_1 ) ) );
    public final void rule__VariableDomain__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:613:1: ( ( ( rule__VariableDomain__ValueAssignment_0 ) ) | ( ( rule__VariableDomain__RangeAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==RULE_ID||LA3_1==26||(LA3_1>=34 && LA3_1<=35)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==36) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA3_0>=RULE_FLOAT && LA3_0<=RULE_STRING)) ) {
                alt3=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKVis.g:614:1: ( ( rule__VariableDomain__ValueAssignment_0 ) )
                    {
                    // InternalKVis.g:614:1: ( ( rule__VariableDomain__ValueAssignment_0 ) )
                    // InternalKVis.g:615:1: ( rule__VariableDomain__ValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableDomainAccess().getValueAssignment_0()); 
                    }
                    // InternalKVis.g:616:1: ( rule__VariableDomain__ValueAssignment_0 )
                    // InternalKVis.g:616:2: rule__VariableDomain__ValueAssignment_0
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
                    // InternalKVis.g:620:6: ( ( rule__VariableDomain__RangeAssignment_1 ) )
                    {
                    // InternalKVis.g:620:6: ( ( rule__VariableDomain__RangeAssignment_1 ) )
                    // InternalKVis.g:621:1: ( rule__VariableDomain__RangeAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableDomainAccess().getRangeAssignment_1()); 
                    }
                    // InternalKVis.g:622:1: ( rule__VariableDomain__RangeAssignment_1 )
                    // InternalKVis.g:622:2: rule__VariableDomain__RangeAssignment_1
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
    // InternalKVis.g:631:1: rule__Operand__Alternatives : ( ( ( rule__Operand__VariableAssignment_0 ) ) | ( ( rule__Operand__LiteralAssignment_1 ) ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:635:1: ( ( ( rule__Operand__VariableAssignment_0 ) ) | ( ( rule__Operand__LiteralAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_STRING)) ) {
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
                    // InternalKVis.g:636:1: ( ( rule__Operand__VariableAssignment_0 ) )
                    {
                    // InternalKVis.g:636:1: ( ( rule__Operand__VariableAssignment_0 ) )
                    // InternalKVis.g:637:1: ( rule__Operand__VariableAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getVariableAssignment_0()); 
                    }
                    // InternalKVis.g:638:1: ( rule__Operand__VariableAssignment_0 )
                    // InternalKVis.g:638:2: rule__Operand__VariableAssignment_0
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
                    // InternalKVis.g:642:6: ( ( rule__Operand__LiteralAssignment_1 ) )
                    {
                    // InternalKVis.g:642:6: ( ( rule__Operand__LiteralAssignment_1 ) )
                    // InternalKVis.g:643:1: ( rule__Operand__LiteralAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getLiteralAssignment_1()); 
                    }
                    // InternalKVis.g:644:1: ( rule__Operand__LiteralAssignment_1 )
                    // InternalKVis.g:644:2: rule__Operand__LiteralAssignment_1
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
    // InternalKVis.g:653:1: rule__Literal__Alternatives : ( ( RULE_INT ) | ( RULE_FLOAT ) | ( RULE_STRING ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:657:1: ( ( RULE_INT ) | ( RULE_FLOAT ) | ( RULE_STRING ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
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
                    // InternalKVis.g:658:1: ( RULE_INT )
                    {
                    // InternalKVis.g:658:1: ( RULE_INT )
                    // InternalKVis.g:659:1: RULE_INT
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
                    // InternalKVis.g:664:6: ( RULE_FLOAT )
                    {
                    // InternalKVis.g:664:6: ( RULE_FLOAT )
                    // InternalKVis.g:665:1: RULE_FLOAT
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
                    // InternalKVis.g:670:6: ( RULE_STRING )
                    {
                    // InternalKVis.g:670:6: ( RULE_STRING )
                    // InternalKVis.g:671:1: RULE_STRING
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
    // InternalKVis.g:681:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '!=' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:685:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '!=' ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            case 18:
                {
                alt6=5;
                }
                break;
            case 19:
                {
                alt6=6;
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
                    // InternalKVis.g:686:1: ( ( '=' ) )
                    {
                    // InternalKVis.g:686:1: ( ( '=' ) )
                    // InternalKVis.g:687:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalKVis.g:688:1: ( '=' )
                    // InternalKVis.g:688:3: '='
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
                    // InternalKVis.g:693:6: ( ( '<' ) )
                    {
                    // InternalKVis.g:693:6: ( ( '<' ) )
                    // InternalKVis.g:694:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // InternalKVis.g:695:1: ( '<' )
                    // InternalKVis.g:695:3: '<'
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
                    // InternalKVis.g:700:6: ( ( '<=' ) )
                    {
                    // InternalKVis.g:700:6: ( ( '<=' ) )
                    // InternalKVis.g:701:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalKVis.g:702:1: ( '<=' )
                    // InternalKVis.g:702:3: '<='
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
                    // InternalKVis.g:707:6: ( ( '>' ) )
                    {
                    // InternalKVis.g:707:6: ( ( '>' ) )
                    // InternalKVis.g:708:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // InternalKVis.g:709:1: ( '>' )
                    // InternalKVis.g:709:3: '>'
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
                    // InternalKVis.g:714:6: ( ( '>=' ) )
                    {
                    // InternalKVis.g:714:6: ( ( '>=' ) )
                    // InternalKVis.g:715:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalKVis.g:716:1: ( '>=' )
                    // InternalKVis.g:716:3: '>='
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
                    // InternalKVis.g:721:6: ( ( '!=' ) )
                    {
                    // InternalKVis.g:721:6: ( ( '!=' ) )
                    // InternalKVis.g:722:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // InternalKVis.g:723:1: ( '!=' )
                    // InternalKVis.g:723:3: '!='
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


    // $ANTLR start "rule__BooleanOperator__Alternatives"
    // InternalKVis.g:733:1: rule__BooleanOperator__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__BooleanOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:737:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKVis.g:738:1: ( ( 'and' ) )
                    {
                    // InternalKVis.g:738:1: ( ( 'and' ) )
                    // InternalKVis.g:739:1: ( 'and' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalKVis.g:740:1: ( 'and' )
                    // InternalKVis.g:740:3: 'and'
                    {
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:745:6: ( ( 'or' ) )
                    {
                    // InternalKVis.g:745:6: ( ( 'or' ) )
                    // InternalKVis.g:746:1: ( 'or' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalKVis.g:747:1: ( 'or' )
                    // InternalKVis.g:747:3: 'or'
                    {
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanOperatorAccess().getOREnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__BooleanOperator__Alternatives"


    // $ANTLR start "rule__Visualization__Group__0"
    // InternalKVis.g:759:1: rule__Visualization__Group__0 : rule__Visualization__Group__0__Impl rule__Visualization__Group__1 ;
    public final void rule__Visualization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:763:1: ( rule__Visualization__Group__0__Impl rule__Visualization__Group__1 )
            // InternalKVis.g:764:2: rule__Visualization__Group__0__Impl rule__Visualization__Group__1
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
    // InternalKVis.g:771:1: rule__Visualization__Group__0__Impl : ( 'image' ) ;
    public final void rule__Visualization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:775:1: ( ( 'image' ) )
            // InternalKVis.g:776:1: ( 'image' )
            {
            // InternalKVis.g:776:1: ( 'image' )
            // InternalKVis.g:777:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationAccess().getImageKeyword_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:790:1: rule__Visualization__Group__1 : rule__Visualization__Group__1__Impl rule__Visualization__Group__2 ;
    public final void rule__Visualization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:794:1: ( rule__Visualization__Group__1__Impl rule__Visualization__Group__2 )
            // InternalKVis.g:795:2: rule__Visualization__Group__1__Impl rule__Visualization__Group__2
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
    // InternalKVis.g:802:1: rule__Visualization__Group__1__Impl : ( ':' ) ;
    public final void rule__Visualization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:806:1: ( ( ':' ) )
            // InternalKVis.g:807:1: ( ':' )
            {
            // InternalKVis.g:807:1: ( ':' )
            // InternalKVis.g:808:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationAccess().getColonKeyword_1()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:821:1: rule__Visualization__Group__2 : rule__Visualization__Group__2__Impl rule__Visualization__Group__3 ;
    public final void rule__Visualization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:825:1: ( rule__Visualization__Group__2__Impl rule__Visualization__Group__3 )
            // InternalKVis.g:826:2: rule__Visualization__Group__2__Impl rule__Visualization__Group__3
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
    // InternalKVis.g:833:1: rule__Visualization__Group__2__Impl : ( ( rule__Visualization__ImageAssignment_2 ) ) ;
    public final void rule__Visualization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:837:1: ( ( ( rule__Visualization__ImageAssignment_2 ) ) )
            // InternalKVis.g:838:1: ( ( rule__Visualization__ImageAssignment_2 ) )
            {
            // InternalKVis.g:838:1: ( ( rule__Visualization__ImageAssignment_2 ) )
            // InternalKVis.g:839:1: ( rule__Visualization__ImageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationAccess().getImageAssignment_2()); 
            }
            // InternalKVis.g:840:1: ( rule__Visualization__ImageAssignment_2 )
            // InternalKVis.g:840:2: rule__Visualization__ImageAssignment_2
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
    // InternalKVis.g:850:1: rule__Visualization__Group__3 : rule__Visualization__Group__3__Impl ;
    public final void rule__Visualization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:854:1: ( rule__Visualization__Group__3__Impl )
            // InternalKVis.g:855:2: rule__Visualization__Group__3__Impl
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
    // InternalKVis.g:861:1: rule__Visualization__Group__3__Impl : ( ( rule__Visualization__ElementsAssignment_3 )* ) ;
    public final void rule__Visualization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:865:1: ( ( ( rule__Visualization__ElementsAssignment_3 )* ) )
            // InternalKVis.g:866:1: ( ( rule__Visualization__ElementsAssignment_3 )* )
            {
            // InternalKVis.g:866:1: ( ( rule__Visualization__ElementsAssignment_3 )* )
            // InternalKVis.g:867:1: ( rule__Visualization__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationAccess().getElementsAssignment_3()); 
            }
            // InternalKVis.g:868:1: ( rule__Visualization__ElementsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKVis.g:868:2: rule__Visualization__ElementsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__Visualization__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalKVis.g:886:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:890:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalKVis.g:891:2: rule__Element__Group__0__Impl rule__Element__Group__1
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
    // InternalKVis.g:898:1: rule__Element__Group__0__Impl : ( 'animate' ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:902:1: ( ( 'animate' ) )
            // InternalKVis.g:903:1: ( 'animate' )
            {
            // InternalKVis.g:903:1: ( 'animate' )
            // InternalKVis.g:904:1: 'animate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAnimateKeyword_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:917:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:921:1: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
            // InternalKVis.g:922:2: rule__Element__Group__1__Impl rule__Element__Group__2
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
    // InternalKVis.g:929:1: rule__Element__Group__1__Impl : ( ( rule__Element__NameAssignment_1 ) ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:933:1: ( ( ( rule__Element__NameAssignment_1 ) ) )
            // InternalKVis.g:934:1: ( ( rule__Element__NameAssignment_1 ) )
            {
            // InternalKVis.g:934:1: ( ( rule__Element__NameAssignment_1 ) )
            // InternalKVis.g:935:1: ( rule__Element__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getNameAssignment_1()); 
            }
            // InternalKVis.g:936:1: ( rule__Element__NameAssignment_1 )
            // InternalKVis.g:936:2: rule__Element__NameAssignment_1
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
    // InternalKVis.g:946:1: rule__Element__Group__2 : rule__Element__Group__2__Impl rule__Element__Group__3 ;
    public final void rule__Element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:950:1: ( rule__Element__Group__2__Impl rule__Element__Group__3 )
            // InternalKVis.g:951:2: rule__Element__Group__2__Impl rule__Element__Group__3
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
    // InternalKVis.g:958:1: rule__Element__Group__2__Impl : ( '{' ) ;
    public final void rule__Element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:962:1: ( ( '{' ) )
            // InternalKVis.g:963:1: ( '{' )
            {
            // InternalKVis.g:963:1: ( '{' )
            // InternalKVis.g:964:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:977:1: rule__Element__Group__3 : rule__Element__Group__3__Impl rule__Element__Group__4 ;
    public final void rule__Element__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:981:1: ( rule__Element__Group__3__Impl rule__Element__Group__4 )
            // InternalKVis.g:982:2: rule__Element__Group__3__Impl rule__Element__Group__4
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
    // InternalKVis.g:989:1: rule__Element__Group__3__Impl : ( ( ( rule__Element__AnimationsAssignment_3 ) ) ( ( rule__Element__AnimationsAssignment_3 )* ) ) ;
    public final void rule__Element__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:993:1: ( ( ( ( rule__Element__AnimationsAssignment_3 ) ) ( ( rule__Element__AnimationsAssignment_3 )* ) ) )
            // InternalKVis.g:994:1: ( ( ( rule__Element__AnimationsAssignment_3 ) ) ( ( rule__Element__AnimationsAssignment_3 )* ) )
            {
            // InternalKVis.g:994:1: ( ( ( rule__Element__AnimationsAssignment_3 ) ) ( ( rule__Element__AnimationsAssignment_3 )* ) )
            // InternalKVis.g:995:1: ( ( rule__Element__AnimationsAssignment_3 ) ) ( ( rule__Element__AnimationsAssignment_3 )* )
            {
            // InternalKVis.g:995:1: ( ( rule__Element__AnimationsAssignment_3 ) )
            // InternalKVis.g:996:1: ( rule__Element__AnimationsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAnimationsAssignment_3()); 
            }
            // InternalKVis.g:997:1: ( rule__Element__AnimationsAssignment_3 )
            // InternalKVis.g:997:2: rule__Element__AnimationsAssignment_3
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

            // InternalKVis.g:1000:1: ( ( rule__Element__AnimationsAssignment_3 )* )
            // InternalKVis.g:1001:1: ( rule__Element__AnimationsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAnimationsAssignment_3()); 
            }
            // InternalKVis.g:1002:1: ( rule__Element__AnimationsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKVis.g:1002:2: rule__Element__AnimationsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    rule__Element__AnimationsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalKVis.g:1013:1: rule__Element__Group__4 : rule__Element__Group__4__Impl ;
    public final void rule__Element__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1017:1: ( rule__Element__Group__4__Impl )
            // InternalKVis.g:1018:2: rule__Element__Group__4__Impl
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
    // InternalKVis.g:1024:1: rule__Element__Group__4__Impl : ( '}' ) ;
    public final void rule__Element__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1028:1: ( ( '}' ) )
            // InternalKVis.g:1029:1: ( '}' )
            {
            // InternalKVis.g:1029:1: ( '}' )
            // InternalKVis.g:1030:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__AnimationRule__Group__0"
    // InternalKVis.g:1053:1: rule__AnimationRule__Group__0 : rule__AnimationRule__Group__0__Impl rule__AnimationRule__Group__1 ;
    public final void rule__AnimationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1057:1: ( rule__AnimationRule__Group__0__Impl rule__AnimationRule__Group__1 )
            // InternalKVis.g:1058:2: rule__AnimationRule__Group__0__Impl rule__AnimationRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__AnimationRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnimationRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group__0"


    // $ANTLR start "rule__AnimationRule__Group__0__Impl"
    // InternalKVis.g:1065:1: rule__AnimationRule__Group__0__Impl : ( 'set' ) ;
    public final void rule__AnimationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1069:1: ( ( 'set' ) )
            // InternalKVis.g:1070:1: ( 'set' )
            {
            // InternalKVis.g:1070:1: ( 'set' )
            // InternalKVis.g:1071:1: 'set'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationRuleAccess().getSetKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationRuleAccess().getSetKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group__0__Impl"


    // $ANTLR start "rule__AnimationRule__Group__1"
    // InternalKVis.g:1084:1: rule__AnimationRule__Group__1 : rule__AnimationRule__Group__1__Impl rule__AnimationRule__Group__2 ;
    public final void rule__AnimationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1088:1: ( rule__AnimationRule__Group__1__Impl rule__AnimationRule__Group__2 )
            // InternalKVis.g:1089:2: rule__AnimationRule__Group__1__Impl rule__AnimationRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__AnimationRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnimationRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group__1"


    // $ANTLR start "rule__AnimationRule__Group__1__Impl"
    // InternalKVis.g:1096:1: rule__AnimationRule__Group__1__Impl : ( ruleAnimation ) ;
    public final void rule__AnimationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1100:1: ( ( ruleAnimation ) )
            // InternalKVis.g:1101:1: ( ruleAnimation )
            {
            // InternalKVis.g:1101:1: ( ruleAnimation )
            // InternalKVis.g:1102:1: ruleAnimation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationRuleAccess().getAnimationParserRuleCall_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnimation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationRuleAccess().getAnimationParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group__1__Impl"


    // $ANTLR start "rule__AnimationRule__Group__2"
    // InternalKVis.g:1113:1: rule__AnimationRule__Group__2 : rule__AnimationRule__Group__2__Impl rule__AnimationRule__Group__3 ;
    public final void rule__AnimationRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1117:1: ( rule__AnimationRule__Group__2__Impl rule__AnimationRule__Group__3 )
            // InternalKVis.g:1118:2: rule__AnimationRule__Group__2__Impl rule__AnimationRule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__AnimationRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnimationRule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group__2"


    // $ANTLR start "rule__AnimationRule__Group__2__Impl"
    // InternalKVis.g:1125:1: rule__AnimationRule__Group__2__Impl : ( ( rule__AnimationRule__Group_2__0 )? ) ;
    public final void rule__AnimationRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1129:1: ( ( ( rule__AnimationRule__Group_2__0 )? ) )
            // InternalKVis.g:1130:1: ( ( rule__AnimationRule__Group_2__0 )? )
            {
            // InternalKVis.g:1130:1: ( ( rule__AnimationRule__Group_2__0 )? )
            // InternalKVis.g:1131:1: ( rule__AnimationRule__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationRuleAccess().getGroup_2()); 
            }
            // InternalKVis.g:1132:1: ( rule__AnimationRule__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKVis.g:1132:2: rule__AnimationRule__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AnimationRule__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationRuleAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group__2__Impl"


    // $ANTLR start "rule__AnimationRule__Group__3"
    // InternalKVis.g:1142:1: rule__AnimationRule__Group__3 : rule__AnimationRule__Group__3__Impl rule__AnimationRule__Group__4 ;
    public final void rule__AnimationRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1146:1: ( rule__AnimationRule__Group__3__Impl rule__AnimationRule__Group__4 )
            // InternalKVis.g:1147:2: rule__AnimationRule__Group__3__Impl rule__AnimationRule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__AnimationRule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnimationRule__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group__3"


    // $ANTLR start "rule__AnimationRule__Group__3__Impl"
    // InternalKVis.g:1154:1: rule__AnimationRule__Group__3__Impl : ( '{' ) ;
    public final void rule__AnimationRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1158:1: ( ( '{' ) )
            // InternalKVis.g:1159:1: ( '{' )
            {
            // InternalKVis.g:1159:1: ( '{' )
            // InternalKVis.g:1160:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationRuleAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationRuleAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group__3__Impl"


    // $ANTLR start "rule__AnimationRule__Group__4"
    // InternalKVis.g:1173:1: rule__AnimationRule__Group__4 : rule__AnimationRule__Group__4__Impl rule__AnimationRule__Group__5 ;
    public final void rule__AnimationRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1177:1: ( rule__AnimationRule__Group__4__Impl rule__AnimationRule__Group__5 )
            // InternalKVis.g:1178:2: rule__AnimationRule__Group__4__Impl rule__AnimationRule__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__AnimationRule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnimationRule__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group__4"


    // $ANTLR start "rule__AnimationRule__Group__4__Impl"
    // InternalKVis.g:1185:1: rule__AnimationRule__Group__4__Impl : ( ( rule__AnimationRule__MappingsAssignment_4 )* ) ;
    public final void rule__AnimationRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1189:1: ( ( ( rule__AnimationRule__MappingsAssignment_4 )* ) )
            // InternalKVis.g:1190:1: ( ( rule__AnimationRule__MappingsAssignment_4 )* )
            {
            // InternalKVis.g:1190:1: ( ( rule__AnimationRule__MappingsAssignment_4 )* )
            // InternalKVis.g:1191:1: ( rule__AnimationRule__MappingsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationRuleAccess().getMappingsAssignment_4()); 
            }
            // InternalKVis.g:1192:1: ( rule__AnimationRule__MappingsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKVis.g:1192:2: rule__AnimationRule__MappingsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    rule__AnimationRule__MappingsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationRuleAccess().getMappingsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group__4__Impl"


    // $ANTLR start "rule__AnimationRule__Group__5"
    // InternalKVis.g:1202:1: rule__AnimationRule__Group__5 : rule__AnimationRule__Group__5__Impl rule__AnimationRule__Group__6 ;
    public final void rule__AnimationRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1206:1: ( rule__AnimationRule__Group__5__Impl rule__AnimationRule__Group__6 )
            // InternalKVis.g:1207:2: rule__AnimationRule__Group__5__Impl rule__AnimationRule__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__AnimationRule__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnimationRule__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group__5"


    // $ANTLR start "rule__AnimationRule__Group__5__Impl"
    // InternalKVis.g:1214:1: rule__AnimationRule__Group__5__Impl : ( '}' ) ;
    public final void rule__AnimationRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1218:1: ( ( '}' ) )
            // InternalKVis.g:1219:1: ( '}' )
            {
            // InternalKVis.g:1219:1: ( '}' )
            // InternalKVis.g:1220:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationRuleAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationRuleAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group__5__Impl"


    // $ANTLR start "rule__AnimationRule__Group__6"
    // InternalKVis.g:1233:1: rule__AnimationRule__Group__6 : rule__AnimationRule__Group__6__Impl ;
    public final void rule__AnimationRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1237:1: ( rule__AnimationRule__Group__6__Impl )
            // InternalKVis.g:1238:2: rule__AnimationRule__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnimationRule__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group__6"


    // $ANTLR start "rule__AnimationRule__Group__6__Impl"
    // InternalKVis.g:1244:1: rule__AnimationRule__Group__6__Impl : ( ( rule__AnimationRule__ConditionAssignment_6 )? ) ;
    public final void rule__AnimationRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1248:1: ( ( ( rule__AnimationRule__ConditionAssignment_6 )? ) )
            // InternalKVis.g:1249:1: ( ( rule__AnimationRule__ConditionAssignment_6 )? )
            {
            // InternalKVis.g:1249:1: ( ( rule__AnimationRule__ConditionAssignment_6 )? )
            // InternalKVis.g:1250:1: ( rule__AnimationRule__ConditionAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationRuleAccess().getConditionAssignment_6()); 
            }
            // InternalKVis.g:1251:1: ( rule__AnimationRule__ConditionAssignment_6 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKVis.g:1251:2: rule__AnimationRule__ConditionAssignment_6
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AnimationRule__ConditionAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationRuleAccess().getConditionAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group__6__Impl"


    // $ANTLR start "rule__AnimationRule__Group_2__0"
    // InternalKVis.g:1275:1: rule__AnimationRule__Group_2__0 : rule__AnimationRule__Group_2__0__Impl rule__AnimationRule__Group_2__1 ;
    public final void rule__AnimationRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1279:1: ( rule__AnimationRule__Group_2__0__Impl rule__AnimationRule__Group_2__1 )
            // InternalKVis.g:1280:2: rule__AnimationRule__Group_2__0__Impl rule__AnimationRule__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__AnimationRule__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnimationRule__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group_2__0"


    // $ANTLR start "rule__AnimationRule__Group_2__0__Impl"
    // InternalKVis.g:1287:1: rule__AnimationRule__Group_2__0__Impl : ( 'using' ) ;
    public final void rule__AnimationRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1291:1: ( ( 'using' ) )
            // InternalKVis.g:1292:1: ( 'using' )
            {
            // InternalKVis.g:1292:1: ( 'using' )
            // InternalKVis.g:1293:1: 'using'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationRuleAccess().getUsingKeyword_2_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationRuleAccess().getUsingKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group_2__0__Impl"


    // $ANTLR start "rule__AnimationRule__Group_2__1"
    // InternalKVis.g:1306:1: rule__AnimationRule__Group_2__1 : rule__AnimationRule__Group_2__1__Impl ;
    public final void rule__AnimationRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1310:1: ( rule__AnimationRule__Group_2__1__Impl )
            // InternalKVis.g:1311:2: rule__AnimationRule__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnimationRule__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group_2__1"


    // $ANTLR start "rule__AnimationRule__Group_2__1__Impl"
    // InternalKVis.g:1317:1: rule__AnimationRule__Group_2__1__Impl : ( ( rule__AnimationRule__VariableAssignment_2_1 ) ) ;
    public final void rule__AnimationRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1321:1: ( ( ( rule__AnimationRule__VariableAssignment_2_1 ) ) )
            // InternalKVis.g:1322:1: ( ( rule__AnimationRule__VariableAssignment_2_1 ) )
            {
            // InternalKVis.g:1322:1: ( ( rule__AnimationRule__VariableAssignment_2_1 ) )
            // InternalKVis.g:1323:1: ( rule__AnimationRule__VariableAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationRuleAccess().getVariableAssignment_2_1()); 
            }
            // InternalKVis.g:1324:1: ( rule__AnimationRule__VariableAssignment_2_1 )
            // InternalKVis.g:1324:2: rule__AnimationRule__VariableAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AnimationRule__VariableAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationRuleAccess().getVariableAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__Group_2__1__Impl"


    // $ANTLR start "rule__Animation__Group_0__0"
    // InternalKVis.g:1338:1: rule__Animation__Group_0__0 : rule__Animation__Group_0__0__Impl rule__Animation__Group_0__1 ;
    public final void rule__Animation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1342:1: ( rule__Animation__Group_0__0__Impl rule__Animation__Group_0__1 )
            // InternalKVis.g:1343:2: rule__Animation__Group_0__0__Impl rule__Animation__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_1);
            rule__Animation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_0__0"


    // $ANTLR start "rule__Animation__Group_0__0__Impl"
    // InternalKVis.g:1350:1: rule__Animation__Group_0__0__Impl : ( 'color' ) ;
    public final void rule__Animation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1354:1: ( ( 'color' ) )
            // InternalKVis.g:1355:1: ( 'color' )
            {
            // InternalKVis.g:1355:1: ( 'color' )
            // InternalKVis.g:1356:1: 'color'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getColorKeyword_0_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getColorKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_0__0__Impl"


    // $ANTLR start "rule__Animation__Group_0__1"
    // InternalKVis.g:1369:1: rule__Animation__Group_0__1 : rule__Animation__Group_0__1__Impl ;
    public final void rule__Animation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1373:1: ( rule__Animation__Group_0__1__Impl )
            // InternalKVis.g:1374:2: rule__Animation__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_0__1"


    // $ANTLR start "rule__Animation__Group_0__1__Impl"
    // InternalKVis.g:1380:1: rule__Animation__Group_0__1__Impl : ( () ) ;
    public final void rule__Animation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1384:1: ( ( () ) )
            // InternalKVis.g:1385:1: ( () )
            {
            // InternalKVis.g:1385:1: ( () )
            // InternalKVis.g:1386:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getColorAnimationAction_0_1()); 
            }
            // InternalKVis.g:1387:1: ()
            // InternalKVis.g:1389:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getColorAnimationAction_0_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_0__1__Impl"


    // $ANTLR start "rule__Animation__Group_1__0"
    // InternalKVis.g:1403:1: rule__Animation__Group_1__0 : rule__Animation__Group_1__0__Impl rule__Animation__Group_1__1 ;
    public final void rule__Animation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1407:1: ( rule__Animation__Group_1__0__Impl rule__Animation__Group_1__1 )
            // InternalKVis.g:1408:2: rule__Animation__Group_1__0__Impl rule__Animation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_1);
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
    // InternalKVis.g:1415:1: rule__Animation__Group_1__0__Impl : ( 'text' ) ;
    public final void rule__Animation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1419:1: ( ( 'text' ) )
            // InternalKVis.g:1420:1: ( 'text' )
            {
            // InternalKVis.g:1420:1: ( 'text' )
            // InternalKVis.g:1421:1: 'text'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getTextKeyword_1_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getTextKeyword_1_0()); 
            }

            }


            }

        }
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
    // InternalKVis.g:1434:1: rule__Animation__Group_1__1 : rule__Animation__Group_1__1__Impl ;
    public final void rule__Animation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1438:1: ( rule__Animation__Group_1__1__Impl )
            // InternalKVis.g:1439:2: rule__Animation__Group_1__1__Impl
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
    // InternalKVis.g:1445:1: rule__Animation__Group_1__1__Impl : ( () ) ;
    public final void rule__Animation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1449:1: ( ( () ) )
            // InternalKVis.g:1450:1: ( () )
            {
            // InternalKVis.g:1450:1: ( () )
            // InternalKVis.g:1451:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getTextAnimationAction_1_1()); 
            }
            // InternalKVis.g:1452:1: ()
            // InternalKVis.g:1454:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getTextAnimationAction_1_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_1__1__Impl"


    // $ANTLR start "rule__Animation__Group_2__0"
    // InternalKVis.g:1468:1: rule__Animation__Group_2__0 : rule__Animation__Group_2__0__Impl rule__Animation__Group_2__1 ;
    public final void rule__Animation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1472:1: ( rule__Animation__Group_2__0__Impl rule__Animation__Group_2__1 )
            // InternalKVis.g:1473:2: rule__Animation__Group_2__0__Impl rule__Animation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_1);
            rule__Animation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_2__0"


    // $ANTLR start "rule__Animation__Group_2__0__Impl"
    // InternalKVis.g:1480:1: rule__Animation__Group_2__0__Impl : ( 'visible' ) ;
    public final void rule__Animation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1484:1: ( ( 'visible' ) )
            // InternalKVis.g:1485:1: ( 'visible' )
            {
            // InternalKVis.g:1485:1: ( 'visible' )
            // InternalKVis.g:1486:1: 'visible'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getVisibleKeyword_2_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getVisibleKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_2__0__Impl"


    // $ANTLR start "rule__Animation__Group_2__1"
    // InternalKVis.g:1499:1: rule__Animation__Group_2__1 : rule__Animation__Group_2__1__Impl ;
    public final void rule__Animation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1503:1: ( rule__Animation__Group_2__1__Impl )
            // InternalKVis.g:1504:2: rule__Animation__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_2__1"


    // $ANTLR start "rule__Animation__Group_2__1__Impl"
    // InternalKVis.g:1510:1: rule__Animation__Group_2__1__Impl : ( () ) ;
    public final void rule__Animation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1514:1: ( ( () ) )
            // InternalKVis.g:1515:1: ( () )
            {
            // InternalKVis.g:1515:1: ( () )
            // InternalKVis.g:1516:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getVisibleAnimationAction_2_1()); 
            }
            // InternalKVis.g:1517:1: ()
            // InternalKVis.g:1519:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getVisibleAnimationAction_2_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_2__1__Impl"


    // $ANTLR start "rule__Animation__Group_3__0"
    // InternalKVis.g:1533:1: rule__Animation__Group_3__0 : rule__Animation__Group_3__0__Impl rule__Animation__Group_3__1 ;
    public final void rule__Animation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1537:1: ( rule__Animation__Group_3__0__Impl rule__Animation__Group_3__1 )
            // InternalKVis.g:1538:2: rule__Animation__Group_3__0__Impl rule__Animation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_1);
            rule__Animation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_3__0"


    // $ANTLR start "rule__Animation__Group_3__0__Impl"
    // InternalKVis.g:1545:1: rule__Animation__Group_3__0__Impl : ( 'rotation' ) ;
    public final void rule__Animation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1549:1: ( ( 'rotation' ) )
            // InternalKVis.g:1550:1: ( 'rotation' )
            {
            // InternalKVis.g:1550:1: ( 'rotation' )
            // InternalKVis.g:1551:1: 'rotation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getRotationKeyword_3_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getRotationKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_3__0__Impl"


    // $ANTLR start "rule__Animation__Group_3__1"
    // InternalKVis.g:1564:1: rule__Animation__Group_3__1 : rule__Animation__Group_3__1__Impl ;
    public final void rule__Animation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1568:1: ( rule__Animation__Group_3__1__Impl )
            // InternalKVis.g:1569:2: rule__Animation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_3__1"


    // $ANTLR start "rule__Animation__Group_3__1__Impl"
    // InternalKVis.g:1575:1: rule__Animation__Group_3__1__Impl : ( () ) ;
    public final void rule__Animation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1579:1: ( ( () ) )
            // InternalKVis.g:1580:1: ( () )
            {
            // InternalKVis.g:1580:1: ( () )
            // InternalKVis.g:1581:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getRotateAnimationAction_3_1()); 
            }
            // InternalKVis.g:1582:1: ()
            // InternalKVis.g:1584:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getRotateAnimationAction_3_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_3__1__Impl"


    // $ANTLR start "rule__Animation__Group_4__0"
    // InternalKVis.g:1598:1: rule__Animation__Group_4__0 : rule__Animation__Group_4__0__Impl rule__Animation__Group_4__1 ;
    public final void rule__Animation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1602:1: ( rule__Animation__Group_4__0__Impl rule__Animation__Group_4__1 )
            // InternalKVis.g:1603:2: rule__Animation__Group_4__0__Impl rule__Animation__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_1);
            rule__Animation__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_4__0"


    // $ANTLR start "rule__Animation__Group_4__0__Impl"
    // InternalKVis.g:1610:1: rule__Animation__Group_4__0__Impl : ( 'movement' ) ;
    public final void rule__Animation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1614:1: ( ( 'movement' ) )
            // InternalKVis.g:1615:1: ( 'movement' )
            {
            // InternalKVis.g:1615:1: ( 'movement' )
            // InternalKVis.g:1616:1: 'movement'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getMovementKeyword_4_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getMovementKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_4__0__Impl"


    // $ANTLR start "rule__Animation__Group_4__1"
    // InternalKVis.g:1629:1: rule__Animation__Group_4__1 : rule__Animation__Group_4__1__Impl ;
    public final void rule__Animation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1633:1: ( rule__Animation__Group_4__1__Impl )
            // InternalKVis.g:1634:2: rule__Animation__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_4__1"


    // $ANTLR start "rule__Animation__Group_4__1__Impl"
    // InternalKVis.g:1640:1: rule__Animation__Group_4__1__Impl : ( () ) ;
    public final void rule__Animation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1644:1: ( ( () ) )
            // InternalKVis.g:1645:1: ( () )
            {
            // InternalKVis.g:1645:1: ( () )
            // InternalKVis.g:1646:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getMoveAnimationAction_4_1()); 
            }
            // InternalKVis.g:1647:1: ()
            // InternalKVis.g:1649:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getMoveAnimationAction_4_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_4__1__Impl"


    // $ANTLR start "rule__AttributeMapping__Group__0"
    // InternalKVis.g:1663:1: rule__AttributeMapping__Group__0 : rule__AttributeMapping__Group__0__Impl rule__AttributeMapping__Group__1 ;
    public final void rule__AttributeMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1667:1: ( rule__AttributeMapping__Group__0__Impl rule__AttributeMapping__Group__1 )
            // InternalKVis.g:1668:2: rule__AttributeMapping__Group__0__Impl rule__AttributeMapping__Group__1
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
    // InternalKVis.g:1675:1: rule__AttributeMapping__Group__0__Impl : ( ( rule__AttributeMapping__AttributeAssignment_0 ) ) ;
    public final void rule__AttributeMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1679:1: ( ( ( rule__AttributeMapping__AttributeAssignment_0 ) ) )
            // InternalKVis.g:1680:1: ( ( rule__AttributeMapping__AttributeAssignment_0 ) )
            {
            // InternalKVis.g:1680:1: ( ( rule__AttributeMapping__AttributeAssignment_0 ) )
            // InternalKVis.g:1681:1: ( rule__AttributeMapping__AttributeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getAttributeAssignment_0()); 
            }
            // InternalKVis.g:1682:1: ( rule__AttributeMapping__AttributeAssignment_0 )
            // InternalKVis.g:1682:2: rule__AttributeMapping__AttributeAssignment_0
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
    // InternalKVis.g:1692:1: rule__AttributeMapping__Group__1 : rule__AttributeMapping__Group__1__Impl rule__AttributeMapping__Group__2 ;
    public final void rule__AttributeMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1696:1: ( rule__AttributeMapping__Group__1__Impl rule__AttributeMapping__Group__2 )
            // InternalKVis.g:1697:2: rule__AttributeMapping__Group__1__Impl rule__AttributeMapping__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalKVis.g:1704:1: rule__AttributeMapping__Group__1__Impl : ( ':' ) ;
    public final void rule__AttributeMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1708:1: ( ( ':' ) )
            // InternalKVis.g:1709:1: ( ':' )
            {
            // InternalKVis.g:1709:1: ( ':' )
            // InternalKVis.g:1710:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getColonKeyword_1()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:1723:1: rule__AttributeMapping__Group__2 : rule__AttributeMapping__Group__2__Impl ;
    public final void rule__AttributeMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1727:1: ( rule__AttributeMapping__Group__2__Impl )
            // InternalKVis.g:1728:2: rule__AttributeMapping__Group__2__Impl
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
    // InternalKVis.g:1734:1: rule__AttributeMapping__Group__2__Impl : ( ( rule__AttributeMapping__Alternatives_2 ) ) ;
    public final void rule__AttributeMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1738:1: ( ( ( rule__AttributeMapping__Alternatives_2 ) ) )
            // InternalKVis.g:1739:1: ( ( rule__AttributeMapping__Alternatives_2 ) )
            {
            // InternalKVis.g:1739:1: ( ( rule__AttributeMapping__Alternatives_2 ) )
            // InternalKVis.g:1740:1: ( rule__AttributeMapping__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getAlternatives_2()); 
            }
            // InternalKVis.g:1741:1: ( rule__AttributeMapping__Alternatives_2 )
            // InternalKVis.g:1741:2: rule__AttributeMapping__Alternatives_2
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
    // InternalKVis.g:1757:1: rule__AttributeMapping__Group_2_1__0 : rule__AttributeMapping__Group_2_1__0__Impl rule__AttributeMapping__Group_2_1__1 ;
    public final void rule__AttributeMapping__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1761:1: ( rule__AttributeMapping__Group_2_1__0__Impl rule__AttributeMapping__Group_2_1__1 )
            // InternalKVis.g:1762:2: rule__AttributeMapping__Group_2_1__0__Impl rule__AttributeMapping__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalKVis.g:1769:1: rule__AttributeMapping__Group_2_1__0__Impl : ( ( rule__AttributeMapping__MappingsAssignment_2_1_0 ) ) ;
    public final void rule__AttributeMapping__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1773:1: ( ( ( rule__AttributeMapping__MappingsAssignment_2_1_0 ) ) )
            // InternalKVis.g:1774:1: ( ( rule__AttributeMapping__MappingsAssignment_2_1_0 ) )
            {
            // InternalKVis.g:1774:1: ( ( rule__AttributeMapping__MappingsAssignment_2_1_0 ) )
            // InternalKVis.g:1775:1: ( rule__AttributeMapping__MappingsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getMappingsAssignment_2_1_0()); 
            }
            // InternalKVis.g:1776:1: ( rule__AttributeMapping__MappingsAssignment_2_1_0 )
            // InternalKVis.g:1776:2: rule__AttributeMapping__MappingsAssignment_2_1_0
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
    // InternalKVis.g:1786:1: rule__AttributeMapping__Group_2_1__1 : rule__AttributeMapping__Group_2_1__1__Impl ;
    public final void rule__AttributeMapping__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1790:1: ( rule__AttributeMapping__Group_2_1__1__Impl )
            // InternalKVis.g:1791:2: rule__AttributeMapping__Group_2_1__1__Impl
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
    // InternalKVis.g:1797:1: rule__AttributeMapping__Group_2_1__1__Impl : ( ( rule__AttributeMapping__Group_2_1_1__0 )* ) ;
    public final void rule__AttributeMapping__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1801:1: ( ( ( rule__AttributeMapping__Group_2_1_1__0 )* ) )
            // InternalKVis.g:1802:1: ( ( rule__AttributeMapping__Group_2_1_1__0 )* )
            {
            // InternalKVis.g:1802:1: ( ( rule__AttributeMapping__Group_2_1_1__0 )* )
            // InternalKVis.g:1803:1: ( rule__AttributeMapping__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getGroup_2_1_1()); 
            }
            // InternalKVis.g:1804:1: ( rule__AttributeMapping__Group_2_1_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKVis.g:1804:2: rule__AttributeMapping__Group_2_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    rule__AttributeMapping__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalKVis.g:1818:1: rule__AttributeMapping__Group_2_1_1__0 : rule__AttributeMapping__Group_2_1_1__0__Impl rule__AttributeMapping__Group_2_1_1__1 ;
    public final void rule__AttributeMapping__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1822:1: ( rule__AttributeMapping__Group_2_1_1__0__Impl rule__AttributeMapping__Group_2_1_1__1 )
            // InternalKVis.g:1823:2: rule__AttributeMapping__Group_2_1_1__0__Impl rule__AttributeMapping__Group_2_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalKVis.g:1830:1: rule__AttributeMapping__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__AttributeMapping__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1834:1: ( ( ',' ) )
            // InternalKVis.g:1835:1: ( ',' )
            {
            // InternalKVis.g:1835:1: ( ',' )
            // InternalKVis.g:1836:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:1849:1: rule__AttributeMapping__Group_2_1_1__1 : rule__AttributeMapping__Group_2_1_1__1__Impl ;
    public final void rule__AttributeMapping__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1853:1: ( rule__AttributeMapping__Group_2_1_1__1__Impl )
            // InternalKVis.g:1854:2: rule__AttributeMapping__Group_2_1_1__1__Impl
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
    // InternalKVis.g:1860:1: rule__AttributeMapping__Group_2_1_1__1__Impl : ( ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 ) ) ;
    public final void rule__AttributeMapping__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1864:1: ( ( ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 ) ) )
            // InternalKVis.g:1865:1: ( ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 ) )
            {
            // InternalKVis.g:1865:1: ( ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 ) )
            // InternalKVis.g:1866:1: ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getMappingsAssignment_2_1_1_1()); 
            }
            // InternalKVis.g:1867:1: ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 )
            // InternalKVis.g:1867:2: rule__AttributeMapping__MappingsAssignment_2_1_1_1
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
    // InternalKVis.g:1881:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1885:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalKVis.g:1886:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalKVis.g:1893:1: rule__Mapping__Group__0__Impl : ( ( rule__Mapping__VariableDomainAssignment_0 ) ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1897:1: ( ( ( rule__Mapping__VariableDomainAssignment_0 ) ) )
            // InternalKVis.g:1898:1: ( ( rule__Mapping__VariableDomainAssignment_0 ) )
            {
            // InternalKVis.g:1898:1: ( ( rule__Mapping__VariableDomainAssignment_0 ) )
            // InternalKVis.g:1899:1: ( rule__Mapping__VariableDomainAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getVariableDomainAssignment_0()); 
            }
            // InternalKVis.g:1900:1: ( rule__Mapping__VariableDomainAssignment_0 )
            // InternalKVis.g:1900:2: rule__Mapping__VariableDomainAssignment_0
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
    // InternalKVis.g:1910:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1914:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalKVis.g:1915:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalKVis.g:1922:1: rule__Mapping__Group__1__Impl : ( 'is' ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1926:1: ( ( 'is' ) )
            // InternalKVis.g:1927:1: ( 'is' )
            {
            // InternalKVis.g:1927:1: ( 'is' )
            // InternalKVis.g:1928:1: 'is'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getIsKeyword_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:1941:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1945:1: ( rule__Mapping__Group__2__Impl )
            // InternalKVis.g:1946:2: rule__Mapping__Group__2__Impl
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
    // InternalKVis.g:1952:1: rule__Mapping__Group__2__Impl : ( ( rule__Mapping__AttributeDomainAssignment_2 ) ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1956:1: ( ( ( rule__Mapping__AttributeDomainAssignment_2 ) ) )
            // InternalKVis.g:1957:1: ( ( rule__Mapping__AttributeDomainAssignment_2 ) )
            {
            // InternalKVis.g:1957:1: ( ( rule__Mapping__AttributeDomainAssignment_2 ) )
            // InternalKVis.g:1958:1: ( rule__Mapping__AttributeDomainAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getAttributeDomainAssignment_2()); 
            }
            // InternalKVis.g:1959:1: ( rule__Mapping__AttributeDomainAssignment_2 )
            // InternalKVis.g:1959:2: rule__Mapping__AttributeDomainAssignment_2
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
    // InternalKVis.g:1975:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1979:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // InternalKVis.g:1980:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalKVis.g:1987:1: rule__Interval__Group__0__Impl : ( ( rule__Interval__FromAssignment_0 ) ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1991:1: ( ( ( rule__Interval__FromAssignment_0 ) ) )
            // InternalKVis.g:1992:1: ( ( rule__Interval__FromAssignment_0 ) )
            {
            // InternalKVis.g:1992:1: ( ( rule__Interval__FromAssignment_0 ) )
            // InternalKVis.g:1993:1: ( rule__Interval__FromAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getFromAssignment_0()); 
            }
            // InternalKVis.g:1994:1: ( rule__Interval__FromAssignment_0 )
            // InternalKVis.g:1994:2: rule__Interval__FromAssignment_0
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
    // InternalKVis.g:2004:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2008:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // InternalKVis.g:2009:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
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
    // InternalKVis.g:2016:1: rule__Interval__Group__1__Impl : ( '..' ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2020:1: ( ( '..' ) )
            // InternalKVis.g:2021:1: ( '..' )
            {
            // InternalKVis.g:2021:1: ( '..' )
            // InternalKVis.g:2022:1: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getFullStopFullStopKeyword_1()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:2035:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2039:1: ( rule__Interval__Group__2__Impl )
            // InternalKVis.g:2040:2: rule__Interval__Group__2__Impl
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
    // InternalKVis.g:2046:1: rule__Interval__Group__2__Impl : ( ( rule__Interval__ToAssignment_2 ) ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2050:1: ( ( ( rule__Interval__ToAssignment_2 ) ) )
            // InternalKVis.g:2051:1: ( ( rule__Interval__ToAssignment_2 ) )
            {
            // InternalKVis.g:2051:1: ( ( rule__Interval__ToAssignment_2 ) )
            // InternalKVis.g:2052:1: ( rule__Interval__ToAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getToAssignment_2()); 
            }
            // InternalKVis.g:2053:1: ( rule__Interval__ToAssignment_2 )
            // InternalKVis.g:2053:2: rule__Interval__ToAssignment_2
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
    // InternalKVis.g:2069:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2073:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalKVis.g:2074:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalKVis.g:2081:1: rule__Condition__Group__0__Impl : ( 'when' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2085:1: ( ( 'when' ) )
            // InternalKVis.g:2086:1: ( 'when' )
            {
            // InternalKVis.g:2086:1: ( 'when' )
            // InternalKVis.g:2087:1: 'when'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getWhenKeyword_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:2100:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2104:1: ( rule__Condition__Group__1__Impl )
            // InternalKVis.g:2105:2: rule__Condition__Group__1__Impl
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
    // InternalKVis.g:2111:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ExpressionAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2115:1: ( ( ( rule__Condition__ExpressionAssignment_1 ) ) )
            // InternalKVis.g:2116:1: ( ( rule__Condition__ExpressionAssignment_1 ) )
            {
            // InternalKVis.g:2116:1: ( ( rule__Condition__ExpressionAssignment_1 ) )
            // InternalKVis.g:2117:1: ( rule__Condition__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExpressionAssignment_1()); 
            }
            // InternalKVis.g:2118:1: ( rule__Condition__ExpressionAssignment_1 )
            // InternalKVis.g:2118:2: rule__Condition__ExpressionAssignment_1
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
    // InternalKVis.g:2132:1: rule__VariableReference__Group__0 : rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 ;
    public final void rule__VariableReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2136:1: ( rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 )
            // InternalKVis.g:2137:2: rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1
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
    // InternalKVis.g:2144:1: rule__VariableReference__Group__0__Impl : ( ( rule__VariableReference__ModelAssignment_0 )? ) ;
    public final void rule__VariableReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2148:1: ( ( ( rule__VariableReference__ModelAssignment_0 )? ) )
            // InternalKVis.g:2149:1: ( ( rule__VariableReference__ModelAssignment_0 )? )
            {
            // InternalKVis.g:2149:1: ( ( rule__VariableReference__ModelAssignment_0 )? )
            // InternalKVis.g:2150:1: ( rule__VariableReference__ModelAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getModelAssignment_0()); 
            }
            // InternalKVis.g:2151:1: ( rule__VariableReference__ModelAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==40) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalKVis.g:2151:2: rule__VariableReference__ModelAssignment_0
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
    // InternalKVis.g:2161:1: rule__VariableReference__Group__1 : rule__VariableReference__Group__1__Impl rule__VariableReference__Group__2 ;
    public final void rule__VariableReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2165:1: ( rule__VariableReference__Group__1__Impl rule__VariableReference__Group__2 )
            // InternalKVis.g:2166:2: rule__VariableReference__Group__1__Impl rule__VariableReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalKVis.g:2173:1: rule__VariableReference__Group__1__Impl : ( ( rule__VariableReference__NameAssignment_1 ) ) ;
    public final void rule__VariableReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2177:1: ( ( ( rule__VariableReference__NameAssignment_1 ) ) )
            // InternalKVis.g:2178:1: ( ( rule__VariableReference__NameAssignment_1 ) )
            {
            // InternalKVis.g:2178:1: ( ( rule__VariableReference__NameAssignment_1 ) )
            // InternalKVis.g:2179:1: ( rule__VariableReference__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getNameAssignment_1()); 
            }
            // InternalKVis.g:2180:1: ( rule__VariableReference__NameAssignment_1 )
            // InternalKVis.g:2180:2: rule__VariableReference__NameAssignment_1
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
    // InternalKVis.g:2190:1: rule__VariableReference__Group__2 : rule__VariableReference__Group__2__Impl ;
    public final void rule__VariableReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2194:1: ( rule__VariableReference__Group__2__Impl )
            // InternalKVis.g:2195:2: rule__VariableReference__Group__2__Impl
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
    // InternalKVis.g:2201:1: rule__VariableReference__Group__2__Impl : ( ( rule__VariableReference__Group_2__0 )* ) ;
    public final void rule__VariableReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2205:1: ( ( ( rule__VariableReference__Group_2__0 )* ) )
            // InternalKVis.g:2206:1: ( ( rule__VariableReference__Group_2__0 )* )
            {
            // InternalKVis.g:2206:1: ( ( rule__VariableReference__Group_2__0 )* )
            // InternalKVis.g:2207:1: ( rule__VariableReference__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup_2()); 
            }
            // InternalKVis.g:2208:1: ( rule__VariableReference__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKVis.g:2208:2: rule__VariableReference__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__VariableReference__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalKVis.g:2224:1: rule__VariableReference__Group_2__0 : rule__VariableReference__Group_2__0__Impl rule__VariableReference__Group_2__1 ;
    public final void rule__VariableReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2228:1: ( rule__VariableReference__Group_2__0__Impl rule__VariableReference__Group_2__1 )
            // InternalKVis.g:2229:2: rule__VariableReference__Group_2__0__Impl rule__VariableReference__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
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
    // InternalKVis.g:2236:1: rule__VariableReference__Group_2__0__Impl : ( '[' ) ;
    public final void rule__VariableReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2240:1: ( ( '[' ) )
            // InternalKVis.g:2241:1: ( '[' )
            {
            // InternalKVis.g:2241:1: ( '[' )
            // InternalKVis.g:2242:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getLeftSquareBracketKeyword_2_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:2255:1: rule__VariableReference__Group_2__1 : rule__VariableReference__Group_2__1__Impl rule__VariableReference__Group_2__2 ;
    public final void rule__VariableReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2259:1: ( rule__VariableReference__Group_2__1__Impl rule__VariableReference__Group_2__2 )
            // InternalKVis.g:2260:2: rule__VariableReference__Group_2__1__Impl rule__VariableReference__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalKVis.g:2267:1: rule__VariableReference__Group_2__1__Impl : ( ( rule__VariableReference__IndicesAssignment_2_1 ) ) ;
    public final void rule__VariableReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2271:1: ( ( ( rule__VariableReference__IndicesAssignment_2_1 ) ) )
            // InternalKVis.g:2272:1: ( ( rule__VariableReference__IndicesAssignment_2_1 ) )
            {
            // InternalKVis.g:2272:1: ( ( rule__VariableReference__IndicesAssignment_2_1 ) )
            // InternalKVis.g:2273:1: ( rule__VariableReference__IndicesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getIndicesAssignment_2_1()); 
            }
            // InternalKVis.g:2274:1: ( rule__VariableReference__IndicesAssignment_2_1 )
            // InternalKVis.g:2274:2: rule__VariableReference__IndicesAssignment_2_1
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
    // InternalKVis.g:2284:1: rule__VariableReference__Group_2__2 : rule__VariableReference__Group_2__2__Impl ;
    public final void rule__VariableReference__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2288:1: ( rule__VariableReference__Group_2__2__Impl )
            // InternalKVis.g:2289:2: rule__VariableReference__Group_2__2__Impl
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
    // InternalKVis.g:2295:1: rule__VariableReference__Group_2__2__Impl : ( ']' ) ;
    public final void rule__VariableReference__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2299:1: ( ( ']' ) )
            // InternalKVis.g:2300:1: ( ']' )
            {
            // InternalKVis.g:2300:1: ( ']' )
            // InternalKVis.g:2301:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getRightSquareBracketKeyword_2_2()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:2320:1: rule__ModelReference__Group__0 : rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1 ;
    public final void rule__ModelReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2324:1: ( rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1 )
            // InternalKVis.g:2325:2: rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalKVis.g:2332:1: rule__ModelReference__Group__0__Impl : ( ( rule__ModelReference__NameAssignment_0 ) ) ;
    public final void rule__ModelReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2336:1: ( ( ( rule__ModelReference__NameAssignment_0 ) ) )
            // InternalKVis.g:2337:1: ( ( rule__ModelReference__NameAssignment_0 ) )
            {
            // InternalKVis.g:2337:1: ( ( rule__ModelReference__NameAssignment_0 ) )
            // InternalKVis.g:2338:1: ( rule__ModelReference__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getNameAssignment_0()); 
            }
            // InternalKVis.g:2339:1: ( rule__ModelReference__NameAssignment_0 )
            // InternalKVis.g:2339:2: rule__ModelReference__NameAssignment_0
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
    // InternalKVis.g:2349:1: rule__ModelReference__Group__1 : rule__ModelReference__Group__1__Impl ;
    public final void rule__ModelReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2353:1: ( rule__ModelReference__Group__1__Impl )
            // InternalKVis.g:2354:2: rule__ModelReference__Group__1__Impl
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
    // InternalKVis.g:2360:1: rule__ModelReference__Group__1__Impl : ( '.' ) ;
    public final void rule__ModelReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2364:1: ( ( '.' ) )
            // InternalKVis.g:2365:1: ( '.' )
            {
            // InternalKVis.g:2365:1: ( '.' )
            // InternalKVis.g:2366:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getFullStopKeyword_1()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__BooleanExpression__Group__0"
    // InternalKVis.g:2383:1: rule__BooleanExpression__Group__0 : rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1 ;
    public final void rule__BooleanExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2387:1: ( rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1 )
            // InternalKVis.g:2388:2: rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__BooleanExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__0"


    // $ANTLR start "rule__BooleanExpression__Group__0__Impl"
    // InternalKVis.g:2395:1: rule__BooleanExpression__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__BooleanExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2399:1: ( ( ruleComparison ) )
            // InternalKVis.g:2400:1: ( ruleComparison )
            {
            // InternalKVis.g:2400:1: ( ruleComparison )
            // InternalKVis.g:2401:1: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getComparisonParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getComparisonParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__1"
    // InternalKVis.g:2412:1: rule__BooleanExpression__Group__1 : rule__BooleanExpression__Group__1__Impl ;
    public final void rule__BooleanExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2416:1: ( rule__BooleanExpression__Group__1__Impl )
            // InternalKVis.g:2417:2: rule__BooleanExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__1"


    // $ANTLR start "rule__BooleanExpression__Group__1__Impl"
    // InternalKVis.g:2423:1: rule__BooleanExpression__Group__1__Impl : ( ( rule__BooleanExpression__Group_1__0 )* ) ;
    public final void rule__BooleanExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2427:1: ( ( ( rule__BooleanExpression__Group_1__0 )* ) )
            // InternalKVis.g:2428:1: ( ( rule__BooleanExpression__Group_1__0 )* )
            {
            // InternalKVis.g:2428:1: ( ( rule__BooleanExpression__Group_1__0 )* )
            // InternalKVis.g:2429:1: ( rule__BooleanExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getGroup_1()); 
            }
            // InternalKVis.g:2430:1: ( rule__BooleanExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=20 && LA16_0<=21)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKVis.g:2430:2: rule__BooleanExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__BooleanExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpression__Group_1__0"
    // InternalKVis.g:2444:1: rule__BooleanExpression__Group_1__0 : rule__BooleanExpression__Group_1__0__Impl rule__BooleanExpression__Group_1__1 ;
    public final void rule__BooleanExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2448:1: ( rule__BooleanExpression__Group_1__0__Impl rule__BooleanExpression__Group_1__1 )
            // InternalKVis.g:2449:2: rule__BooleanExpression__Group_1__0__Impl rule__BooleanExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__BooleanExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1__0"


    // $ANTLR start "rule__BooleanExpression__Group_1__0__Impl"
    // InternalKVis.g:2456:1: rule__BooleanExpression__Group_1__0__Impl : ( ( rule__BooleanExpression__Group_1_0__0 ) ) ;
    public final void rule__BooleanExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2460:1: ( ( ( rule__BooleanExpression__Group_1_0__0 ) ) )
            // InternalKVis.g:2461:1: ( ( rule__BooleanExpression__Group_1_0__0 ) )
            {
            // InternalKVis.g:2461:1: ( ( rule__BooleanExpression__Group_1_0__0 ) )
            // InternalKVis.g:2462:1: ( rule__BooleanExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getGroup_1_0()); 
            }
            // InternalKVis.g:2463:1: ( rule__BooleanExpression__Group_1_0__0 )
            // InternalKVis.g:2463:2: rule__BooleanExpression__Group_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanExpression__Group_1__1"
    // InternalKVis.g:2473:1: rule__BooleanExpression__Group_1__1 : rule__BooleanExpression__Group_1__1__Impl ;
    public final void rule__BooleanExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2477:1: ( rule__BooleanExpression__Group_1__1__Impl )
            // InternalKVis.g:2478:2: rule__BooleanExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1__1"


    // $ANTLR start "rule__BooleanExpression__Group_1__1__Impl"
    // InternalKVis.g:2484:1: rule__BooleanExpression__Group_1__1__Impl : ( ( rule__BooleanExpression__RightAssignment_1_1 ) ) ;
    public final void rule__BooleanExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2488:1: ( ( ( rule__BooleanExpression__RightAssignment_1_1 ) ) )
            // InternalKVis.g:2489:1: ( ( rule__BooleanExpression__RightAssignment_1_1 ) )
            {
            // InternalKVis.g:2489:1: ( ( rule__BooleanExpression__RightAssignment_1_1 ) )
            // InternalKVis.g:2490:1: ( rule__BooleanExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getRightAssignment_1_1()); 
            }
            // InternalKVis.g:2491:1: ( rule__BooleanExpression__RightAssignment_1_1 )
            // InternalKVis.g:2491:2: rule__BooleanExpression__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanExpression__Group_1_0__0"
    // InternalKVis.g:2505:1: rule__BooleanExpression__Group_1_0__0 : rule__BooleanExpression__Group_1_0__0__Impl rule__BooleanExpression__Group_1_0__1 ;
    public final void rule__BooleanExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2509:1: ( rule__BooleanExpression__Group_1_0__0__Impl rule__BooleanExpression__Group_1_0__1 )
            // InternalKVis.g:2510:2: rule__BooleanExpression__Group_1_0__0__Impl rule__BooleanExpression__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__BooleanExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanExpression__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1_0__0"


    // $ANTLR start "rule__BooleanExpression__Group_1_0__0__Impl"
    // InternalKVis.g:2517:1: rule__BooleanExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__BooleanExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2521:1: ( ( () ) )
            // InternalKVis.g:2522:1: ( () )
            {
            // InternalKVis.g:2522:1: ( () )
            // InternalKVis.g:2523:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0()); 
            }
            // InternalKVis.g:2524:1: ()
            // InternalKVis.g:2526:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getAndOrExpressionLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__BooleanExpression__Group_1_0__1"
    // InternalKVis.g:2536:1: rule__BooleanExpression__Group_1_0__1 : rule__BooleanExpression__Group_1_0__1__Impl ;
    public final void rule__BooleanExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2540:1: ( rule__BooleanExpression__Group_1_0__1__Impl )
            // InternalKVis.g:2541:2: rule__BooleanExpression__Group_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanExpression__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1_0__1"


    // $ANTLR start "rule__BooleanExpression__Group_1_0__1__Impl"
    // InternalKVis.g:2547:1: rule__BooleanExpression__Group_1_0__1__Impl : ( ( rule__BooleanExpression__OperatorAssignment_1_0_1 ) ) ;
    public final void rule__BooleanExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2551:1: ( ( ( rule__BooleanExpression__OperatorAssignment_1_0_1 ) ) )
            // InternalKVis.g:2552:1: ( ( rule__BooleanExpression__OperatorAssignment_1_0_1 ) )
            {
            // InternalKVis.g:2552:1: ( ( rule__BooleanExpression__OperatorAssignment_1_0_1 ) )
            // InternalKVis.g:2553:1: ( rule__BooleanExpression__OperatorAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOperatorAssignment_1_0_1()); 
            }
            // InternalKVis.g:2554:1: ( rule__BooleanExpression__OperatorAssignment_1_0_1 )
            // InternalKVis.g:2554:2: rule__BooleanExpression__OperatorAssignment_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanExpression__OperatorAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getOperatorAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalKVis.g:2568:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2572:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalKVis.g:2573:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalKVis.g:2580:1: rule__Comparison__Group__0__Impl : ( ( rule__Comparison__LeftSideAssignment_0 ) ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2584:1: ( ( ( rule__Comparison__LeftSideAssignment_0 ) ) )
            // InternalKVis.g:2585:1: ( ( rule__Comparison__LeftSideAssignment_0 ) )
            {
            // InternalKVis.g:2585:1: ( ( rule__Comparison__LeftSideAssignment_0 ) )
            // InternalKVis.g:2586:1: ( rule__Comparison__LeftSideAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLeftSideAssignment_0()); 
            }
            // InternalKVis.g:2587:1: ( rule__Comparison__LeftSideAssignment_0 )
            // InternalKVis.g:2587:2: rule__Comparison__LeftSideAssignment_0
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
    // InternalKVis.g:2597:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2601:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // InternalKVis.g:2602:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalKVis.g:2609:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__RelationAssignment_1 ) ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2613:1: ( ( ( rule__Comparison__RelationAssignment_1 ) ) )
            // InternalKVis.g:2614:1: ( ( rule__Comparison__RelationAssignment_1 ) )
            {
            // InternalKVis.g:2614:1: ( ( rule__Comparison__RelationAssignment_1 ) )
            // InternalKVis.g:2615:1: ( rule__Comparison__RelationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRelationAssignment_1()); 
            }
            // InternalKVis.g:2616:1: ( rule__Comparison__RelationAssignment_1 )
            // InternalKVis.g:2616:2: rule__Comparison__RelationAssignment_1
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
    // InternalKVis.g:2626:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2630:1: ( rule__Comparison__Group__2__Impl )
            // InternalKVis.g:2631:2: rule__Comparison__Group__2__Impl
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
    // InternalKVis.g:2637:1: rule__Comparison__Group__2__Impl : ( ( rule__Comparison__RightSideAssignment_2 ) ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2641:1: ( ( ( rule__Comparison__RightSideAssignment_2 ) ) )
            // InternalKVis.g:2642:1: ( ( rule__Comparison__RightSideAssignment_2 ) )
            {
            // InternalKVis.g:2642:1: ( ( rule__Comparison__RightSideAssignment_2 ) )
            // InternalKVis.g:2643:1: ( rule__Comparison__RightSideAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightSideAssignment_2()); 
            }
            // InternalKVis.g:2644:1: ( rule__Comparison__RightSideAssignment_2 )
            // InternalKVis.g:2644:2: rule__Comparison__RightSideAssignment_2
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
    // InternalKVis.g:2661:1: rule__Visualization__ImageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Visualization__ImageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2665:1: ( ( RULE_STRING ) )
            // InternalKVis.g:2666:1: ( RULE_STRING )
            {
            // InternalKVis.g:2666:1: ( RULE_STRING )
            // InternalKVis.g:2667:1: RULE_STRING
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
    // InternalKVis.g:2676:1: rule__Visualization__ElementsAssignment_3 : ( ruleElement ) ;
    public final void rule__Visualization__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2680:1: ( ( ruleElement ) )
            // InternalKVis.g:2681:1: ( ruleElement )
            {
            // InternalKVis.g:2681:1: ( ruleElement )
            // InternalKVis.g:2682:1: ruleElement
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
    // InternalKVis.g:2691:1: rule__Element__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Element__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2695:1: ( ( RULE_ID ) )
            // InternalKVis.g:2696:1: ( RULE_ID )
            {
            // InternalKVis.g:2696:1: ( RULE_ID )
            // InternalKVis.g:2697:1: RULE_ID
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
    // InternalKVis.g:2706:1: rule__Element__AnimationsAssignment_3 : ( ruleAnimationRule ) ;
    public final void rule__Element__AnimationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2710:1: ( ( ruleAnimationRule ) )
            // InternalKVis.g:2711:1: ( ruleAnimationRule )
            {
            // InternalKVis.g:2711:1: ( ruleAnimationRule )
            // InternalKVis.g:2712:1: ruleAnimationRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAnimationsAnimationRuleParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAnimationRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getAnimationsAnimationRuleParserRuleCall_3_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__AnimationRule__VariableAssignment_2_1"
    // InternalKVis.g:2721:1: rule__AnimationRule__VariableAssignment_2_1 : ( ruleVariableReference ) ;
    public final void rule__AnimationRule__VariableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2725:1: ( ( ruleVariableReference ) )
            // InternalKVis.g:2726:1: ( ruleVariableReference )
            {
            // InternalKVis.g:2726:1: ( ruleVariableReference )
            // InternalKVis.g:2727:1: ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationRuleAccess().getVariableVariableReferenceParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVariableReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationRuleAccess().getVariableVariableReferenceParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__VariableAssignment_2_1"


    // $ANTLR start "rule__AnimationRule__MappingsAssignment_4"
    // InternalKVis.g:2736:1: rule__AnimationRule__MappingsAssignment_4 : ( ruleAttributeMapping ) ;
    public final void rule__AnimationRule__MappingsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2740:1: ( ( ruleAttributeMapping ) )
            // InternalKVis.g:2741:1: ( ruleAttributeMapping )
            {
            // InternalKVis.g:2741:1: ( ruleAttributeMapping )
            // InternalKVis.g:2742:1: ruleAttributeMapping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationRuleAccess().getMappingsAttributeMappingParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttributeMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationRuleAccess().getMappingsAttributeMappingParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__MappingsAssignment_4"


    // $ANTLR start "rule__AnimationRule__ConditionAssignment_6"
    // InternalKVis.g:2751:1: rule__AnimationRule__ConditionAssignment_6 : ( ruleCondition ) ;
    public final void rule__AnimationRule__ConditionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2755:1: ( ( ruleCondition ) )
            // InternalKVis.g:2756:1: ( ruleCondition )
            {
            // InternalKVis.g:2756:1: ( ruleCondition )
            // InternalKVis.g:2757:1: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationRuleAccess().getConditionConditionParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationRuleAccess().getConditionConditionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationRule__ConditionAssignment_6"


    // $ANTLR start "rule__AttributeMapping__AttributeAssignment_0"
    // InternalKVis.g:2766:1: rule__AttributeMapping__AttributeAssignment_0 : ( RULE_ID ) ;
    public final void rule__AttributeMapping__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2770:1: ( ( RULE_ID ) )
            // InternalKVis.g:2771:1: ( RULE_ID )
            {
            // InternalKVis.g:2771:1: ( RULE_ID )
            // InternalKVis.g:2772:1: RULE_ID
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
    // InternalKVis.g:2781:1: rule__AttributeMapping__LiteralAssignment_2_0 : ( ruleLiteral ) ;
    public final void rule__AttributeMapping__LiteralAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2785:1: ( ( ruleLiteral ) )
            // InternalKVis.g:2786:1: ( ruleLiteral )
            {
            // InternalKVis.g:2786:1: ( ruleLiteral )
            // InternalKVis.g:2787:1: ruleLiteral
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
    // InternalKVis.g:2796:1: rule__AttributeMapping__MappingsAssignment_2_1_0 : ( ruleMapping ) ;
    public final void rule__AttributeMapping__MappingsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2800:1: ( ( ruleMapping ) )
            // InternalKVis.g:2801:1: ( ruleMapping )
            {
            // InternalKVis.g:2801:1: ( ruleMapping )
            // InternalKVis.g:2802:1: ruleMapping
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
    // InternalKVis.g:2811:1: rule__AttributeMapping__MappingsAssignment_2_1_1_1 : ( ruleMapping ) ;
    public final void rule__AttributeMapping__MappingsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2815:1: ( ( ruleMapping ) )
            // InternalKVis.g:2816:1: ( ruleMapping )
            {
            // InternalKVis.g:2816:1: ( ruleMapping )
            // InternalKVis.g:2817:1: ruleMapping
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
    // InternalKVis.g:2826:1: rule__Mapping__VariableDomainAssignment_0 : ( ruleVariableDomain ) ;
    public final void rule__Mapping__VariableDomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2830:1: ( ( ruleVariableDomain ) )
            // InternalKVis.g:2831:1: ( ruleVariableDomain )
            {
            // InternalKVis.g:2831:1: ( ruleVariableDomain )
            // InternalKVis.g:2832:1: ruleVariableDomain
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
    // InternalKVis.g:2841:1: rule__Mapping__AttributeDomainAssignment_2 : ( ruleAttributeDomain ) ;
    public final void rule__Mapping__AttributeDomainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2845:1: ( ( ruleAttributeDomain ) )
            // InternalKVis.g:2846:1: ( ruleAttributeDomain )
            {
            // InternalKVis.g:2846:1: ( ruleAttributeDomain )
            // InternalKVis.g:2847:1: ruleAttributeDomain
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
    // InternalKVis.g:2856:1: rule__VariableDomain__ValueAssignment_0 : ( ruleLiteral ) ;
    public final void rule__VariableDomain__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2860:1: ( ( ruleLiteral ) )
            // InternalKVis.g:2861:1: ( ruleLiteral )
            {
            // InternalKVis.g:2861:1: ( ruleLiteral )
            // InternalKVis.g:2862:1: ruleLiteral
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
    // InternalKVis.g:2871:1: rule__VariableDomain__RangeAssignment_1 : ( ruleInterval ) ;
    public final void rule__VariableDomain__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2875:1: ( ( ruleInterval ) )
            // InternalKVis.g:2876:1: ( ruleInterval )
            {
            // InternalKVis.g:2876:1: ( ruleInterval )
            // InternalKVis.g:2877:1: ruleInterval
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
    // InternalKVis.g:2886:1: rule__Interval__FromAssignment_0 : ( RULE_INT ) ;
    public final void rule__Interval__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2890:1: ( ( RULE_INT ) )
            // InternalKVis.g:2891:1: ( RULE_INT )
            {
            // InternalKVis.g:2891:1: ( RULE_INT )
            // InternalKVis.g:2892:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getFromINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getFromINTTerminalRuleCall_0_0()); 
            }

            }


            }

        }
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
    // InternalKVis.g:2901:1: rule__Interval__ToAssignment_2 : ( RULE_INT ) ;
    public final void rule__Interval__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2905:1: ( ( RULE_INT ) )
            // InternalKVis.g:2906:1: ( RULE_INT )
            {
            // InternalKVis.g:2906:1: ( RULE_INT )
            // InternalKVis.g:2907:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getToINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getToINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
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
    // InternalKVis.g:2916:1: rule__Condition__ExpressionAssignment_1 : ( ruleBooleanExpression ) ;
    public final void rule__Condition__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2920:1: ( ( ruleBooleanExpression ) )
            // InternalKVis.g:2921:1: ( ruleBooleanExpression )
            {
            // InternalKVis.g:2921:1: ( ruleBooleanExpression )
            // InternalKVis.g:2922:1: ruleBooleanExpression
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
    // InternalKVis.g:2931:1: rule__VariableReference__ModelAssignment_0 : ( ruleModelReference ) ;
    public final void rule__VariableReference__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2935:1: ( ( ruleModelReference ) )
            // InternalKVis.g:2936:1: ( ruleModelReference )
            {
            // InternalKVis.g:2936:1: ( ruleModelReference )
            // InternalKVis.g:2937:1: ruleModelReference
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
    // InternalKVis.g:2946:1: rule__VariableReference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableReference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2950:1: ( ( RULE_ID ) )
            // InternalKVis.g:2951:1: ( RULE_ID )
            {
            // InternalKVis.g:2951:1: ( RULE_ID )
            // InternalKVis.g:2952:1: RULE_ID
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
    // InternalKVis.g:2961:1: rule__VariableReference__IndicesAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__VariableReference__IndicesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2965:1: ( ( RULE_INT ) )
            // InternalKVis.g:2966:1: ( RULE_INT )
            {
            // InternalKVis.g:2966:1: ( RULE_INT )
            // InternalKVis.g:2967:1: RULE_INT
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
    // InternalKVis.g:2976:1: rule__ModelReference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ModelReference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2980:1: ( ( RULE_ID ) )
            // InternalKVis.g:2981:1: ( RULE_ID )
            {
            // InternalKVis.g:2981:1: ( RULE_ID )
            // InternalKVis.g:2982:1: RULE_ID
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


    // $ANTLR start "rule__BooleanExpression__OperatorAssignment_1_0_1"
    // InternalKVis.g:2991:1: rule__BooleanExpression__OperatorAssignment_1_0_1 : ( ruleBooleanOperator ) ;
    public final void rule__BooleanExpression__OperatorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2995:1: ( ( ruleBooleanOperator ) )
            // InternalKVis.g:2996:1: ( ruleBooleanOperator )
            {
            // InternalKVis.g:2996:1: ( ruleBooleanOperator )
            // InternalKVis.g:2997:1: ruleBooleanOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getOperatorBooleanOperatorEnumRuleCall_1_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBooleanOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getOperatorBooleanOperatorEnumRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__OperatorAssignment_1_0_1"


    // $ANTLR start "rule__BooleanExpression__RightAssignment_1_1"
    // InternalKVis.g:3006:1: rule__BooleanExpression__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__BooleanExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3010:1: ( ( ruleComparison ) )
            // InternalKVis.g:3011:1: ( ruleComparison )
            {
            // InternalKVis.g:3011:1: ( ruleComparison )
            // InternalKVis.g:3012:1: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getRightComparisonParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getRightComparisonParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__RightAssignment_1_1"


    // $ANTLR start "rule__Comparison__LeftSideAssignment_0"
    // InternalKVis.g:3021:1: rule__Comparison__LeftSideAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Comparison__LeftSideAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3025:1: ( ( ruleVariableReference ) )
            // InternalKVis.g:3026:1: ( ruleVariableReference )
            {
            // InternalKVis.g:3026:1: ( ruleVariableReference )
            // InternalKVis.g:3027:1: ruleVariableReference
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
    // InternalKVis.g:3036:1: rule__Comparison__RelationAssignment_1 : ( ruleCompareOperator ) ;
    public final void rule__Comparison__RelationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3040:1: ( ( ruleCompareOperator ) )
            // InternalKVis.g:3041:1: ( ruleCompareOperator )
            {
            // InternalKVis.g:3041:1: ( ruleCompareOperator )
            // InternalKVis.g:3042:1: ruleCompareOperator
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
    // InternalKVis.g:3051:1: rule__Comparison__RightSideAssignment_2 : ( ruleOperand ) ;
    public final void rule__Comparison__RightSideAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3055:1: ( ( ruleOperand ) )
            // InternalKVis.g:3056:1: ( ruleOperand )
            {
            // InternalKVis.g:3056:1: ( ruleOperand )
            // InternalKVis.g:3057:1: ruleOperand
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
    // InternalKVis.g:3066:1: rule__Operand__VariableAssignment_0 : ( ruleVariableReference ) ;
    public final void rule__Operand__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3070:1: ( ( ruleVariableReference ) )
            // InternalKVis.g:3071:1: ( ruleVariableReference )
            {
            // InternalKVis.g:3071:1: ( ruleVariableReference )
            // InternalKVis.g:3072:1: ruleVariableReference
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
    // InternalKVis.g:3081:1: rule__Operand__LiteralAssignment_1 : ( ruleLiteral ) ;
    public final void rule__Operand__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3085:1: ( ( ruleLiteral ) )
            // InternalKVis.g:3086:1: ( ruleLiteral )
            {
            // InternalKVis.g:3086:1: ( ruleLiteral )
            // InternalKVis.g:3087:1: ruleLiteral
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000003E0000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000080L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000300002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000FC000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000000000F0L});
    }


}