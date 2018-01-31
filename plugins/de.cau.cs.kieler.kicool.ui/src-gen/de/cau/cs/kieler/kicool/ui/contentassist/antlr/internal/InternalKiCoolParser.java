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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT_ANNOTATION", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'-'", "'system'", "'version'", "'label'", "'input'", "'set'", "'intermediate'", "'alias'", "'['", "']'", "'pre'", "'process'", "'post'", "'|'", "'@'", "'#'", "','", "'public'", "'developer'", "'silent'", "'key'"
    };
    public static final int RULE_COMMENT_ANNOTATION=9;
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int RULE_SL_COMMENT_ANNOTATION=11;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=13;
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


    // $ANTLR start "entryRuleIntermediateReference"
    // InternalKiCool.g:89:1: entryRuleIntermediateReference : ruleIntermediateReference EOF ;
    public final void entryRuleIntermediateReference() throws RecognitionException {
        try {
            // InternalKiCool.g:90:1: ( ruleIntermediateReference EOF )
            // InternalKiCool.g:91:1: ruleIntermediateReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIntermediateReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntermediateReferenceRule()); 
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
    // $ANTLR end "entryRuleIntermediateReference"


    // $ANTLR start "ruleIntermediateReference"
    // InternalKiCool.g:98:1: ruleIntermediateReference : ( ( rule__IntermediateReference__Group__0 ) ) ;
    public final void ruleIntermediateReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:102:2: ( ( ( rule__IntermediateReference__Group__0 ) ) )
            // InternalKiCool.g:103:1: ( ( rule__IntermediateReference__Group__0 ) )
            {
            // InternalKiCool.g:103:1: ( ( rule__IntermediateReference__Group__0 ) )
            // InternalKiCool.g:104:1: ( rule__IntermediateReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getGroup()); 
            }
            // InternalKiCool.g:105:1: ( rule__IntermediateReference__Group__0 )
            // InternalKiCool.g:105:2: rule__IntermediateReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntermediateReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntermediateReferenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntermediateReference"


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


    // $ANTLR start "entryRuleCoProcessor"
    // InternalKiCool.g:173:1: entryRuleCoProcessor : ruleCoProcessor EOF ;
    public final void entryRuleCoProcessor() throws RecognitionException {
        try {
            // InternalKiCool.g:174:1: ( ruleCoProcessor EOF )
            // InternalKiCool.g:175:1: ruleCoProcessor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoProcessorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCoProcessor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCoProcessorRule()); 
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
    // $ANTLR end "entryRuleCoProcessor"


    // $ANTLR start "ruleCoProcessor"
    // InternalKiCool.g:182:1: ruleCoProcessor : ( ( rule__CoProcessor__Group__0 ) ) ;
    public final void ruleCoProcessor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:186:2: ( ( ( rule__CoProcessor__Group__0 ) ) )
            // InternalKiCool.g:187:1: ( ( rule__CoProcessor__Group__0 ) )
            {
            // InternalKiCool.g:187:1: ( ( rule__CoProcessor__Group__0 ) )
            // InternalKiCool.g:188:1: ( rule__CoProcessor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoProcessorAccess().getGroup()); 
            }
            // InternalKiCool.g:189:1: ( rule__CoProcessor__Group__0 )
            // InternalKiCool.g:189:2: rule__CoProcessor__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CoProcessor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCoProcessorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoProcessor"


    // $ANTLR start "entryRuleProcessorSystem"
    // InternalKiCool.g:201:1: entryRuleProcessorSystem : ruleProcessorSystem EOF ;
    public final void entryRuleProcessorSystem() throws RecognitionException {
        try {
            // InternalKiCool.g:202:1: ( ruleProcessorSystem EOF )
            // InternalKiCool.g:203:1: ruleProcessorSystem EOF
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
    // InternalKiCool.g:210:1: ruleProcessorSystem : ( ( rule__ProcessorSystem__IdAssignment ) ) ;
    public final void ruleProcessorSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:214:2: ( ( ( rule__ProcessorSystem__IdAssignment ) ) )
            // InternalKiCool.g:215:1: ( ( rule__ProcessorSystem__IdAssignment ) )
            {
            // InternalKiCool.g:215:1: ( ( rule__ProcessorSystem__IdAssignment ) )
            // InternalKiCool.g:216:1: ( rule__ProcessorSystem__IdAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorSystemAccess().getIdAssignment()); 
            }
            // InternalKiCool.g:217:1: ( rule__ProcessorSystem__IdAssignment )
            // InternalKiCool.g:217:2: rule__ProcessorSystem__IdAssignment
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
    // InternalKiCool.g:229:1: entryRuleProcessorAlternativeGroup : ruleProcessorAlternativeGroup EOF ;
    public final void entryRuleProcessorAlternativeGroup() throws RecognitionException {
        try {
            // InternalKiCool.g:230:1: ( ruleProcessorAlternativeGroup EOF )
            // InternalKiCool.g:231:1: ruleProcessorAlternativeGroup EOF
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
    // InternalKiCool.g:238:1: ruleProcessorAlternativeGroup : ( ( rule__ProcessorAlternativeGroup__Group__0 ) ) ;
    public final void ruleProcessorAlternativeGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:242:2: ( ( ( rule__ProcessorAlternativeGroup__Group__0 ) ) )
            // InternalKiCool.g:243:1: ( ( rule__ProcessorAlternativeGroup__Group__0 ) )
            {
            // InternalKiCool.g:243:1: ( ( rule__ProcessorAlternativeGroup__Group__0 ) )
            // InternalKiCool.g:244:1: ( rule__ProcessorAlternativeGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup()); 
            }
            // InternalKiCool.g:245:1: ( rule__ProcessorAlternativeGroup__Group__0 )
            // InternalKiCool.g:245:2: rule__ProcessorAlternativeGroup__Group__0
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
    // InternalKiCool.g:257:1: entryRuleKVPair : ruleKVPair EOF ;
    public final void entryRuleKVPair() throws RecognitionException {
        try {
            // InternalKiCool.g:258:1: ( ruleKVPair EOF )
            // InternalKiCool.g:259:1: ruleKVPair EOF
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
    // InternalKiCool.g:266:1: ruleKVPair : ( ( rule__KVPair__Group__0 ) ) ;
    public final void ruleKVPair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:270:2: ( ( ( rule__KVPair__Group__0 ) ) )
            // InternalKiCool.g:271:1: ( ( rule__KVPair__Group__0 ) )
            {
            // InternalKiCool.g:271:1: ( ( rule__KVPair__Group__0 ) )
            // InternalKiCool.g:272:1: ( rule__KVPair__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getGroup()); 
            }
            // InternalKiCool.g:273:1: ( rule__KVPair__Group__0 )
            // InternalKiCool.g:273:2: rule__KVPair__Group__0
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
    // InternalKiCool.g:295:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:296:1: ( ruleCommentAnnotation EOF )
            // InternalKiCool.g:297:1: ruleCommentAnnotation EOF
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
    // InternalKiCool.g:304:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValuesAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:308:2: ( ( ( rule__CommentAnnotation__ValuesAssignment ) ) )
            // InternalKiCool.g:309:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            {
            // InternalKiCool.g:309:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            // InternalKiCool.g:310:1: ( rule__CommentAnnotation__ValuesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            }
            // InternalKiCool.g:311:1: ( rule__CommentAnnotation__ValuesAssignment )
            // InternalKiCool.g:311:2: rule__CommentAnnotation__ValuesAssignment
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
    // InternalKiCool.g:325:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:326:1: ( ruleTagAnnotation EOF )
            // InternalKiCool.g:327:1: ruleTagAnnotation EOF
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
    // InternalKiCool.g:334:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:338:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // InternalKiCool.g:339:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:339:1: ( ( rule__TagAnnotation__Group__0 ) )
            // InternalKiCool.g:340:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:341:1: ( rule__TagAnnotation__Group__0 )
            // InternalKiCool.g:341:2: rule__TagAnnotation__Group__0
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


    // $ANTLR start "entryRulePragmaTag"
    // InternalKiCool.g:353:1: entryRulePragmaTag : rulePragmaTag EOF ;
    public final void entryRulePragmaTag() throws RecognitionException {
        try {
            // InternalKiCool.g:354:1: ( rulePragmaTag EOF )
            // InternalKiCool.g:355:1: rulePragmaTag EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePragmaTag();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPragmaTagRule()); 
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
    // $ANTLR end "entryRulePragmaTag"


    // $ANTLR start "rulePragmaTag"
    // InternalKiCool.g:362:1: rulePragmaTag : ( ( rule__PragmaTag__Group__0 ) ) ;
    public final void rulePragmaTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:366:2: ( ( ( rule__PragmaTag__Group__0 ) ) )
            // InternalKiCool.g:367:1: ( ( rule__PragmaTag__Group__0 ) )
            {
            // InternalKiCool.g:367:1: ( ( rule__PragmaTag__Group__0 ) )
            // InternalKiCool.g:368:1: ( rule__PragmaTag__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getGroup()); 
            }
            // InternalKiCool.g:369:1: ( rule__PragmaTag__Group__0 )
            // InternalKiCool.g:369:2: rule__PragmaTag__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTag__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPragmaTagAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePragmaTag"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // InternalKiCool.g:381:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:382:1: ( ruleKeyStringValueAnnotation EOF )
            // InternalKiCool.g:383:1: ruleKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:390:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:394:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:395:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:395:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:396:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:397:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:397:2: rule__KeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:409:1: entryRuleRestrictedKeyStringValueAnnotation : ruleRestrictedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:410:1: ( ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:411:1: ruleRestrictedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:418:1: ruleRestrictedKeyStringValueAnnotation : ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:422:2: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:423:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:423:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:424:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:425:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:425:2: rule__RestrictedKeyStringValueAnnotation__Group__0
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


    // $ANTLR start "entryRuleStringPragma"
    // InternalKiCool.g:437:1: entryRuleStringPragma : ruleStringPragma EOF ;
    public final void entryRuleStringPragma() throws RecognitionException {
        try {
            // InternalKiCool.g:438:1: ( ruleStringPragma EOF )
            // InternalKiCool.g:439:1: ruleStringPragma EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleStringPragma();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaRule()); 
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
    // $ANTLR end "entryRuleStringPragma"


    // $ANTLR start "ruleStringPragma"
    // InternalKiCool.g:446:1: ruleStringPragma : ( ( rule__StringPragma__Group__0 ) ) ;
    public final void ruleStringPragma() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:450:2: ( ( ( rule__StringPragma__Group__0 ) ) )
            // InternalKiCool.g:451:1: ( ( rule__StringPragma__Group__0 ) )
            {
            // InternalKiCool.g:451:1: ( ( rule__StringPragma__Group__0 ) )
            // InternalKiCool.g:452:1: ( rule__StringPragma__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getGroup()); 
            }
            // InternalKiCool.g:453:1: ( rule__StringPragma__Group__0 )
            // InternalKiCool.g:453:2: rule__StringPragma__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringPragma"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalKiCool.g:465:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:466:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:467:1: ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:474:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:478:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:479:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:479:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:480:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:481:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:481:2: rule__TypedKeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:493:1: entryRuleRestrictedTypedKeyStringValueAnnotation : ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:494:1: ( ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:495:1: ruleRestrictedTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:502:1: ruleRestrictedTypedKeyStringValueAnnotation : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:506:2: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:507:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:507:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:508:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:509:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:509:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:521:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:522:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:523:1: ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:530:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:534:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:535:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:535:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:536:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:537:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:537:2: rule__QuotedKeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:549:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:550:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:551:1: ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:558:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:562:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:563:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:563:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:564:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:565:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:565:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:577:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKiCool.g:578:1: ( ruleEString EOF )
            // InternalKiCool.g:579:1: ruleEString EOF
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
    // InternalKiCool.g:586:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:590:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalKiCool.g:591:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalKiCool.g:591:1: ( ( rule__EString__Alternatives ) )
            // InternalKiCool.g:592:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalKiCool.g:593:1: ( rule__EString__Alternatives )
            // InternalKiCool.g:593:2: rule__EString__Alternatives
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
    // InternalKiCool.g:605:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // InternalKiCool.g:606:1: ( ruleEStringBoolean EOF )
            // InternalKiCool.g:607:1: ruleEStringBoolean EOF
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
    // InternalKiCool.g:614:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:618:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // InternalKiCool.g:619:1: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // InternalKiCool.g:619:1: ( ( rule__EStringBoolean__Alternatives ) )
            // InternalKiCool.g:620:1: ( rule__EStringBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            }
            // InternalKiCool.g:621:1: ( rule__EStringBoolean__Alternatives )
            // InternalKiCool.g:621:2: rule__EStringBoolean__Alternatives
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
    // InternalKiCool.g:633:1: entryRuleEStringAllTypes : ruleEStringAllTypes EOF ;
    public final void entryRuleEStringAllTypes() throws RecognitionException {
        try {
            // InternalKiCool.g:634:1: ( ruleEStringAllTypes EOF )
            // InternalKiCool.g:635:1: ruleEStringAllTypes EOF
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
    // InternalKiCool.g:642:1: ruleEStringAllTypes : ( ( rule__EStringAllTypes__Alternatives ) ) ;
    public final void ruleEStringAllTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:646:2: ( ( ( rule__EStringAllTypes__Alternatives ) ) )
            // InternalKiCool.g:647:1: ( ( rule__EStringAllTypes__Alternatives ) )
            {
            // InternalKiCool.g:647:1: ( ( rule__EStringAllTypes__Alternatives ) )
            // InternalKiCool.g:648:1: ( rule__EStringAllTypes__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAllTypesAccess().getAlternatives()); 
            }
            // InternalKiCool.g:649:1: ( rule__EStringAllTypes__Alternatives )
            // InternalKiCool.g:649:2: rule__EStringAllTypes__Alternatives
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
    // InternalKiCool.g:661:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // InternalKiCool.g:662:1: ( ruleExtendedID EOF )
            // InternalKiCool.g:663:1: ruleExtendedID EOF
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
    // InternalKiCool.g:670:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:674:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // InternalKiCool.g:675:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // InternalKiCool.g:675:1: ( ( rule__ExtendedID__Group__0 ) )
            // InternalKiCool.g:676:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // InternalKiCool.g:677:1: ( rule__ExtendedID__Group__0 )
            // InternalKiCool.g:677:2: rule__ExtendedID__Group__0
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
    // InternalKiCool.g:689:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // InternalKiCool.g:690:1: ( ruleQualifiedID EOF )
            // InternalKiCool.g:691:1: ruleQualifiedID EOF
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
    // InternalKiCool.g:698:1: ruleQualifiedID : ( ( rule__QualifiedID__Group__0 ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:702:2: ( ( ( rule__QualifiedID__Group__0 ) ) )
            // InternalKiCool.g:703:1: ( ( rule__QualifiedID__Group__0 ) )
            {
            // InternalKiCool.g:703:1: ( ( rule__QualifiedID__Group__0 ) )
            // InternalKiCool.g:704:1: ( rule__QualifiedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedIDAccess().getGroup()); 
            }
            // InternalKiCool.g:705:1: ( rule__QualifiedID__Group__0 )
            // InternalKiCool.g:705:2: rule__QualifiedID__Group__0
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
    // InternalKiCool.g:717:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalKiCool.g:718:1: ( ruleInteger EOF )
            // InternalKiCool.g:719:1: ruleInteger EOF
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
    // InternalKiCool.g:726:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:730:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalKiCool.g:731:1: ( ( rule__Integer__Group__0 ) )
            {
            // InternalKiCool.g:731:1: ( ( rule__Integer__Group__0 ) )
            // InternalKiCool.g:732:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // InternalKiCool.g:733:1: ( rule__Integer__Group__0 )
            // InternalKiCool.g:733:2: rule__Integer__Group__0
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
    // InternalKiCool.g:745:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // InternalKiCool.g:746:1: ( ruleFloateger EOF )
            // InternalKiCool.g:747:1: ruleFloateger EOF
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
    // InternalKiCool.g:754:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:758:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // InternalKiCool.g:759:1: ( ( rule__Floateger__Group__0 ) )
            {
            // InternalKiCool.g:759:1: ( ( rule__Floateger__Group__0 ) )
            // InternalKiCool.g:760:1: ( rule__Floateger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getGroup()); 
            }
            // InternalKiCool.g:761:1: ( rule__Floateger__Group__0 )
            // InternalKiCool.g:761:2: rule__Floateger__Group__0
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
    // InternalKiCool.g:777:1: rule__ProcessorGroup__Alternatives_1 : ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) ) | ( ( rule__ProcessorGroup__Group_1_1__0 ) ) | ( ( rule__ProcessorGroup__Group_1_2__0 ) ) | ( ( rule__ProcessorGroup__Group_1_3__0 ) ) );
    public final void rule__ProcessorGroup__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:781:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) ) | ( ( rule__ProcessorGroup__Group_1_1__0 ) ) | ( ( rule__ProcessorGroup__Group_1_2__0 ) ) | ( ( rule__ProcessorGroup__Group_1_3__0 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 27:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 25:
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
                    // InternalKiCool.g:782:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) )
                    {
                    // InternalKiCool.g:782:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) )
                    // InternalKiCool.g:783:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_0()); 
                    }
                    // InternalKiCool.g:784:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_0 )
                    // InternalKiCool.g:784:2: rule__ProcessorGroup__ProcessorsAssignment_1_0
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
                    // InternalKiCool.g:788:6: ( ( rule__ProcessorGroup__Group_1_1__0 ) )
                    {
                    // InternalKiCool.g:788:6: ( ( rule__ProcessorGroup__Group_1_1__0 ) )
                    // InternalKiCool.g:789:1: ( rule__ProcessorGroup__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getGroup_1_1()); 
                    }
                    // InternalKiCool.g:790:1: ( rule__ProcessorGroup__Group_1_1__0 )
                    // InternalKiCool.g:790:2: rule__ProcessorGroup__Group_1_1__0
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
                    // InternalKiCool.g:794:6: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
                    {
                    // InternalKiCool.g:794:6: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
                    // InternalKiCool.g:795:1: ( rule__ProcessorGroup__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getGroup_1_2()); 
                    }
                    // InternalKiCool.g:796:1: ( rule__ProcessorGroup__Group_1_2__0 )
                    // InternalKiCool.g:796:2: rule__ProcessorGroup__Group_1_2__0
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
                    // InternalKiCool.g:800:6: ( ( rule__ProcessorGroup__Group_1_3__0 ) )
                    {
                    // InternalKiCool.g:800:6: ( ( rule__ProcessorGroup__Group_1_3__0 ) )
                    // InternalKiCool.g:801:1: ( rule__ProcessorGroup__Group_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getGroup_1_3()); 
                    }
                    // InternalKiCool.g:802:1: ( rule__ProcessorGroup__Group_1_3__0 )
                    // InternalKiCool.g:802:2: rule__ProcessorGroup__Group_1_3__0
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
    // InternalKiCool.g:816:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:820:1: ( ( RULE_STRING ) | ( ruleExtendedID ) )
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
                    // InternalKiCool.g:821:1: ( RULE_STRING )
                    {
                    // InternalKiCool.g:821:1: ( RULE_STRING )
                    // InternalKiCool.g:822:1: RULE_STRING
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
                    // InternalKiCool.g:827:6: ( ruleExtendedID )
                    {
                    // InternalKiCool.g:827:6: ( ruleExtendedID )
                    // InternalKiCool.g:828:1: ruleExtendedID
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
    // InternalKiCool.g:838:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:842:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
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
                    // InternalKiCool.g:843:1: ( RULE_STRING )
                    {
                    // InternalKiCool.g:843:1: ( RULE_STRING )
                    // InternalKiCool.g:844:1: RULE_STRING
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
                    // InternalKiCool.g:849:6: ( ruleExtendedID )
                    {
                    // InternalKiCool.g:849:6: ( ruleExtendedID )
                    // InternalKiCool.g:850:1: ruleExtendedID
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
                    // InternalKiCool.g:855:6: ( RULE_BOOLEAN )
                    {
                    // InternalKiCool.g:855:6: ( RULE_BOOLEAN )
                    // InternalKiCool.g:856:1: RULE_BOOLEAN
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
    // InternalKiCool.g:866:1: rule__EStringAllTypes__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) );
    public final void rule__EStringAllTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:870:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) )
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
            case 17:
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
                    // InternalKiCool.g:871:1: ( RULE_STRING )
                    {
                    // InternalKiCool.g:871:1: ( RULE_STRING )
                    // InternalKiCool.g:872:1: RULE_STRING
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
                    // InternalKiCool.g:877:6: ( ruleExtendedID )
                    {
                    // InternalKiCool.g:877:6: ( ruleExtendedID )
                    // InternalKiCool.g:878:1: ruleExtendedID
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
                    // InternalKiCool.g:883:6: ( RULE_BOOLEAN )
                    {
                    // InternalKiCool.g:883:6: ( RULE_BOOLEAN )
                    // InternalKiCool.g:884:1: RULE_BOOLEAN
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
                    // InternalKiCool.g:889:6: ( ruleInteger )
                    {
                    // InternalKiCool.g:889:6: ( ruleInteger )
                    // InternalKiCool.g:890:1: ruleInteger
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
                    // InternalKiCool.g:895:6: ( ruleFloateger )
                    {
                    // InternalKiCool.g:895:6: ( ruleFloateger )
                    // InternalKiCool.g:896:1: ruleFloateger
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


    // $ANTLR start "rule__ExtendedID__Alternatives_1_0"
    // InternalKiCool.g:906:1: rule__ExtendedID__Alternatives_1_0 : ( ( '.' ) | ( '-' ) );
    public final void rule__ExtendedID__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:910:1: ( ( '.' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
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
                    // InternalKiCool.g:911:1: ( '.' )
                    {
                    // InternalKiCool.g:911:1: ( '.' )
                    // InternalKiCool.g:912:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0()); 
                    }
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiCool.g:919:6: ( '-' )
                    {
                    // InternalKiCool.g:919:6: ( '-' )
                    // InternalKiCool.g:920:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1()); 
                    }
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1()); 
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
    // $ANTLR end "rule__ExtendedID__Alternatives_1_0"


    // $ANTLR start "rule__System__Group__0"
    // InternalKiCool.g:934:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:938:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalKiCool.g:939:2: rule__System__Group__0__Impl rule__System__Group__1
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
    // InternalKiCool.g:946:1: rule__System__Group__0__Impl : ( ( rule__System__PublicAssignment_0 )? ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:950:1: ( ( ( rule__System__PublicAssignment_0 )? ) )
            // InternalKiCool.g:951:1: ( ( rule__System__PublicAssignment_0 )? )
            {
            // InternalKiCool.g:951:1: ( ( rule__System__PublicAssignment_0 )? )
            // InternalKiCool.g:952:1: ( rule__System__PublicAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getPublicAssignment_0()); 
            }
            // InternalKiCool.g:953:1: ( rule__System__PublicAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKiCool.g:953:2: rule__System__PublicAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__System__PublicAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getPublicAssignment_0()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:963:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:967:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalKiCool.g:968:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKiCool.g:975:1: rule__System__Group__1__Impl : ( ( rule__System__DeveloperAssignment_1 )? ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:979:1: ( ( ( rule__System__DeveloperAssignment_1 )? ) )
            // InternalKiCool.g:980:1: ( ( rule__System__DeveloperAssignment_1 )? )
            {
            // InternalKiCool.g:980:1: ( ( rule__System__DeveloperAssignment_1 )? )
            // InternalKiCool.g:981:1: ( rule__System__DeveloperAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getDeveloperAssignment_1()); 
            }
            // InternalKiCool.g:982:1: ( rule__System__DeveloperAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKiCool.g:982:2: rule__System__DeveloperAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__System__DeveloperAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getDeveloperAssignment_1()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:992:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:996:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalKiCool.g:997:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKiCool.g:1004:1: rule__System__Group__2__Impl : ( 'system' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1008:1: ( ( 'system' ) )
            // InternalKiCool.g:1009:1: ( 'system' )
            {
            // InternalKiCool.g:1009:1: ( 'system' )
            // InternalKiCool.g:1010:1: 'system'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getSystemKeyword_2()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getSystemKeyword_2()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:1023:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1027:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalKiCool.g:1028:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalKiCool.g:1035:1: rule__System__Group__3__Impl : ( ( rule__System__IdAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1039:1: ( ( ( rule__System__IdAssignment_3 ) ) )
            // InternalKiCool.g:1040:1: ( ( rule__System__IdAssignment_3 ) )
            {
            // InternalKiCool.g:1040:1: ( ( rule__System__IdAssignment_3 ) )
            // InternalKiCool.g:1041:1: ( rule__System__IdAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getIdAssignment_3()); 
            }
            // InternalKiCool.g:1042:1: ( rule__System__IdAssignment_3 )
            // InternalKiCool.g:1042:2: rule__System__IdAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__IdAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getIdAssignment_3()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:1052:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1056:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalKiCool.g:1057:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKiCool.g:1064:1: rule__System__Group__4__Impl : ( 'version' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1068:1: ( ( 'version' ) )
            // InternalKiCool.g:1069:1: ( 'version' )
            {
            // InternalKiCool.g:1069:1: ( 'version' )
            // InternalKiCool.g:1070:1: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getVersionKeyword_4()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getVersionKeyword_4()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:1083:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1087:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // InternalKiCool.g:1088:2: rule__System__Group__5__Impl rule__System__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKiCool.g:1095:1: rule__System__Group__5__Impl : ( ( rule__System__VersionAssignment_5 ) ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1099:1: ( ( ( rule__System__VersionAssignment_5 ) ) )
            // InternalKiCool.g:1100:1: ( ( rule__System__VersionAssignment_5 ) )
            {
            // InternalKiCool.g:1100:1: ( ( rule__System__VersionAssignment_5 ) )
            // InternalKiCool.g:1101:1: ( rule__System__VersionAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getVersionAssignment_5()); 
            }
            // InternalKiCool.g:1102:1: ( rule__System__VersionAssignment_5 )
            // InternalKiCool.g:1102:2: rule__System__VersionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__VersionAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getVersionAssignment_5()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:1112:1: rule__System__Group__6 : rule__System__Group__6__Impl rule__System__Group__7 ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1116:1: ( rule__System__Group__6__Impl rule__System__Group__7 )
            // InternalKiCool.g:1117:2: rule__System__Group__6__Impl rule__System__Group__7
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
    // InternalKiCool.g:1124:1: rule__System__Group__6__Impl : ( 'label' ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1128:1: ( ( 'label' ) )
            // InternalKiCool.g:1129:1: ( 'label' )
            {
            // InternalKiCool.g:1129:1: ( 'label' )
            // InternalKiCool.g:1130:1: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getLabelKeyword_6()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getLabelKeyword_6()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:1143:1: rule__System__Group__7 : rule__System__Group__7__Impl rule__System__Group__8 ;
    public final void rule__System__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1147:1: ( rule__System__Group__7__Impl rule__System__Group__8 )
            // InternalKiCool.g:1148:2: rule__System__Group__7__Impl rule__System__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalKiCool.g:1155:1: rule__System__Group__7__Impl : ( ( rule__System__LabelAssignment_7 ) ) ;
    public final void rule__System__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1159:1: ( ( ( rule__System__LabelAssignment_7 ) ) )
            // InternalKiCool.g:1160:1: ( ( rule__System__LabelAssignment_7 ) )
            {
            // InternalKiCool.g:1160:1: ( ( rule__System__LabelAssignment_7 ) )
            // InternalKiCool.g:1161:1: ( rule__System__LabelAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getLabelAssignment_7()); 
            }
            // InternalKiCool.g:1162:1: ( rule__System__LabelAssignment_7 )
            // InternalKiCool.g:1162:2: rule__System__LabelAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__LabelAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getLabelAssignment_7()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:1172:1: rule__System__Group__8 : rule__System__Group__8__Impl rule__System__Group__9 ;
    public final void rule__System__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1176:1: ( rule__System__Group__8__Impl rule__System__Group__9 )
            // InternalKiCool.g:1177:2: rule__System__Group__8__Impl rule__System__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__System__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKiCool.g:1184:1: rule__System__Group__8__Impl : ( ( rule__System__Group_8__0 )? ) ;
    public final void rule__System__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1188:1: ( ( ( rule__System__Group_8__0 )? ) )
            // InternalKiCool.g:1189:1: ( ( rule__System__Group_8__0 )? )
            {
            // InternalKiCool.g:1189:1: ( ( rule__System__Group_8__0 )? )
            // InternalKiCool.g:1190:1: ( rule__System__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getGroup_8()); 
            }
            // InternalKiCool.g:1191:1: ( rule__System__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKiCool.g:1191:2: rule__System__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__System__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getGroup_8()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__System__Group__9"
    // InternalKiCool.g:1201:1: rule__System__Group__9 : rule__System__Group__9__Impl rule__System__Group__10 ;
    public final void rule__System__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1205:1: ( rule__System__Group__9__Impl rule__System__Group__10 )
            // InternalKiCool.g:1206:2: rule__System__Group__9__Impl rule__System__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__System__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__9"


    // $ANTLR start "rule__System__Group__9__Impl"
    // InternalKiCool.g:1213:1: rule__System__Group__9__Impl : ( ( rule__System__Group_9__0 )* ) ;
    public final void rule__System__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1217:1: ( ( ( rule__System__Group_9__0 )* ) )
            // InternalKiCool.g:1218:1: ( ( rule__System__Group_9__0 )* )
            {
            // InternalKiCool.g:1218:1: ( ( rule__System__Group_9__0 )* )
            // InternalKiCool.g:1219:1: ( rule__System__Group_9__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getGroup_9()); 
            }
            // InternalKiCool.g:1220:1: ( rule__System__Group_9__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKiCool.g:1220:2: rule__System__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__System__Group_9__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getGroup_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__9__Impl"


    // $ANTLR start "rule__System__Group__10"
    // InternalKiCool.g:1230:1: rule__System__Group__10 : rule__System__Group__10__Impl rule__System__Group__11 ;
    public final void rule__System__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1234:1: ( rule__System__Group__10__Impl rule__System__Group__11 )
            // InternalKiCool.g:1235:2: rule__System__Group__10__Impl rule__System__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__System__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__10"


    // $ANTLR start "rule__System__Group__10__Impl"
    // InternalKiCool.g:1242:1: rule__System__Group__10__Impl : ( ( rule__System__IntermediatesAssignment_10 )* ) ;
    public final void rule__System__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1246:1: ( ( ( rule__System__IntermediatesAssignment_10 )* ) )
            // InternalKiCool.g:1247:1: ( ( rule__System__IntermediatesAssignment_10 )* )
            {
            // InternalKiCool.g:1247:1: ( ( rule__System__IntermediatesAssignment_10 )* )
            // InternalKiCool.g:1248:1: ( rule__System__IntermediatesAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getIntermediatesAssignment_10()); 
            }
            // InternalKiCool.g:1249:1: ( rule__System__IntermediatesAssignment_10 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKiCool.g:1249:2: rule__System__IntermediatesAssignment_10
            	    {
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    rule__System__IntermediatesAssignment_10();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getIntermediatesAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__10__Impl"


    // $ANTLR start "rule__System__Group__11"
    // InternalKiCool.g:1259:1: rule__System__Group__11 : rule__System__Group__11__Impl ;
    public final void rule__System__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1263:1: ( rule__System__Group__11__Impl )
            // InternalKiCool.g:1264:2: rule__System__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__11"


    // $ANTLR start "rule__System__Group__11__Impl"
    // InternalKiCool.g:1270:1: rule__System__Group__11__Impl : ( ( rule__System__ProcessorsAssignment_11 ) ) ;
    public final void rule__System__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1274:1: ( ( ( rule__System__ProcessorsAssignment_11 ) ) )
            // InternalKiCool.g:1275:1: ( ( rule__System__ProcessorsAssignment_11 ) )
            {
            // InternalKiCool.g:1275:1: ( ( rule__System__ProcessorsAssignment_11 ) )
            // InternalKiCool.g:1276:1: ( rule__System__ProcessorsAssignment_11 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getProcessorsAssignment_11()); 
            }
            // InternalKiCool.g:1277:1: ( rule__System__ProcessorsAssignment_11 )
            // InternalKiCool.g:1277:2: rule__System__ProcessorsAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__ProcessorsAssignment_11();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getProcessorsAssignment_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__11__Impl"


    // $ANTLR start "rule__System__Group_8__0"
    // InternalKiCool.g:1311:1: rule__System__Group_8__0 : rule__System__Group_8__0__Impl rule__System__Group_8__1 ;
    public final void rule__System__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1315:1: ( rule__System__Group_8__0__Impl rule__System__Group_8__1 )
            // InternalKiCool.g:1316:2: rule__System__Group_8__0__Impl rule__System__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__System__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_8__0"


    // $ANTLR start "rule__System__Group_8__0__Impl"
    // InternalKiCool.g:1323:1: rule__System__Group_8__0__Impl : ( 'input' ) ;
    public final void rule__System__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1327:1: ( ( 'input' ) )
            // InternalKiCool.g:1328:1: ( 'input' )
            {
            // InternalKiCool.g:1328:1: ( 'input' )
            // InternalKiCool.g:1329:1: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getInputKeyword_8_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getInputKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_8__0__Impl"


    // $ANTLR start "rule__System__Group_8__1"
    // InternalKiCool.g:1342:1: rule__System__Group_8__1 : rule__System__Group_8__1__Impl ;
    public final void rule__System__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1346:1: ( rule__System__Group_8__1__Impl )
            // InternalKiCool.g:1347:2: rule__System__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_8__1"


    // $ANTLR start "rule__System__Group_8__1__Impl"
    // InternalKiCool.g:1353:1: rule__System__Group_8__1__Impl : ( ( rule__System__InputClassAssignment_8_1 ) ) ;
    public final void rule__System__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1357:1: ( ( ( rule__System__InputClassAssignment_8_1 ) ) )
            // InternalKiCool.g:1358:1: ( ( rule__System__InputClassAssignment_8_1 ) )
            {
            // InternalKiCool.g:1358:1: ( ( rule__System__InputClassAssignment_8_1 ) )
            // InternalKiCool.g:1359:1: ( rule__System__InputClassAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getInputClassAssignment_8_1()); 
            }
            // InternalKiCool.g:1360:1: ( rule__System__InputClassAssignment_8_1 )
            // InternalKiCool.g:1360:2: rule__System__InputClassAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__InputClassAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getInputClassAssignment_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_8__1__Impl"


    // $ANTLR start "rule__System__Group_9__0"
    // InternalKiCool.g:1374:1: rule__System__Group_9__0 : rule__System__Group_9__0__Impl rule__System__Group_9__1 ;
    public final void rule__System__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1378:1: ( rule__System__Group_9__0__Impl rule__System__Group_9__1 )
            // InternalKiCool.g:1379:2: rule__System__Group_9__0__Impl rule__System__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__System__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__0"


    // $ANTLR start "rule__System__Group_9__0__Impl"
    // InternalKiCool.g:1386:1: rule__System__Group_9__0__Impl : ( 'set' ) ;
    public final void rule__System__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1390:1: ( ( 'set' ) )
            // InternalKiCool.g:1391:1: ( 'set' )
            {
            // InternalKiCool.g:1391:1: ( 'set' )
            // InternalKiCool.g:1392:1: 'set'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getSetKeyword_9_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getSetKeyword_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__0__Impl"


    // $ANTLR start "rule__System__Group_9__1"
    // InternalKiCool.g:1405:1: rule__System__Group_9__1 : rule__System__Group_9__1__Impl ;
    public final void rule__System__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1409:1: ( rule__System__Group_9__1__Impl )
            // InternalKiCool.g:1410:2: rule__System__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__1"


    // $ANTLR start "rule__System__Group_9__1__Impl"
    // InternalKiCool.g:1416:1: rule__System__Group_9__1__Impl : ( ( rule__System__StartsetsAssignment_9_1 ) ) ;
    public final void rule__System__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1420:1: ( ( ( rule__System__StartsetsAssignment_9_1 ) ) )
            // InternalKiCool.g:1421:1: ( ( rule__System__StartsetsAssignment_9_1 ) )
            {
            // InternalKiCool.g:1421:1: ( ( rule__System__StartsetsAssignment_9_1 ) )
            // InternalKiCool.g:1422:1: ( rule__System__StartsetsAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getStartsetsAssignment_9_1()); 
            }
            // InternalKiCool.g:1423:1: ( rule__System__StartsetsAssignment_9_1 )
            // InternalKiCool.g:1423:2: rule__System__StartsetsAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__StartsetsAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getStartsetsAssignment_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__1__Impl"


    // $ANTLR start "rule__IntermediateReference__Group__0"
    // InternalKiCool.g:1437:1: rule__IntermediateReference__Group__0 : rule__IntermediateReference__Group__0__Impl rule__IntermediateReference__Group__1 ;
    public final void rule__IntermediateReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1441:1: ( rule__IntermediateReference__Group__0__Impl rule__IntermediateReference__Group__1 )
            // InternalKiCool.g:1442:2: rule__IntermediateReference__Group__0__Impl rule__IntermediateReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__IntermediateReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntermediateReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateReference__Group__0"


    // $ANTLR start "rule__IntermediateReference__Group__0__Impl"
    // InternalKiCool.g:1449:1: rule__IntermediateReference__Group__0__Impl : ( 'intermediate' ) ;
    public final void rule__IntermediateReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1453:1: ( ( 'intermediate' ) )
            // InternalKiCool.g:1454:1: ( 'intermediate' )
            {
            // InternalKiCool.g:1454:1: ( 'intermediate' )
            // InternalKiCool.g:1455:1: 'intermediate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getIntermediateKeyword_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntermediateReferenceAccess().getIntermediateKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateReference__Group__0__Impl"


    // $ANTLR start "rule__IntermediateReference__Group__1"
    // InternalKiCool.g:1468:1: rule__IntermediateReference__Group__1 : rule__IntermediateReference__Group__1__Impl rule__IntermediateReference__Group__2 ;
    public final void rule__IntermediateReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1472:1: ( rule__IntermediateReference__Group__1__Impl rule__IntermediateReference__Group__2 )
            // InternalKiCool.g:1473:2: rule__IntermediateReference__Group__1__Impl rule__IntermediateReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__IntermediateReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntermediateReference__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateReference__Group__1"


    // $ANTLR start "rule__IntermediateReference__Group__1__Impl"
    // InternalKiCool.g:1480:1: rule__IntermediateReference__Group__1__Impl : ( ( rule__IntermediateReference__IdAssignment_1 ) ) ;
    public final void rule__IntermediateReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1484:1: ( ( ( rule__IntermediateReference__IdAssignment_1 ) ) )
            // InternalKiCool.g:1485:1: ( ( rule__IntermediateReference__IdAssignment_1 ) )
            {
            // InternalKiCool.g:1485:1: ( ( rule__IntermediateReference__IdAssignment_1 ) )
            // InternalKiCool.g:1486:1: ( rule__IntermediateReference__IdAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getIdAssignment_1()); 
            }
            // InternalKiCool.g:1487:1: ( rule__IntermediateReference__IdAssignment_1 )
            // InternalKiCool.g:1487:2: rule__IntermediateReference__IdAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntermediateReference__IdAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntermediateReferenceAccess().getIdAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateReference__Group__1__Impl"


    // $ANTLR start "rule__IntermediateReference__Group__2"
    // InternalKiCool.g:1497:1: rule__IntermediateReference__Group__2 : rule__IntermediateReference__Group__2__Impl ;
    public final void rule__IntermediateReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1501:1: ( rule__IntermediateReference__Group__2__Impl )
            // InternalKiCool.g:1502:2: rule__IntermediateReference__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntermediateReference__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateReference__Group__2"


    // $ANTLR start "rule__IntermediateReference__Group__2__Impl"
    // InternalKiCool.g:1508:1: rule__IntermediateReference__Group__2__Impl : ( ( rule__IntermediateReference__Group_2__0 )? ) ;
    public final void rule__IntermediateReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1512:1: ( ( ( rule__IntermediateReference__Group_2__0 )? ) )
            // InternalKiCool.g:1513:1: ( ( rule__IntermediateReference__Group_2__0 )? )
            {
            // InternalKiCool.g:1513:1: ( ( rule__IntermediateReference__Group_2__0 )? )
            // InternalKiCool.g:1514:1: ( rule__IntermediateReference__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getGroup_2()); 
            }
            // InternalKiCool.g:1515:1: ( rule__IntermediateReference__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKiCool.g:1515:2: rule__IntermediateReference__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__IntermediateReference__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntermediateReferenceAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateReference__Group__2__Impl"


    // $ANTLR start "rule__IntermediateReference__Group_2__0"
    // InternalKiCool.g:1531:1: rule__IntermediateReference__Group_2__0 : rule__IntermediateReference__Group_2__0__Impl rule__IntermediateReference__Group_2__1 ;
    public final void rule__IntermediateReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1535:1: ( rule__IntermediateReference__Group_2__0__Impl rule__IntermediateReference__Group_2__1 )
            // InternalKiCool.g:1536:2: rule__IntermediateReference__Group_2__0__Impl rule__IntermediateReference__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__IntermediateReference__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntermediateReference__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateReference__Group_2__0"


    // $ANTLR start "rule__IntermediateReference__Group_2__0__Impl"
    // InternalKiCool.g:1543:1: rule__IntermediateReference__Group_2__0__Impl : ( 'alias' ) ;
    public final void rule__IntermediateReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1547:1: ( ( 'alias' ) )
            // InternalKiCool.g:1548:1: ( 'alias' )
            {
            // InternalKiCool.g:1548:1: ( 'alias' )
            // InternalKiCool.g:1549:1: 'alias'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getAliasKeyword_2_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntermediateReferenceAccess().getAliasKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateReference__Group_2__0__Impl"


    // $ANTLR start "rule__IntermediateReference__Group_2__1"
    // InternalKiCool.g:1562:1: rule__IntermediateReference__Group_2__1 : rule__IntermediateReference__Group_2__1__Impl ;
    public final void rule__IntermediateReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1566:1: ( rule__IntermediateReference__Group_2__1__Impl )
            // InternalKiCool.g:1567:2: rule__IntermediateReference__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntermediateReference__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateReference__Group_2__1"


    // $ANTLR start "rule__IntermediateReference__Group_2__1__Impl"
    // InternalKiCool.g:1573:1: rule__IntermediateReference__Group_2__1__Impl : ( ( rule__IntermediateReference__AliasAssignment_2_1 ) ) ;
    public final void rule__IntermediateReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1577:1: ( ( ( rule__IntermediateReference__AliasAssignment_2_1 ) ) )
            // InternalKiCool.g:1578:1: ( ( rule__IntermediateReference__AliasAssignment_2_1 ) )
            {
            // InternalKiCool.g:1578:1: ( ( rule__IntermediateReference__AliasAssignment_2_1 ) )
            // InternalKiCool.g:1579:1: ( rule__IntermediateReference__AliasAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getAliasAssignment_2_1()); 
            }
            // InternalKiCool.g:1580:1: ( rule__IntermediateReference__AliasAssignment_2_1 )
            // InternalKiCool.g:1580:2: rule__IntermediateReference__AliasAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntermediateReference__AliasAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntermediateReferenceAccess().getAliasAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateReference__Group_2__1__Impl"


    // $ANTLR start "rule__ProcessorGroup__Group__0"
    // InternalKiCool.g:1594:1: rule__ProcessorGroup__Group__0 : rule__ProcessorGroup__Group__0__Impl rule__ProcessorGroup__Group__1 ;
    public final void rule__ProcessorGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1598:1: ( rule__ProcessorGroup__Group__0__Impl rule__ProcessorGroup__Group__1 )
            // InternalKiCool.g:1599:2: rule__ProcessorGroup__Group__0__Impl rule__ProcessorGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalKiCool.g:1606:1: rule__ProcessorGroup__Group__0__Impl : ( ( rule__ProcessorGroup__Group_0__0 )? ) ;
    public final void rule__ProcessorGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1610:1: ( ( ( rule__ProcessorGroup__Group_0__0 )? ) )
            // InternalKiCool.g:1611:1: ( ( rule__ProcessorGroup__Group_0__0 )? )
            {
            // InternalKiCool.g:1611:1: ( ( rule__ProcessorGroup__Group_0__0 )? )
            // InternalKiCool.g:1612:1: ( rule__ProcessorGroup__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getGroup_0()); 
            }
            // InternalKiCool.g:1613:1: ( rule__ProcessorGroup__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKiCool.g:1613:2: rule__ProcessorGroup__Group_0__0
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
    // InternalKiCool.g:1623:1: rule__ProcessorGroup__Group__1 : rule__ProcessorGroup__Group__1__Impl ;
    public final void rule__ProcessorGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1627:1: ( rule__ProcessorGroup__Group__1__Impl )
            // InternalKiCool.g:1628:2: rule__ProcessorGroup__Group__1__Impl
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
    // InternalKiCool.g:1634:1: rule__ProcessorGroup__Group__1__Impl : ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) ) ;
    public final void rule__ProcessorGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1638:1: ( ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) ) )
            // InternalKiCool.g:1639:1: ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) )
            {
            // InternalKiCool.g:1639:1: ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) )
            // InternalKiCool.g:1640:1: ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* )
            {
            // InternalKiCool.g:1640:1: ( ( rule__ProcessorGroup__Alternatives_1 ) )
            // InternalKiCool.g:1641:1: ( rule__ProcessorGroup__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getAlternatives_1()); 
            }
            // InternalKiCool.g:1642:1: ( rule__ProcessorGroup__Alternatives_1 )
            // InternalKiCool.g:1642:2: rule__ProcessorGroup__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__ProcessorGroup__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getAlternatives_1()); 
            }

            }

            // InternalKiCool.g:1645:1: ( ( rule__ProcessorGroup__Alternatives_1 )* )
            // InternalKiCool.g:1646:1: ( rule__ProcessorGroup__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getAlternatives_1()); 
            }
            // InternalKiCool.g:1647:1: ( rule__ProcessorGroup__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==18||LA13_0==25||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKiCool.g:1647:2: rule__ProcessorGroup__Alternatives_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    rule__ProcessorGroup__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalKiCool.g:1662:1: rule__ProcessorGroup__Group_0__0 : rule__ProcessorGroup__Group_0__0__Impl rule__ProcessorGroup__Group_0__1 ;
    public final void rule__ProcessorGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1666:1: ( rule__ProcessorGroup__Group_0__0__Impl rule__ProcessorGroup__Group_0__1 )
            // InternalKiCool.g:1667:2: rule__ProcessorGroup__Group_0__0__Impl rule__ProcessorGroup__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKiCool.g:1674:1: rule__ProcessorGroup__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__ProcessorGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1678:1: ( ( 'label' ) )
            // InternalKiCool.g:1679:1: ( 'label' )
            {
            // InternalKiCool.g:1679:1: ( 'label' )
            // InternalKiCool.g:1680:1: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getLabelKeyword_0_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:1693:1: rule__ProcessorGroup__Group_0__1 : rule__ProcessorGroup__Group_0__1__Impl ;
    public final void rule__ProcessorGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1697:1: ( rule__ProcessorGroup__Group_0__1__Impl )
            // InternalKiCool.g:1698:2: rule__ProcessorGroup__Group_0__1__Impl
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
    // InternalKiCool.g:1704:1: rule__ProcessorGroup__Group_0__1__Impl : ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) ) ;
    public final void rule__ProcessorGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1708:1: ( ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) ) )
            // InternalKiCool.g:1709:1: ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) )
            {
            // InternalKiCool.g:1709:1: ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) )
            // InternalKiCool.g:1710:1: ( rule__ProcessorGroup__LabelAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getLabelAssignment_0_1()); 
            }
            // InternalKiCool.g:1711:1: ( rule__ProcessorGroup__LabelAssignment_0_1 )
            // InternalKiCool.g:1711:2: rule__ProcessorGroup__LabelAssignment_0_1
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
    // InternalKiCool.g:1725:1: rule__ProcessorGroup__Group_1_1__0 : rule__ProcessorGroup__Group_1_1__0__Impl rule__ProcessorGroup__Group_1_1__1 ;
    public final void rule__ProcessorGroup__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1729:1: ( rule__ProcessorGroup__Group_1_1__0__Impl rule__ProcessorGroup__Group_1_1__1 )
            // InternalKiCool.g:1730:2: rule__ProcessorGroup__Group_1_1__0__Impl rule__ProcessorGroup__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKiCool.g:1737:1: rule__ProcessorGroup__Group_1_1__0__Impl : ( 'system' ) ;
    public final void rule__ProcessorGroup__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1741:1: ( ( 'system' ) )
            // InternalKiCool.g:1742:1: ( 'system' )
            {
            // InternalKiCool.g:1742:1: ( 'system' )
            // InternalKiCool.g:1743:1: 'system'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getSystemKeyword_1_1_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:1756:1: rule__ProcessorGroup__Group_1_1__1 : rule__ProcessorGroup__Group_1_1__1__Impl ;
    public final void rule__ProcessorGroup__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1760:1: ( rule__ProcessorGroup__Group_1_1__1__Impl )
            // InternalKiCool.g:1761:2: rule__ProcessorGroup__Group_1_1__1__Impl
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
    // InternalKiCool.g:1767:1: rule__ProcessorGroup__Group_1_1__1__Impl : ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) ) ;
    public final void rule__ProcessorGroup__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1771:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) ) )
            // InternalKiCool.g:1772:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) )
            {
            // InternalKiCool.g:1772:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) )
            // InternalKiCool.g:1773:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_1_1()); 
            }
            // InternalKiCool.g:1774:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 )
            // InternalKiCool.g:1774:2: rule__ProcessorGroup__ProcessorsAssignment_1_1_1
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
    // InternalKiCool.g:1788:1: rule__ProcessorGroup__Group_1_2__0 : rule__ProcessorGroup__Group_1_2__0__Impl rule__ProcessorGroup__Group_1_2__1 ;
    public final void rule__ProcessorGroup__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1792:1: ( rule__ProcessorGroup__Group_1_2__0__Impl rule__ProcessorGroup__Group_1_2__1 )
            // InternalKiCool.g:1793:2: rule__ProcessorGroup__Group_1_2__0__Impl rule__ProcessorGroup__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalKiCool.g:1800:1: rule__ProcessorGroup__Group_1_2__0__Impl : ( '[' ) ;
    public final void rule__ProcessorGroup__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1804:1: ( ( '[' ) )
            // InternalKiCool.g:1805:1: ( '[' )
            {
            // InternalKiCool.g:1805:1: ( '[' )
            // InternalKiCool.g:1806:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getLeftSquareBracketKeyword_1_2_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:1819:1: rule__ProcessorGroup__Group_1_2__1 : rule__ProcessorGroup__Group_1_2__1__Impl rule__ProcessorGroup__Group_1_2__2 ;
    public final void rule__ProcessorGroup__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1823:1: ( rule__ProcessorGroup__Group_1_2__1__Impl rule__ProcessorGroup__Group_1_2__2 )
            // InternalKiCool.g:1824:2: rule__ProcessorGroup__Group_1_2__1__Impl rule__ProcessorGroup__Group_1_2__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalKiCool.g:1831:1: rule__ProcessorGroup__Group_1_2__1__Impl : ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) ) ;
    public final void rule__ProcessorGroup__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1835:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) ) )
            // InternalKiCool.g:1836:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) )
            {
            // InternalKiCool.g:1836:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) )
            // InternalKiCool.g:1837:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_2_1()); 
            }
            // InternalKiCool.g:1838:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 )
            // InternalKiCool.g:1838:2: rule__ProcessorGroup__ProcessorsAssignment_1_2_1
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
    // InternalKiCool.g:1848:1: rule__ProcessorGroup__Group_1_2__2 : rule__ProcessorGroup__Group_1_2__2__Impl ;
    public final void rule__ProcessorGroup__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1852:1: ( rule__ProcessorGroup__Group_1_2__2__Impl )
            // InternalKiCool.g:1853:2: rule__ProcessorGroup__Group_1_2__2__Impl
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
    // InternalKiCool.g:1859:1: rule__ProcessorGroup__Group_1_2__2__Impl : ( ']' ) ;
    public final void rule__ProcessorGroup__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1863:1: ( ( ']' ) )
            // InternalKiCool.g:1864:1: ( ']' )
            {
            // InternalKiCool.g:1864:1: ( ']' )
            // InternalKiCool.g:1865:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getRightSquareBracketKeyword_1_2_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:1884:1: rule__ProcessorGroup__Group_1_3__0 : rule__ProcessorGroup__Group_1_3__0__Impl rule__ProcessorGroup__Group_1_3__1 ;
    public final void rule__ProcessorGroup__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1888:1: ( rule__ProcessorGroup__Group_1_3__0__Impl rule__ProcessorGroup__Group_1_3__1 )
            // InternalKiCool.g:1889:2: rule__ProcessorGroup__Group_1_3__0__Impl rule__ProcessorGroup__Group_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalKiCool.g:1896:1: rule__ProcessorGroup__Group_1_3__0__Impl : ( '[' ) ;
    public final void rule__ProcessorGroup__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1900:1: ( ( '[' ) )
            // InternalKiCool.g:1901:1: ( '[' )
            {
            // InternalKiCool.g:1901:1: ( '[' )
            // InternalKiCool.g:1902:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getLeftSquareBracketKeyword_1_3_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:1915:1: rule__ProcessorGroup__Group_1_3__1 : rule__ProcessorGroup__Group_1_3__1__Impl rule__ProcessorGroup__Group_1_3__2 ;
    public final void rule__ProcessorGroup__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1919:1: ( rule__ProcessorGroup__Group_1_3__1__Impl rule__ProcessorGroup__Group_1_3__2 )
            // InternalKiCool.g:1920:2: rule__ProcessorGroup__Group_1_3__1__Impl rule__ProcessorGroup__Group_1_3__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalKiCool.g:1927:1: rule__ProcessorGroup__Group_1_3__1__Impl : ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) ) ;
    public final void rule__ProcessorGroup__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1931:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) ) )
            // InternalKiCool.g:1932:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) )
            {
            // InternalKiCool.g:1932:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) )
            // InternalKiCool.g:1933:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_3_1()); 
            }
            // InternalKiCool.g:1934:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 )
            // InternalKiCool.g:1934:2: rule__ProcessorGroup__ProcessorsAssignment_1_3_1
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
    // InternalKiCool.g:1944:1: rule__ProcessorGroup__Group_1_3__2 : rule__ProcessorGroup__Group_1_3__2__Impl ;
    public final void rule__ProcessorGroup__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1948:1: ( rule__ProcessorGroup__Group_1_3__2__Impl )
            // InternalKiCool.g:1949:2: rule__ProcessorGroup__Group_1_3__2__Impl
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
    // InternalKiCool.g:1955:1: rule__ProcessorGroup__Group_1_3__2__Impl : ( ']' ) ;
    public final void rule__ProcessorGroup__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1959:1: ( ( ']' ) )
            // InternalKiCool.g:1960:1: ( ']' )
            {
            // InternalKiCool.g:1960:1: ( ']' )
            // InternalKiCool.g:1961:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getRightSquareBracketKeyword_1_3_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:1980:1: rule__Processor__Group__0 : rule__Processor__Group__0__Impl rule__Processor__Group__1 ;
    public final void rule__Processor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1984:1: ( rule__Processor__Group__0__Impl rule__Processor__Group__1 )
            // InternalKiCool.g:1985:2: rule__Processor__Group__0__Impl rule__Processor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalKiCool.g:1992:1: rule__Processor__Group__0__Impl : ( ( rule__Processor__Group_0__0 )* ) ;
    public final void rule__Processor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1996:1: ( ( ( rule__Processor__Group_0__0 )* ) )
            // InternalKiCool.g:1997:1: ( ( rule__Processor__Group_0__0 )* )
            {
            // InternalKiCool.g:1997:1: ( ( rule__Processor__Group_0__0 )* )
            // InternalKiCool.g:1998:1: ( rule__Processor__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_0()); 
            }
            // InternalKiCool.g:1999:1: ( rule__Processor__Group_0__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==22) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalKiCool.g:1999:2: rule__Processor__Group_0__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__Processor__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

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
    // InternalKiCool.g:2009:1: rule__Processor__Group__1 : rule__Processor__Group__1__Impl rule__Processor__Group__2 ;
    public final void rule__Processor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2013:1: ( rule__Processor__Group__1__Impl rule__Processor__Group__2 )
            // InternalKiCool.g:2014:2: rule__Processor__Group__1__Impl rule__Processor__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalKiCool.g:2021:1: rule__Processor__Group__1__Impl : ( ( rule__Processor__Group_1__0 )* ) ;
    public final void rule__Processor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2025:1: ( ( ( rule__Processor__Group_1__0 )* ) )
            // InternalKiCool.g:2026:1: ( ( rule__Processor__Group_1__0 )* )
            {
            // InternalKiCool.g:2026:1: ( ( rule__Processor__Group_1__0 )* )
            // InternalKiCool.g:2027:1: ( rule__Processor__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_1()); 
            }
            // InternalKiCool.g:2028:1: ( rule__Processor__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKiCool.g:2028:2: rule__Processor__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__Processor__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:2038:1: rule__Processor__Group__2 : rule__Processor__Group__2__Impl rule__Processor__Group__3 ;
    public final void rule__Processor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2042:1: ( rule__Processor__Group__2__Impl rule__Processor__Group__3 )
            // InternalKiCool.g:2043:2: rule__Processor__Group__2__Impl rule__Processor__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalKiCool.g:2050:1: rule__Processor__Group__2__Impl : ( ( rule__Processor__IdAssignment_2 ) ) ;
    public final void rule__Processor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2054:1: ( ( ( rule__Processor__IdAssignment_2 ) ) )
            // InternalKiCool.g:2055:1: ( ( rule__Processor__IdAssignment_2 ) )
            {
            // InternalKiCool.g:2055:1: ( ( rule__Processor__IdAssignment_2 ) )
            // InternalKiCool.g:2056:1: ( rule__Processor__IdAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getIdAssignment_2()); 
            }
            // InternalKiCool.g:2057:1: ( rule__Processor__IdAssignment_2 )
            // InternalKiCool.g:2057:2: rule__Processor__IdAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__IdAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getIdAssignment_2()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:2067:1: rule__Processor__Group__3 : rule__Processor__Group__3__Impl rule__Processor__Group__4 ;
    public final void rule__Processor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2071:1: ( rule__Processor__Group__3__Impl rule__Processor__Group__4 )
            // InternalKiCool.g:2072:2: rule__Processor__Group__3__Impl rule__Processor__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Processor__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKiCool.g:2079:1: rule__Processor__Group__3__Impl : ( ( rule__Processor__Group_3__0 )? ) ;
    public final void rule__Processor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2083:1: ( ( ( rule__Processor__Group_3__0 )? ) )
            // InternalKiCool.g:2084:1: ( ( rule__Processor__Group_3__0 )? )
            {
            // InternalKiCool.g:2084:1: ( ( rule__Processor__Group_3__0 )? )
            // InternalKiCool.g:2085:1: ( rule__Processor__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_3()); 
            }
            // InternalKiCool.g:2086:1: ( rule__Processor__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKiCool.g:2086:2: rule__Processor__Group_3__0
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


    // $ANTLR start "rule__Processor__Group__4"
    // InternalKiCool.g:2096:1: rule__Processor__Group__4 : rule__Processor__Group__4__Impl rule__Processor__Group__5 ;
    public final void rule__Processor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2100:1: ( rule__Processor__Group__4__Impl rule__Processor__Group__5 )
            // InternalKiCool.g:2101:2: rule__Processor__Group__4__Impl rule__Processor__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Processor__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__4"


    // $ANTLR start "rule__Processor__Group__4__Impl"
    // InternalKiCool.g:2108:1: rule__Processor__Group__4__Impl : ( ( rule__Processor__Group_4__0 )* ) ;
    public final void rule__Processor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2112:1: ( ( ( rule__Processor__Group_4__0 )* ) )
            // InternalKiCool.g:2113:1: ( ( rule__Processor__Group_4__0 )* )
            {
            // InternalKiCool.g:2113:1: ( ( rule__Processor__Group_4__0 )* )
            // InternalKiCool.g:2114:1: ( rule__Processor__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_4()); 
            }
            // InternalKiCool.g:2115:1: ( rule__Processor__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==28) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalKiCool.g:2115:2: rule__Processor__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__Processor__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__4__Impl"


    // $ANTLR start "rule__Processor__Group__5"
    // InternalKiCool.g:2125:1: rule__Processor__Group__5 : rule__Processor__Group__5__Impl ;
    public final void rule__Processor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2129:1: ( rule__Processor__Group__5__Impl )
            // InternalKiCool.g:2130:2: rule__Processor__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__5"


    // $ANTLR start "rule__Processor__Group__5__Impl"
    // InternalKiCool.g:2136:1: rule__Processor__Group__5__Impl : ( ( rule__Processor__Group_5__0 )* ) ;
    public final void rule__Processor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2140:1: ( ( ( rule__Processor__Group_5__0 )* ) )
            // InternalKiCool.g:2141:1: ( ( rule__Processor__Group_5__0 )* )
            {
            // InternalKiCool.g:2141:1: ( ( rule__Processor__Group_5__0 )* )
            // InternalKiCool.g:2142:1: ( rule__Processor__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_5()); 
            }
            // InternalKiCool.g:2143:1: ( rule__Processor__Group_5__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKiCool.g:2143:2: rule__Processor__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__Processor__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group__5__Impl"


    // $ANTLR start "rule__Processor__Group_0__0"
    // InternalKiCool.g:2165:1: rule__Processor__Group_0__0 : rule__Processor__Group_0__0__Impl rule__Processor__Group_0__1 ;
    public final void rule__Processor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2169:1: ( rule__Processor__Group_0__0__Impl rule__Processor__Group_0__1 )
            // InternalKiCool.g:2170:2: rule__Processor__Group_0__0__Impl rule__Processor__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKiCool.g:2177:1: rule__Processor__Group_0__0__Impl : ( 'pre' ) ;
    public final void rule__Processor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2181:1: ( ( 'pre' ) )
            // InternalKiCool.g:2182:1: ( 'pre' )
            {
            // InternalKiCool.g:2182:1: ( 'pre' )
            // InternalKiCool.g:2183:1: 'pre'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPreKeyword_0_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:2196:1: rule__Processor__Group_0__1 : rule__Processor__Group_0__1__Impl rule__Processor__Group_0__2 ;
    public final void rule__Processor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2200:1: ( rule__Processor__Group_0__1__Impl rule__Processor__Group_0__2 )
            // InternalKiCool.g:2201:2: rule__Processor__Group_0__1__Impl rule__Processor__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Processor__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKiCool.g:2208:1: rule__Processor__Group_0__1__Impl : ( 'set' ) ;
    public final void rule__Processor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2212:1: ( ( 'set' ) )
            // InternalKiCool.g:2213:1: ( 'set' )
            {
            // InternalKiCool.g:2213:1: ( 'set' )
            // InternalKiCool.g:2214:1: 'set'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getSetKeyword_0_1()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getSetKeyword_0_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Processor__Group_0__2"
    // InternalKiCool.g:2227:1: rule__Processor__Group_0__2 : rule__Processor__Group_0__2__Impl ;
    public final void rule__Processor__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2231:1: ( rule__Processor__Group_0__2__Impl )
            // InternalKiCool.g:2232:2: rule__Processor__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_0__2"


    // $ANTLR start "rule__Processor__Group_0__2__Impl"
    // InternalKiCool.g:2238:1: rule__Processor__Group_0__2__Impl : ( ( rule__Processor__PresetsAssignment_0_2 ) ) ;
    public final void rule__Processor__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2242:1: ( ( ( rule__Processor__PresetsAssignment_0_2 ) ) )
            // InternalKiCool.g:2243:1: ( ( rule__Processor__PresetsAssignment_0_2 ) )
            {
            // InternalKiCool.g:2243:1: ( ( rule__Processor__PresetsAssignment_0_2 ) )
            // InternalKiCool.g:2244:1: ( rule__Processor__PresetsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPresetsAssignment_0_2()); 
            }
            // InternalKiCool.g:2245:1: ( rule__Processor__PresetsAssignment_0_2 )
            // InternalKiCool.g:2245:2: rule__Processor__PresetsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__PresetsAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPresetsAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_0__2__Impl"


    // $ANTLR start "rule__Processor__Group_1__0"
    // InternalKiCool.g:2261:1: rule__Processor__Group_1__0 : rule__Processor__Group_1__0__Impl rule__Processor__Group_1__1 ;
    public final void rule__Processor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2265:1: ( rule__Processor__Group_1__0__Impl rule__Processor__Group_1__1 )
            // InternalKiCool.g:2266:2: rule__Processor__Group_1__0__Impl rule__Processor__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__Processor__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_1__0"


    // $ANTLR start "rule__Processor__Group_1__0__Impl"
    // InternalKiCool.g:2273:1: rule__Processor__Group_1__0__Impl : ( 'pre' ) ;
    public final void rule__Processor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2277:1: ( ( 'pre' ) )
            // InternalKiCool.g:2278:1: ( 'pre' )
            {
            // InternalKiCool.g:2278:1: ( 'pre' )
            // InternalKiCool.g:2279:1: 'pre'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPreKeyword_1_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPreKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_1__0__Impl"


    // $ANTLR start "rule__Processor__Group_1__1"
    // InternalKiCool.g:2292:1: rule__Processor__Group_1__1 : rule__Processor__Group_1__1__Impl rule__Processor__Group_1__2 ;
    public final void rule__Processor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2296:1: ( rule__Processor__Group_1__1__Impl rule__Processor__Group_1__2 )
            // InternalKiCool.g:2297:2: rule__Processor__Group_1__1__Impl rule__Processor__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Processor__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_1__1"


    // $ANTLR start "rule__Processor__Group_1__1__Impl"
    // InternalKiCool.g:2304:1: rule__Processor__Group_1__1__Impl : ( 'process' ) ;
    public final void rule__Processor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2308:1: ( ( 'process' ) )
            // InternalKiCool.g:2309:1: ( 'process' )
            {
            // InternalKiCool.g:2309:1: ( 'process' )
            // InternalKiCool.g:2310:1: 'process'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getProcessKeyword_1_1()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getProcessKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_1__1__Impl"


    // $ANTLR start "rule__Processor__Group_1__2"
    // InternalKiCool.g:2323:1: rule__Processor__Group_1__2 : rule__Processor__Group_1__2__Impl ;
    public final void rule__Processor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2327:1: ( rule__Processor__Group_1__2__Impl )
            // InternalKiCool.g:2328:2: rule__Processor__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_1__2"


    // $ANTLR start "rule__Processor__Group_1__2__Impl"
    // InternalKiCool.g:2334:1: rule__Processor__Group_1__2__Impl : ( ( rule__Processor__PreprocessesAssignment_1_2 ) ) ;
    public final void rule__Processor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2338:1: ( ( ( rule__Processor__PreprocessesAssignment_1_2 ) ) )
            // InternalKiCool.g:2339:1: ( ( rule__Processor__PreprocessesAssignment_1_2 ) )
            {
            // InternalKiCool.g:2339:1: ( ( rule__Processor__PreprocessesAssignment_1_2 ) )
            // InternalKiCool.g:2340:1: ( rule__Processor__PreprocessesAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPreprocessesAssignment_1_2()); 
            }
            // InternalKiCool.g:2341:1: ( rule__Processor__PreprocessesAssignment_1_2 )
            // InternalKiCool.g:2341:2: rule__Processor__PreprocessesAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__PreprocessesAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPreprocessesAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_1__2__Impl"


    // $ANTLR start "rule__Processor__Group_3__0"
    // InternalKiCool.g:2357:1: rule__Processor__Group_3__0 : rule__Processor__Group_3__0__Impl rule__Processor__Group_3__1 ;
    public final void rule__Processor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2361:1: ( rule__Processor__Group_3__0__Impl rule__Processor__Group_3__1 )
            // InternalKiCool.g:2362:2: rule__Processor__Group_3__0__Impl rule__Processor__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKiCool.g:2369:1: rule__Processor__Group_3__0__Impl : ( 'intermediate' ) ;
    public final void rule__Processor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2373:1: ( ( 'intermediate' ) )
            // InternalKiCool.g:2374:1: ( 'intermediate' )
            {
            // InternalKiCool.g:2374:1: ( 'intermediate' )
            // InternalKiCool.g:2375:1: 'intermediate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getIntermediateKeyword_3_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getIntermediateKeyword_3_0()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:2388:1: rule__Processor__Group_3__1 : rule__Processor__Group_3__1__Impl ;
    public final void rule__Processor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2392:1: ( rule__Processor__Group_3__1__Impl )
            // InternalKiCool.g:2393:2: rule__Processor__Group_3__1__Impl
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
    // InternalKiCool.g:2399:1: rule__Processor__Group_3__1__Impl : ( ( rule__Processor__MetricAssignment_3_1 ) ) ;
    public final void rule__Processor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2403:1: ( ( ( rule__Processor__MetricAssignment_3_1 ) ) )
            // InternalKiCool.g:2404:1: ( ( rule__Processor__MetricAssignment_3_1 ) )
            {
            // InternalKiCool.g:2404:1: ( ( rule__Processor__MetricAssignment_3_1 ) )
            // InternalKiCool.g:2405:1: ( rule__Processor__MetricAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getMetricAssignment_3_1()); 
            }
            // InternalKiCool.g:2406:1: ( rule__Processor__MetricAssignment_3_1 )
            // InternalKiCool.g:2406:2: rule__Processor__MetricAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__MetricAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getMetricAssignment_3_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Processor__Group_4__0"
    // InternalKiCool.g:2420:1: rule__Processor__Group_4__0 : rule__Processor__Group_4__0__Impl rule__Processor__Group_4__1 ;
    public final void rule__Processor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2424:1: ( rule__Processor__Group_4__0__Impl rule__Processor__Group_4__1 )
            // InternalKiCool.g:2425:2: rule__Processor__Group_4__0__Impl rule__Processor__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__Processor__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_4__0"


    // $ANTLR start "rule__Processor__Group_4__0__Impl"
    // InternalKiCool.g:2432:1: rule__Processor__Group_4__0__Impl : ( 'post' ) ;
    public final void rule__Processor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2436:1: ( ( 'post' ) )
            // InternalKiCool.g:2437:1: ( 'post' )
            {
            // InternalKiCool.g:2437:1: ( 'post' )
            // InternalKiCool.g:2438:1: 'post'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPostKeyword_4_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPostKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_4__0__Impl"


    // $ANTLR start "rule__Processor__Group_4__1"
    // InternalKiCool.g:2451:1: rule__Processor__Group_4__1 : rule__Processor__Group_4__1__Impl rule__Processor__Group_4__2 ;
    public final void rule__Processor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2455:1: ( rule__Processor__Group_4__1__Impl rule__Processor__Group_4__2 )
            // InternalKiCool.g:2456:2: rule__Processor__Group_4__1__Impl rule__Processor__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Processor__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_4__1"


    // $ANTLR start "rule__Processor__Group_4__1__Impl"
    // InternalKiCool.g:2463:1: rule__Processor__Group_4__1__Impl : ( 'process' ) ;
    public final void rule__Processor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2467:1: ( ( 'process' ) )
            // InternalKiCool.g:2468:1: ( 'process' )
            {
            // InternalKiCool.g:2468:1: ( 'process' )
            // InternalKiCool.g:2469:1: 'process'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getProcessKeyword_4_1()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getProcessKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_4__1__Impl"


    // $ANTLR start "rule__Processor__Group_4__2"
    // InternalKiCool.g:2482:1: rule__Processor__Group_4__2 : rule__Processor__Group_4__2__Impl ;
    public final void rule__Processor__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2486:1: ( rule__Processor__Group_4__2__Impl )
            // InternalKiCool.g:2487:2: rule__Processor__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_4__2"


    // $ANTLR start "rule__Processor__Group_4__2__Impl"
    // InternalKiCool.g:2493:1: rule__Processor__Group_4__2__Impl : ( ( rule__Processor__PostprocessesAssignment_4_2 ) ) ;
    public final void rule__Processor__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2497:1: ( ( ( rule__Processor__PostprocessesAssignment_4_2 ) ) )
            // InternalKiCool.g:2498:1: ( ( rule__Processor__PostprocessesAssignment_4_2 ) )
            {
            // InternalKiCool.g:2498:1: ( ( rule__Processor__PostprocessesAssignment_4_2 ) )
            // InternalKiCool.g:2499:1: ( rule__Processor__PostprocessesAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPostprocessesAssignment_4_2()); 
            }
            // InternalKiCool.g:2500:1: ( rule__Processor__PostprocessesAssignment_4_2 )
            // InternalKiCool.g:2500:2: rule__Processor__PostprocessesAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__PostprocessesAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPostprocessesAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_4__2__Impl"


    // $ANTLR start "rule__Processor__Group_5__0"
    // InternalKiCool.g:2516:1: rule__Processor__Group_5__0 : rule__Processor__Group_5__0__Impl rule__Processor__Group_5__1 ;
    public final void rule__Processor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2520:1: ( rule__Processor__Group_5__0__Impl rule__Processor__Group_5__1 )
            // InternalKiCool.g:2521:2: rule__Processor__Group_5__0__Impl rule__Processor__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Processor__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_5__0"


    // $ANTLR start "rule__Processor__Group_5__0__Impl"
    // InternalKiCool.g:2528:1: rule__Processor__Group_5__0__Impl : ( 'post' ) ;
    public final void rule__Processor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2532:1: ( ( 'post' ) )
            // InternalKiCool.g:2533:1: ( 'post' )
            {
            // InternalKiCool.g:2533:1: ( 'post' )
            // InternalKiCool.g:2534:1: 'post'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPostKeyword_5_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPostKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_5__0__Impl"


    // $ANTLR start "rule__Processor__Group_5__1"
    // InternalKiCool.g:2547:1: rule__Processor__Group_5__1 : rule__Processor__Group_5__1__Impl rule__Processor__Group_5__2 ;
    public final void rule__Processor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2551:1: ( rule__Processor__Group_5__1__Impl rule__Processor__Group_5__2 )
            // InternalKiCool.g:2552:2: rule__Processor__Group_5__1__Impl rule__Processor__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Processor__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_5__1"


    // $ANTLR start "rule__Processor__Group_5__1__Impl"
    // InternalKiCool.g:2559:1: rule__Processor__Group_5__1__Impl : ( 'set' ) ;
    public final void rule__Processor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2563:1: ( ( 'set' ) )
            // InternalKiCool.g:2564:1: ( 'set' )
            {
            // InternalKiCool.g:2564:1: ( 'set' )
            // InternalKiCool.g:2565:1: 'set'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getSetKeyword_5_1()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getSetKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_5__1__Impl"


    // $ANTLR start "rule__Processor__Group_5__2"
    // InternalKiCool.g:2578:1: rule__Processor__Group_5__2 : rule__Processor__Group_5__2__Impl ;
    public final void rule__Processor__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2582:1: ( rule__Processor__Group_5__2__Impl )
            // InternalKiCool.g:2583:2: rule__Processor__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_5__2"


    // $ANTLR start "rule__Processor__Group_5__2__Impl"
    // InternalKiCool.g:2589:1: rule__Processor__Group_5__2__Impl : ( ( rule__Processor__PostsetsAssignment_5_2 ) ) ;
    public final void rule__Processor__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2593:1: ( ( ( rule__Processor__PostsetsAssignment_5_2 ) ) )
            // InternalKiCool.g:2594:1: ( ( rule__Processor__PostsetsAssignment_5_2 ) )
            {
            // InternalKiCool.g:2594:1: ( ( rule__Processor__PostsetsAssignment_5_2 ) )
            // InternalKiCool.g:2595:1: ( rule__Processor__PostsetsAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPostsetsAssignment_5_2()); 
            }
            // InternalKiCool.g:2596:1: ( rule__Processor__PostsetsAssignment_5_2 )
            // InternalKiCool.g:2596:2: rule__Processor__PostsetsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Processor__PostsetsAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPostsetsAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__Group_5__2__Impl"


    // $ANTLR start "rule__CoProcessor__Group__0"
    // InternalKiCool.g:2612:1: rule__CoProcessor__Group__0 : rule__CoProcessor__Group__0__Impl rule__CoProcessor__Group__1 ;
    public final void rule__CoProcessor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2616:1: ( rule__CoProcessor__Group__0__Impl rule__CoProcessor__Group__1 )
            // InternalKiCool.g:2617:2: rule__CoProcessor__Group__0__Impl rule__CoProcessor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__CoProcessor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CoProcessor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoProcessor__Group__0"


    // $ANTLR start "rule__CoProcessor__Group__0__Impl"
    // InternalKiCool.g:2624:1: rule__CoProcessor__Group__0__Impl : ( ( rule__CoProcessor__IdAssignment_0 ) ) ;
    public final void rule__CoProcessor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2628:1: ( ( ( rule__CoProcessor__IdAssignment_0 ) ) )
            // InternalKiCool.g:2629:1: ( ( rule__CoProcessor__IdAssignment_0 ) )
            {
            // InternalKiCool.g:2629:1: ( ( rule__CoProcessor__IdAssignment_0 ) )
            // InternalKiCool.g:2630:1: ( rule__CoProcessor__IdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoProcessorAccess().getIdAssignment_0()); 
            }
            // InternalKiCool.g:2631:1: ( rule__CoProcessor__IdAssignment_0 )
            // InternalKiCool.g:2631:2: rule__CoProcessor__IdAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CoProcessor__IdAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCoProcessorAccess().getIdAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoProcessor__Group__0__Impl"


    // $ANTLR start "rule__CoProcessor__Group__1"
    // InternalKiCool.g:2641:1: rule__CoProcessor__Group__1 : rule__CoProcessor__Group__1__Impl ;
    public final void rule__CoProcessor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2645:1: ( rule__CoProcessor__Group__1__Impl )
            // InternalKiCool.g:2646:2: rule__CoProcessor__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CoProcessor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoProcessor__Group__1"


    // $ANTLR start "rule__CoProcessor__Group__1__Impl"
    // InternalKiCool.g:2652:1: rule__CoProcessor__Group__1__Impl : ( ( rule__CoProcessor__SilentAssignment_1 )? ) ;
    public final void rule__CoProcessor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2656:1: ( ( ( rule__CoProcessor__SilentAssignment_1 )? ) )
            // InternalKiCool.g:2657:1: ( ( rule__CoProcessor__SilentAssignment_1 )? )
            {
            // InternalKiCool.g:2657:1: ( ( rule__CoProcessor__SilentAssignment_1 )? )
            // InternalKiCool.g:2658:1: ( rule__CoProcessor__SilentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoProcessorAccess().getSilentAssignment_1()); 
            }
            // InternalKiCool.g:2659:1: ( rule__CoProcessor__SilentAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKiCool.g:2659:2: rule__CoProcessor__SilentAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__CoProcessor__SilentAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCoProcessorAccess().getSilentAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoProcessor__Group__1__Impl"


    // $ANTLR start "rule__ProcessorAlternativeGroup__Group__0"
    // InternalKiCool.g:2673:1: rule__ProcessorAlternativeGroup__Group__0 : rule__ProcessorAlternativeGroup__Group__0__Impl rule__ProcessorAlternativeGroup__Group__1 ;
    public final void rule__ProcessorAlternativeGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2677:1: ( rule__ProcessorAlternativeGroup__Group__0__Impl rule__ProcessorAlternativeGroup__Group__1 )
            // InternalKiCool.g:2678:2: rule__ProcessorAlternativeGroup__Group__0__Impl rule__ProcessorAlternativeGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalKiCool.g:2685:1: rule__ProcessorAlternativeGroup__Group__0__Impl : ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? ) ;
    public final void rule__ProcessorAlternativeGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2689:1: ( ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? ) )
            // InternalKiCool.g:2690:1: ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? )
            {
            // InternalKiCool.g:2690:1: ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? )
            // InternalKiCool.g:2691:1: ( rule__ProcessorAlternativeGroup__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_0()); 
            }
            // InternalKiCool.g:2692:1: ( rule__ProcessorAlternativeGroup__Group_0__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_STRING) ) {
                    int LA20_3 = input.LA(3);

                    if ( (synpred26_InternalKiCool()) ) {
                        alt20=1;
                    }
                }
                else if ( (LA20_1==RULE_ID) ) {
                    int LA20_4 = input.LA(3);

                    if ( (synpred26_InternalKiCool()) ) {
                        alt20=1;
                    }
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalKiCool.g:2692:2: rule__ProcessorAlternativeGroup__Group_0__0
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
    // InternalKiCool.g:2702:1: rule__ProcessorAlternativeGroup__Group__1 : rule__ProcessorAlternativeGroup__Group__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2706:1: ( rule__ProcessorAlternativeGroup__Group__1__Impl )
            // InternalKiCool.g:2707:2: rule__ProcessorAlternativeGroup__Group__1__Impl
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
    // InternalKiCool.g:2713:1: rule__ProcessorAlternativeGroup__Group__1__Impl : ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2717:1: ( ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) ) )
            // InternalKiCool.g:2718:1: ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) )
            {
            // InternalKiCool.g:2718:1: ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) )
            // InternalKiCool.g:2719:1: ( rule__ProcessorAlternativeGroup__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1()); 
            }
            // InternalKiCool.g:2720:1: ( rule__ProcessorAlternativeGroup__Group_1__0 )
            // InternalKiCool.g:2720:2: rule__ProcessorAlternativeGroup__Group_1__0
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
    // InternalKiCool.g:2734:1: rule__ProcessorAlternativeGroup__Group_0__0 : rule__ProcessorAlternativeGroup__Group_0__0__Impl rule__ProcessorAlternativeGroup__Group_0__1 ;
    public final void rule__ProcessorAlternativeGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2738:1: ( rule__ProcessorAlternativeGroup__Group_0__0__Impl rule__ProcessorAlternativeGroup__Group_0__1 )
            // InternalKiCool.g:2739:2: rule__ProcessorAlternativeGroup__Group_0__0__Impl rule__ProcessorAlternativeGroup__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKiCool.g:2746:1: rule__ProcessorAlternativeGroup__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__ProcessorAlternativeGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2750:1: ( ( 'label' ) )
            // InternalKiCool.g:2751:1: ( 'label' )
            {
            // InternalKiCool.g:2751:1: ( 'label' )
            // InternalKiCool.g:2752:1: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getLabelKeyword_0_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:2765:1: rule__ProcessorAlternativeGroup__Group_0__1 : rule__ProcessorAlternativeGroup__Group_0__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2769:1: ( rule__ProcessorAlternativeGroup__Group_0__1__Impl )
            // InternalKiCool.g:2770:2: rule__ProcessorAlternativeGroup__Group_0__1__Impl
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
    // InternalKiCool.g:2776:1: rule__ProcessorAlternativeGroup__Group_0__1__Impl : ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2780:1: ( ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) ) )
            // InternalKiCool.g:2781:1: ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) )
            {
            // InternalKiCool.g:2781:1: ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) )
            // InternalKiCool.g:2782:1: ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getLabelAssignment_0_1()); 
            }
            // InternalKiCool.g:2783:1: ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 )
            // InternalKiCool.g:2783:2: rule__ProcessorAlternativeGroup__LabelAssignment_0_1
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
    // InternalKiCool.g:2797:1: rule__ProcessorAlternativeGroup__Group_1__0 : rule__ProcessorAlternativeGroup__Group_1__0__Impl rule__ProcessorAlternativeGroup__Group_1__1 ;
    public final void rule__ProcessorAlternativeGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2801:1: ( rule__ProcessorAlternativeGroup__Group_1__0__Impl rule__ProcessorAlternativeGroup__Group_1__1 )
            // InternalKiCool.g:2802:2: rule__ProcessorAlternativeGroup__Group_1__0__Impl rule__ProcessorAlternativeGroup__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
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
    // InternalKiCool.g:2809:1: rule__ProcessorAlternativeGroup__Group_1__0__Impl : ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2813:1: ( ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) ) )
            // InternalKiCool.g:2814:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) )
            {
            // InternalKiCool.g:2814:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) )
            // InternalKiCool.g:2815:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsAssignment_1_0()); 
            }
            // InternalKiCool.g:2816:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 )
            // InternalKiCool.g:2816:2: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0
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
    // InternalKiCool.g:2826:1: rule__ProcessorAlternativeGroup__Group_1__1 : rule__ProcessorAlternativeGroup__Group_1__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2830:1: ( rule__ProcessorAlternativeGroup__Group_1__1__Impl )
            // InternalKiCool.g:2831:2: rule__ProcessorAlternativeGroup__Group_1__1__Impl
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
    // InternalKiCool.g:2837:1: rule__ProcessorAlternativeGroup__Group_1__1__Impl : ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2841:1: ( ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) ) )
            // InternalKiCool.g:2842:1: ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) )
            {
            // InternalKiCool.g:2842:1: ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) )
            // InternalKiCool.g:2843:1: ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* )
            {
            // InternalKiCool.g:2843:1: ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) )
            // InternalKiCool.g:2844:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1_1()); 
            }
            // InternalKiCool.g:2845:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )
            // InternalKiCool.g:2845:2: rule__ProcessorAlternativeGroup__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__ProcessorAlternativeGroup__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1_1()); 
            }

            }

            // InternalKiCool.g:2848:1: ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* )
            // InternalKiCool.g:2849:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1_1()); 
            }
            // InternalKiCool.g:2850:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKiCool.g:2850:2: rule__ProcessorAlternativeGroup__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    rule__ProcessorAlternativeGroup__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalKiCool.g:2865:1: rule__ProcessorAlternativeGroup__Group_1_1__0 : rule__ProcessorAlternativeGroup__Group_1_1__0__Impl rule__ProcessorAlternativeGroup__Group_1_1__1 ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2869:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0__Impl rule__ProcessorAlternativeGroup__Group_1_1__1 )
            // InternalKiCool.g:2870:2: rule__ProcessorAlternativeGroup__Group_1_1__0__Impl rule__ProcessorAlternativeGroup__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalKiCool.g:2877:1: rule__ProcessorAlternativeGroup__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2881:1: ( ( '|' ) )
            // InternalKiCool.g:2882:1: ( '|' )
            {
            // InternalKiCool.g:2882:1: ( '|' )
            // InternalKiCool.g:2883:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getVerticalLineKeyword_1_1_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:2896:1: rule__ProcessorAlternativeGroup__Group_1_1__1 : rule__ProcessorAlternativeGroup__Group_1_1__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2900:1: ( rule__ProcessorAlternativeGroup__Group_1_1__1__Impl )
            // InternalKiCool.g:2901:2: rule__ProcessorAlternativeGroup__Group_1_1__1__Impl
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
    // InternalKiCool.g:2907:1: rule__ProcessorAlternativeGroup__Group_1_1__1__Impl : ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2911:1: ( ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) ) )
            // InternalKiCool.g:2912:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) )
            {
            // InternalKiCool.g:2912:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) )
            // InternalKiCool.g:2913:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsAssignment_1_1_1()); 
            }
            // InternalKiCool.g:2914:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 )
            // InternalKiCool.g:2914:2: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1
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
    // InternalKiCool.g:2928:1: rule__KVPair__Group__0 : rule__KVPair__Group__0__Impl rule__KVPair__Group__1 ;
    public final void rule__KVPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2932:1: ( rule__KVPair__Group__0__Impl rule__KVPair__Group__1 )
            // InternalKiCool.g:2933:2: rule__KVPair__Group__0__Impl rule__KVPair__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:2940:1: rule__KVPair__Group__0__Impl : ( ( rule__KVPair__KeyAssignment_0 ) ) ;
    public final void rule__KVPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2944:1: ( ( ( rule__KVPair__KeyAssignment_0 ) ) )
            // InternalKiCool.g:2945:1: ( ( rule__KVPair__KeyAssignment_0 ) )
            {
            // InternalKiCool.g:2945:1: ( ( rule__KVPair__KeyAssignment_0 ) )
            // InternalKiCool.g:2946:1: ( rule__KVPair__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getKeyAssignment_0()); 
            }
            // InternalKiCool.g:2947:1: ( rule__KVPair__KeyAssignment_0 )
            // InternalKiCool.g:2947:2: rule__KVPair__KeyAssignment_0
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
    // InternalKiCool.g:2957:1: rule__KVPair__Group__1 : rule__KVPair__Group__1__Impl rule__KVPair__Group__2 ;
    public final void rule__KVPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2961:1: ( rule__KVPair__Group__1__Impl rule__KVPair__Group__2 )
            // InternalKiCool.g:2962:2: rule__KVPair__Group__1__Impl rule__KVPair__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:2969:1: rule__KVPair__Group__1__Impl : ( ( rule__KVPair__IsKeyValueAssignment_1 )? ) ;
    public final void rule__KVPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2973:1: ( ( ( rule__KVPair__IsKeyValueAssignment_1 )? ) )
            // InternalKiCool.g:2974:1: ( ( rule__KVPair__IsKeyValueAssignment_1 )? )
            {
            // InternalKiCool.g:2974:1: ( ( rule__KVPair__IsKeyValueAssignment_1 )? )
            // InternalKiCool.g:2975:1: ( rule__KVPair__IsKeyValueAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getIsKeyValueAssignment_1()); 
            }
            // InternalKiCool.g:2976:1: ( rule__KVPair__IsKeyValueAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKiCool.g:2976:2: rule__KVPair__IsKeyValueAssignment_1
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
    // InternalKiCool.g:2986:1: rule__KVPair__Group__2 : rule__KVPair__Group__2__Impl ;
    public final void rule__KVPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2990:1: ( rule__KVPair__Group__2__Impl )
            // InternalKiCool.g:2991:2: rule__KVPair__Group__2__Impl
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
    // InternalKiCool.g:2997:1: rule__KVPair__Group__2__Impl : ( ( rule__KVPair__ValueAssignment_2 ) ) ;
    public final void rule__KVPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3001:1: ( ( ( rule__KVPair__ValueAssignment_2 ) ) )
            // InternalKiCool.g:3002:1: ( ( rule__KVPair__ValueAssignment_2 ) )
            {
            // InternalKiCool.g:3002:1: ( ( rule__KVPair__ValueAssignment_2 ) )
            // InternalKiCool.g:3003:1: ( rule__KVPair__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getValueAssignment_2()); 
            }
            // InternalKiCool.g:3004:1: ( rule__KVPair__ValueAssignment_2 )
            // InternalKiCool.g:3004:2: rule__KVPair__ValueAssignment_2
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
    // InternalKiCool.g:3020:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3024:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalKiCool.g:3025:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKiCool.g:3032:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3036:1: ( ( '@' ) )
            // InternalKiCool.g:3037:1: ( '@' )
            {
            // InternalKiCool.g:3037:1: ( '@' )
            // InternalKiCool.g:3038:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3051:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3055:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalKiCool.g:3056:2: rule__TagAnnotation__Group__1__Impl
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
    // InternalKiCool.g:3062:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3066:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3067:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3067:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3068:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3069:1: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3069:2: rule__TagAnnotation__NameAssignment_1
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


    // $ANTLR start "rule__PragmaTag__Group__0"
    // InternalKiCool.g:3083:1: rule__PragmaTag__Group__0 : rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 ;
    public final void rule__PragmaTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3087:1: ( rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 )
            // InternalKiCool.g:3088:2: rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__PragmaTag__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTag__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PragmaTag__Group__0"


    // $ANTLR start "rule__PragmaTag__Group__0__Impl"
    // InternalKiCool.g:3095:1: rule__PragmaTag__Group__0__Impl : ( '#' ) ;
    public final void rule__PragmaTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3099:1: ( ( '#' ) )
            // InternalKiCool.g:3100:1: ( '#' )
            {
            // InternalKiCool.g:3100:1: ( '#' )
            // InternalKiCool.g:3101:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PragmaTag__Group__0__Impl"


    // $ANTLR start "rule__PragmaTag__Group__1"
    // InternalKiCool.g:3114:1: rule__PragmaTag__Group__1 : rule__PragmaTag__Group__1__Impl ;
    public final void rule__PragmaTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3118:1: ( rule__PragmaTag__Group__1__Impl )
            // InternalKiCool.g:3119:2: rule__PragmaTag__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTag__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PragmaTag__Group__1"


    // $ANTLR start "rule__PragmaTag__Group__1__Impl"
    // InternalKiCool.g:3125:1: rule__PragmaTag__Group__1__Impl : ( ( rule__PragmaTag__NameAssignment_1 ) ) ;
    public final void rule__PragmaTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3129:1: ( ( ( rule__PragmaTag__NameAssignment_1 ) ) )
            // InternalKiCool.g:3130:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3130:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            // InternalKiCool.g:3131:1: ( rule__PragmaTag__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3132:1: ( rule__PragmaTag__NameAssignment_1 )
            // InternalKiCool.g:3132:2: rule__PragmaTag__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTag__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPragmaTagAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PragmaTag__Group__1__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__0"
    // InternalKiCool.g:3146:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3150:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3151:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKiCool.g:3158:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3162:1: ( ( '@' ) )
            // InternalKiCool.g:3163:1: ( '@' )
            {
            // InternalKiCool.g:3163:1: ( '@' )
            // InternalKiCool.g:3164:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3177:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3181:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3182:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:3189:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3193:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3194:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3194:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3195:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3196:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3196:2: rule__KeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3206:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3210:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3211:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalKiCool.g:3218:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3222:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:3223:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:3223:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:3224:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:3225:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:3225:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKiCool.g:3235:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3239:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalKiCool.g:3240:2: rule__KeyStringValueAnnotation__Group__3__Impl
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
    // InternalKiCool.g:3246:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3250:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKiCool.g:3251:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKiCool.g:3251:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalKiCool.g:3252:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:3253:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKiCool.g:3253:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__KeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalKiCool.g:3271:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3275:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:3276:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:3283:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3287:1: ( ( ',' ) )
            // InternalKiCool.g:3288:1: ( ',' )
            {
            // InternalKiCool.g:3288:1: ( ',' )
            // InternalKiCool.g:3289:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3302:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3306:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:3307:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKiCool.g:3313:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3317:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:3318:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:3318:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:3319:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:3320:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:3320:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKiCool.g:3334:1: rule__RestrictedKeyStringValueAnnotation__Group__0 : rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3338:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3339:2: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKiCool.g:3346:1: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3350:1: ( ( '@' ) )
            // InternalKiCool.g:3351:1: ( '@' )
            {
            // InternalKiCool.g:3351:1: ( '@' )
            // InternalKiCool.g:3352:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3365:1: rule__RestrictedKeyStringValueAnnotation__Group__1 : rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3369:1: ( rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3370:2: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalKiCool.g:3377:1: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3381:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3382:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3382:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3383:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3384:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3384:2: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3394:1: rule__RestrictedKeyStringValueAnnotation__Group__2 : rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3398:1: ( rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3399:2: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalKiCool.g:3406:1: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3410:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:3411:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:3411:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:3412:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:3413:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:3413:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKiCool.g:3423:1: rule__RestrictedKeyStringValueAnnotation__Group__3 : rule__RestrictedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3427:1: ( rule__RestrictedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKiCool.g:3428:2: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKiCool.g:3434:1: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3438:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKiCool.g:3439:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKiCool.g:3439:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKiCool.g:3440:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:3441:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKiCool.g:3441:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__RestrictedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalKiCool.g:3459:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0 : rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3463:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:3464:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalKiCool.g:3471:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3475:1: ( ( ',' ) )
            // InternalKiCool.g:3476:1: ( ',' )
            {
            // InternalKiCool.g:3476:1: ( ',' )
            // InternalKiCool.g:3477:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3490:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1 : rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3494:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:3495:2: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKiCool.g:3501:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3505:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:3506:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:3506:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:3507:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:3508:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:3508:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1
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


    // $ANTLR start "rule__StringPragma__Group__0"
    // InternalKiCool.g:3522:1: rule__StringPragma__Group__0 : rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 ;
    public final void rule__StringPragma__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3526:1: ( rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 )
            // InternalKiCool.g:3527:2: rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__StringPragma__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group__0"


    // $ANTLR start "rule__StringPragma__Group__0__Impl"
    // InternalKiCool.g:3534:1: rule__StringPragma__Group__0__Impl : ( '#' ) ;
    public final void rule__StringPragma__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3538:1: ( ( '#' ) )
            // InternalKiCool.g:3539:1: ( '#' )
            {
            // InternalKiCool.g:3539:1: ( '#' )
            // InternalKiCool.g:3540:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group__0__Impl"


    // $ANTLR start "rule__StringPragma__Group__1"
    // InternalKiCool.g:3553:1: rule__StringPragma__Group__1 : rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 ;
    public final void rule__StringPragma__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3557:1: ( rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 )
            // InternalKiCool.g:3558:2: rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__StringPragma__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group__1"


    // $ANTLR start "rule__StringPragma__Group__1__Impl"
    // InternalKiCool.g:3565:1: rule__StringPragma__Group__1__Impl : ( ( rule__StringPragma__NameAssignment_1 ) ) ;
    public final void rule__StringPragma__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3569:1: ( ( ( rule__StringPragma__NameAssignment_1 ) ) )
            // InternalKiCool.g:3570:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3570:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            // InternalKiCool.g:3571:1: ( rule__StringPragma__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3572:1: ( rule__StringPragma__NameAssignment_1 )
            // InternalKiCool.g:3572:2: rule__StringPragma__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group__1__Impl"


    // $ANTLR start "rule__StringPragma__Group__2"
    // InternalKiCool.g:3582:1: rule__StringPragma__Group__2 : rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 ;
    public final void rule__StringPragma__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3586:1: ( rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 )
            // InternalKiCool.g:3587:2: rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__StringPragma__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group__2"


    // $ANTLR start "rule__StringPragma__Group__2__Impl"
    // InternalKiCool.g:3594:1: rule__StringPragma__Group__2__Impl : ( ( rule__StringPragma__ValuesAssignment_2 ) ) ;
    public final void rule__StringPragma__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3598:1: ( ( ( rule__StringPragma__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:3599:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:3599:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            // InternalKiCool.g:3600:1: ( rule__StringPragma__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:3601:1: ( rule__StringPragma__ValuesAssignment_2 )
            // InternalKiCool.g:3601:2: rule__StringPragma__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__ValuesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getValuesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group__2__Impl"


    // $ANTLR start "rule__StringPragma__Group__3"
    // InternalKiCool.g:3611:1: rule__StringPragma__Group__3 : rule__StringPragma__Group__3__Impl ;
    public final void rule__StringPragma__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3615:1: ( rule__StringPragma__Group__3__Impl )
            // InternalKiCool.g:3616:2: rule__StringPragma__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group__3"


    // $ANTLR start "rule__StringPragma__Group__3__Impl"
    // InternalKiCool.g:3622:1: rule__StringPragma__Group__3__Impl : ( ( rule__StringPragma__Group_3__0 )* ) ;
    public final void rule__StringPragma__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3626:1: ( ( ( rule__StringPragma__Group_3__0 )* ) )
            // InternalKiCool.g:3627:1: ( ( rule__StringPragma__Group_3__0 )* )
            {
            // InternalKiCool.g:3627:1: ( ( rule__StringPragma__Group_3__0 )* )
            // InternalKiCool.g:3628:1: ( rule__StringPragma__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getGroup_3()); 
            }
            // InternalKiCool.g:3629:1: ( rule__StringPragma__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKiCool.g:3629:2: rule__StringPragma__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__StringPragma__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group__3__Impl"


    // $ANTLR start "rule__StringPragma__Group_3__0"
    // InternalKiCool.g:3647:1: rule__StringPragma__Group_3__0 : rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 ;
    public final void rule__StringPragma__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3651:1: ( rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 )
            // InternalKiCool.g:3652:2: rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__StringPragma__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group_3__0"


    // $ANTLR start "rule__StringPragma__Group_3__0__Impl"
    // InternalKiCool.g:3659:1: rule__StringPragma__Group_3__0__Impl : ( ',' ) ;
    public final void rule__StringPragma__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3663:1: ( ( ',' ) )
            // InternalKiCool.g:3664:1: ( ',' )
            {
            // InternalKiCool.g:3664:1: ( ',' )
            // InternalKiCool.g:3665:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group_3__0__Impl"


    // $ANTLR start "rule__StringPragma__Group_3__1"
    // InternalKiCool.g:3678:1: rule__StringPragma__Group_3__1 : rule__StringPragma__Group_3__1__Impl ;
    public final void rule__StringPragma__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3682:1: ( rule__StringPragma__Group_3__1__Impl )
            // InternalKiCool.g:3683:2: rule__StringPragma__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group_3__1"


    // $ANTLR start "rule__StringPragma__Group_3__1__Impl"
    // InternalKiCool.g:3689:1: rule__StringPragma__Group_3__1__Impl : ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) ;
    public final void rule__StringPragma__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3693:1: ( ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:3694:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:3694:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:3695:1: ( rule__StringPragma__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:3696:1: ( rule__StringPragma__ValuesAssignment_3_1 )
            // InternalKiCool.g:3696:2: rule__StringPragma__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__ValuesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getValuesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__Group_3__1__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__0"
    // InternalKiCool.g:3710:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3714:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3715:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKiCool.g:3722:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3726:1: ( ( '@' ) )
            // InternalKiCool.g:3727:1: ( '@' )
            {
            // InternalKiCool.g:3727:1: ( '@' )
            // InternalKiCool.g:3728:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3741:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3745:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3746:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKiCool.g:3753:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3757:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3758:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3758:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3759:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3760:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3760:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3770:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3774:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3775:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKiCool.g:3782:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3786:1: ( ( '[' ) )
            // InternalKiCool.g:3787:1: ( '[' )
            {
            // InternalKiCool.g:3787:1: ( '[' )
            // InternalKiCool.g:3788:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3801:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3805:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalKiCool.g:3806:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalKiCool.g:3813:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3817:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKiCool.g:3818:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKiCool.g:3818:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKiCool.g:3819:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKiCool.g:3820:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKiCool.g:3820:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKiCool.g:3830:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3834:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalKiCool.g:3835:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:3842:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3846:1: ( ( ']' ) )
            // InternalKiCool.g:3847:1: ( ']' )
            {
            // InternalKiCool.g:3847:1: ( ']' )
            // InternalKiCool.g:3848:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3861:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3865:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalKiCool.g:3866:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalKiCool.g:3873:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3877:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKiCool.g:3878:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKiCool.g:3878:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKiCool.g:3879:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKiCool.g:3880:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKiCool.g:3880:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKiCool.g:3890:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3894:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKiCool.g:3895:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKiCool.g:3901:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3905:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKiCool.g:3906:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKiCool.g:3906:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKiCool.g:3907:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKiCool.g:3908:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKiCool.g:3908:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalKiCool.g:3932:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3936:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKiCool.g:3937:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:3944:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3948:1: ( ( ',' ) )
            // InternalKiCool.g:3949:1: ( ',' )
            {
            // InternalKiCool.g:3949:1: ( ',' )
            // InternalKiCool.g:3950:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3963:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3967:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKiCool.g:3968:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKiCool.g:3974:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3978:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKiCool.g:3979:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKiCool.g:3979:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKiCool.g:3980:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKiCool.g:3981:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKiCool.g:3981:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKiCool.g:3995:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3999:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:4000:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKiCool.g:4007:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4011:1: ( ( '@' ) )
            // InternalKiCool.g:4012:1: ( '@' )
            {
            // InternalKiCool.g:4012:1: ( '@' )
            // InternalKiCool.g:4013:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4026:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4030:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:4031:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKiCool.g:4038:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4042:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:4043:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:4043:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:4044:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:4045:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:4045:2: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:4055:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2 : rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4059:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:4060:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKiCool.g:4067:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4071:1: ( ( '[' ) )
            // InternalKiCool.g:4072:1: ( '[' )
            {
            // InternalKiCool.g:4072:1: ( '[' )
            // InternalKiCool.g:4073:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4086:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3 : rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4090:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKiCool.g:4091:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalKiCool.g:4098:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4102:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKiCool.g:4103:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKiCool.g:4103:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKiCool.g:4104:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKiCool.g:4105:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKiCool.g:4105:2: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKiCool.g:4115:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4 : rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4119:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKiCool.g:4120:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalKiCool.g:4127:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4131:1: ( ( ']' ) )
            // InternalKiCool.g:4132:1: ( ']' )
            {
            // InternalKiCool.g:4132:1: ( ']' )
            // InternalKiCool.g:4133:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4146:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5 : rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4150:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKiCool.g:4151:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalKiCool.g:4158:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4162:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKiCool.g:4163:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKiCool.g:4163:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKiCool.g:4164:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKiCool.g:4165:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKiCool.g:4165:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKiCool.g:4175:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6 : rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4179:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKiCool.g:4180:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKiCool.g:4186:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4190:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKiCool.g:4191:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKiCool.g:4191:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKiCool.g:4192:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKiCool.g:4193:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKiCool.g:4193:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalKiCool.g:4217:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4221:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKiCool.g:4222:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalKiCool.g:4229:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4233:1: ( ( ',' ) )
            // InternalKiCool.g:4234:1: ( ',' )
            {
            // InternalKiCool.g:4234:1: ( ',' )
            // InternalKiCool.g:4235:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4248:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4252:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKiCool.g:4253:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKiCool.g:4259:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4263:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKiCool.g:4264:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKiCool.g:4264:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKiCool.g:4265:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKiCool.g:4266:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKiCool.g:4266:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKiCool.g:4280:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4284:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:4285:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKiCool.g:4292:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4296:1: ( ( '@' ) )
            // InternalKiCool.g:4297:1: ( '@' )
            {
            // InternalKiCool.g:4297:1: ( '@' )
            // InternalKiCool.g:4298:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4311:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4315:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:4316:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalKiCool.g:4323:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4327:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:4328:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:4328:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:4329:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:4330:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:4330:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:4340:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4344:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:4345:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalKiCool.g:4352:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4356:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:4357:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:4357:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:4358:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:4359:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:4359:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKiCool.g:4369:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4373:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKiCool.g:4374:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKiCool.g:4380:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4384:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKiCool.g:4385:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKiCool.g:4385:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKiCool.g:4386:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:4387:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==33) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalKiCool.g:4387:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalKiCool.g:4405:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4409:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:4410:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalKiCool.g:4417:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4421:1: ( ( ',' ) )
            // InternalKiCool.g:4422:1: ( ',' )
            {
            // InternalKiCool.g:4422:1: ( ',' )
            // InternalKiCool.g:4423:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4436:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4440:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:4441:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKiCool.g:4447:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4451:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:4452:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:4452:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:4453:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:4454:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:4454:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKiCool.g:4468:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4472:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:4473:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKiCool.g:4480:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4484:1: ( ( '@' ) )
            // InternalKiCool.g:4485:1: ( '@' )
            {
            // InternalKiCool.g:4485:1: ( '@' )
            // InternalKiCool.g:4486:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4499:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4503:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:4504:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKiCool.g:4511:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4515:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:4516:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:4516:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:4517:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:4518:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:4518:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:4528:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4532:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:4533:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKiCool.g:4540:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4544:1: ( ( '[' ) )
            // InternalKiCool.g:4545:1: ( '[' )
            {
            // InternalKiCool.g:4545:1: ( '[' )
            // InternalKiCool.g:4546:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4559:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4563:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKiCool.g:4564:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalKiCool.g:4571:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4575:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKiCool.g:4576:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKiCool.g:4576:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKiCool.g:4577:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKiCool.g:4578:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKiCool.g:4578:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKiCool.g:4588:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4592:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKiCool.g:4593:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalKiCool.g:4600:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4604:1: ( ( ']' ) )
            // InternalKiCool.g:4605:1: ( ']' )
            {
            // InternalKiCool.g:4605:1: ( ']' )
            // InternalKiCool.g:4606:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4619:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4623:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKiCool.g:4624:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalKiCool.g:4631:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4635:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKiCool.g:4636:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKiCool.g:4636:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKiCool.g:4637:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKiCool.g:4638:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKiCool.g:4638:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKiCool.g:4648:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4652:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKiCool.g:4653:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKiCool.g:4659:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4663:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKiCool.g:4664:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKiCool.g:4664:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKiCool.g:4665:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKiCool.g:4666:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKiCool.g:4666:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalKiCool.g:4690:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4694:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKiCool.g:4695:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalKiCool.g:4702:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4706:1: ( ( ',' ) )
            // InternalKiCool.g:4707:1: ( ',' )
            {
            // InternalKiCool.g:4707:1: ( ',' )
            // InternalKiCool.g:4708:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4721:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4725:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKiCool.g:4726:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKiCool.g:4732:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4736:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKiCool.g:4737:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKiCool.g:4737:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKiCool.g:4738:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKiCool.g:4739:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKiCool.g:4739:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKiCool.g:4753:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4757:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalKiCool.g:4758:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalKiCool.g:4765:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4769:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4770:1: ( RULE_ID )
            {
            // InternalKiCool.g:4770:1: ( RULE_ID )
            // InternalKiCool.g:4771:1: RULE_ID
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
    // InternalKiCool.g:4782:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4786:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalKiCool.g:4787:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalKiCool.g:4794:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4798:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // InternalKiCool.g:4799:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // InternalKiCool.g:4799:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // InternalKiCool.g:4800:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // InternalKiCool.g:4801:1: ( rule__ExtendedID__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==17) ) {
                    int LA30_2 = input.LA(2);

                    if ( (LA30_2==RULE_ID) ) {
                        alt30=1;
                    }


                }
                else if ( (LA30_0==16) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKiCool.g:4801:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalKiCool.g:4811:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4815:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalKiCool.g:4816:2: rule__ExtendedID__Group__2__Impl
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
    // InternalKiCool.g:4822:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4826:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalKiCool.g:4827:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalKiCool.g:4827:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalKiCool.g:4828:1: ( rule__ExtendedID__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            }
            // InternalKiCool.g:4829:1: ( rule__ExtendedID__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKiCool.g:4829:2: rule__ExtendedID__Group_2__0
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
    // InternalKiCool.g:4845:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4849:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // InternalKiCool.g:4850:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKiCool.g:4857:1: rule__ExtendedID__Group_1__0__Impl : ( ( rule__ExtendedID__Alternatives_1_0 ) ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4861:1: ( ( ( rule__ExtendedID__Alternatives_1_0 ) ) )
            // InternalKiCool.g:4862:1: ( ( rule__ExtendedID__Alternatives_1_0 ) )
            {
            // InternalKiCool.g:4862:1: ( ( rule__ExtendedID__Alternatives_1_0 ) )
            // InternalKiCool.g:4863:1: ( rule__ExtendedID__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getAlternatives_1_0()); 
            }
            // InternalKiCool.g:4864:1: ( rule__ExtendedID__Alternatives_1_0 )
            // InternalKiCool.g:4864:2: rule__ExtendedID__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:4874:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4878:1: ( rule__ExtendedID__Group_1__1__Impl )
            // InternalKiCool.g:4879:2: rule__ExtendedID__Group_1__1__Impl
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
    // InternalKiCool.g:4885:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4889:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4890:1: ( RULE_ID )
            {
            // InternalKiCool.g:4890:1: ( RULE_ID )
            // InternalKiCool.g:4891:1: RULE_ID
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
    // InternalKiCool.g:4906:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4910:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalKiCool.g:4911:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKiCool.g:4918:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4922:1: ( ( '#' ) )
            // InternalKiCool.g:4923:1: ( '#' )
            {
            // InternalKiCool.g:4923:1: ( '#' )
            // InternalKiCool.g:4924:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4937:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4941:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalKiCool.g:4942:2: rule__ExtendedID__Group_2__1__Impl
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
    // InternalKiCool.g:4948:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4952:1: ( ( RULE_INT ) )
            // InternalKiCool.g:4953:1: ( RULE_INT )
            {
            // InternalKiCool.g:4953:1: ( RULE_INT )
            // InternalKiCool.g:4954:1: RULE_INT
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
    // InternalKiCool.g:4969:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4973:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // InternalKiCool.g:4974:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
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
    // InternalKiCool.g:4981:1: rule__QualifiedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4985:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4986:1: ( RULE_ID )
            {
            // InternalKiCool.g:4986:1: ( RULE_ID )
            // InternalKiCool.g:4987:1: RULE_ID
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
    // InternalKiCool.g:4998:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5002:1: ( rule__QualifiedID__Group__1__Impl )
            // InternalKiCool.g:5003:2: rule__QualifiedID__Group__1__Impl
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
    // InternalKiCool.g:5009:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5013:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // InternalKiCool.g:5014:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // InternalKiCool.g:5014:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // InternalKiCool.g:5015:1: ( rule__QualifiedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            }
            // InternalKiCool.g:5016:1: ( rule__QualifiedID__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==16) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKiCool.g:5016:2: rule__QualifiedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    rule__QualifiedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalKiCool.g:5030:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5034:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // InternalKiCool.g:5035:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
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
    // InternalKiCool.g:5042:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5046:1: ( ( '.' ) )
            // InternalKiCool.g:5047:1: ( '.' )
            {
            // InternalKiCool.g:5047:1: ( '.' )
            // InternalKiCool.g:5048:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:5061:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5065:1: ( rule__QualifiedID__Group_1__1__Impl )
            // InternalKiCool.g:5066:2: rule__QualifiedID__Group_1__1__Impl
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
    // InternalKiCool.g:5072:1: rule__QualifiedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5076:1: ( ( RULE_ID ) )
            // InternalKiCool.g:5077:1: ( RULE_ID )
            {
            // InternalKiCool.g:5077:1: ( RULE_ID )
            // InternalKiCool.g:5078:1: RULE_ID
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
    // InternalKiCool.g:5093:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5097:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalKiCool.g:5098:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalKiCool.g:5105:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5109:1: ( ( ( '-' )? ) )
            // InternalKiCool.g:5110:1: ( ( '-' )? )
            {
            // InternalKiCool.g:5110:1: ( ( '-' )? )
            // InternalKiCool.g:5111:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKiCool.g:5112:1: ( '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==17) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKiCool.g:5113:2: '-'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKiCool.g:5124:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5128:1: ( rule__Integer__Group__1__Impl )
            // InternalKiCool.g:5129:2: rule__Integer__Group__1__Impl
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
    // InternalKiCool.g:5135:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5139:1: ( ( RULE_INT ) )
            // InternalKiCool.g:5140:1: ( RULE_INT )
            {
            // InternalKiCool.g:5140:1: ( RULE_INT )
            // InternalKiCool.g:5141:1: RULE_INT
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
    // InternalKiCool.g:5156:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5160:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalKiCool.g:5161:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:5168:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5172:1: ( ( ( '-' )? ) )
            // InternalKiCool.g:5173:1: ( ( '-' )? )
            {
            // InternalKiCool.g:5173:1: ( ( '-' )? )
            // InternalKiCool.g:5174:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKiCool.g:5175:1: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==17) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKiCool.g:5176:2: '-'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalKiCool.g:5187:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5191:1: ( rule__Floateger__Group__1__Impl )
            // InternalKiCool.g:5192:2: rule__Floateger__Group__1__Impl
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
    // InternalKiCool.g:5198:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5202:1: ( ( RULE_FLOAT ) )
            // InternalKiCool.g:5203:1: ( RULE_FLOAT )
            {
            // InternalKiCool.g:5203:1: ( RULE_FLOAT )
            // InternalKiCool.g:5204:1: RULE_FLOAT
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


    // $ANTLR start "rule__System__PublicAssignment_0"
    // InternalKiCool.g:5221:1: rule__System__PublicAssignment_0 : ( ( 'public' ) ) ;
    public final void rule__System__PublicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5225:1: ( ( ( 'public' ) ) )
            // InternalKiCool.g:5226:1: ( ( 'public' ) )
            {
            // InternalKiCool.g:5226:1: ( ( 'public' ) )
            // InternalKiCool.g:5227:1: ( 'public' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getPublicPublicKeyword_0_0()); 
            }
            // InternalKiCool.g:5228:1: ( 'public' )
            // InternalKiCool.g:5229:1: 'public'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getPublicPublicKeyword_0_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getPublicPublicKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getPublicPublicKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__PublicAssignment_0"


    // $ANTLR start "rule__System__DeveloperAssignment_1"
    // InternalKiCool.g:5244:1: rule__System__DeveloperAssignment_1 : ( ( 'developer' ) ) ;
    public final void rule__System__DeveloperAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5248:1: ( ( ( 'developer' ) ) )
            // InternalKiCool.g:5249:1: ( ( 'developer' ) )
            {
            // InternalKiCool.g:5249:1: ( ( 'developer' ) )
            // InternalKiCool.g:5250:1: ( 'developer' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getDeveloperDeveloperKeyword_1_0()); 
            }
            // InternalKiCool.g:5251:1: ( 'developer' )
            // InternalKiCool.g:5252:1: 'developer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getDeveloperDeveloperKeyword_1_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getDeveloperDeveloperKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getDeveloperDeveloperKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__DeveloperAssignment_1"


    // $ANTLR start "rule__System__IdAssignment_3"
    // InternalKiCool.g:5267:1: rule__System__IdAssignment_3 : ( ruleQualifiedID ) ;
    public final void rule__System__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5271:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5272:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:5272:1: ( ruleQualifiedID )
            // InternalKiCool.g:5273:1: ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getIdQualifiedIDParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getIdQualifiedIDParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__IdAssignment_3"


    // $ANTLR start "rule__System__VersionAssignment_5"
    // InternalKiCool.g:5282:1: rule__System__VersionAssignment_5 : ( RULE_INT ) ;
    public final void rule__System__VersionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5286:1: ( ( RULE_INT ) )
            // InternalKiCool.g:5287:1: ( RULE_INT )
            {
            // InternalKiCool.g:5287:1: ( RULE_INT )
            // InternalKiCool.g:5288:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getVersionINTTerminalRuleCall_5_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getVersionINTTerminalRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__VersionAssignment_5"


    // $ANTLR start "rule__System__LabelAssignment_7"
    // InternalKiCool.g:5297:1: rule__System__LabelAssignment_7 : ( ruleEString ) ;
    public final void rule__System__LabelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5301:1: ( ( ruleEString ) )
            // InternalKiCool.g:5302:1: ( ruleEString )
            {
            // InternalKiCool.g:5302:1: ( ruleEString )
            // InternalKiCool.g:5303:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getLabelEStringParserRuleCall_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getLabelEStringParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__LabelAssignment_7"


    // $ANTLR start "rule__System__InputClassAssignment_8_1"
    // InternalKiCool.g:5312:1: rule__System__InputClassAssignment_8_1 : ( RULE_ID ) ;
    public final void rule__System__InputClassAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5316:1: ( ( RULE_ID ) )
            // InternalKiCool.g:5317:1: ( RULE_ID )
            {
            // InternalKiCool.g:5317:1: ( RULE_ID )
            // InternalKiCool.g:5318:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getInputClassIDTerminalRuleCall_8_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getInputClassIDTerminalRuleCall_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__InputClassAssignment_8_1"


    // $ANTLR start "rule__System__StartsetsAssignment_9_1"
    // InternalKiCool.g:5327:1: rule__System__StartsetsAssignment_9_1 : ( ruleKVPair ) ;
    public final void rule__System__StartsetsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5331:1: ( ( ruleKVPair ) )
            // InternalKiCool.g:5332:1: ( ruleKVPair )
            {
            // InternalKiCool.g:5332:1: ( ruleKVPair )
            // InternalKiCool.g:5333:1: ruleKVPair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getStartsetsKVPairParserRuleCall_9_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleKVPair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getStartsetsKVPairParserRuleCall_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__StartsetsAssignment_9_1"


    // $ANTLR start "rule__System__IntermediatesAssignment_10"
    // InternalKiCool.g:5342:1: rule__System__IntermediatesAssignment_10 : ( ruleIntermediateReference ) ;
    public final void rule__System__IntermediatesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5346:1: ( ( ruleIntermediateReference ) )
            // InternalKiCool.g:5347:1: ( ruleIntermediateReference )
            {
            // InternalKiCool.g:5347:1: ( ruleIntermediateReference )
            // InternalKiCool.g:5348:1: ruleIntermediateReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getIntermediatesIntermediateReferenceParserRuleCall_10_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleIntermediateReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getIntermediatesIntermediateReferenceParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__IntermediatesAssignment_10"


    // $ANTLR start "rule__System__ProcessorsAssignment_11"
    // InternalKiCool.g:5357:1: rule__System__ProcessorsAssignment_11 : ( ruleProcessorGroup ) ;
    public final void rule__System__ProcessorsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5361:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:5362:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:5362:1: ( ruleProcessorGroup )
            // InternalKiCool.g:5363:1: ruleProcessorGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getProcessorsProcessorGroupParserRuleCall_11_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProcessorGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getProcessorsProcessorGroupParserRuleCall_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ProcessorsAssignment_11"


    // $ANTLR start "rule__IntermediateReference__IdAssignment_1"
    // InternalKiCool.g:5372:1: rule__IntermediateReference__IdAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__IntermediateReference__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5376:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5377:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:5377:1: ( ruleQualifiedID )
            // InternalKiCool.g:5378:1: ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getIdQualifiedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntermediateReferenceAccess().getIdQualifiedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateReference__IdAssignment_1"


    // $ANTLR start "rule__IntermediateReference__AliasAssignment_2_1"
    // InternalKiCool.g:5387:1: rule__IntermediateReference__AliasAssignment_2_1 : ( ruleEString ) ;
    public final void rule__IntermediateReference__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5391:1: ( ( ruleEString ) )
            // InternalKiCool.g:5392:1: ( ruleEString )
            {
            // InternalKiCool.g:5392:1: ( ruleEString )
            // InternalKiCool.g:5393:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getAliasEStringParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntermediateReferenceAccess().getAliasEStringParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntermediateReference__AliasAssignment_2_1"


    // $ANTLR start "rule__ProcessorGroup__LabelAssignment_0_1"
    // InternalKiCool.g:5402:1: rule__ProcessorGroup__LabelAssignment_0_1 : ( ruleEString ) ;
    public final void rule__ProcessorGroup__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5406:1: ( ( ruleEString ) )
            // InternalKiCool.g:5407:1: ( ruleEString )
            {
            // InternalKiCool.g:5407:1: ( ruleEString )
            // InternalKiCool.g:5408:1: ruleEString
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
    // InternalKiCool.g:5417:1: rule__ProcessorGroup__ProcessorsAssignment_1_0 : ( ruleProcessor ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5421:1: ( ( ruleProcessor ) )
            // InternalKiCool.g:5422:1: ( ruleProcessor )
            {
            // InternalKiCool.g:5422:1: ( ruleProcessor )
            // InternalKiCool.g:5423:1: ruleProcessor
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
    // InternalKiCool.g:5432:1: rule__ProcessorGroup__ProcessorsAssignment_1_1_1 : ( ruleProcessorSystem ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5436:1: ( ( ruleProcessorSystem ) )
            // InternalKiCool.g:5437:1: ( ruleProcessorSystem )
            {
            // InternalKiCool.g:5437:1: ( ruleProcessorSystem )
            // InternalKiCool.g:5438:1: ruleProcessorSystem
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
    // InternalKiCool.g:5447:1: rule__ProcessorGroup__ProcessorsAssignment_1_2_1 : ( ruleProcessorAlternativeGroup ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5451:1: ( ( ruleProcessorAlternativeGroup ) )
            // InternalKiCool.g:5452:1: ( ruleProcessorAlternativeGroup )
            {
            // InternalKiCool.g:5452:1: ( ruleProcessorAlternativeGroup )
            // InternalKiCool.g:5453:1: ruleProcessorAlternativeGroup
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
    // InternalKiCool.g:5462:1: rule__ProcessorGroup__ProcessorsAssignment_1_3_1 : ( ruleProcessorGroup ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5466:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:5467:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:5467:1: ( ruleProcessorGroup )
            // InternalKiCool.g:5468:1: ruleProcessorGroup
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


    // $ANTLR start "rule__Processor__PresetsAssignment_0_2"
    // InternalKiCool.g:5477:1: rule__Processor__PresetsAssignment_0_2 : ( ruleKVPair ) ;
    public final void rule__Processor__PresetsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5481:1: ( ( ruleKVPair ) )
            // InternalKiCool.g:5482:1: ( ruleKVPair )
            {
            // InternalKiCool.g:5482:1: ( ruleKVPair )
            // InternalKiCool.g:5483:1: ruleKVPair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPresetsKVPairParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleKVPair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPresetsKVPairParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__PresetsAssignment_0_2"


    // $ANTLR start "rule__Processor__PreprocessesAssignment_1_2"
    // InternalKiCool.g:5492:1: rule__Processor__PreprocessesAssignment_1_2 : ( ruleCoProcessor ) ;
    public final void rule__Processor__PreprocessesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5496:1: ( ( ruleCoProcessor ) )
            // InternalKiCool.g:5497:1: ( ruleCoProcessor )
            {
            // InternalKiCool.g:5497:1: ( ruleCoProcessor )
            // InternalKiCool.g:5498:1: ruleCoProcessor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPreprocessesCoProcessorParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCoProcessor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPreprocessesCoProcessorParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__PreprocessesAssignment_1_2"


    // $ANTLR start "rule__Processor__IdAssignment_2"
    // InternalKiCool.g:5507:1: rule__Processor__IdAssignment_2 : ( ruleQualifiedID ) ;
    public final void rule__Processor__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5511:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5512:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:5512:1: ( ruleQualifiedID )
            // InternalKiCool.g:5513:1: ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getIdQualifiedIDParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getIdQualifiedIDParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__IdAssignment_2"


    // $ANTLR start "rule__Processor__MetricAssignment_3_1"
    // InternalKiCool.g:5522:1: rule__Processor__MetricAssignment_3_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Processor__MetricAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5526:1: ( ( ( ruleQualifiedID ) ) )
            // InternalKiCool.g:5527:1: ( ( ruleQualifiedID ) )
            {
            // InternalKiCool.g:5527:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5528:1: ( ruleQualifiedID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getMetricIntermediateReferenceCrossReference_3_1_0()); 
            }
            // InternalKiCool.g:5529:1: ( ruleQualifiedID )
            // InternalKiCool.g:5530:1: ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getMetricIntermediateReferenceQualifiedIDParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getMetricIntermediateReferenceQualifiedIDParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getMetricIntermediateReferenceCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__MetricAssignment_3_1"


    // $ANTLR start "rule__Processor__PostprocessesAssignment_4_2"
    // InternalKiCool.g:5541:1: rule__Processor__PostprocessesAssignment_4_2 : ( ruleCoProcessor ) ;
    public final void rule__Processor__PostprocessesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5545:1: ( ( ruleCoProcessor ) )
            // InternalKiCool.g:5546:1: ( ruleCoProcessor )
            {
            // InternalKiCool.g:5546:1: ( ruleCoProcessor )
            // InternalKiCool.g:5547:1: ruleCoProcessor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPostprocessesCoProcessorParserRuleCall_4_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCoProcessor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPostprocessesCoProcessorParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__PostprocessesAssignment_4_2"


    // $ANTLR start "rule__Processor__PostsetsAssignment_5_2"
    // InternalKiCool.g:5556:1: rule__Processor__PostsetsAssignment_5_2 : ( ruleKVPair ) ;
    public final void rule__Processor__PostsetsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5560:1: ( ( ruleKVPair ) )
            // InternalKiCool.g:5561:1: ( ruleKVPair )
            {
            // InternalKiCool.g:5561:1: ( ruleKVPair )
            // InternalKiCool.g:5562:1: ruleKVPair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPostsetsKVPairParserRuleCall_5_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleKVPair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getPostsetsKVPairParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Processor__PostsetsAssignment_5_2"


    // $ANTLR start "rule__CoProcessor__IdAssignment_0"
    // InternalKiCool.g:5571:1: rule__CoProcessor__IdAssignment_0 : ( ruleQualifiedID ) ;
    public final void rule__CoProcessor__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5575:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5576:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:5576:1: ( ruleQualifiedID )
            // InternalKiCool.g:5577:1: ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoProcessorAccess().getIdQualifiedIDParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCoProcessorAccess().getIdQualifiedIDParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoProcessor__IdAssignment_0"


    // $ANTLR start "rule__CoProcessor__SilentAssignment_1"
    // InternalKiCool.g:5586:1: rule__CoProcessor__SilentAssignment_1 : ( ( 'silent' ) ) ;
    public final void rule__CoProcessor__SilentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5590:1: ( ( ( 'silent' ) ) )
            // InternalKiCool.g:5591:1: ( ( 'silent' ) )
            {
            // InternalKiCool.g:5591:1: ( ( 'silent' ) )
            // InternalKiCool.g:5592:1: ( 'silent' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoProcessorAccess().getSilentSilentKeyword_1_0()); 
            }
            // InternalKiCool.g:5593:1: ( 'silent' )
            // InternalKiCool.g:5594:1: 'silent'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoProcessorAccess().getSilentSilentKeyword_1_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCoProcessorAccess().getSilentSilentKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCoProcessorAccess().getSilentSilentKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoProcessor__SilentAssignment_1"


    // $ANTLR start "rule__ProcessorSystem__IdAssignment"
    // InternalKiCool.g:5609:1: rule__ProcessorSystem__IdAssignment : ( ruleQualifiedID ) ;
    public final void rule__ProcessorSystem__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5613:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5614:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:5614:1: ( ruleQualifiedID )
            // InternalKiCool.g:5615:1: ruleQualifiedID
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
    // InternalKiCool.g:5624:1: rule__ProcessorAlternativeGroup__LabelAssignment_0_1 : ( ruleEString ) ;
    public final void rule__ProcessorAlternativeGroup__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5628:1: ( ( ruleEString ) )
            // InternalKiCool.g:5629:1: ( ruleEString )
            {
            // InternalKiCool.g:5629:1: ( ruleEString )
            // InternalKiCool.g:5630:1: ruleEString
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
    // InternalKiCool.g:5639:1: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 : ( ruleProcessorGroup ) ;
    public final void rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5643:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:5644:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:5644:1: ( ruleProcessorGroup )
            // InternalKiCool.g:5645:1: ruleProcessorGroup
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
    // InternalKiCool.g:5654:1: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 : ( ruleProcessorGroup ) ;
    public final void rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5658:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:5659:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:5659:1: ( ruleProcessorGroup )
            // InternalKiCool.g:5660:1: ruleProcessorGroup
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
    // InternalKiCool.g:5669:1: rule__KVPair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KVPair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5673:1: ( ( ruleEString ) )
            // InternalKiCool.g:5674:1: ( ruleEString )
            {
            // InternalKiCool.g:5674:1: ( ruleEString )
            // InternalKiCool.g:5675:1: ruleEString
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
    // InternalKiCool.g:5684:1: rule__KVPair__IsKeyValueAssignment_1 : ( ( 'key' ) ) ;
    public final void rule__KVPair__IsKeyValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5688:1: ( ( ( 'key' ) ) )
            // InternalKiCool.g:5689:1: ( ( 'key' ) )
            {
            // InternalKiCool.g:5689:1: ( ( 'key' ) )
            // InternalKiCool.g:5690:1: ( 'key' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getIsKeyValueKeyKeyword_1_0()); 
            }
            // InternalKiCool.g:5691:1: ( 'key' )
            // InternalKiCool.g:5692:1: 'key'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getIsKeyValueKeyKeyword_1_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:5707:1: rule__KVPair__ValueAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KVPair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5711:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5712:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5712:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5713:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5722:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5726:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalKiCool.g:5727:1: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalKiCool.g:5727:1: ( RULE_COMMENT_ANNOTATION )
            // InternalKiCool.g:5728:1: RULE_COMMENT_ANNOTATION
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
    // InternalKiCool.g:5738:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5742:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5743:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5743:1: ( ruleExtendedID )
            // InternalKiCool.g:5744:1: ruleExtendedID
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


    // $ANTLR start "rule__PragmaTag__NameAssignment_1"
    // InternalKiCool.g:5753:1: rule__PragmaTag__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__PragmaTag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5757:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5758:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5758:1: ( ruleExtendedID )
            // InternalKiCool.g:5759:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPragmaTagAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PragmaTag__NameAssignment_1"


    // $ANTLR start "rule__KeyStringValueAnnotation__NameAssignment_1"
    // InternalKiCool.g:5768:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5772:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5773:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5773:1: ( ruleExtendedID )
            // InternalKiCool.g:5774:1: ruleExtendedID
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
    // InternalKiCool.g:5783:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5787:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5788:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5788:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5789:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5798:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5802:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5803:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5803:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5804:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5813:1: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5817:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5818:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5818:1: ( ruleExtendedID )
            // InternalKiCool.g:5819:1: ruleExtendedID
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
    // InternalKiCool.g:5828:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5832:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5833:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5833:1: ( ruleEStringBoolean )
            // InternalKiCool.g:5834:1: ruleEStringBoolean
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
    // InternalKiCool.g:5843:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5847:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5848:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5848:1: ( ruleEStringBoolean )
            // InternalKiCool.g:5849:1: ruleEStringBoolean
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


    // $ANTLR start "rule__StringPragma__NameAssignment_1"
    // InternalKiCool.g:5858:1: rule__StringPragma__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__StringPragma__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5862:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5863:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5863:1: ( ruleExtendedID )
            // InternalKiCool.g:5864:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__NameAssignment_1"


    // $ANTLR start "rule__StringPragma__ValuesAssignment_2"
    // InternalKiCool.g:5873:1: rule__StringPragma__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5877:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5878:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5878:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5879:1: ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__ValuesAssignment_2"


    // $ANTLR start "rule__StringPragma__ValuesAssignment_3_1"
    // InternalKiCool.g:5888:1: rule__StringPragma__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5892:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5893:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5893:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5894:1: ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPragma__ValuesAssignment_3_1"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__NameAssignment_1"
    // InternalKiCool.g:5903:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5907:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5908:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5908:1: ( ruleExtendedID )
            // InternalKiCool.g:5909:1: ruleExtendedID
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
    // InternalKiCool.g:5918:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5922:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5923:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5923:1: ( ruleExtendedID )
            // InternalKiCool.g:5924:1: ruleExtendedID
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
    // InternalKiCool.g:5933:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5937:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5938:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5938:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5939:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5948:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5952:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5953:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5953:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5954:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5963:1: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5967:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5968:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5968:1: ( ruleExtendedID )
            // InternalKiCool.g:5969:1: ruleExtendedID
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
    // InternalKiCool.g:5978:1: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5982:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5983:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5983:1: ( ruleExtendedID )
            // InternalKiCool.g:5984:1: ruleExtendedID
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
    // InternalKiCool.g:5993:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5997:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5998:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5998:1: ( ruleEStringBoolean )
            // InternalKiCool.g:5999:1: ruleEStringBoolean
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
    // InternalKiCool.g:6008:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:6012:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:6013:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:6013:1: ( ruleEStringBoolean )
            // InternalKiCool.g:6014:1: ruleEStringBoolean
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
    // InternalKiCool.g:6023:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:6027:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:6028:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:6028:1: ( ruleExtendedID )
            // InternalKiCool.g:6029:1: ruleExtendedID
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
    // InternalKiCool.g:6038:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:6042:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:6043:1: ( RULE_STRING )
            {
            // InternalKiCool.g:6043:1: ( RULE_STRING )
            // InternalKiCool.g:6044:1: RULE_STRING
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
    // InternalKiCool.g:6053:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:6057:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:6058:1: ( RULE_STRING )
            {
            // InternalKiCool.g:6058:1: ( RULE_STRING )
            // InternalKiCool.g:6059:1: RULE_STRING
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
    // InternalKiCool.g:6068:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:6072:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:6073:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:6073:1: ( ruleExtendedID )
            // InternalKiCool.g:6074:1: ruleExtendedID
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
    // InternalKiCool.g:6083:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:6087:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:6088:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:6088:1: ( ruleExtendedID )
            // InternalKiCool.g:6089:1: ruleExtendedID
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
    // InternalKiCool.g:6098:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:6102:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:6103:1: ( RULE_STRING )
            {
            // InternalKiCool.g:6103:1: ( RULE_STRING )
            // InternalKiCool.g:6104:1: RULE_STRING
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
    // InternalKiCool.g:6113:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:6117:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:6118:1: ( RULE_STRING )
            {
            // InternalKiCool.g:6118:1: ( RULE_STRING )
            // InternalKiCool.g:6119:1: RULE_STRING
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
        // InternalKiCool.g:794:6: ( ( ( rule__ProcessorGroup__Group_1_2__0 ) ) )
        // InternalKiCool.g:794:6: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
        {
        // InternalKiCool.g:794:6: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
        // InternalKiCool.g:795:1: ( rule__ProcessorGroup__Group_1_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getProcessorGroupAccess().getGroup_1_2()); 
        }
        // InternalKiCool.g:796:1: ( rule__ProcessorGroup__Group_1_2__0 )
        // InternalKiCool.g:796:2: rule__ProcessorGroup__Group_1_2__0
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

    // $ANTLR start synpred26_InternalKiCool
    public final void synpred26_InternalKiCool_fragment() throws RecognitionException {   
        // InternalKiCool.g:2692:2: ( rule__ProcessorAlternativeGroup__Group_0__0 )
        // InternalKiCool.g:2692:2: rule__ProcessorAlternativeGroup__Group_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__ProcessorAlternativeGroup__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalKiCool

    // Delegated rules

    public final boolean synpred26_InternalKiCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalKiCool_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800040000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000AF40040L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000AF40042L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020800000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000020000201F0L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100030000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000030002L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000020080L});
    }


}