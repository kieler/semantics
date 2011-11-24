package de.cau.cs.kieler.core.annotations.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.core.annotations.services.AnnotationsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAnnotationsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT_ANNOTATION", "RULE_BOOLEAN", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'('", "')'", "'['", "']'", "'.'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_ID=9;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_FLOAT=7;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_INT=6;
    public static final int RULE_WS=12;
    public static final int RULE_COMMENT_ANNOTATION=4;

    // delegates
    // delegators


        public InternalAnnotationsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnnotationsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnnotationsParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private AnnotationsGrammarAccess grammarAccess;
     	
        public InternalAnnotationsParser(TokenStream input, AnnotationsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Annotation";	
       	}
       	
       	@Override
       	protected AnnotationsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:73:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:74:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:75:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation81);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:82:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_TagAnnotation_1 = null;

        EObject this_KeyStringValueAnnotation_2 = null;

        EObject this_TypedKeyStringValueAnnotation_3 = null;

        EObject this_KeyBooleanValueAnnotation_4 = null;

        EObject this_KeyIntValueAnnotation_5 = null;

        EObject this_KeyFloatValueAnnotation_6 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:85:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:86:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:86:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:87:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_ruleAnnotation141);
                    this_CommentAnnotation_0=ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CommentAnnotation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:100:2: this_TagAnnotation_1= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_ruleAnnotation171);
                    this_TagAnnotation_1=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:113:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation201);
                    this_KeyStringValueAnnotation_2=ruleKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyStringValueAnnotation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:126:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation231);
                    this_TypedKeyStringValueAnnotation_3=ruleTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedKeyStringValueAnnotation_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:139:2: this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation261);
                    this_KeyBooleanValueAnnotation_4=ruleKeyBooleanValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyBooleanValueAnnotation_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:152:2: this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation291);
                    this_KeyIntValueAnnotation_5=ruleKeyIntValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyIntValueAnnotation_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:165:2: this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation321);
                    this_KeyFloatValueAnnotation_6=ruleKeyFloatValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyFloatValueAnnotation_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:184:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:185:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:186:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation356);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation366); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:193:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:196:28: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:197:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:197:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:198:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:198:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:199:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCommentAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"COMMENT_ANNOTATION");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:223:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:224:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:225:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation447);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation457); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:232:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:235:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:236:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:236:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:236:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTagAnnotation494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:240:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:241:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:241:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:242:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTagAnnotation515);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTagAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:258:2: (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:258:4: otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTagAnnotation528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:262:1: ( (lv_annotations_3_0= ruleAnnotation ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_COMMENT_ANNOTATION||LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:263:1: (lv_annotations_3_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:263:1: (lv_annotations_3_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:264:3: lv_annotations_3_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTagAnnotation549);
                    	    lv_annotations_3_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTagAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_3_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTagAnnotation562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:292:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:293:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:294:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation600);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation610); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:301:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:304:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:305:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:305:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:305:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleKeyStringValueAnnotation647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:309:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:310:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:310:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:311:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation668);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:327:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:328:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:328:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:329:3: lv_value_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation689);
            lv_value_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:345:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:345:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyStringValueAnnotation702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:349:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_COMMENT_ANNOTATION||LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:350:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:350:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:351:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation723);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKeyStringValueAnnotation736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:379:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:380:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:381:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation774);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation784); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:388:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        EObject lv_annotations_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:391:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:392:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:392:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:392:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTypedKeyStringValueAnnotation821); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:396:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:397:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:397:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:398:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation842);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTypedKeyStringValueAnnotation854); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:418:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:419:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:419:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:420:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation875);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTypedKeyStringValueAnnotation887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:440:1: ( (lv_value_5_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:441:1: (lv_value_5_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:441:1: (lv_value_5_0= ruleEString )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:442:3: lv_value_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation908);
            lv_value_5_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_5_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:458:2: (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:458:4: otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTypedKeyStringValueAnnotation921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:462:1: ( (lv_annotations_7_0= ruleAnnotation ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_COMMENT_ANNOTATION||LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:463:1: (lv_annotations_7_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:463:1: (lv_annotations_7_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:464:3: lv_annotations_7_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation942);
                    	    lv_annotations_7_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_7_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTypedKeyStringValueAnnotation955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:492:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:493:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:494:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation993);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation1003); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:501:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:504:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:505:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:505:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:505:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleKeyBooleanValueAnnotation1040); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:509:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:510:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:510:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:511:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation1061);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyBooleanValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:527:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:528:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:528:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:529:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation1078); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBooleanTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyBooleanValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Boolean");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:545:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:545:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyBooleanValueAnnotation1096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:549:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_COMMENT_ANNOTATION||LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:550:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:550:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:551:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation1117);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyBooleanValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKeyBooleanValueAnnotation1130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:579:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:580:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:581:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation1168);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation1178); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:588:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:591:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:592:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:592:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:592:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleKeyIntValueAnnotation1215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:596:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:597:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:597:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:598:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation1236);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:614:2: ( (lv_value_2_0= RULE_INT ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:615:1: (lv_value_2_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:615:1: (lv_value_2_0= RULE_INT )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:616:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation1253); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyIntValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:632:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:632:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyIntValueAnnotation1271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:636:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_COMMENT_ANNOTATION||LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:637:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:637:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:638:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation1292);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKeyIntValueAnnotation1305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:666:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:667:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:668:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1343);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1353); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:675:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:678:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:679:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:679:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:679:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleKeyFloatValueAnnotation1390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:683:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:684:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:684:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:685:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation1411);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:701:2: ( (lv_value_2_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:702:1: (lv_value_2_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:702:1: (lv_value_2_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:703:3: lv_value_2_0= RULE_FLOAT
            {
            lv_value_2_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation1428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloatTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyFloatValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Float");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:719:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:719:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyFloatValueAnnotation1446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:723:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_COMMENT_ANNOTATION||LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:724:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:724:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:725:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation1467);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKeyFloatValueAnnotation1480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:755:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:756:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:757:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1521);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1532); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:764:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:767:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:768:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:768:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:768:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:776:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:791:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:792:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:793:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID1644);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID1655); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:800:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:803:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:804:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:804:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:804:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID1695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:811:1: (kw= '.' this_ID_2= RULE_ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:812:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExtendedID1714); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID1729); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtendedID"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\3\uffff\1\11\7\uffff\1\11";
    static final String DFA1_minS =
        "\1\4\1\uffff\1\11\1\4\1\11\6\uffff\1\4";
    static final String DFA1_maxS =
        "\1\16\1\uffff\1\11\1\23\1\11\6\uffff\1\23";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\3\uffff\1\4\1\3\1\7\1\6\1\2\1\5\1\uffff";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\11\uffff\1\2",
            "",
            "\1\3",
            "\1\11\1\12\1\10\1\7\2\6\4\uffff\3\11\1\5\1\uffff\1\4",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\1\12\1\10\1\7\2\6\4\uffff\3\11\1\5\1\uffff\1\4"
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
            return "86:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation356 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation447 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleTagAnnotation494 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation515 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleTagAnnotation528 = new BitSet(new long[]{0x0000000000014010L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTagAnnotation549 = new BitSet(new long[]{0x0000000000014010L});
        public static final BitSet FOLLOW_16_in_ruleTagAnnotation562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleKeyStringValueAnnotation647 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation668 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation689 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleKeyStringValueAnnotation702 = new BitSet(new long[]{0x0000000000014010L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation723 = new BitSet(new long[]{0x0000000000014010L});
        public static final BitSet FOLLOW_16_in_ruleKeyStringValueAnnotation736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation774 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleTypedKeyStringValueAnnotation821 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation842 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTypedKeyStringValueAnnotation854 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation875 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTypedKeyStringValueAnnotation887 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation908 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleTypedKeyStringValueAnnotation921 = new BitSet(new long[]{0x0000000000014010L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation942 = new BitSet(new long[]{0x0000000000014010L});
        public static final BitSet FOLLOW_16_in_ruleTypedKeyStringValueAnnotation955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation993 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation1003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleKeyBooleanValueAnnotation1040 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation1061 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation1078 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleKeyBooleanValueAnnotation1096 = new BitSet(new long[]{0x0000000000014010L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation1117 = new BitSet(new long[]{0x0000000000014010L});
        public static final BitSet FOLLOW_16_in_ruleKeyBooleanValueAnnotation1130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation1168 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation1178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleKeyIntValueAnnotation1215 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation1236 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation1253 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleKeyIntValueAnnotation1271 = new BitSet(new long[]{0x0000000000014010L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation1292 = new BitSet(new long[]{0x0000000000014010L});
        public static final BitSet FOLLOW_16_in_ruleKeyIntValueAnnotation1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1343 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleKeyFloatValueAnnotation1390 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation1411 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation1428 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleKeyFloatValueAnnotation1446 = new BitSet(new long[]{0x0000000000014010L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation1467 = new BitSet(new long[]{0x0000000000014010L});
        public static final BitSet FOLLOW_16_in_ruleKeyFloatValueAnnotation1480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1521 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID1644 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID1655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID1695 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleExtendedID1714 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID1729 = new BitSet(new long[]{0x0000000000080002L});
    }


}