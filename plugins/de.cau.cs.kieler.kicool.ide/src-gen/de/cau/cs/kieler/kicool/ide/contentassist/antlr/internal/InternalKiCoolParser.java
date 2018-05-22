package de.cau.cs.kieler.kicool.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
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
    // InternalKiCool.g:54:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalKiCool.g:55:1: ( ruleSystem EOF )
            // InternalKiCool.g:56:1: ruleSystem EOF
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
    // InternalKiCool.g:63:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:67:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalKiCool.g:68:2: ( ( rule__System__Group__0 ) )
            {
            // InternalKiCool.g:68:2: ( ( rule__System__Group__0 ) )
            // InternalKiCool.g:69:3: ( rule__System__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getGroup()); 
            }
            // InternalKiCool.g:70:3: ( rule__System__Group__0 )
            // InternalKiCool.g:70:4: rule__System__Group__0
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
    // InternalKiCool.g:79:1: entryRuleIntermediateReference : ruleIntermediateReference EOF ;
    public final void entryRuleIntermediateReference() throws RecognitionException {
        try {
            // InternalKiCool.g:80:1: ( ruleIntermediateReference EOF )
            // InternalKiCool.g:81:1: ruleIntermediateReference EOF
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
    // InternalKiCool.g:88:1: ruleIntermediateReference : ( ( rule__IntermediateReference__Group__0 ) ) ;
    public final void ruleIntermediateReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:92:2: ( ( ( rule__IntermediateReference__Group__0 ) ) )
            // InternalKiCool.g:93:2: ( ( rule__IntermediateReference__Group__0 ) )
            {
            // InternalKiCool.g:93:2: ( ( rule__IntermediateReference__Group__0 ) )
            // InternalKiCool.g:94:3: ( rule__IntermediateReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getGroup()); 
            }
            // InternalKiCool.g:95:3: ( rule__IntermediateReference__Group__0 )
            // InternalKiCool.g:95:4: rule__IntermediateReference__Group__0
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
    // InternalKiCool.g:104:1: entryRuleProcessorGroup : ruleProcessorGroup EOF ;
    public final void entryRuleProcessorGroup() throws RecognitionException {
        try {
            // InternalKiCool.g:105:1: ( ruleProcessorGroup EOF )
            // InternalKiCool.g:106:1: ruleProcessorGroup EOF
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
    // InternalKiCool.g:113:1: ruleProcessorGroup : ( ( rule__ProcessorGroup__Group__0 ) ) ;
    public final void ruleProcessorGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:117:2: ( ( ( rule__ProcessorGroup__Group__0 ) ) )
            // InternalKiCool.g:118:2: ( ( rule__ProcessorGroup__Group__0 ) )
            {
            // InternalKiCool.g:118:2: ( ( rule__ProcessorGroup__Group__0 ) )
            // InternalKiCool.g:119:3: ( rule__ProcessorGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getGroup()); 
            }
            // InternalKiCool.g:120:3: ( rule__ProcessorGroup__Group__0 )
            // InternalKiCool.g:120:4: rule__ProcessorGroup__Group__0
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
    // InternalKiCool.g:129:1: entryRuleProcessor : ruleProcessor EOF ;
    public final void entryRuleProcessor() throws RecognitionException {
        try {
            // InternalKiCool.g:130:1: ( ruleProcessor EOF )
            // InternalKiCool.g:131:1: ruleProcessor EOF
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
    // InternalKiCool.g:138:1: ruleProcessor : ( ( rule__Processor__Group__0 ) ) ;
    public final void ruleProcessor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:142:2: ( ( ( rule__Processor__Group__0 ) ) )
            // InternalKiCool.g:143:2: ( ( rule__Processor__Group__0 ) )
            {
            // InternalKiCool.g:143:2: ( ( rule__Processor__Group__0 ) )
            // InternalKiCool.g:144:3: ( rule__Processor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup()); 
            }
            // InternalKiCool.g:145:3: ( rule__Processor__Group__0 )
            // InternalKiCool.g:145:4: rule__Processor__Group__0
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
    // InternalKiCool.g:154:1: entryRuleCoProcessor : ruleCoProcessor EOF ;
    public final void entryRuleCoProcessor() throws RecognitionException {
        try {
            // InternalKiCool.g:155:1: ( ruleCoProcessor EOF )
            // InternalKiCool.g:156:1: ruleCoProcessor EOF
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
    // InternalKiCool.g:163:1: ruleCoProcessor : ( ( rule__CoProcessor__Group__0 ) ) ;
    public final void ruleCoProcessor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:167:2: ( ( ( rule__CoProcessor__Group__0 ) ) )
            // InternalKiCool.g:168:2: ( ( rule__CoProcessor__Group__0 ) )
            {
            // InternalKiCool.g:168:2: ( ( rule__CoProcessor__Group__0 ) )
            // InternalKiCool.g:169:3: ( rule__CoProcessor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoProcessorAccess().getGroup()); 
            }
            // InternalKiCool.g:170:3: ( rule__CoProcessor__Group__0 )
            // InternalKiCool.g:170:4: rule__CoProcessor__Group__0
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
    // InternalKiCool.g:179:1: entryRuleProcessorSystem : ruleProcessorSystem EOF ;
    public final void entryRuleProcessorSystem() throws RecognitionException {
        try {
            // InternalKiCool.g:180:1: ( ruleProcessorSystem EOF )
            // InternalKiCool.g:181:1: ruleProcessorSystem EOF
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
    // InternalKiCool.g:188:1: ruleProcessorSystem : ( ( rule__ProcessorSystem__IdAssignment ) ) ;
    public final void ruleProcessorSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:192:2: ( ( ( rule__ProcessorSystem__IdAssignment ) ) )
            // InternalKiCool.g:193:2: ( ( rule__ProcessorSystem__IdAssignment ) )
            {
            // InternalKiCool.g:193:2: ( ( rule__ProcessorSystem__IdAssignment ) )
            // InternalKiCool.g:194:3: ( rule__ProcessorSystem__IdAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorSystemAccess().getIdAssignment()); 
            }
            // InternalKiCool.g:195:3: ( rule__ProcessorSystem__IdAssignment )
            // InternalKiCool.g:195:4: rule__ProcessorSystem__IdAssignment
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
    // InternalKiCool.g:204:1: entryRuleProcessorAlternativeGroup : ruleProcessorAlternativeGroup EOF ;
    public final void entryRuleProcessorAlternativeGroup() throws RecognitionException {
        try {
            // InternalKiCool.g:205:1: ( ruleProcessorAlternativeGroup EOF )
            // InternalKiCool.g:206:1: ruleProcessorAlternativeGroup EOF
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
    // InternalKiCool.g:213:1: ruleProcessorAlternativeGroup : ( ( rule__ProcessorAlternativeGroup__Group__0 ) ) ;
    public final void ruleProcessorAlternativeGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:217:2: ( ( ( rule__ProcessorAlternativeGroup__Group__0 ) ) )
            // InternalKiCool.g:218:2: ( ( rule__ProcessorAlternativeGroup__Group__0 ) )
            {
            // InternalKiCool.g:218:2: ( ( rule__ProcessorAlternativeGroup__Group__0 ) )
            // InternalKiCool.g:219:3: ( rule__ProcessorAlternativeGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup()); 
            }
            // InternalKiCool.g:220:3: ( rule__ProcessorAlternativeGroup__Group__0 )
            // InternalKiCool.g:220:4: rule__ProcessorAlternativeGroup__Group__0
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
            // InternalKiCool.g:243:2: ( ( rule__KVPair__Group__0 ) )
            {
            // InternalKiCool.g:243:2: ( ( rule__KVPair__Group__0 ) )
            // InternalKiCool.g:244:3: ( rule__KVPair__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getGroup()); 
            }
            // InternalKiCool.g:245:3: ( rule__KVPair__Group__0 )
            // InternalKiCool.g:245:4: rule__KVPair__Group__0
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
    // InternalKiCool.g:254:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:255:1: ( ruleCommentAnnotation EOF )
            // InternalKiCool.g:256:1: ruleCommentAnnotation EOF
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
    // InternalKiCool.g:263:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValuesAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:267:2: ( ( ( rule__CommentAnnotation__ValuesAssignment ) ) )
            // InternalKiCool.g:268:2: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            {
            // InternalKiCool.g:268:2: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            // InternalKiCool.g:269:3: ( rule__CommentAnnotation__ValuesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            }
            // InternalKiCool.g:270:3: ( rule__CommentAnnotation__ValuesAssignment )
            // InternalKiCool.g:270:4: rule__CommentAnnotation__ValuesAssignment
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
    // InternalKiCool.g:279:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:280:1: ( ruleTagAnnotation EOF )
            // InternalKiCool.g:281:1: ruleTagAnnotation EOF
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
    // InternalKiCool.g:288:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:292:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // InternalKiCool.g:293:2: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:293:2: ( ( rule__TagAnnotation__Group__0 ) )
            // InternalKiCool.g:294:3: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:295:3: ( rule__TagAnnotation__Group__0 )
            // InternalKiCool.g:295:4: rule__TagAnnotation__Group__0
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
    // InternalKiCool.g:304:1: entryRulePragmaTag : rulePragmaTag EOF ;
    public final void entryRulePragmaTag() throws RecognitionException {
        try {
            // InternalKiCool.g:305:1: ( rulePragmaTag EOF )
            // InternalKiCool.g:306:1: rulePragmaTag EOF
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
    // InternalKiCool.g:313:1: rulePragmaTag : ( ( rule__PragmaTag__Group__0 ) ) ;
    public final void rulePragmaTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:317:2: ( ( ( rule__PragmaTag__Group__0 ) ) )
            // InternalKiCool.g:318:2: ( ( rule__PragmaTag__Group__0 ) )
            {
            // InternalKiCool.g:318:2: ( ( rule__PragmaTag__Group__0 ) )
            // InternalKiCool.g:319:3: ( rule__PragmaTag__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getGroup()); 
            }
            // InternalKiCool.g:320:3: ( rule__PragmaTag__Group__0 )
            // InternalKiCool.g:320:4: rule__PragmaTag__Group__0
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
    // InternalKiCool.g:329:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:330:1: ( ruleKeyStringValueAnnotation EOF )
            // InternalKiCool.g:331:1: ruleKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:338:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:342:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:343:2: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:343:2: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:344:3: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:345:3: ( rule__KeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:345:4: rule__KeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:354:1: entryRuleRestrictedKeyStringValueAnnotation : ruleRestrictedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:355:1: ( ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:356:1: ruleRestrictedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:363:1: ruleRestrictedKeyStringValueAnnotation : ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:367:2: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:368:2: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:368:2: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:369:3: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:370:3: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:370:4: rule__RestrictedKeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:379:1: entryRuleStringPragma : ruleStringPragma EOF ;
    public final void entryRuleStringPragma() throws RecognitionException {
        try {
            // InternalKiCool.g:380:1: ( ruleStringPragma EOF )
            // InternalKiCool.g:381:1: ruleStringPragma EOF
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
    // InternalKiCool.g:388:1: ruleStringPragma : ( ( rule__StringPragma__Group__0 ) ) ;
    public final void ruleStringPragma() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:392:2: ( ( ( rule__StringPragma__Group__0 ) ) )
            // InternalKiCool.g:393:2: ( ( rule__StringPragma__Group__0 ) )
            {
            // InternalKiCool.g:393:2: ( ( rule__StringPragma__Group__0 ) )
            // InternalKiCool.g:394:3: ( rule__StringPragma__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getGroup()); 
            }
            // InternalKiCool.g:395:3: ( rule__StringPragma__Group__0 )
            // InternalKiCool.g:395:4: rule__StringPragma__Group__0
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
    // InternalKiCool.g:404:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:405:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:406:1: ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:413:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:417:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:418:2: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:418:2: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:419:3: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:420:3: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:420:4: rule__TypedKeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:429:1: entryRuleRestrictedTypedKeyStringValueAnnotation : ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:430:1: ( ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:431:1: ruleRestrictedTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:438:1: ruleRestrictedTypedKeyStringValueAnnotation : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:442:2: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:443:2: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:443:2: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:444:3: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:445:3: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:445:4: rule__RestrictedTypedKeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:454:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:455:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:456:1: ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:463:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:467:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:468:2: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:468:2: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:469:3: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:470:3: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:470:4: rule__QuotedKeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:479:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalKiCool.g:480:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKiCool.g:481:1: ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKiCool.g:488:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:492:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalKiCool.g:493:2: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalKiCool.g:493:2: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalKiCool.g:494:3: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // InternalKiCool.g:495:3: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // InternalKiCool.g:495:4: rule__QuotedTypedKeyStringValueAnnotation__Group__0
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
    // InternalKiCool.g:504:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKiCool.g:505:1: ( ruleEString EOF )
            // InternalKiCool.g:506:1: ruleEString EOF
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
    // InternalKiCool.g:513:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:517:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalKiCool.g:518:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalKiCool.g:518:2: ( ( rule__EString__Alternatives ) )
            // InternalKiCool.g:519:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalKiCool.g:520:3: ( rule__EString__Alternatives )
            // InternalKiCool.g:520:4: rule__EString__Alternatives
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
    // InternalKiCool.g:529:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // InternalKiCool.g:530:1: ( ruleEStringBoolean EOF )
            // InternalKiCool.g:531:1: ruleEStringBoolean EOF
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
    // InternalKiCool.g:538:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:542:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // InternalKiCool.g:543:2: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // InternalKiCool.g:543:2: ( ( rule__EStringBoolean__Alternatives ) )
            // InternalKiCool.g:544:3: ( rule__EStringBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            }
            // InternalKiCool.g:545:3: ( rule__EStringBoolean__Alternatives )
            // InternalKiCool.g:545:4: rule__EStringBoolean__Alternatives
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
    // InternalKiCool.g:554:1: entryRuleEStringAllTypes : ruleEStringAllTypes EOF ;
    public final void entryRuleEStringAllTypes() throws RecognitionException {
        try {
            // InternalKiCool.g:555:1: ( ruleEStringAllTypes EOF )
            // InternalKiCool.g:556:1: ruleEStringAllTypes EOF
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
    // InternalKiCool.g:563:1: ruleEStringAllTypes : ( ( rule__EStringAllTypes__Alternatives ) ) ;
    public final void ruleEStringAllTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:567:2: ( ( ( rule__EStringAllTypes__Alternatives ) ) )
            // InternalKiCool.g:568:2: ( ( rule__EStringAllTypes__Alternatives ) )
            {
            // InternalKiCool.g:568:2: ( ( rule__EStringAllTypes__Alternatives ) )
            // InternalKiCool.g:569:3: ( rule__EStringAllTypes__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAllTypesAccess().getAlternatives()); 
            }
            // InternalKiCool.g:570:3: ( rule__EStringAllTypes__Alternatives )
            // InternalKiCool.g:570:4: rule__EStringAllTypes__Alternatives
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
    // InternalKiCool.g:579:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // InternalKiCool.g:580:1: ( ruleExtendedID EOF )
            // InternalKiCool.g:581:1: ruleExtendedID EOF
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
    // InternalKiCool.g:588:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:592:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // InternalKiCool.g:593:2: ( ( rule__ExtendedID__Group__0 ) )
            {
            // InternalKiCool.g:593:2: ( ( rule__ExtendedID__Group__0 ) )
            // InternalKiCool.g:594:3: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // InternalKiCool.g:595:3: ( rule__ExtendedID__Group__0 )
            // InternalKiCool.g:595:4: rule__ExtendedID__Group__0
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
    // InternalKiCool.g:604:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // InternalKiCool.g:605:1: ( ruleQualifiedID EOF )
            // InternalKiCool.g:606:1: ruleQualifiedID EOF
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
    // InternalKiCool.g:613:1: ruleQualifiedID : ( ( rule__QualifiedID__Group__0 ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:617:2: ( ( ( rule__QualifiedID__Group__0 ) ) )
            // InternalKiCool.g:618:2: ( ( rule__QualifiedID__Group__0 ) )
            {
            // InternalKiCool.g:618:2: ( ( rule__QualifiedID__Group__0 ) )
            // InternalKiCool.g:619:3: ( rule__QualifiedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedIDAccess().getGroup()); 
            }
            // InternalKiCool.g:620:3: ( rule__QualifiedID__Group__0 )
            // InternalKiCool.g:620:4: rule__QualifiedID__Group__0
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
    // InternalKiCool.g:629:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalKiCool.g:630:1: ( ruleInteger EOF )
            // InternalKiCool.g:631:1: ruleInteger EOF
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
    // InternalKiCool.g:638:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:642:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalKiCool.g:643:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalKiCool.g:643:2: ( ( rule__Integer__Group__0 ) )
            // InternalKiCool.g:644:3: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // InternalKiCool.g:645:3: ( rule__Integer__Group__0 )
            // InternalKiCool.g:645:4: rule__Integer__Group__0
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
    // InternalKiCool.g:654:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // InternalKiCool.g:655:1: ( ruleFloateger EOF )
            // InternalKiCool.g:656:1: ruleFloateger EOF
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
    // InternalKiCool.g:663:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:667:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // InternalKiCool.g:668:2: ( ( rule__Floateger__Group__0 ) )
            {
            // InternalKiCool.g:668:2: ( ( rule__Floateger__Group__0 ) )
            // InternalKiCool.g:669:3: ( rule__Floateger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getGroup()); 
            }
            // InternalKiCool.g:670:3: ( rule__Floateger__Group__0 )
            // InternalKiCool.g:670:4: rule__Floateger__Group__0
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
    // InternalKiCool.g:678:1: rule__ProcessorGroup__Alternatives_1 : ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) ) | ( ( rule__ProcessorGroup__Group_1_1__0 ) ) | ( ( rule__ProcessorGroup__Group_1_2__0 ) ) | ( ( rule__ProcessorGroup__Group_1_3__0 ) ) );
    public final void rule__ProcessorGroup__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:682:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) ) | ( ( rule__ProcessorGroup__Group_1_1__0 ) ) | ( ( rule__ProcessorGroup__Group_1_2__0 ) ) | ( ( rule__ProcessorGroup__Group_1_3__0 ) ) )
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
                    // InternalKiCool.g:683:2: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) )
                    {
                    // InternalKiCool.g:683:2: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_0 ) )
                    // InternalKiCool.g:684:3: ( rule__ProcessorGroup__ProcessorsAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_0()); 
                    }
                    // InternalKiCool.g:685:3: ( rule__ProcessorGroup__ProcessorsAssignment_1_0 )
                    // InternalKiCool.g:685:4: rule__ProcessorGroup__ProcessorsAssignment_1_0
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
                    // InternalKiCool.g:689:2: ( ( rule__ProcessorGroup__Group_1_1__0 ) )
                    {
                    // InternalKiCool.g:689:2: ( ( rule__ProcessorGroup__Group_1_1__0 ) )
                    // InternalKiCool.g:690:3: ( rule__ProcessorGroup__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getGroup_1_1()); 
                    }
                    // InternalKiCool.g:691:3: ( rule__ProcessorGroup__Group_1_1__0 )
                    // InternalKiCool.g:691:4: rule__ProcessorGroup__Group_1_1__0
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
                    // InternalKiCool.g:695:2: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
                    {
                    // InternalKiCool.g:695:2: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
                    // InternalKiCool.g:696:3: ( rule__ProcessorGroup__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getGroup_1_2()); 
                    }
                    // InternalKiCool.g:697:3: ( rule__ProcessorGroup__Group_1_2__0 )
                    // InternalKiCool.g:697:4: rule__ProcessorGroup__Group_1_2__0
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
                    // InternalKiCool.g:701:2: ( ( rule__ProcessorGroup__Group_1_3__0 ) )
                    {
                    // InternalKiCool.g:701:2: ( ( rule__ProcessorGroup__Group_1_3__0 ) )
                    // InternalKiCool.g:702:3: ( rule__ProcessorGroup__Group_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorGroupAccess().getGroup_1_3()); 
                    }
                    // InternalKiCool.g:703:3: ( rule__ProcessorGroup__Group_1_3__0 )
                    // InternalKiCool.g:703:4: rule__ProcessorGroup__Group_1_3__0
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
    // InternalKiCool.g:711:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:715:1: ( ( RULE_STRING ) | ( ruleExtendedID ) )
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
                    // InternalKiCool.g:716:2: ( RULE_STRING )
                    {
                    // InternalKiCool.g:716:2: ( RULE_STRING )
                    // InternalKiCool.g:717:3: RULE_STRING
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
                    // InternalKiCool.g:722:2: ( ruleExtendedID )
                    {
                    // InternalKiCool.g:722:2: ( ruleExtendedID )
                    // InternalKiCool.g:723:3: ruleExtendedID
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
    // InternalKiCool.g:732:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:736:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
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
                    // InternalKiCool.g:737:2: ( RULE_STRING )
                    {
                    // InternalKiCool.g:737:2: ( RULE_STRING )
                    // InternalKiCool.g:738:3: RULE_STRING
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
                    // InternalKiCool.g:743:2: ( ruleExtendedID )
                    {
                    // InternalKiCool.g:743:2: ( ruleExtendedID )
                    // InternalKiCool.g:744:3: ruleExtendedID
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
                    // InternalKiCool.g:749:2: ( RULE_BOOLEAN )
                    {
                    // InternalKiCool.g:749:2: ( RULE_BOOLEAN )
                    // InternalKiCool.g:750:3: RULE_BOOLEAN
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
    // InternalKiCool.g:759:1: rule__EStringAllTypes__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) );
    public final void rule__EStringAllTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:763:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) )
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
                    // InternalKiCool.g:764:2: ( RULE_STRING )
                    {
                    // InternalKiCool.g:764:2: ( RULE_STRING )
                    // InternalKiCool.g:765:3: RULE_STRING
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
                    // InternalKiCool.g:770:2: ( ruleExtendedID )
                    {
                    // InternalKiCool.g:770:2: ( ruleExtendedID )
                    // InternalKiCool.g:771:3: ruleExtendedID
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
                    // InternalKiCool.g:776:2: ( RULE_BOOLEAN )
                    {
                    // InternalKiCool.g:776:2: ( RULE_BOOLEAN )
                    // InternalKiCool.g:777:3: RULE_BOOLEAN
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
                    // InternalKiCool.g:782:2: ( ruleInteger )
                    {
                    // InternalKiCool.g:782:2: ( ruleInteger )
                    // InternalKiCool.g:783:3: ruleInteger
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
                    // InternalKiCool.g:788:2: ( ruleFloateger )
                    {
                    // InternalKiCool.g:788:2: ( ruleFloateger )
                    // InternalKiCool.g:789:3: ruleFloateger
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
    // InternalKiCool.g:798:1: rule__ExtendedID__Alternatives_1_0 : ( ( '.' ) | ( '-' ) );
    public final void rule__ExtendedID__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:802:1: ( ( '.' ) | ( '-' ) )
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
                    // InternalKiCool.g:803:2: ( '.' )
                    {
                    // InternalKiCool.g:803:2: ( '.' )
                    // InternalKiCool.g:804:3: '.'
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
                    // InternalKiCool.g:809:2: ( '-' )
                    {
                    // InternalKiCool.g:809:2: ( '-' )
                    // InternalKiCool.g:810:3: '-'
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
    // InternalKiCool.g:819:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:823:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalKiCool.g:824:2: rule__System__Group__0__Impl rule__System__Group__1
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
    // InternalKiCool.g:831:1: rule__System__Group__0__Impl : ( ( rule__System__PublicAssignment_0 )? ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:835:1: ( ( ( rule__System__PublicAssignment_0 )? ) )
            // InternalKiCool.g:836:1: ( ( rule__System__PublicAssignment_0 )? )
            {
            // InternalKiCool.g:836:1: ( ( rule__System__PublicAssignment_0 )? )
            // InternalKiCool.g:837:2: ( rule__System__PublicAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getPublicAssignment_0()); 
            }
            // InternalKiCool.g:838:2: ( rule__System__PublicAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKiCool.g:838:3: rule__System__PublicAssignment_0
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
    // InternalKiCool.g:846:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:850:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalKiCool.g:851:2: rule__System__Group__1__Impl rule__System__Group__2
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
    // InternalKiCool.g:858:1: rule__System__Group__1__Impl : ( ( rule__System__DeveloperAssignment_1 )? ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:862:1: ( ( ( rule__System__DeveloperAssignment_1 )? ) )
            // InternalKiCool.g:863:1: ( ( rule__System__DeveloperAssignment_1 )? )
            {
            // InternalKiCool.g:863:1: ( ( rule__System__DeveloperAssignment_1 )? )
            // InternalKiCool.g:864:2: ( rule__System__DeveloperAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getDeveloperAssignment_1()); 
            }
            // InternalKiCool.g:865:2: ( rule__System__DeveloperAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKiCool.g:865:3: rule__System__DeveloperAssignment_1
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
    // InternalKiCool.g:873:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:877:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalKiCool.g:878:2: rule__System__Group__2__Impl rule__System__Group__3
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
    // InternalKiCool.g:885:1: rule__System__Group__2__Impl : ( 'system' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:889:1: ( ( 'system' ) )
            // InternalKiCool.g:890:1: ( 'system' )
            {
            // InternalKiCool.g:890:1: ( 'system' )
            // InternalKiCool.g:891:2: 'system'
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
    // InternalKiCool.g:900:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:904:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalKiCool.g:905:2: rule__System__Group__3__Impl rule__System__Group__4
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
    // InternalKiCool.g:912:1: rule__System__Group__3__Impl : ( ( rule__System__IdAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:916:1: ( ( ( rule__System__IdAssignment_3 ) ) )
            // InternalKiCool.g:917:1: ( ( rule__System__IdAssignment_3 ) )
            {
            // InternalKiCool.g:917:1: ( ( rule__System__IdAssignment_3 ) )
            // InternalKiCool.g:918:2: ( rule__System__IdAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getIdAssignment_3()); 
            }
            // InternalKiCool.g:919:2: ( rule__System__IdAssignment_3 )
            // InternalKiCool.g:919:3: rule__System__IdAssignment_3
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
    // InternalKiCool.g:927:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:931:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalKiCool.g:932:2: rule__System__Group__4__Impl rule__System__Group__5
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
    // InternalKiCool.g:939:1: rule__System__Group__4__Impl : ( 'version' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:943:1: ( ( 'version' ) )
            // InternalKiCool.g:944:1: ( 'version' )
            {
            // InternalKiCool.g:944:1: ( 'version' )
            // InternalKiCool.g:945:2: 'version'
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
    // InternalKiCool.g:954:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:958:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // InternalKiCool.g:959:2: rule__System__Group__5__Impl rule__System__Group__6
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
    // InternalKiCool.g:966:1: rule__System__Group__5__Impl : ( ( rule__System__VersionAssignment_5 ) ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:970:1: ( ( ( rule__System__VersionAssignment_5 ) ) )
            // InternalKiCool.g:971:1: ( ( rule__System__VersionAssignment_5 ) )
            {
            // InternalKiCool.g:971:1: ( ( rule__System__VersionAssignment_5 ) )
            // InternalKiCool.g:972:2: ( rule__System__VersionAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getVersionAssignment_5()); 
            }
            // InternalKiCool.g:973:2: ( rule__System__VersionAssignment_5 )
            // InternalKiCool.g:973:3: rule__System__VersionAssignment_5
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
    // InternalKiCool.g:981:1: rule__System__Group__6 : rule__System__Group__6__Impl rule__System__Group__7 ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:985:1: ( rule__System__Group__6__Impl rule__System__Group__7 )
            // InternalKiCool.g:986:2: rule__System__Group__6__Impl rule__System__Group__7
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
    // InternalKiCool.g:993:1: rule__System__Group__6__Impl : ( 'label' ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:997:1: ( ( 'label' ) )
            // InternalKiCool.g:998:1: ( 'label' )
            {
            // InternalKiCool.g:998:1: ( 'label' )
            // InternalKiCool.g:999:2: 'label'
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
    // InternalKiCool.g:1008:1: rule__System__Group__7 : rule__System__Group__7__Impl rule__System__Group__8 ;
    public final void rule__System__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1012:1: ( rule__System__Group__7__Impl rule__System__Group__8 )
            // InternalKiCool.g:1013:2: rule__System__Group__7__Impl rule__System__Group__8
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
    // InternalKiCool.g:1020:1: rule__System__Group__7__Impl : ( ( rule__System__LabelAssignment_7 ) ) ;
    public final void rule__System__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1024:1: ( ( ( rule__System__LabelAssignment_7 ) ) )
            // InternalKiCool.g:1025:1: ( ( rule__System__LabelAssignment_7 ) )
            {
            // InternalKiCool.g:1025:1: ( ( rule__System__LabelAssignment_7 ) )
            // InternalKiCool.g:1026:2: ( rule__System__LabelAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getLabelAssignment_7()); 
            }
            // InternalKiCool.g:1027:2: ( rule__System__LabelAssignment_7 )
            // InternalKiCool.g:1027:3: rule__System__LabelAssignment_7
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
    // InternalKiCool.g:1035:1: rule__System__Group__8 : rule__System__Group__8__Impl rule__System__Group__9 ;
    public final void rule__System__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1039:1: ( rule__System__Group__8__Impl rule__System__Group__9 )
            // InternalKiCool.g:1040:2: rule__System__Group__8__Impl rule__System__Group__9
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
    // InternalKiCool.g:1047:1: rule__System__Group__8__Impl : ( ( rule__System__Group_8__0 )? ) ;
    public final void rule__System__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1051:1: ( ( ( rule__System__Group_8__0 )? ) )
            // InternalKiCool.g:1052:1: ( ( rule__System__Group_8__0 )? )
            {
            // InternalKiCool.g:1052:1: ( ( rule__System__Group_8__0 )? )
            // InternalKiCool.g:1053:2: ( rule__System__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getGroup_8()); 
            }
            // InternalKiCool.g:1054:2: ( rule__System__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKiCool.g:1054:3: rule__System__Group_8__0
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
    // InternalKiCool.g:1062:1: rule__System__Group__9 : rule__System__Group__9__Impl rule__System__Group__10 ;
    public final void rule__System__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1066:1: ( rule__System__Group__9__Impl rule__System__Group__10 )
            // InternalKiCool.g:1067:2: rule__System__Group__9__Impl rule__System__Group__10
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
    // InternalKiCool.g:1074:1: rule__System__Group__9__Impl : ( ( rule__System__Group_9__0 )* ) ;
    public final void rule__System__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1078:1: ( ( ( rule__System__Group_9__0 )* ) )
            // InternalKiCool.g:1079:1: ( ( rule__System__Group_9__0 )* )
            {
            // InternalKiCool.g:1079:1: ( ( rule__System__Group_9__0 )* )
            // InternalKiCool.g:1080:2: ( rule__System__Group_9__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getGroup_9()); 
            }
            // InternalKiCool.g:1081:2: ( rule__System__Group_9__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKiCool.g:1081:3: rule__System__Group_9__0
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
    // InternalKiCool.g:1089:1: rule__System__Group__10 : rule__System__Group__10__Impl rule__System__Group__11 ;
    public final void rule__System__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1093:1: ( rule__System__Group__10__Impl rule__System__Group__11 )
            // InternalKiCool.g:1094:2: rule__System__Group__10__Impl rule__System__Group__11
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
    // InternalKiCool.g:1101:1: rule__System__Group__10__Impl : ( ( rule__System__IntermediatesAssignment_10 )* ) ;
    public final void rule__System__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1105:1: ( ( ( rule__System__IntermediatesAssignment_10 )* ) )
            // InternalKiCool.g:1106:1: ( ( rule__System__IntermediatesAssignment_10 )* )
            {
            // InternalKiCool.g:1106:1: ( ( rule__System__IntermediatesAssignment_10 )* )
            // InternalKiCool.g:1107:2: ( rule__System__IntermediatesAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getIntermediatesAssignment_10()); 
            }
            // InternalKiCool.g:1108:2: ( rule__System__IntermediatesAssignment_10 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKiCool.g:1108:3: rule__System__IntermediatesAssignment_10
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
    // InternalKiCool.g:1116:1: rule__System__Group__11 : rule__System__Group__11__Impl ;
    public final void rule__System__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1120:1: ( rule__System__Group__11__Impl )
            // InternalKiCool.g:1121:2: rule__System__Group__11__Impl
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
    // InternalKiCool.g:1127:1: rule__System__Group__11__Impl : ( ( rule__System__ProcessorsAssignment_11 ) ) ;
    public final void rule__System__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1131:1: ( ( ( rule__System__ProcessorsAssignment_11 ) ) )
            // InternalKiCool.g:1132:1: ( ( rule__System__ProcessorsAssignment_11 ) )
            {
            // InternalKiCool.g:1132:1: ( ( rule__System__ProcessorsAssignment_11 ) )
            // InternalKiCool.g:1133:2: ( rule__System__ProcessorsAssignment_11 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getProcessorsAssignment_11()); 
            }
            // InternalKiCool.g:1134:2: ( rule__System__ProcessorsAssignment_11 )
            // InternalKiCool.g:1134:3: rule__System__ProcessorsAssignment_11
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
    // InternalKiCool.g:1143:1: rule__System__Group_8__0 : rule__System__Group_8__0__Impl rule__System__Group_8__1 ;
    public final void rule__System__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1147:1: ( rule__System__Group_8__0__Impl rule__System__Group_8__1 )
            // InternalKiCool.g:1148:2: rule__System__Group_8__0__Impl rule__System__Group_8__1
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
    // InternalKiCool.g:1155:1: rule__System__Group_8__0__Impl : ( 'input' ) ;
    public final void rule__System__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1159:1: ( ( 'input' ) )
            // InternalKiCool.g:1160:1: ( 'input' )
            {
            // InternalKiCool.g:1160:1: ( 'input' )
            // InternalKiCool.g:1161:2: 'input'
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
    // InternalKiCool.g:1170:1: rule__System__Group_8__1 : rule__System__Group_8__1__Impl ;
    public final void rule__System__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1174:1: ( rule__System__Group_8__1__Impl )
            // InternalKiCool.g:1175:2: rule__System__Group_8__1__Impl
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
    // InternalKiCool.g:1181:1: rule__System__Group_8__1__Impl : ( ( rule__System__InputClassAssignment_8_1 ) ) ;
    public final void rule__System__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1185:1: ( ( ( rule__System__InputClassAssignment_8_1 ) ) )
            // InternalKiCool.g:1186:1: ( ( rule__System__InputClassAssignment_8_1 ) )
            {
            // InternalKiCool.g:1186:1: ( ( rule__System__InputClassAssignment_8_1 ) )
            // InternalKiCool.g:1187:2: ( rule__System__InputClassAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getInputClassAssignment_8_1()); 
            }
            // InternalKiCool.g:1188:2: ( rule__System__InputClassAssignment_8_1 )
            // InternalKiCool.g:1188:3: rule__System__InputClassAssignment_8_1
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
    // InternalKiCool.g:1197:1: rule__System__Group_9__0 : rule__System__Group_9__0__Impl rule__System__Group_9__1 ;
    public final void rule__System__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1201:1: ( rule__System__Group_9__0__Impl rule__System__Group_9__1 )
            // InternalKiCool.g:1202:2: rule__System__Group_9__0__Impl rule__System__Group_9__1
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
    // InternalKiCool.g:1209:1: rule__System__Group_9__0__Impl : ( 'set' ) ;
    public final void rule__System__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1213:1: ( ( 'set' ) )
            // InternalKiCool.g:1214:1: ( 'set' )
            {
            // InternalKiCool.g:1214:1: ( 'set' )
            // InternalKiCool.g:1215:2: 'set'
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
    // InternalKiCool.g:1224:1: rule__System__Group_9__1 : rule__System__Group_9__1__Impl ;
    public final void rule__System__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1228:1: ( rule__System__Group_9__1__Impl )
            // InternalKiCool.g:1229:2: rule__System__Group_9__1__Impl
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
    // InternalKiCool.g:1235:1: rule__System__Group_9__1__Impl : ( ( rule__System__StartsetsAssignment_9_1 ) ) ;
    public final void rule__System__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1239:1: ( ( ( rule__System__StartsetsAssignment_9_1 ) ) )
            // InternalKiCool.g:1240:1: ( ( rule__System__StartsetsAssignment_9_1 ) )
            {
            // InternalKiCool.g:1240:1: ( ( rule__System__StartsetsAssignment_9_1 ) )
            // InternalKiCool.g:1241:2: ( rule__System__StartsetsAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getStartsetsAssignment_9_1()); 
            }
            // InternalKiCool.g:1242:2: ( rule__System__StartsetsAssignment_9_1 )
            // InternalKiCool.g:1242:3: rule__System__StartsetsAssignment_9_1
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
    // InternalKiCool.g:1251:1: rule__IntermediateReference__Group__0 : rule__IntermediateReference__Group__0__Impl rule__IntermediateReference__Group__1 ;
    public final void rule__IntermediateReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1255:1: ( rule__IntermediateReference__Group__0__Impl rule__IntermediateReference__Group__1 )
            // InternalKiCool.g:1256:2: rule__IntermediateReference__Group__0__Impl rule__IntermediateReference__Group__1
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
    // InternalKiCool.g:1263:1: rule__IntermediateReference__Group__0__Impl : ( 'intermediate' ) ;
    public final void rule__IntermediateReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1267:1: ( ( 'intermediate' ) )
            // InternalKiCool.g:1268:1: ( 'intermediate' )
            {
            // InternalKiCool.g:1268:1: ( 'intermediate' )
            // InternalKiCool.g:1269:2: 'intermediate'
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
    // InternalKiCool.g:1278:1: rule__IntermediateReference__Group__1 : rule__IntermediateReference__Group__1__Impl rule__IntermediateReference__Group__2 ;
    public final void rule__IntermediateReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1282:1: ( rule__IntermediateReference__Group__1__Impl rule__IntermediateReference__Group__2 )
            // InternalKiCool.g:1283:2: rule__IntermediateReference__Group__1__Impl rule__IntermediateReference__Group__2
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
    // InternalKiCool.g:1290:1: rule__IntermediateReference__Group__1__Impl : ( ( rule__IntermediateReference__IdAssignment_1 ) ) ;
    public final void rule__IntermediateReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1294:1: ( ( ( rule__IntermediateReference__IdAssignment_1 ) ) )
            // InternalKiCool.g:1295:1: ( ( rule__IntermediateReference__IdAssignment_1 ) )
            {
            // InternalKiCool.g:1295:1: ( ( rule__IntermediateReference__IdAssignment_1 ) )
            // InternalKiCool.g:1296:2: ( rule__IntermediateReference__IdAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getIdAssignment_1()); 
            }
            // InternalKiCool.g:1297:2: ( rule__IntermediateReference__IdAssignment_1 )
            // InternalKiCool.g:1297:3: rule__IntermediateReference__IdAssignment_1
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
    // InternalKiCool.g:1305:1: rule__IntermediateReference__Group__2 : rule__IntermediateReference__Group__2__Impl ;
    public final void rule__IntermediateReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1309:1: ( rule__IntermediateReference__Group__2__Impl )
            // InternalKiCool.g:1310:2: rule__IntermediateReference__Group__2__Impl
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
    // InternalKiCool.g:1316:1: rule__IntermediateReference__Group__2__Impl : ( ( rule__IntermediateReference__Group_2__0 )? ) ;
    public final void rule__IntermediateReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1320:1: ( ( ( rule__IntermediateReference__Group_2__0 )? ) )
            // InternalKiCool.g:1321:1: ( ( rule__IntermediateReference__Group_2__0 )? )
            {
            // InternalKiCool.g:1321:1: ( ( rule__IntermediateReference__Group_2__0 )? )
            // InternalKiCool.g:1322:2: ( rule__IntermediateReference__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getGroup_2()); 
            }
            // InternalKiCool.g:1323:2: ( rule__IntermediateReference__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKiCool.g:1323:3: rule__IntermediateReference__Group_2__0
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
    // InternalKiCool.g:1332:1: rule__IntermediateReference__Group_2__0 : rule__IntermediateReference__Group_2__0__Impl rule__IntermediateReference__Group_2__1 ;
    public final void rule__IntermediateReference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1336:1: ( rule__IntermediateReference__Group_2__0__Impl rule__IntermediateReference__Group_2__1 )
            // InternalKiCool.g:1337:2: rule__IntermediateReference__Group_2__0__Impl rule__IntermediateReference__Group_2__1
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
    // InternalKiCool.g:1344:1: rule__IntermediateReference__Group_2__0__Impl : ( 'alias' ) ;
    public final void rule__IntermediateReference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1348:1: ( ( 'alias' ) )
            // InternalKiCool.g:1349:1: ( 'alias' )
            {
            // InternalKiCool.g:1349:1: ( 'alias' )
            // InternalKiCool.g:1350:2: 'alias'
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
    // InternalKiCool.g:1359:1: rule__IntermediateReference__Group_2__1 : rule__IntermediateReference__Group_2__1__Impl ;
    public final void rule__IntermediateReference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1363:1: ( rule__IntermediateReference__Group_2__1__Impl )
            // InternalKiCool.g:1364:2: rule__IntermediateReference__Group_2__1__Impl
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
    // InternalKiCool.g:1370:1: rule__IntermediateReference__Group_2__1__Impl : ( ( rule__IntermediateReference__AliasAssignment_2_1 ) ) ;
    public final void rule__IntermediateReference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1374:1: ( ( ( rule__IntermediateReference__AliasAssignment_2_1 ) ) )
            // InternalKiCool.g:1375:1: ( ( rule__IntermediateReference__AliasAssignment_2_1 ) )
            {
            // InternalKiCool.g:1375:1: ( ( rule__IntermediateReference__AliasAssignment_2_1 ) )
            // InternalKiCool.g:1376:2: ( rule__IntermediateReference__AliasAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntermediateReferenceAccess().getAliasAssignment_2_1()); 
            }
            // InternalKiCool.g:1377:2: ( rule__IntermediateReference__AliasAssignment_2_1 )
            // InternalKiCool.g:1377:3: rule__IntermediateReference__AliasAssignment_2_1
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
    // InternalKiCool.g:1386:1: rule__ProcessorGroup__Group__0 : rule__ProcessorGroup__Group__0__Impl rule__ProcessorGroup__Group__1 ;
    public final void rule__ProcessorGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1390:1: ( rule__ProcessorGroup__Group__0__Impl rule__ProcessorGroup__Group__1 )
            // InternalKiCool.g:1391:2: rule__ProcessorGroup__Group__0__Impl rule__ProcessorGroup__Group__1
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
    // InternalKiCool.g:1398:1: rule__ProcessorGroup__Group__0__Impl : ( ( rule__ProcessorGroup__Group_0__0 )? ) ;
    public final void rule__ProcessorGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1402:1: ( ( ( rule__ProcessorGroup__Group_0__0 )? ) )
            // InternalKiCool.g:1403:1: ( ( rule__ProcessorGroup__Group_0__0 )? )
            {
            // InternalKiCool.g:1403:1: ( ( rule__ProcessorGroup__Group_0__0 )? )
            // InternalKiCool.g:1404:2: ( rule__ProcessorGroup__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getGroup_0()); 
            }
            // InternalKiCool.g:1405:2: ( rule__ProcessorGroup__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKiCool.g:1405:3: rule__ProcessorGroup__Group_0__0
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
    // InternalKiCool.g:1413:1: rule__ProcessorGroup__Group__1 : rule__ProcessorGroup__Group__1__Impl ;
    public final void rule__ProcessorGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1417:1: ( rule__ProcessorGroup__Group__1__Impl )
            // InternalKiCool.g:1418:2: rule__ProcessorGroup__Group__1__Impl
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
    // InternalKiCool.g:1424:1: rule__ProcessorGroup__Group__1__Impl : ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) ) ;
    public final void rule__ProcessorGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1428:1: ( ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) ) )
            // InternalKiCool.g:1429:1: ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) )
            {
            // InternalKiCool.g:1429:1: ( ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* ) )
            // InternalKiCool.g:1430:2: ( ( rule__ProcessorGroup__Alternatives_1 ) ) ( ( rule__ProcessorGroup__Alternatives_1 )* )
            {
            // InternalKiCool.g:1430:2: ( ( rule__ProcessorGroup__Alternatives_1 ) )
            // InternalKiCool.g:1431:3: ( rule__ProcessorGroup__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getAlternatives_1()); 
            }
            // InternalKiCool.g:1432:3: ( rule__ProcessorGroup__Alternatives_1 )
            // InternalKiCool.g:1432:4: rule__ProcessorGroup__Alternatives_1
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

            // InternalKiCool.g:1435:2: ( ( rule__ProcessorGroup__Alternatives_1 )* )
            // InternalKiCool.g:1436:3: ( rule__ProcessorGroup__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getAlternatives_1()); 
            }
            // InternalKiCool.g:1437:3: ( rule__ProcessorGroup__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==18||LA13_0==25||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKiCool.g:1437:4: rule__ProcessorGroup__Alternatives_1
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
    // InternalKiCool.g:1447:1: rule__ProcessorGroup__Group_0__0 : rule__ProcessorGroup__Group_0__0__Impl rule__ProcessorGroup__Group_0__1 ;
    public final void rule__ProcessorGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1451:1: ( rule__ProcessorGroup__Group_0__0__Impl rule__ProcessorGroup__Group_0__1 )
            // InternalKiCool.g:1452:2: rule__ProcessorGroup__Group_0__0__Impl rule__ProcessorGroup__Group_0__1
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
    // InternalKiCool.g:1459:1: rule__ProcessorGroup__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__ProcessorGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1463:1: ( ( 'label' ) )
            // InternalKiCool.g:1464:1: ( 'label' )
            {
            // InternalKiCool.g:1464:1: ( 'label' )
            // InternalKiCool.g:1465:2: 'label'
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
    // InternalKiCool.g:1474:1: rule__ProcessorGroup__Group_0__1 : rule__ProcessorGroup__Group_0__1__Impl ;
    public final void rule__ProcessorGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1478:1: ( rule__ProcessorGroup__Group_0__1__Impl )
            // InternalKiCool.g:1479:2: rule__ProcessorGroup__Group_0__1__Impl
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
    // InternalKiCool.g:1485:1: rule__ProcessorGroup__Group_0__1__Impl : ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) ) ;
    public final void rule__ProcessorGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1489:1: ( ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) ) )
            // InternalKiCool.g:1490:1: ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) )
            {
            // InternalKiCool.g:1490:1: ( ( rule__ProcessorGroup__LabelAssignment_0_1 ) )
            // InternalKiCool.g:1491:2: ( rule__ProcessorGroup__LabelAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getLabelAssignment_0_1()); 
            }
            // InternalKiCool.g:1492:2: ( rule__ProcessorGroup__LabelAssignment_0_1 )
            // InternalKiCool.g:1492:3: rule__ProcessorGroup__LabelAssignment_0_1
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
    // InternalKiCool.g:1501:1: rule__ProcessorGroup__Group_1_1__0 : rule__ProcessorGroup__Group_1_1__0__Impl rule__ProcessorGroup__Group_1_1__1 ;
    public final void rule__ProcessorGroup__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1505:1: ( rule__ProcessorGroup__Group_1_1__0__Impl rule__ProcessorGroup__Group_1_1__1 )
            // InternalKiCool.g:1506:2: rule__ProcessorGroup__Group_1_1__0__Impl rule__ProcessorGroup__Group_1_1__1
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
    // InternalKiCool.g:1513:1: rule__ProcessorGroup__Group_1_1__0__Impl : ( 'system' ) ;
    public final void rule__ProcessorGroup__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1517:1: ( ( 'system' ) )
            // InternalKiCool.g:1518:1: ( 'system' )
            {
            // InternalKiCool.g:1518:1: ( 'system' )
            // InternalKiCool.g:1519:2: 'system'
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
    // InternalKiCool.g:1528:1: rule__ProcessorGroup__Group_1_1__1 : rule__ProcessorGroup__Group_1_1__1__Impl ;
    public final void rule__ProcessorGroup__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1532:1: ( rule__ProcessorGroup__Group_1_1__1__Impl )
            // InternalKiCool.g:1533:2: rule__ProcessorGroup__Group_1_1__1__Impl
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
    // InternalKiCool.g:1539:1: rule__ProcessorGroup__Group_1_1__1__Impl : ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) ) ;
    public final void rule__ProcessorGroup__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1543:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) ) )
            // InternalKiCool.g:1544:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) )
            {
            // InternalKiCool.g:1544:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 ) )
            // InternalKiCool.g:1545:2: ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_1_1()); 
            }
            // InternalKiCool.g:1546:2: ( rule__ProcessorGroup__ProcessorsAssignment_1_1_1 )
            // InternalKiCool.g:1546:3: rule__ProcessorGroup__ProcessorsAssignment_1_1_1
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
    // InternalKiCool.g:1555:1: rule__ProcessorGroup__Group_1_2__0 : rule__ProcessorGroup__Group_1_2__0__Impl rule__ProcessorGroup__Group_1_2__1 ;
    public final void rule__ProcessorGroup__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1559:1: ( rule__ProcessorGroup__Group_1_2__0__Impl rule__ProcessorGroup__Group_1_2__1 )
            // InternalKiCool.g:1560:2: rule__ProcessorGroup__Group_1_2__0__Impl rule__ProcessorGroup__Group_1_2__1
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
    // InternalKiCool.g:1567:1: rule__ProcessorGroup__Group_1_2__0__Impl : ( '[' ) ;
    public final void rule__ProcessorGroup__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1571:1: ( ( '[' ) )
            // InternalKiCool.g:1572:1: ( '[' )
            {
            // InternalKiCool.g:1572:1: ( '[' )
            // InternalKiCool.g:1573:2: '['
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
    // InternalKiCool.g:1582:1: rule__ProcessorGroup__Group_1_2__1 : rule__ProcessorGroup__Group_1_2__1__Impl rule__ProcessorGroup__Group_1_2__2 ;
    public final void rule__ProcessorGroup__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1586:1: ( rule__ProcessorGroup__Group_1_2__1__Impl rule__ProcessorGroup__Group_1_2__2 )
            // InternalKiCool.g:1587:2: rule__ProcessorGroup__Group_1_2__1__Impl rule__ProcessorGroup__Group_1_2__2
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
    // InternalKiCool.g:1594:1: rule__ProcessorGroup__Group_1_2__1__Impl : ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) ) ;
    public final void rule__ProcessorGroup__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1598:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) ) )
            // InternalKiCool.g:1599:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) )
            {
            // InternalKiCool.g:1599:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 ) )
            // InternalKiCool.g:1600:2: ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_2_1()); 
            }
            // InternalKiCool.g:1601:2: ( rule__ProcessorGroup__ProcessorsAssignment_1_2_1 )
            // InternalKiCool.g:1601:3: rule__ProcessorGroup__ProcessorsAssignment_1_2_1
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
    // InternalKiCool.g:1609:1: rule__ProcessorGroup__Group_1_2__2 : rule__ProcessorGroup__Group_1_2__2__Impl ;
    public final void rule__ProcessorGroup__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1613:1: ( rule__ProcessorGroup__Group_1_2__2__Impl )
            // InternalKiCool.g:1614:2: rule__ProcessorGroup__Group_1_2__2__Impl
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
    // InternalKiCool.g:1620:1: rule__ProcessorGroup__Group_1_2__2__Impl : ( ']' ) ;
    public final void rule__ProcessorGroup__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1624:1: ( ( ']' ) )
            // InternalKiCool.g:1625:1: ( ']' )
            {
            // InternalKiCool.g:1625:1: ( ']' )
            // InternalKiCool.g:1626:2: ']'
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
    // InternalKiCool.g:1636:1: rule__ProcessorGroup__Group_1_3__0 : rule__ProcessorGroup__Group_1_3__0__Impl rule__ProcessorGroup__Group_1_3__1 ;
    public final void rule__ProcessorGroup__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1640:1: ( rule__ProcessorGroup__Group_1_3__0__Impl rule__ProcessorGroup__Group_1_3__1 )
            // InternalKiCool.g:1641:2: rule__ProcessorGroup__Group_1_3__0__Impl rule__ProcessorGroup__Group_1_3__1
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
    // InternalKiCool.g:1648:1: rule__ProcessorGroup__Group_1_3__0__Impl : ( '[' ) ;
    public final void rule__ProcessorGroup__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1652:1: ( ( '[' ) )
            // InternalKiCool.g:1653:1: ( '[' )
            {
            // InternalKiCool.g:1653:1: ( '[' )
            // InternalKiCool.g:1654:2: '['
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
    // InternalKiCool.g:1663:1: rule__ProcessorGroup__Group_1_3__1 : rule__ProcessorGroup__Group_1_3__1__Impl rule__ProcessorGroup__Group_1_3__2 ;
    public final void rule__ProcessorGroup__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1667:1: ( rule__ProcessorGroup__Group_1_3__1__Impl rule__ProcessorGroup__Group_1_3__2 )
            // InternalKiCool.g:1668:2: rule__ProcessorGroup__Group_1_3__1__Impl rule__ProcessorGroup__Group_1_3__2
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
    // InternalKiCool.g:1675:1: rule__ProcessorGroup__Group_1_3__1__Impl : ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) ) ;
    public final void rule__ProcessorGroup__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1679:1: ( ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) ) )
            // InternalKiCool.g:1680:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) )
            {
            // InternalKiCool.g:1680:1: ( ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 ) )
            // InternalKiCool.g:1681:2: ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorGroupAccess().getProcessorsAssignment_1_3_1()); 
            }
            // InternalKiCool.g:1682:2: ( rule__ProcessorGroup__ProcessorsAssignment_1_3_1 )
            // InternalKiCool.g:1682:3: rule__ProcessorGroup__ProcessorsAssignment_1_3_1
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
    // InternalKiCool.g:1690:1: rule__ProcessorGroup__Group_1_3__2 : rule__ProcessorGroup__Group_1_3__2__Impl ;
    public final void rule__ProcessorGroup__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1694:1: ( rule__ProcessorGroup__Group_1_3__2__Impl )
            // InternalKiCool.g:1695:2: rule__ProcessorGroup__Group_1_3__2__Impl
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
    // InternalKiCool.g:1701:1: rule__ProcessorGroup__Group_1_3__2__Impl : ( ']' ) ;
    public final void rule__ProcessorGroup__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1705:1: ( ( ']' ) )
            // InternalKiCool.g:1706:1: ( ']' )
            {
            // InternalKiCool.g:1706:1: ( ']' )
            // InternalKiCool.g:1707:2: ']'
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
    // InternalKiCool.g:1717:1: rule__Processor__Group__0 : rule__Processor__Group__0__Impl rule__Processor__Group__1 ;
    public final void rule__Processor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1721:1: ( rule__Processor__Group__0__Impl rule__Processor__Group__1 )
            // InternalKiCool.g:1722:2: rule__Processor__Group__0__Impl rule__Processor__Group__1
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
    // InternalKiCool.g:1729:1: rule__Processor__Group__0__Impl : ( ( rule__Processor__Group_0__0 )* ) ;
    public final void rule__Processor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1733:1: ( ( ( rule__Processor__Group_0__0 )* ) )
            // InternalKiCool.g:1734:1: ( ( rule__Processor__Group_0__0 )* )
            {
            // InternalKiCool.g:1734:1: ( ( rule__Processor__Group_0__0 )* )
            // InternalKiCool.g:1735:2: ( rule__Processor__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_0()); 
            }
            // InternalKiCool.g:1736:2: ( rule__Processor__Group_0__0 )*
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
            	    // InternalKiCool.g:1736:3: rule__Processor__Group_0__0
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
    // InternalKiCool.g:1744:1: rule__Processor__Group__1 : rule__Processor__Group__1__Impl rule__Processor__Group__2 ;
    public final void rule__Processor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1748:1: ( rule__Processor__Group__1__Impl rule__Processor__Group__2 )
            // InternalKiCool.g:1749:2: rule__Processor__Group__1__Impl rule__Processor__Group__2
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
    // InternalKiCool.g:1756:1: rule__Processor__Group__1__Impl : ( ( rule__Processor__Group_1__0 )* ) ;
    public final void rule__Processor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1760:1: ( ( ( rule__Processor__Group_1__0 )* ) )
            // InternalKiCool.g:1761:1: ( ( rule__Processor__Group_1__0 )* )
            {
            // InternalKiCool.g:1761:1: ( ( rule__Processor__Group_1__0 )* )
            // InternalKiCool.g:1762:2: ( rule__Processor__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_1()); 
            }
            // InternalKiCool.g:1763:2: ( rule__Processor__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKiCool.g:1763:3: rule__Processor__Group_1__0
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
    // InternalKiCool.g:1771:1: rule__Processor__Group__2 : rule__Processor__Group__2__Impl rule__Processor__Group__3 ;
    public final void rule__Processor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1775:1: ( rule__Processor__Group__2__Impl rule__Processor__Group__3 )
            // InternalKiCool.g:1776:2: rule__Processor__Group__2__Impl rule__Processor__Group__3
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
    // InternalKiCool.g:1783:1: rule__Processor__Group__2__Impl : ( ( rule__Processor__IdAssignment_2 ) ) ;
    public final void rule__Processor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1787:1: ( ( ( rule__Processor__IdAssignment_2 ) ) )
            // InternalKiCool.g:1788:1: ( ( rule__Processor__IdAssignment_2 ) )
            {
            // InternalKiCool.g:1788:1: ( ( rule__Processor__IdAssignment_2 ) )
            // InternalKiCool.g:1789:2: ( rule__Processor__IdAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getIdAssignment_2()); 
            }
            // InternalKiCool.g:1790:2: ( rule__Processor__IdAssignment_2 )
            // InternalKiCool.g:1790:3: rule__Processor__IdAssignment_2
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
    // InternalKiCool.g:1798:1: rule__Processor__Group__3 : rule__Processor__Group__3__Impl rule__Processor__Group__4 ;
    public final void rule__Processor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1802:1: ( rule__Processor__Group__3__Impl rule__Processor__Group__4 )
            // InternalKiCool.g:1803:2: rule__Processor__Group__3__Impl rule__Processor__Group__4
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
    // InternalKiCool.g:1810:1: rule__Processor__Group__3__Impl : ( ( rule__Processor__Group_3__0 )? ) ;
    public final void rule__Processor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1814:1: ( ( ( rule__Processor__Group_3__0 )? ) )
            // InternalKiCool.g:1815:1: ( ( rule__Processor__Group_3__0 )? )
            {
            // InternalKiCool.g:1815:1: ( ( rule__Processor__Group_3__0 )? )
            // InternalKiCool.g:1816:2: ( rule__Processor__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_3()); 
            }
            // InternalKiCool.g:1817:2: ( rule__Processor__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKiCool.g:1817:3: rule__Processor__Group_3__0
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
    // InternalKiCool.g:1825:1: rule__Processor__Group__4 : rule__Processor__Group__4__Impl rule__Processor__Group__5 ;
    public final void rule__Processor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1829:1: ( rule__Processor__Group__4__Impl rule__Processor__Group__5 )
            // InternalKiCool.g:1830:2: rule__Processor__Group__4__Impl rule__Processor__Group__5
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
    // InternalKiCool.g:1837:1: rule__Processor__Group__4__Impl : ( ( rule__Processor__Group_4__0 )* ) ;
    public final void rule__Processor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1841:1: ( ( ( rule__Processor__Group_4__0 )* ) )
            // InternalKiCool.g:1842:1: ( ( rule__Processor__Group_4__0 )* )
            {
            // InternalKiCool.g:1842:1: ( ( rule__Processor__Group_4__0 )* )
            // InternalKiCool.g:1843:2: ( rule__Processor__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_4()); 
            }
            // InternalKiCool.g:1844:2: ( rule__Processor__Group_4__0 )*
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
            	    // InternalKiCool.g:1844:3: rule__Processor__Group_4__0
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
    // InternalKiCool.g:1852:1: rule__Processor__Group__5 : rule__Processor__Group__5__Impl ;
    public final void rule__Processor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1856:1: ( rule__Processor__Group__5__Impl )
            // InternalKiCool.g:1857:2: rule__Processor__Group__5__Impl
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
    // InternalKiCool.g:1863:1: rule__Processor__Group__5__Impl : ( ( rule__Processor__Group_5__0 )* ) ;
    public final void rule__Processor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1867:1: ( ( ( rule__Processor__Group_5__0 )* ) )
            // InternalKiCool.g:1868:1: ( ( rule__Processor__Group_5__0 )* )
            {
            // InternalKiCool.g:1868:1: ( ( rule__Processor__Group_5__0 )* )
            // InternalKiCool.g:1869:2: ( rule__Processor__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getGroup_5()); 
            }
            // InternalKiCool.g:1870:2: ( rule__Processor__Group_5__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKiCool.g:1870:3: rule__Processor__Group_5__0
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
    // InternalKiCool.g:1879:1: rule__Processor__Group_0__0 : rule__Processor__Group_0__0__Impl rule__Processor__Group_0__1 ;
    public final void rule__Processor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1883:1: ( rule__Processor__Group_0__0__Impl rule__Processor__Group_0__1 )
            // InternalKiCool.g:1884:2: rule__Processor__Group_0__0__Impl rule__Processor__Group_0__1
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
    // InternalKiCool.g:1891:1: rule__Processor__Group_0__0__Impl : ( 'pre' ) ;
    public final void rule__Processor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1895:1: ( ( 'pre' ) )
            // InternalKiCool.g:1896:1: ( 'pre' )
            {
            // InternalKiCool.g:1896:1: ( 'pre' )
            // InternalKiCool.g:1897:2: 'pre'
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
    // InternalKiCool.g:1906:1: rule__Processor__Group_0__1 : rule__Processor__Group_0__1__Impl rule__Processor__Group_0__2 ;
    public final void rule__Processor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1910:1: ( rule__Processor__Group_0__1__Impl rule__Processor__Group_0__2 )
            // InternalKiCool.g:1911:2: rule__Processor__Group_0__1__Impl rule__Processor__Group_0__2
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
    // InternalKiCool.g:1918:1: rule__Processor__Group_0__1__Impl : ( 'set' ) ;
    public final void rule__Processor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1922:1: ( ( 'set' ) )
            // InternalKiCool.g:1923:1: ( 'set' )
            {
            // InternalKiCool.g:1923:1: ( 'set' )
            // InternalKiCool.g:1924:2: 'set'
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
    // InternalKiCool.g:1933:1: rule__Processor__Group_0__2 : rule__Processor__Group_0__2__Impl ;
    public final void rule__Processor__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1937:1: ( rule__Processor__Group_0__2__Impl )
            // InternalKiCool.g:1938:2: rule__Processor__Group_0__2__Impl
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
    // InternalKiCool.g:1944:1: rule__Processor__Group_0__2__Impl : ( ( rule__Processor__PresetsAssignment_0_2 ) ) ;
    public final void rule__Processor__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1948:1: ( ( ( rule__Processor__PresetsAssignment_0_2 ) ) )
            // InternalKiCool.g:1949:1: ( ( rule__Processor__PresetsAssignment_0_2 ) )
            {
            // InternalKiCool.g:1949:1: ( ( rule__Processor__PresetsAssignment_0_2 ) )
            // InternalKiCool.g:1950:2: ( rule__Processor__PresetsAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPresetsAssignment_0_2()); 
            }
            // InternalKiCool.g:1951:2: ( rule__Processor__PresetsAssignment_0_2 )
            // InternalKiCool.g:1951:3: rule__Processor__PresetsAssignment_0_2
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
    // InternalKiCool.g:1960:1: rule__Processor__Group_1__0 : rule__Processor__Group_1__0__Impl rule__Processor__Group_1__1 ;
    public final void rule__Processor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1964:1: ( rule__Processor__Group_1__0__Impl rule__Processor__Group_1__1 )
            // InternalKiCool.g:1965:2: rule__Processor__Group_1__0__Impl rule__Processor__Group_1__1
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
    // InternalKiCool.g:1972:1: rule__Processor__Group_1__0__Impl : ( 'pre' ) ;
    public final void rule__Processor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1976:1: ( ( 'pre' ) )
            // InternalKiCool.g:1977:1: ( 'pre' )
            {
            // InternalKiCool.g:1977:1: ( 'pre' )
            // InternalKiCool.g:1978:2: 'pre'
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
    // InternalKiCool.g:1987:1: rule__Processor__Group_1__1 : rule__Processor__Group_1__1__Impl rule__Processor__Group_1__2 ;
    public final void rule__Processor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:1991:1: ( rule__Processor__Group_1__1__Impl rule__Processor__Group_1__2 )
            // InternalKiCool.g:1992:2: rule__Processor__Group_1__1__Impl rule__Processor__Group_1__2
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
    // InternalKiCool.g:1999:1: rule__Processor__Group_1__1__Impl : ( 'process' ) ;
    public final void rule__Processor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2003:1: ( ( 'process' ) )
            // InternalKiCool.g:2004:1: ( 'process' )
            {
            // InternalKiCool.g:2004:1: ( 'process' )
            // InternalKiCool.g:2005:2: 'process'
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
    // InternalKiCool.g:2014:1: rule__Processor__Group_1__2 : rule__Processor__Group_1__2__Impl ;
    public final void rule__Processor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2018:1: ( rule__Processor__Group_1__2__Impl )
            // InternalKiCool.g:2019:2: rule__Processor__Group_1__2__Impl
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
    // InternalKiCool.g:2025:1: rule__Processor__Group_1__2__Impl : ( ( rule__Processor__PreprocessesAssignment_1_2 ) ) ;
    public final void rule__Processor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2029:1: ( ( ( rule__Processor__PreprocessesAssignment_1_2 ) ) )
            // InternalKiCool.g:2030:1: ( ( rule__Processor__PreprocessesAssignment_1_2 ) )
            {
            // InternalKiCool.g:2030:1: ( ( rule__Processor__PreprocessesAssignment_1_2 ) )
            // InternalKiCool.g:2031:2: ( rule__Processor__PreprocessesAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPreprocessesAssignment_1_2()); 
            }
            // InternalKiCool.g:2032:2: ( rule__Processor__PreprocessesAssignment_1_2 )
            // InternalKiCool.g:2032:3: rule__Processor__PreprocessesAssignment_1_2
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
    // InternalKiCool.g:2041:1: rule__Processor__Group_3__0 : rule__Processor__Group_3__0__Impl rule__Processor__Group_3__1 ;
    public final void rule__Processor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2045:1: ( rule__Processor__Group_3__0__Impl rule__Processor__Group_3__1 )
            // InternalKiCool.g:2046:2: rule__Processor__Group_3__0__Impl rule__Processor__Group_3__1
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
    // InternalKiCool.g:2053:1: rule__Processor__Group_3__0__Impl : ( 'intermediate' ) ;
    public final void rule__Processor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2057:1: ( ( 'intermediate' ) )
            // InternalKiCool.g:2058:1: ( 'intermediate' )
            {
            // InternalKiCool.g:2058:1: ( 'intermediate' )
            // InternalKiCool.g:2059:2: 'intermediate'
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
    // InternalKiCool.g:2068:1: rule__Processor__Group_3__1 : rule__Processor__Group_3__1__Impl ;
    public final void rule__Processor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2072:1: ( rule__Processor__Group_3__1__Impl )
            // InternalKiCool.g:2073:2: rule__Processor__Group_3__1__Impl
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
    // InternalKiCool.g:2079:1: rule__Processor__Group_3__1__Impl : ( ( rule__Processor__MetricAssignment_3_1 ) ) ;
    public final void rule__Processor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2083:1: ( ( ( rule__Processor__MetricAssignment_3_1 ) ) )
            // InternalKiCool.g:2084:1: ( ( rule__Processor__MetricAssignment_3_1 ) )
            {
            // InternalKiCool.g:2084:1: ( ( rule__Processor__MetricAssignment_3_1 ) )
            // InternalKiCool.g:2085:2: ( rule__Processor__MetricAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getMetricAssignment_3_1()); 
            }
            // InternalKiCool.g:2086:2: ( rule__Processor__MetricAssignment_3_1 )
            // InternalKiCool.g:2086:3: rule__Processor__MetricAssignment_3_1
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
    // InternalKiCool.g:2095:1: rule__Processor__Group_4__0 : rule__Processor__Group_4__0__Impl rule__Processor__Group_4__1 ;
    public final void rule__Processor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2099:1: ( rule__Processor__Group_4__0__Impl rule__Processor__Group_4__1 )
            // InternalKiCool.g:2100:2: rule__Processor__Group_4__0__Impl rule__Processor__Group_4__1
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
    // InternalKiCool.g:2107:1: rule__Processor__Group_4__0__Impl : ( 'post' ) ;
    public final void rule__Processor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2111:1: ( ( 'post' ) )
            // InternalKiCool.g:2112:1: ( 'post' )
            {
            // InternalKiCool.g:2112:1: ( 'post' )
            // InternalKiCool.g:2113:2: 'post'
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
    // InternalKiCool.g:2122:1: rule__Processor__Group_4__1 : rule__Processor__Group_4__1__Impl rule__Processor__Group_4__2 ;
    public final void rule__Processor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2126:1: ( rule__Processor__Group_4__1__Impl rule__Processor__Group_4__2 )
            // InternalKiCool.g:2127:2: rule__Processor__Group_4__1__Impl rule__Processor__Group_4__2
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
    // InternalKiCool.g:2134:1: rule__Processor__Group_4__1__Impl : ( 'process' ) ;
    public final void rule__Processor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2138:1: ( ( 'process' ) )
            // InternalKiCool.g:2139:1: ( 'process' )
            {
            // InternalKiCool.g:2139:1: ( 'process' )
            // InternalKiCool.g:2140:2: 'process'
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
    // InternalKiCool.g:2149:1: rule__Processor__Group_4__2 : rule__Processor__Group_4__2__Impl ;
    public final void rule__Processor__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2153:1: ( rule__Processor__Group_4__2__Impl )
            // InternalKiCool.g:2154:2: rule__Processor__Group_4__2__Impl
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
    // InternalKiCool.g:2160:1: rule__Processor__Group_4__2__Impl : ( ( rule__Processor__PostprocessesAssignment_4_2 ) ) ;
    public final void rule__Processor__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2164:1: ( ( ( rule__Processor__PostprocessesAssignment_4_2 ) ) )
            // InternalKiCool.g:2165:1: ( ( rule__Processor__PostprocessesAssignment_4_2 ) )
            {
            // InternalKiCool.g:2165:1: ( ( rule__Processor__PostprocessesAssignment_4_2 ) )
            // InternalKiCool.g:2166:2: ( rule__Processor__PostprocessesAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPostprocessesAssignment_4_2()); 
            }
            // InternalKiCool.g:2167:2: ( rule__Processor__PostprocessesAssignment_4_2 )
            // InternalKiCool.g:2167:3: rule__Processor__PostprocessesAssignment_4_2
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
    // InternalKiCool.g:2176:1: rule__Processor__Group_5__0 : rule__Processor__Group_5__0__Impl rule__Processor__Group_5__1 ;
    public final void rule__Processor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2180:1: ( rule__Processor__Group_5__0__Impl rule__Processor__Group_5__1 )
            // InternalKiCool.g:2181:2: rule__Processor__Group_5__0__Impl rule__Processor__Group_5__1
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
    // InternalKiCool.g:2188:1: rule__Processor__Group_5__0__Impl : ( 'post' ) ;
    public final void rule__Processor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2192:1: ( ( 'post' ) )
            // InternalKiCool.g:2193:1: ( 'post' )
            {
            // InternalKiCool.g:2193:1: ( 'post' )
            // InternalKiCool.g:2194:2: 'post'
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
    // InternalKiCool.g:2203:1: rule__Processor__Group_5__1 : rule__Processor__Group_5__1__Impl rule__Processor__Group_5__2 ;
    public final void rule__Processor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2207:1: ( rule__Processor__Group_5__1__Impl rule__Processor__Group_5__2 )
            // InternalKiCool.g:2208:2: rule__Processor__Group_5__1__Impl rule__Processor__Group_5__2
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
    // InternalKiCool.g:2215:1: rule__Processor__Group_5__1__Impl : ( 'set' ) ;
    public final void rule__Processor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2219:1: ( ( 'set' ) )
            // InternalKiCool.g:2220:1: ( 'set' )
            {
            // InternalKiCool.g:2220:1: ( 'set' )
            // InternalKiCool.g:2221:2: 'set'
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
    // InternalKiCool.g:2230:1: rule__Processor__Group_5__2 : rule__Processor__Group_5__2__Impl ;
    public final void rule__Processor__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2234:1: ( rule__Processor__Group_5__2__Impl )
            // InternalKiCool.g:2235:2: rule__Processor__Group_5__2__Impl
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
    // InternalKiCool.g:2241:1: rule__Processor__Group_5__2__Impl : ( ( rule__Processor__PostsetsAssignment_5_2 ) ) ;
    public final void rule__Processor__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2245:1: ( ( ( rule__Processor__PostsetsAssignment_5_2 ) ) )
            // InternalKiCool.g:2246:1: ( ( rule__Processor__PostsetsAssignment_5_2 ) )
            {
            // InternalKiCool.g:2246:1: ( ( rule__Processor__PostsetsAssignment_5_2 ) )
            // InternalKiCool.g:2247:2: ( rule__Processor__PostsetsAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getPostsetsAssignment_5_2()); 
            }
            // InternalKiCool.g:2248:2: ( rule__Processor__PostsetsAssignment_5_2 )
            // InternalKiCool.g:2248:3: rule__Processor__PostsetsAssignment_5_2
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
    // InternalKiCool.g:2257:1: rule__CoProcessor__Group__0 : rule__CoProcessor__Group__0__Impl rule__CoProcessor__Group__1 ;
    public final void rule__CoProcessor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2261:1: ( rule__CoProcessor__Group__0__Impl rule__CoProcessor__Group__1 )
            // InternalKiCool.g:2262:2: rule__CoProcessor__Group__0__Impl rule__CoProcessor__Group__1
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
    // InternalKiCool.g:2269:1: rule__CoProcessor__Group__0__Impl : ( ( rule__CoProcessor__IdAssignment_0 ) ) ;
    public final void rule__CoProcessor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2273:1: ( ( ( rule__CoProcessor__IdAssignment_0 ) ) )
            // InternalKiCool.g:2274:1: ( ( rule__CoProcessor__IdAssignment_0 ) )
            {
            // InternalKiCool.g:2274:1: ( ( rule__CoProcessor__IdAssignment_0 ) )
            // InternalKiCool.g:2275:2: ( rule__CoProcessor__IdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoProcessorAccess().getIdAssignment_0()); 
            }
            // InternalKiCool.g:2276:2: ( rule__CoProcessor__IdAssignment_0 )
            // InternalKiCool.g:2276:3: rule__CoProcessor__IdAssignment_0
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
    // InternalKiCool.g:2284:1: rule__CoProcessor__Group__1 : rule__CoProcessor__Group__1__Impl ;
    public final void rule__CoProcessor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2288:1: ( rule__CoProcessor__Group__1__Impl )
            // InternalKiCool.g:2289:2: rule__CoProcessor__Group__1__Impl
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
    // InternalKiCool.g:2295:1: rule__CoProcessor__Group__1__Impl : ( ( rule__CoProcessor__SilentAssignment_1 )? ) ;
    public final void rule__CoProcessor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2299:1: ( ( ( rule__CoProcessor__SilentAssignment_1 )? ) )
            // InternalKiCool.g:2300:1: ( ( rule__CoProcessor__SilentAssignment_1 )? )
            {
            // InternalKiCool.g:2300:1: ( ( rule__CoProcessor__SilentAssignment_1 )? )
            // InternalKiCool.g:2301:2: ( rule__CoProcessor__SilentAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoProcessorAccess().getSilentAssignment_1()); 
            }
            // InternalKiCool.g:2302:2: ( rule__CoProcessor__SilentAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKiCool.g:2302:3: rule__CoProcessor__SilentAssignment_1
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
    // InternalKiCool.g:2311:1: rule__ProcessorAlternativeGroup__Group__0 : rule__ProcessorAlternativeGroup__Group__0__Impl rule__ProcessorAlternativeGroup__Group__1 ;
    public final void rule__ProcessorAlternativeGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2315:1: ( rule__ProcessorAlternativeGroup__Group__0__Impl rule__ProcessorAlternativeGroup__Group__1 )
            // InternalKiCool.g:2316:2: rule__ProcessorAlternativeGroup__Group__0__Impl rule__ProcessorAlternativeGroup__Group__1
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
    // InternalKiCool.g:2323:1: rule__ProcessorAlternativeGroup__Group__0__Impl : ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? ) ;
    public final void rule__ProcessorAlternativeGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2327:1: ( ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? ) )
            // InternalKiCool.g:2328:1: ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? )
            {
            // InternalKiCool.g:2328:1: ( ( rule__ProcessorAlternativeGroup__Group_0__0 )? )
            // InternalKiCool.g:2329:2: ( rule__ProcessorAlternativeGroup__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_0()); 
            }
            // InternalKiCool.g:2330:2: ( rule__ProcessorAlternativeGroup__Group_0__0 )?
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
                    // InternalKiCool.g:2330:3: rule__ProcessorAlternativeGroup__Group_0__0
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
    // InternalKiCool.g:2338:1: rule__ProcessorAlternativeGroup__Group__1 : rule__ProcessorAlternativeGroup__Group__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2342:1: ( rule__ProcessorAlternativeGroup__Group__1__Impl )
            // InternalKiCool.g:2343:2: rule__ProcessorAlternativeGroup__Group__1__Impl
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
    // InternalKiCool.g:2349:1: rule__ProcessorAlternativeGroup__Group__1__Impl : ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2353:1: ( ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) ) )
            // InternalKiCool.g:2354:1: ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) )
            {
            // InternalKiCool.g:2354:1: ( ( rule__ProcessorAlternativeGroup__Group_1__0 ) )
            // InternalKiCool.g:2355:2: ( rule__ProcessorAlternativeGroup__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1()); 
            }
            // InternalKiCool.g:2356:2: ( rule__ProcessorAlternativeGroup__Group_1__0 )
            // InternalKiCool.g:2356:3: rule__ProcessorAlternativeGroup__Group_1__0
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
    // InternalKiCool.g:2365:1: rule__ProcessorAlternativeGroup__Group_0__0 : rule__ProcessorAlternativeGroup__Group_0__0__Impl rule__ProcessorAlternativeGroup__Group_0__1 ;
    public final void rule__ProcessorAlternativeGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2369:1: ( rule__ProcessorAlternativeGroup__Group_0__0__Impl rule__ProcessorAlternativeGroup__Group_0__1 )
            // InternalKiCool.g:2370:2: rule__ProcessorAlternativeGroup__Group_0__0__Impl rule__ProcessorAlternativeGroup__Group_0__1
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
    // InternalKiCool.g:2377:1: rule__ProcessorAlternativeGroup__Group_0__0__Impl : ( 'label' ) ;
    public final void rule__ProcessorAlternativeGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2381:1: ( ( 'label' ) )
            // InternalKiCool.g:2382:1: ( 'label' )
            {
            // InternalKiCool.g:2382:1: ( 'label' )
            // InternalKiCool.g:2383:2: 'label'
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
    // InternalKiCool.g:2392:1: rule__ProcessorAlternativeGroup__Group_0__1 : rule__ProcessorAlternativeGroup__Group_0__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2396:1: ( rule__ProcessorAlternativeGroup__Group_0__1__Impl )
            // InternalKiCool.g:2397:2: rule__ProcessorAlternativeGroup__Group_0__1__Impl
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
    // InternalKiCool.g:2403:1: rule__ProcessorAlternativeGroup__Group_0__1__Impl : ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2407:1: ( ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) ) )
            // InternalKiCool.g:2408:1: ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) )
            {
            // InternalKiCool.g:2408:1: ( ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 ) )
            // InternalKiCool.g:2409:2: ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getLabelAssignment_0_1()); 
            }
            // InternalKiCool.g:2410:2: ( rule__ProcessorAlternativeGroup__LabelAssignment_0_1 )
            // InternalKiCool.g:2410:3: rule__ProcessorAlternativeGroup__LabelAssignment_0_1
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
    // InternalKiCool.g:2419:1: rule__ProcessorAlternativeGroup__Group_1__0 : rule__ProcessorAlternativeGroup__Group_1__0__Impl rule__ProcessorAlternativeGroup__Group_1__1 ;
    public final void rule__ProcessorAlternativeGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2423:1: ( rule__ProcessorAlternativeGroup__Group_1__0__Impl rule__ProcessorAlternativeGroup__Group_1__1 )
            // InternalKiCool.g:2424:2: rule__ProcessorAlternativeGroup__Group_1__0__Impl rule__ProcessorAlternativeGroup__Group_1__1
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
    // InternalKiCool.g:2431:1: rule__ProcessorAlternativeGroup__Group_1__0__Impl : ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2435:1: ( ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) ) )
            // InternalKiCool.g:2436:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) )
            {
            // InternalKiCool.g:2436:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 ) )
            // InternalKiCool.g:2437:2: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsAssignment_1_0()); 
            }
            // InternalKiCool.g:2438:2: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 )
            // InternalKiCool.g:2438:3: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0
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
    // InternalKiCool.g:2446:1: rule__ProcessorAlternativeGroup__Group_1__1 : rule__ProcessorAlternativeGroup__Group_1__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2450:1: ( rule__ProcessorAlternativeGroup__Group_1__1__Impl )
            // InternalKiCool.g:2451:2: rule__ProcessorAlternativeGroup__Group_1__1__Impl
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
    // InternalKiCool.g:2457:1: rule__ProcessorAlternativeGroup__Group_1__1__Impl : ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2461:1: ( ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) ) )
            // InternalKiCool.g:2462:1: ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) )
            {
            // InternalKiCool.g:2462:1: ( ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* ) )
            // InternalKiCool.g:2463:2: ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) ) ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* )
            {
            // InternalKiCool.g:2463:2: ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 ) )
            // InternalKiCool.g:2464:3: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1_1()); 
            }
            // InternalKiCool.g:2465:3: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )
            // InternalKiCool.g:2465:4: rule__ProcessorAlternativeGroup__Group_1_1__0
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

            // InternalKiCool.g:2468:2: ( ( rule__ProcessorAlternativeGroup__Group_1_1__0 )* )
            // InternalKiCool.g:2469:3: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getGroup_1_1()); 
            }
            // InternalKiCool.g:2470:3: ( rule__ProcessorAlternativeGroup__Group_1_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKiCool.g:2470:4: rule__ProcessorAlternativeGroup__Group_1_1__0
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
    // InternalKiCool.g:2480:1: rule__ProcessorAlternativeGroup__Group_1_1__0 : rule__ProcessorAlternativeGroup__Group_1_1__0__Impl rule__ProcessorAlternativeGroup__Group_1_1__1 ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2484:1: ( rule__ProcessorAlternativeGroup__Group_1_1__0__Impl rule__ProcessorAlternativeGroup__Group_1_1__1 )
            // InternalKiCool.g:2485:2: rule__ProcessorAlternativeGroup__Group_1_1__0__Impl rule__ProcessorAlternativeGroup__Group_1_1__1
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
    // InternalKiCool.g:2492:1: rule__ProcessorAlternativeGroup__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2496:1: ( ( '|' ) )
            // InternalKiCool.g:2497:1: ( '|' )
            {
            // InternalKiCool.g:2497:1: ( '|' )
            // InternalKiCool.g:2498:2: '|'
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
    // InternalKiCool.g:2507:1: rule__ProcessorAlternativeGroup__Group_1_1__1 : rule__ProcessorAlternativeGroup__Group_1_1__1__Impl ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2511:1: ( rule__ProcessorAlternativeGroup__Group_1_1__1__Impl )
            // InternalKiCool.g:2512:2: rule__ProcessorAlternativeGroup__Group_1_1__1__Impl
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
    // InternalKiCool.g:2518:1: rule__ProcessorAlternativeGroup__Group_1_1__1__Impl : ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) ) ;
    public final void rule__ProcessorAlternativeGroup__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2522:1: ( ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) ) )
            // InternalKiCool.g:2523:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) )
            {
            // InternalKiCool.g:2523:1: ( ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 ) )
            // InternalKiCool.g:2524:2: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAlternativeGroupAccess().getProcessorsAssignment_1_1_1()); 
            }
            // InternalKiCool.g:2525:2: ( rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 )
            // InternalKiCool.g:2525:3: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1
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
    // InternalKiCool.g:2534:1: rule__KVPair__Group__0 : rule__KVPair__Group__0__Impl rule__KVPair__Group__1 ;
    public final void rule__KVPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2538:1: ( rule__KVPair__Group__0__Impl rule__KVPair__Group__1 )
            // InternalKiCool.g:2539:2: rule__KVPair__Group__0__Impl rule__KVPair__Group__1
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
    // InternalKiCool.g:2546:1: rule__KVPair__Group__0__Impl : ( ( rule__KVPair__KeyAssignment_0 ) ) ;
    public final void rule__KVPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2550:1: ( ( ( rule__KVPair__KeyAssignment_0 ) ) )
            // InternalKiCool.g:2551:1: ( ( rule__KVPair__KeyAssignment_0 ) )
            {
            // InternalKiCool.g:2551:1: ( ( rule__KVPair__KeyAssignment_0 ) )
            // InternalKiCool.g:2552:2: ( rule__KVPair__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getKeyAssignment_0()); 
            }
            // InternalKiCool.g:2553:2: ( rule__KVPair__KeyAssignment_0 )
            // InternalKiCool.g:2553:3: rule__KVPair__KeyAssignment_0
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
    // InternalKiCool.g:2561:1: rule__KVPair__Group__1 : rule__KVPair__Group__1__Impl rule__KVPair__Group__2 ;
    public final void rule__KVPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2565:1: ( rule__KVPair__Group__1__Impl rule__KVPair__Group__2 )
            // InternalKiCool.g:2566:2: rule__KVPair__Group__1__Impl rule__KVPair__Group__2
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
    // InternalKiCool.g:2573:1: rule__KVPair__Group__1__Impl : ( ( rule__KVPair__IsKeyValueAssignment_1 )? ) ;
    public final void rule__KVPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2577:1: ( ( ( rule__KVPair__IsKeyValueAssignment_1 )? ) )
            // InternalKiCool.g:2578:1: ( ( rule__KVPair__IsKeyValueAssignment_1 )? )
            {
            // InternalKiCool.g:2578:1: ( ( rule__KVPair__IsKeyValueAssignment_1 )? )
            // InternalKiCool.g:2579:2: ( rule__KVPair__IsKeyValueAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getIsKeyValueAssignment_1()); 
            }
            // InternalKiCool.g:2580:2: ( rule__KVPair__IsKeyValueAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKiCool.g:2580:3: rule__KVPair__IsKeyValueAssignment_1
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
    // InternalKiCool.g:2588:1: rule__KVPair__Group__2 : rule__KVPair__Group__2__Impl ;
    public final void rule__KVPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2592:1: ( rule__KVPair__Group__2__Impl )
            // InternalKiCool.g:2593:2: rule__KVPair__Group__2__Impl
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
    // InternalKiCool.g:2599:1: rule__KVPair__Group__2__Impl : ( ( rule__KVPair__ValueAssignment_2 ) ) ;
    public final void rule__KVPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2603:1: ( ( ( rule__KVPair__ValueAssignment_2 ) ) )
            // InternalKiCool.g:2604:1: ( ( rule__KVPair__ValueAssignment_2 ) )
            {
            // InternalKiCool.g:2604:1: ( ( rule__KVPair__ValueAssignment_2 ) )
            // InternalKiCool.g:2605:2: ( rule__KVPair__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getValueAssignment_2()); 
            }
            // InternalKiCool.g:2606:2: ( rule__KVPair__ValueAssignment_2 )
            // InternalKiCool.g:2606:3: rule__KVPair__ValueAssignment_2
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
    // InternalKiCool.g:2615:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2619:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalKiCool.g:2620:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
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
    // InternalKiCool.g:2627:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2631:1: ( ( '@' ) )
            // InternalKiCool.g:2632:1: ( '@' )
            {
            // InternalKiCool.g:2632:1: ( '@' )
            // InternalKiCool.g:2633:2: '@'
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
    // InternalKiCool.g:2642:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2646:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalKiCool.g:2647:2: rule__TagAnnotation__Group__1__Impl
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
    // InternalKiCool.g:2653:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2657:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:2658:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:2658:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:2659:2: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:2660:2: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalKiCool.g:2660:3: rule__TagAnnotation__NameAssignment_1
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
    // InternalKiCool.g:2669:1: rule__PragmaTag__Group__0 : rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 ;
    public final void rule__PragmaTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2673:1: ( rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 )
            // InternalKiCool.g:2674:2: rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1
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
    // InternalKiCool.g:2681:1: rule__PragmaTag__Group__0__Impl : ( '#' ) ;
    public final void rule__PragmaTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2685:1: ( ( '#' ) )
            // InternalKiCool.g:2686:1: ( '#' )
            {
            // InternalKiCool.g:2686:1: ( '#' )
            // InternalKiCool.g:2687:2: '#'
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
    // InternalKiCool.g:2696:1: rule__PragmaTag__Group__1 : rule__PragmaTag__Group__1__Impl ;
    public final void rule__PragmaTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2700:1: ( rule__PragmaTag__Group__1__Impl )
            // InternalKiCool.g:2701:2: rule__PragmaTag__Group__1__Impl
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
    // InternalKiCool.g:2707:1: rule__PragmaTag__Group__1__Impl : ( ( rule__PragmaTag__NameAssignment_1 ) ) ;
    public final void rule__PragmaTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2711:1: ( ( ( rule__PragmaTag__NameAssignment_1 ) ) )
            // InternalKiCool.g:2712:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            {
            // InternalKiCool.g:2712:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            // InternalKiCool.g:2713:2: ( rule__PragmaTag__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPragmaTagAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:2714:2: ( rule__PragmaTag__NameAssignment_1 )
            // InternalKiCool.g:2714:3: rule__PragmaTag__NameAssignment_1
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
    // InternalKiCool.g:2723:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2727:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:2728:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:2735:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2739:1: ( ( '@' ) )
            // InternalKiCool.g:2740:1: ( '@' )
            {
            // InternalKiCool.g:2740:1: ( '@' )
            // InternalKiCool.g:2741:2: '@'
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
    // InternalKiCool.g:2750:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2754:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:2755:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
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
    // InternalKiCool.g:2762:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2766:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:2767:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:2767:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:2768:2: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:2769:2: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:2769:3: rule__KeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:2777:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2781:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:2782:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:2789:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2793:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:2794:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:2794:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:2795:2: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:2796:2: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:2796:3: rule__KeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKiCool.g:2804:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2808:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalKiCool.g:2809:2: rule__KeyStringValueAnnotation__Group__3__Impl
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
    // InternalKiCool.g:2815:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2819:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKiCool.g:2820:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKiCool.g:2820:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalKiCool.g:2821:2: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:2822:2: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKiCool.g:2822:3: rule__KeyStringValueAnnotation__Group_3__0
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
    // InternalKiCool.g:2831:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2835:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:2836:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
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
    // InternalKiCool.g:2843:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2847:1: ( ( ',' ) )
            // InternalKiCool.g:2848:1: ( ',' )
            {
            // InternalKiCool.g:2848:1: ( ',' )
            // InternalKiCool.g:2849:2: ','
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
    // InternalKiCool.g:2858:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2862:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:2863:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKiCool.g:2869:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2873:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:2874:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:2874:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:2875:2: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:2876:2: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:2876:3: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKiCool.g:2885:1: rule__RestrictedKeyStringValueAnnotation__Group__0 : rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2889:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:2890:2: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:2897:1: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2901:1: ( ( '@' ) )
            // InternalKiCool.g:2902:1: ( '@' )
            {
            // InternalKiCool.g:2902:1: ( '@' )
            // InternalKiCool.g:2903:2: '@'
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
    // InternalKiCool.g:2912:1: rule__RestrictedKeyStringValueAnnotation__Group__1 : rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2916:1: ( rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:2917:2: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2
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
    // InternalKiCool.g:2924:1: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2928:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:2929:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:2929:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:2930:2: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:2931:2: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:2931:3: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:2939:1: rule__RestrictedKeyStringValueAnnotation__Group__2 : rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2943:1: ( rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:2944:2: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:2951:1: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2955:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:2956:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:2956:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:2957:2: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:2958:2: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:2958:3: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2
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
            // InternalKiCool.g:2983:2: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:2984:2: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKiCool.g:2984:3: rule__RestrictedKeyStringValueAnnotation__Group_3__0
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
    // InternalKiCool.g:2993:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0 : rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:2997:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:2998:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1
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
    // InternalKiCool.g:3005:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3009:1: ( ( ',' ) )
            // InternalKiCool.g:3010:1: ( ',' )
            {
            // InternalKiCool.g:3010:1: ( ',' )
            // InternalKiCool.g:3011:2: ','
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
    // InternalKiCool.g:3020:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1 : rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3024:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:3025:2: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKiCool.g:3031:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3035:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:3036:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:3036:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:3037:2: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:3038:2: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:3038:3: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKiCool.g:3047:1: rule__StringPragma__Group__0 : rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 ;
    public final void rule__StringPragma__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3051:1: ( rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 )
            // InternalKiCool.g:3052:2: rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1
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
    // InternalKiCool.g:3059:1: rule__StringPragma__Group__0__Impl : ( '#' ) ;
    public final void rule__StringPragma__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3063:1: ( ( '#' ) )
            // InternalKiCool.g:3064:1: ( '#' )
            {
            // InternalKiCool.g:3064:1: ( '#' )
            // InternalKiCool.g:3065:2: '#'
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
    // InternalKiCool.g:3074:1: rule__StringPragma__Group__1 : rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 ;
    public final void rule__StringPragma__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3078:1: ( rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 )
            // InternalKiCool.g:3079:2: rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2
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
    // InternalKiCool.g:3086:1: rule__StringPragma__Group__1__Impl : ( ( rule__StringPragma__NameAssignment_1 ) ) ;
    public final void rule__StringPragma__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3090:1: ( ( ( rule__StringPragma__NameAssignment_1 ) ) )
            // InternalKiCool.g:3091:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3091:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            // InternalKiCool.g:3092:2: ( rule__StringPragma__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3093:2: ( rule__StringPragma__NameAssignment_1 )
            // InternalKiCool.g:3093:3: rule__StringPragma__NameAssignment_1
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
    // InternalKiCool.g:3101:1: rule__StringPragma__Group__2 : rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 ;
    public final void rule__StringPragma__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3105:1: ( rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 )
            // InternalKiCool.g:3106:2: rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3
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
    // InternalKiCool.g:3113:1: rule__StringPragma__Group__2__Impl : ( ( rule__StringPragma__ValuesAssignment_2 ) ) ;
    public final void rule__StringPragma__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3117:1: ( ( ( rule__StringPragma__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:3118:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:3118:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            // InternalKiCool.g:3119:2: ( rule__StringPragma__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:3120:2: ( rule__StringPragma__ValuesAssignment_2 )
            // InternalKiCool.g:3120:3: rule__StringPragma__ValuesAssignment_2
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
    // InternalKiCool.g:3128:1: rule__StringPragma__Group__3 : rule__StringPragma__Group__3__Impl ;
    public final void rule__StringPragma__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3132:1: ( rule__StringPragma__Group__3__Impl )
            // InternalKiCool.g:3133:2: rule__StringPragma__Group__3__Impl
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
    // InternalKiCool.g:3139:1: rule__StringPragma__Group__3__Impl : ( ( rule__StringPragma__Group_3__0 )* ) ;
    public final void rule__StringPragma__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3143:1: ( ( ( rule__StringPragma__Group_3__0 )* ) )
            // InternalKiCool.g:3144:1: ( ( rule__StringPragma__Group_3__0 )* )
            {
            // InternalKiCool.g:3144:1: ( ( rule__StringPragma__Group_3__0 )* )
            // InternalKiCool.g:3145:2: ( rule__StringPragma__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getGroup_3()); 
            }
            // InternalKiCool.g:3146:2: ( rule__StringPragma__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKiCool.g:3146:3: rule__StringPragma__Group_3__0
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
    // InternalKiCool.g:3155:1: rule__StringPragma__Group_3__0 : rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 ;
    public final void rule__StringPragma__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3159:1: ( rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 )
            // InternalKiCool.g:3160:2: rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1
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
    // InternalKiCool.g:3167:1: rule__StringPragma__Group_3__0__Impl : ( ',' ) ;
    public final void rule__StringPragma__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3171:1: ( ( ',' ) )
            // InternalKiCool.g:3172:1: ( ',' )
            {
            // InternalKiCool.g:3172:1: ( ',' )
            // InternalKiCool.g:3173:2: ','
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
    // InternalKiCool.g:3182:1: rule__StringPragma__Group_3__1 : rule__StringPragma__Group_3__1__Impl ;
    public final void rule__StringPragma__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3186:1: ( rule__StringPragma__Group_3__1__Impl )
            // InternalKiCool.g:3187:2: rule__StringPragma__Group_3__1__Impl
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
    // InternalKiCool.g:3193:1: rule__StringPragma__Group_3__1__Impl : ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) ;
    public final void rule__StringPragma__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3197:1: ( ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:3198:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:3198:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:3199:2: ( rule__StringPragma__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringPragmaAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:3200:2: ( rule__StringPragma__ValuesAssignment_3_1 )
            // InternalKiCool.g:3200:3: rule__StringPragma__ValuesAssignment_3_1
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
    // InternalKiCool.g:3209:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3213:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3214:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:3221:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3225:1: ( ( '@' ) )
            // InternalKiCool.g:3226:1: ( '@' )
            {
            // InternalKiCool.g:3226:1: ( '@' )
            // InternalKiCool.g:3227:2: '@'
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
    // InternalKiCool.g:3236:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3240:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3241:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
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
    // InternalKiCool.g:3248:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3252:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3253:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3253:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3254:2: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3255:2: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3255:3: rule__TypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3263:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3267:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3268:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:3275:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3279:1: ( ( '[' ) )
            // InternalKiCool.g:3280:1: ( '[' )
            {
            // InternalKiCool.g:3280:1: ( '[' )
            // InternalKiCool.g:3281:2: '['
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
    // InternalKiCool.g:3290:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3294:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalKiCool.g:3295:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
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
    // InternalKiCool.g:3302:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3306:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKiCool.g:3307:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKiCool.g:3307:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKiCool.g:3308:2: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKiCool.g:3309:2: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKiCool.g:3309:3: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKiCool.g:3317:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3321:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalKiCool.g:3322:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
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
    // InternalKiCool.g:3329:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3333:1: ( ( ']' ) )
            // InternalKiCool.g:3334:1: ( ']' )
            {
            // InternalKiCool.g:3334:1: ( ']' )
            // InternalKiCool.g:3335:2: ']'
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
    // InternalKiCool.g:3344:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3348:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalKiCool.g:3349:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
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
    // InternalKiCool.g:3356:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3360:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKiCool.g:3361:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKiCool.g:3361:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKiCool.g:3362:2: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKiCool.g:3363:2: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKiCool.g:3363:3: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKiCool.g:3371:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3375:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKiCool.g:3376:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKiCool.g:3382:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3386:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKiCool.g:3387:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKiCool.g:3387:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKiCool.g:3388:2: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKiCool.g:3389:2: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKiCool.g:3389:3: rule__TypedKeyStringValueAnnotation__Group_6__0
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
    // InternalKiCool.g:3398:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3402:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKiCool.g:3403:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
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
    // InternalKiCool.g:3410:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3414:1: ( ( ',' ) )
            // InternalKiCool.g:3415:1: ( ',' )
            {
            // InternalKiCool.g:3415:1: ( ',' )
            // InternalKiCool.g:3416:2: ','
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
    // InternalKiCool.g:3425:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3429:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKiCool.g:3430:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKiCool.g:3436:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3440:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKiCool.g:3441:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKiCool.g:3441:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKiCool.g:3442:2: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKiCool.g:3443:2: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKiCool.g:3443:3: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKiCool.g:3452:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3456:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3457:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:3464:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3468:1: ( ( '@' ) )
            // InternalKiCool.g:3469:1: ( '@' )
            {
            // InternalKiCool.g:3469:1: ( '@' )
            // InternalKiCool.g:3470:2: '@'
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
    // InternalKiCool.g:3479:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3483:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3484:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2
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
    // InternalKiCool.g:3491:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3495:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3496:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3496:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3497:2: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3498:2: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3498:3: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3506:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2 : rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3510:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3511:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:3518:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3522:1: ( ( '[' ) )
            // InternalKiCool.g:3523:1: ( '[' )
            {
            // InternalKiCool.g:3523:1: ( '[' )
            // InternalKiCool.g:3524:2: '['
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
    // InternalKiCool.g:3533:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3 : rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3537:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKiCool.g:3538:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4
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
    // InternalKiCool.g:3545:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3549:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKiCool.g:3550:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKiCool.g:3550:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKiCool.g:3551:2: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKiCool.g:3552:2: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKiCool.g:3552:3: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKiCool.g:3560:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4 : rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3564:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKiCool.g:3565:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5
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
    // InternalKiCool.g:3572:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3576:1: ( ( ']' ) )
            // InternalKiCool.g:3577:1: ( ']' )
            {
            // InternalKiCool.g:3577:1: ( ']' )
            // InternalKiCool.g:3578:2: ']'
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
    // InternalKiCool.g:3587:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5 : rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3591:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKiCool.g:3592:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6
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
    // InternalKiCool.g:3599:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3603:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKiCool.g:3604:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKiCool.g:3604:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKiCool.g:3605:2: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKiCool.g:3606:2: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKiCool.g:3606:3: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKiCool.g:3614:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6 : rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3618:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKiCool.g:3619:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKiCool.g:3625:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3629:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKiCool.g:3630:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKiCool.g:3630:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKiCool.g:3631:2: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKiCool.g:3632:2: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKiCool.g:3632:3: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0
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
    // InternalKiCool.g:3641:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3645:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKiCool.g:3646:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1
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
    // InternalKiCool.g:3653:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3657:1: ( ( ',' ) )
            // InternalKiCool.g:3658:1: ( ',' )
            {
            // InternalKiCool.g:3658:1: ( ',' )
            // InternalKiCool.g:3659:2: ','
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
    // InternalKiCool.g:3668:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3672:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKiCool.g:3673:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKiCool.g:3679:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3683:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKiCool.g:3684:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKiCool.g:3684:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKiCool.g:3685:2: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKiCool.g:3686:2: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKiCool.g:3686:3: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKiCool.g:3695:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3699:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3700:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:3707:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3711:1: ( ( '@' ) )
            // InternalKiCool.g:3712:1: ( '@' )
            {
            // InternalKiCool.g:3712:1: ( '@' )
            // InternalKiCool.g:3713:2: '@'
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
    // InternalKiCool.g:3722:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3726:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3727:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
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
    // InternalKiCool.g:3734:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3738:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3739:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3739:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3740:2: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3741:2: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3741:3: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3749:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3753:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3754:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:3761:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3765:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalKiCool.g:3766:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalKiCool.g:3766:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalKiCool.g:3767:2: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            }
            // InternalKiCool.g:3768:2: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalKiCool.g:3768:3: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalKiCool.g:3776:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3780:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalKiCool.g:3781:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalKiCool.g:3787:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3791:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalKiCool.g:3792:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalKiCool.g:3792:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalKiCool.g:3793:2: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // InternalKiCool.g:3794:2: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==33) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalKiCool.g:3794:3: rule__QuotedKeyStringValueAnnotation__Group_3__0
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
    // InternalKiCool.g:3803:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3807:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalKiCool.g:3808:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
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
    // InternalKiCool.g:3815:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3819:1: ( ( ',' ) )
            // InternalKiCool.g:3820:1: ( ',' )
            {
            // InternalKiCool.g:3820:1: ( ',' )
            // InternalKiCool.g:3821:2: ','
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
    // InternalKiCool.g:3830:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3834:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalKiCool.g:3835:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalKiCool.g:3841:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3845:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalKiCool.g:3846:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalKiCool.g:3846:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalKiCool.g:3847:2: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            }
            // InternalKiCool.g:3848:2: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalKiCool.g:3848:3: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalKiCool.g:3857:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3861:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalKiCool.g:3862:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
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
    // InternalKiCool.g:3869:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3873:1: ( ( '@' ) )
            // InternalKiCool.g:3874:1: ( '@' )
            {
            // InternalKiCool.g:3874:1: ( '@' )
            // InternalKiCool.g:3875:2: '@'
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
    // InternalKiCool.g:3884:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3888:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalKiCool.g:3889:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
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
    // InternalKiCool.g:3896:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3900:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalKiCool.g:3901:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalKiCool.g:3901:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalKiCool.g:3902:2: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalKiCool.g:3903:2: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalKiCool.g:3903:3: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalKiCool.g:3911:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3915:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalKiCool.g:3916:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
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
    // InternalKiCool.g:3923:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3927:1: ( ( '[' ) )
            // InternalKiCool.g:3928:1: ( '[' )
            {
            // InternalKiCool.g:3928:1: ( '[' )
            // InternalKiCool.g:3929:2: '['
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
    // InternalKiCool.g:3938:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3942:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalKiCool.g:3943:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
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
    // InternalKiCool.g:3950:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3954:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalKiCool.g:3955:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalKiCool.g:3955:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalKiCool.g:3956:2: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // InternalKiCool.g:3957:2: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalKiCool.g:3957:3: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalKiCool.g:3965:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3969:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalKiCool.g:3970:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
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
    // InternalKiCool.g:3977:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3981:1: ( ( ']' ) )
            // InternalKiCool.g:3982:1: ( ']' )
            {
            // InternalKiCool.g:3982:1: ( ']' )
            // InternalKiCool.g:3983:2: ']'
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
    // InternalKiCool.g:3992:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:3996:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalKiCool.g:3997:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
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
    // InternalKiCool.g:4004:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4008:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalKiCool.g:4009:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalKiCool.g:4009:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalKiCool.g:4010:2: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            }
            // InternalKiCool.g:4011:2: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalKiCool.g:4011:3: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalKiCool.g:4019:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4023:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalKiCool.g:4024:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalKiCool.g:4030:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4034:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalKiCool.g:4035:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalKiCool.g:4035:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalKiCool.g:4036:2: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // InternalKiCool.g:4037:2: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKiCool.g:4037:3: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
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
    // InternalKiCool.g:4046:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4050:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalKiCool.g:4051:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
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
    // InternalKiCool.g:4058:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4062:1: ( ( ',' ) )
            // InternalKiCool.g:4063:1: ( ',' )
            {
            // InternalKiCool.g:4063:1: ( ',' )
            // InternalKiCool.g:4064:2: ','
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
    // InternalKiCool.g:4073:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4077:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalKiCool.g:4078:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalKiCool.g:4084:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4088:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalKiCool.g:4089:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalKiCool.g:4089:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalKiCool.g:4090:2: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            }
            // InternalKiCool.g:4091:2: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalKiCool.g:4091:3: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalKiCool.g:4100:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4104:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalKiCool.g:4105:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
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
    // InternalKiCool.g:4112:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4116:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4117:1: ( RULE_ID )
            {
            // InternalKiCool.g:4117:1: ( RULE_ID )
            // InternalKiCool.g:4118:2: RULE_ID
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
    // InternalKiCool.g:4127:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4131:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalKiCool.g:4132:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
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
    // InternalKiCool.g:4139:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4143:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // InternalKiCool.g:4144:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // InternalKiCool.g:4144:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // InternalKiCool.g:4145:2: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // InternalKiCool.g:4146:2: ( rule__ExtendedID__Group_1__0 )*
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
            	    // InternalKiCool.g:4146:3: rule__ExtendedID__Group_1__0
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
    // InternalKiCool.g:4154:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4158:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalKiCool.g:4159:2: rule__ExtendedID__Group__2__Impl
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
    // InternalKiCool.g:4165:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4169:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalKiCool.g:4170:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalKiCool.g:4170:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalKiCool.g:4171:2: ( rule__ExtendedID__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            }
            // InternalKiCool.g:4172:2: ( rule__ExtendedID__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKiCool.g:4172:3: rule__ExtendedID__Group_2__0
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
    // InternalKiCool.g:4181:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4185:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // InternalKiCool.g:4186:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
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
    // InternalKiCool.g:4193:1: rule__ExtendedID__Group_1__0__Impl : ( ( rule__ExtendedID__Alternatives_1_0 ) ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4197:1: ( ( ( rule__ExtendedID__Alternatives_1_0 ) ) )
            // InternalKiCool.g:4198:1: ( ( rule__ExtendedID__Alternatives_1_0 ) )
            {
            // InternalKiCool.g:4198:1: ( ( rule__ExtendedID__Alternatives_1_0 ) )
            // InternalKiCool.g:4199:2: ( rule__ExtendedID__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getAlternatives_1_0()); 
            }
            // InternalKiCool.g:4200:2: ( rule__ExtendedID__Alternatives_1_0 )
            // InternalKiCool.g:4200:3: rule__ExtendedID__Alternatives_1_0
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
    // InternalKiCool.g:4208:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4212:1: ( rule__ExtendedID__Group_1__1__Impl )
            // InternalKiCool.g:4213:2: rule__ExtendedID__Group_1__1__Impl
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
    // InternalKiCool.g:4219:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4223:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4224:1: ( RULE_ID )
            {
            // InternalKiCool.g:4224:1: ( RULE_ID )
            // InternalKiCool.g:4225:2: RULE_ID
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
    // InternalKiCool.g:4235:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4239:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalKiCool.g:4240:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
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
    // InternalKiCool.g:4247:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4251:1: ( ( '#' ) )
            // InternalKiCool.g:4252:1: ( '#' )
            {
            // InternalKiCool.g:4252:1: ( '#' )
            // InternalKiCool.g:4253:2: '#'
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
    // InternalKiCool.g:4262:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4266:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalKiCool.g:4267:2: rule__ExtendedID__Group_2__1__Impl
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
    // InternalKiCool.g:4273:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4277:1: ( ( RULE_INT ) )
            // InternalKiCool.g:4278:1: ( RULE_INT )
            {
            // InternalKiCool.g:4278:1: ( RULE_INT )
            // InternalKiCool.g:4279:2: RULE_INT
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
    // InternalKiCool.g:4289:1: rule__QualifiedID__Group__0 : rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 ;
    public final void rule__QualifiedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4293:1: ( rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1 )
            // InternalKiCool.g:4294:2: rule__QualifiedID__Group__0__Impl rule__QualifiedID__Group__1
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
    // InternalKiCool.g:4301:1: rule__QualifiedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4305:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4306:1: ( RULE_ID )
            {
            // InternalKiCool.g:4306:1: ( RULE_ID )
            // InternalKiCool.g:4307:2: RULE_ID
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
    // InternalKiCool.g:4316:1: rule__QualifiedID__Group__1 : rule__QualifiedID__Group__1__Impl ;
    public final void rule__QualifiedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4320:1: ( rule__QualifiedID__Group__1__Impl )
            // InternalKiCool.g:4321:2: rule__QualifiedID__Group__1__Impl
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
    // InternalKiCool.g:4327:1: rule__QualifiedID__Group__1__Impl : ( ( rule__QualifiedID__Group_1__0 )* ) ;
    public final void rule__QualifiedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4331:1: ( ( ( rule__QualifiedID__Group_1__0 )* ) )
            // InternalKiCool.g:4332:1: ( ( rule__QualifiedID__Group_1__0 )* )
            {
            // InternalKiCool.g:4332:1: ( ( rule__QualifiedID__Group_1__0 )* )
            // InternalKiCool.g:4333:2: ( rule__QualifiedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedIDAccess().getGroup_1()); 
            }
            // InternalKiCool.g:4334:2: ( rule__QualifiedID__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==16) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKiCool.g:4334:3: rule__QualifiedID__Group_1__0
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
    // InternalKiCool.g:4343:1: rule__QualifiedID__Group_1__0 : rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 ;
    public final void rule__QualifiedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4347:1: ( rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1 )
            // InternalKiCool.g:4348:2: rule__QualifiedID__Group_1__0__Impl rule__QualifiedID__Group_1__1
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
    // InternalKiCool.g:4355:1: rule__QualifiedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4359:1: ( ( '.' ) )
            // InternalKiCool.g:4360:1: ( '.' )
            {
            // InternalKiCool.g:4360:1: ( '.' )
            // InternalKiCool.g:4361:2: '.'
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
    // InternalKiCool.g:4370:1: rule__QualifiedID__Group_1__1 : rule__QualifiedID__Group_1__1__Impl ;
    public final void rule__QualifiedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4374:1: ( rule__QualifiedID__Group_1__1__Impl )
            // InternalKiCool.g:4375:2: rule__QualifiedID__Group_1__1__Impl
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
    // InternalKiCool.g:4381:1: rule__QualifiedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4385:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4386:1: ( RULE_ID )
            {
            // InternalKiCool.g:4386:1: ( RULE_ID )
            // InternalKiCool.g:4387:2: RULE_ID
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
    // InternalKiCool.g:4397:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4401:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalKiCool.g:4402:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
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
    // InternalKiCool.g:4409:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4413:1: ( ( ( '-' )? ) )
            // InternalKiCool.g:4414:1: ( ( '-' )? )
            {
            // InternalKiCool.g:4414:1: ( ( '-' )? )
            // InternalKiCool.g:4415:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKiCool.g:4416:2: ( '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==17) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKiCool.g:4416:3: '-'
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
    // InternalKiCool.g:4424:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4428:1: ( rule__Integer__Group__1__Impl )
            // InternalKiCool.g:4429:2: rule__Integer__Group__1__Impl
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
    // InternalKiCool.g:4435:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4439:1: ( ( RULE_INT ) )
            // InternalKiCool.g:4440:1: ( RULE_INT )
            {
            // InternalKiCool.g:4440:1: ( RULE_INT )
            // InternalKiCool.g:4441:2: RULE_INT
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
    // InternalKiCool.g:4451:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4455:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalKiCool.g:4456:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
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
    // InternalKiCool.g:4463:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4467:1: ( ( ( '-' )? ) )
            // InternalKiCool.g:4468:1: ( ( '-' )? )
            {
            // InternalKiCool.g:4468:1: ( ( '-' )? )
            // InternalKiCool.g:4469:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalKiCool.g:4470:2: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==17) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalKiCool.g:4470:3: '-'
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
    // InternalKiCool.g:4478:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4482:1: ( rule__Floateger__Group__1__Impl )
            // InternalKiCool.g:4483:2: rule__Floateger__Group__1__Impl
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
    // InternalKiCool.g:4489:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4493:1: ( ( RULE_FLOAT ) )
            // InternalKiCool.g:4494:1: ( RULE_FLOAT )
            {
            // InternalKiCool.g:4494:1: ( RULE_FLOAT )
            // InternalKiCool.g:4495:2: RULE_FLOAT
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
    // InternalKiCool.g:4505:1: rule__System__PublicAssignment_0 : ( ( 'public' ) ) ;
    public final void rule__System__PublicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4509:1: ( ( ( 'public' ) ) )
            // InternalKiCool.g:4510:2: ( ( 'public' ) )
            {
            // InternalKiCool.g:4510:2: ( ( 'public' ) )
            // InternalKiCool.g:4511:3: ( 'public' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getPublicPublicKeyword_0_0()); 
            }
            // InternalKiCool.g:4512:3: ( 'public' )
            // InternalKiCool.g:4513:4: 'public'
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
    // InternalKiCool.g:4524:1: rule__System__DeveloperAssignment_1 : ( ( 'developer' ) ) ;
    public final void rule__System__DeveloperAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4528:1: ( ( ( 'developer' ) ) )
            // InternalKiCool.g:4529:2: ( ( 'developer' ) )
            {
            // InternalKiCool.g:4529:2: ( ( 'developer' ) )
            // InternalKiCool.g:4530:3: ( 'developer' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getDeveloperDeveloperKeyword_1_0()); 
            }
            // InternalKiCool.g:4531:3: ( 'developer' )
            // InternalKiCool.g:4532:4: 'developer'
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
    // InternalKiCool.g:4543:1: rule__System__IdAssignment_3 : ( ruleQualifiedID ) ;
    public final void rule__System__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4547:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:4548:2: ( ruleQualifiedID )
            {
            // InternalKiCool.g:4548:2: ( ruleQualifiedID )
            // InternalKiCool.g:4549:3: ruleQualifiedID
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
    // InternalKiCool.g:4558:1: rule__System__VersionAssignment_5 : ( RULE_INT ) ;
    public final void rule__System__VersionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4562:1: ( ( RULE_INT ) )
            // InternalKiCool.g:4563:2: ( RULE_INT )
            {
            // InternalKiCool.g:4563:2: ( RULE_INT )
            // InternalKiCool.g:4564:3: RULE_INT
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
    // InternalKiCool.g:4573:1: rule__System__LabelAssignment_7 : ( ruleEString ) ;
    public final void rule__System__LabelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4577:1: ( ( ruleEString ) )
            // InternalKiCool.g:4578:2: ( ruleEString )
            {
            // InternalKiCool.g:4578:2: ( ruleEString )
            // InternalKiCool.g:4579:3: ruleEString
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
    // InternalKiCool.g:4588:1: rule__System__InputClassAssignment_8_1 : ( RULE_ID ) ;
    public final void rule__System__InputClassAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4592:1: ( ( RULE_ID ) )
            // InternalKiCool.g:4593:2: ( RULE_ID )
            {
            // InternalKiCool.g:4593:2: ( RULE_ID )
            // InternalKiCool.g:4594:3: RULE_ID
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
    // InternalKiCool.g:4603:1: rule__System__StartsetsAssignment_9_1 : ( ruleKVPair ) ;
    public final void rule__System__StartsetsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4607:1: ( ( ruleKVPair ) )
            // InternalKiCool.g:4608:2: ( ruleKVPair )
            {
            // InternalKiCool.g:4608:2: ( ruleKVPair )
            // InternalKiCool.g:4609:3: ruleKVPair
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
    // InternalKiCool.g:4618:1: rule__System__IntermediatesAssignment_10 : ( ruleIntermediateReference ) ;
    public final void rule__System__IntermediatesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4622:1: ( ( ruleIntermediateReference ) )
            // InternalKiCool.g:4623:2: ( ruleIntermediateReference )
            {
            // InternalKiCool.g:4623:2: ( ruleIntermediateReference )
            // InternalKiCool.g:4624:3: ruleIntermediateReference
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
    // InternalKiCool.g:4633:1: rule__System__ProcessorsAssignment_11 : ( ruleProcessorGroup ) ;
    public final void rule__System__ProcessorsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4637:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:4638:2: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:4638:2: ( ruleProcessorGroup )
            // InternalKiCool.g:4639:3: ruleProcessorGroup
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
    // InternalKiCool.g:4648:1: rule__IntermediateReference__IdAssignment_1 : ( ruleQualifiedID ) ;
    public final void rule__IntermediateReference__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4652:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:4653:2: ( ruleQualifiedID )
            {
            // InternalKiCool.g:4653:2: ( ruleQualifiedID )
            // InternalKiCool.g:4654:3: ruleQualifiedID
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
    // InternalKiCool.g:4663:1: rule__IntermediateReference__AliasAssignment_2_1 : ( ruleEString ) ;
    public final void rule__IntermediateReference__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4667:1: ( ( ruleEString ) )
            // InternalKiCool.g:4668:2: ( ruleEString )
            {
            // InternalKiCool.g:4668:2: ( ruleEString )
            // InternalKiCool.g:4669:3: ruleEString
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
    // InternalKiCool.g:4678:1: rule__ProcessorGroup__LabelAssignment_0_1 : ( ruleEString ) ;
    public final void rule__ProcessorGroup__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4682:1: ( ( ruleEString ) )
            // InternalKiCool.g:4683:2: ( ruleEString )
            {
            // InternalKiCool.g:4683:2: ( ruleEString )
            // InternalKiCool.g:4684:3: ruleEString
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
    // InternalKiCool.g:4693:1: rule__ProcessorGroup__ProcessorsAssignment_1_0 : ( ruleProcessor ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4697:1: ( ( ruleProcessor ) )
            // InternalKiCool.g:4698:2: ( ruleProcessor )
            {
            // InternalKiCool.g:4698:2: ( ruleProcessor )
            // InternalKiCool.g:4699:3: ruleProcessor
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
    // InternalKiCool.g:4708:1: rule__ProcessorGroup__ProcessorsAssignment_1_1_1 : ( ruleProcessorSystem ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4712:1: ( ( ruleProcessorSystem ) )
            // InternalKiCool.g:4713:2: ( ruleProcessorSystem )
            {
            // InternalKiCool.g:4713:2: ( ruleProcessorSystem )
            // InternalKiCool.g:4714:3: ruleProcessorSystem
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
    // InternalKiCool.g:4723:1: rule__ProcessorGroup__ProcessorsAssignment_1_2_1 : ( ruleProcessorAlternativeGroup ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4727:1: ( ( ruleProcessorAlternativeGroup ) )
            // InternalKiCool.g:4728:2: ( ruleProcessorAlternativeGroup )
            {
            // InternalKiCool.g:4728:2: ( ruleProcessorAlternativeGroup )
            // InternalKiCool.g:4729:3: ruleProcessorAlternativeGroup
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
    // InternalKiCool.g:4738:1: rule__ProcessorGroup__ProcessorsAssignment_1_3_1 : ( ruleProcessorGroup ) ;
    public final void rule__ProcessorGroup__ProcessorsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4742:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:4743:2: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:4743:2: ( ruleProcessorGroup )
            // InternalKiCool.g:4744:3: ruleProcessorGroup
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
    // InternalKiCool.g:4753:1: rule__Processor__PresetsAssignment_0_2 : ( ruleKVPair ) ;
    public final void rule__Processor__PresetsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4757:1: ( ( ruleKVPair ) )
            // InternalKiCool.g:4758:2: ( ruleKVPair )
            {
            // InternalKiCool.g:4758:2: ( ruleKVPair )
            // InternalKiCool.g:4759:3: ruleKVPair
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
    // InternalKiCool.g:4768:1: rule__Processor__PreprocessesAssignment_1_2 : ( ruleCoProcessor ) ;
    public final void rule__Processor__PreprocessesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4772:1: ( ( ruleCoProcessor ) )
            // InternalKiCool.g:4773:2: ( ruleCoProcessor )
            {
            // InternalKiCool.g:4773:2: ( ruleCoProcessor )
            // InternalKiCool.g:4774:3: ruleCoProcessor
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
    // InternalKiCool.g:4783:1: rule__Processor__IdAssignment_2 : ( ruleQualifiedID ) ;
    public final void rule__Processor__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4787:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:4788:2: ( ruleQualifiedID )
            {
            // InternalKiCool.g:4788:2: ( ruleQualifiedID )
            // InternalKiCool.g:4789:3: ruleQualifiedID
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
    // InternalKiCool.g:4798:1: rule__Processor__MetricAssignment_3_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Processor__MetricAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4802:1: ( ( ( ruleQualifiedID ) ) )
            // InternalKiCool.g:4803:2: ( ( ruleQualifiedID ) )
            {
            // InternalKiCool.g:4803:2: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:4804:3: ( ruleQualifiedID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getMetricIntermediateReferenceCrossReference_3_1_0()); 
            }
            // InternalKiCool.g:4805:3: ( ruleQualifiedID )
            // InternalKiCool.g:4806:4: ruleQualifiedID
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
    // InternalKiCool.g:4817:1: rule__Processor__PostprocessesAssignment_4_2 : ( ruleCoProcessor ) ;
    public final void rule__Processor__PostprocessesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4821:1: ( ( ruleCoProcessor ) )
            // InternalKiCool.g:4822:2: ( ruleCoProcessor )
            {
            // InternalKiCool.g:4822:2: ( ruleCoProcessor )
            // InternalKiCool.g:4823:3: ruleCoProcessor
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
    // InternalKiCool.g:4832:1: rule__Processor__PostsetsAssignment_5_2 : ( ruleKVPair ) ;
    public final void rule__Processor__PostsetsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4836:1: ( ( ruleKVPair ) )
            // InternalKiCool.g:4837:2: ( ruleKVPair )
            {
            // InternalKiCool.g:4837:2: ( ruleKVPair )
            // InternalKiCool.g:4838:3: ruleKVPair
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
    // InternalKiCool.g:4847:1: rule__CoProcessor__IdAssignment_0 : ( ruleQualifiedID ) ;
    public final void rule__CoProcessor__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4851:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:4852:2: ( ruleQualifiedID )
            {
            // InternalKiCool.g:4852:2: ( ruleQualifiedID )
            // InternalKiCool.g:4853:3: ruleQualifiedID
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
    // InternalKiCool.g:4862:1: rule__CoProcessor__SilentAssignment_1 : ( ( 'silent' ) ) ;
    public final void rule__CoProcessor__SilentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4866:1: ( ( ( 'silent' ) ) )
            // InternalKiCool.g:4867:2: ( ( 'silent' ) )
            {
            // InternalKiCool.g:4867:2: ( ( 'silent' ) )
            // InternalKiCool.g:4868:3: ( 'silent' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCoProcessorAccess().getSilentSilentKeyword_1_0()); 
            }
            // InternalKiCool.g:4869:3: ( 'silent' )
            // InternalKiCool.g:4870:4: 'silent'
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
    // InternalKiCool.g:4881:1: rule__ProcessorSystem__IdAssignment : ( ruleQualifiedID ) ;
    public final void rule__ProcessorSystem__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4885:1: ( ( ruleQualifiedID ) )
            // InternalKiCool.g:4886:2: ( ruleQualifiedID )
            {
            // InternalKiCool.g:4886:2: ( ruleQualifiedID )
            // InternalKiCool.g:4887:3: ruleQualifiedID
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
    // InternalKiCool.g:4896:1: rule__ProcessorAlternativeGroup__LabelAssignment_0_1 : ( ruleEString ) ;
    public final void rule__ProcessorAlternativeGroup__LabelAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4900:1: ( ( ruleEString ) )
            // InternalKiCool.g:4901:2: ( ruleEString )
            {
            // InternalKiCool.g:4901:2: ( ruleEString )
            // InternalKiCool.g:4902:3: ruleEString
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
    // InternalKiCool.g:4911:1: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0 : ( ruleProcessorGroup ) ;
    public final void rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4915:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:4916:2: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:4916:2: ( ruleProcessorGroup )
            // InternalKiCool.g:4917:3: ruleProcessorGroup
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
    // InternalKiCool.g:4926:1: rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1 : ( ruleProcessorGroup ) ;
    public final void rule__ProcessorAlternativeGroup__ProcessorsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4930:1: ( ( ruleProcessorGroup ) )
            // InternalKiCool.g:4931:2: ( ruleProcessorGroup )
            {
            // InternalKiCool.g:4931:2: ( ruleProcessorGroup )
            // InternalKiCool.g:4932:3: ruleProcessorGroup
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
    // InternalKiCool.g:4941:1: rule__KVPair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KVPair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4945:1: ( ( ruleEString ) )
            // InternalKiCool.g:4946:2: ( ruleEString )
            {
            // InternalKiCool.g:4946:2: ( ruleEString )
            // InternalKiCool.g:4947:3: ruleEString
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
    // InternalKiCool.g:4956:1: rule__KVPair__IsKeyValueAssignment_1 : ( ( 'key' ) ) ;
    public final void rule__KVPair__IsKeyValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4960:1: ( ( ( 'key' ) ) )
            // InternalKiCool.g:4961:2: ( ( 'key' ) )
            {
            // InternalKiCool.g:4961:2: ( ( 'key' ) )
            // InternalKiCool.g:4962:3: ( 'key' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKVPairAccess().getIsKeyValueKeyKeyword_1_0()); 
            }
            // InternalKiCool.g:4963:3: ( 'key' )
            // InternalKiCool.g:4964:4: 'key'
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
    // InternalKiCool.g:4975:1: rule__KVPair__ValueAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KVPair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4979:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:4980:2: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:4980:2: ( ruleEStringAllTypes )
            // InternalKiCool.g:4981:3: ruleEStringAllTypes
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
    // InternalKiCool.g:4990:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:4994:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalKiCool.g:4995:2: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalKiCool.g:4995:2: ( RULE_COMMENT_ANNOTATION )
            // InternalKiCool.g:4996:3: RULE_COMMENT_ANNOTATION
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
    // InternalKiCool.g:5005:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5009:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5010:2: ( ruleExtendedID )
            {
            // InternalKiCool.g:5010:2: ( ruleExtendedID )
            // InternalKiCool.g:5011:3: ruleExtendedID
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
    // InternalKiCool.g:5020:1: rule__PragmaTag__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__PragmaTag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5024:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5025:2: ( ruleExtendedID )
            {
            // InternalKiCool.g:5025:2: ( ruleExtendedID )
            // InternalKiCool.g:5026:3: ruleExtendedID
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
    // InternalKiCool.g:5035:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5039:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5040:2: ( ruleExtendedID )
            {
            // InternalKiCool.g:5040:2: ( ruleExtendedID )
            // InternalKiCool.g:5041:3: ruleExtendedID
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
    // InternalKiCool.g:5050:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5054:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5055:2: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5055:2: ( ruleEStringAllTypes )
            // InternalKiCool.g:5056:3: ruleEStringAllTypes
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
    // InternalKiCool.g:5065:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5069:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5070:2: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5070:2: ( ruleEStringAllTypes )
            // InternalKiCool.g:5071:3: ruleEStringAllTypes
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
    // InternalKiCool.g:5080:1: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5084:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5085:2: ( ruleExtendedID )
            {
            // InternalKiCool.g:5085:2: ( ruleExtendedID )
            // InternalKiCool.g:5086:3: ruleExtendedID
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
    // InternalKiCool.g:5095:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5099:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5100:2: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5100:2: ( ruleEStringBoolean )
            // InternalKiCool.g:5101:3: ruleEStringBoolean
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
    // InternalKiCool.g:5110:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5114:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5115:2: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5115:2: ( ruleEStringBoolean )
            // InternalKiCool.g:5116:3: ruleEStringBoolean
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
    // InternalKiCool.g:5125:1: rule__StringPragma__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__StringPragma__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5129:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5130:2: ( ruleExtendedID )
            {
            // InternalKiCool.g:5130:2: ( ruleExtendedID )
            // InternalKiCool.g:5131:3: ruleExtendedID
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
    // InternalKiCool.g:5140:1: rule__StringPragma__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5144:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5145:2: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5145:2: ( ruleEStringAllTypes )
            // InternalKiCool.g:5146:3: ruleEStringAllTypes
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
    // InternalKiCool.g:5155:1: rule__StringPragma__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5159:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5160:2: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5160:2: ( ruleEStringAllTypes )
            // InternalKiCool.g:5161:3: ruleEStringAllTypes
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
    // InternalKiCool.g:5170:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5174:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5175:2: ( ruleExtendedID )
            {
            // InternalKiCool.g:5175:2: ( ruleExtendedID )
            // InternalKiCool.g:5176:3: ruleExtendedID
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
    // InternalKiCool.g:5185:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5189:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5190:2: ( ruleExtendedID )
            {
            // InternalKiCool.g:5190:2: ( ruleExtendedID )
            // InternalKiCool.g:5191:3: ruleExtendedID
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
    // InternalKiCool.g:5200:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5204:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5205:2: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5205:2: ( ruleEStringAllTypes )
            // InternalKiCool.g:5206:3: ruleEStringAllTypes
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
    // InternalKiCool.g:5215:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5219:1: ( ( ruleEStringAllTypes ) )
            // InternalKiCool.g:5220:2: ( ruleEStringAllTypes )
            {
            // InternalKiCool.g:5220:2: ( ruleEStringAllTypes )
            // InternalKiCool.g:5221:3: ruleEStringAllTypes
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
    // InternalKiCool.g:5230:1: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5234:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5235:2: ( ruleExtendedID )
            {
            // InternalKiCool.g:5235:2: ( ruleExtendedID )
            // InternalKiCool.g:5236:3: ruleExtendedID
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
    // InternalKiCool.g:5245:1: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5249:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5250:2: ( ruleExtendedID )
            {
            // InternalKiCool.g:5250:2: ( ruleExtendedID )
            // InternalKiCool.g:5251:3: ruleExtendedID
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
    // InternalKiCool.g:5260:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5264:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5265:2: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5265:2: ( ruleEStringBoolean )
            // InternalKiCool.g:5266:3: ruleEStringBoolean
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
    // InternalKiCool.g:5275:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5279:1: ( ( ruleEStringBoolean ) )
            // InternalKiCool.g:5280:2: ( ruleEStringBoolean )
            {
            // InternalKiCool.g:5280:2: ( ruleEStringBoolean )
            // InternalKiCool.g:5281:3: ruleEStringBoolean
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
    // InternalKiCool.g:5290:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5294:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5295:2: ( ruleExtendedID )
            {
            // InternalKiCool.g:5295:2: ( ruleExtendedID )
            // InternalKiCool.g:5296:3: ruleExtendedID
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
    // InternalKiCool.g:5305:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5309:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:5310:2: ( RULE_STRING )
            {
            // InternalKiCool.g:5310:2: ( RULE_STRING )
            // InternalKiCool.g:5311:3: RULE_STRING
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
    // InternalKiCool.g:5320:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5324:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:5325:2: ( RULE_STRING )
            {
            // InternalKiCool.g:5325:2: ( RULE_STRING )
            // InternalKiCool.g:5326:3: RULE_STRING
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
    // InternalKiCool.g:5335:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5339:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5340:2: ( ruleExtendedID )
            {
            // InternalKiCool.g:5340:2: ( ruleExtendedID )
            // InternalKiCool.g:5341:3: ruleExtendedID
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
    // InternalKiCool.g:5350:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5354:1: ( ( ruleExtendedID ) )
            // InternalKiCool.g:5355:2: ( ruleExtendedID )
            {
            // InternalKiCool.g:5355:2: ( ruleExtendedID )
            // InternalKiCool.g:5356:3: ruleExtendedID
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
    // InternalKiCool.g:5365:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5369:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:5370:2: ( RULE_STRING )
            {
            // InternalKiCool.g:5370:2: ( RULE_STRING )
            // InternalKiCool.g:5371:3: RULE_STRING
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
    // InternalKiCool.g:5380:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKiCool.g:5384:1: ( ( RULE_STRING ) )
            // InternalKiCool.g:5385:2: ( RULE_STRING )
            {
            // InternalKiCool.g:5385:2: ( RULE_STRING )
            // InternalKiCool.g:5386:3: RULE_STRING
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
        // InternalKiCool.g:695:2: ( ( ( rule__ProcessorGroup__Group_1_2__0 ) ) )
        // InternalKiCool.g:695:2: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
        {
        // InternalKiCool.g:695:2: ( ( rule__ProcessorGroup__Group_1_2__0 ) )
        // InternalKiCool.g:696:3: ( rule__ProcessorGroup__Group_1_2__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getProcessorGroupAccess().getGroup_1_2()); 
        }
        // InternalKiCool.g:697:3: ( rule__ProcessorGroup__Group_1_2__0 )
        // InternalKiCool.g:697:4: rule__ProcessorGroup__Group_1_2__0
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
        // InternalKiCool.g:2330:3: ( rule__ProcessorAlternativeGroup__Group_0__0 )
        // InternalKiCool.g:2330:3: rule__ProcessorAlternativeGroup__Group_0__0
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