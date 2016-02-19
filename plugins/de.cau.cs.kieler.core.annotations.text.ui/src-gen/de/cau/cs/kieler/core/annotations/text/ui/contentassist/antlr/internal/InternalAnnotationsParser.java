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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "','", "'['", "']'", "'.'", "'#'", "'-'"
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:94:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:95:1: ( ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:96:1: ruleCommentAnnotation EOF
            {
             before(grammarAccess.getCommentAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation127);
            ruleCommentAnnotation();

            state._fsp--;

             after(grammarAccess.getCommentAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation134); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:103:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValuesAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:107:2: ( ( ( rule__CommentAnnotation__ValuesAssignment ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:108:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:108:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:109:1: ( rule__CommentAnnotation__ValuesAssignment )
            {
             before(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:110:1: ( rule__CommentAnnotation__ValuesAssignment )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:110:2: rule__CommentAnnotation__ValuesAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__CommentAnnotation__ValuesAssignment_in_ruleCommentAnnotation160);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:122:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:123:1: ( ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:124:1: ruleTagAnnotation EOF
            {
             before(grammarAccess.getTagAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation187);
            ruleTagAnnotation();

            state._fsp--;

             after(grammarAccess.getTagAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation194); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:131:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:135:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:136:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:136:1: ( ( rule__TagAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:137:1: ( rule__TagAnnotation__Group__0 )
            {
             before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:138:1: ( rule__TagAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:138:2: rule__TagAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation220);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:150:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:151:1: ( ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:152:1: ruleKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation247);
            ruleKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation254); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:159:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:163:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:164:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:164:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:165:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:166:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:166:2: rule__KeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation280);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:178:1: entryRuleRestrictedKeyStringValueAnnotation : ruleRestrictedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:179:1: ( ruleRestrictedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:180:1: ruleRestrictedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRestrictedKeyStringValueAnnotation_in_entryRuleRestrictedKeyStringValueAnnotation307);
            ruleRestrictedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getRestrictedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRestrictedKeyStringValueAnnotation314); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:187:1: ruleRestrictedKeyStringValueAnnotation : ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:191:2: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:192:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:192:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:193:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:194:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:194:2: rule__RestrictedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__0_in_ruleRestrictedKeyStringValueAnnotation340);
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


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:206:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:207:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:208:1: ruleTypedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation367);
            ruleTypedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation374); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:215:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:219:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:220:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:220:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:221:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:222:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:222:2: rule__TypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation400);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:234:1: entryRuleRestrictedTypedKeyStringValueAnnotation : ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:235:1: ( ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:236:1: ruleRestrictedTypedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRestrictedTypedKeyStringValueAnnotation_in_entryRuleRestrictedTypedKeyStringValueAnnotation427);
            ruleRestrictedTypedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRestrictedTypedKeyStringValueAnnotation434); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:243:1: ruleRestrictedTypedKeyStringValueAnnotation : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:247:2: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:248:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:248:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:249:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:250:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:250:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__0_in_ruleRestrictedTypedKeyStringValueAnnotation460);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:262:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:263:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:264:1: ruleQuotedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation487);
            ruleQuotedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation494); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:271:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:275:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:276:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:276:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:277:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:278:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:278:2: rule__QuotedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__0_in_ruleQuotedKeyStringValueAnnotation520);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:290:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:291:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:292:1: ruleQuotedTypedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation547);
            ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation554); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:299:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:303:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:304:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:304:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:305:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:306:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:306:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__0_in_ruleQuotedTypedKeyStringValueAnnotation580);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:320:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:321:1: ( ruleEStringBoolean EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:322:1: ruleEStringBoolean EOF
            {
             before(grammarAccess.getEStringBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_entryRuleEStringBoolean609);
            ruleEStringBoolean();

            state._fsp--;

             after(grammarAccess.getEStringBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEStringBoolean616); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:329:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:333:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:334:1: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:334:1: ( ( rule__EStringBoolean__Alternatives ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:335:1: ( rule__EStringBoolean__Alternatives )
            {
             before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:336:1: ( rule__EStringBoolean__Alternatives )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:336:2: rule__EStringBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EStringBoolean__Alternatives_in_ruleEStringBoolean642);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:348:1: entryRuleEStringAllTypes : ruleEStringAllTypes EOF ;
    public final void entryRuleEStringAllTypes() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:349:1: ( ruleEStringAllTypes EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:350:1: ruleEStringAllTypes EOF
            {
             before(grammarAccess.getEStringAllTypesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringAllTypes_in_entryRuleEStringAllTypes669);
            ruleEStringAllTypes();

            state._fsp--;

             after(grammarAccess.getEStringAllTypesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEStringAllTypes676); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:357:1: ruleEStringAllTypes : ( ( rule__EStringAllTypes__Alternatives ) ) ;
    public final void ruleEStringAllTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:361:2: ( ( ( rule__EStringAllTypes__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:362:1: ( ( rule__EStringAllTypes__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:362:1: ( ( rule__EStringAllTypes__Alternatives ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:363:1: ( rule__EStringAllTypes__Alternatives )
            {
             before(grammarAccess.getEStringAllTypesAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:364:1: ( rule__EStringAllTypes__Alternatives )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:364:2: rule__EStringAllTypes__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EStringAllTypes__Alternatives_in_ruleEStringAllTypes702);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:376:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:377:1: ( ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:378:1: ruleExtendedID EOF
            {
             before(grammarAccess.getExtendedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID729);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getExtendedIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID736); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:385:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:389:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:390:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:390:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:391:1: ( rule__ExtendedID__Group__0 )
            {
             before(grammarAccess.getExtendedIDAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:392:1: ( rule__ExtendedID__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:392:2: rule__ExtendedID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID762);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:406:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:407:1: ( ruleInteger EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:408:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger791);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger798); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:415:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:419:2: ( ( ( rule__Integer__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:420:1: ( ( rule__Integer__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:420:1: ( ( rule__Integer__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:421:1: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:422:1: ( rule__Integer__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:422:2: rule__Integer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Integer__Group__0_in_ruleInteger824);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:434:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:435:1: ( ruleFloateger EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:436:1: ruleFloateger EOF
            {
             before(grammarAccess.getFloategerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_entryRuleFloateger851);
            ruleFloateger();

            state._fsp--;

             after(grammarAccess.getFloategerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloateger858); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:443:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:447:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:448:1: ( ( rule__Floateger__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:448:1: ( ( rule__Floateger__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:449:1: ( rule__Floateger__Group__0 )
            {
             before(grammarAccess.getFloategerAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:450:1: ( rule__Floateger__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:450:2: rule__Floateger__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Floateger__Group__0_in_ruleFloateger884);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:462:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleTagAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:466:1: ( ( ruleCommentAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleTagAnnotation ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:467:1: ( ruleCommentAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:467:1: ( ruleCommentAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:468:1: ruleCommentAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives920);
                    ruleCommentAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:473:6: ( ruleKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:473:6: ( ruleKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:474:1: ruleKeyStringValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives937);
                    ruleKeyStringValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:479:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:479:6: ( ruleTypedKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:480:1: ruleTypedKeyStringValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives954);
                    ruleTypedKeyStringValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:485:6: ( ruleTagAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:485:6: ( ruleTagAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:486:1: ruleTagAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives971);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:500:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:504:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
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
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:505:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:505:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:506:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EStringBoolean__Alternatives1007); 
                     after(grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:511:6: ( ruleExtendedID )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:511:6: ( ruleExtendedID )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:512:1: ruleExtendedID
                    {
                     before(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__EStringBoolean__Alternatives1024);
                    ruleExtendedID();

                    state._fsp--;

                     after(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:517:6: ( RULE_BOOLEAN )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:517:6: ( RULE_BOOLEAN )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:518:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getEStringBooleanAccess().getBOOLEANTerminalRuleCall_2()); 
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__EStringBoolean__Alternatives1041); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:528:1: rule__EStringAllTypes__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) );
    public final void rule__EStringAllTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:532:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( ruleInteger ) | ( ruleFloateger ) )
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
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:533:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:533:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:534:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EStringAllTypes__Alternatives1073); 
                     after(grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:539:6: ( ruleExtendedID )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:539:6: ( ruleExtendedID )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:540:1: ruleExtendedID
                    {
                     before(grammarAccess.getEStringAllTypesAccess().getExtendedIDParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__EStringAllTypes__Alternatives1090);
                    ruleExtendedID();

                    state._fsp--;

                     after(grammarAccess.getEStringAllTypesAccess().getExtendedIDParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:545:6: ( RULE_BOOLEAN )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:545:6: ( RULE_BOOLEAN )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:546:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__EStringAllTypes__Alternatives1107); 
                     after(grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:551:6: ( ruleInteger )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:551:6: ( ruleInteger )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:552:1: ruleInteger
                    {
                     before(grammarAccess.getEStringAllTypesAccess().getIntegerParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__EStringAllTypes__Alternatives1124);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getEStringAllTypesAccess().getIntegerParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:557:6: ( ruleFloateger )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:557:6: ( ruleFloateger )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:558:1: ruleFloateger
                    {
                     before(grammarAccess.getEStringAllTypesAccess().getFloategerParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_rule__EStringAllTypes__Alternatives1141);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:570:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:574:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:575:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__01171);
            rule__TagAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__01174);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:582:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:586:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:587:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:587:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:588:1: '@'
            {
             before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TagAnnotation__Group__0__Impl1202); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:601:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:605:1: ( rule__TagAnnotation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:606:2: rule__TagAnnotation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__11233);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:612:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:616:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:617:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:617:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:618:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:619:1: ( rule__TagAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:619:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl1260);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:633:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:637:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:638:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__01294);
            rule__KeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__01297);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:645:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:649:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:650:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:650:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:651:1: '@'
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyStringValueAnnotation__Group__0__Impl1325); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:664:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:668:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:669:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__11356);
            rule__KeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__11359);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:676:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:680:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:681:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:681:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:682:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:683:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:683:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl1386);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:693:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:697:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:698:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__21416);
            rule__KeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__21419);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:705:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:709:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:710:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:710:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:711:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:712:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:712:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__ValuesAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl1446);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:722:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:726:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:727:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__31476);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:733:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:737:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:738:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:738:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:739:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:740:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:740:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl1503);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:758:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:762:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:763:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__01542);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__01545);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:770:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:774:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:775:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:775:1: ( ',' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:776:1: ','
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeyStringValueAnnotation__Group_3__0__Impl1573); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:789:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:793:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:794:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__11604);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:800:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:804:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:805:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:805:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:806:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:807:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:807:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__ValuesAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl1631);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:821:1: rule__RestrictedKeyStringValueAnnotation__Group__0 : rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:825:1: ( rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:826:2: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__0__Impl_in_rule__RestrictedKeyStringValueAnnotation__Group__01665);
            rule__RestrictedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__1_in_rule__RestrictedKeyStringValueAnnotation__Group__01668);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:833:1: rule__RestrictedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:837:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:838:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:838:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:839:1: '@'
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__RestrictedKeyStringValueAnnotation__Group__0__Impl1696); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:852:1: rule__RestrictedKeyStringValueAnnotation__Group__1 : rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:856:1: ( rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:857:2: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__1__Impl_in_rule__RestrictedKeyStringValueAnnotation__Group__11727);
            rule__RestrictedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__2_in_rule__RestrictedKeyStringValueAnnotation__Group__11730);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:864:1: rule__RestrictedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:868:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:869:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:869:1: ( ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:870:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:871:1: ( rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:871:2: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedKeyStringValueAnnotation__NameAssignment_1_in_rule__RestrictedKeyStringValueAnnotation__Group__1__Impl1757);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:881:1: rule__RestrictedKeyStringValueAnnotation__Group__2 : rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:885:1: ( rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:886:2: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__2__Impl_in_rule__RestrictedKeyStringValueAnnotation__Group__21787);
            rule__RestrictedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__3_in_rule__RestrictedKeyStringValueAnnotation__Group__21790);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:893:1: rule__RestrictedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:897:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:898:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:898:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:899:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:900:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:900:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2_in_rule__RestrictedKeyStringValueAnnotation__Group__2__Impl1817);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:910:1: rule__RestrictedKeyStringValueAnnotation__Group__3 : rule__RestrictedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:914:1: ( rule__RestrictedKeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:915:2: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__3__Impl_in_rule__RestrictedKeyStringValueAnnotation__Group__31847);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:921:1: rule__RestrictedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:925:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:926:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:926:1: ( ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:927:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:928:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:928:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group_3__0_in_rule__RestrictedKeyStringValueAnnotation__Group__3__Impl1874);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:946:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0 : rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:950:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:951:2: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl rule__RestrictedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl_in_rule__RestrictedKeyStringValueAnnotation__Group_3__01913);
            rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group_3__1_in_rule__RestrictedKeyStringValueAnnotation__Group_3__01916);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:958:1: rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:962:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:963:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:963:1: ( ',' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:964:1: ','
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl1944); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:977:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1 : rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:981:1: ( rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:982:2: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl_in_rule__RestrictedKeyStringValueAnnotation__Group_3__11975);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:988:1: rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:992:1: ( ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:993:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:993:1: ( ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:994:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:995:1: ( rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:995:2: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1_in_rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl2002);
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


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1009:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1013:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1014:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__02036);
            rule__TypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__02039);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1021:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1025:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1026:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1026:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1027:1: '@'
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl2067); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1040:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1044:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1045:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__12098);
            rule__TypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__12101);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1052:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1056:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1057:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1057:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1058:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1059:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1059:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl2128);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1069:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1073:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1074:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__22158);
            rule__TypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__22161);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1081:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1085:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1086:1: ( '[' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1086:1: ( '[' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1087:1: '['
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl2189); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1100:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1104:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1105:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__32220);
            rule__TypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__32223);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1112:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1116:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1117:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1117:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1118:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1119:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1119:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl2250);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1129:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1133:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1134:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__42280);
            rule__TypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__42283);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1141:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1145:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1146:1: ( ']' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1146:1: ( ']' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1147:1: ']'
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl2311); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1160:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1164:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1165:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__52342);
            rule__TypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__52345);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1172:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1176:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1177:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1177:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1178:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1179:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1179:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__ValuesAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl2372);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1189:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1193:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1194:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__62402);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1200:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1204:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1205:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1205:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1206:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1207:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1207:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl2429);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1231:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1235:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1236:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__02474);
            rule__TypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__02477);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1243:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1247:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1248:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1248:1: ( ',' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1249:1: ','
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl2505); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1262:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1266:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1267:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__12536);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1273:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1277:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1278:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1278:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1279:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1280:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1280:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl2563);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1294:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1298:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1299:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__02597);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__1_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__02600);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1306:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1310:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1311:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1311:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1312:1: '@'
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl2628); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1325:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1329:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1330:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__12659);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__2_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__12662);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1337:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1341:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1342:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1342:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1343:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1344:1: ( rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1344:2: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl2689);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1354:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2 : rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1358:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1359:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__22719);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__3_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__22722);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1366:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1370:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1371:1: ( '[' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1371:1: ( '[' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1372:1: '['
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl2750); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1385:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3 : rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1389:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1390:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__32781);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__4_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__32784);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1397:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1401:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1402:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1402:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1403:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1404:1: ( rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1404:2: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl2811);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1414:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4 : rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1418:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1419:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__42841);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__5_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__42844);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1426:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1430:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1431:1: ( ']' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1431:1: ( ']' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1432:1: ']'
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl2872); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1445:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5 : rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1449:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1450:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__52903);
            rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__6_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__52906);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1457:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1461:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1462:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1462:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1463:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1464:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1464:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl2933);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1474:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6 : rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1478:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1479:2: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__62963);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1485:1: rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1489:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1490:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1490:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1491:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1492:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1492:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl2990);
            	    rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1516:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1520:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1521:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__03035);
            rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1_in_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__03038);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1528:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1532:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1533:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1533:1: ( ',' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1534:1: ','
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl3066); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1547:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1 : rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1551:1: ( rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1552:2: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__13097);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1558:1: rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1562:1: ( ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1563:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1563:1: ( ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1564:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1565:1: ( rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1565:2: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1_in_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl3124);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1579:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1583:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1584:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__0__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__03158);
            rule__QuotedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__1_in_rule__QuotedKeyStringValueAnnotation__Group__03161);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1591:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1595:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1596:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1596:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1597:1: '@'
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QuotedKeyStringValueAnnotation__Group__0__Impl3189); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1610:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1614:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1615:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__1__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__13220);
            rule__QuotedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__2_in_rule__QuotedKeyStringValueAnnotation__Group__13223);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1622:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1626:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1627:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1627:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1628:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1629:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1629:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__NameAssignment_1_in_rule__QuotedKeyStringValueAnnotation__Group__1__Impl3250);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1639:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1643:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1644:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__2__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__23280);
            rule__QuotedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__3_in_rule__QuotedKeyStringValueAnnotation__Group__23283);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1651:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1655:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1656:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1656:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1657:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1658:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1658:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2_in_rule__QuotedKeyStringValueAnnotation__Group__2__Impl3310);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1668:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1672:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1673:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__3__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__33340);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1679:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1683:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1684:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1684:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1685:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1686:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1686:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__0_in_rule__QuotedKeyStringValueAnnotation__Group__3__Impl3367);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1704:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1708:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1709:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl_in_rule__QuotedKeyStringValueAnnotation__Group_3__03406);
            rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__1_in_rule__QuotedKeyStringValueAnnotation__Group_3__03409);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1716:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1720:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1721:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1721:1: ( ',' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1722:1: ','
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl3437); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1735:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1739:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1740:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl_in_rule__QuotedKeyStringValueAnnotation__Group_3__13468);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1746:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1750:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1751:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1751:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1752:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1753:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1753:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1_in_rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl3495);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1767:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1771:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1772:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__03529);
            rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__1_in_rule__QuotedTypedKeyStringValueAnnotation__Group__03532);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1779:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1783:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1784:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1784:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1785:1: '@'
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl3560); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1798:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1802:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1803:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__13591);
            rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__2_in_rule__QuotedTypedKeyStringValueAnnotation__Group__13594);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1810:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1814:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1815:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1815:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1816:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1817:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1817:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1_in_rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl3621);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1827:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1831:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1832:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__23651);
            rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__3_in_rule__QuotedTypedKeyStringValueAnnotation__Group__23654);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1839:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1843:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1844:1: ( '[' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1844:1: ( '[' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1845:1: '['
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl3682); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1858:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1862:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1863:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__33713);
            rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__4_in_rule__QuotedTypedKeyStringValueAnnotation__Group__33716);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1870:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1874:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1875:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1875:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1876:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1877:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1877:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl3743);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1887:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1891:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1892:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__43773);
            rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__5_in_rule__QuotedTypedKeyStringValueAnnotation__Group__43776);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1899:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1903:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1904:1: ( ']' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1904:1: ( ']' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1905:1: ']'
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl3804); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1918:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1922:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1923:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__53835);
            rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__6_in_rule__QuotedTypedKeyStringValueAnnotation__Group__53838);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1930:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1934:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1935:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1935:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1936:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1937:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1937:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5_in_rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl3865);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1947:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1951:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1952:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__63895);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1958:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1962:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1963:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1963:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1964:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1965:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1965:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0_in_rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl3922);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1989:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1993:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1994:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__03967);
            rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__03970);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2001:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2005:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2006:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2006:1: ( ',' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2007:1: ','
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl3998); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2020:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2024:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2025:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__14029);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2031:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2035:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2036:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2036:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2037:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2038:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2038:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl4056);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2052:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2056:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2057:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__04090);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__04093);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2064:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2068:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2069:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2069:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2070:1: RULE_ID
            {
             before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl4120); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2081:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2085:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2086:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__14149);
            rule__ExtendedID__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__2_in_rule__ExtendedID__Group__14152);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2093:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2097:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2098:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2098:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2099:1: ( rule__ExtendedID__Group_1__0 )*
            {
             before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2100:1: ( rule__ExtendedID__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2100:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl4179);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2110:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2114:1: ( rule__ExtendedID__Group__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2115:2: rule__ExtendedID__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__2__Impl_in_rule__ExtendedID__Group__24210);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2121:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2125:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2126:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2126:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2127:1: ( rule__ExtendedID__Group_2__0 )?
            {
             before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2128:1: ( rule__ExtendedID__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2128:2: rule__ExtendedID__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_2__0_in_rule__ExtendedID__Group__2__Impl4237);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2144:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2148:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2149:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__04274);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__04277);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2156:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2160:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2161:1: ( '.' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2161:1: ( '.' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2162:1: '.'
            {
             before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ExtendedID__Group_1__0__Impl4305); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2175:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2179:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2180:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__14336);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2186:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2190:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2191:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2191:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2192:1: RULE_ID
            {
             before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl4363); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2207:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2211:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2212:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_2__0__Impl_in_rule__ExtendedID__Group_2__04396);
            rule__ExtendedID__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_2__1_in_rule__ExtendedID__Group_2__04399);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2219:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2223:1: ( ( '#' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2224:1: ( '#' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2224:1: ( '#' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2225:1: '#'
            {
             before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__ExtendedID__Group_2__0__Impl4427); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2238:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2242:1: ( rule__ExtendedID__Group_2__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2243:2: rule__ExtendedID__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_2__1__Impl_in_rule__ExtendedID__Group_2__14458);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2249:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2253:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2254:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2254:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2255:1: RULE_INT
            {
             before(grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__ExtendedID__Group_2__1__Impl4485); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2272:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2276:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2277:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__04520);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__04523);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2284:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2288:1: ( ( ( '-' )? ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2289:1: ( ( '-' )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2289:1: ( ( '-' )? )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2290:1: ( '-' )?
            {
             before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2291:1: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2292:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Integer__Group__0__Impl4552); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2303:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2307:1: ( rule__Integer__Group__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2308:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__14585);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2314:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2318:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2319:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2319:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2320:1: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Integer__Group__1__Impl4612); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2335:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2339:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2340:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Floateger__Group__0__Impl_in_rule__Floateger__Group__04645);
            rule__Floateger__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Floateger__Group__1_in_rule__Floateger__Group__04648);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2347:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2351:1: ( ( ( '-' )? ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2352:1: ( ( '-' )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2352:1: ( ( '-' )? )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2353:1: ( '-' )?
            {
             before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2354:1: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2355:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Floateger__Group__0__Impl4677); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2366:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2370:1: ( rule__Floateger__Group__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2371:2: rule__Floateger__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Floateger__Group__1__Impl_in_rule__Floateger__Group__14710);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2377:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2381:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2382:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2382:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2383:1: RULE_FLOAT
            {
             before(grammarAccess.getFloategerAccess().getFLOATTerminalRuleCall_1()); 
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__Floateger__Group__1__Impl4737); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2399:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2403:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2404:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2404:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2405:1: RULE_COMMENT_ANNOTATION
            {
             before(grammarAccess.getCommentAnnotationAccess().getValuesCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValuesAssignment4775); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2414:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2418:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2419:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2419:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2420:1: ruleExtendedID
            {
             before(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_14806);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2429:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2433:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2434:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2434:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2435:1: ruleExtendedID
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_14837);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2444:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2448:1: ( ( ruleEStringAllTypes ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2449:1: ( ruleEStringAllTypes )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2449:1: ( ruleEStringAllTypes )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2450:1: ruleEStringAllTypes
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringAllTypes_in_rule__KeyStringValueAnnotation__ValuesAssignment_24868);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2459:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringAllTypes ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2463:1: ( ( ruleEStringAllTypes ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2464:1: ( ruleEStringAllTypes )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2464:1: ( ruleEStringAllTypes )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2465:1: ruleEStringAllTypes
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringAllTypes_in_rule__KeyStringValueAnnotation__ValuesAssignment_3_14899);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2474:1: rule__RestrictedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2478:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2479:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2479:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2480:1: ruleExtendedID
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__RestrictedKeyStringValueAnnotation__NameAssignment_14930);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2489:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2493:1: ( ( ruleEStringBoolean ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2494:1: ( ruleEStringBoolean )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2494:1: ( ruleEStringBoolean )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2495:1: ruleEStringBoolean
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_24961);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2504:1: rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2508:1: ( ( ruleEStringBoolean ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2509:1: ( ruleEStringBoolean )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2509:1: ( ruleEStringBoolean )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2510:1: ruleEStringBoolean
            {
             before(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_14992);
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


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2519:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2523:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2524:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2524:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2525:1: ruleExtendedID
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_15023);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2534:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2538:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2539:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2539:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2540:1: ruleExtendedID
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_35054);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2549:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2553:1: ( ( ruleEStringAllTypes ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2554:1: ( ruleEStringAllTypes )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2554:1: ( ruleEStringAllTypes )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2555:1: ruleEStringAllTypes
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringAllTypes_in_rule__TypedKeyStringValueAnnotation__ValuesAssignment_55085);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2564:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringAllTypes ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2568:1: ( ( ruleEStringAllTypes ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2569:1: ( ruleEStringAllTypes )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2569:1: ( ruleEStringAllTypes )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2570:1: ruleEStringAllTypes
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringAllTypes_in_rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_15116);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2579:1: rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2583:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2584:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2584:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2585:1: ruleExtendedID
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_15147);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2594:1: rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2598:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2599:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2599:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2600:1: ruleExtendedID
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_35178);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2609:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2613:1: ( ( ruleEStringBoolean ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2614:1: ( ruleEStringBoolean )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2614:1: ( ruleEStringBoolean )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2615:1: ruleEStringBoolean
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_55209);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2624:1: rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2628:1: ( ( ruleEStringBoolean ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2629:1: ( ruleEStringBoolean )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2629:1: ( ruleEStringBoolean )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2630:1: ruleEStringBoolean
            {
             before(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_15240);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2639:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2643:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2644:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2644:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2645:1: ruleExtendedID
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__QuotedKeyStringValueAnnotation__NameAssignment_15271);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2654:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2658:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2659:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2659:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2660:1: RULE_STRING
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_25302); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2669:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2673:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2674:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2674:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2675:1: RULE_STRING
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_15333); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2684:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2688:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2689:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2689:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2690:1: ruleExtendedID
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_15364);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2699:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2703:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2704:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2704:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2705:1: ruleExtendedID
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_35395);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2714:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2718:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2719:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2719:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2720:1: RULE_STRING
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_55426); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2729:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2733:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2734:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2734:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2735:1: RULE_STRING
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_15457); 
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
    static final String DFA1_eotS =
        "\13\uffff";
    static final String DFA1_eofS =
        "\3\uffff\1\10\5\uffff\2\10";
    static final String DFA1_minS =
        "\1\11\1\uffff\1\6\1\4\1\6\1\7\3\uffff\2\4";
    static final String DFA1_maxS =
        "\1\17\1\uffff\1\6\1\25\1\6\1\7\3\uffff\2\25";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\1\3\1\4\2\uffff";
    static final String DFA1_specialS =
        "\13\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\5\uffff\1\2",
            "",
            "\1\3",
            "\5\6\10\uffff\1\7\1\uffff\1\4\1\5\1\6",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "\5\6\10\uffff\1\7\1\uffff\1\4\1\5\1\6",
            "\5\6\10\uffff\1\7\3\uffff\1\6"
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
            return "462:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleTagAnnotation ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CommentAnnotation__ValuesAssignment_in_ruleCommentAnnotation160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestrictedKeyStringValueAnnotation_in_entryRuleRestrictedKeyStringValueAnnotation307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRestrictedKeyStringValueAnnotation314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__0_in_ruleRestrictedKeyStringValueAnnotation340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestrictedTypedKeyStringValueAnnotation_in_entryRuleRestrictedTypedKeyStringValueAnnotation427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRestrictedTypedKeyStringValueAnnotation434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__0_in_ruleRestrictedTypedKeyStringValueAnnotation460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__0_in_ruleQuotedKeyStringValueAnnotation520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__0_in_ruleQuotedTypedKeyStringValueAnnotation580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_entryRuleEStringBoolean609 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEStringBoolean616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EStringBoolean__Alternatives_in_ruleEStringBoolean642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringAllTypes_in_entryRuleEStringAllTypes669 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEStringAllTypes676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EStringAllTypes__Alternatives_in_ruleEStringAllTypes702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID729 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger791 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__Group__0_in_ruleInteger824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloateger_in_entryRuleFloateger851 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloateger858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Floateger__Group__0_in_ruleFloateger884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EStringBoolean__Alternatives1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__EStringBoolean__Alternatives1024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__EStringBoolean__Alternatives1041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EStringAllTypes__Alternatives1073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__EStringAllTypes__Alternatives1090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__EStringAllTypes__Alternatives1107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__EStringAllTypes__Alternatives1124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloateger_in_rule__EStringAllTypes__Alternatives1141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__01171 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__01174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TagAnnotation__Group__0__Impl1202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__11233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl1260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__01294 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__01297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyStringValueAnnotation__Group__0__Impl1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__11356 = new BitSet(new long[]{0x00000000002001F0L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__11359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl1386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__21416 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__21419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValuesAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl1446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__31476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl1503 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__01542 = new BitSet(new long[]{0x00000000002001F0L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__01545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeyStringValueAnnotation__Group_3__0__Impl1573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__11604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValuesAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl1631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__0__Impl_in_rule__RestrictedKeyStringValueAnnotation__Group__01665 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__1_in_rule__RestrictedKeyStringValueAnnotation__Group__01668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__RestrictedKeyStringValueAnnotation__Group__0__Impl1696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__1__Impl_in_rule__RestrictedKeyStringValueAnnotation__Group__11727 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__2_in_rule__RestrictedKeyStringValueAnnotation__Group__11730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedKeyStringValueAnnotation__NameAssignment_1_in_rule__RestrictedKeyStringValueAnnotation__Group__1__Impl1757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__2__Impl_in_rule__RestrictedKeyStringValueAnnotation__Group__21787 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__3_in_rule__RestrictedKeyStringValueAnnotation__Group__21790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2_in_rule__RestrictedKeyStringValueAnnotation__Group__2__Impl1817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group__3__Impl_in_rule__RestrictedKeyStringValueAnnotation__Group__31847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group_3__0_in_rule__RestrictedKeyStringValueAnnotation__Group__3__Impl1874 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl_in_rule__RestrictedKeyStringValueAnnotation__Group_3__01913 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group_3__1_in_rule__RestrictedKeyStringValueAnnotation__Group_3__01916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__RestrictedKeyStringValueAnnotation__Group_3__0__Impl1944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl_in_rule__RestrictedKeyStringValueAnnotation__Group_3__11975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1_in_rule__RestrictedKeyStringValueAnnotation__Group_3__1__Impl2002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__02036 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__02039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__12098 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__12101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl2128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__22158 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__22161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl2189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__32220 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__32223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl2250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__42280 = new BitSet(new long[]{0x00000000002001F0L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__42283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl2311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__52342 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__52345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValuesAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl2372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__62402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl2429 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__02474 = new BitSet(new long[]{0x00000000002001F0L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__02477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl2505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__12536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl2563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__02597 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__1_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__02600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__0__Impl2628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__12659 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__2_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__12662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__1__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__22719 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__3_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__22722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__2__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__32781 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__4_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__32784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__3__Impl2811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__42841 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__5_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__42844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__4__Impl2872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__52903 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__6_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__52906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__5__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__62963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0_in_rule__RestrictedTypedKeyStringValueAnnotation__Group__6__Impl2990 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__03035 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1_in_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__03038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0__Impl3066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__13097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1_in_rule__RestrictedTypedKeyStringValueAnnotation__Group_6__1__Impl3124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__0__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__03158 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__1_in_rule__QuotedKeyStringValueAnnotation__Group__03161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QuotedKeyStringValueAnnotation__Group__0__Impl3189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__1__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__13220 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__2_in_rule__QuotedKeyStringValueAnnotation__Group__13223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__NameAssignment_1_in_rule__QuotedKeyStringValueAnnotation__Group__1__Impl3250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__2__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__23280 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__3_in_rule__QuotedKeyStringValueAnnotation__Group__23283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2_in_rule__QuotedKeyStringValueAnnotation__Group__2__Impl3310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__3__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__33340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__0_in_rule__QuotedKeyStringValueAnnotation__Group__3__Impl3367 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl_in_rule__QuotedKeyStringValueAnnotation__Group_3__03406 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__1_in_rule__QuotedKeyStringValueAnnotation__Group_3__03409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl3437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl_in_rule__QuotedKeyStringValueAnnotation__Group_3__13468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1_in_rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl3495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__03529 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__1_in_rule__QuotedTypedKeyStringValueAnnotation__Group__03532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl3560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__13591 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__2_in_rule__QuotedTypedKeyStringValueAnnotation__Group__13594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1_in_rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__23651 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__3_in_rule__QuotedTypedKeyStringValueAnnotation__Group__23654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl3682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__33713 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__4_in_rule__QuotedTypedKeyStringValueAnnotation__Group__33716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl3743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__43773 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__5_in_rule__QuotedTypedKeyStringValueAnnotation__Group__43776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__53835 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__6_in_rule__QuotedTypedKeyStringValueAnnotation__Group__53838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5_in_rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl3865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__63895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0_in_rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl3922 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__03967 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__03970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__14029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl4056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__04090 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__04093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl4120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__14149 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__2_in_rule__ExtendedID__Group__14152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl4179 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__2__Impl_in_rule__ExtendedID__Group__24210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_2__0_in_rule__ExtendedID__Group__2__Impl4237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__04274 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__04277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ExtendedID__Group_1__0__Impl4305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__14336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl4363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_2__0__Impl_in_rule__ExtendedID__Group_2__04396 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_2__1_in_rule__ExtendedID__Group_2__04399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ExtendedID__Group_2__0__Impl4427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_2__1__Impl_in_rule__ExtendedID__Group_2__14458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__ExtendedID__Group_2__1__Impl4485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__04520 = new BitSet(new long[]{0x0000000000200080L});
        public static final BitSet FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__04523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Integer__Group__0__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__14585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Integer__Group__1__Impl4612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Floateger__Group__0__Impl_in_rule__Floateger__Group__04645 = new BitSet(new long[]{0x00000000002001F0L});
        public static final BitSet FOLLOW_rule__Floateger__Group__1_in_rule__Floateger__Group__04648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Floateger__Group__0__Impl4677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Floateger__Group__1__Impl_in_rule__Floateger__Group__14710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Floateger__Group__1__Impl4737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValuesAssignment4775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_14806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_14837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringAllTypes_in_rule__KeyStringValueAnnotation__ValuesAssignment_24868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringAllTypes_in_rule__KeyStringValueAnnotation__ValuesAssignment_3_14899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__RestrictedKeyStringValueAnnotation__NameAssignment_14930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_24961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_14992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_15023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_35054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringAllTypes_in_rule__TypedKeyStringValueAnnotation__ValuesAssignment_55085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringAllTypes_in_rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_15116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_15147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_35178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_55209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_15240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__QuotedKeyStringValueAnnotation__NameAssignment_15271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_25302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_15333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_15364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_35395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_55426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_15457 = new BitSet(new long[]{0x0000000000000002L});
    }


}