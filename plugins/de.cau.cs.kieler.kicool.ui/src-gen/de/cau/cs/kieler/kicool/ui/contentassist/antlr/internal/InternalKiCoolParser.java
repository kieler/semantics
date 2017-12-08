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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT_ANNOTATION", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'-'", "'system'", "'version'", "'label'", "'input'", "'set'", "'intermediate'", "'alias'", "'['", "']'", "'pre'", "'process'", "'post'", "'|'", "'@'", "'#'", "','", "'silent'", "'key'"
    };
    public static final int RULE_COMMENT_ANNOTATION=9;
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int RULE_SL_COMMENT_ANNOTATION=11;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
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

                if ( (LA4_4==RULE_FLOAT) ) {
                    alt4=5;
                }
                else if ( (LA4_4==RULE_INT) ) {
                    alt4=4;
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
    // InternalKiCool.g:946:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:950:1: ( ( 'system' ) )
            // InternalKiCool.g:951:1: ( 'system' )
            {
            // InternalKiCool.g:951:1: ( 'system' )
            // InternalKiCool.g:952:1: 'system'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:965:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:969:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalKiCool.g:970:2: rule__System__Group__1__Impl rule__System__Group__2
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
    // InternalKiCool.g:977:1: rule__System__Group__1__Impl : ( ( rule__System__IdAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:981:1: ( ( ( rule__System__IdAssignment_1 ) ) )
            // InternalKiCool.g:982:1: ( ( rule__System__IdAssignment_1 ) )
            {
            // InternalKiCool.g:982:1: ( ( rule__System__IdAssignment_1 ) )
            // InternalKiCool.g:983:1: ( rule__System__IdAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getIdAssignment_1()); 
            }
            // InternalKiCool.g:984:1: ( rule__System__IdAssignment_1 )
            // InternalKiCool.g:984:2: rule__System__IdAssignment_1
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
    // InternalKiCool.g:994:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:998:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalKiCool.g:999:2: rule__System__Group__2__Impl rule__System__Group__3
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
    // InternalKiCool.g:1006:1: rule__System__Group__2__Impl : ( 'version' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1010:1: ( ( 'version' ) )
            // InternalKiCool.g:1011:1: ( 'version' )
            {
            // InternalKiCool.g:1011:1: ( 'version' )
            // InternalKiCool.g:1012:1: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getVersionKeyword_2()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:1025:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1029:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalKiCool.g:1030:2: rule__System__Group__3__Impl rule__System__Group__4
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
    // InternalKiCool.g:1037:1: rule__System__Group__3__Impl : ( ( rule__System__VersionAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1041:1: ( ( ( rule__System__VersionAssignment_3 ) ) )
            // InternalKiCool.g:1042:1: ( ( rule__System__VersionAssignment_3 ) )
            {
            // InternalKiCool.g:1042:1: ( ( rule__System__VersionAssignment_3 ) )
            // InternalKiCool.g:1043:1: ( rule__System__VersionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getVersionAssignment_3()); 
            }
            // InternalKiCool.g:1044:1: ( rule__System__VersionAssignment_3 )
            // InternalKiCool.g:1044:2: rule__System__VersionAssignment_3
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
    // InternalKiCool.g:1054:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1058:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalKiCool.g:1059:2: rule__System__Group__4__Impl rule__System__Group__5
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
    // InternalKiCool.g:1066:1: rule__System__Group__4__Impl : ( 'label' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1070:1: ( ( 'label' ) )
            // InternalKiCool.g:1071:1: ( 'label' )
            {
            // InternalKiCool.g:1071:1: ( 'label' )
            // InternalKiCool.g:1072:1: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getLabelKeyword_4()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:1085:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1089:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // InternalKiCool.g:1090:2: rule__System__Group__5__Impl rule__System__Group__6
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
    // InternalKiCool.g:1097:1: rule__System__Group__5__Impl : ( ( rule__System__LabelAssignment_5 ) ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1101:1: ( ( ( rule__System__LabelAssignment_5 ) ) )
            // InternalKiCool.g:1102:1: ( ( rule__System__LabelAssignment_5 ) )
            {
            // InternalKiCool.g:1102:1: ( ( rule__System__LabelAssignment_5 ) )
            // InternalKiCool.g:1103:1: ( rule__System__LabelAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getLabelAssignment_5()); 
            }
            // InternalKiCool.g:1104:1: ( rule__System__LabelAssignment_5 )
            // InternalKiCool.g:1104:2: rule__System__LabelAssignment_5
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
    // InternalKiCool.g:1114:1: rule__System__Group__6 : rule__System__Group__6__Impl rule__System__Group__7 ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1118:1: ( rule__System__Group__6__Impl rule__System__Group__7 )
            // InternalKiCool.g:1119:2: rule__System__Group__6__Impl rule__System__Group__7
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
    // InternalKiCool.g:1126:1: rule__System__Group__6__Impl : ( ( rule__System__Group_6__0 )? ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1130:1: ( ( ( rule__System__Group_6__0 )? ) )
            // InternalKiCool.g:1131:1: ( ( rule__System__Group_6__0 )? )
            {
            // InternalKiCool.g:1131:1: ( ( rule__System__Group_6__0 )? )
            // InternalKiCool.g:1132:1: ( rule__System__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getGroup_6()); 
            }
            // InternalKiCool.g:1133:1: ( rule__System__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKiCool.g:1133:2: rule__System__Group_6__0
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
    // InternalKiCool.g:1143:1: rule__System__Group__7 : rule__System__Group__7__Impl rule__System__Group__8 ;
    public final void rule__System__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1147:1: ( rule__System__Group__7__Impl rule__System__Group__8 )
            // InternalKiCool.g:1148:2: rule__System__Group__7__Impl rule__System__Group__8
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
    // InternalKiCool.g:1155:1: rule__System__Group__7__Impl : ( ( rule__System__Group_7__0 )* ) ;
    public final void rule__System__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1159:1: ( ( ( rule__System__Group_7__0 )* ) )
            // InternalKiCool.g:1160:1: ( ( rule__System__Group_7__0 )* )
            {
            // InternalKiCool.g:1160:1: ( ( rule__System__Group_7__0 )* )
            // InternalKiCool.g:1161:1: ( rule__System__Group_7__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getGroup_7()); 
            }
            // InternalKiCool.g:1162:1: ( rule__System__Group_7__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKiCool.g:1162:2: rule__System__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__System__Group_7__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getGroup_7()); 
            }

            }


            }

        }
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
            pushFollow(FollowSets000.FOLLOW_8);
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
    // InternalKiCool.g:1184:1: rule__System__Group__8__Impl : ( ( rule__System__IntermediatesAssignment_8 )* ) ;
    public final void rule__System__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1188:1: ( ( ( rule__System__IntermediatesAssignment_8 )* ) )
            // InternalKiCool.g:1189:1: ( ( rule__System__IntermediatesAssignment_8 )* )
            {
            // InternalKiCool.g:1189:1: ( ( rule__System__IntermediatesAssignment_8 )* )
            // InternalKiCool.g:1190:1: ( rule__System__IntermediatesAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getIntermediatesAssignment_8()); 
            }
            // InternalKiCool.g:1191:1: ( rule__System__IntermediatesAssignment_8 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKiCool.g:1191:2: rule__System__IntermediatesAssignment_8
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__System__IntermediatesAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getIntermediatesAssignment_8()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:1201:1: rule__System__Group__9 : rule__System__Group__9__Impl ;
    public final void rule__System__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1205:1: ( rule__System__Group__9__Impl )
            // InternalKiCool.g:1206:2: rule__System__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKiCool.g:1212:1: rule__System__Group__9__Impl : ( ( rule__System__ProcessorsAssignment_9 ) ) ;
    public final void rule__System__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1216:1: ( ( ( rule__System__ProcessorsAssignment_9 ) ) )
            // InternalKiCool.g:1217:1: ( ( rule__System__ProcessorsAssignment_9 ) )
            {
            // InternalKiCool.g:1217:1: ( ( rule__System__ProcessorsAssignment_9 ) )
            // InternalKiCool.g:1218:1: ( rule__System__ProcessorsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getProcessorsAssignment_9()); 
            }
            // InternalKiCool.g:1219:1: ( rule__System__ProcessorsAssignment_9 )
            // InternalKiCool.g:1219:2: rule__System__ProcessorsAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__ProcessorsAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getProcessorsAssignment_9()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__System__Group_6__0"
    // InternalKiCool.g:1249:1: rule__System__Group_6__0 : rule__System__Group_6__0__Impl rule__System__Group_6__1 ;
    public final void rule__System__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1253:1: ( rule__System__Group_6__0__Impl rule__System__Group_6__1 )
            // InternalKiCool.g:1254:2: rule__System__Group_6__0__Impl rule__System__Group_6__1
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
    // InternalKiCool.g:1261:1: rule__System__Group_6__0__Impl : ( 'input' ) ;
    public final void rule__System__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1265:1: ( ( 'input' ) )
            // InternalKiCool.g:1266:1: ( 'input' )
            {
            // InternalKiCool.g:1266:1: ( 'input' )
            // InternalKiCool.g:1267:1: 'input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getInputKeyword_6_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:1280:1: rule__System__Group_6__1 : rule__System__Group_6__1__Impl ;
    public final void rule__System__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1284:1: ( rule__System__Group_6__1__Impl )
            // InternalKiCool.g:1285:2: rule__System__Group_6__1__Impl
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
    // InternalKiCool.g:1291:1: rule__System__Group_6__1__Impl : ( ( rule__System__InputClassAssignment_6_1 ) ) ;
    public final void rule__System__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1295:1: ( ( ( rule__System__InputClassAssignment_6_1 ) ) )
            // InternalKiCool.g:1296:1: ( ( rule__System__InputClassAssignment_6_1 ) )
            {
            // InternalKiCool.g:1296:1: ( ( rule__System__InputClassAssignment_6_1 ) )
            // InternalKiCool.g:1297:1: ( rule__System__InputClassAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getInputClassAssignment_6_1()); 
            }
            // InternalKiCool.g:1298:1: ( rule__System__InputClassAssignment_6_1 )
            // InternalKiCool.g:1298:2: rule__System__InputClassAssignment_6_1
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


    // $ANTLR start "rule__System__Group_7__0"
    // InternalKiCool.g:1312:1: rule__System__Group_7__0 : rule__System__Group_7__0__Impl rule__System__Group_7__1 ;
    public final void rule__System__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1316:1: ( rule__System__Group_7__0__Impl rule__System__Group_7__1 )
            // InternalKiCool.g:1317:2: rule__System__Group_7__0__Impl rule__System__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__System__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__0"


    // $ANTLR start "rule__System__Group_7__0__Impl"
    // InternalKiCool.g:1324:1: rule__System__Group_7__0__Impl : ( 'set' ) ;
    public final void rule__System__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1328:1: ( ( 'set' ) )
            // InternalKiCool.g:1329:1: ( 'set' )
            {
            // InternalKiCool.g:1329:1: ( 'set' )
            // InternalKiCool.g:1330:1: 'set'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getSetKeyword_7_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getSetKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__0__Impl"


    // $ANTLR start "rule__System__Group_7__1"
    // InternalKiCool.g:1343:1: rule__System__Group_7__1 : rule__System__Group_7__1__Impl ;
    public final void rule__System__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1347:1: ( rule__System__Group_7__1__Impl )
            // InternalKiCool.g:1348:2: rule__System__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__1"


    // $ANTLR start "rule__System__Group_7__1__Impl"
    // InternalKiCool.g:1354:1: rule__System__Group_7__1__Impl : ( ( rule__System__StartsetsAssignment_7_1 ) ) ;
    public final void rule__System__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1358:1: ( ( ( rule__System__StartsetsAssignment_7_1 ) ) )
            // InternalKiCool.g:1359:1: ( ( rule__System__StartsetsAssignment_7_1 ) )
            {
            // InternalKiCool.g:1359:1: ( ( rule__System__StartsetsAssignment_7_1 ) )
            // InternalKiCool.g:1360:1: ( rule__System__StartsetsAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getStartsetsAssignment_7_1()); 
            }
            // InternalKiCool.g:1361:1: ( rule__System__StartsetsAssignment_7_1 )
            // InternalKiCool.g:1361:2: rule__System__StartsetsAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__System__StartsetsAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getStartsetsAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_7__1__Impl"


    // $ANTLR start "rule__IntermediateReference__Group__0"
    // InternalKiCool.g:1375:1: rule__IntermediateReference__Group__0 : rule__IntermediateReference__Group__0__Impl rule__IntermediateReference__Group__1 ;
    public final void rule__IntermediateReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1379:1: ( rule__IntermediateReference__Group__0__Impl rule__IntermediateReference__Group__1 )
            // InternalKiCool.g:1380:2: rule__IntermediateReference__Group__0__Impl rule__IntermediateReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKiCool.g:1387:1: rule__IntermediateReference__Group__0__Impl : ( 'intermediate' ) ;
    public final void rule__IntermediateReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1391:1: ( ( 'intermediate' ) )
            // InternalKiCool.g:1392:1: ( 'intermediate' )
            {
            // InternalKiCool.g:1392:1: ( 'intermediate' )
            // InternalKiCool.g:1393:1: 'intermediate'
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
    // InternalKiCool.g:1406:1: rule__IntermediateReference__Group__1 : rule__IntermediateReference__Group__1__Impl rule__IntermediateReference__Group__2 ;
    public final void rule__IntermediateReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1410:1: ( rule__IntermediateReference__Group__1__Impl rule__IntermediateReference__Group__2 )
            // InternalKiCool.g:1411:2: rule__IntermediateReference__Group__1__Impl rule__IntermediateReference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
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
    // InternalKiCool.g:1418:1: rule__IntermediateReference__Group__1__Impl : ( ( rule__IntermediateReference__IdAssignment_1 ) ) ;
    public final void rule__IntermediateReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1422:1: ( ( ( rule__IntermediateReference__IdAssignment_1 ) ) )
            // InternalKiCool.g:1423:1: ( ( rule__IntermediateReference__IdAssignment_1 ) )
            {
            // InternalKiCool.g:1423:1: ( ( rule__IntermediateReference__IdAssignment_1 ) )
            // InternalKiCool.g:1424:1: ( rule__IntermediateReference__IdAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getIdAssignment_1()); 
            }
            // InternalKiCool.g:1425:1: ( rule__IntermediateReference__IdAssignment_1 )
            // InternalKiCool.g:1425:2: rule__IntermediateReference__IdAssignment_1
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
    // InternalKiCool.g:1435:1: rule__IntermediateReference__Group__2 : rule__IntermediateReference__Group__2__Impl ;
    public final void rule__IntermediateReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1439:1: ( rule__IntermediateReference__Group__2__Impl )
            // InternalKiCool.g:1440:2: rule__IntermediateReference__Group__2__Impl
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
    // InternalKiCool.g:1446:1: rule__IntermediateReference__Group__2__Impl : ( ( rule__IntermediateReference__Group_2__0 )? ) ;
    public final void rule__IntermediateReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1450:1: ( ( ( rule__IntermediateReference__Group_2__0 )? ) )
            // InternalKiCool.g:1451:1: ( ( rule__IntermediateReference__Group_2__0 )? )
            {
            // InternalKiCool.g:1451:1: ( ( rule__IntermediateReference__Group_2__0 )? )
            // InternalKiCool.g:1452:1: ( rule__IntermediateReference__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getGroup_2()); 
            }
            // InternalKiCool.g:1453:1: ( rule__IntermediateReference__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKiCool.g:1453:2: rule__IntermediateReference__Group_2__0
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
    // InternalKiCool.g:1469:1: rule__IntermediateReference__Group_2__0 : rule__IntermediateReference__Group_2__0__Impl rule__IntermediateReference__Group_2__1 ;
    public final void rule__IntermediateReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1473:1: ( rule__IntermediateReference__Group_2__0__Impl rule__IntermediateReference__Group_2__1 )
            // InternalKiCool.g:1474:2: rule__IntermediateReference__Group_2__0__Impl rule__IntermediateReference__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKiCool.g:1481:1: rule__IntermediateReference__Group_2__0__Impl : ( 'alias' ) ;
    public final void rule__IntermediateReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1485:1: ( ( 'alias' ) )
            // InternalKiCool.g:1486:1: ( 'alias' )
            {
            // InternalKiCool.g:1486:1: ( 'alias' )
            // InternalKiCool.g:1487:1: 'alias'
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
    // InternalKiCool.g:1500:1: rule__IntermediateReference__Group_2__1 : rule__IntermediateReference__Group_2__1__Impl ;
    public final void rule__IntermediateReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1504:1: ( rule__IntermediateReference__Group_2__1__Impl )
            // InternalKiCool.g:1505:2: rule__IntermediateReference__Group_2__1__Impl
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
    // InternalKiCool.g:1511:1: rule__IntermediateReference__Group_2__1__Impl : ( ( rule__IntermediateReference__AliasAssignment_2_1 ) ) ;
    public final void rule__IntermediateReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1515:1: ( ( ( rule__IntermediateReference__AliasAssignment_2_1 ) ) )
            // InternalKiCool.g:1516:1: ( ( rule__IntermediateReference__AliasAssignment_2_1 ) )
            {
            // InternalKiCool.g:1516:1: ( ( rule__IntermediateReference__AliasAssignment_2_1 ) )
            // InternalKiCool.g:1517:1: ( rule__IntermediateReference__AliasAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getAliasAssignment_2_1()); 
            }
            // InternalKiCool.g:1518:1: ( rule__IntermediateReference__AliasAssignment_2_1 )
            // InternalKiCool.g:1518:2: rule__IntermediateReference__AliasAssignment_2_1
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
    // InternalKiCool.g:1532:1: rule__ProcessorGroup__Group__0 : rule__ProcessorGroup__Group__0__Impl rule__ProcessorGroup__Group__1 ;
    public final void rule__ProcessorGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1536:1: ( rule__ProcessorGroup__Group__0__Impl rule__ProcessorGroup__Group__1 )
            // InternalKiCool.g:1537:2: rule__ProcessorGroup__Group__0__Impl rule__ProcessorGroup__Group__1
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
    // InternalKiCool.g:1544:1: rule__ProcessorGroup__Group__0__Impl : ( ( rule__ProcessorGroup__Group_0__0 )? ) ;
    public final void rule__ProcessorGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1548:1: ( ( ( rule__ProcessorGroup__Group_0__0 )? ) )
            // InternalKiCool.g:1549:1: ( ( rule__ProcessorGroup__Group_0__0 )? )
            {
            // InternalKiCool.g:1549:1: ( ( rule__ProcessorGroup__Group_0__0 )? )
            // InternalKiCool.g:1550:1: ( rule__ProcessorGroup__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getGroup_0()); 
            }
            // InternalKiCool.g:1551:1: ( rule__ProcessorGroup__Group_0__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKiCool.g:1551:2: rule__ProcessorGroup__Group_0__0
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
    // InternalKiCool.g:1561:1: rule__ProcessorGroup__Group__1 : rule__ProcessorGroup__Group__1__Impl ;
    public final void rule__ProcessorGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1565:1: ( rule__ProcessorGroup__Group__1__Impl )
            // InternalKiCool.g:1566:2: rule__ProcessorGroup__Group__1__Impl
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
    // InternalKiCool.g:1572:1: rule__ProcessorGroup__Group__1__Impl : ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) ) ;
    public final void rule__ProcessorGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1576:1: ( ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) ) )
            // InternalKiCool.g:1577:1: ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) )
            {
            // InternalKiCool.g:1577:1: ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) )
            // InternalKiCool.g:1578:1: ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* )
            {
            // InternalKiCool.g:1578:1: ( ( rule__ProcessorGroup__Alternatives_1 ) )
            // InternalKiCool.g:1579:1: ( rule__ProcessorGroup__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getAlternatives_1()); 
            }
            // InternalKiCool.g:1580:1: ( rule__ProcessorGroup__Alternatives_1 )
            // InternalKiCool.g:1580:2: rule__ProcessorGroup__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__ProcessorGroup__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorGroupAccess().getAlternatives_1()); 
            }

            }

            // InternalKiCool.g:1583:1: ( ( rule__ProcessorGroup__Alternatives_1 )* )
            // InternalKiCool.g:1584:1: ( rule__ProcessorGroup__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getAlternatives_1()); 
            }
            // InternalKiCool.g:1585:1: ( rule__ProcessorGroup__Alternatives_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==18||LA11_0==25||LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKiCool.g:1585:2: rule__ProcessorGroup__Alternatives_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__ProcessorGroup__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalKiCool.g:1600:1: rule__ProcessorGroup__Group_0__0 : rule__ProcessorGroup__Group_0__0__Impl rule__ProcessorGroup__Group_0__1 ;
    public final void rule__ProcessorGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1604:1: ( rule__ProcessorGroup__Group_0__0__Impl rule__ProcessorGroup__Group_0__1 )
            // InternalKiCool.g:1605:2: rule__ProcessorGroup__Group_0__0__Impl rule__ProcessorGroup__Group_0__1
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
    // InternalKiCool.g:1612:1: rule__ProcessorGroup__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__ProcessorGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1616:1: ( ( 'label' ) )
            // InternalKiCool.g:1617:1: ( 'label' )
            {
            // InternalKiCool.g:1617:1: ( 'label' )
            // InternalKiCool.g:1618:1: 'label'
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
    // InternalKiCool.g:1631:1: rule__ProcessorGroup__Group_0__1 : rule__ProcessorGroup__Group_0__1__Impl ;
    public final void rule__ProcessorGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1635:1: ( rule__ProcessorGroup__Group_0__1__Impl )
            // InternalKiCool.g:1636:2: rule__ProcessorGroup__Group_0__1__Impl
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
    // InternalKiCool.g:1642:1: rule__ProcessorGroup__Group_0__1__Impl : ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) ) ;
    public final void rule__ProcessorGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1646:1: ( ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) ) )
            // InternalKiCool.g:1647:1: ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) )
            {
            // InternalKiCool.g:1647:1: ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) )
            // InternalKiCool.g:1648:1: ( rule__ProcessorGroup__LabelAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getLabelAssignment_0_1()); 
            }
            // InternalKiCool.g:1649:1: ( rule__ProcessorGroup__LabelAssignment_0_1 )
            // InternalKiCool.g:1649:2: rule__ProcessorGroup__LabelAssignment_0_1
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
    // InternalKiCool.g:1663:1: rule__ProcessorGroup__Group_1_1__0 : rule__ProcessorGroup__Group_1_1__0__Impl rule__ProcessorGroup__Group_1_1__1 ;
    public final void rule__ProcessorGroup__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1667:1: ( rule__ProcessorGroup__Group_1_1__0__Impl rule__ProcessorGroup__Group_1_1__1 )
            // InternalKiCool.g:1668:2: rule__ProcessorGroup__Group_1_1__0__Impl rule__ProcessorGroup__Group_1_1__1
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
    // InternalKiCool.g:1675:1: rule__ProcessorGroup__Group_1_1__0__Impl : ( 'system' ) ;
    public final void rule__ProcessorGroup__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1679:1: ( ( 'system' ) )
            // InternalKiCool.g:1680:1: ( 'system' )
            {
            // InternalKiCool.g:1680:1: ( 'system' )
            // InternalKiCool.g:1681:1: 'system'
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
    // InternalKiCool.g:1694:1: rule__ProcessorGroup__Group_1_1__1 : rule__ProcessorGroup__Group_1_1__1__Impl ;
    public final void rule__ProcessorGroup__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1698:1: ( rule__ProcessorGroup__Group_1_1__1__Impl )
            // InternalKiCool.g:1699:2: rule__ProcessorGroup__Group_1_1__1__Impl
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
    // InternalKiCool.g:1705:1: rule__ProcessorGroup__Group_1_1__1__Impl : ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) ) ;
    public final void rule__ProcessorGroup__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1709:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) ) )
            // InternalKiCool.g:1710:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) )
            {
            // InternalKiCool.g:1710:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) )
            // InternalKiCool.g:1711:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_1_1()); 
            }
            // InternalKiCool.g:1712:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 )
            // InternalKiCool.g:1712:2: rule__ProcessorGroup__ProcessorsAssignment_1_1_1
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
    // InternalKiCool.g:1726:1: rule__ProcessorGroup__Group_1_2__0 : rule__ProcessorGroup__Group_1_2__0__Impl rule__ProcessorGroup__Group_1_2__1 ;
    public final void rule__ProcessorGroup__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1730:1: ( rule__ProcessorGroup__Group_1_2__0__Impl rule__ProcessorGroup__Group_1_2__1 )
            // InternalKiCool.g:1731:2: rule__ProcessorGroup__Group_1_2__0__Impl rule__ProcessorGroup__Group_1_2__1
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
    // InternalKiCool.g:1738:1: rule__ProcessorGroup__Group_1_2__0__Impl : ( '[' ) ;
    public final void rule__ProcessorGroup__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1742:1: ( ( '[' ) )
            // InternalKiCool.g:1743:1: ( '[' )
            {
            // InternalKiCool.g:1743:1: ( '[' )
            // InternalKiCool.g:1744:1: '['
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
    // InternalKiCool.g:1757:1: rule__ProcessorGroup__Group_1_2__1 : rule__ProcessorGroup__Group_1_2__1__Impl rule__ProcessorGroup__Group_1_2__2 ;
    public final void rule__ProcessorGroup__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1761:1: ( rule__ProcessorGroup__Group_1_2__1__Impl rule__ProcessorGroup__Group_1_2__2 )
            // InternalKiCool.g:1762:2: rule__ProcessorGroup__Group_1_2__1__Impl rule__ProcessorGroup__Group_1_2__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalKiCool.g:1769:1: rule__ProcessorGroup__Group_1_2__1__Impl : ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) ) ;
    public final void rule__ProcessorGroup__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1773:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) ) )
            // InternalKiCool.g:1774:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) )
            {
            // InternalKiCool.g:1774:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) )
            // InternalKiCool.g:1775:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_2_1()); 
            }
            // InternalKiCool.g:1776:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 )
            // InternalKiCool.g:1776:2: rule__ProcessorGroup__ProcessorsAssignment_1_2_1
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
    // InternalKiCool.g:1786:1: rule__ProcessorGroup__Group_1_2__2 : rule__ProcessorGroup__Group_1_2__2__Impl ;
    public final void rule__ProcessorGroup__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1790:1: ( rule__ProcessorGroup__Group_1_2__2__Impl )
            // InternalKiCool.g:1791:2: rule__ProcessorGroup__Group_1_2__2__Impl
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
    // InternalKiCool.g:1797:1: rule__ProcessorGroup__Group_1_2__2__Impl : ( ']' ) ;
    public final void rule__ProcessorGroup__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1801:1: ( ( ']' ) )
            // InternalKiCool.g:1802:1: ( ']' )
            {
            // InternalKiCool.g:1802:1: ( ']' )
            // InternalKiCool.g:1803:1: ']'
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
    // InternalKiCool.g:1822:1: rule__ProcessorGroup__Group_1_3__0 : rule__ProcessorGroup__Group_1_3__0__Impl rule__ProcessorGroup__Group_1_3__1 ;
    public final void rule__ProcessorGroup__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1826:1: ( rule__ProcessorGroup__Group_1_3__0__Impl rule__ProcessorGroup__Group_1_3__1 )
            // InternalKiCool.g:1827:2: rule__ProcessorGroup__Group_1_3__0__Impl rule__ProcessorGroup__Group_1_3__1
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
    // InternalKiCool.g:1834:1: rule__ProcessorGroup__Group_1_3__0__Impl : ( '[' ) ;
    public final void rule__ProcessorGroup__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1838:1: ( ( '[' ) )
            // InternalKiCool.g:1839:1: ( '[' )
            {
            // InternalKiCool.g:1839:1: ( '[' )
            // InternalKiCool.g:1840:1: '['
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
    // InternalKiCool.g:1853:1: rule__ProcessorGroup__Group_1_3__1 : rule__ProcessorGroup__Group_1_3__1__Impl rule__ProcessorGroup__Group_1_3__2 ;
    public final void rule__ProcessorGroup__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1857:1: ( rule__ProcessorGroup__Group_1_3__1__Impl rule__ProcessorGroup__Group_1_3__2 )
            // InternalKiCool.g:1858:2: rule__ProcessorGroup__Group_1_3__1__Impl rule__ProcessorGroup__Group_1_3__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalKiCool.g:1865:1: rule__ProcessorGroup__Group_1_3__1__Impl : ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) ) ;
    public final void rule__ProcessorGroup__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1869:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) ) )
            // InternalKiCool.g:1870:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) )
            {
            // InternalKiCool.g:1870:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) )
            // InternalKiCool.g:1871:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_3_1()); 
            }
            // InternalKiCool.g:1872:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 )
            // InternalKiCool.g:1872:2: rule__ProcessorGroup__ProcessorsAssignment_1_3_1
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
    // InternalKiCool.g:1882:1: rule__ProcessorGroup__Group_1_3__2 : rule__ProcessorGroup__Group_1_3__2__Impl ;
    public final void rule__ProcessorGroup__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1886:1: ( rule__ProcessorGroup__Group_1_3__2__Impl )
            // InternalKiCool.g:1887:2: rule__ProcessorGroup__Group_1_3__2__Impl
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
    // InternalKiCool.g:1893:1: rule__ProcessorGroup__Group_1_3__2__Impl : ( ']' ) ;
    public final void rule__ProcessorGroup__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1897:1: ( ( ']' ) )
            // InternalKiCool.g:1898:1: ( ']' )
            {
            // InternalKiCool.g:1898:1: ( ']' )
            // InternalKiCool.g:1899:1: ']'
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
    // InternalKiCool.g:1918:1: rule__Processor__Group__0 : rule__Processor__Group__0__Impl rule__Processor__Group__1 ;
    public final void rule__Processor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1922:1: ( rule__Processor__Group__0__Impl rule__Processor__Group__1 )
            // InternalKiCool.g:1923:2: rule__Processor__Group__0__Impl rule__Processor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalKiCool.g:1930:1: rule__Processor__Group__0__Impl : ( ( rule__Processor__Group_0__0 )* ) ;
    public final void rule__Processor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1934:1: ( ( ( rule__Processor__Group_0__0 )* ) )
            // InternalKiCool.g:1935:1: ( ( rule__Processor__Group_0__0 )* )
            {
            // InternalKiCool.g:1935:1: ( ( rule__Processor__Group_0__0 )* )
            // InternalKiCool.g:1936:1: ( rule__Processor__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_0()); 
            }
            // InternalKiCool.g:1937:1: ( rule__Processor__Group_0__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==22) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalKiCool.g:1937:2: rule__Processor__Group_0__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    rule__Processor__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalKiCool.g:1947:1: rule__Processor__Group__1 : rule__Processor__Group__1__Impl rule__Processor__Group__2 ;
    public final void rule__Processor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1951:1: ( rule__Processor__Group__1__Impl rule__Processor__Group__2 )
            // InternalKiCool.g:1952:2: rule__Processor__Group__1__Impl rule__Processor__Group__2
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
    // InternalKiCool.g:1959:1: rule__Processor__Group__1__Impl : ( ( rule__Processor__Group_1__0 )* ) ;
    public final void rule__Processor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1963:1: ( ( ( rule__Processor__Group_1__0 )* ) )
            // InternalKiCool.g:1964:1: ( ( rule__Processor__Group_1__0 )* )
            {
            // InternalKiCool.g:1964:1: ( ( rule__Processor__Group_1__0 )* )
            // InternalKiCool.g:1965:1: ( rule__Processor__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_1()); 
            }
            // InternalKiCool.g:1966:1: ( rule__Processor__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKiCool.g:1966:2: rule__Processor__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    rule__Processor__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalKiCool.g:1976:1: rule__Processor__Group__2 : rule__Processor__Group__2__Impl rule__Processor__Group__3 ;
    public final void rule__Processor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1980:1: ( rule__Processor__Group__2__Impl rule__Processor__Group__3 )
            // InternalKiCool.g:1981:2: rule__Processor__Group__2__Impl rule__Processor__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKiCool.g:1988:1: rule__Processor__Group__2__Impl : ( ( rule__Processor__IdAssignment_2 ) ) ;
    public final void rule__Processor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1992:1: ( ( ( rule__Processor__IdAssignment_2 ) ) )
            // InternalKiCool.g:1993:1: ( ( rule__Processor__IdAssignment_2 ) )
            {
            // InternalKiCool.g:1993:1: ( ( rule__Processor__IdAssignment_2 ) )
            // InternalKiCool.g:1994:1: ( rule__Processor__IdAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getIdAssignment_2()); 
            }
            // InternalKiCool.g:1995:1: ( rule__Processor__IdAssignment_2 )
            // InternalKiCool.g:1995:2: rule__Processor__IdAssignment_2
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
    // InternalKiCool.g:2005:1: rule__Processor__Group__3 : rule__Processor__Group__3__Impl rule__Processor__Group__4 ;
    public final void rule__Processor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2009:1: ( rule__Processor__Group__3__Impl rule__Processor__Group__4 )
            // InternalKiCool.g:2010:2: rule__Processor__Group__3__Impl rule__Processor__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKiCool.g:2017:1: rule__Processor__Group__3__Impl : ( ( rule__Processor__Group_3__0 )? ) ;
    public final void rule__Processor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2021:1: ( ( ( rule__Processor__Group_3__0 )? ) )
            // InternalKiCool.g:2022:1: ( ( rule__Processor__Group_3__0 )? )
            {
            // InternalKiCool.g:2022:1: ( ( rule__Processor__Group_3__0 )? )
            // InternalKiCool.g:2023:1: ( rule__Processor__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_3()); 
            }
            // InternalKiCool.g:2024:1: ( rule__Processor__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKiCool.g:2024:2: rule__Processor__Group_3__0
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
    // InternalKiCool.g:2034:1: rule__Processor__Group__4 : rule__Processor__Group__4__Impl rule__Processor__Group__5 ;
    public final void rule__Processor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2038:1: ( rule__Processor__Group__4__Impl rule__Processor__Group__5 )
            // InternalKiCool.g:2039:2: rule__Processor__Group__4__Impl rule__Processor__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKiCool.g:2046:1: rule__Processor__Group__4__Impl : ( ( rule__Processor__Group_4__0 )* ) ;
    public final void rule__Processor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2050:1: ( ( ( rule__Processor__Group_4__0 )* ) )
            // InternalKiCool.g:2051:1: ( ( rule__Processor__Group_4__0 )* )
            {
            // InternalKiCool.g:2051:1: ( ( rule__Processor__Group_4__0 )* )
            // InternalKiCool.g:2052:1: ( rule__Processor__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_4()); 
            }
            // InternalKiCool.g:2053:1: ( rule__Processor__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==28) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalKiCool.g:2053:2: rule__Processor__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__Processor__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalKiCool.g:2063:1: rule__Processor__Group__5 : rule__Processor__Group__5__Impl ;
    public final void rule__Processor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2067:1: ( rule__Processor__Group__5__Impl )
            // InternalKiCool.g:2068:2: rule__Processor__Group__5__Impl
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
    // InternalKiCool.g:2074:1: rule__Processor__Group__5__Impl : ( ( rule__Processor__Group_5__0 )* ) ;
    public final void rule__Processor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2078:1: ( ( ( rule__Processor__Group_5__0 )* ) )
            // InternalKiCool.g:2079:1: ( ( rule__Processor__Group_5__0 )* )
            {
            // InternalKiCool.g:2079:1: ( ( rule__Processor__Group_5__0 )* )
            // InternalKiCool.g:2080:1: ( rule__Processor__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_5()); 
            }
            // InternalKiCool.g:2081:1: ( rule__Processor__Group_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKiCool.g:2081:2: rule__Processor__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__Processor__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalKiCool.g:2103:1: rule__Processor__Group_0__0 : rule__Processor__Group_0__0__Impl rule__Processor__Group_0__1 ;
    public final void rule__Processor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2107:1: ( rule__Processor__Group_0__0__Impl rule__Processor__Group_0__1 )
            // InternalKiCool.g:2108:2: rule__Processor__Group_0__0__Impl rule__Processor__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalKiCool.g:2115:1: rule__Processor__Group_0__0__Impl : ( 'pre' ) ;
    public final void rule__Processor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2119:1: ( ( 'pre' ) )
            // InternalKiCool.g:2120:1: ( 'pre' )
            {
            // InternalKiCool.g:2120:1: ( 'pre' )
            // InternalKiCool.g:2121:1: 'pre'
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
    // InternalKiCool.g:2134:1: rule__Processor__Group_0__1 : rule__Processor__Group_0__1__Impl rule__Processor__Group_0__2 ;
    public final void rule__Processor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2138:1: ( rule__Processor__Group_0__1__Impl rule__Processor__Group_0__2 )
            // InternalKiCool.g:2139:2: rule__Processor__Group_0__1__Impl rule__Processor__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKiCool.g:2146:1: rule__Processor__Group_0__1__Impl : ( 'set' ) ;
    public final void rule__Processor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2150:1: ( ( 'set' ) )
            // InternalKiCool.g:2151:1: ( 'set' )
            {
            // InternalKiCool.g:2151:1: ( 'set' )
            // InternalKiCool.g:2152:1: 'set'
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
    // InternalKiCool.g:2165:1: rule__Processor__Group_0__2 : rule__Processor__Group_0__2__Impl ;
    public final void rule__Processor__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2169:1: ( rule__Processor__Group_0__2__Impl )
            // InternalKiCool.g:2170:2: rule__Processor__Group_0__2__Impl
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
    // InternalKiCool.g:2176:1: rule__Processor__Group_0__2__Impl : ( ( rule__Processor__PresetsAssignment_0_2 ) ) ;
    public final void rule__Processor__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2180:1: ( ( ( rule__Processor__PresetsAssignment_0_2 ) ) )
            // InternalKiCool.g:2181:1: ( ( rule__Processor__PresetsAssignment_0_2 ) )
            {
            // InternalKiCool.g:2181:1: ( ( rule__Processor__PresetsAssignment_0_2 ) )
            // InternalKiCool.g:2182:1: ( rule__Processor__PresetsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPresetsAssignment_0_2()); 
            }
            // InternalKiCool.g:2183:1: ( rule__Processor__PresetsAssignment_0_2 )
            // InternalKiCool.g:2183:2: rule__Processor__PresetsAssignment_0_2
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
    // InternalKiCool.g:2199:1: rule__Processor__Group_1__0 : rule__Processor__Group_1__0__Impl rule__Processor__Group_1__1 ;
    public final void rule__Processor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2203:1: ( rule__Processor__Group_1__0__Impl rule__Processor__Group_1__1 )
            // InternalKiCool.g:2204:2: rule__Processor__Group_1__0__Impl rule__Processor__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKiCool.g:2211:1: rule__Processor__Group_1__0__Impl : ( 'pre' ) ;
    public final void rule__Processor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2215:1: ( ( 'pre' ) )
            // InternalKiCool.g:2216:1: ( 'pre' )
            {
            // InternalKiCool.g:2216:1: ( 'pre' )
            // InternalKiCool.g:2217:1: 'pre'
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
    // InternalKiCool.g:2230:1: rule__Processor__Group_1__1 : rule__Processor__Group_1__1__Impl rule__Processor__Group_1__2 ;
    public final void rule__Processor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2234:1: ( rule__Processor__Group_1__1__Impl rule__Processor__Group_1__2 )
            // InternalKiCool.g:2235:2: rule__Processor__Group_1__1__Impl rule__Processor__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKiCool.g:2242:1: rule__Processor__Group_1__1__Impl : ( 'process' ) ;
    public final void rule__Processor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2246:1: ( ( 'process' ) )
            // InternalKiCool.g:2247:1: ( 'process' )
            {
            // InternalKiCool.g:2247:1: ( 'process' )
            // InternalKiCool.g:2248:1: 'process'
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
    // InternalKiCool.g:2261:1: rule__Processor__Group_1__2 : rule__Processor__Group_1__2__Impl ;
    public final void rule__Processor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2265:1: ( rule__Processor__Group_1__2__Impl )
            // InternalKiCool.g:2266:2: rule__Processor__Group_1__2__Impl
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
    // InternalKiCool.g:2272:1: rule__Processor__Group_1__2__Impl : ( ( rule__Processor__PreprocessesAssignment_1_2 ) ) ;
    public final void rule__Processor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2276:1: ( ( ( rule__Processor__PreprocessesAssignment_1_2 ) ) )
            // InternalKiCool.g:2277:1: ( ( rule__Processor__PreprocessesAssignment_1_2 ) )
            {
            // InternalKiCool.g:2277:1: ( ( rule__Processor__PreprocessesAssignment_1_2 ) )
            // InternalKiCool.g:2278:1: ( rule__Processor__PreprocessesAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPreprocessesAssignment_1_2()); 
            }
            // InternalKiCool.g:2279:1: ( rule__Processor__PreprocessesAssignment_1_2 )
            // InternalKiCool.g:2279:2: rule__Processor__PreprocessesAssignment_1_2
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
    // InternalKiCool.g:2295:1: rule__Processor__Group_3__0 : rule__Processor__Group_3__0__Impl rule__Processor__Group_3__1 ;
    public final void rule__Processor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2299:1: ( rule__Processor__Group_3__0__Impl rule__Processor__Group_3__1 )
            // InternalKiCool.g:2300:2: rule__Processor__Group_3__0__Impl rule__Processor__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKiCool.g:2307:1: rule__Processor__Group_3__0__Impl : ( 'intermediate' ) ;
    public final void rule__Processor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2311:1: ( ( 'intermediate' ) )
            // InternalKiCool.g:2312:1: ( 'intermediate' )
            {
            // InternalKiCool.g:2312:1: ( 'intermediate' )
            // InternalKiCool.g:2313:1: 'intermediate'
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
    // InternalKiCool.g:2326:1: rule__Processor__Group_3__1 : rule__Processor__Group_3__1__Impl ;
    public final void rule__Processor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2330:1: ( rule__Processor__Group_3__1__Impl )
            // InternalKiCool.g:2331:2: rule__Processor__Group_3__1__Impl
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
    // InternalKiCool.g:2337:1: rule__Processor__Group_3__1__Impl : ( ( rule__Processor__MetricAssignment_3_1 ) ) ;
    public final void rule__Processor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2341:1: ( ( ( rule__Processor__MetricAssignment_3_1 ) ) )
            // InternalKiCool.g:2342:1: ( ( rule__Processor__MetricAssignment_3_1 ) )
            {
            // InternalKiCool.g:2342:1: ( ( rule__Processor__MetricAssignment_3_1 ) )
            // InternalKiCool.g:2343:1: ( rule__Processor__MetricAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getMetricAssignment_3_1()); 
            }
            // InternalKiCool.g:2344:1: ( rule__Processor__MetricAssignment_3_1 )
            // InternalKiCool.g:2344:2: rule__Processor__MetricAssignment_3_1
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
    // InternalKiCool.g:2358:1: rule__Processor__Group_4__0 : rule__Processor__Group_4__0__Impl rule__Processor__Group_4__1 ;
    public final void rule__Processor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2362:1: ( rule__Processor__Group_4__0__Impl rule__Processor__Group_4__1 )
            // InternalKiCool.g:2363:2: rule__Processor__Group_4__0__Impl rule__Processor__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKiCool.g:2370:1: rule__Processor__Group_4__0__Impl : ( 'post' ) ;
    public final void rule__Processor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2374:1: ( ( 'post' ) )
            // InternalKiCool.g:2375:1: ( 'post' )
            {
            // InternalKiCool.g:2375:1: ( 'post' )
            // InternalKiCool.g:2376:1: 'post'
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
    // InternalKiCool.g:2389:1: rule__Processor__Group_4__1 : rule__Processor__Group_4__1__Impl rule__Processor__Group_4__2 ;
    public final void rule__Processor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2393:1: ( rule__Processor__Group_4__1__Impl rule__Processor__Group_4__2 )
            // InternalKiCool.g:2394:2: rule__Processor__Group_4__1__Impl rule__Processor__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalKiCool.g:2401:1: rule__Processor__Group_4__1__Impl : ( 'process' ) ;
    public final void rule__Processor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2405:1: ( ( 'process' ) )
            // InternalKiCool.g:2406:1: ( 'process' )
            {
            // InternalKiCool.g:2406:1: ( 'process' )
            // InternalKiCool.g:2407:1: 'process'
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
    // InternalKiCool.g:2420:1: rule__Processor__Group_4__2 : rule__Processor__Group_4__2__Impl ;
    public final void rule__Processor__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2424:1: ( rule__Processor__Group_4__2__Impl )
            // InternalKiCool.g:2425:2: rule__Processor__Group_4__2__Impl
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
    // InternalKiCool.g:2431:1: rule__Processor__Group_4__2__Impl : ( ( rule__Processor__PostprocessesAssignment_4_2 ) ) ;
    public final void rule__Processor__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2435:1: ( ( ( rule__Processor__PostprocessesAssignment_4_2 ) ) )
            // InternalKiCool.g:2436:1: ( ( rule__Processor__PostprocessesAssignment_4_2 ) )
            {
            // InternalKiCool.g:2436:1: ( ( rule__Processor__PostprocessesAssignment_4_2 ) )
            // InternalKiCool.g:2437:1: ( rule__Processor__PostprocessesAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPostprocessesAssignment_4_2()); 
            }
            // InternalKiCool.g:2438:1: ( rule__Processor__PostprocessesAssignment_4_2 )
            // InternalKiCool.g:2438:2: rule__Processor__PostprocessesAssignment_4_2
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
    // InternalKiCool.g:2454:1: rule__Processor__Group_5__0 : rule__Processor__Group_5__0__Impl rule__Processor__Group_5__1 ;
    public final void rule__Processor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2458:1: ( rule__Processor__Group_5__0__Impl rule__Processor__Group_5__1 )
            // InternalKiCool.g:2459:2: rule__Processor__Group_5__0__Impl rule__Processor__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalKiCool.g:2466:1: rule__Processor__Group_5__0__Impl : ( 'post' ) ;
    public final void rule__Processor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2470:1: ( ( 'post' ) )
            // InternalKiCool.g:2471:1: ( 'post' )
            {
            // InternalKiCool.g:2471:1: ( 'post' )
            // InternalKiCool.g:2472:1: 'post'
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
    // InternalKiCool.g:2485:1: rule__Processor__Group_5__1 : rule__Processor__Group_5__1__Impl rule__Processor__Group_5__2 ;
    public final void rule__Processor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2489:1: ( rule__Processor__Group_5__1__Impl rule__Processor__Group_5__2 )
            // InternalKiCool.g:2490:2: rule__Processor__Group_5__1__Impl rule__Processor__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKiCool.g:2497:1: rule__Processor__Group_5__1__Impl : ( 'set' ) ;
    public final void rule__Processor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2501:1: ( ( 'set' ) )
            // InternalKiCool.g:2502:1: ( 'set' )
            {
            // InternalKiCool.g:2502:1: ( 'set' )
            // InternalKiCool.g:2503:1: 'set'
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
    // InternalKiCool.g:2516:1: rule__Processor__Group_5__2 : rule__Processor__Group_5__2__Impl ;
    public final void rule__Processor__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2520:1: ( rule__Processor__Group_5__2__Impl )
            // InternalKiCool.g:2521:2: rule__Processor__Group_5__2__Impl
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
    // InternalKiCool.g:2527:1: rule__Processor__Group_5__2__Impl : ( ( rule__Processor__PostsetsAssignment_5_2 ) ) ;
    public final void rule__Processor__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2531:1: ( ( ( rule__Processor__PostsetsAssignment_5_2 ) ) )
            // InternalKiCool.g:2532:1: ( ( rule__Processor__PostsetsAssignment_5_2 ) )
            {
            // InternalKiCool.g:2532:1: ( ( rule__Processor__PostsetsAssignment_5_2 ) )
            // InternalKiCool.g:2533:1: ( rule__Processor__PostsetsAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPostsetsAssignment_5_2()); 
            }
            // InternalKiCool.g:2534:1: ( rule__Processor__PostsetsAssignment_5_2 )
            // InternalKiCool.g:2534:2: rule__Processor__PostsetsAssignment_5_2
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
    // InternalKiCool.g:2550:1: rule__CoProcessor__Group__0 : rule__CoProcessor__Group__0__Impl rule__CoProcessor__Group__1 ;
    public final void rule__CoProcessor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2554:1: ( rule__CoProcessor__Group__0__Impl rule__CoProcessor__Group__1 )
            // InternalKiCool.g:2555:2: rule__CoProcessor__Group__0__Impl rule__CoProcessor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalKiCool.g:2562:1: rule__CoProcessor__Group__0__Impl : ( ( rule__CoProcessor__IdAssignment_0 ) ) ;
    public final void rule__CoProcessor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2566:1: ( ( ( rule__CoProcessor__IdAssignment_0 ) ) )
            // InternalKiCool.g:2567:1: ( ( rule__CoProcessor__IdAssignment_0 ) )
            {
            // InternalKiCool.g:2567:1: ( ( rule__CoProcessor__IdAssignment_0 ) )
            // InternalKiCool.g:2568:1: ( rule__CoProcessor__IdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoProcessorAccess().getIdAssignment_0()); 
            }
            // InternalKiCool.g:2569:1: ( rule__CoProcessor__IdAssignment_0 )
            // InternalKiCool.g:2569:2: rule__CoProcessor__IdAssignment_0
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
    // InternalKiCool.g:2579:1: rule__CoProcessor__Group__1 : rule__CoProcessor__Group__1__Impl ;
    public final void rule__CoProcessor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2583:1: ( rule__CoProcessor__Group__1__Impl )
            // InternalKiCool.g:2584:2: rule__CoProcessor__Group__1__Impl
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
    // InternalKiCool.g:2590:1: rule__CoProcessor__Group__1__Impl : ( ( rule__CoProcessor__SilentAssignment_1 )? ) ;
    public final void rule__CoProcessor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2594:1: ( ( ( rule__CoProcessor__SilentAssignment_1 )? ) )
            // InternalKiCool.g:2595:1: ( ( rule__CoProcessor__SilentAssignment_1 )? )
            {
            // InternalKiCool.g:2595:1: ( ( rule__CoProcessor__SilentAssignment_1 )? )
            // InternalKiCool.g:2596:1: ( rule__CoProcessor__SilentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoProcessorAccess().getSilentAssignment_1()); 
            }
            // InternalKiCool.g:2597:1: ( rule__CoProcessor__SilentAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKiCool.g:2597:2: rule__CoProcessor__SilentAssignment_1
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
    // InternalKiCool.g:2611:1: rule__ProcessorAlternativeGroup__Group__0 : rule__ProcessorAlternativeGroup__Group__0__Impl rule__ProcessorAlternativeGroup__Group__1 ;
    public final void rule__ProcessorAlternativeGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2615:1: ( rule__ProcessorAlternativeGroup__Group__0__Impl rule__ProcessorAlternativeGroup__Group__1 )
            // InternalKiCool.g:2616:2: rule__ProcessorAlternativeGroup__Group__0__Impl rule__ProcessorAlternativeGroup__Group__1
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
    // InternalKiCool.g:2623:1: rule__ProcessorAlternativeGroup__Group__0__Impl : ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? ) ;
    public final void rule__ProcessorAlternativeGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2627:1: ( ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? ) )
            // InternalKiCool.g:2628:1: ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? )
            {
            // InternalKiCool.g:2628:1: ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? )
            // InternalKiCool.g:2629:1: ( rule__ProcessorAlternativeGroup__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_0()); 
            }
            // InternalKiCool.g:2630:1: ( rule__ProcessorAlternativeGroup__Group_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_STRING) ) {
                    int LA18_3 = input.LA(3);

                    if ( (synpred24_InternalKiCool()) ) {
                        alt18=1;
                    }
                }
                else if ( (LA18_1==RULE_ID) ) {
                    int LA18_4 = input.LA(3);

                    if ( (synpred24_InternalKiCool()) ) {
                        alt18=1;
                    }
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalKiCool.g:2630:2: rule__ProcessorAlternativeGroup__Group_0__0
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
    // InternalKiCool.g:2640:1: rule__ProcessorAlternativeGroup__Group__1 : rule__ProcessorAlternativeGroup__Group__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2644:1: ( rule__ProcessorAlternativeGroup__Group__1__Impl )
            // InternalKiCool.g:2645:2: rule__ProcessorAlternativeGroup__Group__1__Impl
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
    // InternalKiCool.g:2651:1: rule__ProcessorAlternativeGroup__Group__1__Impl : ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2655:1: ( ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) ) )
            // InternalKiCool.g:2656:1: ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) )
            {
            // InternalKiCool.g:2656:1: ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) )
            // InternalKiCool.g:2657:1: ( rule__ProcessorAlternativeGroup__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1()); 
            }
            // InternalKiCool.g:2658:1: ( rule__ProcessorAlternativeGroup__Group_1__0 )
            // InternalKiCool.g:2658:2: rule__ProcessorAlternativeGroup__Group_1__0
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
    // InternalKiCool.g:2672:1: rule__ProcessorAlternativeGroup__Group_0__0 : rule__ProcessorAlternativeGroup__Group_0__0__Impl rule__ProcessorAlternativeGroup__Group_0__1 ;
    public final void rule__ProcessorAlternativeGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2676:1: ( rule__ProcessorAlternativeGroup__Group_0__0__Impl rule__ProcessorAlternativeGroup__Group_0__1 )
            // InternalKiCool.g:2677:2: rule__ProcessorAlternativeGroup__Group_0__0__Impl rule__ProcessorAlternativeGroup__Group_0__1
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
    // InternalKiCool.g:2684:1: rule__ProcessorAlternativeGroup__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__ProcessorAlternativeGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2688:1: ( ( 'label' ) )
            // InternalKiCool.g:2689:1: ( 'label' )
            {
            // InternalKiCool.g:2689:1: ( 'label' )
            // InternalKiCool.g:2690:1: 'label'
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
    // InternalKiCool.g:2703:1: rule__ProcessorAlternativeGroup__Group_0__1 : rule__ProcessorAlternativeGroup__Group_0__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2707:1: ( rule__ProcessorAlternativeGroup__Group_0__1__Impl )
            // InternalKiCool.g:2708:2: rule__ProcessorAlternativeGroup__Group_0__1__Impl
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
    // InternalKiCool.g:2714:1: rule__ProcessorAlternativeGroup__Group_0__1__Impl : ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2718:1: ( ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) ) )
            // InternalKiCool.g:2719:1: ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) )
            {
            // InternalKiCool.g:2719:1: ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) )
            // InternalKiCool.g:2720:1: ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getLabelAssignment_0_1()); 
            }
            // InternalKiCool.g:2721:1: ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 )
            // InternalKiCool.g:2721:2: rule__ProcessorAlternativeGroup__LabelAssignment_0_1
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
    // InternalKiCool.g:2735:1: rule__ProcessorAlternativeGroup__Group_1__0 : rule__ProcessorAlternativeGroup__Group_1__0__Impl rule__ProcessorAlternativeGroup__Group_1__1 ;
    public final void rule__ProcessorAlternativeGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2739:1: ( rule__ProcessorAlternativeGroup__Group_1__0__Impl rule__ProcessorAlternativeGroup__Group_1__1 )
            // InternalKiCool.g:2740:2: rule__ProcessorAlternativeGroup__Group_1__0__Impl rule__ProcessorAlternativeGroup__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalKiCool.g:2747:1: rule__ProcessorAlternativeGroup__Group_1__0__Impl : ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2751:1: ( ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) ) )
            // InternalKiCool.g:2752:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) )
            {
            // InternalKiCool.g:2752:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) )
            // InternalKiCool.g:2753:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsAssignment_1_0()); 
            }
            // InternalKiCool.g:2754:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 )
            // InternalKiCool.g:2754:2: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0
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
    // InternalKiCool.g:2764:1: rule__ProcessorAlternativeGroup__Group_1__1 : rule__ProcessorAlternativeGroup__Group_1__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2768:1: ( rule__ProcessorAlternativeGroup__Group_1__1__Impl )
            // InternalKiCool.g:2769:2: rule__ProcessorAlternativeGroup__Group_1__1__Impl
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
    // InternalKiCool.g:2775:1: rule__ProcessorAlternativeGroup__Group_1__1__Impl : ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2779:1: ( ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) ) )
            // InternalKiCool.g:2780:1: ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) )
            {
            // InternalKiCool.g:2780:1: ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) )
            // InternalKiCool.g:2781:1: ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* )
            {
            // InternalKiCool.g:2781:1: ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) )
            // InternalKiCool.g:2782:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1_1()); 
            }
            // InternalKiCool.g:2783:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )
            // InternalKiCool.g:2783:2: rule__ProcessorAlternativeGroup__Group_1_1__0
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__ProcessorAlternativeGroup__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1_1()); 
            }

            }

            // InternalKiCool.g:2786:1: ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* )
            // InternalKiCool.g:2787:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1_1()); 
            }
            // InternalKiCool.g:2788:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKiCool.g:2788:2: rule__ProcessorAlternativeGroup__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    rule__ProcessorAlternativeGroup__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalKiCool.g:2803:1: rule__ProcessorAlternativeGroup__Group_1_1__0 : rule__ProcessorAlternativeGroup__Group_1_1__0__Impl rule__ProcessorAlternativeGroup__Group_1_1__1 ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2807:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0__Impl rule__ProcessorAlternativeGroup__Group_1_1__1 )
            // InternalKiCool.g:2808:2: rule__ProcessorAlternativeGroup__Group_1_1__0__Impl rule__ProcessorAlternativeGroup__Group_1_1__1
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
    // InternalKiCool.g:2815:1: rule__ProcessorAlternativeGroup__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2819:1: ( ( '|' ) )
            // InternalKiCool.g:2820:1: ( '|' )
            {
            // InternalKiCool.g:2820:1: ( '|' )
            // InternalKiCool.g:2821:1: '|'
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
    // InternalKiCool.g:2834:1: rule__ProcessorAlternativeGroup__Group_1_1__1 : rule__ProcessorAlternativeGroup__Group_1_1__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2838:1: ( rule__ProcessorAlternativeGroup__Group_1_1__1__Impl )
            // InternalKiCool.g:2839:2: rule__ProcessorAlternativeGroup__Group_1_1__1__Impl
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
    // InternalKiCool.g:2845:1: rule__ProcessorAlternativeGroup__Group_1_1__1__Impl : ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2849:1: ( ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) ) )
            // InternalKiCool.g:2850:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) )
            {
            // InternalKiCool.g:2850:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) )
            // InternalKiCool.g:2851:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsAssignment_1_1_1()); 
            }
            // InternalKiCool.g:2852:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 )
            // InternalKiCool.g:2852:2: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1
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
    // InternalKiCool.g:2866:1: rule__KVPair__Group__0 : rule__KVPair__Group__0__Impl rule__KVPair__Group__1 ;
    public final void rule__KVPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2870:1: ( rule__KVPair__Group__0__Impl rule__KVPair__Group__1 )
            // InternalKiCool.g:2871:2: rule__KVPair__Group__0__Impl rule__KVPair__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalKiCool.g:2878:1: rule__KVPair__Group__0__Impl : ( ( rule__KVPair__KeyAssignment_0 ) ) ;
    public final void rule__KVPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2882:1: ( ( ( rule__KVPair__KeyAssignment_0 ) ) )
            // InternalKiCool.g:2883:1: ( ( rule__KVPair__KeyAssignment_0 ) )
            {
            // InternalKiCool.g:2883:1: ( ( rule__KVPair__KeyAssignment_0 ) )
            // InternalKiCool.g:2884:1: ( rule__KVPair__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getKeyAssignment_0()); 
            }
            // InternalKiCool.g:2885:1: ( rule__KVPair__KeyAssignment_0 )
            // InternalKiCool.g:2885:2: rule__KVPair__KeyAssignment_0
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
    // InternalKiCool.g:2895:1: rule__KVPair__Group__1 : rule__KVPair__Group__1__Impl rule__KVPair__Group__2 ;
    public final void rule__KVPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2899:1: ( rule__KVPair__Group__1__Impl rule__KVPair__Group__2 )
            // InternalKiCool.g:2900:2: rule__KVPair__Group__1__Impl rule__KVPair__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalKiCool.g:2907:1: rule__KVPair__Group__1__Impl : ( ( rule__KVPair__IsKeyValueAssignment_1 )? ) ;
    public final void rule__KVPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2911:1: ( ( ( rule__KVPair__IsKeyValueAssignment_1 )? ) )
            // InternalKiCool.g:2912:1: ( ( rule__KVPair__IsKeyValueAssignment_1 )? )
            {
            // InternalKiCool.g:2912:1: ( ( rule__KVPair__IsKeyValueAssignment_1 )? )
            // InternalKiCool.g:2913:1: ( rule__KVPair__IsKeyValueAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getIsKeyValueAssignment_1()); 
            }
            // InternalKiCool.g:2914:1: ( rule__KVPair__IsKeyValueAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKiCool.g:2914:2: rule__KVPair__IsKeyValueAssignment_1
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
    // InternalKiCool.g:2924:1: rule__KVPair__Group__2 : rule__KVPair__Group__2__Impl ;
    public final void rule__KVPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2928:1: ( rule__KVPair__Group__2__Impl )
            // InternalKiCool.g:2929:2: rule__KVPair__Group__2__Impl
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
    // InternalKiCool.g:2935:1: rule__KVPair__Group__2__Impl : ( ( rule__KVPair__ValueAssignment_2 ) ) ;
    public final void rule__KVPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2939:1: ( ( ( rule__KVPair__ValueAssignment_2 ) ) )
            // InternalKiCool.g:2940:1: ( ( rule__KVPair__ValueAssignment_2 ) )
            {
            // InternalKiCool.g:2940:1: ( ( rule__KVPair__ValueAssignment_2 ) )
            // InternalKiCool.g:2941:1: ( rule__KVPair__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getValueAssignment_2()); 
            }
            // InternalKiCool.g:2942:1: ( rule__KVPair__ValueAssignment_2 )
            // InternalKiCool.g:2942:2: rule__KVPair__ValueAssignment_2
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
    // InternalKiCool.g:2958:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2962:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalKiCool.g:2963:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
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
    // InternalKiCool.g:2970:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2974:1: ( ( '@' ) )
            // InternalKiCool.g:2975:1: ( '@' )
            {
            // InternalKiCool.g:2975:1: ( '@' )
            // InternalKiCool.g:2976:1: '@'
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
    // InternalKiCool.g:2989:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2993:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalKiCool.g:2994:2: rule__TagAnnotation__Group__1__Impl
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
    // InternalKiCool.g:3000:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3004:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3005:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3005:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3006:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3007:1: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3007:2: rule__TagAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3021:1: rule__PragmaTag__Group__0 : rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 ;
    public final void rule__PragmaTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3025:1: ( rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 )
            // InternalKiCool.g:3026:2: rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKiCool.g:3033:1: rule__PragmaTag__Group__0__Impl : ( '#' ) ;
    public final void rule__PragmaTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3037:1: ( ( '#' ) )
            // InternalKiCool.g:3038:1: ( '#' )
            {
            // InternalKiCool.g:3038:1: ( '#' )
            // InternalKiCool.g:3039:1: '#'
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
    // InternalKiCool.g:3052:1: rule__PragmaTag__Group__1 : rule__PragmaTag__Group__1__Impl ;
    public final void rule__PragmaTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3056:1: ( rule__PragmaTag__Group__1__Impl )
            // InternalKiCool.g:3057:2: rule__PragmaTag__Group__1__Impl
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
    // InternalKiCool.g:3063:1: rule__PragmaTag__Group__1__Impl : ( ( rule__PragmaTag__NameAssignment_1 ) ) ;
    public final void rule__PragmaTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3067:1: ( ( ( rule__PragmaTag__NameAssignment_1 ) ) )
            // InternalKiCool.g:3068:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3068:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            // InternalKiCool.g:3069:1: ( rule__PragmaTag__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3070:1: ( rule__PragmaTag__NameAssignment_1 )
            // InternalKiCool.g:3070:2: rule__PragmaTag__NameAssignment_1
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
    // InternalKiCool.g:3084:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3088:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3089:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:3096:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3100:1: ( ( '@' ) )
            // InternalKiCool.g:3101:1: ( '@' )
            {
            // InternalKiCool.g:3101:1: ( '@' )
            // InternalKiCool.g:3102:1: '@'
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
    // InternalKiCool.g:3115:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3119:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3120:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalKiCool.g:3127:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3131:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3132:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3132:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3133:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3134:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3134:2: rule__KeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3144:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3148:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3149:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:3156:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3160:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:3161:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:3161:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:3162:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:3163:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:3163:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKiCool.g:3173:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3177:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalKiCool.g:3178:2: rule__KeyStringValueAnnotation__Group__3__Impl
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
    // InternalKiCool.g:3184:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3188:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKiCool.g:3189:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKiCool.g:3189:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalKiCool.g:3190:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:3191:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKiCool.g:3191:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    rule__KeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalKiCool.g:3209:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3213:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:3214:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalKiCool.g:3221:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3225:1: ( ( ',' ) )
            // InternalKiCool.g:3226:1: ( ',' )
            {
            // InternalKiCool.g:3226:1: ( ',' )
            // InternalKiCool.g:3227:1: ','
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
    // InternalKiCool.g:3240:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3244:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:3245:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKiCool.g:3251:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3255:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:3256:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:3256:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:3257:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:3258:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:3258:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKiCool.g:3272:1: rule__RestrictedKeyStringValueAnnotation__Group__0 : rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3276:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3277:2: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:3284:1: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3288:1: ( ( '@' ) )
            // InternalKiCool.g:3289:1: ( '@' )
            {
            // InternalKiCool.g:3289:1: ( '@' )
            // InternalKiCool.g:3290:1: '@'
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
    // InternalKiCool.g:3303:1: rule__RestrictedKeyStringValueAnnotation__Group__1 : rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3307:1: ( rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3308:2: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalKiCool.g:3315:1: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3319:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3320:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3320:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3321:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3322:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3322:2: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3332:1: rule__RestrictedKeyStringValueAnnotation__Group__2 : rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3336:1: ( rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3337:2: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:3344:1: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3348:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:3349:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:3349:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:3350:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:3351:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:3351:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKiCool.g:3361:1: rule__RestrictedKeyStringValueAnnotation__Group__3 : rule__RestrictedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3365:1: ( rule__RestrictedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKiCool.g:3366:2: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKiCool.g:3372:1: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3376:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKiCool.g:3377:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKiCool.g:3377:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKiCool.g:3378:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:3379:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKiCool.g:3379:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    rule__RestrictedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalKiCool.g:3397:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0 : rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3401:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:3402:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalKiCool.g:3409:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3413:1: ( ( ',' ) )
            // InternalKiCool.g:3414:1: ( ',' )
            {
            // InternalKiCool.g:3414:1: ( ',' )
            // InternalKiCool.g:3415:1: ','
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
    // InternalKiCool.g:3428:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1 : rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3432:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:3433:2: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKiCool.g:3439:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3443:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:3444:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:3444:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:3445:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:3446:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:3446:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKiCool.g:3460:1: rule__StringPragma__Group__0 : rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 ;
    public final void rule__StringPragma__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3464:1: ( rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 )
            // InternalKiCool.g:3465:2: rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalKiCool.g:3472:1: rule__StringPragma__Group__0__Impl : ( '#' ) ;
    public final void rule__StringPragma__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3476:1: ( ( '#' ) )
            // InternalKiCool.g:3477:1: ( '#' )
            {
            // InternalKiCool.g:3477:1: ( '#' )
            // InternalKiCool.g:3478:1: '#'
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
    // InternalKiCool.g:3491:1: rule__StringPragma__Group__1 : rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 ;
    public final void rule__StringPragma__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3495:1: ( rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 )
            // InternalKiCool.g:3496:2: rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalKiCool.g:3503:1: rule__StringPragma__Group__1__Impl : ( ( rule__StringPragma__NameAssignment_1 ) ) ;
    public final void rule__StringPragma__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3507:1: ( ( ( rule__StringPragma__NameAssignment_1 ) ) )
            // InternalKiCool.g:3508:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3508:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            // InternalKiCool.g:3509:1: ( rule__StringPragma__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3510:1: ( rule__StringPragma__NameAssignment_1 )
            // InternalKiCool.g:3510:2: rule__StringPragma__NameAssignment_1
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
    // InternalKiCool.g:3520:1: rule__StringPragma__Group__2 : rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 ;
    public final void rule__StringPragma__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3524:1: ( rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 )
            // InternalKiCool.g:3525:2: rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:3532:1: rule__StringPragma__Group__2__Impl : ( ( rule__StringPragma__ValuesAssignment_2 ) ) ;
    public final void rule__StringPragma__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3536:1: ( ( ( rule__StringPragma__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:3537:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:3537:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            // InternalKiCool.g:3538:1: ( rule__StringPragma__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:3539:1: ( rule__StringPragma__ValuesAssignment_2 )
            // InternalKiCool.g:3539:2: rule__StringPragma__ValuesAssignment_2
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
    // InternalKiCool.g:3549:1: rule__StringPragma__Group__3 : rule__StringPragma__Group__3__Impl ;
    public final void rule__StringPragma__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3553:1: ( rule__StringPragma__Group__3__Impl )
            // InternalKiCool.g:3554:2: rule__StringPragma__Group__3__Impl
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
    // InternalKiCool.g:3560:1: rule__StringPragma__Group__3__Impl : ( ( rule__StringPragma__Group_3__0 )* ) ;
    public final void rule__StringPragma__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3564:1: ( ( ( rule__StringPragma__Group_3__0 )* ) )
            // InternalKiCool.g:3565:1: ( ( rule__StringPragma__Group_3__0 )* )
            {
            // InternalKiCool.g:3565:1: ( ( rule__StringPragma__Group_3__0 )* )
            // InternalKiCool.g:3566:1: ( rule__StringPragma__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getGroup_3()); 
            }
            // InternalKiCool.g:3567:1: ( rule__StringPragma__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKiCool.g:3567:2: rule__StringPragma__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    rule__StringPragma__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalKiCool.g:3585:1: rule__StringPragma__Group_3__0 : rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 ;
    public final void rule__StringPragma__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3589:1: ( rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 )
            // InternalKiCool.g:3590:2: rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalKiCool.g:3597:1: rule__StringPragma__Group_3__0__Impl : ( ',' ) ;
    public final void rule__StringPragma__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3601:1: ( ( ',' ) )
            // InternalKiCool.g:3602:1: ( ',' )
            {
            // InternalKiCool.g:3602:1: ( ',' )
            // InternalKiCool.g:3603:1: ','
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
    // InternalKiCool.g:3616:1: rule__StringPragma__Group_3__1 : rule__StringPragma__Group_3__1__Impl ;
    public final void rule__StringPragma__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3620:1: ( rule__StringPragma__Group_3__1__Impl )
            // InternalKiCool.g:3621:2: rule__StringPragma__Group_3__1__Impl
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
    // InternalKiCool.g:3627:1: rule__StringPragma__Group_3__1__Impl : ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) ;
    public final void rule__StringPragma__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3631:1: ( ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:3632:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:3632:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:3633:1: ( rule__StringPragma__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:3634:1: ( rule__StringPragma__ValuesAssignment_3_1 )
            // InternalKiCool.g:3634:2: rule__StringPragma__ValuesAssignment_3_1
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
    // InternalKiCool.g:3648:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3652:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3653:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:3660:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3664:1: ( ( '@' ) )
            // InternalKiCool.g:3665:1: ( '@' )
            {
            // InternalKiCool.g:3665:1: ( '@' )
            // InternalKiCool.g:3666:1: '@'
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
    // InternalKiCool.g:3679:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3683:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3684:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalKiCool.g:3691:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3695:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3696:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3696:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3697:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3698:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3698:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3708:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3712:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3713:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:3720:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3724:1: ( ( '[' ) )
            // InternalKiCool.g:3725:1: ( '[' )
            {
            // InternalKiCool.g:3725:1: ( '[' )
            // InternalKiCool.g:3726:1: '['
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
    // InternalKiCool.g:3739:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3743:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalKiCool.g:3744:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalKiCool.g:3751:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3755:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKiCool.g:3756:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKiCool.g:3756:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKiCool.g:3757:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKiCool.g:3758:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKiCool.g:3758:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKiCool.g:3768:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3772:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalKiCool.g:3773:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalKiCool.g:3780:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3784:1: ( ( ']' ) )
            // InternalKiCool.g:3785:1: ( ']' )
            {
            // InternalKiCool.g:3785:1: ( ']' )
            // InternalKiCool.g:3786:1: ']'
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
    // InternalKiCool.g:3799:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3803:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalKiCool.g:3804:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:3811:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3815:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKiCool.g:3816:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKiCool.g:3816:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKiCool.g:3817:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKiCool.g:3818:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKiCool.g:3818:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKiCool.g:3828:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3832:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKiCool.g:3833:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKiCool.g:3839:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3843:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKiCool.g:3844:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKiCool.g:3844:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKiCool.g:3845:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKiCool.g:3846:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKiCool.g:3846:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalKiCool.g:3870:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3874:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKiCool.g:3875:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalKiCool.g:3882:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3886:1: ( ( ',' ) )
            // InternalKiCool.g:3887:1: ( ',' )
            {
            // InternalKiCool.g:3887:1: ( ',' )
            // InternalKiCool.g:3888:1: ','
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
    // InternalKiCool.g:3901:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3905:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKiCool.g:3906:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKiCool.g:3912:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3916:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKiCool.g:3917:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKiCool.g:3917:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKiCool.g:3918:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKiCool.g:3919:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKiCool.g:3919:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKiCool.g:3933:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3937:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3938:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:3945:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3949:1: ( ( '@' ) )
            // InternalKiCool.g:3950:1: ( '@' )
            {
            // InternalKiCool.g:3950:1: ( '@' )
            // InternalKiCool.g:3951:1: '@'
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
    // InternalKiCool.g:3964:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3968:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3969:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalKiCool.g:3976:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3980:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3981:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3981:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3982:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3983:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3983:2: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3993:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2 : rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3997:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3998:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:4005:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4009:1: ( ( '[' ) )
            // InternalKiCool.g:4010:1: ( '[' )
            {
            // InternalKiCool.g:4010:1: ( '[' )
            // InternalKiCool.g:4011:1: '['
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
    // InternalKiCool.g:4024:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3 : rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4028:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKiCool.g:4029:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalKiCool.g:4036:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4040:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKiCool.g:4041:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKiCool.g:4041:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKiCool.g:4042:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKiCool.g:4043:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKiCool.g:4043:2: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKiCool.g:4053:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4 : rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4057:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKiCool.g:4058:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalKiCool.g:4065:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4069:1: ( ( ']' ) )
            // InternalKiCool.g:4070:1: ( ']' )
            {
            // InternalKiCool.g:4070:1: ( ']' )
            // InternalKiCool.g:4071:1: ']'
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
    // InternalKiCool.g:4084:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5 : rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4088:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKiCool.g:4089:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:4096:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4100:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKiCool.g:4101:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKiCool.g:4101:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKiCool.g:4102:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKiCool.g:4103:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKiCool.g:4103:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKiCool.g:4113:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6 : rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4117:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKiCool.g:4118:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKiCool.g:4124:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4128:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKiCool.g:4129:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKiCool.g:4129:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKiCool.g:4130:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKiCool.g:4131:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKiCool.g:4131:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalKiCool.g:4155:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4159:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKiCool.g:4160:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalKiCool.g:4167:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4171:1: ( ( ',' ) )
            // InternalKiCool.g:4172:1: ( ',' )
            {
            // InternalKiCool.g:4172:1: ( ',' )
            // InternalKiCool.g:4173:1: ','
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
    // InternalKiCool.g:4186:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4190:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKiCool.g:4191:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKiCool.g:4197:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4201:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKiCool.g:4202:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKiCool.g:4202:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKiCool.g:4203:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKiCool.g:4204:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKiCool.g:4204:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKiCool.g:4218:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4222:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:4223:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:4230:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4234:1: ( ( '@' ) )
            // InternalKiCool.g:4235:1: ( '@' )
            {
            // InternalKiCool.g:4235:1: ( '@' )
            // InternalKiCool.g:4236:1: '@'
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
    // InternalKiCool.g:4249:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4253:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:4254:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKiCool.g:4261:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4265:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:4266:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:4266:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:4267:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:4268:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:4268:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:4278:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4282:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:4283:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:4290:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4294:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:4295:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:4295:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:4296:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:4297:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:4297:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKiCool.g:4307:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4311:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKiCool.g:4312:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKiCool.g:4318:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4322:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKiCool.g:4323:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKiCool.g:4323:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKiCool.g:4324:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:4325:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKiCool.g:4325:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalKiCool.g:4343:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4347:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:4348:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKiCool.g:4355:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4359:1: ( ( ',' ) )
            // InternalKiCool.g:4360:1: ( ',' )
            {
            // InternalKiCool.g:4360:1: ( ',' )
            // InternalKiCool.g:4361:1: ','
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
    // InternalKiCool.g:4374:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4378:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:4379:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKiCool.g:4385:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4389:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:4390:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:4390:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:4391:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:4392:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:4392:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKiCool.g:4406:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4410:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:4411:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:4418:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4422:1: ( ( '@' ) )
            // InternalKiCool.g:4423:1: ( '@' )
            {
            // InternalKiCool.g:4423:1: ( '@' )
            // InternalKiCool.g:4424:1: '@'
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
    // InternalKiCool.g:4437:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4441:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:4442:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalKiCool.g:4449:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4453:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:4454:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:4454:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:4455:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:4456:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:4456:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:4466:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4470:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:4471:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:4478:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4482:1: ( ( '[' ) )
            // InternalKiCool.g:4483:1: ( '[' )
            {
            // InternalKiCool.g:4483:1: ( '[' )
            // InternalKiCool.g:4484:1: '['
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
    // InternalKiCool.g:4497:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4501:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKiCool.g:4502:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalKiCool.g:4509:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4513:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKiCool.g:4514:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKiCool.g:4514:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKiCool.g:4515:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKiCool.g:4516:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKiCool.g:4516:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKiCool.g:4526:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4530:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKiCool.g:4531:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKiCool.g:4538:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4542:1: ( ( ']' ) )
            // InternalKiCool.g:4543:1: ( ']' )
            {
            // InternalKiCool.g:4543:1: ( ']' )
            // InternalKiCool.g:4544:1: ']'
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
    // InternalKiCool.g:4557:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4561:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKiCool.g:4562:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_24);
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
    // InternalKiCool.g:4569:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4573:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKiCool.g:4574:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKiCool.g:4574:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKiCool.g:4575:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKiCool.g:4576:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKiCool.g:4576:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKiCool.g:4586:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4590:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKiCool.g:4591:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKiCool.g:4597:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4601:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKiCool.g:4602:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKiCool.g:4602:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKiCool.g:4603:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKiCool.g:4604:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKiCool.g:4604:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalKiCool.g:4628:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4632:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKiCool.g:4633:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalKiCool.g:4640:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4644:1: ( ( ',' ) )
            // InternalKiCool.g:4645:1: ( ',' )
            {
            // InternalKiCool.g:4645:1: ( ',' )
            // InternalKiCool.g:4646:1: ','
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
    // InternalKiCool.g:4659:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4663:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKiCool.g:4664:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKiCool.g:4670:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4674:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKiCool.g:4675:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKiCool.g:4675:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKiCool.g:4676:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKiCool.g:4677:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKiCool.g:4677:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKiCool.g:4691:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4695:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalKiCool.g:4696:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalKiCool.g:4703:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4707:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4708:1: ( RULE_ID )
            {
            // InternalKiCool.g:4708:1: ( RULE_ID )
            // InternalKiCool.g:4709:1: RULE_ID
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
    // InternalKiCool.g:4720:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4724:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalKiCool.g:4725:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalKiCool.g:4732:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4736:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // InternalKiCool.g:4737:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // InternalKiCool.g:4737:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // InternalKiCool.g:4738:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // InternalKiCool.g:4739:1: ( rule__ExtendedID__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==17) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==RULE_ID) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalKiCool.g:4739:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalKiCool.g:4749:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4753:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalKiCool.g:4754:2: rule__ExtendedID__Group__2__Impl
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
    // InternalKiCool.g:4760:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4764:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalKiCool.g:4765:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalKiCool.g:4765:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalKiCool.g:4766:1: ( rule__ExtendedID__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            }
            // InternalKiCool.g:4767:1: ( rule__ExtendedID__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKiCool.g:4767:2: rule__ExtendedID__Group_2__0
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
    // InternalKiCool.g:4783:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4787:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // InternalKiCool.g:4788:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
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
    // InternalKiCool.g:4795:1: rule__ExtendedID__Group_1__0__Impl : ( ( rule__ExtendedID__Alternatives_1_0 ) ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4799:1: ( ( ( rule__ExtendedID__Alternatives_1_0 ) ) )
            // InternalKiCool.g:4800:1: ( ( rule__ExtendedID__Alternatives_1_0 ) )
            {
            // InternalKiCool.g:4800:1: ( ( rule__ExtendedID__Alternatives_1_0 ) )
            // InternalKiCool.g:4801:1: ( rule__ExtendedID__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getAlternatives_1_0()); 
            }
            // InternalKiCool.g:4802:1: ( rule__ExtendedID__Alternatives_1_0 )
            // InternalKiCool.g:4802:2: rule__ExtendedID__Alternatives_1_0
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
    // InternalKiCool.g:4812:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4816:1: ( rule__ExtendedID__Group_1__1__Impl )
            // InternalKiCool.g:4817:2: rule__ExtendedID__Group_1__1__Impl
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
    // InternalKiCool.g:4823:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4827:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4828:1: ( RULE_ID )
            {
            // InternalKiCool.g:4828:1: ( RULE_ID )
            // InternalKiCool.g:4829:1: RULE_ID
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
    // InternalKiCool.g:4844:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4848:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalKiCool.g:4849:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
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
    // InternalKiCool.g:4856:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4860:1: ( ( '#' ) )
            // InternalKiCool.g:4861:1: ( '#' )
            {
            // InternalKiCool.g:4861:1: ( '#' )
            // InternalKiCool.g:4862:1: '#'
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
    // InternalKiCool.g:4875:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4879:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalKiCool.g:4880:2: rule__ExtendedID__Group_2__1__Impl
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
    // InternalKiCool.g:4886:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4890:1: ( ( RULE_INT ) )
            // InternalKiCool.g:4891:1: ( RULE_INT )
            {
            // InternalKiCool.g:4891:1: ( RULE_INT )
            // InternalKiCool.g:4892:1: RULE_INT
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
    // InternalKiCool.g:4907:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4911:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // InternalKiCool.g:4912:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
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
    // InternalKiCool.g:4919:1: rule__QualifiedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4923:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4924:1: ( RULE_ID )
            {
            // InternalKiCool.g:4924:1: ( RULE_ID )
            // InternalKiCool.g:4925:1: RULE_ID
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
    // InternalKiCool.g:4936:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4940:1: ( rule__QualifiedID__Group__1__Impl )
            // InternalKiCool.g:4941:2: rule__QualifiedID__Group__1__Impl
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
    // InternalKiCool.g:4947:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4951:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // InternalKiCool.g:4952:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // InternalKiCool.g:4952:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // InternalKiCool.g:4953:1: ( rule__QualifiedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            }
            // InternalKiCool.g:4954:1: ( rule__QualifiedID__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==16) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKiCool.g:4954:2: rule__QualifiedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    rule__QualifiedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalKiCool.g:4968:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4972:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // InternalKiCool.g:4973:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
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
    // InternalKiCool.g:4980:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4984:1: ( ( '.' ) )
            // InternalKiCool.g:4985:1: ( '.' )
            {
            // InternalKiCool.g:4985:1: ( '.' )
            // InternalKiCool.g:4986:1: '.'
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
    // InternalKiCool.g:4999:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5003:1: ( rule__QualifiedID__Group_1__1__Impl )
            // InternalKiCool.g:5004:2: rule__QualifiedID__Group_1__1__Impl
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
    // InternalKiCool.g:5010:1: rule__QualifiedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5014:1: ( ( RULE_ID ) )
            // InternalKiCool.g:5015:1: ( RULE_ID )
            {
            // InternalKiCool.g:5015:1: ( RULE_ID )
            // InternalKiCool.g:5016:1: RULE_ID
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
    // InternalKiCool.g:5031:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5035:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalKiCool.g:5036:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_33);
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
    // InternalKiCool.g:5043:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5047:1: ( ( ( '-' )? ) )
            // InternalKiCool.g:5048:1: ( ( '-' )? )
            {
            // InternalKiCool.g:5048:1: ( ( '-' )? )
            // InternalKiCool.g:5049:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKiCool.g:5050:1: ( '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKiCool.g:5051:2: '-'
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
    // InternalKiCool.g:5062:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5066:1: ( rule__Integer__Group__1__Impl )
            // InternalKiCool.g:5067:2: rule__Integer__Group__1__Impl
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
    // InternalKiCool.g:5073:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5077:1: ( ( RULE_INT ) )
            // InternalKiCool.g:5078:1: ( RULE_INT )
            {
            // InternalKiCool.g:5078:1: ( RULE_INT )
            // InternalKiCool.g:5079:1: RULE_INT
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
    // InternalKiCool.g:5094:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5098:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalKiCool.g:5099:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalKiCool.g:5106:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5110:1: ( ( ( '-' )? ) )
            // InternalKiCool.g:5111:1: ( ( '-' )? )
            {
            // InternalKiCool.g:5111:1: ( ( '-' )? )
            // InternalKiCool.g:5112:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKiCool.g:5113:1: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==17) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKiCool.g:5114:2: '-'
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
    // InternalKiCool.g:5125:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5129:1: ( rule__Floateger__Group__1__Impl )
            // InternalKiCool.g:5130:2: rule__Floateger__Group__1__Impl
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
    // InternalKiCool.g:5136:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5140:1: ( ( RULE_FLOAT ) )
            // InternalKiCool.g:5141:1: ( RULE_FLOAT )
            {
            // InternalKiCool.g:5141:1: ( RULE_FLOAT )
            // InternalKiCool.g:5142:1: RULE_FLOAT
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
    // InternalKiCool.g:5159:1: rule__System__IdAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__System__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5163:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5164:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:5164:1: ( ruleQualifiedID )
            // InternalKiCool.g:5165:1: ruleQualifiedID
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
    // InternalKiCool.g:5174:1: rule__System__VersionAssignment_3 : ( RULE_INT ) ;
    public final void rule__System__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5178:1: ( ( RULE_INT ) )
            // InternalKiCool.g:5179:1: ( RULE_INT )
            {
            // InternalKiCool.g:5179:1: ( RULE_INT )
            // InternalKiCool.g:5180:1: RULE_INT
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
    // InternalKiCool.g:5189:1: rule__System__LabelAssignment_5 : ( ruleEString ) ;
    public final void rule__System__LabelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5193:1: ( ( ruleEString ) )
            // InternalKiCool.g:5194:1: ( ruleEString )
            {
            // InternalKiCool.g:5194:1: ( ruleEString )
            // InternalKiCool.g:5195:1: ruleEString
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
    // InternalKiCool.g:5204:1: rule__System__InputClassAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__System__InputClassAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5208:1: ( ( RULE_ID ) )
            // InternalKiCool.g:5209:1: ( RULE_ID )
            {
            // InternalKiCool.g:5209:1: ( RULE_ID )
            // InternalKiCool.g:5210:1: RULE_ID
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


    // $ANTLR start "rule__System__StartsetsAssignment_7_1"
    // InternalKiCool.g:5219:1: rule__System__StartsetsAssignment_7_1 : ( ruleKVPair ) ;
    public final void rule__System__StartsetsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5223:1: ( ( ruleKVPair ) )
            // InternalKiCool.g:5224:1: ( ruleKVPair )
            {
            // InternalKiCool.g:5224:1: ( ruleKVPair )
            // InternalKiCool.g:5225:1: ruleKVPair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getStartsetsKVPairParserRuleCall_7_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleKVPair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getStartsetsKVPairParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__StartsetsAssignment_7_1"


    // $ANTLR start "rule__System__IntermediatesAssignment_8"
    // InternalKiCool.g:5234:1: rule__System__IntermediatesAssignment_8 : ( ruleIntermediateReference ) ;
    public final void rule__System__IntermediatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5238:1: ( ( ruleIntermediateReference ) )
            // InternalKiCool.g:5239:1: ( ruleIntermediateReference )
            {
            // InternalKiCool.g:5239:1: ( ruleIntermediateReference )
            // InternalKiCool.g:5240:1: ruleIntermediateReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getIntermediatesIntermediateReferenceParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleIntermediateReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getIntermediatesIntermediateReferenceParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__IntermediatesAssignment_8"


    // $ANTLR start "rule__System__ProcessorsAssignment_9"
    // InternalKiCool.g:5249:1: rule__System__ProcessorsAssignment_9 : ( ruleProcessorGroup ) ;
    public final void rule__System__ProcessorsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5253:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:5254:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:5254:1: ( ruleProcessorGroup )
            // InternalKiCool.g:5255:1: ruleProcessorGroup
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getProcessorsProcessorGroupParserRuleCall_9_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProcessorGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getProcessorsProcessorGroupParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ProcessorsAssignment_9"


    // $ANTLR start "rule__IntermediateReference__IdAssignment_1"
    // InternalKiCool.g:5264:1: rule__IntermediateReference__IdAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__IntermediateReference__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5268:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5269:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:5269:1: ( ruleQualifiedID )
            // InternalKiCool.g:5270:1: ruleQualifiedID
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
    // InternalKiCool.g:5279:1: rule__IntermediateReference__AliasAssignment_2_1 : ( ruleEString ) ;
    public final void rule__IntermediateReference__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5283:1: ( ( ruleEString ) )
            // InternalKiCool.g:5284:1: ( ruleEString )
            {
            // InternalKiCool.g:5284:1: ( ruleEString )
            // InternalKiCool.g:5285:1: ruleEString
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
    // InternalKiCool.g:5294:1: rule__ProcessorGroup__LabelAssignment_0_1 : ( ruleEString ) ;
    public final void rule__ProcessorGroup__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5298:1: ( ( ruleEString ) )
            // InternalKiCool.g:5299:1: ( ruleEString )
            {
            // InternalKiCool.g:5299:1: ( ruleEString )
            // InternalKiCool.g:5300:1: ruleEString
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
    // InternalKiCool.g:5309:1: rule__ProcessorGroup__ProcessorsAssignment_1_0 : ( ruleProcessor ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5313:1: ( ( ruleProcessor ) )
            // InternalKiCool.g:5314:1: ( ruleProcessor )
            {
            // InternalKiCool.g:5314:1: ( ruleProcessor )
            // InternalKiCool.g:5315:1: ruleProcessor
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
    // InternalKiCool.g:5324:1: rule__ProcessorGroup__ProcessorsAssignment_1_1_1 : ( ruleProcessorSystem ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5328:1: ( ( ruleProcessorSystem ) )
            // InternalKiCool.g:5329:1: ( ruleProcessorSystem )
            {
            // InternalKiCool.g:5329:1: ( ruleProcessorSystem )
            // InternalKiCool.g:5330:1: ruleProcessorSystem
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
    // InternalKiCool.g:5339:1: rule__ProcessorGroup__ProcessorsAssignment_1_2_1 : ( ruleProcessorAlternativeGroup ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5343:1: ( ( ruleProcessorAlternativeGroup ) )
            // InternalKiCool.g:5344:1: ( ruleProcessorAlternativeGroup )
            {
            // InternalKiCool.g:5344:1: ( ruleProcessorAlternativeGroup )
            // InternalKiCool.g:5345:1: ruleProcessorAlternativeGroup
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
    // InternalKiCool.g:5354:1: rule__ProcessorGroup__ProcessorsAssignment_1_3_1 : ( ruleProcessorGroup ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5358:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:5359:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:5359:1: ( ruleProcessorGroup )
            // InternalKiCool.g:5360:1: ruleProcessorGroup
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
    // InternalKiCool.g:5369:1: rule__Processor__PresetsAssignment_0_2 : ( ruleKVPair ) ;
    public final void rule__Processor__PresetsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5373:1: ( ( ruleKVPair ) )
            // InternalKiCool.g:5374:1: ( ruleKVPair )
            {
            // InternalKiCool.g:5374:1: ( ruleKVPair )
            // InternalKiCool.g:5375:1: ruleKVPair
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
    // InternalKiCool.g:5384:1: rule__Processor__PreprocessesAssignment_1_2 : ( ruleCoProcessor ) ;
    public final void rule__Processor__PreprocessesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5388:1: ( ( ruleCoProcessor ) )
            // InternalKiCool.g:5389:1: ( ruleCoProcessor )
            {
            // InternalKiCool.g:5389:1: ( ruleCoProcessor )
            // InternalKiCool.g:5390:1: ruleCoProcessor
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
    // InternalKiCool.g:5399:1: rule__Processor__IdAssignment_2 : ( ruleQualifiedID ) ;
    public final void rule__Processor__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5403:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5404:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:5404:1: ( ruleQualifiedID )
            // InternalKiCool.g:5405:1: ruleQualifiedID
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
    // InternalKiCool.g:5414:1: rule__Processor__MetricAssignment_3_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Processor__MetricAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5418:1: ( ( ( ruleQualifiedID ) ) )
            // InternalKiCool.g:5419:1: ( ( ruleQualifiedID ) )
            {
            // InternalKiCool.g:5419:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5420:1: ( ruleQualifiedID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getMetricIntermediateReferenceCrossReference_3_1_0()); 
            }
            // InternalKiCool.g:5421:1: ( ruleQualifiedID )
            // InternalKiCool.g:5422:1: ruleQualifiedID
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
    // InternalKiCool.g:5433:1: rule__Processor__PostprocessesAssignment_4_2 : ( ruleCoProcessor ) ;
    public final void rule__Processor__PostprocessesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5437:1: ( ( ruleCoProcessor ) )
            // InternalKiCool.g:5438:1: ( ruleCoProcessor )
            {
            // InternalKiCool.g:5438:1: ( ruleCoProcessor )
            // InternalKiCool.g:5439:1: ruleCoProcessor
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
    // InternalKiCool.g:5448:1: rule__Processor__PostsetsAssignment_5_2 : ( ruleKVPair ) ;
    public final void rule__Processor__PostsetsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5452:1: ( ( ruleKVPair ) )
            // InternalKiCool.g:5453:1: ( ruleKVPair )
            {
            // InternalKiCool.g:5453:1: ( ruleKVPair )
            // InternalKiCool.g:5454:1: ruleKVPair
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
    // InternalKiCool.g:5463:1: rule__CoProcessor__IdAssignment_0 : ( ruleQualifiedID ) ;
    public final void rule__CoProcessor__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5467:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5468:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:5468:1: ( ruleQualifiedID )
            // InternalKiCool.g:5469:1: ruleQualifiedID
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
    // InternalKiCool.g:5478:1: rule__CoProcessor__SilentAssignment_1 : ( ( 'silent' ) ) ;
    public final void rule__CoProcessor__SilentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5482:1: ( ( ( 'silent' ) ) )
            // InternalKiCool.g:5483:1: ( ( 'silent' ) )
            {
            // InternalKiCool.g:5483:1: ( ( 'silent' ) )
            // InternalKiCool.g:5484:1: ( 'silent' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoProcessorAccess().getSilentSilentKeyword_1_0()); 
            }
            // InternalKiCool.g:5485:1: ( 'silent' )
            // InternalKiCool.g:5486:1: 'silent'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoProcessorAccess().getSilentSilentKeyword_1_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:5501:1: rule__ProcessorSystem__IdAssignment : ( ruleQualifiedID ) ;
    public final void rule__ProcessorSystem__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5505:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5506:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:5506:1: ( ruleQualifiedID )
            // InternalKiCool.g:5507:1: ruleQualifiedID
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
    // InternalKiCool.g:5516:1: rule__ProcessorAlternativeGroup__LabelAssignment_0_1 : ( ruleEString ) ;
    public final void rule__ProcessorAlternativeGroup__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5520:1: ( ( ruleEString ) )
            // InternalKiCool.g:5521:1: ( ruleEString )
            {
            // InternalKiCool.g:5521:1: ( ruleEString )
            // InternalKiCool.g:5522:1: ruleEString
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
    // InternalKiCool.g:5531:1: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 : ( ruleProcessorGroup ) ;
    public final void rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5535:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:5536:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:5536:1: ( ruleProcessorGroup )
            // InternalKiCool.g:5537:1: ruleProcessorGroup
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
    // InternalKiCool.g:5546:1: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 : ( ruleProcessorGroup ) ;
    public final void rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5550:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:5551:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:5551:1: ( ruleProcessorGroup )
            // InternalKiCool.g:5552:1: ruleProcessorGroup
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
    // InternalKiCool.g:5561:1: rule__KVPair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KVPair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5565:1: ( ( ruleEString ) )
            // InternalKiCool.g:5566:1: ( ruleEString )
            {
            // InternalKiCool.g:5566:1: ( ruleEString )
            // InternalKiCool.g:5567:1: ruleEString
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
    // InternalKiCool.g:5576:1: rule__KVPair__IsKeyValueAssignment_1 : ( ( 'key' ) ) ;
    public final void rule__KVPair__IsKeyValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5580:1: ( ( ( 'key' ) ) )
            // InternalKiCool.g:5581:1: ( ( 'key' ) )
            {
            // InternalKiCool.g:5581:1: ( ( 'key' ) )
            // InternalKiCool.g:5582:1: ( 'key' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getIsKeyValueKeyKeyword_1_0()); 
            }
            // InternalKiCool.g:5583:1: ( 'key' )
            // InternalKiCool.g:5584:1: 'key'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getIsKeyValueKeyKeyword_1_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:5599:1: rule__KVPair__ValueAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KVPair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5603:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5604:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5604:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5605:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5614:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5618:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalKiCool.g:5619:1: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalKiCool.g:5619:1: ( RULE_COMMENT_ANNOTATION )
            // InternalKiCool.g:5620:1: RULE_COMMENT_ANNOTATION
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
    // InternalKiCool.g:5630:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5634:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5635:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5635:1: ( ruleExtendedID )
            // InternalKiCool.g:5636:1: ruleExtendedID
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
    // InternalKiCool.g:5645:1: rule__PragmaTag__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__PragmaTag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5649:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5650:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5650:1: ( ruleExtendedID )
            // InternalKiCool.g:5651:1: ruleExtendedID
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
    // InternalKiCool.g:5660:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5664:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5665:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5665:1: ( ruleExtendedID )
            // InternalKiCool.g:5666:1: ruleExtendedID
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
    // InternalKiCool.g:5675:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5679:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5680:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5680:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5681:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5690:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5694:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5695:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5695:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5696:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5705:1: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5709:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5710:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5710:1: ( ruleExtendedID )
            // InternalKiCool.g:5711:1: ruleExtendedID
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
    // InternalKiCool.g:5720:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5724:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5725:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5725:1: ( ruleEStringBoolean )
            // InternalKiCool.g:5726:1: ruleEStringBoolean
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
    // InternalKiCool.g:5735:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5739:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5740:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5740:1: ( ruleEStringBoolean )
            // InternalKiCool.g:5741:1: ruleEStringBoolean
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
    // InternalKiCool.g:5750:1: rule__StringPragma__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__StringPragma__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5754:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5755:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5755:1: ( ruleExtendedID )
            // InternalKiCool.g:5756:1: ruleExtendedID
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
    // InternalKiCool.g:5765:1: rule__StringPragma__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5769:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5770:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5770:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5771:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5780:1: rule__StringPragma__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5784:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5785:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5785:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5786:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5795:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5799:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5800:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5800:1: ( ruleExtendedID )
            // InternalKiCool.g:5801:1: ruleExtendedID
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
    // InternalKiCool.g:5810:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5814:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5815:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5815:1: ( ruleExtendedID )
            // InternalKiCool.g:5816:1: ruleExtendedID
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
    // InternalKiCool.g:5825:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5829:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5830:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5830:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5831:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5840:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5844:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5845:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5845:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5846:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5855:1: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5859:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5860:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5860:1: ( ruleExtendedID )
            // InternalKiCool.g:5861:1: ruleExtendedID
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
    // InternalKiCool.g:5870:1: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5874:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5875:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5875:1: ( ruleExtendedID )
            // InternalKiCool.g:5876:1: ruleExtendedID
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
    // InternalKiCool.g:5885:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5889:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5890:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5890:1: ( ruleEStringBoolean )
            // InternalKiCool.g:5891:1: ruleEStringBoolean
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
    // InternalKiCool.g:5900:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5904:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5905:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5905:1: ( ruleEStringBoolean )
            // InternalKiCool.g:5906:1: ruleEStringBoolean
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
    // InternalKiCool.g:5915:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5919:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5920:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5920:1: ( ruleExtendedID )
            // InternalKiCool.g:5921:1: ruleExtendedID
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
    // InternalKiCool.g:5930:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5934:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:5935:1: ( RULE_STRING )
            {
            // InternalKiCool.g:5935:1: ( RULE_STRING )
            // InternalKiCool.g:5936:1: RULE_STRING
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
    // InternalKiCool.g:5945:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5949:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:5950:1: ( RULE_STRING )
            {
            // InternalKiCool.g:5950:1: ( RULE_STRING )
            // InternalKiCool.g:5951:1: RULE_STRING
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
    // InternalKiCool.g:5960:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5964:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5965:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5965:1: ( ruleExtendedID )
            // InternalKiCool.g:5966:1: ruleExtendedID
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
    // InternalKiCool.g:5975:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5979:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5980:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5980:1: ( ruleExtendedID )
            // InternalKiCool.g:5981:1: ruleExtendedID
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
    // InternalKiCool.g:5990:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5994:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:5995:1: ( RULE_STRING )
            {
            // InternalKiCool.g:5995:1: ( RULE_STRING )
            // InternalKiCool.g:5996:1: RULE_STRING
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
    // InternalKiCool.g:6005:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:6009:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:6010:1: ( RULE_STRING )
            {
            // InternalKiCool.g:6010:1: ( RULE_STRING )
            // InternalKiCool.g:6011:1: RULE_STRING
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

    // $ANTLR start synpred24_InternalKiCool
    public final void synpred24_InternalKiCool_fragment() throws RecognitionException {   
        // InternalKiCool.g:2630:2: ( rule__ProcessorAlternativeGroup__Group_0__0 )
        // InternalKiCool.g:2630:2: rule__ProcessorAlternativeGroup__Group_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__ProcessorAlternativeGroup__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalKiCool

    // Delegated rules

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
    public final boolean synpred24_InternalKiCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalKiCool_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000AF40040L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000AF40042L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020800000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000008000201F0L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100030000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000030002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000020080L});
    }


}