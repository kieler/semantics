package de.cau.cs.kieler.kicool.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.kicool.services.KiCoolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKiCoolParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'version'", "'label'", "'input'", "'metric'", "'alias'", "'['", "']'", "'pre'", "'set'", "'post'", "'|'", "'@'", "'#'", "','", "'.'", "'-'", "'key'"
    };
    public static final int RULE_COMMENT_ANNOTATION=9;
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_NUMBER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_FLOAT=8;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalKiCoolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKiCoolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKiCoolParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKiCool.g"; }


     
     	private KiCoolGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(KiCoolGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSystem"
    // InternalKiCool.g:61:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalKiCool.g:62:1: ( ruleSystem EOF )
            // InternalKiCool.g:63:1: ruleSystem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSystem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemRule()); 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalKiCool.g:70:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:74:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalKiCool.g:75:1: ( ( rule__System__Group__0 ) )
            {
            // InternalKiCool.g:75:1: ( ( rule__System__Group__0 ) )
            // InternalKiCool.g:76:1: ( rule__System__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getGroup()); 
            }
            // InternalKiCool.g:77:1: ( rule__System__Group__0 )
            // InternalKiCool.g:77:2: rule__System__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleMetric"
    // InternalKiCool.g:89:1: entryRuleMetric : ruleMetric EOF ;
    public final void entryRuleMetric() throws RecognitionException {
        try {
            // InternalKiCool.g:90:1: ( ruleMetric EOF )
            // InternalKiCool.g:91:1: ruleMetric EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMetric();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricRule()); 
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
    // $ANTLR end "entryRuleMetric"


    // $ANTLR start "ruleMetric"
    // InternalKiCool.g:98:1: ruleMetric : ( ( rule__Metric__Group__0 ) ) ;
    public final void ruleMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:102:2: ( ( ( rule__Metric__Group__0 ) ) )
            // InternalKiCool.g:103:1: ( ( rule__Metric__Group__0 ) )
            {
            // InternalKiCool.g:103:1: ( ( rule__Metric__Group__0 ) )
            // InternalKiCool.g:104:1: ( rule__Metric__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getGroup()); 
            }
            // InternalKiCool.g:105:1: ( rule__Metric__Group__0 )
            // InternalKiCool.g:105:2: rule__Metric__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Metric__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetric"


    // $ANTLR start "entryRuleProcessorGroup"
    // InternalKiCool.g:117:1: entryRuleProcessorGroup : ruleProcessorGroup EOF ;
    public final void entryRuleProcessorGroup() throws RecognitionException {
        try {
            // InternalKiCool.g:118:1: ( ruleProcessorGroup EOF )
            // InternalKiCool.g:119:1: ruleProcessorGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleProcessorGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupRule()); 
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
    // $ANTLR end "entryRuleProcessorGroup"


    // $ANTLR start "ruleProcessorGroup"
    // InternalKiCool.g:126:1: ruleProcessorGroup : ( ( rule__ProcessorGroup__Group__0 ) ) ;
    public final void ruleProcessorGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:130:2: ( ( ( rule__ProcessorGroup__Group__0 ) ) )
            // InternalKiCool.g:131:1: ( ( rule__ProcessorGroup__Group__0 ) )
            {
            // InternalKiCool.g:131:1: ( ( rule__ProcessorGroup__Group__0 ) )
            // InternalKiCool.g:132:1: ( rule__ProcessorGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getGroup()); 
            }
            // InternalKiCool.g:133:1: ( rule__ProcessorGroup__Group__0 )
            // InternalKiCool.g:133:2: rule__ProcessorGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessorGroup"


    // $ANTLR start "entryRuleProcessor"
    // InternalKiCool.g:145:1: entryRuleProcessor : ruleProcessor EOF ;
    public final void entryRuleProcessor() throws RecognitionException {
        try {
            // InternalKiCool.g:146:1: ( ruleProcessor EOF )
            // InternalKiCool.g:147:1: ruleProcessor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleProcessor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorRule()); 
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
    // $ANTLR end "entryRuleProcessor"


    // $ANTLR start "ruleProcessor"
    // InternalKiCool.g:154:1: ruleProcessor : ( ( rule__Processor__Group__0 ) ) ;
    public final void ruleProcessor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:158:2: ( ( ( rule__Processor__Group__0 ) ) )
            // InternalKiCool.g:159:1: ( ( rule__Processor__Group__0 ) )
            {
            // InternalKiCool.g:159:1: ( ( rule__Processor__Group__0 ) )
            // InternalKiCool.g:160:1: ( rule__Processor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup()); 
            }
            // InternalKiCool.g:161:1: ( rule__Processor__Group__0 )
            // InternalKiCool.g:161:2: rule__Processor__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessor"


    // $ANTLR start "entryRuleProcessorSystem"
    // InternalKiCool.g:173:1: entryRuleProcessorSystem : ruleProcessorSystem EOF ;
    public final void entryRuleProcessorSystem() throws RecognitionException {
        try {
            // InternalKiCool.g:174:1: ( ruleProcessorSystem EOF )
            // InternalKiCool.g:175:1: ruleProcessorSystem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorSystemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleProcessorSystem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorSystemRule()); 
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
    // $ANTLR end "entryRuleProcessorSystem"


    // $ANTLR start "ruleProcessorSystem"
    // InternalKiCool.g:182:1: ruleProcessorSystem : ( ( rule__ProcessorSystem__IdAssignment ) ) ;
    public final void ruleProcessorSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:186:2: ( ( ( rule__ProcessorSystem__IdAssignment ) ) )
            // InternalKiCool.g:187:1: ( ( rule__ProcessorSystem__IdAssignment ) )
            {
            // InternalKiCool.g:187:1: ( ( rule__ProcessorSystem__IdAssignment ) )
            // InternalKiCool.g:188:1: ( rule__ProcessorSystem__IdAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorSystemAccess().getIdAssignment()); 
            }
            // InternalKiCool.g:189:1: ( rule__ProcessorSystem__IdAssignment )
            // InternalKiCool.g:189:2: rule__ProcessorSystem__IdAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorSystem__IdAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorSystemAccess().getIdAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessorSystem"


    // $ANTLR start "entryRuleProcessorAlternativeGroup"
    // InternalKiCool.g:201:1: entryRuleProcessorAlternativeGroup : ruleProcessorAlternativeGroup EOF ;
    public final void entryRuleProcessorAlternativeGroup() throws RecognitionException {
        try {
            // InternalKiCool.g:202:1: ( ruleProcessorAlternativeGroup EOF )
            // InternalKiCool.g:203:1: ruleProcessorAlternativeGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleProcessorAlternativeGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupRule()); 
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
    // $ANTLR end "entryRuleProcessorAlternativeGroup"


    // $ANTLR start "ruleProcessorAlternativeGroup"
    // InternalKiCool.g:210:1: ruleProcessorAlternativeGroup : ( ( rule__ProcessorAlternativeGroup__Group__0 ) ) ;
    public final void ruleProcessorAlternativeGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:214:2: ( ( ( rule__ProcessorAlternativeGroup__Group__0 ) ) )
            // InternalKiCool.g:215:1: ( ( rule__ProcessorAlternativeGroup__Group__0 ) )
            {
            // InternalKiCool.g:215:1: ( ( rule__ProcessorAlternativeGroup__Group__0 ) )
            // InternalKiCool.g:216:1: ( rule__ProcessorAlternativeGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup()); 
            }
            // InternalKiCool.g:217:1: ( rule__ProcessorAlternativeGroup__Group__0 )
            // InternalKiCool.g:217:2: rule__ProcessorAlternativeGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorAlternativeGroup__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessorAlternativeGroup"


    // $ANTLR start "entryRuleKVPair"
    // InternalKiCool.g:229:1: entryRuleKVPair : ruleKVPair EOF ;
    public final void entryRuleKVPair() throws RecognitionException {
        try {
            // InternalKiCool.g:230:1: ( ruleKVPair EOF )
            // InternalKiCool.g:231:1: ruleKVPair EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleKVPair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKVPairRule()); 
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
    // $ANTLR end "entryRuleKVPair"


    // $ANTLR start "ruleKVPair"
    // InternalKiCool.g:238:1: ruleKVPair : ( ( rule__KVPair__Group__0 ) ) ;
    public final void ruleKVPair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:242:2: ( ( ( rule__KVPair__Group__0 ) ) )
            // InternalKiCool.g:243:1: ( ( rule__KVPair__Group__0 ) )
            {
            // InternalKiCool.g:243:1: ( ( rule__KVPair__Group__0 ) )
            // InternalKiCool.g:244:1: ( rule__KVPair__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getGroup()); 
            }
            // InternalKiCool.g:245:1: ( rule__KVPair__Group__0 )
            // InternalKiCool.g:245:2: rule__KVPair__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KVPair__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKVPairAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKVPair"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalKiCool.g:267:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:268:1: ( ruleCommentAnnotation EOF )
            // InternalKiCool.g:269:1: ruleCommentAnnotation EOF
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
    // InternalKiCool.g:276:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValuesAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:280:2: ( ( ( rule__CommentAnnotation__ValuesAssignment ) ) )
            // InternalKiCool.g:281:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            {
            // InternalKiCool.g:281:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            // InternalKiCool.g:282:1: ( rule__CommentAnnotation__ValuesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            }
            // InternalKiCool.g:283:1: ( rule__CommentAnnotation__ValuesAssignment )
            // InternalKiCool.g:283:2: rule__CommentAnnotation__ValuesAssignment
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
    // InternalKiCool.g:295:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:296:1: ( ruleTagAnnotation EOF )
            // InternalKiCool.g:297:1: ruleTagAnnotation EOF
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
    // InternalKiCool.g:304:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:308:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // InternalKiCool.g:309:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:309:1: ( ( rule__TagAnnotation__Group__0 ) )
            // InternalKiCool.g:310:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:311:1: ( rule__TagAnnotation__Group__0 )
            // InternalKiCool.g:311:2: rule__TagAnnotation__Group__0
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


    // $ANTLR start "entryRulePragmaTagAnnotation"
    // InternalKiCool.g:323:1: entryRulePragmaTagAnnotation : rulePragmaTagAnnotation EOF ;
    public final void entryRulePragmaTagAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:324:1: ( rulePragmaTagAnnotation EOF )
            // InternalKiCool.g:325:1: rulePragmaTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePragmaTagAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPragmaTagAnnotationRule()); 
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
    // $ANTLR end "entryRulePragmaTagAnnotation"


    // $ANTLR start "rulePragmaTagAnnotation"
    // InternalKiCool.g:332:1: rulePragmaTagAnnotation : ( ( rule__PragmaTagAnnotation__Group__0 ) ) ;
    public final void rulePragmaTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:336:2: ( ( ( rule__PragmaTagAnnotation__Group__0 ) ) )
            // InternalKiCool.g:337:1: ( ( rule__PragmaTagAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:337:1: ( ( rule__PragmaTagAnnotation__Group__0 ) )
            // InternalKiCool.g:338:1: ( rule__PragmaTagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:339:1: ( rule__PragmaTagAnnotation__Group__0 )
            // InternalKiCool.g:339:2: rule__PragmaTagAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTagAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPragmaTagAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePragmaTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // InternalKiCool.g:351:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:352:1: ( ruleKeyStringValueAnnotation EOF )
            // InternalKiCool.g:353:1: ruleKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:360:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:364:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:365:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:365:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:366:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:367:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:367:2: rule__KeyStringValueAnnotation__Group__0
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


    // $ANTLR start "entryRuleRestrictedKeyStringValueAnnotation"
    // InternalKiCool.g:379:1: entryRuleRestrictedKeyStringValueAnnotation : ruleRestrictedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:380:1: ( ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:381:1: ruleRestrictedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRestrictedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationRule()); 
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
    // $ANTLR end "entryRuleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedKeyStringValueAnnotation"
    // InternalKiCool.g:388:1: ruleRestrictedKeyStringValueAnnotation : ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:392:2: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:393:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:393:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:394:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:395:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:395:2: rule__RestrictedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "entryRulePramgaKeyStringValueAnnotation"
    // InternalKiCool.g:407:1: entryRulePramgaKeyStringValueAnnotation : rulePramgaKeyStringValueAnnotation EOF ;
    public final void entryRulePramgaKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:408:1: ( rulePramgaKeyStringValueAnnotation EOF )
            // InternalKiCool.g:409:1: rulePramgaKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPramgaKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePramgaKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPramgaKeyStringValueAnnotationRule()); 
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
    // $ANTLR end "entryRulePramgaKeyStringValueAnnotation"


    // $ANTLR start "rulePramgaKeyStringValueAnnotation"
    // InternalKiCool.g:416:1: rulePramgaKeyStringValueAnnotation : ( ( rule__PramgaKeyStringValueAnnotation__Group__0 ) ) ;
    public final void rulePramgaKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:420:2: ( ( ( rule__PramgaKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:421:1: ( ( rule__PramgaKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:421:1: ( ( rule__PramgaKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:422:1: ( rule__PramgaKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:423:1: ( rule__PramgaKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:423:2: rule__PramgaKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePramgaKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalKiCool.g:435:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:436:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:437:1: ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:444:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:448:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:449:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:449:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:450:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:451:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:451:2: rule__TypedKeyStringValueAnnotation__Group__0
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


    // $ANTLR start "entryRuleRestrictedTypedKeyStringValueAnnotation"
    // InternalKiCool.g:463:1: entryRuleRestrictedTypedKeyStringValueAnnotation : ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:464:1: ( ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:465:1: ruleRestrictedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRestrictedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()); 
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
    // $ANTLR end "entryRuleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedTypedKeyStringValueAnnotation"
    // InternalKiCool.g:472:1: ruleRestrictedTypedKeyStringValueAnnotation : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:476:2: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:477:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:477:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:478:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:479:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:479:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalKiCool.g:491:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:492:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:493:1: ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:500:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:504:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:505:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:505:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:506:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:507:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:507:2: rule__QuotedKeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:519:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:520:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:521:1: ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:528:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:532:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:533:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:533:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:534:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:535:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:535:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalKiCool.g:547:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKiCool.g:548:1: ( ruleEString EOF )
            // InternalKiCool.g:549:1: ruleEString EOF
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
    // InternalKiCool.g:556:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:560:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalKiCool.g:561:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalKiCool.g:561:1: ( ( rule__EString__Alternatives ) )
            // InternalKiCool.g:562:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalKiCool.g:563:1: ( rule__EString__Alternatives )
            // InternalKiCool.g:563:2: rule__EString__Alternatives
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
    // InternalKiCool.g:575:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // InternalKiCool.g:576:1: ( ruleEStringBoolean EOF )
            // InternalKiCool.g:577:1: ruleEStringBoolean EOF
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
    // InternalKiCool.g:584:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:588:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // InternalKiCool.g:589:1: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // InternalKiCool.g:589:1: ( ( rule__EStringBoolean__Alternatives ) )
            // InternalKiCool.g:590:1: ( rule__EStringBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            }
            // InternalKiCool.g:591:1: ( rule__EStringBoolean__Alternatives )
            // InternalKiCool.g:591:2: rule__EStringBoolean__Alternatives
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


    // $ANTLR start "entryRuleEStringAllTypes"
    // InternalKiCool.g:603:1: entryRuleEStringAllTypes : ruleEStringAllTypes EOF ;
    public final void entryRuleEStringAllTypes() throws RecognitionException {
        try {
            // InternalKiCool.g:604:1: ( ruleEStringAllTypes EOF )
            // InternalKiCool.g:605:1: ruleEStringAllTypes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAllTypesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAllTypesRule()); 
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
    // $ANTLR end "entryRuleEStringAllTypes"


    // $ANTLR start "ruleEStringAllTypes"
    // InternalKiCool.g:612:1: ruleEStringAllTypes : ( ( rule__EStringAllTypes__Alternatives ) ) ;
    public final void ruleEStringAllTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:616:2: ( ( ( rule__EStringAllTypes__Alternatives ) ) )
            // InternalKiCool.g:617:1: ( ( rule__EStringAllTypes__Alternatives ) )
            {
            // InternalKiCool.g:617:1: ( ( rule__EStringAllTypes__Alternatives ) )
            // InternalKiCool.g:618:1: ( rule__EStringAllTypes__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAllTypesAccess().getAlternatives()); 
            }
            // InternalKiCool.g:619:1: ( rule__EStringAllTypes__Alternatives )
            // InternalKiCool.g:619:2: rule__EStringAllTypes__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EStringAllTypes__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAllTypesAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEStringAllTypes"


    // $ANTLR start "entryRuleExtendedID"
    // InternalKiCool.g:631:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // InternalKiCool.g:632:1: ( ruleExtendedID EOF )
            // InternalKiCool.g:633:1: ruleExtendedID EOF
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
    // InternalKiCool.g:640:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:644:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // InternalKiCool.g:645:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // InternalKiCool.g:645:1: ( ( rule__ExtendedID__Group__0 ) )
            // InternalKiCool.g:646:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // InternalKiCool.g:647:1: ( rule__ExtendedID__Group__0 )
            // InternalKiCool.g:647:2: rule__ExtendedID__Group__0
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


    // $ANTLR start "entryRuleQualifiedID"
    // InternalKiCool.g:659:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // InternalKiCool.g:660:1: ( ruleQualifiedID EOF )
            // InternalKiCool.g:661:1: ruleQualifiedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleQualifiedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedIDRule()); 
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
    // $ANTLR end "entryRuleQualifiedID"


    // $ANTLR start "ruleQualifiedID"
    // InternalKiCool.g:668:1: ruleQualifiedID : ( ( rule__QualifiedID__Group__0 ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:672:2: ( ( ( rule__QualifiedID__Group__0 ) ) )
            // InternalKiCool.g:673:1: ( ( rule__QualifiedID__Group__0 ) )
            {
            // InternalKiCool.g:673:1: ( ( rule__QualifiedID__Group__0 ) )
            // InternalKiCool.g:674:1: ( rule__QualifiedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedIDAccess().getGroup()); 
            }
            // InternalKiCool.g:675:1: ( rule__QualifiedID__Group__0 )
            // InternalKiCool.g:675:2: rule__QualifiedID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedID__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedIDAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedID"


    // $ANTLR start "entryRuleInteger"
    // InternalKiCool.g:687:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalKiCool.g:688:1: ( ruleInteger EOF )
            // InternalKiCool.g:689:1: ruleInteger EOF
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
    // InternalKiCool.g:696:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:700:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalKiCool.g:701:1: ( ( rule__Integer__Group__0 ) )
            {
            // InternalKiCool.g:701:1: ( ( rule__Integer__Group__0 ) )
            // InternalKiCool.g:702:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // InternalKiCool.g:703:1: ( rule__Integer__Group__0 )
            // InternalKiCool.g:703:2: rule__Integer__Group__0
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
    // InternalKiCool.g:715:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // InternalKiCool.g:716:1: ( ruleFloateger EOF )
            // InternalKiCool.g:717:1: ruleFloateger EOF
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
    // InternalKiCool.g:724:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:728:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // InternalKiCool.g:729:1: ( ( rule__Floateger__Group__0 ) )
            {
            // InternalKiCool.g:729:1: ( ( rule__Floateger__Group__0 ) )
            // InternalKiCool.g:730:1: ( rule__Floateger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getGroup()); 
            }
            // InternalKiCool.g:731:1: ( rule__Floateger__Group__0 )
            // InternalKiCool.g:731:2: rule__Floateger__Group__0
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


    // $ANTLR start "rule__ProcessorGroup__Alternatives_1"
    // InternalKiCool.g:743:1: rule__ProcessorGroup__Alternatives_1 : ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) ) | ( ( rule__ProcessorGroup__Group_1_1__0 ) ) | ( ( rule__ProcessorGroup__Group_1_2__0 ) ) | ( ( rule__ProcessorGroup__Group_1_3__0 ) ) );
    public final void rule__ProcessorGroup__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:747:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) ) | ( ( rule__ProcessorGroup__Group_1_1__0 ) ) | ( ( rule__ProcessorGroup__Group_1_2__0 ) ) | ( ( rule__ProcessorGroup__Group_1_3__0 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 23:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                int LA1_4 = input.LA(2);

                if ( (synpred3_InternalKiCool()) ) {
                    alt1=3;
                }
                else if ( (true) ) {
                    alt1=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

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
                    // InternalKiCool.g:748:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) )
                    {
                    // InternalKiCool.g:748:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) )
                    // InternalKiCool.g:749:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_0()); 
                    }
                    // InternalKiCool.g:750:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_0 )
                    // InternalKiCool.g:750:2: rule__ProcessorGroup__ProcessorsAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ProcessorGroup__ProcessorsAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiCool.g:754:6: ( ( rule__ProcessorGroup__Group_1_1__0 ) )
                    {
                    // InternalKiCool.g:754:6: ( ( rule__ProcessorGroup__Group_1_1__0 ) )
                    // InternalKiCool.g:755:1: ( rule__ProcessorGroup__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getGroup_1_1()); 
                    }
                    // InternalKiCool.g:756:1: ( rule__ProcessorGroup__Group_1_1__0 )
                    // InternalKiCool.g:756:2: rule__ProcessorGroup__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ProcessorGroup__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProcessorGroupAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKiCool.g:760:6: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
                    {
                    // InternalKiCool.g:760:6: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
                    // InternalKiCool.g:761:1: ( rule__ProcessorGroup__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getGroup_1_2()); 
                    }
                    // InternalKiCool.g:762:1: ( rule__ProcessorGroup__Group_1_2__0 )
                    // InternalKiCool.g:762:2: rule__ProcessorGroup__Group_1_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ProcessorGroup__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProcessorGroupAccess().getGroup_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKiCool.g:766:6: ( ( rule__ProcessorGroup__Group_1_3__0 ) )
                    {
                    // InternalKiCool.g:766:6: ( ( rule__ProcessorGroup__Group_1_3__0 ) )
                    // InternalKiCool.g:767:1: ( rule__ProcessorGroup__Group_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getGroup_1_3()); 
                    }
                    // InternalKiCool.g:768:1: ( rule__ProcessorGroup__Group_1_3__0 )
                    // InternalKiCool.g:768:2: rule__ProcessorGroup__Group_1_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ProcessorGroup__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProcessorGroupAccess().getGroup_1_3()); 
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
    // $ANTLR end "rule__ProcessorGroup__Alternatives_1"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalKiCool.g:782:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:786:1: ( ( RULE_STRING ) | ( ruleExtendedID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKiCool.g:787:1: ( RULE_STRING )
                    {
                    // InternalKiCool.g:787:1: ( RULE_STRING )
                    // InternalKiCool.g:788:1: RULE_STRING
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
                    // InternalKiCool.g:793:6: ( ruleExtendedID )
                    {
                    // InternalKiCool.g:793:6: ( ruleExtendedID )
                    // InternalKiCool.g:794:1: ruleExtendedID
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
    // InternalKiCool.g:804:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:808:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalKiCool.g:809:1: ( RULE_STRING )
                    {
                    // InternalKiCool.g:809:1: ( RULE_STRING )
                    // InternalKiCool.g:810:1: RULE_STRING
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
                    // InternalKiCool.g:815:6: ( ruleExtendedID )
                    {
                    // InternalKiCool.g:815:6: ( ruleExtendedID )
                    // InternalKiCool.g:816:1: ruleExtendedID
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
                    // InternalKiCool.g:821:6: ( RULE_BOOLEAN )
                    {
                    // InternalKiCool.g:821:6: ( RULE_BOOLEAN )
                    // InternalKiCool.g:822:1: RULE_BOOLEAN
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


    // $ANTLR start "rule__EStringAllTypes__Alternatives"
    // InternalKiCool.g:832:1: rule__EStringAllTypes__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) );
    public final void rule__EStringAllTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:836:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==RULE_INT) ) {
                    alt4=4;
                }
                else if ( (LA4_4==RULE_FLOAT) ) {
                    alt4=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt4=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt4=5;
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
                    // InternalKiCool.g:837:1: ( RULE_STRING )
                    {
                    // InternalKiCool.g:837:1: ( RULE_STRING )
                    // InternalKiCool.g:838:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiCool.g:843:6: ( ruleExtendedID )
                    {
                    // InternalKiCool.g:843:6: ( ruleExtendedID )
                    // InternalKiCool.g:844:1: ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAllTypesAccess().getExtendedIDParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAllTypesAccess().getExtendedIDParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKiCool.g:849:6: ( RULE_BOOLEAN )
                    {
                    // InternalKiCool.g:849:6: ( RULE_BOOLEAN )
                    // InternalKiCool.g:850:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 
                    }
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKiCool.g:855:6: ( ruleInteger )
                    {
                    // InternalKiCool.g:855:6: ( ruleInteger )
                    // InternalKiCool.g:856:1: ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAllTypesAccess().getIntegerParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAllTypesAccess().getIntegerParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKiCool.g:861:6: ( ruleFloateger )
                    {
                    // InternalKiCool.g:861:6: ( ruleFloateger )
                    // InternalKiCool.g:862:1: ruleFloateger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAllTypesAccess().getFloategerParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFloateger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAllTypesAccess().getFloategerParserRuleCall_4()); 
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
    // $ANTLR end "rule__EStringAllTypes__Alternatives"


    // $ANTLR start "rule__System__Group__0"
    // InternalKiCool.g:874:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:878:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalKiCool.g:879:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__System__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalKiCool.g:886:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:890:1: ( ( 'system' ) )
            // InternalKiCool.g:891:1: ( 'system' )
            {
            // InternalKiCool.g:891:1: ( 'system' )
            // InternalKiCool.g:892:1: 'system'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalKiCool.g:905:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:909:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalKiCool.g:910:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__System__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalKiCool.g:917:1: rule__System__Group__1__Impl : ( ( rule__System__IdAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:921:1: ( ( ( rule__System__IdAssignment_1 ) ) )
            // InternalKiCool.g:922:1: ( ( rule__System__IdAssignment_1 ) )
            {
            // InternalKiCool.g:922:1: ( ( rule__System__IdAssignment_1 ) )
            // InternalKiCool.g:923:1: ( rule__System__IdAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getIdAssignment_1()); 
            }
            // InternalKiCool.g:924:1: ( rule__System__IdAssignment_1 )
            // InternalKiCool.g:924:2: rule__System__IdAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__IdAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getIdAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalKiCool.g:934:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:938:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalKiCool.g:939:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__System__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalKiCool.g:946:1: rule__System__Group__2__Impl : ( 'version' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:950:1: ( ( 'version' ) )
            // InternalKiCool.g:951:1: ( 'version' )
            {
            // InternalKiCool.g:951:1: ( 'version' )
            // InternalKiCool.g:952:1: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getVersionKeyword_2()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getVersionKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalKiCool.g:965:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:969:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalKiCool.g:970:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__System__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalKiCool.g:977:1: rule__System__Group__3__Impl : ( ( rule__System__VersionAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:981:1: ( ( ( rule__System__VersionAssignment_3 ) ) )
            // InternalKiCool.g:982:1: ( ( rule__System__VersionAssignment_3 ) )
            {
            // InternalKiCool.g:982:1: ( ( rule__System__VersionAssignment_3 ) )
            // InternalKiCool.g:983:1: ( rule__System__VersionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getVersionAssignment_3()); 
            }
            // InternalKiCool.g:984:1: ( rule__System__VersionAssignment_3 )
            // InternalKiCool.g:984:2: rule__System__VersionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__VersionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getVersionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // InternalKiCool.g:994:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:998:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalKiCool.g:999:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__System__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // InternalKiCool.g:1006:1: rule__System__Group__4__Impl : ( 'label' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1010:1: ( ( 'label' ) )
            // InternalKiCool.g:1011:1: ( 'label' )
            {
            // InternalKiCool.g:1011:1: ( 'label' )
            // InternalKiCool.g:1012:1: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getLabelKeyword_4()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getLabelKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // InternalKiCool.g:1025:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1029:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // InternalKiCool.g:1030:2: rule__System__Group__5__Impl rule__System__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__System__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // InternalKiCool.g:1037:1: rule__System__Group__5__Impl : ( ( rule__System__LabelAssignment_5 ) ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1041:1: ( ( ( rule__System__LabelAssignment_5 ) ) )
            // InternalKiCool.g:1042:1: ( ( rule__System__LabelAssignment_5 ) )
            {
            // InternalKiCool.g:1042:1: ( ( rule__System__LabelAssignment_5 ) )
            // InternalKiCool.g:1043:1: ( rule__System__LabelAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getLabelAssignment_5()); 
            }
            // InternalKiCool.g:1044:1: ( rule__System__LabelAssignment_5 )
            // InternalKiCool.g:1044:2: rule__System__LabelAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__LabelAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getLabelAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__System__Group__6"
    // InternalKiCool.g:1054:1: rule__System__Group__6 : rule__System__Group__6__Impl rule__System__Group__7 ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1058:1: ( rule__System__Group__6__Impl rule__System__Group__7 )
            // InternalKiCool.g:1059:2: rule__System__Group__6__Impl rule__System__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__System__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6"


    // $ANTLR start "rule__System__Group__6__Impl"
    // InternalKiCool.g:1066:1: rule__System__Group__6__Impl : ( ( rule__System__Group_6__0 )? ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1070:1: ( ( ( rule__System__Group_6__0 )? ) )
            // InternalKiCool.g:1071:1: ( ( rule__System__Group_6__0 )? )
            {
            // InternalKiCool.g:1071:1: ( ( rule__System__Group_6__0 )? )
            // InternalKiCool.g:1072:1: ( rule__System__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getGroup_6()); 
            }
            // InternalKiCool.g:1073:1: ( rule__System__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKiCool.g:1073:2: rule__System__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__System__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6__Impl"


    // $ANTLR start "rule__System__Group__7"
    // InternalKiCool.g:1083:1: rule__System__Group__7 : rule__System__Group__7__Impl rule__System__Group__8 ;
    public final void rule__System__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1087:1: ( rule__System__Group__7__Impl rule__System__Group__8 )
            // InternalKiCool.g:1088:2: rule__System__Group__7__Impl rule__System__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__System__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__7"


    // $ANTLR start "rule__System__Group__7__Impl"
    // InternalKiCool.g:1095:1: rule__System__Group__7__Impl : ( ( rule__System__MetricsAssignment_7 )* ) ;
    public final void rule__System__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1099:1: ( ( ( rule__System__MetricsAssignment_7 )* ) )
            // InternalKiCool.g:1100:1: ( ( rule__System__MetricsAssignment_7 )* )
            {
            // InternalKiCool.g:1100:1: ( ( rule__System__MetricsAssignment_7 )* )
            // InternalKiCool.g:1101:1: ( rule__System__MetricsAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getMetricsAssignment_7()); 
            }
            // InternalKiCool.g:1102:1: ( rule__System__MetricsAssignment_7 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKiCool.g:1102:2: rule__System__MetricsAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__System__MetricsAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getMetricsAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__7__Impl"


    // $ANTLR start "rule__System__Group__8"
    // InternalKiCool.g:1112:1: rule__System__Group__8 : rule__System__Group__8__Impl ;
    public final void rule__System__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1116:1: ( rule__System__Group__8__Impl )
            // InternalKiCool.g:1117:2: rule__System__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__8"


    // $ANTLR start "rule__System__Group__8__Impl"
    // InternalKiCool.g:1123:1: rule__System__Group__8__Impl : ( ( rule__System__ProcessorsAssignment_8 ) ) ;
    public final void rule__System__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1127:1: ( ( ( rule__System__ProcessorsAssignment_8 ) ) )
            // InternalKiCool.g:1128:1: ( ( rule__System__ProcessorsAssignment_8 ) )
            {
            // InternalKiCool.g:1128:1: ( ( rule__System__ProcessorsAssignment_8 ) )
            // InternalKiCool.g:1129:1: ( rule__System__ProcessorsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getProcessorsAssignment_8()); 
            }
            // InternalKiCool.g:1130:1: ( rule__System__ProcessorsAssignment_8 )
            // InternalKiCool.g:1130:2: rule__System__ProcessorsAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__ProcessorsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getProcessorsAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__8__Impl"


    // $ANTLR start "rule__System__Group_6__0"
    // InternalKiCool.g:1158:1: rule__System__Group_6__0 : rule__System__Group_6__0__Impl rule__System__Group_6__1 ;
    public final void rule__System__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1162:1: ( rule__System__Group_6__0__Impl rule__System__Group_6__1 )
            // InternalKiCool.g:1163:2: rule__System__Group_6__0__Impl rule__System__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__System__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__0"


    // $ANTLR start "rule__System__Group_6__0__Impl"
    // InternalKiCool.g:1170:1: rule__System__Group_6__0__Impl : ( 'input' ) ;
    public final void rule__System__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1174:1: ( ( 'input' ) )
            // InternalKiCool.g:1175:1: ( 'input' )
            {
            // InternalKiCool.g:1175:1: ( 'input' )
            // InternalKiCool.g:1176:1: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getInputKeyword_6_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getInputKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__0__Impl"


    // $ANTLR start "rule__System__Group_6__1"
    // InternalKiCool.g:1189:1: rule__System__Group_6__1 : rule__System__Group_6__1__Impl ;
    public final void rule__System__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1193:1: ( rule__System__Group_6__1__Impl )
            // InternalKiCool.g:1194:2: rule__System__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__1"


    // $ANTLR start "rule__System__Group_6__1__Impl"
    // InternalKiCool.g:1200:1: rule__System__Group_6__1__Impl : ( ( rule__System__InputClassAssignment_6_1 ) ) ;
    public final void rule__System__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1204:1: ( ( ( rule__System__InputClassAssignment_6_1 ) ) )
            // InternalKiCool.g:1205:1: ( ( rule__System__InputClassAssignment_6_1 ) )
            {
            // InternalKiCool.g:1205:1: ( ( rule__System__InputClassAssignment_6_1 ) )
            // InternalKiCool.g:1206:1: ( rule__System__InputClassAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getInputClassAssignment_6_1()); 
            }
            // InternalKiCool.g:1207:1: ( rule__System__InputClassAssignment_6_1 )
            // InternalKiCool.g:1207:2: rule__System__InputClassAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__InputClassAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getInputClassAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__1__Impl"


    // $ANTLR start "rule__Metric__Group__0"
    // InternalKiCool.g:1221:1: rule__Metric__Group__0 : rule__Metric__Group__0__Impl rule__Metric__Group__1 ;
    public final void rule__Metric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1225:1: ( rule__Metric__Group__0__Impl rule__Metric__Group__1 )
            // InternalKiCool.g:1226:2: rule__Metric__Group__0__Impl rule__Metric__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Metric__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Metric__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__0"


    // $ANTLR start "rule__Metric__Group__0__Impl"
    // InternalKiCool.g:1233:1: rule__Metric__Group__0__Impl : ( 'metric' ) ;
    public final void rule__Metric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1237:1: ( ( 'metric' ) )
            // InternalKiCool.g:1238:1: ( 'metric' )
            {
            // InternalKiCool.g:1238:1: ( 'metric' )
            // InternalKiCool.g:1239:1: 'metric'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getMetricKeyword_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getMetricKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__0__Impl"


    // $ANTLR start "rule__Metric__Group__1"
    // InternalKiCool.g:1252:1: rule__Metric__Group__1 : rule__Metric__Group__1__Impl rule__Metric__Group__2 ;
    public final void rule__Metric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1256:1: ( rule__Metric__Group__1__Impl rule__Metric__Group__2 )
            // InternalKiCool.g:1257:2: rule__Metric__Group__1__Impl rule__Metric__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Metric__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Metric__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__1"


    // $ANTLR start "rule__Metric__Group__1__Impl"
    // InternalKiCool.g:1264:1: rule__Metric__Group__1__Impl : ( ( rule__Metric__IdAssignment_1 ) ) ;
    public final void rule__Metric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1268:1: ( ( ( rule__Metric__IdAssignment_1 ) ) )
            // InternalKiCool.g:1269:1: ( ( rule__Metric__IdAssignment_1 ) )
            {
            // InternalKiCool.g:1269:1: ( ( rule__Metric__IdAssignment_1 ) )
            // InternalKiCool.g:1270:1: ( rule__Metric__IdAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getIdAssignment_1()); 
            }
            // InternalKiCool.g:1271:1: ( rule__Metric__IdAssignment_1 )
            // InternalKiCool.g:1271:2: rule__Metric__IdAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Metric__IdAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getIdAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__1__Impl"


    // $ANTLR start "rule__Metric__Group__2"
    // InternalKiCool.g:1281:1: rule__Metric__Group__2 : rule__Metric__Group__2__Impl ;
    public final void rule__Metric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1285:1: ( rule__Metric__Group__2__Impl )
            // InternalKiCool.g:1286:2: rule__Metric__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Metric__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__2"


    // $ANTLR start "rule__Metric__Group__2__Impl"
    // InternalKiCool.g:1292:1: rule__Metric__Group__2__Impl : ( ( rule__Metric__Group_2__0 )? ) ;
    public final void rule__Metric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1296:1: ( ( ( rule__Metric__Group_2__0 )? ) )
            // InternalKiCool.g:1297:1: ( ( rule__Metric__Group_2__0 )? )
            {
            // InternalKiCool.g:1297:1: ( ( rule__Metric__Group_2__0 )? )
            // InternalKiCool.g:1298:1: ( rule__Metric__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getGroup_2()); 
            }
            // InternalKiCool.g:1299:1: ( rule__Metric__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKiCool.g:1299:2: rule__Metric__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Metric__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__2__Impl"


    // $ANTLR start "rule__Metric__Group_2__0"
    // InternalKiCool.g:1315:1: rule__Metric__Group_2__0 : rule__Metric__Group_2__0__Impl rule__Metric__Group_2__1 ;
    public final void rule__Metric__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1319:1: ( rule__Metric__Group_2__0__Impl rule__Metric__Group_2__1 )
            // InternalKiCool.g:1320:2: rule__Metric__Group_2__0__Impl rule__Metric__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Metric__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Metric__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group_2__0"


    // $ANTLR start "rule__Metric__Group_2__0__Impl"
    // InternalKiCool.g:1327:1: rule__Metric__Group_2__0__Impl : ( 'alias' ) ;
    public final void rule__Metric__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1331:1: ( ( 'alias' ) )
            // InternalKiCool.g:1332:1: ( 'alias' )
            {
            // InternalKiCool.g:1332:1: ( 'alias' )
            // InternalKiCool.g:1333:1: 'alias'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getAliasKeyword_2_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getAliasKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group_2__0__Impl"


    // $ANTLR start "rule__Metric__Group_2__1"
    // InternalKiCool.g:1346:1: rule__Metric__Group_2__1 : rule__Metric__Group_2__1__Impl ;
    public final void rule__Metric__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1350:1: ( rule__Metric__Group_2__1__Impl )
            // InternalKiCool.g:1351:2: rule__Metric__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Metric__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group_2__1"


    // $ANTLR start "rule__Metric__Group_2__1__Impl"
    // InternalKiCool.g:1357:1: rule__Metric__Group_2__1__Impl : ( ( rule__Metric__AliasAssignment_2_1 ) ) ;
    public final void rule__Metric__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1361:1: ( ( ( rule__Metric__AliasAssignment_2_1 ) ) )
            // InternalKiCool.g:1362:1: ( ( rule__Metric__AliasAssignment_2_1 ) )
            {
            // InternalKiCool.g:1362:1: ( ( rule__Metric__AliasAssignment_2_1 ) )
            // InternalKiCool.g:1363:1: ( rule__Metric__AliasAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getAliasAssignment_2_1()); 
            }
            // InternalKiCool.g:1364:1: ( rule__Metric__AliasAssignment_2_1 )
            // InternalKiCool.g:1364:2: rule__Metric__AliasAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Metric__AliasAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getAliasAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group_2__1__Impl"


    // $ANTLR start "rule__ProcessorGroup__Group__0"
    // InternalKiCool.g:1378:1: rule__ProcessorGroup__Group__0 : rule__ProcessorGroup__Group__0__Impl rule__ProcessorGroup__Group__1 ;
    public final void rule__ProcessorGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1382:1: ( rule__ProcessorGroup__Group__0__Impl rule__ProcessorGroup__Group__1 )
            // InternalKiCool.g:1383:2: rule__ProcessorGroup__Group__0__Impl rule__ProcessorGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ProcessorGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group__0"


    // $ANTLR start "rule__ProcessorGroup__Group__0__Impl"
    // InternalKiCool.g:1390:1: rule__ProcessorGroup__Group__0__Impl : ( ( rule__ProcessorGroup__Group_0__0 )? ) ;
    public final void rule__ProcessorGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1394:1: ( ( ( rule__ProcessorGroup__Group_0__0 )? ) )
            // InternalKiCool.g:1395:1: ( ( rule__ProcessorGroup__Group_0__0 )? )
            {
            // InternalKiCool.g:1395:1: ( ( rule__ProcessorGroup__Group_0__0 )? )
            // InternalKiCool.g:1396:1: ( rule__ProcessorGroup__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getGroup_0()); 
            }
            // InternalKiCool.g:1397:1: ( rule__ProcessorGroup__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKiCool.g:1397:2: rule__ProcessorGroup__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ProcessorGroup__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group__0__Impl"


    // $ANTLR start "rule__ProcessorGroup__Group__1"
    // InternalKiCool.g:1407:1: rule__ProcessorGroup__Group__1 : rule__ProcessorGroup__Group__1__Impl ;
    public final void rule__ProcessorGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1411:1: ( rule__ProcessorGroup__Group__1__Impl )
            // InternalKiCool.g:1412:2: rule__ProcessorGroup__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group__1"


    // $ANTLR start "rule__ProcessorGroup__Group__1__Impl"
    // InternalKiCool.g:1418:1: rule__ProcessorGroup__Group__1__Impl : ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) ) ;
    public final void rule__ProcessorGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1422:1: ( ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) ) )
            // InternalKiCool.g:1423:1: ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) )
            {
            // InternalKiCool.g:1423:1: ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) )
            // InternalKiCool.g:1424:1: ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* )
            {
            // InternalKiCool.g:1424:1: ( ( rule__ProcessorGroup__Alternatives_1 ) )
            // InternalKiCool.g:1425:1: ( rule__ProcessorGroup__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getAlternatives_1()); 
            }
            // InternalKiCool.g:1426:1: ( rule__ProcessorGroup__Alternatives_1 )
            // InternalKiCool.g:1426:2: rule__ProcessorGroup__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__ProcessorGroup__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getAlternatives_1()); 
            }

            }

            // InternalKiCool.g:1429:1: ( ( rule__ProcessorGroup__Alternatives_1 )* )
            // InternalKiCool.g:1430:1: ( rule__ProcessorGroup__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getAlternatives_1()); 
            }
            // InternalKiCool.g:1431:1: ( rule__ProcessorGroup__Alternatives_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==15||LA9_0==21||LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKiCool.g:1431:2: rule__ProcessorGroup__Alternatives_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    rule__ProcessorGroup__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__ProcessorGroup__Group__1__Impl"


    // $ANTLR start "rule__ProcessorGroup__Group_0__0"
    // InternalKiCool.g:1446:1: rule__ProcessorGroup__Group_0__0 : rule__ProcessorGroup__Group_0__0__Impl rule__ProcessorGroup__Group_0__1 ;
    public final void rule__ProcessorGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1450:1: ( rule__ProcessorGroup__Group_0__0__Impl rule__ProcessorGroup__Group_0__1 )
            // InternalKiCool.g:1451:2: rule__ProcessorGroup__Group_0__0__Impl rule__ProcessorGroup__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__ProcessorGroup__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_0__0"


    // $ANTLR start "rule__ProcessorGroup__Group_0__0__Impl"
    // InternalKiCool.g:1458:1: rule__ProcessorGroup__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__ProcessorGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1462:1: ( ( 'label' ) )
            // InternalKiCool.g:1463:1: ( 'label' )
            {
            // InternalKiCool.g:1463:1: ( 'label' )
            // InternalKiCool.g:1464:1: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getLabelKeyword_0_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getLabelKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_0__0__Impl"


    // $ANTLR start "rule__ProcessorGroup__Group_0__1"
    // InternalKiCool.g:1477:1: rule__ProcessorGroup__Group_0__1 : rule__ProcessorGroup__Group_0__1__Impl ;
    public final void rule__ProcessorGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1481:1: ( rule__ProcessorGroup__Group_0__1__Impl )
            // InternalKiCool.g:1482:2: rule__ProcessorGroup__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_0__1"


    // $ANTLR start "rule__ProcessorGroup__Group_0__1__Impl"
    // InternalKiCool.g:1488:1: rule__ProcessorGroup__Group_0__1__Impl : ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) ) ;
    public final void rule__ProcessorGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1492:1: ( ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) ) )
            // InternalKiCool.g:1493:1: ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) )
            {
            // InternalKiCool.g:1493:1: ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) )
            // InternalKiCool.g:1494:1: ( rule__ProcessorGroup__LabelAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getLabelAssignment_0_1()); 
            }
            // InternalKiCool.g:1495:1: ( rule__ProcessorGroup__LabelAssignment_0_1 )
            // InternalKiCool.g:1495:2: rule__ProcessorGroup__LabelAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__LabelAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getLabelAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_0__1__Impl"


    // $ANTLR start "rule__ProcessorGroup__Group_1_1__0"
    // InternalKiCool.g:1509:1: rule__ProcessorGroup__Group_1_1__0 : rule__ProcessorGroup__Group_1_1__0__Impl rule__ProcessorGroup__Group_1_1__1 ;
    public final void rule__ProcessorGroup__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1513:1: ( rule__ProcessorGroup__Group_1_1__0__Impl rule__ProcessorGroup__Group_1_1__1 )
            // InternalKiCool.g:1514:2: rule__ProcessorGroup__Group_1_1__0__Impl rule__ProcessorGroup__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ProcessorGroup__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_1__0"


    // $ANTLR start "rule__ProcessorGroup__Group_1_1__0__Impl"
    // InternalKiCool.g:1521:1: rule__ProcessorGroup__Group_1_1__0__Impl : ( 'system' ) ;
    public final void rule__ProcessorGroup__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1525:1: ( ( 'system' ) )
            // InternalKiCool.g:1526:1: ( 'system' )
            {
            // InternalKiCool.g:1526:1: ( 'system' )
            // InternalKiCool.g:1527:1: 'system'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getSystemKeyword_1_1_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getSystemKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_1__0__Impl"


    // $ANTLR start "rule__ProcessorGroup__Group_1_1__1"
    // InternalKiCool.g:1540:1: rule__ProcessorGroup__Group_1_1__1 : rule__ProcessorGroup__Group_1_1__1__Impl ;
    public final void rule__ProcessorGroup__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1544:1: ( rule__ProcessorGroup__Group_1_1__1__Impl )
            // InternalKiCool.g:1545:2: rule__ProcessorGroup__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_1__1"


    // $ANTLR start "rule__ProcessorGroup__Group_1_1__1__Impl"
    // InternalKiCool.g:1551:1: rule__ProcessorGroup__Group_1_1__1__Impl : ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) ) ;
    public final void rule__ProcessorGroup__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1555:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) ) )
            // InternalKiCool.g:1556:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) )
            {
            // InternalKiCool.g:1556:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) )
            // InternalKiCool.g:1557:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_1_1()); 
            }
            // InternalKiCool.g:1558:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 )
            // InternalKiCool.g:1558:2: rule__ProcessorGroup__ProcessorsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__ProcessorsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_1__1__Impl"


    // $ANTLR start "rule__ProcessorGroup__Group_1_2__0"
    // InternalKiCool.g:1572:1: rule__ProcessorGroup__Group_1_2__0 : rule__ProcessorGroup__Group_1_2__0__Impl rule__ProcessorGroup__Group_1_2__1 ;
    public final void rule__ProcessorGroup__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1576:1: ( rule__ProcessorGroup__Group_1_2__0__Impl rule__ProcessorGroup__Group_1_2__1 )
            // InternalKiCool.g:1577:2: rule__ProcessorGroup__Group_1_2__0__Impl rule__ProcessorGroup__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ProcessorGroup__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_2__0"


    // $ANTLR start "rule__ProcessorGroup__Group_1_2__0__Impl"
    // InternalKiCool.g:1584:1: rule__ProcessorGroup__Group_1_2__0__Impl : ( '[' ) ;
    public final void rule__ProcessorGroup__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1588:1: ( ( '[' ) )
            // InternalKiCool.g:1589:1: ( '[' )
            {
            // InternalKiCool.g:1589:1: ( '[' )
            // InternalKiCool.g:1590:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getLeftSquareBracketKeyword_1_2_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getLeftSquareBracketKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_2__0__Impl"


    // $ANTLR start "rule__ProcessorGroup__Group_1_2__1"
    // InternalKiCool.g:1603:1: rule__ProcessorGroup__Group_1_2__1 : rule__ProcessorGroup__Group_1_2__1__Impl rule__ProcessorGroup__Group_1_2__2 ;
    public final void rule__ProcessorGroup__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1607:1: ( rule__ProcessorGroup__Group_1_2__1__Impl rule__ProcessorGroup__Group_1_2__2 )
            // InternalKiCool.g:1608:2: rule__ProcessorGroup__Group_1_2__1__Impl rule__ProcessorGroup__Group_1_2__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__ProcessorGroup__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__Group_1_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_2__1"


    // $ANTLR start "rule__ProcessorGroup__Group_1_2__1__Impl"
    // InternalKiCool.g:1615:1: rule__ProcessorGroup__Group_1_2__1__Impl : ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) ) ;
    public final void rule__ProcessorGroup__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1619:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) ) )
            // InternalKiCool.g:1620:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) )
            {
            // InternalKiCool.g:1620:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) )
            // InternalKiCool.g:1621:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_2_1()); 
            }
            // InternalKiCool.g:1622:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 )
            // InternalKiCool.g:1622:2: rule__ProcessorGroup__ProcessorsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__ProcessorsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_2__1__Impl"


    // $ANTLR start "rule__ProcessorGroup__Group_1_2__2"
    // InternalKiCool.g:1632:1: rule__ProcessorGroup__Group_1_2__2 : rule__ProcessorGroup__Group_1_2__2__Impl ;
    public final void rule__ProcessorGroup__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1636:1: ( rule__ProcessorGroup__Group_1_2__2__Impl )
            // InternalKiCool.g:1637:2: rule__ProcessorGroup__Group_1_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__Group_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_2__2"


    // $ANTLR start "rule__ProcessorGroup__Group_1_2__2__Impl"
    // InternalKiCool.g:1643:1: rule__ProcessorGroup__Group_1_2__2__Impl : ( ']' ) ;
    public final void rule__ProcessorGroup__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1647:1: ( ( ']' ) )
            // InternalKiCool.g:1648:1: ( ']' )
            {
            // InternalKiCool.g:1648:1: ( ']' )
            // InternalKiCool.g:1649:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getRightSquareBracketKeyword_1_2_2()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getRightSquareBracketKeyword_1_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_2__2__Impl"


    // $ANTLR start "rule__ProcessorGroup__Group_1_3__0"
    // InternalKiCool.g:1668:1: rule__ProcessorGroup__Group_1_3__0 : rule__ProcessorGroup__Group_1_3__0__Impl rule__ProcessorGroup__Group_1_3__1 ;
    public final void rule__ProcessorGroup__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1672:1: ( rule__ProcessorGroup__Group_1_3__0__Impl rule__ProcessorGroup__Group_1_3__1 )
            // InternalKiCool.g:1673:2: rule__ProcessorGroup__Group_1_3__0__Impl rule__ProcessorGroup__Group_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ProcessorGroup__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_3__0"


    // $ANTLR start "rule__ProcessorGroup__Group_1_3__0__Impl"
    // InternalKiCool.g:1680:1: rule__ProcessorGroup__Group_1_3__0__Impl : ( '[' ) ;
    public final void rule__ProcessorGroup__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1684:1: ( ( '[' ) )
            // InternalKiCool.g:1685:1: ( '[' )
            {
            // InternalKiCool.g:1685:1: ( '[' )
            // InternalKiCool.g:1686:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getLeftSquareBracketKeyword_1_3_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getLeftSquareBracketKeyword_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_3__0__Impl"


    // $ANTLR start "rule__ProcessorGroup__Group_1_3__1"
    // InternalKiCool.g:1699:1: rule__ProcessorGroup__Group_1_3__1 : rule__ProcessorGroup__Group_1_3__1__Impl rule__ProcessorGroup__Group_1_3__2 ;
    public final void rule__ProcessorGroup__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1703:1: ( rule__ProcessorGroup__Group_1_3__1__Impl rule__ProcessorGroup__Group_1_3__2 )
            // InternalKiCool.g:1704:2: rule__ProcessorGroup__Group_1_3__1__Impl rule__ProcessorGroup__Group_1_3__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__ProcessorGroup__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__Group_1_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_3__1"


    // $ANTLR start "rule__ProcessorGroup__Group_1_3__1__Impl"
    // InternalKiCool.g:1711:1: rule__ProcessorGroup__Group_1_3__1__Impl : ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) ) ;
    public final void rule__ProcessorGroup__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1715:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) ) )
            // InternalKiCool.g:1716:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) )
            {
            // InternalKiCool.g:1716:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) )
            // InternalKiCool.g:1717:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_3_1()); 
            }
            // InternalKiCool.g:1718:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 )
            // InternalKiCool.g:1718:2: rule__ProcessorGroup__ProcessorsAssignment_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__ProcessorsAssignment_1_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_3__1__Impl"


    // $ANTLR start "rule__ProcessorGroup__Group_1_3__2"
    // InternalKiCool.g:1728:1: rule__ProcessorGroup__Group_1_3__2 : rule__ProcessorGroup__Group_1_3__2__Impl ;
    public final void rule__ProcessorGroup__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1732:1: ( rule__ProcessorGroup__Group_1_3__2__Impl )
            // InternalKiCool.g:1733:2: rule__ProcessorGroup__Group_1_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorGroup__Group_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_3__2"


    // $ANTLR start "rule__ProcessorGroup__Group_1_3__2__Impl"
    // InternalKiCool.g:1739:1: rule__ProcessorGroup__Group_1_3__2__Impl : ( ']' ) ;
    public final void rule__ProcessorGroup__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1743:1: ( ( ']' ) )
            // InternalKiCool.g:1744:1: ( ']' )
            {
            // InternalKiCool.g:1744:1: ( ']' )
            // InternalKiCool.g:1745:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getRightSquareBracketKeyword_1_3_2()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getRightSquareBracketKeyword_1_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__Group_1_3__2__Impl"


    // $ANTLR start "rule__Processor__Group__0"
    // InternalKiCool.g:1764:1: rule__Processor__Group__0 : rule__Processor__Group__0__Impl rule__Processor__Group__1 ;
    public final void rule__Processor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1768:1: ( rule__Processor__Group__0__Impl rule__Processor__Group__1 )
            // InternalKiCool.g:1769:2: rule__Processor__Group__0__Impl rule__Processor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Processor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__0"


    // $ANTLR start "rule__Processor__Group__0__Impl"
    // InternalKiCool.g:1776:1: rule__Processor__Group__0__Impl : ( ( rule__Processor__Group_0__0 )? ) ;
    public final void rule__Processor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1780:1: ( ( ( rule__Processor__Group_0__0 )? ) )
            // InternalKiCool.g:1781:1: ( ( rule__Processor__Group_0__0 )? )
            {
            // InternalKiCool.g:1781:1: ( ( rule__Processor__Group_0__0 )? )
            // InternalKiCool.g:1782:1: ( rule__Processor__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_0()); 
            }
            // InternalKiCool.g:1783:1: ( rule__Processor__Group_0__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKiCool.g:1783:2: rule__Processor__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Processor__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__0__Impl"


    // $ANTLR start "rule__Processor__Group__1"
    // InternalKiCool.g:1793:1: rule__Processor__Group__1 : rule__Processor__Group__1__Impl rule__Processor__Group__2 ;
    public final void rule__Processor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1797:1: ( rule__Processor__Group__1__Impl rule__Processor__Group__2 )
            // InternalKiCool.g:1798:2: rule__Processor__Group__1__Impl rule__Processor__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Processor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__1"


    // $ANTLR start "rule__Processor__Group__1__Impl"
    // InternalKiCool.g:1805:1: rule__Processor__Group__1__Impl : ( ( rule__Processor__IdAssignment_1 ) ) ;
    public final void rule__Processor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1809:1: ( ( ( rule__Processor__IdAssignment_1 ) ) )
            // InternalKiCool.g:1810:1: ( ( rule__Processor__IdAssignment_1 ) )
            {
            // InternalKiCool.g:1810:1: ( ( rule__Processor__IdAssignment_1 ) )
            // InternalKiCool.g:1811:1: ( rule__Processor__IdAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getIdAssignment_1()); 
            }
            // InternalKiCool.g:1812:1: ( rule__Processor__IdAssignment_1 )
            // InternalKiCool.g:1812:2: rule__Processor__IdAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__IdAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getIdAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__1__Impl"


    // $ANTLR start "rule__Processor__Group__2"
    // InternalKiCool.g:1822:1: rule__Processor__Group__2 : rule__Processor__Group__2__Impl rule__Processor__Group__3 ;
    public final void rule__Processor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1826:1: ( rule__Processor__Group__2__Impl rule__Processor__Group__3 )
            // InternalKiCool.g:1827:2: rule__Processor__Group__2__Impl rule__Processor__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Processor__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__2"


    // $ANTLR start "rule__Processor__Group__2__Impl"
    // InternalKiCool.g:1834:1: rule__Processor__Group__2__Impl : ( ( rule__Processor__Group_2__0 )? ) ;
    public final void rule__Processor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1838:1: ( ( ( rule__Processor__Group_2__0 )? ) )
            // InternalKiCool.g:1839:1: ( ( rule__Processor__Group_2__0 )? )
            {
            // InternalKiCool.g:1839:1: ( ( rule__Processor__Group_2__0 )? )
            // InternalKiCool.g:1840:1: ( rule__Processor__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_2()); 
            }
            // InternalKiCool.g:1841:1: ( rule__Processor__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKiCool.g:1841:2: rule__Processor__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Processor__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__2__Impl"


    // $ANTLR start "rule__Processor__Group__3"
    // InternalKiCool.g:1851:1: rule__Processor__Group__3 : rule__Processor__Group__3__Impl ;
    public final void rule__Processor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1855:1: ( rule__Processor__Group__3__Impl )
            // InternalKiCool.g:1856:2: rule__Processor__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__3"


    // $ANTLR start "rule__Processor__Group__3__Impl"
    // InternalKiCool.g:1862:1: rule__Processor__Group__3__Impl : ( ( rule__Processor__Group_3__0 )? ) ;
    public final void rule__Processor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1866:1: ( ( ( rule__Processor__Group_3__0 )? ) )
            // InternalKiCool.g:1867:1: ( ( rule__Processor__Group_3__0 )? )
            {
            // InternalKiCool.g:1867:1: ( ( rule__Processor__Group_3__0 )? )
            // InternalKiCool.g:1868:1: ( rule__Processor__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_3()); 
            }
            // InternalKiCool.g:1869:1: ( rule__Processor__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKiCool.g:1869:2: rule__Processor__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Processor__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__3__Impl"


    // $ANTLR start "rule__Processor__Group_0__0"
    // InternalKiCool.g:1887:1: rule__Processor__Group_0__0 : rule__Processor__Group_0__0__Impl rule__Processor__Group_0__1 ;
    public final void rule__Processor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1891:1: ( rule__Processor__Group_0__0__Impl rule__Processor__Group_0__1 )
            // InternalKiCool.g:1892:2: rule__Processor__Group_0__0__Impl rule__Processor__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Processor__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_0__0"


    // $ANTLR start "rule__Processor__Group_0__0__Impl"
    // InternalKiCool.g:1899:1: rule__Processor__Group_0__0__Impl : ( 'pre' ) ;
    public final void rule__Processor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1903:1: ( ( 'pre' ) )
            // InternalKiCool.g:1904:1: ( 'pre' )
            {
            // InternalKiCool.g:1904:1: ( 'pre' )
            // InternalKiCool.g:1905:1: 'pre'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPreKeyword_0_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPreKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_0__0__Impl"


    // $ANTLR start "rule__Processor__Group_0__1"
    // InternalKiCool.g:1918:1: rule__Processor__Group_0__1 : rule__Processor__Group_0__1__Impl ;
    public final void rule__Processor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1922:1: ( rule__Processor__Group_0__1__Impl )
            // InternalKiCool.g:1923:2: rule__Processor__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_0__1"


    // $ANTLR start "rule__Processor__Group_0__1__Impl"
    // InternalKiCool.g:1929:1: rule__Processor__Group_0__1__Impl : ( ( ( rule__Processor__Group_0_1__0 ) ) ( ( rule__Processor__Group_0_1__0 )* ) ) ;
    public final void rule__Processor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1933:1: ( ( ( ( rule__Processor__Group_0_1__0 ) ) ( ( rule__Processor__Group_0_1__0 )* ) ) )
            // InternalKiCool.g:1934:1: ( ( ( rule__Processor__Group_0_1__0 ) ) ( ( rule__Processor__Group_0_1__0 )* ) )
            {
            // InternalKiCool.g:1934:1: ( ( ( rule__Processor__Group_0_1__0 ) ) ( ( rule__Processor__Group_0_1__0 )* ) )
            // InternalKiCool.g:1935:1: ( ( rule__Processor__Group_0_1__0 ) ) ( ( rule__Processor__Group_0_1__0 )* )
            {
            // InternalKiCool.g:1935:1: ( ( rule__Processor__Group_0_1__0 ) )
            // InternalKiCool.g:1936:1: ( rule__Processor__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_0_1()); 
            }
            // InternalKiCool.g:1937:1: ( rule__Processor__Group_0_1__0 )
            // InternalKiCool.g:1937:2: rule__Processor__Group_0_1__0
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Processor__Group_0_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getGroup_0_1()); 
            }

            }

            // InternalKiCool.g:1940:1: ( ( rule__Processor__Group_0_1__0 )* )
            // InternalKiCool.g:1941:1: ( rule__Processor__Group_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_0_1()); 
            }
            // InternalKiCool.g:1942:1: ( rule__Processor__Group_0_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKiCool.g:1942:2: rule__Processor__Group_0_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__Processor__Group_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getGroup_0_1()); 
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
    // $ANTLR end "rule__Processor__Group_0__1__Impl"


    // $ANTLR start "rule__Processor__Group_0_1__0"
    // InternalKiCool.g:1957:1: rule__Processor__Group_0_1__0 : rule__Processor__Group_0_1__0__Impl rule__Processor__Group_0_1__1 ;
    public final void rule__Processor__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1961:1: ( rule__Processor__Group_0_1__0__Impl rule__Processor__Group_0_1__1 )
            // InternalKiCool.g:1962:2: rule__Processor__Group_0_1__0__Impl rule__Processor__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Processor__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_0_1__0"


    // $ANTLR start "rule__Processor__Group_0_1__0__Impl"
    // InternalKiCool.g:1969:1: rule__Processor__Group_0_1__0__Impl : ( 'set' ) ;
    public final void rule__Processor__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1973:1: ( ( 'set' ) )
            // InternalKiCool.g:1974:1: ( 'set' )
            {
            // InternalKiCool.g:1974:1: ( 'set' )
            // InternalKiCool.g:1975:1: 'set'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getSetKeyword_0_1_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getSetKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_0_1__0__Impl"


    // $ANTLR start "rule__Processor__Group_0_1__1"
    // InternalKiCool.g:1988:1: rule__Processor__Group_0_1__1 : rule__Processor__Group_0_1__1__Impl ;
    public final void rule__Processor__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1992:1: ( rule__Processor__Group_0_1__1__Impl )
            // InternalKiCool.g:1993:2: rule__Processor__Group_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_0_1__1"


    // $ANTLR start "rule__Processor__Group_0_1__1__Impl"
    // InternalKiCool.g:1999:1: rule__Processor__Group_0_1__1__Impl : ( ( rule__Processor__PresetsAssignment_0_1_1 ) ) ;
    public final void rule__Processor__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2003:1: ( ( ( rule__Processor__PresetsAssignment_0_1_1 ) ) )
            // InternalKiCool.g:2004:1: ( ( rule__Processor__PresetsAssignment_0_1_1 ) )
            {
            // InternalKiCool.g:2004:1: ( ( rule__Processor__PresetsAssignment_0_1_1 ) )
            // InternalKiCool.g:2005:1: ( rule__Processor__PresetsAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPresetsAssignment_0_1_1()); 
            }
            // InternalKiCool.g:2006:1: ( rule__Processor__PresetsAssignment_0_1_1 )
            // InternalKiCool.g:2006:2: rule__Processor__PresetsAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__PresetsAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPresetsAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_0_1__1__Impl"


    // $ANTLR start "rule__Processor__Group_2__0"
    // InternalKiCool.g:2020:1: rule__Processor__Group_2__0 : rule__Processor__Group_2__0__Impl rule__Processor__Group_2__1 ;
    public final void rule__Processor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2024:1: ( rule__Processor__Group_2__0__Impl rule__Processor__Group_2__1 )
            // InternalKiCool.g:2025:2: rule__Processor__Group_2__0__Impl rule__Processor__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Processor__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_2__0"


    // $ANTLR start "rule__Processor__Group_2__0__Impl"
    // InternalKiCool.g:2032:1: rule__Processor__Group_2__0__Impl : ( 'metric' ) ;
    public final void rule__Processor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2036:1: ( ( 'metric' ) )
            // InternalKiCool.g:2037:1: ( 'metric' )
            {
            // InternalKiCool.g:2037:1: ( 'metric' )
            // InternalKiCool.g:2038:1: 'metric'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getMetricKeyword_2_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getMetricKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_2__0__Impl"


    // $ANTLR start "rule__Processor__Group_2__1"
    // InternalKiCool.g:2051:1: rule__Processor__Group_2__1 : rule__Processor__Group_2__1__Impl ;
    public final void rule__Processor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2055:1: ( rule__Processor__Group_2__1__Impl )
            // InternalKiCool.g:2056:2: rule__Processor__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_2__1"


    // $ANTLR start "rule__Processor__Group_2__1__Impl"
    // InternalKiCool.g:2062:1: rule__Processor__Group_2__1__Impl : ( ( rule__Processor__MetricAssignment_2_1 ) ) ;
    public final void rule__Processor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2066:1: ( ( ( rule__Processor__MetricAssignment_2_1 ) ) )
            // InternalKiCool.g:2067:1: ( ( rule__Processor__MetricAssignment_2_1 ) )
            {
            // InternalKiCool.g:2067:1: ( ( rule__Processor__MetricAssignment_2_1 ) )
            // InternalKiCool.g:2068:1: ( rule__Processor__MetricAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getMetricAssignment_2_1()); 
            }
            // InternalKiCool.g:2069:1: ( rule__Processor__MetricAssignment_2_1 )
            // InternalKiCool.g:2069:2: rule__Processor__MetricAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__MetricAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getMetricAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_2__1__Impl"


    // $ANTLR start "rule__Processor__Group_3__0"
    // InternalKiCool.g:2083:1: rule__Processor__Group_3__0 : rule__Processor__Group_3__0__Impl rule__Processor__Group_3__1 ;
    public final void rule__Processor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2087:1: ( rule__Processor__Group_3__0__Impl rule__Processor__Group_3__1 )
            // InternalKiCool.g:2088:2: rule__Processor__Group_3__0__Impl rule__Processor__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Processor__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_3__0"


    // $ANTLR start "rule__Processor__Group_3__0__Impl"
    // InternalKiCool.g:2095:1: rule__Processor__Group_3__0__Impl : ( 'post' ) ;
    public final void rule__Processor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2099:1: ( ( 'post' ) )
            // InternalKiCool.g:2100:1: ( 'post' )
            {
            // InternalKiCool.g:2100:1: ( 'post' )
            // InternalKiCool.g:2101:1: 'post'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPostKeyword_3_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPostKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_3__0__Impl"


    // $ANTLR start "rule__Processor__Group_3__1"
    // InternalKiCool.g:2114:1: rule__Processor__Group_3__1 : rule__Processor__Group_3__1__Impl ;
    public final void rule__Processor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2118:1: ( rule__Processor__Group_3__1__Impl )
            // InternalKiCool.g:2119:2: rule__Processor__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_3__1"


    // $ANTLR start "rule__Processor__Group_3__1__Impl"
    // InternalKiCool.g:2125:1: rule__Processor__Group_3__1__Impl : ( ( ( rule__Processor__Group_3_1__0 ) ) ( ( rule__Processor__Group_3_1__0 )* ) ) ;
    public final void rule__Processor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2129:1: ( ( ( ( rule__Processor__Group_3_1__0 ) ) ( ( rule__Processor__Group_3_1__0 )* ) ) )
            // InternalKiCool.g:2130:1: ( ( ( rule__Processor__Group_3_1__0 ) ) ( ( rule__Processor__Group_3_1__0 )* ) )
            {
            // InternalKiCool.g:2130:1: ( ( ( rule__Processor__Group_3_1__0 ) ) ( ( rule__Processor__Group_3_1__0 )* ) )
            // InternalKiCool.g:2131:1: ( ( rule__Processor__Group_3_1__0 ) ) ( ( rule__Processor__Group_3_1__0 )* )
            {
            // InternalKiCool.g:2131:1: ( ( rule__Processor__Group_3_1__0 ) )
            // InternalKiCool.g:2132:1: ( rule__Processor__Group_3_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_3_1()); 
            }
            // InternalKiCool.g:2133:1: ( rule__Processor__Group_3_1__0 )
            // InternalKiCool.g:2133:2: rule__Processor__Group_3_1__0
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Processor__Group_3_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getGroup_3_1()); 
            }

            }

            // InternalKiCool.g:2136:1: ( ( rule__Processor__Group_3_1__0 )* )
            // InternalKiCool.g:2137:1: ( rule__Processor__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_3_1()); 
            }
            // InternalKiCool.g:2138:1: ( rule__Processor__Group_3_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKiCool.g:2138:2: rule__Processor__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__Processor__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__Processor__Group_3__1__Impl"


    // $ANTLR start "rule__Processor__Group_3_1__0"
    // InternalKiCool.g:2153:1: rule__Processor__Group_3_1__0 : rule__Processor__Group_3_1__0__Impl rule__Processor__Group_3_1__1 ;
    public final void rule__Processor__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2157:1: ( rule__Processor__Group_3_1__0__Impl rule__Processor__Group_3_1__1 )
            // InternalKiCool.g:2158:2: rule__Processor__Group_3_1__0__Impl rule__Processor__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Processor__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_3_1__0"


    // $ANTLR start "rule__Processor__Group_3_1__0__Impl"
    // InternalKiCool.g:2165:1: rule__Processor__Group_3_1__0__Impl : ( 'set' ) ;
    public final void rule__Processor__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2169:1: ( ( 'set' ) )
            // InternalKiCool.g:2170:1: ( 'set' )
            {
            // InternalKiCool.g:2170:1: ( 'set' )
            // InternalKiCool.g:2171:1: 'set'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getSetKeyword_3_1_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getSetKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_3_1__0__Impl"


    // $ANTLR start "rule__Processor__Group_3_1__1"
    // InternalKiCool.g:2184:1: rule__Processor__Group_3_1__1 : rule__Processor__Group_3_1__1__Impl ;
    public final void rule__Processor__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2188:1: ( rule__Processor__Group_3_1__1__Impl )
            // InternalKiCool.g:2189:2: rule__Processor__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_3_1__1"


    // $ANTLR start "rule__Processor__Group_3_1__1__Impl"
    // InternalKiCool.g:2195:1: rule__Processor__Group_3_1__1__Impl : ( ( rule__Processor__PostsetsAssignment_3_1_1 ) ) ;
    public final void rule__Processor__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2199:1: ( ( ( rule__Processor__PostsetsAssignment_3_1_1 ) ) )
            // InternalKiCool.g:2200:1: ( ( rule__Processor__PostsetsAssignment_3_1_1 ) )
            {
            // InternalKiCool.g:2200:1: ( ( rule__Processor__PostsetsAssignment_3_1_1 ) )
            // InternalKiCool.g:2201:1: ( rule__Processor__PostsetsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPostsetsAssignment_3_1_1()); 
            }
            // InternalKiCool.g:2202:1: ( rule__Processor__PostsetsAssignment_3_1_1 )
            // InternalKiCool.g:2202:2: rule__Processor__PostsetsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__PostsetsAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPostsetsAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_3_1__1__Impl"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group__0"
    // InternalKiCool.g:2216:1: rule__ProcessorAlternativeGroup__Group__0 : rule__ProcessorAlternativeGroup__Group__0__Impl rule__ProcessorAlternativeGroup__Group__1 ;
    public final void rule__ProcessorAlternativeGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2220:1: ( rule__ProcessorAlternativeGroup__Group__0__Impl rule__ProcessorAlternativeGroup__Group__1 )
            // InternalKiCool.g:2221:2: rule__ProcessorAlternativeGroup__Group__0__Impl rule__ProcessorAlternativeGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ProcessorAlternativeGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorAlternativeGroup__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group__0"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group__0__Impl"
    // InternalKiCool.g:2228:1: rule__ProcessorAlternativeGroup__Group__0__Impl : ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? ) ;
    public final void rule__ProcessorAlternativeGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2232:1: ( ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? ) )
            // InternalKiCool.g:2233:1: ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? )
            {
            // InternalKiCool.g:2233:1: ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? )
            // InternalKiCool.g:2234:1: ( rule__ProcessorAlternativeGroup__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_0()); 
            }
            // InternalKiCool.g:2235:1: ( rule__ProcessorAlternativeGroup__Group_0__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_STRING) ) {
                    int LA15_3 = input.LA(3);

                    if ( (synpred21_InternalKiCool()) ) {
                        alt15=1;
                    }
                }
                else if ( (LA15_1==RULE_ID) ) {
                    int LA15_4 = input.LA(3);

                    if ( (synpred21_InternalKiCool()) ) {
                        alt15=1;
                    }
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalKiCool.g:2235:2: rule__ProcessorAlternativeGroup__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ProcessorAlternativeGroup__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group__0__Impl"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group__1"
    // InternalKiCool.g:2245:1: rule__ProcessorAlternativeGroup__Group__1 : rule__ProcessorAlternativeGroup__Group__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2249:1: ( rule__ProcessorAlternativeGroup__Group__1__Impl )
            // InternalKiCool.g:2250:2: rule__ProcessorAlternativeGroup__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorAlternativeGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group__1"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group__1__Impl"
    // InternalKiCool.g:2256:1: rule__ProcessorAlternativeGroup__Group__1__Impl : ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2260:1: ( ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) ) )
            // InternalKiCool.g:2261:1: ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) )
            {
            // InternalKiCool.g:2261:1: ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) )
            // InternalKiCool.g:2262:1: ( rule__ProcessorAlternativeGroup__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1()); 
            }
            // InternalKiCool.g:2263:1: ( rule__ProcessorAlternativeGroup__Group_1__0 )
            // InternalKiCool.g:2263:2: rule__ProcessorAlternativeGroup__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorAlternativeGroup__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group__1__Impl"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group_0__0"
    // InternalKiCool.g:2277:1: rule__ProcessorAlternativeGroup__Group_0__0 : rule__ProcessorAlternativeGroup__Group_0__0__Impl rule__ProcessorAlternativeGroup__Group_0__1 ;
    public final void rule__ProcessorAlternativeGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2281:1: ( rule__ProcessorAlternativeGroup__Group_0__0__Impl rule__ProcessorAlternativeGroup__Group_0__1 )
            // InternalKiCool.g:2282:2: rule__ProcessorAlternativeGroup__Group_0__0__Impl rule__ProcessorAlternativeGroup__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__ProcessorAlternativeGroup__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorAlternativeGroup__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group_0__0"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group_0__0__Impl"
    // InternalKiCool.g:2289:1: rule__ProcessorAlternativeGroup__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__ProcessorAlternativeGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2293:1: ( ( 'label' ) )
            // InternalKiCool.g:2294:1: ( 'label' )
            {
            // InternalKiCool.g:2294:1: ( 'label' )
            // InternalKiCool.g:2295:1: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getLabelKeyword_0_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupAccess().getLabelKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group_0__0__Impl"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group_0__1"
    // InternalKiCool.g:2308:1: rule__ProcessorAlternativeGroup__Group_0__1 : rule__ProcessorAlternativeGroup__Group_0__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2312:1: ( rule__ProcessorAlternativeGroup__Group_0__1__Impl )
            // InternalKiCool.g:2313:2: rule__ProcessorAlternativeGroup__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorAlternativeGroup__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group_0__1"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group_0__1__Impl"
    // InternalKiCool.g:2319:1: rule__ProcessorAlternativeGroup__Group_0__1__Impl : ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2323:1: ( ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) ) )
            // InternalKiCool.g:2324:1: ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) )
            {
            // InternalKiCool.g:2324:1: ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) )
            // InternalKiCool.g:2325:1: ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getLabelAssignment_0_1()); 
            }
            // InternalKiCool.g:2326:1: ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 )
            // InternalKiCool.g:2326:2: rule__ProcessorAlternativeGroup__LabelAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorAlternativeGroup__LabelAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupAccess().getLabelAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group_0__1__Impl"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group_1__0"
    // InternalKiCool.g:2340:1: rule__ProcessorAlternativeGroup__Group_1__0 : rule__ProcessorAlternativeGroup__Group_1__0__Impl rule__ProcessorAlternativeGroup__Group_1__1 ;
    public final void rule__ProcessorAlternativeGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2344:1: ( rule__ProcessorAlternativeGroup__Group_1__0__Impl rule__ProcessorAlternativeGroup__Group_1__1 )
            // InternalKiCool.g:2345:2: rule__ProcessorAlternativeGroup__Group_1__0__Impl rule__ProcessorAlternativeGroup__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__ProcessorAlternativeGroup__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorAlternativeGroup__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group_1__0"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group_1__0__Impl"
    // InternalKiCool.g:2352:1: rule__ProcessorAlternativeGroup__Group_1__0__Impl : ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2356:1: ( ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) ) )
            // InternalKiCool.g:2357:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) )
            {
            // InternalKiCool.g:2357:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) )
            // InternalKiCool.g:2358:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsAssignment_1_0()); 
            }
            // InternalKiCool.g:2359:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 )
            // InternalKiCool.g:2359:2: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group_1__0__Impl"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group_1__1"
    // InternalKiCool.g:2369:1: rule__ProcessorAlternativeGroup__Group_1__1 : rule__ProcessorAlternativeGroup__Group_1__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2373:1: ( rule__ProcessorAlternativeGroup__Group_1__1__Impl )
            // InternalKiCool.g:2374:2: rule__ProcessorAlternativeGroup__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorAlternativeGroup__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group_1__1"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group_1__1__Impl"
    // InternalKiCool.g:2380:1: rule__ProcessorAlternativeGroup__Group_1__1__Impl : ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2384:1: ( ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) ) )
            // InternalKiCool.g:2385:1: ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) )
            {
            // InternalKiCool.g:2385:1: ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) )
            // InternalKiCool.g:2386:1: ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* )
            {
            // InternalKiCool.g:2386:1: ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) )
            // InternalKiCool.g:2387:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1_1()); 
            }
            // InternalKiCool.g:2388:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )
            // InternalKiCool.g:2388:2: rule__ProcessorAlternativeGroup__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ProcessorAlternativeGroup__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1_1()); 
            }

            }

            // InternalKiCool.g:2391:1: ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* )
            // InternalKiCool.g:2392:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1_1()); 
            }
            // InternalKiCool.g:2393:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKiCool.g:2393:2: rule__ProcessorAlternativeGroup__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__ProcessorAlternativeGroup__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group_1__1__Impl"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group_1_1__0"
    // InternalKiCool.g:2408:1: rule__ProcessorAlternativeGroup__Group_1_1__0 : rule__ProcessorAlternativeGroup__Group_1_1__0__Impl rule__ProcessorAlternativeGroup__Group_1_1__1 ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2412:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0__Impl rule__ProcessorAlternativeGroup__Group_1_1__1 )
            // InternalKiCool.g:2413:2: rule__ProcessorAlternativeGroup__Group_1_1__0__Impl rule__ProcessorAlternativeGroup__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ProcessorAlternativeGroup__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorAlternativeGroup__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group_1_1__0"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group_1_1__0__Impl"
    // InternalKiCool.g:2420:1: rule__ProcessorAlternativeGroup__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2424:1: ( ( '|' ) )
            // InternalKiCool.g:2425:1: ( '|' )
            {
            // InternalKiCool.g:2425:1: ( '|' )
            // InternalKiCool.g:2426:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getVerticalLineKeyword_1_1_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupAccess().getVerticalLineKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group_1_1__0__Impl"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group_1_1__1"
    // InternalKiCool.g:2439:1: rule__ProcessorAlternativeGroup__Group_1_1__1 : rule__ProcessorAlternativeGroup__Group_1_1__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2443:1: ( rule__ProcessorAlternativeGroup__Group_1_1__1__Impl )
            // InternalKiCool.g:2444:2: rule__ProcessorAlternativeGroup__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorAlternativeGroup__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group_1_1__1"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group_1_1__1__Impl"
    // InternalKiCool.g:2450:1: rule__ProcessorAlternativeGroup__Group_1_1__1__Impl : ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2454:1: ( ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) ) )
            // InternalKiCool.g:2455:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) )
            {
            // InternalKiCool.g:2455:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) )
            // InternalKiCool.g:2456:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsAssignment_1_1_1()); 
            }
            // InternalKiCool.g:2457:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 )
            // InternalKiCool.g:2457:2: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__Group_1_1__1__Impl"


    // $ANTLR start "rule__KVPair__Group__0"
    // InternalKiCool.g:2471:1: rule__KVPair__Group__0 : rule__KVPair__Group__0__Impl rule__KVPair__Group__1 ;
    public final void rule__KVPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2475:1: ( rule__KVPair__Group__0__Impl rule__KVPair__Group__1 )
            // InternalKiCool.g:2476:2: rule__KVPair__Group__0__Impl rule__KVPair__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__KVPair__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KVPair__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KVPair__Group__0"


    // $ANTLR start "rule__KVPair__Group__0__Impl"
    // InternalKiCool.g:2483:1: rule__KVPair__Group__0__Impl : ( ( rule__KVPair__KeyAssignment_0 ) ) ;
    public final void rule__KVPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2487:1: ( ( ( rule__KVPair__KeyAssignment_0 ) ) )
            // InternalKiCool.g:2488:1: ( ( rule__KVPair__KeyAssignment_0 ) )
            {
            // InternalKiCool.g:2488:1: ( ( rule__KVPair__KeyAssignment_0 ) )
            // InternalKiCool.g:2489:1: ( rule__KVPair__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getKeyAssignment_0()); 
            }
            // InternalKiCool.g:2490:1: ( rule__KVPair__KeyAssignment_0 )
            // InternalKiCool.g:2490:2: rule__KVPair__KeyAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KVPair__KeyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKVPairAccess().getKeyAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KVPair__Group__0__Impl"


    // $ANTLR start "rule__KVPair__Group__1"
    // InternalKiCool.g:2500:1: rule__KVPair__Group__1 : rule__KVPair__Group__1__Impl rule__KVPair__Group__2 ;
    public final void rule__KVPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2504:1: ( rule__KVPair__Group__1__Impl rule__KVPair__Group__2 )
            // InternalKiCool.g:2505:2: rule__KVPair__Group__1__Impl rule__KVPair__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__KVPair__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KVPair__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KVPair__Group__1"


    // $ANTLR start "rule__KVPair__Group__1__Impl"
    // InternalKiCool.g:2512:1: rule__KVPair__Group__1__Impl : ( ( rule__KVPair__IsKeyValueAssignment_1 )? ) ;
    public final void rule__KVPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2516:1: ( ( ( rule__KVPair__IsKeyValueAssignment_1 )? ) )
            // InternalKiCool.g:2517:1: ( ( rule__KVPair__IsKeyValueAssignment_1 )? )
            {
            // InternalKiCool.g:2517:1: ( ( rule__KVPair__IsKeyValueAssignment_1 )? )
            // InternalKiCool.g:2518:1: ( rule__KVPair__IsKeyValueAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getIsKeyValueAssignment_1()); 
            }
            // InternalKiCool.g:2519:1: ( rule__KVPair__IsKeyValueAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKiCool.g:2519:2: rule__KVPair__IsKeyValueAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__KVPair__IsKeyValueAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKVPairAccess().getIsKeyValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KVPair__Group__1__Impl"


    // $ANTLR start "rule__KVPair__Group__2"
    // InternalKiCool.g:2529:1: rule__KVPair__Group__2 : rule__KVPair__Group__2__Impl ;
    public final void rule__KVPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2533:1: ( rule__KVPair__Group__2__Impl )
            // InternalKiCool.g:2534:2: rule__KVPair__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KVPair__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KVPair__Group__2"


    // $ANTLR start "rule__KVPair__Group__2__Impl"
    // InternalKiCool.g:2540:1: rule__KVPair__Group__2__Impl : ( ( rule__KVPair__ValueAssignment_2 ) ) ;
    public final void rule__KVPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2544:1: ( ( ( rule__KVPair__ValueAssignment_2 ) ) )
            // InternalKiCool.g:2545:1: ( ( rule__KVPair__ValueAssignment_2 ) )
            {
            // InternalKiCool.g:2545:1: ( ( rule__KVPair__ValueAssignment_2 ) )
            // InternalKiCool.g:2546:1: ( rule__KVPair__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getValueAssignment_2()); 
            }
            // InternalKiCool.g:2547:1: ( rule__KVPair__ValueAssignment_2 )
            // InternalKiCool.g:2547:2: rule__KVPair__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KVPair__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKVPairAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KVPair__Group__2__Impl"


    // $ANTLR start "rule__TagAnnotation__Group__0"
    // InternalKiCool.g:2563:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2567:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalKiCool.g:2568:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
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
    // InternalKiCool.g:2575:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2579:1: ( ( '@' ) )
            // InternalKiCool.g:2580:1: ( '@' )
            {
            // InternalKiCool.g:2580:1: ( '@' )
            // InternalKiCool.g:2581:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:2594:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2598:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalKiCool.g:2599:2: rule__TagAnnotation__Group__1__Impl
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
    // InternalKiCool.g:2605:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2609:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:2610:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:2610:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:2611:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:2612:1: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalKiCool.g:2612:2: rule__TagAnnotation__NameAssignment_1
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


    // $ANTLR start "rule__PragmaTagAnnotation__Group__0"
    // InternalKiCool.g:2626:1: rule__PragmaTagAnnotation__Group__0 : rule__PragmaTagAnnotation__Group__0__Impl rule__PragmaTagAnnotation__Group__1 ;
    public final void rule__PragmaTagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2630:1: ( rule__PragmaTagAnnotation__Group__0__Impl rule__PragmaTagAnnotation__Group__1 )
            // InternalKiCool.g:2631:2: rule__PragmaTagAnnotation__Group__0__Impl rule__PragmaTagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__PragmaTagAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTagAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PragmaTagAnnotation__Group__0"


    // $ANTLR start "rule__PragmaTagAnnotation__Group__0__Impl"
    // InternalKiCool.g:2638:1: rule__PragmaTagAnnotation__Group__0__Impl : ( '#' ) ;
    public final void rule__PragmaTagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2642:1: ( ( '#' ) )
            // InternalKiCool.g:2643:1: ( '#' )
            {
            // InternalKiCool.g:2643:1: ( '#' )
            // InternalKiCool.g:2644:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAnnotationAccess().getNumberSignKeyword_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPragmaTagAnnotationAccess().getNumberSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PragmaTagAnnotation__Group__0__Impl"


    // $ANTLR start "rule__PragmaTagAnnotation__Group__1"
    // InternalKiCool.g:2657:1: rule__PragmaTagAnnotation__Group__1 : rule__PragmaTagAnnotation__Group__1__Impl ;
    public final void rule__PragmaTagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2661:1: ( rule__PragmaTagAnnotation__Group__1__Impl )
            // InternalKiCool.g:2662:2: rule__PragmaTagAnnotation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTagAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PragmaTagAnnotation__Group__1"


    // $ANTLR start "rule__PragmaTagAnnotation__Group__1__Impl"
    // InternalKiCool.g:2668:1: rule__PragmaTagAnnotation__Group__1__Impl : ( ( rule__PragmaTagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__PragmaTagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2672:1: ( ( ( rule__PragmaTagAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:2673:1: ( ( rule__PragmaTagAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:2673:1: ( ( rule__PragmaTagAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:2674:1: ( rule__PragmaTagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:2675:1: ( rule__PragmaTagAnnotation__NameAssignment_1 )
            // InternalKiCool.g:2675:2: rule__PragmaTagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTagAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPragmaTagAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PragmaTagAnnotation__Group__1__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__0"
    // InternalKiCool.g:2689:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2693:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:2694:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:2701:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2705:1: ( ( '@' ) )
            // InternalKiCool.g:2706:1: ( '@' )
            {
            // InternalKiCool.g:2706:1: ( '@' )
            // InternalKiCool.g:2707:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:2720:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2724:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:2725:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKiCool.g:2732:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2736:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:2737:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:2737:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:2738:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:2739:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:2739:2: rule__KeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:2749:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2753:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:2754:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalKiCool.g:2761:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2765:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:2766:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:2766:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:2767:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:2768:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:2768:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKiCool.g:2778:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2782:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalKiCool.g:2783:2: rule__KeyStringValueAnnotation__Group__3__Impl
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
    // InternalKiCool.g:2789:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2793:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKiCool.g:2794:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKiCool.g:2794:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalKiCool.g:2795:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:2796:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKiCool.g:2796:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__KeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalKiCool.g:2814:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2818:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:2819:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKiCool.g:2826:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2830:1: ( ( ',' ) )
            // InternalKiCool.g:2831:1: ( ',' )
            {
            // InternalKiCool.g:2831:1: ( ',' )
            // InternalKiCool.g:2832:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:2845:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2849:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:2850:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKiCool.g:2856:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2860:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:2861:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:2861:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:2862:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:2863:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:2863:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
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


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__0"
    // InternalKiCool.g:2877:1: rule__RestrictedKeyStringValueAnnotation__Group__0 : rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2881:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:2882:2: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__RestrictedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__0"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__0__Impl"
    // InternalKiCool.g:2889:1: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2893:1: ( ( '@' ) )
            // InternalKiCool.g:2894:1: ( '@' )
            {
            // InternalKiCool.g:2894:1: ( '@' )
            // InternalKiCool.g:2895:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__1"
    // InternalKiCool.g:2908:1: rule__RestrictedKeyStringValueAnnotation__Group__1 : rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2912:1: ( rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:2913:2: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__RestrictedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__1"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__1__Impl"
    // InternalKiCool.g:2920:1: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2924:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:2925:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:2925:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:2926:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:2927:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:2927:2: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__2"
    // InternalKiCool.g:2937:1: rule__RestrictedKeyStringValueAnnotation__Group__2 : rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2941:1: ( rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:2942:2: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__RestrictedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__2"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__2__Impl"
    // InternalKiCool.g:2949:1: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2953:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:2954:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:2954:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:2955:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:2956:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:2956:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__3"
    // InternalKiCool.g:2966:1: rule__RestrictedKeyStringValueAnnotation__Group__3 : rule__RestrictedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2970:1: ( rule__RestrictedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKiCool.g:2971:2: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__3"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group__3__Impl"
    // InternalKiCool.g:2977:1: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2981:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKiCool.g:2982:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKiCool.g:2982:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKiCool.g:2983:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:2984:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKiCool.g:2984:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__RestrictedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group_3__0"
    // InternalKiCool.g:3002:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0 : rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3006:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:3007:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group_3__0"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl"
    // InternalKiCool.g:3014:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3018:1: ( ( ',' ) )
            // InternalKiCool.g:3019:1: ( ',' )
            {
            // InternalKiCool.g:3019:1: ( ',' )
            // InternalKiCool.g:3020:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group_3__1"
    // InternalKiCool.g:3033:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1 : rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3037:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:3038:2: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group_3__1"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl"
    // InternalKiCool.g:3044:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3048:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:3049:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:3049:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:3050:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:3051:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:3051:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__PramgaKeyStringValueAnnotation__Group__0"
    // InternalKiCool.g:3065:1: rule__PramgaKeyStringValueAnnotation__Group__0 : rule__PramgaKeyStringValueAnnotation__Group__0__Impl rule__PramgaKeyStringValueAnnotation__Group__1 ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3069:1: ( rule__PramgaKeyStringValueAnnotation__Group__0__Impl rule__PramgaKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3070:2: rule__PramgaKeyStringValueAnnotation__Group__0__Impl rule__PramgaKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__PramgaKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PramgaKeyStringValueAnnotation__Group__0"


    // $ANTLR start "rule__PramgaKeyStringValueAnnotation__Group__0__Impl"
    // InternalKiCool.g:3077:1: rule__PramgaKeyStringValueAnnotation__Group__0__Impl : ( '#' ) ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3081:1: ( ( '#' ) )
            // InternalKiCool.g:3082:1: ( '#' )
            {
            // InternalKiCool.g:3082:1: ( '#' )
            // InternalKiCool.g:3083:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getNumberSignKeyword_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getNumberSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PramgaKeyStringValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__PramgaKeyStringValueAnnotation__Group__1"
    // InternalKiCool.g:3096:1: rule__PramgaKeyStringValueAnnotation__Group__1 : rule__PramgaKeyStringValueAnnotation__Group__1__Impl rule__PramgaKeyStringValueAnnotation__Group__2 ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3100:1: ( rule__PramgaKeyStringValueAnnotation__Group__1__Impl rule__PramgaKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3101:2: rule__PramgaKeyStringValueAnnotation__Group__1__Impl rule__PramgaKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__PramgaKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PramgaKeyStringValueAnnotation__Group__1"


    // $ANTLR start "rule__PramgaKeyStringValueAnnotation__Group__1__Impl"
    // InternalKiCool.g:3108:1: rule__PramgaKeyStringValueAnnotation__Group__1__Impl : ( ( rule__PramgaKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3112:1: ( ( ( rule__PramgaKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3113:1: ( ( rule__PramgaKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3113:1: ( ( rule__PramgaKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3114:1: ( rule__PramgaKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3115:1: ( rule__PramgaKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3115:2: rule__PramgaKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PramgaKeyStringValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__PramgaKeyStringValueAnnotation__Group__2"
    // InternalKiCool.g:3125:1: rule__PramgaKeyStringValueAnnotation__Group__2 : rule__PramgaKeyStringValueAnnotation__Group__2__Impl rule__PramgaKeyStringValueAnnotation__Group__3 ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3129:1: ( rule__PramgaKeyStringValueAnnotation__Group__2__Impl rule__PramgaKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3130:2: rule__PramgaKeyStringValueAnnotation__Group__2__Impl rule__PramgaKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__PramgaKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PramgaKeyStringValueAnnotation__Group__2"


    // $ANTLR start "rule__PramgaKeyStringValueAnnotation__Group__2__Impl"
    // InternalKiCool.g:3137:1: rule__PramgaKeyStringValueAnnotation__Group__2__Impl : ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3141:1: ( ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:3142:1: ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:3142:1: ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:3143:1: ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:3144:1: ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:3144:2: rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PramgaKeyStringValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__PramgaKeyStringValueAnnotation__Group__3"
    // InternalKiCool.g:3154:1: rule__PramgaKeyStringValueAnnotation__Group__3 : rule__PramgaKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3158:1: ( rule__PramgaKeyStringValueAnnotation__Group__3__Impl )
            // InternalKiCool.g:3159:2: rule__PramgaKeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PramgaKeyStringValueAnnotation__Group__3"


    // $ANTLR start "rule__PramgaKeyStringValueAnnotation__Group__3__Impl"
    // InternalKiCool.g:3165:1: rule__PramgaKeyStringValueAnnotation__Group__3__Impl : ( ( rule__PramgaKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3169:1: ( ( ( rule__PramgaKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKiCool.g:3170:1: ( ( rule__PramgaKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKiCool.g:3170:1: ( ( rule__PramgaKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKiCool.g:3171:1: ( rule__PramgaKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:3172:1: ( rule__PramgaKeyStringValueAnnotation__Group_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKiCool.g:3172:2: rule__PramgaKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__PramgaKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PramgaKeyStringValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__PramgaKeyStringValueAnnotation__Group_3__0"
    // InternalKiCool.g:3190:1: rule__PramgaKeyStringValueAnnotation__Group_3__0 : rule__PramgaKeyStringValueAnnotation__Group_3__0__Impl rule__PramgaKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__PramgaKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3194:1: ( rule__PramgaKeyStringValueAnnotation__Group_3__0__Impl rule__PramgaKeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:3195:2: rule__PramgaKeyStringValueAnnotation__Group_3__0__Impl rule__PramgaKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__PramgaKeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PramgaKeyStringValueAnnotation__Group_3__0"


    // $ANTLR start "rule__PramgaKeyStringValueAnnotation__Group_3__0__Impl"
    // InternalKiCool.g:3202:1: rule__PramgaKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__PramgaKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3206:1: ( ( ',' ) )
            // InternalKiCool.g:3207:1: ( ',' )
            {
            // InternalKiCool.g:3207:1: ( ',' )
            // InternalKiCool.g:3208:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PramgaKeyStringValueAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__PramgaKeyStringValueAnnotation__Group_3__1"
    // InternalKiCool.g:3221:1: rule__PramgaKeyStringValueAnnotation__Group_3__1 : rule__PramgaKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__PramgaKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3225:1: ( rule__PramgaKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:3226:2: rule__PramgaKeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PramgaKeyStringValueAnnotation__Group_3__1"


    // $ANTLR start "rule__PramgaKeyStringValueAnnotation__Group_3__1__Impl"
    // InternalKiCool.g:3232:1: rule__PramgaKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__PramgaKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3236:1: ( ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:3237:1: ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:3237:1: ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:3238:1: ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:3239:1: ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:3239:2: rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PramgaKeyStringValueAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__0"
    // InternalKiCool.g:3253:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3257:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3258:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:3265:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3269:1: ( ( '@' ) )
            // InternalKiCool.g:3270:1: ( '@' )
            {
            // InternalKiCool.g:3270:1: ( '@' )
            // InternalKiCool.g:3271:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3284:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3288:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3289:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalKiCool.g:3296:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3300:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3301:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3301:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3302:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3303:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3303:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3313:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3317:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3318:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:3325:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3329:1: ( ( '[' ) )
            // InternalKiCool.g:3330:1: ( '[' )
            {
            // InternalKiCool.g:3330:1: ( '[' )
            // InternalKiCool.g:3331:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3344:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3348:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalKiCool.g:3349:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalKiCool.g:3356:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3360:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKiCool.g:3361:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKiCool.g:3361:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKiCool.g:3362:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKiCool.g:3363:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKiCool.g:3363:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKiCool.g:3373:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3377:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalKiCool.g:3378:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKiCool.g:3385:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3389:1: ( ( ']' ) )
            // InternalKiCool.g:3390:1: ( ']' )
            {
            // InternalKiCool.g:3390:1: ( ']' )
            // InternalKiCool.g:3391:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3404:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3408:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalKiCool.g:3409:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalKiCool.g:3416:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3420:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKiCool.g:3421:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKiCool.g:3421:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKiCool.g:3422:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKiCool.g:3423:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKiCool.g:3423:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKiCool.g:3433:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3437:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKiCool.g:3438:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKiCool.g:3444:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3448:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKiCool.g:3449:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKiCool.g:3449:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKiCool.g:3450:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKiCool.g:3451:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKiCool.g:3451:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalKiCool.g:3475:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3479:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKiCool.g:3480:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKiCool.g:3487:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3491:1: ( ( ',' ) )
            // InternalKiCool.g:3492:1: ( ',' )
            {
            // InternalKiCool.g:3492:1: ( ',' )
            // InternalKiCool.g:3493:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3506:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3510:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKiCool.g:3511:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKiCool.g:3517:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3521:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKiCool.g:3522:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKiCool.g:3522:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKiCool.g:3523:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKiCool.g:3524:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKiCool.g:3524:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
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


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__0"
    // InternalKiCool.g:3538:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3542:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3543:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__0"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl"
    // InternalKiCool.g:3550:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3554:1: ( ( '@' ) )
            // InternalKiCool.g:3555:1: ( '@' )
            {
            // InternalKiCool.g:3555:1: ( '@' )
            // InternalKiCool.g:3556:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__1"
    // InternalKiCool.g:3569:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3573:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3574:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__1"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl"
    // InternalKiCool.g:3581:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3585:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3586:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3586:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3587:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3588:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3588:2: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__2"
    // InternalKiCool.g:3598:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2 : rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3602:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3603:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__2"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl"
    // InternalKiCool.g:3610:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3614:1: ( ( '[' ) )
            // InternalKiCool.g:3615:1: ( '[' )
            {
            // InternalKiCool.g:3615:1: ( '[' )
            // InternalKiCool.g:3616:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__3"
    // InternalKiCool.g:3629:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3 : rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3633:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKiCool.g:3634:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__3"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl"
    // InternalKiCool.g:3641:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3645:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKiCool.g:3646:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKiCool.g:3646:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKiCool.g:3647:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKiCool.g:3648:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKiCool.g:3648:2: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__4"
    // InternalKiCool.g:3658:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4 : rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3662:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKiCool.g:3663:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__4"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl"
    // InternalKiCool.g:3670:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3674:1: ( ( ']' ) )
            // InternalKiCool.g:3675:1: ( ']' )
            {
            // InternalKiCool.g:3675:1: ( ']' )
            // InternalKiCool.g:3676:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__5"
    // InternalKiCool.g:3689:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5 : rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3693:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKiCool.g:3694:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__5"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl"
    // InternalKiCool.g:3701:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3705:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKiCool.g:3706:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKiCool.g:3706:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKiCool.g:3707:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKiCool.g:3708:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKiCool.g:3708:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__6"
    // InternalKiCool.g:3718:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6 : rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3722:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKiCool.g:3723:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__6"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl"
    // InternalKiCool.g:3729:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3733:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKiCool.g:3734:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKiCool.g:3734:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKiCool.g:3735:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKiCool.g:3736:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKiCool.g:3736:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0"
    // InternalKiCool.g:3760:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3764:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKiCool.g:3765:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl"
    // InternalKiCool.g:3772:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3776:1: ( ( ',' ) )
            // InternalKiCool.g:3777:1: ( ',' )
            {
            // InternalKiCool.g:3777:1: ( ',' )
            // InternalKiCool.g:3778:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1"
    // InternalKiCool.g:3791:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3795:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKiCool.g:3796:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl"
    // InternalKiCool.g:3802:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3806:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKiCool.g:3807:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKiCool.g:3807:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKiCool.g:3808:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKiCool.g:3809:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKiCool.g:3809:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group__0"
    // InternalKiCool.g:3823:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3827:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3828:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:3835:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3839:1: ( ( '@' ) )
            // InternalKiCool.g:3840:1: ( '@' )
            {
            // InternalKiCool.g:3840:1: ( '@' )
            // InternalKiCool.g:3841:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3854:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3858:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3859:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:3866:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3870:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3871:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3871:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3872:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3873:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3873:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3883:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3887:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3888:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalKiCool.g:3895:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3899:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:3900:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:3900:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:3901:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:3902:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:3902:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKiCool.g:3912:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3916:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKiCool.g:3917:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKiCool.g:3923:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3927:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKiCool.g:3928:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKiCool.g:3928:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKiCool.g:3929:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:3930:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKiCool.g:3930:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalKiCool.g:3948:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3952:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:3953:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:3960:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3964:1: ( ( ',' ) )
            // InternalKiCool.g:3965:1: ( ',' )
            {
            // InternalKiCool.g:3965:1: ( ',' )
            // InternalKiCool.g:3966:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3979:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3983:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:3984:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKiCool.g:3990:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3994:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:3995:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:3995:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:3996:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:3997:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:3997:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKiCool.g:4011:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4015:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:4016:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:4023:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4027:1: ( ( '@' ) )
            // InternalKiCool.g:4028:1: ( '@' )
            {
            // InternalKiCool.g:4028:1: ( '@' )
            // InternalKiCool.g:4029:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4042:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4046:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:4047:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalKiCool.g:4054:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4058:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:4059:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:4059:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:4060:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:4061:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:4061:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:4071:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4075:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:4076:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:4083:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4087:1: ( ( '[' ) )
            // InternalKiCool.g:4088:1: ( '[' )
            {
            // InternalKiCool.g:4088:1: ( '[' )
            // InternalKiCool.g:4089:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4102:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4106:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKiCool.g:4107:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalKiCool.g:4114:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4118:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKiCool.g:4119:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKiCool.g:4119:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKiCool.g:4120:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKiCool.g:4121:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKiCool.g:4121:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKiCool.g:4131:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4135:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKiCool.g:4136:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:4143:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4147:1: ( ( ']' ) )
            // InternalKiCool.g:4148:1: ( ']' )
            {
            // InternalKiCool.g:4148:1: ( ']' )
            // InternalKiCool.g:4149:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4162:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4166:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKiCool.g:4167:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalKiCool.g:4174:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4178:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKiCool.g:4179:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKiCool.g:4179:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKiCool.g:4180:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKiCool.g:4181:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKiCool.g:4181:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKiCool.g:4191:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4195:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKiCool.g:4196:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKiCool.g:4202:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4206:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKiCool.g:4207:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKiCool.g:4207:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKiCool.g:4208:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKiCool.g:4209:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKiCool.g:4209:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalKiCool.g:4233:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4237:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKiCool.g:4238:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:4245:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4249:1: ( ( ',' ) )
            // InternalKiCool.g:4250:1: ( ',' )
            {
            // InternalKiCool.g:4250:1: ( ',' )
            // InternalKiCool.g:4251:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4264:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4268:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKiCool.g:4269:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKiCool.g:4275:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4279:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKiCool.g:4280:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKiCool.g:4280:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKiCool.g:4281:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKiCool.g:4282:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKiCool.g:4282:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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


    // $ANTLR start "rule__ExtendedID__Group__0"
    // InternalKiCool.g:4296:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4300:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalKiCool.g:4301:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalKiCool.g:4308:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4312:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4313:1: ( RULE_ID )
            {
            // InternalKiCool.g:4313:1: ( RULE_ID )
            // InternalKiCool.g:4314:1: RULE_ID
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
    // InternalKiCool.g:4325:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4329:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalKiCool.g:4330:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalKiCool.g:4337:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4341:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // InternalKiCool.g:4342:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // InternalKiCool.g:4342:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // InternalKiCool.g:4343:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // InternalKiCool.g:4344:1: ( rule__ExtendedID__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKiCool.g:4344:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalKiCool.g:4354:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4358:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalKiCool.g:4359:2: rule__ExtendedID__Group__2__Impl
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
    // InternalKiCool.g:4365:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4369:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalKiCool.g:4370:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalKiCool.g:4370:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalKiCool.g:4371:1: ( rule__ExtendedID__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            }
            // InternalKiCool.g:4372:1: ( rule__ExtendedID__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKiCool.g:4372:2: rule__ExtendedID__Group_2__0
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
    // InternalKiCool.g:4388:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4392:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // InternalKiCool.g:4393:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKiCool.g:4400:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4404:1: ( ( '.' ) )
            // InternalKiCool.g:4405:1: ( '.' )
            {
            // InternalKiCool.g:4405:1: ( '.' )
            // InternalKiCool.g:4406:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4419:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4423:1: ( rule__ExtendedID__Group_1__1__Impl )
            // InternalKiCool.g:4424:2: rule__ExtendedID__Group_1__1__Impl
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
    // InternalKiCool.g:4430:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4434:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4435:1: ( RULE_ID )
            {
            // InternalKiCool.g:4435:1: ( RULE_ID )
            // InternalKiCool.g:4436:1: RULE_ID
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
    // InternalKiCool.g:4451:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4455:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalKiCool.g:4456:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalKiCool.g:4463:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4467:1: ( ( '#' ) )
            // InternalKiCool.g:4468:1: ( '#' )
            {
            // InternalKiCool.g:4468:1: ( '#' )
            // InternalKiCool.g:4469:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4482:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4486:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalKiCool.g:4487:2: rule__ExtendedID__Group_2__1__Impl
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
    // InternalKiCool.g:4493:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4497:1: ( ( RULE_INT ) )
            // InternalKiCool.g:4498:1: ( RULE_INT )
            {
            // InternalKiCool.g:4498:1: ( RULE_INT )
            // InternalKiCool.g:4499:1: RULE_INT
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


    // $ANTLR start "rule__QualifiedID__Group__0"
    // InternalKiCool.g:4514:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4518:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // InternalKiCool.g:4519:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__QualifiedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedID__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group__0"


    // $ANTLR start "rule__QualifiedID__Group__0__Impl"
    // InternalKiCool.g:4526:1: rule__QualifiedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4530:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4531:1: ( RULE_ID )
            {
            // InternalKiCool.g:4531:1: ( RULE_ID )
            // InternalKiCool.g:4532:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group__0__Impl"


    // $ANTLR start "rule__QualifiedID__Group__1"
    // InternalKiCool.g:4543:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4547:1: ( rule__QualifiedID__Group__1__Impl )
            // InternalKiCool.g:4548:2: rule__QualifiedID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedID__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group__1"


    // $ANTLR start "rule__QualifiedID__Group__1__Impl"
    // InternalKiCool.g:4554:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4558:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // InternalKiCool.g:4559:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // InternalKiCool.g:4559:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // InternalKiCool.g:4560:1: ( rule__QualifiedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            }
            // InternalKiCool.g:4561:1: ( rule__QualifiedID__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKiCool.g:4561:2: rule__QualifiedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__QualifiedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group__1__Impl"


    // $ANTLR start "rule__QualifiedID__Group_1__0"
    // InternalKiCool.g:4575:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4579:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // InternalKiCool.g:4580:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__QualifiedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedID__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group_1__0"


    // $ANTLR start "rule__QualifiedID__Group_1__0__Impl"
    // InternalKiCool.g:4587:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4591:1: ( ( '.' ) )
            // InternalKiCool.g:4592:1: ( '.' )
            {
            // InternalKiCool.g:4592:1: ( '.' )
            // InternalKiCool.g:4593:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedID__Group_1__1"
    // InternalKiCool.g:4606:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4610:1: ( rule__QualifiedID__Group_1__1__Impl )
            // InternalKiCool.g:4611:2: rule__QualifiedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedID__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group_1__1"


    // $ANTLR start "rule__QualifiedID__Group_1__1__Impl"
    // InternalKiCool.g:4617:1: rule__QualifiedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4621:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4622:1: ( RULE_ID )
            {
            // InternalKiCool.g:4622:1: ( RULE_ID )
            // InternalKiCool.g:4623:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Group_1__1__Impl"


    // $ANTLR start "rule__Integer__Group__0"
    // InternalKiCool.g:4638:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4642:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalKiCool.g:4643:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKiCool.g:4650:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4654:1: ( ( ( '-' )? ) )
            // InternalKiCool.g:4655:1: ( ( '-' )? )
            {
            // InternalKiCool.g:4655:1: ( ( '-' )? )
            // InternalKiCool.g:4656:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKiCool.g:4657:1: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKiCool.g:4658:2: '-'
                    {
                    match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKiCool.g:4669:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4673:1: ( rule__Integer__Group__1__Impl )
            // InternalKiCool.g:4674:2: rule__Integer__Group__1__Impl
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
    // InternalKiCool.g:4680:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4684:1: ( ( RULE_INT ) )
            // InternalKiCool.g:4685:1: ( RULE_INT )
            {
            // InternalKiCool.g:4685:1: ( RULE_INT )
            // InternalKiCool.g:4686:1: RULE_INT
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
    // InternalKiCool.g:4701:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4705:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalKiCool.g:4706:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKiCool.g:4713:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4717:1: ( ( ( '-' )? ) )
            // InternalKiCool.g:4718:1: ( ( '-' )? )
            {
            // InternalKiCool.g:4718:1: ( ( '-' )? )
            // InternalKiCool.g:4719:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKiCool.g:4720:1: ( '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKiCool.g:4721:2: '-'
                    {
                    match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKiCool.g:4732:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4736:1: ( rule__Floateger__Group__1__Impl )
            // InternalKiCool.g:4737:2: rule__Floateger__Group__1__Impl
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
    // InternalKiCool.g:4743:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4747:1: ( ( RULE_FLOAT ) )
            // InternalKiCool.g:4748:1: ( RULE_FLOAT )
            {
            // InternalKiCool.g:4748:1: ( RULE_FLOAT )
            // InternalKiCool.g:4749:1: RULE_FLOAT
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


    // $ANTLR start "rule__System__IdAssignment_1"
    // InternalKiCool.g:4765:1: rule__System__IdAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__System__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4769:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:4770:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:4770:1: ( ruleQualifiedID )
            // InternalKiCool.g:4771:1: ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getIdQualifiedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getIdQualifiedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__IdAssignment_1"


    // $ANTLR start "rule__System__VersionAssignment_3"
    // InternalKiCool.g:4780:1: rule__System__VersionAssignment_3 : ( RULE_INT ) ;
    public final void rule__System__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4784:1: ( ( RULE_INT ) )
            // InternalKiCool.g:4785:1: ( RULE_INT )
            {
            // InternalKiCool.g:4785:1: ( RULE_INT )
            // InternalKiCool.g:4786:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getVersionINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getVersionINTTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__VersionAssignment_3"


    // $ANTLR start "rule__System__LabelAssignment_5"
    // InternalKiCool.g:4795:1: rule__System__LabelAssignment_5 : ( ruleEString ) ;
    public final void rule__System__LabelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4799:1: ( ( ruleEString ) )
            // InternalKiCool.g:4800:1: ( ruleEString )
            {
            // InternalKiCool.g:4800:1: ( ruleEString )
            // InternalKiCool.g:4801:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getLabelEStringParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getLabelEStringParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__LabelAssignment_5"


    // $ANTLR start "rule__System__InputClassAssignment_6_1"
    // InternalKiCool.g:4810:1: rule__System__InputClassAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__System__InputClassAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4814:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4815:1: ( RULE_ID )
            {
            // InternalKiCool.g:4815:1: ( RULE_ID )
            // InternalKiCool.g:4816:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getInputClassIDTerminalRuleCall_6_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getInputClassIDTerminalRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__InputClassAssignment_6_1"


    // $ANTLR start "rule__System__MetricsAssignment_7"
    // InternalKiCool.g:4825:1: rule__System__MetricsAssignment_7 : ( ruleMetric ) ;
    public final void rule__System__MetricsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4829:1: ( ( ruleMetric ) )
            // InternalKiCool.g:4830:1: ( ruleMetric )
            {
            // InternalKiCool.g:4830:1: ( ruleMetric )
            // InternalKiCool.g:4831:1: ruleMetric
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getMetricsMetricParserRuleCall_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMetric();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getMetricsMetricParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__MetricsAssignment_7"


    // $ANTLR start "rule__System__ProcessorsAssignment_8"
    // InternalKiCool.g:4840:1: rule__System__ProcessorsAssignment_8 : ( ruleProcessorGroup ) ;
    public final void rule__System__ProcessorsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4844:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:4845:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:4845:1: ( ruleProcessorGroup )
            // InternalKiCool.g:4846:1: ruleProcessorGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getProcessorsProcessorGroupParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProcessorGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getProcessorsProcessorGroupParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ProcessorsAssignment_8"


    // $ANTLR start "rule__Metric__IdAssignment_1"
    // InternalKiCool.g:4855:1: rule__Metric__IdAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__Metric__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4859:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:4860:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:4860:1: ( ruleQualifiedID )
            // InternalKiCool.g:4861:1: ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getIdQualifiedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getIdQualifiedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__IdAssignment_1"


    // $ANTLR start "rule__Metric__AliasAssignment_2_1"
    // InternalKiCool.g:4870:1: rule__Metric__AliasAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Metric__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4874:1: ( ( ruleEString ) )
            // InternalKiCool.g:4875:1: ( ruleEString )
            {
            // InternalKiCool.g:4875:1: ( ruleEString )
            // InternalKiCool.g:4876:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getAliasEStringParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getAliasEStringParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__AliasAssignment_2_1"


    // $ANTLR start "rule__ProcessorGroup__LabelAssignment_0_1"
    // InternalKiCool.g:4885:1: rule__ProcessorGroup__LabelAssignment_0_1 : ( ruleEString ) ;
    public final void rule__ProcessorGroup__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4889:1: ( ( ruleEString ) )
            // InternalKiCool.g:4890:1: ( ruleEString )
            {
            // InternalKiCool.g:4890:1: ( ruleEString )
            // InternalKiCool.g:4891:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getLabelEStringParserRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getLabelEStringParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__LabelAssignment_0_1"


    // $ANTLR start "rule__ProcessorGroup__ProcessorsAssignment_1_0"
    // InternalKiCool.g:4900:1: rule__ProcessorGroup__ProcessorsAssignment_1_0 : ( ruleProcessor ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4904:1: ( ( ruleProcessor ) )
            // InternalKiCool.g:4905:1: ( ruleProcessor )
            {
            // InternalKiCool.g:4905:1: ( ruleProcessor )
            // InternalKiCool.g:4906:1: ruleProcessor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorParserRuleCall_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProcessor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__ProcessorsAssignment_1_0"


    // $ANTLR start "rule__ProcessorGroup__ProcessorsAssignment_1_1_1"
    // InternalKiCool.g:4915:1: rule__ProcessorGroup__ProcessorsAssignment_1_1_1 : ( ruleProcessorSystem ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4919:1: ( ( ruleProcessorSystem ) )
            // InternalKiCool.g:4920:1: ( ruleProcessorSystem )
            {
            // InternalKiCool.g:4920:1: ( ruleProcessorSystem )
            // InternalKiCool.g:4921:1: ruleProcessorSystem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorSystemParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProcessorSystem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorSystemParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__ProcessorsAssignment_1_1_1"


    // $ANTLR start "rule__ProcessorGroup__ProcessorsAssignment_1_2_1"
    // InternalKiCool.g:4930:1: rule__ProcessorGroup__ProcessorsAssignment_1_2_1 : ( ruleProcessorAlternativeGroup ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4934:1: ( ( ruleProcessorAlternativeGroup ) )
            // InternalKiCool.g:4935:1: ( ruleProcessorAlternativeGroup )
            {
            // InternalKiCool.g:4935:1: ( ruleProcessorAlternativeGroup )
            // InternalKiCool.g:4936:1: ruleProcessorAlternativeGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorAlternativeGroupParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProcessorAlternativeGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorAlternativeGroupParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__ProcessorsAssignment_1_2_1"


    // $ANTLR start "rule__ProcessorGroup__ProcessorsAssignment_1_3_1"
    // InternalKiCool.g:4945:1: rule__ProcessorGroup__ProcessorsAssignment_1_3_1 : ( ruleProcessorGroup ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4949:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:4950:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:4950:1: ( ruleProcessorGroup )
            // InternalKiCool.g:4951:1: ruleProcessorGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorGroupParserRuleCall_1_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProcessorGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getProcessorsProcessorGroupParserRuleCall_1_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorGroup__ProcessorsAssignment_1_3_1"


    // $ANTLR start "rule__Processor__PresetsAssignment_0_1_1"
    // InternalKiCool.g:4960:1: rule__Processor__PresetsAssignment_0_1_1 : ( ruleKVPair ) ;
    public final void rule__Processor__PresetsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4964:1: ( ( ruleKVPair ) )
            // InternalKiCool.g:4965:1: ( ruleKVPair )
            {
            // InternalKiCool.g:4965:1: ( ruleKVPair )
            // InternalKiCool.g:4966:1: ruleKVPair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPresetsKVPairParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleKVPair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPresetsKVPairParserRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__PresetsAssignment_0_1_1"


    // $ANTLR start "rule__Processor__IdAssignment_1"
    // InternalKiCool.g:4975:1: rule__Processor__IdAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__Processor__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4979:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:4980:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:4980:1: ( ruleQualifiedID )
            // InternalKiCool.g:4981:1: ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getIdQualifiedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getIdQualifiedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__IdAssignment_1"


    // $ANTLR start "rule__Processor__MetricAssignment_2_1"
    // InternalKiCool.g:4990:1: rule__Processor__MetricAssignment_2_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Processor__MetricAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4994:1: ( ( ( ruleQualifiedID ) ) )
            // InternalKiCool.g:4995:1: ( ( ruleQualifiedID ) )
            {
            // InternalKiCool.g:4995:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:4996:1: ( ruleQualifiedID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getMetricMetricCrossReference_2_1_0()); 
            }
            // InternalKiCool.g:4997:1: ( ruleQualifiedID )
            // InternalKiCool.g:4998:1: ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getMetricMetricQualifiedIDParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getMetricMetricQualifiedIDParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getMetricMetricCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__MetricAssignment_2_1"


    // $ANTLR start "rule__Processor__PostsetsAssignment_3_1_1"
    // InternalKiCool.g:5009:1: rule__Processor__PostsetsAssignment_3_1_1 : ( ruleKVPair ) ;
    public final void rule__Processor__PostsetsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5013:1: ( ( ruleKVPair ) )
            // InternalKiCool.g:5014:1: ( ruleKVPair )
            {
            // InternalKiCool.g:5014:1: ( ruleKVPair )
            // InternalKiCool.g:5015:1: ruleKVPair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPostsetsKVPairParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleKVPair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPostsetsKVPairParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__PostsetsAssignment_3_1_1"


    // $ANTLR start "rule__ProcessorSystem__IdAssignment"
    // InternalKiCool.g:5024:1: rule__ProcessorSystem__IdAssignment : ( ruleQualifiedID ) ;
    public final void rule__ProcessorSystem__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5028:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5029:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:5029:1: ( ruleQualifiedID )
            // InternalKiCool.g:5030:1: ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorSystemAccess().getIdQualifiedIDParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorSystemAccess().getIdQualifiedIDParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorSystem__IdAssignment"


    // $ANTLR start "rule__ProcessorAlternativeGroup__LabelAssignment_0_1"
    // InternalKiCool.g:5039:1: rule__ProcessorAlternativeGroup__LabelAssignment_0_1 : ( ruleEString ) ;
    public final void rule__ProcessorAlternativeGroup__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5043:1: ( ( ruleEString ) )
            // InternalKiCool.g:5044:1: ( ruleEString )
            {
            // InternalKiCool.g:5044:1: ( ruleEString )
            // InternalKiCool.g:5045:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getLabelEStringParserRuleCall_0_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupAccess().getLabelEStringParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__LabelAssignment_0_1"


    // $ANTLR start "rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0"
    // InternalKiCool.g:5054:1: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 : ( ruleProcessorGroup ) ;
    public final void rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5058:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:5059:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:5059:1: ( ruleProcessorGroup )
            // InternalKiCool.g:5060:1: ruleProcessorGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsProcessorGroupParserRuleCall_1_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProcessorGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsProcessorGroupParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0"


    // $ANTLR start "rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1"
    // InternalKiCool.g:5069:1: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 : ( ruleProcessorGroup ) ;
    public final void rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5073:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:5074:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:5074:1: ( ruleProcessorGroup )
            // InternalKiCool.g:5075:1: ruleProcessorGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsProcessorGroupParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProcessorGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsProcessorGroupParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1"


    // $ANTLR start "rule__KVPair__KeyAssignment_0"
    // InternalKiCool.g:5084:1: rule__KVPair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KVPair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5088:1: ( ( ruleEString ) )
            // InternalKiCool.g:5089:1: ( ruleEString )
            {
            // InternalKiCool.g:5089:1: ( ruleEString )
            // InternalKiCool.g:5090:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getKeyEStringParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKVPairAccess().getKeyEStringParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KVPair__KeyAssignment_0"


    // $ANTLR start "rule__KVPair__IsKeyValueAssignment_1"
    // InternalKiCool.g:5099:1: rule__KVPair__IsKeyValueAssignment_1 : ( ( 'key' ) ) ;
    public final void rule__KVPair__IsKeyValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5103:1: ( ( ( 'key' ) ) )
            // InternalKiCool.g:5104:1: ( ( 'key' ) )
            {
            // InternalKiCool.g:5104:1: ( ( 'key' ) )
            // InternalKiCool.g:5105:1: ( 'key' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getIsKeyValueKeyKeyword_1_0()); 
            }
            // InternalKiCool.g:5106:1: ( 'key' )
            // InternalKiCool.g:5107:1: 'key'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getIsKeyValueKeyKeyword_1_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKVPairAccess().getIsKeyValueKeyKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKVPairAccess().getIsKeyValueKeyKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KVPair__IsKeyValueAssignment_1"


    // $ANTLR start "rule__KVPair__ValueAssignment_2"
    // InternalKiCool.g:5122:1: rule__KVPair__ValueAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KVPair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5126:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5127:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5127:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5128:1: ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getValueEStringAllTypesParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKVPairAccess().getValueEStringAllTypesParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KVPair__ValueAssignment_2"


    // $ANTLR start "rule__CommentAnnotation__ValuesAssignment"
    // InternalKiCool.g:5137:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5141:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalKiCool.g:5142:1: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalKiCool.g:5142:1: ( RULE_COMMENT_ANNOTATION )
            // InternalKiCool.g:5143:1: RULE_COMMENT_ANNOTATION
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
    // InternalKiCool.g:5152:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5156:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5157:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5157:1: ( ruleExtendedID )
            // InternalKiCool.g:5158:1: ruleExtendedID
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


    // $ANTLR start "rule__PragmaTagAnnotation__NameAssignment_1"
    // InternalKiCool.g:5167:1: rule__PragmaTagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__PragmaTagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5171:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5172:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5172:1: ( ruleExtendedID )
            // InternalKiCool.g:5173:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPragmaTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PragmaTagAnnotation__NameAssignment_1"


    // $ANTLR start "rule__KeyStringValueAnnotation__NameAssignment_1"
    // InternalKiCool.g:5182:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5186:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5187:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5187:1: ( ruleExtendedID )
            // InternalKiCool.g:5188:1: ruleExtendedID
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
    // InternalKiCool.g:5197:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5201:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5202:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5202:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5203:1: ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:5212:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5216:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5217:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5217:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5218:1: ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__NameAssignment_1"
    // InternalKiCool.g:5227:1: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5231:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5232:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5232:1: ( ruleExtendedID )
            // InternalKiCool.g:5233:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2"
    // InternalKiCool.g:5242:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5246:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5247:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5247:1: ( ruleEStringBoolean )
            // InternalKiCool.g:5248:1: ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2"


    // $ANTLR start "rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1"
    // InternalKiCool.g:5257:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5261:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5262:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5262:1: ( ruleEStringBoolean )
            // InternalKiCool.g:5263:1: ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1"


    // $ANTLR start "rule__PramgaKeyStringValueAnnotation__NameAssignment_1"
    // InternalKiCool.g:5272:1: rule__PramgaKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__PramgaKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5276:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5277:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5277:1: ( ruleExtendedID )
            // InternalKiCool.g:5278:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PramgaKeyStringValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2"
    // InternalKiCool.g:5287:1: rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5291:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5292:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5292:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5293:1: ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2"


    // $ANTLR start "rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1"
    // InternalKiCool.g:5302:1: rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5306:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5307:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5307:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5308:1: ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__NameAssignment_1"
    // InternalKiCool.g:5317:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5321:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5322:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5322:1: ( ruleExtendedID )
            // InternalKiCool.g:5323:1: ruleExtendedID
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
    // InternalKiCool.g:5332:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5336:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5337:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5337:1: ( ruleExtendedID )
            // InternalKiCool.g:5338:1: ruleExtendedID
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
    // InternalKiCool.g:5347:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5351:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5352:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5352:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5353:1: ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:5362:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5366:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5367:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5367:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5368:1: ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1"
    // InternalKiCool.g:5377:1: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5381:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5382:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5382:1: ( ruleExtendedID )
            // InternalKiCool.g:5383:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3"
    // InternalKiCool.g:5392:1: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5396:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5397:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5397:1: ( ruleExtendedID )
            // InternalKiCool.g:5398:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5"
    // InternalKiCool.g:5407:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5411:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5412:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5412:1: ( ruleEStringBoolean )
            // InternalKiCool.g:5413:1: ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5"


    // $ANTLR start "rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1"
    // InternalKiCool.g:5422:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5426:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5427:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5427:1: ( ruleEStringBoolean )
            // InternalKiCool.g:5428:1: ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__NameAssignment_1"
    // InternalKiCool.g:5437:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5441:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5442:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5442:1: ( ruleExtendedID )
            // InternalKiCool.g:5443:1: ruleExtendedID
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
    // InternalKiCool.g:5452:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5456:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:5457:1: ( RULE_STRING )
            {
            // InternalKiCool.g:5457:1: ( RULE_STRING )
            // InternalKiCool.g:5458:1: RULE_STRING
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
    // InternalKiCool.g:5467:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5471:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:5472:1: ( RULE_STRING )
            {
            // InternalKiCool.g:5472:1: ( RULE_STRING )
            // InternalKiCool.g:5473:1: RULE_STRING
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
    // InternalKiCool.g:5482:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5486:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5487:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5487:1: ( ruleExtendedID )
            // InternalKiCool.g:5488:1: ruleExtendedID
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
    // InternalKiCool.g:5497:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5501:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5502:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5502:1: ( ruleExtendedID )
            // InternalKiCool.g:5503:1: ruleExtendedID
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
    // InternalKiCool.g:5512:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5516:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:5517:1: ( RULE_STRING )
            {
            // InternalKiCool.g:5517:1: ( RULE_STRING )
            // InternalKiCool.g:5518:1: RULE_STRING
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
    // InternalKiCool.g:5527:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5531:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:5532:1: ( RULE_STRING )
            {
            // InternalKiCool.g:5532:1: ( RULE_STRING )
            // InternalKiCool.g:5533:1: RULE_STRING
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

    // $ANTLR start synpred3_InternalKiCool
    public final void synpred3_InternalKiCool_fragment() throws RecognitionException {   
        // InternalKiCool.g:760:6: ( ( ( rule__ProcessorGroup__Group_1_2__0 ) ) )
        // InternalKiCool.g:760:6: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
        {
        // InternalKiCool.g:760:6: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
        // InternalKiCool.g:761:1: ( rule__ProcessorGroup__Group_1_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getProcessorGroupAccess().getGroup_1_2()); 
        }
        // InternalKiCool.g:762:1: ( rule__ProcessorGroup__Group_1_2__0 )
        // InternalKiCool.g:762:2: rule__ProcessorGroup__Group_1_2__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__ProcessorGroup__Group_1_2__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalKiCool

    // $ANTLR start synpred21_InternalKiCool
    public final void synpred21_InternalKiCool_fragment() throws RecognitionException {   
        // InternalKiCool.g:2235:2: ( rule__ProcessorAlternativeGroup__Group_0__0 )
        // InternalKiCool.g:2235:2: rule__ProcessorAlternativeGroup__Group_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__ProcessorAlternativeGroup__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalKiCool

    // Delegated rules

    public final boolean synpred21_InternalKiCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalKiCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalKiCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalKiCool_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000AE8040L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000AE8042L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001800001F0L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000050000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000080L});
    }


}