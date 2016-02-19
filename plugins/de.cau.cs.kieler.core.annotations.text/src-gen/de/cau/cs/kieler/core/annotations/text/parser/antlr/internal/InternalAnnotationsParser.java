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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:76:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:79:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:80:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:80:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt1=4;
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
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:91:5: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation159);
                    this_KeyStringValueAnnotation_1=ruleKeyStringValueAnnotation();

                    state._fsp--;

                     
                            current = this_KeyStringValueAnnotation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:101:5: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation186);
                    this_TypedKeyStringValueAnnotation_2=ruleTypedKeyStringValueAnnotation();

                    state._fsp--;

                     
                            current = this_TypedKeyStringValueAnnotation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:111:5: this_TagAnnotation_3= ruleTagAnnotation
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_ruleAnnotation213);
                    this_TagAnnotation_3=ruleTagAnnotation();

                    state._fsp--;

                     
                            current = this_TagAnnotation_3; 
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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:133:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:134:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:135:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
             newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation254);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;

             current =iv_ruleCommentAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation264); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:142:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:145:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:146:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:146:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:147:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:147:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:148:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation305); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:172:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:173:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:174:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
             newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation345);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;

             current =iv_ruleTagAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation355); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:181:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:184:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:185:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:185:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:185:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTagAnnotation392); 

                	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:189:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:190:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:190:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:191:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTagAnnotation413);
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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:215:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:216:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:217:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation449);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;

             current =iv_ruleKeyStringValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation459); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:224:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:227:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:228:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:228:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:228:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyStringValueAnnotation496); 

                	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:232:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:233:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:233:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:234:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation517);
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

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:250:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:251:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:251:1: (lv_values_2_0= ruleEStringAllTypes )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:252:3: lv_values_2_0= ruleEStringAllTypes
            {
             
            	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEStringAllTypes_in_ruleKeyStringValueAnnotation538);
            lv_values_2_0=ruleEStringAllTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_2_0, 
                    		"EStringAllTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:268:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:268:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleKeyStringValueAnnotation551); 

            	        	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:272:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:273:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:273:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:274:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEStringAllTypes_in_ruleKeyStringValueAnnotation572);
            	    lv_values_4_0=ruleEStringAllTypes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_4_0, 
            	            		"EStringAllTypes");
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


    // $ANTLR start "entryRuleRestrictedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:298:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:299:2: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:300:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRestrictedKeyStringValueAnnotation_in_entryRuleRestrictedKeyStringValueAnnotation610);
            iv_ruleRestrictedKeyStringValueAnnotation=ruleRestrictedKeyStringValueAnnotation();

            state._fsp--;

             current =iv_ruleRestrictedKeyStringValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRestrictedKeyStringValueAnnotation620); 

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
    // $ANTLR end "entryRuleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:307:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:310:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:311:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:311:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:311:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRestrictedKeyStringValueAnnotation657); 

                	newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:315:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:316:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:316:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:317:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleRestrictedKeyStringValueAnnotation678);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ExtendedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:333:2: ( (lv_values_2_0= ruleEStringBoolean ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:334:1: (lv_values_2_0= ruleEStringBoolean )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:334:1: (lv_values_2_0= ruleEStringBoolean )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:335:3: lv_values_2_0= ruleEStringBoolean
            {
             
            	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_ruleRestrictedKeyStringValueAnnotation699);
            lv_values_2_0=ruleEStringBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_2_0, 
                    		"EStringBoolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:351:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:351:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRestrictedKeyStringValueAnnotation712); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:355:1: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:356:1: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:356:1: (lv_values_4_0= ruleEStringBoolean )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:357:3: lv_values_4_0= ruleEStringBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_ruleRestrictedKeyStringValueAnnotation733);
            	    lv_values_4_0=ruleEStringBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_4_0, 
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
    // $ANTLR end "ruleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:381:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:382:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:383:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation771);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;

             current =iv_ruleTypedKeyStringValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation781); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:390:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:393:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:394:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:394:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:394:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTypedKeyStringValueAnnotation818); 

                	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:398:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:399:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:399:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:400:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation839);
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

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTypedKeyStringValueAnnotation851); 

                	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:420:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:421:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:421:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:422:3: lv_type_3_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation872);
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

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTypedKeyStringValueAnnotation884); 

                	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:442:1: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:443:1: (lv_values_5_0= ruleEStringAllTypes )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:443:1: (lv_values_5_0= ruleEStringAllTypes )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:444:3: lv_values_5_0= ruleEStringAllTypes
            {
             
            	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEStringAllTypes_in_ruleTypedKeyStringValueAnnotation905);
            lv_values_5_0=ruleEStringAllTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_5_0, 
                    		"EStringAllTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:460:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:460:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTypedKeyStringValueAnnotation918); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	        
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:464:1: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:465:1: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:465:1: (lv_values_7_0= ruleEStringAllTypes )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:466:3: lv_values_7_0= ruleEStringAllTypes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEStringAllTypes_in_ruleTypedKeyStringValueAnnotation939);
            	    lv_values_7_0=ruleEStringAllTypes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_7_0, 
            	            		"EStringAllTypes");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleRestrictedTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:490:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:491:2: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:492:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRestrictedTypedKeyStringValueAnnotation_in_entryRuleRestrictedTypedKeyStringValueAnnotation977);
            iv_ruleRestrictedTypedKeyStringValueAnnotation=ruleRestrictedTypedKeyStringValueAnnotation();

            state._fsp--;

             current =iv_ruleRestrictedTypedKeyStringValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRestrictedTypedKeyStringValueAnnotation987); 

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
    // $ANTLR end "entryRuleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:499:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:502:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:503:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:503:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:503:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRestrictedTypedKeyStringValueAnnotation1024); 

                	newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:507:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:508:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:508:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:509:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleRestrictedTypedKeyStringValueAnnotation1045);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ExtendedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRestrictedTypedKeyStringValueAnnotation1057); 

                	newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:529:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:530:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:530:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:531:3: lv_type_3_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleRestrictedTypedKeyStringValueAnnotation1078);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"ExtendedID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRestrictedTypedKeyStringValueAnnotation1090); 

                	newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:551:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:552:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:552:1: (lv_values_5_0= ruleEStringBoolean )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:553:3: lv_values_5_0= ruleEStringBoolean
            {
             
            	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_ruleRestrictedTypedKeyStringValueAnnotation1111);
            lv_values_5_0=ruleEStringBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_5_0, 
                    		"EStringBoolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:569:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:569:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRestrictedTypedKeyStringValueAnnotation1124); 

            	        	newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	        
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:573:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:574:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:574:1: (lv_values_7_0= ruleEStringBoolean )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:575:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_ruleRestrictedTypedKeyStringValueAnnotation1145);
            	    lv_values_7_0=ruleEStringBoolean();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
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
    // $ANTLR end "ruleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:599:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:600:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:601:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation1183);
            iv_ruleQuotedKeyStringValueAnnotation=ruleQuotedKeyStringValueAnnotation();

            state._fsp--;

             current =iv_ruleQuotedKeyStringValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation1193); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:608:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:611:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:612:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:612:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:612:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQuotedKeyStringValueAnnotation1230); 

                	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:616:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:617:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:617:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:618:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleQuotedKeyStringValueAnnotation1251);
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

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:634:2: ( (lv_values_2_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:635:1: (lv_values_2_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:635:1: (lv_values_2_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:636:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation1268); 

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

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:652:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:652:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuotedKeyStringValueAnnotation1286); 

            	        	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:656:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:657:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:657:1: (lv_values_4_0= RULE_STRING )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:658:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation1303); 

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
            	    break loop6;
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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:682:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:683:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:684:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
            {
             newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation1346);
            iv_ruleQuotedTypedKeyStringValueAnnotation=ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;

             current =iv_ruleQuotedTypedKeyStringValueAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation1356); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:691:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:694:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:695:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:695:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:695:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQuotedTypedKeyStringValueAnnotation1393); 

                	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:699:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:700:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:700:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:701:3: lv_name_1_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation1414);
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

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQuotedTypedKeyStringValueAnnotation1426); 

                	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:721:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:722:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:722:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:723:3: lv_type_3_0= ruleExtendedID
            {
             
            	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation1447);
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

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQuotedTypedKeyStringValueAnnotation1459); 

                	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:743:1: ( (lv_values_5_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:744:1: (lv_values_5_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:744:1: (lv_values_5_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:745:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation1476); 

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

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:761:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:761:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQuotedTypedKeyStringValueAnnotation1494); 

            	        	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	        
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:765:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:766:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:766:1: (lv_values_7_0= RULE_STRING )
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:767:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation1511); 

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
            	    break loop7;
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


    // $ANTLR start "entryRuleEStringBoolean"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:793:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:794:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:795:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
            {
             newCompositeNode(grammarAccess.getEStringBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringBoolean_in_entryRuleEStringBoolean1557);
            iv_ruleEStringBoolean=ruleEStringBoolean();

            state._fsp--;

             current =iv_ruleEStringBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEStringBoolean1568); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:802:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:805:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:806:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:806:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:806:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEStringBoolean1608); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:815:5: this_ExtendedID_1= ruleExtendedID
                    {
                     
                            newCompositeNode(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleEStringBoolean1641);
                    this_ExtendedID_1=ruleExtendedID();

                    state._fsp--;


                    		current.merge(this_ExtendedID_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:826:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleEStringBoolean1667); 

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


    // $ANTLR start "entryRuleEStringAllTypes"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:841:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:842:2: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:843:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
            {
             newCompositeNode(grammarAccess.getEStringAllTypesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEStringAllTypes_in_entryRuleEStringAllTypes1713);
            iv_ruleEStringAllTypes=ruleEStringAllTypes();

            state._fsp--;

             current =iv_ruleEStringAllTypes.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEStringAllTypes1724); 

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
    // $ANTLR end "entryRuleEStringAllTypes"


    // $ANTLR start "ruleEStringAllTypes"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:850:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:853:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:854:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:854:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                alt9=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt9=3;
                }
                break;
            case 21:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==RULE_INT) ) {
                    alt9=4;
                }
                else if ( (LA9_4==RULE_FLOAT) ) {
                    alt9=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt9=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:854:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEStringAllTypes1764); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:863:5: this_ExtendedID_1= ruleExtendedID
                    {
                     
                            newCompositeNode(grammarAccess.getEStringAllTypesAccess().getExtendedIDParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleEStringAllTypes1797);
                    this_ExtendedID_1=ruleExtendedID();

                    state._fsp--;


                    		current.merge(this_ExtendedID_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:874:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleEStringAllTypes1823); 

                    		current.merge(this_BOOLEAN_2);
                        
                     
                        newLeafNode(this_BOOLEAN_2, grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:883:5: this_Integer_3= ruleInteger
                    {
                     
                            newCompositeNode(grammarAccess.getEStringAllTypesAccess().getIntegerParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleEStringAllTypes1856);
                    this_Integer_3=ruleInteger();

                    state._fsp--;


                    		current.merge(this_Integer_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:895:5: this_Floateger_4= ruleFloateger
                    {
                     
                            newCompositeNode(grammarAccess.getEStringAllTypesAccess().getFloategerParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_ruleEStringAllTypes1889);
                    this_Floateger_4=ruleFloateger();

                    state._fsp--;


                    		current.merge(this_Floateger_4);
                        
                     
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
    // $ANTLR end "ruleEStringAllTypes"


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:913:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:914:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:915:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
             newCompositeNode(grammarAccess.getExtendedIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID1935);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;

             current =iv_ruleExtendedID.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID1946); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:922:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:925:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:926:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:926:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )? )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:926:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '#' this_INT_4= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID1986); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:933:1: (kw= '.' this_ID_2= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:934:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExtendedID2005); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID2020); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:946:3: (kw= '#' this_INT_4= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:947:2: kw= '#' this_INT_4= RULE_INT
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleExtendedID2041); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleExtendedID2056); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:969:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:970:2: (iv_ruleInteger= ruleInteger EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:971:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger2106);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger2117); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:978:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:981:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:982:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:982:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:982:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:982:2: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:983:2: kw= '-'
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInteger2156); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInteger2173); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1003:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1004:2: (iv_ruleFloateger= ruleFloateger EOF )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1005:2: iv_ruleFloateger= ruleFloateger EOF
            {
             newCompositeNode(grammarAccess.getFloategerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_entryRuleFloateger2219);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;

             current =iv_ruleFloateger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloateger2230); 

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
    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1012:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1015:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1016:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1016:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1016:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1016:2: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations.text/src-gen/de/cau/cs/kieler/core/annotations/text/parser/antlr/internal/InternalAnnotations.g:1017:2: kw= '-'
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFloateger2269); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloateger2286); 

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
        "\13\uffff";
    static final String DFA1_eofS =
        "\3\uffff\1\6\5\uffff\2\6";
    static final String DFA1_minS =
        "\1\4\1\uffff\1\7\1\5\1\7\1\10\3\uffff\2\5";
    static final String DFA1_maxS =
        "\1\17\1\uffff\1\7\1\25\1\7\1\10\3\uffff\2\25";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\4\uffff\1\4\1\3\1\2\2\uffff";
    static final String DFA1_specialS =
        "\13\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\12\uffff\1\2",
            "",
            "\1\3",
            "\5\10\7\uffff\1\7\1\uffff\1\4\1\5\1\10",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "\5\10\7\uffff\1\7\1\uffff\1\4\1\5\1\10",
            "\5\10\7\uffff\1\7\3\uffff\1\10"
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
            return "80:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation254 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation345 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleTagAnnotation392 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation449 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKeyStringValueAnnotation496 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation517 = new BitSet(new long[]{0x00000000002003E0L});
        public static final BitSet FOLLOW_ruleEStringAllTypes_in_ruleKeyStringValueAnnotation538 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleKeyStringValueAnnotation551 = new BitSet(new long[]{0x00000000002003E0L});
        public static final BitSet FOLLOW_ruleEStringAllTypes_in_ruleKeyStringValueAnnotation572 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleRestrictedKeyStringValueAnnotation_in_entryRuleRestrictedKeyStringValueAnnotation610 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRestrictedKeyStringValueAnnotation620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleRestrictedKeyStringValueAnnotation657 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleRestrictedKeyStringValueAnnotation678 = new BitSet(new long[]{0x00000000000000E0L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_ruleRestrictedKeyStringValueAnnotation699 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleRestrictedKeyStringValueAnnotation712 = new BitSet(new long[]{0x00000000000000E0L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_ruleRestrictedKeyStringValueAnnotation733 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation771 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleTypedKeyStringValueAnnotation818 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation839 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTypedKeyStringValueAnnotation851 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation872 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTypedKeyStringValueAnnotation884 = new BitSet(new long[]{0x00000000002003E0L});
        public static final BitSet FOLLOW_ruleEStringAllTypes_in_ruleTypedKeyStringValueAnnotation905 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleTypedKeyStringValueAnnotation918 = new BitSet(new long[]{0x00000000002003E0L});
        public static final BitSet FOLLOW_ruleEStringAllTypes_in_ruleTypedKeyStringValueAnnotation939 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleRestrictedTypedKeyStringValueAnnotation_in_entryRuleRestrictedTypedKeyStringValueAnnotation977 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRestrictedTypedKeyStringValueAnnotation987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleRestrictedTypedKeyStringValueAnnotation1024 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleRestrictedTypedKeyStringValueAnnotation1045 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRestrictedTypedKeyStringValueAnnotation1057 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleRestrictedTypedKeyStringValueAnnotation1078 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRestrictedTypedKeyStringValueAnnotation1090 = new BitSet(new long[]{0x00000000000000E0L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_ruleRestrictedTypedKeyStringValueAnnotation1111 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleRestrictedTypedKeyStringValueAnnotation1124 = new BitSet(new long[]{0x00000000000000E0L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_ruleRestrictedTypedKeyStringValueAnnotation1145 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleQuotedKeyStringValueAnnotation_in_entryRuleQuotedKeyStringValueAnnotation1183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuotedKeyStringValueAnnotation1193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleQuotedKeyStringValueAnnotation1230 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleQuotedKeyStringValueAnnotation1251 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation1268 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleQuotedKeyStringValueAnnotation1286 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedKeyStringValueAnnotation1303 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleQuotedTypedKeyStringValueAnnotation_in_entryRuleQuotedTypedKeyStringValueAnnotation1346 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuotedTypedKeyStringValueAnnotation1356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleQuotedTypedKeyStringValueAnnotation1393 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation1414 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleQuotedTypedKeyStringValueAnnotation1426 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleQuotedTypedKeyStringValueAnnotation1447 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleQuotedTypedKeyStringValueAnnotation1459 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation1476 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleQuotedTypedKeyStringValueAnnotation1494 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleQuotedTypedKeyStringValueAnnotation1511 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleEStringBoolean_in_entryRuleEStringBoolean1557 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEStringBoolean1568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringBoolean1608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleEStringBoolean1641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleEStringBoolean1667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEStringAllTypes_in_entryRuleEStringAllTypes1713 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEStringAllTypes1724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEStringAllTypes1764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleEStringAllTypes1797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleEStringAllTypes1823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleEStringAllTypes1856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloateger_in_ruleEStringAllTypes1889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID1935 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID1946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID1986 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_19_in_ruleExtendedID2005 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID2020 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_20_in_ruleExtendedID2041 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleExtendedID2056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger2106 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger2117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleInteger2156 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInteger2173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloateger_in_entryRuleFloateger2219 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloateger2230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleFloateger2269 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloateger2286 = new BitSet(new long[]{0x0000000000000002L});
    }


}