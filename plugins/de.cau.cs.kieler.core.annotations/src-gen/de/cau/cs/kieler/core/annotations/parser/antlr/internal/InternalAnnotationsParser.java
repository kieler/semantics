package de.cau.cs.kieler.core.annotations.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT_ANNOTATION", "RULE_ID", "RULE_TYPEID", "RULE_BOOLEAN", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'('", "')'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=10;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=8;
    public static final int RULE_WS=13;
    public static final int RULE_FLOAT=9;
    public static final int RULE_TYPEID=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_COMMENT_ANNOTATION=4;
    public static final int RULE_ML_COMMENT=11;

        public InternalAnnotationsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[37+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private AnnotationsGrammarAccess grammarAccess;
     	
        public InternalAnnotationsParser(TokenStream input, IAstFactory factory, AnnotationsGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Annotation";	
       	}
       	
       	@Override
       	protected AnnotationsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:83:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:84:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:85:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation81);
            iv_ruleAnnotation=ruleAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation91); if (failed) return current;

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
    // $ANTLR end entryRuleAnnotation


    // $ANTLR start ruleAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:92:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedStringAnnotation_3= ruleTypedStringAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_TagAnnotation_1 = null;

        EObject this_KeyStringValueAnnotation_2 = null;

        EObject this_TypedStringAnnotation_3 = null;

        EObject this_KeyBooleanValueAnnotation_4 = null;

        EObject this_KeyIntValueAnnotation_5 = null;

        EObject this_KeyFloatValueAnnotation_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:97:6: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedStringAnnotation_3= ruleTypedStringAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:98:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedStringAnnotation_3= ruleTypedStringAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:98:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedStringAnnotation_3= ruleTypedStringAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            int alt1=7;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_COMMENT_ANNOTATION) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case RULE_FLOAT:
                        {
                        alt1=7;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt1=6;
                        }
                        break;
                    case RULE_TYPEID:
                        {
                        alt1=4;
                        }
                        break;
                    case RULE_BOOLEAN:
                        {
                        alt1=5;
                        }
                        break;
                    case RULE_ID:
                    case RULE_STRING:
                        {
                        alt1=3;
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
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("98:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedStringAnnotation_3= ruleTypedStringAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )", 1, 3, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("98:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedStringAnnotation_3= ruleTypedStringAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("98:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedStringAnnotation_3= ruleTypedStringAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:99:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_ruleAnnotation141);
                    this_CommentAnnotation_0=ruleCommentAnnotation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CommentAnnotation_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:112:2: this_TagAnnotation_1= ruleTagAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_ruleAnnotation171);
                    this_TagAnnotation_1=ruleTagAnnotation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TagAnnotation_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:125:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation201);
                    this_KeyStringValueAnnotation_2=ruleKeyStringValueAnnotation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_KeyStringValueAnnotation_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:138:2: this_TypedStringAnnotation_3= ruleTypedStringAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getTypedStringAnnotationParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedStringAnnotation_in_ruleAnnotation231);
                    this_TypedStringAnnotation_3=ruleTypedStringAnnotation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TypedStringAnnotation_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:151:2: this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation261);
                    this_KeyBooleanValueAnnotation_4=ruleKeyBooleanValueAnnotation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_KeyBooleanValueAnnotation_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:164:2: this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation291);
                    this_KeyIntValueAnnotation_5=ruleKeyIntValueAnnotation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_KeyIntValueAnnotation_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:177:2: this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation321);
                    this_KeyFloatValueAnnotation_6=ruleKeyFloatValueAnnotation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_KeyFloatValueAnnotation_6; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAnnotation


    // $ANTLR start entryRuleCommentAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:196:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:197:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:198:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommentAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation356);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation366); if (failed) return current;

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
    // $ANTLR end entryRuleCommentAnnotation


    // $ANTLR start ruleCommentAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:205:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:210:6: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:211:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:211:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:212:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:212:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:213:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation407); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCommentAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"COMMENT_ANNOTATION", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleCommentAnnotation


    // $ANTLR start entryRuleTagAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:243:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:244:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:245:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTagAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation447);
            iv_ruleTagAnnotation=ruleTagAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation457); if (failed) return current;

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
    // $ANTLR end entryRuleTagAnnotation


    // $ANTLR start ruleTagAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:252:1: ruleTagAnnotation returns [EObject current=null] : ( '@' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_annotations_3_0= ruleAnnotation ) )* ')' )? ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_annotations_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:257:6: ( ( '@' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_annotations_3_0= ruleAnnotation ) )* ')' )? ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:258:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_annotations_3_0= ruleAnnotation ) )* ')' )? )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:258:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_annotations_3_0= ruleAnnotation ) )* ')' )? )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:258:3: '@' ( (lv_name_1_0= RULE_ID ) ) ( '(' ( (lv_annotations_3_0= ruleAnnotation ) )* ')' )?
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleTagAnnotation492); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:262:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:263:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:263:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:264:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTagAnnotation509); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTagAnnotationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTagAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:286:2: ( '(' ( (lv_annotations_3_0= ruleAnnotation ) )* ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:286:4: '(' ( (lv_annotations_3_0= ruleAnnotation ) )* ')'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleTagAnnotation525); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:290:1: ( (lv_annotations_3_0= ruleAnnotation ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_COMMENT_ANNOTATION||LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:291:1: (lv_annotations_3_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:291:1: (lv_annotations_3_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:292:3: lv_annotations_3_0= ruleAnnotation
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTagAnnotation546);
                    	    lv_annotations_3_0=ruleAnnotation();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTagAnnotationRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"annotations",
                    	      	        		lv_annotations_3_0, 
                    	      	        		"Annotation", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match(input,17,FollowSets000.FOLLOW_17_in_ruleTagAnnotation557); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTagAnnotation


    // $ANTLR start entryRuleKeyStringValueAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:326:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:327:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:328:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getKeyStringValueAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation595);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation605); if (failed) return current;

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
    // $ANTLR end entryRuleKeyStringValueAnnotation


    // $ANTLR start ruleKeyStringValueAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:335:1: ruleKeyStringValueAnnotation returns [EObject current=null] : ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_annotations_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:340:6: ( ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:341:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:341:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:341:3: '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )?
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyStringValueAnnotation640); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:345:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:346:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:346:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:347:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKeyStringValueAnnotation657); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getKeyStringValueAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:369:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:370:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:370:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:371:3: lv_value_2_0= ruleEString
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation683);
            lv_value_2_0=ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getKeyStringValueAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"EString", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:393:2: ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:393:4: '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleKeyStringValueAnnotation694); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:397:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_COMMENT_ANNOTATION||LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:398:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:398:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:399:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation715);
                    	    lv_annotations_4_0=ruleAnnotation();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getKeyStringValueAnnotationRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"annotations",
                    	      	        		lv_annotations_4_0, 
                    	      	        		"Annotation", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match(input,17,FollowSets000.FOLLOW_17_in_ruleKeyStringValueAnnotation726); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleKeyStringValueAnnotation


    // $ANTLR start entryRuleTypedStringAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:433:1: entryRuleTypedStringAnnotation returns [EObject current=null] : iv_ruleTypedStringAnnotation= ruleTypedStringAnnotation EOF ;
    public final EObject entryRuleTypedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedStringAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:434:2: (iv_ruleTypedStringAnnotation= ruleTypedStringAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:435:2: iv_ruleTypedStringAnnotation= ruleTypedStringAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypedStringAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedStringAnnotation_in_entryRuleTypedStringAnnotation764);
            iv_ruleTypedStringAnnotation=ruleTypedStringAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypedStringAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedStringAnnotation774); if (failed) return current;

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
    // $ANTLR end entryRuleTypedStringAnnotation


    // $ANTLR start ruleTypedStringAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:442:1: ruleTypedStringAnnotation returns [EObject current=null] : ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= RULE_TYPEID ) ) ( (lv_value_3_0= ruleEString ) ) ( '(' ( (lv_annotations_5_0= ruleAnnotation ) )* ')' )? ) ;
    public final EObject ruleTypedStringAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_type_2_0=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;

        EObject lv_annotations_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:447:6: ( ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= RULE_TYPEID ) ) ( (lv_value_3_0= ruleEString ) ) ( '(' ( (lv_annotations_5_0= ruleAnnotation ) )* ')' )? ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:448:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= RULE_TYPEID ) ) ( (lv_value_3_0= ruleEString ) ) ( '(' ( (lv_annotations_5_0= ruleAnnotation ) )* ')' )? )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:448:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= RULE_TYPEID ) ) ( (lv_value_3_0= ruleEString ) ) ( '(' ( (lv_annotations_5_0= ruleAnnotation ) )* ')' )? )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:448:3: '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= RULE_TYPEID ) ) ( (lv_value_3_0= ruleEString ) ) ( '(' ( (lv_annotations_5_0= ruleAnnotation ) )* ')' )?
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleTypedStringAnnotation809); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTypedStringAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:452:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:453:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:453:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:454:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypedStringAnnotation826); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTypedStringAnnotationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTypedStringAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:476:2: ( (lv_type_2_0= RULE_TYPEID ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:477:1: (lv_type_2_0= RULE_TYPEID )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:477:1: (lv_type_2_0= RULE_TYPEID )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:478:3: lv_type_2_0= RULE_TYPEID
            {
            lv_type_2_0=(Token)input.LT(1);
            match(input,RULE_TYPEID,FollowSets000.FOLLOW_RULE_TYPEID_in_ruleTypedStringAnnotation848); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTypedStringAnnotationAccess().getTypeTypeIdTerminalRuleCall_2_0(), "type"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTypedStringAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_2_0, 
              	        		"TypeId", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:500:2: ( (lv_value_3_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:501:1: (lv_value_3_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:501:1: (lv_value_3_0= ruleEString )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:502:3: lv_value_3_0= ruleEString
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypedStringAnnotationAccess().getValueEStringParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedStringAnnotation874);
            lv_value_3_0=ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTypedStringAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_3_0, 
              	        		"EString", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:524:2: ( '(' ( (lv_annotations_5_0= ruleAnnotation ) )* ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:524:4: '(' ( (lv_annotations_5_0= ruleAnnotation ) )* ')'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleTypedStringAnnotation885); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypedStringAnnotationAccess().getLeftParenthesisKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:528:1: ( (lv_annotations_5_0= ruleAnnotation ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_COMMENT_ANNOTATION||LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:529:1: (lv_annotations_5_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:529:1: (lv_annotations_5_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:530:3: lv_annotations_5_0= ruleAnnotation
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTypedStringAnnotationAccess().getAnnotationsAnnotationParserRuleCall_4_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTypedStringAnnotation906);
                    	    lv_annotations_5_0=ruleAnnotation();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTypedStringAnnotationRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"annotations",
                    	      	        		lv_annotations_5_0, 
                    	      	        		"Annotation", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match(input,17,FollowSets000.FOLLOW_17_in_ruleTypedStringAnnotation917); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypedStringAnnotationAccess().getRightParenthesisKeyword_4_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTypedStringAnnotation


    // $ANTLR start entryRuleKeyBooleanValueAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:564:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:565:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:566:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation955);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation965); if (failed) return current;

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
    // $ANTLR end entryRuleKeyBooleanValueAnnotation


    // $ANTLR start ruleKeyBooleanValueAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:573:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_value_2_0=null;
        EObject lv_annotations_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:578:6: ( ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:579:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:579:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:579:3: '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )?
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyBooleanValueAnnotation1000); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:583:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:584:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:584:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:585:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKeyBooleanValueAnnotation1017); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getKeyBooleanValueAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:607:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:608:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:608:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:609:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation1039); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBooleanTerminalRuleCall_2_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getKeyBooleanValueAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"Boolean", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:631:2: ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:631:4: '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleKeyBooleanValueAnnotation1055); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:635:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_COMMENT_ANNOTATION||LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:636:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:636:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:637:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation1076);
                    	    lv_annotations_4_0=ruleAnnotation();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getKeyBooleanValueAnnotationRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"annotations",
                    	      	        		lv_annotations_4_0, 
                    	      	        		"Annotation", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match(input,17,FollowSets000.FOLLOW_17_in_ruleKeyBooleanValueAnnotation1087); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleKeyBooleanValueAnnotation


    // $ANTLR start entryRuleKeyIntValueAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:671:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:672:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:673:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getKeyIntValueAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation1125);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation1135); if (failed) return current;

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
    // $ANTLR end entryRuleKeyIntValueAnnotation


    // $ANTLR start ruleKeyIntValueAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:680:1: ruleKeyIntValueAnnotation returns [EObject current=null] : ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_value_2_0=null;
        EObject lv_annotations_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:685:6: ( ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:686:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:686:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:686:3: '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_INT ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )?
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyIntValueAnnotation1170); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:690:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:691:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:691:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:692:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKeyIntValueAnnotation1187); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getKeyIntValueAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:714:2: ( (lv_value_2_0= RULE_INT ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:715:1: (lv_value_2_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:715:1: (lv_value_2_0= RULE_INT )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:716:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation1209); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getKeyIntValueAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:738:2: ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:738:4: '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleKeyIntValueAnnotation1225); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:742:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_COMMENT_ANNOTATION||LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:743:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:743:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:744:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation1246);
                    	    lv_annotations_4_0=ruleAnnotation();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getKeyIntValueAnnotationRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"annotations",
                    	      	        		lv_annotations_4_0, 
                    	      	        		"Annotation", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match(input,17,FollowSets000.FOLLOW_17_in_ruleKeyIntValueAnnotation1257); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleKeyIntValueAnnotation


    // $ANTLR start entryRuleKeyFloatValueAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:778:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:779:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:780:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1295);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1305); if (failed) return current;

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
    // $ANTLR end entryRuleKeyFloatValueAnnotation


    // $ANTLR start ruleKeyFloatValueAnnotation
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:787:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_value_2_0=null;
        EObject lv_annotations_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:792:6: ( ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:793:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:793:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )? )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:793:3: '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )?
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleKeyFloatValueAnnotation1340); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:797:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:798:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:798:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:799:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKeyFloatValueAnnotation1357); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getKeyFloatValueAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:821:2: ( (lv_value_2_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:822:1: (lv_value_2_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:822:1: (lv_value_2_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:823:3: lv_value_2_0= RULE_FLOAT
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation1379); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloatTerminalRuleCall_2_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getKeyFloatValueAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"Float", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:845:2: ( '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:845:4: '(' ( (lv_annotations_4_0= ruleAnnotation ) )* ')'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleKeyFloatValueAnnotation1395); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:849:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_COMMENT_ANNOTATION||LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:850:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:850:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:851:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation1416);
                    	    lv_annotations_4_0=ruleAnnotation();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getKeyFloatValueAnnotationRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"annotations",
                    	      	        		lv_annotations_4_0, 
                    	      	        		"Annotation", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match(input,17,FollowSets000.FOLLOW_17_in_ruleKeyFloatValueAnnotation1427); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleKeyFloatValueAnnotation


    // $ANTLR start entryRuleEString
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:887:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:888:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:889:2: iv_ruleEString= ruleEString EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEStringRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1468);
            iv_ruleEString=ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1479); if (failed) return current;

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
    // $ANTLR end entryRuleEString


    // $ANTLR start ruleEString
    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:896:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:901:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:902:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:902:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("902:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:902:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1519); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.annotations/src-gen/de/cau/cs/kieler/core/annotations/parser/antlr/internal/InternalAnnotations.g:910:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1545); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleEString


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedStringAnnotation_in_ruleAnnotation231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation356 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation447 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleTagAnnotation492 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTagAnnotation509 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleTagAnnotation525 = new BitSet(new long[]{0x0000000000028010L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTagAnnotation546 = new BitSet(new long[]{0x0000000000028010L});
        public static final BitSet FOLLOW_17_in_ruleTagAnnotation557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation595 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKeyStringValueAnnotation640 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKeyStringValueAnnotation657 = new BitSet(new long[]{0x0000000000000420L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation683 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleKeyStringValueAnnotation694 = new BitSet(new long[]{0x0000000000028010L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation715 = new BitSet(new long[]{0x0000000000028010L});
        public static final BitSet FOLLOW_17_in_ruleKeyStringValueAnnotation726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedStringAnnotation_in_entryRuleTypedStringAnnotation764 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedStringAnnotation774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleTypedStringAnnotation809 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypedStringAnnotation826 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_TYPEID_in_ruleTypedStringAnnotation848 = new BitSet(new long[]{0x0000000000000420L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedStringAnnotation874 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleTypedStringAnnotation885 = new BitSet(new long[]{0x0000000000028010L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTypedStringAnnotation906 = new BitSet(new long[]{0x0000000000028010L});
        public static final BitSet FOLLOW_17_in_ruleTypedStringAnnotation917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation955 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKeyBooleanValueAnnotation1000 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKeyBooleanValueAnnotation1017 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation1039 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleKeyBooleanValueAnnotation1055 = new BitSet(new long[]{0x0000000000028010L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation1076 = new BitSet(new long[]{0x0000000000028010L});
        public static final BitSet FOLLOW_17_in_ruleKeyBooleanValueAnnotation1087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation1125 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation1135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKeyIntValueAnnotation1170 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKeyIntValueAnnotation1187 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation1209 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleKeyIntValueAnnotation1225 = new BitSet(new long[]{0x0000000000028010L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation1246 = new BitSet(new long[]{0x0000000000028010L});
        public static final BitSet FOLLOW_17_in_ruleKeyIntValueAnnotation1257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleKeyFloatValueAnnotation1340 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKeyFloatValueAnnotation1357 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation1379 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleKeyFloatValueAnnotation1395 = new BitSet(new long[]{0x0000000000028010L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation1416 = new BitSet(new long[]{0x0000000000028010L});
        public static final BitSet FOLLOW_17_in_ruleKeyFloatValueAnnotation1427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1468 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1545 = new BitSet(new long[]{0x0000000000000002L});
    }


}