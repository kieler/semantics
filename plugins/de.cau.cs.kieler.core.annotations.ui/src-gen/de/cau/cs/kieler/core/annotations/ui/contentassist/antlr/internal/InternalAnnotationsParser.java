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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_COMMENT_ANNOTATION", "RULE_TYPEID", "RULE_BOOLEAN", "RULE_INT", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'('", "')'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=9;
    public static final int RULE_WS=13;
    public static final int RULE_FLOAT=10;
    public static final int RULE_TYPEID=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_COMMENT_ANNOTATION=6;
    public static final int RULE_ML_COMMENT=11;

        public InternalAnnotationsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[142+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
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




    // $ANTLR start entryRuleAnnotation
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:62:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:63:1: ( ruleAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:64:1: ruleAnnotation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation67);
            ruleAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation74); if (failed) return ;

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
    // $ANTLR end entryRuleAnnotation


    // $ANTLR start ruleAnnotation
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
            if ( backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:78:1: ( rule__Annotation__Alternatives )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:78:2: rule__Annotation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation100);
            rule__Annotation__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleAnnotation


    // $ANTLR start entryRuleCommentAnnotation
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:90:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:91:1: ( ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:92:1: ruleCommentAnnotation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation127);
            ruleCommentAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation134); if (failed) return ;

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
    // $ANTLR end entryRuleCommentAnnotation


    // $ANTLR start ruleCommentAnnotation
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
            if ( backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:106:1: ( rule__CommentAnnotation__ValueAssignment )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:106:2: rule__CommentAnnotation__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation160);
            rule__CommentAnnotation__ValueAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleCommentAnnotation


    // $ANTLR start entryRuleTagAnnotation
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:118:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:119:1: ( ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:120:1: ruleTagAnnotation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation187);
            ruleTagAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTagAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation194); if (failed) return ;

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
    // $ANTLR end entryRuleTagAnnotation


    // $ANTLR start ruleTagAnnotation
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
            if ( backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:134:1: ( rule__TagAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:134:2: rule__TagAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation220);
            rule__TagAnnotation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleTagAnnotation


    // $ANTLR start entryRuleKeyStringValueAnnotation
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:146:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:147:1: ( ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:148:1: ruleKeyStringValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation247);
            ruleKeyStringValueAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation254); if (failed) return ;

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
    // $ANTLR end entryRuleKeyStringValueAnnotation


    // $ANTLR start ruleKeyStringValueAnnotation
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
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:162:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:162:2: rule__KeyStringValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation280);
            rule__KeyStringValueAnnotation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleKeyStringValueAnnotation


    // $ANTLR start entryRuleTypedStringAnnotation
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:174:1: entryRuleTypedStringAnnotation : ruleTypedStringAnnotation EOF ;
    public final void entryRuleTypedStringAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:175:1: ( ruleTypedStringAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:176:1: ruleTypedStringAnnotation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedStringAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedStringAnnotation_in_entryRuleTypedStringAnnotation307);
            ruleTypedStringAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypedStringAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedStringAnnotation314); if (failed) return ;

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
    // $ANTLR end entryRuleTypedStringAnnotation


    // $ANTLR start ruleTypedStringAnnotation
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:183:1: ruleTypedStringAnnotation : ( ( rule__TypedStringAnnotation__Group__0 ) ) ;
    public final void ruleTypedStringAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:187:2: ( ( ( rule__TypedStringAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:188:1: ( ( rule__TypedStringAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:188:1: ( ( rule__TypedStringAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:189:1: ( rule__TypedStringAnnotation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedStringAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:190:1: ( rule__TypedStringAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:190:2: rule__TypedStringAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group__0_in_ruleTypedStringAnnotation340);
            rule__TypedStringAnnotation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTypedStringAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTypedStringAnnotation


    // $ANTLR start entryRuleKeyBooleanValueAnnotation
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:202:1: entryRuleKeyBooleanValueAnnotation : ruleKeyBooleanValueAnnotation EOF ;
    public final void entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:203:1: ( ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:204:1: ruleKeyBooleanValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation367);
            ruleKeyBooleanValueAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation374); if (failed) return ;

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
    // $ANTLR end entryRuleKeyBooleanValueAnnotation


    // $ANTLR start ruleKeyBooleanValueAnnotation
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
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:218:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:218:2: rule__KeyBooleanValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation400);
            rule__KeyBooleanValueAnnotation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleKeyBooleanValueAnnotation


    // $ANTLR start entryRuleKeyIntValueAnnotation
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:230:1: entryRuleKeyIntValueAnnotation : ruleKeyIntValueAnnotation EOF ;
    public final void entryRuleKeyIntValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:231:1: ( ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:232:1: ruleKeyIntValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation427);
            ruleKeyIntValueAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation434); if (failed) return ;

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
    // $ANTLR end entryRuleKeyIntValueAnnotation


    // $ANTLR start ruleKeyIntValueAnnotation
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
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:246:1: ( rule__KeyIntValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:246:2: rule__KeyIntValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation460);
            rule__KeyIntValueAnnotation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleKeyIntValueAnnotation


    // $ANTLR start entryRuleKeyFloatValueAnnotation
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:258:1: entryRuleKeyFloatValueAnnotation : ruleKeyFloatValueAnnotation EOF ;
    public final void entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:259:1: ( ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:260:1: ruleKeyFloatValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation487);
            ruleKeyFloatValueAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation494); if (failed) return ;

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
    // $ANTLR end entryRuleKeyFloatValueAnnotation


    // $ANTLR start ruleKeyFloatValueAnnotation
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
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:274:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:274:2: rule__KeyFloatValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation520);
            rule__KeyFloatValueAnnotation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleKeyFloatValueAnnotation


    // $ANTLR start entryRuleEString
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:288:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:289:1: ( ruleEString EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:290:1: ruleEString EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString549);
            ruleEString();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString556); if (failed) return ;

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
    // $ANTLR end entryRuleEString


    // $ANTLR start ruleEString
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
            if ( backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:304:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:304:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString582);
            rule__EString__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end ruleEString


    // $ANTLR start rule__Annotation__Alternatives
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:316:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedStringAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:320:1: ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedStringAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) )
            int alt1=7;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_COMMENT_ANNOTATION) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case RULE_INT:
                        {
                        alt1=6;
                        }
                        break;
                    case RULE_STRING:
                    case RULE_ID:
                        {
                        alt1=3;
                        }
                        break;
                    case RULE_TYPEID:
                        {
                        alt1=4;
                        }
                        break;
                    case RULE_FLOAT:
                        {
                        alt1=7;
                        }
                        break;
                    case EOF:
                    case RULE_COMMENT_ANNOTATION:
                    case 15:
                    case 16:
                    case 17:
                        {
                        alt1=2;
                        }
                        break;
                    case RULE_BOOLEAN:
                        {
                        alt1=5;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("316:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedStringAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );", 1, 3, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("316:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedStringAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("316:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedStringAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:321:1: ( ruleCommentAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:321:1: ( ruleCommentAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:322:1: ruleCommentAnnotation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives618);
                    ruleCommentAnnotation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:327:6: ( ruleTagAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:327:6: ( ruleTagAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:328:1: ruleTagAnnotation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives635);
                    ruleTagAnnotation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:333:6: ( ruleKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:333:6: ( ruleKeyStringValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:334:1: ruleKeyStringValueAnnotation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives652);
                    ruleKeyStringValueAnnotation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:339:6: ( ruleTypedStringAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:339:6: ( ruleTypedStringAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:340:1: ruleTypedStringAnnotation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTypedStringAnnotationParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedStringAnnotation_in_rule__Annotation__Alternatives669);
                    ruleTypedStringAnnotation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getTypedStringAnnotationParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:345:6: ( ruleKeyBooleanValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:345:6: ( ruleKeyBooleanValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:346:1: ruleKeyBooleanValueAnnotation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives686);
                    ruleKeyBooleanValueAnnotation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:351:6: ( ruleKeyIntValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:351:6: ( ruleKeyIntValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:352:1: ruleKeyIntValueAnnotation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives703);
                    ruleKeyIntValueAnnotation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:357:6: ( ruleKeyFloatValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:357:6: ( ruleKeyFloatValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:358:1: ruleKeyFloatValueAnnotation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives720);
                    ruleKeyFloatValueAnnotation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
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
    // $ANTLR end rule__Annotation__Alternatives


    // $ANTLR start rule__EString__Alternatives
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:368:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:372:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("368:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:373:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:373:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:374:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives752); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:379:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:379:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:380:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives769); if (failed) return ;
                    if ( backtracking==0 ) {
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
    // $ANTLR end rule__EString__Alternatives


    // $ANTLR start rule__TagAnnotation__Group__0
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:392:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:396:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:397:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__0799);
            rule__TagAnnotation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__0802);
            rule__TagAnnotation__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TagAnnotation__Group__0


    // $ANTLR start rule__TagAnnotation__Group__0__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:404:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:408:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:409:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:409:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:410:1: '@'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TagAnnotation__Group__0__Impl830); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__TagAnnotation__Group__0__Impl


    // $ANTLR start rule__TagAnnotation__Group__1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:423:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:427:1: ( rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:428:2: rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__1861);
            rule__TagAnnotation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__1864);
            rule__TagAnnotation__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TagAnnotation__Group__1


    // $ANTLR start rule__TagAnnotation__Group__1__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:435:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:439:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:440:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:440:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:441:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:442:1: ( rule__TagAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:442:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl891);
            rule__TagAnnotation__NameAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__TagAnnotation__Group__1__Impl


    // $ANTLR start rule__TagAnnotation__Group__2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:452:1: rule__TagAnnotation__Group__2 : rule__TagAnnotation__Group__2__Impl ;
    public final void rule__TagAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:456:1: ( rule__TagAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:457:2: rule__TagAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__2921);
            rule__TagAnnotation__Group__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TagAnnotation__Group__2


    // $ANTLR start rule__TagAnnotation__Group__2__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:463:1: rule__TagAnnotation__Group__2__Impl : ( ( rule__TagAnnotation__Group_2__0 )? ) ;
    public final void rule__TagAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:467:1: ( ( ( rule__TagAnnotation__Group_2__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:468:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:468:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:469:1: ( rule__TagAnnotation__Group_2__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup_2()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:470:1: ( rule__TagAnnotation__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:470:2: rule__TagAnnotation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl948);
                    rule__TagAnnotation__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__TagAnnotation__Group__2__Impl


    // $ANTLR start rule__TagAnnotation__Group_2__0
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:486:1: rule__TagAnnotation__Group_2__0 : rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 ;
    public final void rule__TagAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:490:1: ( rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:491:2: rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__0985);
            rule__TagAnnotation__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__0988);
            rule__TagAnnotation__Group_2__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TagAnnotation__Group_2__0


    // $ANTLR start rule__TagAnnotation__Group_2__0__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:498:1: rule__TagAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TagAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:502:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:503:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:503:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:504:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TagAnnotation__Group_2__0__Impl1016); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__TagAnnotation__Group_2__0__Impl


    // $ANTLR start rule__TagAnnotation__Group_2__1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:517:1: rule__TagAnnotation__Group_2__1 : rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 ;
    public final void rule__TagAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:521:1: ( rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:522:2: rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__11047);
            rule__TagAnnotation__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__11050);
            rule__TagAnnotation__Group_2__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TagAnnotation__Group_2__1


    // $ANTLR start rule__TagAnnotation__Group_2__1__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:529:1: rule__TagAnnotation__Group_2__1__Impl : ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) ;
    public final void rule__TagAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:533:1: ( ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:534:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:534:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:535:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:536:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMENT_ANNOTATION||LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:536:2: rule__TagAnnotation__AnnotationsAssignment_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl1077);
            	    rule__TagAnnotation__AnnotationsAssignment_2_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__TagAnnotation__Group_2__1__Impl


    // $ANTLR start rule__TagAnnotation__Group_2__2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:546:1: rule__TagAnnotation__Group_2__2 : rule__TagAnnotation__Group_2__2__Impl ;
    public final void rule__TagAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:550:1: ( rule__TagAnnotation__Group_2__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:551:2: rule__TagAnnotation__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__21108);
            rule__TagAnnotation__Group_2__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TagAnnotation__Group_2__2


    // $ANTLR start rule__TagAnnotation__Group_2__2__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:557:1: rule__TagAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TagAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:561:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:562:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:562:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:563:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TagAnnotation__Group_2__2__Impl1136); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__TagAnnotation__Group_2__2__Impl


    // $ANTLR start rule__KeyStringValueAnnotation__Group__0
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:582:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:586:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:587:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__01173);
            rule__KeyStringValueAnnotation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__01176);
            rule__KeyStringValueAnnotation__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyStringValueAnnotation__Group__0


    // $ANTLR start rule__KeyStringValueAnnotation__Group__0__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:594:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:598:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:599:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:599:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:600:1: '@'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyStringValueAnnotation__Group__0__Impl1204); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyStringValueAnnotation__Group__0__Impl


    // $ANTLR start rule__KeyStringValueAnnotation__Group__1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:613:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:617:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:618:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__11235);
            rule__KeyStringValueAnnotation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__11238);
            rule__KeyStringValueAnnotation__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyStringValueAnnotation__Group__1


    // $ANTLR start rule__KeyStringValueAnnotation__Group__1__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:625:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:629:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:630:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:630:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:631:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:632:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:632:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl1265);
            rule__KeyStringValueAnnotation__NameAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyStringValueAnnotation__Group__1__Impl


    // $ANTLR start rule__KeyStringValueAnnotation__Group__2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:642:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:646:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:647:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__21295);
            rule__KeyStringValueAnnotation__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__21298);
            rule__KeyStringValueAnnotation__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyStringValueAnnotation__Group__2


    // $ANTLR start rule__KeyStringValueAnnotation__Group__2__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:654:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:658:1: ( ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:659:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:659:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:660:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:661:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:661:2: rule__KeyStringValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl1325);
            rule__KeyStringValueAnnotation__ValueAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyStringValueAnnotation__Group__2__Impl


    // $ANTLR start rule__KeyStringValueAnnotation__Group__3
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:671:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:675:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:676:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__31355);
            rule__KeyStringValueAnnotation__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyStringValueAnnotation__Group__3


    // $ANTLR start rule__KeyStringValueAnnotation__Group__3__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:682:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:686:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:687:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:687:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:688:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:689:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:689:2: rule__KeyStringValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl1382);
                    rule__KeyStringValueAnnotation__Group_3__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyStringValueAnnotation__Group__3__Impl


    // $ANTLR start rule__KeyStringValueAnnotation__Group_3__0
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:707:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:711:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:712:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__01421);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__01424);
            rule__KeyStringValueAnnotation__Group_3__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyStringValueAnnotation__Group_3__0


    // $ANTLR start rule__KeyStringValueAnnotation__Group_3__0__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:719:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:723:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:724:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:724:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:725:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeyStringValueAnnotation__Group_3__0__Impl1452); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyStringValueAnnotation__Group_3__0__Impl


    // $ANTLR start rule__KeyStringValueAnnotation__Group_3__1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:738:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:742:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:743:2: rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__11483);
            rule__KeyStringValueAnnotation__Group_3__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__11486);
            rule__KeyStringValueAnnotation__Group_3__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyStringValueAnnotation__Group_3__1


    // $ANTLR start rule__KeyStringValueAnnotation__Group_3__1__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:750:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:754:1: ( ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:755:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:755:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:756:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:757:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMENT_ANNOTATION||LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:757:2: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl1513);
            	    rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyStringValueAnnotation__Group_3__1__Impl


    // $ANTLR start rule__KeyStringValueAnnotation__Group_3__2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:767:1: rule__KeyStringValueAnnotation__Group_3__2 : rule__KeyStringValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:771:1: ( rule__KeyStringValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:772:2: rule__KeyStringValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__21544);
            rule__KeyStringValueAnnotation__Group_3__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyStringValueAnnotation__Group_3__2


    // $ANTLR start rule__KeyStringValueAnnotation__Group_3__2__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:778:1: rule__KeyStringValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:782:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:783:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:783:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:784:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__KeyStringValueAnnotation__Group_3__2__Impl1572); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyStringValueAnnotation__Group_3__2__Impl


    // $ANTLR start rule__TypedStringAnnotation__Group__0
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:803:1: rule__TypedStringAnnotation__Group__0 : rule__TypedStringAnnotation__Group__0__Impl rule__TypedStringAnnotation__Group__1 ;
    public final void rule__TypedStringAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:807:1: ( rule__TypedStringAnnotation__Group__0__Impl rule__TypedStringAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:808:2: rule__TypedStringAnnotation__Group__0__Impl rule__TypedStringAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group__0__Impl_in_rule__TypedStringAnnotation__Group__01609);
            rule__TypedStringAnnotation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group__1_in_rule__TypedStringAnnotation__Group__01612);
            rule__TypedStringAnnotation__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group__0


    // $ANTLR start rule__TypedStringAnnotation__Group__0__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:815:1: rule__TypedStringAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedStringAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:819:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:820:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:820:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:821:1: '@'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedStringAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TypedStringAnnotation__Group__0__Impl1640); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypedStringAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group__0__Impl


    // $ANTLR start rule__TypedStringAnnotation__Group__1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:834:1: rule__TypedStringAnnotation__Group__1 : rule__TypedStringAnnotation__Group__1__Impl rule__TypedStringAnnotation__Group__2 ;
    public final void rule__TypedStringAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:838:1: ( rule__TypedStringAnnotation__Group__1__Impl rule__TypedStringAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:839:2: rule__TypedStringAnnotation__Group__1__Impl rule__TypedStringAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group__1__Impl_in_rule__TypedStringAnnotation__Group__11671);
            rule__TypedStringAnnotation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group__2_in_rule__TypedStringAnnotation__Group__11674);
            rule__TypedStringAnnotation__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group__1


    // $ANTLR start rule__TypedStringAnnotation__Group__1__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:846:1: rule__TypedStringAnnotation__Group__1__Impl : ( ( rule__TypedStringAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedStringAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:850:1: ( ( ( rule__TypedStringAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:851:1: ( ( rule__TypedStringAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:851:1: ( ( rule__TypedStringAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:852:1: ( rule__TypedStringAnnotation__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedStringAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:853:1: ( rule__TypedStringAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:853:2: rule__TypedStringAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__NameAssignment_1_in_rule__TypedStringAnnotation__Group__1__Impl1701);
            rule__TypedStringAnnotation__NameAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTypedStringAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group__1__Impl


    // $ANTLR start rule__TypedStringAnnotation__Group__2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:863:1: rule__TypedStringAnnotation__Group__2 : rule__TypedStringAnnotation__Group__2__Impl rule__TypedStringAnnotation__Group__3 ;
    public final void rule__TypedStringAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:867:1: ( rule__TypedStringAnnotation__Group__2__Impl rule__TypedStringAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:868:2: rule__TypedStringAnnotation__Group__2__Impl rule__TypedStringAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group__2__Impl_in_rule__TypedStringAnnotation__Group__21731);
            rule__TypedStringAnnotation__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group__3_in_rule__TypedStringAnnotation__Group__21734);
            rule__TypedStringAnnotation__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group__2


    // $ANTLR start rule__TypedStringAnnotation__Group__2__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:875:1: rule__TypedStringAnnotation__Group__2__Impl : ( ( rule__TypedStringAnnotation__TypeAssignment_2 ) ) ;
    public final void rule__TypedStringAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:879:1: ( ( ( rule__TypedStringAnnotation__TypeAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:880:1: ( ( rule__TypedStringAnnotation__TypeAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:880:1: ( ( rule__TypedStringAnnotation__TypeAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:881:1: ( rule__TypedStringAnnotation__TypeAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedStringAnnotationAccess().getTypeAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:882:1: ( rule__TypedStringAnnotation__TypeAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:882:2: rule__TypedStringAnnotation__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__TypeAssignment_2_in_rule__TypedStringAnnotation__Group__2__Impl1761);
            rule__TypedStringAnnotation__TypeAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTypedStringAnnotationAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group__2__Impl


    // $ANTLR start rule__TypedStringAnnotation__Group__3
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:892:1: rule__TypedStringAnnotation__Group__3 : rule__TypedStringAnnotation__Group__3__Impl rule__TypedStringAnnotation__Group__4 ;
    public final void rule__TypedStringAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:896:1: ( rule__TypedStringAnnotation__Group__3__Impl rule__TypedStringAnnotation__Group__4 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:897:2: rule__TypedStringAnnotation__Group__3__Impl rule__TypedStringAnnotation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group__3__Impl_in_rule__TypedStringAnnotation__Group__31791);
            rule__TypedStringAnnotation__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group__4_in_rule__TypedStringAnnotation__Group__31794);
            rule__TypedStringAnnotation__Group__4();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group__3


    // $ANTLR start rule__TypedStringAnnotation__Group__3__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:904:1: rule__TypedStringAnnotation__Group__3__Impl : ( ( rule__TypedStringAnnotation__ValueAssignment_3 ) ) ;
    public final void rule__TypedStringAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:908:1: ( ( ( rule__TypedStringAnnotation__ValueAssignment_3 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:909:1: ( ( rule__TypedStringAnnotation__ValueAssignment_3 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:909:1: ( ( rule__TypedStringAnnotation__ValueAssignment_3 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:910:1: ( rule__TypedStringAnnotation__ValueAssignment_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedStringAnnotationAccess().getValueAssignment_3()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:911:1: ( rule__TypedStringAnnotation__ValueAssignment_3 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:911:2: rule__TypedStringAnnotation__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__ValueAssignment_3_in_rule__TypedStringAnnotation__Group__3__Impl1821);
            rule__TypedStringAnnotation__ValueAssignment_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTypedStringAnnotationAccess().getValueAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group__3__Impl


    // $ANTLR start rule__TypedStringAnnotation__Group__4
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:921:1: rule__TypedStringAnnotation__Group__4 : rule__TypedStringAnnotation__Group__4__Impl ;
    public final void rule__TypedStringAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:925:1: ( rule__TypedStringAnnotation__Group__4__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:926:2: rule__TypedStringAnnotation__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group__4__Impl_in_rule__TypedStringAnnotation__Group__41851);
            rule__TypedStringAnnotation__Group__4__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group__4


    // $ANTLR start rule__TypedStringAnnotation__Group__4__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:932:1: rule__TypedStringAnnotation__Group__4__Impl : ( ( rule__TypedStringAnnotation__Group_4__0 )? ) ;
    public final void rule__TypedStringAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:936:1: ( ( ( rule__TypedStringAnnotation__Group_4__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:937:1: ( ( rule__TypedStringAnnotation__Group_4__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:937:1: ( ( rule__TypedStringAnnotation__Group_4__0 )? )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:938:1: ( rule__TypedStringAnnotation__Group_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedStringAnnotationAccess().getGroup_4()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:939:1: ( rule__TypedStringAnnotation__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:939:2: rule__TypedStringAnnotation__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group_4__0_in_rule__TypedStringAnnotation__Group__4__Impl1878);
                    rule__TypedStringAnnotation__Group_4__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTypedStringAnnotationAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group__4__Impl


    // $ANTLR start rule__TypedStringAnnotation__Group_4__0
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:959:1: rule__TypedStringAnnotation__Group_4__0 : rule__TypedStringAnnotation__Group_4__0__Impl rule__TypedStringAnnotation__Group_4__1 ;
    public final void rule__TypedStringAnnotation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:963:1: ( rule__TypedStringAnnotation__Group_4__0__Impl rule__TypedStringAnnotation__Group_4__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:964:2: rule__TypedStringAnnotation__Group_4__0__Impl rule__TypedStringAnnotation__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group_4__0__Impl_in_rule__TypedStringAnnotation__Group_4__01919);
            rule__TypedStringAnnotation__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group_4__1_in_rule__TypedStringAnnotation__Group_4__01922);
            rule__TypedStringAnnotation__Group_4__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group_4__0


    // $ANTLR start rule__TypedStringAnnotation__Group_4__0__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:971:1: rule__TypedStringAnnotation__Group_4__0__Impl : ( '(' ) ;
    public final void rule__TypedStringAnnotation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:975:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:976:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:976:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:977:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedStringAnnotationAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TypedStringAnnotation__Group_4__0__Impl1950); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypedStringAnnotationAccess().getLeftParenthesisKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group_4__0__Impl


    // $ANTLR start rule__TypedStringAnnotation__Group_4__1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:990:1: rule__TypedStringAnnotation__Group_4__1 : rule__TypedStringAnnotation__Group_4__1__Impl rule__TypedStringAnnotation__Group_4__2 ;
    public final void rule__TypedStringAnnotation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:994:1: ( rule__TypedStringAnnotation__Group_4__1__Impl rule__TypedStringAnnotation__Group_4__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:995:2: rule__TypedStringAnnotation__Group_4__1__Impl rule__TypedStringAnnotation__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group_4__1__Impl_in_rule__TypedStringAnnotation__Group_4__11981);
            rule__TypedStringAnnotation__Group_4__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group_4__2_in_rule__TypedStringAnnotation__Group_4__11984);
            rule__TypedStringAnnotation__Group_4__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group_4__1


    // $ANTLR start rule__TypedStringAnnotation__Group_4__1__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1002:1: rule__TypedStringAnnotation__Group_4__1__Impl : ( ( rule__TypedStringAnnotation__AnnotationsAssignment_4_1 )* ) ;
    public final void rule__TypedStringAnnotation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1006:1: ( ( ( rule__TypedStringAnnotation__AnnotationsAssignment_4_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1007:1: ( ( rule__TypedStringAnnotation__AnnotationsAssignment_4_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1007:1: ( ( rule__TypedStringAnnotation__AnnotationsAssignment_4_1 )* )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1008:1: ( rule__TypedStringAnnotation__AnnotationsAssignment_4_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedStringAnnotationAccess().getAnnotationsAssignment_4_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1009:1: ( rule__TypedStringAnnotation__AnnotationsAssignment_4_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMENT_ANNOTATION||LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1009:2: rule__TypedStringAnnotation__AnnotationsAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__AnnotationsAssignment_4_1_in_rule__TypedStringAnnotation__Group_4__1__Impl2011);
            	    rule__TypedStringAnnotation__AnnotationsAssignment_4_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getTypedStringAnnotationAccess().getAnnotationsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group_4__1__Impl


    // $ANTLR start rule__TypedStringAnnotation__Group_4__2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1019:1: rule__TypedStringAnnotation__Group_4__2 : rule__TypedStringAnnotation__Group_4__2__Impl ;
    public final void rule__TypedStringAnnotation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1023:1: ( rule__TypedStringAnnotation__Group_4__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1024:2: rule__TypedStringAnnotation__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypedStringAnnotation__Group_4__2__Impl_in_rule__TypedStringAnnotation__Group_4__22042);
            rule__TypedStringAnnotation__Group_4__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group_4__2


    // $ANTLR start rule__TypedStringAnnotation__Group_4__2__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1030:1: rule__TypedStringAnnotation__Group_4__2__Impl : ( ')' ) ;
    public final void rule__TypedStringAnnotation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1034:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1035:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1035:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1036:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedStringAnnotationAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TypedStringAnnotation__Group_4__2__Impl2070); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypedStringAnnotationAccess().getRightParenthesisKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__Group_4__2__Impl


    // $ANTLR start rule__KeyBooleanValueAnnotation__Group__0
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1055:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1059:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1060:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__02107);
            rule__KeyBooleanValueAnnotation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__02110);
            rule__KeyBooleanValueAnnotation__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyBooleanValueAnnotation__Group__0


    // $ANTLR start rule__KeyBooleanValueAnnotation__Group__0__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1067:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1071:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1072:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1072:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1073:1: '@'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyBooleanValueAnnotation__Group__0__Impl2138); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyBooleanValueAnnotation__Group__0__Impl


    // $ANTLR start rule__KeyBooleanValueAnnotation__Group__1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1086:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1090:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1091:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__12169);
            rule__KeyBooleanValueAnnotation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__12172);
            rule__KeyBooleanValueAnnotation__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyBooleanValueAnnotation__Group__1


    // $ANTLR start rule__KeyBooleanValueAnnotation__Group__1__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1098:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1102:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1103:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1103:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1104:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1105:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1105:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl2199);
            rule__KeyBooleanValueAnnotation__NameAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyBooleanValueAnnotation__Group__1__Impl


    // $ANTLR start rule__KeyBooleanValueAnnotation__Group__2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1115:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1119:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1120:2: rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__22229);
            rule__KeyBooleanValueAnnotation__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__22232);
            rule__KeyBooleanValueAnnotation__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyBooleanValueAnnotation__Group__2


    // $ANTLR start rule__KeyBooleanValueAnnotation__Group__2__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1127:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1131:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1132:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1132:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1133:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1134:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1134:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl2259);
            rule__KeyBooleanValueAnnotation__ValueAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyBooleanValueAnnotation__Group__2__Impl


    // $ANTLR start rule__KeyBooleanValueAnnotation__Group__3
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1144:1: rule__KeyBooleanValueAnnotation__Group__3 : rule__KeyBooleanValueAnnotation__Group__3__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1148:1: ( rule__KeyBooleanValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1149:2: rule__KeyBooleanValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__32289);
            rule__KeyBooleanValueAnnotation__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyBooleanValueAnnotation__Group__3


    // $ANTLR start rule__KeyBooleanValueAnnotation__Group__3__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1155:1: rule__KeyBooleanValueAnnotation__Group__3__Impl : ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1159:1: ( ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1160:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1160:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1161:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1162:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1162:2: rule__KeyBooleanValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl2316);
                    rule__KeyBooleanValueAnnotation__Group_3__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyBooleanValueAnnotation__Group__3__Impl


    // $ANTLR start rule__KeyBooleanValueAnnotation__Group_3__0
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1180:1: rule__KeyBooleanValueAnnotation__Group_3__0 : rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1184:1: ( rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1185:2: rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__02355);
            rule__KeyBooleanValueAnnotation__Group_3__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__02358);
            rule__KeyBooleanValueAnnotation__Group_3__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyBooleanValueAnnotation__Group_3__0


    // $ANTLR start rule__KeyBooleanValueAnnotation__Group_3__0__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1192:1: rule__KeyBooleanValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1196:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1197:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1197:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1198:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl2386); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyBooleanValueAnnotation__Group_3__0__Impl


    // $ANTLR start rule__KeyBooleanValueAnnotation__Group_3__1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1211:1: rule__KeyBooleanValueAnnotation__Group_3__1 : rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1215:1: ( rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1216:2: rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__12417);
            rule__KeyBooleanValueAnnotation__Group_3__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__12420);
            rule__KeyBooleanValueAnnotation__Group_3__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyBooleanValueAnnotation__Group_3__1


    // $ANTLR start rule__KeyBooleanValueAnnotation__Group_3__1__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1223:1: rule__KeyBooleanValueAnnotation__Group_3__1__Impl : ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1227:1: ( ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1228:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1228:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1229:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1230:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMENT_ANNOTATION||LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1230:2: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl2447);
            	    rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyBooleanValueAnnotation__Group_3__1__Impl


    // $ANTLR start rule__KeyBooleanValueAnnotation__Group_3__2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1240:1: rule__KeyBooleanValueAnnotation__Group_3__2 : rule__KeyBooleanValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1244:1: ( rule__KeyBooleanValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1245:2: rule__KeyBooleanValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__22478);
            rule__KeyBooleanValueAnnotation__Group_3__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyBooleanValueAnnotation__Group_3__2


    // $ANTLR start rule__KeyBooleanValueAnnotation__Group_3__2__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1251:1: rule__KeyBooleanValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1255:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1256:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1256:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1257:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl2506); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyBooleanValueAnnotation__Group_3__2__Impl


    // $ANTLR start rule__KeyIntValueAnnotation__Group__0
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1276:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1280:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1281:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__02543);
            rule__KeyIntValueAnnotation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__02546);
            rule__KeyIntValueAnnotation__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyIntValueAnnotation__Group__0


    // $ANTLR start rule__KeyIntValueAnnotation__Group__0__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1288:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1292:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1293:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1293:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1294:1: '@'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyIntValueAnnotation__Group__0__Impl2574); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyIntValueAnnotation__Group__0__Impl


    // $ANTLR start rule__KeyIntValueAnnotation__Group__1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1307:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1311:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1312:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__12605);
            rule__KeyIntValueAnnotation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__12608);
            rule__KeyIntValueAnnotation__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyIntValueAnnotation__Group__1


    // $ANTLR start rule__KeyIntValueAnnotation__Group__1__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1319:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1323:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1324:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1324:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1325:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1326:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1326:2: rule__KeyIntValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl2635);
            rule__KeyIntValueAnnotation__NameAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyIntValueAnnotation__Group__1__Impl


    // $ANTLR start rule__KeyIntValueAnnotation__Group__2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1336:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1340:1: ( rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1341:2: rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__22665);
            rule__KeyIntValueAnnotation__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__22668);
            rule__KeyIntValueAnnotation__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyIntValueAnnotation__Group__2


    // $ANTLR start rule__KeyIntValueAnnotation__Group__2__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1348:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1352:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1353:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1353:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1354:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1355:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1355:2: rule__KeyIntValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl2695);
            rule__KeyIntValueAnnotation__ValueAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyIntValueAnnotation__Group__2__Impl


    // $ANTLR start rule__KeyIntValueAnnotation__Group__3
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1365:1: rule__KeyIntValueAnnotation__Group__3 : rule__KeyIntValueAnnotation__Group__3__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1369:1: ( rule__KeyIntValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1370:2: rule__KeyIntValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__32725);
            rule__KeyIntValueAnnotation__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyIntValueAnnotation__Group__3


    // $ANTLR start rule__KeyIntValueAnnotation__Group__3__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1376:1: rule__KeyIntValueAnnotation__Group__3__Impl : ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyIntValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1380:1: ( ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1381:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1381:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1382:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1383:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1383:2: rule__KeyIntValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl2752);
                    rule__KeyIntValueAnnotation__Group_3__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyIntValueAnnotation__Group__3__Impl


    // $ANTLR start rule__KeyIntValueAnnotation__Group_3__0
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1401:1: rule__KeyIntValueAnnotation__Group_3__0 : rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 ;
    public final void rule__KeyIntValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1405:1: ( rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1406:2: rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__02791);
            rule__KeyIntValueAnnotation__Group_3__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__02794);
            rule__KeyIntValueAnnotation__Group_3__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyIntValueAnnotation__Group_3__0


    // $ANTLR start rule__KeyIntValueAnnotation__Group_3__0__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1413:1: rule__KeyIntValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1417:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1418:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1418:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1419:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeyIntValueAnnotation__Group_3__0__Impl2822); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyIntValueAnnotation__Group_3__0__Impl


    // $ANTLR start rule__KeyIntValueAnnotation__Group_3__1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1432:1: rule__KeyIntValueAnnotation__Group_3__1 : rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 ;
    public final void rule__KeyIntValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1436:1: ( rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1437:2: rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__12853);
            rule__KeyIntValueAnnotation__Group_3__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__12856);
            rule__KeyIntValueAnnotation__Group_3__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyIntValueAnnotation__Group_3__1


    // $ANTLR start rule__KeyIntValueAnnotation__Group_3__1__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1444:1: rule__KeyIntValueAnnotation__Group_3__1__Impl : ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1448:1: ( ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1449:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1449:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1450:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1451:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMENT_ANNOTATION||LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1451:2: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl2883);
            	    rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyIntValueAnnotation__Group_3__1__Impl


    // $ANTLR start rule__KeyIntValueAnnotation__Group_3__2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1461:1: rule__KeyIntValueAnnotation__Group_3__2 : rule__KeyIntValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1465:1: ( rule__KeyIntValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1466:2: rule__KeyIntValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__22914);
            rule__KeyIntValueAnnotation__Group_3__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyIntValueAnnotation__Group_3__2


    // $ANTLR start rule__KeyIntValueAnnotation__Group_3__2__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1472:1: rule__KeyIntValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1476:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1477:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1477:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1478:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__KeyIntValueAnnotation__Group_3__2__Impl2942); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyIntValueAnnotation__Group_3__2__Impl


    // $ANTLR start rule__KeyFloatValueAnnotation__Group__0
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1497:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1501:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1502:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__02979);
            rule__KeyFloatValueAnnotation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__02982);
            rule__KeyFloatValueAnnotation__Group__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyFloatValueAnnotation__Group__0


    // $ANTLR start rule__KeyFloatValueAnnotation__Group__0__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1509:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1513:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1514:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1514:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1515:1: '@'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__KeyFloatValueAnnotation__Group__0__Impl3010); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyFloatValueAnnotation__Group__0__Impl


    // $ANTLR start rule__KeyFloatValueAnnotation__Group__1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1528:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1532:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1533:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__13041);
            rule__KeyFloatValueAnnotation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__13044);
            rule__KeyFloatValueAnnotation__Group__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyFloatValueAnnotation__Group__1


    // $ANTLR start rule__KeyFloatValueAnnotation__Group__1__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1540:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1544:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1545:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1545:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1546:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1547:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1547:2: rule__KeyFloatValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl3071);
            rule__KeyFloatValueAnnotation__NameAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyFloatValueAnnotation__Group__1__Impl


    // $ANTLR start rule__KeyFloatValueAnnotation__Group__2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1557:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1561:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1562:2: rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__23101);
            rule__KeyFloatValueAnnotation__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__23104);
            rule__KeyFloatValueAnnotation__Group__3();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyFloatValueAnnotation__Group__2


    // $ANTLR start rule__KeyFloatValueAnnotation__Group__2__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1569:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1573:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1574:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1574:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1575:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1576:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1576:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl3131);
            rule__KeyFloatValueAnnotation__ValueAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyFloatValueAnnotation__Group__2__Impl


    // $ANTLR start rule__KeyFloatValueAnnotation__Group__3
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1586:1: rule__KeyFloatValueAnnotation__Group__3 : rule__KeyFloatValueAnnotation__Group__3__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1590:1: ( rule__KeyFloatValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1591:2: rule__KeyFloatValueAnnotation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__33161);
            rule__KeyFloatValueAnnotation__Group__3__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyFloatValueAnnotation__Group__3


    // $ANTLR start rule__KeyFloatValueAnnotation__Group__3__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1597:1: rule__KeyFloatValueAnnotation__Group__3__Impl : ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyFloatValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1601:1: ( ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1602:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1602:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1603:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1604:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1604:2: rule__KeyFloatValueAnnotation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl3188);
                    rule__KeyFloatValueAnnotation__Group_3__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyFloatValueAnnotation__Group__3__Impl


    // $ANTLR start rule__KeyFloatValueAnnotation__Group_3__0
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1622:1: rule__KeyFloatValueAnnotation__Group_3__0 : rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1626:1: ( rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1627:2: rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__03227);
            rule__KeyFloatValueAnnotation__Group_3__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__03230);
            rule__KeyFloatValueAnnotation__Group_3__1();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyFloatValueAnnotation__Group_3__0


    // $ANTLR start rule__KeyFloatValueAnnotation__Group_3__0__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1634:1: rule__KeyFloatValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1638:1: ( ( '(' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1639:1: ( '(' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1639:1: ( '(' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1640:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl3258); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyFloatValueAnnotation__Group_3__0__Impl


    // $ANTLR start rule__KeyFloatValueAnnotation__Group_3__1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1653:1: rule__KeyFloatValueAnnotation__Group_3__1 : rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1657:1: ( rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1658:2: rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__13289);
            rule__KeyFloatValueAnnotation__Group_3__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__13292);
            rule__KeyFloatValueAnnotation__Group_3__2();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyFloatValueAnnotation__Group_3__1


    // $ANTLR start rule__KeyFloatValueAnnotation__Group_3__1__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1665:1: rule__KeyFloatValueAnnotation__Group_3__1__Impl : ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1669:1: ( ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1670:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1670:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1671:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1672:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMENT_ANNOTATION||LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1672:2: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl3319);
            	    rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyFloatValueAnnotation__Group_3__1__Impl


    // $ANTLR start rule__KeyFloatValueAnnotation__Group_3__2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1682:1: rule__KeyFloatValueAnnotation__Group_3__2 : rule__KeyFloatValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1686:1: ( rule__KeyFloatValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1687:2: rule__KeyFloatValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__23350);
            rule__KeyFloatValueAnnotation__Group_3__2__Impl();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyFloatValueAnnotation__Group_3__2


    // $ANTLR start rule__KeyFloatValueAnnotation__Group_3__2__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1693:1: rule__KeyFloatValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1697:1: ( ( ')' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1698:1: ( ')' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1698:1: ( ')' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1699:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl3378); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyFloatValueAnnotation__Group_3__2__Impl


    // $ANTLR start rule__CommentAnnotation__ValueAssignment
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1720:1: rule__CommentAnnotation__ValueAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1724:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1725:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1725:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1726:1: RULE_COMMENT_ANNOTATION
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment3421); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__CommentAnnotation__ValueAssignment


    // $ANTLR start rule__TagAnnotation__NameAssignment_1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1735:1: rule__TagAnnotation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1739:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1740:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1740:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1741:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TagAnnotation__NameAssignment_13452); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TagAnnotation__NameAssignment_1


    // $ANTLR start rule__TagAnnotation__AnnotationsAssignment_2_1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1750:1: rule__TagAnnotation__AnnotationsAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__TagAnnotation__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1754:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1755:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1755:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1756:1: ruleAnnotation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_13483);
            ruleAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__TagAnnotation__AnnotationsAssignment_2_1


    // $ANTLR start rule__KeyStringValueAnnotation__NameAssignment_1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1765:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1769:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1770:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1770:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1771:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KeyStringValueAnnotation__NameAssignment_13514); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyStringValueAnnotation__NameAssignment_1


    // $ANTLR start rule__KeyStringValueAnnotation__ValueAssignment_2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1780:1: rule__KeyStringValueAnnotation__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1784:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1785:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1785:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1786:1: ruleEString
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_23545);
            ruleEString();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyStringValueAnnotation__ValueAssignment_2


    // $ANTLR start rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1795:1: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1799:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1800:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1800:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1801:1: ruleAnnotation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_13576);
            ruleAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1


    // $ANTLR start rule__TypedStringAnnotation__NameAssignment_1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1810:1: rule__TypedStringAnnotation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypedStringAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1814:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1815:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1815:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1816:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedStringAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__TypedStringAnnotation__NameAssignment_13607); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypedStringAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__NameAssignment_1


    // $ANTLR start rule__TypedStringAnnotation__TypeAssignment_2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1825:1: rule__TypedStringAnnotation__TypeAssignment_2 : ( RULE_TYPEID ) ;
    public final void rule__TypedStringAnnotation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1829:1: ( ( RULE_TYPEID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1830:1: ( RULE_TYPEID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1830:1: ( RULE_TYPEID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1831:1: RULE_TYPEID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedStringAnnotationAccess().getTypeTypeIdTerminalRuleCall_2_0()); 
            }
            match(input,RULE_TYPEID,FollowSets000.FOLLOW_RULE_TYPEID_in_rule__TypedStringAnnotation__TypeAssignment_23638); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypedStringAnnotationAccess().getTypeTypeIdTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__TypeAssignment_2


    // $ANTLR start rule__TypedStringAnnotation__ValueAssignment_3
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1840:1: rule__TypedStringAnnotation__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__TypedStringAnnotation__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1844:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1845:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1845:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1846:1: ruleEString
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedStringAnnotationAccess().getValueEStringParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TypedStringAnnotation__ValueAssignment_33669);
            ruleEString();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypedStringAnnotationAccess().getValueEStringParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__ValueAssignment_3


    // $ANTLR start rule__TypedStringAnnotation__AnnotationsAssignment_4_1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1855:1: rule__TypedStringAnnotation__AnnotationsAssignment_4_1 : ( ruleAnnotation ) ;
    public final void rule__TypedStringAnnotation__AnnotationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1859:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1860:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1860:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1861:1: ruleAnnotation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypedStringAnnotationAccess().getAnnotationsAnnotationParserRuleCall_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__TypedStringAnnotation__AnnotationsAssignment_4_13700);
            ruleAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypedStringAnnotationAccess().getAnnotationsAnnotationParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TypedStringAnnotation__AnnotationsAssignment_4_1


    // $ANTLR start rule__KeyBooleanValueAnnotation__NameAssignment_1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1870:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1874:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1875:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1875:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1876:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KeyBooleanValueAnnotation__NameAssignment_13731); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyBooleanValueAnnotation__NameAssignment_1


    // $ANTLR start rule__KeyBooleanValueAnnotation__ValueAssignment_2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1885:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1889:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1890:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1890:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1891:1: RULE_BOOLEAN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBooleanTerminalRuleCall_2_0()); 
            }
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_23762); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyBooleanValueAnnotation__ValueAssignment_2


    // $ANTLR start rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1900:1: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1904:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1905:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1905:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1906:1: ruleAnnotation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_13793);
            ruleAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1


    // $ANTLR start rule__KeyIntValueAnnotation__NameAssignment_1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1915:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1919:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1920:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1920:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1921:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KeyIntValueAnnotation__NameAssignment_13824); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyIntValueAnnotation__NameAssignment_1


    // $ANTLR start rule__KeyIntValueAnnotation__ValueAssignment_2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1930:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1934:1: ( ( RULE_INT ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1935:1: ( RULE_INT )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1935:1: ( RULE_INT )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1936:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_23855); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyIntValueAnnotation__ValueAssignment_2


    // $ANTLR start rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1945:1: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1949:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1950:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1950:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1951:1: ruleAnnotation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_13886);
            ruleAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1


    // $ANTLR start rule__KeyFloatValueAnnotation__NameAssignment_1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1960:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1964:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1965:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1965:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1966:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KeyFloatValueAnnotation__NameAssignment_13917); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyFloatValueAnnotation__NameAssignment_1


    // $ANTLR start rule__KeyFloatValueAnnotation__ValueAssignment_2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1975:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1979:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1980:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1980:1: ( RULE_FLOAT )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1981:1: RULE_FLOAT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloatTerminalRuleCall_2_0()); 
            }
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_23948); if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyFloatValueAnnotation__ValueAssignment_2


    // $ANTLR start rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1990:1: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1994:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1995:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1995:1: ( ruleAnnotation )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:1996:1: ruleAnnotation
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_13979);
            ruleAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
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
    // $ANTLR end rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1


 

    
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
        public static final BitSet FOLLOW_ruleTypedStringAnnotation_in_entryRuleTypedStringAnnotation307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedStringAnnotation314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group__0_in_ruleTypedStringAnnotation340 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedStringAnnotation_in_rule__Annotation__Alternatives669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__0799 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__0802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TagAnnotation__Group__0__Impl830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__1861 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__1864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__2921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__0985 = new BitSet(new long[]{0x0000000000028040L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__0988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TagAnnotation__Group_2__0__Impl1016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__11047 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__11050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl1077 = new BitSet(new long[]{0x0000000000008042L});
        public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__21108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TagAnnotation__Group_2__2__Impl1136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__01173 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__01176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyStringValueAnnotation__Group__0__Impl1204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__11235 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__11238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl1265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__21295 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__21298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__31355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__01421 = new BitSet(new long[]{0x0000000000028040L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__01424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeyStringValueAnnotation__Group_3__0__Impl1452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__11483 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__11486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl1513 = new BitSet(new long[]{0x0000000000008042L});
        public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__21544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__KeyStringValueAnnotation__Group_3__2__Impl1572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group__0__Impl_in_rule__TypedStringAnnotation__Group__01609 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group__1_in_rule__TypedStringAnnotation__Group__01612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TypedStringAnnotation__Group__0__Impl1640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group__1__Impl_in_rule__TypedStringAnnotation__Group__11671 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group__2_in_rule__TypedStringAnnotation__Group__11674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__NameAssignment_1_in_rule__TypedStringAnnotation__Group__1__Impl1701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group__2__Impl_in_rule__TypedStringAnnotation__Group__21731 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group__3_in_rule__TypedStringAnnotation__Group__21734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__TypeAssignment_2_in_rule__TypedStringAnnotation__Group__2__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group__3__Impl_in_rule__TypedStringAnnotation__Group__31791 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group__4_in_rule__TypedStringAnnotation__Group__31794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__ValueAssignment_3_in_rule__TypedStringAnnotation__Group__3__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group__4__Impl_in_rule__TypedStringAnnotation__Group__41851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group_4__0_in_rule__TypedStringAnnotation__Group__4__Impl1878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group_4__0__Impl_in_rule__TypedStringAnnotation__Group_4__01919 = new BitSet(new long[]{0x0000000000028040L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group_4__1_in_rule__TypedStringAnnotation__Group_4__01922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TypedStringAnnotation__Group_4__0__Impl1950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group_4__1__Impl_in_rule__TypedStringAnnotation__Group_4__11981 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group_4__2_in_rule__TypedStringAnnotation__Group_4__11984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__AnnotationsAssignment_4_1_in_rule__TypedStringAnnotation__Group_4__1__Impl2011 = new BitSet(new long[]{0x0000000000008042L});
        public static final BitSet FOLLOW_rule__TypedStringAnnotation__Group_4__2__Impl_in_rule__TypedStringAnnotation__Group_4__22042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TypedStringAnnotation__Group_4__2__Impl2070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__02107 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__02110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyBooleanValueAnnotation__Group__0__Impl2138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__12169 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__12172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__22229 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__22232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl2259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__32289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl2316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__02355 = new BitSet(new long[]{0x0000000000028040L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__02358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl2386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__12417 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__12420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl2447 = new BitSet(new long[]{0x0000000000008042L});
        public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__22478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl2506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__02543 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__02546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyIntValueAnnotation__Group__0__Impl2574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__12605 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__12608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl2635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__22665 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__22668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl2695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__32725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__02791 = new BitSet(new long[]{0x0000000000028040L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__02794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeyIntValueAnnotation__Group_3__0__Impl2822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__12853 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__12856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl2883 = new BitSet(new long[]{0x0000000000008042L});
        public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__22914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__KeyIntValueAnnotation__Group_3__2__Impl2942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__02979 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__02982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__KeyFloatValueAnnotation__Group__0__Impl3010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__13041 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__13044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__23101 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__23104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__33161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl3188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__03227 = new BitSet(new long[]{0x0000000000028040L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__03230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__13289 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__13292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl3319 = new BitSet(new long[]{0x0000000000008042L});
        public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__23350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment3421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TagAnnotation__NameAssignment_13452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_13483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KeyStringValueAnnotation__NameAssignment_13514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_23545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_13576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__TypedStringAnnotation__NameAssignment_13607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TYPEID_in_rule__TypedStringAnnotation__TypeAssignment_23638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TypedStringAnnotation__ValueAssignment_33669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__TypedStringAnnotation__AnnotationsAssignment_4_13700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KeyBooleanValueAnnotation__NameAssignment_13731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_23762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_13793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KeyIntValueAnnotation__NameAssignment_13824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_23855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_13886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KeyFloatValueAnnotation__NameAssignment_13917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_23948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_13979 = new BitSet(new long[]{0x0000000000000002L});
    }


}