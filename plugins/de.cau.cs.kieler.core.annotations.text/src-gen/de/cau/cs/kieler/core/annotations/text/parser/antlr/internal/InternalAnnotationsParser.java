package de.cau.cs.kieler.core.annotations.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.core.annotations.text.services.AnnotationsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotationsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT_ANNOTATION", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "','", "'['", "']'", "'.'", "'#'", "'-'"
    };
    public static final int RULE_COMMENT_ANNOTATION=4;
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_NUMBER=11;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_FLOAT=9;
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
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g"; }



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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:67:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:68:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:69:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation75);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation85); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:76:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyBooleanValueAnnotation_1 = null;

        EObject this_KeyStringValueAnnotation_2 = null;

        EObject this_TypedKeyStringValueAnnotation_3 = null;

        EObject this_KeyIntValueAnnotation_4 = null;

        EObject this_KeyFloatValueAnnotation_5 = null;

        EObject this_TagAnnotation_6 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:79:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:80:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:80:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:81:5: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_ruleAnnotation132);
                    this_CommentAnnotation_0=ruleCommentAnnotation();

                    state._fsp--;

                     
                            current = this_CommentAnnotation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:91:5: this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation159);
                    this_KeyBooleanValueAnnotation_1=ruleKeyBooleanValueAnnotation();

                    state._fsp--;

                     
                            current = this_KeyBooleanValueAnnotation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:101:5: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation186);
                    this_KeyStringValueAnnotation_2=ruleKeyStringValueAnnotation();

                    state._fsp--;

                     
                            current = this_KeyStringValueAnnotation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:111:5: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation213);
                    this_TypedKeyStringValueAnnotation_3=ruleTypedKeyStringValueAnnotation();

                    state._fsp--;

                     
                            current = this_TypedKeyStringValueAnnotation_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:121:5: this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation240);
                    this_KeyIntValueAnnotation_4=ruleKeyIntValueAnnotation();

                    state._fsp--;

                     
                            current = this_KeyIntValueAnnotation_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:131:5: this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation267);
                    this_KeyFloatValueAnnotation_5=ruleKeyFloatValueAnnotation();

                    state._fsp--;

                     
                            current = this_KeyFloatValueAnnotation_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:141:5: this_TagAnnotation_6= ruleTagAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_ruleAnnotation294);
                    this_TagAnnotation_6=ruleTagAnnotation();

                    state._fsp--;

                     
                            current = this_TagAnnotation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:161:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:162:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:163:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
             newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation333);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;

             current =iv_ruleCommentAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation343); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:170:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:173:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:174:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:174:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:175:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:175:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:176:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation384); 

            			newLeafNode(lv_values_0_0, grammarAccess.getCommentAnnotationAccess().getValuesCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommentAnnotationRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_0_0, 
                    		"COMMENT_ANNOTATION");
            	    

            }


            }


            }

             leaveRule(); 
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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:200:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:201:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:202:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
             newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation424);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;

             current =iv_ruleTagAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation434); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:209:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:212:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:213:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:213:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:213:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTagAnnotation471); 

                	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:217:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:218:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:218:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:219:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTagAnnotation492);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;


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


            }

             leaveRule(); 
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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:243:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:244:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:245:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation528);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;

             current =iv_ruleKeyStringValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation538); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:252:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:255:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:256:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:256:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )* )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:256:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyStringValueAnnotation575); 

                	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:260:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:261:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:261:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:262:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation596);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;


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

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:278:2: ( (lv_values_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:279:1: (lv_values_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:279:1: (lv_values_2_0= ruleEString )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:280:3: lv_values_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation617);
            lv_values_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:296:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEString ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:296:4: otherlv_3= ',' ( (lv_values_4_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKeyStringValueAnnotation630); 

            	        	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:300:1: ( (lv_values_4_0= ruleEString ) )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:301:1: (lv_values_4_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:301:1: (lv_values_4_0= ruleEString )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:302:3: lv_values_4_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation651);
            	    lv_values_4_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_4_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:326:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:327:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:328:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation689);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;

             current =iv_ruleTypedKeyStringValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation699); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:335:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;

        AntlrDatatypeRuleToken lv_values_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:338:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:339:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:339:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:339:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTypedKeyStringValueAnnotation736); 

                	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:343:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:344:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:344:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:345:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation757);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;


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

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTypedKeyStringValueAnnotation769); 

                	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:365:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:366:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:366:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:367:3: lv_type_3_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation790);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;


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

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTypedKeyStringValueAnnotation802); 

                	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:387:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:388:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:388:1: (lv_values_5_0= ruleEStringBoolean )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:389:3: lv_values_5_0= ruleEStringBoolean
            {
             
            	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_ruleTypedKeyStringValueAnnotation823);
            lv_values_5_0=ruleEStringBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_5_0, 
                    		"EStringBoolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:405:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:405:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTypedKeyStringValueAnnotation836); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	        
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:409:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:410:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:410:1: (lv_values_7_0= ruleEStringBoolean )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:411:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_ruleTypedKeyStringValueAnnotation857);
            	    lv_values_7_0=ruleEStringBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_7_0, 
            	            		"EStringBoolean");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:435:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:436:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:437:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation895);
            iv_ruleQuotedKeyStringValueAnnotation=ruleQuotedKeyStringValueAnnotation();

            state._fsp--;

             current =iv_ruleQuotedKeyStringValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation905); 

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
    // $ANTLR end "entryRuleQuotedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:444:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:447:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:448:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:448:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:448:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQuotedKeyStringValueAnnotation942); 

                	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:452:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:453:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:453:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:454:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleQuotedKeyStringValueAnnotation963);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuotedKeyStringValueAnnotationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ExtendedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:470:2: ( (lv_values_2_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:471:1: (lv_values_2_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:471:1: (lv_values_2_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:472:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation980); 

            			newLeafNode(lv_values_2_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuotedKeyStringValueAnnotationRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:488:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:488:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuotedKeyStringValueAnnotation998); 

            	        	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:492:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:493:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:493:1: (lv_values_4_0= RULE_STRING )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:494:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation1015); 

            	    			newLeafNode(lv_values_4_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQuotedKeyStringValueAnnotationRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_4_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:518:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:519:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:520:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation1058);
            iv_ruleQuotedTypedKeyStringValueAnnotation=ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;

             current =iv_ruleQuotedTypedKeyStringValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation1068); 

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
    // $ANTLR end "entryRuleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:527:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;
        Token lv_values_7_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:530:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:531:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:531:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:531:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQuotedTypedKeyStringValueAnnotation1105); 

                	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:535:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:536:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:536:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:537:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation1126);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ExtendedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQuotedTypedKeyStringValueAnnotation1138); 

                	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:557:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:558:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:558:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:559:3: lv_type_3_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation1159);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"ExtendedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQuotedTypedKeyStringValueAnnotation1171); 

                	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:579:1: ( (lv_values_5_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:580:1: (lv_values_5_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:580:1: (lv_values_5_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:581:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation1188); 

            			newLeafNode(lv_values_5_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:597:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:597:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuotedTypedKeyStringValueAnnotation1206); 

            	        	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	        
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:601:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:602:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:602:1: (lv_values_7_0= RULE_STRING )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:603:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation1223); 

            	    			newLeafNode(lv_values_7_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_6_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_7_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:627:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:628:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:629:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation1266);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;

             current =iv_ruleKeyBooleanValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation1276); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:636:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:639:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:640:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:640:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:640:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyBooleanValueAnnotation1313); 

                	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:644:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:645:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:645:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:646:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation1334);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;


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

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:662:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:663:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:663:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:664:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation1351); 

            			newLeafNode(lv_value_2_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKeyBooleanValueAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"BOOLEAN");
            	    

            }


            }


            }


            }

             leaveRule(); 
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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:688:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:689:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:690:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation1392);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;

             current =iv_ruleKeyIntValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation1402); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:697:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:700:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:701:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:701:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:701:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyIntValueAnnotation1439); 

                	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:705:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:706:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:706:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:707:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation1460);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;


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

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:723:2: ( (lv_value_2_0= ruleInteger ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:724:1: (lv_value_2_0= ruleInteger )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:724:1: (lv_value_2_0= ruleInteger )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:725:3: lv_value_2_0= ruleInteger
            {
             
            	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation1481);
            lv_value_2_0=ruleInteger();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Integer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:749:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:750:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:751:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1517);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;

             current =iv_ruleKeyFloatValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1527); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:758:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:761:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:762:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:762:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:762:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyFloatValueAnnotation1564); 

                	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:766:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:767:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:767:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:768:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation1585);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;


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

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:784:2: ( (lv_value_2_0= ruleFloateger ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:785:1: (lv_value_2_0= ruleFloateger )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:785:1: (lv_value_2_0= ruleFloateger )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:786:3: lv_value_2_0= ruleFloateger
            {
             
            	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation1606);
            lv_value_2_0=ruleFloateger();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Floateger");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:810:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:811:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:812:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1643);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1654); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:819:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:822:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:823:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:823:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:823:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1694); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:832:5: this_ExtendedID_1= ruleExtendedID
                    {
                     
                            newCompositeNode(grammarAccess.getEStringAccess().getExtendedIDParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleEString1727);
                    this_ExtendedID_1=ruleExtendedID();

                    state._fsp--;


                    		current.merge(this_ExtendedID_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleEStringBoolean"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:850:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:851:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:852:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
            {
             newCompositeNode(grammarAccess.getEStringBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_entryRuleEStringBoolean1773);
            iv_ruleEStringBoolean=ruleEStringBoolean();

            state._fsp--;

             current =iv_ruleEStringBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEStringBoolean1784); 

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
    // $ANTLR end "entryRuleEStringBoolean"


    // $ANTLR start "ruleEStringBoolean"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:859:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:862:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:863:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:863:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:863:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEStringBoolean1824); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:872:5: this_ExtendedID_1= ruleExtendedID
                    {
                     
                            newCompositeNode(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleEStringBoolean1857);
                    this_ExtendedID_1=ruleExtendedID();

                    state._fsp--;


                    		current.merge(this_ExtendedID_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:883:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleEStringBoolean1883); 

                    		current.merge(this_BOOLEAN_2);
                        
                     
                        newLeafNode(this_BOOLEAN_2, grammarAccess.getEStringBooleanAccess().getBOOLEANTerminalRuleCall_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEStringBoolean"


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:898:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:899:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:900:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
             newCompositeNode(grammarAccess.getExtendedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID1929);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;

             current =iv_ruleExtendedID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID1940); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:907:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:910:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:911:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:911:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:911:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID1980); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:918:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:919:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExtendedID1999); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID2014); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:931:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:932:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleExtendedID2035); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleExtendedID2050); 

                    		current.merge(this_INT_4);
                        
                     
                        newLeafNode(this_INT_4, grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleInteger"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:952:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:953:2: (iv_ruleInteger= ruleInteger EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:954:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger2098);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger2109); 

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:961:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:964:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:965:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:965:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:965:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:965:2: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:966:2: kw= '-'
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInteger2148); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInteger2165); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloateger"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:986:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:987:2: (iv_ruleFloateger= ruleFloateger EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:988:2: iv_ruleFloateger= ruleFloateger EOF
            {
             newCompositeNode(grammarAccess.getFloategerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_entryRuleFloateger2211);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;

             current =iv_ruleFloateger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloateger2222); 

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
    // $ANTLR end "entryRuleFloateger"


    // $ANTLR start "ruleFloateger"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:995:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:998:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:999:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:999:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:999:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:999:2: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1000:2: kw= '-'
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFloateger2261); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloateger2278); 

            		current.merge(this_FLOAT_1);
                
             
                newLeafNode(this_FLOAT_1, grammarAccess.getFloategerAccess().getFLOATTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloateger"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\17\uffff";
    static final String DFA1_eofS =
        "\3\uffff\1\6\11\uffff\2\6";
    static final String DFA1_minS =
        "\1\4\1\uffff\1\7\1\5\1\7\1\10\1\uffff\1\10\5\uffff\2\5";
    static final String DFA1_maxS =
        "\1\17\1\uffff\1\7\1\25\1\7\1\10\1\uffff\1\11\5\uffff\2\25";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\4\uffff\1\7\1\uffff\1\5\1\4\1\6\1\2\1\3\2\uffff";
    static final String DFA1_specialS =
        "\17\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\12\uffff\1\2",
            "",
            "\1\3",
            "\1\14\1\13\1\14\1\10\1\12\7\uffff\1\11\1\uffff\1\4\1\5\1\7",
            "\1\15",
            "\1\16",
            "",
            "\1\10\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\14\1\13\1\14\1\10\1\12\7\uffff\1\11\1\uffff\1\4\1\5\1\7",
            "\1\14\1\13\1\14\1\10\1\12\7\uffff\1\11\3\uffff\1\7"
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
            return "80:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyBooleanValueAnnotation_1= ruleKeyBooleanValueAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyIntValueAnnotation_4= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_5= ruleKeyFloatValueAnnotation | this_TagAnnotation_6= ruleTagAnnotation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation333 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation424 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleTagAnnotation471 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation528 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKeyStringValueAnnotation575 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation596 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation617 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleKeyStringValueAnnotation630 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation651 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation689 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleTypedKeyStringValueAnnotation736 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation757 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTypedKeyStringValueAnnotation769 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation790 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTypedKeyStringValueAnnotation802 = new BitSet(new long[]{0x00000000000000E0L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_ruleTypedKeyStringValueAnnotation823 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleTypedKeyStringValueAnnotation836 = new BitSet(new long[]{0x00000000000000E0L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_ruleTypedKeyStringValueAnnotation857 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation895 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleQuotedKeyStringValueAnnotation942 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleQuotedKeyStringValueAnnotation963 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation980 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleQuotedKeyStringValueAnnotation998 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation1015 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation1058 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation1068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleQuotedTypedKeyStringValueAnnotation1105 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation1126 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleQuotedTypedKeyStringValueAnnotation1138 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation1159 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleQuotedTypedKeyStringValueAnnotation1171 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation1188 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleQuotedTypedKeyStringValueAnnotation1206 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation1223 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation1266 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation1276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKeyBooleanValueAnnotation1313 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation1334 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation1351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation1392 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation1402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKeyIntValueAnnotation1439 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation1460 = new BitSet(new long[]{0x0000000000200100L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation1481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1517 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKeyFloatValueAnnotation1564 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation1585 = new BitSet(new long[]{0x0000000000200200L});
        public static final BitSet FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation1606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1643 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleEString1727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_entryRuleEStringBoolean1773 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEStringBoolean1784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringBoolean1824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleEStringBoolean1857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleEStringBoolean1883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID1929 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID1940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID1980 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_19_in_ruleExtendedID1999 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID2014 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_20_in_ruleExtendedID2035 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleExtendedID2050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger2098 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger2109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleInteger2148 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInteger2165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloateger_in_entryRuleFloateger2211 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloateger2222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleFloateger2261 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloateger2278 = new BitSet(new long[]{0x0000000000000002L});
    }


}