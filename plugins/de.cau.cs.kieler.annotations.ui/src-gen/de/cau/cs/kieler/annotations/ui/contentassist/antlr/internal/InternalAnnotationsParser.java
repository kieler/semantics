package de.cau.cs.kieler.annotations.ui.contentassist.antlr.internal; 

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
import de.cau.cs.kieler.annotations.services.AnnotationsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotationsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'@'", "'#'", "','", "'['", "']'", "'-'"
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


    // $ANTLR start "entryRulePragmaTag"
    // InternalAnnotations.g:152:1: entryRulePragmaTag : rulePragmaTag EOF ;
    public final void entryRulePragmaTag() throws RecognitionException {
        try {
            // InternalAnnotations.g:153:1: ( rulePragmaTag EOF )
            // InternalAnnotations.g:154:1: rulePragmaTag EOF
            {
             before(grammarAccess.getPragmaTagRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePragmaTag();

            state._fsp--;

             after(grammarAccess.getPragmaTagRule()); 
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
    // $ANTLR end "entryRulePragmaTag"


    // $ANTLR start "rulePragmaTag"
    // InternalAnnotations.g:161:1: rulePragmaTag : ( ( rule__PragmaTag__Group__0 ) ) ;
    public final void rulePragmaTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:165:2: ( ( ( rule__PragmaTag__Group__0 ) ) )
            // InternalAnnotations.g:166:1: ( ( rule__PragmaTag__Group__0 ) )
            {
            // InternalAnnotations.g:166:1: ( ( rule__PragmaTag__Group__0 ) )
            // InternalAnnotations.g:167:1: ( rule__PragmaTag__Group__0 )
            {
             before(grammarAccess.getPragmaTagAccess().getGroup()); 
            // InternalAnnotations.g:168:1: ( rule__PragmaTag__Group__0 )
            // InternalAnnotations.g:168:2: rule__PragmaTag__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPragmaTagAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleStringPragma"
    // InternalAnnotations.g:236:1: entryRuleStringPragma : ruleStringPragma EOF ;
    public final void entryRuleStringPragma() throws RecognitionException {
        try {
            // InternalAnnotations.g:237:1: ( ruleStringPragma EOF )
            // InternalAnnotations.g:238:1: ruleStringPragma EOF
            {
             before(grammarAccess.getStringPragmaRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleStringPragma();

            state._fsp--;

             after(grammarAccess.getStringPragmaRule()); 
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
    // $ANTLR end "entryRuleStringPragma"


    // $ANTLR start "ruleStringPragma"
    // InternalAnnotations.g:245:1: ruleStringPragma : ( ( rule__StringPragma__Group__0 ) ) ;
    public final void ruleStringPragma() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:249:2: ( ( ( rule__StringPragma__Group__0 ) ) )
            // InternalAnnotations.g:250:1: ( ( rule__StringPragma__Group__0 ) )
            {
            // InternalAnnotations.g:250:1: ( ( rule__StringPragma__Group__0 ) )
            // InternalAnnotations.g:251:1: ( rule__StringPragma__Group__0 )
            {
             before(grammarAccess.getStringPragmaAccess().getGroup()); 
            // InternalAnnotations.g:252:1: ( rule__StringPragma__Group__0 )
            // InternalAnnotations.g:252:2: rule__StringPragma__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringPragmaAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "rule__ExtendedID__Alternatives_1"
    // InternalAnnotations.g:627:1: rule__ExtendedID__Alternatives_1 : ( ( '.' ) | ( ( rule__ExtendedID__Group_1_1__0 ) ) );
    public final void rule__ExtendedID__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:631:1: ( ( '.' ) | ( ( rule__ExtendedID__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAnnotations.g:632:1: ( '.' )
                    {
                    // InternalAnnotations.g:632:1: ( '.' )
                    // InternalAnnotations.g:633:1: '.'
                    {
                     before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
                    match(input,15,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnnotations.g:640:6: ( ( rule__ExtendedID__Group_1_1__0 ) )
                    {
                    // InternalAnnotations.g:640:6: ( ( rule__ExtendedID__Group_1_1__0 ) )
                    // InternalAnnotations.g:641:1: ( rule__ExtendedID__Group_1_1__0 )
                    {
                     before(grammarAccess.getExtendedIDAccess().getGroup_1_1()); 
                    // InternalAnnotations.g:642:1: ( rule__ExtendedID__Group_1_1__0 )
                    // InternalAnnotations.g:642:2: rule__ExtendedID__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ExtendedID__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtendedIDAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__ExtendedID__Alternatives_1"


    // $ANTLR start "rule__TagAnnotation__Group__0"
    // InternalAnnotations.g:653:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:657:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalAnnotations.g:658:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
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
    // InternalAnnotations.g:665:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:669:1: ( ( '@' ) )
            // InternalAnnotations.g:670:1: ( '@' )
            {
            // InternalAnnotations.g:670:1: ( '@' )
            // InternalAnnotations.g:671:1: '@'
            {
             before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:684:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:688:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalAnnotations.g:689:2: rule__TagAnnotation__Group__1__Impl
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
    // InternalAnnotations.g:695:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:699:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:700:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:700:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:701:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:702:1: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:702:2: rule__TagAnnotation__NameAssignment_1
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


    // $ANTLR start "rule__PragmaTag__Group__0"
    // InternalAnnotations.g:716:1: rule__PragmaTag__Group__0 : rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 ;
    public final void rule__PragmaTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:720:1: ( rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 )
            // InternalAnnotations.g:721:2: rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__PragmaTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTag__Group__1();

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
    // $ANTLR end "rule__PragmaTag__Group__0"


    // $ANTLR start "rule__PragmaTag__Group__0__Impl"
    // InternalAnnotations.g:728:1: rule__PragmaTag__Group__0__Impl : ( '#' ) ;
    public final void rule__PragmaTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:732:1: ( ( '#' ) )
            // InternalAnnotations.g:733:1: ( '#' )
            {
            // InternalAnnotations.g:733:1: ( '#' )
            // InternalAnnotations.g:734:1: '#'
            {
             before(grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:747:1: rule__PragmaTag__Group__1 : rule__PragmaTag__Group__1__Impl ;
    public final void rule__PragmaTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:751:1: ( rule__PragmaTag__Group__1__Impl )
            // InternalAnnotations.g:752:2: rule__PragmaTag__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTag__Group__1__Impl();

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
    // $ANTLR end "rule__PragmaTag__Group__1"


    // $ANTLR start "rule__PragmaTag__Group__1__Impl"
    // InternalAnnotations.g:758:1: rule__PragmaTag__Group__1__Impl : ( ( rule__PragmaTag__NameAssignment_1 ) ) ;
    public final void rule__PragmaTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:762:1: ( ( ( rule__PragmaTag__NameAssignment_1 ) ) )
            // InternalAnnotations.g:763:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:763:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            // InternalAnnotations.g:764:1: ( rule__PragmaTag__NameAssignment_1 )
            {
             before(grammarAccess.getPragmaTagAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:765:1: ( rule__PragmaTag__NameAssignment_1 )
            // InternalAnnotations.g:765:2: rule__PragmaTag__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PragmaTag__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPragmaTagAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:779:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:783:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:784:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
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
    // InternalAnnotations.g:791:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:795:1: ( ( '@' ) )
            // InternalAnnotations.g:796:1: ( '@' )
            {
            // InternalAnnotations.g:796:1: ( '@' )
            // InternalAnnotations.g:797:1: '@'
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:810:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:814:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:815:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
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
    // InternalAnnotations.g:822:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:826:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:827:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:827:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:828:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:829:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:829:2: rule__KeyStringValueAnnotation__NameAssignment_1
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
    // InternalAnnotations.g:839:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:843:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:844:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
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
    // InternalAnnotations.g:851:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:855:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalAnnotations.g:856:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalAnnotations.g:856:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalAnnotations.g:857:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // InternalAnnotations.g:858:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalAnnotations.g:858:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalAnnotations.g:868:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:872:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalAnnotations.g:873:2: rule__KeyStringValueAnnotation__Group__3__Impl
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
    // InternalAnnotations.g:879:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:883:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalAnnotations.g:884:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalAnnotations.g:884:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalAnnotations.g:885:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            // InternalAnnotations.g:886:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAnnotations.g:886:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__KeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalAnnotations.g:904:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:908:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalAnnotations.g:909:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
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
    // InternalAnnotations.g:916:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:920:1: ( ( ',' ) )
            // InternalAnnotations.g:921:1: ( ',' )
            {
            // InternalAnnotations.g:921:1: ( ',' )
            // InternalAnnotations.g:922:1: ','
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:935:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:939:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalAnnotations.g:940:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalAnnotations.g:946:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:950:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalAnnotations.g:951:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalAnnotations.g:951:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalAnnotations.g:952:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // InternalAnnotations.g:953:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalAnnotations.g:953:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalAnnotations.g:967:1: rule__RestrictedKeyStringValueAnnotation__Group__0 : rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:971:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:972:2: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1
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
    // InternalAnnotations.g:979:1: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:983:1: ( ( '@' ) )
            // InternalAnnotations.g:984:1: ( '@' )
            {
            // InternalAnnotations.g:984:1: ( '@' )
            // InternalAnnotations.g:985:1: '@'
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:998:1: rule__RestrictedKeyStringValueAnnotation__Group__1 : rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1002:1: ( rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:1003:2: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2
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
    // InternalAnnotations.g:1010:1: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1014:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:1015:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:1015:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:1016:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:1017:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:1017:2: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalAnnotations.g:1027:1: rule__RestrictedKeyStringValueAnnotation__Group__2 : rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1031:1: ( rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:1032:2: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3
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
    // InternalAnnotations.g:1039:1: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1043:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalAnnotations.g:1044:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalAnnotations.g:1044:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalAnnotations.g:1045:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // InternalAnnotations.g:1046:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalAnnotations.g:1046:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalAnnotations.g:1056:1: rule__RestrictedKeyStringValueAnnotation__Group__3 : rule__RestrictedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1060:1: ( rule__RestrictedKeyStringValueAnnotation__Group__3__Impl )
            // InternalAnnotations.g:1061:2: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalAnnotations.g:1067:1: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1071:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalAnnotations.g:1072:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalAnnotations.g:1072:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalAnnotations.g:1073:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 
            // InternalAnnotations.g:1074:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAnnotations.g:1074:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__RestrictedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalAnnotations.g:1092:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0 : rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1096:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 )
            // InternalAnnotations.g:1097:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1
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
    // InternalAnnotations.g:1104:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1108:1: ( ( ',' ) )
            // InternalAnnotations.g:1109:1: ( ',' )
            {
            // InternalAnnotations.g:1109:1: ( ',' )
            // InternalAnnotations.g:1110:1: ','
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1123:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1 : rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1127:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalAnnotations.g:1128:2: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalAnnotations.g:1134:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1138:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalAnnotations.g:1139:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalAnnotations.g:1139:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalAnnotations.g:1140:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // InternalAnnotations.g:1141:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalAnnotations.g:1141:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1
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


    // $ANTLR start "rule__StringPragma__Group__0"
    // InternalAnnotations.g:1155:1: rule__StringPragma__Group__0 : rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 ;
    public final void rule__StringPragma__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1159:1: ( rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 )
            // InternalAnnotations.g:1160:2: rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__StringPragma__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group__1();

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
    // $ANTLR end "rule__StringPragma__Group__0"


    // $ANTLR start "rule__StringPragma__Group__0__Impl"
    // InternalAnnotations.g:1167:1: rule__StringPragma__Group__0__Impl : ( '#' ) ;
    public final void rule__StringPragma__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1171:1: ( ( '#' ) )
            // InternalAnnotations.g:1172:1: ( '#' )
            {
            // InternalAnnotations.g:1172:1: ( '#' )
            // InternalAnnotations.g:1173:1: '#'
            {
             before(grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:1186:1: rule__StringPragma__Group__1 : rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 ;
    public final void rule__StringPragma__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1190:1: ( rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 )
            // InternalAnnotations.g:1191:2: rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__StringPragma__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group__2();

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
    // $ANTLR end "rule__StringPragma__Group__1"


    // $ANTLR start "rule__StringPragma__Group__1__Impl"
    // InternalAnnotations.g:1198:1: rule__StringPragma__Group__1__Impl : ( ( rule__StringPragma__NameAssignment_1 ) ) ;
    public final void rule__StringPragma__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1202:1: ( ( ( rule__StringPragma__NameAssignment_1 ) ) )
            // InternalAnnotations.g:1203:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:1203:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            // InternalAnnotations.g:1204:1: ( rule__StringPragma__NameAssignment_1 )
            {
             before(grammarAccess.getStringPragmaAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:1205:1: ( rule__StringPragma__NameAssignment_1 )
            // InternalAnnotations.g:1205:2: rule__StringPragma__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringPragmaAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:1215:1: rule__StringPragma__Group__2 : rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 ;
    public final void rule__StringPragma__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1219:1: ( rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 )
            // InternalAnnotations.g:1220:2: rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__StringPragma__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group__3();

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
    // $ANTLR end "rule__StringPragma__Group__2"


    // $ANTLR start "rule__StringPragma__Group__2__Impl"
    // InternalAnnotations.g:1227:1: rule__StringPragma__Group__2__Impl : ( ( rule__StringPragma__ValuesAssignment_2 ) ) ;
    public final void rule__StringPragma__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1231:1: ( ( ( rule__StringPragma__ValuesAssignment_2 ) ) )
            // InternalAnnotations.g:1232:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            {
            // InternalAnnotations.g:1232:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            // InternalAnnotations.g:1233:1: ( rule__StringPragma__ValuesAssignment_2 )
            {
             before(grammarAccess.getStringPragmaAccess().getValuesAssignment_2()); 
            // InternalAnnotations.g:1234:1: ( rule__StringPragma__ValuesAssignment_2 )
            // InternalAnnotations.g:1234:2: rule__StringPragma__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringPragmaAccess().getValuesAssignment_2()); 

            }


            }

        }
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
    // InternalAnnotations.g:1244:1: rule__StringPragma__Group__3 : rule__StringPragma__Group__3__Impl ;
    public final void rule__StringPragma__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1248:1: ( rule__StringPragma__Group__3__Impl )
            // InternalAnnotations.g:1249:2: rule__StringPragma__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group__3__Impl();

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
    // $ANTLR end "rule__StringPragma__Group__3"


    // $ANTLR start "rule__StringPragma__Group__3__Impl"
    // InternalAnnotations.g:1255:1: rule__StringPragma__Group__3__Impl : ( ( rule__StringPragma__Group_3__0 )* ) ;
    public final void rule__StringPragma__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1259:1: ( ( ( rule__StringPragma__Group_3__0 )* ) )
            // InternalAnnotations.g:1260:1: ( ( rule__StringPragma__Group_3__0 )* )
            {
            // InternalAnnotations.g:1260:1: ( ( rule__StringPragma__Group_3__0 )* )
            // InternalAnnotations.g:1261:1: ( rule__StringPragma__Group_3__0 )*
            {
             before(grammarAccess.getStringPragmaAccess().getGroup_3()); 
            // InternalAnnotations.g:1262:1: ( rule__StringPragma__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAnnotations.g:1262:2: rule__StringPragma__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__StringPragma__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStringPragmaAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalAnnotations.g:1280:1: rule__StringPragma__Group_3__0 : rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 ;
    public final void rule__StringPragma__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1284:1: ( rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 )
            // InternalAnnotations.g:1285:2: rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__StringPragma__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group_3__1();

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
    // $ANTLR end "rule__StringPragma__Group_3__0"


    // $ANTLR start "rule__StringPragma__Group_3__0__Impl"
    // InternalAnnotations.g:1292:1: rule__StringPragma__Group_3__0__Impl : ( ',' ) ;
    public final void rule__StringPragma__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1296:1: ( ( ',' ) )
            // InternalAnnotations.g:1297:1: ( ',' )
            {
            // InternalAnnotations.g:1297:1: ( ',' )
            // InternalAnnotations.g:1298:1: ','
            {
             before(grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:1311:1: rule__StringPragma__Group_3__1 : rule__StringPragma__Group_3__1__Impl ;
    public final void rule__StringPragma__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1315:1: ( rule__StringPragma__Group_3__1__Impl )
            // InternalAnnotations.g:1316:2: rule__StringPragma__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__Group_3__1__Impl();

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
    // $ANTLR end "rule__StringPragma__Group_3__1"


    // $ANTLR start "rule__StringPragma__Group_3__1__Impl"
    // InternalAnnotations.g:1322:1: rule__StringPragma__Group_3__1__Impl : ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) ;
    public final void rule__StringPragma__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1326:1: ( ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) )
            // InternalAnnotations.g:1327:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            {
            // InternalAnnotations.g:1327:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            // InternalAnnotations.g:1328:1: ( rule__StringPragma__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getStringPragmaAccess().getValuesAssignment_3_1()); 
            // InternalAnnotations.g:1329:1: ( rule__StringPragma__ValuesAssignment_3_1 )
            // InternalAnnotations.g:1329:2: rule__StringPragma__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringPragma__ValuesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStringPragmaAccess().getValuesAssignment_3_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:1343:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1347:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:1348:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
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
    // InternalAnnotations.g:1355:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1359:1: ( ( '@' ) )
            // InternalAnnotations.g:1360:1: ( '@' )
            {
            // InternalAnnotations.g:1360:1: ( '@' )
            // InternalAnnotations.g:1361:1: '@'
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1374:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1378:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:1379:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
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
    // InternalAnnotations.g:1386:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1390:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:1391:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:1391:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:1392:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:1393:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:1393:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalAnnotations.g:1403:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1407:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:1408:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
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
    // InternalAnnotations.g:1415:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1419:1: ( ( '[' ) )
            // InternalAnnotations.g:1420:1: ( '[' )
            {
            // InternalAnnotations.g:1420:1: ( '[' )
            // InternalAnnotations.g:1421:1: '['
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1434:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1438:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalAnnotations.g:1439:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
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
    // InternalAnnotations.g:1446:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1450:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalAnnotations.g:1451:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalAnnotations.g:1451:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalAnnotations.g:1452:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // InternalAnnotations.g:1453:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalAnnotations.g:1453:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalAnnotations.g:1463:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1467:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalAnnotations.g:1468:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
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
    // InternalAnnotations.g:1475:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1479:1: ( ( ']' ) )
            // InternalAnnotations.g:1480:1: ( ']' )
            {
            // InternalAnnotations.g:1480:1: ( ']' )
            // InternalAnnotations.g:1481:1: ']'
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,20,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1494:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1498:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalAnnotations.g:1499:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
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
    // InternalAnnotations.g:1506:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1510:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalAnnotations.g:1511:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalAnnotations.g:1511:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalAnnotations.g:1512:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // InternalAnnotations.g:1513:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalAnnotations.g:1513:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalAnnotations.g:1523:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1527:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalAnnotations.g:1528:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalAnnotations.g:1534:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1538:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalAnnotations.g:1539:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalAnnotations.g:1539:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalAnnotations.g:1540:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // InternalAnnotations.g:1541:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAnnotations.g:1541:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalAnnotations.g:1565:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1569:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalAnnotations.g:1570:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
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
    // InternalAnnotations.g:1577:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1581:1: ( ( ',' ) )
            // InternalAnnotations.g:1582:1: ( ',' )
            {
            // InternalAnnotations.g:1582:1: ( ',' )
            // InternalAnnotations.g:1583:1: ','
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1596:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1600:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalAnnotations.g:1601:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalAnnotations.g:1607:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1611:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalAnnotations.g:1612:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalAnnotations.g:1612:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalAnnotations.g:1613:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // InternalAnnotations.g:1614:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalAnnotations.g:1614:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalAnnotations.g:1628:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1632:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:1633:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1
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
    // InternalAnnotations.g:1640:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1644:1: ( ( '@' ) )
            // InternalAnnotations.g:1645:1: ( '@' )
            {
            // InternalAnnotations.g:1645:1: ( '@' )
            // InternalAnnotations.g:1646:1: '@'
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1659:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1663:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:1664:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2
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
    // InternalAnnotations.g:1671:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1675:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:1676:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:1676:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:1677:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:1678:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:1678:2: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalAnnotations.g:1688:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2 : rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1692:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:1693:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3
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
    // InternalAnnotations.g:1700:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1704:1: ( ( '[' ) )
            // InternalAnnotations.g:1705:1: ( '[' )
            {
            // InternalAnnotations.g:1705:1: ( '[' )
            // InternalAnnotations.g:1706:1: '['
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1719:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3 : rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1723:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 )
            // InternalAnnotations.g:1724:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4
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
    // InternalAnnotations.g:1731:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1735:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalAnnotations.g:1736:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalAnnotations.g:1736:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalAnnotations.g:1737:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // InternalAnnotations.g:1738:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalAnnotations.g:1738:2: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalAnnotations.g:1748:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4 : rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1752:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 )
            // InternalAnnotations.g:1753:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5
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
    // InternalAnnotations.g:1760:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1764:1: ( ( ']' ) )
            // InternalAnnotations.g:1765:1: ( ']' )
            {
            // InternalAnnotations.g:1765:1: ( ']' )
            // InternalAnnotations.g:1766:1: ']'
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,20,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1779:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5 : rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1783:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 )
            // InternalAnnotations.g:1784:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6
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
    // InternalAnnotations.g:1791:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1795:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalAnnotations.g:1796:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalAnnotations.g:1796:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalAnnotations.g:1797:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // InternalAnnotations.g:1798:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalAnnotations.g:1798:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalAnnotations.g:1808:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6 : rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1812:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalAnnotations.g:1813:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalAnnotations.g:1819:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1823:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalAnnotations.g:1824:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalAnnotations.g:1824:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalAnnotations.g:1825:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // InternalAnnotations.g:1826:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAnnotations.g:1826:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalAnnotations.g:1850:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1854:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalAnnotations.g:1855:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1
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
    // InternalAnnotations.g:1862:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1866:1: ( ( ',' ) )
            // InternalAnnotations.g:1867:1: ( ',' )
            {
            // InternalAnnotations.g:1867:1: ( ',' )
            // InternalAnnotations.g:1868:1: ','
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1881:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1885:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalAnnotations.g:1886:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalAnnotations.g:1892:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1896:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalAnnotations.g:1897:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalAnnotations.g:1897:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalAnnotations.g:1898:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // InternalAnnotations.g:1899:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalAnnotations.g:1899:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalAnnotations.g:1913:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1917:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:1918:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
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
    // InternalAnnotations.g:1925:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1929:1: ( ( '@' ) )
            // InternalAnnotations.g:1930:1: ( '@' )
            {
            // InternalAnnotations.g:1930:1: ( '@' )
            // InternalAnnotations.g:1931:1: '@'
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1944:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1948:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:1949:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
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
    // InternalAnnotations.g:1956:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1960:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:1961:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:1961:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:1962:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:1963:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:1963:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalAnnotations.g:1973:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1977:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:1978:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
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
    // InternalAnnotations.g:1985:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:1989:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalAnnotations.g:1990:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalAnnotations.g:1990:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalAnnotations.g:1991:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // InternalAnnotations.g:1992:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalAnnotations.g:1992:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalAnnotations.g:2002:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2006:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalAnnotations.g:2007:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalAnnotations.g:2013:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2017:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalAnnotations.g:2018:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalAnnotations.g:2018:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalAnnotations.g:2019:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            // InternalAnnotations.g:2020:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAnnotations.g:2020:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalAnnotations.g:2038:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2042:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalAnnotations.g:2043:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
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
    // InternalAnnotations.g:2050:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2054:1: ( ( ',' ) )
            // InternalAnnotations.g:2055:1: ( ',' )
            {
            // InternalAnnotations.g:2055:1: ( ',' )
            // InternalAnnotations.g:2056:1: ','
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:2069:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2073:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalAnnotations.g:2074:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalAnnotations.g:2080:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2084:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalAnnotations.g:2085:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalAnnotations.g:2085:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalAnnotations.g:2086:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // InternalAnnotations.g:2087:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalAnnotations.g:2087:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalAnnotations.g:2101:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2105:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:2106:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
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
    // InternalAnnotations.g:2113:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2117:1: ( ( '@' ) )
            // InternalAnnotations.g:2118:1: ( '@' )
            {
            // InternalAnnotations.g:2118:1: ( '@' )
            // InternalAnnotations.g:2119:1: '@'
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:2132:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2136:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:2137:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
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
    // InternalAnnotations.g:2144:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2148:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:2149:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:2149:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:2150:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:2151:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:2151:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalAnnotations.g:2161:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2165:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:2166:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
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
    // InternalAnnotations.g:2173:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2177:1: ( ( '[' ) )
            // InternalAnnotations.g:2178:1: ( '[' )
            {
            // InternalAnnotations.g:2178:1: ( '[' )
            // InternalAnnotations.g:2179:1: '['
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:2192:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2196:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalAnnotations.g:2197:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
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
    // InternalAnnotations.g:2204:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2208:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalAnnotations.g:2209:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalAnnotations.g:2209:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalAnnotations.g:2210:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // InternalAnnotations.g:2211:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalAnnotations.g:2211:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalAnnotations.g:2221:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2225:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalAnnotations.g:2226:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
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
    // InternalAnnotations.g:2233:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2237:1: ( ( ']' ) )
            // InternalAnnotations.g:2238:1: ( ']' )
            {
            // InternalAnnotations.g:2238:1: ( ']' )
            // InternalAnnotations.g:2239:1: ']'
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,20,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:2252:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2256:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalAnnotations.g:2257:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
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
    // InternalAnnotations.g:2264:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2268:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalAnnotations.g:2269:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalAnnotations.g:2269:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalAnnotations.g:2270:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // InternalAnnotations.g:2271:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalAnnotations.g:2271:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalAnnotations.g:2281:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2285:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalAnnotations.g:2286:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalAnnotations.g:2292:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2296:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalAnnotations.g:2297:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalAnnotations.g:2297:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalAnnotations.g:2298:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // InternalAnnotations.g:2299:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAnnotations.g:2299:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalAnnotations.g:2323:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2327:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalAnnotations.g:2328:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
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
    // InternalAnnotations.g:2335:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2339:1: ( ( ',' ) )
            // InternalAnnotations.g:2340:1: ( ',' )
            {
            // InternalAnnotations.g:2340:1: ( ',' )
            // InternalAnnotations.g:2341:1: ','
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:2354:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2358:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalAnnotations.g:2359:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalAnnotations.g:2365:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2369:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalAnnotations.g:2370:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalAnnotations.g:2370:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalAnnotations.g:2371:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // InternalAnnotations.g:2372:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalAnnotations.g:2372:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalAnnotations.g:2386:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2390:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalAnnotations.g:2391:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
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
    // InternalAnnotations.g:2398:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2402:1: ( ( RULE_ID ) )
            // InternalAnnotations.g:2403:1: ( RULE_ID )
            {
            // InternalAnnotations.g:2403:1: ( RULE_ID )
            // InternalAnnotations.g:2404:1: RULE_ID
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
    // InternalAnnotations.g:2415:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2419:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalAnnotations.g:2420:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
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
    // InternalAnnotations.g:2427:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Alternatives_1 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2431:1: ( ( ( rule__ExtendedID__Alternatives_1 )* ) )
            // InternalAnnotations.g:2432:1: ( ( rule__ExtendedID__Alternatives_1 )* )
            {
            // InternalAnnotations.g:2432:1: ( ( rule__ExtendedID__Alternatives_1 )* )
            // InternalAnnotations.g:2433:1: ( rule__ExtendedID__Alternatives_1 )*
            {
             before(grammarAccess.getExtendedIDAccess().getAlternatives_1()); 
            // InternalAnnotations.g:2434:1: ( rule__ExtendedID__Alternatives_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_ID) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAnnotations.g:2434:2: rule__ExtendedID__Alternatives_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__ExtendedID__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getExtendedIDAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalAnnotations.g:2444:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2448:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalAnnotations.g:2449:2: rule__ExtendedID__Group__2__Impl
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
    // InternalAnnotations.g:2455:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2459:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalAnnotations.g:2460:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalAnnotations.g:2460:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalAnnotations.g:2461:1: ( rule__ExtendedID__Group_2__0 )?
            {
             before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            // InternalAnnotations.g:2462:1: ( rule__ExtendedID__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAnnotations.g:2462:2: rule__ExtendedID__Group_2__0
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


    // $ANTLR start "rule__ExtendedID__Group_1_1__0"
    // InternalAnnotations.g:2478:1: rule__ExtendedID__Group_1_1__0 : rule__ExtendedID__Group_1_1__0__Impl rule__ExtendedID__Group_1_1__1 ;
    public final void rule__ExtendedID__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2482:1: ( rule__ExtendedID__Group_1_1__0__Impl rule__ExtendedID__Group_1_1__1 )
            // InternalAnnotations.g:2483:2: rule__ExtendedID__Group_1_1__0__Impl rule__ExtendedID__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ExtendedID__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group_1_1__1();

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
    // $ANTLR end "rule__ExtendedID__Group_1_1__0"


    // $ANTLR start "rule__ExtendedID__Group_1_1__0__Impl"
    // InternalAnnotations.g:2490:1: rule__ExtendedID__Group_1_1__0__Impl : ( '-' ) ;
    public final void rule__ExtendedID__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2494:1: ( ( '-' ) )
            // InternalAnnotations.g:2495:1: ( '-' )
            {
            // InternalAnnotations.g:2495:1: ( '-' )
            // InternalAnnotations.g:2496:1: '-'
            {
             before(grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_1_0()); 
            match(input,21,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExtendedID__Group_1_1__1"
    // InternalAnnotations.g:2509:1: rule__ExtendedID__Group_1_1__1 : rule__ExtendedID__Group_1_1__1__Impl ;
    public final void rule__ExtendedID__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2513:1: ( rule__ExtendedID__Group_1_1__1__Impl )
            // InternalAnnotations.g:2514:2: rule__ExtendedID__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__ExtendedID__Group_1_1__1"


    // $ANTLR start "rule__ExtendedID__Group_1_1__1__Impl"
    // InternalAnnotations.g:2520:1: rule__ExtendedID__Group_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2524:1: ( ( RULE_ID ) )
            // InternalAnnotations.g:2525:1: ( RULE_ID )
            {
            // InternalAnnotations.g:2525:1: ( RULE_ID )
            // InternalAnnotations.g:2526:1: RULE_ID
            {
             before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExtendedID__Group_2__0"
    // InternalAnnotations.g:2541:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2545:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalAnnotations.g:2546:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
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
    // InternalAnnotations.g:2553:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2557:1: ( ( '#' ) )
            // InternalAnnotations.g:2558:1: ( '#' )
            {
            // InternalAnnotations.g:2558:1: ( '#' )
            // InternalAnnotations.g:2559:1: '#'
            {
             before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:2572:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2576:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalAnnotations.g:2577:2: rule__ExtendedID__Group_2__1__Impl
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
    // InternalAnnotations.g:2583:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2587:1: ( ( RULE_INT ) )
            // InternalAnnotations.g:2588:1: ( RULE_INT )
            {
            // InternalAnnotations.g:2588:1: ( RULE_INT )
            // InternalAnnotations.g:2589:1: RULE_INT
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
    // InternalAnnotations.g:2606:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2610:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalAnnotations.g:2611:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
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
    // InternalAnnotations.g:2618:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2622:1: ( ( ( '-' )? ) )
            // InternalAnnotations.g:2623:1: ( ( '-' )? )
            {
            // InternalAnnotations.g:2623:1: ( ( '-' )? )
            // InternalAnnotations.g:2624:1: ( '-' )?
            {
             before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            // InternalAnnotations.g:2625:1: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAnnotations.g:2626:2: '-'
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
    // InternalAnnotations.g:2637:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2641:1: ( rule__Integer__Group__1__Impl )
            // InternalAnnotations.g:2642:2: rule__Integer__Group__1__Impl
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
    // InternalAnnotations.g:2648:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2652:1: ( ( RULE_INT ) )
            // InternalAnnotations.g:2653:1: ( RULE_INT )
            {
            // InternalAnnotations.g:2653:1: ( RULE_INT )
            // InternalAnnotations.g:2654:1: RULE_INT
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
    // InternalAnnotations.g:2669:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2673:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalAnnotations.g:2674:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
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
    // InternalAnnotations.g:2681:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2685:1: ( ( ( '-' )? ) )
            // InternalAnnotations.g:2686:1: ( ( '-' )? )
            {
            // InternalAnnotations.g:2686:1: ( ( '-' )? )
            // InternalAnnotations.g:2687:1: ( '-' )?
            {
             before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            // InternalAnnotations.g:2688:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAnnotations.g:2689:2: '-'
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
    // InternalAnnotations.g:2700:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2704:1: ( rule__Floateger__Group__1__Impl )
            // InternalAnnotations.g:2705:2: rule__Floateger__Group__1__Impl
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
    // InternalAnnotations.g:2711:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2715:1: ( ( RULE_FLOAT ) )
            // InternalAnnotations.g:2716:1: ( RULE_FLOAT )
            {
            // InternalAnnotations.g:2716:1: ( RULE_FLOAT )
            // InternalAnnotations.g:2717:1: RULE_FLOAT
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
    // InternalAnnotations.g:2733:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2737:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalAnnotations.g:2738:1: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalAnnotations.g:2738:1: ( RULE_COMMENT_ANNOTATION )
            // InternalAnnotations.g:2739:1: RULE_COMMENT_ANNOTATION
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
    // InternalAnnotations.g:2748:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2752:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2753:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2753:1: ( ruleExtendedID )
            // InternalAnnotations.g:2754:1: ruleExtendedID
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


    // $ANTLR start "rule__PragmaTag__NameAssignment_1"
    // InternalAnnotations.g:2763:1: rule__PragmaTag__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__PragmaTag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2767:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2768:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2768:1: ( ruleExtendedID )
            // InternalAnnotations.g:2769:1: ruleExtendedID
            {
             before(grammarAccess.getPragmaTagAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getPragmaTagAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2778:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2782:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2783:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2783:1: ( ruleExtendedID )
            // InternalAnnotations.g:2784:1: ruleExtendedID
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
    // InternalAnnotations.g:2793:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2797:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2798:1: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2798:1: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2799:1: ruleEStringAllTypes
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
    // InternalAnnotations.g:2808:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2812:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2813:1: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2813:1: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2814:1: ruleEStringAllTypes
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
    // InternalAnnotations.g:2823:1: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2827:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2828:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2828:1: ( ruleExtendedID )
            // InternalAnnotations.g:2829:1: ruleExtendedID
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
    // InternalAnnotations.g:2838:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2842:1: ( ( ruleEStringBoolean ) )
            // InternalAnnotations.g:2843:1: ( ruleEStringBoolean )
            {
            // InternalAnnotations.g:2843:1: ( ruleEStringBoolean )
            // InternalAnnotations.g:2844:1: ruleEStringBoolean
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
    // InternalAnnotations.g:2853:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2857:1: ( ( ruleEStringBoolean ) )
            // InternalAnnotations.g:2858:1: ( ruleEStringBoolean )
            {
            // InternalAnnotations.g:2858:1: ( ruleEStringBoolean )
            // InternalAnnotations.g:2859:1: ruleEStringBoolean
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


    // $ANTLR start "rule__StringPragma__NameAssignment_1"
    // InternalAnnotations.g:2868:1: rule__StringPragma__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__StringPragma__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2872:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2873:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2873:1: ( ruleExtendedID )
            // InternalAnnotations.g:2874:1: ruleExtendedID
            {
             before(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2883:1: rule__StringPragma__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2887:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2888:1: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2888:1: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2889:1: ruleEStringAllTypes
            {
             before(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;

             after(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2898:1: rule__StringPragma__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2902:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2903:1: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2903:1: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2904:1: ruleEStringAllTypes
            {
             before(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEStringAllTypes();

            state._fsp--;

             after(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2913:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2917:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2918:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2918:1: ( ruleExtendedID )
            // InternalAnnotations.g:2919:1: ruleExtendedID
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
    // InternalAnnotations.g:2928:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2932:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2933:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2933:1: ( ruleExtendedID )
            // InternalAnnotations.g:2934:1: ruleExtendedID
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
    // InternalAnnotations.g:2943:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2947:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2948:1: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2948:1: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2949:1: ruleEStringAllTypes
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
    // InternalAnnotations.g:2958:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2962:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2963:1: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2963:1: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2964:1: ruleEStringAllTypes
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
    // InternalAnnotations.g:2973:1: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2977:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2978:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2978:1: ( ruleExtendedID )
            // InternalAnnotations.g:2979:1: ruleExtendedID
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
    // InternalAnnotations.g:2988:1: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:2992:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2993:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2993:1: ( ruleExtendedID )
            // InternalAnnotations.g:2994:1: ruleExtendedID
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
    // InternalAnnotations.g:3003:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3007:1: ( ( ruleEStringBoolean ) )
            // InternalAnnotations.g:3008:1: ( ruleEStringBoolean )
            {
            // InternalAnnotations.g:3008:1: ( ruleEStringBoolean )
            // InternalAnnotations.g:3009:1: ruleEStringBoolean
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
    // InternalAnnotations.g:3018:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3022:1: ( ( ruleEStringBoolean ) )
            // InternalAnnotations.g:3023:1: ( ruleEStringBoolean )
            {
            // InternalAnnotations.g:3023:1: ( ruleEStringBoolean )
            // InternalAnnotations.g:3024:1: ruleEStringBoolean
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
    // InternalAnnotations.g:3033:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3037:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:3038:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:3038:1: ( ruleExtendedID )
            // InternalAnnotations.g:3039:1: ruleExtendedID
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
    // InternalAnnotations.g:3048:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3052:1: ( ( RULE_STRING ) )
            // InternalAnnotations.g:3053:1: ( RULE_STRING )
            {
            // InternalAnnotations.g:3053:1: ( RULE_STRING )
            // InternalAnnotations.g:3054:1: RULE_STRING
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
    // InternalAnnotations.g:3063:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3067:1: ( ( RULE_STRING ) )
            // InternalAnnotations.g:3068:1: ( RULE_STRING )
            {
            // InternalAnnotations.g:3068:1: ( RULE_STRING )
            // InternalAnnotations.g:3069:1: RULE_STRING
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
    // InternalAnnotations.g:3078:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3082:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:3083:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:3083:1: ( ruleExtendedID )
            // InternalAnnotations.g:3084:1: ruleExtendedID
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
    // InternalAnnotations.g:3093:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3097:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:3098:1: ( ruleExtendedID )
            {
            // InternalAnnotations.g:3098:1: ( ruleExtendedID )
            // InternalAnnotations.g:3099:1: ruleExtendedID
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
    // InternalAnnotations.g:3108:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3112:1: ( ( RULE_STRING ) )
            // InternalAnnotations.g:3113:1: ( RULE_STRING )
            {
            // InternalAnnotations.g:3113:1: ( RULE_STRING )
            // InternalAnnotations.g:3114:1: RULE_STRING
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
    // InternalAnnotations.g:3123:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAnnotations.g:3127:1: ( ( RULE_STRING ) )
            // InternalAnnotations.g:3128:1: ( RULE_STRING )
            {
            // InternalAnnotations.g:3128:1: ( RULE_STRING )
            // InternalAnnotations.g:3129:1: RULE_STRING
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
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\3\uffff\2\10\5\uffff\2\10";
    static final String dfa_3s = "\1\11\1\uffff\1\6\2\4\1\6\1\7\3\uffff\2\4";
    static final String dfa_4s = "\1\20\1\uffff\1\6\2\25\1\10\1\7\3\uffff\2\25";
    static final String dfa_5s = "\1\uffff\1\1\5\uffff\1\2\1\4\1\3\2\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\6\uffff\1\2",
            "",
            "\1\3",
            "\5\7\6\uffff\1\4\1\uffff\1\6\1\uffff\1\11\1\uffff\1\5",
            "\5\7\6\uffff\1\4\1\uffff\1\6\1\uffff\1\11\1\uffff\1\5",
            "\1\12\2\7",
            "\1\13",
            "",
            "",
            "",
            "\5\7\6\uffff\1\4\1\uffff\1\6\1\uffff\1\11\1\uffff\1\5",
            "\5\7\12\uffff\1\11\1\uffff\1\7"
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
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000228000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000208002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200080L});
    }


}