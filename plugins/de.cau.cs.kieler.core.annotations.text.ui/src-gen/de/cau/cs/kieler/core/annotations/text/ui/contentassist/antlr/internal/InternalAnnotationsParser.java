package de.cau.cs.kieler.core.annotations.text.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.core.annotations.text.services.AnnotationsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotationsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'#'", "','", "'['", "']'", "'.'", "'-'"
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_NUMBER=11;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_FLOAT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAnnotationsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnnotationsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnnotationsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAnnotations.g"; }


     
     	private AnnotationsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AnnotationsGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleAnnotation"
    // InternalAnnotations.g:60:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:61:1: ( ruleAnnotation EOF )
            // InternalAnnotations.g:62:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:69:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:73:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // InternalAnnotations.g:74:1: ( ( rule__Annotation__Alternatives ) )
            {
            // InternalAnnotations.g:74:1: ( ( rule__Annotation__Alternatives ) )
            // InternalAnnotations.g:75:1: ( rule__Annotation__Alternatives )
            {
             before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            // InternalAnnotations.g:76:1: ( rule__Annotation__Alternatives )
            // InternalAnnotations.g:76:2: rule__Annotation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Annotation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalAnnotations.g:96:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:97:1: ( ruleCommentAnnotation EOF )
            // InternalAnnotations.g:98:1: ruleCommentAnnotation EOF
            {
             before(grammarAccess.getCommentAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCommentAnnotation();

            state._fsp--;

             after(grammarAccess.getCommentAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:105:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValuesAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:109:2: ( ( ( rule__CommentAnnotation__ValuesAssignment ) ) )
            // InternalAnnotations.g:110:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            {
            // InternalAnnotations.g:110:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            // InternalAnnotations.g:111:1: ( rule__CommentAnnotation__ValuesAssignment )
            {
             before(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            // InternalAnnotations.g:112:1: ( rule__CommentAnnotation__ValuesAssignment )
            // InternalAnnotations.g:112:2: rule__CommentAnnotation__ValuesAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CommentAnnotation__ValuesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 

            }


            }

        }
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
    // InternalAnnotations.g:124:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:125:1: ( ruleTagAnnotation EOF )
            // InternalAnnotations.g:126:1: ruleTagAnnotation EOF
            {
             before(grammarAccess.getTagAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTagAnnotation();

            state._fsp--;

             after(grammarAccess.getTagAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:133:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:137:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:138:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:138:1: ( ( rule__TagAnnotation__Group__0 ) )
            // InternalAnnotations.g:139:1: ( rule__TagAnnotation__Group__0 )
            {
             before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:140:1: ( rule__TagAnnotation__Group__0 )
            // InternalAnnotations.g:140:2: rule__TagAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TagAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagAnnotationAccess().getGroup()); 

            }


            }

        }
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
    // InternalAnnotations.g:152:1: entryRulePragmaTagAnnotation : rulePragmaTagAnnotation EOF ;
    public final void entryRulePragmaTagAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:153:1: ( rulePragmaTagAnnotation EOF )
            // InternalAnnotations.g:154:1: rulePragmaTagAnnotation EOF
            {
             before(grammarAccess.getPragmaTagAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePragmaTagAnnotation();

            state._fsp--;

             after(grammarAccess.getPragmaTagAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:161:1: rulePragmaTagAnnotation : ( ( rule__PragmaTagAnnotation__Group__0 ) ) ;
    public final void rulePragmaTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:165:2: ( ( ( rule__PragmaTagAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:166:1: ( ( rule__PragmaTagAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:166:1: ( ( rule__PragmaTagAnnotation__Group__0 ) )
            // InternalAnnotations.g:167:1: ( rule__PragmaTagAnnotation__Group__0 )
            {
             before(grammarAccess.getPragmaTagAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:168:1: ( rule__PragmaTagAnnotation__Group__0 )
            // InternalAnnotations.g:168:2: rule__PragmaTagAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTagAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPragmaTagAnnotationAccess().getGroup()); 

            }


            }

        }
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
    // InternalAnnotations.g:180:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:181:1: ( ruleKeyStringValueAnnotation EOF )
            // InternalAnnotations.g:182:1: ruleKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:189:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:193:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:194:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:194:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // InternalAnnotations.g:195:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:196:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // InternalAnnotations.g:196:2: rule__KeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 

            }


            }

        }
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
    // InternalAnnotations.g:208:1: entryRuleRestrictedKeyStringValueAnnotation : ruleRestrictedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:209:1: ( ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalAnnotations.g:210:1: ruleRestrictedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRestrictedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getRestrictedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:217:1: ruleRestrictedKeyStringValueAnnotation : ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:221:2: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:222:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:222:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            // InternalAnnotations.g:223:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:224:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            // InternalAnnotations.g:224:2: rule__RestrictedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup()); 

            }


            }

        }
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
    // InternalAnnotations.g:236:1: entryRulePramgaKeyStringValueAnnotation : rulePramgaKeyStringValueAnnotation EOF ;
    public final void entryRulePramgaKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:237:1: ( rulePramgaKeyStringValueAnnotation EOF )
            // InternalAnnotations.g:238:1: rulePramgaKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getPramgaKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePramgaKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getPramgaKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:245:1: rulePramgaKeyStringValueAnnotation : ( ( rule__PramgaKeyStringValueAnnotation__Group__0 ) ) ;
    public final void rulePramgaKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:249:2: ( ( ( rule__PramgaKeyStringValueAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:250:1: ( ( rule__PramgaKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:250:1: ( ( rule__PramgaKeyStringValueAnnotation__Group__0 ) )
            // InternalAnnotations.g:251:1: ( rule__PramgaKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:252:1: ( rule__PramgaKeyStringValueAnnotation__Group__0 )
            // InternalAnnotations.g:252:2: rule__PramgaKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getGroup()); 

            }


            }

        }
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
    // InternalAnnotations.g:264:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:265:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // InternalAnnotations.g:266:1: ruleTypedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:273:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:277:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:278:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:278:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // InternalAnnotations.g:279:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:280:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // InternalAnnotations.g:280:2: rule__TypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 

            }


            }

        }
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
    // InternalAnnotations.g:292:1: entryRuleRestrictedTypedKeyStringValueAnnotation : ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:293:1: ( ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalAnnotations.g:294:1: ruleRestrictedTypedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRestrictedTypedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:301:1: ruleRestrictedTypedKeyStringValueAnnotation : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:305:2: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:306:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:306:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalAnnotations.g:307:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:308:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            // InternalAnnotations.g:308:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup()); 

            }


            }

        }
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
    // InternalAnnotations.g:320:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:321:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // InternalAnnotations.g:322:1: ruleQuotedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleQuotedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:329:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:333:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:334:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:334:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // InternalAnnotations.g:335:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:336:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // InternalAnnotations.g:336:2: rule__QuotedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 

            }


            }

        }
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
    // InternalAnnotations.g:348:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:349:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalAnnotations.g:350:1: ruleQuotedTypedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:357:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:361:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:362:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:362:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalAnnotations.g:363:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:364:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // InternalAnnotations.g:364:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalAnnotations.g:378:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // InternalAnnotations.g:379:1: ( ruleEStringBoolean EOF )
            // InternalAnnotations.g:380:1: ruleEStringBoolean EOF
            {
             before(grammarAccess.getEStringBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEStringBoolean();

            state._fsp--;

             after(grammarAccess.getEStringBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:387:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:391:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // InternalAnnotations.g:392:1: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // InternalAnnotations.g:392:1: ( ( rule__EStringBoolean__Alternatives ) )
            // InternalAnnotations.g:393:1: ( rule__EStringBoolean__Alternatives )
            {
             before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            // InternalAnnotations.g:394:1: ( rule__EStringBoolean__Alternatives )
            // InternalAnnotations.g:394:2: rule__EStringBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EStringBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringBooleanAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalAnnotations.g:406:1: entryRuleEStringAllTypes : ruleEStringAllTypes EOF ;
    public final void entryRuleEStringAllTypes() throws RecognitionException {
        try {
            // InternalAnnotations.g:407:1: ( ruleEStringAllTypes EOF )
            // InternalAnnotations.g:408:1: ruleEStringAllTypes EOF
            {
             before(grammarAccess.getEStringAllTypesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEStringAllTypes();

            state._fsp--;

             after(grammarAccess.getEStringAllTypesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:415:1: ruleEStringAllTypes : ( ( rule__EStringAllTypes__Alternatives ) ) ;
    public final void ruleEStringAllTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:419:2: ( ( ( rule__EStringAllTypes__Alternatives ) ) )
            // InternalAnnotations.g:420:1: ( ( rule__EStringAllTypes__Alternatives ) )
            {
            // InternalAnnotations.g:420:1: ( ( rule__EStringAllTypes__Alternatives ) )
            // InternalAnnotations.g:421:1: ( rule__EStringAllTypes__Alternatives )
            {
             before(grammarAccess.getEStringAllTypesAccess().getAlternatives()); 
            // InternalAnnotations.g:422:1: ( rule__EStringAllTypes__Alternatives )
            // InternalAnnotations.g:422:2: rule__EStringAllTypes__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EStringAllTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAllTypesAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalAnnotations.g:434:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // InternalAnnotations.g:435:1: ( ruleExtendedID EOF )
            // InternalAnnotations.g:436:1: ruleExtendedID EOF
            {
             before(grammarAccess.getExtendedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getExtendedIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:443:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:447:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // InternalAnnotations.g:448:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // InternalAnnotations.g:448:1: ( ( rule__ExtendedID__Group__0 ) )
            // InternalAnnotations.g:449:1: ( rule__ExtendedID__Group__0 )
            {
             before(grammarAccess.getExtendedIDAccess().getGroup()); 
            // InternalAnnotations.g:450:1: ( rule__ExtendedID__Group__0 )
            // InternalAnnotations.g:450:2: rule__ExtendedID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedIDAccess().getGroup()); 

            }


            }

        }
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
    // InternalAnnotations.g:464:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalAnnotations.g:465:1: ( ruleInteger EOF )
            // InternalAnnotations.g:466:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:473:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:477:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalAnnotations.g:478:1: ( ( rule__Integer__Group__0 ) )
            {
            // InternalAnnotations.g:478:1: ( ( rule__Integer__Group__0 ) )
            // InternalAnnotations.g:479:1: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // InternalAnnotations.g:480:1: ( rule__Integer__Group__0 )
            // InternalAnnotations.g:480:2: rule__Integer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Integer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getGroup()); 

            }


            }

        }
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
    // InternalAnnotations.g:492:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // InternalAnnotations.g:493:1: ( ruleFloateger EOF )
            // InternalAnnotations.g:494:1: ruleFloateger EOF
            {
             before(grammarAccess.getFloategerRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFloateger();

            state._fsp--;

             after(grammarAccess.getFloategerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalAnnotations.g:501:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:505:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // InternalAnnotations.g:506:1: ( ( rule__Floateger__Group__0 ) )
            {
            // InternalAnnotations.g:506:1: ( ( rule__Floateger__Group__0 ) )
            // InternalAnnotations.g:507:1: ( rule__Floateger__Group__0 )
            {
             before(grammarAccess.getFloategerAccess().getGroup()); 
            // InternalAnnotations.g:508:1: ( rule__Floateger__Group__0 )
            // InternalAnnotations.g:508:2: rule__Floateger__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Floateger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloategerAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "rule__Annotation__Alternatives"
    // InternalAnnotations.g:520:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleTagAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:524:1: ( ( ruleCommentAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleTagAnnotation ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAnnotations.g:525:1: ( ruleCommentAnnotation )
                    {
                    // InternalAnnotations.g:525:1: ( ruleCommentAnnotation )
                    // InternalAnnotations.g:526:1: ruleCommentAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCommentAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnnotations.g:531:6: ( ruleKeyStringValueAnnotation )
                    {
                    // InternalAnnotations.g:531:6: ( ruleKeyStringValueAnnotation )
                    // InternalAnnotations.g:532:1: ruleKeyStringValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleKeyStringValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnnotations.g:537:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // InternalAnnotations.g:537:6: ( ruleTypedKeyStringValueAnnotation )
                    // InternalAnnotations.g:538:1: ruleTypedKeyStringValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTypedKeyStringValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAnnotations.g:543:6: ( ruleTagAnnotation )
                    {
                    // InternalAnnotations.g:543:6: ( ruleTagAnnotation )
                    // InternalAnnotations.g:544:1: ruleTagAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTagAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_3()); 

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


    // $ANTLR start "rule__EStringBoolean__Alternatives"
    // InternalAnnotations.g:559:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:563:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAnnotations.g:564:1: ( RULE_STRING )
                    {
                    // InternalAnnotations.g:564:1: ( RULE_STRING )
                    // InternalAnnotations.g:565:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnnotations.g:570:6: ( ruleExtendedID )
                    {
                    // InternalAnnotations.g:570:6: ( ruleExtendedID )
                    // InternalAnnotations.g:571:1: ruleExtendedID
                    {
                     before(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExtendedID();

                    state._fsp--;

                     after(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnnotations.g:576:6: ( RULE_BOOLEAN )
                    {
                    // InternalAnnotations.g:576:6: ( RULE_BOOLEAN )
                    // InternalAnnotations.g:577:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getEStringBooleanAccess().getBOOLEANTerminalRuleCall_2()); 
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringBooleanAccess().getBOOLEANTerminalRuleCall_2()); 

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
    // InternalAnnotations.g:587:1: rule__EStringAllTypes__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) );
    public final void rule__EStringAllTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:591:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) )
            int alt3=5;
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
            case 21:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==RULE_INT) ) {
                    alt3=4;
                }
                else if ( (LA3_4==RULE_FLOAT) ) {
                    alt3=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt3=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAnnotations.g:592:1: ( RULE_STRING )
                    {
                    // InternalAnnotations.g:592:1: ( RULE_STRING )
                    // InternalAnnotations.g:593:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnnotations.g:598:6: ( ruleExtendedID )
                    {
                    // InternalAnnotations.g:598:6: ( ruleExtendedID )
                    // InternalAnnotations.g:599:1: ruleExtendedID
                    {
                     before(grammarAccess.getEStringAllTypesAccess().getExtendedIDParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExtendedID();

                    state._fsp--;

                     after(grammarAccess.getEStringAllTypesAccess().getExtendedIDParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAnnotations.g:604:6: ( RULE_BOOLEAN )
                    {
                    // InternalAnnotations.g:604:6: ( RULE_BOOLEAN )
                    // InternalAnnotations.g:605:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAnnotations.g:610:6: ( ruleInteger )
                    {
                    // InternalAnnotations.g:610:6: ( ruleInteger )
                    // InternalAnnotations.g:611:1: ruleInteger
                    {
                     before(grammarAccess.getEStringAllTypesAccess().getIntegerParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getEStringAllTypesAccess().getIntegerParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAnnotations.g:616:6: ( ruleFloateger )
                    {
                    // InternalAnnotations.g:616:6: ( ruleFloateger )
                    // InternalAnnotations.g:617:1: ruleFloateger
                    {
                     before(grammarAccess.getEStringAllTypesAccess().getFloategerParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleFloateger();

                    state._fsp--;

                     after(grammarAccess.getEStringAllTypesAccess().getFloategerParserRuleCall_4()); 

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


    // $ANTLR start "rule__TagAnnotation__Group__0"
    // InternalAnnotations.g:629:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:633:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalAnnotations.g:634:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__TagAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TagAnnotation__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:641:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:645:1: ( ( '@' ) )
            // InternalAnnotations.g:646:1: ( '@' )
            {
            // InternalAnnotations.g:646:1: ( '@' )
            // InternalAnnotations.g:647:1: '@'
            {
             before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:660:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:664:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalAnnotations.g:665:2: rule__TagAnnotation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TagAnnotation__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:671:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:675:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:676:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:676:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:677:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:678:1: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:678:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TagAnnotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:692:1: rule__PragmaTagAnnotation__Group__0 : rule__PragmaTagAnnotation__Group__0__Impl rule__PragmaTagAnnotation__Group__1 ;
    public final void rule__PragmaTagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:696:1: ( rule__PragmaTagAnnotation__Group__0__Impl rule__PragmaTagAnnotation__Group__1 )
            // InternalAnnotations.g:697:2: rule__PragmaTagAnnotation__Group__0__Impl rule__PragmaTagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__PragmaTagAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTagAnnotation__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:704:1: rule__PragmaTagAnnotation__Group__0__Impl : ( '#' ) ;
    public final void rule__PragmaTagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:708:1: ( ( '#' ) )
            // InternalAnnotations.g:709:1: ( '#' )
            {
            // InternalAnnotations.g:709:1: ( '#' )
            // InternalAnnotations.g:710:1: '#'
            {
             before(grammarAccess.getPragmaTagAnnotationAccess().getNumberSignKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPragmaTagAnnotationAccess().getNumberSignKeyword_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:723:1: rule__PragmaTagAnnotation__Group__1 : rule__PragmaTagAnnotation__Group__1__Impl ;
    public final void rule__PragmaTagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:727:1: ( rule__PragmaTagAnnotation__Group__1__Impl )
            // InternalAnnotations.g:728:2: rule__PragmaTagAnnotation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTagAnnotation__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:734:1: rule__PragmaTagAnnotation__Group__1__Impl : ( ( rule__PragmaTagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__PragmaTagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:738:1: ( ( ( rule__PragmaTagAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:739:1: ( ( rule__PragmaTagAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:739:1: ( ( rule__PragmaTagAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:740:1: ( rule__PragmaTagAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getPragmaTagAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:741:1: ( rule__PragmaTagAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:741:2: rule__PragmaTagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTagAnnotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPragmaTagAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:755:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:759:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:760:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__KeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:767:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:771:1: ( ( '@' ) )
            // InternalAnnotations.g:772:1: ( '@' )
            {
            // InternalAnnotations.g:772:1: ( '@' )
            // InternalAnnotations.g:773:1: '@'
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:786:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:790:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:791:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__KeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:798:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:802:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:803:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:803:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:804:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:805:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:805:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:815:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:819:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:820:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__KeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:827:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:831:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalAnnotations.g:832:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalAnnotations.g:832:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalAnnotations.g:833:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // InternalAnnotations.g:834:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalAnnotations.g:834:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 

            }


            }

        }
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
    // InternalAnnotations.g:844:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:848:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalAnnotations.g:849:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:855:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:859:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalAnnotations.g:860:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalAnnotations.g:860:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalAnnotations.g:861:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            // InternalAnnotations.g:862:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAnnotations.g:862:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__KeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalAnnotations.g:880:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:884:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalAnnotations.g:885:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__Group_3__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:892:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:896:1: ( ( ',' ) )
            // InternalAnnotations.g:897:1: ( ',' )
            {
            // InternalAnnotations.g:897:1: ( ',' )
            // InternalAnnotations.g:898:1: ','
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:911:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:915:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalAnnotations.g:916:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:922:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:926:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalAnnotations.g:927:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalAnnotations.g:927:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalAnnotations.g:928:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // InternalAnnotations.g:929:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalAnnotations.g:929:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__KeyStringValueAnnotation__ValuesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:943:1: rule__RestrictedKeyStringValueAnnotation__Group__0 : rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:947:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:948:2: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__RestrictedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:955:1: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:959:1: ( ( '@' ) )
            // InternalAnnotations.g:960:1: ( '@' )
            {
            // InternalAnnotations.g:960:1: ( '@' )
            // InternalAnnotations.g:961:1: '@'
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:974:1: rule__RestrictedKeyStringValueAnnotation__Group__1 : rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:978:1: ( rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:979:2: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__RestrictedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:986:1: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:990:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:991:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:991:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:992:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:993:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:993:2: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:1003:1: rule__RestrictedKeyStringValueAnnotation__Group__2 : rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1007:1: ( rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:1008:2: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__RestrictedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1015:1: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1019:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalAnnotations.g:1020:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalAnnotations.g:1020:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalAnnotations.g:1021:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // InternalAnnotations.g:1022:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalAnnotations.g:1022:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 

            }


            }

        }
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
    // InternalAnnotations.g:1032:1: rule__RestrictedKeyStringValueAnnotation__Group__3 : rule__RestrictedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1036:1: ( rule__RestrictedKeyStringValueAnnotation__Group__3__Impl )
            // InternalAnnotations.g:1037:2: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1043:1: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1047:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalAnnotations.g:1048:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalAnnotations.g:1048:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalAnnotations.g:1049:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 
            // InternalAnnotations.g:1050:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAnnotations.g:1050:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__RestrictedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalAnnotations.g:1068:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0 : rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1072:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 )
            // InternalAnnotations.g:1073:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group_3__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1080:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1084:1: ( ( ',' ) )
            // InternalAnnotations.g:1085:1: ( ',' )
            {
            // InternalAnnotations.g:1085:1: ( ',' )
            // InternalAnnotations.g:1086:1: ','
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:1099:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1 : rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1103:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalAnnotations.g:1104:2: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1110:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1114:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalAnnotations.g:1115:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalAnnotations.g:1115:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalAnnotations.g:1116:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // InternalAnnotations.g:1117:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalAnnotations.g:1117:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:1131:1: rule__PramgaKeyStringValueAnnotation__Group__0 : rule__PramgaKeyStringValueAnnotation__Group__0__Impl rule__PramgaKeyStringValueAnnotation__Group__1 ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1135:1: ( rule__PramgaKeyStringValueAnnotation__Group__0__Impl rule__PramgaKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:1136:2: rule__PramgaKeyStringValueAnnotation__Group__0__Impl rule__PramgaKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__PramgaKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1143:1: rule__PramgaKeyStringValueAnnotation__Group__0__Impl : ( '#' ) ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1147:1: ( ( '#' ) )
            // InternalAnnotations.g:1148:1: ( '#' )
            {
            // InternalAnnotations.g:1148:1: ( '#' )
            // InternalAnnotations.g:1149:1: '#'
            {
             before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getNumberSignKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getNumberSignKeyword_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:1162:1: rule__PramgaKeyStringValueAnnotation__Group__1 : rule__PramgaKeyStringValueAnnotation__Group__1__Impl rule__PramgaKeyStringValueAnnotation__Group__2 ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1166:1: ( rule__PramgaKeyStringValueAnnotation__Group__1__Impl rule__PramgaKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:1167:2: rule__PramgaKeyStringValueAnnotation__Group__1__Impl rule__PramgaKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__PramgaKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1174:1: rule__PramgaKeyStringValueAnnotation__Group__1__Impl : ( ( rule__PramgaKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1178:1: ( ( ( rule__PramgaKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:1179:1: ( ( rule__PramgaKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:1179:1: ( ( rule__PramgaKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:1180:1: ( rule__PramgaKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:1181:1: ( rule__PramgaKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:1181:2: rule__PramgaKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:1191:1: rule__PramgaKeyStringValueAnnotation__Group__2 : rule__PramgaKeyStringValueAnnotation__Group__2__Impl rule__PramgaKeyStringValueAnnotation__Group__3 ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1195:1: ( rule__PramgaKeyStringValueAnnotation__Group__2__Impl rule__PramgaKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:1196:2: rule__PramgaKeyStringValueAnnotation__Group__2__Impl rule__PramgaKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__PramgaKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1203:1: rule__PramgaKeyStringValueAnnotation__Group__2__Impl : ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1207:1: ( ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalAnnotations.g:1208:1: ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalAnnotations.g:1208:1: ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalAnnotations.g:1209:1: ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // InternalAnnotations.g:1210:1: ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalAnnotations.g:1210:2: rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesAssignment_2()); 

            }


            }

        }
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
    // InternalAnnotations.g:1220:1: rule__PramgaKeyStringValueAnnotation__Group__3 : rule__PramgaKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1224:1: ( rule__PramgaKeyStringValueAnnotation__Group__3__Impl )
            // InternalAnnotations.g:1225:2: rule__PramgaKeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1231:1: rule__PramgaKeyStringValueAnnotation__Group__3__Impl : ( ( rule__PramgaKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__PramgaKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1235:1: ( ( ( rule__PramgaKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalAnnotations.g:1236:1: ( ( rule__PramgaKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalAnnotations.g:1236:1: ( ( rule__PramgaKeyStringValueAnnotation__Group_3__0 )* )
            // InternalAnnotations.g:1237:1: ( rule__PramgaKeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getGroup_3()); 
            // InternalAnnotations.g:1238:1: ( rule__PramgaKeyStringValueAnnotation__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAnnotations.g:1238:2: rule__PramgaKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__PramgaKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalAnnotations.g:1256:1: rule__PramgaKeyStringValueAnnotation__Group_3__0 : rule__PramgaKeyStringValueAnnotation__Group_3__0__Impl rule__PramgaKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__PramgaKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1260:1: ( rule__PramgaKeyStringValueAnnotation__Group_3__0__Impl rule__PramgaKeyStringValueAnnotation__Group_3__1 )
            // InternalAnnotations.g:1261:2: rule__PramgaKeyStringValueAnnotation__Group_3__0__Impl rule__PramgaKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__PramgaKeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__Group_3__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1268:1: rule__PramgaKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__PramgaKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1272:1: ( ( ',' ) )
            // InternalAnnotations.g:1273:1: ( ',' )
            {
            // InternalAnnotations.g:1273:1: ( ',' )
            // InternalAnnotations.g:1274:1: ','
            {
             before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:1287:1: rule__PramgaKeyStringValueAnnotation__Group_3__1 : rule__PramgaKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__PramgaKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1291:1: ( rule__PramgaKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalAnnotations.g:1292:2: rule__PramgaKeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1298:1: rule__PramgaKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__PramgaKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1302:1: ( ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalAnnotations.g:1303:1: ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalAnnotations.g:1303:1: ( ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalAnnotations.g:1304:1: ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // InternalAnnotations.g:1305:1: ( rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalAnnotations.g:1305:2: rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:1319:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1323:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:1324:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__TypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1331:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1335:1: ( ( '@' ) )
            // InternalAnnotations.g:1336:1: ( '@' )
            {
            // InternalAnnotations.g:1336:1: ( '@' )
            // InternalAnnotations.g:1337:1: '@'
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:1350:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1354:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:1355:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1362:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1366:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:1367:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:1367:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:1368:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:1369:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:1369:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:1379:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1383:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:1384:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__TypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1391:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1395:1: ( ( '[' ) )
            // InternalAnnotations.g:1396:1: ( '[' )
            {
            // InternalAnnotations.g:1396:1: ( '[' )
            // InternalAnnotations.g:1397:1: '['
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
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
    // InternalAnnotations.g:1410:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1414:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalAnnotations.g:1415:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1422:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1426:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalAnnotations.g:1427:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalAnnotations.g:1427:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalAnnotations.g:1428:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // InternalAnnotations.g:1429:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalAnnotations.g:1429:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 

            }


            }

        }
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
    // InternalAnnotations.g:1439:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1443:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalAnnotations.g:1444:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__TypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__5();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1451:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1455:1: ( ( ']' ) )
            // InternalAnnotations.g:1456:1: ( ']' )
            {
            // InternalAnnotations.g:1456:1: ( ']' )
            // InternalAnnotations.g:1457:1: ']'
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
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
    // InternalAnnotations.g:1470:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1474:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalAnnotations.g:1475:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__6();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1482:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1486:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalAnnotations.g:1487:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalAnnotations.g:1487:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalAnnotations.g:1488:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // InternalAnnotations.g:1489:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalAnnotations.g:1489:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__ValuesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 

            }


            }

        }
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
    // InternalAnnotations.g:1499:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1503:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalAnnotations.g:1504:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1510:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1514:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalAnnotations.g:1515:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalAnnotations.g:1515:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalAnnotations.g:1516:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // InternalAnnotations.g:1517:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAnnotations.g:1517:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalAnnotations.g:1541:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1545:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalAnnotations.g:1546:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__TypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group_6__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1553:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1557:1: ( ( ',' ) )
            // InternalAnnotations.g:1558:1: ( ',' )
            {
            // InternalAnnotations.g:1558:1: ( ',' )
            // InternalAnnotations.g:1559:1: ','
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:1572:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1576:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalAnnotations.g:1577:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1583:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1587:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalAnnotations.g:1588:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalAnnotations.g:1588:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalAnnotations.g:1589:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // InternalAnnotations.g:1590:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalAnnotations.g:1590:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:1604:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1608:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:1609:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1616:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1620:1: ( ( '@' ) )
            // InternalAnnotations.g:1621:1: ( '@' )
            {
            // InternalAnnotations.g:1621:1: ( '@' )
            // InternalAnnotations.g:1622:1: '@'
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:1635:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1639:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:1640:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1647:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1651:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:1652:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:1652:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:1653:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:1654:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:1654:2: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:1664:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2 : rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1668:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:1669:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1676:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1680:1: ( ( '[' ) )
            // InternalAnnotations.g:1681:1: ( '[' )
            {
            // InternalAnnotations.g:1681:1: ( '[' )
            // InternalAnnotations.g:1682:1: '['
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
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
    // InternalAnnotations.g:1695:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3 : rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1699:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 )
            // InternalAnnotations.g:1700:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1707:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1711:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalAnnotations.g:1712:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalAnnotations.g:1712:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalAnnotations.g:1713:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // InternalAnnotations.g:1714:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalAnnotations.g:1714:2: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 

            }


            }

        }
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
    // InternalAnnotations.g:1724:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4 : rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1728:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 )
            // InternalAnnotations.g:1729:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__5();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1736:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1740:1: ( ( ']' ) )
            // InternalAnnotations.g:1741:1: ( ']' )
            {
            // InternalAnnotations.g:1741:1: ( ']' )
            // InternalAnnotations.g:1742:1: ']'
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
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
    // InternalAnnotations.g:1755:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5 : rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1759:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 )
            // InternalAnnotations.g:1760:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__6();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1767:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1771:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalAnnotations.g:1772:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalAnnotations.g:1772:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalAnnotations.g:1773:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // InternalAnnotations.g:1774:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalAnnotations.g:1774:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 

            }


            }

        }
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
    // InternalAnnotations.g:1784:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6 : rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1788:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalAnnotations.g:1789:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1795:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1799:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalAnnotations.g:1800:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalAnnotations.g:1800:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalAnnotations.g:1801:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // InternalAnnotations.g:1802:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAnnotations.g:1802:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalAnnotations.g:1826:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1830:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalAnnotations.g:1831:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1838:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1842:1: ( ( ',' ) )
            // InternalAnnotations.g:1843:1: ( ',' )
            {
            // InternalAnnotations.g:1843:1: ( ',' )
            // InternalAnnotations.g:1844:1: ','
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:1857:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1861:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalAnnotations.g:1862:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1868:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1872:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalAnnotations.g:1873:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalAnnotations.g:1873:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalAnnotations.g:1874:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // InternalAnnotations.g:1875:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalAnnotations.g:1875:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:1889:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1893:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:1894:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__QuotedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1901:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1905:1: ( ( '@' ) )
            // InternalAnnotations.g:1906:1: ( '@' )
            {
            // InternalAnnotations.g:1906:1: ( '@' )
            // InternalAnnotations.g:1907:1: '@'
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:1920:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1924:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:1925:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__QuotedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1932:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1936:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:1937:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:1937:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:1938:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:1939:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:1939:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:1949:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1953:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:1954:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__QuotedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1961:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1965:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalAnnotations.g:1966:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalAnnotations.g:1966:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalAnnotations.g:1967:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // InternalAnnotations.g:1968:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalAnnotations.g:1968:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 

            }


            }

        }
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
    // InternalAnnotations.g:1978:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1982:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalAnnotations.g:1983:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:1989:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1993:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalAnnotations.g:1994:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalAnnotations.g:1994:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalAnnotations.g:1995:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            // InternalAnnotations.g:1996:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAnnotations.g:1996:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalAnnotations.g:2014:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2018:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalAnnotations.g:2019:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__Group_3__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2026:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2030:1: ( ( ',' ) )
            // InternalAnnotations.g:2031:1: ( ',' )
            {
            // InternalAnnotations.g:2031:1: ( ',' )
            // InternalAnnotations.g:2032:1: ','
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2045:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2049:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalAnnotations.g:2050:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2056:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2060:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalAnnotations.g:2061:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalAnnotations.g:2061:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalAnnotations.g:2062:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // InternalAnnotations.g:2063:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalAnnotations.g:2063:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:2077:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2081:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:2082:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2089:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2093:1: ( ( '@' ) )
            // InternalAnnotations.g:2094:1: ( '@' )
            {
            // InternalAnnotations.g:2094:1: ( '@' )
            // InternalAnnotations.g:2095:1: '@'
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2108:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2112:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:2113:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2120:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2124:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:2125:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:2125:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:2126:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:2127:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:2127:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:2137:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2141:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:2142:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2149:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2153:1: ( ( '[' ) )
            // InternalAnnotations.g:2154:1: ( '[' )
            {
            // InternalAnnotations.g:2154:1: ( '[' )
            // InternalAnnotations.g:2155:1: '['
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
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
    // InternalAnnotations.g:2168:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2172:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalAnnotations.g:2173:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2180:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2184:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalAnnotations.g:2185:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalAnnotations.g:2185:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalAnnotations.g:2186:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // InternalAnnotations.g:2187:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalAnnotations.g:2187:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 

            }


            }

        }
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
    // InternalAnnotations.g:2197:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2201:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalAnnotations.g:2202:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__5();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2209:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2213:1: ( ( ']' ) )
            // InternalAnnotations.g:2214:1: ( ']' )
            {
            // InternalAnnotations.g:2214:1: ( ']' )
            // InternalAnnotations.g:2215:1: ']'
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
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
    // InternalAnnotations.g:2228:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2232:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalAnnotations.g:2233:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__6();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2240:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2244:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalAnnotations.g:2245:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalAnnotations.g:2245:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalAnnotations.g:2246:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // InternalAnnotations.g:2247:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalAnnotations.g:2247:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 

            }


            }

        }
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
    // InternalAnnotations.g:2257:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2261:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalAnnotations.g:2262:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2268:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2272:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalAnnotations.g:2273:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalAnnotations.g:2273:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalAnnotations.g:2274:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // InternalAnnotations.g:2275:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAnnotations.g:2275:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalAnnotations.g:2299:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2303:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalAnnotations.g:2304:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group_6__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2311:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2315:1: ( ( ',' ) )
            // InternalAnnotations.g:2316:1: ( ',' )
            {
            // InternalAnnotations.g:2316:1: ( ',' )
            // InternalAnnotations.g:2317:1: ','
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2330:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2334:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalAnnotations.g:2335:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2341:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2345:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalAnnotations.g:2346:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalAnnotations.g:2346:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalAnnotations.g:2347:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // InternalAnnotations.g:2348:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalAnnotations.g:2348:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:2362:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2366:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalAnnotations.g:2367:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2374:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2378:1: ( ( RULE_ID ) )
            // InternalAnnotations.g:2379:1: ( RULE_ID )
            {
            // InternalAnnotations.g:2379:1: ( RULE_ID )
            // InternalAnnotations.g:2380:1: RULE_ID
            {
             before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2391:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2395:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalAnnotations.g:2396:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__ExtendedID__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2403:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2407:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // InternalAnnotations.g:2408:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // InternalAnnotations.g:2408:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // InternalAnnotations.g:2409:1: ( rule__ExtendedID__Group_1__0 )*
            {
             before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            // InternalAnnotations.g:2410:1: ( rule__ExtendedID__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAnnotations.g:2410:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getExtendedIDAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:2420:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2424:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalAnnotations.g:2425:2: rule__ExtendedID__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2431:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2435:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalAnnotations.g:2436:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalAnnotations.g:2436:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalAnnotations.g:2437:1: ( rule__ExtendedID__Group_2__0 )?
            {
             before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            // InternalAnnotations.g:2438:1: ( rule__ExtendedID__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAnnotations.g:2438:2: rule__ExtendedID__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ExtendedID__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtendedIDAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalAnnotations.g:2454:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2458:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // InternalAnnotations.g:2459:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2466:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2470:1: ( ( '.' ) )
            // InternalAnnotations.g:2471:1: ( '.' )
            {
            // InternalAnnotations.g:2471:1: ( '.' )
            // InternalAnnotations.g:2472:1: '.'
            {
             before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2485:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2489:1: ( rule__ExtendedID__Group_1__1__Impl )
            // InternalAnnotations.g:2490:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2496:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2500:1: ( ( RULE_ID ) )
            // InternalAnnotations.g:2501:1: ( RULE_ID )
            {
            // InternalAnnotations.g:2501:1: ( RULE_ID )
            // InternalAnnotations.g:2502:1: RULE_ID
            {
             before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:2517:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2521:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalAnnotations.g:2522:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__ExtendedID__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2529:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2533:1: ( ( '#' ) )
            // InternalAnnotations.g:2534:1: ( '#' )
            {
            // InternalAnnotations.g:2534:1: ( '#' )
            // InternalAnnotations.g:2535:1: '#'
            {
             before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2548:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2552:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalAnnotations.g:2553:2: rule__ExtendedID__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2559:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2563:1: ( ( RULE_INT ) )
            // InternalAnnotations.g:2564:1: ( RULE_INT )
            {
            // InternalAnnotations.g:2564:1: ( RULE_INT )
            // InternalAnnotations.g:2565:1: RULE_INT
            {
             before(grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:2582:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2586:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalAnnotations.g:2587:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Integer__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2594:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2598:1: ( ( ( '-' )? ) )
            // InternalAnnotations.g:2599:1: ( ( '-' )? )
            {
            // InternalAnnotations.g:2599:1: ( ( '-' )? )
            // InternalAnnotations.g:2600:1: ( '-' )?
            {
             before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            // InternalAnnotations.g:2601:1: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAnnotations.g:2602:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2613:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2617:1: ( rule__Integer__Group__1__Impl )
            // InternalAnnotations.g:2618:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Integer__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2624:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2628:1: ( ( RULE_INT ) )
            // InternalAnnotations.g:2629:1: ( RULE_INT )
            {
            // InternalAnnotations.g:2629:1: ( RULE_INT )
            // InternalAnnotations.g:2630:1: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:2645:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2649:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalAnnotations.g:2650:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Floateger__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Floateger__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2657:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2661:1: ( ( ( '-' )? ) )
            // InternalAnnotations.g:2662:1: ( ( '-' )? )
            {
            // InternalAnnotations.g:2662:1: ( ( '-' )? )
            // InternalAnnotations.g:2663:1: ( '-' )?
            {
             before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            // InternalAnnotations.g:2664:1: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAnnotations.g:2665:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2676:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2680:1: ( rule__Floateger__Group__1__Impl )
            // InternalAnnotations.g:2681:2: rule__Floateger__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Floateger__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAnnotations.g:2687:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2691:1: ( ( RULE_FLOAT ) )
            // InternalAnnotations.g:2692:1: ( RULE_FLOAT )
            {
            // InternalAnnotations.g:2692:1: ( RULE_FLOAT )
            // InternalAnnotations.g:2693:1: RULE_FLOAT
            {
             before(grammarAccess.getFloategerAccess().getFLOATTerminalRuleCall_1()); 
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getFloategerAccess().getFLOATTerminalRuleCall_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__CommentAnnotation__ValuesAssignment"
    // InternalAnnotations.g:2709:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2713:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalAnnotations.g:2714:1: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalAnnotations.g:2714:1: ( RULE_COMMENT_ANNOTATION )
            // InternalAnnotations.g:2715:1: RULE_COMMENT_ANNOTATION
            {
             before(grammarAccess.getCommentAnnotationAccess().getValuesCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCommentAnnotationAccess().getValuesCOMMENT_ANNOTATIONTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2724:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2728:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2729:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2729:1: ( ruleExtendedID )
            // InternalAnnotations.g:2730:1: ruleExtendedID
            {
             before(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2739:1: rule__PragmaTagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__PragmaTagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2743:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2744:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2744:1: ( ruleExtendedID )
            // InternalAnnotations.g:2745:1: ruleExtendedID
            {
             before(grammarAccess.getPragmaTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getPragmaTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2754:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2758:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2759:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2759:1: ( ruleExtendedID )
            // InternalAnnotations.g:2760:1: ruleExtendedID
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2769:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2773:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2774:1: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2774:1: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2775:1: ruleEStringAllTypes
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;

             after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2784:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2788:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2789:1: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2789:1: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2790:1: ruleEStringAllTypes
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;

             after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2799:1: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2803:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2804:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2804:1: ( ruleExtendedID )
            // InternalAnnotations.g:2805:1: ruleExtendedID
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2814:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2818:1: ( ( ruleEStringBoolean ) )
            // InternalAnnotations.g:2819:1: ( ruleEStringBoolean )
            {
            // InternalAnnotations.g:2819:1: ( ruleEStringBoolean )
            // InternalAnnotations.g:2820:1: ruleEStringBoolean
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;

             after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2829:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2833:1: ( ( ruleEStringBoolean ) )
            // InternalAnnotations.g:2834:1: ( ruleEStringBoolean )
            {
            // InternalAnnotations.g:2834:1: ( ruleEStringBoolean )
            // InternalAnnotations.g:2835:1: ruleEStringBoolean
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;

             after(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2844:1: rule__PramgaKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__PramgaKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2848:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2849:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2849:1: ( ruleExtendedID )
            // InternalAnnotations.g:2850:1: ruleExtendedID
            {
             before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2859:1: rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__PramgaKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2863:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2864:1: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2864:1: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2865:1: ruleEStringAllTypes
            {
             before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;

             after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2874:1: rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__PramgaKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2878:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2879:1: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2879:1: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2880:1: ruleEStringAllTypes
            {
             before(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;

             after(grammarAccess.getPramgaKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2889:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2893:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2894:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2894:1: ( ruleExtendedID )
            // InternalAnnotations.g:2895:1: ruleExtendedID
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2904:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2908:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2909:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2909:1: ( ruleExtendedID )
            // InternalAnnotations.g:2910:1: ruleExtendedID
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2919:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2923:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2924:1: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2924:1: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2925:1: ruleEStringAllTypes
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2934:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2938:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2939:1: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2939:1: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2940:1: ruleEStringAllTypes
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2949:1: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2953:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2954:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2954:1: ( ruleExtendedID )
            // InternalAnnotations.g:2955:1: ruleExtendedID
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2964:1: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2968:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2969:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2969:1: ( ruleExtendedID )
            // InternalAnnotations.g:2970:1: ruleExtendedID
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2979:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2983:1: ( ( ruleEStringBoolean ) )
            // InternalAnnotations.g:2984:1: ( ruleEStringBoolean )
            {
            // InternalAnnotations.g:2984:1: ( ruleEStringBoolean )
            // InternalAnnotations.g:2985:1: ruleEStringBoolean
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;

             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2994:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2998:1: ( ( ruleEStringBoolean ) )
            // InternalAnnotations.g:2999:1: ( ruleEStringBoolean )
            {
            // InternalAnnotations.g:2999:1: ( ruleEStringBoolean )
            // InternalAnnotations.g:3000:1: ruleEStringBoolean
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringBoolean();

            state._fsp--;

             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:3009:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3013:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:3014:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:3014:1: ( ruleExtendedID )
            // InternalAnnotations.g:3015:1: ruleExtendedID
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:3024:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3028:1: ( ( RULE_STRING ) )
            // InternalAnnotations.g:3029:1: ( RULE_STRING )
            {
            // InternalAnnotations.g:3029:1: ( RULE_STRING )
            // InternalAnnotations.g:3030:1: RULE_STRING
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:3039:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3043:1: ( ( RULE_STRING ) )
            // InternalAnnotations.g:3044:1: ( RULE_STRING )
            {
            // InternalAnnotations.g:3044:1: ( RULE_STRING )
            // InternalAnnotations.g:3045:1: RULE_STRING
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:3054:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3058:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:3059:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:3059:1: ( ruleExtendedID )
            // InternalAnnotations.g:3060:1: ruleExtendedID
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:3069:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3073:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:3074:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:3074:1: ( ruleExtendedID )
            // InternalAnnotations.g:3075:1: ruleExtendedID
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:3084:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3088:1: ( ( RULE_STRING ) )
            // InternalAnnotations.g:3089:1: ( RULE_STRING )
            {
            // InternalAnnotations.g:3089:1: ( RULE_STRING )
            // InternalAnnotations.g:3090:1: RULE_STRING
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:3099:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3103:1: ( ( RULE_STRING ) )
            // InternalAnnotations.g:3104:1: ( RULE_STRING )
            {
            // InternalAnnotations.g:3104:1: ( RULE_STRING )
            // InternalAnnotations.g:3105:1: RULE_STRING
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\3\uffff\1\7\5\uffff\2\7";
    static final String dfa_3s = "\1\11\1\uffff\1\6\1\4\1\6\1\7\3\uffff\2\4";
    static final String dfa_4s = "\1\17\1\uffff\1\6\1\25\1\6\1\7\3\uffff\2\25";
    static final String dfa_5s = "\1\uffff\1\1\4\uffff\1\2\1\4\1\3\2\uffff";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\5\uffff\1\2",
            "",
            "\1\3",
            "\5\6\7\uffff\1\5\1\uffff\1\10\1\uffff\1\4\1\6",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "\5\6\7\uffff\1\5\1\uffff\1\10\1\uffff\1\4\1\6",
            "\5\6\11\uffff\1\10\2\uffff\1\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "520:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleTagAnnotation ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000002001F0L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200080L});
    }


}