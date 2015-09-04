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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_COMMENT_ANNOTATION", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "','", "'['", "']'", "'.'", "'#'", "'-'"
    };
    public static final int RULE_COMMENT_ANNOTATION=8;
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_NUMBER=11;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_FLOAT=7;
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:92:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:93:1: ( ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:94:1: ruleCommentAnnotation EOF
            {
             before(grammarAccess.getCommentAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation125);
            ruleCommentAnnotation();

            state._fsp--;

             after(grammarAccess.getCommentAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation132); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:101:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValuesAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:105:2: ( ( ( rule__CommentAnnotation__ValuesAssignment ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:106:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:106:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:107:1: ( rule__CommentAnnotation__ValuesAssignment )
            {
             before(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:108:1: ( rule__CommentAnnotation__ValuesAssignment )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:108:2: rule__CommentAnnotation__ValuesAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__CommentAnnotation__ValuesAssignment_in_ruleCommentAnnotation158);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:120:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:121:1: ( ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:122:1: ruleTagAnnotation EOF
            {
             before(grammarAccess.getTagAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation185);
            ruleTagAnnotation();

            state._fsp--;

             after(grammarAccess.getTagAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation192); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:129:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:133:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:134:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:134:1: ( ( rule__TagAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:135:1: ( rule__TagAnnotation__Group__0 )
            {
             before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:136:1: ( rule__TagAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:136:2: rule__TagAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation218);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:148:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:149:1: ( ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:150:1: ruleKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation245);
            ruleKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation252); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:157:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:161:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:162:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:162:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:163:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:164:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:164:2: rule__KeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation278);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:176:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:177:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:178:1: ruleTypedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation305);
            ruleTypedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation312); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:185:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:189:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:190:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:190:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:191:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:192:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:192:2: rule__TypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation338);
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


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:204:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:205:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:206:1: ruleQuotedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation365);
            ruleQuotedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation372); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:213:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:217:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:218:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:218:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:219:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:220:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:220:2: rule__QuotedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__0_in_ruleQuotedKeyStringValueAnnotation398);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:232:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:233:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:234:1: ruleQuotedTypedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation425);
            ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation432); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:241:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:245:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:246:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:246:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:247:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:248:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:248:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__0_in_ruleQuotedTypedKeyStringValueAnnotation458);
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


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:260:1: entryRuleKeyBooleanValueAnnotation : ruleKeyBooleanValueAnnotation EOF ;
    public final void entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:261:1: ( ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:262:1: ruleKeyBooleanValueAnnotation EOF
            {
             before(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation485);
            ruleKeyBooleanValueAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation492); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:269:1: ruleKeyBooleanValueAnnotation : ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyBooleanValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:273:2: ( ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:274:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:274:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:275:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:276:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:276:2: rule__KeyBooleanValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation518);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:288:1: entryRuleKeyIntValueAnnotation : ruleKeyIntValueAnnotation EOF ;
    public final void entryRuleKeyIntValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:289:1: ( ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:290:1: ruleKeyIntValueAnnotation EOF
            {
             before(grammarAccess.getKeyIntValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation545);
            ruleKeyIntValueAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyIntValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation552); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:297:1: ruleKeyIntValueAnnotation : ( ( rule__KeyIntValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyIntValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:301:2: ( ( ( rule__KeyIntValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:302:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:302:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:303:1: ( rule__KeyIntValueAnnotation__Group__0 )
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:304:1: ( rule__KeyIntValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:304:2: rule__KeyIntValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation578);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:316:1: entryRuleKeyFloatValueAnnotation : ruleKeyFloatValueAnnotation EOF ;
    public final void entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:317:1: ( ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:318:1: ruleKeyFloatValueAnnotation EOF
            {
             before(grammarAccess.getKeyFloatValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation605);
            ruleKeyFloatValueAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyFloatValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation612); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:325:1: ruleKeyFloatValueAnnotation : ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyFloatValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:329:2: ( ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:330:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:330:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:331:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:332:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:332:2: rule__KeyFloatValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation638);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:344:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:345:1: ( ruleEString EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:346:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString665);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString672); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:353:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:357:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:358:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:358:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:359:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:360:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:360:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString698);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:372:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:373:1: ( ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:374:1: ruleExtendedID EOF
            {
             before(grammarAccess.getExtendedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID725);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getExtendedIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID732); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:381:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:385:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:386:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:386:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:387:1: ( rule__ExtendedID__Group__0 )
            {
             before(grammarAccess.getExtendedIDAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:388:1: ( rule__ExtendedID__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:388:2: rule__ExtendedID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID758);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:400:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:401:1: ( ruleInteger EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:402:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger785);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger792); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:409:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:413:2: ( ( ( rule__Integer__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:414:1: ( ( rule__Integer__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:414:1: ( ( rule__Integer__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:415:1: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:416:1: ( rule__Integer__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:416:2: rule__Integer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Integer__Group__0_in_ruleInteger818);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:428:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:429:1: ( ruleFloateger EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:430:1: ruleFloateger EOF
            {
             before(grammarAccess.getFloategerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_entryRuleFloateger845);
            ruleFloateger();

            state._fsp--;

             after(grammarAccess.getFloategerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloateger852); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:437:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:441:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:442:1: ( ( rule__Floateger__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:442:1: ( ( rule__Floateger__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:443:1: ( rule__Floateger__Group__0 )
            {
             before(grammarAccess.getFloategerAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:444:1: ( rule__Floateger__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:444:2: rule__Floateger__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Floateger__Group__0_in_ruleFloateger878);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:456:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) | ( ruleTagAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:460:1: ( ( ruleCommentAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) | ( ruleTagAnnotation ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:461:1: ( ruleCommentAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:461:1: ( ruleCommentAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:462:1: ruleCommentAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives914);
                    ruleCommentAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:467:6: ( ruleKeyBooleanValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:467:6: ( ruleKeyBooleanValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:468:1: ruleKeyBooleanValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives931);
                    ruleKeyBooleanValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:473:6: ( ruleKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:473:6: ( ruleKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:474:1: ruleKeyStringValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives948);
                    ruleKeyStringValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:479:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:479:6: ( ruleTypedKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:480:1: ruleTypedKeyStringValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives965);
                    ruleTypedKeyStringValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:485:6: ( ruleKeyIntValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:485:6: ( ruleKeyIntValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:486:1: ruleKeyIntValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives982);
                    ruleKeyIntValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:491:6: ( ruleKeyFloatValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:491:6: ( ruleKeyFloatValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:492:1: ruleKeyFloatValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives999);
                    ruleKeyFloatValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:497:6: ( ruleTagAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:497:6: ( ruleTagAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:498:1: ruleTagAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives1016);
                    ruleTagAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_6()); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:510:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:514:1: ( ( RULE_STRING ) | ( ruleExtendedID ) )
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
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:515:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:515:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:516:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1050); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:521:6: ( ruleExtendedID )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:521:6: ( ruleExtendedID )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:522:1: ruleExtendedID
                    {
                     before(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__EString__Alternatives1067);
                    ruleExtendedID();

                    state._fsp--;

                     after(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:534:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:538:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:539:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__01097);
            rule__TagAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__01100);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:546:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:550:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:551:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:551:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:552:1: '@'
            {
             before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TagAnnotation__Group__0__Impl1128); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:565:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:569:1: ( rule__TagAnnotation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:570:2: rule__TagAnnotation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__11159);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:576:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:580:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:581:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:581:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:582:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:583:1: ( rule__TagAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:583:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl1186);
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


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:597:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:601:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:602:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__01220);
            rule__KeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__01223);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:609:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:613:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:614:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:614:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:615:1: '@'
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyStringValueAnnotation__Group__0__Impl1251); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:628:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:632:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:633:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__11282);
            rule__KeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__11285);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:640:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:644:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:645:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:645:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:646:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:647:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:647:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl1312);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:657:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:661:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:662:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__21342);
            rule__KeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__21345);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:669:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:673:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:674:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:674:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:675:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:676:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:676:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__ValuesAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl1372);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:686:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:690:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:691:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__31402);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:697:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:701:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:702:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:702:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:703:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:704:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:704:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl1429);
            	    rule__KeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:722:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:726:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:727:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__01468);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__01471);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:734:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:738:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:739:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:739:1: ( ',' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:740:1: ','
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeyStringValueAnnotation__Group_3__0__Impl1499); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:753:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:757:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:758:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__11530);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:764:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:768:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:769:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:769:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:770:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:771:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:771:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__ValuesAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl1557);
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


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:785:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:789:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:790:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__01591);
            rule__TypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__01594);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:797:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:801:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:802:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:802:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:803:1: '@'
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl1622); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:816:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:820:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:821:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__11653);
            rule__TypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__11656);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:828:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:832:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:833:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:833:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:834:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:835:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:835:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl1683);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:845:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:849:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:850:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__21713);
            rule__TypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__21716);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:857:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:861:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:862:1: ( '[' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:862:1: ( '[' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:863:1: '['
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl1744); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:876:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:880:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:881:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__31775);
            rule__TypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__31778);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:888:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:892:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:893:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:893:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:894:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:895:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:895:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl1805);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:905:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:909:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:910:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__41835);
            rule__TypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__41838);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:917:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:921:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:922:1: ( ']' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:922:1: ( ']' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:923:1: ']'
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl1866); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:936:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:940:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:941:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__51897);
            rule__TypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__51900);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:948:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:952:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:953:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:953:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:954:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:955:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:955:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__ValuesAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl1927);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:965:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:969:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:970:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__61957);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:976:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:980:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:981:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:981:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:982:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:983:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:983:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl1984);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1007:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1011:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1012:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__02029);
            rule__TypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__02032);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1019:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1023:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1024:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1024:1: ( ',' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1025:1: ','
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl2060); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1038:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1042:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1043:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__12091);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1049:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1053:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1054:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1054:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1055:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1056:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1056:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl2118);
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


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1070:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1074:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1075:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__0__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__02152);
            rule__QuotedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__1_in_rule__QuotedKeyStringValueAnnotation__Group__02155);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1082:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1086:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1087:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1087:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1088:1: '@'
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QuotedKeyStringValueAnnotation__Group__0__Impl2183); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1101:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1105:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1106:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__1__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__12214);
            rule__QuotedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__2_in_rule__QuotedKeyStringValueAnnotation__Group__12217);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1113:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1117:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1118:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1118:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1119:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1120:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1120:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__NameAssignment_1_in_rule__QuotedKeyStringValueAnnotation__Group__1__Impl2244);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1130:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1134:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1135:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__2__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__22274);
            rule__QuotedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__3_in_rule__QuotedKeyStringValueAnnotation__Group__22277);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1142:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1146:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1147:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1147:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1148:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1149:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1149:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2_in_rule__QuotedKeyStringValueAnnotation__Group__2__Impl2304);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1159:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1163:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1164:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__3__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__32334);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1170:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1174:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1175:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1175:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1176:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1177:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1177:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__0_in_rule__QuotedKeyStringValueAnnotation__Group__3__Impl2361);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1195:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1199:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1200:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl_in_rule__QuotedKeyStringValueAnnotation__Group_3__02400);
            rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__1_in_rule__QuotedKeyStringValueAnnotation__Group_3__02403);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1207:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1211:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1212:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1212:1: ( ',' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1213:1: ','
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl2431); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1226:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1230:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1231:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl_in_rule__QuotedKeyStringValueAnnotation__Group_3__12462);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1237:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1241:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1242:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1242:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1243:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1244:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1244:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1_in_rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl2489);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1258:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1262:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1263:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__02523);
            rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__1_in_rule__QuotedTypedKeyStringValueAnnotation__Group__02526);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1270:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1274:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1275:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1275:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1276:1: '@'
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl2554); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1289:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1293:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1294:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__12585);
            rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__2_in_rule__QuotedTypedKeyStringValueAnnotation__Group__12588);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1301:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1305:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1306:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1306:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1307:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1308:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1308:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1_in_rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl2615);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1318:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1322:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1323:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__22645);
            rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__3_in_rule__QuotedTypedKeyStringValueAnnotation__Group__22648);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1330:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1334:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1335:1: ( '[' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1335:1: ( '[' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1336:1: '['
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl2676); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1349:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1353:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1354:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__32707);
            rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__4_in_rule__QuotedTypedKeyStringValueAnnotation__Group__32710);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1361:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1365:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1366:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1366:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1367:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1368:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1368:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl2737);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1378:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1382:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1383:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__42767);
            rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__5_in_rule__QuotedTypedKeyStringValueAnnotation__Group__42770);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1390:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1394:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1395:1: ( ']' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1395:1: ( ']' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1396:1: ']'
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl2798); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1409:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1413:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1414:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__52829);
            rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__6_in_rule__QuotedTypedKeyStringValueAnnotation__Group__52832);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1421:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1425:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1426:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1426:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1427:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1428:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1428:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5_in_rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl2859);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1438:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1442:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1443:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__62889);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1449:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1453:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1454:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1454:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1455:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1456:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1456:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0_in_rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl2916);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1480:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1484:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1485:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__02961);
            rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__02964);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1492:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1496:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1497:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1497:1: ( ',' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1498:1: ','
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl2992); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1511:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1515:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1516:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__13023);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1522:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1526:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1527:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1527:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1528:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1529:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1529:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl3050);
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


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1543:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1547:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1548:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__03084);
            rule__KeyBooleanValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__03087);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1555:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1559:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1560:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1560:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1561:1: '@'
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyBooleanValueAnnotation__Group__0__Impl3115); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1574:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1578:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1579:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__13146);
            rule__KeyBooleanValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__13149);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1586:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1590:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1591:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1591:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1592:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1593:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1593:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl3176);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1603:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1607:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1608:2: rule__KeyBooleanValueAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__23206);
            rule__KeyBooleanValueAnnotation__Group__2__Impl();

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1614:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1618:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1619:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1619:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1620:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1621:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1621:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl3233);
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


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1637:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1641:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1642:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__03269);
            rule__KeyIntValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__03272);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1649:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1653:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1654:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1654:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1655:1: '@'
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyIntValueAnnotation__Group__0__Impl3300); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1668:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1672:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1673:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__13331);
            rule__KeyIntValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__13334);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1680:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1684:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1685:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1685:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1686:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1687:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1687:2: rule__KeyIntValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl3361);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1697:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1701:1: ( rule__KeyIntValueAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1702:2: rule__KeyIntValueAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__23391);
            rule__KeyIntValueAnnotation__Group__2__Impl();

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1708:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1712:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1713:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1713:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1714:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1715:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1715:2: rule__KeyIntValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl3418);
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


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1731:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1735:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1736:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__03454);
            rule__KeyFloatValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__03457);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1743:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1747:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1748:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1748:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1749:1: '@'
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyFloatValueAnnotation__Group__0__Impl3485); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1762:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1766:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1767:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__13516);
            rule__KeyFloatValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__13519);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1774:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1778:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1779:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1779:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1780:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1781:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1781:2: rule__KeyFloatValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl3546);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1791:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1795:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1796:2: rule__KeyFloatValueAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__23576);
            rule__KeyFloatValueAnnotation__Group__2__Impl();

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1802:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1806:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1807:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1807:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1808:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1809:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1809:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl3603);
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


    // $ANTLR start "rule__ExtendedID__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1825:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1829:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1830:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__03639);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__03642);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1837:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1841:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1842:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1842:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1843:1: RULE_ID
            {
             before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl3669); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1854:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1858:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1859:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__13698);
            rule__ExtendedID__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__2_in_rule__ExtendedID__Group__13701);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1866:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1870:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1871:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1871:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1872:1: ( rule__ExtendedID__Group_1__0 )*
            {
             before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1873:1: ( rule__ExtendedID__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1873:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl3728);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1883:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1887:1: ( rule__ExtendedID__Group__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1888:2: rule__ExtendedID__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__2__Impl_in_rule__ExtendedID__Group__23759);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1894:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1898:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1899:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1899:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1900:1: ( rule__ExtendedID__Group_2__0 )?
            {
             before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1901:1: ( rule__ExtendedID__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1901:2: rule__ExtendedID__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_2__0_in_rule__ExtendedID__Group__2__Impl3786);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1917:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1921:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1922:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__03823);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__03826);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1929:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1933:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1934:1: ( '.' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1934:1: ( '.' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1935:1: '.'
            {
             before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ExtendedID__Group_1__0__Impl3854); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1948:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1952:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1953:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__13885);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1959:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1963:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1964:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1964:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1965:1: RULE_ID
            {
             before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl3912); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1980:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1984:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1985:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_2__0__Impl_in_rule__ExtendedID__Group_2__03945);
            rule__ExtendedID__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_2__1_in_rule__ExtendedID__Group_2__03948);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1992:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1996:1: ( ( '#' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1997:1: ( '#' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1997:1: ( '#' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1998:1: '#'
            {
             before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__ExtendedID__Group_2__0__Impl3976); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2011:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2015:1: ( rule__ExtendedID__Group_2__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2016:2: rule__ExtendedID__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_2__1__Impl_in_rule__ExtendedID__Group_2__14007);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2022:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2026:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2027:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2027:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2028:1: RULE_INT
            {
             before(grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__ExtendedID__Group_2__1__Impl4034); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2043:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2047:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2048:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__04067);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__04070);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2055:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2059:1: ( ( ( '-' )? ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2060:1: ( ( '-' )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2060:1: ( ( '-' )? )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2061:1: ( '-' )?
            {
             before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2062:1: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2063:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Integer__Group__0__Impl4099); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2074:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2078:1: ( rule__Integer__Group__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2079:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__14132);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2085:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2089:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2090:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2090:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2091:1: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Integer__Group__1__Impl4159); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2106:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2110:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2111:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Floateger__Group__0__Impl_in_rule__Floateger__Group__04192);
            rule__Floateger__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Floateger__Group__1_in_rule__Floateger__Group__04195);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2118:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2122:1: ( ( ( '-' )? ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2123:1: ( ( '-' )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2123:1: ( ( '-' )? )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2124:1: ( '-' )?
            {
             before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2125:1: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2126:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Floateger__Group__0__Impl4224); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2137:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2141:1: ( rule__Floateger__Group__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2142:2: rule__Floateger__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Floateger__Group__1__Impl_in_rule__Floateger__Group__14257);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2148:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2152:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2153:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2153:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2154:1: RULE_FLOAT
            {
             before(grammarAccess.getFloategerAccess().getFLOATTerminalRuleCall_1()); 
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__Floateger__Group__1__Impl4284); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2170:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2174:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2175:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2175:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2176:1: RULE_COMMENT_ANNOTATION
            {
             before(grammarAccess.getCommentAnnotationAccess().getValuesCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValuesAssignment4322); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2185:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2189:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2190:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2190:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2191:1: ruleExtendedID
            {
             before(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_14353);
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


    // $ANTLR start "rule__KeyStringValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2200:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2204:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2205:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2205:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2206:1: ruleExtendedID
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_14384);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2215:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2219:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2220:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2220:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2221:1: ruleEString
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValuesAssignment_24415);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2230:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2234:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2235:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2235:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2236:1: ruleEString
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValuesAssignment_3_14446);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2245:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2249:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2250:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2250:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2251:1: ruleExtendedID
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_14477);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2260:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2264:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2265:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2265:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2266:1: ruleExtendedID
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_34508);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2275:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEString ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2279:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2280:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2280:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2281:1: ruleEString
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValuesAssignment_54539);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_5_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2290:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEString ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2294:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2295:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2295:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2296:1: ruleEString
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_14570);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_6_1_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2305:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2309:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2310:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2310:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2311:1: ruleExtendedID
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__QuotedKeyStringValueAnnotation__NameAssignment_14601);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2320:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2324:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2325:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2325:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2326:1: RULE_STRING
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_24632); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2335:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2339:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2340:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2340:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2341:1: RULE_STRING
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_14663); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2350:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2354:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2355:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2355:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2356:1: ruleExtendedID
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_14694);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2365:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2369:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2370:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2370:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2371:1: ruleExtendedID
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_34725);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2380:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2384:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2385:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2385:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2386:1: RULE_STRING
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_54756); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2395:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2399:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2400:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2400:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2401:1: RULE_STRING
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_14787); 
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


    // $ANTLR start "rule__KeyBooleanValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2410:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2414:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2415:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2415:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2416:1: ruleExtendedID
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_14818);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2425:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2429:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2430:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2430:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2431:1: RULE_BOOLEAN
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_24849); 
             after(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2440:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2444:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2445:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2445:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2446:1: ruleExtendedID
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_14880);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2455:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2459:1: ( ( ruleInteger ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2460:1: ( ruleInteger )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2460:1: ( ruleInteger )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2461:1: ruleInteger
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__KeyIntValueAnnotation__ValueAssignment_24911);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2470:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2474:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2475:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2475:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2476:1: ruleExtendedID
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_14942);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2485:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( ruleFloateger ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2489:1: ( ( ruleFloateger ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2490:1: ( ruleFloateger )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2490:1: ( ruleFloateger )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2491:1: ruleFloateger
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_rule__KeyFloatValueAnnotation__ValueAssignment_24973);
            ruleFloateger();

            state._fsp--;

             after(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 

            }


            }

        }
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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\17\uffff";
    static final String DFA1_eofS =
        "\3\uffff\1\12\11\uffff\2\12";
    static final String DFA1_minS =
        "\1\10\1\uffff\1\5\1\4\1\5\2\6\6\uffff\2\4";
    static final String DFA1_maxS =
        "\1\17\1\uffff\1\5\1\25\1\5\1\6\1\7\6\uffff\2\25";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\5\uffff\1\5\1\4\1\6\1\7\1\3\1\2\2\uffff";
    static final String DFA1_specialS =
        "\17\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\6\uffff\1\2",
            "",
            "\1\3",
            "\2\13\1\7\1\11\1\uffff\1\14\7\uffff\1\10\1\uffff\1\4\1\5\1"+
            "\6",
            "\1\15",
            "\1\16",
            "\1\7\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\13\1\7\1\11\1\uffff\1\14\7\uffff\1\10\1\uffff\1\4\1\5\1"+
            "\6",
            "\2\13\1\7\1\11\1\uffff\1\14\7\uffff\1\10\3\uffff\1\6"
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
            return "456:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) | ( ruleTagAnnotation ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation125 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CommentAnnotation__ValuesAssignment_in_ruleCommentAnnotation158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation185 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation365 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__0_in_ruleQuotedKeyStringValueAnnotation398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__0_in_ruleQuotedTypedKeyStringValueAnnotation458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation545 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__Group__0_in_ruleInteger818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloateger_in_entryRuleFloateger845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloateger852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Floateger__Group__0_in_ruleFloateger878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives1016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__EString__Alternatives1067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__01097 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__01100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TagAnnotation__Group__0__Impl1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__11159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl1186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__01220 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__01223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyStringValueAnnotation__Group__0__Impl1251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__11282 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__11285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl1312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__21342 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__21345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValuesAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl1372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__31402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl1429 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__01468 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__01471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeyStringValueAnnotation__Group_3__0__Impl1499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__11530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValuesAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl1557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__01591 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__01594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl1622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__11653 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__11656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl1683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__21713 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__21716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl1744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__31775 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__31778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl1805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__41835 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__41838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl1866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__51897 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__51900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValuesAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl1927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__61957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl1984 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__02029 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__02032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl2060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__12091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl2118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__0__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__02152 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__1_in_rule__QuotedKeyStringValueAnnotation__Group__02155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QuotedKeyStringValueAnnotation__Group__0__Impl2183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__1__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__12214 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__2_in_rule__QuotedKeyStringValueAnnotation__Group__12217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__NameAssignment_1_in_rule__QuotedKeyStringValueAnnotation__Group__1__Impl2244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__2__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__22274 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__3_in_rule__QuotedKeyStringValueAnnotation__Group__22277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2_in_rule__QuotedKeyStringValueAnnotation__Group__2__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__3__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__32334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__0_in_rule__QuotedKeyStringValueAnnotation__Group__3__Impl2361 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl_in_rule__QuotedKeyStringValueAnnotation__Group_3__02400 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__1_in_rule__QuotedKeyStringValueAnnotation__Group_3__02403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl2431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl_in_rule__QuotedKeyStringValueAnnotation__Group_3__12462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1_in_rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__02523 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__1_in_rule__QuotedTypedKeyStringValueAnnotation__Group__02526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl2554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__12585 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__2_in_rule__QuotedTypedKeyStringValueAnnotation__Group__12588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1_in_rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl2615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__22645 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__3_in_rule__QuotedTypedKeyStringValueAnnotation__Group__22648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl2676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__32707 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__4_in_rule__QuotedTypedKeyStringValueAnnotation__Group__32710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__42767 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__5_in_rule__QuotedTypedKeyStringValueAnnotation__Group__42770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl2798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__52829 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__6_in_rule__QuotedTypedKeyStringValueAnnotation__Group__52832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5_in_rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl2859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__62889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0_in_rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl2916 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__02961 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__02964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl2992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__13023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl3050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__03084 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__03087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyBooleanValueAnnotation__Group__0__Impl3115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__13146 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__13149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl3176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__23206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl3233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__03269 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__03272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyIntValueAnnotation__Group__0__Impl3300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__13331 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__13334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl3361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__23391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl3418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__03454 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__03457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyFloatValueAnnotation__Group__0__Impl3485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__13516 = new BitSet(new long[]{0x0000000000200080L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__13519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl3546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__23576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__03639 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__03642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl3669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__13698 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__2_in_rule__ExtendedID__Group__13701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl3728 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__2__Impl_in_rule__ExtendedID__Group__23759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_2__0_in_rule__ExtendedID__Group__2__Impl3786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__03823 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__03826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ExtendedID__Group_1__0__Impl3854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__13885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl3912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_2__0__Impl_in_rule__ExtendedID__Group_2__03945 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_2__1_in_rule__ExtendedID__Group_2__03948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ExtendedID__Group_2__0__Impl3976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_2__1__Impl_in_rule__ExtendedID__Group_2__14007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__ExtendedID__Group_2__1__Impl4034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__04067 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__04070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Integer__Group__0__Impl4099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__14132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Integer__Group__1__Impl4159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Floateger__Group__0__Impl_in_rule__Floateger__Group__04192 = new BitSet(new long[]{0x0000000000200080L});
        public static final BitSet FOLLOW_rule__Floateger__Group__1_in_rule__Floateger__Group__04195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Floateger__Group__0__Impl4224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Floateger__Group__1__Impl_in_rule__Floateger__Group__14257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Floateger__Group__1__Impl4284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValuesAssignment4322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_14353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_14384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValuesAssignment_24415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValuesAssignment_3_14446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_14477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_34508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValuesAssignment_54539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_14570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__QuotedKeyStringValueAnnotation__NameAssignment_14601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_24632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_14663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_14694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_34725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_54756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_14787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_14818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_24849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_14880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__KeyIntValueAnnotation__ValueAssignment_24911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_14942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloateger_in_rule__KeyFloatValueAnnotation__ValueAssignment_24973 = new BitSet(new long[]{0x0000000000000002L});
    }


}