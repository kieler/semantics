package de.cau.cs.kieler.synccharts.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import de.cau.cs.kieler.synccharts.services.TransitionLabelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalTransitionLabelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'/'", "'('", "')'", "':='", "'?'", "'='", "'<'", "'<='", "'>'", "'>='", "'not'", "'or'", "'and'"
    };
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int EOF=-1;
    public static final int RULE_INT=4;
    public static final int RULE_STRING=8;
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=10;

        public InternalTransitionLabelParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g"; }


     
     	private TransitionLabelGrammarAccess grammarAccess;
     	
        public InternalTransitionLabelParser(TokenStream input, IAstFactory factory, TransitionLabelGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Action";	
       	} 



    // $ANTLR start entryRuleAction
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:73:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:73:48: (iv_ruleAction= ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:74:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction73);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction83); 

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
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:81:1: ruleAction returns [EObject current=null] : ( (lv_isImmediate_0= '#' ) (lv_delay_1= RULE_INT )? (lv_trigger_2= ruleBooleanExpression )? ( '/' (lv_effects_4= ruleEffect )* )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_0=null;
        Token lv_delay_1=null;
        EObject lv_trigger_2 = null;

        EObject lv_effects_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:86:6: ( ( (lv_isImmediate_0= '#' ) (lv_delay_1= RULE_INT )? (lv_trigger_2= ruleBooleanExpression )? ( '/' (lv_effects_4= ruleEffect )* )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:87:1: ( (lv_isImmediate_0= '#' ) (lv_delay_1= RULE_INT )? (lv_trigger_2= ruleBooleanExpression )? ( '/' (lv_effects_4= ruleEffect )* )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:87:1: ( (lv_isImmediate_0= '#' ) (lv_delay_1= RULE_INT )? (lv_trigger_2= ruleBooleanExpression )? ( '/' (lv_effects_4= ruleEffect )* )? )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:87:2: (lv_isImmediate_0= '#' ) (lv_delay_1= RULE_INT )? (lv_trigger_2= ruleBooleanExpression )? ( '/' (lv_effects_4= ruleEffect )* )?
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:87:2: (lv_isImmediate_0= '#' )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:89:6: lv_isImmediate_0= '#'
            {
            lv_isImmediate_0=(Token)input.LT(1);
            match(input,13,FOLLOW_13_in_ruleAction129); 

                    createLeafNode(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_0_0(), "isImmediate"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "isImmediate", true, "#", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:108:2: (lv_delay_1= RULE_INT )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||(LA1_1>=RULE_INT && LA1_1<=RULE_BOOLEAN)||(LA1_1>=14 && LA1_1<=15)||LA1_1==18) ) {
                    alt1=1;
                }
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:110:6: lv_delay_1= RULE_INT
                    {
                    lv_delay_1=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAction164); 

                    		createLeafNode(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_1_0(), "delay"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "delay", lv_delay_1, "INT", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:128:3: (lv_trigger_2= ruleBooleanExpression )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_BOOLEAN)||LA2_0==15||LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:131:6: lv_trigger_2= ruleBooleanExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAction207);
                    lv_trigger_2=ruleBooleanExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "trigger", lv_trigger_2, "BooleanExpression", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:149:3: ( '/' (lv_effects_4= ruleEffect )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:149:4: '/' (lv_effects_4= ruleEffect )*
                    {
                    match(input,14,FOLLOW_14_in_ruleAction222); 

                            createLeafNode(grammarAccess.getActionAccess().getSolidusKeyword_3_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:153:1: (lv_effects_4= ruleEffect )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID||LA3_0==RULE_STRING) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:156:6: lv_effects_4= ruleEffect
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEffect_in_ruleAction256);
                    	    lv_effects_4=ruleEffect();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "effects", lv_effects_4, "Effect", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleEffect
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:181:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:181:48: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:182:2: iv_ruleEffect= ruleEffect EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEffectRule(), currentNode); 
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect296);
            iv_ruleEffect=ruleEffect();
            _fsp--;

             current =iv_ruleEffect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect306); 

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
    // $ANTLR end entryRuleEffect


    // $ANTLR start ruleEffect
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:189:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_HostCode_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:194:6: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:195:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:195:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==17) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==RULE_ID||LA5_1==RULE_STRING||LA5_1==15) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("195:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("195:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:196:5: this_Emission_0= ruleEmission
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmission_in_ruleEffect353);
                    this_Emission_0=ruleEmission();
                    _fsp--;

                     
                            current = this_Emission_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:206:5: this_Assignment_1= ruleAssignment
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAssignment_in_ruleEffect380);
                    this_Assignment_1=ruleAssignment();
                    _fsp--;

                     
                            current = this_Assignment_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:216:5: this_HostCode_2= ruleHostCode
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEffectAccess().getHostCodeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHostCode_in_ruleEffect407);
                    this_HostCode_2=ruleHostCode();
                    _fsp--;

                     
                            current = this_HostCode_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEffect


    // $ANTLR start entryRuleEmission
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:231:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:231:50: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:232:2: iv_ruleEmission= ruleEmission EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmissionRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission439);
            iv_ruleEmission=ruleEmission();
            _fsp--;

             current =iv_ruleEmission; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission449); 

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
    // $ANTLR end entryRuleEmission


    // $ANTLR start ruleEmission
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:239:1: ruleEmission returns [EObject current=null] : ( ( RULE_ID ) ( '(' (lv_newValue_2= rulePrimaryExpression ) ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        EObject lv_newValue_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:244:6: ( ( ( RULE_ID ) ( '(' (lv_newValue_2= rulePrimaryExpression ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:245:1: ( ( RULE_ID ) ( '(' (lv_newValue_2= rulePrimaryExpression ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:245:1: ( ( RULE_ID ) ( '(' (lv_newValue_2= rulePrimaryExpression ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:245:2: ( RULE_ID ) ( '(' (lv_newValue_2= rulePrimaryExpression ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:245:2: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:248:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmission496); 

            		createLeafNode(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0(), "signal"); 
            	

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:261:2: ( '(' (lv_newValue_2= rulePrimaryExpression ) ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:261:3: '(' (lv_newValue_2= rulePrimaryExpression ) ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleEmission509); 

                            createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:265:1: (lv_newValue_2= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:268:6: lv_newValue_2= rulePrimaryExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValuePrimaryExpressionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleEmission543);
                    lv_newValue_2=rulePrimaryExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "newValue", lv_newValue_2, "PrimaryExpression", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,16,FOLLOW_16_in_ruleEmission556); 

                            createLeafNode(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEmission


    // $ANTLR start entryRuleAssignment
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:297:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:297:52: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:298:2: iv_ruleAssignment= ruleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment591);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment601); 

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
    // $ANTLR end entryRuleAssignment


    // $ANTLR start ruleAssignment
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:305:1: ruleAssignment returns [EObject current=null] : ( ( RULE_ID ) ':=' (lv_expression_2= rulePrimaryExpression ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:310:6: ( ( ( RULE_ID ) ':=' (lv_expression_2= rulePrimaryExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:311:1: ( ( RULE_ID ) ':=' (lv_expression_2= rulePrimaryExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:311:1: ( ( RULE_ID ) ':=' (lv_expression_2= rulePrimaryExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:311:2: ( RULE_ID ) ':=' (lv_expression_2= rulePrimaryExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:311:2: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:314:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment648); 

            		createLeafNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0(), "variable"); 
            	

            }

            match(input,17,FOLLOW_17_in_ruleAssignment660); 

                    createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:331:1: (lv_expression_2= rulePrimaryExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:334:6: lv_expression_2= rulePrimaryExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionPrimaryExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleAssignment694);
            lv_expression_2=rulePrimaryExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "expression", lv_expression_2, "PrimaryExpression", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:359:1: entryRuleSignalReference returns [EObject current=null] : iv_ruleSignalReference= ruleSignalReference EOF ;
    public final EObject entryRuleSignalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:359:57: (iv_ruleSignalReference= ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:360:2: iv_ruleSignalReference= ruleSignalReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference731);
            iv_ruleSignalReference=ruleSignalReference();
            _fsp--;

             current =iv_ruleSignalReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference741); 

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
    // $ANTLR end entryRuleSignalReference


    // $ANTLR start ruleSignalReference
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:367:1: ruleSignalReference returns [EObject current=null] : ( RULE_ID ) ;
    public final EObject ruleSignalReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:372:6: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:373:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:373:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:376:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSignalReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalReference787); 

            		createLeafNode(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0(), "signal"); 
            	

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSignalReference


    // $ANTLR start entryRuleVariableReference
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:396:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:396:59: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:397:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference822);
            iv_ruleVariableReference=ruleVariableReference();
            _fsp--;

             current =iv_ruleVariableReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference832); 

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
    // $ANTLR end entryRuleVariableReference


    // $ANTLR start ruleVariableReference
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:404:1: ruleVariableReference returns [EObject current=null] : ( RULE_ID ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:409:6: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:410:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:410:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:413:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getVariableReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference878); 

            		createLeafNode(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0(), "variable"); 
            	

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariableReference


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:433:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:433:50: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:434:2: iv_ruleIntValue= ruleIntValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue913);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue923); 

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
    // $ANTLR end entryRuleIntValue


    // $ANTLR start ruleIntValue
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:441:1: ruleIntValue returns [EObject current=null] : (lv_value_0= RULE_INT ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:446:6: ( (lv_value_0= RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:447:1: (lv_value_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:447:1: (lv_value_0= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:449:6: lv_value_0= RULE_INT
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue969); 

            		createLeafNode(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), "value"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "INT", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIntValue


    // $ANTLR start entryRuleFloatValue
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:474:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:474:52: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:475:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1009);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1019); 

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
    // $ANTLR end entryRuleFloatValue


    // $ANTLR start ruleFloatValue
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:482:1: ruleFloatValue returns [EObject current=null] : (lv_value_0= RULE_FLOAT ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:487:6: ( (lv_value_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:488:1: (lv_value_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:488:1: (lv_value_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:490:6: lv_value_0= RULE_FLOAT
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue1065); 

            		createLeafNode(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0(), "value"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFloatValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "Float", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFloatValue


    // $ANTLR start entryRuleBooleanValue
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:515:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:515:54: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:516:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1105);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1115); 

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
    // $ANTLR end entryRuleBooleanValue


    // $ANTLR start ruleBooleanValue
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:523:1: ruleBooleanValue returns [EObject current=null] : (lv_value_0= RULE_BOOLEAN ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:528:6: ( (lv_value_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:529:1: (lv_value_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:529:1: (lv_value_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:531:6: lv_value_0= RULE_BOOLEAN
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue1161); 

            		createLeafNode(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0(), "value"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBooleanValueRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "Boolean", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanValue


    // $ANTLR start entryRuleHostCode
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:558:1: entryRuleHostCode returns [EObject current=null] : iv_ruleHostCode= ruleHostCode EOF ;
    public final EObject entryRuleHostCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostCode = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:558:50: (iv_ruleHostCode= ruleHostCode EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:559:2: iv_ruleHostCode= ruleHostCode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHostCodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleHostCode_in_entryRuleHostCode1203);
            iv_ruleHostCode=ruleHostCode();
            _fsp--;

             current =iv_ruleHostCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostCode1213); 

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
    // $ANTLR end entryRuleHostCode


    // $ANTLR start ruleHostCode
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:566:1: ruleHostCode returns [EObject current=null] : (lv_code_0= RULE_STRING ) ;
    public final EObject ruleHostCode() throws RecognitionException {
        EObject current = null;

        Token lv_code_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:571:6: ( (lv_code_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:572:1: (lv_code_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:572:1: (lv_code_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:574:6: lv_code_0= RULE_STRING
            {
            lv_code_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHostCode1259); 

            		createLeafNode(grammarAccess.getHostCodeAccess().getCodeSTRINGTerminalRuleCall_0(), "code"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getHostCodeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "code", lv_code_0, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleHostCode


    // $ANTLR start entryRuleValOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:599:1: entryRuleValOperation returns [EObject current=null] : iv_ruleValOperation= ruleValOperation EOF ;
    public final EObject entryRuleValOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:599:54: (iv_ruleValOperation= ruleValOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:600:2: iv_ruleValOperation= ruleValOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleValOperation_in_entryRuleValOperation1299);
            iv_ruleValOperation=ruleValOperation();
            _fsp--;

             current =iv_ruleValOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValOperation1309); 

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
    // $ANTLR end entryRuleValOperation


    // $ANTLR start ruleValOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:607:1: ruleValOperation returns [EObject current=null] : ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) ) ;
    public final EObject ruleValOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0 = null;

        EObject lv_subExpressions_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:612:6: ( ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:613:1: ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:613:1: ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:613:2: (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:613:2: (lv_operator_0= ruleValOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:616:6: lv_operator_0= ruleValOperator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValOperator_in_ruleValOperation1368);
            lv_operator_0=ruleValOperator();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getValOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "operator", lv_operator_0, "ValOperator", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:634:2: (lv_subExpressions_1= ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:637:6: lv_subExpressions_1= ruleSignalReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignalReference_in_ruleValOperation1406);
            lv_subExpressions_1=ruleSignalReference();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getValOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "subExpressions", lv_subExpressions_1, "SignalReference", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValOperation


    // $ANTLR start entryRuleValueExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:662:1: entryRuleValueExpression returns [EObject current=null] : iv_ruleValueExpression= ruleValueExpression EOF ;
    public final EObject entryRuleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:662:57: (iv_ruleValueExpression= ruleValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:663:2: iv_ruleValueExpression= ruleValueExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleValueExpression_in_entryRuleValueExpression1443);
            iv_ruleValueExpression=ruleValueExpression();
            _fsp--;

             current =iv_ruleValueExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpression1453); 

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
    // $ANTLR end entryRuleValueExpression


    // $ANTLR start ruleValueExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:670:1: ruleValueExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference ) ;
    public final EObject ruleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_ValOperation_2 = null;

        EObject this_VariableReference_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:675:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:676:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:676:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("676:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:677:5: this_IntValue_0= ruleIntValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValueExpression1500);
                    this_IntValue_0=ruleIntValue();
                    _fsp--;

                     
                            current = this_IntValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:687:5: this_FloatValue_1= ruleFloatValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleValueExpression1527);
                    this_FloatValue_1=ruleFloatValue();
                    _fsp--;

                     
                            current = this_FloatValue_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:697:5: this_ValOperation_2= ruleValOperation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getValOperationParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleValOperation_in_ruleValueExpression1554);
                    this_ValOperation_2=ruleValOperation();
                    _fsp--;

                     
                            current = this_ValOperation_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:707:5: this_VariableReference_3= ruleVariableReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getVariableReferenceParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleValueExpression1581);
                    this_VariableReference_3=ruleVariableReference();
                    _fsp--;

                     
                            current = this_VariableReference_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValueExpression


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:722:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:722:58: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:723:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1613);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;

             current =iv_ruleCompareOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation1623); 

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
    // $ANTLR end entryRuleCompareOperation


    // $ANTLR start ruleCompareOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:730:1: ruleCompareOperation returns [EObject current=null] : (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ValueExpression_0 = null;

        Enumerator lv_operator_2 = null;

        EObject lv_subExpressions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:735:6: ( (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:736:1: (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:736:1: (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:737:5: this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) )
            {
             
                    currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getValueExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleValueExpression_in_ruleCompareOperation1670);
            this_ValueExpression_0=ruleValueExpression();
            _fsp--;

             
                    current = this_ValueExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:745:1: ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:745:2: () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:745:2: ()
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:746:5: 
            {
             
                    temp=factory.create(grammarAccess.getCompareOperationAccess().getOperationSubExpressionsAction_1_0().getType().getClassifier());
                    try {
                    	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                    } catch(ValueConverterException vce) {
                    	handleValueConverterException(vce);
                    }
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getCompareOperationAccess().getOperationSubExpressionsAction_1_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:761:2: (lv_operator_2= ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:764:6: lv_operator_2= ruleCompareOperator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation1713);
            lv_operator_2=ruleCompareOperator();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompareOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "operator", lv_operator_2, "CompareOperator", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:782:2: (lv_subExpressions_3= ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:785:6: lv_subExpressions_3= ruleValueExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsValueExpressionParserRuleCall_1_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValueExpression_in_ruleCompareOperation1751);
            lv_subExpressions_3=ruleValueExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCompareOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "subExpressions", lv_subExpressions_3, "ValueExpression", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompareOperation


    // $ANTLR start entryRuleNotOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:810:1: entryRuleNotOperation returns [EObject current=null] : iv_ruleNotOperation= ruleNotOperation EOF ;
    public final EObject entryRuleNotOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:810:54: (iv_ruleNotOperation= ruleNotOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:811:2: iv_ruleNotOperation= ruleNotOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNotOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleNotOperation_in_entryRuleNotOperation1789);
            iv_ruleNotOperation=ruleNotOperation();
            _fsp--;

             current =iv_ruleNotOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperation1799); 

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
    // $ANTLR end entryRuleNotOperation


    // $ANTLR start ruleNotOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:818:1: ruleNotOperation returns [EObject current=null] : ( (lv_operator_0= ruleNotOperator ) (lv_subExpressions_1= ruleBooleanExpression ) ) ;
    public final EObject ruleNotOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0 = null;

        EObject lv_subExpressions_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:823:6: ( ( (lv_operator_0= ruleNotOperator ) (lv_subExpressions_1= ruleBooleanExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:824:1: ( (lv_operator_0= ruleNotOperator ) (lv_subExpressions_1= ruleBooleanExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:824:1: ( (lv_operator_0= ruleNotOperator ) (lv_subExpressions_1= ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:824:2: (lv_operator_0= ruleNotOperator ) (lv_subExpressions_1= ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:824:2: (lv_operator_0= ruleNotOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:827:6: lv_operator_0= ruleNotOperator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNotOperationAccess().getOperatorNotOperatorEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNotOperation1858);
            lv_operator_0=ruleNotOperator();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNotOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "operator", lv_operator_0, "NotOperator", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:845:2: (lv_subExpressions_1= ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:848:6: lv_subExpressions_1= ruleBooleanExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNotOperationAccess().getSubExpressionsBooleanExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleNotOperation1896);
            lv_subExpressions_1=ruleBooleanExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNotOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "subExpressions", lv_subExpressions_1, "BooleanExpression", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNotOperation


    // $ANTLR start entryRuleNotOrNormalExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:873:1: entryRuleNotOrNormalExpression returns [EObject current=null] : iv_ruleNotOrNormalExpression= ruleNotOrNormalExpression EOF ;
    public final EObject entryRuleNotOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrNormalExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:873:63: (iv_ruleNotOrNormalExpression= ruleNotOrNormalExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:874:2: iv_ruleNotOrNormalExpression= ruleNotOrNormalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNotOrNormalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleNotOrNormalExpression_in_entryRuleNotOrNormalExpression1933);
            iv_ruleNotOrNormalExpression=ruleNotOrNormalExpression();
            _fsp--;

             current =iv_ruleNotOrNormalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOrNormalExpression1943); 

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
    // $ANTLR end entryRuleNotOrNormalExpression


    // $ANTLR start ruleNotOrNormalExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:881:1: ruleNotOrNormalExpression returns [EObject current=null] : (this_NotOperation_0= ruleNotOperation | this_BooleanExpression_1= ruleBooleanExpression ) ;
    public final EObject ruleNotOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NotOperation_0 = null;

        EObject this_BooleanExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:886:6: ( (this_NotOperation_0= ruleNotOperation | this_BooleanExpression_1= ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:887:1: (this_NotOperation_0= ruleNotOperation | this_BooleanExpression_1= ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:887:1: (this_NotOperation_0= ruleNotOperation | this_BooleanExpression_1= ruleBooleanExpression )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_BOOLEAN)||LA8_0==15||LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("887:1: (this_NotOperation_0= ruleNotOperation | this_BooleanExpression_1= ruleBooleanExpression )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:888:5: this_NotOperation_0= ruleNotOperation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNotOrNormalExpressionAccess().getNotOperationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNotOperation_in_ruleNotOrNormalExpression1990);
                    this_NotOperation_0=ruleNotOperation();
                    _fsp--;

                     
                            current = this_NotOperation_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:898:5: this_BooleanExpression_1= ruleBooleanExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNotOrNormalExpressionAccess().getBooleanExpressionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleNotOrNormalExpression2017);
                    this_BooleanExpression_1=ruleBooleanExpression();
                    _fsp--;

                     
                            current = this_BooleanExpression_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNotOrNormalExpression


    // $ANTLR start entryRuleAndOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:913:1: entryRuleAndOperation returns [EObject current=null] : iv_ruleAndOperation= ruleAndOperation EOF ;
    public final EObject entryRuleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:913:54: (iv_ruleAndOperation= ruleAndOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:914:2: iv_ruleAndOperation= ruleAndOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAndOperation_in_entryRuleAndOperation2049);
            iv_ruleAndOperation=ruleAndOperation();
            _fsp--;

             current =iv_ruleAndOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperation2059); 

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
    // $ANTLR end entryRuleAndOperation


    // $ANTLR start ruleAndOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:921:1: ruleAndOperation returns [EObject current=null] : (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpression_3= ruleNotOrNormalExpression ) )* ) ;
    public final EObject ruleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrNormalExpression_0 = null;

        Enumerator lv_operator_2 = null;

        EObject lv_subExpression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:926:6: ( (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpression_3= ruleNotOrNormalExpression ) )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:927:1: (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpression_3= ruleNotOrNormalExpression ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:927:1: (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpression_3= ruleNotOrNormalExpression ) )* )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:928:5: this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpression_3= ruleNotOrNormalExpression ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getNotOrNormalExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation2106);
            this_NotOrNormalExpression_0=ruleNotOrNormalExpression();
            _fsp--;

             
                    current = this_NotOrNormalExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:936:1: ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpression_3= ruleNotOrNormalExpression ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:936:2: () (lv_operator_2= ruleOperatorAnd ) (lv_subExpression_3= ruleNotOrNormalExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:936:2: ()
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:937:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getAndOperationAccess().getOperationSubExpressionAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.add(temp, "subExpression", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getAndOperationAccess().getOperationSubExpressionAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:952:2: (lv_operator_2= ruleOperatorAnd )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:955:6: lv_operator_2= ruleOperatorAnd
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperatorAnd_in_ruleAndOperation2149);
            	    lv_operator_2=ruleOperatorAnd();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAndOperationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "operator", lv_operator_2, "OperatorAnd", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:973:2: (lv_subExpression_3= ruleNotOrNormalExpression )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:976:6: lv_subExpression_3= ruleNotOrNormalExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getSubExpressionNotOrNormalExpressionParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation2187);
            	    lv_subExpression_3=ruleNotOrNormalExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAndOperationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "subExpression", lv_subExpression_3, "NotOrNormalExpression", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAndOperation


    // $ANTLR start entryRuleOrOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1001:1: entryRuleOrOperation returns [EObject current=null] : iv_ruleOrOperation= ruleOrOperation EOF ;
    public final EObject entryRuleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1001:53: (iv_ruleOrOperation= ruleOrOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1002:2: iv_ruleOrOperation= ruleOrOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrOperation_in_entryRuleOrOperation2226);
            iv_ruleOrOperation=ruleOrOperation();
            _fsp--;

             current =iv_ruleOrOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperation2236); 

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
    // $ANTLR end entryRuleOrOperation


    // $ANTLR start ruleOrOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1009:1: ruleOrOperation returns [EObject current=null] : (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* ) ;
    public final EObject ruleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AndOperation_0 = null;

        Enumerator lv_operator_2 = null;

        EObject lv_subExpressions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1014:6: ( (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1015:1: (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1015:1: (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1016:5: this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation2283);
            this_AndOperation_0=ruleAndOperation();
            _fsp--;

             
                    current = this_AndOperation_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1024:1: ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1024:2: () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1024:2: ()
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1025:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getOrOperationAccess().getOperationSubExpressionsAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getOrOperationAccess().getOperationSubExpressionsAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1040:2: (lv_operator_2= ruleOperatorOr )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1043:6: lv_operator_2= ruleOperatorOr
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperatorOr_in_ruleOrOperation2326);
            	    lv_operator_2=ruleOperatorOr();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOrOperationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "operator", lv_operator_2, "OperatorOr", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1061:2: (lv_subExpressions_3= ruleAndOperation )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1064:6: lv_subExpressions_3= ruleAndOperation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation2364);
            	    lv_subExpressions_3=ruleAndOperation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOrOperationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "subExpressions", lv_subExpressions_3, "AndOperation", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOrOperation


    // $ANTLR start entryRuleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1089:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1089:59: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1090:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression2403);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression2413); 

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
    // $ANTLR end entryRuleBooleanExpression


    // $ANTLR start ruleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1097:1: ruleBooleanExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_SignalReference_1 = null;

        EObject this_CompareOperation_2 = null;

        EObject this_OrOperation_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1102:6: ( (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1103:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1103:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==EOF||LA11_2==RULE_ID||LA11_2==RULE_STRING||LA11_2==14||LA11_2==16||(LA11_2>=25 && LA11_2<=26)) ) {
                    alt11=2;
                }
                else if ( ((LA11_2>=19 && LA11_2<=23)) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1103:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case 18:
                {
                alt11=3;
                }
                break;
            case 15:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1103:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1104:5: this_BooleanValue_0= ruleBooleanValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleBooleanExpression2460);
                    this_BooleanValue_0=ruleBooleanValue();
                    _fsp--;

                     
                            current = this_BooleanValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1114:5: this_SignalReference_1= ruleSignalReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getSignalReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSignalReference_in_ruleBooleanExpression2487);
                    this_SignalReference_1=ruleSignalReference();
                    _fsp--;

                     
                            current = this_SignalReference_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1124:5: this_CompareOperation_2= ruleCompareOperation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getCompareOperationParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompareOperation_in_ruleBooleanExpression2514);
                    this_CompareOperation_2=ruleCompareOperation();
                    _fsp--;

                     
                            current = this_CompareOperation_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1133:6: ( '(' this_OrOperation_4= ruleOrOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1133:6: ( '(' this_OrOperation_4= ruleOrOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1133:7: '(' this_OrOperation_4= ruleOrOperation ')'
                    {
                    match(input,15,FOLLOW_15_in_ruleBooleanExpression2529); 

                            createLeafNode(grammarAccess.getBooleanExpressionAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrOperationParserRuleCall_3_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOrOperation_in_ruleBooleanExpression2551);
                    this_OrOperation_4=ruleOrOperation();
                    _fsp--;

                     
                            current = this_OrOperation_4; 
                            currentNode = currentNode.getParent();
                        
                    match(input,16,FOLLOW_16_in_ruleBooleanExpression2559); 

                            createLeafNode(grammarAccess.getBooleanExpressionAccess().getRightParenthesisKeyword_3_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanExpression


    // $ANTLR start entryRulePrimaryExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1157:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1157:59: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1158:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimaryExpressionRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2593);
            iv_rulePrimaryExpression=rulePrimaryExpression();
            _fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2603); 

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
    // $ANTLR end entryRulePrimaryExpression


    // $ANTLR start rulePrimaryExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1165:1: rulePrimaryExpression returns [EObject current=null] : this_BooleanExpression_0= ruleBooleanExpression ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1170:6: (this_BooleanExpression_0= ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1172:5: this_BooleanExpression_0= ruleBooleanExpression
            {
             
                    currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBooleanExpressionParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleBooleanExpression_in_rulePrimaryExpression2649);
            this_BooleanExpression_0=ruleBooleanExpression();
            _fsp--;

             
                    current = this_BooleanExpression_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimaryExpression


    // $ANTLR start ruleValOperator
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1189:1: ruleValOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1193:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1194:1: ( '?' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1194:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1194:3: '?'
            {
            match(input,18,FOLLOW_18_in_ruleValOperator2695); 

                    current = grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValOperator


    // $ANTLR start ruleCompareOperator
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1204:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1208:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1209:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1209:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt12=1;
                }
                break;
            case 20:
                {
                alt12=2;
                }
                break;
            case 21:
                {
                alt12=3;
                }
                break;
            case 22:
                {
                alt12=4;
                }
                break;
            case 23:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1209:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1209:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1209:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1209:4: '='
                    {
                    match(input,19,FOLLOW_19_in_ruleCompareOperator2737); 

                            current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1215:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1215:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1215:8: '<'
                    {
                    match(input,20,FOLLOW_20_in_ruleCompareOperator2752); 

                            current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1221:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1221:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1221:8: '<='
                    {
                    match(input,21,FOLLOW_21_in_ruleCompareOperator2767); 

                            current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1227:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1227:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1227:8: '>'
                    {
                    match(input,22,FOLLOW_22_in_ruleCompareOperator2782); 

                            current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1233:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1233:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1233:8: '>='
                    {
                    match(input,23,FOLLOW_23_in_ruleCompareOperator2797); 

                            current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompareOperator


    // $ANTLR start ruleNotOperator
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1243:1: ruleNotOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1247:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1248:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1248:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1248:3: 'not'
            {
            match(input,24,FOLLOW_24_in_ruleNotOperator2839); 

                    current = grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNotOperator


    // $ANTLR start ruleOperatorOr
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1258:1: ruleOperatorOr returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOperatorOr() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1262:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1263:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1263:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1263:3: 'or'
            {
            match(input,25,FOLLOW_25_in_ruleOperatorOr2880); 

                    current = grammarAccess.getOperatorOrAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getOperatorOrAccess().getOREnumLiteralDeclaration(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOperatorOr


    // $ANTLR start ruleOperatorAnd
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1273:1: ruleOperatorAnd returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleOperatorAnd() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1277:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1278:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1278:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1278:3: 'and'
            {
            match(input,26,FOLLOW_26_in_ruleOperatorAnd2921); 

                    current = grammarAccess.getOperatorAndAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getOperatorAndAccess().getANDEnumLiteralDeclaration(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOperatorAnd


 

    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAction129 = new BitSet(new long[]{0x000000000004C0F2L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAction164 = new BitSet(new long[]{0x000000000004C0F2L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAction207 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleAction222 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleAction256 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_ruleEffect407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission496 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleEmission509 = new BitSet(new long[]{0x00000000000480F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleEmission543 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEmission556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment648 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAssignment660 = new BitSet(new long[]{0x00000000000480F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleAssignment694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalReference787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_entryRuleHostCode1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostCode1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHostCode1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_entryRuleValOperation1299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValOperation1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperator_in_ruleValOperation1368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleValOperation1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_entryRuleValueExpression1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpression1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValueExpression1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleValueExpression1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_ruleValueExpression1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleValueExpression1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCompareOperation1670 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation1713 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCompareOperation1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperation_in_entryRuleNotOperation1789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperation1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotOperation1858 = new BitSet(new long[]{0x00000000000480F0L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleNotOperation1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrNormalExpression_in_entryRuleNotOrNormalExpression1933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOrNormalExpression1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperation_in_ruleNotOrNormalExpression1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleNotOrNormalExpression2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_entryRuleAndOperation2049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperation2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation2106 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOperatorAnd_in_ruleAndOperation2149 = new BitSet(new long[]{0x00000000010480F0L});
    public static final BitSet FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation2187 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_entryRuleOrOperation2226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperation2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation2283 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOperatorOr_in_ruleOrOperation2326 = new BitSet(new long[]{0x00000000010480F0L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation2364 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression2403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleBooleanExpression2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleBooleanExpression2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBooleanExpression2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBooleanExpression2529 = new BitSet(new long[]{0x00000000010480F0L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleBooleanExpression2551 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBooleanExpression2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rulePrimaryExpression2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleValOperator2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCompareOperator2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompareOperator2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCompareOperator2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCompareOperator2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCompareOperator2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleNotOperator2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOperatorOr2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOperatorAnd2921 = new BitSet(new long[]{0x0000000000000002L});

}