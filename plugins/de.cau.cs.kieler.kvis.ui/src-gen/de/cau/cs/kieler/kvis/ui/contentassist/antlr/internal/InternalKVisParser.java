package de.cau.cs.kieler.kvis.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.kvis.services.KVisGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKVisParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_HOSTCODE", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'pre'", "'|'", "'&'", "'!'", "'+'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'()'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'image'", "':'", "'animate'", "'{'", "'}'", "'apply'", "'using'", "'when'", "','", "'is'", "'('", "')'", "'['", "']'", "'.'", "'@'", "'#'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=5;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__51=51;
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


    // $ANTLR start "entryRuleRange"
    // InternalKVis.g:257:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalKVis.g:258:1: ( ruleRange EOF )
            // InternalKVis.g:259:1: ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeRule()); 
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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalKVis.g:266:1: ruleRange : ( '-' ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:270:2: ( ( '-' ) )
            // InternalKVis.g:271:1: ( '-' )
            {
            // InternalKVis.g:271:1: ( '-' )
            // InternalKVis.g:272:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getHyphenMinusKeyword()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getHyphenMinusKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleAttributeDomain"
    // InternalKVis.g:287:1: entryRuleAttributeDomain : ruleAttributeDomain EOF ;
    public final void entryRuleAttributeDomain() throws RecognitionException {
        try {
            // InternalKVis.g:288:1: ( ruleAttributeDomain EOF )
            // InternalKVis.g:289:1: ruleAttributeDomain EOF
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
    // InternalKVis.g:296:1: ruleAttributeDomain : ( ruleVariableDomain ) ;
    public final void ruleAttributeDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:300:2: ( ( ruleVariableDomain ) )
            // InternalKVis.g:301:1: ( ruleVariableDomain )
            {
            // InternalKVis.g:301:1: ( ruleVariableDomain )
            // InternalKVis.g:302:1: ruleVariableDomain
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


    // $ANTLR start "entryRuleVariableReference"
    // InternalKVis.g:315:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // InternalKVis.g:316:1: ( ruleVariableReference EOF )
            // InternalKVis.g:317:1: ruleVariableReference EOF
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
    // InternalKVis.g:324:1: ruleVariableReference : ( ( rule__VariableReference__Group__0 ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:328:2: ( ( ( rule__VariableReference__Group__0 ) ) )
            // InternalKVis.g:329:1: ( ( rule__VariableReference__Group__0 ) )
            {
            // InternalKVis.g:329:1: ( ( rule__VariableReference__Group__0 ) )
            // InternalKVis.g:330:1: ( rule__VariableReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup()); 
            }
            // InternalKVis.g:331:1: ( rule__VariableReference__Group__0 )
            // InternalKVis.g:331:2: rule__VariableReference__Group__0
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
    // InternalKVis.g:343:1: entryRuleModelReference : ruleModelReference EOF ;
    public final void entryRuleModelReference() throws RecognitionException {
        try {
            // InternalKVis.g:344:1: ( ruleModelReference EOF )
            // InternalKVis.g:345:1: ruleModelReference EOF
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
    // InternalKVis.g:352:1: ruleModelReference : ( ( rule__ModelReference__Group__0 ) ) ;
    public final void ruleModelReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:356:2: ( ( ( rule__ModelReference__Group__0 ) ) )
            // InternalKVis.g:357:1: ( ( rule__ModelReference__Group__0 ) )
            {
            // InternalKVis.g:357:1: ( ( rule__ModelReference__Group__0 ) )
            // InternalKVis.g:358:1: ( rule__ModelReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getGroup()); 
            }
            // InternalKVis.g:359:1: ( rule__ModelReference__Group__0 )
            // InternalKVis.g:359:2: rule__ModelReference__Group__0
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


    // $ANTLR start "entryRuleLiteral"
    // InternalKVis.g:371:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalKVis.g:372:1: ( ruleLiteral EOF )
            // InternalKVis.g:373:1: ruleLiteral EOF
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
    // InternalKVis.g:380:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:384:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalKVis.g:385:1: ( ( rule__Literal__Alternatives ) )
            {
            // InternalKVis.g:385:1: ( ( rule__Literal__Alternatives ) )
            // InternalKVis.g:386:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalKVis.g:387:1: ( rule__Literal__Alternatives )
            // InternalKVis.g:387:2: rule__Literal__Alternatives
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


    // $ANTLR start "entryRuleExpression"
    // InternalKVis.g:401:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalKVis.g:402:1: ( ruleExpression EOF )
            // InternalKVis.g:403:1: ruleExpression EOF
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
    // InternalKVis.g:410:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:414:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalKVis.g:415:1: ( ( rule__Expression__Alternatives ) )
            {
            // InternalKVis.g:415:1: ( ( rule__Expression__Alternatives ) )
            // InternalKVis.g:416:1: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalKVis.g:417:1: ( rule__Expression__Alternatives )
            // InternalKVis.g:417:2: rule__Expression__Alternatives
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
    // InternalKVis.g:429:1: entryRuleBoolExpression : ruleBoolExpression EOF ;
    public final void entryRuleBoolExpression() throws RecognitionException {
        try {
            // InternalKVis.g:430:1: ( ruleBoolExpression EOF )
            // InternalKVis.g:431:1: ruleBoolExpression EOF
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
    // InternalKVis.g:438:1: ruleBoolExpression : ( ruleLogicalOrExpression ) ;
    public final void ruleBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:442:2: ( ( ruleLogicalOrExpression ) )
            // InternalKVis.g:443:1: ( ruleLogicalOrExpression )
            {
            // InternalKVis.g:443:1: ( ruleLogicalOrExpression )
            // InternalKVis.g:444:1: ruleLogicalOrExpression
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
    // InternalKVis.g:457:1: entryRuleLogicalOrExpression : ruleLogicalOrExpression EOF ;
    public final void entryRuleLogicalOrExpression() throws RecognitionException {
        try {
            // InternalKVis.g:458:1: ( ruleLogicalOrExpression EOF )
            // InternalKVis.g:459:1: ruleLogicalOrExpression EOF
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
    // InternalKVis.g:466:1: ruleLogicalOrExpression : ( ( rule__LogicalOrExpression__Group__0 ) ) ;
    public final void ruleLogicalOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:470:2: ( ( ( rule__LogicalOrExpression__Group__0 ) ) )
            // InternalKVis.g:471:1: ( ( rule__LogicalOrExpression__Group__0 ) )
            {
            // InternalKVis.g:471:1: ( ( rule__LogicalOrExpression__Group__0 ) )
            // InternalKVis.g:472:1: ( rule__LogicalOrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup()); 
            }
            // InternalKVis.g:473:1: ( rule__LogicalOrExpression__Group__0 )
            // InternalKVis.g:473:2: rule__LogicalOrExpression__Group__0
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
    // InternalKVis.g:485:1: entryRuleLogicalAndExpression : ruleLogicalAndExpression EOF ;
    public final void entryRuleLogicalAndExpression() throws RecognitionException {
        try {
            // InternalKVis.g:486:1: ( ruleLogicalAndExpression EOF )
            // InternalKVis.g:487:1: ruleLogicalAndExpression EOF
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
    // InternalKVis.g:494:1: ruleLogicalAndExpression : ( ( rule__LogicalAndExpression__Group__0 ) ) ;
    public final void ruleLogicalAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:498:2: ( ( ( rule__LogicalAndExpression__Group__0 ) ) )
            // InternalKVis.g:499:1: ( ( rule__LogicalAndExpression__Group__0 ) )
            {
            // InternalKVis.g:499:1: ( ( rule__LogicalAndExpression__Group__0 ) )
            // InternalKVis.g:500:1: ( rule__LogicalAndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup()); 
            }
            // InternalKVis.g:501:1: ( rule__LogicalAndExpression__Group__0 )
            // InternalKVis.g:501:2: rule__LogicalAndExpression__Group__0
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
    // InternalKVis.g:513:1: entryRuleBitwiseOrExpression : ruleBitwiseOrExpression EOF ;
    public final void entryRuleBitwiseOrExpression() throws RecognitionException {
        try {
            // InternalKVis.g:514:1: ( ruleBitwiseOrExpression EOF )
            // InternalKVis.g:515:1: ruleBitwiseOrExpression EOF
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
    // InternalKVis.g:522:1: ruleBitwiseOrExpression : ( ( rule__BitwiseOrExpression__Group__0 ) ) ;
    public final void ruleBitwiseOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:526:2: ( ( ( rule__BitwiseOrExpression__Group__0 ) ) )
            // InternalKVis.g:527:1: ( ( rule__BitwiseOrExpression__Group__0 ) )
            {
            // InternalKVis.g:527:1: ( ( rule__BitwiseOrExpression__Group__0 ) )
            // InternalKVis.g:528:1: ( rule__BitwiseOrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup()); 
            }
            // InternalKVis.g:529:1: ( rule__BitwiseOrExpression__Group__0 )
            // InternalKVis.g:529:2: rule__BitwiseOrExpression__Group__0
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
    // InternalKVis.g:541:1: entryRuleBitwiseAndExpression : ruleBitwiseAndExpression EOF ;
    public final void entryRuleBitwiseAndExpression() throws RecognitionException {
        try {
            // InternalKVis.g:542:1: ( ruleBitwiseAndExpression EOF )
            // InternalKVis.g:543:1: ruleBitwiseAndExpression EOF
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
    // InternalKVis.g:550:1: ruleBitwiseAndExpression : ( ( rule__BitwiseAndExpression__Group__0 ) ) ;
    public final void ruleBitwiseAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:554:2: ( ( ( rule__BitwiseAndExpression__Group__0 ) ) )
            // InternalKVis.g:555:1: ( ( rule__BitwiseAndExpression__Group__0 ) )
            {
            // InternalKVis.g:555:1: ( ( rule__BitwiseAndExpression__Group__0 ) )
            // InternalKVis.g:556:1: ( rule__BitwiseAndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup()); 
            }
            // InternalKVis.g:557:1: ( rule__BitwiseAndExpression__Group__0 )
            // InternalKVis.g:557:2: rule__BitwiseAndExpression__Group__0
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
    // InternalKVis.g:569:1: entryRuleCompareOperation : ruleCompareOperation EOF ;
    public final void entryRuleCompareOperation() throws RecognitionException {
        try {
            // InternalKVis.g:570:1: ( ruleCompareOperation EOF )
            // InternalKVis.g:571:1: ruleCompareOperation EOF
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
    // InternalKVis.g:578:1: ruleCompareOperation : ( ( rule__CompareOperation__Group__0 ) ) ;
    public final void ruleCompareOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:582:2: ( ( ( rule__CompareOperation__Group__0 ) ) )
            // InternalKVis.g:583:1: ( ( rule__CompareOperation__Group__0 ) )
            {
            // InternalKVis.g:583:1: ( ( rule__CompareOperation__Group__0 ) )
            // InternalKVis.g:584:1: ( rule__CompareOperation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup()); 
            }
            // InternalKVis.g:585:1: ( rule__CompareOperation__Group__0 )
            // InternalKVis.g:585:2: rule__CompareOperation__Group__0
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
    // InternalKVis.g:597:1: entryRuleNotOrValuedExpression : ruleNotOrValuedExpression EOF ;
    public final void entryRuleNotOrValuedExpression() throws RecognitionException {
        try {
            // InternalKVis.g:598:1: ( ruleNotOrValuedExpression EOF )
            // InternalKVis.g:599:1: ruleNotOrValuedExpression EOF
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
    // InternalKVis.g:606:1: ruleNotOrValuedExpression : ( ( rule__NotOrValuedExpression__Alternatives ) ) ;
    public final void ruleNotOrValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:610:2: ( ( ( rule__NotOrValuedExpression__Alternatives ) ) )
            // InternalKVis.g:611:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            {
            // InternalKVis.g:611:1: ( ( rule__NotOrValuedExpression__Alternatives ) )
            // InternalKVis.g:612:1: ( rule__NotOrValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOrValuedExpressionAccess().getAlternatives()); 
            }
            // InternalKVis.g:613:1: ( rule__NotOrValuedExpression__Alternatives )
            // InternalKVis.g:613:2: rule__NotOrValuedExpression__Alternatives
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
    // InternalKVis.g:625:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // InternalKVis.g:626:1: ( ruleNotExpression EOF )
            // InternalKVis.g:627:1: ruleNotExpression EOF
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
    // InternalKVis.g:634:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:638:2: ( ( ( rule__NotExpression__Alternatives ) ) )
            // InternalKVis.g:639:1: ( ( rule__NotExpression__Alternatives ) )
            {
            // InternalKVis.g:639:1: ( ( rule__NotExpression__Alternatives ) )
            // InternalKVis.g:640:1: ( rule__NotExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            }
            // InternalKVis.g:641:1: ( rule__NotExpression__Alternatives )
            // InternalKVis.g:641:2: rule__NotExpression__Alternatives
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
    // InternalKVis.g:653:1: entryRuleValuedExpression : ruleValuedExpression EOF ;
    public final void entryRuleValuedExpression() throws RecognitionException {
        try {
            // InternalKVis.g:654:1: ( ruleValuedExpression EOF )
            // InternalKVis.g:655:1: ruleValuedExpression EOF
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
    // InternalKVis.g:662:1: ruleValuedExpression : ( ruleAddExpression ) ;
    public final void ruleValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:666:2: ( ( ruleAddExpression ) )
            // InternalKVis.g:667:1: ( ruleAddExpression )
            {
            // InternalKVis.g:667:1: ( ruleAddExpression )
            // InternalKVis.g:668:1: ruleAddExpression
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
    // InternalKVis.g:681:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // InternalKVis.g:682:1: ( ruleAddExpression EOF )
            // InternalKVis.g:683:1: ruleAddExpression EOF
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
    // InternalKVis.g:690:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:694:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // InternalKVis.g:695:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // InternalKVis.g:695:1: ( ( rule__AddExpression__Group__0 ) )
            // InternalKVis.g:696:1: ( rule__AddExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup()); 
            }
            // InternalKVis.g:697:1: ( rule__AddExpression__Group__0 )
            // InternalKVis.g:697:2: rule__AddExpression__Group__0
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
    // InternalKVis.g:709:1: entryRuleSubExpression : ruleSubExpression EOF ;
    public final void entryRuleSubExpression() throws RecognitionException {
        try {
            // InternalKVis.g:710:1: ( ruleSubExpression EOF )
            // InternalKVis.g:711:1: ruleSubExpression EOF
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
    // InternalKVis.g:718:1: ruleSubExpression : ( ( rule__SubExpression__Group__0 ) ) ;
    public final void ruleSubExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:722:2: ( ( ( rule__SubExpression__Group__0 ) ) )
            // InternalKVis.g:723:1: ( ( rule__SubExpression__Group__0 ) )
            {
            // InternalKVis.g:723:1: ( ( rule__SubExpression__Group__0 ) )
            // InternalKVis.g:724:1: ( rule__SubExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup()); 
            }
            // InternalKVis.g:725:1: ( rule__SubExpression__Group__0 )
            // InternalKVis.g:725:2: rule__SubExpression__Group__0
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
    // InternalKVis.g:737:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // InternalKVis.g:738:1: ( ruleMultExpression EOF )
            // InternalKVis.g:739:1: ruleMultExpression EOF
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
    // InternalKVis.g:746:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:750:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // InternalKVis.g:751:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // InternalKVis.g:751:1: ( ( rule__MultExpression__Group__0 ) )
            // InternalKVis.g:752:1: ( rule__MultExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup()); 
            }
            // InternalKVis.g:753:1: ( rule__MultExpression__Group__0 )
            // InternalKVis.g:753:2: rule__MultExpression__Group__0
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
    // InternalKVis.g:765:1: entryRuleDivExpression : ruleDivExpression EOF ;
    public final void entryRuleDivExpression() throws RecognitionException {
        try {
            // InternalKVis.g:766:1: ( ruleDivExpression EOF )
            // InternalKVis.g:767:1: ruleDivExpression EOF
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
    // InternalKVis.g:774:1: ruleDivExpression : ( ( rule__DivExpression__Group__0 ) ) ;
    public final void ruleDivExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:778:2: ( ( ( rule__DivExpression__Group__0 ) ) )
            // InternalKVis.g:779:1: ( ( rule__DivExpression__Group__0 ) )
            {
            // InternalKVis.g:779:1: ( ( rule__DivExpression__Group__0 ) )
            // InternalKVis.g:780:1: ( rule__DivExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup()); 
            }
            // InternalKVis.g:781:1: ( rule__DivExpression__Group__0 )
            // InternalKVis.g:781:2: rule__DivExpression__Group__0
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
    // InternalKVis.g:793:1: entryRuleModExpression : ruleModExpression EOF ;
    public final void entryRuleModExpression() throws RecognitionException {
        try {
            // InternalKVis.g:794:1: ( ruleModExpression EOF )
            // InternalKVis.g:795:1: ruleModExpression EOF
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
    // InternalKVis.g:802:1: ruleModExpression : ( ( rule__ModExpression__Group__0 ) ) ;
    public final void ruleModExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:806:2: ( ( ( rule__ModExpression__Group__0 ) ) )
            // InternalKVis.g:807:1: ( ( rule__ModExpression__Group__0 ) )
            {
            // InternalKVis.g:807:1: ( ( rule__ModExpression__Group__0 ) )
            // InternalKVis.g:808:1: ( rule__ModExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup()); 
            }
            // InternalKVis.g:809:1: ( rule__ModExpression__Group__0 )
            // InternalKVis.g:809:2: rule__ModExpression__Group__0
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
    // InternalKVis.g:821:1: entryRuleNegExpression : ruleNegExpression EOF ;
    public final void entryRuleNegExpression() throws RecognitionException {
        try {
            // InternalKVis.g:822:1: ( ruleNegExpression EOF )
            // InternalKVis.g:823:1: ruleNegExpression EOF
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
    // InternalKVis.g:830:1: ruleNegExpression : ( ( rule__NegExpression__Alternatives ) ) ;
    public final void ruleNegExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:834:2: ( ( ( rule__NegExpression__Alternatives ) ) )
            // InternalKVis.g:835:1: ( ( rule__NegExpression__Alternatives ) )
            {
            // InternalKVis.g:835:1: ( ( rule__NegExpression__Alternatives ) )
            // InternalKVis.g:836:1: ( rule__NegExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getAlternatives()); 
            }
            // InternalKVis.g:837:1: ( rule__NegExpression__Alternatives )
            // InternalKVis.g:837:2: rule__NegExpression__Alternatives
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
    // InternalKVis.g:849:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalKVis.g:850:1: ( ruleAtomicExpression EOF )
            // InternalKVis.g:851:1: ruleAtomicExpression EOF
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
    // InternalKVis.g:858:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:862:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalKVis.g:863:1: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalKVis.g:863:1: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalKVis.g:864:1: ( rule__AtomicExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            }
            // InternalKVis.g:865:1: ( rule__AtomicExpression__Alternatives )
            // InternalKVis.g:865:2: rule__AtomicExpression__Alternatives
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
    // InternalKVis.g:877:1: entryRuleAtomicValuedExpression : ruleAtomicValuedExpression EOF ;
    public final void entryRuleAtomicValuedExpression() throws RecognitionException {
        try {
            // InternalKVis.g:878:1: ( ruleAtomicValuedExpression EOF )
            // InternalKVis.g:879:1: ruleAtomicValuedExpression EOF
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
    // InternalKVis.g:886:1: ruleAtomicValuedExpression : ( ( rule__AtomicValuedExpression__Alternatives ) ) ;
    public final void ruleAtomicValuedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:890:2: ( ( ( rule__AtomicValuedExpression__Alternatives ) ) )
            // InternalKVis.g:891:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            {
            // InternalKVis.g:891:1: ( ( rule__AtomicValuedExpression__Alternatives ) )
            // InternalKVis.g:892:1: ( rule__AtomicValuedExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getAlternatives()); 
            }
            // InternalKVis.g:893:1: ( rule__AtomicValuedExpression__Alternatives )
            // InternalKVis.g:893:2: rule__AtomicValuedExpression__Alternatives
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
    // InternalKVis.g:905:1: entryRuleValuedObjectTestExpression : ruleValuedObjectTestExpression EOF ;
    public final void entryRuleValuedObjectTestExpression() throws RecognitionException {
        try {
            // InternalKVis.g:906:1: ( ruleValuedObjectTestExpression EOF )
            // InternalKVis.g:907:1: ruleValuedObjectTestExpression EOF
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
    // InternalKVis.g:914:1: ruleValuedObjectTestExpression : ( ( rule__ValuedObjectTestExpression__Alternatives ) ) ;
    public final void ruleValuedObjectTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:918:2: ( ( ( rule__ValuedObjectTestExpression__Alternatives ) ) )
            // InternalKVis.g:919:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            {
            // InternalKVis.g:919:1: ( ( rule__ValuedObjectTestExpression__Alternatives ) )
            // InternalKVis.g:920:1: ( rule__ValuedObjectTestExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getAlternatives()); 
            }
            // InternalKVis.g:921:1: ( rule__ValuedObjectTestExpression__Alternatives )
            // InternalKVis.g:921:2: rule__ValuedObjectTestExpression__Alternatives
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
    // InternalKVis.g:933:1: entryRuleValuedObjectReference : ruleValuedObjectReference EOF ;
    public final void entryRuleValuedObjectReference() throws RecognitionException {
        try {
            // InternalKVis.g:934:1: ( ruleValuedObjectReference EOF )
            // InternalKVis.g:935:1: ruleValuedObjectReference EOF
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
    // InternalKVis.g:942:1: ruleValuedObjectReference : ( ( rule__ValuedObjectReference__Group__0 ) ) ;
    public final void ruleValuedObjectReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:946:2: ( ( ( rule__ValuedObjectReference__Group__0 ) ) )
            // InternalKVis.g:947:1: ( ( rule__ValuedObjectReference__Group__0 ) )
            {
            // InternalKVis.g:947:1: ( ( rule__ValuedObjectReference__Group__0 ) )
            // InternalKVis.g:948:1: ( rule__ValuedObjectReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getGroup()); 
            }
            // InternalKVis.g:949:1: ( rule__ValuedObjectReference__Group__0 )
            // InternalKVis.g:949:2: rule__ValuedObjectReference__Group__0
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
    // InternalKVis.g:961:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalKVis.g:962:1: ( ruleFunctionCall EOF )
            // InternalKVis.g:963:1: ruleFunctionCall EOF
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
    // InternalKVis.g:970:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:974:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalKVis.g:975:1: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalKVis.g:975:1: ( ( rule__FunctionCall__Group__0 ) )
            // InternalKVis.g:976:1: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // InternalKVis.g:977:1: ( rule__FunctionCall__Group__0 )
            // InternalKVis.g:977:2: rule__FunctionCall__Group__0
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
    // InternalKVis.g:989:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalKVis.g:990:1: ( ruleParameter EOF )
            // InternalKVis.g:991:1: ruleParameter EOF
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
    // InternalKVis.g:998:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1002:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalKVis.g:1003:1: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalKVis.g:1003:1: ( ( rule__Parameter__Group__0 ) )
            // InternalKVis.g:1004:1: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalKVis.g:1005:1: ( rule__Parameter__Group__0 )
            // InternalKVis.g:1005:2: rule__Parameter__Group__0
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
    // InternalKVis.g:1017:1: entryRuleTextExpression : ruleTextExpression EOF ;
    public final void entryRuleTextExpression() throws RecognitionException {
        try {
            // InternalKVis.g:1018:1: ( ruleTextExpression EOF )
            // InternalKVis.g:1019:1: ruleTextExpression EOF
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
    // InternalKVis.g:1026:1: ruleTextExpression : ( ( rule__TextExpression__TextAssignment ) ) ;
    public final void ruleTextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1030:2: ( ( ( rule__TextExpression__TextAssignment ) ) )
            // InternalKVis.g:1031:1: ( ( rule__TextExpression__TextAssignment ) )
            {
            // InternalKVis.g:1031:1: ( ( rule__TextExpression__TextAssignment ) )
            // InternalKVis.g:1032:1: ( rule__TextExpression__TextAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextExpressionAccess().getTextAssignment()); 
            }
            // InternalKVis.g:1033:1: ( rule__TextExpression__TextAssignment )
            // InternalKVis.g:1033:2: rule__TextExpression__TextAssignment
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
    // InternalKVis.g:1045:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalKVis.g:1046:1: ( ruleIntValue EOF )
            // InternalKVis.g:1047:1: ruleIntValue EOF
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
    // InternalKVis.g:1054:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1058:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalKVis.g:1059:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalKVis.g:1059:1: ( ( rule__IntValue__ValueAssignment ) )
            // InternalKVis.g:1060:1: ( rule__IntValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // InternalKVis.g:1061:1: ( rule__IntValue__ValueAssignment )
            // InternalKVis.g:1061:2: rule__IntValue__ValueAssignment
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
    // InternalKVis.g:1073:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // InternalKVis.g:1074:1: ( ruleFloatValue EOF )
            // InternalKVis.g:1075:1: ruleFloatValue EOF
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
    // InternalKVis.g:1082:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1086:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // InternalKVis.g:1087:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // InternalKVis.g:1087:1: ( ( rule__FloatValue__ValueAssignment ) )
            // InternalKVis.g:1088:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // InternalKVis.g:1089:1: ( rule__FloatValue__ValueAssignment )
            // InternalKVis.g:1089:2: rule__FloatValue__ValueAssignment
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
    // InternalKVis.g:1101:1: entryRuleBoolValue : ruleBoolValue EOF ;
    public final void entryRuleBoolValue() throws RecognitionException {
        try {
            // InternalKVis.g:1102:1: ( ruleBoolValue EOF )
            // InternalKVis.g:1103:1: ruleBoolValue EOF
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
    // InternalKVis.g:1110:1: ruleBoolValue : ( ( rule__BoolValue__ValueAssignment ) ) ;
    public final void ruleBoolValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1114:2: ( ( ( rule__BoolValue__ValueAssignment ) ) )
            // InternalKVis.g:1115:1: ( ( rule__BoolValue__ValueAssignment ) )
            {
            // InternalKVis.g:1115:1: ( ( rule__BoolValue__ValueAssignment ) )
            // InternalKVis.g:1116:1: ( rule__BoolValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoolValueAccess().getValueAssignment()); 
            }
            // InternalKVis.g:1117:1: ( rule__BoolValue__ValueAssignment )
            // InternalKVis.g:1117:2: rule__BoolValue__ValueAssignment
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
    // InternalKVis.g:1129:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalKVis.g:1130:1: ( ruleStringValue EOF )
            // InternalKVis.g:1131:1: ruleStringValue EOF
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
    // InternalKVis.g:1138:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1142:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalKVis.g:1143:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalKVis.g:1143:1: ( ( rule__StringValue__ValueAssignment ) )
            // InternalKVis.g:1144:1: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // InternalKVis.g:1145:1: ( rule__StringValue__ValueAssignment )
            // InternalKVis.g:1145:2: rule__StringValue__ValueAssignment
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


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalKVis.g:1167:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // InternalKVis.g:1168:1: ( ruleCommentAnnotation EOF )
            // InternalKVis.g:1169:1: ruleCommentAnnotation EOF
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
    // InternalKVis.g:1176:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValuesAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1180:2: ( ( ( rule__CommentAnnotation__ValuesAssignment ) ) )
            // InternalKVis.g:1181:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            {
            // InternalKVis.g:1181:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            // InternalKVis.g:1182:1: ( rule__CommentAnnotation__ValuesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            }
            // InternalKVis.g:1183:1: ( rule__CommentAnnotation__ValuesAssignment )
            // InternalKVis.g:1183:2: rule__CommentAnnotation__ValuesAssignment
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
    // InternalKVis.g:1195:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // InternalKVis.g:1196:1: ( ruleTagAnnotation EOF )
            // InternalKVis.g:1197:1: ruleTagAnnotation EOF
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
    // InternalKVis.g:1204:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1208:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // InternalKVis.g:1209:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // InternalKVis.g:1209:1: ( ( rule__TagAnnotation__Group__0 ) )
            // InternalKVis.g:1210:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // InternalKVis.g:1211:1: ( rule__TagAnnotation__Group__0 )
            // InternalKVis.g:1211:2: rule__TagAnnotation__Group__0
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
    // InternalKVis.g:1223:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKVis.g:1224:1: ( ruleKeyStringValueAnnotation EOF )
            // InternalKVis.g:1225:1: ruleKeyStringValueAnnotation EOF
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
    // InternalKVis.g:1232:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1236:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // InternalKVis.g:1237:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKVis.g:1237:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // InternalKVis.g:1238:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKVis.g:1239:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // InternalKVis.g:1239:2: rule__KeyStringValueAnnotation__Group__0
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


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalKVis.g:1251:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKVis.g:1252:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // InternalKVis.g:1253:1: ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKVis.g:1260:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1264:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKVis.g:1265:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKVis.g:1265:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKVis.g:1266:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKVis.g:1267:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // InternalKVis.g:1267:2: rule__TypedKeyStringValueAnnotation__Group__0
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


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalKVis.g:1279:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKVis.g:1280:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKVis.g:1281:1: ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKVis.g:1288:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1292:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKVis.g:1293:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKVis.g:1293:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // InternalKVis.g:1294:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKVis.g:1295:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // InternalKVis.g:1295:2: rule__QuotedKeyStringValueAnnotation__Group__0
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
    // InternalKVis.g:1307:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKVis.g:1308:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKVis.g:1309:1: ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKVis.g:1316:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1320:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKVis.g:1321:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKVis.g:1321:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKVis.g:1322:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKVis.g:1323:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKVis.g:1323:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0
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


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // InternalKVis.g:1335:1: entryRuleKeyBooleanValueAnnotation : ruleKeyBooleanValueAnnotation EOF ;
    public final void entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        try {
            // InternalKVis.g:1336:1: ( ruleKeyBooleanValueAnnotation EOF )
            // InternalKVis.g:1337:1: ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationRule()); 
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
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // InternalKVis.g:1344:1: ruleKeyBooleanValueAnnotation : ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyBooleanValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1348:2: ( ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) )
            // InternalKVis.g:1349:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            {
            // InternalKVis.g:1349:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            // InternalKVis.g:1350:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            }
            // InternalKVis.g:1351:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            // InternalKVis.g:1351:2: rule__KeyBooleanValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:1363:1: entryRuleKeyIntValueAnnotation : ruleKeyIntValueAnnotation EOF ;
    public final void entryRuleKeyIntValueAnnotation() throws RecognitionException {
        try {
            // InternalKVis.g:1364:1: ( ruleKeyIntValueAnnotation EOF )
            // InternalKVis.g:1365:1: ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationRule()); 
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
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // InternalKVis.g:1372:1: ruleKeyIntValueAnnotation : ( ( rule__KeyIntValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyIntValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1376:2: ( ( ( rule__KeyIntValueAnnotation__Group__0 ) ) )
            // InternalKVis.g:1377:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            {
            // InternalKVis.g:1377:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            // InternalKVis.g:1378:1: ( rule__KeyIntValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            }
            // InternalKVis.g:1379:1: ( rule__KeyIntValueAnnotation__Group__0 )
            // InternalKVis.g:1379:2: rule__KeyIntValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:1391:1: entryRuleKeyFloatValueAnnotation : ruleKeyFloatValueAnnotation EOF ;
    public final void entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        try {
            // InternalKVis.g:1392:1: ( ruleKeyFloatValueAnnotation EOF )
            // InternalKVis.g:1393:1: ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationRule()); 
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
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // InternalKVis.g:1400:1: ruleKeyFloatValueAnnotation : ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyFloatValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1404:2: ( ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) )
            // InternalKVis.g:1405:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            {
            // InternalKVis.g:1405:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            // InternalKVis.g:1406:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            }
            // InternalKVis.g:1407:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            // InternalKVis.g:1407:2: rule__KeyFloatValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:1419:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKVis.g:1420:1: ( ruleEString EOF )
            // InternalKVis.g:1421:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalKVis.g:1428:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1432:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalKVis.g:1433:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalKVis.g:1433:1: ( ( rule__EString__Alternatives ) )
            // InternalKVis.g:1434:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalKVis.g:1435:1: ( rule__EString__Alternatives )
            // InternalKVis.g:1435:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalKVis.g:1447:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // InternalKVis.g:1448:1: ( ruleEStringBoolean EOF )
            // InternalKVis.g:1449:1: ruleEStringBoolean EOF
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
    // InternalKVis.g:1456:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1460:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // InternalKVis.g:1461:1: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // InternalKVis.g:1461:1: ( ( rule__EStringBoolean__Alternatives ) )
            // InternalKVis.g:1462:1: ( rule__EStringBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            }
            // InternalKVis.g:1463:1: ( rule__EStringBoolean__Alternatives )
            // InternalKVis.g:1463:2: rule__EStringBoolean__Alternatives
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


    // $ANTLR start "entryRuleExtendedID"
    // InternalKVis.g:1475:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // InternalKVis.g:1476:1: ( ruleExtendedID EOF )
            // InternalKVis.g:1477:1: ruleExtendedID EOF
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
    // InternalKVis.g:1484:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1488:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // InternalKVis.g:1489:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // InternalKVis.g:1489:1: ( ( rule__ExtendedID__Group__0 ) )
            // InternalKVis.g:1490:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // InternalKVis.g:1491:1: ( rule__ExtendedID__Group__0 )
            // InternalKVis.g:1491:2: rule__ExtendedID__Group__0
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
    // InternalKVis.g:1503:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalKVis.g:1504:1: ( ruleInteger EOF )
            // InternalKVis.g:1505:1: ruleInteger EOF
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
    // InternalKVis.g:1512:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1516:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalKVis.g:1517:1: ( ( rule__Integer__Group__0 ) )
            {
            // InternalKVis.g:1517:1: ( ( rule__Integer__Group__0 ) )
            // InternalKVis.g:1518:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // InternalKVis.g:1519:1: ( rule__Integer__Group__0 )
            // InternalKVis.g:1519:2: rule__Integer__Group__0
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
    // InternalKVis.g:1531:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // InternalKVis.g:1532:1: ( ruleFloateger EOF )
            // InternalKVis.g:1533:1: ruleFloateger EOF
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
    // InternalKVis.g:1540:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1544:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // InternalKVis.g:1545:1: ( ( rule__Floateger__Group__0 ) )
            {
            // InternalKVis.g:1545:1: ( ( rule__Floateger__Group__0 ) )
            // InternalKVis.g:1546:1: ( rule__Floateger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getGroup()); 
            }
            // InternalKVis.g:1547:1: ( rule__Floateger__Group__0 )
            // InternalKVis.g:1547:2: rule__Floateger__Group__0
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


    // $ANTLR start "ruleCompareOperator"
    // InternalKVis.g:1560:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1564:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalKVis.g:1565:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalKVis.g:1565:1: ( ( rule__CompareOperator__Alternatives ) )
            // InternalKVis.g:1566:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalKVis.g:1567:1: ( rule__CompareOperator__Alternatives )
            // InternalKVis.g:1567:2: rule__CompareOperator__Alternatives
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
    // InternalKVis.g:1579:1: rulePreOperator : ( ( 'pre' ) ) ;
    public final void rulePreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1583:1: ( ( ( 'pre' ) ) )
            // InternalKVis.g:1584:1: ( ( 'pre' ) )
            {
            // InternalKVis.g:1584:1: ( ( 'pre' ) )
            // InternalKVis.g:1585:1: ( 'pre' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration()); 
            }
            // InternalKVis.g:1586:1: ( 'pre' )
            // InternalKVis.g:1586:3: 'pre'
            {
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKVis.g:1599:1: ruleBitwiseOrOperator : ( ( '|' ) ) ;
    public final void ruleBitwiseOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1603:1: ( ( ( '|' ) ) )
            // InternalKVis.g:1604:1: ( ( '|' ) )
            {
            // InternalKVis.g:1604:1: ( ( '|' ) )
            // InternalKVis.g:1605:1: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration()); 
            }
            // InternalKVis.g:1606:1: ( '|' )
            // InternalKVis.g:1606:3: '|'
            {
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKVis.g:1619:1: ruleBitwiseAndOperator : ( ( '&' ) ) ;
    public final void ruleBitwiseAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1623:1: ( ( ( '&' ) ) )
            // InternalKVis.g:1624:1: ( ( '&' ) )
            {
            // InternalKVis.g:1624:1: ( ( '&' ) )
            // InternalKVis.g:1625:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration()); 
            }
            // InternalKVis.g:1626:1: ( '&' )
            // InternalKVis.g:1626:3: '&'
            {
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKVis.g:1639:1: ruleNotOperator : ( ( '!' ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1643:1: ( ( ( '!' ) ) )
            // InternalKVis.g:1644:1: ( ( '!' ) )
            {
            // InternalKVis.g:1644:1: ( ( '!' ) )
            // InternalKVis.g:1645:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            }
            // InternalKVis.g:1646:1: ( '!' )
            // InternalKVis.g:1646:3: '!'
            {
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKVis.g:1659:1: ruleAddOperator : ( ( '+' ) ) ;
    public final void ruleAddOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1663:1: ( ( ( '+' ) ) )
            // InternalKVis.g:1664:1: ( ( '+' ) )
            {
            // InternalKVis.g:1664:1: ( ( '+' ) )
            // InternalKVis.g:1665:1: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration()); 
            }
            // InternalKVis.g:1666:1: ( '+' )
            // InternalKVis.g:1666:3: '+'
            {
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKVis.g:1679:1: ruleSubOperator : ( ( '-' ) ) ;
    public final void ruleSubOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1683:1: ( ( ( '-' ) ) )
            // InternalKVis.g:1684:1: ( ( '-' ) )
            {
            // InternalKVis.g:1684:1: ( ( '-' ) )
            // InternalKVis.g:1685:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration()); 
            }
            // InternalKVis.g:1686:1: ( '-' )
            // InternalKVis.g:1686:3: '-'
            {
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKVis.g:1699:1: ruleMultOperator : ( ( '*' ) ) ;
    public final void ruleMultOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1703:1: ( ( ( '*' ) ) )
            // InternalKVis.g:1704:1: ( ( '*' ) )
            {
            // InternalKVis.g:1704:1: ( ( '*' ) )
            // InternalKVis.g:1705:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration()); 
            }
            // InternalKVis.g:1706:1: ( '*' )
            // InternalKVis.g:1706:3: '*'
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
    // InternalKVis.g:1719:1: ruleModOperator : ( ( '%' ) ) ;
    public final void ruleModOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1723:1: ( ( ( '%' ) ) )
            // InternalKVis.g:1724:1: ( ( '%' ) )
            {
            // InternalKVis.g:1724:1: ( ( '%' ) )
            // InternalKVis.g:1725:1: ( '%' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration()); 
            }
            // InternalKVis.g:1726:1: ( '%' )
            // InternalKVis.g:1726:3: '%'
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
    // InternalKVis.g:1739:1: ruleDivOperator : ( ( '/' ) ) ;
    public final void ruleDivOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1743:1: ( ( ( '/' ) ) )
            // InternalKVis.g:1744:1: ( ( '/' ) )
            {
            // InternalKVis.g:1744:1: ( ( '/' ) )
            // InternalKVis.g:1745:1: ( '/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration()); 
            }
            // InternalKVis.g:1746:1: ( '/' )
            // InternalKVis.g:1746:3: '/'
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
    // InternalKVis.g:1759:1: ruleValOperator : ( ( 'val' ) ) ;
    public final void ruleValOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1763:1: ( ( ( 'val' ) ) )
            // InternalKVis.g:1764:1: ( ( 'val' ) )
            {
            // InternalKVis.g:1764:1: ( ( 'val' ) )
            // InternalKVis.g:1765:1: ( 'val' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration()); 
            }
            // InternalKVis.g:1766:1: ( 'val' )
            // InternalKVis.g:1766:3: 'val'
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
    // InternalKVis.g:1779:1: ruleLogicalOrOperator : ( ( '||' ) ) ;
    public final void ruleLogicalOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1783:1: ( ( ( '||' ) ) )
            // InternalKVis.g:1784:1: ( ( '||' ) )
            {
            // InternalKVis.g:1784:1: ( ( '||' ) )
            // InternalKVis.g:1785:1: ( '||' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration()); 
            }
            // InternalKVis.g:1786:1: ( '||' )
            // InternalKVis.g:1786:3: '||'
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
    // InternalKVis.g:1799:1: ruleLogicalAndOperator : ( ( '&&' ) ) ;
    public final void ruleLogicalAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1803:1: ( ( ( '&&' ) ) )
            // InternalKVis.g:1804:1: ( ( '&&' ) )
            {
            // InternalKVis.g:1804:1: ( ( '&&' ) )
            // InternalKVis.g:1805:1: ( '&&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration()); 
            }
            // InternalKVis.g:1806:1: ( '&&' )
            // InternalKVis.g:1806:3: '&&'
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


    // $ANTLR start "rule__AttributeMapping__Alternatives_2"
    // InternalKVis.g:1828:1: rule__AttributeMapping__Alternatives_2 : ( ( ( rule__AttributeMapping__LiteralAssignment_2_0 ) ) | ( ( rule__AttributeMapping__Group_2_1__0 ) ) );
    public final void rule__AttributeMapping__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1832:1: ( ( ( rule__AttributeMapping__LiteralAssignment_2_0 ) ) | ( ( rule__AttributeMapping__Group_2_1__0 ) ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_FLOAT) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3==44) ) {
                        alt1=2;
                    }
                    else if ( (LA1_3==EOF||LA1_3==RULE_ID||LA1_3==39) ) {
                        alt1=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_1==RULE_INT) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==16||LA1_2==44) ) {
                        alt1=2;
                    }
                    else if ( (LA1_2==EOF||LA1_2==RULE_ID||LA1_2==39) ) {
                        alt1=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==16||LA1_2==44) ) {
                    alt1=2;
                }
                else if ( (LA1_2==EOF||LA1_2==RULE_ID||LA1_2==39) ) {
                    alt1=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==44) ) {
                    alt1=2;
                }
                else if ( (LA1_3==EOF||LA1_3==RULE_ID||LA1_3==39) ) {
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
            case RULE_STRING:
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4==44) ) {
                    alt1=2;
                }
                else if ( (LA1_4==EOF||LA1_4==RULE_ID||LA1_4==39) ) {
                    alt1=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA1_5 = input.LA(2);

                if ( (LA1_5==44) ) {
                    alt1=2;
                }
                else if ( (LA1_5==EOF||LA1_5==RULE_ID||LA1_5==39) ) {
                    alt1=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                alt1=2;
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
                    // InternalKVis.g:1833:1: ( ( rule__AttributeMapping__LiteralAssignment_2_0 ) )
                    {
                    // InternalKVis.g:1833:1: ( ( rule__AttributeMapping__LiteralAssignment_2_0 ) )
                    // InternalKVis.g:1834:1: ( rule__AttributeMapping__LiteralAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeMappingAccess().getLiteralAssignment_2_0()); 
                    }
                    // InternalKVis.g:1835:1: ( rule__AttributeMapping__LiteralAssignment_2_0 )
                    // InternalKVis.g:1835:2: rule__AttributeMapping__LiteralAssignment_2_0
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
                    // InternalKVis.g:1839:6: ( ( rule__AttributeMapping__Group_2_1__0 ) )
                    {
                    // InternalKVis.g:1839:6: ( ( rule__AttributeMapping__Group_2_1__0 ) )
                    // InternalKVis.g:1840:1: ( rule__AttributeMapping__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeMappingAccess().getGroup_2_1()); 
                    }
                    // InternalKVis.g:1841:1: ( rule__AttributeMapping__Group_2_1__0 )
                    // InternalKVis.g:1841:2: rule__AttributeMapping__Group_2_1__0
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
    // InternalKVis.g:1850:1: rule__VariableDomain__Alternatives : ( ( ( rule__VariableDomain__ValueAssignment_0 ) ) | ( ( rule__VariableDomain__RangeAssignment_1 ) ) );
    public final void rule__VariableDomain__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1854:1: ( ( ( rule__VariableDomain__ValueAssignment_0 ) ) | ( ( rule__VariableDomain__RangeAssignment_1 ) ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_FLOAT) ) {
                    alt2=1;
                }
                else if ( (LA2_1==RULE_INT) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==16) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==EOF||LA2_2==RULE_ID||LA2_2==39||(LA2_2>=43 && LA2_2<=44)) ) {
                        alt2=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==16) ) {
                    alt2=2;
                }
                else if ( (LA2_2==EOF||LA2_2==RULE_ID||LA2_2==39||(LA2_2>=43 && LA2_2<=44)) ) {
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
            case RULE_BOOLEAN:
            case RULE_FLOAT:
                {
                alt2=1;
                }
                break;
            case 45:
                {
                alt2=2;
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
                    // InternalKVis.g:1855:1: ( ( rule__VariableDomain__ValueAssignment_0 ) )
                    {
                    // InternalKVis.g:1855:1: ( ( rule__VariableDomain__ValueAssignment_0 ) )
                    // InternalKVis.g:1856:1: ( rule__VariableDomain__ValueAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableDomainAccess().getValueAssignment_0()); 
                    }
                    // InternalKVis.g:1857:1: ( rule__VariableDomain__ValueAssignment_0 )
                    // InternalKVis.g:1857:2: rule__VariableDomain__ValueAssignment_0
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
                    // InternalKVis.g:1861:6: ( ( rule__VariableDomain__RangeAssignment_1 ) )
                    {
                    // InternalKVis.g:1861:6: ( ( rule__VariableDomain__RangeAssignment_1 ) )
                    // InternalKVis.g:1862:1: ( rule__VariableDomain__RangeAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableDomainAccess().getRangeAssignment_1()); 
                    }
                    // InternalKVis.g:1863:1: ( rule__VariableDomain__RangeAssignment_1 )
                    // InternalKVis.g:1863:2: rule__VariableDomain__RangeAssignment_1
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


    // $ANTLR start "rule__Interval__Alternatives_0"
    // InternalKVis.g:1872:1: rule__Interval__Alternatives_0 : ( ( ( rule__Interval__FromAssignment_0_0 ) ) | ( ( rule__Interval__Group_0_1__0 ) ) );
    public final void rule__Interval__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1876:1: ( ( ( rule__Interval__FromAssignment_0_0 ) ) | ( ( rule__Interval__Group_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==45) ) {
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
                    // InternalKVis.g:1877:1: ( ( rule__Interval__FromAssignment_0_0 ) )
                    {
                    // InternalKVis.g:1877:1: ( ( rule__Interval__FromAssignment_0_0 ) )
                    // InternalKVis.g:1878:1: ( rule__Interval__FromAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntervalAccess().getFromAssignment_0_0()); 
                    }
                    // InternalKVis.g:1879:1: ( rule__Interval__FromAssignment_0_0 )
                    // InternalKVis.g:1879:2: rule__Interval__FromAssignment_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Interval__FromAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIntervalAccess().getFromAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:1883:6: ( ( rule__Interval__Group_0_1__0 ) )
                    {
                    // InternalKVis.g:1883:6: ( ( rule__Interval__Group_0_1__0 ) )
                    // InternalKVis.g:1884:1: ( rule__Interval__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntervalAccess().getGroup_0_1()); 
                    }
                    // InternalKVis.g:1885:1: ( rule__Interval__Group_0_1__0 )
                    // InternalKVis.g:1885:2: rule__Interval__Group_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Interval__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIntervalAccess().getGroup_0_1()); 
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
    // $ANTLR end "rule__Interval__Alternatives_0"


    // $ANTLR start "rule__Interval__Alternatives_2"
    // InternalKVis.g:1894:1: rule__Interval__Alternatives_2 : ( ( ( rule__Interval__ToAssignment_2_0 ) ) | ( ( rule__Interval__Group_2_1__0 ) ) );
    public final void rule__Interval__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1898:1: ( ( ( rule__Interval__ToAssignment_2_0 ) ) | ( ( rule__Interval__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==45) ) {
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
                    // InternalKVis.g:1899:1: ( ( rule__Interval__ToAssignment_2_0 ) )
                    {
                    // InternalKVis.g:1899:1: ( ( rule__Interval__ToAssignment_2_0 ) )
                    // InternalKVis.g:1900:1: ( rule__Interval__ToAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntervalAccess().getToAssignment_2_0()); 
                    }
                    // InternalKVis.g:1901:1: ( rule__Interval__ToAssignment_2_0 )
                    // InternalKVis.g:1901:2: rule__Interval__ToAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Interval__ToAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIntervalAccess().getToAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:1905:6: ( ( rule__Interval__Group_2_1__0 ) )
                    {
                    // InternalKVis.g:1905:6: ( ( rule__Interval__Group_2_1__0 ) )
                    // InternalKVis.g:1906:1: ( rule__Interval__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntervalAccess().getGroup_2_1()); 
                    }
                    // InternalKVis.g:1907:1: ( rule__Interval__Group_2_1__0 )
                    // InternalKVis.g:1907:2: rule__Interval__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Interval__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIntervalAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__Interval__Alternatives_2"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalKVis.g:1916:1: rule__Literal__Alternatives : ( ( ruleInteger ) | ( ruleFloateger ) | ( RULE_STRING ) | ( RULE_BOOLEAN ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1920:1: ( ( ruleInteger ) | ( ruleFloateger ) | ( RULE_STRING ) | ( RULE_BOOLEAN ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_FLOAT) ) {
                    alt5=2;
                }
                else if ( (LA5_1==RULE_INT) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
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
            case RULE_BOOLEAN:
                {
                alt5=4;
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
                    // InternalKVis.g:1921:1: ( ruleInteger )
                    {
                    // InternalKVis.g:1921:1: ( ruleInteger )
                    // InternalKVis.g:1922:1: ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getIntegerParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getIntegerParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:1927:6: ( ruleFloateger )
                    {
                    // InternalKVis.g:1927:6: ( ruleFloateger )
                    // InternalKVis.g:1928:1: ruleFloateger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFloategerParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFloateger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getFloategerParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKVis.g:1933:6: ( RULE_STRING )
                    {
                    // InternalKVis.g:1933:6: ( RULE_STRING )
                    // InternalKVis.g:1934:1: RULE_STRING
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
                case 4 :
                    // InternalKVis.g:1939:6: ( RULE_BOOLEAN )
                    {
                    // InternalKVis.g:1939:6: ( RULE_BOOLEAN )
                    // InternalKVis.g:1940:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_3()); 
                    }
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_3()); 
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


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalKVis.g:1950:1: rule__Expression__Alternatives : ( ( ruleBoolExpression ) | ( ruleValuedExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1954:1: ( ( ruleBoolExpression ) | ( ruleValuedExpression ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalKVis.g:1955:1: ( ruleBoolExpression )
                    {
                    // InternalKVis.g:1955:1: ( ruleBoolExpression )
                    // InternalKVis.g:1956:1: ruleBoolExpression
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
                    // InternalKVis.g:1961:6: ( ruleValuedExpression )
                    {
                    // InternalKVis.g:1961:6: ( ruleValuedExpression )
                    // InternalKVis.g:1962:1: ruleValuedExpression
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
    // InternalKVis.g:1972:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );
    public final void rule__NotOrValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1976:1: ( ( ruleValuedExpression ) | ( ruleNotExpression ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalKVis.g:1977:1: ( ruleValuedExpression )
                    {
                    // InternalKVis.g:1977:1: ( ruleValuedExpression )
                    // InternalKVis.g:1978:1: ruleValuedExpression
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
                    // InternalKVis.g:1983:6: ( ruleNotExpression )
                    {
                    // InternalKVis.g:1983:6: ( ruleNotExpression )
                    // InternalKVis.g:1984:1: ruleNotExpression
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
    // InternalKVis.g:1994:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:1998:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleAtomicExpression ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_BOOLEAN && LA8_0<=RULE_ID)||LA8_0==RULE_HOSTCODE||LA8_0==17||LA8_0==25||LA8_0==30||LA8_0==45) ) {
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
                    // InternalKVis.g:1999:1: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // InternalKVis.g:1999:1: ( ( rule__NotExpression__Group_0__0 ) )
                    // InternalKVis.g:2000:1: ( rule__NotExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    }
                    // InternalKVis.g:2001:1: ( rule__NotExpression__Group_0__0 )
                    // InternalKVis.g:2001:2: rule__NotExpression__Group_0__0
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
                    // InternalKVis.g:2005:6: ( ruleAtomicExpression )
                    {
                    // InternalKVis.g:2005:6: ( ruleAtomicExpression )
                    // InternalKVis.g:2006:1: ruleAtomicExpression
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
    // InternalKVis.g:2016:1: rule__NegExpression__Alternatives : ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) );
    public final void rule__NegExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2020:1: ( ( ( rule__NegExpression__Group_0__0 ) ) | ( ruleAtomicValuedExpression ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_HOSTCODE)||LA9_0==17||LA9_0==25||LA9_0==30||LA9_0==45) ) {
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
                    // InternalKVis.g:2021:1: ( ( rule__NegExpression__Group_0__0 ) )
                    {
                    // InternalKVis.g:2021:1: ( ( rule__NegExpression__Group_0__0 ) )
                    // InternalKVis.g:2022:1: ( rule__NegExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegExpressionAccess().getGroup_0()); 
                    }
                    // InternalKVis.g:2023:1: ( rule__NegExpression__Group_0__0 )
                    // InternalKVis.g:2023:2: rule__NegExpression__Group_0__0
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
                    // InternalKVis.g:2027:6: ( ruleAtomicValuedExpression )
                    {
                    // InternalKVis.g:2027:6: ( ruleAtomicValuedExpression )
                    // InternalKVis.g:2028:1: ruleAtomicValuedExpression
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
    // InternalKVis.g:2038:1: rule__AtomicExpression__Alternatives : ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleTextExpression ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2042:1: ( ( ruleBoolValue ) | ( ruleValuedObjectTestExpression ) | ( ( rule__AtomicExpression__Group_2__0 ) ) | ( ruleFunctionCall ) | ( ruleTextExpression ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
            case 17:
            case 25:
                {
                alt10=2;
                }
                break;
            case 45:
                {
                alt10=3;
                }
                break;
            case 30:
                {
                alt10=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalKVis.g:2043:1: ( ruleBoolValue )
                    {
                    // InternalKVis.g:2043:1: ( ruleBoolValue )
                    // InternalKVis.g:2044:1: ruleBoolValue
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
                    // InternalKVis.g:2049:6: ( ruleValuedObjectTestExpression )
                    {
                    // InternalKVis.g:2049:6: ( ruleValuedObjectTestExpression )
                    // InternalKVis.g:2050:1: ruleValuedObjectTestExpression
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
                    // InternalKVis.g:2055:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    {
                    // InternalKVis.g:2055:6: ( ( rule__AtomicExpression__Group_2__0 ) )
                    // InternalKVis.g:2056:1: ( rule__AtomicExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicExpressionAccess().getGroup_2()); 
                    }
                    // InternalKVis.g:2057:1: ( rule__AtomicExpression__Group_2__0 )
                    // InternalKVis.g:2057:2: rule__AtomicExpression__Group_2__0
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
                    // InternalKVis.g:2061:6: ( ruleFunctionCall )
                    {
                    // InternalKVis.g:2061:6: ( ruleFunctionCall )
                    // InternalKVis.g:2062:1: ruleFunctionCall
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
                    // InternalKVis.g:2067:6: ( ruleTextExpression )
                    {
                    // InternalKVis.g:2067:6: ( ruleTextExpression )
                    // InternalKVis.g:2068:1: ruleTextExpression
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
    // InternalKVis.g:2078:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );
    public final void rule__AtomicValuedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2082:1: ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) )
            int alt11=5;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalKVis.g:2083:1: ( ruleIntValue )
                    {
                    // InternalKVis.g:2083:1: ( ruleIntValue )
                    // InternalKVis.g:2084:1: ruleIntValue
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
                    // InternalKVis.g:2089:6: ( ruleFloatValue )
                    {
                    // InternalKVis.g:2089:6: ( ruleFloatValue )
                    // InternalKVis.g:2090:1: ruleFloatValue
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
                    // InternalKVis.g:2095:6: ( ruleStringValue )
                    {
                    // InternalKVis.g:2095:6: ( ruleStringValue )
                    // InternalKVis.g:2096:1: ruleStringValue
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
                    // InternalKVis.g:2101:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    {
                    // InternalKVis.g:2101:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
                    // InternalKVis.g:2102:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
                    }
                    // InternalKVis.g:2103:1: ( rule__AtomicValuedExpression__Group_3__0 )
                    // InternalKVis.g:2103:2: rule__AtomicValuedExpression__Group_3__0
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
                    // InternalKVis.g:2107:6: ( ruleAtomicExpression )
                    {
                    // InternalKVis.g:2107:6: ( ruleAtomicExpression )
                    // InternalKVis.g:2108:1: ruleAtomicExpression
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
    // InternalKVis.g:2118:1: rule__ValuedObjectTestExpression__Alternatives : ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) );
    public final void rule__ValuedObjectTestExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2122:1: ( ( ( rule__ValuedObjectTestExpression__Group_0__0 ) ) | ( ruleValuedObjectReference ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17||LA12_0==25) ) {
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
                    // InternalKVis.g:2123:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    {
                    // InternalKVis.g:2123:1: ( ( rule__ValuedObjectTestExpression__Group_0__0 ) )
                    // InternalKVis.g:2124:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuedObjectTestExpressionAccess().getGroup_0()); 
                    }
                    // InternalKVis.g:2125:1: ( rule__ValuedObjectTestExpression__Group_0__0 )
                    // InternalKVis.g:2125:2: rule__ValuedObjectTestExpression__Group_0__0
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
                    // InternalKVis.g:2129:6: ( ruleValuedObjectReference )
                    {
                    // InternalKVis.g:2129:6: ( ruleValuedObjectReference )
                    // InternalKVis.g:2130:1: ruleValuedObjectReference
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
    // InternalKVis.g:2140:1: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 : ( ( rulePreOperator ) | ( ruleValOperator ) );
    public final void rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2144:1: ( ( rulePreOperator ) | ( ruleValOperator ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            else if ( (LA13_0==25) ) {
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
                    // InternalKVis.g:2145:1: ( rulePreOperator )
                    {
                    // InternalKVis.g:2145:1: ( rulePreOperator )
                    // InternalKVis.g:2146:1: rulePreOperator
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
                    // InternalKVis.g:2151:6: ( ruleValOperator )
                    {
                    // InternalKVis.g:2151:6: ( ruleValOperator )
                    // InternalKVis.g:2152:1: ruleValOperator
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
    // InternalKVis.g:2162:1: rule__FunctionCall__Alternatives_2 : ( ( ( rule__FunctionCall__Group_2_0__0 ) ) | ( '()' ) );
    public final void rule__FunctionCall__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2166:1: ( ( ( rule__FunctionCall__Group_2_0__0 ) ) | ( '()' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==45) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
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
                    // InternalKVis.g:2167:1: ( ( rule__FunctionCall__Group_2_0__0 ) )
                    {
                    // InternalKVis.g:2167:1: ( ( rule__FunctionCall__Group_2_0__0 ) )
                    // InternalKVis.g:2168:1: ( rule__FunctionCall__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getGroup_2_0()); 
                    }
                    // InternalKVis.g:2169:1: ( rule__FunctionCall__Group_2_0__0 )
                    // InternalKVis.g:2169:2: rule__FunctionCall__Group_2_0__0
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
                    // InternalKVis.g:2173:6: ( '()' )
                    {
                    // InternalKVis.g:2173:6: ( '()' )
                    // InternalKVis.g:2174:1: '()'
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalKVis.g:2191:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2195:1: ( ( RULE_STRING ) | ( ruleExtendedID ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
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
                    // InternalKVis.g:2196:1: ( RULE_STRING )
                    {
                    // InternalKVis.g:2196:1: ( RULE_STRING )
                    // InternalKVis.g:2197:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:2202:6: ( ruleExtendedID )
                    {
                    // InternalKVis.g:2202:6: ( ruleExtendedID )
                    // InternalKVis.g:2203:1: ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
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


    // $ANTLR start "rule__EStringBoolean__Alternatives"
    // InternalKVis.g:2213:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2217:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt16=1;
                }
                break;
            case RULE_ID:
                {
                alt16=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt16=3;
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
                    // InternalKVis.g:2218:1: ( RULE_STRING )
                    {
                    // InternalKVis.g:2218:1: ( RULE_STRING )
                    // InternalKVis.g:2219:1: RULE_STRING
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
                    // InternalKVis.g:2224:6: ( ruleExtendedID )
                    {
                    // InternalKVis.g:2224:6: ( ruleExtendedID )
                    // InternalKVis.g:2225:1: ruleExtendedID
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
                    // InternalKVis.g:2230:6: ( RULE_BOOLEAN )
                    {
                    // InternalKVis.g:2230:6: ( RULE_BOOLEAN )
                    // InternalKVis.g:2231:1: RULE_BOOLEAN
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


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalKVis.g:2241:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '!=' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2245:1: ( ( ( '==' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '!=' ) ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt17=1;
                }
                break;
            case 30:
                {
                alt17=2;
                }
                break;
            case 31:
                {
                alt17=3;
                }
                break;
            case 32:
                {
                alt17=4;
                }
                break;
            case 33:
                {
                alt17=5;
                }
                break;
            case 34:
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
                    // InternalKVis.g:2246:1: ( ( '==' ) )
                    {
                    // InternalKVis.g:2246:1: ( ( '==' ) )
                    // InternalKVis.g:2247:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalKVis.g:2248:1: ( '==' )
                    // InternalKVis.g:2248:3: '=='
                    {
                    match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKVis.g:2253:6: ( ( '<' ) )
                    {
                    // InternalKVis.g:2253:6: ( ( '<' ) )
                    // InternalKVis.g:2254:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }
                    // InternalKVis.g:2255:1: ( '<' )
                    // InternalKVis.g:2255:3: '<'
                    {
                    match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKVis.g:2260:6: ( ( '<=' ) )
                    {
                    // InternalKVis.g:2260:6: ( ( '<=' ) )
                    // InternalKVis.g:2261:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalKVis.g:2262:1: ( '<=' )
                    // InternalKVis.g:2262:3: '<='
                    {
                    match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKVis.g:2267:6: ( ( '>' ) )
                    {
                    // InternalKVis.g:2267:6: ( ( '>' ) )
                    // InternalKVis.g:2268:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }
                    // InternalKVis.g:2269:1: ( '>' )
                    // InternalKVis.g:2269:3: '>'
                    {
                    match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKVis.g:2274:6: ( ( '>=' ) )
                    {
                    // InternalKVis.g:2274:6: ( ( '>=' ) )
                    // InternalKVis.g:2275:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalKVis.g:2276:1: ( '>=' )
                    // InternalKVis.g:2276:3: '>='
                    {
                    match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKVis.g:2281:6: ( ( '!=' ) )
                    {
                    // InternalKVis.g:2281:6: ( ( '!=' ) )
                    // InternalKVis.g:2282:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5()); 
                    }
                    // InternalKVis.g:2283:1: ( '!=' )
                    // InternalKVis.g:2283:3: '!='
                    {
                    match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;

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


    // $ANTLR start "rule__Visualization__Group__0"
    // InternalKVis.g:2297:1: rule__Visualization__Group__0 : rule__Visualization__Group__0__Impl rule__Visualization__Group__1 ;
    public final void rule__Visualization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2301:1: ( rule__Visualization__Group__0__Impl rule__Visualization__Group__1 )
            // InternalKVis.g:2302:2: rule__Visualization__Group__0__Impl rule__Visualization__Group__1
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
    // InternalKVis.g:2309:1: rule__Visualization__Group__0__Impl : ( 'image' ) ;
    public final void rule__Visualization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2313:1: ( ( 'image' ) )
            // InternalKVis.g:2314:1: ( 'image' )
            {
            // InternalKVis.g:2314:1: ( 'image' )
            // InternalKVis.g:2315:1: 'image'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationAccess().getImageKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:2328:1: rule__Visualization__Group__1 : rule__Visualization__Group__1__Impl rule__Visualization__Group__2 ;
    public final void rule__Visualization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2332:1: ( rule__Visualization__Group__1__Impl rule__Visualization__Group__2 )
            // InternalKVis.g:2333:2: rule__Visualization__Group__1__Impl rule__Visualization__Group__2
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
    // InternalKVis.g:2340:1: rule__Visualization__Group__1__Impl : ( ':' ) ;
    public final void rule__Visualization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2344:1: ( ( ':' ) )
            // InternalKVis.g:2345:1: ( ':' )
            {
            // InternalKVis.g:2345:1: ( ':' )
            // InternalKVis.g:2346:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationAccess().getColonKeyword_1()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:2359:1: rule__Visualization__Group__2 : rule__Visualization__Group__2__Impl rule__Visualization__Group__3 ;
    public final void rule__Visualization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2363:1: ( rule__Visualization__Group__2__Impl rule__Visualization__Group__3 )
            // InternalKVis.g:2364:2: rule__Visualization__Group__2__Impl rule__Visualization__Group__3
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
    // InternalKVis.g:2371:1: rule__Visualization__Group__2__Impl : ( ( rule__Visualization__ImageAssignment_2 ) ) ;
    public final void rule__Visualization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2375:1: ( ( ( rule__Visualization__ImageAssignment_2 ) ) )
            // InternalKVis.g:2376:1: ( ( rule__Visualization__ImageAssignment_2 ) )
            {
            // InternalKVis.g:2376:1: ( ( rule__Visualization__ImageAssignment_2 ) )
            // InternalKVis.g:2377:1: ( rule__Visualization__ImageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationAccess().getImageAssignment_2()); 
            }
            // InternalKVis.g:2378:1: ( rule__Visualization__ImageAssignment_2 )
            // InternalKVis.g:2378:2: rule__Visualization__ImageAssignment_2
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
    // InternalKVis.g:2388:1: rule__Visualization__Group__3 : rule__Visualization__Group__3__Impl ;
    public final void rule__Visualization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2392:1: ( rule__Visualization__Group__3__Impl )
            // InternalKVis.g:2393:2: rule__Visualization__Group__3__Impl
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
    // InternalKVis.g:2399:1: rule__Visualization__Group__3__Impl : ( ( rule__Visualization__ElementsAssignment_3 )* ) ;
    public final void rule__Visualization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2403:1: ( ( ( rule__Visualization__ElementsAssignment_3 )* ) )
            // InternalKVis.g:2404:1: ( ( rule__Visualization__ElementsAssignment_3 )* )
            {
            // InternalKVis.g:2404:1: ( ( rule__Visualization__ElementsAssignment_3 )* )
            // InternalKVis.g:2405:1: ( rule__Visualization__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVisualizationAccess().getElementsAssignment_3()); 
            }
            // InternalKVis.g:2406:1: ( rule__Visualization__ElementsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKVis.g:2406:2: rule__Visualization__ElementsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__Visualization__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalKVis.g:2424:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2428:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalKVis.g:2429:2: rule__Element__Group__0__Impl rule__Element__Group__1
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
    // InternalKVis.g:2436:1: rule__Element__Group__0__Impl : ( 'animate' ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2440:1: ( ( 'animate' ) )
            // InternalKVis.g:2441:1: ( 'animate' )
            {
            // InternalKVis.g:2441:1: ( 'animate' )
            // InternalKVis.g:2442:1: 'animate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAnimateKeyword_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:2455:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2459:1: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
            // InternalKVis.g:2460:2: rule__Element__Group__1__Impl rule__Element__Group__2
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
    // InternalKVis.g:2467:1: rule__Element__Group__1__Impl : ( ( rule__Element__NameAssignment_1 ) ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2471:1: ( ( ( rule__Element__NameAssignment_1 ) ) )
            // InternalKVis.g:2472:1: ( ( rule__Element__NameAssignment_1 ) )
            {
            // InternalKVis.g:2472:1: ( ( rule__Element__NameAssignment_1 ) )
            // InternalKVis.g:2473:1: ( rule__Element__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getNameAssignment_1()); 
            }
            // InternalKVis.g:2474:1: ( rule__Element__NameAssignment_1 )
            // InternalKVis.g:2474:2: rule__Element__NameAssignment_1
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
    // InternalKVis.g:2484:1: rule__Element__Group__2 : rule__Element__Group__2__Impl rule__Element__Group__3 ;
    public final void rule__Element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2488:1: ( rule__Element__Group__2__Impl rule__Element__Group__3 )
            // InternalKVis.g:2489:2: rule__Element__Group__2__Impl rule__Element__Group__3
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
    // InternalKVis.g:2496:1: rule__Element__Group__2__Impl : ( '{' ) ;
    public final void rule__Element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2500:1: ( ( '{' ) )
            // InternalKVis.g:2501:1: ( '{' )
            {
            // InternalKVis.g:2501:1: ( '{' )
            // InternalKVis.g:2502:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:2515:1: rule__Element__Group__3 : rule__Element__Group__3__Impl rule__Element__Group__4 ;
    public final void rule__Element__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2519:1: ( rule__Element__Group__3__Impl rule__Element__Group__4 )
            // InternalKVis.g:2520:2: rule__Element__Group__3__Impl rule__Element__Group__4
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
    // InternalKVis.g:2527:1: rule__Element__Group__3__Impl : ( ( ( rule__Element__AnimationsAssignment_3 ) ) ( ( rule__Element__AnimationsAssignment_3 )* ) ) ;
    public final void rule__Element__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2531:1: ( ( ( ( rule__Element__AnimationsAssignment_3 ) ) ( ( rule__Element__AnimationsAssignment_3 )* ) ) )
            // InternalKVis.g:2532:1: ( ( ( rule__Element__AnimationsAssignment_3 ) ) ( ( rule__Element__AnimationsAssignment_3 )* ) )
            {
            // InternalKVis.g:2532:1: ( ( ( rule__Element__AnimationsAssignment_3 ) ) ( ( rule__Element__AnimationsAssignment_3 )* ) )
            // InternalKVis.g:2533:1: ( ( rule__Element__AnimationsAssignment_3 ) ) ( ( rule__Element__AnimationsAssignment_3 )* )
            {
            // InternalKVis.g:2533:1: ( ( rule__Element__AnimationsAssignment_3 ) )
            // InternalKVis.g:2534:1: ( rule__Element__AnimationsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAnimationsAssignment_3()); 
            }
            // InternalKVis.g:2535:1: ( rule__Element__AnimationsAssignment_3 )
            // InternalKVis.g:2535:2: rule__Element__AnimationsAssignment_3
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

            // InternalKVis.g:2538:1: ( ( rule__Element__AnimationsAssignment_3 )* )
            // InternalKVis.g:2539:1: ( rule__Element__AnimationsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAnimationsAssignment_3()); 
            }
            // InternalKVis.g:2540:1: ( rule__Element__AnimationsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKVis.g:2540:2: rule__Element__AnimationsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    rule__Element__AnimationsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalKVis.g:2551:1: rule__Element__Group__4 : rule__Element__Group__4__Impl ;
    public final void rule__Element__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2555:1: ( rule__Element__Group__4__Impl )
            // InternalKVis.g:2556:2: rule__Element__Group__4__Impl
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
    // InternalKVis.g:2562:1: rule__Element__Group__4__Impl : ( '}' ) ;
    public final void rule__Element__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2566:1: ( ( '}' ) )
            // InternalKVis.g:2567:1: ( '}' )
            {
            // InternalKVis.g:2567:1: ( '}' )
            // InternalKVis.g:2568:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:2591:1: rule__Animation__Group__0 : rule__Animation__Group__0__Impl rule__Animation__Group__1 ;
    public final void rule__Animation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2595:1: ( rule__Animation__Group__0__Impl rule__Animation__Group__1 )
            // InternalKVis.g:2596:2: rule__Animation__Group__0__Impl rule__Animation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKVis.g:2603:1: rule__Animation__Group__0__Impl : ( 'apply' ) ;
    public final void rule__Animation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2607:1: ( ( 'apply' ) )
            // InternalKVis.g:2608:1: ( 'apply' )
            {
            // InternalKVis.g:2608:1: ( 'apply' )
            // InternalKVis.g:2609:1: 'apply'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getApplyKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getApplyKeyword_0()); 
            }

            }


            }

        }
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
    // InternalKVis.g:2622:1: rule__Animation__Group__1 : rule__Animation__Group__1__Impl rule__Animation__Group__2 ;
    public final void rule__Animation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2626:1: ( rule__Animation__Group__1__Impl rule__Animation__Group__2 )
            // InternalKVis.g:2627:2: rule__Animation__Group__1__Impl rule__Animation__Group__2
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
    // InternalKVis.g:2634:1: rule__Animation__Group__1__Impl : ( ( rule__Animation__TypeAssignment_1 ) ) ;
    public final void rule__Animation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2638:1: ( ( ( rule__Animation__TypeAssignment_1 ) ) )
            // InternalKVis.g:2639:1: ( ( rule__Animation__TypeAssignment_1 ) )
            {
            // InternalKVis.g:2639:1: ( ( rule__Animation__TypeAssignment_1 ) )
            // InternalKVis.g:2640:1: ( rule__Animation__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getTypeAssignment_1()); 
            }
            // InternalKVis.g:2641:1: ( rule__Animation__TypeAssignment_1 )
            // InternalKVis.g:2641:2: rule__Animation__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
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
    // InternalKVis.g:2651:1: rule__Animation__Group__2 : rule__Animation__Group__2__Impl rule__Animation__Group__3 ;
    public final void rule__Animation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2655:1: ( rule__Animation__Group__2__Impl rule__Animation__Group__3 )
            // InternalKVis.g:2656:2: rule__Animation__Group__2__Impl rule__Animation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalKVis.g:2663:1: rule__Animation__Group__2__Impl : ( ( rule__Animation__Group_2__0 )? ) ;
    public final void rule__Animation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2667:1: ( ( ( rule__Animation__Group_2__0 )? ) )
            // InternalKVis.g:2668:1: ( ( rule__Animation__Group_2__0 )? )
            {
            // InternalKVis.g:2668:1: ( ( rule__Animation__Group_2__0 )? )
            // InternalKVis.g:2669:1: ( rule__Animation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getGroup_2()); 
            }
            // InternalKVis.g:2670:1: ( rule__Animation__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKVis.g:2670:2: rule__Animation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Animation__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getGroup_2()); 
            }

            }


            }

        }
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
    // InternalKVis.g:2680:1: rule__Animation__Group__3 : rule__Animation__Group__3__Impl rule__Animation__Group__4 ;
    public final void rule__Animation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2684:1: ( rule__Animation__Group__3__Impl rule__Animation__Group__4 )
            // InternalKVis.g:2685:2: rule__Animation__Group__3__Impl rule__Animation__Group__4
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
    // InternalKVis.g:2692:1: rule__Animation__Group__3__Impl : ( '{' ) ;
    public final void rule__Animation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2696:1: ( ( '{' ) )
            // InternalKVis.g:2697:1: ( '{' )
            {
            // InternalKVis.g:2697:1: ( '{' )
            // InternalKVis.g:2698:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
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
    // InternalKVis.g:2711:1: rule__Animation__Group__4 : rule__Animation__Group__4__Impl rule__Animation__Group__5 ;
    public final void rule__Animation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2715:1: ( rule__Animation__Group__4__Impl rule__Animation__Group__5 )
            // InternalKVis.g:2716:2: rule__Animation__Group__4__Impl rule__Animation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalKVis.g:2723:1: rule__Animation__Group__4__Impl : ( ( rule__Animation__AttributeMappingsAssignment_4 )* ) ;
    public final void rule__Animation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2727:1: ( ( ( rule__Animation__AttributeMappingsAssignment_4 )* ) )
            // InternalKVis.g:2728:1: ( ( rule__Animation__AttributeMappingsAssignment_4 )* )
            {
            // InternalKVis.g:2728:1: ( ( rule__Animation__AttributeMappingsAssignment_4 )* )
            // InternalKVis.g:2729:1: ( rule__Animation__AttributeMappingsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getAttributeMappingsAssignment_4()); 
            }
            // InternalKVis.g:2730:1: ( rule__Animation__AttributeMappingsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKVis.g:2730:2: rule__Animation__AttributeMappingsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    rule__Animation__AttributeMappingsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getAttributeMappingsAssignment_4()); 
            }

            }


            }

        }
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
    // InternalKVis.g:2740:1: rule__Animation__Group__5 : rule__Animation__Group__5__Impl rule__Animation__Group__6 ;
    public final void rule__Animation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2744:1: ( rule__Animation__Group__5__Impl rule__Animation__Group__6 )
            // InternalKVis.g:2745:2: rule__Animation__Group__5__Impl rule__Animation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Animation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKVis.g:2752:1: rule__Animation__Group__5__Impl : ( '}' ) ;
    public final void rule__Animation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2756:1: ( ( '}' ) )
            // InternalKVis.g:2757:1: ( '}' )
            {
            // InternalKVis.g:2757:1: ( '}' )
            // InternalKVis.g:2758:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Animation__Group__6"
    // InternalKVis.g:2771:1: rule__Animation__Group__6 : rule__Animation__Group__6__Impl ;
    public final void rule__Animation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2775:1: ( rule__Animation__Group__6__Impl )
            // InternalKVis.g:2776:2: rule__Animation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__6"


    // $ANTLR start "rule__Animation__Group__6__Impl"
    // InternalKVis.g:2782:1: rule__Animation__Group__6__Impl : ( ( rule__Animation__Group_6__0 )? ) ;
    public final void rule__Animation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2786:1: ( ( ( rule__Animation__Group_6__0 )? ) )
            // InternalKVis.g:2787:1: ( ( rule__Animation__Group_6__0 )? )
            {
            // InternalKVis.g:2787:1: ( ( rule__Animation__Group_6__0 )? )
            // InternalKVis.g:2788:1: ( rule__Animation__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getGroup_6()); 
            }
            // InternalKVis.g:2789:1: ( rule__Animation__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKVis.g:2789:2: rule__Animation__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Animation__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group__6__Impl"


    // $ANTLR start "rule__Animation__Group_2__0"
    // InternalKVis.g:2813:1: rule__Animation__Group_2__0 : rule__Animation__Group_2__0__Impl rule__Animation__Group_2__1 ;
    public final void rule__Animation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2817:1: ( rule__Animation__Group_2__0__Impl rule__Animation__Group_2__1 )
            // InternalKVis.g:2818:2: rule__Animation__Group_2__0__Impl rule__Animation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKVis.g:2825:1: rule__Animation__Group_2__0__Impl : ( 'using' ) ;
    public final void rule__Animation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2829:1: ( ( 'using' ) )
            // InternalKVis.g:2830:1: ( 'using' )
            {
            // InternalKVis.g:2830:1: ( 'using' )
            // InternalKVis.g:2831:1: 'using'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getUsingKeyword_2_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getUsingKeyword_2_0()); 
            }

            }


            }

        }
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
    // InternalKVis.g:2844:1: rule__Animation__Group_2__1 : rule__Animation__Group_2__1__Impl ;
    public final void rule__Animation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2848:1: ( rule__Animation__Group_2__1__Impl )
            // InternalKVis.g:2849:2: rule__Animation__Group_2__1__Impl
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
    // InternalKVis.g:2855:1: rule__Animation__Group_2__1__Impl : ( ( rule__Animation__VariableAssignment_2_1 ) ) ;
    public final void rule__Animation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2859:1: ( ( ( rule__Animation__VariableAssignment_2_1 ) ) )
            // InternalKVis.g:2860:1: ( ( rule__Animation__VariableAssignment_2_1 ) )
            {
            // InternalKVis.g:2860:1: ( ( rule__Animation__VariableAssignment_2_1 ) )
            // InternalKVis.g:2861:1: ( rule__Animation__VariableAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getVariableAssignment_2_1()); 
            }
            // InternalKVis.g:2862:1: ( rule__Animation__VariableAssignment_2_1 )
            // InternalKVis.g:2862:2: rule__Animation__VariableAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__VariableAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getVariableAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_2__1__Impl"


    // $ANTLR start "rule__Animation__Group_6__0"
    // InternalKVis.g:2876:1: rule__Animation__Group_6__0 : rule__Animation__Group_6__0__Impl rule__Animation__Group_6__1 ;
    public final void rule__Animation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2880:1: ( rule__Animation__Group_6__0__Impl rule__Animation__Group_6__1 )
            // InternalKVis.g:2881:2: rule__Animation__Group_6__0__Impl rule__Animation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Animation__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_6__0"


    // $ANTLR start "rule__Animation__Group_6__0__Impl"
    // InternalKVis.g:2888:1: rule__Animation__Group_6__0__Impl : ( 'when' ) ;
    public final void rule__Animation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2892:1: ( ( 'when' ) )
            // InternalKVis.g:2893:1: ( 'when' )
            {
            // InternalKVis.g:2893:1: ( 'when' )
            // InternalKVis.g:2894:1: 'when'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getWhenKeyword_6_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getWhenKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_6__0__Impl"


    // $ANTLR start "rule__Animation__Group_6__1"
    // InternalKVis.g:2907:1: rule__Animation__Group_6__1 : rule__Animation__Group_6__1__Impl ;
    public final void rule__Animation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2911:1: ( rule__Animation__Group_6__1__Impl )
            // InternalKVis.g:2912:2: rule__Animation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_6__1"


    // $ANTLR start "rule__Animation__Group_6__1__Impl"
    // InternalKVis.g:2918:1: rule__Animation__Group_6__1__Impl : ( ( rule__Animation__ConditionAssignment_6_1 ) ) ;
    public final void rule__Animation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2922:1: ( ( ( rule__Animation__ConditionAssignment_6_1 ) ) )
            // InternalKVis.g:2923:1: ( ( rule__Animation__ConditionAssignment_6_1 ) )
            {
            // InternalKVis.g:2923:1: ( ( rule__Animation__ConditionAssignment_6_1 ) )
            // InternalKVis.g:2924:1: ( rule__Animation__ConditionAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getConditionAssignment_6_1()); 
            }
            // InternalKVis.g:2925:1: ( rule__Animation__ConditionAssignment_6_1 )
            // InternalKVis.g:2925:2: rule__Animation__ConditionAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Animation__ConditionAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getConditionAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Group_6__1__Impl"


    // $ANTLR start "rule__AttributeMapping__Group__0"
    // InternalKVis.g:2939:1: rule__AttributeMapping__Group__0 : rule__AttributeMapping__Group__0__Impl rule__AttributeMapping__Group__1 ;
    public final void rule__AttributeMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2943:1: ( rule__AttributeMapping__Group__0__Impl rule__AttributeMapping__Group__1 )
            // InternalKVis.g:2944:2: rule__AttributeMapping__Group__0__Impl rule__AttributeMapping__Group__1
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
    // InternalKVis.g:2951:1: rule__AttributeMapping__Group__0__Impl : ( ( rule__AttributeMapping__AttributeAssignment_0 ) ) ;
    public final void rule__AttributeMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2955:1: ( ( ( rule__AttributeMapping__AttributeAssignment_0 ) ) )
            // InternalKVis.g:2956:1: ( ( rule__AttributeMapping__AttributeAssignment_0 ) )
            {
            // InternalKVis.g:2956:1: ( ( rule__AttributeMapping__AttributeAssignment_0 ) )
            // InternalKVis.g:2957:1: ( rule__AttributeMapping__AttributeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getAttributeAssignment_0()); 
            }
            // InternalKVis.g:2958:1: ( rule__AttributeMapping__AttributeAssignment_0 )
            // InternalKVis.g:2958:2: rule__AttributeMapping__AttributeAssignment_0
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
    // InternalKVis.g:2968:1: rule__AttributeMapping__Group__1 : rule__AttributeMapping__Group__1__Impl rule__AttributeMapping__Group__2 ;
    public final void rule__AttributeMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2972:1: ( rule__AttributeMapping__Group__1__Impl rule__AttributeMapping__Group__2 )
            // InternalKVis.g:2973:2: rule__AttributeMapping__Group__1__Impl rule__AttributeMapping__Group__2
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
    // InternalKVis.g:2980:1: rule__AttributeMapping__Group__1__Impl : ( ':' ) ;
    public final void rule__AttributeMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:2984:1: ( ( ':' ) )
            // InternalKVis.g:2985:1: ( ':' )
            {
            // InternalKVis.g:2985:1: ( ':' )
            // InternalKVis.g:2986:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getColonKeyword_1()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:2999:1: rule__AttributeMapping__Group__2 : rule__AttributeMapping__Group__2__Impl ;
    public final void rule__AttributeMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3003:1: ( rule__AttributeMapping__Group__2__Impl )
            // InternalKVis.g:3004:2: rule__AttributeMapping__Group__2__Impl
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
    // InternalKVis.g:3010:1: rule__AttributeMapping__Group__2__Impl : ( ( rule__AttributeMapping__Alternatives_2 ) ) ;
    public final void rule__AttributeMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3014:1: ( ( ( rule__AttributeMapping__Alternatives_2 ) ) )
            // InternalKVis.g:3015:1: ( ( rule__AttributeMapping__Alternatives_2 ) )
            {
            // InternalKVis.g:3015:1: ( ( rule__AttributeMapping__Alternatives_2 ) )
            // InternalKVis.g:3016:1: ( rule__AttributeMapping__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getAlternatives_2()); 
            }
            // InternalKVis.g:3017:1: ( rule__AttributeMapping__Alternatives_2 )
            // InternalKVis.g:3017:2: rule__AttributeMapping__Alternatives_2
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
    // InternalKVis.g:3033:1: rule__AttributeMapping__Group_2_1__0 : rule__AttributeMapping__Group_2_1__0__Impl rule__AttributeMapping__Group_2_1__1 ;
    public final void rule__AttributeMapping__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3037:1: ( rule__AttributeMapping__Group_2_1__0__Impl rule__AttributeMapping__Group_2_1__1 )
            // InternalKVis.g:3038:2: rule__AttributeMapping__Group_2_1__0__Impl rule__AttributeMapping__Group_2_1__1
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
    // InternalKVis.g:3045:1: rule__AttributeMapping__Group_2_1__0__Impl : ( ( rule__AttributeMapping__MappingsAssignment_2_1_0 ) ) ;
    public final void rule__AttributeMapping__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3049:1: ( ( ( rule__AttributeMapping__MappingsAssignment_2_1_0 ) ) )
            // InternalKVis.g:3050:1: ( ( rule__AttributeMapping__MappingsAssignment_2_1_0 ) )
            {
            // InternalKVis.g:3050:1: ( ( rule__AttributeMapping__MappingsAssignment_2_1_0 ) )
            // InternalKVis.g:3051:1: ( rule__AttributeMapping__MappingsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getMappingsAssignment_2_1_0()); 
            }
            // InternalKVis.g:3052:1: ( rule__AttributeMapping__MappingsAssignment_2_1_0 )
            // InternalKVis.g:3052:2: rule__AttributeMapping__MappingsAssignment_2_1_0
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
    // InternalKVis.g:3062:1: rule__AttributeMapping__Group_2_1__1 : rule__AttributeMapping__Group_2_1__1__Impl ;
    public final void rule__AttributeMapping__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3066:1: ( rule__AttributeMapping__Group_2_1__1__Impl )
            // InternalKVis.g:3067:2: rule__AttributeMapping__Group_2_1__1__Impl
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
    // InternalKVis.g:3073:1: rule__AttributeMapping__Group_2_1__1__Impl : ( ( rule__AttributeMapping__Group_2_1_1__0 )* ) ;
    public final void rule__AttributeMapping__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3077:1: ( ( ( rule__AttributeMapping__Group_2_1_1__0 )* ) )
            // InternalKVis.g:3078:1: ( ( rule__AttributeMapping__Group_2_1_1__0 )* )
            {
            // InternalKVis.g:3078:1: ( ( rule__AttributeMapping__Group_2_1_1__0 )* )
            // InternalKVis.g:3079:1: ( rule__AttributeMapping__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getGroup_2_1_1()); 
            }
            // InternalKVis.g:3080:1: ( rule__AttributeMapping__Group_2_1_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==43) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKVis.g:3080:2: rule__AttributeMapping__Group_2_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    rule__AttributeMapping__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalKVis.g:3094:1: rule__AttributeMapping__Group_2_1_1__0 : rule__AttributeMapping__Group_2_1_1__0__Impl rule__AttributeMapping__Group_2_1_1__1 ;
    public final void rule__AttributeMapping__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3098:1: ( rule__AttributeMapping__Group_2_1_1__0__Impl rule__AttributeMapping__Group_2_1_1__1 )
            // InternalKVis.g:3099:2: rule__AttributeMapping__Group_2_1_1__0__Impl rule__AttributeMapping__Group_2_1_1__1
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
    // InternalKVis.g:3106:1: rule__AttributeMapping__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__AttributeMapping__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3110:1: ( ( ',' ) )
            // InternalKVis.g:3111:1: ( ',' )
            {
            // InternalKVis.g:3111:1: ( ',' )
            // InternalKVis.g:3112:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:3125:1: rule__AttributeMapping__Group_2_1_1__1 : rule__AttributeMapping__Group_2_1_1__1__Impl ;
    public final void rule__AttributeMapping__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3129:1: ( rule__AttributeMapping__Group_2_1_1__1__Impl )
            // InternalKVis.g:3130:2: rule__AttributeMapping__Group_2_1_1__1__Impl
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
    // InternalKVis.g:3136:1: rule__AttributeMapping__Group_2_1_1__1__Impl : ( ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 ) ) ;
    public final void rule__AttributeMapping__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3140:1: ( ( ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 ) ) )
            // InternalKVis.g:3141:1: ( ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 ) )
            {
            // InternalKVis.g:3141:1: ( ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 ) )
            // InternalKVis.g:3142:1: ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeMappingAccess().getMappingsAssignment_2_1_1_1()); 
            }
            // InternalKVis.g:3143:1: ( rule__AttributeMapping__MappingsAssignment_2_1_1_1 )
            // InternalKVis.g:3143:2: rule__AttributeMapping__MappingsAssignment_2_1_1_1
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
    // InternalKVis.g:3157:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3161:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalKVis.g:3162:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
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
    // InternalKVis.g:3169:1: rule__Mapping__Group__0__Impl : ( ( rule__Mapping__VariableDomainAssignment_0 ) ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3173:1: ( ( ( rule__Mapping__VariableDomainAssignment_0 ) ) )
            // InternalKVis.g:3174:1: ( ( rule__Mapping__VariableDomainAssignment_0 ) )
            {
            // InternalKVis.g:3174:1: ( ( rule__Mapping__VariableDomainAssignment_0 ) )
            // InternalKVis.g:3175:1: ( rule__Mapping__VariableDomainAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getVariableDomainAssignment_0()); 
            }
            // InternalKVis.g:3176:1: ( rule__Mapping__VariableDomainAssignment_0 )
            // InternalKVis.g:3176:2: rule__Mapping__VariableDomainAssignment_0
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
    // InternalKVis.g:3186:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3190:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalKVis.g:3191:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
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
    // InternalKVis.g:3198:1: rule__Mapping__Group__1__Impl : ( 'is' ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3202:1: ( ( 'is' ) )
            // InternalKVis.g:3203:1: ( 'is' )
            {
            // InternalKVis.g:3203:1: ( 'is' )
            // InternalKVis.g:3204:1: 'is'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getIsKeyword_1()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:3217:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3221:1: ( rule__Mapping__Group__2__Impl )
            // InternalKVis.g:3222:2: rule__Mapping__Group__2__Impl
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
    // InternalKVis.g:3228:1: rule__Mapping__Group__2__Impl : ( ( rule__Mapping__AttributeDomainAssignment_2 ) ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3232:1: ( ( ( rule__Mapping__AttributeDomainAssignment_2 ) ) )
            // InternalKVis.g:3233:1: ( ( rule__Mapping__AttributeDomainAssignment_2 ) )
            {
            // InternalKVis.g:3233:1: ( ( rule__Mapping__AttributeDomainAssignment_2 ) )
            // InternalKVis.g:3234:1: ( rule__Mapping__AttributeDomainAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMappingAccess().getAttributeDomainAssignment_2()); 
            }
            // InternalKVis.g:3235:1: ( rule__Mapping__AttributeDomainAssignment_2 )
            // InternalKVis.g:3235:2: rule__Mapping__AttributeDomainAssignment_2
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
    // InternalKVis.g:3251:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3255:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // InternalKVis.g:3256:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
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
    // InternalKVis.g:3263:1: rule__Interval__Group__0__Impl : ( ( rule__Interval__Alternatives_0 ) ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3267:1: ( ( ( rule__Interval__Alternatives_0 ) ) )
            // InternalKVis.g:3268:1: ( ( rule__Interval__Alternatives_0 ) )
            {
            // InternalKVis.g:3268:1: ( ( rule__Interval__Alternatives_0 ) )
            // InternalKVis.g:3269:1: ( rule__Interval__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getAlternatives_0()); 
            }
            // InternalKVis.g:3270:1: ( rule__Interval__Alternatives_0 )
            // InternalKVis.g:3270:2: rule__Interval__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getAlternatives_0()); 
            }

            }


            }

        }
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
    // InternalKVis.g:3280:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3284:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // InternalKVis.g:3285:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
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
    // InternalKVis.g:3292:1: rule__Interval__Group__1__Impl : ( ruleRange ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3296:1: ( ( ruleRange ) )
            // InternalKVis.g:3297:1: ( ruleRange )
            {
            // InternalKVis.g:3297:1: ( ruleRange )
            // InternalKVis.g:3298:1: ruleRange
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getRangeParserRuleCall_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getRangeParserRuleCall_1()); 
            }

            }


            }

        }
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
    // InternalKVis.g:3309:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3313:1: ( rule__Interval__Group__2__Impl )
            // InternalKVis.g:3314:2: rule__Interval__Group__2__Impl
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
    // InternalKVis.g:3320:1: rule__Interval__Group__2__Impl : ( ( rule__Interval__Alternatives_2 ) ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3324:1: ( ( ( rule__Interval__Alternatives_2 ) ) )
            // InternalKVis.g:3325:1: ( ( rule__Interval__Alternatives_2 ) )
            {
            // InternalKVis.g:3325:1: ( ( rule__Interval__Alternatives_2 ) )
            // InternalKVis.g:3326:1: ( rule__Interval__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getAlternatives_2()); 
            }
            // InternalKVis.g:3327:1: ( rule__Interval__Alternatives_2 )
            // InternalKVis.g:3327:2: rule__Interval__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getAlternatives_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Interval__Group_0_1__0"
    // InternalKVis.g:3343:1: rule__Interval__Group_0_1__0 : rule__Interval__Group_0_1__0__Impl rule__Interval__Group_0_1__1 ;
    public final void rule__Interval__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3347:1: ( rule__Interval__Group_0_1__0__Impl rule__Interval__Group_0_1__1 )
            // InternalKVis.g:3348:2: rule__Interval__Group_0_1__0__Impl rule__Interval__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__Interval__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_0_1__0"


    // $ANTLR start "rule__Interval__Group_0_1__0__Impl"
    // InternalKVis.g:3355:1: rule__Interval__Group_0_1__0__Impl : ( '(' ) ;
    public final void rule__Interval__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3359:1: ( ( '(' ) )
            // InternalKVis.g:3360:1: ( '(' )
            {
            // InternalKVis.g:3360:1: ( '(' )
            // InternalKVis.g:3361:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getLeftParenthesisKeyword_0_1_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getLeftParenthesisKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_0_1__0__Impl"


    // $ANTLR start "rule__Interval__Group_0_1__1"
    // InternalKVis.g:3374:1: rule__Interval__Group_0_1__1 : rule__Interval__Group_0_1__1__Impl rule__Interval__Group_0_1__2 ;
    public final void rule__Interval__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3378:1: ( rule__Interval__Group_0_1__1__Impl rule__Interval__Group_0_1__2 )
            // InternalKVis.g:3379:2: rule__Interval__Group_0_1__1__Impl rule__Interval__Group_0_1__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__Interval__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__Group_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_0_1__1"


    // $ANTLR start "rule__Interval__Group_0_1__1__Impl"
    // InternalKVis.g:3386:1: rule__Interval__Group_0_1__1__Impl : ( ( rule__Interval__FromAssignment_0_1_1 ) ) ;
    public final void rule__Interval__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3390:1: ( ( ( rule__Interval__FromAssignment_0_1_1 ) ) )
            // InternalKVis.g:3391:1: ( ( rule__Interval__FromAssignment_0_1_1 ) )
            {
            // InternalKVis.g:3391:1: ( ( rule__Interval__FromAssignment_0_1_1 ) )
            // InternalKVis.g:3392:1: ( rule__Interval__FromAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getFromAssignment_0_1_1()); 
            }
            // InternalKVis.g:3393:1: ( rule__Interval__FromAssignment_0_1_1 )
            // InternalKVis.g:3393:2: rule__Interval__FromAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__FromAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getFromAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_0_1__1__Impl"


    // $ANTLR start "rule__Interval__Group_0_1__2"
    // InternalKVis.g:3403:1: rule__Interval__Group_0_1__2 : rule__Interval__Group_0_1__2__Impl ;
    public final void rule__Interval__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3407:1: ( rule__Interval__Group_0_1__2__Impl )
            // InternalKVis.g:3408:2: rule__Interval__Group_0_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_0_1__2"


    // $ANTLR start "rule__Interval__Group_0_1__2__Impl"
    // InternalKVis.g:3414:1: rule__Interval__Group_0_1__2__Impl : ( ')' ) ;
    public final void rule__Interval__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3418:1: ( ( ')' ) )
            // InternalKVis.g:3419:1: ( ')' )
            {
            // InternalKVis.g:3419:1: ( ')' )
            // InternalKVis.g:3420:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getRightParenthesisKeyword_0_1_2()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getRightParenthesisKeyword_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_0_1__2__Impl"


    // $ANTLR start "rule__Interval__Group_2_1__0"
    // InternalKVis.g:3439:1: rule__Interval__Group_2_1__0 : rule__Interval__Group_2_1__0__Impl rule__Interval__Group_2_1__1 ;
    public final void rule__Interval__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3443:1: ( rule__Interval__Group_2_1__0__Impl rule__Interval__Group_2_1__1 )
            // InternalKVis.g:3444:2: rule__Interval__Group_2_1__0__Impl rule__Interval__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__Interval__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2_1__0"


    // $ANTLR start "rule__Interval__Group_2_1__0__Impl"
    // InternalKVis.g:3451:1: rule__Interval__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__Interval__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3455:1: ( ( '(' ) )
            // InternalKVis.g:3456:1: ( '(' )
            {
            // InternalKVis.g:3456:1: ( '(' )
            // InternalKVis.g:3457:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getLeftParenthesisKeyword_2_1_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getLeftParenthesisKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2_1__0__Impl"


    // $ANTLR start "rule__Interval__Group_2_1__1"
    // InternalKVis.g:3470:1: rule__Interval__Group_2_1__1 : rule__Interval__Group_2_1__1__Impl rule__Interval__Group_2_1__2 ;
    public final void rule__Interval__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3474:1: ( rule__Interval__Group_2_1__1__Impl rule__Interval__Group_2_1__2 )
            // InternalKVis.g:3475:2: rule__Interval__Group_2_1__1__Impl rule__Interval__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__Interval__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2_1__1"


    // $ANTLR start "rule__Interval__Group_2_1__1__Impl"
    // InternalKVis.g:3482:1: rule__Interval__Group_2_1__1__Impl : ( ( rule__Interval__ToAssignment_2_1_1 ) ) ;
    public final void rule__Interval__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3486:1: ( ( ( rule__Interval__ToAssignment_2_1_1 ) ) )
            // InternalKVis.g:3487:1: ( ( rule__Interval__ToAssignment_2_1_1 ) )
            {
            // InternalKVis.g:3487:1: ( ( rule__Interval__ToAssignment_2_1_1 ) )
            // InternalKVis.g:3488:1: ( rule__Interval__ToAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getToAssignment_2_1_1()); 
            }
            // InternalKVis.g:3489:1: ( rule__Interval__ToAssignment_2_1_1 )
            // InternalKVis.g:3489:2: rule__Interval__ToAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__ToAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getToAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2_1__1__Impl"


    // $ANTLR start "rule__Interval__Group_2_1__2"
    // InternalKVis.g:3499:1: rule__Interval__Group_2_1__2 : rule__Interval__Group_2_1__2__Impl ;
    public final void rule__Interval__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3503:1: ( rule__Interval__Group_2_1__2__Impl )
            // InternalKVis.g:3504:2: rule__Interval__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Interval__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2_1__2"


    // $ANTLR start "rule__Interval__Group_2_1__2__Impl"
    // InternalKVis.g:3510:1: rule__Interval__Group_2_1__2__Impl : ( ')' ) ;
    public final void rule__Interval__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3514:1: ( ( ')' ) )
            // InternalKVis.g:3515:1: ( ')' )
            {
            // InternalKVis.g:3515:1: ( ')' )
            // InternalKVis.g:3516:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getRightParenthesisKeyword_2_1_2()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getRightParenthesisKeyword_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__Group_2_1__2__Impl"


    // $ANTLR start "rule__VariableReference__Group__0"
    // InternalKVis.g:3535:1: rule__VariableReference__Group__0 : rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 ;
    public final void rule__VariableReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3539:1: ( rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1 )
            // InternalKVis.g:3540:2: rule__VariableReference__Group__0__Impl rule__VariableReference__Group__1
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
    // InternalKVis.g:3547:1: rule__VariableReference__Group__0__Impl : ( ( rule__VariableReference__ModelAssignment_0 )? ) ;
    public final void rule__VariableReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3551:1: ( ( ( rule__VariableReference__ModelAssignment_0 )? ) )
            // InternalKVis.g:3552:1: ( ( rule__VariableReference__ModelAssignment_0 )? )
            {
            // InternalKVis.g:3552:1: ( ( rule__VariableReference__ModelAssignment_0 )? )
            // InternalKVis.g:3553:1: ( rule__VariableReference__ModelAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getModelAssignment_0()); 
            }
            // InternalKVis.g:3554:1: ( rule__VariableReference__ModelAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==49) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalKVis.g:3554:2: rule__VariableReference__ModelAssignment_0
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
    // InternalKVis.g:3564:1: rule__VariableReference__Group__1 : rule__VariableReference__Group__1__Impl rule__VariableReference__Group__2 ;
    public final void rule__VariableReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3568:1: ( rule__VariableReference__Group__1__Impl rule__VariableReference__Group__2 )
            // InternalKVis.g:3569:2: rule__VariableReference__Group__1__Impl rule__VariableReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalKVis.g:3576:1: rule__VariableReference__Group__1__Impl : ( ( rule__VariableReference__NameAssignment_1 ) ) ;
    public final void rule__VariableReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3580:1: ( ( ( rule__VariableReference__NameAssignment_1 ) ) )
            // InternalKVis.g:3581:1: ( ( rule__VariableReference__NameAssignment_1 ) )
            {
            // InternalKVis.g:3581:1: ( ( rule__VariableReference__NameAssignment_1 ) )
            // InternalKVis.g:3582:1: ( rule__VariableReference__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getNameAssignment_1()); 
            }
            // InternalKVis.g:3583:1: ( rule__VariableReference__NameAssignment_1 )
            // InternalKVis.g:3583:2: rule__VariableReference__NameAssignment_1
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
    // InternalKVis.g:3593:1: rule__VariableReference__Group__2 : rule__VariableReference__Group__2__Impl ;
    public final void rule__VariableReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3597:1: ( rule__VariableReference__Group__2__Impl )
            // InternalKVis.g:3598:2: rule__VariableReference__Group__2__Impl
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
    // InternalKVis.g:3604:1: rule__VariableReference__Group__2__Impl : ( ( rule__VariableReference__Group_2__0 )* ) ;
    public final void rule__VariableReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3608:1: ( ( ( rule__VariableReference__Group_2__0 )* ) )
            // InternalKVis.g:3609:1: ( ( rule__VariableReference__Group_2__0 )* )
            {
            // InternalKVis.g:3609:1: ( ( rule__VariableReference__Group_2__0 )* )
            // InternalKVis.g:3610:1: ( rule__VariableReference__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getGroup_2()); 
            }
            // InternalKVis.g:3611:1: ( rule__VariableReference__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==47) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKVis.g:3611:2: rule__VariableReference__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__VariableReference__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalKVis.g:3627:1: rule__VariableReference__Group_2__0 : rule__VariableReference__Group_2__0__Impl rule__VariableReference__Group_2__1 ;
    public final void rule__VariableReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3631:1: ( rule__VariableReference__Group_2__0__Impl rule__VariableReference__Group_2__1 )
            // InternalKVis.g:3632:2: rule__VariableReference__Group_2__0__Impl rule__VariableReference__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalKVis.g:3639:1: rule__VariableReference__Group_2__0__Impl : ( '[' ) ;
    public final void rule__VariableReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3643:1: ( ( '[' ) )
            // InternalKVis.g:3644:1: ( '[' )
            {
            // InternalKVis.g:3644:1: ( '[' )
            // InternalKVis.g:3645:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getLeftSquareBracketKeyword_2_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:3658:1: rule__VariableReference__Group_2__1 : rule__VariableReference__Group_2__1__Impl rule__VariableReference__Group_2__2 ;
    public final void rule__VariableReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3662:1: ( rule__VariableReference__Group_2__1__Impl rule__VariableReference__Group_2__2 )
            // InternalKVis.g:3663:2: rule__VariableReference__Group_2__1__Impl rule__VariableReference__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKVis.g:3670:1: rule__VariableReference__Group_2__1__Impl : ( ( rule__VariableReference__IndicesAssignment_2_1 ) ) ;
    public final void rule__VariableReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3674:1: ( ( ( rule__VariableReference__IndicesAssignment_2_1 ) ) )
            // InternalKVis.g:3675:1: ( ( rule__VariableReference__IndicesAssignment_2_1 ) )
            {
            // InternalKVis.g:3675:1: ( ( rule__VariableReference__IndicesAssignment_2_1 ) )
            // InternalKVis.g:3676:1: ( rule__VariableReference__IndicesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getIndicesAssignment_2_1()); 
            }
            // InternalKVis.g:3677:1: ( rule__VariableReference__IndicesAssignment_2_1 )
            // InternalKVis.g:3677:2: rule__VariableReference__IndicesAssignment_2_1
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
    // InternalKVis.g:3687:1: rule__VariableReference__Group_2__2 : rule__VariableReference__Group_2__2__Impl ;
    public final void rule__VariableReference__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3691:1: ( rule__VariableReference__Group_2__2__Impl )
            // InternalKVis.g:3692:2: rule__VariableReference__Group_2__2__Impl
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
    // InternalKVis.g:3698:1: rule__VariableReference__Group_2__2__Impl : ( ']' ) ;
    public final void rule__VariableReference__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3702:1: ( ( ']' ) )
            // InternalKVis.g:3703:1: ( ']' )
            {
            // InternalKVis.g:3703:1: ( ']' )
            // InternalKVis.g:3704:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableReferenceAccess().getRightSquareBracketKeyword_2_2()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:3723:1: rule__ModelReference__Group__0 : rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1 ;
    public final void rule__ModelReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3727:1: ( rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1 )
            // InternalKVis.g:3728:2: rule__ModelReference__Group__0__Impl rule__ModelReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalKVis.g:3735:1: rule__ModelReference__Group__0__Impl : ( ( rule__ModelReference__NameAssignment_0 ) ) ;
    public final void rule__ModelReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3739:1: ( ( ( rule__ModelReference__NameAssignment_0 ) ) )
            // InternalKVis.g:3740:1: ( ( rule__ModelReference__NameAssignment_0 ) )
            {
            // InternalKVis.g:3740:1: ( ( rule__ModelReference__NameAssignment_0 ) )
            // InternalKVis.g:3741:1: ( rule__ModelReference__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getNameAssignment_0()); 
            }
            // InternalKVis.g:3742:1: ( rule__ModelReference__NameAssignment_0 )
            // InternalKVis.g:3742:2: rule__ModelReference__NameAssignment_0
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
    // InternalKVis.g:3752:1: rule__ModelReference__Group__1 : rule__ModelReference__Group__1__Impl ;
    public final void rule__ModelReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3756:1: ( rule__ModelReference__Group__1__Impl )
            // InternalKVis.g:3757:2: rule__ModelReference__Group__1__Impl
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
    // InternalKVis.g:3763:1: rule__ModelReference__Group__1__Impl : ( '.' ) ;
    public final void rule__ModelReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3767:1: ( ( '.' ) )
            // InternalKVis.g:3768:1: ( '.' )
            {
            // InternalKVis.g:3768:1: ( '.' )
            // InternalKVis.g:3769:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelReferenceAccess().getFullStopKeyword_1()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__LogicalOrExpression__Group__0"
    // InternalKVis.g:3786:1: rule__LogicalOrExpression__Group__0 : rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 ;
    public final void rule__LogicalOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3790:1: ( rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 )
            // InternalKVis.g:3791:2: rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalKVis.g:3798:1: rule__LogicalOrExpression__Group__0__Impl : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3802:1: ( ( ruleLogicalAndExpression ) )
            // InternalKVis.g:3803:1: ( ruleLogicalAndExpression )
            {
            // InternalKVis.g:3803:1: ( ruleLogicalAndExpression )
            // InternalKVis.g:3804:1: ruleLogicalAndExpression
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
    // InternalKVis.g:3815:1: rule__LogicalOrExpression__Group__1 : rule__LogicalOrExpression__Group__1__Impl ;
    public final void rule__LogicalOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3819:1: ( rule__LogicalOrExpression__Group__1__Impl )
            // InternalKVis.g:3820:2: rule__LogicalOrExpression__Group__1__Impl
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
    // InternalKVis.g:3826:1: rule__LogicalOrExpression__Group__1__Impl : ( ( rule__LogicalOrExpression__Group_1__0 )? ) ;
    public final void rule__LogicalOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3830:1: ( ( ( rule__LogicalOrExpression__Group_1__0 )? ) )
            // InternalKVis.g:3831:1: ( ( rule__LogicalOrExpression__Group_1__0 )? )
            {
            // InternalKVis.g:3831:1: ( ( rule__LogicalOrExpression__Group_1__0 )? )
            // InternalKVis.g:3832:1: ( rule__LogicalOrExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1()); 
            }
            // InternalKVis.g:3833:1: ( rule__LogicalOrExpression__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKVis.g:3833:2: rule__LogicalOrExpression__Group_1__0
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
    // InternalKVis.g:3847:1: rule__LogicalOrExpression__Group_1__0 : rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 ;
    public final void rule__LogicalOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3851:1: ( rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 )
            // InternalKVis.g:3852:2: rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalKVis.g:3859:1: rule__LogicalOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3863:1: ( ( () ) )
            // InternalKVis.g:3864:1: ( () )
            {
            // InternalKVis.g:3864:1: ( () )
            // InternalKVis.g:3865:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKVis.g:3866:1: ()
            // InternalKVis.g:3868:1: 
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
    // InternalKVis.g:3878:1: rule__LogicalOrExpression__Group_1__1 : rule__LogicalOrExpression__Group_1__1__Impl ;
    public final void rule__LogicalOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3882:1: ( rule__LogicalOrExpression__Group_1__1__Impl )
            // InternalKVis.g:3883:2: rule__LogicalOrExpression__Group_1__1__Impl
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
    // InternalKVis.g:3889:1: rule__LogicalOrExpression__Group_1__1__Impl : ( ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ( ( rule__LogicalOrExpression__Group_1_1__0 )* ) ) ;
    public final void rule__LogicalOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3893:1: ( ( ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ( ( rule__LogicalOrExpression__Group_1_1__0 )* ) ) )
            // InternalKVis.g:3894:1: ( ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ( ( rule__LogicalOrExpression__Group_1_1__0 )* ) )
            {
            // InternalKVis.g:3894:1: ( ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ( ( rule__LogicalOrExpression__Group_1_1__0 )* ) )
            // InternalKVis.g:3895:1: ( ( rule__LogicalOrExpression__Group_1_1__0 ) ) ( ( rule__LogicalOrExpression__Group_1_1__0 )* )
            {
            // InternalKVis.g:3895:1: ( ( rule__LogicalOrExpression__Group_1_1__0 ) )
            // InternalKVis.g:3896:1: ( rule__LogicalOrExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:3897:1: ( rule__LogicalOrExpression__Group_1_1__0 )
            // InternalKVis.g:3897:2: rule__LogicalOrExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__LogicalOrExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKVis.g:3900:1: ( ( rule__LogicalOrExpression__Group_1_1__0 )* )
            // InternalKVis.g:3901:1: ( rule__LogicalOrExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:3902:1: ( rule__LogicalOrExpression__Group_1_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==26) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKVis.g:3902:2: rule__LogicalOrExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    rule__LogicalOrExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalKVis.g:3917:1: rule__LogicalOrExpression__Group_1_1__0 : rule__LogicalOrExpression__Group_1_1__0__Impl rule__LogicalOrExpression__Group_1_1__1 ;
    public final void rule__LogicalOrExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3921:1: ( rule__LogicalOrExpression__Group_1_1__0__Impl rule__LogicalOrExpression__Group_1_1__1 )
            // InternalKVis.g:3922:2: rule__LogicalOrExpression__Group_1_1__0__Impl rule__LogicalOrExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKVis.g:3929:1: rule__LogicalOrExpression__Group_1_1__0__Impl : ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__LogicalOrExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3933:1: ( ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKVis.g:3934:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKVis.g:3934:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 ) )
            // InternalKVis.g:3935:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKVis.g:3936:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1_0 )
            // InternalKVis.g:3936:2: rule__LogicalOrExpression__OperatorAssignment_1_1_0
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
    // InternalKVis.g:3946:1: rule__LogicalOrExpression__Group_1_1__1 : rule__LogicalOrExpression__Group_1_1__1__Impl ;
    public final void rule__LogicalOrExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3950:1: ( rule__LogicalOrExpression__Group_1_1__1__Impl )
            // InternalKVis.g:3951:2: rule__LogicalOrExpression__Group_1_1__1__Impl
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
    // InternalKVis.g:3957:1: rule__LogicalOrExpression__Group_1_1__1__Impl : ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__LogicalOrExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3961:1: ( ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKVis.g:3962:1: ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKVis.g:3962:1: ( ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKVis.g:3963:1: ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKVis.g:3964:1: ( rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKVis.g:3964:2: rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKVis.g:3978:1: rule__LogicalAndExpression__Group__0 : rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 ;
    public final void rule__LogicalAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3982:1: ( rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 )
            // InternalKVis.g:3983:2: rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
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
    // InternalKVis.g:3990:1: rule__LogicalAndExpression__Group__0__Impl : ( ruleBitwiseOrExpression ) ;
    public final void rule__LogicalAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:3994:1: ( ( ruleBitwiseOrExpression ) )
            // InternalKVis.g:3995:1: ( ruleBitwiseOrExpression )
            {
            // InternalKVis.g:3995:1: ( ruleBitwiseOrExpression )
            // InternalKVis.g:3996:1: ruleBitwiseOrExpression
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
    // InternalKVis.g:4007:1: rule__LogicalAndExpression__Group__1 : rule__LogicalAndExpression__Group__1__Impl ;
    public final void rule__LogicalAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4011:1: ( rule__LogicalAndExpression__Group__1__Impl )
            // InternalKVis.g:4012:2: rule__LogicalAndExpression__Group__1__Impl
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
    // InternalKVis.g:4018:1: rule__LogicalAndExpression__Group__1__Impl : ( ( rule__LogicalAndExpression__Group_1__0 )? ) ;
    public final void rule__LogicalAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4022:1: ( ( ( rule__LogicalAndExpression__Group_1__0 )? ) )
            // InternalKVis.g:4023:1: ( ( rule__LogicalAndExpression__Group_1__0 )? )
            {
            // InternalKVis.g:4023:1: ( ( rule__LogicalAndExpression__Group_1__0 )? )
            // InternalKVis.g:4024:1: ( rule__LogicalAndExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1()); 
            }
            // InternalKVis.g:4025:1: ( rule__LogicalAndExpression__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKVis.g:4025:2: rule__LogicalAndExpression__Group_1__0
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
    // InternalKVis.g:4039:1: rule__LogicalAndExpression__Group_1__0 : rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 ;
    public final void rule__LogicalAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4043:1: ( rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 )
            // InternalKVis.g:4044:2: rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
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
    // InternalKVis.g:4051:1: rule__LogicalAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4055:1: ( ( () ) )
            // InternalKVis.g:4056:1: ( () )
            {
            // InternalKVis.g:4056:1: ( () )
            // InternalKVis.g:4057:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKVis.g:4058:1: ()
            // InternalKVis.g:4060:1: 
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
    // InternalKVis.g:4070:1: rule__LogicalAndExpression__Group_1__1 : rule__LogicalAndExpression__Group_1__1__Impl ;
    public final void rule__LogicalAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4074:1: ( rule__LogicalAndExpression__Group_1__1__Impl )
            // InternalKVis.g:4075:2: rule__LogicalAndExpression__Group_1__1__Impl
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
    // InternalKVis.g:4081:1: rule__LogicalAndExpression__Group_1__1__Impl : ( ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ( ( rule__LogicalAndExpression__Group_1_1__0 )* ) ) ;
    public final void rule__LogicalAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4085:1: ( ( ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ( ( rule__LogicalAndExpression__Group_1_1__0 )* ) ) )
            // InternalKVis.g:4086:1: ( ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ( ( rule__LogicalAndExpression__Group_1_1__0 )* ) )
            {
            // InternalKVis.g:4086:1: ( ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ( ( rule__LogicalAndExpression__Group_1_1__0 )* ) )
            // InternalKVis.g:4087:1: ( ( rule__LogicalAndExpression__Group_1_1__0 ) ) ( ( rule__LogicalAndExpression__Group_1_1__0 )* )
            {
            // InternalKVis.g:4087:1: ( ( rule__LogicalAndExpression__Group_1_1__0 ) )
            // InternalKVis.g:4088:1: ( rule__LogicalAndExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:4089:1: ( rule__LogicalAndExpression__Group_1_1__0 )
            // InternalKVis.g:4089:2: rule__LogicalAndExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__LogicalAndExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKVis.g:4092:1: ( ( rule__LogicalAndExpression__Group_1_1__0 )* )
            // InternalKVis.g:4093:1: ( rule__LogicalAndExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:4094:1: ( rule__LogicalAndExpression__Group_1_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==27) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKVis.g:4094:2: rule__LogicalAndExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    rule__LogicalAndExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalKVis.g:4109:1: rule__LogicalAndExpression__Group_1_1__0 : rule__LogicalAndExpression__Group_1_1__0__Impl rule__LogicalAndExpression__Group_1_1__1 ;
    public final void rule__LogicalAndExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4113:1: ( rule__LogicalAndExpression__Group_1_1__0__Impl rule__LogicalAndExpression__Group_1_1__1 )
            // InternalKVis.g:4114:2: rule__LogicalAndExpression__Group_1_1__0__Impl rule__LogicalAndExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKVis.g:4121:1: rule__LogicalAndExpression__Group_1_1__0__Impl : ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__LogicalAndExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4125:1: ( ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKVis.g:4126:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKVis.g:4126:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 ) )
            // InternalKVis.g:4127:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKVis.g:4128:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1_0 )
            // InternalKVis.g:4128:2: rule__LogicalAndExpression__OperatorAssignment_1_1_0
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
    // InternalKVis.g:4138:1: rule__LogicalAndExpression__Group_1_1__1 : rule__LogicalAndExpression__Group_1_1__1__Impl ;
    public final void rule__LogicalAndExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4142:1: ( rule__LogicalAndExpression__Group_1_1__1__Impl )
            // InternalKVis.g:4143:2: rule__LogicalAndExpression__Group_1_1__1__Impl
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
    // InternalKVis.g:4149:1: rule__LogicalAndExpression__Group_1_1__1__Impl : ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__LogicalAndExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4153:1: ( ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKVis.g:4154:1: ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKVis.g:4154:1: ( ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKVis.g:4155:1: ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKVis.g:4156:1: ( rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKVis.g:4156:2: rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKVis.g:4170:1: rule__BitwiseOrExpression__Group__0 : rule__BitwiseOrExpression__Group__0__Impl rule__BitwiseOrExpression__Group__1 ;
    public final void rule__BitwiseOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4174:1: ( rule__BitwiseOrExpression__Group__0__Impl rule__BitwiseOrExpression__Group__1 )
            // InternalKVis.g:4175:2: rule__BitwiseOrExpression__Group__0__Impl rule__BitwiseOrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalKVis.g:4182:1: rule__BitwiseOrExpression__Group__0__Impl : ( ruleBitwiseAndExpression ) ;
    public final void rule__BitwiseOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4186:1: ( ( ruleBitwiseAndExpression ) )
            // InternalKVis.g:4187:1: ( ruleBitwiseAndExpression )
            {
            // InternalKVis.g:4187:1: ( ruleBitwiseAndExpression )
            // InternalKVis.g:4188:1: ruleBitwiseAndExpression
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
    // InternalKVis.g:4199:1: rule__BitwiseOrExpression__Group__1 : rule__BitwiseOrExpression__Group__1__Impl ;
    public final void rule__BitwiseOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4203:1: ( rule__BitwiseOrExpression__Group__1__Impl )
            // InternalKVis.g:4204:2: rule__BitwiseOrExpression__Group__1__Impl
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
    // InternalKVis.g:4210:1: rule__BitwiseOrExpression__Group__1__Impl : ( ( rule__BitwiseOrExpression__Group_1__0 )? ) ;
    public final void rule__BitwiseOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4214:1: ( ( ( rule__BitwiseOrExpression__Group_1__0 )? ) )
            // InternalKVis.g:4215:1: ( ( rule__BitwiseOrExpression__Group_1__0 )? )
            {
            // InternalKVis.g:4215:1: ( ( rule__BitwiseOrExpression__Group_1__0 )? )
            // InternalKVis.g:4216:1: ( rule__BitwiseOrExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1()); 
            }
            // InternalKVis.g:4217:1: ( rule__BitwiseOrExpression__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==18) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKVis.g:4217:2: rule__BitwiseOrExpression__Group_1__0
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
    // InternalKVis.g:4231:1: rule__BitwiseOrExpression__Group_1__0 : rule__BitwiseOrExpression__Group_1__0__Impl rule__BitwiseOrExpression__Group_1__1 ;
    public final void rule__BitwiseOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4235:1: ( rule__BitwiseOrExpression__Group_1__0__Impl rule__BitwiseOrExpression__Group_1__1 )
            // InternalKVis.g:4236:2: rule__BitwiseOrExpression__Group_1__0__Impl rule__BitwiseOrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalKVis.g:4243:1: rule__BitwiseOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BitwiseOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4247:1: ( ( () ) )
            // InternalKVis.g:4248:1: ( () )
            {
            // InternalKVis.g:4248:1: ( () )
            // InternalKVis.g:4249:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKVis.g:4250:1: ()
            // InternalKVis.g:4252:1: 
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
    // InternalKVis.g:4262:1: rule__BitwiseOrExpression__Group_1__1 : rule__BitwiseOrExpression__Group_1__1__Impl ;
    public final void rule__BitwiseOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4266:1: ( rule__BitwiseOrExpression__Group_1__1__Impl )
            // InternalKVis.g:4267:2: rule__BitwiseOrExpression__Group_1__1__Impl
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
    // InternalKVis.g:4273:1: rule__BitwiseOrExpression__Group_1__1__Impl : ( ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ( ( rule__BitwiseOrExpression__Group_1_1__0 )* ) ) ;
    public final void rule__BitwiseOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4277:1: ( ( ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ( ( rule__BitwiseOrExpression__Group_1_1__0 )* ) ) )
            // InternalKVis.g:4278:1: ( ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ( ( rule__BitwiseOrExpression__Group_1_1__0 )* ) )
            {
            // InternalKVis.g:4278:1: ( ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ( ( rule__BitwiseOrExpression__Group_1_1__0 )* ) )
            // InternalKVis.g:4279:1: ( ( rule__BitwiseOrExpression__Group_1_1__0 ) ) ( ( rule__BitwiseOrExpression__Group_1_1__0 )* )
            {
            // InternalKVis.g:4279:1: ( ( rule__BitwiseOrExpression__Group_1_1__0 ) )
            // InternalKVis.g:4280:1: ( rule__BitwiseOrExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:4281:1: ( rule__BitwiseOrExpression__Group_1_1__0 )
            // InternalKVis.g:4281:2: rule__BitwiseOrExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__BitwiseOrExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKVis.g:4284:1: ( ( rule__BitwiseOrExpression__Group_1_1__0 )* )
            // InternalKVis.g:4285:1: ( rule__BitwiseOrExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:4286:1: ( rule__BitwiseOrExpression__Group_1_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKVis.g:4286:2: rule__BitwiseOrExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    rule__BitwiseOrExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalKVis.g:4301:1: rule__BitwiseOrExpression__Group_1_1__0 : rule__BitwiseOrExpression__Group_1_1__0__Impl rule__BitwiseOrExpression__Group_1_1__1 ;
    public final void rule__BitwiseOrExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4305:1: ( rule__BitwiseOrExpression__Group_1_1__0__Impl rule__BitwiseOrExpression__Group_1_1__1 )
            // InternalKVis.g:4306:2: rule__BitwiseOrExpression__Group_1_1__0__Impl rule__BitwiseOrExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKVis.g:4313:1: rule__BitwiseOrExpression__Group_1_1__0__Impl : ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__BitwiseOrExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4317:1: ( ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKVis.g:4318:1: ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKVis.g:4318:1: ( ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 ) )
            // InternalKVis.g:4319:1: ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKVis.g:4320:1: ( rule__BitwiseOrExpression__OperatorAssignment_1_1_0 )
            // InternalKVis.g:4320:2: rule__BitwiseOrExpression__OperatorAssignment_1_1_0
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
    // InternalKVis.g:4330:1: rule__BitwiseOrExpression__Group_1_1__1 : rule__BitwiseOrExpression__Group_1_1__1__Impl ;
    public final void rule__BitwiseOrExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4334:1: ( rule__BitwiseOrExpression__Group_1_1__1__Impl )
            // InternalKVis.g:4335:2: rule__BitwiseOrExpression__Group_1_1__1__Impl
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
    // InternalKVis.g:4341:1: rule__BitwiseOrExpression__Group_1_1__1__Impl : ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__BitwiseOrExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4345:1: ( ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKVis.g:4346:1: ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKVis.g:4346:1: ( ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKVis.g:4347:1: ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKVis.g:4348:1: ( rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKVis.g:4348:2: rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKVis.g:4362:1: rule__BitwiseAndExpression__Group__0 : rule__BitwiseAndExpression__Group__0__Impl rule__BitwiseAndExpression__Group__1 ;
    public final void rule__BitwiseAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4366:1: ( rule__BitwiseAndExpression__Group__0__Impl rule__BitwiseAndExpression__Group__1 )
            // InternalKVis.g:4367:2: rule__BitwiseAndExpression__Group__0__Impl rule__BitwiseAndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
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
    // InternalKVis.g:4374:1: rule__BitwiseAndExpression__Group__0__Impl : ( ruleCompareOperation ) ;
    public final void rule__BitwiseAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4378:1: ( ( ruleCompareOperation ) )
            // InternalKVis.g:4379:1: ( ruleCompareOperation )
            {
            // InternalKVis.g:4379:1: ( ruleCompareOperation )
            // InternalKVis.g:4380:1: ruleCompareOperation
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
    // InternalKVis.g:4391:1: rule__BitwiseAndExpression__Group__1 : rule__BitwiseAndExpression__Group__1__Impl ;
    public final void rule__BitwiseAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4395:1: ( rule__BitwiseAndExpression__Group__1__Impl )
            // InternalKVis.g:4396:2: rule__BitwiseAndExpression__Group__1__Impl
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
    // InternalKVis.g:4402:1: rule__BitwiseAndExpression__Group__1__Impl : ( ( rule__BitwiseAndExpression__Group_1__0 )? ) ;
    public final void rule__BitwiseAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4406:1: ( ( ( rule__BitwiseAndExpression__Group_1__0 )? ) )
            // InternalKVis.g:4407:1: ( ( rule__BitwiseAndExpression__Group_1__0 )? )
            {
            // InternalKVis.g:4407:1: ( ( rule__BitwiseAndExpression__Group_1__0 )? )
            // InternalKVis.g:4408:1: ( rule__BitwiseAndExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1()); 
            }
            // InternalKVis.g:4409:1: ( rule__BitwiseAndExpression__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==19) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKVis.g:4409:2: rule__BitwiseAndExpression__Group_1__0
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
    // InternalKVis.g:4423:1: rule__BitwiseAndExpression__Group_1__0 : rule__BitwiseAndExpression__Group_1__0__Impl rule__BitwiseAndExpression__Group_1__1 ;
    public final void rule__BitwiseAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4427:1: ( rule__BitwiseAndExpression__Group_1__0__Impl rule__BitwiseAndExpression__Group_1__1 )
            // InternalKVis.g:4428:2: rule__BitwiseAndExpression__Group_1__0__Impl rule__BitwiseAndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
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
    // InternalKVis.g:4435:1: rule__BitwiseAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__BitwiseAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4439:1: ( ( () ) )
            // InternalKVis.g:4440:1: ( () )
            {
            // InternalKVis.g:4440:1: ( () )
            // InternalKVis.g:4441:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKVis.g:4442:1: ()
            // InternalKVis.g:4444:1: 
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
    // InternalKVis.g:4454:1: rule__BitwiseAndExpression__Group_1__1 : rule__BitwiseAndExpression__Group_1__1__Impl ;
    public final void rule__BitwiseAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4458:1: ( rule__BitwiseAndExpression__Group_1__1__Impl )
            // InternalKVis.g:4459:2: rule__BitwiseAndExpression__Group_1__1__Impl
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
    // InternalKVis.g:4465:1: rule__BitwiseAndExpression__Group_1__1__Impl : ( ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ( ( rule__BitwiseAndExpression__Group_1_1__0 )* ) ) ;
    public final void rule__BitwiseAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4469:1: ( ( ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ( ( rule__BitwiseAndExpression__Group_1_1__0 )* ) ) )
            // InternalKVis.g:4470:1: ( ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ( ( rule__BitwiseAndExpression__Group_1_1__0 )* ) )
            {
            // InternalKVis.g:4470:1: ( ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ( ( rule__BitwiseAndExpression__Group_1_1__0 )* ) )
            // InternalKVis.g:4471:1: ( ( rule__BitwiseAndExpression__Group_1_1__0 ) ) ( ( rule__BitwiseAndExpression__Group_1_1__0 )* )
            {
            // InternalKVis.g:4471:1: ( ( rule__BitwiseAndExpression__Group_1_1__0 ) )
            // InternalKVis.g:4472:1: ( rule__BitwiseAndExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:4473:1: ( rule__BitwiseAndExpression__Group_1_1__0 )
            // InternalKVis.g:4473:2: rule__BitwiseAndExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__BitwiseAndExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKVis.g:4476:1: ( ( rule__BitwiseAndExpression__Group_1_1__0 )* )
            // InternalKVis.g:4477:1: ( rule__BitwiseAndExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:4478:1: ( rule__BitwiseAndExpression__Group_1_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==19) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalKVis.g:4478:2: rule__BitwiseAndExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_37);
            	    rule__BitwiseAndExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalKVis.g:4493:1: rule__BitwiseAndExpression__Group_1_1__0 : rule__BitwiseAndExpression__Group_1_1__0__Impl rule__BitwiseAndExpression__Group_1_1__1 ;
    public final void rule__BitwiseAndExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4497:1: ( rule__BitwiseAndExpression__Group_1_1__0__Impl rule__BitwiseAndExpression__Group_1_1__1 )
            // InternalKVis.g:4498:2: rule__BitwiseAndExpression__Group_1_1__0__Impl rule__BitwiseAndExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKVis.g:4505:1: rule__BitwiseAndExpression__Group_1_1__0__Impl : ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__BitwiseAndExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4509:1: ( ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKVis.g:4510:1: ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKVis.g:4510:1: ( ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 ) )
            // InternalKVis.g:4511:1: ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKVis.g:4512:1: ( rule__BitwiseAndExpression__OperatorAssignment_1_1_0 )
            // InternalKVis.g:4512:2: rule__BitwiseAndExpression__OperatorAssignment_1_1_0
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
    // InternalKVis.g:4522:1: rule__BitwiseAndExpression__Group_1_1__1 : rule__BitwiseAndExpression__Group_1_1__1__Impl ;
    public final void rule__BitwiseAndExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4526:1: ( rule__BitwiseAndExpression__Group_1_1__1__Impl )
            // InternalKVis.g:4527:2: rule__BitwiseAndExpression__Group_1_1__1__Impl
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
    // InternalKVis.g:4533:1: rule__BitwiseAndExpression__Group_1_1__1__Impl : ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__BitwiseAndExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4537:1: ( ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKVis.g:4538:1: ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKVis.g:4538:1: ( ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKVis.g:4539:1: ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKVis.g:4540:1: ( rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKVis.g:4540:2: rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKVis.g:4554:1: rule__CompareOperation__Group__0 : rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 ;
    public final void rule__CompareOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4558:1: ( rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1 )
            // InternalKVis.g:4559:2: rule__CompareOperation__Group__0__Impl rule__CompareOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_38);
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
    // InternalKVis.g:4566:1: rule__CompareOperation__Group__0__Impl : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4570:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKVis.g:4571:1: ( ruleNotOrValuedExpression )
            {
            // InternalKVis.g:4571:1: ( ruleNotOrValuedExpression )
            // InternalKVis.g:4572:1: ruleNotOrValuedExpression
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
    // InternalKVis.g:4583:1: rule__CompareOperation__Group__1 : rule__CompareOperation__Group__1__Impl ;
    public final void rule__CompareOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4587:1: ( rule__CompareOperation__Group__1__Impl )
            // InternalKVis.g:4588:2: rule__CompareOperation__Group__1__Impl
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
    // InternalKVis.g:4594:1: rule__CompareOperation__Group__1__Impl : ( ( rule__CompareOperation__Group_1__0 )? ) ;
    public final void rule__CompareOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4598:1: ( ( ( rule__CompareOperation__Group_1__0 )? ) )
            // InternalKVis.g:4599:1: ( ( rule__CompareOperation__Group_1__0 )? )
            {
            // InternalKVis.g:4599:1: ( ( rule__CompareOperation__Group_1__0 )? )
            // InternalKVis.g:4600:1: ( rule__CompareOperation__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getGroup_1()); 
            }
            // InternalKVis.g:4601:1: ( rule__CompareOperation__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=29 && LA34_0<=34)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKVis.g:4601:2: rule__CompareOperation__Group_1__0
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
    // InternalKVis.g:4615:1: rule__CompareOperation__Group_1__0 : rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 ;
    public final void rule__CompareOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4619:1: ( rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1 )
            // InternalKVis.g:4620:2: rule__CompareOperation__Group_1__0__Impl rule__CompareOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_38);
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
    // InternalKVis.g:4627:1: rule__CompareOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__CompareOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4631:1: ( ( () ) )
            // InternalKVis.g:4632:1: ( () )
            {
            // InternalKVis.g:4632:1: ( () )
            // InternalKVis.g:4633:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKVis.g:4634:1: ()
            // InternalKVis.g:4636:1: 
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
    // InternalKVis.g:4646:1: rule__CompareOperation__Group_1__1 : rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 ;
    public final void rule__CompareOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4650:1: ( rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2 )
            // InternalKVis.g:4651:2: rule__CompareOperation__Group_1__1__Impl rule__CompareOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKVis.g:4658:1: rule__CompareOperation__Group_1__1__Impl : ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__CompareOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4662:1: ( ( ( rule__CompareOperation__OperatorAssignment_1_1 ) ) )
            // InternalKVis.g:4663:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            {
            // InternalKVis.g:4663:1: ( ( rule__CompareOperation__OperatorAssignment_1_1 ) )
            // InternalKVis.g:4664:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getOperatorAssignment_1_1()); 
            }
            // InternalKVis.g:4665:1: ( rule__CompareOperation__OperatorAssignment_1_1 )
            // InternalKVis.g:4665:2: rule__CompareOperation__OperatorAssignment_1_1
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
    // InternalKVis.g:4675:1: rule__CompareOperation__Group_1__2 : rule__CompareOperation__Group_1__2__Impl ;
    public final void rule__CompareOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4679:1: ( rule__CompareOperation__Group_1__2__Impl )
            // InternalKVis.g:4680:2: rule__CompareOperation__Group_1__2__Impl
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
    // InternalKVis.g:4686:1: rule__CompareOperation__Group_1__2__Impl : ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) ;
    public final void rule__CompareOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4690:1: ( ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) ) )
            // InternalKVis.g:4691:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            {
            // InternalKVis.g:4691:1: ( ( rule__CompareOperation__SubExpressionsAssignment_1_2 ) )
            // InternalKVis.g:4692:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperationAccess().getSubExpressionsAssignment_1_2()); 
            }
            // InternalKVis.g:4693:1: ( rule__CompareOperation__SubExpressionsAssignment_1_2 )
            // InternalKVis.g:4693:2: rule__CompareOperation__SubExpressionsAssignment_1_2
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
    // InternalKVis.g:4709:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4713:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // InternalKVis.g:4714:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
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
    // InternalKVis.g:4721:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4725:1: ( ( () ) )
            // InternalKVis.g:4726:1: ( () )
            {
            // InternalKVis.g:4726:1: ( () )
            // InternalKVis.g:4727:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKVis.g:4728:1: ()
            // InternalKVis.g:4730:1: 
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
    // InternalKVis.g:4740:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4744:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // InternalKVis.g:4745:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKVis.g:4752:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4756:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // InternalKVis.g:4757:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKVis.g:4757:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // InternalKVis.g:4758:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKVis.g:4759:1: ( rule__NotExpression__OperatorAssignment_0_1 )
            // InternalKVis.g:4759:2: rule__NotExpression__OperatorAssignment_0_1
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
    // InternalKVis.g:4769:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4773:1: ( rule__NotExpression__Group_0__2__Impl )
            // InternalKVis.g:4774:2: rule__NotExpression__Group_0__2__Impl
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
    // InternalKVis.g:4780:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4784:1: ( ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKVis.g:4785:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKVis.g:4785:1: ( ( rule__NotExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKVis.g:4786:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKVis.g:4787:1: ( rule__NotExpression__SubExpressionsAssignment_0_2 )
            // InternalKVis.g:4787:2: rule__NotExpression__SubExpressionsAssignment_0_2
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
    // InternalKVis.g:4803:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4807:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // InternalKVis.g:4808:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
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
    // InternalKVis.g:4815:1: rule__AddExpression__Group__0__Impl : ( ruleSubExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4819:1: ( ( ruleSubExpression ) )
            // InternalKVis.g:4820:1: ( ruleSubExpression )
            {
            // InternalKVis.g:4820:1: ( ruleSubExpression )
            // InternalKVis.g:4821:1: ruleSubExpression
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
    // InternalKVis.g:4832:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4836:1: ( rule__AddExpression__Group__1__Impl )
            // InternalKVis.g:4837:2: rule__AddExpression__Group__1__Impl
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
    // InternalKVis.g:4843:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )? ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4847:1: ( ( ( rule__AddExpression__Group_1__0 )? ) )
            // InternalKVis.g:4848:1: ( ( rule__AddExpression__Group_1__0 )? )
            {
            // InternalKVis.g:4848:1: ( ( rule__AddExpression__Group_1__0 )? )
            // InternalKVis.g:4849:1: ( rule__AddExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            }
            // InternalKVis.g:4850:1: ( rule__AddExpression__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==21) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKVis.g:4850:2: rule__AddExpression__Group_1__0
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
    // InternalKVis.g:4864:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4868:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // InternalKVis.g:4869:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
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
    // InternalKVis.g:4876:1: rule__AddExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4880:1: ( ( () ) )
            // InternalKVis.g:4881:1: ( () )
            {
            // InternalKVis.g:4881:1: ( () )
            // InternalKVis.g:4882:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKVis.g:4883:1: ()
            // InternalKVis.g:4885:1: 
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
    // InternalKVis.g:4895:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4899:1: ( rule__AddExpression__Group_1__1__Impl )
            // InternalKVis.g:4900:2: rule__AddExpression__Group_1__1__Impl
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
    // InternalKVis.g:4906:1: rule__AddExpression__Group_1__1__Impl : ( ( ( rule__AddExpression__Group_1_1__0 ) ) ( ( rule__AddExpression__Group_1_1__0 )* ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4910:1: ( ( ( ( rule__AddExpression__Group_1_1__0 ) ) ( ( rule__AddExpression__Group_1_1__0 )* ) ) )
            // InternalKVis.g:4911:1: ( ( ( rule__AddExpression__Group_1_1__0 ) ) ( ( rule__AddExpression__Group_1_1__0 )* ) )
            {
            // InternalKVis.g:4911:1: ( ( ( rule__AddExpression__Group_1_1__0 ) ) ( ( rule__AddExpression__Group_1_1__0 )* ) )
            // InternalKVis.g:4912:1: ( ( rule__AddExpression__Group_1_1__0 ) ) ( ( rule__AddExpression__Group_1_1__0 )* )
            {
            // InternalKVis.g:4912:1: ( ( rule__AddExpression__Group_1_1__0 ) )
            // InternalKVis.g:4913:1: ( rule__AddExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:4914:1: ( rule__AddExpression__Group_1_1__0 )
            // InternalKVis.g:4914:2: rule__AddExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__AddExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKVis.g:4917:1: ( ( rule__AddExpression__Group_1_1__0 )* )
            // InternalKVis.g:4918:1: ( rule__AddExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:4919:1: ( rule__AddExpression__Group_1_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==21) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalKVis.g:4919:2: rule__AddExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    rule__AddExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalKVis.g:4934:1: rule__AddExpression__Group_1_1__0 : rule__AddExpression__Group_1_1__0__Impl rule__AddExpression__Group_1_1__1 ;
    public final void rule__AddExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4938:1: ( rule__AddExpression__Group_1_1__0__Impl rule__AddExpression__Group_1_1__1 )
            // InternalKVis.g:4939:2: rule__AddExpression__Group_1_1__0__Impl rule__AddExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalKVis.g:4946:1: rule__AddExpression__Group_1_1__0__Impl : ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__AddExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4950:1: ( ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKVis.g:4951:1: ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKVis.g:4951:1: ( ( rule__AddExpression__OperatorAssignment_1_1_0 ) )
            // InternalKVis.g:4952:1: ( rule__AddExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKVis.g:4953:1: ( rule__AddExpression__OperatorAssignment_1_1_0 )
            // InternalKVis.g:4953:2: rule__AddExpression__OperatorAssignment_1_1_0
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
    // InternalKVis.g:4963:1: rule__AddExpression__Group_1_1__1 : rule__AddExpression__Group_1_1__1__Impl ;
    public final void rule__AddExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4967:1: ( rule__AddExpression__Group_1_1__1__Impl )
            // InternalKVis.g:4968:2: rule__AddExpression__Group_1_1__1__Impl
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
    // InternalKVis.g:4974:1: rule__AddExpression__Group_1_1__1__Impl : ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__AddExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4978:1: ( ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKVis.g:4979:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKVis.g:4979:1: ( ( rule__AddExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKVis.g:4980:1: ( rule__AddExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKVis.g:4981:1: ( rule__AddExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKVis.g:4981:2: rule__AddExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKVis.g:4995:1: rule__SubExpression__Group__0 : rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 ;
    public final void rule__SubExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:4999:1: ( rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1 )
            // InternalKVis.g:5000:2: rule__SubExpression__Group__0__Impl rule__SubExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalKVis.g:5007:1: rule__SubExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__SubExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5011:1: ( ( ruleMultExpression ) )
            // InternalKVis.g:5012:1: ( ruleMultExpression )
            {
            // InternalKVis.g:5012:1: ( ruleMultExpression )
            // InternalKVis.g:5013:1: ruleMultExpression
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
    // InternalKVis.g:5024:1: rule__SubExpression__Group__1 : rule__SubExpression__Group__1__Impl ;
    public final void rule__SubExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5028:1: ( rule__SubExpression__Group__1__Impl )
            // InternalKVis.g:5029:2: rule__SubExpression__Group__1__Impl
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
    // InternalKVis.g:5035:1: rule__SubExpression__Group__1__Impl : ( ( rule__SubExpression__Group_1__0 )? ) ;
    public final void rule__SubExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5039:1: ( ( ( rule__SubExpression__Group_1__0 )? ) )
            // InternalKVis.g:5040:1: ( ( rule__SubExpression__Group_1__0 )? )
            {
            // InternalKVis.g:5040:1: ( ( rule__SubExpression__Group_1__0 )? )
            // InternalKVis.g:5041:1: ( rule__SubExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1()); 
            }
            // InternalKVis.g:5042:1: ( rule__SubExpression__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==16) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKVis.g:5042:2: rule__SubExpression__Group_1__0
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
    // InternalKVis.g:5056:1: rule__SubExpression__Group_1__0 : rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 ;
    public final void rule__SubExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5060:1: ( rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1 )
            // InternalKVis.g:5061:2: rule__SubExpression__Group_1__0__Impl rule__SubExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalKVis.g:5068:1: rule__SubExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SubExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5072:1: ( ( () ) )
            // InternalKVis.g:5073:1: ( () )
            {
            // InternalKVis.g:5073:1: ( () )
            // InternalKVis.g:5074:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKVis.g:5075:1: ()
            // InternalKVis.g:5077:1: 
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
    // InternalKVis.g:5087:1: rule__SubExpression__Group_1__1 : rule__SubExpression__Group_1__1__Impl ;
    public final void rule__SubExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5091:1: ( rule__SubExpression__Group_1__1__Impl )
            // InternalKVis.g:5092:2: rule__SubExpression__Group_1__1__Impl
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
    // InternalKVis.g:5098:1: rule__SubExpression__Group_1__1__Impl : ( ( ( rule__SubExpression__Group_1_1__0 ) ) ( ( rule__SubExpression__Group_1_1__0 )* ) ) ;
    public final void rule__SubExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5102:1: ( ( ( ( rule__SubExpression__Group_1_1__0 ) ) ( ( rule__SubExpression__Group_1_1__0 )* ) ) )
            // InternalKVis.g:5103:1: ( ( ( rule__SubExpression__Group_1_1__0 ) ) ( ( rule__SubExpression__Group_1_1__0 )* ) )
            {
            // InternalKVis.g:5103:1: ( ( ( rule__SubExpression__Group_1_1__0 ) ) ( ( rule__SubExpression__Group_1_1__0 )* ) )
            // InternalKVis.g:5104:1: ( ( rule__SubExpression__Group_1_1__0 ) ) ( ( rule__SubExpression__Group_1_1__0 )* )
            {
            // InternalKVis.g:5104:1: ( ( rule__SubExpression__Group_1_1__0 ) )
            // InternalKVis.g:5105:1: ( rule__SubExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:5106:1: ( rule__SubExpression__Group_1_1__0 )
            // InternalKVis.g:5106:2: rule__SubExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__SubExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKVis.g:5109:1: ( ( rule__SubExpression__Group_1_1__0 )* )
            // InternalKVis.g:5110:1: ( rule__SubExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:5111:1: ( rule__SubExpression__Group_1_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==16) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalKVis.g:5111:2: rule__SubExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_43);
            	    rule__SubExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalKVis.g:5126:1: rule__SubExpression__Group_1_1__0 : rule__SubExpression__Group_1_1__0__Impl rule__SubExpression__Group_1_1__1 ;
    public final void rule__SubExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5130:1: ( rule__SubExpression__Group_1_1__0__Impl rule__SubExpression__Group_1_1__1 )
            // InternalKVis.g:5131:2: rule__SubExpression__Group_1_1__0__Impl rule__SubExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalKVis.g:5138:1: rule__SubExpression__Group_1_1__0__Impl : ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__SubExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5142:1: ( ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKVis.g:5143:1: ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKVis.g:5143:1: ( ( rule__SubExpression__OperatorAssignment_1_1_0 ) )
            // InternalKVis.g:5144:1: ( rule__SubExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKVis.g:5145:1: ( rule__SubExpression__OperatorAssignment_1_1_0 )
            // InternalKVis.g:5145:2: rule__SubExpression__OperatorAssignment_1_1_0
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
    // InternalKVis.g:5155:1: rule__SubExpression__Group_1_1__1 : rule__SubExpression__Group_1_1__1__Impl ;
    public final void rule__SubExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5159:1: ( rule__SubExpression__Group_1_1__1__Impl )
            // InternalKVis.g:5160:2: rule__SubExpression__Group_1_1__1__Impl
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
    // InternalKVis.g:5166:1: rule__SubExpression__Group_1_1__1__Impl : ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__SubExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5170:1: ( ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKVis.g:5171:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKVis.g:5171:1: ( ( rule__SubExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKVis.g:5172:1: ( rule__SubExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKVis.g:5173:1: ( rule__SubExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKVis.g:5173:2: rule__SubExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKVis.g:5187:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5191:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // InternalKVis.g:5192:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKVis.g:5199:1: rule__MultExpression__Group__0__Impl : ( ruleDivExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5203:1: ( ( ruleDivExpression ) )
            // InternalKVis.g:5204:1: ( ruleDivExpression )
            {
            // InternalKVis.g:5204:1: ( ruleDivExpression )
            // InternalKVis.g:5205:1: ruleDivExpression
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
    // InternalKVis.g:5216:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5220:1: ( rule__MultExpression__Group__1__Impl )
            // InternalKVis.g:5221:2: rule__MultExpression__Group__1__Impl
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
    // InternalKVis.g:5227:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )? ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5231:1: ( ( ( rule__MultExpression__Group_1__0 )? ) )
            // InternalKVis.g:5232:1: ( ( rule__MultExpression__Group_1__0 )? )
            {
            // InternalKVis.g:5232:1: ( ( rule__MultExpression__Group_1__0 )? )
            // InternalKVis.g:5233:1: ( rule__MultExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            }
            // InternalKVis.g:5234:1: ( rule__MultExpression__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==22) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKVis.g:5234:2: rule__MultExpression__Group_1__0
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
    // InternalKVis.g:5248:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5252:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // InternalKVis.g:5253:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalKVis.g:5260:1: rule__MultExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5264:1: ( ( () ) )
            // InternalKVis.g:5265:1: ( () )
            {
            // InternalKVis.g:5265:1: ( () )
            // InternalKVis.g:5266:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKVis.g:5267:1: ()
            // InternalKVis.g:5269:1: 
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
    // InternalKVis.g:5279:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5283:1: ( rule__MultExpression__Group_1__1__Impl )
            // InternalKVis.g:5284:2: rule__MultExpression__Group_1__1__Impl
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
    // InternalKVis.g:5290:1: rule__MultExpression__Group_1__1__Impl : ( ( ( rule__MultExpression__Group_1_1__0 ) ) ( ( rule__MultExpression__Group_1_1__0 )* ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5294:1: ( ( ( ( rule__MultExpression__Group_1_1__0 ) ) ( ( rule__MultExpression__Group_1_1__0 )* ) ) )
            // InternalKVis.g:5295:1: ( ( ( rule__MultExpression__Group_1_1__0 ) ) ( ( rule__MultExpression__Group_1_1__0 )* ) )
            {
            // InternalKVis.g:5295:1: ( ( ( rule__MultExpression__Group_1_1__0 ) ) ( ( rule__MultExpression__Group_1_1__0 )* ) )
            // InternalKVis.g:5296:1: ( ( rule__MultExpression__Group_1_1__0 ) ) ( ( rule__MultExpression__Group_1_1__0 )* )
            {
            // InternalKVis.g:5296:1: ( ( rule__MultExpression__Group_1_1__0 ) )
            // InternalKVis.g:5297:1: ( rule__MultExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:5298:1: ( rule__MultExpression__Group_1_1__0 )
            // InternalKVis.g:5298:2: rule__MultExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_45);
            rule__MultExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKVis.g:5301:1: ( ( rule__MultExpression__Group_1_1__0 )* )
            // InternalKVis.g:5302:1: ( rule__MultExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:5303:1: ( rule__MultExpression__Group_1_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==22) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalKVis.g:5303:2: rule__MultExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_45);
            	    rule__MultExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalKVis.g:5318:1: rule__MultExpression__Group_1_1__0 : rule__MultExpression__Group_1_1__0__Impl rule__MultExpression__Group_1_1__1 ;
    public final void rule__MultExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5322:1: ( rule__MultExpression__Group_1_1__0__Impl rule__MultExpression__Group_1_1__1 )
            // InternalKVis.g:5323:2: rule__MultExpression__Group_1_1__0__Impl rule__MultExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalKVis.g:5330:1: rule__MultExpression__Group_1_1__0__Impl : ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__MultExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5334:1: ( ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKVis.g:5335:1: ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKVis.g:5335:1: ( ( rule__MultExpression__OperatorAssignment_1_1_0 ) )
            // InternalKVis.g:5336:1: ( rule__MultExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKVis.g:5337:1: ( rule__MultExpression__OperatorAssignment_1_1_0 )
            // InternalKVis.g:5337:2: rule__MultExpression__OperatorAssignment_1_1_0
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
    // InternalKVis.g:5347:1: rule__MultExpression__Group_1_1__1 : rule__MultExpression__Group_1_1__1__Impl ;
    public final void rule__MultExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5351:1: ( rule__MultExpression__Group_1_1__1__Impl )
            // InternalKVis.g:5352:2: rule__MultExpression__Group_1_1__1__Impl
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
    // InternalKVis.g:5358:1: rule__MultExpression__Group_1_1__1__Impl : ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__MultExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5362:1: ( ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKVis.g:5363:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKVis.g:5363:1: ( ( rule__MultExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKVis.g:5364:1: ( rule__MultExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKVis.g:5365:1: ( rule__MultExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKVis.g:5365:2: rule__MultExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKVis.g:5379:1: rule__DivExpression__Group__0 : rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 ;
    public final void rule__DivExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5383:1: ( rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1 )
            // InternalKVis.g:5384:2: rule__DivExpression__Group__0__Impl rule__DivExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
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
    // InternalKVis.g:5391:1: rule__DivExpression__Group__0__Impl : ( ruleModExpression ) ;
    public final void rule__DivExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5395:1: ( ( ruleModExpression ) )
            // InternalKVis.g:5396:1: ( ruleModExpression )
            {
            // InternalKVis.g:5396:1: ( ruleModExpression )
            // InternalKVis.g:5397:1: ruleModExpression
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
    // InternalKVis.g:5408:1: rule__DivExpression__Group__1 : rule__DivExpression__Group__1__Impl ;
    public final void rule__DivExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5412:1: ( rule__DivExpression__Group__1__Impl )
            // InternalKVis.g:5413:2: rule__DivExpression__Group__1__Impl
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
    // InternalKVis.g:5419:1: rule__DivExpression__Group__1__Impl : ( ( rule__DivExpression__Group_1__0 )? ) ;
    public final void rule__DivExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5423:1: ( ( ( rule__DivExpression__Group_1__0 )? ) )
            // InternalKVis.g:5424:1: ( ( rule__DivExpression__Group_1__0 )? )
            {
            // InternalKVis.g:5424:1: ( ( rule__DivExpression__Group_1__0 )? )
            // InternalKVis.g:5425:1: ( rule__DivExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1()); 
            }
            // InternalKVis.g:5426:1: ( rule__DivExpression__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==24) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalKVis.g:5426:2: rule__DivExpression__Group_1__0
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
    // InternalKVis.g:5440:1: rule__DivExpression__Group_1__0 : rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 ;
    public final void rule__DivExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5444:1: ( rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1 )
            // InternalKVis.g:5445:2: rule__DivExpression__Group_1__0__Impl rule__DivExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
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
    // InternalKVis.g:5452:1: rule__DivExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DivExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5456:1: ( ( () ) )
            // InternalKVis.g:5457:1: ( () )
            {
            // InternalKVis.g:5457:1: ( () )
            // InternalKVis.g:5458:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKVis.g:5459:1: ()
            // InternalKVis.g:5461:1: 
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
    // InternalKVis.g:5471:1: rule__DivExpression__Group_1__1 : rule__DivExpression__Group_1__1__Impl ;
    public final void rule__DivExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5475:1: ( rule__DivExpression__Group_1__1__Impl )
            // InternalKVis.g:5476:2: rule__DivExpression__Group_1__1__Impl
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
    // InternalKVis.g:5482:1: rule__DivExpression__Group_1__1__Impl : ( ( ( rule__DivExpression__Group_1_1__0 ) ) ( ( rule__DivExpression__Group_1_1__0 )* ) ) ;
    public final void rule__DivExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5486:1: ( ( ( ( rule__DivExpression__Group_1_1__0 ) ) ( ( rule__DivExpression__Group_1_1__0 )* ) ) )
            // InternalKVis.g:5487:1: ( ( ( rule__DivExpression__Group_1_1__0 ) ) ( ( rule__DivExpression__Group_1_1__0 )* ) )
            {
            // InternalKVis.g:5487:1: ( ( ( rule__DivExpression__Group_1_1__0 ) ) ( ( rule__DivExpression__Group_1_1__0 )* ) )
            // InternalKVis.g:5488:1: ( ( rule__DivExpression__Group_1_1__0 ) ) ( ( rule__DivExpression__Group_1_1__0 )* )
            {
            // InternalKVis.g:5488:1: ( ( rule__DivExpression__Group_1_1__0 ) )
            // InternalKVis.g:5489:1: ( rule__DivExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:5490:1: ( rule__DivExpression__Group_1_1__0 )
            // InternalKVis.g:5490:2: rule__DivExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_47);
            rule__DivExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKVis.g:5493:1: ( ( rule__DivExpression__Group_1_1__0 )* )
            // InternalKVis.g:5494:1: ( rule__DivExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:5495:1: ( rule__DivExpression__Group_1_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==24) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalKVis.g:5495:2: rule__DivExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_47);
            	    rule__DivExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalKVis.g:5510:1: rule__DivExpression__Group_1_1__0 : rule__DivExpression__Group_1_1__0__Impl rule__DivExpression__Group_1_1__1 ;
    public final void rule__DivExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5514:1: ( rule__DivExpression__Group_1_1__0__Impl rule__DivExpression__Group_1_1__1 )
            // InternalKVis.g:5515:2: rule__DivExpression__Group_1_1__0__Impl rule__DivExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalKVis.g:5522:1: rule__DivExpression__Group_1_1__0__Impl : ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__DivExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5526:1: ( ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKVis.g:5527:1: ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKVis.g:5527:1: ( ( rule__DivExpression__OperatorAssignment_1_1_0 ) )
            // InternalKVis.g:5528:1: ( rule__DivExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKVis.g:5529:1: ( rule__DivExpression__OperatorAssignment_1_1_0 )
            // InternalKVis.g:5529:2: rule__DivExpression__OperatorAssignment_1_1_0
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
    // InternalKVis.g:5539:1: rule__DivExpression__Group_1_1__1 : rule__DivExpression__Group_1_1__1__Impl ;
    public final void rule__DivExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5543:1: ( rule__DivExpression__Group_1_1__1__Impl )
            // InternalKVis.g:5544:2: rule__DivExpression__Group_1_1__1__Impl
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
    // InternalKVis.g:5550:1: rule__DivExpression__Group_1_1__1__Impl : ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__DivExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5554:1: ( ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKVis.g:5555:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKVis.g:5555:1: ( ( rule__DivExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKVis.g:5556:1: ( rule__DivExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKVis.g:5557:1: ( rule__DivExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKVis.g:5557:2: rule__DivExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKVis.g:5571:1: rule__ModExpression__Group__0 : rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 ;
    public final void rule__ModExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5575:1: ( rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1 )
            // InternalKVis.g:5576:2: rule__ModExpression__Group__0__Impl rule__ModExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_48);
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
    // InternalKVis.g:5583:1: rule__ModExpression__Group__0__Impl : ( ruleNegExpression ) ;
    public final void rule__ModExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5587:1: ( ( ruleNegExpression ) )
            // InternalKVis.g:5588:1: ( ruleNegExpression )
            {
            // InternalKVis.g:5588:1: ( ruleNegExpression )
            // InternalKVis.g:5589:1: ruleNegExpression
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
    // InternalKVis.g:5600:1: rule__ModExpression__Group__1 : rule__ModExpression__Group__1__Impl ;
    public final void rule__ModExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5604:1: ( rule__ModExpression__Group__1__Impl )
            // InternalKVis.g:5605:2: rule__ModExpression__Group__1__Impl
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
    // InternalKVis.g:5611:1: rule__ModExpression__Group__1__Impl : ( ( rule__ModExpression__Group_1__0 )? ) ;
    public final void rule__ModExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5615:1: ( ( ( rule__ModExpression__Group_1__0 )? ) )
            // InternalKVis.g:5616:1: ( ( rule__ModExpression__Group_1__0 )? )
            {
            // InternalKVis.g:5616:1: ( ( rule__ModExpression__Group_1__0 )? )
            // InternalKVis.g:5617:1: ( rule__ModExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1()); 
            }
            // InternalKVis.g:5618:1: ( rule__ModExpression__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==23) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalKVis.g:5618:2: rule__ModExpression__Group_1__0
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
    // InternalKVis.g:5632:1: rule__ModExpression__Group_1__0 : rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 ;
    public final void rule__ModExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5636:1: ( rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1 )
            // InternalKVis.g:5637:2: rule__ModExpression__Group_1__0__Impl rule__ModExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_48);
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
    // InternalKVis.g:5644:1: rule__ModExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ModExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5648:1: ( ( () ) )
            // InternalKVis.g:5649:1: ( () )
            {
            // InternalKVis.g:5649:1: ( () )
            // InternalKVis.g:5650:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()); 
            }
            // InternalKVis.g:5651:1: ()
            // InternalKVis.g:5653:1: 
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
    // InternalKVis.g:5663:1: rule__ModExpression__Group_1__1 : rule__ModExpression__Group_1__1__Impl ;
    public final void rule__ModExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5667:1: ( rule__ModExpression__Group_1__1__Impl )
            // InternalKVis.g:5668:2: rule__ModExpression__Group_1__1__Impl
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
    // InternalKVis.g:5674:1: rule__ModExpression__Group_1__1__Impl : ( ( ( rule__ModExpression__Group_1_1__0 ) ) ( ( rule__ModExpression__Group_1_1__0 )* ) ) ;
    public final void rule__ModExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5678:1: ( ( ( ( rule__ModExpression__Group_1_1__0 ) ) ( ( rule__ModExpression__Group_1_1__0 )* ) ) )
            // InternalKVis.g:5679:1: ( ( ( rule__ModExpression__Group_1_1__0 ) ) ( ( rule__ModExpression__Group_1_1__0 )* ) )
            {
            // InternalKVis.g:5679:1: ( ( ( rule__ModExpression__Group_1_1__0 ) ) ( ( rule__ModExpression__Group_1_1__0 )* ) )
            // InternalKVis.g:5680:1: ( ( rule__ModExpression__Group_1_1__0 ) ) ( ( rule__ModExpression__Group_1_1__0 )* )
            {
            // InternalKVis.g:5680:1: ( ( rule__ModExpression__Group_1_1__0 ) )
            // InternalKVis.g:5681:1: ( rule__ModExpression__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:5682:1: ( rule__ModExpression__Group_1_1__0 )
            // InternalKVis.g:5682:2: rule__ModExpression__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_49);
            rule__ModExpression__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModExpressionAccess().getGroup_1_1()); 
            }

            }

            // InternalKVis.g:5685:1: ( ( rule__ModExpression__Group_1_1__0 )* )
            // InternalKVis.g:5686:1: ( rule__ModExpression__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getGroup_1_1()); 
            }
            // InternalKVis.g:5687:1: ( rule__ModExpression__Group_1_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==23) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalKVis.g:5687:2: rule__ModExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_49);
            	    rule__ModExpression__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalKVis.g:5702:1: rule__ModExpression__Group_1_1__0 : rule__ModExpression__Group_1_1__0__Impl rule__ModExpression__Group_1_1__1 ;
    public final void rule__ModExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5706:1: ( rule__ModExpression__Group_1_1__0__Impl rule__ModExpression__Group_1_1__1 )
            // InternalKVis.g:5707:2: rule__ModExpression__Group_1_1__0__Impl rule__ModExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalKVis.g:5714:1: rule__ModExpression__Group_1_1__0__Impl : ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) ) ;
    public final void rule__ModExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5718:1: ( ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) ) )
            // InternalKVis.g:5719:1: ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) )
            {
            // InternalKVis.g:5719:1: ( ( rule__ModExpression__OperatorAssignment_1_1_0 ) )
            // InternalKVis.g:5720:1: ( rule__ModExpression__OperatorAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getOperatorAssignment_1_1_0()); 
            }
            // InternalKVis.g:5721:1: ( rule__ModExpression__OperatorAssignment_1_1_0 )
            // InternalKVis.g:5721:2: rule__ModExpression__OperatorAssignment_1_1_0
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
    // InternalKVis.g:5731:1: rule__ModExpression__Group_1_1__1 : rule__ModExpression__Group_1_1__1__Impl ;
    public final void rule__ModExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5735:1: ( rule__ModExpression__Group_1_1__1__Impl )
            // InternalKVis.g:5736:2: rule__ModExpression__Group_1_1__1__Impl
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
    // InternalKVis.g:5742:1: rule__ModExpression__Group_1_1__1__Impl : ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) ) ;
    public final void rule__ModExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5746:1: ( ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) ) )
            // InternalKVis.g:5747:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) )
            {
            // InternalKVis.g:5747:1: ( ( rule__ModExpression__SubExpressionsAssignment_1_1_1 ) )
            // InternalKVis.g:5748:1: ( rule__ModExpression__SubExpressionsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModExpressionAccess().getSubExpressionsAssignment_1_1_1()); 
            }
            // InternalKVis.g:5749:1: ( rule__ModExpression__SubExpressionsAssignment_1_1_1 )
            // InternalKVis.g:5749:2: rule__ModExpression__SubExpressionsAssignment_1_1_1
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
    // InternalKVis.g:5763:1: rule__NegExpression__Group_0__0 : rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 ;
    public final void rule__NegExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5767:1: ( rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1 )
            // InternalKVis.g:5768:2: rule__NegExpression__Group_0__0__Impl rule__NegExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalKVis.g:5775:1: rule__NegExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NegExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5779:1: ( ( () ) )
            // InternalKVis.g:5780:1: ( () )
            {
            // InternalKVis.g:5780:1: ( () )
            // InternalKVis.g:5781:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKVis.g:5782:1: ()
            // InternalKVis.g:5784:1: 
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
    // InternalKVis.g:5794:1: rule__NegExpression__Group_0__1 : rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 ;
    public final void rule__NegExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5798:1: ( rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2 )
            // InternalKVis.g:5799:2: rule__NegExpression__Group_0__1__Impl rule__NegExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalKVis.g:5806:1: rule__NegExpression__Group_0__1__Impl : ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NegExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5810:1: ( ( ( rule__NegExpression__OperatorAssignment_0_1 ) ) )
            // InternalKVis.g:5811:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKVis.g:5811:1: ( ( rule__NegExpression__OperatorAssignment_0_1 ) )
            // InternalKVis.g:5812:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKVis.g:5813:1: ( rule__NegExpression__OperatorAssignment_0_1 )
            // InternalKVis.g:5813:2: rule__NegExpression__OperatorAssignment_0_1
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
    // InternalKVis.g:5823:1: rule__NegExpression__Group_0__2 : rule__NegExpression__Group_0__2__Impl ;
    public final void rule__NegExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5827:1: ( rule__NegExpression__Group_0__2__Impl )
            // InternalKVis.g:5828:2: rule__NegExpression__Group_0__2__Impl
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
    // InternalKVis.g:5834:1: rule__NegExpression__Group_0__2__Impl : ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) ;
    public final void rule__NegExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5838:1: ( ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) ) )
            // InternalKVis.g:5839:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            {
            // InternalKVis.g:5839:1: ( ( rule__NegExpression__SubExpressionsAssignment_0_2 ) )
            // InternalKVis.g:5840:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExpressionAccess().getSubExpressionsAssignment_0_2()); 
            }
            // InternalKVis.g:5841:1: ( rule__NegExpression__SubExpressionsAssignment_0_2 )
            // InternalKVis.g:5841:2: rule__NegExpression__SubExpressionsAssignment_0_2
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
    // InternalKVis.g:5857:1: rule__AtomicExpression__Group_2__0 : rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 ;
    public final void rule__AtomicExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5861:1: ( rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1 )
            // InternalKVis.g:5862:2: rule__AtomicExpression__Group_2__0__Impl rule__AtomicExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKVis.g:5869:1: rule__AtomicExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtomicExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5873:1: ( ( '(' ) )
            // InternalKVis.g:5874:1: ( '(' )
            {
            // InternalKVis.g:5874:1: ( '(' )
            // InternalKVis.g:5875:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:5888:1: rule__AtomicExpression__Group_2__1 : rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 ;
    public final void rule__AtomicExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5892:1: ( rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2 )
            // InternalKVis.g:5893:2: rule__AtomicExpression__Group_2__1__Impl rule__AtomicExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKVis.g:5900:1: rule__AtomicExpression__Group_2__1__Impl : ( ruleBoolExpression ) ;
    public final void rule__AtomicExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5904:1: ( ( ruleBoolExpression ) )
            // InternalKVis.g:5905:1: ( ruleBoolExpression )
            {
            // InternalKVis.g:5905:1: ( ruleBoolExpression )
            // InternalKVis.g:5906:1: ruleBoolExpression
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
    // InternalKVis.g:5917:1: rule__AtomicExpression__Group_2__2 : rule__AtomicExpression__Group_2__2__Impl ;
    public final void rule__AtomicExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5921:1: ( rule__AtomicExpression__Group_2__2__Impl )
            // InternalKVis.g:5922:2: rule__AtomicExpression__Group_2__2__Impl
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
    // InternalKVis.g:5928:1: rule__AtomicExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtomicExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5932:1: ( ( ')' ) )
            // InternalKVis.g:5933:1: ( ')' )
            {
            // InternalKVis.g:5933:1: ( ')' )
            // InternalKVis.g:5934:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:5953:1: rule__AtomicValuedExpression__Group_3__0 : rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 ;
    public final void rule__AtomicValuedExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5957:1: ( rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1 )
            // InternalKVis.g:5958:2: rule__AtomicValuedExpression__Group_3__0__Impl rule__AtomicValuedExpression__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalKVis.g:5965:1: rule__AtomicValuedExpression__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicValuedExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5969:1: ( ( '(' ) )
            // InternalKVis.g:5970:1: ( '(' )
            {
            // InternalKVis.g:5970:1: ( '(' )
            // InternalKVis.g:5971:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:5984:1: rule__AtomicValuedExpression__Group_3__1 : rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 ;
    public final void rule__AtomicValuedExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:5988:1: ( rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2 )
            // InternalKVis.g:5989:2: rule__AtomicValuedExpression__Group_3__1__Impl rule__AtomicValuedExpression__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKVis.g:5996:1: rule__AtomicValuedExpression__Group_3__1__Impl : ( ruleValuedExpression ) ;
    public final void rule__AtomicValuedExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6000:1: ( ( ruleValuedExpression ) )
            // InternalKVis.g:6001:1: ( ruleValuedExpression )
            {
            // InternalKVis.g:6001:1: ( ruleValuedExpression )
            // InternalKVis.g:6002:1: ruleValuedExpression
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
    // InternalKVis.g:6013:1: rule__AtomicValuedExpression__Group_3__2 : rule__AtomicValuedExpression__Group_3__2__Impl ;
    public final void rule__AtomicValuedExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6017:1: ( rule__AtomicValuedExpression__Group_3__2__Impl )
            // InternalKVis.g:6018:2: rule__AtomicValuedExpression__Group_3__2__Impl
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
    // InternalKVis.g:6024:1: rule__AtomicValuedExpression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicValuedExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6028:1: ( ( ')' ) )
            // InternalKVis.g:6029:1: ( ')' )
            {
            // InternalKVis.g:6029:1: ( ')' )
            // InternalKVis.g:6030:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:6049:1: rule__ValuedObjectTestExpression__Group_0__0 : rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 ;
    public final void rule__ValuedObjectTestExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6053:1: ( rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1 )
            // InternalKVis.g:6054:2: rule__ValuedObjectTestExpression__Group_0__0__Impl rule__ValuedObjectTestExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_50);
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
    // InternalKVis.g:6061:1: rule__ValuedObjectTestExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6065:1: ( ( () ) )
            // InternalKVis.g:6066:1: ( () )
            {
            // InternalKVis.g:6066:1: ( () )
            // InternalKVis.g:6067:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0()); 
            }
            // InternalKVis.g:6068:1: ()
            // InternalKVis.g:6070:1: 
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
    // InternalKVis.g:6080:1: rule__ValuedObjectTestExpression__Group_0__1 : rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 ;
    public final void rule__ValuedObjectTestExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6084:1: ( rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2 )
            // InternalKVis.g:6085:2: rule__ValuedObjectTestExpression__Group_0__1__Impl rule__ValuedObjectTestExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_51);
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
    // InternalKVis.g:6092:1: rule__ValuedObjectTestExpression__Group_0__1__Impl : ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6096:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) ) )
            // InternalKVis.g:6097:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            {
            // InternalKVis.g:6097:1: ( ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 ) )
            // InternalKVis.g:6098:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAssignment_0_1()); 
            }
            // InternalKVis.g:6099:1: ( rule__ValuedObjectTestExpression__OperatorAssignment_0_1 )
            // InternalKVis.g:6099:2: rule__ValuedObjectTestExpression__OperatorAssignment_0_1
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
    // InternalKVis.g:6109:1: rule__ValuedObjectTestExpression__Group_0__2 : rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 ;
    public final void rule__ValuedObjectTestExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6113:1: ( rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3 )
            // InternalKVis.g:6114:2: rule__ValuedObjectTestExpression__Group_0__2__Impl rule__ValuedObjectTestExpression__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_52);
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
    // InternalKVis.g:6121:1: rule__ValuedObjectTestExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6125:1: ( ( '(' ) )
            // InternalKVis.g:6126:1: ( '(' )
            {
            // InternalKVis.g:6126:1: ( '(' )
            // InternalKVis.g:6127:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:6140:1: rule__ValuedObjectTestExpression__Group_0__3 : rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 ;
    public final void rule__ValuedObjectTestExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6144:1: ( rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4 )
            // InternalKVis.g:6145:2: rule__ValuedObjectTestExpression__Group_0__3__Impl rule__ValuedObjectTestExpression__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKVis.g:6152:1: rule__ValuedObjectTestExpression__Group_0__3__Impl : ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6156:1: ( ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) ) )
            // InternalKVis.g:6157:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            {
            // InternalKVis.g:6157:1: ( ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 ) )
            // InternalKVis.g:6158:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsAssignment_0_3()); 
            }
            // InternalKVis.g:6159:1: ( rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 )
            // InternalKVis.g:6159:2: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3
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
    // InternalKVis.g:6169:1: rule__ValuedObjectTestExpression__Group_0__4 : rule__ValuedObjectTestExpression__Group_0__4__Impl ;
    public final void rule__ValuedObjectTestExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6173:1: ( rule__ValuedObjectTestExpression__Group_0__4__Impl )
            // InternalKVis.g:6174:2: rule__ValuedObjectTestExpression__Group_0__4__Impl
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
    // InternalKVis.g:6180:1: rule__ValuedObjectTestExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__ValuedObjectTestExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6184:1: ( ( ')' ) )
            // InternalKVis.g:6185:1: ( ')' )
            {
            // InternalKVis.g:6185:1: ( ')' )
            // InternalKVis.g:6186:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:6209:1: rule__ValuedObjectReference__Group__0 : rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1 ;
    public final void rule__ValuedObjectReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6213:1: ( rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1 )
            // InternalKVis.g:6214:2: rule__ValuedObjectReference__Group__0__Impl rule__ValuedObjectReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalKVis.g:6221:1: rule__ValuedObjectReference__Group__0__Impl : ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) ;
    public final void rule__ValuedObjectReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6225:1: ( ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) ) )
            // InternalKVis.g:6226:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
            {
            // InternalKVis.g:6226:1: ( ( rule__ValuedObjectReference__ValuedObjectAssignment_0 ) )
            // InternalKVis.g:6227:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectAssignment_0()); 
            }
            // InternalKVis.g:6228:1: ( rule__ValuedObjectReference__ValuedObjectAssignment_0 )
            // InternalKVis.g:6228:2: rule__ValuedObjectReference__ValuedObjectAssignment_0
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
    // InternalKVis.g:6238:1: rule__ValuedObjectReference__Group__1 : rule__ValuedObjectReference__Group__1__Impl ;
    public final void rule__ValuedObjectReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6242:1: ( rule__ValuedObjectReference__Group__1__Impl )
            // InternalKVis.g:6243:2: rule__ValuedObjectReference__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:6249:1: rule__ValuedObjectReference__Group__1__Impl : ( ( rule__ValuedObjectReference__Group_1__0 )* ) ;
    public final void rule__ValuedObjectReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6253:1: ( ( ( rule__ValuedObjectReference__Group_1__0 )* ) )
            // InternalKVis.g:6254:1: ( ( rule__ValuedObjectReference__Group_1__0 )* )
            {
            // InternalKVis.g:6254:1: ( ( rule__ValuedObjectReference__Group_1__0 )* )
            // InternalKVis.g:6255:1: ( rule__ValuedObjectReference__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getGroup_1()); 
            }
            // InternalKVis.g:6256:1: ( rule__ValuedObjectReference__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==47) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalKVis.g:6256:2: rule__ValuedObjectReference__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__ValuedObjectReference__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalKVis.g:6270:1: rule__ValuedObjectReference__Group_1__0 : rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1 ;
    public final void rule__ValuedObjectReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6274:1: ( rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1 )
            // InternalKVis.g:6275:2: rule__ValuedObjectReference__Group_1__0__Impl rule__ValuedObjectReference__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKVis.g:6282:1: rule__ValuedObjectReference__Group_1__0__Impl : ( '[' ) ;
    public final void rule__ValuedObjectReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6286:1: ( ( '[' ) )
            // InternalKVis.g:6287:1: ( '[' )
            {
            // InternalKVis.g:6287:1: ( '[' )
            // InternalKVis.g:6288:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:6301:1: rule__ValuedObjectReference__Group_1__1 : rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2 ;
    public final void rule__ValuedObjectReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6305:1: ( rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2 )
            // InternalKVis.g:6306:2: rule__ValuedObjectReference__Group_1__1__Impl rule__ValuedObjectReference__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__ValuedObjectReference__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:6313:1: rule__ValuedObjectReference__Group_1__1__Impl : ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) ) ;
    public final void rule__ValuedObjectReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6317:1: ( ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) ) )
            // InternalKVis.g:6318:1: ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) )
            {
            // InternalKVis.g:6318:1: ( ( rule__ValuedObjectReference__IndicesAssignment_1_1 ) )
            // InternalKVis.g:6319:1: ( rule__ValuedObjectReference__IndicesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getIndicesAssignment_1_1()); 
            }
            // InternalKVis.g:6320:1: ( rule__ValuedObjectReference__IndicesAssignment_1_1 )
            // InternalKVis.g:6320:2: rule__ValuedObjectReference__IndicesAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:6330:1: rule__ValuedObjectReference__Group_1__2 : rule__ValuedObjectReference__Group_1__2__Impl ;
    public final void rule__ValuedObjectReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6334:1: ( rule__ValuedObjectReference__Group_1__2__Impl )
            // InternalKVis.g:6335:2: rule__ValuedObjectReference__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:6341:1: rule__ValuedObjectReference__Group_1__2__Impl : ( ']' ) ;
    public final void rule__ValuedObjectReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6345:1: ( ( ']' ) )
            // InternalKVis.g:6346:1: ( ']' )
            {
            // InternalKVis.g:6346:1: ( ']' )
            // InternalKVis.g:6347:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:6366:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6370:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalKVis.g:6371:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKVis.g:6378:1: rule__FunctionCall__Group__0__Impl : ( '<' ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6382:1: ( ( '<' ) )
            // InternalKVis.g:6383:1: ( '<' )
            {
            // InternalKVis.g:6383:1: ( '<' )
            // InternalKVis.g:6384:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:6397:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6401:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalKVis.g:6402:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_53);
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
    // InternalKVis.g:6409:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__FunctionNameAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6413:1: ( ( ( rule__FunctionCall__FunctionNameAssignment_1 ) ) )
            // InternalKVis.g:6414:1: ( ( rule__FunctionCall__FunctionNameAssignment_1 ) )
            {
            // InternalKVis.g:6414:1: ( ( rule__FunctionCall__FunctionNameAssignment_1 ) )
            // InternalKVis.g:6415:1: ( rule__FunctionCall__FunctionNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionNameAssignment_1()); 
            }
            // InternalKVis.g:6416:1: ( rule__FunctionCall__FunctionNameAssignment_1 )
            // InternalKVis.g:6416:2: rule__FunctionCall__FunctionNameAssignment_1
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
    // InternalKVis.g:6426:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6430:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalKVis.g:6431:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_53);
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
    // InternalKVis.g:6438:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__Alternatives_2 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6442:1: ( ( ( rule__FunctionCall__Alternatives_2 )? ) )
            // InternalKVis.g:6443:1: ( ( rule__FunctionCall__Alternatives_2 )? )
            {
            // InternalKVis.g:6443:1: ( ( rule__FunctionCall__Alternatives_2 )? )
            // InternalKVis.g:6444:1: ( rule__FunctionCall__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getAlternatives_2()); 
            }
            // InternalKVis.g:6445:1: ( rule__FunctionCall__Alternatives_2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==28||LA46_0==45) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalKVis.g:6445:2: rule__FunctionCall__Alternatives_2
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
    // InternalKVis.g:6455:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6459:1: ( rule__FunctionCall__Group__3__Impl )
            // InternalKVis.g:6460:2: rule__FunctionCall__Group__3__Impl
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
    // InternalKVis.g:6466:1: rule__FunctionCall__Group__3__Impl : ( '>' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6470:1: ( ( '>' ) )
            // InternalKVis.g:6471:1: ( '>' )
            {
            // InternalKVis.g:6471:1: ( '>' )
            // InternalKVis.g:6472:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:6493:1: rule__FunctionCall__Group_2_0__0 : rule__FunctionCall__Group_2_0__0__Impl rule__FunctionCall__Group_2_0__1 ;
    public final void rule__FunctionCall__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6497:1: ( rule__FunctionCall__Group_2_0__0__Impl rule__FunctionCall__Group_2_0__1 )
            // InternalKVis.g:6498:2: rule__FunctionCall__Group_2_0__0__Impl rule__FunctionCall__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_54);
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
    // InternalKVis.g:6505:1: rule__FunctionCall__Group_2_0__0__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6509:1: ( ( '(' ) )
            // InternalKVis.g:6510:1: ( '(' )
            {
            // InternalKVis.g:6510:1: ( '(' )
            // InternalKVis.g:6511:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:6524:1: rule__FunctionCall__Group_2_0__1 : rule__FunctionCall__Group_2_0__1__Impl rule__FunctionCall__Group_2_0__2 ;
    public final void rule__FunctionCall__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6528:1: ( rule__FunctionCall__Group_2_0__1__Impl rule__FunctionCall__Group_2_0__2 )
            // InternalKVis.g:6529:2: rule__FunctionCall__Group_2_0__1__Impl rule__FunctionCall__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_55);
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
    // InternalKVis.g:6536:1: rule__FunctionCall__Group_2_0__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) ) ;
    public final void rule__FunctionCall__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6540:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) ) )
            // InternalKVis.g:6541:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) )
            {
            // InternalKVis.g:6541:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_1 ) )
            // InternalKVis.g:6542:1: ( rule__FunctionCall__ParametersAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0_1()); 
            }
            // InternalKVis.g:6543:1: ( rule__FunctionCall__ParametersAssignment_2_0_1 )
            // InternalKVis.g:6543:2: rule__FunctionCall__ParametersAssignment_2_0_1
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
    // InternalKVis.g:6553:1: rule__FunctionCall__Group_2_0__2 : rule__FunctionCall__Group_2_0__2__Impl rule__FunctionCall__Group_2_0__3 ;
    public final void rule__FunctionCall__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6557:1: ( rule__FunctionCall__Group_2_0__2__Impl rule__FunctionCall__Group_2_0__3 )
            // InternalKVis.g:6558:2: rule__FunctionCall__Group_2_0__2__Impl rule__FunctionCall__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_55);
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
    // InternalKVis.g:6565:1: rule__FunctionCall__Group_2_0__2__Impl : ( ( rule__FunctionCall__Group_2_0_2__0 )* ) ;
    public final void rule__FunctionCall__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6569:1: ( ( ( rule__FunctionCall__Group_2_0_2__0 )* ) )
            // InternalKVis.g:6570:1: ( ( rule__FunctionCall__Group_2_0_2__0 )* )
            {
            // InternalKVis.g:6570:1: ( ( rule__FunctionCall__Group_2_0_2__0 )* )
            // InternalKVis.g:6571:1: ( rule__FunctionCall__Group_2_0_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_2_0_2()); 
            }
            // InternalKVis.g:6572:1: ( rule__FunctionCall__Group_2_0_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==43) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalKVis.g:6572:2: rule__FunctionCall__Group_2_0_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    rule__FunctionCall__Group_2_0_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalKVis.g:6582:1: rule__FunctionCall__Group_2_0__3 : rule__FunctionCall__Group_2_0__3__Impl ;
    public final void rule__FunctionCall__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6586:1: ( rule__FunctionCall__Group_2_0__3__Impl )
            // InternalKVis.g:6587:2: rule__FunctionCall__Group_2_0__3__Impl
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
    // InternalKVis.g:6593:1: rule__FunctionCall__Group_2_0__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6597:1: ( ( ')' ) )
            // InternalKVis.g:6598:1: ( ')' )
            {
            // InternalKVis.g:6598:1: ( ')' )
            // InternalKVis.g:6599:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:6620:1: rule__FunctionCall__Group_2_0_2__0 : rule__FunctionCall__Group_2_0_2__0__Impl rule__FunctionCall__Group_2_0_2__1 ;
    public final void rule__FunctionCall__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6624:1: ( rule__FunctionCall__Group_2_0_2__0__Impl rule__FunctionCall__Group_2_0_2__1 )
            // InternalKVis.g:6625:2: rule__FunctionCall__Group_2_0_2__0__Impl rule__FunctionCall__Group_2_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_54);
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
    // InternalKVis.g:6632:1: rule__FunctionCall__Group_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6636:1: ( ( ',' ) )
            // InternalKVis.g:6637:1: ( ',' )
            {
            // InternalKVis.g:6637:1: ( ',' )
            // InternalKVis.g:6638:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:6651:1: rule__FunctionCall__Group_2_0_2__1 : rule__FunctionCall__Group_2_0_2__1__Impl ;
    public final void rule__FunctionCall__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6655:1: ( rule__FunctionCall__Group_2_0_2__1__Impl )
            // InternalKVis.g:6656:2: rule__FunctionCall__Group_2_0_2__1__Impl
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
    // InternalKVis.g:6662:1: rule__FunctionCall__Group_2_0_2__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) ) ;
    public final void rule__FunctionCall__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6666:1: ( ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) ) )
            // InternalKVis.g:6667:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) )
            {
            // InternalKVis.g:6667:1: ( ( rule__FunctionCall__ParametersAssignment_2_0_2_1 ) )
            // InternalKVis.g:6668:1: ( rule__FunctionCall__ParametersAssignment_2_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2_0_2_1()); 
            }
            // InternalKVis.g:6669:1: ( rule__FunctionCall__ParametersAssignment_2_0_2_1 )
            // InternalKVis.g:6669:2: rule__FunctionCall__ParametersAssignment_2_0_2_1
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
    // InternalKVis.g:6683:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6687:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalKVis.g:6688:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_54);
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
    // InternalKVis.g:6695:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__Group_0__0 )? ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6699:1: ( ( ( rule__Parameter__Group_0__0 )? ) )
            // InternalKVis.g:6700:1: ( ( rule__Parameter__Group_0__0 )? )
            {
            // InternalKVis.g:6700:1: ( ( rule__Parameter__Group_0__0 )? )
            // InternalKVis.g:6701:1: ( rule__Parameter__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup_0()); 
            }
            // InternalKVis.g:6702:1: ( rule__Parameter__Group_0__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==20) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==19) ) {
                    alt48=1;
                }
            }
            else if ( (LA48_0==19) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalKVis.g:6702:2: rule__Parameter__Group_0__0
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
    // InternalKVis.g:6712:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6716:1: ( rule__Parameter__Group__1__Impl )
            // InternalKVis.g:6717:2: rule__Parameter__Group__1__Impl
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
    // InternalKVis.g:6723:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ExpressionAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6727:1: ( ( ( rule__Parameter__ExpressionAssignment_1 ) ) )
            // InternalKVis.g:6728:1: ( ( rule__Parameter__ExpressionAssignment_1 ) )
            {
            // InternalKVis.g:6728:1: ( ( rule__Parameter__ExpressionAssignment_1 ) )
            // InternalKVis.g:6729:1: ( rule__Parameter__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getExpressionAssignment_1()); 
            }
            // InternalKVis.g:6730:1: ( rule__Parameter__ExpressionAssignment_1 )
            // InternalKVis.g:6730:2: rule__Parameter__ExpressionAssignment_1
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
    // InternalKVis.g:6744:1: rule__Parameter__Group_0__0 : rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 ;
    public final void rule__Parameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6748:1: ( rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 )
            // InternalKVis.g:6749:2: rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_56);
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
    // InternalKVis.g:6756:1: rule__Parameter__Group_0__0__Impl : ( ( rule__Parameter__PureOutputAssignment_0_0 )? ) ;
    public final void rule__Parameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6760:1: ( ( ( rule__Parameter__PureOutputAssignment_0_0 )? ) )
            // InternalKVis.g:6761:1: ( ( rule__Parameter__PureOutputAssignment_0_0 )? )
            {
            // InternalKVis.g:6761:1: ( ( rule__Parameter__PureOutputAssignment_0_0 )? )
            // InternalKVis.g:6762:1: ( rule__Parameter__PureOutputAssignment_0_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getPureOutputAssignment_0_0()); 
            }
            // InternalKVis.g:6763:1: ( rule__Parameter__PureOutputAssignment_0_0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==20) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalKVis.g:6763:2: rule__Parameter__PureOutputAssignment_0_0
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
    // InternalKVis.g:6773:1: rule__Parameter__Group_0__1 : rule__Parameter__Group_0__1__Impl ;
    public final void rule__Parameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6777:1: ( rule__Parameter__Group_0__1__Impl )
            // InternalKVis.g:6778:2: rule__Parameter__Group_0__1__Impl
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
    // InternalKVis.g:6784:1: rule__Parameter__Group_0__1__Impl : ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) ) ;
    public final void rule__Parameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6788:1: ( ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) ) )
            // InternalKVis.g:6789:1: ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) )
            {
            // InternalKVis.g:6789:1: ( ( rule__Parameter__CallByReferenceAssignment_0_1 ) )
            // InternalKVis.g:6790:1: ( rule__Parameter__CallByReferenceAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAssignment_0_1()); 
            }
            // InternalKVis.g:6791:1: ( rule__Parameter__CallByReferenceAssignment_0_1 )
            // InternalKVis.g:6791:2: rule__Parameter__CallByReferenceAssignment_0_1
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
    // InternalKVis.g:6805:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6809:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalKVis.g:6810:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKVis.g:6817:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6821:1: ( ( '@' ) )
            // InternalKVis.g:6822:1: ( '@' )
            {
            // InternalKVis.g:6822:1: ( '@' )
            // InternalKVis.g:6823:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:6836:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6840:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalKVis.g:6841:2: rule__TagAnnotation__Group__1__Impl
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
    // InternalKVis.g:6847:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6851:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalKVis.g:6852:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalKVis.g:6852:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalKVis.g:6853:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKVis.g:6854:1: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalKVis.g:6854:2: rule__TagAnnotation__NameAssignment_1
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
    // InternalKVis.g:6868:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6872:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalKVis.g:6873:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKVis.g:6880:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6884:1: ( ( '@' ) )
            // InternalKVis.g:6885:1: ( '@' )
            {
            // InternalKVis.g:6885:1: ( '@' )
            // InternalKVis.g:6886:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:6899:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6903:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalKVis.g:6904:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_57);
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
    // InternalKVis.g:6911:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6915:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKVis.g:6916:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKVis.g:6916:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKVis.g:6917:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKVis.g:6918:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalKVis.g:6918:2: rule__KeyStringValueAnnotation__NameAssignment_1
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
    // InternalKVis.g:6928:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6932:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalKVis.g:6933:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalKVis.g:6940:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6944:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKVis.g:6945:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKVis.g:6945:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKVis.g:6946:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKVis.g:6947:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKVis.g:6947:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKVis.g:6957:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6961:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalKVis.g:6962:2: rule__KeyStringValueAnnotation__Group__3__Impl
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
    // InternalKVis.g:6968:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6972:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKVis.g:6973:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKVis.g:6973:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalKVis.g:6974:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKVis.g:6975:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==43) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalKVis.g:6975:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    rule__KeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalKVis.g:6993:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:6997:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalKVis.g:6998:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_57);
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
    // InternalKVis.g:7005:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7009:1: ( ( ',' ) )
            // InternalKVis.g:7010:1: ( ',' )
            {
            // InternalKVis.g:7010:1: ( ',' )
            // InternalKVis.g:7011:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:7024:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7028:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKVis.g:7029:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKVis.g:7035:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7039:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKVis.g:7040:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKVis.g:7040:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKVis.g:7041:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKVis.g:7042:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKVis.g:7042:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
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


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__0"
    // InternalKVis.g:7056:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7060:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalKVis.g:7061:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKVis.g:7068:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7072:1: ( ( '@' ) )
            // InternalKVis.g:7073:1: ( '@' )
            {
            // InternalKVis.g:7073:1: ( '@' )
            // InternalKVis.g:7074:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:7087:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7091:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalKVis.g:7092:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalKVis.g:7099:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7103:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKVis.g:7104:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKVis.g:7104:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKVis.g:7105:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKVis.g:7106:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKVis.g:7106:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKVis.g:7116:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7120:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalKVis.g:7121:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKVis.g:7128:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7132:1: ( ( '[' ) )
            // InternalKVis.g:7133:1: ( '[' )
            {
            // InternalKVis.g:7133:1: ( '[' )
            // InternalKVis.g:7134:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:7147:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7151:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalKVis.g:7152:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKVis.g:7159:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7163:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKVis.g:7164:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKVis.g:7164:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKVis.g:7165:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKVis.g:7166:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKVis.g:7166:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKVis.g:7176:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7180:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalKVis.g:7181:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_58);
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
    // InternalKVis.g:7188:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7192:1: ( ( ']' ) )
            // InternalKVis.g:7193:1: ( ']' )
            {
            // InternalKVis.g:7193:1: ( ']' )
            // InternalKVis.g:7194:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:7207:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7211:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalKVis.g:7212:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalKVis.g:7219:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7223:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKVis.g:7224:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKVis.g:7224:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKVis.g:7225:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKVis.g:7226:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKVis.g:7226:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKVis.g:7236:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7240:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKVis.g:7241:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKVis.g:7247:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7251:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKVis.g:7252:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKVis.g:7252:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKVis.g:7253:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKVis.g:7254:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==43) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalKVis.g:7254:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalKVis.g:7278:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7282:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKVis.g:7283:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_58);
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
    // InternalKVis.g:7290:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7294:1: ( ( ',' ) )
            // InternalKVis.g:7295:1: ( ',' )
            {
            // InternalKVis.g:7295:1: ( ',' )
            // InternalKVis.g:7296:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:7309:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7313:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKVis.g:7314:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKVis.g:7320:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7324:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKVis.g:7325:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKVis.g:7325:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKVis.g:7326:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKVis.g:7327:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKVis.g:7327:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
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


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group__0"
    // InternalKVis.g:7341:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7345:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalKVis.g:7346:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKVis.g:7353:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7357:1: ( ( '@' ) )
            // InternalKVis.g:7358:1: ( '@' )
            {
            // InternalKVis.g:7358:1: ( '@' )
            // InternalKVis.g:7359:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:7372:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7376:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalKVis.g:7377:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKVis.g:7384:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7388:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKVis.g:7389:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKVis.g:7389:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKVis.g:7390:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKVis.g:7391:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKVis.g:7391:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKVis.g:7401:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7405:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalKVis.g:7406:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalKVis.g:7413:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7417:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKVis.g:7418:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKVis.g:7418:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKVis.g:7419:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKVis.g:7420:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKVis.g:7420:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKVis.g:7430:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7434:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKVis.g:7435:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKVis.g:7441:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7445:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKVis.g:7446:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKVis.g:7446:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKVis.g:7447:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKVis.g:7448:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==43) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalKVis.g:7448:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalKVis.g:7466:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7470:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalKVis.g:7471:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKVis.g:7478:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7482:1: ( ( ',' ) )
            // InternalKVis.g:7483:1: ( ',' )
            {
            // InternalKVis.g:7483:1: ( ',' )
            // InternalKVis.g:7484:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:7497:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7501:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKVis.g:7502:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKVis.g:7508:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7512:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKVis.g:7513:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKVis.g:7513:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKVis.g:7514:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKVis.g:7515:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKVis.g:7515:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKVis.g:7529:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7533:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKVis.g:7534:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKVis.g:7541:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7545:1: ( ( '@' ) )
            // InternalKVis.g:7546:1: ( '@' )
            {
            // InternalKVis.g:7546:1: ( '@' )
            // InternalKVis.g:7547:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:7560:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7564:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKVis.g:7565:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalKVis.g:7572:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7576:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKVis.g:7577:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKVis.g:7577:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKVis.g:7578:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKVis.g:7579:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKVis.g:7579:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKVis.g:7589:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7593:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKVis.g:7594:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKVis.g:7601:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7605:1: ( ( '[' ) )
            // InternalKVis.g:7606:1: ( '[' )
            {
            // InternalKVis.g:7606:1: ( '[' )
            // InternalKVis.g:7607:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:7620:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7624:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKVis.g:7625:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKVis.g:7632:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7636:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKVis.g:7637:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKVis.g:7637:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKVis.g:7638:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKVis.g:7639:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKVis.g:7639:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKVis.g:7649:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7653:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKVis.g:7654:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKVis.g:7661:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7665:1: ( ( ']' ) )
            // InternalKVis.g:7666:1: ( ']' )
            {
            // InternalKVis.g:7666:1: ( ']' )
            // InternalKVis.g:7667:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:7680:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7684:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKVis.g:7685:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalKVis.g:7692:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7696:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKVis.g:7697:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKVis.g:7697:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKVis.g:7698:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKVis.g:7699:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKVis.g:7699:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKVis.g:7709:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7713:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKVis.g:7714:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKVis.g:7720:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7724:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKVis.g:7725:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKVis.g:7725:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKVis.g:7726:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKVis.g:7727:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==43) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalKVis.g:7727:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalKVis.g:7751:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7755:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKVis.g:7756:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKVis.g:7763:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7767:1: ( ( ',' ) )
            // InternalKVis.g:7768:1: ( ',' )
            {
            // InternalKVis.g:7768:1: ( ',' )
            // InternalKVis.g:7769:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:7782:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7786:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKVis.g:7787:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKVis.g:7793:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7797:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKVis.g:7798:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKVis.g:7798:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKVis.g:7799:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKVis.g:7800:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKVis.g:7800:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__0"
    // InternalKVis.g:7814:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7818:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // InternalKVis.g:7819:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__KeyBooleanValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:7826:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7830:1: ( ( '@' ) )
            // InternalKVis.g:7831:1: ( '@' )
            {
            // InternalKVis.g:7831:1: ( '@' )
            // InternalKVis.g:7832:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:7845:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7849:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // InternalKVis.g:7850:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_59);
            rule__KeyBooleanValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:7857:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7861:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // InternalKVis.g:7862:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKVis.g:7862:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // InternalKVis.g:7863:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKVis.g:7864:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // InternalKVis.g:7864:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:7874:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7878:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl )
            // InternalKVis.g:7879:2: rule__KeyBooleanValueAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyBooleanValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKVis.g:7885:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7889:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // InternalKVis.g:7890:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // InternalKVis.g:7890:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // InternalKVis.g:7891:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalKVis.g:7892:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // InternalKVis.g:7892:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__0"
    // InternalKVis.g:7908:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7912:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // InternalKVis.g:7913:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__KeyIntValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:7920:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7924:1: ( ( '@' ) )
            // InternalKVis.g:7925:1: ( '@' )
            {
            // InternalKVis.g:7925:1: ( '@' )
            // InternalKVis.g:7926:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:7939:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7943:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // InternalKVis.g:7944:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__KeyIntValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:7951:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7955:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // InternalKVis.g:7956:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKVis.g:7956:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // InternalKVis.g:7957:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKVis.g:7958:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // InternalKVis.g:7958:2: rule__KeyIntValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:7968:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7972:1: ( rule__KeyIntValueAnnotation__Group__2__Impl )
            // InternalKVis.g:7973:2: rule__KeyIntValueAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyIntValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKVis.g:7979:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:7983:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // InternalKVis.g:7984:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // InternalKVis.g:7984:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // InternalKVis.g:7985:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalKVis.g:7986:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // InternalKVis.g:7986:2: rule__KeyIntValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__0"
    // InternalKVis.g:8002:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8006:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // InternalKVis.g:8007:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__KeyFloatValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:8014:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8018:1: ( ( '@' ) )
            // InternalKVis.g:8019:1: ( '@' )
            {
            // InternalKVis.g:8019:1: ( '@' )
            // InternalKVis.g:8020:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:8033:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8037:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // InternalKVis.g:8038:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_60);
            rule__KeyFloatValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:8045:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8049:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // InternalKVis.g:8050:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKVis.g:8050:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // InternalKVis.g:8051:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKVis.g:8052:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // InternalKVis.g:8052:2: rule__KeyFloatValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:8062:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8066:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl )
            // InternalKVis.g:8067:2: rule__KeyFloatValueAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyFloatValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKVis.g:8073:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8077:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // InternalKVis.g:8078:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // InternalKVis.g:8078:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // InternalKVis.g:8079:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalKVis.g:8080:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // InternalKVis.g:8080:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "rule__ExtendedID__Group__0"
    // InternalKVis.g:8096:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8100:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalKVis.g:8101:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_61);
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
    // InternalKVis.g:8108:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8112:1: ( ( RULE_ID ) )
            // InternalKVis.g:8113:1: ( RULE_ID )
            {
            // InternalKVis.g:8113:1: ( RULE_ID )
            // InternalKVis.g:8114:1: RULE_ID
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
    // InternalKVis.g:8125:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8129:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalKVis.g:8130:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_61);
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
    // InternalKVis.g:8137:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8141:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // InternalKVis.g:8142:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // InternalKVis.g:8142:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // InternalKVis.g:8143:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // InternalKVis.g:8144:1: ( rule__ExtendedID__Group_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==49) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalKVis.g:8144:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_62);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalKVis.g:8154:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8158:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalKVis.g:8159:2: rule__ExtendedID__Group__2__Impl
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
    // InternalKVis.g:8165:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8169:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalKVis.g:8170:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalKVis.g:8170:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalKVis.g:8171:1: ( rule__ExtendedID__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            }
            // InternalKVis.g:8172:1: ( rule__ExtendedID__Group_2__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==51) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalKVis.g:8172:2: rule__ExtendedID__Group_2__0
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
    // InternalKVis.g:8188:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8192:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // InternalKVis.g:8193:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKVis.g:8200:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8204:1: ( ( '.' ) )
            // InternalKVis.g:8205:1: ( '.' )
            {
            // InternalKVis.g:8205:1: ( '.' )
            // InternalKVis.g:8206:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:8219:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8223:1: ( rule__ExtendedID__Group_1__1__Impl )
            // InternalKVis.g:8224:2: rule__ExtendedID__Group_1__1__Impl
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
    // InternalKVis.g:8230:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8234:1: ( ( RULE_ID ) )
            // InternalKVis.g:8235:1: ( RULE_ID )
            {
            // InternalKVis.g:8235:1: ( RULE_ID )
            // InternalKVis.g:8236:1: RULE_ID
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
    // InternalKVis.g:8251:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8255:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalKVis.g:8256:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalKVis.g:8263:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8267:1: ( ( '#' ) )
            // InternalKVis.g:8268:1: ( '#' )
            {
            // InternalKVis.g:8268:1: ( '#' )
            // InternalKVis.g:8269:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:8282:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8286:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalKVis.g:8287:2: rule__ExtendedID__Group_2__1__Impl
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
    // InternalKVis.g:8293:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8297:1: ( ( RULE_INT ) )
            // InternalKVis.g:8298:1: ( RULE_INT )
            {
            // InternalKVis.g:8298:1: ( RULE_INT )
            // InternalKVis.g:8299:1: RULE_INT
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
    // InternalKVis.g:8314:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8318:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalKVis.g:8319:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalKVis.g:8326:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8330:1: ( ( ( '-' )? ) )
            // InternalKVis.g:8331:1: ( ( '-' )? )
            {
            // InternalKVis.g:8331:1: ( ( '-' )? )
            // InternalKVis.g:8332:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKVis.g:8333:1: ( '-' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==16) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalKVis.g:8334:2: '-'
                    {
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKVis.g:8345:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8349:1: ( rule__Integer__Group__1__Impl )
            // InternalKVis.g:8350:2: rule__Integer__Group__1__Impl
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
    // InternalKVis.g:8356:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8360:1: ( ( RULE_INT ) )
            // InternalKVis.g:8361:1: ( RULE_INT )
            {
            // InternalKVis.g:8361:1: ( RULE_INT )
            // InternalKVis.g:8362:1: RULE_INT
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
    // InternalKVis.g:8377:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8381:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalKVis.g:8382:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_60);
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
    // InternalKVis.g:8389:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8393:1: ( ( ( '-' )? ) )
            // InternalKVis.g:8394:1: ( ( '-' )? )
            {
            // InternalKVis.g:8394:1: ( ( '-' )? )
            // InternalKVis.g:8395:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKVis.g:8396:1: ( '-' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==16) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalKVis.g:8397:2: '-'
                    {
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKVis.g:8408:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8412:1: ( rule__Floateger__Group__1__Impl )
            // InternalKVis.g:8413:2: rule__Floateger__Group__1__Impl
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
    // InternalKVis.g:8419:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8423:1: ( ( RULE_FLOAT ) )
            // InternalKVis.g:8424:1: ( RULE_FLOAT )
            {
            // InternalKVis.g:8424:1: ( RULE_FLOAT )
            // InternalKVis.g:8425:1: RULE_FLOAT
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


    // $ANTLR start "rule__Visualization__ImageAssignment_2"
    // InternalKVis.g:8441:1: rule__Visualization__ImageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Visualization__ImageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8445:1: ( ( RULE_STRING ) )
            // InternalKVis.g:8446:1: ( RULE_STRING )
            {
            // InternalKVis.g:8446:1: ( RULE_STRING )
            // InternalKVis.g:8447:1: RULE_STRING
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
    // InternalKVis.g:8456:1: rule__Visualization__ElementsAssignment_3 : ( ruleElement ) ;
    public final void rule__Visualization__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8460:1: ( ( ruleElement ) )
            // InternalKVis.g:8461:1: ( ruleElement )
            {
            // InternalKVis.g:8461:1: ( ruleElement )
            // InternalKVis.g:8462:1: ruleElement
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
    // InternalKVis.g:8471:1: rule__Element__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Element__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8475:1: ( ( RULE_ID ) )
            // InternalKVis.g:8476:1: ( RULE_ID )
            {
            // InternalKVis.g:8476:1: ( RULE_ID )
            // InternalKVis.g:8477:1: RULE_ID
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
    // InternalKVis.g:8486:1: rule__Element__AnimationsAssignment_3 : ( ruleAnimation ) ;
    public final void rule__Element__AnimationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8490:1: ( ( ruleAnimation ) )
            // InternalKVis.g:8491:1: ( ruleAnimation )
            {
            // InternalKVis.g:8491:1: ( ruleAnimation )
            // InternalKVis.g:8492:1: ruleAnimation
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


    // $ANTLR start "rule__Animation__TypeAssignment_1"
    // InternalKVis.g:8501:1: rule__Animation__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Animation__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8505:1: ( ( RULE_ID ) )
            // InternalKVis.g:8506:1: ( RULE_ID )
            {
            // InternalKVis.g:8506:1: ( RULE_ID )
            // InternalKVis.g:8507:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getTypeIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getTypeIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__TypeAssignment_1"


    // $ANTLR start "rule__Animation__VariableAssignment_2_1"
    // InternalKVis.g:8516:1: rule__Animation__VariableAssignment_2_1 : ( ruleVariableReference ) ;
    public final void rule__Animation__VariableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8520:1: ( ( ruleVariableReference ) )
            // InternalKVis.g:8521:1: ( ruleVariableReference )
            {
            // InternalKVis.g:8521:1: ( ruleVariableReference )
            // InternalKVis.g:8522:1: ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getVariableVariableReferenceParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVariableReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getVariableVariableReferenceParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__VariableAssignment_2_1"


    // $ANTLR start "rule__Animation__AttributeMappingsAssignment_4"
    // InternalKVis.g:8531:1: rule__Animation__AttributeMappingsAssignment_4 : ( ruleAttributeMapping ) ;
    public final void rule__Animation__AttributeMappingsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8535:1: ( ( ruleAttributeMapping ) )
            // InternalKVis.g:8536:1: ( ruleAttributeMapping )
            {
            // InternalKVis.g:8536:1: ( ruleAttributeMapping )
            // InternalKVis.g:8537:1: ruleAttributeMapping
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getAttributeMappingsAttributeMappingParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttributeMapping();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getAttributeMappingsAttributeMappingParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__AttributeMappingsAssignment_4"


    // $ANTLR start "rule__Animation__ConditionAssignment_6_1"
    // InternalKVis.g:8546:1: rule__Animation__ConditionAssignment_6_1 : ( ruleBoolExpression ) ;
    public final void rule__Animation__ConditionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8550:1: ( ( ruleBoolExpression ) )
            // InternalKVis.g:8551:1: ( ruleBoolExpression )
            {
            // InternalKVis.g:8551:1: ( ruleBoolExpression )
            // InternalKVis.g:8552:1: ruleBoolExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnimationAccess().getConditionBoolExpressionParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBoolExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnimationAccess().getConditionBoolExpressionParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__ConditionAssignment_6_1"


    // $ANTLR start "rule__AttributeMapping__AttributeAssignment_0"
    // InternalKVis.g:8561:1: rule__AttributeMapping__AttributeAssignment_0 : ( RULE_ID ) ;
    public final void rule__AttributeMapping__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8565:1: ( ( RULE_ID ) )
            // InternalKVis.g:8566:1: ( RULE_ID )
            {
            // InternalKVis.g:8566:1: ( RULE_ID )
            // InternalKVis.g:8567:1: RULE_ID
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
    // InternalKVis.g:8576:1: rule__AttributeMapping__LiteralAssignment_2_0 : ( ruleLiteral ) ;
    public final void rule__AttributeMapping__LiteralAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8580:1: ( ( ruleLiteral ) )
            // InternalKVis.g:8581:1: ( ruleLiteral )
            {
            // InternalKVis.g:8581:1: ( ruleLiteral )
            // InternalKVis.g:8582:1: ruleLiteral
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
    // InternalKVis.g:8591:1: rule__AttributeMapping__MappingsAssignment_2_1_0 : ( ruleMapping ) ;
    public final void rule__AttributeMapping__MappingsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8595:1: ( ( ruleMapping ) )
            // InternalKVis.g:8596:1: ( ruleMapping )
            {
            // InternalKVis.g:8596:1: ( ruleMapping )
            // InternalKVis.g:8597:1: ruleMapping
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
    // InternalKVis.g:8606:1: rule__AttributeMapping__MappingsAssignment_2_1_1_1 : ( ruleMapping ) ;
    public final void rule__AttributeMapping__MappingsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8610:1: ( ( ruleMapping ) )
            // InternalKVis.g:8611:1: ( ruleMapping )
            {
            // InternalKVis.g:8611:1: ( ruleMapping )
            // InternalKVis.g:8612:1: ruleMapping
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
    // InternalKVis.g:8621:1: rule__Mapping__VariableDomainAssignment_0 : ( ruleVariableDomain ) ;
    public final void rule__Mapping__VariableDomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8625:1: ( ( ruleVariableDomain ) )
            // InternalKVis.g:8626:1: ( ruleVariableDomain )
            {
            // InternalKVis.g:8626:1: ( ruleVariableDomain )
            // InternalKVis.g:8627:1: ruleVariableDomain
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
    // InternalKVis.g:8636:1: rule__Mapping__AttributeDomainAssignment_2 : ( ruleAttributeDomain ) ;
    public final void rule__Mapping__AttributeDomainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8640:1: ( ( ruleAttributeDomain ) )
            // InternalKVis.g:8641:1: ( ruleAttributeDomain )
            {
            // InternalKVis.g:8641:1: ( ruleAttributeDomain )
            // InternalKVis.g:8642:1: ruleAttributeDomain
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
    // InternalKVis.g:8651:1: rule__VariableDomain__ValueAssignment_0 : ( ruleLiteral ) ;
    public final void rule__VariableDomain__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8655:1: ( ( ruleLiteral ) )
            // InternalKVis.g:8656:1: ( ruleLiteral )
            {
            // InternalKVis.g:8656:1: ( ruleLiteral )
            // InternalKVis.g:8657:1: ruleLiteral
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
    // InternalKVis.g:8666:1: rule__VariableDomain__RangeAssignment_1 : ( ruleInterval ) ;
    public final void rule__VariableDomain__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8670:1: ( ( ruleInterval ) )
            // InternalKVis.g:8671:1: ( ruleInterval )
            {
            // InternalKVis.g:8671:1: ( ruleInterval )
            // InternalKVis.g:8672:1: ruleInterval
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


    // $ANTLR start "rule__Interval__FromAssignment_0_0"
    // InternalKVis.g:8681:1: rule__Interval__FromAssignment_0_0 : ( ruleInteger ) ;
    public final void rule__Interval__FromAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8685:1: ( ( ruleInteger ) )
            // InternalKVis.g:8686:1: ( ruleInteger )
            {
            // InternalKVis.g:8686:1: ( ruleInteger )
            // InternalKVis.g:8687:1: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getFromIntegerParserRuleCall_0_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getFromIntegerParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__FromAssignment_0_0"


    // $ANTLR start "rule__Interval__FromAssignment_0_1_1"
    // InternalKVis.g:8696:1: rule__Interval__FromAssignment_0_1_1 : ( ruleInteger ) ;
    public final void rule__Interval__FromAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8700:1: ( ( ruleInteger ) )
            // InternalKVis.g:8701:1: ( ruleInteger )
            {
            // InternalKVis.g:8701:1: ( ruleInteger )
            // InternalKVis.g:8702:1: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getFromIntegerParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getFromIntegerParserRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__FromAssignment_0_1_1"


    // $ANTLR start "rule__Interval__ToAssignment_2_0"
    // InternalKVis.g:8711:1: rule__Interval__ToAssignment_2_0 : ( ruleInteger ) ;
    public final void rule__Interval__ToAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8715:1: ( ( ruleInteger ) )
            // InternalKVis.g:8716:1: ( ruleInteger )
            {
            // InternalKVis.g:8716:1: ( ruleInteger )
            // InternalKVis.g:8717:1: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getToIntegerParserRuleCall_2_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getToIntegerParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__ToAssignment_2_0"


    // $ANTLR start "rule__Interval__ToAssignment_2_1_1"
    // InternalKVis.g:8726:1: rule__Interval__ToAssignment_2_1_1 : ( ruleInteger ) ;
    public final void rule__Interval__ToAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8730:1: ( ( ruleInteger ) )
            // InternalKVis.g:8731:1: ( ruleInteger )
            {
            // InternalKVis.g:8731:1: ( ruleInteger )
            // InternalKVis.g:8732:1: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntervalAccess().getToIntegerParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntervalAccess().getToIntegerParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interval__ToAssignment_2_1_1"


    // $ANTLR start "rule__VariableReference__ModelAssignment_0"
    // InternalKVis.g:8741:1: rule__VariableReference__ModelAssignment_0 : ( ruleModelReference ) ;
    public final void rule__VariableReference__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8745:1: ( ( ruleModelReference ) )
            // InternalKVis.g:8746:1: ( ruleModelReference )
            {
            // InternalKVis.g:8746:1: ( ruleModelReference )
            // InternalKVis.g:8747:1: ruleModelReference
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
    // InternalKVis.g:8756:1: rule__VariableReference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableReference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8760:1: ( ( RULE_ID ) )
            // InternalKVis.g:8761:1: ( RULE_ID )
            {
            // InternalKVis.g:8761:1: ( RULE_ID )
            // InternalKVis.g:8762:1: RULE_ID
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
    // InternalKVis.g:8771:1: rule__VariableReference__IndicesAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__VariableReference__IndicesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8775:1: ( ( RULE_INT ) )
            // InternalKVis.g:8776:1: ( RULE_INT )
            {
            // InternalKVis.g:8776:1: ( RULE_INT )
            // InternalKVis.g:8777:1: RULE_INT
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
    // InternalKVis.g:8786:1: rule__ModelReference__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ModelReference__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8790:1: ( ( RULE_ID ) )
            // InternalKVis.g:8791:1: ( RULE_ID )
            {
            // InternalKVis.g:8791:1: ( RULE_ID )
            // InternalKVis.g:8792:1: RULE_ID
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


    // $ANTLR start "rule__LogicalOrExpression__OperatorAssignment_1_1_0"
    // InternalKVis.g:8801:1: rule__LogicalOrExpression__OperatorAssignment_1_1_0 : ( ruleLogicalOrOperator ) ;
    public final void rule__LogicalOrExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8805:1: ( ( ruleLogicalOrOperator ) )
            // InternalKVis.g:8806:1: ( ruleLogicalOrOperator )
            {
            // InternalKVis.g:8806:1: ( ruleLogicalOrOperator )
            // InternalKVis.g:8807:1: ruleLogicalOrOperator
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
    // InternalKVis.g:8816:1: rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1 : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8820:1: ( ( ruleLogicalAndExpression ) )
            // InternalKVis.g:8821:1: ( ruleLogicalAndExpression )
            {
            // InternalKVis.g:8821:1: ( ruleLogicalAndExpression )
            // InternalKVis.g:8822:1: ruleLogicalAndExpression
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
    // InternalKVis.g:8831:1: rule__LogicalAndExpression__OperatorAssignment_1_1_0 : ( ruleLogicalAndOperator ) ;
    public final void rule__LogicalAndExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8835:1: ( ( ruleLogicalAndOperator ) )
            // InternalKVis.g:8836:1: ( ruleLogicalAndOperator )
            {
            // InternalKVis.g:8836:1: ( ruleLogicalAndOperator )
            // InternalKVis.g:8837:1: ruleLogicalAndOperator
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
    // InternalKVis.g:8846:1: rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1 : ( ruleBitwiseOrExpression ) ;
    public final void rule__LogicalAndExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8850:1: ( ( ruleBitwiseOrExpression ) )
            // InternalKVis.g:8851:1: ( ruleBitwiseOrExpression )
            {
            // InternalKVis.g:8851:1: ( ruleBitwiseOrExpression )
            // InternalKVis.g:8852:1: ruleBitwiseOrExpression
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
    // InternalKVis.g:8861:1: rule__BitwiseOrExpression__OperatorAssignment_1_1_0 : ( ruleBitwiseOrOperator ) ;
    public final void rule__BitwiseOrExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8865:1: ( ( ruleBitwiseOrOperator ) )
            // InternalKVis.g:8866:1: ( ruleBitwiseOrOperator )
            {
            // InternalKVis.g:8866:1: ( ruleBitwiseOrOperator )
            // InternalKVis.g:8867:1: ruleBitwiseOrOperator
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
    // InternalKVis.g:8876:1: rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1 : ( ruleBitwiseAndExpression ) ;
    public final void rule__BitwiseOrExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8880:1: ( ( ruleBitwiseAndExpression ) )
            // InternalKVis.g:8881:1: ( ruleBitwiseAndExpression )
            {
            // InternalKVis.g:8881:1: ( ruleBitwiseAndExpression )
            // InternalKVis.g:8882:1: ruleBitwiseAndExpression
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
    // InternalKVis.g:8891:1: rule__BitwiseAndExpression__OperatorAssignment_1_1_0 : ( ruleBitwiseAndOperator ) ;
    public final void rule__BitwiseAndExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8895:1: ( ( ruleBitwiseAndOperator ) )
            // InternalKVis.g:8896:1: ( ruleBitwiseAndOperator )
            {
            // InternalKVis.g:8896:1: ( ruleBitwiseAndOperator )
            // InternalKVis.g:8897:1: ruleBitwiseAndOperator
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
    // InternalKVis.g:8906:1: rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1 : ( ruleCompareOperation ) ;
    public final void rule__BitwiseAndExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8910:1: ( ( ruleCompareOperation ) )
            // InternalKVis.g:8911:1: ( ruleCompareOperation )
            {
            // InternalKVis.g:8911:1: ( ruleCompareOperation )
            // InternalKVis.g:8912:1: ruleCompareOperation
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
    // InternalKVis.g:8921:1: rule__CompareOperation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__CompareOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8925:1: ( ( ruleCompareOperator ) )
            // InternalKVis.g:8926:1: ( ruleCompareOperator )
            {
            // InternalKVis.g:8926:1: ( ruleCompareOperator )
            // InternalKVis.g:8927:1: ruleCompareOperator
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
    // InternalKVis.g:8936:1: rule__CompareOperation__SubExpressionsAssignment_1_2 : ( ruleNotOrValuedExpression ) ;
    public final void rule__CompareOperation__SubExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8940:1: ( ( ruleNotOrValuedExpression ) )
            // InternalKVis.g:8941:1: ( ruleNotOrValuedExpression )
            {
            // InternalKVis.g:8941:1: ( ruleNotOrValuedExpression )
            // InternalKVis.g:8942:1: ruleNotOrValuedExpression
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
    // InternalKVis.g:8951:1: rule__NotExpression__OperatorAssignment_0_1 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8955:1: ( ( ruleNotOperator ) )
            // InternalKVis.g:8956:1: ( ruleNotOperator )
            {
            // InternalKVis.g:8956:1: ( ruleNotOperator )
            // InternalKVis.g:8957:1: ruleNotOperator
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
    // InternalKVis.g:8966:1: rule__NotExpression__SubExpressionsAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8970:1: ( ( ruleNotExpression ) )
            // InternalKVis.g:8971:1: ( ruleNotExpression )
            {
            // InternalKVis.g:8971:1: ( ruleNotExpression )
            // InternalKVis.g:8972:1: ruleNotExpression
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
    // InternalKVis.g:8981:1: rule__AddExpression__OperatorAssignment_1_1_0 : ( ruleAddOperator ) ;
    public final void rule__AddExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:8985:1: ( ( ruleAddOperator ) )
            // InternalKVis.g:8986:1: ( ruleAddOperator )
            {
            // InternalKVis.g:8986:1: ( ruleAddOperator )
            // InternalKVis.g:8987:1: ruleAddOperator
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
    // InternalKVis.g:8996:1: rule__AddExpression__SubExpressionsAssignment_1_1_1 : ( ruleSubExpression ) ;
    public final void rule__AddExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9000:1: ( ( ruleSubExpression ) )
            // InternalKVis.g:9001:1: ( ruleSubExpression )
            {
            // InternalKVis.g:9001:1: ( ruleSubExpression )
            // InternalKVis.g:9002:1: ruleSubExpression
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
    // InternalKVis.g:9011:1: rule__SubExpression__OperatorAssignment_1_1_0 : ( ruleSubOperator ) ;
    public final void rule__SubExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9015:1: ( ( ruleSubOperator ) )
            // InternalKVis.g:9016:1: ( ruleSubOperator )
            {
            // InternalKVis.g:9016:1: ( ruleSubOperator )
            // InternalKVis.g:9017:1: ruleSubOperator
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
    // InternalKVis.g:9026:1: rule__SubExpression__SubExpressionsAssignment_1_1_1 : ( ruleMultExpression ) ;
    public final void rule__SubExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9030:1: ( ( ruleMultExpression ) )
            // InternalKVis.g:9031:1: ( ruleMultExpression )
            {
            // InternalKVis.g:9031:1: ( ruleMultExpression )
            // InternalKVis.g:9032:1: ruleMultExpression
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
    // InternalKVis.g:9041:1: rule__MultExpression__OperatorAssignment_1_1_0 : ( ruleMultOperator ) ;
    public final void rule__MultExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9045:1: ( ( ruleMultOperator ) )
            // InternalKVis.g:9046:1: ( ruleMultOperator )
            {
            // InternalKVis.g:9046:1: ( ruleMultOperator )
            // InternalKVis.g:9047:1: ruleMultOperator
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
    // InternalKVis.g:9056:1: rule__MultExpression__SubExpressionsAssignment_1_1_1 : ( ruleDivExpression ) ;
    public final void rule__MultExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9060:1: ( ( ruleDivExpression ) )
            // InternalKVis.g:9061:1: ( ruleDivExpression )
            {
            // InternalKVis.g:9061:1: ( ruleDivExpression )
            // InternalKVis.g:9062:1: ruleDivExpression
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
    // InternalKVis.g:9071:1: rule__DivExpression__OperatorAssignment_1_1_0 : ( ruleDivOperator ) ;
    public final void rule__DivExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9075:1: ( ( ruleDivOperator ) )
            // InternalKVis.g:9076:1: ( ruleDivOperator )
            {
            // InternalKVis.g:9076:1: ( ruleDivOperator )
            // InternalKVis.g:9077:1: ruleDivOperator
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
    // InternalKVis.g:9086:1: rule__DivExpression__SubExpressionsAssignment_1_1_1 : ( ruleModExpression ) ;
    public final void rule__DivExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9090:1: ( ( ruleModExpression ) )
            // InternalKVis.g:9091:1: ( ruleModExpression )
            {
            // InternalKVis.g:9091:1: ( ruleModExpression )
            // InternalKVis.g:9092:1: ruleModExpression
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
    // InternalKVis.g:9101:1: rule__ModExpression__OperatorAssignment_1_1_0 : ( ruleModOperator ) ;
    public final void rule__ModExpression__OperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9105:1: ( ( ruleModOperator ) )
            // InternalKVis.g:9106:1: ( ruleModOperator )
            {
            // InternalKVis.g:9106:1: ( ruleModOperator )
            // InternalKVis.g:9107:1: ruleModOperator
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
    // InternalKVis.g:9116:1: rule__ModExpression__SubExpressionsAssignment_1_1_1 : ( ruleAtomicValuedExpression ) ;
    public final void rule__ModExpression__SubExpressionsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9120:1: ( ( ruleAtomicValuedExpression ) )
            // InternalKVis.g:9121:1: ( ruleAtomicValuedExpression )
            {
            // InternalKVis.g:9121:1: ( ruleAtomicValuedExpression )
            // InternalKVis.g:9122:1: ruleAtomicValuedExpression
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
    // InternalKVis.g:9131:1: rule__NegExpression__OperatorAssignment_0_1 : ( ruleSubOperator ) ;
    public final void rule__NegExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9135:1: ( ( ruleSubOperator ) )
            // InternalKVis.g:9136:1: ( ruleSubOperator )
            {
            // InternalKVis.g:9136:1: ( ruleSubOperator )
            // InternalKVis.g:9137:1: ruleSubOperator
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
    // InternalKVis.g:9146:1: rule__NegExpression__SubExpressionsAssignment_0_2 : ( ruleNegExpression ) ;
    public final void rule__NegExpression__SubExpressionsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9150:1: ( ( ruleNegExpression ) )
            // InternalKVis.g:9151:1: ( ruleNegExpression )
            {
            // InternalKVis.g:9151:1: ( ruleNegExpression )
            // InternalKVis.g:9152:1: ruleNegExpression
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
    // InternalKVis.g:9161:1: rule__ValuedObjectTestExpression__OperatorAssignment_0_1 : ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) ;
    public final void rule__ValuedObjectTestExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9165:1: ( ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) ) )
            // InternalKVis.g:9166:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            {
            // InternalKVis.g:9166:1: ( ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 ) )
            // InternalKVis.g:9167:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorAlternatives_0_1_0()); 
            }
            // InternalKVis.g:9168:1: ( rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0 )
            // InternalKVis.g:9168:2: rule__ValuedObjectTestExpression__OperatorAlternatives_0_1_0
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
    // InternalKVis.g:9177:1: rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3 : ( ruleValuedObjectTestExpression ) ;
    public final void rule__ValuedObjectTestExpression__SubExpressionsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9181:1: ( ( ruleValuedObjectTestExpression ) )
            // InternalKVis.g:9182:1: ( ruleValuedObjectTestExpression )
            {
            // InternalKVis.g:9182:1: ( ruleValuedObjectTestExpression )
            // InternalKVis.g:9183:1: ruleValuedObjectTestExpression
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
    // InternalKVis.g:9192:1: rule__ValuedObjectReference__ValuedObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ValuedObjectReference__ValuedObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9196:1: ( ( ( RULE_ID ) ) )
            // InternalKVis.g:9197:1: ( ( RULE_ID ) )
            {
            // InternalKVis.g:9197:1: ( ( RULE_ID ) )
            // InternalKVis.g:9198:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
            }
            // InternalKVis.g:9199:1: ( RULE_ID )
            // InternalKVis.g:9200:1: RULE_ID
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


    // $ANTLR start "rule__ValuedObjectReference__IndicesAssignment_1_1"
    // InternalKVis.g:9211:1: rule__ValuedObjectReference__IndicesAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__ValuedObjectReference__IndicesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9215:1: ( ( ruleExpression ) )
            // InternalKVis.g:9216:1: ( ruleExpression )
            {
            // InternalKVis.g:9216:1: ( ruleExpression )
            // InternalKVis.g:9217:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:9226:1: rule__FunctionCall__FunctionNameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__FunctionCall__FunctionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9230:1: ( ( ruleExtendedID ) )
            // InternalKVis.g:9231:1: ( ruleExtendedID )
            {
            // InternalKVis.g:9231:1: ( ruleExtendedID )
            // InternalKVis.g:9232:1: ruleExtendedID
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
    // InternalKVis.g:9241:1: rule__FunctionCall__ParametersAssignment_2_0_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9245:1: ( ( ruleParameter ) )
            // InternalKVis.g:9246:1: ( ruleParameter )
            {
            // InternalKVis.g:9246:1: ( ruleParameter )
            // InternalKVis.g:9247:1: ruleParameter
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
    // InternalKVis.g:9256:1: rule__FunctionCall__ParametersAssignment_2_0_2_1 : ( ruleParameter ) ;
    public final void rule__FunctionCall__ParametersAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9260:1: ( ( ruleParameter ) )
            // InternalKVis.g:9261:1: ( ruleParameter )
            {
            // InternalKVis.g:9261:1: ( ruleParameter )
            // InternalKVis.g:9262:1: ruleParameter
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
    // InternalKVis.g:9271:1: rule__Parameter__PureOutputAssignment_0_0 : ( ( '!' ) ) ;
    public final void rule__Parameter__PureOutputAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9275:1: ( ( ( '!' ) ) )
            // InternalKVis.g:9276:1: ( ( '!' ) )
            {
            // InternalKVis.g:9276:1: ( ( '!' ) )
            // InternalKVis.g:9277:1: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getPureOutputExclamationMarkKeyword_0_0_0()); 
            }
            // InternalKVis.g:9278:1: ( '!' )
            // InternalKVis.g:9279:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getPureOutputExclamationMarkKeyword_0_0_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:9294:1: rule__Parameter__CallByReferenceAssignment_0_1 : ( ( '&' ) ) ;
    public final void rule__Parameter__CallByReferenceAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9298:1: ( ( ( '&' ) ) )
            // InternalKVis.g:9299:1: ( ( '&' ) )
            {
            // InternalKVis.g:9299:1: ( ( '&' ) )
            // InternalKVis.g:9300:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_1_0()); 
            }
            // InternalKVis.g:9301:1: ( '&' )
            // InternalKVis.g:9302:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_1_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKVis.g:9317:1: rule__Parameter__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Parameter__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9321:1: ( ( ruleExpression ) )
            // InternalKVis.g:9322:1: ( ruleExpression )
            {
            // InternalKVis.g:9322:1: ( ruleExpression )
            // InternalKVis.g:9323:1: ruleExpression
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
    // InternalKVis.g:9332:1: rule__TextExpression__TextAssignment : ( RULE_HOSTCODE ) ;
    public final void rule__TextExpression__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9336:1: ( ( RULE_HOSTCODE ) )
            // InternalKVis.g:9337:1: ( RULE_HOSTCODE )
            {
            // InternalKVis.g:9337:1: ( RULE_HOSTCODE )
            // InternalKVis.g:9338:1: RULE_HOSTCODE
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
    // InternalKVis.g:9347:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9351:1: ( ( RULE_INT ) )
            // InternalKVis.g:9352:1: ( RULE_INT )
            {
            // InternalKVis.g:9352:1: ( RULE_INT )
            // InternalKVis.g:9353:1: RULE_INT
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
    // InternalKVis.g:9362:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9366:1: ( ( RULE_FLOAT ) )
            // InternalKVis.g:9367:1: ( RULE_FLOAT )
            {
            // InternalKVis.g:9367:1: ( RULE_FLOAT )
            // InternalKVis.g:9368:1: RULE_FLOAT
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
    // InternalKVis.g:9377:1: rule__BoolValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BoolValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9381:1: ( ( RULE_BOOLEAN ) )
            // InternalKVis.g:9382:1: ( RULE_BOOLEAN )
            {
            // InternalKVis.g:9382:1: ( RULE_BOOLEAN )
            // InternalKVis.g:9383:1: RULE_BOOLEAN
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
    // InternalKVis.g:9392:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9396:1: ( ( RULE_STRING ) )
            // InternalKVis.g:9397:1: ( RULE_STRING )
            {
            // InternalKVis.g:9397:1: ( RULE_STRING )
            // InternalKVis.g:9398:1: RULE_STRING
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
    // InternalKVis.g:9407:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9411:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalKVis.g:9412:1: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalKVis.g:9412:1: ( RULE_COMMENT_ANNOTATION )
            // InternalKVis.g:9413:1: RULE_COMMENT_ANNOTATION
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
    // InternalKVis.g:9422:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9426:1: ( ( ruleExtendedID ) )
            // InternalKVis.g:9427:1: ( ruleExtendedID )
            {
            // InternalKVis.g:9427:1: ( ruleExtendedID )
            // InternalKVis.g:9428:1: ruleExtendedID
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
    // InternalKVis.g:9437:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9441:1: ( ( ruleExtendedID ) )
            // InternalKVis.g:9442:1: ( ruleExtendedID )
            {
            // InternalKVis.g:9442:1: ( ruleExtendedID )
            // InternalKVis.g:9443:1: ruleExtendedID
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
    // InternalKVis.g:9452:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9456:1: ( ( ruleEString ) )
            // InternalKVis.g:9457:1: ( ruleEString )
            {
            // InternalKVis.g:9457:1: ( ruleEString )
            // InternalKVis.g:9458:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // InternalKVis.g:9467:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9471:1: ( ( ruleEString ) )
            // InternalKVis.g:9472:1: ( ruleEString )
            {
            // InternalKVis.g:9472:1: ( ruleEString )
            // InternalKVis.g:9473:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__NameAssignment_1"
    // InternalKVis.g:9482:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9486:1: ( ( ruleExtendedID ) )
            // InternalKVis.g:9487:1: ( ruleExtendedID )
            {
            // InternalKVis.g:9487:1: ( ruleExtendedID )
            // InternalKVis.g:9488:1: ruleExtendedID
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
    // InternalKVis.g:9497:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9501:1: ( ( ruleExtendedID ) )
            // InternalKVis.g:9502:1: ( ruleExtendedID )
            {
            // InternalKVis.g:9502:1: ( ruleExtendedID )
            // InternalKVis.g:9503:1: ruleExtendedID
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
    // InternalKVis.g:9512:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9516:1: ( ( ruleEStringBoolean ) )
            // InternalKVis.g:9517:1: ( ruleEStringBoolean )
            {
            // InternalKVis.g:9517:1: ( ruleEStringBoolean )
            // InternalKVis.g:9518:1: ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
            }

            }


            }

        }
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
    // InternalKVis.g:9527:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9531:1: ( ( ruleEStringBoolean ) )
            // InternalKVis.g:9532:1: ( ruleEStringBoolean )
            {
            // InternalKVis.g:9532:1: ( ruleEStringBoolean )
            // InternalKVis.g:9533:1: ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__NameAssignment_1"
    // InternalKVis.g:9542:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9546:1: ( ( ruleExtendedID ) )
            // InternalKVis.g:9547:1: ( ruleExtendedID )
            {
            // InternalKVis.g:9547:1: ( ruleExtendedID )
            // InternalKVis.g:9548:1: ruleExtendedID
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
    // InternalKVis.g:9557:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9561:1: ( ( RULE_STRING ) )
            // InternalKVis.g:9562:1: ( RULE_STRING )
            {
            // InternalKVis.g:9562:1: ( RULE_STRING )
            // InternalKVis.g:9563:1: RULE_STRING
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
    // InternalKVis.g:9572:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9576:1: ( ( RULE_STRING ) )
            // InternalKVis.g:9577:1: ( RULE_STRING )
            {
            // InternalKVis.g:9577:1: ( RULE_STRING )
            // InternalKVis.g:9578:1: RULE_STRING
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
    // InternalKVis.g:9587:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9591:1: ( ( ruleExtendedID ) )
            // InternalKVis.g:9592:1: ( ruleExtendedID )
            {
            // InternalKVis.g:9592:1: ( ruleExtendedID )
            // InternalKVis.g:9593:1: ruleExtendedID
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
    // InternalKVis.g:9602:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9606:1: ( ( ruleExtendedID ) )
            // InternalKVis.g:9607:1: ( ruleExtendedID )
            {
            // InternalKVis.g:9607:1: ( ruleExtendedID )
            // InternalKVis.g:9608:1: ruleExtendedID
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
    // InternalKVis.g:9617:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9621:1: ( ( RULE_STRING ) )
            // InternalKVis.g:9622:1: ( RULE_STRING )
            {
            // InternalKVis.g:9622:1: ( RULE_STRING )
            // InternalKVis.g:9623:1: RULE_STRING
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
    // InternalKVis.g:9632:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9636:1: ( ( RULE_STRING ) )
            // InternalKVis.g:9637:1: ( RULE_STRING )
            {
            // InternalKVis.g:9637:1: ( RULE_STRING )
            // InternalKVis.g:9638:1: RULE_STRING
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


    // $ANTLR start "rule__KeyBooleanValueAnnotation__NameAssignment_1"
    // InternalKVis.g:9647:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9651:1: ( ( ruleExtendedID ) )
            // InternalKVis.g:9652:1: ( ruleExtendedID )
            {
            // InternalKVis.g:9652:1: ( ruleExtendedID )
            // InternalKVis.g:9653:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:9662:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9666:1: ( ( RULE_BOOLEAN ) )
            // InternalKVis.g:9667:1: ( RULE_BOOLEAN )
            {
            // InternalKVis.g:9667:1: ( RULE_BOOLEAN )
            // InternalKVis.g:9668:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__KeyIntValueAnnotation__NameAssignment_1"
    // InternalKVis.g:9677:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9681:1: ( ( ruleExtendedID ) )
            // InternalKVis.g:9682:1: ( ruleExtendedID )
            {
            // InternalKVis.g:9682:1: ( ruleExtendedID )
            // InternalKVis.g:9683:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:9692:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9696:1: ( ( ruleInteger ) )
            // InternalKVis.g:9697:1: ( ruleInteger )
            {
            // InternalKVis.g:9697:1: ( ruleInteger )
            // InternalKVis.g:9698:1: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__KeyFloatValueAnnotation__NameAssignment_1"
    // InternalKVis.g:9707:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9711:1: ( ( ruleExtendedID ) )
            // InternalKVis.g:9712:1: ( ruleExtendedID )
            {
            // InternalKVis.g:9712:1: ( ruleExtendedID )
            // InternalKVis.g:9713:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalKVis.g:9722:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( ruleFloateger ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKVis.g:9726:1: ( ( ruleFloateger ) )
            // InternalKVis.g:9727:1: ( ruleFloateger )
            {
            // InternalKVis.g:9727:1: ( ruleFloateger )
            // InternalKVis.g:9728:1: ruleFloateger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFloateger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
            }

            }


            }

        }
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

    // $ANTLR start synpred8_InternalKVis
    public final void synpred8_InternalKVis_fragment() throws RecognitionException {   
        // InternalKVis.g:1955:1: ( ( ruleBoolExpression ) )
        // InternalKVis.g:1955:1: ( ruleBoolExpression )
        {
        // InternalKVis.g:1955:1: ( ruleBoolExpression )
        // InternalKVis.g:1956:1: ruleBoolExpression
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
    // $ANTLR end synpred8_InternalKVis

    // $ANTLR start synpred9_InternalKVis
    public final void synpred9_InternalKVis_fragment() throws RecognitionException {   
        // InternalKVis.g:1977:1: ( ( ruleValuedExpression ) )
        // InternalKVis.g:1977:1: ( ruleValuedExpression )
        {
        // InternalKVis.g:1977:1: ( ruleValuedExpression )
        // InternalKVis.g:1978:1: ruleValuedExpression
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
    // $ANTLR end synpred9_InternalKVis

    // $ANTLR start synpred19_InternalKVis
    public final void synpred19_InternalKVis_fragment() throws RecognitionException {   
        // InternalKVis.g:2101:6: ( ( ( rule__AtomicValuedExpression__Group_3__0 ) ) )
        // InternalKVis.g:2101:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        {
        // InternalKVis.g:2101:6: ( ( rule__AtomicValuedExpression__Group_3__0 ) )
        // InternalKVis.g:2102:1: ( rule__AtomicValuedExpression__Group_3__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getAtomicValuedExpressionAccess().getGroup_3()); 
        }
        // InternalKVis.g:2103:1: ( rule__AtomicValuedExpression__Group_3__0 )
        // InternalKVis.g:2103:2: rule__AtomicValuedExpression__Group_3__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__AtomicValuedExpression__Group_3__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalKVis

    // Delegated rules

    public final boolean synpred8_InternalKVis() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalKVis_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalKVis() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalKVis_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalKVis() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalKVis_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\4\13\0\2\uffff";
    static final String dfa_3s = "\1\55\13\0\2\uffff";
    static final String dfa_4s = "\14\uffff\1\1\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\6\1\11\1\2\1\3\1\13\6\uffff\1\1\1\7\2\uffff\1\14\4\uffff\1\10\4\uffff\1\12\16\uffff\1\5",
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

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1950:1: rule__Expression__Alternatives : ( ( ruleBoolExpression ) | ( ruleValuedExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_4 = input.LA(1);

                         
                        int index6_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index6_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_5 = input.LA(1);

                         
                        int index6_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index6_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_6 = input.LA(1);

                         
                        int index6_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index6_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_7 = input.LA(1);

                         
                        int index6_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index6_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA6_8 = input.LA(1);

                         
                        int index6_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index6_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA6_9 = input.LA(1);

                         
                        int index6_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index6_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA6_10 = input.LA(1);

                         
                        int index6_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index6_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA6_11 = input.LA(1);

                         
                        int index6_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalKVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index6_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\1\4\4\uffff\7\0\1\uffff";
    static final String dfa_9s = "\1\55\4\uffff\7\0\1\uffff";
    static final String dfa_10s = "\1\uffff\1\1\12\uffff\1\2";
    static final String dfa_11s = "\5\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\6\1\11\2\1\1\13\6\uffff\1\1\1\7\2\uffff\1\14\4\uffff\1\10\4\uffff\1\12\16\uffff\1\5",
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

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1972:1: rule__NotOrValuedExpression__Alternatives : ( ( ruleValuedExpression ) | ( ruleNotExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalKVis()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalKVis()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_7 = input.LA(1);

                         
                        int index7_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalKVis()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_8 = input.LA(1);

                         
                        int index7_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalKVis()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_9 = input.LA(1);

                         
                        int index7_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalKVis()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_10 = input.LA(1);

                         
                        int index7_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalKVis()) ) {s = 1;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index7_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_11 = input.LA(1);

                         
                        int index7_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalKVis()) ) {s = 1;}

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
    static final String dfa_13s = "\14\uffff";
    static final String dfa_14s = "\1\4\3\uffff\1\0\7\uffff";
    static final String dfa_15s = "\1\55\3\uffff\1\0\7\uffff";
    static final String dfa_16s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String dfa_17s = "\4\uffff\1\0\7\uffff}>";
    static final String[] dfa_18s = {
            "\1\3\2\5\1\1\1\2\1\5\7\uffff\1\5\7\uffff\1\5\4\uffff\1\5\16\uffff\1\4",
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "2078:1: rule__AtomicValuedExpression__Alternatives : ( ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleStringValue ) | ( ( rule__AtomicValuedExpression__Group_3__0 ) ) | ( ruleAtomicExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalKVis()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000024000000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000040L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00002000421303F0L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00002000000101B0L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000010080L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010080L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000007E0000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00002000420303F0L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000002020040L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000200110000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00002000421B03F0L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000480000000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000010100L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x000A000000000000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0002000000000002L});
    }


}