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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT_ANNOTATION", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'-'", "'system'", "'version'", "'label'", "'input'", "'set'", "'intermediate'", "'alias'", "'['", "']'", "'pre'", "'post'", "'|'", "'@'", "'#'", "','", "'key'"
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
    // InternalKiCool.g:297:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:298:1: ( ruleTagAnnotation EOF )
            // InternalKiCool.g:299:1: ruleTagAnnotation EOF
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
    // InternalKiCool.g:306:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:310:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // InternalKiCool.g:311:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:311:1: ( ( rule__TagAnnotation__Group__0 ) )
            // InternalKiCool.g:312:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:313:1: ( rule__TagAnnotation__Group__0 )
            // InternalKiCool.g:313:2: rule__TagAnnotation__Group__0
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
    // InternalKiCool.g:325:1: entryRulePragmaTag : rulePragmaTag EOF ;
    public final void entryRulePragmaTag() throws RecognitionException {
        try {
            // InternalKiCool.g:326:1: ( rulePragmaTag EOF )
            // InternalKiCool.g:327:1: rulePragmaTag EOF
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
    // InternalKiCool.g:334:1: rulePragmaTag : ( ( rule__PragmaTag__Group__0 ) ) ;
    public final void rulePragmaTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:338:2: ( ( ( rule__PragmaTag__Group__0 ) ) )
            // InternalKiCool.g:339:1: ( ( rule__PragmaTag__Group__0 ) )
            {
            // InternalKiCool.g:339:1: ( ( rule__PragmaTag__Group__0 ) )
            // InternalKiCool.g:340:1: ( rule__PragmaTag__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getGroup()); 
            }
            // InternalKiCool.g:341:1: ( rule__PragmaTag__Group__0 )
            // InternalKiCool.g:341:2: rule__PragmaTag__Group__0
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
    // InternalKiCool.g:353:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:354:1: ( ruleKeyStringValueAnnotation EOF )
            // InternalKiCool.g:355:1: ruleKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:362:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:366:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:367:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:367:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:368:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:369:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:369:2: rule__KeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:381:1: entryRuleRestrictedKeyStringValueAnnotation : ruleRestrictedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:382:1: ( ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:383:1: ruleRestrictedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:390:1: ruleRestrictedKeyStringValueAnnotation : ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:394:2: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:395:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:395:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:396:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:397:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:397:2: rule__RestrictedKeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:409:1: entryRuleStringPragma : ruleStringPragma EOF ;
    public final void entryRuleStringPragma() throws RecognitionException {
        try {
            // InternalKiCool.g:410:1: ( ruleStringPragma EOF )
            // InternalKiCool.g:411:1: ruleStringPragma EOF
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
    // InternalKiCool.g:418:1: ruleStringPragma : ( ( rule__StringPragma__Group__0 ) ) ;
    public final void ruleStringPragma() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:422:2: ( ( ( rule__StringPragma__Group__0 ) ) )
            // InternalKiCool.g:423:1: ( ( rule__StringPragma__Group__0 ) )
            {
            // InternalKiCool.g:423:1: ( ( rule__StringPragma__Group__0 ) )
            // InternalKiCool.g:424:1: ( rule__StringPragma__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getGroup()); 
            }
            // InternalKiCool.g:425:1: ( rule__StringPragma__Group__0 )
            // InternalKiCool.g:425:2: rule__StringPragma__Group__0
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
    // InternalKiCool.g:437:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:438:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:439:1: ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:446:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:450:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:451:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:451:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:452:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:453:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:453:2: rule__TypedKeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:465:1: entryRuleRestrictedTypedKeyStringValueAnnotation : ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:466:1: ( ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:467:1: ruleRestrictedTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:474:1: ruleRestrictedTypedKeyStringValueAnnotation : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:478:2: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:479:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:479:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:480:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:481:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:481:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:493:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:494:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:495:1: ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:502:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:506:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:507:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:507:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:508:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:509:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:509:2: rule__QuotedKeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:521:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:522:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:523:1: ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:530:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:534:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:535:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:535:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:536:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:537:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:537:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:549:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKiCool.g:550:1: ( ruleEString EOF )
            // InternalKiCool.g:551:1: ruleEString EOF
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
    // InternalKiCool.g:558:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:562:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalKiCool.g:563:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalKiCool.g:563:1: ( ( rule__EString__Alternatives ) )
            // InternalKiCool.g:564:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalKiCool.g:565:1: ( rule__EString__Alternatives )
            // InternalKiCool.g:565:2: rule__EString__Alternatives
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
    // InternalKiCool.g:577:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // InternalKiCool.g:578:1: ( ruleEStringBoolean EOF )
            // InternalKiCool.g:579:1: ruleEStringBoolean EOF
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
    // InternalKiCool.g:586:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:590:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // InternalKiCool.g:591:1: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // InternalKiCool.g:591:1: ( ( rule__EStringBoolean__Alternatives ) )
            // InternalKiCool.g:592:1: ( rule__EStringBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            }
            // InternalKiCool.g:593:1: ( rule__EStringBoolean__Alternatives )
            // InternalKiCool.g:593:2: rule__EStringBoolean__Alternatives
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
    // InternalKiCool.g:605:1: entryRuleEStringAllTypes : ruleEStringAllTypes EOF ;
    public final void entryRuleEStringAllTypes() throws RecognitionException {
        try {
            // InternalKiCool.g:606:1: ( ruleEStringAllTypes EOF )
            // InternalKiCool.g:607:1: ruleEStringAllTypes EOF
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
    // InternalKiCool.g:614:1: ruleEStringAllTypes : ( ( rule__EStringAllTypes__Alternatives ) ) ;
    public final void ruleEStringAllTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:618:2: ( ( ( rule__EStringAllTypes__Alternatives ) ) )
            // InternalKiCool.g:619:1: ( ( rule__EStringAllTypes__Alternatives ) )
            {
            // InternalKiCool.g:619:1: ( ( rule__EStringAllTypes__Alternatives ) )
            // InternalKiCool.g:620:1: ( rule__EStringAllTypes__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAllTypesAccess().getAlternatives()); 
            }
            // InternalKiCool.g:621:1: ( rule__EStringAllTypes__Alternatives )
            // InternalKiCool.g:621:2: rule__EStringAllTypes__Alternatives
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
    // InternalKiCool.g:633:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // InternalKiCool.g:634:1: ( ruleExtendedID EOF )
            // InternalKiCool.g:635:1: ruleExtendedID EOF
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
    // InternalKiCool.g:642:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:646:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // InternalKiCool.g:647:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // InternalKiCool.g:647:1: ( ( rule__ExtendedID__Group__0 ) )
            // InternalKiCool.g:648:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // InternalKiCool.g:649:1: ( rule__ExtendedID__Group__0 )
            // InternalKiCool.g:649:2: rule__ExtendedID__Group__0
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
    // InternalKiCool.g:661:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // InternalKiCool.g:662:1: ( ruleQualifiedID EOF )
            // InternalKiCool.g:663:1: ruleQualifiedID EOF
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
    // InternalKiCool.g:670:1: ruleQualifiedID : ( ( rule__QualifiedID__Group__0 ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:674:2: ( ( ( rule__QualifiedID__Group__0 ) ) )
            // InternalKiCool.g:675:1: ( ( rule__QualifiedID__Group__0 ) )
            {
            // InternalKiCool.g:675:1: ( ( rule__QualifiedID__Group__0 ) )
            // InternalKiCool.g:676:1: ( rule__QualifiedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedIDAccess().getGroup()); 
            }
            // InternalKiCool.g:677:1: ( rule__QualifiedID__Group__0 )
            // InternalKiCool.g:677:2: rule__QualifiedID__Group__0
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
    // InternalKiCool.g:689:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalKiCool.g:690:1: ( ruleInteger EOF )
            // InternalKiCool.g:691:1: ruleInteger EOF
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
    // InternalKiCool.g:698:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:702:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalKiCool.g:703:1: ( ( rule__Integer__Group__0 ) )
            {
            // InternalKiCool.g:703:1: ( ( rule__Integer__Group__0 ) )
            // InternalKiCool.g:704:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // InternalKiCool.g:705:1: ( rule__Integer__Group__0 )
            // InternalKiCool.g:705:2: rule__Integer__Group__0
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
    // InternalKiCool.g:717:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // InternalKiCool.g:718:1: ( ruleFloateger EOF )
            // InternalKiCool.g:719:1: ruleFloateger EOF
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
    // InternalKiCool.g:726:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:730:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // InternalKiCool.g:731:1: ( ( rule__Floateger__Group__0 ) )
            {
            // InternalKiCool.g:731:1: ( ( rule__Floateger__Group__0 ) )
            // InternalKiCool.g:732:1: ( rule__Floateger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getGroup()); 
            }
            // InternalKiCool.g:733:1: ( rule__Floateger__Group__0 )
            // InternalKiCool.g:733:2: rule__Floateger__Group__0
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
    // InternalKiCool.g:745:1: rule__ProcessorGroup__Alternatives_1 : ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) ) | ( ( rule__ProcessorGroup__Group_1_1__0 ) ) | ( ( rule__ProcessorGroup__Group_1_2__0 ) ) | ( ( rule__ProcessorGroup__Group_1_3__0 ) ) );
    public final void rule__ProcessorGroup__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:749:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) ) | ( ( rule__ProcessorGroup__Group_1_1__0 ) ) | ( ( rule__ProcessorGroup__Group_1_2__0 ) ) | ( ( rule__ProcessorGroup__Group_1_3__0 ) ) )
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
                    // InternalKiCool.g:750:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) )
                    {
                    // InternalKiCool.g:750:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) )
                    // InternalKiCool.g:751:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_0()); 
                    }
                    // InternalKiCool.g:752:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_0 )
                    // InternalKiCool.g:752:2: rule__ProcessorGroup__ProcessorsAssignment_1_0
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
                    // InternalKiCool.g:756:6: ( ( rule__ProcessorGroup__Group_1_1__0 ) )
                    {
                    // InternalKiCool.g:756:6: ( ( rule__ProcessorGroup__Group_1_1__0 ) )
                    // InternalKiCool.g:757:1: ( rule__ProcessorGroup__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getGroup_1_1()); 
                    }
                    // InternalKiCool.g:758:1: ( rule__ProcessorGroup__Group_1_1__0 )
                    // InternalKiCool.g:758:2: rule__ProcessorGroup__Group_1_1__0
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
                    // InternalKiCool.g:762:6: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
                    {
                    // InternalKiCool.g:762:6: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
                    // InternalKiCool.g:763:1: ( rule__ProcessorGroup__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getGroup_1_2()); 
                    }
                    // InternalKiCool.g:764:1: ( rule__ProcessorGroup__Group_1_2__0 )
                    // InternalKiCool.g:764:2: rule__ProcessorGroup__Group_1_2__0
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
                    // InternalKiCool.g:768:6: ( ( rule__ProcessorGroup__Group_1_3__0 ) )
                    {
                    // InternalKiCool.g:768:6: ( ( rule__ProcessorGroup__Group_1_3__0 ) )
                    // InternalKiCool.g:769:1: ( rule__ProcessorGroup__Group_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getGroup_1_3()); 
                    }
                    // InternalKiCool.g:770:1: ( rule__ProcessorGroup__Group_1_3__0 )
                    // InternalKiCool.g:770:2: rule__ProcessorGroup__Group_1_3__0
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
    // InternalKiCool.g:784:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:788:1: ( ( RULE_STRING ) | ( ruleExtendedID ) )
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
                    // InternalKiCool.g:789:1: ( RULE_STRING )
                    {
                    // InternalKiCool.g:789:1: ( RULE_STRING )
                    // InternalKiCool.g:790:1: RULE_STRING
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
                    // InternalKiCool.g:795:6: ( ruleExtendedID )
                    {
                    // InternalKiCool.g:795:6: ( ruleExtendedID )
                    // InternalKiCool.g:796:1: ruleExtendedID
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
    // InternalKiCool.g:806:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:810:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
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
                    // InternalKiCool.g:811:1: ( RULE_STRING )
                    {
                    // InternalKiCool.g:811:1: ( RULE_STRING )
                    // InternalKiCool.g:812:1: RULE_STRING
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
                    // InternalKiCool.g:817:6: ( ruleExtendedID )
                    {
                    // InternalKiCool.g:817:6: ( ruleExtendedID )
                    // InternalKiCool.g:818:1: ruleExtendedID
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
                    // InternalKiCool.g:823:6: ( RULE_BOOLEAN )
                    {
                    // InternalKiCool.g:823:6: ( RULE_BOOLEAN )
                    // InternalKiCool.g:824:1: RULE_BOOLEAN
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
    // InternalKiCool.g:834:1: rule__EStringAllTypes__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) );
    public final void rule__EStringAllTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:838:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) )
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
                    // InternalKiCool.g:839:1: ( RULE_STRING )
                    {
                    // InternalKiCool.g:839:1: ( RULE_STRING )
                    // InternalKiCool.g:840:1: RULE_STRING
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
                    // InternalKiCool.g:845:6: ( ruleExtendedID )
                    {
                    // InternalKiCool.g:845:6: ( ruleExtendedID )
                    // InternalKiCool.g:846:1: ruleExtendedID
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
                    // InternalKiCool.g:851:6: ( RULE_BOOLEAN )
                    {
                    // InternalKiCool.g:851:6: ( RULE_BOOLEAN )
                    // InternalKiCool.g:852:1: RULE_BOOLEAN
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
                    // InternalKiCool.g:857:6: ( ruleInteger )
                    {
                    // InternalKiCool.g:857:6: ( ruleInteger )
                    // InternalKiCool.g:858:1: ruleInteger
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
                    // InternalKiCool.g:863:6: ( ruleFloateger )
                    {
                    // InternalKiCool.g:863:6: ( ruleFloateger )
                    // InternalKiCool.g:864:1: ruleFloateger
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
    // InternalKiCool.g:874:1: rule__ExtendedID__Alternatives_1_0 : ( ( '.' ) | ( '-' ) );
    public final void rule__ExtendedID__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:878:1: ( ( '.' ) | ( '-' ) )
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
                    // InternalKiCool.g:879:1: ( '.' )
                    {
                    // InternalKiCool.g:879:1: ( '.' )
                    // InternalKiCool.g:880:1: '.'
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
                    // InternalKiCool.g:887:6: ( '-' )
                    {
                    // InternalKiCool.g:887:6: ( '-' )
                    // InternalKiCool.g:888:1: '-'
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
    // InternalKiCool.g:902:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:906:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalKiCool.g:907:2: rule__System__Group__0__Impl rule__System__Group__1
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
    // InternalKiCool.g:914:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:918:1: ( ( 'system' ) )
            // InternalKiCool.g:919:1: ( 'system' )
            {
            // InternalKiCool.g:919:1: ( 'system' )
            // InternalKiCool.g:920:1: 'system'
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
    // InternalKiCool.g:933:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:937:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalKiCool.g:938:2: rule__System__Group__1__Impl rule__System__Group__2
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
    // InternalKiCool.g:945:1: rule__System__Group__1__Impl : ( ( rule__System__IdAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:949:1: ( ( ( rule__System__IdAssignment_1 ) ) )
            // InternalKiCool.g:950:1: ( ( rule__System__IdAssignment_1 ) )
            {
            // InternalKiCool.g:950:1: ( ( rule__System__IdAssignment_1 ) )
            // InternalKiCool.g:951:1: ( rule__System__IdAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getIdAssignment_1()); 
            }
            // InternalKiCool.g:952:1: ( rule__System__IdAssignment_1 )
            // InternalKiCool.g:952:2: rule__System__IdAssignment_1
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
    // InternalKiCool.g:962:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:966:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalKiCool.g:967:2: rule__System__Group__2__Impl rule__System__Group__3
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
    // InternalKiCool.g:974:1: rule__System__Group__2__Impl : ( 'version' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:978:1: ( ( 'version' ) )
            // InternalKiCool.g:979:1: ( 'version' )
            {
            // InternalKiCool.g:979:1: ( 'version' )
            // InternalKiCool.g:980:1: 'version'
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
    // InternalKiCool.g:993:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:997:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalKiCool.g:998:2: rule__System__Group__3__Impl rule__System__Group__4
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
    // InternalKiCool.g:1005:1: rule__System__Group__3__Impl : ( ( rule__System__VersionAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1009:1: ( ( ( rule__System__VersionAssignment_3 ) ) )
            // InternalKiCool.g:1010:1: ( ( rule__System__VersionAssignment_3 ) )
            {
            // InternalKiCool.g:1010:1: ( ( rule__System__VersionAssignment_3 ) )
            // InternalKiCool.g:1011:1: ( rule__System__VersionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getVersionAssignment_3()); 
            }
            // InternalKiCool.g:1012:1: ( rule__System__VersionAssignment_3 )
            // InternalKiCool.g:1012:2: rule__System__VersionAssignment_3
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
    // InternalKiCool.g:1022:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1026:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalKiCool.g:1027:2: rule__System__Group__4__Impl rule__System__Group__5
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
    // InternalKiCool.g:1034:1: rule__System__Group__4__Impl : ( 'label' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1038:1: ( ( 'label' ) )
            // InternalKiCool.g:1039:1: ( 'label' )
            {
            // InternalKiCool.g:1039:1: ( 'label' )
            // InternalKiCool.g:1040:1: 'label'
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
    // InternalKiCool.g:1053:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1057:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // InternalKiCool.g:1058:2: rule__System__Group__5__Impl rule__System__Group__6
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
    // InternalKiCool.g:1065:1: rule__System__Group__5__Impl : ( ( rule__System__LabelAssignment_5 ) ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1069:1: ( ( ( rule__System__LabelAssignment_5 ) ) )
            // InternalKiCool.g:1070:1: ( ( rule__System__LabelAssignment_5 ) )
            {
            // InternalKiCool.g:1070:1: ( ( rule__System__LabelAssignment_5 ) )
            // InternalKiCool.g:1071:1: ( rule__System__LabelAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getLabelAssignment_5()); 
            }
            // InternalKiCool.g:1072:1: ( rule__System__LabelAssignment_5 )
            // InternalKiCool.g:1072:2: rule__System__LabelAssignment_5
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
    // InternalKiCool.g:1082:1: rule__System__Group__6 : rule__System__Group__6__Impl rule__System__Group__7 ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1086:1: ( rule__System__Group__6__Impl rule__System__Group__7 )
            // InternalKiCool.g:1087:2: rule__System__Group__6__Impl rule__System__Group__7
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
    // InternalKiCool.g:1094:1: rule__System__Group__6__Impl : ( ( rule__System__Group_6__0 )? ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1098:1: ( ( ( rule__System__Group_6__0 )? ) )
            // InternalKiCool.g:1099:1: ( ( rule__System__Group_6__0 )? )
            {
            // InternalKiCool.g:1099:1: ( ( rule__System__Group_6__0 )? )
            // InternalKiCool.g:1100:1: ( rule__System__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getGroup_6()); 
            }
            // InternalKiCool.g:1101:1: ( rule__System__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKiCool.g:1101:2: rule__System__Group_6__0
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
    // InternalKiCool.g:1111:1: rule__System__Group__7 : rule__System__Group__7__Impl rule__System__Group__8 ;
    public final void rule__System__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1115:1: ( rule__System__Group__7__Impl rule__System__Group__8 )
            // InternalKiCool.g:1116:2: rule__System__Group__7__Impl rule__System__Group__8
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
    // InternalKiCool.g:1123:1: rule__System__Group__7__Impl : ( ( rule__System__Group_7__0 )* ) ;
    public final void rule__System__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1127:1: ( ( ( rule__System__Group_7__0 )* ) )
            // InternalKiCool.g:1128:1: ( ( rule__System__Group_7__0 )* )
            {
            // InternalKiCool.g:1128:1: ( ( rule__System__Group_7__0 )* )
            // InternalKiCool.g:1129:1: ( rule__System__Group_7__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getGroup_7()); 
            }
            // InternalKiCool.g:1130:1: ( rule__System__Group_7__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKiCool.g:1130:2: rule__System__Group_7__0
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
    // InternalKiCool.g:1140:1: rule__System__Group__8 : rule__System__Group__8__Impl rule__System__Group__9 ;
    public final void rule__System__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1144:1: ( rule__System__Group__8__Impl rule__System__Group__9 )
            // InternalKiCool.g:1145:2: rule__System__Group__8__Impl rule__System__Group__9
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
    // InternalKiCool.g:1152:1: rule__System__Group__8__Impl : ( ( rule__System__IntermediatesAssignment_8 )* ) ;
    public final void rule__System__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1156:1: ( ( ( rule__System__IntermediatesAssignment_8 )* ) )
            // InternalKiCool.g:1157:1: ( ( rule__System__IntermediatesAssignment_8 )* )
            {
            // InternalKiCool.g:1157:1: ( ( rule__System__IntermediatesAssignment_8 )* )
            // InternalKiCool.g:1158:1: ( rule__System__IntermediatesAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getIntermediatesAssignment_8()); 
            }
            // InternalKiCool.g:1159:1: ( rule__System__IntermediatesAssignment_8 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKiCool.g:1159:2: rule__System__IntermediatesAssignment_8
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
    // InternalKiCool.g:1169:1: rule__System__Group__9 : rule__System__Group__9__Impl ;
    public final void rule__System__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1173:1: ( rule__System__Group__9__Impl )
            // InternalKiCool.g:1174:2: rule__System__Group__9__Impl
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
    // InternalKiCool.g:1180:1: rule__System__Group__9__Impl : ( ( rule__System__ProcessorsAssignment_9 ) ) ;
    public final void rule__System__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1184:1: ( ( ( rule__System__ProcessorsAssignment_9 ) ) )
            // InternalKiCool.g:1185:1: ( ( rule__System__ProcessorsAssignment_9 ) )
            {
            // InternalKiCool.g:1185:1: ( ( rule__System__ProcessorsAssignment_9 ) )
            // InternalKiCool.g:1186:1: ( rule__System__ProcessorsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getProcessorsAssignment_9()); 
            }
            // InternalKiCool.g:1187:1: ( rule__System__ProcessorsAssignment_9 )
            // InternalKiCool.g:1187:2: rule__System__ProcessorsAssignment_9
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
    // InternalKiCool.g:1217:1: rule__System__Group_6__0 : rule__System__Group_6__0__Impl rule__System__Group_6__1 ;
    public final void rule__System__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1221:1: ( rule__System__Group_6__0__Impl rule__System__Group_6__1 )
            // InternalKiCool.g:1222:2: rule__System__Group_6__0__Impl rule__System__Group_6__1
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
    // InternalKiCool.g:1229:1: rule__System__Group_6__0__Impl : ( 'input' ) ;
    public final void rule__System__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1233:1: ( ( 'input' ) )
            // InternalKiCool.g:1234:1: ( 'input' )
            {
            // InternalKiCool.g:1234:1: ( 'input' )
            // InternalKiCool.g:1235:1: 'input'
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
    // InternalKiCool.g:1248:1: rule__System__Group_6__1 : rule__System__Group_6__1__Impl ;
    public final void rule__System__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1252:1: ( rule__System__Group_6__1__Impl )
            // InternalKiCool.g:1253:2: rule__System__Group_6__1__Impl
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
    // InternalKiCool.g:1259:1: rule__System__Group_6__1__Impl : ( ( rule__System__InputClassAssignment_6_1 ) ) ;
    public final void rule__System__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1263:1: ( ( ( rule__System__InputClassAssignment_6_1 ) ) )
            // InternalKiCool.g:1264:1: ( ( rule__System__InputClassAssignment_6_1 ) )
            {
            // InternalKiCool.g:1264:1: ( ( rule__System__InputClassAssignment_6_1 ) )
            // InternalKiCool.g:1265:1: ( rule__System__InputClassAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getInputClassAssignment_6_1()); 
            }
            // InternalKiCool.g:1266:1: ( rule__System__InputClassAssignment_6_1 )
            // InternalKiCool.g:1266:2: rule__System__InputClassAssignment_6_1
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
    // InternalKiCool.g:1280:1: rule__System__Group_7__0 : rule__System__Group_7__0__Impl rule__System__Group_7__1 ;
    public final void rule__System__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1284:1: ( rule__System__Group_7__0__Impl rule__System__Group_7__1 )
            // InternalKiCool.g:1285:2: rule__System__Group_7__0__Impl rule__System__Group_7__1
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
    // InternalKiCool.g:1292:1: rule__System__Group_7__0__Impl : ( 'set' ) ;
    public final void rule__System__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1296:1: ( ( 'set' ) )
            // InternalKiCool.g:1297:1: ( 'set' )
            {
            // InternalKiCool.g:1297:1: ( 'set' )
            // InternalKiCool.g:1298:1: 'set'
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
    // InternalKiCool.g:1311:1: rule__System__Group_7__1 : rule__System__Group_7__1__Impl ;
    public final void rule__System__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1315:1: ( rule__System__Group_7__1__Impl )
            // InternalKiCool.g:1316:2: rule__System__Group_7__1__Impl
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
    // InternalKiCool.g:1322:1: rule__System__Group_7__1__Impl : ( ( rule__System__StartsetsAssignment_7_1 ) ) ;
    public final void rule__System__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1326:1: ( ( ( rule__System__StartsetsAssignment_7_1 ) ) )
            // InternalKiCool.g:1327:1: ( ( rule__System__StartsetsAssignment_7_1 ) )
            {
            // InternalKiCool.g:1327:1: ( ( rule__System__StartsetsAssignment_7_1 ) )
            // InternalKiCool.g:1328:1: ( rule__System__StartsetsAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getStartsetsAssignment_7_1()); 
            }
            // InternalKiCool.g:1329:1: ( rule__System__StartsetsAssignment_7_1 )
            // InternalKiCool.g:1329:2: rule__System__StartsetsAssignment_7_1
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
    // InternalKiCool.g:1343:1: rule__IntermediateReference__Group__0 : rule__IntermediateReference__Group__0__Impl rule__IntermediateReference__Group__1 ;
    public final void rule__IntermediateReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1347:1: ( rule__IntermediateReference__Group__0__Impl rule__IntermediateReference__Group__1 )
            // InternalKiCool.g:1348:2: rule__IntermediateReference__Group__0__Impl rule__IntermediateReference__Group__1
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
    // InternalKiCool.g:1355:1: rule__IntermediateReference__Group__0__Impl : ( 'intermediate' ) ;
    public final void rule__IntermediateReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1359:1: ( ( 'intermediate' ) )
            // InternalKiCool.g:1360:1: ( 'intermediate' )
            {
            // InternalKiCool.g:1360:1: ( 'intermediate' )
            // InternalKiCool.g:1361:1: 'intermediate'
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
    // InternalKiCool.g:1374:1: rule__IntermediateReference__Group__1 : rule__IntermediateReference__Group__1__Impl rule__IntermediateReference__Group__2 ;
    public final void rule__IntermediateReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1378:1: ( rule__IntermediateReference__Group__1__Impl rule__IntermediateReference__Group__2 )
            // InternalKiCool.g:1379:2: rule__IntermediateReference__Group__1__Impl rule__IntermediateReference__Group__2
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
    // InternalKiCool.g:1386:1: rule__IntermediateReference__Group__1__Impl : ( ( rule__IntermediateReference__IdAssignment_1 ) ) ;
    public final void rule__IntermediateReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1390:1: ( ( ( rule__IntermediateReference__IdAssignment_1 ) ) )
            // InternalKiCool.g:1391:1: ( ( rule__IntermediateReference__IdAssignment_1 ) )
            {
            // InternalKiCool.g:1391:1: ( ( rule__IntermediateReference__IdAssignment_1 ) )
            // InternalKiCool.g:1392:1: ( rule__IntermediateReference__IdAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getIdAssignment_1()); 
            }
            // InternalKiCool.g:1393:1: ( rule__IntermediateReference__IdAssignment_1 )
            // InternalKiCool.g:1393:2: rule__IntermediateReference__IdAssignment_1
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
    // InternalKiCool.g:1403:1: rule__IntermediateReference__Group__2 : rule__IntermediateReference__Group__2__Impl ;
    public final void rule__IntermediateReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1407:1: ( rule__IntermediateReference__Group__2__Impl )
            // InternalKiCool.g:1408:2: rule__IntermediateReference__Group__2__Impl
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
    // InternalKiCool.g:1414:1: rule__IntermediateReference__Group__2__Impl : ( ( rule__IntermediateReference__Group_2__0 )? ) ;
    public final void rule__IntermediateReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1418:1: ( ( ( rule__IntermediateReference__Group_2__0 )? ) )
            // InternalKiCool.g:1419:1: ( ( rule__IntermediateReference__Group_2__0 )? )
            {
            // InternalKiCool.g:1419:1: ( ( rule__IntermediateReference__Group_2__0 )? )
            // InternalKiCool.g:1420:1: ( rule__IntermediateReference__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getGroup_2()); 
            }
            // InternalKiCool.g:1421:1: ( rule__IntermediateReference__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKiCool.g:1421:2: rule__IntermediateReference__Group_2__0
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
    // InternalKiCool.g:1437:1: rule__IntermediateReference__Group_2__0 : rule__IntermediateReference__Group_2__0__Impl rule__IntermediateReference__Group_2__1 ;
    public final void rule__IntermediateReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1441:1: ( rule__IntermediateReference__Group_2__0__Impl rule__IntermediateReference__Group_2__1 )
            // InternalKiCool.g:1442:2: rule__IntermediateReference__Group_2__0__Impl rule__IntermediateReference__Group_2__1
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
    // InternalKiCool.g:1449:1: rule__IntermediateReference__Group_2__0__Impl : ( 'alias' ) ;
    public final void rule__IntermediateReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1453:1: ( ( 'alias' ) )
            // InternalKiCool.g:1454:1: ( 'alias' )
            {
            // InternalKiCool.g:1454:1: ( 'alias' )
            // InternalKiCool.g:1455:1: 'alias'
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
    // InternalKiCool.g:1468:1: rule__IntermediateReference__Group_2__1 : rule__IntermediateReference__Group_2__1__Impl ;
    public final void rule__IntermediateReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1472:1: ( rule__IntermediateReference__Group_2__1__Impl )
            // InternalKiCool.g:1473:2: rule__IntermediateReference__Group_2__1__Impl
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
    // InternalKiCool.g:1479:1: rule__IntermediateReference__Group_2__1__Impl : ( ( rule__IntermediateReference__AliasAssignment_2_1 ) ) ;
    public final void rule__IntermediateReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1483:1: ( ( ( rule__IntermediateReference__AliasAssignment_2_1 ) ) )
            // InternalKiCool.g:1484:1: ( ( rule__IntermediateReference__AliasAssignment_2_1 ) )
            {
            // InternalKiCool.g:1484:1: ( ( rule__IntermediateReference__AliasAssignment_2_1 ) )
            // InternalKiCool.g:1485:1: ( rule__IntermediateReference__AliasAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getAliasAssignment_2_1()); 
            }
            // InternalKiCool.g:1486:1: ( rule__IntermediateReference__AliasAssignment_2_1 )
            // InternalKiCool.g:1486:2: rule__IntermediateReference__AliasAssignment_2_1
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
    // InternalKiCool.g:1500:1: rule__ProcessorGroup__Group__0 : rule__ProcessorGroup__Group__0__Impl rule__ProcessorGroup__Group__1 ;
    public final void rule__ProcessorGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1504:1: ( rule__ProcessorGroup__Group__0__Impl rule__ProcessorGroup__Group__1 )
            // InternalKiCool.g:1505:2: rule__ProcessorGroup__Group__0__Impl rule__ProcessorGroup__Group__1
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
    // InternalKiCool.g:1512:1: rule__ProcessorGroup__Group__0__Impl : ( ( rule__ProcessorGroup__Group_0__0 )? ) ;
    public final void rule__ProcessorGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1516:1: ( ( ( rule__ProcessorGroup__Group_0__0 )? ) )
            // InternalKiCool.g:1517:1: ( ( rule__ProcessorGroup__Group_0__0 )? )
            {
            // InternalKiCool.g:1517:1: ( ( rule__ProcessorGroup__Group_0__0 )? )
            // InternalKiCool.g:1518:1: ( rule__ProcessorGroup__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getGroup_0()); 
            }
            // InternalKiCool.g:1519:1: ( rule__ProcessorGroup__Group_0__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKiCool.g:1519:2: rule__ProcessorGroup__Group_0__0
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
    // InternalKiCool.g:1529:1: rule__ProcessorGroup__Group__1 : rule__ProcessorGroup__Group__1__Impl ;
    public final void rule__ProcessorGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1533:1: ( rule__ProcessorGroup__Group__1__Impl )
            // InternalKiCool.g:1534:2: rule__ProcessorGroup__Group__1__Impl
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
    // InternalKiCool.g:1540:1: rule__ProcessorGroup__Group__1__Impl : ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) ) ;
    public final void rule__ProcessorGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1544:1: ( ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) ) )
            // InternalKiCool.g:1545:1: ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) )
            {
            // InternalKiCool.g:1545:1: ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) )
            // InternalKiCool.g:1546:1: ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* )
            {
            // InternalKiCool.g:1546:1: ( ( rule__ProcessorGroup__Alternatives_1 ) )
            // InternalKiCool.g:1547:1: ( rule__ProcessorGroup__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getAlternatives_1()); 
            }
            // InternalKiCool.g:1548:1: ( rule__ProcessorGroup__Alternatives_1 )
            // InternalKiCool.g:1548:2: rule__ProcessorGroup__Alternatives_1
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

            // InternalKiCool.g:1551:1: ( ( rule__ProcessorGroup__Alternatives_1 )* )
            // InternalKiCool.g:1552:1: ( rule__ProcessorGroup__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getAlternatives_1()); 
            }
            // InternalKiCool.g:1553:1: ( rule__ProcessorGroup__Alternatives_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==18||LA11_0==25||LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKiCool.g:1553:2: rule__ProcessorGroup__Alternatives_1
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
    // InternalKiCool.g:1568:1: rule__ProcessorGroup__Group_0__0 : rule__ProcessorGroup__Group_0__0__Impl rule__ProcessorGroup__Group_0__1 ;
    public final void rule__ProcessorGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1572:1: ( rule__ProcessorGroup__Group_0__0__Impl rule__ProcessorGroup__Group_0__1 )
            // InternalKiCool.g:1573:2: rule__ProcessorGroup__Group_0__0__Impl rule__ProcessorGroup__Group_0__1
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
    // InternalKiCool.g:1580:1: rule__ProcessorGroup__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__ProcessorGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1584:1: ( ( 'label' ) )
            // InternalKiCool.g:1585:1: ( 'label' )
            {
            // InternalKiCool.g:1585:1: ( 'label' )
            // InternalKiCool.g:1586:1: 'label'
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
    // InternalKiCool.g:1599:1: rule__ProcessorGroup__Group_0__1 : rule__ProcessorGroup__Group_0__1__Impl ;
    public final void rule__ProcessorGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1603:1: ( rule__ProcessorGroup__Group_0__1__Impl )
            // InternalKiCool.g:1604:2: rule__ProcessorGroup__Group_0__1__Impl
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
    // InternalKiCool.g:1610:1: rule__ProcessorGroup__Group_0__1__Impl : ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) ) ;
    public final void rule__ProcessorGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1614:1: ( ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) ) )
            // InternalKiCool.g:1615:1: ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) )
            {
            // InternalKiCool.g:1615:1: ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) )
            // InternalKiCool.g:1616:1: ( rule__ProcessorGroup__LabelAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getLabelAssignment_0_1()); 
            }
            // InternalKiCool.g:1617:1: ( rule__ProcessorGroup__LabelAssignment_0_1 )
            // InternalKiCool.g:1617:2: rule__ProcessorGroup__LabelAssignment_0_1
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
    // InternalKiCool.g:1631:1: rule__ProcessorGroup__Group_1_1__0 : rule__ProcessorGroup__Group_1_1__0__Impl rule__ProcessorGroup__Group_1_1__1 ;
    public final void rule__ProcessorGroup__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1635:1: ( rule__ProcessorGroup__Group_1_1__0__Impl rule__ProcessorGroup__Group_1_1__1 )
            // InternalKiCool.g:1636:2: rule__ProcessorGroup__Group_1_1__0__Impl rule__ProcessorGroup__Group_1_1__1
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
    // InternalKiCool.g:1643:1: rule__ProcessorGroup__Group_1_1__0__Impl : ( 'system' ) ;
    public final void rule__ProcessorGroup__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1647:1: ( ( 'system' ) )
            // InternalKiCool.g:1648:1: ( 'system' )
            {
            // InternalKiCool.g:1648:1: ( 'system' )
            // InternalKiCool.g:1649:1: 'system'
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
    // InternalKiCool.g:1662:1: rule__ProcessorGroup__Group_1_1__1 : rule__ProcessorGroup__Group_1_1__1__Impl ;
    public final void rule__ProcessorGroup__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1666:1: ( rule__ProcessorGroup__Group_1_1__1__Impl )
            // InternalKiCool.g:1667:2: rule__ProcessorGroup__Group_1_1__1__Impl
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
    // InternalKiCool.g:1673:1: rule__ProcessorGroup__Group_1_1__1__Impl : ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) ) ;
    public final void rule__ProcessorGroup__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1677:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) ) )
            // InternalKiCool.g:1678:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) )
            {
            // InternalKiCool.g:1678:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) )
            // InternalKiCool.g:1679:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_1_1()); 
            }
            // InternalKiCool.g:1680:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 )
            // InternalKiCool.g:1680:2: rule__ProcessorGroup__ProcessorsAssignment_1_1_1
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
    // InternalKiCool.g:1694:1: rule__ProcessorGroup__Group_1_2__0 : rule__ProcessorGroup__Group_1_2__0__Impl rule__ProcessorGroup__Group_1_2__1 ;
    public final void rule__ProcessorGroup__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1698:1: ( rule__ProcessorGroup__Group_1_2__0__Impl rule__ProcessorGroup__Group_1_2__1 )
            // InternalKiCool.g:1699:2: rule__ProcessorGroup__Group_1_2__0__Impl rule__ProcessorGroup__Group_1_2__1
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
    // InternalKiCool.g:1706:1: rule__ProcessorGroup__Group_1_2__0__Impl : ( '[' ) ;
    public final void rule__ProcessorGroup__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1710:1: ( ( '[' ) )
            // InternalKiCool.g:1711:1: ( '[' )
            {
            // InternalKiCool.g:1711:1: ( '[' )
            // InternalKiCool.g:1712:1: '['
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
    // InternalKiCool.g:1725:1: rule__ProcessorGroup__Group_1_2__1 : rule__ProcessorGroup__Group_1_2__1__Impl rule__ProcessorGroup__Group_1_2__2 ;
    public final void rule__ProcessorGroup__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1729:1: ( rule__ProcessorGroup__Group_1_2__1__Impl rule__ProcessorGroup__Group_1_2__2 )
            // InternalKiCool.g:1730:2: rule__ProcessorGroup__Group_1_2__1__Impl rule__ProcessorGroup__Group_1_2__2
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
    // InternalKiCool.g:1737:1: rule__ProcessorGroup__Group_1_2__1__Impl : ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) ) ;
    public final void rule__ProcessorGroup__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1741:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) ) )
            // InternalKiCool.g:1742:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) )
            {
            // InternalKiCool.g:1742:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) )
            // InternalKiCool.g:1743:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_2_1()); 
            }
            // InternalKiCool.g:1744:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 )
            // InternalKiCool.g:1744:2: rule__ProcessorGroup__ProcessorsAssignment_1_2_1
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
    // InternalKiCool.g:1754:1: rule__ProcessorGroup__Group_1_2__2 : rule__ProcessorGroup__Group_1_2__2__Impl ;
    public final void rule__ProcessorGroup__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1758:1: ( rule__ProcessorGroup__Group_1_2__2__Impl )
            // InternalKiCool.g:1759:2: rule__ProcessorGroup__Group_1_2__2__Impl
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
    // InternalKiCool.g:1765:1: rule__ProcessorGroup__Group_1_2__2__Impl : ( ']' ) ;
    public final void rule__ProcessorGroup__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1769:1: ( ( ']' ) )
            // InternalKiCool.g:1770:1: ( ']' )
            {
            // InternalKiCool.g:1770:1: ( ']' )
            // InternalKiCool.g:1771:1: ']'
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
    // InternalKiCool.g:1790:1: rule__ProcessorGroup__Group_1_3__0 : rule__ProcessorGroup__Group_1_3__0__Impl rule__ProcessorGroup__Group_1_3__1 ;
    public final void rule__ProcessorGroup__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1794:1: ( rule__ProcessorGroup__Group_1_3__0__Impl rule__ProcessorGroup__Group_1_3__1 )
            // InternalKiCool.g:1795:2: rule__ProcessorGroup__Group_1_3__0__Impl rule__ProcessorGroup__Group_1_3__1
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
    // InternalKiCool.g:1802:1: rule__ProcessorGroup__Group_1_3__0__Impl : ( '[' ) ;
    public final void rule__ProcessorGroup__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1806:1: ( ( '[' ) )
            // InternalKiCool.g:1807:1: ( '[' )
            {
            // InternalKiCool.g:1807:1: ( '[' )
            // InternalKiCool.g:1808:1: '['
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
    // InternalKiCool.g:1821:1: rule__ProcessorGroup__Group_1_3__1 : rule__ProcessorGroup__Group_1_3__1__Impl rule__ProcessorGroup__Group_1_3__2 ;
    public final void rule__ProcessorGroup__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1825:1: ( rule__ProcessorGroup__Group_1_3__1__Impl rule__ProcessorGroup__Group_1_3__2 )
            // InternalKiCool.g:1826:2: rule__ProcessorGroup__Group_1_3__1__Impl rule__ProcessorGroup__Group_1_3__2
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
    // InternalKiCool.g:1833:1: rule__ProcessorGroup__Group_1_3__1__Impl : ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) ) ;
    public final void rule__ProcessorGroup__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1837:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) ) )
            // InternalKiCool.g:1838:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) )
            {
            // InternalKiCool.g:1838:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) )
            // InternalKiCool.g:1839:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_3_1()); 
            }
            // InternalKiCool.g:1840:1: ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 )
            // InternalKiCool.g:1840:2: rule__ProcessorGroup__ProcessorsAssignment_1_3_1
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
    // InternalKiCool.g:1850:1: rule__ProcessorGroup__Group_1_3__2 : rule__ProcessorGroup__Group_1_3__2__Impl ;
    public final void rule__ProcessorGroup__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1854:1: ( rule__ProcessorGroup__Group_1_3__2__Impl )
            // InternalKiCool.g:1855:2: rule__ProcessorGroup__Group_1_3__2__Impl
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
    // InternalKiCool.g:1861:1: rule__ProcessorGroup__Group_1_3__2__Impl : ( ']' ) ;
    public final void rule__ProcessorGroup__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1865:1: ( ( ']' ) )
            // InternalKiCool.g:1866:1: ( ']' )
            {
            // InternalKiCool.g:1866:1: ( ']' )
            // InternalKiCool.g:1867:1: ']'
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
    // InternalKiCool.g:1886:1: rule__Processor__Group__0 : rule__Processor__Group__0__Impl rule__Processor__Group__1 ;
    public final void rule__Processor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1890:1: ( rule__Processor__Group__0__Impl rule__Processor__Group__1 )
            // InternalKiCool.g:1891:2: rule__Processor__Group__0__Impl rule__Processor__Group__1
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
    // InternalKiCool.g:1898:1: rule__Processor__Group__0__Impl : ( ( rule__Processor__Group_0__0 )? ) ;
    public final void rule__Processor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1902:1: ( ( ( rule__Processor__Group_0__0 )? ) )
            // InternalKiCool.g:1903:1: ( ( rule__Processor__Group_0__0 )? )
            {
            // InternalKiCool.g:1903:1: ( ( rule__Processor__Group_0__0 )? )
            // InternalKiCool.g:1904:1: ( rule__Processor__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_0()); 
            }
            // InternalKiCool.g:1905:1: ( rule__Processor__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKiCool.g:1905:2: rule__Processor__Group_0__0
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
    // InternalKiCool.g:1915:1: rule__Processor__Group__1 : rule__Processor__Group__1__Impl rule__Processor__Group__2 ;
    public final void rule__Processor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1919:1: ( rule__Processor__Group__1__Impl rule__Processor__Group__2 )
            // InternalKiCool.g:1920:2: rule__Processor__Group__1__Impl rule__Processor__Group__2
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
    // InternalKiCool.g:1927:1: rule__Processor__Group__1__Impl : ( ( rule__Processor__IdAssignment_1 ) ) ;
    public final void rule__Processor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1931:1: ( ( ( rule__Processor__IdAssignment_1 ) ) )
            // InternalKiCool.g:1932:1: ( ( rule__Processor__IdAssignment_1 ) )
            {
            // InternalKiCool.g:1932:1: ( ( rule__Processor__IdAssignment_1 ) )
            // InternalKiCool.g:1933:1: ( rule__Processor__IdAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getIdAssignment_1()); 
            }
            // InternalKiCool.g:1934:1: ( rule__Processor__IdAssignment_1 )
            // InternalKiCool.g:1934:2: rule__Processor__IdAssignment_1
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
    // InternalKiCool.g:1944:1: rule__Processor__Group__2 : rule__Processor__Group__2__Impl rule__Processor__Group__3 ;
    public final void rule__Processor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1948:1: ( rule__Processor__Group__2__Impl rule__Processor__Group__3 )
            // InternalKiCool.g:1949:2: rule__Processor__Group__2__Impl rule__Processor__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalKiCool.g:1956:1: rule__Processor__Group__2__Impl : ( ( rule__Processor__Group_2__0 )? ) ;
    public final void rule__Processor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1960:1: ( ( ( rule__Processor__Group_2__0 )? ) )
            // InternalKiCool.g:1961:1: ( ( rule__Processor__Group_2__0 )? )
            {
            // InternalKiCool.g:1961:1: ( ( rule__Processor__Group_2__0 )? )
            // InternalKiCool.g:1962:1: ( rule__Processor__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_2()); 
            }
            // InternalKiCool.g:1963:1: ( rule__Processor__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKiCool.g:1963:2: rule__Processor__Group_2__0
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
    // InternalKiCool.g:1973:1: rule__Processor__Group__3 : rule__Processor__Group__3__Impl ;
    public final void rule__Processor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1977:1: ( rule__Processor__Group__3__Impl )
            // InternalKiCool.g:1978:2: rule__Processor__Group__3__Impl
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
    // InternalKiCool.g:1984:1: rule__Processor__Group__3__Impl : ( ( rule__Processor__Group_3__0 )? ) ;
    public final void rule__Processor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:1988:1: ( ( ( rule__Processor__Group_3__0 )? ) )
            // InternalKiCool.g:1989:1: ( ( rule__Processor__Group_3__0 )? )
            {
            // InternalKiCool.g:1989:1: ( ( rule__Processor__Group_3__0 )? )
            // InternalKiCool.g:1990:1: ( rule__Processor__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_3()); 
            }
            // InternalKiCool.g:1991:1: ( rule__Processor__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKiCool.g:1991:2: rule__Processor__Group_3__0
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
    // InternalKiCool.g:2009:1: rule__Processor__Group_0__0 : rule__Processor__Group_0__0__Impl rule__Processor__Group_0__1 ;
    public final void rule__Processor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2013:1: ( rule__Processor__Group_0__0__Impl rule__Processor__Group_0__1 )
            // InternalKiCool.g:2014:2: rule__Processor__Group_0__0__Impl rule__Processor__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKiCool.g:2021:1: rule__Processor__Group_0__0__Impl : ( 'pre' ) ;
    public final void rule__Processor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2025:1: ( ( 'pre' ) )
            // InternalKiCool.g:2026:1: ( 'pre' )
            {
            // InternalKiCool.g:2026:1: ( 'pre' )
            // InternalKiCool.g:2027:1: 'pre'
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
    // InternalKiCool.g:2040:1: rule__Processor__Group_0__1 : rule__Processor__Group_0__1__Impl ;
    public final void rule__Processor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2044:1: ( rule__Processor__Group_0__1__Impl )
            // InternalKiCool.g:2045:2: rule__Processor__Group_0__1__Impl
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
    // InternalKiCool.g:2051:1: rule__Processor__Group_0__1__Impl : ( ( ( rule__Processor__Group_0_1__0 ) ) ( ( rule__Processor__Group_0_1__0 )* ) ) ;
    public final void rule__Processor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2055:1: ( ( ( ( rule__Processor__Group_0_1__0 ) ) ( ( rule__Processor__Group_0_1__0 )* ) ) )
            // InternalKiCool.g:2056:1: ( ( ( rule__Processor__Group_0_1__0 ) ) ( ( rule__Processor__Group_0_1__0 )* ) )
            {
            // InternalKiCool.g:2056:1: ( ( ( rule__Processor__Group_0_1__0 ) ) ( ( rule__Processor__Group_0_1__0 )* ) )
            // InternalKiCool.g:2057:1: ( ( rule__Processor__Group_0_1__0 ) ) ( ( rule__Processor__Group_0_1__0 )* )
            {
            // InternalKiCool.g:2057:1: ( ( rule__Processor__Group_0_1__0 ) )
            // InternalKiCool.g:2058:1: ( rule__Processor__Group_0_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_0_1()); 
            }
            // InternalKiCool.g:2059:1: ( rule__Processor__Group_0_1__0 )
            // InternalKiCool.g:2059:2: rule__Processor__Group_0_1__0
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Processor__Group_0_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getGroup_0_1()); 
            }

            }

            // InternalKiCool.g:2062:1: ( ( rule__Processor__Group_0_1__0 )* )
            // InternalKiCool.g:2063:1: ( rule__Processor__Group_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_0_1()); 
            }
            // InternalKiCool.g:2064:1: ( rule__Processor__Group_0_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKiCool.g:2064:2: rule__Processor__Group_0_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__Processor__Group_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalKiCool.g:2079:1: rule__Processor__Group_0_1__0 : rule__Processor__Group_0_1__0__Impl rule__Processor__Group_0_1__1 ;
    public final void rule__Processor__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2083:1: ( rule__Processor__Group_0_1__0__Impl rule__Processor__Group_0_1__1 )
            // InternalKiCool.g:2084:2: rule__Processor__Group_0_1__0__Impl rule__Processor__Group_0_1__1
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
    // InternalKiCool.g:2091:1: rule__Processor__Group_0_1__0__Impl : ( 'set' ) ;
    public final void rule__Processor__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2095:1: ( ( 'set' ) )
            // InternalKiCool.g:2096:1: ( 'set' )
            {
            // InternalKiCool.g:2096:1: ( 'set' )
            // InternalKiCool.g:2097:1: 'set'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getSetKeyword_0_1_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:2110:1: rule__Processor__Group_0_1__1 : rule__Processor__Group_0_1__1__Impl ;
    public final void rule__Processor__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2114:1: ( rule__Processor__Group_0_1__1__Impl )
            // InternalKiCool.g:2115:2: rule__Processor__Group_0_1__1__Impl
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
    // InternalKiCool.g:2121:1: rule__Processor__Group_0_1__1__Impl : ( ( rule__Processor__PresetsAssignment_0_1_1 ) ) ;
    public final void rule__Processor__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2125:1: ( ( ( rule__Processor__PresetsAssignment_0_1_1 ) ) )
            // InternalKiCool.g:2126:1: ( ( rule__Processor__PresetsAssignment_0_1_1 ) )
            {
            // InternalKiCool.g:2126:1: ( ( rule__Processor__PresetsAssignment_0_1_1 ) )
            // InternalKiCool.g:2127:1: ( rule__Processor__PresetsAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPresetsAssignment_0_1_1()); 
            }
            // InternalKiCool.g:2128:1: ( rule__Processor__PresetsAssignment_0_1_1 )
            // InternalKiCool.g:2128:2: rule__Processor__PresetsAssignment_0_1_1
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
    // InternalKiCool.g:2142:1: rule__Processor__Group_2__0 : rule__Processor__Group_2__0__Impl rule__Processor__Group_2__1 ;
    public final void rule__Processor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2146:1: ( rule__Processor__Group_2__0__Impl rule__Processor__Group_2__1 )
            // InternalKiCool.g:2147:2: rule__Processor__Group_2__0__Impl rule__Processor__Group_2__1
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
    // InternalKiCool.g:2154:1: rule__Processor__Group_2__0__Impl : ( 'intermediate' ) ;
    public final void rule__Processor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2158:1: ( ( 'intermediate' ) )
            // InternalKiCool.g:2159:1: ( 'intermediate' )
            {
            // InternalKiCool.g:2159:1: ( 'intermediate' )
            // InternalKiCool.g:2160:1: 'intermediate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getIntermediateKeyword_2_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getIntermediateKeyword_2_0()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:2173:1: rule__Processor__Group_2__1 : rule__Processor__Group_2__1__Impl ;
    public final void rule__Processor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2177:1: ( rule__Processor__Group_2__1__Impl )
            // InternalKiCool.g:2178:2: rule__Processor__Group_2__1__Impl
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
    // InternalKiCool.g:2184:1: rule__Processor__Group_2__1__Impl : ( ( rule__Processor__MetricAssignment_2_1 ) ) ;
    public final void rule__Processor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2188:1: ( ( ( rule__Processor__MetricAssignment_2_1 ) ) )
            // InternalKiCool.g:2189:1: ( ( rule__Processor__MetricAssignment_2_1 ) )
            {
            // InternalKiCool.g:2189:1: ( ( rule__Processor__MetricAssignment_2_1 ) )
            // InternalKiCool.g:2190:1: ( rule__Processor__MetricAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getMetricAssignment_2_1()); 
            }
            // InternalKiCool.g:2191:1: ( rule__Processor__MetricAssignment_2_1 )
            // InternalKiCool.g:2191:2: rule__Processor__MetricAssignment_2_1
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
    // InternalKiCool.g:2205:1: rule__Processor__Group_3__0 : rule__Processor__Group_3__0__Impl rule__Processor__Group_3__1 ;
    public final void rule__Processor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2209:1: ( rule__Processor__Group_3__0__Impl rule__Processor__Group_3__1 )
            // InternalKiCool.g:2210:2: rule__Processor__Group_3__0__Impl rule__Processor__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalKiCool.g:2217:1: rule__Processor__Group_3__0__Impl : ( 'post' ) ;
    public final void rule__Processor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2221:1: ( ( 'post' ) )
            // InternalKiCool.g:2222:1: ( 'post' )
            {
            // InternalKiCool.g:2222:1: ( 'post' )
            // InternalKiCool.g:2223:1: 'post'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPostKeyword_3_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:2236:1: rule__Processor__Group_3__1 : rule__Processor__Group_3__1__Impl ;
    public final void rule__Processor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2240:1: ( rule__Processor__Group_3__1__Impl )
            // InternalKiCool.g:2241:2: rule__Processor__Group_3__1__Impl
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
    // InternalKiCool.g:2247:1: rule__Processor__Group_3__1__Impl : ( ( ( rule__Processor__Group_3_1__0 ) ) ( ( rule__Processor__Group_3_1__0 )* ) ) ;
    public final void rule__Processor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2251:1: ( ( ( ( rule__Processor__Group_3_1__0 ) ) ( ( rule__Processor__Group_3_1__0 )* ) ) )
            // InternalKiCool.g:2252:1: ( ( ( rule__Processor__Group_3_1__0 ) ) ( ( rule__Processor__Group_3_1__0 )* ) )
            {
            // InternalKiCool.g:2252:1: ( ( ( rule__Processor__Group_3_1__0 ) ) ( ( rule__Processor__Group_3_1__0 )* ) )
            // InternalKiCool.g:2253:1: ( ( rule__Processor__Group_3_1__0 ) ) ( ( rule__Processor__Group_3_1__0 )* )
            {
            // InternalKiCool.g:2253:1: ( ( rule__Processor__Group_3_1__0 ) )
            // InternalKiCool.g:2254:1: ( rule__Processor__Group_3_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_3_1()); 
            }
            // InternalKiCool.g:2255:1: ( rule__Processor__Group_3_1__0 )
            // InternalKiCool.g:2255:2: rule__Processor__Group_3_1__0
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Processor__Group_3_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getGroup_3_1()); 
            }

            }

            // InternalKiCool.g:2258:1: ( ( rule__Processor__Group_3_1__0 )* )
            // InternalKiCool.g:2259:1: ( rule__Processor__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_3_1()); 
            }
            // InternalKiCool.g:2260:1: ( rule__Processor__Group_3_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKiCool.g:2260:2: rule__Processor__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    rule__Processor__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalKiCool.g:2275:1: rule__Processor__Group_3_1__0 : rule__Processor__Group_3_1__0__Impl rule__Processor__Group_3_1__1 ;
    public final void rule__Processor__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2279:1: ( rule__Processor__Group_3_1__0__Impl rule__Processor__Group_3_1__1 )
            // InternalKiCool.g:2280:2: rule__Processor__Group_3_1__0__Impl rule__Processor__Group_3_1__1
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
    // InternalKiCool.g:2287:1: rule__Processor__Group_3_1__0__Impl : ( 'set' ) ;
    public final void rule__Processor__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2291:1: ( ( 'set' ) )
            // InternalKiCool.g:2292:1: ( 'set' )
            {
            // InternalKiCool.g:2292:1: ( 'set' )
            // InternalKiCool.g:2293:1: 'set'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getSetKeyword_3_1_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:2306:1: rule__Processor__Group_3_1__1 : rule__Processor__Group_3_1__1__Impl ;
    public final void rule__Processor__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2310:1: ( rule__Processor__Group_3_1__1__Impl )
            // InternalKiCool.g:2311:2: rule__Processor__Group_3_1__1__Impl
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
    // InternalKiCool.g:2317:1: rule__Processor__Group_3_1__1__Impl : ( ( rule__Processor__PostsetsAssignment_3_1_1 ) ) ;
    public final void rule__Processor__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2321:1: ( ( ( rule__Processor__PostsetsAssignment_3_1_1 ) ) )
            // InternalKiCool.g:2322:1: ( ( rule__Processor__PostsetsAssignment_3_1_1 ) )
            {
            // InternalKiCool.g:2322:1: ( ( rule__Processor__PostsetsAssignment_3_1_1 ) )
            // InternalKiCool.g:2323:1: ( rule__Processor__PostsetsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPostsetsAssignment_3_1_1()); 
            }
            // InternalKiCool.g:2324:1: ( rule__Processor__PostsetsAssignment_3_1_1 )
            // InternalKiCool.g:2324:2: rule__Processor__PostsetsAssignment_3_1_1
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
    // InternalKiCool.g:2338:1: rule__ProcessorAlternativeGroup__Group__0 : rule__ProcessorAlternativeGroup__Group__0__Impl rule__ProcessorAlternativeGroup__Group__1 ;
    public final void rule__ProcessorAlternativeGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2342:1: ( rule__ProcessorAlternativeGroup__Group__0__Impl rule__ProcessorAlternativeGroup__Group__1 )
            // InternalKiCool.g:2343:2: rule__ProcessorAlternativeGroup__Group__0__Impl rule__ProcessorAlternativeGroup__Group__1
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
    // InternalKiCool.g:2350:1: rule__ProcessorAlternativeGroup__Group__0__Impl : ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? ) ;
    public final void rule__ProcessorAlternativeGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2354:1: ( ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? ) )
            // InternalKiCool.g:2355:1: ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? )
            {
            // InternalKiCool.g:2355:1: ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? )
            // InternalKiCool.g:2356:1: ( rule__ProcessorAlternativeGroup__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_0()); 
            }
            // InternalKiCool.g:2357:1: ( rule__ProcessorAlternativeGroup__Group_0__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_STRING) ) {
                    int LA17_3 = input.LA(3);

                    if ( (synpred23_InternalKiCool()) ) {
                        alt17=1;
                    }
                }
                else if ( (LA17_1==RULE_ID) ) {
                    int LA17_4 = input.LA(3);

                    if ( (synpred23_InternalKiCool()) ) {
                        alt17=1;
                    }
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalKiCool.g:2357:2: rule__ProcessorAlternativeGroup__Group_0__0
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
    // InternalKiCool.g:2367:1: rule__ProcessorAlternativeGroup__Group__1 : rule__ProcessorAlternativeGroup__Group__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2371:1: ( rule__ProcessorAlternativeGroup__Group__1__Impl )
            // InternalKiCool.g:2372:2: rule__ProcessorAlternativeGroup__Group__1__Impl
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
    // InternalKiCool.g:2378:1: rule__ProcessorAlternativeGroup__Group__1__Impl : ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2382:1: ( ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) ) )
            // InternalKiCool.g:2383:1: ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) )
            {
            // InternalKiCool.g:2383:1: ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) )
            // InternalKiCool.g:2384:1: ( rule__ProcessorAlternativeGroup__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1()); 
            }
            // InternalKiCool.g:2385:1: ( rule__ProcessorAlternativeGroup__Group_1__0 )
            // InternalKiCool.g:2385:2: rule__ProcessorAlternativeGroup__Group_1__0
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
    // InternalKiCool.g:2399:1: rule__ProcessorAlternativeGroup__Group_0__0 : rule__ProcessorAlternativeGroup__Group_0__0__Impl rule__ProcessorAlternativeGroup__Group_0__1 ;
    public final void rule__ProcessorAlternativeGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2403:1: ( rule__ProcessorAlternativeGroup__Group_0__0__Impl rule__ProcessorAlternativeGroup__Group_0__1 )
            // InternalKiCool.g:2404:2: rule__ProcessorAlternativeGroup__Group_0__0__Impl rule__ProcessorAlternativeGroup__Group_0__1
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
    // InternalKiCool.g:2411:1: rule__ProcessorAlternativeGroup__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__ProcessorAlternativeGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2415:1: ( ( 'label' ) )
            // InternalKiCool.g:2416:1: ( 'label' )
            {
            // InternalKiCool.g:2416:1: ( 'label' )
            // InternalKiCool.g:2417:1: 'label'
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
    // InternalKiCool.g:2430:1: rule__ProcessorAlternativeGroup__Group_0__1 : rule__ProcessorAlternativeGroup__Group_0__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2434:1: ( rule__ProcessorAlternativeGroup__Group_0__1__Impl )
            // InternalKiCool.g:2435:2: rule__ProcessorAlternativeGroup__Group_0__1__Impl
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
    // InternalKiCool.g:2441:1: rule__ProcessorAlternativeGroup__Group_0__1__Impl : ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2445:1: ( ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) ) )
            // InternalKiCool.g:2446:1: ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) )
            {
            // InternalKiCool.g:2446:1: ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) )
            // InternalKiCool.g:2447:1: ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getLabelAssignment_0_1()); 
            }
            // InternalKiCool.g:2448:1: ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 )
            // InternalKiCool.g:2448:2: rule__ProcessorAlternativeGroup__LabelAssignment_0_1
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
    // InternalKiCool.g:2462:1: rule__ProcessorAlternativeGroup__Group_1__0 : rule__ProcessorAlternativeGroup__Group_1__0__Impl rule__ProcessorAlternativeGroup__Group_1__1 ;
    public final void rule__ProcessorAlternativeGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2466:1: ( rule__ProcessorAlternativeGroup__Group_1__0__Impl rule__ProcessorAlternativeGroup__Group_1__1 )
            // InternalKiCool.g:2467:2: rule__ProcessorAlternativeGroup__Group_1__0__Impl rule__ProcessorAlternativeGroup__Group_1__1
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
    // InternalKiCool.g:2474:1: rule__ProcessorAlternativeGroup__Group_1__0__Impl : ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2478:1: ( ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) ) )
            // InternalKiCool.g:2479:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) )
            {
            // InternalKiCool.g:2479:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) )
            // InternalKiCool.g:2480:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsAssignment_1_0()); 
            }
            // InternalKiCool.g:2481:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 )
            // InternalKiCool.g:2481:2: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0
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
    // InternalKiCool.g:2491:1: rule__ProcessorAlternativeGroup__Group_1__1 : rule__ProcessorAlternativeGroup__Group_1__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2495:1: ( rule__ProcessorAlternativeGroup__Group_1__1__Impl )
            // InternalKiCool.g:2496:2: rule__ProcessorAlternativeGroup__Group_1__1__Impl
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
    // InternalKiCool.g:2502:1: rule__ProcessorAlternativeGroup__Group_1__1__Impl : ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2506:1: ( ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) ) )
            // InternalKiCool.g:2507:1: ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) )
            {
            // InternalKiCool.g:2507:1: ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) )
            // InternalKiCool.g:2508:1: ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* )
            {
            // InternalKiCool.g:2508:1: ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) )
            // InternalKiCool.g:2509:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1_1()); 
            }
            // InternalKiCool.g:2510:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )
            // InternalKiCool.g:2510:2: rule__ProcessorAlternativeGroup__Group_1_1__0
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

            // InternalKiCool.g:2513:1: ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* )
            // InternalKiCool.g:2514:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1_1()); 
            }
            // InternalKiCool.g:2515:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKiCool.g:2515:2: rule__ProcessorAlternativeGroup__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    rule__ProcessorAlternativeGroup__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalKiCool.g:2530:1: rule__ProcessorAlternativeGroup__Group_1_1__0 : rule__ProcessorAlternativeGroup__Group_1_1__0__Impl rule__ProcessorAlternativeGroup__Group_1_1__1 ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2534:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0__Impl rule__ProcessorAlternativeGroup__Group_1_1__1 )
            // InternalKiCool.g:2535:2: rule__ProcessorAlternativeGroup__Group_1_1__0__Impl rule__ProcessorAlternativeGroup__Group_1_1__1
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
    // InternalKiCool.g:2542:1: rule__ProcessorAlternativeGroup__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2546:1: ( ( '|' ) )
            // InternalKiCool.g:2547:1: ( '|' )
            {
            // InternalKiCool.g:2547:1: ( '|' )
            // InternalKiCool.g:2548:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getVerticalLineKeyword_1_1_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:2561:1: rule__ProcessorAlternativeGroup__Group_1_1__1 : rule__ProcessorAlternativeGroup__Group_1_1__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2565:1: ( rule__ProcessorAlternativeGroup__Group_1_1__1__Impl )
            // InternalKiCool.g:2566:2: rule__ProcessorAlternativeGroup__Group_1_1__1__Impl
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
    // InternalKiCool.g:2572:1: rule__ProcessorAlternativeGroup__Group_1_1__1__Impl : ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2576:1: ( ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) ) )
            // InternalKiCool.g:2577:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) )
            {
            // InternalKiCool.g:2577:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) )
            // InternalKiCool.g:2578:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsAssignment_1_1_1()); 
            }
            // InternalKiCool.g:2579:1: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 )
            // InternalKiCool.g:2579:2: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1
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
    // InternalKiCool.g:2593:1: rule__KVPair__Group__0 : rule__KVPair__Group__0__Impl rule__KVPair__Group__1 ;
    public final void rule__KVPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2597:1: ( rule__KVPair__Group__0__Impl rule__KVPair__Group__1 )
            // InternalKiCool.g:2598:2: rule__KVPair__Group__0__Impl rule__KVPair__Group__1
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
    // InternalKiCool.g:2605:1: rule__KVPair__Group__0__Impl : ( ( rule__KVPair__KeyAssignment_0 ) ) ;
    public final void rule__KVPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2609:1: ( ( ( rule__KVPair__KeyAssignment_0 ) ) )
            // InternalKiCool.g:2610:1: ( ( rule__KVPair__KeyAssignment_0 ) )
            {
            // InternalKiCool.g:2610:1: ( ( rule__KVPair__KeyAssignment_0 ) )
            // InternalKiCool.g:2611:1: ( rule__KVPair__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getKeyAssignment_0()); 
            }
            // InternalKiCool.g:2612:1: ( rule__KVPair__KeyAssignment_0 )
            // InternalKiCool.g:2612:2: rule__KVPair__KeyAssignment_0
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
    // InternalKiCool.g:2622:1: rule__KVPair__Group__1 : rule__KVPair__Group__1__Impl rule__KVPair__Group__2 ;
    public final void rule__KVPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2626:1: ( rule__KVPair__Group__1__Impl rule__KVPair__Group__2 )
            // InternalKiCool.g:2627:2: rule__KVPair__Group__1__Impl rule__KVPair__Group__2
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
    // InternalKiCool.g:2634:1: rule__KVPair__Group__1__Impl : ( ( rule__KVPair__IsKeyValueAssignment_1 )? ) ;
    public final void rule__KVPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2638:1: ( ( ( rule__KVPair__IsKeyValueAssignment_1 )? ) )
            // InternalKiCool.g:2639:1: ( ( rule__KVPair__IsKeyValueAssignment_1 )? )
            {
            // InternalKiCool.g:2639:1: ( ( rule__KVPair__IsKeyValueAssignment_1 )? )
            // InternalKiCool.g:2640:1: ( rule__KVPair__IsKeyValueAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getIsKeyValueAssignment_1()); 
            }
            // InternalKiCool.g:2641:1: ( rule__KVPair__IsKeyValueAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKiCool.g:2641:2: rule__KVPair__IsKeyValueAssignment_1
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
    // InternalKiCool.g:2651:1: rule__KVPair__Group__2 : rule__KVPair__Group__2__Impl ;
    public final void rule__KVPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2655:1: ( rule__KVPair__Group__2__Impl )
            // InternalKiCool.g:2656:2: rule__KVPair__Group__2__Impl
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
    // InternalKiCool.g:2662:1: rule__KVPair__Group__2__Impl : ( ( rule__KVPair__ValueAssignment_2 ) ) ;
    public final void rule__KVPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2666:1: ( ( ( rule__KVPair__ValueAssignment_2 ) ) )
            // InternalKiCool.g:2667:1: ( ( rule__KVPair__ValueAssignment_2 ) )
            {
            // InternalKiCool.g:2667:1: ( ( rule__KVPair__ValueAssignment_2 ) )
            // InternalKiCool.g:2668:1: ( rule__KVPair__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getValueAssignment_2()); 
            }
            // InternalKiCool.g:2669:1: ( rule__KVPair__ValueAssignment_2 )
            // InternalKiCool.g:2669:2: rule__KVPair__ValueAssignment_2
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
    // InternalKiCool.g:2685:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2689:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalKiCool.g:2690:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
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
    // InternalKiCool.g:2697:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2701:1: ( ( '@' ) )
            // InternalKiCool.g:2702:1: ( '@' )
            {
            // InternalKiCool.g:2702:1: ( '@' )
            // InternalKiCool.g:2703:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:2716:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2720:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalKiCool.g:2721:2: rule__TagAnnotation__Group__1__Impl
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
    // InternalKiCool.g:2727:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2731:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:2732:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:2732:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:2733:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:2734:1: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalKiCool.g:2734:2: rule__TagAnnotation__NameAssignment_1
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
    // InternalKiCool.g:2748:1: rule__PragmaTag__Group__0 : rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 ;
    public final void rule__PragmaTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2752:1: ( rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 )
            // InternalKiCool.g:2753:2: rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1
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
    // InternalKiCool.g:2760:1: rule__PragmaTag__Group__0__Impl : ( '#' ) ;
    public final void rule__PragmaTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2764:1: ( ( '#' ) )
            // InternalKiCool.g:2765:1: ( '#' )
            {
            // InternalKiCool.g:2765:1: ( '#' )
            // InternalKiCool.g:2766:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:2779:1: rule__PragmaTag__Group__1 : rule__PragmaTag__Group__1__Impl ;
    public final void rule__PragmaTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2783:1: ( rule__PragmaTag__Group__1__Impl )
            // InternalKiCool.g:2784:2: rule__PragmaTag__Group__1__Impl
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
    // InternalKiCool.g:2790:1: rule__PragmaTag__Group__1__Impl : ( ( rule__PragmaTag__NameAssignment_1 ) ) ;
    public final void rule__PragmaTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2794:1: ( ( ( rule__PragmaTag__NameAssignment_1 ) ) )
            // InternalKiCool.g:2795:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            {
            // InternalKiCool.g:2795:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            // InternalKiCool.g:2796:1: ( rule__PragmaTag__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:2797:1: ( rule__PragmaTag__NameAssignment_1 )
            // InternalKiCool.g:2797:2: rule__PragmaTag__NameAssignment_1
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
    // InternalKiCool.g:2811:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2815:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:2816:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:2823:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2827:1: ( ( '@' ) )
            // InternalKiCool.g:2828:1: ( '@' )
            {
            // InternalKiCool.g:2828:1: ( '@' )
            // InternalKiCool.g:2829:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:2842:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2846:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:2847:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
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
    // InternalKiCool.g:2854:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2858:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:2859:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:2859:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:2860:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:2861:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:2861:2: rule__KeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:2871:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2875:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:2876:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:2883:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2887:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:2888:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:2888:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:2889:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:2890:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:2890:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKiCool.g:2900:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2904:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalKiCool.g:2905:2: rule__KeyStringValueAnnotation__Group__3__Impl
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
    // InternalKiCool.g:2911:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2915:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKiCool.g:2916:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKiCool.g:2916:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalKiCool.g:2917:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:2918:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKiCool.g:2918:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__KeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalKiCool.g:2936:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2940:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:2941:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
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
    // InternalKiCool.g:2948:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2952:1: ( ( ',' ) )
            // InternalKiCool.g:2953:1: ( ',' )
            {
            // InternalKiCool.g:2953:1: ( ',' )
            // InternalKiCool.g:2954:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:2967:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2971:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:2972:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKiCool.g:2978:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:2982:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:2983:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:2983:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:2984:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:2985:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:2985:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKiCool.g:2999:1: rule__RestrictedKeyStringValueAnnotation__Group__0 : rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3003:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3004:2: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:3011:1: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3015:1: ( ( '@' ) )
            // InternalKiCool.g:3016:1: ( '@' )
            {
            // InternalKiCool.g:3016:1: ( '@' )
            // InternalKiCool.g:3017:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3030:1: rule__RestrictedKeyStringValueAnnotation__Group__1 : rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3034:1: ( rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3035:2: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2
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
    // InternalKiCool.g:3042:1: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3046:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3047:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3047:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3048:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3049:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3049:2: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3059:1: rule__RestrictedKeyStringValueAnnotation__Group__2 : rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3063:1: ( rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3064:2: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:3071:1: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3075:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:3076:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:3076:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:3077:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:3078:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:3078:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKiCool.g:3088:1: rule__RestrictedKeyStringValueAnnotation__Group__3 : rule__RestrictedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3092:1: ( rule__RestrictedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKiCool.g:3093:2: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKiCool.g:3099:1: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3103:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKiCool.g:3104:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKiCool.g:3104:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKiCool.g:3105:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:3106:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKiCool.g:3106:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__RestrictedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalKiCool.g:3124:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0 : rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3128:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:3129:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1
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
    // InternalKiCool.g:3136:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3140:1: ( ( ',' ) )
            // InternalKiCool.g:3141:1: ( ',' )
            {
            // InternalKiCool.g:3141:1: ( ',' )
            // InternalKiCool.g:3142:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3155:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1 : rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3159:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:3160:2: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKiCool.g:3166:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3170:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:3171:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:3171:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:3172:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:3173:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:3173:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKiCool.g:3187:1: rule__StringPragma__Group__0 : rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 ;
    public final void rule__StringPragma__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3191:1: ( rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 )
            // InternalKiCool.g:3192:2: rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1
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
    // InternalKiCool.g:3199:1: rule__StringPragma__Group__0__Impl : ( '#' ) ;
    public final void rule__StringPragma__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3203:1: ( ( '#' ) )
            // InternalKiCool.g:3204:1: ( '#' )
            {
            // InternalKiCool.g:3204:1: ( '#' )
            // InternalKiCool.g:3205:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3218:1: rule__StringPragma__Group__1 : rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 ;
    public final void rule__StringPragma__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3222:1: ( rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 )
            // InternalKiCool.g:3223:2: rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKiCool.g:3230:1: rule__StringPragma__Group__1__Impl : ( ( rule__StringPragma__NameAssignment_1 ) ) ;
    public final void rule__StringPragma__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3234:1: ( ( ( rule__StringPragma__NameAssignment_1 ) ) )
            // InternalKiCool.g:3235:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3235:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            // InternalKiCool.g:3236:1: ( rule__StringPragma__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3237:1: ( rule__StringPragma__NameAssignment_1 )
            // InternalKiCool.g:3237:2: rule__StringPragma__NameAssignment_1
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
    // InternalKiCool.g:3247:1: rule__StringPragma__Group__2 : rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 ;
    public final void rule__StringPragma__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3251:1: ( rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 )
            // InternalKiCool.g:3252:2: rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalKiCool.g:3259:1: rule__StringPragma__Group__2__Impl : ( ( rule__StringPragma__ValuesAssignment_2 ) ) ;
    public final void rule__StringPragma__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3263:1: ( ( ( rule__StringPragma__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:3264:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:3264:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            // InternalKiCool.g:3265:1: ( rule__StringPragma__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:3266:1: ( rule__StringPragma__ValuesAssignment_2 )
            // InternalKiCool.g:3266:2: rule__StringPragma__ValuesAssignment_2
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
    // InternalKiCool.g:3276:1: rule__StringPragma__Group__3 : rule__StringPragma__Group__3__Impl ;
    public final void rule__StringPragma__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3280:1: ( rule__StringPragma__Group__3__Impl )
            // InternalKiCool.g:3281:2: rule__StringPragma__Group__3__Impl
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
    // InternalKiCool.g:3287:1: rule__StringPragma__Group__3__Impl : ( ( rule__StringPragma__Group_3__0 )* ) ;
    public final void rule__StringPragma__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3291:1: ( ( ( rule__StringPragma__Group_3__0 )* ) )
            // InternalKiCool.g:3292:1: ( ( rule__StringPragma__Group_3__0 )* )
            {
            // InternalKiCool.g:3292:1: ( ( rule__StringPragma__Group_3__0 )* )
            // InternalKiCool.g:3293:1: ( rule__StringPragma__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getGroup_3()); 
            }
            // InternalKiCool.g:3294:1: ( rule__StringPragma__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKiCool.g:3294:2: rule__StringPragma__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__StringPragma__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalKiCool.g:3312:1: rule__StringPragma__Group_3__0 : rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 ;
    public final void rule__StringPragma__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3316:1: ( rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 )
            // InternalKiCool.g:3317:2: rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalKiCool.g:3324:1: rule__StringPragma__Group_3__0__Impl : ( ',' ) ;
    public final void rule__StringPragma__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3328:1: ( ( ',' ) )
            // InternalKiCool.g:3329:1: ( ',' )
            {
            // InternalKiCool.g:3329:1: ( ',' )
            // InternalKiCool.g:3330:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3343:1: rule__StringPragma__Group_3__1 : rule__StringPragma__Group_3__1__Impl ;
    public final void rule__StringPragma__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3347:1: ( rule__StringPragma__Group_3__1__Impl )
            // InternalKiCool.g:3348:2: rule__StringPragma__Group_3__1__Impl
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
    // InternalKiCool.g:3354:1: rule__StringPragma__Group_3__1__Impl : ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) ;
    public final void rule__StringPragma__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3358:1: ( ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:3359:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:3359:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:3360:1: ( rule__StringPragma__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:3361:1: ( rule__StringPragma__ValuesAssignment_3_1 )
            // InternalKiCool.g:3361:2: rule__StringPragma__ValuesAssignment_3_1
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
    // InternalKiCool.g:3375:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3379:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3380:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:3387:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3391:1: ( ( '@' ) )
            // InternalKiCool.g:3392:1: ( '@' )
            {
            // InternalKiCool.g:3392:1: ( '@' )
            // InternalKiCool.g:3393:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3406:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3410:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3411:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
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
    // InternalKiCool.g:3418:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3422:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3423:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3423:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3424:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3425:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3425:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3435:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3439:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3440:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:3447:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3451:1: ( ( '[' ) )
            // InternalKiCool.g:3452:1: ( '[' )
            {
            // InternalKiCool.g:3452:1: ( '[' )
            // InternalKiCool.g:3453:1: '['
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
    // InternalKiCool.g:3466:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3470:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalKiCool.g:3471:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
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
    // InternalKiCool.g:3478:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3482:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKiCool.g:3483:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKiCool.g:3483:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKiCool.g:3484:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKiCool.g:3485:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKiCool.g:3485:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKiCool.g:3495:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3499:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalKiCool.g:3500:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
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
    // InternalKiCool.g:3507:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3511:1: ( ( ']' ) )
            // InternalKiCool.g:3512:1: ( ']' )
            {
            // InternalKiCool.g:3512:1: ( ']' )
            // InternalKiCool.g:3513:1: ']'
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
    // InternalKiCool.g:3526:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3530:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalKiCool.g:3531:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
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
    // InternalKiCool.g:3538:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3542:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKiCool.g:3543:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKiCool.g:3543:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKiCool.g:3544:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKiCool.g:3545:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKiCool.g:3545:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKiCool.g:3555:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3559:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKiCool.g:3560:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKiCool.g:3566:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3570:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKiCool.g:3571:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKiCool.g:3571:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKiCool.g:3572:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKiCool.g:3573:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKiCool.g:3573:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalKiCool.g:3597:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3601:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKiCool.g:3602:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
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
    // InternalKiCool.g:3609:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3613:1: ( ( ',' ) )
            // InternalKiCool.g:3614:1: ( ',' )
            {
            // InternalKiCool.g:3614:1: ( ',' )
            // InternalKiCool.g:3615:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3628:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3632:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKiCool.g:3633:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKiCool.g:3639:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3643:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKiCool.g:3644:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKiCool.g:3644:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKiCool.g:3645:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKiCool.g:3646:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKiCool.g:3646:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKiCool.g:3660:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3664:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3665:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:3672:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3676:1: ( ( '@' ) )
            // InternalKiCool.g:3677:1: ( '@' )
            {
            // InternalKiCool.g:3677:1: ( '@' )
            // InternalKiCool.g:3678:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3691:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3695:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3696:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2
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
    // InternalKiCool.g:3703:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3707:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3708:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3708:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3709:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3710:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3710:2: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3720:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2 : rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3724:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3725:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:3732:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3736:1: ( ( '[' ) )
            // InternalKiCool.g:3737:1: ( '[' )
            {
            // InternalKiCool.g:3737:1: ( '[' )
            // InternalKiCool.g:3738:1: '['
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
    // InternalKiCool.g:3751:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3 : rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3755:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKiCool.g:3756:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4
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
    // InternalKiCool.g:3763:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3767:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKiCool.g:3768:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKiCool.g:3768:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKiCool.g:3769:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKiCool.g:3770:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKiCool.g:3770:2: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKiCool.g:3780:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4 : rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3784:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKiCool.g:3785:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5
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
    // InternalKiCool.g:3792:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3796:1: ( ( ']' ) )
            // InternalKiCool.g:3797:1: ( ']' )
            {
            // InternalKiCool.g:3797:1: ( ']' )
            // InternalKiCool.g:3798:1: ']'
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
    // InternalKiCool.g:3811:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5 : rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3815:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKiCool.g:3816:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6
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
    // InternalKiCool.g:3823:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3827:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKiCool.g:3828:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKiCool.g:3828:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKiCool.g:3829:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKiCool.g:3830:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKiCool.g:3830:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKiCool.g:3840:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6 : rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3844:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKiCool.g:3845:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKiCool.g:3851:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3855:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKiCool.g:3856:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKiCool.g:3856:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKiCool.g:3857:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKiCool.g:3858:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==32) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKiCool.g:3858:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalKiCool.g:3882:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3886:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKiCool.g:3887:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1
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
    // InternalKiCool.g:3894:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3898:1: ( ( ',' ) )
            // InternalKiCool.g:3899:1: ( ',' )
            {
            // InternalKiCool.g:3899:1: ( ',' )
            // InternalKiCool.g:3900:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3913:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3917:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKiCool.g:3918:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKiCool.g:3924:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3928:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKiCool.g:3929:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKiCool.g:3929:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKiCool.g:3930:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKiCool.g:3931:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKiCool.g:3931:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKiCool.g:3945:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3949:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3950:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:3957:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3961:1: ( ( '@' ) )
            // InternalKiCool.g:3962:1: ( '@' )
            {
            // InternalKiCool.g:3962:1: ( '@' )
            // InternalKiCool.g:3963:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:3976:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3980:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3981:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
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
    // InternalKiCool.g:3988:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:3992:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3993:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3993:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3994:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3995:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3995:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:4005:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4009:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:4010:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:4017:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4021:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:4022:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:4022:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:4023:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:4024:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:4024:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKiCool.g:4034:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4038:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKiCool.g:4039:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKiCool.g:4045:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4049:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKiCool.g:4050:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKiCool.g:4050:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKiCool.g:4051:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:4052:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==32) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKiCool.g:4052:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalKiCool.g:4070:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4074:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:4075:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
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
    // InternalKiCool.g:4082:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4086:1: ( ( ',' ) )
            // InternalKiCool.g:4087:1: ( ',' )
            {
            // InternalKiCool.g:4087:1: ( ',' )
            // InternalKiCool.g:4088:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4101:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4105:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:4106:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKiCool.g:4112:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4116:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:4117:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:4117:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:4118:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:4119:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:4119:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKiCool.g:4133:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4137:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:4138:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:4145:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4149:1: ( ( '@' ) )
            // InternalKiCool.g:4150:1: ( '@' )
            {
            // InternalKiCool.g:4150:1: ( '@' )
            // InternalKiCool.g:4151:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4164:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4168:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:4169:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
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
    // InternalKiCool.g:4176:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4180:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:4181:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:4181:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:4182:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:4183:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:4183:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:4193:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4197:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:4198:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:4205:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4209:1: ( ( '[' ) )
            // InternalKiCool.g:4210:1: ( '[' )
            {
            // InternalKiCool.g:4210:1: ( '[' )
            // InternalKiCool.g:4211:1: '['
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
    // InternalKiCool.g:4224:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4228:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKiCool.g:4229:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
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
    // InternalKiCool.g:4236:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4240:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKiCool.g:4241:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKiCool.g:4241:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKiCool.g:4242:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKiCool.g:4243:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKiCool.g:4243:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKiCool.g:4253:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4257:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKiCool.g:4258:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
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
    // InternalKiCool.g:4265:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4269:1: ( ( ']' ) )
            // InternalKiCool.g:4270:1: ( ']' )
            {
            // InternalKiCool.g:4270:1: ( ']' )
            // InternalKiCool.g:4271:1: ']'
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
    // InternalKiCool.g:4284:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4288:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKiCool.g:4289:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
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
    // InternalKiCool.g:4296:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4300:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKiCool.g:4301:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKiCool.g:4301:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKiCool.g:4302:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKiCool.g:4303:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKiCool.g:4303:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKiCool.g:4313:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4317:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKiCool.g:4318:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKiCool.g:4324:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4328:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKiCool.g:4329:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKiCool.g:4329:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKiCool.g:4330:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKiCool.g:4331:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==32) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKiCool.g:4331:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalKiCool.g:4355:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4359:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKiCool.g:4360:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
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
    // InternalKiCool.g:4367:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4371:1: ( ( ',' ) )
            // InternalKiCool.g:4372:1: ( ',' )
            {
            // InternalKiCool.g:4372:1: ( ',' )
            // InternalKiCool.g:4373:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4386:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4390:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKiCool.g:4391:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKiCool.g:4397:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4401:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKiCool.g:4402:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKiCool.g:4402:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKiCool.g:4403:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKiCool.g:4404:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKiCool.g:4404:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKiCool.g:4418:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4422:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalKiCool.g:4423:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
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
    // InternalKiCool.g:4430:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4434:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4435:1: ( RULE_ID )
            {
            // InternalKiCool.g:4435:1: ( RULE_ID )
            // InternalKiCool.g:4436:1: RULE_ID
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
    // InternalKiCool.g:4447:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4451:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalKiCool.g:4452:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
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
    // InternalKiCool.g:4459:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4463:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // InternalKiCool.g:4464:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // InternalKiCool.g:4464:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // InternalKiCool.g:4465:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // InternalKiCool.g:4466:1: ( rule__ExtendedID__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==17) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==RULE_ID) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==16) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKiCool.g:4466:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalKiCool.g:4476:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4480:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalKiCool.g:4481:2: rule__ExtendedID__Group__2__Impl
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
    // InternalKiCool.g:4487:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4491:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalKiCool.g:4492:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalKiCool.g:4492:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalKiCool.g:4493:1: ( rule__ExtendedID__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            }
            // InternalKiCool.g:4494:1: ( rule__ExtendedID__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKiCool.g:4494:2: rule__ExtendedID__Group_2__0
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
    // InternalKiCool.g:4510:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4514:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // InternalKiCool.g:4515:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
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
    // InternalKiCool.g:4522:1: rule__ExtendedID__Group_1__0__Impl : ( ( rule__ExtendedID__Alternatives_1_0 ) ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4526:1: ( ( ( rule__ExtendedID__Alternatives_1_0 ) ) )
            // InternalKiCool.g:4527:1: ( ( rule__ExtendedID__Alternatives_1_0 ) )
            {
            // InternalKiCool.g:4527:1: ( ( rule__ExtendedID__Alternatives_1_0 ) )
            // InternalKiCool.g:4528:1: ( rule__ExtendedID__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getAlternatives_1_0()); 
            }
            // InternalKiCool.g:4529:1: ( rule__ExtendedID__Alternatives_1_0 )
            // InternalKiCool.g:4529:2: rule__ExtendedID__Alternatives_1_0
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
    // InternalKiCool.g:4539:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4543:1: ( rule__ExtendedID__Group_1__1__Impl )
            // InternalKiCool.g:4544:2: rule__ExtendedID__Group_1__1__Impl
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
    // InternalKiCool.g:4550:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4554:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4555:1: ( RULE_ID )
            {
            // InternalKiCool.g:4555:1: ( RULE_ID )
            // InternalKiCool.g:4556:1: RULE_ID
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
    // InternalKiCool.g:4571:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4575:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalKiCool.g:4576:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
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
    // InternalKiCool.g:4583:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4587:1: ( ( '#' ) )
            // InternalKiCool.g:4588:1: ( '#' )
            {
            // InternalKiCool.g:4588:1: ( '#' )
            // InternalKiCool.g:4589:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:4602:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4606:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalKiCool.g:4607:2: rule__ExtendedID__Group_2__1__Impl
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
    // InternalKiCool.g:4613:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4617:1: ( ( RULE_INT ) )
            // InternalKiCool.g:4618:1: ( RULE_INT )
            {
            // InternalKiCool.g:4618:1: ( RULE_INT )
            // InternalKiCool.g:4619:1: RULE_INT
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
    // InternalKiCool.g:4634:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4638:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // InternalKiCool.g:4639:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
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
    // InternalKiCool.g:4646:1: rule__QualifiedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4650:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4651:1: ( RULE_ID )
            {
            // InternalKiCool.g:4651:1: ( RULE_ID )
            // InternalKiCool.g:4652:1: RULE_ID
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
    // InternalKiCool.g:4663:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4667:1: ( rule__QualifiedID__Group__1__Impl )
            // InternalKiCool.g:4668:2: rule__QualifiedID__Group__1__Impl
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
    // InternalKiCool.g:4674:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4678:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // InternalKiCool.g:4679:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // InternalKiCool.g:4679:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // InternalKiCool.g:4680:1: ( rule__QualifiedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            }
            // InternalKiCool.g:4681:1: ( rule__QualifiedID__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKiCool.g:4681:2: rule__QualifiedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__QualifiedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalKiCool.g:4695:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4699:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // InternalKiCool.g:4700:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
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
    // InternalKiCool.g:4707:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4711:1: ( ( '.' ) )
            // InternalKiCool.g:4712:1: ( '.' )
            {
            // InternalKiCool.g:4712:1: ( '.' )
            // InternalKiCool.g:4713:1: '.'
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
    // InternalKiCool.g:4726:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4730:1: ( rule__QualifiedID__Group_1__1__Impl )
            // InternalKiCool.g:4731:2: rule__QualifiedID__Group_1__1__Impl
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
    // InternalKiCool.g:4737:1: rule__QualifiedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4741:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4742:1: ( RULE_ID )
            {
            // InternalKiCool.g:4742:1: ( RULE_ID )
            // InternalKiCool.g:4743:1: RULE_ID
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
    // InternalKiCool.g:4758:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4762:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalKiCool.g:4763:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalKiCool.g:4770:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4774:1: ( ( ( '-' )? ) )
            // InternalKiCool.g:4775:1: ( ( '-' )? )
            {
            // InternalKiCool.g:4775:1: ( ( '-' )? )
            // InternalKiCool.g:4776:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKiCool.g:4777:1: ( '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==17) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKiCool.g:4778:2: '-'
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
    // InternalKiCool.g:4789:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4793:1: ( rule__Integer__Group__1__Impl )
            // InternalKiCool.g:4794:2: rule__Integer__Group__1__Impl
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
    // InternalKiCool.g:4800:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4804:1: ( ( RULE_INT ) )
            // InternalKiCool.g:4805:1: ( RULE_INT )
            {
            // InternalKiCool.g:4805:1: ( RULE_INT )
            // InternalKiCool.g:4806:1: RULE_INT
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
    // InternalKiCool.g:4821:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4825:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalKiCool.g:4826:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
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
    // InternalKiCool.g:4833:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4837:1: ( ( ( '-' )? ) )
            // InternalKiCool.g:4838:1: ( ( '-' )? )
            {
            // InternalKiCool.g:4838:1: ( ( '-' )? )
            // InternalKiCool.g:4839:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKiCool.g:4840:1: ( '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKiCool.g:4841:2: '-'
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
    // InternalKiCool.g:4852:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4856:1: ( rule__Floateger__Group__1__Impl )
            // InternalKiCool.g:4857:2: rule__Floateger__Group__1__Impl
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
    // InternalKiCool.g:4863:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4867:1: ( ( RULE_FLOAT ) )
            // InternalKiCool.g:4868:1: ( RULE_FLOAT )
            {
            // InternalKiCool.g:4868:1: ( RULE_FLOAT )
            // InternalKiCool.g:4869:1: RULE_FLOAT
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
    // InternalKiCool.g:4885:1: rule__System__IdAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__System__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4889:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:4890:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:4890:1: ( ruleQualifiedID )
            // InternalKiCool.g:4891:1: ruleQualifiedID
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
    // InternalKiCool.g:4900:1: rule__System__VersionAssignment_3 : ( RULE_INT ) ;
    public final void rule__System__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4904:1: ( ( RULE_INT ) )
            // InternalKiCool.g:4905:1: ( RULE_INT )
            {
            // InternalKiCool.g:4905:1: ( RULE_INT )
            // InternalKiCool.g:4906:1: RULE_INT
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
    // InternalKiCool.g:4915:1: rule__System__LabelAssignment_5 : ( ruleEString ) ;
    public final void rule__System__LabelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4919:1: ( ( ruleEString ) )
            // InternalKiCool.g:4920:1: ( ruleEString )
            {
            // InternalKiCool.g:4920:1: ( ruleEString )
            // InternalKiCool.g:4921:1: ruleEString
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
    // InternalKiCool.g:4930:1: rule__System__InputClassAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__System__InputClassAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4934:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4935:1: ( RULE_ID )
            {
            // InternalKiCool.g:4935:1: ( RULE_ID )
            // InternalKiCool.g:4936:1: RULE_ID
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
    // InternalKiCool.g:4945:1: rule__System__StartsetsAssignment_7_1 : ( ruleKVPair ) ;
    public final void rule__System__StartsetsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4949:1: ( ( ruleKVPair ) )
            // InternalKiCool.g:4950:1: ( ruleKVPair )
            {
            // InternalKiCool.g:4950:1: ( ruleKVPair )
            // InternalKiCool.g:4951:1: ruleKVPair
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
    // InternalKiCool.g:4960:1: rule__System__IntermediatesAssignment_8 : ( ruleIntermediateReference ) ;
    public final void rule__System__IntermediatesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4964:1: ( ( ruleIntermediateReference ) )
            // InternalKiCool.g:4965:1: ( ruleIntermediateReference )
            {
            // InternalKiCool.g:4965:1: ( ruleIntermediateReference )
            // InternalKiCool.g:4966:1: ruleIntermediateReference
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
    // InternalKiCool.g:4975:1: rule__System__ProcessorsAssignment_9 : ( ruleProcessorGroup ) ;
    public final void rule__System__ProcessorsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4979:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:4980:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:4980:1: ( ruleProcessorGroup )
            // InternalKiCool.g:4981:1: ruleProcessorGroup
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
    // InternalKiCool.g:4990:1: rule__IntermediateReference__IdAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__IntermediateReference__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:4994:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:4995:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:4995:1: ( ruleQualifiedID )
            // InternalKiCool.g:4996:1: ruleQualifiedID
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
    // InternalKiCool.g:5005:1: rule__IntermediateReference__AliasAssignment_2_1 : ( ruleEString ) ;
    public final void rule__IntermediateReference__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5009:1: ( ( ruleEString ) )
            // InternalKiCool.g:5010:1: ( ruleEString )
            {
            // InternalKiCool.g:5010:1: ( ruleEString )
            // InternalKiCool.g:5011:1: ruleEString
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
    // InternalKiCool.g:5020:1: rule__ProcessorGroup__LabelAssignment_0_1 : ( ruleEString ) ;
    public final void rule__ProcessorGroup__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5024:1: ( ( ruleEString ) )
            // InternalKiCool.g:5025:1: ( ruleEString )
            {
            // InternalKiCool.g:5025:1: ( ruleEString )
            // InternalKiCool.g:5026:1: ruleEString
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
    // InternalKiCool.g:5035:1: rule__ProcessorGroup__ProcessorsAssignment_1_0 : ( ruleProcessor ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5039:1: ( ( ruleProcessor ) )
            // InternalKiCool.g:5040:1: ( ruleProcessor )
            {
            // InternalKiCool.g:5040:1: ( ruleProcessor )
            // InternalKiCool.g:5041:1: ruleProcessor
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
    // InternalKiCool.g:5050:1: rule__ProcessorGroup__ProcessorsAssignment_1_1_1 : ( ruleProcessorSystem ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5054:1: ( ( ruleProcessorSystem ) )
            // InternalKiCool.g:5055:1: ( ruleProcessorSystem )
            {
            // InternalKiCool.g:5055:1: ( ruleProcessorSystem )
            // InternalKiCool.g:5056:1: ruleProcessorSystem
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
    // InternalKiCool.g:5065:1: rule__ProcessorGroup__ProcessorsAssignment_1_2_1 : ( ruleProcessorAlternativeGroup ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5069:1: ( ( ruleProcessorAlternativeGroup ) )
            // InternalKiCool.g:5070:1: ( ruleProcessorAlternativeGroup )
            {
            // InternalKiCool.g:5070:1: ( ruleProcessorAlternativeGroup )
            // InternalKiCool.g:5071:1: ruleProcessorAlternativeGroup
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
    // InternalKiCool.g:5080:1: rule__ProcessorGroup__ProcessorsAssignment_1_3_1 : ( ruleProcessorGroup ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5084:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:5085:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:5085:1: ( ruleProcessorGroup )
            // InternalKiCool.g:5086:1: ruleProcessorGroup
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
    // InternalKiCool.g:5095:1: rule__Processor__PresetsAssignment_0_1_1 : ( ruleKVPair ) ;
    public final void rule__Processor__PresetsAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5099:1: ( ( ruleKVPair ) )
            // InternalKiCool.g:5100:1: ( ruleKVPair )
            {
            // InternalKiCool.g:5100:1: ( ruleKVPair )
            // InternalKiCool.g:5101:1: ruleKVPair
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
    // InternalKiCool.g:5110:1: rule__Processor__IdAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__Processor__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5114:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5115:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:5115:1: ( ruleQualifiedID )
            // InternalKiCool.g:5116:1: ruleQualifiedID
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
    // InternalKiCool.g:5125:1: rule__Processor__MetricAssignment_2_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Processor__MetricAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5129:1: ( ( ( ruleQualifiedID ) ) )
            // InternalKiCool.g:5130:1: ( ( ruleQualifiedID ) )
            {
            // InternalKiCool.g:5130:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5131:1: ( ruleQualifiedID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getMetricIntermediateReferenceCrossReference_2_1_0()); 
            }
            // InternalKiCool.g:5132:1: ( ruleQualifiedID )
            // InternalKiCool.g:5133:1: ruleQualifiedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getMetricIntermediateReferenceQualifiedIDParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getMetricIntermediateReferenceQualifiedIDParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getMetricIntermediateReferenceCrossReference_2_1_0()); 
            }

            }


            }

        }
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
    // InternalKiCool.g:5144:1: rule__Processor__PostsetsAssignment_3_1_1 : ( ruleKVPair ) ;
    public final void rule__Processor__PostsetsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5148:1: ( ( ruleKVPair ) )
            // InternalKiCool.g:5149:1: ( ruleKVPair )
            {
            // InternalKiCool.g:5149:1: ( ruleKVPair )
            // InternalKiCool.g:5150:1: ruleKVPair
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
    // InternalKiCool.g:5159:1: rule__ProcessorSystem__IdAssignment : ( ruleQualifiedID ) ;
    public final void rule__ProcessorSystem__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5163:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:5164:1: ( ruleQualifiedID )
            {
            // InternalKiCool.g:5164:1: ( ruleQualifiedID )
            // InternalKiCool.g:5165:1: ruleQualifiedID
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
    // InternalKiCool.g:5174:1: rule__ProcessorAlternativeGroup__LabelAssignment_0_1 : ( ruleEString ) ;
    public final void rule__ProcessorAlternativeGroup__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5178:1: ( ( ruleEString ) )
            // InternalKiCool.g:5179:1: ( ruleEString )
            {
            // InternalKiCool.g:5179:1: ( ruleEString )
            // InternalKiCool.g:5180:1: ruleEString
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
    // InternalKiCool.g:5189:1: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 : ( ruleProcessorGroup ) ;
    public final void rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5193:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:5194:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:5194:1: ( ruleProcessorGroup )
            // InternalKiCool.g:5195:1: ruleProcessorGroup
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
    // InternalKiCool.g:5204:1: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 : ( ruleProcessorGroup ) ;
    public final void rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5208:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:5209:1: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:5209:1: ( ruleProcessorGroup )
            // InternalKiCool.g:5210:1: ruleProcessorGroup
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
    // InternalKiCool.g:5219:1: rule__KVPair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KVPair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5223:1: ( ( ruleEString ) )
            // InternalKiCool.g:5224:1: ( ruleEString )
            {
            // InternalKiCool.g:5224:1: ( ruleEString )
            // InternalKiCool.g:5225:1: ruleEString
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
    // InternalKiCool.g:5234:1: rule__KVPair__IsKeyValueAssignment_1 : ( ( 'key' ) ) ;
    public final void rule__KVPair__IsKeyValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5238:1: ( ( ( 'key' ) ) )
            // InternalKiCool.g:5239:1: ( ( 'key' ) )
            {
            // InternalKiCool.g:5239:1: ( ( 'key' ) )
            // InternalKiCool.g:5240:1: ( 'key' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getIsKeyValueKeyKeyword_1_0()); 
            }
            // InternalKiCool.g:5241:1: ( 'key' )
            // InternalKiCool.g:5242:1: 'key'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getIsKeyValueKeyKeyword_1_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalKiCool.g:5257:1: rule__KVPair__ValueAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KVPair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5261:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5262:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5262:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5263:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5272:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5276:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalKiCool.g:5277:1: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalKiCool.g:5277:1: ( RULE_COMMENT_ANNOTATION )
            // InternalKiCool.g:5278:1: RULE_COMMENT_ANNOTATION
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
    // InternalKiCool.g:5288:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5292:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5293:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5293:1: ( ruleExtendedID )
            // InternalKiCool.g:5294:1: ruleExtendedID
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
    // InternalKiCool.g:5303:1: rule__PragmaTag__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__PragmaTag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5307:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5308:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5308:1: ( ruleExtendedID )
            // InternalKiCool.g:5309:1: ruleExtendedID
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
    // InternalKiCool.g:5318:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5322:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5323:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5323:1: ( ruleExtendedID )
            // InternalKiCool.g:5324:1: ruleExtendedID
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
    // InternalKiCool.g:5333:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5337:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5338:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5338:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5339:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5348:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5352:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5353:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5353:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5354:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5363:1: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5367:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5368:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5368:1: ( ruleExtendedID )
            // InternalKiCool.g:5369:1: ruleExtendedID
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
    // InternalKiCool.g:5378:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5382:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5383:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5383:1: ( ruleEStringBoolean )
            // InternalKiCool.g:5384:1: ruleEStringBoolean
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
    // InternalKiCool.g:5393:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5397:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5398:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5398:1: ( ruleEStringBoolean )
            // InternalKiCool.g:5399:1: ruleEStringBoolean
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
    // InternalKiCool.g:5408:1: rule__StringPragma__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__StringPragma__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5412:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5413:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5413:1: ( ruleExtendedID )
            // InternalKiCool.g:5414:1: ruleExtendedID
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
    // InternalKiCool.g:5423:1: rule__StringPragma__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5427:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5428:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5428:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5429:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5438:1: rule__StringPragma__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5442:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5443:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5443:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5444:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5453:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5457:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5458:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5458:1: ( ruleExtendedID )
            // InternalKiCool.g:5459:1: ruleExtendedID
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
    // InternalKiCool.g:5468:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5472:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5473:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5473:1: ( ruleExtendedID )
            // InternalKiCool.g:5474:1: ruleExtendedID
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
    // InternalKiCool.g:5483:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5487:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5488:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5488:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5489:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5498:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5502:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5503:1: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5503:1: ( ruleEStringAllTypes )
            // InternalKiCool.g:5504:1: ruleEStringAllTypes
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
    // InternalKiCool.g:5513:1: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5517:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5518:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5518:1: ( ruleExtendedID )
            // InternalKiCool.g:5519:1: ruleExtendedID
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
    // InternalKiCool.g:5528:1: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5532:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5533:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5533:1: ( ruleExtendedID )
            // InternalKiCool.g:5534:1: ruleExtendedID
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
    // InternalKiCool.g:5543:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5547:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5548:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5548:1: ( ruleEStringBoolean )
            // InternalKiCool.g:5549:1: ruleEStringBoolean
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
    // InternalKiCool.g:5558:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5562:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5563:1: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5563:1: ( ruleEStringBoolean )
            // InternalKiCool.g:5564:1: ruleEStringBoolean
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
    // InternalKiCool.g:5573:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5577:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5578:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5578:1: ( ruleExtendedID )
            // InternalKiCool.g:5579:1: ruleExtendedID
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
    // InternalKiCool.g:5588:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5592:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:5593:1: ( RULE_STRING )
            {
            // InternalKiCool.g:5593:1: ( RULE_STRING )
            // InternalKiCool.g:5594:1: RULE_STRING
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
    // InternalKiCool.g:5603:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5607:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:5608:1: ( RULE_STRING )
            {
            // InternalKiCool.g:5608:1: ( RULE_STRING )
            // InternalKiCool.g:5609:1: RULE_STRING
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
    // InternalKiCool.g:5618:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5622:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5623:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5623:1: ( ruleExtendedID )
            // InternalKiCool.g:5624:1: ruleExtendedID
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
    // InternalKiCool.g:5633:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5637:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5638:1: ( ruleExtendedID )
            {
            // InternalKiCool.g:5638:1: ( ruleExtendedID )
            // InternalKiCool.g:5639:1: ruleExtendedID
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
    // InternalKiCool.g:5648:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5652:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:5653:1: ( RULE_STRING )
            {
            // InternalKiCool.g:5653:1: ( RULE_STRING )
            // InternalKiCool.g:5654:1: RULE_STRING
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
    // InternalKiCool.g:5663:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalKiCool.g:5667:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:5668:1: ( RULE_STRING )
            {
            // InternalKiCool.g:5668:1: ( RULE_STRING )
            // InternalKiCool.g:5669:1: RULE_STRING
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
        // InternalKiCool.g:762:6: ( ( ( rule__ProcessorGroup__Group_1_2__0 ) ) )
        // InternalKiCool.g:762:6: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
        {
        // InternalKiCool.g:762:6: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
        // InternalKiCool.g:763:1: ( rule__ProcessorGroup__Group_1_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getProcessorGroupAccess().getGroup_1_2()); 
        }
        // InternalKiCool.g:764:1: ( rule__ProcessorGroup__Group_1_2__0 )
        // InternalKiCool.g:764:2: rule__ProcessorGroup__Group_1_2__0
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

    // $ANTLR start synpred23_InternalKiCool
    public final void synpred23_InternalKiCool_fragment() throws RecognitionException {   
        // InternalKiCool.g:2357:2: ( rule__ProcessorAlternativeGroup__Group_0__0 )
        // InternalKiCool.g:2357:2: rule__ProcessorAlternativeGroup__Group_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__ProcessorAlternativeGroup__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalKiCool

    // Delegated rules

    public final boolean synpred23_InternalKiCool() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalKiCool_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000002000201F0L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080030000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000030002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020080L});
    }


}