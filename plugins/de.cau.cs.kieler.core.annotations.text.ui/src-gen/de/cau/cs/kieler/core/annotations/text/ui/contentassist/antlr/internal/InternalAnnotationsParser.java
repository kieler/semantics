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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_COMMENT_ANNOTATION", "RULE_BOOLEAN", "RULE_INT", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'('", "')'", "'['", "']'", "'.'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_FLOAT=9;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_INT=8;
    public static final int RULE_WS=12;
    public static final int RULE_COMMENT_ANNOTATION=6;

    // delegates
    // delegators


        public InternalAnnotationsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnnotationsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnnotationsParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g"; }


     
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:60:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:61:1: ( ruleAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:62:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation61);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation68); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:69:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:73:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:74:1: ( ( rule__Annotation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:74:1: ( ( rule__Annotation__Alternatives ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:75:1: ( rule__Annotation__Alternatives )
            {
             before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:76:1: ( rule__Annotation__Alternatives )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:76:2: rule__Annotation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation94);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:88:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:89:1: ( ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:90:1: ruleCommentAnnotation EOF
            {
             before(grammarAccess.getCommentAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation121);
            ruleCommentAnnotation();

            state._fsp--;

             after(grammarAccess.getCommentAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation128); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:97:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValueAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:101:2: ( ( ( rule__CommentAnnotation__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:102:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:102:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:103:1: ( rule__CommentAnnotation__ValueAssignment )
            {
             before(grammarAccess.getCommentAnnotationAccess().getValueAssignment()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:104:1: ( rule__CommentAnnotation__ValueAssignment )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:104:2: rule__CommentAnnotation__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation154);
            rule__CommentAnnotation__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCommentAnnotationAccess().getValueAssignment()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:116:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:117:1: ( ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:118:1: ruleTagAnnotation EOF
            {
             before(grammarAccess.getTagAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation181);
            ruleTagAnnotation();

            state._fsp--;

             after(grammarAccess.getTagAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation188); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:125:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:129:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:130:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:130:1: ( ( rule__TagAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:131:1: ( rule__TagAnnotation__Group__0 )
            {
             before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:132:1: ( rule__TagAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:132:2: rule__TagAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation214);
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


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:144:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:145:1: ( ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:146:1: ruleKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation241);
            ruleKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation248); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:153:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:157:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:158:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:158:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:159:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:160:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:160:2: rule__KeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation274);
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


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:172:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:173:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:174:1: ruleTypedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation301);
            ruleTypedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation308); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:181:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:185:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:186:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:186:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:187:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:188:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:188:2: rule__TypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation334);
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


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:200:1: entryRuleKeyBooleanValueAnnotation : ruleKeyBooleanValueAnnotation EOF ;
    public final void entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:201:1: ( ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:202:1: ruleKeyBooleanValueAnnotation EOF
            {
             before(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation361);
            ruleKeyBooleanValueAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation368); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:209:1: ruleKeyBooleanValueAnnotation : ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyBooleanValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:213:2: ( ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:214:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:214:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:215:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:216:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:216:2: rule__KeyBooleanValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation394);
            rule__KeyBooleanValueAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:228:1: entryRuleKeyIntValueAnnotation : ruleKeyIntValueAnnotation EOF ;
    public final void entryRuleKeyIntValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:229:1: ( ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:230:1: ruleKeyIntValueAnnotation EOF
            {
             before(grammarAccess.getKeyIntValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation421);
            ruleKeyIntValueAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyIntValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation428); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:237:1: ruleKeyIntValueAnnotation : ( ( rule__KeyIntValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyIntValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:241:2: ( ( ( rule__KeyIntValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:242:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:242:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:243:1: ( rule__KeyIntValueAnnotation__Group__0 )
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:244:1: ( rule__KeyIntValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:244:2: rule__KeyIntValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation454);
            rule__KeyIntValueAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:256:1: entryRuleKeyFloatValueAnnotation : ruleKeyFloatValueAnnotation EOF ;
    public final void entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:257:1: ( ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:258:1: ruleKeyFloatValueAnnotation EOF
            {
             before(grammarAccess.getKeyFloatValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation481);
            ruleKeyFloatValueAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyFloatValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation488); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:265:1: ruleKeyFloatValueAnnotation : ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyFloatValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:269:2: ( ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:270:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:270:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:271:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:272:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:272:2: rule__KeyFloatValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation514);
            rule__KeyFloatValueAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:286:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:287:1: ( ruleEString EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:288:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString543);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString550); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:295:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:299:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:300:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:300:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:301:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:302:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:302:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString576);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:314:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:315:1: ( ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:316:1: ruleExtendedID EOF
            {
             before(grammarAccess.getExtendedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID603);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getExtendedIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID610); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:323:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:327:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:328:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:328:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:329:1: ( rule__ExtendedID__Group__0 )
            {
             before(grammarAccess.getExtendedIDAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:330:1: ( rule__ExtendedID__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:330:2: rule__ExtendedID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID636);
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


    // $ANTLR start "rule__Annotation__Alternatives"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:342:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:346:1: ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:347:1: ( ruleCommentAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:347:1: ( ruleCommentAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:348:1: ruleCommentAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives672);
                    ruleCommentAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:353:6: ( ruleTagAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:353:6: ( ruleTagAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:354:1: ruleTagAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives689);
                    ruleTagAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:359:6: ( ruleKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:359:6: ( ruleKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:360:1: ruleKeyStringValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives706);
                    ruleKeyStringValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:365:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:365:6: ( ruleTypedKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:366:1: ruleTypedKeyStringValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives723);
                    ruleTypedKeyStringValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:371:6: ( ruleKeyBooleanValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:371:6: ( ruleKeyBooleanValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:372:1: ruleKeyBooleanValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives740);
                    ruleKeyBooleanValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:377:6: ( ruleKeyIntValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:377:6: ( ruleKeyIntValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:378:1: ruleKeyIntValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives757);
                    ruleKeyIntValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:383:6: ( ruleKeyFloatValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:383:6: ( ruleKeyFloatValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:384:1: ruleKeyFloatValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives774);
                    ruleKeyFloatValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 

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


    // $ANTLR start "rule__EString__Alternatives"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:394:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:398:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:399:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:399:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:400:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives806); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:405:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:405:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:406:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives823); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__TagAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:418:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:422:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:423:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__0853);
            rule__TagAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__0856);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:430:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:434:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:435:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:435:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:436:1: '@'
            {
             before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TagAnnotation__Group__0__Impl884); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:449:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:453:1: ( rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:454:2: rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__1915);
            rule__TagAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__1918);
            rule__TagAnnotation__Group__2();

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:461:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:465:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:466:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:466:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:467:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:468:1: ( rule__TagAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:468:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl945);
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


    // $ANTLR start "rule__TagAnnotation__Group__2"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:478:1: rule__TagAnnotation__Group__2 : rule__TagAnnotation__Group__2__Impl ;
    public final void rule__TagAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:482:1: ( rule__TagAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:483:2: rule__TagAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__2975);
            rule__TagAnnotation__Group__2__Impl();

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
    // $ANTLR end "rule__TagAnnotation__Group__2"


    // $ANTLR start "rule__TagAnnotation__Group__2__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:489:1: rule__TagAnnotation__Group__2__Impl : ( ( rule__TagAnnotation__Group_2__0 )? ) ;
    public final void rule__TagAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:493:1: ( ( ( rule__TagAnnotation__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:494:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:494:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:495:1: ( rule__TagAnnotation__Group_2__0 )?
            {
             before(grammarAccess.getTagAnnotationAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:496:1: ( rule__TagAnnotation__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:496:2: rule__TagAnnotation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl1002);
                    rule__TagAnnotation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTagAnnotationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group__2__Impl"


    // $ANTLR start "rule__TagAnnotation__Group_2__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:512:1: rule__TagAnnotation__Group_2__0 : rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 ;
    public final void rule__TagAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:516:1: ( rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:517:2: rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__01039);
            rule__TagAnnotation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__01042);
            rule__TagAnnotation__Group_2__1();

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
    // $ANTLR end "rule__TagAnnotation__Group_2__0"


    // $ANTLR start "rule__TagAnnotation__Group_2__0__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:524:1: rule__TagAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TagAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:528:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:529:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:529:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:530:1: '('
            {
             before(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TagAnnotation__Group_2__0__Impl1070); 
             after(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group_2__0__Impl"


    // $ANTLR start "rule__TagAnnotation__Group_2__1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:543:1: rule__TagAnnotation__Group_2__1 : rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 ;
    public final void rule__TagAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:547:1: ( rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:548:2: rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__11101);
            rule__TagAnnotation__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__11104);
            rule__TagAnnotation__Group_2__2();

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
    // $ANTLR end "rule__TagAnnotation__Group_2__1"


    // $ANTLR start "rule__TagAnnotation__Group_2__1__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:555:1: rule__TagAnnotation__Group_2__1__Impl : ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) ;
    public final void rule__TagAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:559:1: ( ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:560:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:560:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:561:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            {
             before(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:562:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMENT_ANNOTATION||LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:562:2: rule__TagAnnotation__AnnotationsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl1131);
            	    rule__TagAnnotation__AnnotationsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group_2__1__Impl"


    // $ANTLR start "rule__TagAnnotation__Group_2__2"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:572:1: rule__TagAnnotation__Group_2__2 : rule__TagAnnotation__Group_2__2__Impl ;
    public final void rule__TagAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:576:1: ( rule__TagAnnotation__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:577:2: rule__TagAnnotation__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__21162);
            rule__TagAnnotation__Group_2__2__Impl();

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
    // $ANTLR end "rule__TagAnnotation__Group_2__2"


    // $ANTLR start "rule__TagAnnotation__Group_2__2__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:583:1: rule__TagAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TagAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:587:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:588:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:588:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:589:1: ')'
            {
             before(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TagAnnotation__Group_2__2__Impl1190); 
             after(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group_2__2__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:608:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:612:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:613:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__01227);
            rule__KeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__01230);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:620:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:624:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:625:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:625:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:626:1: '@'
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__KeyStringValueAnnotation__Group__0__Impl1258); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:639:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:643:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:644:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__11289);
            rule__KeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__11292);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:651:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:655:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:656:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:656:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:657:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:658:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:658:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl1319);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:668:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:672:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:673:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__21349);
            rule__KeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__21352);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:680:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:684:1: ( ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:685:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:685:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:686:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:687:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:687:2: rule__KeyStringValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl1379);
            rule__KeyStringValueAnnotation__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:697:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:701:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:702:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__31409);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:708:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:712:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:713:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:713:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:714:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:715:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:715:2: rule__KeyStringValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl1436);
                    rule__KeyStringValueAnnotation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:733:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:737:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:738:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__01475);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__01478);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:745:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:749:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:750:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:750:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:751:1: '('
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyStringValueAnnotation__Group_3__0__Impl1506); 
             after(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:764:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:768:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:769:2: rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__11537);
            rule__KeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__11540);
            rule__KeyStringValueAnnotation__Group_3__2();

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:776:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:780:1: ( ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:781:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:781:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:782:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:783:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMENT_ANNOTATION||LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:783:2: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl1567);
            	    rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__KeyStringValueAnnotation__Group_3__2"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:793:1: rule__KeyStringValueAnnotation__Group_3__2 : rule__KeyStringValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:797:1: ( rule__KeyStringValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:798:2: rule__KeyStringValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__21598);
            rule__KeyStringValueAnnotation__Group_3__2__Impl();

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
    // $ANTLR end "rule__KeyStringValueAnnotation__Group_3__2"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group_3__2__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:804:1: rule__KeyStringValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:808:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:809:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:809:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:810:1: ')'
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeyStringValueAnnotation__Group_3__2__Impl1626); 
             after(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group_3__2__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:829:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:833:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:834:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__01663);
            rule__TypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__01666);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:841:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:845:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:846:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:846:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:847:1: '@'
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl1694); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:860:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:864:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:865:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__11725);
            rule__TypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__11728);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:872:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:876:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:877:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:877:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:878:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:879:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:879:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl1755);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:889:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:893:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:894:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__21785);
            rule__TypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__21788);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:901:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:905:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:906:1: ( '[' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:906:1: ( '[' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:907:1: '['
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl1816); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:920:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:924:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:925:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__31847);
            rule__TypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__31850);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:932:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:936:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:937:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:937:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:938:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:939:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:939:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl1877);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:949:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:953:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:954:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__41907);
            rule__TypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__41910);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:961:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:965:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:966:1: ( ']' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:966:1: ( ']' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:967:1: ']'
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl1938); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:980:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:984:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:985:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__51969);
            rule__TypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__51972);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:992:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:996:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:997:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:997:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:998:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueAssignment_5()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:999:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:999:2: rule__TypedKeyStringValueAnnotation__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl1999);
            rule__TypedKeyStringValueAnnotation__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueAssignment_5()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1009:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1013:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1014:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__62029);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1020:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1024:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1025:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1025:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1026:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1027:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1027:2: rule__TypedKeyStringValueAnnotation__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl2056);
                    rule__TypedKeyStringValueAnnotation__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1051:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1055:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1056:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__02101);
            rule__TypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__02104);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1063:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1067:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1068:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1068:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1069:1: '('
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl2132); 
             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1082:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1086:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1087:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__12163);
            rule__TypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__12166);
            rule__TypedKeyStringValueAnnotation__Group_6__2();

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1094:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1098:1: ( ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1099:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1099:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1100:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAssignment_6_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1101:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMENT_ANNOTATION||LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1101:2: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl2193);
            	    rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group_6__2"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1111:1: rule__TypedKeyStringValueAnnotation__Group_6__2 : rule__TypedKeyStringValueAnnotation__Group_6__2__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1115:1: ( rule__TypedKeyStringValueAnnotation__Group_6__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1116:2: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__22224);
            rule__TypedKeyStringValueAnnotation__Group_6__2__Impl();

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
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group_6__2"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group_6__2__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1122:1: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl : ( ')' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1126:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1127:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1127:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1128:1: ')'
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl2252); 
             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group_6__2__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1147:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1151:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1152:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__02289);
            rule__KeyBooleanValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__02292);
            rule__KeyBooleanValueAnnotation__Group__1();

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
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__0"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__0__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1159:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1163:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1164:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1164:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1165:1: '@'
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__KeyBooleanValueAnnotation__Group__0__Impl2320); 
             after(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1178:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1182:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1183:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__12351);
            rule__KeyBooleanValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__12354);
            rule__KeyBooleanValueAnnotation__Group__2();

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
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__1"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__1__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1190:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1194:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1195:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1195:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1196:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1197:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1197:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl2381);
            rule__KeyBooleanValueAnnotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1207:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1211:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1212:2: rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__22411);
            rule__KeyBooleanValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__22414);
            rule__KeyBooleanValueAnnotation__Group__3();

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
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__2"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__2__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1219:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1223:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1224:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1224:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1225:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1226:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1226:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl2441);
            rule__KeyBooleanValueAnnotation__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__3"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1236:1: rule__KeyBooleanValueAnnotation__Group__3 : rule__KeyBooleanValueAnnotation__Group__3__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1240:1: ( rule__KeyBooleanValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1241:2: rule__KeyBooleanValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__32471);
            rule__KeyBooleanValueAnnotation__Group__3__Impl();

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
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__3"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__3__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1247:1: rule__KeyBooleanValueAnnotation__Group__3__Impl : ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1251:1: ( ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1252:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1252:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1253:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1254:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1254:2: rule__KeyBooleanValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl2498);
                    rule__KeyBooleanValueAnnotation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1272:1: rule__KeyBooleanValueAnnotation__Group_3__0 : rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1276:1: ( rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1277:2: rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__02537);
            rule__KeyBooleanValueAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__02540);
            rule__KeyBooleanValueAnnotation__Group_3__1();

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
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__0"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__0__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1284:1: rule__KeyBooleanValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1288:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1289:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1289:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1290:1: '('
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl2568); 
             after(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1303:1: rule__KeyBooleanValueAnnotation__Group_3__1 : rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1307:1: ( rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1308:2: rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__12599);
            rule__KeyBooleanValueAnnotation__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__12602);
            rule__KeyBooleanValueAnnotation__Group_3__2();

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
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__1"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__1__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1315:1: rule__KeyBooleanValueAnnotation__Group_3__1__Impl : ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1319:1: ( ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1320:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1320:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1321:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1322:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMENT_ANNOTATION||LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1322:2: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl2629);
            	    rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__2"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1332:1: rule__KeyBooleanValueAnnotation__Group_3__2 : rule__KeyBooleanValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1336:1: ( rule__KeyBooleanValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1337:2: rule__KeyBooleanValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__22660);
            rule__KeyBooleanValueAnnotation__Group_3__2__Impl();

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
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__2"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__2__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1343:1: rule__KeyBooleanValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1347:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1348:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1348:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1349:1: ')'
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl2688); 
             after(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__2__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1368:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1372:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1373:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__02725);
            rule__KeyIntValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__02728);
            rule__KeyIntValueAnnotation__Group__1();

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
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__0"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__0__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1380:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1384:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1385:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1385:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1386:1: '@'
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__KeyIntValueAnnotation__Group__0__Impl2756); 
             after(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1399:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1403:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1404:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__12787);
            rule__KeyIntValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__12790);
            rule__KeyIntValueAnnotation__Group__2();

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
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__1"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__1__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1411:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1415:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1416:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1416:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1417:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1418:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1418:2: rule__KeyIntValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl2817);
            rule__KeyIntValueAnnotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1428:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1432:1: ( rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1433:2: rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__22847);
            rule__KeyIntValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__22850);
            rule__KeyIntValueAnnotation__Group__3();

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
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__2"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__2__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1440:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1444:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1445:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1445:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1446:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1447:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1447:2: rule__KeyIntValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl2877);
            rule__KeyIntValueAnnotation__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__3"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1457:1: rule__KeyIntValueAnnotation__Group__3 : rule__KeyIntValueAnnotation__Group__3__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1461:1: ( rule__KeyIntValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1462:2: rule__KeyIntValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__32907);
            rule__KeyIntValueAnnotation__Group__3__Impl();

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
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__3"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__3__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1468:1: rule__KeyIntValueAnnotation__Group__3__Impl : ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyIntValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1472:1: ( ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1473:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1473:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1474:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1475:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1475:2: rule__KeyIntValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl2934);
                    rule__KeyIntValueAnnotation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1493:1: rule__KeyIntValueAnnotation__Group_3__0 : rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 ;
    public final void rule__KeyIntValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1497:1: ( rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1498:2: rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__02973);
            rule__KeyIntValueAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__02976);
            rule__KeyIntValueAnnotation__Group_3__1();

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
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__0"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__0__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1505:1: rule__KeyIntValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1509:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1510:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1510:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1511:1: '('
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyIntValueAnnotation__Group_3__0__Impl3004); 
             after(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1524:1: rule__KeyIntValueAnnotation__Group_3__1 : rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 ;
    public final void rule__KeyIntValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1528:1: ( rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1529:2: rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__13035);
            rule__KeyIntValueAnnotation__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__13038);
            rule__KeyIntValueAnnotation__Group_3__2();

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
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__1"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__1__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1536:1: rule__KeyIntValueAnnotation__Group_3__1__Impl : ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1540:1: ( ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1541:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1541:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1542:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1543:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMENT_ANNOTATION||LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1543:2: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl3065);
            	    rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__2"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1553:1: rule__KeyIntValueAnnotation__Group_3__2 : rule__KeyIntValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1557:1: ( rule__KeyIntValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1558:2: rule__KeyIntValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__23096);
            rule__KeyIntValueAnnotation__Group_3__2__Impl();

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
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__2"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__2__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1564:1: rule__KeyIntValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1568:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1569:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1569:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1570:1: ')'
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeyIntValueAnnotation__Group_3__2__Impl3124); 
             after(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__2__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1589:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1593:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1594:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__03161);
            rule__KeyFloatValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__03164);
            rule__KeyFloatValueAnnotation__Group__1();

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
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__0"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__0__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1601:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1605:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1606:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1606:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1607:1: '@'
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__KeyFloatValueAnnotation__Group__0__Impl3192); 
             after(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1620:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1624:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1625:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__13223);
            rule__KeyFloatValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__13226);
            rule__KeyFloatValueAnnotation__Group__2();

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
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__1"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__1__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1632:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1636:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1637:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1637:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1638:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1639:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1639:2: rule__KeyFloatValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl3253);
            rule__KeyFloatValueAnnotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1649:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1653:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1654:2: rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__23283);
            rule__KeyFloatValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__23286);
            rule__KeyFloatValueAnnotation__Group__3();

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
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__2"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__2__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1661:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1665:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1666:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1666:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1667:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1668:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1668:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl3313);
            rule__KeyFloatValueAnnotation__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__3"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1678:1: rule__KeyFloatValueAnnotation__Group__3 : rule__KeyFloatValueAnnotation__Group__3__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1682:1: ( rule__KeyFloatValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1683:2: rule__KeyFloatValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__33343);
            rule__KeyFloatValueAnnotation__Group__3__Impl();

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
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__3"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__3__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1689:1: rule__KeyFloatValueAnnotation__Group__3__Impl : ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyFloatValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1693:1: ( ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1694:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1694:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1695:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1696:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1696:2: rule__KeyFloatValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl3370);
                    rule__KeyFloatValueAnnotation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1714:1: rule__KeyFloatValueAnnotation__Group_3__0 : rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1718:1: ( rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1719:2: rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__03409);
            rule__KeyFloatValueAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__03412);
            rule__KeyFloatValueAnnotation__Group_3__1();

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
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__0"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__0__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1726:1: rule__KeyFloatValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1730:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1731:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1731:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1732:1: '('
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl3440); 
             after(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1745:1: rule__KeyFloatValueAnnotation__Group_3__1 : rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1749:1: ( rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1750:2: rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__13471);
            rule__KeyFloatValueAnnotation__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__13474);
            rule__KeyFloatValueAnnotation__Group_3__2();

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
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__1"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__1__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1757:1: rule__KeyFloatValueAnnotation__Group_3__1__Impl : ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1761:1: ( ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1762:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1762:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1763:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1764:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMENT_ANNOTATION||LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1764:2: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl3501);
            	    rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__2"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1774:1: rule__KeyFloatValueAnnotation__Group_3__2 : rule__KeyFloatValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1778:1: ( rule__KeyFloatValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1779:2: rule__KeyFloatValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__23532);
            rule__KeyFloatValueAnnotation__Group_3__2__Impl();

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
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__2"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__2__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1785:1: rule__KeyFloatValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1789:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1790:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1790:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1791:1: ')'
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl3560); 
             after(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__2__Impl"


    // $ANTLR start "rule__ExtendedID__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1811:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1815:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1816:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__03598);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__03601);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1823:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1827:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1828:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1828:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1829:1: RULE_ID
            {
             before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl3628); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1840:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1844:1: ( rule__ExtendedID__Group__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1845:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__13657);
            rule__ExtendedID__Group__1__Impl();

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1851:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1855:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1856:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1856:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1857:1: ( rule__ExtendedID__Group_1__0 )*
            {
             before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1858:1: ( rule__ExtendedID__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1858:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl3684);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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


    // $ANTLR start "rule__ExtendedID__Group_1__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1872:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1876:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1877:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__03719);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__03722);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1884:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1888:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1889:1: ( '.' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1889:1: ( '.' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1890:1: '.'
            {
             before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ExtendedID__Group_1__0__Impl3750); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1903:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1907:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1908:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__13781);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1914:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1918:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1919:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1919:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1920:1: RULE_ID
            {
             before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl3808); 
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


    // $ANTLR start "rule__CommentAnnotation__ValueAssignment"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1936:1: rule__CommentAnnotation__ValueAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1940:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1941:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1941:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1942:1: RULE_COMMENT_ANNOTATION
            {
             before(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment3846); 
             after(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentAnnotation__ValueAssignment"


    // $ANTLR start "rule__TagAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1951:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1955:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1956:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1956:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1957:1: ruleExtendedID
            {
             before(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_13877);
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


    // $ANTLR start "rule__TagAnnotation__AnnotationsAssignment_2_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1966:1: rule__TagAnnotation__AnnotationsAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__TagAnnotation__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1970:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1971:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1971:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1972:1: ruleAnnotation
            {
             before(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_13908);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__AnnotationsAssignment_2_1"


    // $ANTLR start "rule__KeyStringValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1981:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1985:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1986:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1986:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1987:1: ruleExtendedID
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_13939);
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


    // $ANTLR start "rule__KeyStringValueAnnotation__ValueAssignment_2"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1996:1: rule__KeyStringValueAnnotation__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2000:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2001:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2001:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2002:1: ruleEString
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_23970);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__ValueAssignment_2"


    // $ANTLR start "rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2011:1: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2015:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2016:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2016:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2017:1: ruleAnnotation
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_14001);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2026:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2030:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2031:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2031:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2032:1: ruleExtendedID
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_14032);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2041:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2045:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2046:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2046:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2047:1: ruleExtendedID
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_34063);
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


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__ValueAssignment_5"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2056:1: rule__TypedKeyStringValueAnnotation__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2060:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2061:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2061:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2062:1: ruleEString
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_54094);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__ValueAssignment_5"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2071:1: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 : ( ruleAnnotation ) ;
    public final void rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2075:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2076:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2076:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2077:1: ruleAnnotation
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_14125);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2086:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2090:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2091:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2091:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2092:1: ruleExtendedID
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_14156);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2101:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2105:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2106:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2106:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2107:1: RULE_BOOLEAN
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBooleanTerminalRuleCall_2_0()); 
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_24187); 
             after(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBooleanTerminalRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2116:1: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2120:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2121:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2121:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2122:1: ruleAnnotation
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_14218);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1"


    // $ANTLR start "rule__KeyIntValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2131:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2135:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2136:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2136:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2137:1: ruleExtendedID
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_14249);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2146:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2150:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2151:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2151:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2152:1: RULE_INT
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_24280); 
             after(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2161:1: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2165:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2166:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2166:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2167:1: ruleAnnotation
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_14311);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1"


    // $ANTLR start "rule__KeyFloatValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2176:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2180:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2181:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2181:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2182:1: ruleExtendedID
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_14342);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2191:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2195:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2196:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2196:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2197:1: RULE_FLOAT
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloatTerminalRuleCall_2_0()); 
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_24373); 
             after(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloatTerminalRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2206:1: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2210:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2211:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2211:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2212:1: ruleAnnotation
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_14404);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\3\uffff\1\5\7\uffff\1\5";
    static final String DFA1_minS =
        "\1\6\1\uffff\1\5\1\4\1\5\6\uffff\1\4";
    static final String DFA1_maxS =
        "\1\16\1\uffff\1\5\1\23\1\5\6\uffff\1\23";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\1\4\1\7\1\5\1\6\1\3\1\uffff";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\7\uffff\1\2",
            "",
            "\1\3",
            "\2\12\1\5\1\10\1\11\1\7\4\uffff\3\5\1\6\1\uffff\1\4",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\12\1\5\1\10\1\11\1\7\4\uffff\3\5\1\6\1\uffff\1\4"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "342:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__0853 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__0856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TagAnnotation__Group__0__Impl884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__1915 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__1918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__2975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl1002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__01039 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__01042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TagAnnotation__Group_2__0__Impl1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__11101 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__11104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl1131 = new BitSet(new long[]{0x0000000000004042L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__21162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TagAnnotation__Group_2__2__Impl1190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__01227 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__01230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__KeyStringValueAnnotation__Group__0__Impl1258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__11289 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__11292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl1319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__21349 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__21352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl1379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__31409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl1436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__01475 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__01478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyStringValueAnnotation__Group_3__0__Impl1506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__11537 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__11540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl1567 = new BitSet(new long[]{0x0000000000004042L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__21598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeyStringValueAnnotation__Group_3__2__Impl1626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__01663 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__01666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__11725 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__11728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__21785 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__21788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl1816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__31847 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__31850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl1877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__41907 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__41910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl1938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__51969 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__51972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__62029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl2056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__02101 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__02104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl2132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__12163 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__12166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl2193 = new BitSet(new long[]{0x0000000000004042L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__22224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl2252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__02289 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__02292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__KeyBooleanValueAnnotation__Group__0__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__12351 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__12354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl2381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__22411 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__22414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__32471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__02537 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__02540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__12599 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__12602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl2629 = new BitSet(new long[]{0x0000000000004042L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__22660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl2688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__02725 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__02728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__KeyIntValueAnnotation__Group__0__Impl2756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__12787 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__12790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__22847 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__22850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl2877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__32907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl2934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__02973 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__02976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyIntValueAnnotation__Group_3__0__Impl3004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__13035 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__13038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl3065 = new BitSet(new long[]{0x0000000000004042L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__23096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeyIntValueAnnotation__Group_3__2__Impl3124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__03161 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__03164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__KeyFloatValueAnnotation__Group__0__Impl3192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__13223 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__13226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl3253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__23283 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__23286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl3313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__33343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__03409 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__03412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl3440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__13471 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__13474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl3501 = new BitSet(new long[]{0x0000000000004042L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__23532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl3560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__03598 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__03601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl3628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__13657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl3684 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__03719 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__03722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ExtendedID__Group_1__0__Impl3750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__13781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl3808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment3846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_13877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_13908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_13939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_23970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_14001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_14032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_34063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_54094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_14125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_14156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_24187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_14218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_14249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_24280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_14311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_14342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_24373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_14404 = new BitSet(new long[]{0x0000000000000002L});
    }


}