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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT_ANNOTATION", "RULE_BOOLEAN", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'['", "']'", "'.'", "'-'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int T__19=19;
    public static final int RULE_ID=7;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=11;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=8;
    public static final int RULE_WS=13;
    public static final int RULE_FLOAT=9;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_COMMENT_ANNOTATION=4;
    public static final int RULE_ML_COMMENT=10;

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:76:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) ;
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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:79:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:80:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:80:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
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
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:91:5: this_TagAnnotation_1= ruleTagAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_ruleAnnotation159);
                    this_TagAnnotation_1=ruleTagAnnotation();

                    state._fsp--;

                     
                            current = this_TagAnnotation_1; 
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
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:121:5: this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation240);
                    this_KeyBooleanValueAnnotation_4=ruleKeyBooleanValueAnnotation();

                    state._fsp--;

                     
                            current = this_KeyBooleanValueAnnotation_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:131:5: this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation267);
                    this_KeyIntValueAnnotation_5=ruleKeyIntValueAnnotation();

                    state._fsp--;

                     
                            current = this_KeyIntValueAnnotation_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:141:5: this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation294);
                    this_KeyFloatValueAnnotation_6=ruleKeyFloatValueAnnotation();

                    state._fsp--;

                     
                            current = this_KeyFloatValueAnnotation_6; 
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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:159:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:160:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:161:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
             newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation331);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;

             current =iv_ruleCommentAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation341); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:168:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:171:28: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:172:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:172:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:173:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:173:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:174:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation382); 

            			newLeafNode(lv_value_0_0, grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            		

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:198:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:199:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:200:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
             newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation422);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;

             current =iv_ruleTagAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation432); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:207:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:210:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:211:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:211:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:211:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTagAnnotation469); 

                	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:215:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:216:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:216:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:217:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTagAnnotation490);
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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:241:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:242:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:243:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation526);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;

             current =iv_ruleKeyStringValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation536); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:250:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:253:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:254:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:254:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:254:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyStringValueAnnotation573); 

                	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:258:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:259:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:259:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:260:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation594);
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

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:276:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:277:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:277:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:278:3: lv_value_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation615);
            lv_value_2_0=ruleEString();

            state._fsp--;


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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:302:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:303:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:304:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation651);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;

             current =iv_ruleTypedKeyStringValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation661); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:311:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:314:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:315:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:315:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:315:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTypedKeyStringValueAnnotation698); 

                	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:319:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:320:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:320:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:321:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation719);
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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTypedKeyStringValueAnnotation731); 

                	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:341:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:342:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:342:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:343:3: lv_type_3_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation752);
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

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTypedKeyStringValueAnnotation764); 

                	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:363:1: ( (lv_value_5_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:364:1: (lv_value_5_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:364:1: (lv_value_5_0= ruleEString )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:365:3: lv_value_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation785);
            lv_value_5_0=ruleEString();

            state._fsp--;


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


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:389:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:390:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:391:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation821);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;

             current =iv_ruleKeyBooleanValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation831); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:398:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:401:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:402:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:402:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:402:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyBooleanValueAnnotation868); 

                	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:406:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:407:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:407:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:408:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation889);
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

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:424:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:425:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:425:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:426:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation906); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:450:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:451:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:452:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation947);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;

             current =iv_ruleKeyIntValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation957); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:459:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:462:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:463:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:463:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:463:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyIntValueAnnotation994); 

                	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:467:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:468:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:468:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:469:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation1015);
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

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:485:2: ( (lv_value_2_0= ruleInteger ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:486:1: (lv_value_2_0= ruleInteger )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:486:1: (lv_value_2_0= ruleInteger )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:487:3: lv_value_2_0= ruleInteger
            {
             
            	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation1036);
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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:511:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:512:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:513:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1072);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;

             current =iv_ruleKeyFloatValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1082); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:520:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:523:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:524:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:524:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:524:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyFloatValueAnnotation1119); 

                	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:528:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:529:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:529:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:530:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation1140);
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

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:546:2: ( (lv_value_2_0= ruleFloateger ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:547:1: (lv_value_2_0= ruleFloateger )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:547:1: (lv_value_2_0= ruleFloateger )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:548:3: lv_value_2_0= ruleFloateger
            {
             
            	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation1161);
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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:574:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:575:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:576:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1200);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1211); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:583:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:586:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:587:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:587:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:587:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1251); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:595:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1277); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:610:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:611:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:612:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
             newCompositeNode(grammarAccess.getExtendedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID1323);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;

             current =iv_ruleExtendedID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID1334); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:619:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:622:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:623:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:623:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:623:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID1374); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:630:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:631:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleExtendedID1393); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID1408); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleInteger"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:651:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:652:2: (iv_ruleInteger= ruleInteger EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:653:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger1456);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger1467); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:660:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:663:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:664:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:664:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:664:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:664:2: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:665:2: kw= '-'
                    {
                    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInteger1506); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInteger1523); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:685:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:686:2: (iv_ruleFloateger= ruleFloateger EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:687:2: iv_ruleFloateger= ruleFloateger EOF
            {
             newCompositeNode(grammarAccess.getFloategerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_entryRuleFloateger1569);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;

             current =iv_ruleFloateger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloateger1580); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:694:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:697:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:698:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:698:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:698:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:698:2: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:699:2: kw= '-'
                    {
                    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFloateger1619); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloateger1636); 

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
        "\15\uffff";
    static final String DFA1_eofS =
        "\3\uffff\1\10\10\uffff\1\10";
    static final String DFA1_minS =
        "\1\4\1\uffff\1\7\1\5\1\7\1\uffff\1\10\5\uffff\1\5";
    static final String DFA1_maxS =
        "\1\17\1\uffff\1\7\1\23\1\7\1\uffff\1\11\5\uffff\1\23";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\1\uffff\1\7\1\2\1\4\1\6\1\5\1\uffff";
    static final String DFA1_specialS =
        "\15\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\12\uffff\1\2",
            "",
            "\1\3",
            "\1\13\2\5\1\12\1\7\6\uffff\1\11\1\uffff\1\4\1\6",
            "\1\14",
            "",
            "\1\12\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\13\2\5\1\12\1\7\6\uffff\1\11\1\uffff\1\4\1\6"
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
            return "80:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation331 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation422 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleTagAnnotation469 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation526 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKeyStringValueAnnotation573 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation594 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation651 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleTypedKeyStringValueAnnotation698 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation719 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTypedKeyStringValueAnnotation731 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation752 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTypedKeyStringValueAnnotation764 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation821 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKeyBooleanValueAnnotation868 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation889 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation947 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKeyIntValueAnnotation994 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation1015 = new BitSet(new long[]{0x0000000000080100L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation1036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1072 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKeyFloatValueAnnotation1119 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation1140 = new BitSet(new long[]{0x0000000000080200L});
        public static final BitSet FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation1161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1200 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID1323 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID1374 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleExtendedID1393 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID1408 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1456 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger1467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleInteger1506 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInteger1523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloateger_in_entryRuleFloateger1569 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloateger1580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleFloateger1619 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloateger1636 = new BitSet(new long[]{0x0000000000000002L});
    }


}