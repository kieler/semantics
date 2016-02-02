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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "','", "'['", "']'", "':='", "'.'", "'#'", "'-'"
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:96:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:97:1: ( ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:98:1: ruleCommentAnnotation EOF
            {
             before(grammarAccess.getCommentAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation129);
            ruleCommentAnnotation();

            state._fsp--;

             after(grammarAccess.getCommentAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation136); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:105:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValuesAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:109:2: ( ( ( rule__CommentAnnotation__ValuesAssignment ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:110:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:110:1: ( ( rule__CommentAnnotation__ValuesAssignment ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:111:1: ( rule__CommentAnnotation__ValuesAssignment )
            {
             before(grammarAccess.getCommentAnnotationAccess().getValuesAssignment()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:112:1: ( rule__CommentAnnotation__ValuesAssignment )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:112:2: rule__CommentAnnotation__ValuesAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__CommentAnnotation__ValuesAssignment_in_ruleCommentAnnotation162);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:124:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:125:1: ( ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:126:1: ruleTagAnnotation EOF
            {
             before(grammarAccess.getTagAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation189);
            ruleTagAnnotation();

            state._fsp--;

             after(grammarAccess.getTagAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation196); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:133:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:137:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:138:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:138:1: ( ( rule__TagAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:139:1: ( rule__TagAnnotation__Group__0 )
            {
             before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:140:1: ( rule__TagAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:140:2: rule__TagAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation222);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:152:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:153:1: ( ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:154:1: ruleKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation249);
            ruleKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation256); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:161:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:165:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:166:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:166:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:167:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:168:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:168:2: rule__KeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation282);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:180:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:181:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:182:1: ruleTypedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation309);
            ruleTypedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation316); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:189:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:193:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:194:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:194:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:195:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:196:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:196:2: rule__TypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation342);
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


    // $ANTLR start "entryRulePropertyAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:208:1: entryRulePropertyAnnotation : rulePropertyAnnotation EOF ;
    public final void entryRulePropertyAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:209:1: ( rulePropertyAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:210:1: rulePropertyAnnotation EOF
            {
             before(grammarAccess.getPropertyAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePropertyAnnotation_in_entryRulePropertyAnnotation369);
            rulePropertyAnnotation();

            state._fsp--;

             after(grammarAccess.getPropertyAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyAnnotation376); 

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
    // $ANTLR end "entryRulePropertyAnnotation"


    // $ANTLR start "rulePropertyAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:217:1: rulePropertyAnnotation : ( ( rule__PropertyAnnotation__Group__0 ) ) ;
    public final void rulePropertyAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:221:2: ( ( ( rule__PropertyAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:222:1: ( ( rule__PropertyAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:222:1: ( ( rule__PropertyAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:223:1: ( rule__PropertyAnnotation__Group__0 )
            {
             before(grammarAccess.getPropertyAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:224:1: ( rule__PropertyAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:224:2: rule__PropertyAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyAnnotation__Group__0_in_rulePropertyAnnotation402);
            rule__PropertyAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:236:1: entryRuleQuotedKeyStringValueAnnotation : ruleQuotedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:237:1: ( ruleQuotedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:238:1: ruleQuotedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation429);
            ruleQuotedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation436); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:245:1: ruleQuotedKeyStringValueAnnotation : ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:249:2: ( ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:250:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:250:1: ( ( rule__QuotedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:251:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:252:1: ( rule__QuotedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:252:2: rule__QuotedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__0_in_ruleQuotedKeyStringValueAnnotation462);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:264:1: entryRuleQuotedTypedKeyStringValueAnnotation : ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:265:1: ( ruleQuotedTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:266:1: ruleQuotedTypedKeyStringValueAnnotation EOF
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation489);
            ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;

             after(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation496); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:273:1: ruleQuotedTypedKeyStringValueAnnotation : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:277:2: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:278:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:278:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:279:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:280:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:280:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__0_in_ruleQuotedTypedKeyStringValueAnnotation522);
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


    // $ANTLR start "entryRuleQuotedPropertyAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:292:1: entryRuleQuotedPropertyAnnotation : ruleQuotedPropertyAnnotation EOF ;
    public final void entryRuleQuotedPropertyAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:293:1: ( ruleQuotedPropertyAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:294:1: ruleQuotedPropertyAnnotation EOF
            {
             before(grammarAccess.getQuotedPropertyAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuotedPropertyAnnotation_in_entryRuleQuotedPropertyAnnotation549);
            ruleQuotedPropertyAnnotation();

            state._fsp--;

             after(grammarAccess.getQuotedPropertyAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuotedPropertyAnnotation556); 

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
    // $ANTLR end "entryRuleQuotedPropertyAnnotation"


    // $ANTLR start "ruleQuotedPropertyAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:301:1: ruleQuotedPropertyAnnotation : ( ( rule__QuotedPropertyAnnotation__Group__0 ) ) ;
    public final void ruleQuotedPropertyAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:305:2: ( ( ( rule__QuotedPropertyAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:306:1: ( ( rule__QuotedPropertyAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:306:1: ( ( rule__QuotedPropertyAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:307:1: ( rule__QuotedPropertyAnnotation__Group__0 )
            {
             before(grammarAccess.getQuotedPropertyAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:308:1: ( rule__QuotedPropertyAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:308:2: rule__QuotedPropertyAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedPropertyAnnotation__Group__0_in_ruleQuotedPropertyAnnotation582);
            rule__QuotedPropertyAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuotedPropertyAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuotedPropertyAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:320:1: entryRuleKeyBooleanValueAnnotation : ruleKeyBooleanValueAnnotation EOF ;
    public final void entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:321:1: ( ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:322:1: ruleKeyBooleanValueAnnotation EOF
            {
             before(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation609);
            ruleKeyBooleanValueAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation616); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:329:1: ruleKeyBooleanValueAnnotation : ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyBooleanValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:333:2: ( ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:334:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:334:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:335:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:336:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:336:2: rule__KeyBooleanValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation642);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:348:1: entryRuleKeyIntValueAnnotation : ruleKeyIntValueAnnotation EOF ;
    public final void entryRuleKeyIntValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:349:1: ( ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:350:1: ruleKeyIntValueAnnotation EOF
            {
             before(grammarAccess.getKeyIntValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation669);
            ruleKeyIntValueAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyIntValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation676); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:357:1: ruleKeyIntValueAnnotation : ( ( rule__KeyIntValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyIntValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:361:2: ( ( ( rule__KeyIntValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:362:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:362:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:363:1: ( rule__KeyIntValueAnnotation__Group__0 )
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:364:1: ( rule__KeyIntValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:364:2: rule__KeyIntValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation702);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:376:1: entryRuleKeyFloatValueAnnotation : ruleKeyFloatValueAnnotation EOF ;
    public final void entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:377:1: ( ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:378:1: ruleKeyFloatValueAnnotation EOF
            {
             before(grammarAccess.getKeyFloatValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation729);
            ruleKeyFloatValueAnnotation();

            state._fsp--;

             after(grammarAccess.getKeyFloatValueAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation736); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:385:1: ruleKeyFloatValueAnnotation : ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyFloatValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:389:2: ( ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:390:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:390:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:391:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:392:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:392:2: rule__KeyFloatValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation762);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:404:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:405:1: ( ruleEString EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:406:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString789);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString796); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:413:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:417:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:418:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:418:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:419:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:420:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:420:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString822);
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


    // $ANTLR start "entryRuleEStringBoolean"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:432:1: entryRuleEStringBoolean : ruleEStringBoolean EOF ;
    public final void entryRuleEStringBoolean() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:433:1: ( ruleEStringBoolean EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:434:1: ruleEStringBoolean EOF
            {
             before(grammarAccess.getEStringBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_entryRuleEStringBoolean849);
            ruleEStringBoolean();

            state._fsp--;

             after(grammarAccess.getEStringBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEStringBoolean856); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:441:1: ruleEStringBoolean : ( ( rule__EStringBoolean__Alternatives ) ) ;
    public final void ruleEStringBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:445:2: ( ( ( rule__EStringBoolean__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:446:1: ( ( rule__EStringBoolean__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:446:1: ( ( rule__EStringBoolean__Alternatives ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:447:1: ( rule__EStringBoolean__Alternatives )
            {
             before(grammarAccess.getEStringBooleanAccess().getAlternatives()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:448:1: ( rule__EStringBoolean__Alternatives )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:448:2: rule__EStringBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EStringBoolean__Alternatives_in_ruleEStringBoolean882);
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


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:460:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:461:1: ( ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:462:1: ruleExtendedID EOF
            {
             before(grammarAccess.getExtendedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID909);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getExtendedIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID916); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:469:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:473:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:474:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:474:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:475:1: ( rule__ExtendedID__Group__0 )
            {
             before(grammarAccess.getExtendedIDAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:476:1: ( rule__ExtendedID__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:476:2: rule__ExtendedID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID942);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:488:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:489:1: ( ruleInteger EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:490:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger969);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger976); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:497:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:501:2: ( ( ( rule__Integer__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:502:1: ( ( rule__Integer__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:502:1: ( ( rule__Integer__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:503:1: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:504:1: ( rule__Integer__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:504:2: rule__Integer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Integer__Group__0_in_ruleInteger1002);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:516:1: entryRuleFloateger : ruleFloateger EOF ;
    public final void entryRuleFloateger() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:517:1: ( ruleFloateger EOF )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:518:1: ruleFloateger EOF
            {
             before(grammarAccess.getFloategerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_entryRuleFloateger1029);
            ruleFloateger();

            state._fsp--;

             after(grammarAccess.getFloategerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloateger1036); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:525:1: ruleFloateger : ( ( rule__Floateger__Group__0 ) ) ;
    public final void ruleFloateger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:529:2: ( ( ( rule__Floateger__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:530:1: ( ( rule__Floateger__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:530:1: ( ( rule__Floateger__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:531:1: ( rule__Floateger__Group__0 )
            {
             before(grammarAccess.getFloategerAccess().getGroup()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:532:1: ( rule__Floateger__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:532:2: rule__Floateger__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Floateger__Group__0_in_ruleFloateger1062);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:544:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( rulePropertyAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) | ( ruleTagAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:548:1: ( ( ruleCommentAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( rulePropertyAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) | ( ruleTagAnnotation ) )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:549:1: ( ruleCommentAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:549:1: ( ruleCommentAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:550:1: ruleCommentAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives1098);
                    ruleCommentAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:555:6: ( ruleKeyBooleanValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:555:6: ( ruleKeyBooleanValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:556:1: ruleKeyBooleanValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives1115);
                    ruleKeyBooleanValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:561:6: ( ruleKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:561:6: ( ruleKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:562:1: ruleKeyStringValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives1132);
                    ruleKeyStringValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:567:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:567:6: ( ruleTypedKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:568:1: ruleTypedKeyStringValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives1149);
                    ruleTypedKeyStringValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:573:6: ( rulePropertyAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:573:6: ( rulePropertyAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:574:1: rulePropertyAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getPropertyAnnotationParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_rulePropertyAnnotation_in_rule__Annotation__Alternatives1166);
                    rulePropertyAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getPropertyAnnotationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:579:6: ( ruleKeyIntValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:579:6: ( ruleKeyIntValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:580:1: ruleKeyIntValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives1183);
                    ruleKeyIntValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:585:6: ( ruleKeyFloatValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:585:6: ( ruleKeyFloatValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:586:1: ruleKeyFloatValueAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives1200);
                    ruleKeyFloatValueAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:591:6: ( ruleTagAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:591:6: ( ruleTagAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:592:1: ruleTagAnnotation
                    {
                     before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives1217);
                    ruleTagAnnotation();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_7()); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:606:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:610:1: ( ( RULE_STRING ) | ( ruleExtendedID ) )
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
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:611:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:611:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:612:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1253); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:617:6: ( ruleExtendedID )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:617:6: ( ruleExtendedID )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:618:1: ruleExtendedID
                    {
                     before(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__EString__Alternatives1270);
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


    // $ANTLR start "rule__EStringBoolean__Alternatives"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:628:1: rule__EStringBoolean__Alternatives : ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) );
    public final void rule__EStringBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:632:1: ( ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:633:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:633:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:634:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EStringBoolean__Alternatives1302); 
                     after(grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:639:6: ( ruleExtendedID )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:639:6: ( ruleExtendedID )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:640:1: ruleExtendedID
                    {
                     before(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__EStringBoolean__Alternatives1319);
                    ruleExtendedID();

                    state._fsp--;

                     after(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:645:6: ( RULE_BOOLEAN )
                    {
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:645:6: ( RULE_BOOLEAN )
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:646:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getEStringBooleanAccess().getBOOLEANTerminalRuleCall_2()); 
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__EStringBoolean__Alternatives1336); 
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


    // $ANTLR start "rule__TagAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:658:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:662:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:663:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__01366);
            rule__TagAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__01369);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:670:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:674:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:675:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:675:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:676:1: '@'
            {
             before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TagAnnotation__Group__0__Impl1397); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:689:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:693:1: ( rule__TagAnnotation__Group__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:694:2: rule__TagAnnotation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__11428);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:700:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:704:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:705:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:705:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:706:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:707:1: ( rule__TagAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:707:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl1455);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:721:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:725:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:726:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__01489);
            rule__KeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__01492);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:733:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:737:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:738:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:738:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:739:1: '@'
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyStringValueAnnotation__Group__0__Impl1520); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:752:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:756:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:757:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__11551);
            rule__KeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__11554);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:764:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:768:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:769:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:769:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:770:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:771:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:771:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl1581);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:781:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:785:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:786:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__21611);
            rule__KeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__21614);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:793:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:797:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:798:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:798:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:799:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:800:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:800:2: rule__KeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__ValuesAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl1641);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:810:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:814:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:815:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__31671);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:821:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:825:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:826:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:826:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:827:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:828:1: ( rule__KeyStringValueAnnotation__Group_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:828:2: rule__KeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl1698);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:846:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:850:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:851:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__01737);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__01740);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:858:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:862:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:863:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:863:1: ( ',' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:864:1: ','
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeyStringValueAnnotation__Group_3__0__Impl1768); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:877:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:881:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:882:2: rule__KeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__11799);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:888:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:892:1: ( ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:893:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:893:1: ( ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:894:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:895:1: ( rule__KeyStringValueAnnotation__ValuesAssignment_3_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:895:2: rule__KeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__ValuesAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl1826);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:909:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:913:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:914:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__01860);
            rule__TypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__01863);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:921:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:925:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:926:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:926:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:927:1: '@'
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl1891); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:940:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:944:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:945:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__11922);
            rule__TypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__11925);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:952:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:956:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:957:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:957:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:958:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:959:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:959:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl1952);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:969:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:973:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:974:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__21982);
            rule__TypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__21985);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:981:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:985:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:986:1: ( '[' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:986:1: ( '[' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:987:1: '['
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl2013); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1000:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1004:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1005:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__32044);
            rule__TypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__32047);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1012:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1016:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1017:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1017:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1018:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1019:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1019:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl2074);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1029:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1033:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1034:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__42104);
            rule__TypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__42107);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1041:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1045:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1046:1: ( ']' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1046:1: ( ']' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1047:1: ']'
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl2135); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1060:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1064:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1065:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__52166);
            rule__TypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__52169);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1072:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1076:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1077:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1077:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1078:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1079:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1079:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__ValuesAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl2196);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1089:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1093:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1094:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__62226);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1100:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1104:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1105:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1105:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1106:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1107:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1107:2: rule__TypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl2253);
            	    rule__TypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1131:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1135:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1136:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__02298);
            rule__TypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__02301);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1143:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1147:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1148:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1148:1: ( ',' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1149:1: ','
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl2329); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1162:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1166:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1167:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__12360);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1173:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1177:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1178:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1178:1: ( ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1179:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1180:1: ( rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1180:2: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl2387);
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


    // $ANTLR start "rule__PropertyAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1194:1: rule__PropertyAnnotation__Group__0 : rule__PropertyAnnotation__Group__0__Impl rule__PropertyAnnotation__Group__1 ;
    public final void rule__PropertyAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1198:1: ( rule__PropertyAnnotation__Group__0__Impl rule__PropertyAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1199:2: rule__PropertyAnnotation__Group__0__Impl rule__PropertyAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyAnnotation__Group__0__Impl_in_rule__PropertyAnnotation__Group__02421);
            rule__PropertyAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PropertyAnnotation__Group__1_in_rule__PropertyAnnotation__Group__02424);
            rule__PropertyAnnotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAnnotation__Group__0"


    // $ANTLR start "rule__PropertyAnnotation__Group__0__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1206:1: rule__PropertyAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__PropertyAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1210:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1211:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1211:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1212:1: '@'
            {
             before(grammarAccess.getPropertyAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__PropertyAnnotation__Group__0__Impl2452); 
             after(grammarAccess.getPropertyAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAnnotation__Group__0__Impl"


    // $ANTLR start "rule__PropertyAnnotation__Group__1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1225:1: rule__PropertyAnnotation__Group__1 : rule__PropertyAnnotation__Group__1__Impl rule__PropertyAnnotation__Group__2 ;
    public final void rule__PropertyAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1229:1: ( rule__PropertyAnnotation__Group__1__Impl rule__PropertyAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1230:2: rule__PropertyAnnotation__Group__1__Impl rule__PropertyAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyAnnotation__Group__1__Impl_in_rule__PropertyAnnotation__Group__12483);
            rule__PropertyAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PropertyAnnotation__Group__2_in_rule__PropertyAnnotation__Group__12486);
            rule__PropertyAnnotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAnnotation__Group__1"


    // $ANTLR start "rule__PropertyAnnotation__Group__1__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1237:1: rule__PropertyAnnotation__Group__1__Impl : ( ( rule__PropertyAnnotation__NameAssignment_1 ) ) ;
    public final void rule__PropertyAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1241:1: ( ( ( rule__PropertyAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1242:1: ( ( rule__PropertyAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1242:1: ( ( rule__PropertyAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1243:1: ( rule__PropertyAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1244:1: ( rule__PropertyAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1244:2: rule__PropertyAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyAnnotation__NameAssignment_1_in_rule__PropertyAnnotation__Group__1__Impl2513);
            rule__PropertyAnnotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAnnotation__Group__1__Impl"


    // $ANTLR start "rule__PropertyAnnotation__Group__2"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1254:1: rule__PropertyAnnotation__Group__2 : rule__PropertyAnnotation__Group__2__Impl rule__PropertyAnnotation__Group__3 ;
    public final void rule__PropertyAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1258:1: ( rule__PropertyAnnotation__Group__2__Impl rule__PropertyAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1259:2: rule__PropertyAnnotation__Group__2__Impl rule__PropertyAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyAnnotation__Group__2__Impl_in_rule__PropertyAnnotation__Group__22543);
            rule__PropertyAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PropertyAnnotation__Group__3_in_rule__PropertyAnnotation__Group__22546);
            rule__PropertyAnnotation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAnnotation__Group__2"


    // $ANTLR start "rule__PropertyAnnotation__Group__2__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1266:1: rule__PropertyAnnotation__Group__2__Impl : ( ( rule__PropertyAnnotation__PropertyAssignment_2 ) ) ;
    public final void rule__PropertyAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1270:1: ( ( ( rule__PropertyAnnotation__PropertyAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1271:1: ( ( rule__PropertyAnnotation__PropertyAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1271:1: ( ( rule__PropertyAnnotation__PropertyAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1272:1: ( rule__PropertyAnnotation__PropertyAssignment_2 )
            {
             before(grammarAccess.getPropertyAnnotationAccess().getPropertyAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1273:1: ( rule__PropertyAnnotation__PropertyAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1273:2: rule__PropertyAnnotation__PropertyAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyAnnotation__PropertyAssignment_2_in_rule__PropertyAnnotation__Group__2__Impl2573);
            rule__PropertyAnnotation__PropertyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAnnotationAccess().getPropertyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAnnotation__Group__2__Impl"


    // $ANTLR start "rule__PropertyAnnotation__Group__3"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1283:1: rule__PropertyAnnotation__Group__3 : rule__PropertyAnnotation__Group__3__Impl rule__PropertyAnnotation__Group__4 ;
    public final void rule__PropertyAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1287:1: ( rule__PropertyAnnotation__Group__3__Impl rule__PropertyAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1288:2: rule__PropertyAnnotation__Group__3__Impl rule__PropertyAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyAnnotation__Group__3__Impl_in_rule__PropertyAnnotation__Group__32603);
            rule__PropertyAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PropertyAnnotation__Group__4_in_rule__PropertyAnnotation__Group__32606);
            rule__PropertyAnnotation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAnnotation__Group__3"


    // $ANTLR start "rule__PropertyAnnotation__Group__3__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1295:1: rule__PropertyAnnotation__Group__3__Impl : ( ':=' ) ;
    public final void rule__PropertyAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1299:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1300:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1300:1: ( ':=' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1301:1: ':='
            {
             before(grammarAccess.getPropertyAnnotationAccess().getColonEqualsSignKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PropertyAnnotation__Group__3__Impl2634); 
             after(grammarAccess.getPropertyAnnotationAccess().getColonEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAnnotation__Group__3__Impl"


    // $ANTLR start "rule__PropertyAnnotation__Group__4"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1314:1: rule__PropertyAnnotation__Group__4 : rule__PropertyAnnotation__Group__4__Impl ;
    public final void rule__PropertyAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1318:1: ( rule__PropertyAnnotation__Group__4__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1319:2: rule__PropertyAnnotation__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyAnnotation__Group__4__Impl_in_rule__PropertyAnnotation__Group__42665);
            rule__PropertyAnnotation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAnnotation__Group__4"


    // $ANTLR start "rule__PropertyAnnotation__Group__4__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1325:1: rule__PropertyAnnotation__Group__4__Impl : ( ( rule__PropertyAnnotation__ValueAssignment_4 ) ) ;
    public final void rule__PropertyAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1329:1: ( ( ( rule__PropertyAnnotation__ValueAssignment_4 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1330:1: ( ( rule__PropertyAnnotation__ValueAssignment_4 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1330:1: ( ( rule__PropertyAnnotation__ValueAssignment_4 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1331:1: ( rule__PropertyAnnotation__ValueAssignment_4 )
            {
             before(grammarAccess.getPropertyAnnotationAccess().getValueAssignment_4()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1332:1: ( rule__PropertyAnnotation__ValueAssignment_4 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1332:2: rule__PropertyAnnotation__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PropertyAnnotation__ValueAssignment_4_in_rule__PropertyAnnotation__Group__4__Impl2692);
            rule__PropertyAnnotation__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAnnotationAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAnnotation__Group__4__Impl"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1352:1: rule__QuotedKeyStringValueAnnotation__Group__0 : rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1356:1: ( rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1357:2: rule__QuotedKeyStringValueAnnotation__Group__0__Impl rule__QuotedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__0__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__02732);
            rule__QuotedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__1_in_rule__QuotedKeyStringValueAnnotation__Group__02735);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1364:1: rule__QuotedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1368:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1369:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1369:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1370:1: '@'
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QuotedKeyStringValueAnnotation__Group__0__Impl2763); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1383:1: rule__QuotedKeyStringValueAnnotation__Group__1 : rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1387:1: ( rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1388:2: rule__QuotedKeyStringValueAnnotation__Group__1__Impl rule__QuotedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__1__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__12794);
            rule__QuotedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__2_in_rule__QuotedKeyStringValueAnnotation__Group__12797);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1395:1: rule__QuotedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1399:1: ( ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1400:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1400:1: ( ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1401:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1402:1: ( rule__QuotedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1402:2: rule__QuotedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__NameAssignment_1_in_rule__QuotedKeyStringValueAnnotation__Group__1__Impl2824);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1412:1: rule__QuotedKeyStringValueAnnotation__Group__2 : rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1416:1: ( rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1417:2: rule__QuotedKeyStringValueAnnotation__Group__2__Impl rule__QuotedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__2__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__22854);
            rule__QuotedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__3_in_rule__QuotedKeyStringValueAnnotation__Group__22857);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1424:1: rule__QuotedKeyStringValueAnnotation__Group__2__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1428:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1429:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1429:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1430:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1431:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1431:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2_in_rule__QuotedKeyStringValueAnnotation__Group__2__Impl2884);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1441:1: rule__QuotedKeyStringValueAnnotation__Group__3 : rule__QuotedKeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1445:1: ( rule__QuotedKeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1446:2: rule__QuotedKeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__3__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__32914);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1452:1: rule__QuotedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1456:1: ( ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1457:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1457:1: ( ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1458:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1459:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1459:2: rule__QuotedKeyStringValueAnnotation__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__0_in_rule__QuotedKeyStringValueAnnotation__Group__3__Impl2941);
            	    rule__QuotedKeyStringValueAnnotation__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1477:1: rule__QuotedKeyStringValueAnnotation__Group_3__0 : rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1481:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1482:2: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl rule__QuotedKeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl_in_rule__QuotedKeyStringValueAnnotation__Group_3__02980);
            rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__1_in_rule__QuotedKeyStringValueAnnotation__Group_3__02983);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1489:1: rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1493:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1494:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1494:1: ( ',' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1495:1: ','
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl3011); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1508:1: rule__QuotedKeyStringValueAnnotation__Group_3__1 : rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1512:1: ( rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1513:2: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl_in_rule__QuotedKeyStringValueAnnotation__Group_3__13042);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1519:1: rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) ;
    public final void rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1523:1: ( ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1524:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1524:1: ( ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1525:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1526:1: ( rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1526:2: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1_in_rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl3069);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1540:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0 : rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1544:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1545:2: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__03103);
            rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__1_in_rule__QuotedTypedKeyStringValueAnnotation__Group__03106);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1552:1: rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1556:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1557:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1557:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1558:1: '@'
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl3134); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1571:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1 : rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1575:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1576:2: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__13165);
            rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__2_in_rule__QuotedTypedKeyStringValueAnnotation__Group__13168);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1583:1: rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1587:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1588:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1588:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1589:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1590:1: ( rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1590:2: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1_in_rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl3195);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1600:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2 : rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1604:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1605:2: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__23225);
            rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__3_in_rule__QuotedTypedKeyStringValueAnnotation__Group__23228);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1612:1: rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1616:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1617:1: ( '[' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1617:1: ( '[' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1618:1: '['
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl3256); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1631:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3 : rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1635:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1636:2: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__33287);
            rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__4_in_rule__QuotedTypedKeyStringValueAnnotation__Group__33290);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1643:1: rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1647:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1648:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1648:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1649:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1650:1: ( rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1650:2: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl3317);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1660:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4 : rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1664:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1665:2: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__43347);
            rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__5_in_rule__QuotedTypedKeyStringValueAnnotation__Group__43350);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1672:1: rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1676:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1677:1: ( ']' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1677:1: ( ']' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1678:1: ']'
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl3378); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1691:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5 : rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1695:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1696:2: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl rule__QuotedTypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__53409);
            rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__6_in_rule__QuotedTypedKeyStringValueAnnotation__Group__53412);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1703:1: rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1707:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1708:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1708:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1709:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1710:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1710:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5_in_rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl3439);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1720:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6 : rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1724:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1725:2: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__63469);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1731:1: rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1735:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1736:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1736:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1737:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1738:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1738:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0_in_rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl3496);
            	    rule__QuotedTypedKeyStringValueAnnotation__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1762:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1766:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1767:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl rule__QuotedTypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__03541);
            rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__03544);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1774:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1778:1: ( ( ',' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1779:1: ( ',' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1779:1: ( ',' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1780:1: ','
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl3572); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1793:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1 : rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1797:1: ( rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1798:2: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__13603);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1804:1: rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1808:1: ( ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1809:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1809:1: ( ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1810:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1811:1: ( rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1811:2: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl3630);
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


    // $ANTLR start "rule__QuotedPropertyAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1825:1: rule__QuotedPropertyAnnotation__Group__0 : rule__QuotedPropertyAnnotation__Group__0__Impl rule__QuotedPropertyAnnotation__Group__1 ;
    public final void rule__QuotedPropertyAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1829:1: ( rule__QuotedPropertyAnnotation__Group__0__Impl rule__QuotedPropertyAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1830:2: rule__QuotedPropertyAnnotation__Group__0__Impl rule__QuotedPropertyAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedPropertyAnnotation__Group__0__Impl_in_rule__QuotedPropertyAnnotation__Group__03664);
            rule__QuotedPropertyAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedPropertyAnnotation__Group__1_in_rule__QuotedPropertyAnnotation__Group__03667);
            rule__QuotedPropertyAnnotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedPropertyAnnotation__Group__0"


    // $ANTLR start "rule__QuotedPropertyAnnotation__Group__0__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1837:1: rule__QuotedPropertyAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__QuotedPropertyAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1841:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1842:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1842:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1843:1: '@'
            {
             before(grammarAccess.getQuotedPropertyAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QuotedPropertyAnnotation__Group__0__Impl3695); 
             after(grammarAccess.getQuotedPropertyAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedPropertyAnnotation__Group__0__Impl"


    // $ANTLR start "rule__QuotedPropertyAnnotation__Group__1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1856:1: rule__QuotedPropertyAnnotation__Group__1 : rule__QuotedPropertyAnnotation__Group__1__Impl rule__QuotedPropertyAnnotation__Group__2 ;
    public final void rule__QuotedPropertyAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1860:1: ( rule__QuotedPropertyAnnotation__Group__1__Impl rule__QuotedPropertyAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1861:2: rule__QuotedPropertyAnnotation__Group__1__Impl rule__QuotedPropertyAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedPropertyAnnotation__Group__1__Impl_in_rule__QuotedPropertyAnnotation__Group__13726);
            rule__QuotedPropertyAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedPropertyAnnotation__Group__2_in_rule__QuotedPropertyAnnotation__Group__13729);
            rule__QuotedPropertyAnnotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedPropertyAnnotation__Group__1"


    // $ANTLR start "rule__QuotedPropertyAnnotation__Group__1__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1868:1: rule__QuotedPropertyAnnotation__Group__1__Impl : ( ( rule__QuotedPropertyAnnotation__NameAssignment_1 ) ) ;
    public final void rule__QuotedPropertyAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1872:1: ( ( ( rule__QuotedPropertyAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1873:1: ( ( rule__QuotedPropertyAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1873:1: ( ( rule__QuotedPropertyAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1874:1: ( rule__QuotedPropertyAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getQuotedPropertyAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1875:1: ( rule__QuotedPropertyAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1875:2: rule__QuotedPropertyAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedPropertyAnnotation__NameAssignment_1_in_rule__QuotedPropertyAnnotation__Group__1__Impl3756);
            rule__QuotedPropertyAnnotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuotedPropertyAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedPropertyAnnotation__Group__1__Impl"


    // $ANTLR start "rule__QuotedPropertyAnnotation__Group__2"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1885:1: rule__QuotedPropertyAnnotation__Group__2 : rule__QuotedPropertyAnnotation__Group__2__Impl rule__QuotedPropertyAnnotation__Group__3 ;
    public final void rule__QuotedPropertyAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1889:1: ( rule__QuotedPropertyAnnotation__Group__2__Impl rule__QuotedPropertyAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1890:2: rule__QuotedPropertyAnnotation__Group__2__Impl rule__QuotedPropertyAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedPropertyAnnotation__Group__2__Impl_in_rule__QuotedPropertyAnnotation__Group__23786);
            rule__QuotedPropertyAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedPropertyAnnotation__Group__3_in_rule__QuotedPropertyAnnotation__Group__23789);
            rule__QuotedPropertyAnnotation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedPropertyAnnotation__Group__2"


    // $ANTLR start "rule__QuotedPropertyAnnotation__Group__2__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1897:1: rule__QuotedPropertyAnnotation__Group__2__Impl : ( ( rule__QuotedPropertyAnnotation__PropertyAssignment_2 ) ) ;
    public final void rule__QuotedPropertyAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1901:1: ( ( ( rule__QuotedPropertyAnnotation__PropertyAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1902:1: ( ( rule__QuotedPropertyAnnotation__PropertyAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1902:1: ( ( rule__QuotedPropertyAnnotation__PropertyAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1903:1: ( rule__QuotedPropertyAnnotation__PropertyAssignment_2 )
            {
             before(grammarAccess.getQuotedPropertyAnnotationAccess().getPropertyAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1904:1: ( rule__QuotedPropertyAnnotation__PropertyAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1904:2: rule__QuotedPropertyAnnotation__PropertyAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedPropertyAnnotation__PropertyAssignment_2_in_rule__QuotedPropertyAnnotation__Group__2__Impl3816);
            rule__QuotedPropertyAnnotation__PropertyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuotedPropertyAnnotationAccess().getPropertyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedPropertyAnnotation__Group__2__Impl"


    // $ANTLR start "rule__QuotedPropertyAnnotation__Group__3"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1914:1: rule__QuotedPropertyAnnotation__Group__3 : rule__QuotedPropertyAnnotation__Group__3__Impl rule__QuotedPropertyAnnotation__Group__4 ;
    public final void rule__QuotedPropertyAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1918:1: ( rule__QuotedPropertyAnnotation__Group__3__Impl rule__QuotedPropertyAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1919:2: rule__QuotedPropertyAnnotation__Group__3__Impl rule__QuotedPropertyAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedPropertyAnnotation__Group__3__Impl_in_rule__QuotedPropertyAnnotation__Group__33846);
            rule__QuotedPropertyAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuotedPropertyAnnotation__Group__4_in_rule__QuotedPropertyAnnotation__Group__33849);
            rule__QuotedPropertyAnnotation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedPropertyAnnotation__Group__3"


    // $ANTLR start "rule__QuotedPropertyAnnotation__Group__3__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1926:1: rule__QuotedPropertyAnnotation__Group__3__Impl : ( ':=' ) ;
    public final void rule__QuotedPropertyAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1930:1: ( ( ':=' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1931:1: ( ':=' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1931:1: ( ':=' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1932:1: ':='
            {
             before(grammarAccess.getQuotedPropertyAnnotationAccess().getColonEqualsSignKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__QuotedPropertyAnnotation__Group__3__Impl3877); 
             after(grammarAccess.getQuotedPropertyAnnotationAccess().getColonEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedPropertyAnnotation__Group__3__Impl"


    // $ANTLR start "rule__QuotedPropertyAnnotation__Group__4"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1945:1: rule__QuotedPropertyAnnotation__Group__4 : rule__QuotedPropertyAnnotation__Group__4__Impl ;
    public final void rule__QuotedPropertyAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1949:1: ( rule__QuotedPropertyAnnotation__Group__4__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1950:2: rule__QuotedPropertyAnnotation__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedPropertyAnnotation__Group__4__Impl_in_rule__QuotedPropertyAnnotation__Group__43908);
            rule__QuotedPropertyAnnotation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedPropertyAnnotation__Group__4"


    // $ANTLR start "rule__QuotedPropertyAnnotation__Group__4__Impl"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1956:1: rule__QuotedPropertyAnnotation__Group__4__Impl : ( ( rule__QuotedPropertyAnnotation__ValueAssignment_4 ) ) ;
    public final void rule__QuotedPropertyAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1960:1: ( ( ( rule__QuotedPropertyAnnotation__ValueAssignment_4 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1961:1: ( ( rule__QuotedPropertyAnnotation__ValueAssignment_4 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1961:1: ( ( rule__QuotedPropertyAnnotation__ValueAssignment_4 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1962:1: ( rule__QuotedPropertyAnnotation__ValueAssignment_4 )
            {
             before(grammarAccess.getQuotedPropertyAnnotationAccess().getValueAssignment_4()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1963:1: ( rule__QuotedPropertyAnnotation__ValueAssignment_4 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1963:2: rule__QuotedPropertyAnnotation__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuotedPropertyAnnotation__ValueAssignment_4_in_rule__QuotedPropertyAnnotation__Group__4__Impl3935);
            rule__QuotedPropertyAnnotation__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuotedPropertyAnnotationAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedPropertyAnnotation__Group__4__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1983:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1987:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1988:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__03975);
            rule__KeyBooleanValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__03978);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1995:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:1999:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2000:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2000:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2001:1: '@'
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyBooleanValueAnnotation__Group__0__Impl4006); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2014:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2018:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2019:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__14037);
            rule__KeyBooleanValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__14040);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2026:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2030:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2031:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2031:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2032:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2033:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2033:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl4067);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2043:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2047:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2048:2: rule__KeyBooleanValueAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__24097);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2054:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2058:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2059:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2059:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2060:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2061:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2061:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl4124);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2077:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2081:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2082:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__04160);
            rule__KeyIntValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__04163);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2089:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2093:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2094:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2094:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2095:1: '@'
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyIntValueAnnotation__Group__0__Impl4191); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2108:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2112:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2113:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__14222);
            rule__KeyIntValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__14225);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2120:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2124:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2125:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2125:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2126:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2127:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2127:2: rule__KeyIntValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl4252);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2137:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2141:1: ( rule__KeyIntValueAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2142:2: rule__KeyIntValueAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__24282);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2148:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2152:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2153:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2153:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2154:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2155:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2155:2: rule__KeyIntValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl4309);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2171:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2175:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2176:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__04345);
            rule__KeyFloatValueAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__04348);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2183:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2187:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2188:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2188:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2189:1: '@'
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyFloatValueAnnotation__Group__0__Impl4376); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2202:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2206:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2207:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__14407);
            rule__KeyFloatValueAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__14410);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2214:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2218:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2219:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2219:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2220:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2221:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2221:2: rule__KeyFloatValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl4437);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2231:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2235:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2236:2: rule__KeyFloatValueAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__24467);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2242:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2246:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2247:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2247:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2248:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2249:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2249:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl4494);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2265:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2269:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2270:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__04530);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__04533);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2277:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2281:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2282:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2282:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2283:1: RULE_ID
            {
             before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl4560); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2294:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2298:1: ( rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2299:2: rule__ExtendedID__Group__1__Impl rule__ExtendedID__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__14589);
            rule__ExtendedID__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__2_in_rule__ExtendedID__Group__14592);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2306:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2310:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2311:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2311:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2312:1: ( rule__ExtendedID__Group_1__0 )*
            {
             before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2313:1: ( rule__ExtendedID__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2313:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl4619);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2323:1: rule__ExtendedID__Group__2 : rule__ExtendedID__Group__2__Impl ;
    public final void rule__ExtendedID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2327:1: ( rule__ExtendedID__Group__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2328:2: rule__ExtendedID__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__2__Impl_in_rule__ExtendedID__Group__24650);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2334:1: rule__ExtendedID__Group__2__Impl : ( ( rule__ExtendedID__Group_2__0 )? ) ;
    public final void rule__ExtendedID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2338:1: ( ( ( rule__ExtendedID__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2339:1: ( ( rule__ExtendedID__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2339:1: ( ( rule__ExtendedID__Group_2__0 )? )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2340:1: ( rule__ExtendedID__Group_2__0 )?
            {
             before(grammarAccess.getExtendedIDAccess().getGroup_2()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2341:1: ( rule__ExtendedID__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2341:2: rule__ExtendedID__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_2__0_in_rule__ExtendedID__Group__2__Impl4677);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2357:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2361:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2362:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__04714);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__04717);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2369:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2373:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2374:1: ( '.' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2374:1: ( '.' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2375:1: '.'
            {
             before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__ExtendedID__Group_1__0__Impl4745); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2388:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2392:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2393:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__14776);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2399:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2403:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2404:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2404:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2405:1: RULE_ID
            {
             before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl4803); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2420:1: rule__ExtendedID__Group_2__0 : rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 ;
    public final void rule__ExtendedID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2424:1: ( rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2425:2: rule__ExtendedID__Group_2__0__Impl rule__ExtendedID__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_2__0__Impl_in_rule__ExtendedID__Group_2__04836);
            rule__ExtendedID__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_2__1_in_rule__ExtendedID__Group_2__04839);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2432:1: rule__ExtendedID__Group_2__0__Impl : ( '#' ) ;
    public final void rule__ExtendedID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2436:1: ( ( '#' ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2437:1: ( '#' )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2437:1: ( '#' )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2438:1: '#'
            {
             before(grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__ExtendedID__Group_2__0__Impl4867); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2451:1: rule__ExtendedID__Group_2__1 : rule__ExtendedID__Group_2__1__Impl ;
    public final void rule__ExtendedID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2455:1: ( rule__ExtendedID__Group_2__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2456:2: rule__ExtendedID__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_2__1__Impl_in_rule__ExtendedID__Group_2__14898);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2462:1: rule__ExtendedID__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ExtendedID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2466:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2467:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2467:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2468:1: RULE_INT
            {
             before(grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__ExtendedID__Group_2__1__Impl4925); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2483:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2487:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2488:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__04958);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__04961);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2495:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2499:1: ( ( ( '-' )? ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2500:1: ( ( '-' )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2500:1: ( ( '-' )? )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2501:1: ( '-' )?
            {
             before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2502:1: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2503:2: '-'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__Integer__Group__0__Impl4990); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2514:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2518:1: ( rule__Integer__Group__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2519:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__15023);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2525:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2529:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2530:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2530:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2531:1: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Integer__Group__1__Impl5050); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2546:1: rule__Floateger__Group__0 : rule__Floateger__Group__0__Impl rule__Floateger__Group__1 ;
    public final void rule__Floateger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2550:1: ( rule__Floateger__Group__0__Impl rule__Floateger__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2551:2: rule__Floateger__Group__0__Impl rule__Floateger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Floateger__Group__0__Impl_in_rule__Floateger__Group__05083);
            rule__Floateger__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Floateger__Group__1_in_rule__Floateger__Group__05086);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2558:1: rule__Floateger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Floateger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2562:1: ( ( ( '-' )? ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2563:1: ( ( '-' )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2563:1: ( ( '-' )? )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2564:1: ( '-' )?
            {
             before(grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2565:1: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2566:2: '-'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__Floateger__Group__0__Impl5115); 

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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2577:1: rule__Floateger__Group__1 : rule__Floateger__Group__1__Impl ;
    public final void rule__Floateger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2581:1: ( rule__Floateger__Group__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2582:2: rule__Floateger__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Floateger__Group__1__Impl_in_rule__Floateger__Group__15148);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2588:1: rule__Floateger__Group__1__Impl : ( RULE_FLOAT ) ;
    public final void rule__Floateger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2592:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2593:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2593:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2594:1: RULE_FLOAT
            {
             before(grammarAccess.getFloategerAccess().getFLOATTerminalRuleCall_1()); 
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__Floateger__Group__1__Impl5175); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2610:1: rule__CommentAnnotation__ValuesAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2614:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2615:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2615:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2616:1: RULE_COMMENT_ANNOTATION
            {
             before(grammarAccess.getCommentAnnotationAccess().getValuesCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValuesAssignment5213); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2625:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2629:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2630:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2630:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2631:1: ruleExtendedID
            {
             before(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_15244);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2640:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2644:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2645:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2645:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2646:1: ruleExtendedID
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_15275);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2655:1: rule__KeyStringValueAnnotation__ValuesAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2659:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2660:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2660:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2661:1: ruleEString
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValuesAssignment_25306);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2670:1: rule__KeyStringValueAnnotation__ValuesAssignment_3_1 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2674:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2675:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2675:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2676:1: ruleEString
            {
             before(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValuesAssignment_3_15337);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2685:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2689:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2690:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2690:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2691:1: ruleExtendedID
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_15368);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2700:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2704:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2705:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2705:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2706:1: ruleExtendedID
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_35399);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2715:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_5 : ( ruleEStringBoolean ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2719:1: ( ( ruleEStringBoolean ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2720:1: ( ruleEStringBoolean )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2720:1: ( ruleEStringBoolean )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2721:1: ruleEStringBoolean
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_rule__TypedKeyStringValueAnnotation__ValuesAssignment_55430);
            ruleEStringBoolean();

            state._fsp--;

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2730:1: rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( ruleEStringBoolean ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2734:1: ( ( ruleEStringBoolean ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2735:1: ( ruleEStringBoolean )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2735:1: ( ruleEStringBoolean )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2736:1: ruleEStringBoolean
            {
             before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_15461);
            ruleEStringBoolean();

            state._fsp--;

             after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__PropertyAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2745:1: rule__PropertyAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__PropertyAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2749:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2750:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2750:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2751:1: ruleExtendedID
            {
             before(grammarAccess.getPropertyAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__PropertyAnnotation__NameAssignment_15492);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getPropertyAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAnnotation__NameAssignment_1"


    // $ANTLR start "rule__PropertyAnnotation__PropertyAssignment_2"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2760:1: rule__PropertyAnnotation__PropertyAssignment_2 : ( ruleEString ) ;
    public final void rule__PropertyAnnotation__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2764:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2765:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2765:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2766:1: ruleEString
            {
             before(grammarAccess.getPropertyAnnotationAccess().getPropertyEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PropertyAnnotation__PropertyAssignment_25523);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyAnnotationAccess().getPropertyEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAnnotation__PropertyAssignment_2"


    // $ANTLR start "rule__PropertyAnnotation__ValueAssignment_4"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2775:1: rule__PropertyAnnotation__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__PropertyAnnotation__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2779:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2780:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2780:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2781:1: ruleEString
            {
             before(grammarAccess.getPropertyAnnotationAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PropertyAnnotation__ValueAssignment_45554);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertyAnnotationAccess().getValueEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAnnotation__ValueAssignment_4"


    // $ANTLR start "rule__QuotedKeyStringValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2790:1: rule__QuotedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2794:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2795:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2795:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2796:1: ruleExtendedID
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__QuotedKeyStringValueAnnotation__NameAssignment_15585);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2805:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2809:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2810:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2810:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2811:1: RULE_STRING
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_25616); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2820:1: rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2824:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2825:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2825:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2826:1: RULE_STRING
            {
             before(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_15647); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2835:1: rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2839:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2840:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2840:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2841:1: ruleExtendedID
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_15678);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2850:1: rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2854:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2855:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2855:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2856:1: ruleExtendedID
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_35709);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2865:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2869:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2870:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2870:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2871:1: RULE_STRING
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_55740); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2880:1: rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2884:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2885:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2885:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2886:1: RULE_STRING
            {
             before(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_15771); 
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


    // $ANTLR start "rule__QuotedPropertyAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2895:1: rule__QuotedPropertyAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__QuotedPropertyAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2899:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2900:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2900:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2901:1: ruleExtendedID
            {
             before(grammarAccess.getQuotedPropertyAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__QuotedPropertyAnnotation__NameAssignment_15802);
            ruleExtendedID();

            state._fsp--;

             after(grammarAccess.getQuotedPropertyAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedPropertyAnnotation__NameAssignment_1"


    // $ANTLR start "rule__QuotedPropertyAnnotation__PropertyAssignment_2"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2910:1: rule__QuotedPropertyAnnotation__PropertyAssignment_2 : ( RULE_STRING ) ;
    public final void rule__QuotedPropertyAnnotation__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2914:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2915:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2915:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2916:1: RULE_STRING
            {
             before(grammarAccess.getQuotedPropertyAnnotationAccess().getPropertySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__QuotedPropertyAnnotation__PropertyAssignment_25833); 
             after(grammarAccess.getQuotedPropertyAnnotationAccess().getPropertySTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedPropertyAnnotation__PropertyAssignment_2"


    // $ANTLR start "rule__QuotedPropertyAnnotation__ValueAssignment_4"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2925:1: rule__QuotedPropertyAnnotation__ValueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__QuotedPropertyAnnotation__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2929:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2930:1: ( RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2930:1: ( RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2931:1: RULE_STRING
            {
             before(grammarAccess.getQuotedPropertyAnnotationAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__QuotedPropertyAnnotation__ValueAssignment_45864); 
             after(grammarAccess.getQuotedPropertyAnnotationAccess().getValueSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuotedPropertyAnnotation__ValueAssignment_4"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2940:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2944:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2945:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2945:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2946:1: ruleExtendedID
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_15895);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2955:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2959:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2960:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2960:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2961:1: RULE_BOOLEAN
            {
             before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_25926); 
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2970:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2974:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2975:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2975:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2976:1: ruleExtendedID
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_15957);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2985:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2989:1: ( ( ruleInteger ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2990:1: ( ruleInteger )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2990:1: ( ruleInteger )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:2991:1: ruleInteger
            {
             before(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_rule__KeyIntValueAnnotation__ValueAssignment_25988);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:3000:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:3004:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:3005:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:3005:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:3006:1: ruleExtendedID
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_16019);
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
    // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:3015:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( ruleFloateger ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:3019:1: ( ( ruleFloateger ) )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:3020:1: ( ruleFloateger )
            {
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:3020:1: ( ruleFloateger )
            // ../de.cau.cs.kieler.core.annotations.text.ui/src-gen/de/cau/cs/kieler/core/annotations/text/ui/contentassist/antlr/internal/InternalAnnotations.g:3021:1: ruleFloateger
            {
             before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_rule__KeyFloatValueAnnotation__ValueAssignment_26050);
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
        "\26\uffff";
    static final String DFA1_eofS =
        "\3\uffff\1\15\6\uffff\2\21\2\uffff\2\15\4\uffff\2\21";
    static final String DFA1_minS =
        "\1\11\1\uffff\1\6\1\4\1\6\2\7\3\uffff\2\20\2\uffff\2\4\2\uffff"+
        "\1\6\1\7\2\20";
    static final String DFA1_maxS =
        "\1\17\1\uffff\1\6\1\26\1\6\1\7\1\10\3\uffff\1\23\1\25\2\uffff\2"+
        "\26\2\uffff\1\6\1\7\1\25\1\23";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\5\uffff\1\7\1\4\1\2\2\uffff\1\6\1\10\2\uffff\1\5\1"+
        "\3\4\uffff";
    static final String DFA1_specialS =
        "\26\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\5\uffff\1\2",
            "",
            "\1\3",
            "\1\12\1\11\1\13\1\14\1\7\10\uffff\1\10\2\uffff\1\4\1\5\1\6",
            "\1\16",
            "\1\17",
            "\1\14\1\7",
            "",
            "",
            "",
            "\1\21\2\uffff\1\20",
            "\1\21\2\uffff\1\20\1\22\1\23",
            "",
            "",
            "\1\12\1\11\1\13\1\14\1\7\10\uffff\1\10\2\uffff\1\4\1\5\1\6",
            "\1\12\1\11\1\13\1\14\1\7\10\uffff\1\10\4\uffff\1\6",
            "",
            "",
            "\1\24",
            "\1\25",
            "\1\21\2\uffff\1\20\1\22\1\23",
            "\1\21\2\uffff\1\20"
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
            return "544:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( rulePropertyAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) | ( ruleTagAnnotation ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation129 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CommentAnnotation__ValuesAssignment_in_ruleCommentAnnotation162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation189 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation309 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyAnnotation_in_entryRulePropertyAnnotation369 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyAnnotation376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyAnnotation__Group__0_in_rulePropertyAnnotation402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation429 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__0_in_ruleQuotedKeyStringValueAnnotation462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation489 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__0_in_ruleQuotedTypedKeyStringValueAnnotation522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuotedPropertyAnnotation_in_entryRuleQuotedPropertyAnnotation549 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuotedPropertyAnnotation556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedPropertyAnnotation__Group__0_in_ruleQuotedPropertyAnnotation582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation609 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation669 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation729 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString789 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_entryRuleEStringBoolean849 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEStringBoolean856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EStringBoolean__Alternatives_in_ruleEStringBoolean882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID909 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger969 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__Group__0_in_ruleInteger1002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloateger_in_entryRuleFloateger1029 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloateger1036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Floateger__Group__0_in_ruleFloateger1062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives1098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives1115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives1132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives1149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyAnnotation_in_rule__Annotation__Alternatives1166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives1183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives1200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives1217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__EString__Alternatives1270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EStringBoolean__Alternatives1302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__EStringBoolean__Alternatives1319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__EStringBoolean__Alternatives1336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__01366 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__01369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TagAnnotation__Group__0__Impl1397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__11428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl1455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__01489 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__01492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyStringValueAnnotation__Group__0__Impl1520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__11551 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__11554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl1581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__21611 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__21614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValuesAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl1641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__31671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl1698 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__01737 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__01740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeyStringValueAnnotation__Group_3__0__Impl1768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__11799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValuesAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl1826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__01860 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__01863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl1891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__11922 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__11925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl1952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__21982 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__21985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl2013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__32044 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__32047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl2074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__42104 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__42107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl2135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__52166 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__52169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValuesAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl2196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__62226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl2253 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__02298 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__02301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl2329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__12360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl2387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyAnnotation__Group__0__Impl_in_rule__PropertyAnnotation__Group__02421 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__PropertyAnnotation__Group__1_in_rule__PropertyAnnotation__Group__02424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__PropertyAnnotation__Group__0__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyAnnotation__Group__1__Impl_in_rule__PropertyAnnotation__Group__12483 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__PropertyAnnotation__Group__2_in_rule__PropertyAnnotation__Group__12486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyAnnotation__NameAssignment_1_in_rule__PropertyAnnotation__Group__1__Impl2513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyAnnotation__Group__2__Impl_in_rule__PropertyAnnotation__Group__22543 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__PropertyAnnotation__Group__3_in_rule__PropertyAnnotation__Group__22546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyAnnotation__PropertyAssignment_2_in_rule__PropertyAnnotation__Group__2__Impl2573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyAnnotation__Group__3__Impl_in_rule__PropertyAnnotation__Group__32603 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__PropertyAnnotation__Group__4_in_rule__PropertyAnnotation__Group__32606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PropertyAnnotation__Group__3__Impl2634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyAnnotation__Group__4__Impl_in_rule__PropertyAnnotation__Group__42665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PropertyAnnotation__ValueAssignment_4_in_rule__PropertyAnnotation__Group__4__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__0__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__02732 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__1_in_rule__QuotedKeyStringValueAnnotation__Group__02735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QuotedKeyStringValueAnnotation__Group__0__Impl2763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__1__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__12794 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__2_in_rule__QuotedKeyStringValueAnnotation__Group__12797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__NameAssignment_1_in_rule__QuotedKeyStringValueAnnotation__Group__1__Impl2824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__2__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__22854 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__3_in_rule__QuotedKeyStringValueAnnotation__Group__22857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2_in_rule__QuotedKeyStringValueAnnotation__Group__2__Impl2884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group__3__Impl_in_rule__QuotedKeyStringValueAnnotation__Group__32914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__0_in_rule__QuotedKeyStringValueAnnotation__Group__3__Impl2941 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl_in_rule__QuotedKeyStringValueAnnotation__Group_3__02980 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__1_in_rule__QuotedKeyStringValueAnnotation__Group_3__02983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__QuotedKeyStringValueAnnotation__Group_3__0__Impl3011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl_in_rule__QuotedKeyStringValueAnnotation__Group_3__13042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1_in_rule__QuotedKeyStringValueAnnotation__Group_3__1__Impl3069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__03103 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__1_in_rule__QuotedTypedKeyStringValueAnnotation__Group__03106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QuotedTypedKeyStringValueAnnotation__Group__0__Impl3134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__13165 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__2_in_rule__QuotedTypedKeyStringValueAnnotation__Group__13168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1_in_rule__QuotedTypedKeyStringValueAnnotation__Group__1__Impl3195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__23225 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__3_in_rule__QuotedTypedKeyStringValueAnnotation__Group__23228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__QuotedTypedKeyStringValueAnnotation__Group__2__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__33287 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__4_in_rule__QuotedTypedKeyStringValueAnnotation__Group__33290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__QuotedTypedKeyStringValueAnnotation__Group__3__Impl3317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__43347 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__5_in_rule__QuotedTypedKeyStringValueAnnotation__Group__43350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__QuotedTypedKeyStringValueAnnotation__Group__4__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__53409 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__6_in_rule__QuotedTypedKeyStringValueAnnotation__Group__53412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5_in_rule__QuotedTypedKeyStringValueAnnotation__Group__5__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group__63469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0_in_rule__QuotedTypedKeyStringValueAnnotation__Group__6__Impl3496 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__03541 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__03544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__0__Impl3572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__13603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1_in_rule__QuotedTypedKeyStringValueAnnotation__Group_6__1__Impl3630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedPropertyAnnotation__Group__0__Impl_in_rule__QuotedPropertyAnnotation__Group__03664 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__QuotedPropertyAnnotation__Group__1_in_rule__QuotedPropertyAnnotation__Group__03667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QuotedPropertyAnnotation__Group__0__Impl3695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedPropertyAnnotation__Group__1__Impl_in_rule__QuotedPropertyAnnotation__Group__13726 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuotedPropertyAnnotation__Group__2_in_rule__QuotedPropertyAnnotation__Group__13729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedPropertyAnnotation__NameAssignment_1_in_rule__QuotedPropertyAnnotation__Group__1__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedPropertyAnnotation__Group__2__Impl_in_rule__QuotedPropertyAnnotation__Group__23786 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__QuotedPropertyAnnotation__Group__3_in_rule__QuotedPropertyAnnotation__Group__23789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedPropertyAnnotation__PropertyAssignment_2_in_rule__QuotedPropertyAnnotation__Group__2__Impl3816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedPropertyAnnotation__Group__3__Impl_in_rule__QuotedPropertyAnnotation__Group__33846 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QuotedPropertyAnnotation__Group__4_in_rule__QuotedPropertyAnnotation__Group__33849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__QuotedPropertyAnnotation__Group__3__Impl3877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedPropertyAnnotation__Group__4__Impl_in_rule__QuotedPropertyAnnotation__Group__43908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuotedPropertyAnnotation__ValueAssignment_4_in_rule__QuotedPropertyAnnotation__Group__4__Impl3935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__03975 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__03978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyBooleanValueAnnotation__Group__0__Impl4006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__14037 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__14040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl4067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__24097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__04160 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__04163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyIntValueAnnotation__Group__0__Impl4191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__14222 = new BitSet(new long[]{0x0000000000400080L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__14225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl4252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__24282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl4309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__04345 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__04348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyFloatValueAnnotation__Group__0__Impl4376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__14407 = new BitSet(new long[]{0x0000000000400100L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__14410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl4437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__24467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl4494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__04530 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__04533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl4560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__14589 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__2_in_rule__ExtendedID__Group__14592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl4619 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__2__Impl_in_rule__ExtendedID__Group__24650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_2__0_in_rule__ExtendedID__Group__2__Impl4677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__04714 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__04717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ExtendedID__Group_1__0__Impl4745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__14776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl4803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_2__0__Impl_in_rule__ExtendedID__Group_2__04836 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_2__1_in_rule__ExtendedID__Group_2__04839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ExtendedID__Group_2__0__Impl4867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_2__1__Impl_in_rule__ExtendedID__Group_2__14898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__ExtendedID__Group_2__1__Impl4925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__04958 = new BitSet(new long[]{0x0000000000400080L});
        public static final BitSet FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__04961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Integer__Group__0__Impl4990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__15023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Integer__Group__1__Impl5050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Floateger__Group__0__Impl_in_rule__Floateger__Group__05083 = new BitSet(new long[]{0x0000000000400100L});
        public static final BitSet FOLLOW_rule__Floateger__Group__1_in_rule__Floateger__Group__05086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Floateger__Group__0__Impl5115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Floateger__Group__1__Impl_in_rule__Floateger__Group__15148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__Floateger__Group__1__Impl5175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValuesAssignment5213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_15244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_15275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValuesAssignment_25306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValuesAssignment_3_15337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_15368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_35399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_rule__TypedKeyStringValueAnnotation__ValuesAssignment_55430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_15461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__PropertyAnnotation__NameAssignment_15492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PropertyAnnotation__PropertyAssignment_25523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PropertyAnnotation__ValueAssignment_45554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__QuotedKeyStringValueAnnotation__NameAssignment_15585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_25616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_15647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_15678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_35709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_55740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_15771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__QuotedPropertyAnnotation__NameAssignment_15802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__QuotedPropertyAnnotation__PropertyAssignment_25833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__QuotedPropertyAnnotation__ValueAssignment_45864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_15895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_25926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_15957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_rule__KeyIntValueAnnotation__ValueAssignment_25988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_16019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloateger_in_rule__KeyFloatValueAnnotation__ValueAssignment_26050 = new BitSet(new long[]{0x0000000000000002L});
    }


}