package de.cau.cs.kieler.annotations.ide.contentassist.antlr.internal;

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
import de.cau.cs.kieler.annotations.services.AnnotationsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotationsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT_ANNOTATION", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'-'", "'@'", "'#'", "','", "'['", "']'"
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
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=13;
    public static final int RULE_INT=7;
    public static final int T__22=22;
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
    // InternalAnnotations.g:53:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:54:1: ( ruleAnnotation EOF )
            // InternalAnnotations.g:55:1: ruleAnnotation EOF
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
    // InternalAnnotations.g:62:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:66:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // InternalAnnotations.g:67:2: ( ( rule__Annotation__Alternatives ) )
            {
            // InternalAnnotations.g:67:2: ( ( rule__Annotation__Alternatives ) )
            // InternalAnnotations.g:68:3: ( rule__Annotation__Alternatives )
            {
             before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            // InternalAnnotations.g:69:3: ( rule__Annotation__Alternatives )
            // InternalAnnotations.g:69:4: rule__Annotation__Alternatives
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
    // InternalAnnotations.g:78:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:79:1: ( ruleCommentAnnotation EOF )
            // InternalAnnotations.g:80:1: ruleCommentAnnotation EOF
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
    // InternalAnnotations.g:87:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValuesAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:91:2: ( ( ( rule__CommentAnnotation__ValuesAssignment ) ) )
            // InternalAnnotations.g:92:2: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            {
            // InternalAnnotations.g:92:2: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            // InternalAnnotations.g:93:3: ( rule__CommentAnnotation__ValuesAssignment )
            {
             before(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            // InternalAnnotations.g:94:3: ( rule__CommentAnnotation__ValuesAssignment )
            // InternalAnnotations.g:94:4: rule__CommentAnnotation__ValuesAssignment
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
    // InternalAnnotations.g:103:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:104:1: ( ruleTagAnnotation EOF )
            // InternalAnnotations.g:105:1: ruleTagAnnotation EOF
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
    // InternalAnnotations.g:112:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:116:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:117:2: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:117:2: ( ( rule__TagAnnotation__Group__0 ) )
            // InternalAnnotations.g:118:3: ( rule__TagAnnotation__Group__0 )
            {
             before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:119:3: ( rule__TagAnnotation__Group__0 )
            // InternalAnnotations.g:119:4: rule__TagAnnotation__Group__0
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
    // InternalAnnotations.g:128:1: entryRulePragmaTag : rulePragmaTag EOF ;
    public final void entryRulePragmaTag() throws RecognitionException {
        try {
            // InternalAnnotations.g:129:1: ( rulePragmaTag EOF )
            // InternalAnnotations.g:130:1: rulePragmaTag EOF
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
    // InternalAnnotations.g:137:1: rulePragmaTag : ( ( rule__PragmaTag__Group__0 ) ) ;
    public final void rulePragmaTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:141:2: ( ( ( rule__PragmaTag__Group__0 ) ) )
            // InternalAnnotations.g:142:2: ( ( rule__PragmaTag__Group__0 ) )
            {
            // InternalAnnotations.g:142:2: ( ( rule__PragmaTag__Group__0 ) )
            // InternalAnnotations.g:143:3: ( rule__PragmaTag__Group__0 )
            {
             before(grammarAccess.getPragmaTagAccess().getGroup()); 
            // InternalAnnotations.g:144:3: ( rule__PragmaTag__Group__0 )
            // InternalAnnotations.g:144:4: rule__PragmaTag__Group__0
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
    // InternalAnnotations.g:153:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:154:1: ( ruleKeyStringValueAnnotation EOF )
            // InternalAnnotations.g:155:1: ruleKeyStringValueAnnotation EOF
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
    // InternalAnnotations.g:162:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:166:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:167:2: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:167:2: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // InternalAnnotations.g:168:3: ( rule__KeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:169:3: ( rule__KeyStringValueAnnotation__Group__0 )
            // InternalAnnotations.g:169:4: rule__KeyStringValueAnnotation__Group__0
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
    // InternalAnnotations.g:178:1: entryRuleRestrictedKeyStringValueAnnotation : ruleRestrictedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:179:1: ( ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalAnnotations.g:180:1: ruleRestrictedKeyStringValueAnnotation EOF
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
    // InternalAnnotations.g:187:1: ruleRestrictedKeyStringValueAnnotation : ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:191:2: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:192:2: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:192:2: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            // InternalAnnotations.g:193:3: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:194:3: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            // InternalAnnotations.g:194:4: rule__RestrictedKeyStringValueAnnotation__Group__0
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
    // InternalAnnotations.g:203:1: entryRuleStringPragma : ruleStringPragma EOF ;
    public final void entryRuleStringPragma() throws RecognitionException {
        try {
            // InternalAnnotations.g:204:1: ( ruleStringPragma EOF )
            // InternalAnnotations.g:205:1: ruleStringPragma EOF
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
    // InternalAnnotations.g:212:1: ruleStringPragma : ( ( rule__StringPragma__Group__0 ) ) ;
    public final void ruleStringPragma() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:216:2: ( ( ( rule__StringPragma__Group__0 ) ) )
            // InternalAnnotations.g:217:2: ( ( rule__StringPragma__Group__0 ) )
            {
            // InternalAnnotations.g:217:2: ( ( rule__StringPragma__Group__0 ) )
            // InternalAnnotations.g:218:3: ( rule__StringPragma__Group__0 )
            {
             before(grammarAccess.getStringPragmaAccess().getGroup()); 
            // InternalAnnotations.g:219:3: ( rule__StringPragma__Group__0 )
            // InternalAnnotations.g:219:4: rule__StringPragma__Group__0
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
    // InternalAnnotations.g:228:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:229:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // InternalAnnotations.g:230:1: ruleTypedKeyStringValueAnnotation EOF
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
    // InternalAnnotations.g:237:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:241:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:242:2: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:242:2: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // InternalAnnotations.g:243:3: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:244:3: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // InternalAnnotations.g:244:4: rule__TypedKeyStringValueAnnotation__Group__0
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
    // InternalAnnotations.g:253:1: entryRuleRestrictedTypedKeyStringValueAnnotation : ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:254:1: ( ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalAnnotations.g:255:1: ruleRestrictedTypedKeyStringValueAnnotation EOF
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
    // InternalAnnotations.g:262:1: ruleRestrictedTypedKeyStringValueAnnotation : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:266:2: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:267:2: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:267:2: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalAnnotations.g:268:3: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:269:3: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            // InternalAnnotations.g:269:4: rule__RestrictedTypedKeyStringValueAnnotation__Group__0
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
    // InternalAnnotations.g:278:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:279:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // InternalAnnotations.g:280:1: ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalAnnotations.g:287:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:291:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:292:2: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:292:2: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // InternalAnnotations.g:293:3: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:294:3: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // InternalAnnotations.g:294:4: rule__QuotedKeyStringValueAnnotation__Group__0
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
    // InternalAnnotations.g:303:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // InternalAnnotations.g:304:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalAnnotations.g:305:1: ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalAnnotations.g:312:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:316:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // InternalAnnotations.g:317:2: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // InternalAnnotations.g:317:2: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // InternalAnnotations.g:318:3: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            // InternalAnnotations.g:319:3: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // InternalAnnotations.g:319:4: rule__QuotedTypedKeyStringValueAnnotation__Group__0
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
    // InternalAnnotations.g:328:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // InternalAnnotations.g:329:1: ( ruleEStringBoolean EOF )
            // InternalAnnotations.g:330:1: ruleEStringBoolean EOF
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
    // InternalAnnotations.g:337:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:341:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // InternalAnnotations.g:342:2: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // InternalAnnotations.g:342:2: ( ( rule__EStringBoolean__Alternatives ) )
            // InternalAnnotations.g:343:3: ( rule__EStringBoolean__Alternatives )
            {
             before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            // InternalAnnotations.g:344:3: ( rule__EStringBoolean__Alternatives )
            // InternalAnnotations.g:344:4: rule__EStringBoolean__Alternatives
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
    // InternalAnnotations.g:353:1: entryRuleEStringAllTypes : ruleEStringAllTypes EOF ;
    public final void entryRuleEStringAllTypes() throws RecognitionException {
        try {
            // InternalAnnotations.g:354:1: ( ruleEStringAllTypes EOF )
            // InternalAnnotations.g:355:1: ruleEStringAllTypes EOF
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
    // InternalAnnotations.g:362:1: ruleEStringAllTypes : ( ( rule__EStringAllTypes__Alternatives ) ) ;
    public final void ruleEStringAllTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:366:2: ( ( ( rule__EStringAllTypes__Alternatives ) ) )
            // InternalAnnotations.g:367:2: ( ( rule__EStringAllTypes__Alternatives ) )
            {
            // InternalAnnotations.g:367:2: ( ( rule__EStringAllTypes__Alternatives ) )
            // InternalAnnotations.g:368:3: ( rule__EStringAllTypes__Alternatives )
            {
             before(grammarAccess.getEStringAllTypesAccess().getAlternatives()); 
            // InternalAnnotations.g:369:3: ( rule__EStringAllTypes__Alternatives )
            // InternalAnnotations.g:369:4: rule__EStringAllTypes__Alternatives
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
    // InternalAnnotations.g:378:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // InternalAnnotations.g:379:1: ( ruleExtendedID EOF )
            // InternalAnnotations.g:380:1: ruleExtendedID EOF
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
    // InternalAnnotations.g:387:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:391:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // InternalAnnotations.g:392:2: ( ( rule__ExtendedID__Group__0 ) )
            {
            // InternalAnnotations.g:392:2: ( ( rule__ExtendedID__Group__0 ) )
            // InternalAnnotations.g:393:3: ( rule__ExtendedID__Group__0 )
            {
             before(grammarAccess.getExtendedIDAccess().getGroup()); 
            // InternalAnnotations.g:394:3: ( rule__ExtendedID__Group__0 )
            // InternalAnnotations.g:394:4: rule__ExtendedID__Group__0
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
    // InternalAnnotations.g:403:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalAnnotations.g:404:1: ( ruleInteger EOF )
            // InternalAnnotations.g:405:1: ruleInteger EOF
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
    // InternalAnnotations.g:412:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:416:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalAnnotations.g:417:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalAnnotations.g:417:2: ( ( rule__Integer__Group__0 ) )
            // InternalAnnotations.g:418:3: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // InternalAnnotations.g:419:3: ( rule__Integer__Group__0 )
            // InternalAnnotations.g:419:4: rule__Integer__Group__0
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
    // InternalAnnotations.g:428:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // InternalAnnotations.g:429:1: ( ruleFloateger EOF )
            // InternalAnnotations.g:430:1: ruleFloateger EOF
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
    // InternalAnnotations.g:437:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:441:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // InternalAnnotations.g:442:2: ( ( rule__Floateger__Group__0 ) )
            {
            // InternalAnnotations.g:442:2: ( ( rule__Floateger__Group__0 ) )
            // InternalAnnotations.g:443:3: ( rule__Floateger__Group__0 )
            {
             before(grammarAccess.getFloategerAccess().getGroup()); 
            // InternalAnnotations.g:444:3: ( rule__Floateger__Group__0 )
            // InternalAnnotations.g:444:4: rule__Floateger__Group__0
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
    // InternalAnnotations.g:452:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleTagAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:456:1: ( ( ruleCommentAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleTagAnnotation ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAnnotations.g:457:2: ( ruleCommentAnnotation )
                    {
                    // InternalAnnotations.g:457:2: ( ruleCommentAnnotation )
                    // InternalAnnotations.g:458:3: ruleCommentAnnotation
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
                    // InternalAnnotations.g:463:2: ( ruleKeyStringValueAnnotation )
                    {
                    // InternalAnnotations.g:463:2: ( ruleKeyStringValueAnnotation )
                    // InternalAnnotations.g:464:3: ruleKeyStringValueAnnotation
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
                    // InternalAnnotations.g:469:2: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // InternalAnnotations.g:469:2: ( ruleTypedKeyStringValueAnnotation )
                    // InternalAnnotations.g:470:3: ruleTypedKeyStringValueAnnotation
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
                    // InternalAnnotations.g:475:2: ( ruleTagAnnotation )
                    {
                    // InternalAnnotations.g:475:2: ( ruleTagAnnotation )
                    // InternalAnnotations.g:476:3: ruleTagAnnotation
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
    // InternalAnnotations.g:485:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:489:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
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
                    // InternalAnnotations.g:490:2: ( RULE_STRING )
                    {
                    // InternalAnnotations.g:490:2: ( RULE_STRING )
                    // InternalAnnotations.g:491:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnnotations.g:496:2: ( ruleExtendedID )
                    {
                    // InternalAnnotations.g:496:2: ( ruleExtendedID )
                    // InternalAnnotations.g:497:3: ruleExtendedID
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
                    // InternalAnnotations.g:502:2: ( RULE_BOOLEAN )
                    {
                    // InternalAnnotations.g:502:2: ( RULE_BOOLEAN )
                    // InternalAnnotations.g:503:3: RULE_BOOLEAN
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
    // InternalAnnotations.g:512:1: rule__EStringAllTypes__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) );
    public final void rule__EStringAllTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:516:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) )
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
            case 17:
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
                    // InternalAnnotations.g:517:2: ( RULE_STRING )
                    {
                    // InternalAnnotations.g:517:2: ( RULE_STRING )
                    // InternalAnnotations.g:518:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnnotations.g:523:2: ( ruleExtendedID )
                    {
                    // InternalAnnotations.g:523:2: ( ruleExtendedID )
                    // InternalAnnotations.g:524:3: ruleExtendedID
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
                    // InternalAnnotations.g:529:2: ( RULE_BOOLEAN )
                    {
                    // InternalAnnotations.g:529:2: ( RULE_BOOLEAN )
                    // InternalAnnotations.g:530:3: RULE_BOOLEAN
                    {
                     before(grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAnnotations.g:535:2: ( ruleInteger )
                    {
                    // InternalAnnotations.g:535:2: ( ruleInteger )
                    // InternalAnnotations.g:536:3: ruleInteger
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
                    // InternalAnnotations.g:541:2: ( ruleFloateger )
                    {
                    // InternalAnnotations.g:541:2: ( ruleFloateger )
                    // InternalAnnotations.g:542:3: ruleFloateger
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


    // $ANTLR start "rule__ExtendedID__Alternatives_1_0"
    // InternalAnnotations.g:551:1: rule__ExtendedID__Alternatives_1_0 : ( ( '.' ) | ( '-' ) );
    public final void rule__ExtendedID__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:555:1: ( ( '.' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAnnotations.g:556:2: ( '.' )
                    {
                    // InternalAnnotations.g:556:2: ( '.' )
                    // InternalAnnotations.g:557:3: '.'
                    {
                     before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0()); 
                    match(input,16,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAnnotations.g:562:2: ( '-' )
                    {
                    // InternalAnnotations.g:562:2: ( '-' )
                    // InternalAnnotations.g:563:3: '-'
                    {
                     before(grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1()); 
                    match(input,17,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1()); 

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


    // $ANTLR start "rule__TagAnnotation__Group__0"
    // InternalAnnotations.g:572:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:576:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // InternalAnnotations.g:577:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
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
    // InternalAnnotations.g:584:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:588:1: ( ( '@' ) )
            // InternalAnnotations.g:589:1: ( '@' )
            {
            // InternalAnnotations.g:589:1: ( '@' )
            // InternalAnnotations.g:590:2: '@'
            {
             before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:599:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:603:1: ( rule__TagAnnotation__Group__1__Impl )
            // InternalAnnotations.g:604:2: rule__TagAnnotation__Group__1__Impl
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
    // InternalAnnotations.g:610:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:614:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:615:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:615:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:616:2: ( rule__TagAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:617:2: ( rule__TagAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:617:3: rule__TagAnnotation__NameAssignment_1
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
    // InternalAnnotations.g:626:1: rule__PragmaTag__Group__0 : rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 ;
    public final void rule__PragmaTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:630:1: ( rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1 )
            // InternalAnnotations.g:631:2: rule__PragmaTag__Group__0__Impl rule__PragmaTag__Group__1
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
    // InternalAnnotations.g:638:1: rule__PragmaTag__Group__0__Impl : ( '#' ) ;
    public final void rule__PragmaTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:642:1: ( ( '#' ) )
            // InternalAnnotations.g:643:1: ( '#' )
            {
            // InternalAnnotations.g:643:1: ( '#' )
            // InternalAnnotations.g:644:2: '#'
            {
             before(grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:653:1: rule__PragmaTag__Group__1 : rule__PragmaTag__Group__1__Impl ;
    public final void rule__PragmaTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:657:1: ( rule__PragmaTag__Group__1__Impl )
            // InternalAnnotations.g:658:2: rule__PragmaTag__Group__1__Impl
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
    // InternalAnnotations.g:664:1: rule__PragmaTag__Group__1__Impl : ( ( rule__PragmaTag__NameAssignment_1 ) ) ;
    public final void rule__PragmaTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:668:1: ( ( ( rule__PragmaTag__NameAssignment_1 ) ) )
            // InternalAnnotations.g:669:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:669:1: ( ( rule__PragmaTag__NameAssignment_1 ) )
            // InternalAnnotations.g:670:2: ( rule__PragmaTag__NameAssignment_1 )
            {
             before(grammarAccess.getPragmaTagAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:671:2: ( rule__PragmaTag__NameAssignment_1 )
            // InternalAnnotations.g:671:3: rule__PragmaTag__NameAssignment_1
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
    // InternalAnnotations.g:680:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:684:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:685:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
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
    // InternalAnnotations.g:692:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:696:1: ( ( '@' ) )
            // InternalAnnotations.g:697:1: ( '@' )
            {
            // InternalAnnotations.g:697:1: ( '@' )
            // InternalAnnotations.g:698:2: '@'
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:707:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:711:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:712:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
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
    // InternalAnnotations.g:719:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:723:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:724:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:724:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:725:2: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:726:2: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:726:3: rule__KeyStringValueAnnotation__NameAssignment_1
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
    // InternalAnnotations.g:734:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:738:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:739:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
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
    // InternalAnnotations.g:746:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:750:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalAnnotations.g:751:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalAnnotations.g:751:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalAnnotations.g:752:2: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // InternalAnnotations.g:753:2: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalAnnotations.g:753:3: rule__KeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalAnnotations.g:761:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:765:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // InternalAnnotations.g:766:2: rule__KeyStringValueAnnotation__Group__3__Impl
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
    // InternalAnnotations.g:772:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:776:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalAnnotations.g:777:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalAnnotations.g:777:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // InternalAnnotations.g:778:2: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            // InternalAnnotations.g:779:2: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAnnotations.g:779:3: rule__KeyStringValueAnnotation__Group_3__0
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
    // InternalAnnotations.g:788:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:792:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // InternalAnnotations.g:793:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
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
    // InternalAnnotations.g:800:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:804:1: ( ( ',' ) )
            // InternalAnnotations.g:805:1: ( ',' )
            {
            // InternalAnnotations.g:805:1: ( ',' )
            // InternalAnnotations.g:806:2: ','
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:815:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:819:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // InternalAnnotations.g:820:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalAnnotations.g:826:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:830:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalAnnotations.g:831:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalAnnotations.g:831:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalAnnotations.g:832:2: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // InternalAnnotations.g:833:2: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalAnnotations.g:833:3: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalAnnotations.g:842:1: rule__RestrictedKeyStringValueAnnotation__Group__0 : rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:846:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:847:2: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1
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
    // InternalAnnotations.g:854:1: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:858:1: ( ( '@' ) )
            // InternalAnnotations.g:859:1: ( '@' )
            {
            // InternalAnnotations.g:859:1: ( '@' )
            // InternalAnnotations.g:860:2: '@'
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:869:1: rule__RestrictedKeyStringValueAnnotation__Group__1 : rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:873:1: ( rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:874:2: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2
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
    // InternalAnnotations.g:881:1: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:885:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:886:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:886:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:887:2: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:888:2: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:888:3: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalAnnotations.g:896:1: rule__RestrictedKeyStringValueAnnotation__Group__2 : rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:900:1: ( rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:901:2: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3
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
    // InternalAnnotations.g:908:1: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:912:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalAnnotations.g:913:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalAnnotations.g:913:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalAnnotations.g:914:2: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // InternalAnnotations.g:915:2: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalAnnotations.g:915:3: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalAnnotations.g:923:1: rule__RestrictedKeyStringValueAnnotation__Group__3 : rule__RestrictedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:927:1: ( rule__RestrictedKeyStringValueAnnotation__Group__3__Impl )
            // InternalAnnotations.g:928:2: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalAnnotations.g:934:1: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:938:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalAnnotations.g:939:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalAnnotations.g:939:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalAnnotations.g:940:2: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 
            // InternalAnnotations.g:941:2: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAnnotations.g:941:3: rule__RestrictedKeyStringValueAnnotation__Group_3__0
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
    // InternalAnnotations.g:950:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0 : rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:954:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 )
            // InternalAnnotations.g:955:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1
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
    // InternalAnnotations.g:962:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:966:1: ( ( ',' ) )
            // InternalAnnotations.g:967:1: ( ',' )
            {
            // InternalAnnotations.g:967:1: ( ',' )
            // InternalAnnotations.g:968:2: ','
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:977:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1 : rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:981:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalAnnotations.g:982:2: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalAnnotations.g:988:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:992:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalAnnotations.g:993:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalAnnotations.g:993:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalAnnotations.g:994:2: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // InternalAnnotations.g:995:2: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalAnnotations.g:995:3: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalAnnotations.g:1004:1: rule__StringPragma__Group__0 : rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 ;
    public final void rule__StringPragma__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1008:1: ( rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1 )
            // InternalAnnotations.g:1009:2: rule__StringPragma__Group__0__Impl rule__StringPragma__Group__1
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
    // InternalAnnotations.g:1016:1: rule__StringPragma__Group__0__Impl : ( '#' ) ;
    public final void rule__StringPragma__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1020:1: ( ( '#' ) )
            // InternalAnnotations.g:1021:1: ( '#' )
            {
            // InternalAnnotations.g:1021:1: ( '#' )
            // InternalAnnotations.g:1022:2: '#'
            {
             before(grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1031:1: rule__StringPragma__Group__1 : rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 ;
    public final void rule__StringPragma__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1035:1: ( rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2 )
            // InternalAnnotations.g:1036:2: rule__StringPragma__Group__1__Impl rule__StringPragma__Group__2
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
    // InternalAnnotations.g:1043:1: rule__StringPragma__Group__1__Impl : ( ( rule__StringPragma__NameAssignment_1 ) ) ;
    public final void rule__StringPragma__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1047:1: ( ( ( rule__StringPragma__NameAssignment_1 ) ) )
            // InternalAnnotations.g:1048:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:1048:1: ( ( rule__StringPragma__NameAssignment_1 ) )
            // InternalAnnotations.g:1049:2: ( rule__StringPragma__NameAssignment_1 )
            {
             before(grammarAccess.getStringPragmaAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:1050:2: ( rule__StringPragma__NameAssignment_1 )
            // InternalAnnotations.g:1050:3: rule__StringPragma__NameAssignment_1
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
    // InternalAnnotations.g:1058:1: rule__StringPragma__Group__2 : rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 ;
    public final void rule__StringPragma__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1062:1: ( rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3 )
            // InternalAnnotations.g:1063:2: rule__StringPragma__Group__2__Impl rule__StringPragma__Group__3
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
    // InternalAnnotations.g:1070:1: rule__StringPragma__Group__2__Impl : ( ( rule__StringPragma__ValuesAssignment_2 ) ) ;
    public final void rule__StringPragma__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1074:1: ( ( ( rule__StringPragma__ValuesAssignment_2 ) ) )
            // InternalAnnotations.g:1075:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            {
            // InternalAnnotations.g:1075:1: ( ( rule__StringPragma__ValuesAssignment_2 ) )
            // InternalAnnotations.g:1076:2: ( rule__StringPragma__ValuesAssignment_2 )
            {
             before(grammarAccess.getStringPragmaAccess().getValuesAssignment_2()); 
            // InternalAnnotations.g:1077:2: ( rule__StringPragma__ValuesAssignment_2 )
            // InternalAnnotations.g:1077:3: rule__StringPragma__ValuesAssignment_2
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
    // InternalAnnotations.g:1085:1: rule__StringPragma__Group__3 : rule__StringPragma__Group__3__Impl ;
    public final void rule__StringPragma__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1089:1: ( rule__StringPragma__Group__3__Impl )
            // InternalAnnotations.g:1090:2: rule__StringPragma__Group__3__Impl
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
    // InternalAnnotations.g:1096:1: rule__StringPragma__Group__3__Impl : ( ( rule__StringPragma__Group_3__0 )* ) ;
    public final void rule__StringPragma__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1100:1: ( ( ( rule__StringPragma__Group_3__0 )* ) )
            // InternalAnnotations.g:1101:1: ( ( rule__StringPragma__Group_3__0 )* )
            {
            // InternalAnnotations.g:1101:1: ( ( rule__StringPragma__Group_3__0 )* )
            // InternalAnnotations.g:1102:2: ( rule__StringPragma__Group_3__0 )*
            {
             before(grammarAccess.getStringPragmaAccess().getGroup_3()); 
            // InternalAnnotations.g:1103:2: ( rule__StringPragma__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAnnotations.g:1103:3: rule__StringPragma__Group_3__0
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
    // InternalAnnotations.g:1112:1: rule__StringPragma__Group_3__0 : rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 ;
    public final void rule__StringPragma__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1116:1: ( rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1 )
            // InternalAnnotations.g:1117:2: rule__StringPragma__Group_3__0__Impl rule__StringPragma__Group_3__1
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
    // InternalAnnotations.g:1124:1: rule__StringPragma__Group_3__0__Impl : ( ',' ) ;
    public final void rule__StringPragma__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1128:1: ( ( ',' ) )
            // InternalAnnotations.g:1129:1: ( ',' )
            {
            // InternalAnnotations.g:1129:1: ( ',' )
            // InternalAnnotations.g:1130:2: ','
            {
             before(grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1139:1: rule__StringPragma__Group_3__1 : rule__StringPragma__Group_3__1__Impl ;
    public final void rule__StringPragma__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1143:1: ( rule__StringPragma__Group_3__1__Impl )
            // InternalAnnotations.g:1144:2: rule__StringPragma__Group_3__1__Impl
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
    // InternalAnnotations.g:1150:1: rule__StringPragma__Group_3__1__Impl : ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) ;
    public final void rule__StringPragma__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1154:1: ( ( ( rule__StringPragma__ValuesAssignment_3_1 ) ) )
            // InternalAnnotations.g:1155:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            {
            // InternalAnnotations.g:1155:1: ( ( rule__StringPragma__ValuesAssignment_3_1 ) )
            // InternalAnnotations.g:1156:2: ( rule__StringPragma__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getStringPragmaAccess().getValuesAssignment_3_1()); 
            // InternalAnnotations.g:1157:2: ( rule__StringPragma__ValuesAssignment_3_1 )
            // InternalAnnotations.g:1157:3: rule__StringPragma__ValuesAssignment_3_1
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
    // InternalAnnotations.g:1166:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1170:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:1171:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
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
    // InternalAnnotations.g:1178:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1182:1: ( ( '@' ) )
            // InternalAnnotations.g:1183:1: ( '@' )
            {
            // InternalAnnotations.g:1183:1: ( '@' )
            // InternalAnnotations.g:1184:2: '@'
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1193:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1197:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:1198:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
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
    // InternalAnnotations.g:1205:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1209:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:1210:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:1210:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:1211:2: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:1212:2: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:1212:3: rule__TypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalAnnotations.g:1220:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1224:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:1225:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
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
    // InternalAnnotations.g:1232:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1236:1: ( ( '[' ) )
            // InternalAnnotations.g:1237:1: ( '[' )
            {
            // InternalAnnotations.g:1237:1: ( '[' )
            // InternalAnnotations.g:1238:2: '['
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1247:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1251:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // InternalAnnotations.g:1252:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
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
    // InternalAnnotations.g:1259:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1263:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalAnnotations.g:1264:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalAnnotations.g:1264:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalAnnotations.g:1265:2: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // InternalAnnotations.g:1266:2: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalAnnotations.g:1266:3: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalAnnotations.g:1274:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1278:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // InternalAnnotations.g:1279:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
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
    // InternalAnnotations.g:1286:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1290:1: ( ( ']' ) )
            // InternalAnnotations.g:1291:1: ( ']' )
            {
            // InternalAnnotations.g:1291:1: ( ']' )
            // InternalAnnotations.g:1292:2: ']'
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1301:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1305:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // InternalAnnotations.g:1306:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
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
    // InternalAnnotations.g:1313:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1317:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalAnnotations.g:1318:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalAnnotations.g:1318:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalAnnotations.g:1319:2: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // InternalAnnotations.g:1320:2: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalAnnotations.g:1320:3: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalAnnotations.g:1328:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1332:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalAnnotations.g:1333:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalAnnotations.g:1339:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1343:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalAnnotations.g:1344:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalAnnotations.g:1344:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalAnnotations.g:1345:2: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // InternalAnnotations.g:1346:2: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAnnotations.g:1346:3: rule__TypedKeyStringValueAnnotation__Group_6__0
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
    // InternalAnnotations.g:1355:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1359:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // InternalAnnotations.g:1360:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
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
    // InternalAnnotations.g:1367:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1371:1: ( ( ',' ) )
            // InternalAnnotations.g:1372:1: ( ',' )
            {
            // InternalAnnotations.g:1372:1: ( ',' )
            // InternalAnnotations.g:1373:2: ','
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1382:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1386:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalAnnotations.g:1387:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalAnnotations.g:1393:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1397:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalAnnotations.g:1398:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalAnnotations.g:1398:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalAnnotations.g:1399:2: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // InternalAnnotations.g:1400:2: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalAnnotations.g:1400:3: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalAnnotations.g:1409:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1413:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:1414:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1
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
    // InternalAnnotations.g:1421:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1425:1: ( ( '@' ) )
            // InternalAnnotations.g:1426:1: ( '@' )
            {
            // InternalAnnotations.g:1426:1: ( '@' )
            // InternalAnnotations.g:1427:2: '@'
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1436:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1440:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:1441:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2
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
    // InternalAnnotations.g:1448:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1452:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:1453:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:1453:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:1454:2: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:1455:2: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:1455:3: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalAnnotations.g:1463:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2 : rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1467:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:1468:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3
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
    // InternalAnnotations.g:1475:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1479:1: ( ( '[' ) )
            // InternalAnnotations.g:1480:1: ( '[' )
            {
            // InternalAnnotations.g:1480:1: ( '[' )
            // InternalAnnotations.g:1481:2: '['
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1490:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3 : rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1494:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 )
            // InternalAnnotations.g:1495:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4
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
    // InternalAnnotations.g:1502:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1506:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalAnnotations.g:1507:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalAnnotations.g:1507:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalAnnotations.g:1508:2: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // InternalAnnotations.g:1509:2: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalAnnotations.g:1509:3: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalAnnotations.g:1517:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4 : rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1521:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 )
            // InternalAnnotations.g:1522:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5
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
    // InternalAnnotations.g:1529:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1533:1: ( ( ']' ) )
            // InternalAnnotations.g:1534:1: ( ']' )
            {
            // InternalAnnotations.g:1534:1: ( ']' )
            // InternalAnnotations.g:1535:2: ']'
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1544:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5 : rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1548:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 )
            // InternalAnnotations.g:1549:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6
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
    // InternalAnnotations.g:1556:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1560:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalAnnotations.g:1561:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalAnnotations.g:1561:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalAnnotations.g:1562:2: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // InternalAnnotations.g:1563:2: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalAnnotations.g:1563:3: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalAnnotations.g:1571:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6 : rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1575:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalAnnotations.g:1576:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalAnnotations.g:1582:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1586:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalAnnotations.g:1587:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalAnnotations.g:1587:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalAnnotations.g:1588:2: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // InternalAnnotations.g:1589:2: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAnnotations.g:1589:3: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0
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
    // InternalAnnotations.g:1598:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1602:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalAnnotations.g:1603:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1
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
    // InternalAnnotations.g:1610:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1614:1: ( ( ',' ) )
            // InternalAnnotations.g:1615:1: ( ',' )
            {
            // InternalAnnotations.g:1615:1: ( ',' )
            // InternalAnnotations.g:1616:2: ','
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1625:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1629:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalAnnotations.g:1630:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalAnnotations.g:1636:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1640:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalAnnotations.g:1641:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalAnnotations.g:1641:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalAnnotations.g:1642:2: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // InternalAnnotations.g:1643:2: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalAnnotations.g:1643:3: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalAnnotations.g:1652:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1656:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:1657:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
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
    // InternalAnnotations.g:1664:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1668:1: ( ( '@' ) )
            // InternalAnnotations.g:1669:1: ( '@' )
            {
            // InternalAnnotations.g:1669:1: ( '@' )
            // InternalAnnotations.g:1670:2: '@'
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1679:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1683:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:1684:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
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
    // InternalAnnotations.g:1691:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1695:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:1696:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:1696:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:1697:2: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:1698:2: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:1698:3: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalAnnotations.g:1706:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1710:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:1711:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
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
    // InternalAnnotations.g:1718:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1722:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // InternalAnnotations.g:1723:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // InternalAnnotations.g:1723:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // InternalAnnotations.g:1724:2: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // InternalAnnotations.g:1725:2: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // InternalAnnotations.g:1725:3: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
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
    // InternalAnnotations.g:1733:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1737:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // InternalAnnotations.g:1738:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
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
    // InternalAnnotations.g:1744:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1748:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // InternalAnnotations.g:1749:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // InternalAnnotations.g:1749:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // InternalAnnotations.g:1750:2: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            // InternalAnnotations.g:1751:2: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAnnotations.g:1751:3: rule__QuotedKeyStringValueAnnotation__Group_3__0
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
    // InternalAnnotations.g:1760:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1764:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // InternalAnnotations.g:1765:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
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
    // InternalAnnotations.g:1772:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1776:1: ( ( ',' ) )
            // InternalAnnotations.g:1777:1: ( ',' )
            {
            // InternalAnnotations.g:1777:1: ( ',' )
            // InternalAnnotations.g:1778:2: ','
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1787:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1791:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // InternalAnnotations.g:1792:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
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
    // InternalAnnotations.g:1798:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1802:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // InternalAnnotations.g:1803:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // InternalAnnotations.g:1803:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // InternalAnnotations.g:1804:2: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // InternalAnnotations.g:1805:2: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // InternalAnnotations.g:1805:3: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
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
    // InternalAnnotations.g:1814:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1818:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // InternalAnnotations.g:1819:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
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
    // InternalAnnotations.g:1826:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1830:1: ( ( '@' ) )
            // InternalAnnotations.g:1831:1: ( '@' )
            {
            // InternalAnnotations.g:1831:1: ( '@' )
            // InternalAnnotations.g:1832:2: '@'
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1841:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1845:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // InternalAnnotations.g:1846:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
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
    // InternalAnnotations.g:1853:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1857:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // InternalAnnotations.g:1858:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // InternalAnnotations.g:1858:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // InternalAnnotations.g:1859:2: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // InternalAnnotations.g:1860:2: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // InternalAnnotations.g:1860:3: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
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
    // InternalAnnotations.g:1868:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1872:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // InternalAnnotations.g:1873:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
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
    // InternalAnnotations.g:1880:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1884:1: ( ( '[' ) )
            // InternalAnnotations.g:1885:1: ( '[' )
            {
            // InternalAnnotations.g:1885:1: ( '[' )
            // InternalAnnotations.g:1886:2: '['
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1895:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1899:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // InternalAnnotations.g:1900:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
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
    // InternalAnnotations.g:1907:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1911:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // InternalAnnotations.g:1912:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // InternalAnnotations.g:1912:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // InternalAnnotations.g:1913:2: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // InternalAnnotations.g:1914:2: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // InternalAnnotations.g:1914:3: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
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
    // InternalAnnotations.g:1922:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1926:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // InternalAnnotations.g:1927:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
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
    // InternalAnnotations.g:1934:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1938:1: ( ( ']' ) )
            // InternalAnnotations.g:1939:1: ( ']' )
            {
            // InternalAnnotations.g:1939:1: ( ']' )
            // InternalAnnotations.g:1940:2: ']'
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:1949:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1953:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // InternalAnnotations.g:1954:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
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
    // InternalAnnotations.g:1961:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1965:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // InternalAnnotations.g:1966:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // InternalAnnotations.g:1966:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // InternalAnnotations.g:1967:2: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // InternalAnnotations.g:1968:2: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // InternalAnnotations.g:1968:3: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
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
    // InternalAnnotations.g:1976:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1980:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // InternalAnnotations.g:1981:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
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
    // InternalAnnotations.g:1987:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:1991:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // InternalAnnotations.g:1992:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // InternalAnnotations.g:1992:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // InternalAnnotations.g:1993:2: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // InternalAnnotations.g:1994:2: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAnnotations.g:1994:3: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
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
    // InternalAnnotations.g:2003:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2007:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // InternalAnnotations.g:2008:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
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
    // InternalAnnotations.g:2015:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2019:1: ( ( ',' ) )
            // InternalAnnotations.g:2020:1: ( ',' )
            {
            // InternalAnnotations.g:2020:1: ( ',' )
            // InternalAnnotations.g:2021:2: ','
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:2030:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2034:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // InternalAnnotations.g:2035:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
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
    // InternalAnnotations.g:2041:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2045:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // InternalAnnotations.g:2046:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // InternalAnnotations.g:2046:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // InternalAnnotations.g:2047:2: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // InternalAnnotations.g:2048:2: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // InternalAnnotations.g:2048:3: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
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
    // InternalAnnotations.g:2057:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2061:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // InternalAnnotations.g:2062:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
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
    // InternalAnnotations.g:2069:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2073:1: ( ( RULE_ID ) )
            // InternalAnnotations.g:2074:1: ( RULE_ID )
            {
            // InternalAnnotations.g:2074:1: ( RULE_ID )
            // InternalAnnotations.g:2075:2: RULE_ID
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
    // InternalAnnotations.g:2084:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2088:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // InternalAnnotations.g:2089:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
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
    // InternalAnnotations.g:2096:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2100:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // InternalAnnotations.g:2101:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // InternalAnnotations.g:2101:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // InternalAnnotations.g:2102:2: ( rule__ExtendedID__Group_1__0 )*
            {
             before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            // InternalAnnotations.g:2103:2: ( rule__ExtendedID__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_ID) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAnnotations.g:2103:3: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalAnnotations.g:2111:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2115:1: ( rule__ExtendedID__Group__2__Impl )
            // InternalAnnotations.g:2116:2: rule__ExtendedID__Group__2__Impl
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
    // InternalAnnotations.g:2122:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2126:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // InternalAnnotations.g:2127:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // InternalAnnotations.g:2127:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // InternalAnnotations.g:2128:2: ( rule__ExtendedID__Group_2__0 )?
            {
             before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            // InternalAnnotations.g:2129:2: ( rule__ExtendedID__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAnnotations.g:2129:3: rule__ExtendedID__Group_2__0
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
    // InternalAnnotations.g:2138:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2142:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // InternalAnnotations.g:2143:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
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
    // InternalAnnotations.g:2150:1: rule__ExtendedID__Group_1__0__Impl : ( ( rule__ExtendedID__Alternatives_1_0 ) ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2154:1: ( ( ( rule__ExtendedID__Alternatives_1_0 ) ) )
            // InternalAnnotations.g:2155:1: ( ( rule__ExtendedID__Alternatives_1_0 ) )
            {
            // InternalAnnotations.g:2155:1: ( ( rule__ExtendedID__Alternatives_1_0 ) )
            // InternalAnnotations.g:2156:2: ( rule__ExtendedID__Alternatives_1_0 )
            {
             before(grammarAccess.getExtendedIDAccess().getAlternatives_1_0()); 
            // InternalAnnotations.g:2157:2: ( rule__ExtendedID__Alternatives_1_0 )
            // InternalAnnotations.g:2157:3: rule__ExtendedID__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedID__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedIDAccess().getAlternatives_1_0()); 

            }


            }

        }
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
    // InternalAnnotations.g:2165:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2169:1: ( rule__ExtendedID__Group_1__1__Impl )
            // InternalAnnotations.g:2170:2: rule__ExtendedID__Group_1__1__Impl
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
    // InternalAnnotations.g:2176:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2180:1: ( ( RULE_ID ) )
            // InternalAnnotations.g:2181:1: ( RULE_ID )
            {
            // InternalAnnotations.g:2181:1: ( RULE_ID )
            // InternalAnnotations.g:2182:2: RULE_ID
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
    // InternalAnnotations.g:2192:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2196:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // InternalAnnotations.g:2197:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
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
    // InternalAnnotations.g:2204:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2208:1: ( ( '#' ) )
            // InternalAnnotations.g:2209:1: ( '#' )
            {
            // InternalAnnotations.g:2209:1: ( '#' )
            // InternalAnnotations.g:2210:2: '#'
            {
             before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_2); 
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
    // InternalAnnotations.g:2219:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2223:1: ( rule__ExtendedID__Group_2__1__Impl )
            // InternalAnnotations.g:2224:2: rule__ExtendedID__Group_2__1__Impl
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
    // InternalAnnotations.g:2230:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2234:1: ( ( RULE_INT ) )
            // InternalAnnotations.g:2235:1: ( RULE_INT )
            {
            // InternalAnnotations.g:2235:1: ( RULE_INT )
            // InternalAnnotations.g:2236:2: RULE_INT
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
    // InternalAnnotations.g:2246:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2250:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalAnnotations.g:2251:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
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
    // InternalAnnotations.g:2258:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2262:1: ( ( ( '-' )? ) )
            // InternalAnnotations.g:2263:1: ( ( '-' )? )
            {
            // InternalAnnotations.g:2263:1: ( ( '-' )? )
            // InternalAnnotations.g:2264:2: ( '-' )?
            {
             before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            // InternalAnnotations.g:2265:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAnnotations.g:2265:3: '-'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); 

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
    // InternalAnnotations.g:2273:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2277:1: ( rule__Integer__Group__1__Impl )
            // InternalAnnotations.g:2278:2: rule__Integer__Group__1__Impl
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
    // InternalAnnotations.g:2284:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2288:1: ( ( RULE_INT ) )
            // InternalAnnotations.g:2289:1: ( RULE_INT )
            {
            // InternalAnnotations.g:2289:1: ( RULE_INT )
            // InternalAnnotations.g:2290:2: RULE_INT
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
    // InternalAnnotations.g:2300:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2304:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // InternalAnnotations.g:2305:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
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
    // InternalAnnotations.g:2312:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2316:1: ( ( ( '-' )? ) )
            // InternalAnnotations.g:2317:1: ( ( '-' )? )
            {
            // InternalAnnotations.g:2317:1: ( ( '-' )? )
            // InternalAnnotations.g:2318:2: ( '-' )?
            {
             before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            // InternalAnnotations.g:2319:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAnnotations.g:2319:3: '-'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); 

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
    // InternalAnnotations.g:2327:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2331:1: ( rule__Floateger__Group__1__Impl )
            // InternalAnnotations.g:2332:2: rule__Floateger__Group__1__Impl
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
    // InternalAnnotations.g:2338:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2342:1: ( ( RULE_FLOAT ) )
            // InternalAnnotations.g:2343:1: ( RULE_FLOAT )
            {
            // InternalAnnotations.g:2343:1: ( RULE_FLOAT )
            // InternalAnnotations.g:2344:2: RULE_FLOAT
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
    // InternalAnnotations.g:2354:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2358:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // InternalAnnotations.g:2359:2: ( RULE_COMMENT_ANNOTATION )
            {
            // InternalAnnotations.g:2359:2: ( RULE_COMMENT_ANNOTATION )
            // InternalAnnotations.g:2360:3: RULE_COMMENT_ANNOTATION
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
    // InternalAnnotations.g:2369:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2373:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2374:2: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2374:2: ( ruleExtendedID )
            // InternalAnnotations.g:2375:3: ruleExtendedID
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
    // InternalAnnotations.g:2384:1: rule__PragmaTag__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__PragmaTag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2388:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2389:2: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2389:2: ( ruleExtendedID )
            // InternalAnnotations.g:2390:3: ruleExtendedID
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
    // InternalAnnotations.g:2399:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2403:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2404:2: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2404:2: ( ruleExtendedID )
            // InternalAnnotations.g:2405:3: ruleExtendedID
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
    // InternalAnnotations.g:2414:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2418:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2419:2: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2419:2: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2420:3: ruleEStringAllTypes
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
    // InternalAnnotations.g:2429:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2433:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2434:2: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2434:2: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2435:3: ruleEStringAllTypes
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
    // InternalAnnotations.g:2444:1: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2448:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2449:2: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2449:2: ( ruleExtendedID )
            // InternalAnnotations.g:2450:3: ruleExtendedID
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
    // InternalAnnotations.g:2459:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2463:1: ( ( ruleEStringBoolean ) )
            // InternalAnnotations.g:2464:2: ( ruleEStringBoolean )
            {
            // InternalAnnotations.g:2464:2: ( ruleEStringBoolean )
            // InternalAnnotations.g:2465:3: ruleEStringBoolean
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
    // InternalAnnotations.g:2474:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2478:1: ( ( ruleEStringBoolean ) )
            // InternalAnnotations.g:2479:2: ( ruleEStringBoolean )
            {
            // InternalAnnotations.g:2479:2: ( ruleEStringBoolean )
            // InternalAnnotations.g:2480:3: ruleEStringBoolean
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
    // InternalAnnotations.g:2489:1: rule__StringPragma__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__StringPragma__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2493:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2494:2: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2494:2: ( ruleExtendedID )
            // InternalAnnotations.g:2495:3: ruleExtendedID
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
    // InternalAnnotations.g:2504:1: rule__StringPragma__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2508:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2509:2: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2509:2: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2510:3: ruleEStringAllTypes
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
    // InternalAnnotations.g:2519:1: rule__StringPragma__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__StringPragma__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2523:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2524:2: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2524:2: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2525:3: ruleEStringAllTypes
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
    // InternalAnnotations.g:2534:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2538:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2539:2: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2539:2: ( ruleExtendedID )
            // InternalAnnotations.g:2540:3: ruleExtendedID
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
    // InternalAnnotations.g:2549:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2553:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2554:2: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2554:2: ( ruleExtendedID )
            // InternalAnnotations.g:2555:3: ruleExtendedID
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
    // InternalAnnotations.g:2564:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2568:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2569:2: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2569:2: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2570:3: ruleEStringAllTypes
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
    // InternalAnnotations.g:2579:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2583:1: ( ( ruleEStringAllTypes ) )
            // InternalAnnotations.g:2584:2: ( ruleEStringAllTypes )
            {
            // InternalAnnotations.g:2584:2: ( ruleEStringAllTypes )
            // InternalAnnotations.g:2585:3: ruleEStringAllTypes
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
    // InternalAnnotations.g:2594:1: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2598:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2599:2: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2599:2: ( ruleExtendedID )
            // InternalAnnotations.g:2600:3: ruleExtendedID
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
    // InternalAnnotations.g:2609:1: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2613:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2614:2: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2614:2: ( ruleExtendedID )
            // InternalAnnotations.g:2615:3: ruleExtendedID
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
    // InternalAnnotations.g:2624:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2628:1: ( ( ruleEStringBoolean ) )
            // InternalAnnotations.g:2629:2: ( ruleEStringBoolean )
            {
            // InternalAnnotations.g:2629:2: ( ruleEStringBoolean )
            // InternalAnnotations.g:2630:3: ruleEStringBoolean
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
    // InternalAnnotations.g:2639:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2643:1: ( ( ruleEStringBoolean ) )
            // InternalAnnotations.g:2644:2: ( ruleEStringBoolean )
            {
            // InternalAnnotations.g:2644:2: ( ruleEStringBoolean )
            // InternalAnnotations.g:2645:3: ruleEStringBoolean
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
    // InternalAnnotations.g:2654:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2658:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2659:2: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2659:2: ( ruleExtendedID )
            // InternalAnnotations.g:2660:3: ruleExtendedID
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
    // InternalAnnotations.g:2669:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2673:1: ( ( RULE_STRING ) )
            // InternalAnnotations.g:2674:2: ( RULE_STRING )
            {
            // InternalAnnotations.g:2674:2: ( RULE_STRING )
            // InternalAnnotations.g:2675:3: RULE_STRING
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
    // InternalAnnotations.g:2684:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2688:1: ( ( RULE_STRING ) )
            // InternalAnnotations.g:2689:2: ( RULE_STRING )
            {
            // InternalAnnotations.g:2689:2: ( RULE_STRING )
            // InternalAnnotations.g:2690:3: RULE_STRING
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
    // InternalAnnotations.g:2699:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2703:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2704:2: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2704:2: ( ruleExtendedID )
            // InternalAnnotations.g:2705:3: ruleExtendedID
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
    // InternalAnnotations.g:2714:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2718:1: ( ( ruleExtendedID ) )
            // InternalAnnotations.g:2719:2: ( ruleExtendedID )
            {
            // InternalAnnotations.g:2719:2: ( ruleExtendedID )
            // InternalAnnotations.g:2720:3: ruleExtendedID
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
    // InternalAnnotations.g:2729:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2733:1: ( ( RULE_STRING ) )
            // InternalAnnotations.g:2734:2: ( RULE_STRING )
            {
            // InternalAnnotations.g:2734:2: ( RULE_STRING )
            // InternalAnnotations.g:2735:3: RULE_STRING
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
    // InternalAnnotations.g:2744:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAnnotations.g:2748:1: ( ( RULE_STRING ) )
            // InternalAnnotations.g:2749:2: ( RULE_STRING )
            {
            // InternalAnnotations.g:2749:2: ( RULE_STRING )
            // InternalAnnotations.g:2750:3: RULE_STRING
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
    static final String dfa_2s = "\3\uffff\1\7\6\uffff\2\7";
    static final String dfa_3s = "\1\11\1\uffff\1\6\1\4\2\6\1\7\3\uffff\2\4";
    static final String dfa_4s = "\1\22\1\uffff\1\6\1\25\1\6\1\10\1\7\3\uffff\2\25";
    static final String dfa_5s = "\1\uffff\1\1\5\uffff\1\4\1\3\1\2\2\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\10\uffff\1\2",
            "",
            "\1\3",
            "\5\11\7\uffff\1\4\1\5\1\uffff\1\6\1\uffff\1\10",
            "\1\12",
            "\1\12\2\11",
            "\1\13",
            "",
            "",
            "",
            "\5\11\7\uffff\1\4\1\5\1\uffff\1\6\1\uffff\1\10",
            "\5\11\10\uffff\1\11\3\uffff\1\10"
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
            return "452:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleTagAnnotation ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000201F0L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000B0000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020080L});
    }


}