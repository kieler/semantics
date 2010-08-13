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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_INT=8;
    public static final int EOF=-1;
    public static final int RULE_STRING=4;
    public static final int RULE_COMMENT_ANNOTATION=6;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;

        public InternalAnnotationsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[21+1];
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




    // $ANTLR start entryRuleStringAnnotation
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:62:1: entryRuleStringAnnotation : ruleStringAnnotation EOF ;
    public final void entryRuleStringAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:63:1: ( ruleStringAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:64:1: ruleStringAnnotation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStringAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_entryRuleStringAnnotation67);
            ruleStringAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStringAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringAnnotation74); if (failed) return ;

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
    // $ANTLR end entryRuleStringAnnotation


    // $ANTLR start ruleStringAnnotation
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:71:1: ruleStringAnnotation : ( ( rule__StringAnnotation__Alternatives ) ) ;
    public final void ruleStringAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:75:2: ( ( ( rule__StringAnnotation__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:76:1: ( ( rule__StringAnnotation__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:76:1: ( ( rule__StringAnnotation__Alternatives ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:77:1: ( rule__StringAnnotation__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStringAnnotationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:78:1: ( rule__StringAnnotation__Alternatives )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:78:2: rule__StringAnnotation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringAnnotation__Alternatives_in_ruleStringAnnotation100);
            rule__StringAnnotation__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStringAnnotationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStringAnnotation


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


    // $ANTLR start entryRuleKeyValueAnnotation
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:118:1: entryRuleKeyValueAnnotation : ruleKeyValueAnnotation EOF ;
    public final void entryRuleKeyValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:119:1: ( ruleKeyValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:120:1: ruleKeyValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation187);
            ruleKeyValueAnnotation();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyValueAnnotationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyValueAnnotation194); if (failed) return ;

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
    // $ANTLR end entryRuleKeyValueAnnotation


    // $ANTLR start ruleKeyValueAnnotation
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:127:1: ruleKeyValueAnnotation : ( ( rule__KeyValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:131:2: ( ( ( rule__KeyValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:132:1: ( ( rule__KeyValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:132:1: ( ( rule__KeyValueAnnotation__Group__0 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:133:1: ( rule__KeyValueAnnotation__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:134:1: ( rule__KeyValueAnnotation__Group__0 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:134:2: rule__KeyValueAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__Group__0_in_ruleKeyValueAnnotation220);
            rule__KeyValueAnnotation__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getKeyValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleKeyValueAnnotation


    // $ANTLR start entryRuleEString
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:148:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:149:1: ( ruleEString EOF )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:150:1: ruleEString EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString249);
            ruleEString();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString256); if (failed) return ;

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
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:157:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:161:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:162:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:162:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:163:1: ( rule__EString__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:164:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:164:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString282);
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


    // $ANTLR start rule__StringAnnotation__Alternatives
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:176:1: rule__StringAnnotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyValueAnnotation ) );
    public final void rule__StringAnnotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:180:1: ( ( ruleCommentAnnotation ) | ( ruleKeyValueAnnotation ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_COMMENT_ANNOTATION) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("176:1: rule__StringAnnotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleKeyValueAnnotation ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:181:1: ( ruleCommentAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:181:1: ( ruleCommentAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:182:1: ruleCommentAnnotation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStringAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_rule__StringAnnotation__Alternatives318);
                    ruleCommentAnnotation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getStringAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:187:6: ( ruleKeyValueAnnotation )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:187:6: ( ruleKeyValueAnnotation )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:188:1: ruleKeyValueAnnotation
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStringAnnotationAccess().getKeyValueAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyValueAnnotation_in_rule__StringAnnotation__Alternatives335);
                    ruleKeyValueAnnotation();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getStringAnnotationAccess().getKeyValueAnnotationParserRuleCall_1()); 
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
    // $ANTLR end rule__StringAnnotation__Alternatives


    // $ANTLR start rule__EString__Alternatives
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:198:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:202:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    new NoViableAltException("198:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:203:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:203:1: ( RULE_STRING )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:204:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives367); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:209:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:209:6: ( RULE_ID )
                    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:210:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives384); if (failed) return ;
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


    // $ANTLR start rule__KeyValueAnnotation__Group__0
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:222:1: rule__KeyValueAnnotation__Group__0 : rule__KeyValueAnnotation__Group__0__Impl rule__KeyValueAnnotation__Group__1 ;
    public final void rule__KeyValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:226:1: ( rule__KeyValueAnnotation__Group__0__Impl rule__KeyValueAnnotation__Group__1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:227:2: rule__KeyValueAnnotation__Group__0__Impl rule__KeyValueAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__Group__0__Impl_in_rule__KeyValueAnnotation__Group__0414);
            rule__KeyValueAnnotation__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__Group__1_in_rule__KeyValueAnnotation__Group__0417);
            rule__KeyValueAnnotation__Group__1();
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
    // $ANTLR end rule__KeyValueAnnotation__Group__0


    // $ANTLR start rule__KeyValueAnnotation__Group__0__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:234:1: rule__KeyValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:238:1: ( ( '@' ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:239:1: ( '@' )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:239:1: ( '@' )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:240:1: '@'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__KeyValueAnnotation__Group__0__Impl445); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyValueAnnotation__Group__0__Impl


    // $ANTLR start rule__KeyValueAnnotation__Group__1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:253:1: rule__KeyValueAnnotation__Group__1 : rule__KeyValueAnnotation__Group__1__Impl rule__KeyValueAnnotation__Group__2 ;
    public final void rule__KeyValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:257:1: ( rule__KeyValueAnnotation__Group__1__Impl rule__KeyValueAnnotation__Group__2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:258:2: rule__KeyValueAnnotation__Group__1__Impl rule__KeyValueAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__Group__1__Impl_in_rule__KeyValueAnnotation__Group__1476);
            rule__KeyValueAnnotation__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__Group__2_in_rule__KeyValueAnnotation__Group__1479);
            rule__KeyValueAnnotation__Group__2();
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
    // $ANTLR end rule__KeyValueAnnotation__Group__1


    // $ANTLR start rule__KeyValueAnnotation__Group__1__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:265:1: rule__KeyValueAnnotation__Group__1__Impl : ( ( rule__KeyValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:269:1: ( ( ( rule__KeyValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:270:1: ( ( rule__KeyValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:270:1: ( ( rule__KeyValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:271:1: ( rule__KeyValueAnnotation__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:272:1: ( rule__KeyValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:272:2: rule__KeyValueAnnotation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__NameAssignment_1_in_rule__KeyValueAnnotation__Group__1__Impl506);
            rule__KeyValueAnnotation__NameAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getKeyValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyValueAnnotation__Group__1__Impl


    // $ANTLR start rule__KeyValueAnnotation__Group__2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:282:1: rule__KeyValueAnnotation__Group__2 : rule__KeyValueAnnotation__Group__2__Impl ;
    public final void rule__KeyValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:286:1: ( rule__KeyValueAnnotation__Group__2__Impl )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:287:2: rule__KeyValueAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__Group__2__Impl_in_rule__KeyValueAnnotation__Group__2536);
            rule__KeyValueAnnotation__Group__2__Impl();
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
    // $ANTLR end rule__KeyValueAnnotation__Group__2


    // $ANTLR start rule__KeyValueAnnotation__Group__2__Impl
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:293:1: rule__KeyValueAnnotation__Group__2__Impl : ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:297:1: ( ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:298:1: ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:298:1: ( ( rule__KeyValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:299:1: ( rule__KeyValueAnnotation__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:300:1: ( rule__KeyValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:300:2: rule__KeyValueAnnotation__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__KeyValueAnnotation__ValueAssignment_2_in_rule__KeyValueAnnotation__Group__2__Impl563);
            rule__KeyValueAnnotation__ValueAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getKeyValueAnnotationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyValueAnnotation__Group__2__Impl


    // $ANTLR start rule__CommentAnnotation__ValueAssignment
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:318:1: rule__CommentAnnotation__ValueAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:322:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:323:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:323:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:324:1: RULE_COMMENT_ANNOTATION
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment605); if (failed) return ;
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


    // $ANTLR start rule__KeyValueAnnotation__NameAssignment_1
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:333:1: rule__KeyValueAnnotation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KeyValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:337:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:338:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:338:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:339:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__KeyValueAnnotation__NameAssignment_1636); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyValueAnnotation__NameAssignment_1


    // $ANTLR start rule__KeyValueAnnotation__ValueAssignment_2
    // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:348:1: rule__KeyValueAnnotation__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:352:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:353:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:353:1: ( ruleEString )
            // ../de.cau.cs.kieler.core.annotations.ui/src-gen/de/cau/cs/kieler/core/annotations/ui/contentassist/antlr/internal/InternalAnnotations.g:354:1: ruleEString
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getKeyValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__KeyValueAnnotation__ValueAssignment_2667);
            ruleEString();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getKeyValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__KeyValueAnnotation__ValueAssignment_2


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleStringAnnotation_in_entryRuleStringAnnotation67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringAnnotation74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringAnnotation__Alternatives_in_ruleStringAnnotation100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyValueAnnotation194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__0_in_ruleKeyValueAnnotation220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_rule__StringAnnotation__Alternatives318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyValueAnnotation_in_rule__StringAnnotation__Alternatives335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__0__Impl_in_rule__KeyValueAnnotation__Group__0414 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__1_in_rule__KeyValueAnnotation__Group__0417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__KeyValueAnnotation__Group__0__Impl445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__1__Impl_in_rule__KeyValueAnnotation__Group__1476 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__2_in_rule__KeyValueAnnotation__Group__1479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__NameAssignment_1_in_rule__KeyValueAnnotation__Group__1__Impl506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__Group__2__Impl_in_rule__KeyValueAnnotation__Group__2536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__KeyValueAnnotation__ValueAssignment_2_in_rule__KeyValueAnnotation__Group__2__Impl563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__KeyValueAnnotation__NameAssignment_1636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__KeyValueAnnotation__ValueAssignment_2667 = new BitSet(new long[]{0x0000000000000002L});
    }


}