package de.cau.cs.kieler.core.annotations.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.cau.cs.kieler.core.annotations.services.AnnotationsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
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
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g"; }


     
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:62:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:63:1: ( ruleAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:64:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation67);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation74); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:71:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:75:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:76:1: ( ( rule__Annotation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:76:1: ( ( rule__Annotation__Alternatives ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:77:1: ( rule__Annotation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:78:1: ( rule__Annotation__Alternatives )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:78:2: rule__Annotation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation100);
            rule__Annotation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:90:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:91:1: ( ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:92:1: ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation127);
            ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation134); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:99:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValueAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:103:2: ( ( ( rule__CommentAnnotation__ValueAssignment ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:104:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:104:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:105:1: ( rule__CommentAnnotation__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:106:1: ( rule__CommentAnnotation__ValueAssignment )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:106:2: rule__CommentAnnotation__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation160);
            rule__CommentAnnotation__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationAccess().getValueAssignment()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:118:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:119:1: ( ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:120:1: ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation187);
            ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation194); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:127:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:131:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:132:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:132:1: ( ( rule__TagAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:133:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:134:1: ( rule__TagAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:134:2: rule__TagAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation220);
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


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:146:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:147:1: ( ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:148:1: ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation247);
            ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation254); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:155:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:159:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:160:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:160:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:161:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:162:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:162:2: rule__KeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation280);
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


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:174:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:175:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:176:1: ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation307);
            ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation314); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:183:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:187:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:188:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:188:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:189:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:190:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:190:2: rule__TypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation340);
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


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:202:1: entryRuleKeyBooleanValueAnnotation : ruleKeyBooleanValueAnnotation EOF ;
    public final void entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:203:1: ( ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:204:1: ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation367);
            ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation374); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:211:1: ruleKeyBooleanValueAnnotation : ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyBooleanValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:215:2: ( ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:216:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:216:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:217:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:218:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:218:2: rule__KeyBooleanValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation400);
            rule__KeyBooleanValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:230:1: entryRuleKeyIntValueAnnotation : ruleKeyIntValueAnnotation EOF ;
    public final void entryRuleKeyIntValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:231:1: ( ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:232:1: ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation427);
            ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation434); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:239:1: ruleKeyIntValueAnnotation : ( ( rule__KeyIntValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyIntValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:243:2: ( ( ( rule__KeyIntValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:244:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:244:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:245:1: ( rule__KeyIntValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:246:1: ( rule__KeyIntValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:246:2: rule__KeyIntValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation460);
            rule__KeyIntValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:258:1: entryRuleKeyFloatValueAnnotation : ruleKeyFloatValueAnnotation EOF ;
    public final void entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:259:1: ( ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:260:1: ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation487);
            ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation494); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:267:1: ruleKeyFloatValueAnnotation : ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyFloatValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:271:2: ( ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:272:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:272:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:273:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:274:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:274:2: rule__KeyFloatValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation520);
            rule__KeyFloatValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:288:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:289:1: ( ruleEString EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:290:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString549);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString556); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:297:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:301:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:302:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:302:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:303:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:304:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:304:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString582);
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


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:316:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:317:1: ( ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:318:1: ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID609);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID616); if (state.failed) return ;

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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:325:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:329:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:330:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:330:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:331:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:332:1: ( rule__ExtendedID__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:332:2: rule__ExtendedID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID642);
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


    // $ANTLR start "rule__Annotation__Alternatives"
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:344:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:348:1: ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:349:1: ( ruleCommentAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:349:1: ( ruleCommentAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:350:1: ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives678);
                    ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:355:6: ( ruleTagAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:355:6: ( ruleTagAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:356:1: ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives695);
                    ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:361:6: ( ruleKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:361:6: ( ruleKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:362:1: ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives712);
                    ruleKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:367:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:367:6: ( ruleTypedKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:368:1: ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives729);
                    ruleTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:373:6: ( ruleKeyBooleanValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:373:6: ( ruleKeyBooleanValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:374:1: ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives746);
                    ruleKeyBooleanValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:379:6: ( ruleKeyIntValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:379:6: ( ruleKeyIntValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:380:1: ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives763);
                    ruleKeyIntValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:385:6: ( ruleKeyFloatValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:385:6: ( ruleKeyFloatValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:386:1: ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives780);
                    ruleKeyFloatValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
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
    // $ANTLR end "rule__Annotation__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:396:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:400:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:401:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:401:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:402:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives812); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:407:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:407:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:408:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives829); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
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


    // $ANTLR start "rule__TagAnnotation__Group__0"
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:420:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:424:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:425:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__0859);
            rule__TagAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__0862);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:432:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:436:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:437:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:437:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:438:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TagAnnotation__Group__0__Impl890); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:451:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:455:1: ( rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:456:2: rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__1921);
            rule__TagAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__1924);
            rule__TagAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:463:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:467:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:468:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:468:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:469:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:470:1: ( rule__TagAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:470:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl951);
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


    // $ANTLR start "rule__TagAnnotation__Group__2"
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:480:1: rule__TagAnnotation__Group__2 : rule__TagAnnotation__Group__2__Impl ;
    public final void rule__TagAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:484:1: ( rule__TagAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:485:2: rule__TagAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__2981);
            rule__TagAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:491:1: rule__TagAnnotation__Group__2__Impl : ( ( rule__TagAnnotation__Group_2__0 )? ) ;
    public final void rule__TagAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:495:1: ( ( ( rule__TagAnnotation__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:496:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:496:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:497:1: ( rule__TagAnnotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:498:1: ( rule__TagAnnotation__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:498:2: rule__TagAnnotation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl1008);
                    rule__TagAnnotation__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getGroup_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:514:1: rule__TagAnnotation__Group_2__0 : rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 ;
    public final void rule__TagAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:518:1: ( rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:519:2: rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__01045);
            rule__TagAnnotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__01048);
            rule__TagAnnotation__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:526:1: rule__TagAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TagAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:530:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:531:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:531:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:532:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TagAnnotation__Group_2__0__Impl1076); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:545:1: rule__TagAnnotation__Group_2__1 : rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 ;
    public final void rule__TagAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:549:1: ( rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:550:2: rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__11107);
            rule__TagAnnotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__11110);
            rule__TagAnnotation__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:557:1: rule__TagAnnotation__Group_2__1__Impl : ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) ;
    public final void rule__TagAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:561:1: ( ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:562:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:562:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:563:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:564:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMENT_ANNOTATION||LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:564:2: rule__TagAnnotation__AnnotationsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl1137);
            	    rule__TagAnnotation__AnnotationsAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:574:1: rule__TagAnnotation__Group_2__2 : rule__TagAnnotation__Group_2__2__Impl ;
    public final void rule__TagAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:578:1: ( rule__TagAnnotation__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:579:2: rule__TagAnnotation__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__21168);
            rule__TagAnnotation__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:585:1: rule__TagAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TagAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:589:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:590:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:590:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:591:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TagAnnotation__Group_2__2__Impl1196); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:610:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:614:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:615:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__01233);
            rule__KeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__01236);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:622:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:626:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:627:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:627:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:628:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__KeyStringValueAnnotation__Group__0__Impl1264); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:641:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:645:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:646:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__11295);
            rule__KeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__11298);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:653:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:657:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:658:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:658:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:659:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:660:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:660:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl1325);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:670:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:674:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:675:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__21355);
            rule__KeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__21358);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:682:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:686:1: ( ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:687:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:687:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:688:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:689:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:689:2: rule__KeyStringValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl1385);
            rule__KeyStringValueAnnotation__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:699:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:703:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:704:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__31415);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:710:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:714:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:715:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:715:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:716:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:717:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:717:2: rule__KeyStringValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl1442);
                    rule__KeyStringValueAnnotation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:735:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:739:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:740:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__01481);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__01484);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:747:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:751:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:752:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:752:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:753:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyStringValueAnnotation__Group_3__0__Impl1512); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:766:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:770:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:771:2: rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__11543);
            rule__KeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__11546);
            rule__KeyStringValueAnnotation__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:778:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:782:1: ( ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:783:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:783:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:784:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:785:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMENT_ANNOTATION||LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:785:2: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl1573);
            	    rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:795:1: rule__KeyStringValueAnnotation__Group_3__2 : rule__KeyStringValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:799:1: ( rule__KeyStringValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:800:2: rule__KeyStringValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__21604);
            rule__KeyStringValueAnnotation__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:806:1: rule__KeyStringValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:810:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:811:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:811:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:812:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeyStringValueAnnotation__Group_3__2__Impl1632); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:831:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:835:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:836:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__01669);
            rule__TypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__01672);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:843:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:847:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:848:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:848:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:849:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl1700); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:862:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:866:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:867:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__11731);
            rule__TypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__11734);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:874:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:878:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:879:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:879:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:880:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:881:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:881:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl1761);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:891:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:895:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:896:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__21791);
            rule__TypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__21794);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:903:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:907:1: ( ( '[' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:908:1: ( '[' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:908:1: ( '[' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:909:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl1822); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:922:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:926:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:927:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__31853);
            rule__TypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__31856);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:934:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:938:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:939:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:939:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:940:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:941:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:941:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl1883);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:951:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:955:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:956:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__41913);
            rule__TypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__41916);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:963:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:967:1: ( ( ']' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:968:1: ( ']' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:968:1: ( ']' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:969:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl1944); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:982:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:986:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:987:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__51975);
            rule__TypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__51978);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:994:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:998:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:999:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:999:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1000:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueAssignment_5()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1001:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1001:2: rule__TypedKeyStringValueAnnotation__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl2005);
            rule__TypedKeyStringValueAnnotation__ValueAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueAssignment_5()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1011:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1015:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1016:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__62035);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1022:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1026:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1027:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1027:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1028:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1029:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1029:2: rule__TypedKeyStringValueAnnotation__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl2062);
                    rule__TypedKeyStringValueAnnotation__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1053:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1057:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1058:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__02107);
            rule__TypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__02110);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1065:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1069:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1070:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1070:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1071:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl2138); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1084:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1088:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1089:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__12169);
            rule__TypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__12172);
            rule__TypedKeyStringValueAnnotation__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1096:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1100:1: ( ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1101:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1101:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1102:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAssignment_6_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1103:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMENT_ANNOTATION||LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1103:2: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl2199);
            	    rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAssignment_6_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1113:1: rule__TypedKeyStringValueAnnotation__Group_6__2 : rule__TypedKeyStringValueAnnotation__Group_6__2__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1117:1: ( rule__TypedKeyStringValueAnnotation__Group_6__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1118:2: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__22230);
            rule__TypedKeyStringValueAnnotation__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1124:1: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl : ( ')' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1128:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1129:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1129:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1130:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl2258); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1149:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1153:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1154:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__02295);
            rule__KeyBooleanValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__02298);
            rule__KeyBooleanValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1161:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1165:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1166:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1166:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1167:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__KeyBooleanValueAnnotation__Group__0__Impl2326); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1180:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1184:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1185:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__12357);
            rule__KeyBooleanValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__12360);
            rule__KeyBooleanValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1192:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1196:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1197:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1197:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1198:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1199:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1199:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl2387);
            rule__KeyBooleanValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1209:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1213:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1214:2: rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__22417);
            rule__KeyBooleanValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__22420);
            rule__KeyBooleanValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1221:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1225:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1226:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1226:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1227:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1228:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1228:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl2447);
            rule__KeyBooleanValueAnnotation__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1238:1: rule__KeyBooleanValueAnnotation__Group__3 : rule__KeyBooleanValueAnnotation__Group__3__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1242:1: ( rule__KeyBooleanValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1243:2: rule__KeyBooleanValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__32477);
            rule__KeyBooleanValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1249:1: rule__KeyBooleanValueAnnotation__Group__3__Impl : ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1253:1: ( ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1254:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1254:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1255:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1256:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1256:2: rule__KeyBooleanValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl2504);
                    rule__KeyBooleanValueAnnotation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1274:1: rule__KeyBooleanValueAnnotation__Group_3__0 : rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1278:1: ( rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1279:2: rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__02543);
            rule__KeyBooleanValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__02546);
            rule__KeyBooleanValueAnnotation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1286:1: rule__KeyBooleanValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1290:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1291:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1291:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1292:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl2574); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1305:1: rule__KeyBooleanValueAnnotation__Group_3__1 : rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1309:1: ( rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1310:2: rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__12605);
            rule__KeyBooleanValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__12608);
            rule__KeyBooleanValueAnnotation__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1317:1: rule__KeyBooleanValueAnnotation__Group_3__1__Impl : ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1321:1: ( ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1322:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1322:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1323:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1324:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMENT_ANNOTATION||LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1324:2: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl2635);
            	    rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1334:1: rule__KeyBooleanValueAnnotation__Group_3__2 : rule__KeyBooleanValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1338:1: ( rule__KeyBooleanValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1339:2: rule__KeyBooleanValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__22666);
            rule__KeyBooleanValueAnnotation__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1345:1: rule__KeyBooleanValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1349:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1350:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1350:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1351:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl2694); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1370:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1374:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1375:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__02731);
            rule__KeyIntValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__02734);
            rule__KeyIntValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1382:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1386:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1387:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1387:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1388:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__KeyIntValueAnnotation__Group__0__Impl2762); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1401:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1405:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1406:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__12793);
            rule__KeyIntValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__12796);
            rule__KeyIntValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1413:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1417:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1418:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1418:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1419:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1420:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1420:2: rule__KeyIntValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl2823);
            rule__KeyIntValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1430:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1434:1: ( rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1435:2: rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__22853);
            rule__KeyIntValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__22856);
            rule__KeyIntValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1442:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1446:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1447:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1447:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1448:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1449:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1449:2: rule__KeyIntValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl2883);
            rule__KeyIntValueAnnotation__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1459:1: rule__KeyIntValueAnnotation__Group__3 : rule__KeyIntValueAnnotation__Group__3__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1463:1: ( rule__KeyIntValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1464:2: rule__KeyIntValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__32913);
            rule__KeyIntValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1470:1: rule__KeyIntValueAnnotation__Group__3__Impl : ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyIntValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1474:1: ( ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1475:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1475:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1476:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1477:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1477:2: rule__KeyIntValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl2940);
                    rule__KeyIntValueAnnotation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1495:1: rule__KeyIntValueAnnotation__Group_3__0 : rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 ;
    public final void rule__KeyIntValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1499:1: ( rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1500:2: rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__02979);
            rule__KeyIntValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__02982);
            rule__KeyIntValueAnnotation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1507:1: rule__KeyIntValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1511:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1512:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1512:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1513:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyIntValueAnnotation__Group_3__0__Impl3010); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1526:1: rule__KeyIntValueAnnotation__Group_3__1 : rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 ;
    public final void rule__KeyIntValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1530:1: ( rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1531:2: rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__13041);
            rule__KeyIntValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__13044);
            rule__KeyIntValueAnnotation__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1538:1: rule__KeyIntValueAnnotation__Group_3__1__Impl : ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1542:1: ( ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1543:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1543:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1544:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1545:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMENT_ANNOTATION||LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1545:2: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl3071);
            	    rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1555:1: rule__KeyIntValueAnnotation__Group_3__2 : rule__KeyIntValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1559:1: ( rule__KeyIntValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1560:2: rule__KeyIntValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__23102);
            rule__KeyIntValueAnnotation__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1566:1: rule__KeyIntValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1570:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1571:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1571:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1572:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeyIntValueAnnotation__Group_3__2__Impl3130); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1591:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1595:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1596:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__03167);
            rule__KeyFloatValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__03170);
            rule__KeyFloatValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1603:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1607:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1608:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1608:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1609:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__KeyFloatValueAnnotation__Group__0__Impl3198); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1622:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1626:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1627:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__13229);
            rule__KeyFloatValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__13232);
            rule__KeyFloatValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1634:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1638:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1639:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1639:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1640:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1641:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1641:2: rule__KeyFloatValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl3259);
            rule__KeyFloatValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1651:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1655:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1656:2: rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__23289);
            rule__KeyFloatValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__23292);
            rule__KeyFloatValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1663:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1667:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1668:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1668:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1669:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1670:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1670:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl3319);
            rule__KeyFloatValueAnnotation__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1680:1: rule__KeyFloatValueAnnotation__Group__3 : rule__KeyFloatValueAnnotation__Group__3__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1684:1: ( rule__KeyFloatValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1685:2: rule__KeyFloatValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__33349);
            rule__KeyFloatValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1691:1: rule__KeyFloatValueAnnotation__Group__3__Impl : ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyFloatValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1695:1: ( ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1696:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1696:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1697:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1698:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1698:2: rule__KeyFloatValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl3376);
                    rule__KeyFloatValueAnnotation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1716:1: rule__KeyFloatValueAnnotation__Group_3__0 : rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1720:1: ( rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1721:2: rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__03415);
            rule__KeyFloatValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__03418);
            rule__KeyFloatValueAnnotation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1728:1: rule__KeyFloatValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1732:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1733:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1733:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1734:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl3446); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1747:1: rule__KeyFloatValueAnnotation__Group_3__1 : rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1751:1: ( rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1752:2: rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__13477);
            rule__KeyFloatValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__13480);
            rule__KeyFloatValueAnnotation__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1759:1: rule__KeyFloatValueAnnotation__Group_3__1__Impl : ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1763:1: ( ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1764:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1764:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1765:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1766:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMENT_ANNOTATION||LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1766:2: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl3507);
            	    rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1776:1: rule__KeyFloatValueAnnotation__Group_3__2 : rule__KeyFloatValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1780:1: ( rule__KeyFloatValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1781:2: rule__KeyFloatValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__23538);
            rule__KeyFloatValueAnnotation__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1787:1: rule__KeyFloatValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1791:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1792:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1792:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1793:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl3566); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1813:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1817:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1818:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__03604);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__03607);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1825:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1829:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1830:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1830:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1831:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl3634); if (state.failed) return ;
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1842:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1846:1: ( rule__ExtendedID__Group__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1847:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__13663);
            rule__ExtendedID__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1853:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1857:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1858:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1858:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1859:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1860:1: ( rule__ExtendedID__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1860:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl3690);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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


    // $ANTLR start "rule__ExtendedID__Group_1__0"
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1874:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1878:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1879:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__03725);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__03728);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1886:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1890:1: ( ( '.' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1891:1: ( '.' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1891:1: ( '.' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1892:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ExtendedID__Group_1__0__Impl3756); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1905:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1909:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1910:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__13787);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1916:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1920:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1921:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1921:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1922:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl3814); if (state.failed) return ;
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


    // $ANTLR start "rule__CommentAnnotation__ValueAssignment"
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1938:1: rule__CommentAnnotation__ValueAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1942:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1943:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1943:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1944:1: RULE_COMMENT_ANNOTATION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment3852); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1953:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1957:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1958:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1958:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1959:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_13883);
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


    // $ANTLR start "rule__TagAnnotation__AnnotationsAssignment_2_1"
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1968:1: rule__TagAnnotation__AnnotationsAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__TagAnnotation__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1972:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1973:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1973:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1974:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_13914);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1983:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1987:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1988:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1988:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1989:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_13945);
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


    // $ANTLR start "rule__KeyStringValueAnnotation__ValueAssignment_2"
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1998:1: rule__KeyStringValueAnnotation__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2002:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2003:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2003:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2004:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_23976);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2013:1: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2017:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2018:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2018:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2019:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_14007);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2028:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2032:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2033:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2033:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2034:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_14038);
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2043:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2047:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2048:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2048:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2049:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_34069);
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


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__ValueAssignment_5"
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2058:1: rule__TypedKeyStringValueAnnotation__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2062:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2063:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2063:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2064:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_54100);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2073:1: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 : ( ruleAnnotation ) ;
    public final void rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2077:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2078:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2078:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2079:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_14131);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2088:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2092:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2093:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2093:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2094:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_14162);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2103:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2107:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2108:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2108:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2109:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBooleanTerminalRuleCall_2_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_24193); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBooleanTerminalRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2118:1: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2122:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2123:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2123:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2124:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_14224);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2133:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2137:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2138:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2138:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2139:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_14255);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2148:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2152:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2153:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2153:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2154:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_24286); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2163:1: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2167:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2168:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2168:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2169:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_14317);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2178:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2182:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2183:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2183:1: ( ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2184:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_14348);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2193:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2197:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2198:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2198:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2199:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloatTerminalRuleCall_2_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_24379); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloatTerminalRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2208:1: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2212:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2213:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2213:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:2214:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_14410);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
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
        "\3\uffff\1\12\7\uffff\1\12";
    static final String DFA1_minS =
        "\1\6\1\uffff\1\5\1\4\1\5\6\uffff\1\4";
    static final String DFA1_maxS =
        "\1\16\1\uffff\1\5\1\23\1\5\6\uffff\1\23";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\3\uffff\1\4\1\3\1\7\1\5\1\6\1\2\1\uffff";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\7\uffff\1\2",
            "",
            "\1\3",
            "\2\6\1\12\1\10\1\11\1\7\4\uffff\3\12\1\5\1\uffff\1\4",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\6\1\12\1\10\1\11\1\7\4\uffff\3\12\1\5\1\uffff\1\4"
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
            return "344:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString549 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID609 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__0859 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__0862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TagAnnotation__Group__0__Impl890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__1921 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__1924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__2981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl1008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__01045 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__01048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TagAnnotation__Group_2__0__Impl1076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__11107 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__11110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl1137 = new BitSet(new long[]{0x0000000000004042L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__21168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TagAnnotation__Group_2__2__Impl1196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__01233 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__01236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__KeyStringValueAnnotation__Group__0__Impl1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__11295 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__11298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__21355 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__21358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl1385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__31415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl1442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__01481 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__01484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyStringValueAnnotation__Group_3__0__Impl1512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__11543 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__11546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl1573 = new BitSet(new long[]{0x0000000000004042L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__21604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeyStringValueAnnotation__Group_3__2__Impl1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__01669 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__01672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl1700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__11731 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__11734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__21791 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__21794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl1822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__31853 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__31856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__41913 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__41916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl1944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__51975 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__51978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl2005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__62035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl2062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__02107 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__02110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl2138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__12169 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__12172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl2199 = new BitSet(new long[]{0x0000000000004042L});
        public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__22230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl2258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__02295 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__02298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__KeyBooleanValueAnnotation__Group__0__Impl2326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__12357 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__12360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl2387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__22417 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__22420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl2447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__32477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl2504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__02543 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__02546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl2574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__12605 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__12608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl2635 = new BitSet(new long[]{0x0000000000004042L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__22666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl2694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__02731 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__02734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__KeyIntValueAnnotation__Group__0__Impl2762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__12793 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__12796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl2823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__22853 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__22856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl2883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__32913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl2940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__02979 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__02982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyIntValueAnnotation__Group_3__0__Impl3010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__13041 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__13044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl3071 = new BitSet(new long[]{0x0000000000004042L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__23102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeyIntValueAnnotation__Group_3__2__Impl3130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__03167 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__03170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__KeyFloatValueAnnotation__Group__0__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__13229 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__13232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl3259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__23289 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__23292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl3319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__33349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl3376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__03415 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__03418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__13477 = new BitSet(new long[]{0x0000000000014040L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__13480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl3507 = new BitSet(new long[]{0x0000000000004042L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__23538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl3566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__03604 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__03607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl3634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__13663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl3690 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__03725 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__03728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ExtendedID__Group_1__0__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__13787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl3814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment3852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_13883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_13914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_13945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_23976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_14007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_14038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_34069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_54100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_14131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_14162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_24193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_14224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_14255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_24286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_14317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_14348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_24379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_14410 = new BitSet(new long[]{0x0000000000000002L});
    }


}