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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'/'", "','", "'('", "')'", "':='", "'?'", "'='", "'<'", "'<='", "'>'", "'>='", "'not'", "'or'", "'and'"
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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:81:1: ruleAction returns [EObject current=null] : ( (lv_isImmediate_0= '#' )? (lv_delay_1= RULE_INT )? (lv_trigger_2= ruleBooleanExpression )? ( '/' ( (lv_effects_4= ruleEffect ) ( ',' )? )* )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_0=null;
        Token lv_delay_1=null;
        EObject lv_trigger_2 = null;

        EObject lv_effects_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:86:6: ( ( (lv_isImmediate_0= '#' )? (lv_delay_1= RULE_INT )? (lv_trigger_2= ruleBooleanExpression )? ( '/' ( (lv_effects_4= ruleEffect ) ( ',' )? )* )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:87:1: ( (lv_isImmediate_0= '#' )? (lv_delay_1= RULE_INT )? (lv_trigger_2= ruleBooleanExpression )? ( '/' ( (lv_effects_4= ruleEffect ) ( ',' )? )* )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:87:1: ( (lv_isImmediate_0= '#' )? (lv_delay_1= RULE_INT )? (lv_trigger_2= ruleBooleanExpression )? ( '/' ( (lv_effects_4= ruleEffect ) ( ',' )? )* )? )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:87:2: (lv_isImmediate_0= '#' )? (lv_delay_1= RULE_INT )? (lv_trigger_2= ruleBooleanExpression )? ( '/' ( (lv_effects_4= ruleEffect ) ( ',' )? )* )?
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:87:2: (lv_isImmediate_0= '#' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
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
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:108:3: (lv_delay_1= RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_INT && LA2_1<=RULE_BOOLEAN)||LA2_1==14||LA2_1==16||LA2_1==19||LA2_1==25) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:110:6: lv_delay_1= RULE_INT
                    {
                    lv_delay_1=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAction165); 

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
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_BOOLEAN)||LA3_0==16||LA3_0==19||LA3_0==25) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:131:6: lv_trigger_2= ruleBooleanExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAction208);
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

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:149:3: ( '/' ( (lv_effects_4= ruleEffect ) ( ',' )? )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:149:4: '/' ( (lv_effects_4= ruleEffect ) ( ',' )? )*
                    {
                    match(input,14,FOLLOW_14_in_ruleAction223); 

                            createLeafNode(grammarAccess.getActionAccess().getSolidusKeyword_3_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:153:1: ( (lv_effects_4= ruleEffect ) ( ',' )? )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID||LA5_0==RULE_STRING) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:153:2: (lv_effects_4= ruleEffect ) ( ',' )?
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:153:2: (lv_effects_4= ruleEffect )
                    	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:156:6: lv_effects_4= ruleEffect
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_3_1_0_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEffect_in_ruleAction258);
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

                    	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:174:2: ( ',' )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==15) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:174:3: ','
                    	            {
                    	            match(input,15,FOLLOW_15_in_ruleAction272); 

                    	                    createLeafNode(grammarAccess.getActionAccess().getCommaKeyword_3_1_1(), null); 
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:185:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:185:48: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:186:2: iv_ruleEffect= ruleEffect EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEffectRule(), currentNode); 
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect311);
            iv_ruleEffect=ruleEffect();
            _fsp--;

             current =iv_ruleEffect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect321); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:193:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_HostCode_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:198:6: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:199:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:199:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==18) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||LA7_1==RULE_ID||LA7_1==RULE_STRING||(LA7_1>=15 && LA7_1<=16)) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("199:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("199:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:200:5: this_Emission_0= ruleEmission
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmission_in_ruleEffect368);
                    this_Emission_0=ruleEmission();
                    _fsp--;

                     
                            current = this_Emission_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:210:5: this_Assignment_1= ruleAssignment
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAssignment_in_ruleEffect395);
                    this_Assignment_1=ruleAssignment();
                    _fsp--;

                     
                            current = this_Assignment_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:220:5: this_HostCode_2= ruleHostCode
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEffectAccess().getHostCodeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHostCode_in_ruleEffect422);
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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:235:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:235:50: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:236:2: iv_ruleEmission= ruleEmission EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmissionRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission454);
            iv_ruleEmission=ruleEmission();
            _fsp--;

             current =iv_ruleEmission; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission464); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:243:1: ruleEmission returns [EObject current=null] : ( ( RULE_ID ) ( '(' (lv_newValue_2= ruleValueExpression ) ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        EObject lv_newValue_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:248:6: ( ( ( RULE_ID ) ( '(' (lv_newValue_2= ruleValueExpression ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:249:1: ( ( RULE_ID ) ( '(' (lv_newValue_2= ruleValueExpression ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:249:1: ( ( RULE_ID ) ( '(' (lv_newValue_2= ruleValueExpression ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:249:2: ( RULE_ID ) ( '(' (lv_newValue_2= ruleValueExpression ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:249:2: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:252:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmission511); 

            		createLeafNode(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0(), "signal"); 
            	

            }

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:265:2: ( '(' (lv_newValue_2= ruleValueExpression ) ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:265:3: '(' (lv_newValue_2= ruleValueExpression ) ')'
                    {
                    match(input,16,FOLLOW_16_in_ruleEmission524); 

                            createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:269:1: (lv_newValue_2= ruleValueExpression )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:272:6: lv_newValue_2= ruleValueExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueValueExpressionParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValueExpression_in_ruleEmission558);
                    lv_newValue_2=ruleValueExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "newValue", lv_newValue_2, "ValueExpression", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,17,FOLLOW_17_in_ruleEmission571); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:301:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:301:52: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:302:2: iv_ruleAssignment= ruleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment606);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment616); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:309:1: ruleAssignment returns [EObject current=null] : ( ( RULE_ID ) ':=' (lv_expression_2= ruleValueExpression ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:314:6: ( ( ( RULE_ID ) ':=' (lv_expression_2= ruleValueExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:315:1: ( ( RULE_ID ) ':=' (lv_expression_2= ruleValueExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:315:1: ( ( RULE_ID ) ':=' (lv_expression_2= ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:315:2: ( RULE_ID ) ':=' (lv_expression_2= ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:315:2: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:318:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment663); 

            		createLeafNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0(), "variable"); 
            	

            }

            match(input,18,FOLLOW_18_in_ruleAssignment675); 

                    createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:335:1: (lv_expression_2= ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:338:6: lv_expression_2= ruleValueExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionValueExpressionParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValueExpression_in_ruleAssignment709);
            lv_expression_2=ruleValueExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "expression", lv_expression_2, "ValueExpression", currentNode);
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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:363:1: entryRuleSignalReference returns [EObject current=null] : iv_ruleSignalReference= ruleSignalReference EOF ;
    public final EObject entryRuleSignalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:363:57: (iv_ruleSignalReference= ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:364:2: iv_ruleSignalReference= ruleSignalReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference746);
            iv_ruleSignalReference=ruleSignalReference();
            _fsp--;

             current =iv_ruleSignalReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference756); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:371:1: ruleSignalReference returns [EObject current=null] : ( RULE_ID ) ;
    public final EObject ruleSignalReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:376:6: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:377:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:377:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:380:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSignalReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalReference802); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:400:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:400:59: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:401:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference837);
            iv_ruleVariableReference=ruleVariableReference();
            _fsp--;

             current =iv_ruleVariableReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference847); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:408:1: ruleVariableReference returns [EObject current=null] : ( RULE_ID ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:413:6: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:414:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:414:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:417:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getVariableReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference893); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:441:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:441:50: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:442:2: iv_ruleIntValue= ruleIntValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue932);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue942); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:449:1: ruleIntValue returns [EObject current=null] : (lv_value_0= RULE_INT ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:454:6: ( (lv_value_0= RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:455:1: (lv_value_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:455:1: (lv_value_0= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:457:6: lv_value_0= RULE_INT
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue988); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:482:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:482:52: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:483:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue1028);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;

             current =iv_ruleFloatValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue1038); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:490:1: ruleFloatValue returns [EObject current=null] : (lv_value_0= RULE_FLOAT ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:495:6: ( (lv_value_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:496:1: (lv_value_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:496:1: (lv_value_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:498:6: lv_value_0= RULE_FLOAT
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue1084); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:523:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:523:54: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:524:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1124);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1134); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:531:1: ruleBooleanValue returns [EObject current=null] : (lv_value_0= RULE_BOOLEAN ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:536:6: ( (lv_value_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:537:1: (lv_value_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:537:1: (lv_value_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:539:6: lv_value_0= RULE_BOOLEAN
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue1180); 

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


    // $ANTLR start entryRuleValOperation
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:566:1: entryRuleValOperation returns [EObject current=null] : iv_ruleValOperation= ruleValOperation EOF ;
    public final EObject entryRuleValOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:566:54: (iv_ruleValOperation= ruleValOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:567:2: iv_ruleValOperation= ruleValOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleValOperation_in_entryRuleValOperation1222);
            iv_ruleValOperation=ruleValOperation();
            _fsp--;

             current =iv_ruleValOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValOperation1232); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:574:1: ruleValOperation returns [EObject current=null] : ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) ) ;
    public final EObject ruleValOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0 = null;

        EObject lv_subExpressions_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:579:6: ( ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:580:1: ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:580:1: ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:580:2: (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:580:2: (lv_operator_0= ruleValOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:583:6: lv_operator_0= ruleValOperator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValOperator_in_ruleValOperation1291);
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

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:601:2: (lv_subExpressions_1= ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:604:6: lv_subExpressions_1= ruleSignalReference
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignalReference_in_ruleValOperation1329);
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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:629:1: entryRuleValueExpression returns [EObject current=null] : iv_ruleValueExpression= ruleValueExpression EOF ;
    public final EObject entryRuleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:629:57: (iv_ruleValueExpression= ruleValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:630:2: iv_ruleValueExpression= ruleValueExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleValueExpression_in_entryRuleValueExpression1366);
            iv_ruleValueExpression=ruleValueExpression();
            _fsp--;

             current =iv_ruleValueExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpression1376); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:637:1: ruleValueExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference ) ;
    public final EObject ruleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_ValOperation_2 = null;

        EObject this_VariableReference_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:642:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:643:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:643:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt9=2;
                }
                break;
            case 19:
                {
                alt9=3;
                }
                break;
            case RULE_ID:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("643:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:644:5: this_IntValue_0= ruleIntValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValueExpression1423);
                    this_IntValue_0=ruleIntValue();
                    _fsp--;

                     
                            current = this_IntValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:654:5: this_FloatValue_1= ruleFloatValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleValueExpression1450);
                    this_FloatValue_1=ruleFloatValue();
                    _fsp--;

                     
                            current = this_FloatValue_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:664:5: this_ValOperation_2= ruleValOperation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getValOperationParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleValOperation_in_ruleValueExpression1477);
                    this_ValOperation_2=ruleValOperation();
                    _fsp--;

                     
                            current = this_ValOperation_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:674:5: this_VariableReference_3= ruleVariableReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getVariableReferenceParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleValueExpression1504);
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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:689:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:689:58: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:690:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1536);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;

             current =iv_ruleCompareOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation1546); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:697:1: ruleCompareOperation returns [EObject current=null] : (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ValueExpression_0 = null;

        Enumerator lv_operator_2 = null;

        EObject lv_subExpressions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:702:6: ( (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:703:1: (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:703:1: (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:704:5: this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) )
            {
             
                    currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getValueExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleValueExpression_in_ruleCompareOperation1593);
            this_ValueExpression_0=ruleValueExpression();
            _fsp--;

             
                    current = this_ValueExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:712:1: ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:712:2: () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:712:2: ()
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:713:5: 
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

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:728:2: (lv_operator_2= ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:731:6: lv_operator_2= ruleCompareOperator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation1636);
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

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:749:2: (lv_subExpressions_3= ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:752:6: lv_subExpressions_3= ruleValueExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsValueExpressionParserRuleCall_1_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValueExpression_in_ruleCompareOperation1674);
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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:777:1: entryRuleNotOperation returns [EObject current=null] : iv_ruleNotOperation= ruleNotOperation EOF ;
    public final EObject entryRuleNotOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:777:54: (iv_ruleNotOperation= ruleNotOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:778:2: iv_ruleNotOperation= ruleNotOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNotOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleNotOperation_in_entryRuleNotOperation1712);
            iv_ruleNotOperation=ruleNotOperation();
            _fsp--;

             current =iv_ruleNotOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperation1722); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:785:1: ruleNotOperation returns [EObject current=null] : ( (lv_operator_0= ruleNotOperator ) (lv_subExpressions_1= ruleParanthesedBooleanExpression ) ) ;
    public final EObject ruleNotOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0 = null;

        EObject lv_subExpressions_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:790:6: ( ( (lv_operator_0= ruleNotOperator ) (lv_subExpressions_1= ruleParanthesedBooleanExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:791:1: ( (lv_operator_0= ruleNotOperator ) (lv_subExpressions_1= ruleParanthesedBooleanExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:791:1: ( (lv_operator_0= ruleNotOperator ) (lv_subExpressions_1= ruleParanthesedBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:791:2: (lv_operator_0= ruleNotOperator ) (lv_subExpressions_1= ruleParanthesedBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:791:2: (lv_operator_0= ruleNotOperator )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:794:6: lv_operator_0= ruleNotOperator
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNotOperationAccess().getOperatorNotOperatorEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNotOperation1781);
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

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:812:2: (lv_subExpressions_1= ruleParanthesedBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:815:6: lv_subExpressions_1= ruleParanthesedBooleanExpression
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getNotOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_ruleNotOperation1819);
            lv_subExpressions_1=ruleParanthesedBooleanExpression();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNotOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "subExpressions", lv_subExpressions_1, "ParanthesedBooleanExpression", currentNode);
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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:840:1: entryRuleNotOrNormalExpression returns [EObject current=null] : iv_ruleNotOrNormalExpression= ruleNotOrNormalExpression EOF ;
    public final EObject entryRuleNotOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrNormalExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:840:63: (iv_ruleNotOrNormalExpression= ruleNotOrNormalExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:841:2: iv_ruleNotOrNormalExpression= ruleNotOrNormalExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNotOrNormalExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleNotOrNormalExpression_in_entryRuleNotOrNormalExpression1856);
            iv_ruleNotOrNormalExpression=ruleNotOrNormalExpression();
            _fsp--;

             current =iv_ruleNotOrNormalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOrNormalExpression1866); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:848:1: ruleNotOrNormalExpression returns [EObject current=null] : (this_NotOperation_0= ruleNotOperation | this_ParanthesedBooleanExpression_1= ruleParanthesedBooleanExpression ) ;
    public final EObject ruleNotOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NotOperation_0 = null;

        EObject this_ParanthesedBooleanExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:853:6: ( (this_NotOperation_0= ruleNotOperation | this_ParanthesedBooleanExpression_1= ruleParanthesedBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:854:1: (this_NotOperation_0= ruleNotOperation | this_ParanthesedBooleanExpression_1= ruleParanthesedBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:854:1: (this_NotOperation_0= ruleNotOperation | this_ParanthesedBooleanExpression_1= ruleParanthesedBooleanExpression )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_BOOLEAN)||LA10_0==16||LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("854:1: (this_NotOperation_0= ruleNotOperation | this_ParanthesedBooleanExpression_1= ruleParanthesedBooleanExpression )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:855:5: this_NotOperation_0= ruleNotOperation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNotOrNormalExpressionAccess().getNotOperationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNotOperation_in_ruleNotOrNormalExpression1913);
                    this_NotOperation_0=ruleNotOperation();
                    _fsp--;

                     
                            current = this_NotOperation_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:865:5: this_ParanthesedBooleanExpression_1= ruleParanthesedBooleanExpression
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNotOrNormalExpressionAccess().getParanthesedBooleanExpressionParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_ruleNotOrNormalExpression1940);
                    this_ParanthesedBooleanExpression_1=ruleParanthesedBooleanExpression();
                    _fsp--;

                     
                            current = this_ParanthesedBooleanExpression_1; 
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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:880:1: entryRuleAndOperation returns [EObject current=null] : iv_ruleAndOperation= ruleAndOperation EOF ;
    public final EObject entryRuleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:880:54: (iv_ruleAndOperation= ruleAndOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:881:2: iv_ruleAndOperation= ruleAndOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleAndOperation_in_entryRuleAndOperation1972);
            iv_ruleAndOperation=ruleAndOperation();
            _fsp--;

             current =iv_ruleAndOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperation1982); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:888:1: ruleAndOperation returns [EObject current=null] : (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpressions_3= ruleNotOrNormalExpression ) )* ) ;
    public final EObject ruleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrNormalExpression_0 = null;

        Enumerator lv_operator_2 = null;

        EObject lv_subExpressions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:893:6: ( (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpressions_3= ruleNotOrNormalExpression ) )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:894:1: (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpressions_3= ruleNotOrNormalExpression ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:894:1: (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpressions_3= ruleNotOrNormalExpression ) )* )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:895:5: this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpressions_3= ruleNotOrNormalExpression ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getNotOrNormalExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation2029);
            this_NotOrNormalExpression_0=ruleNotOrNormalExpression();
            _fsp--;

             
                    current = this_NotOrNormalExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:903:1: ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpressions_3= ruleNotOrNormalExpression ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:903:2: () (lv_operator_2= ruleOperatorAnd ) (lv_subExpressions_3= ruleNotOrNormalExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:903:2: ()
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:904:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getAndOperationAccess().getOperationSubExpressionsAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getAndOperationAccess().getOperationSubExpressionsAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:919:2: (lv_operator_2= ruleOperatorAnd )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:922:6: lv_operator_2= ruleOperatorAnd
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperatorAnd_in_ruleAndOperation2072);
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

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:940:2: (lv_subExpressions_3= ruleNotOrNormalExpression )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:943:6: lv_subExpressions_3= ruleNotOrNormalExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getSubExpressionsNotOrNormalExpressionParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation2110);
            	    lv_subExpressions_3=ruleNotOrNormalExpression();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAndOperationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "subExpressions", lv_subExpressions_3, "NotOrNormalExpression", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:968:1: entryRuleOrOperation returns [EObject current=null] : iv_ruleOrOperation= ruleOrOperation EOF ;
    public final EObject entryRuleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:968:53: (iv_ruleOrOperation= ruleOrOperation EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:969:2: iv_ruleOrOperation= ruleOrOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOrOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleOrOperation_in_entryRuleOrOperation2149);
            iv_ruleOrOperation=ruleOrOperation();
            _fsp--;

             current =iv_ruleOrOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperation2159); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:976:1: ruleOrOperation returns [EObject current=null] : (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* ) ;
    public final EObject ruleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AndOperation_0 = null;

        Enumerator lv_operator_2 = null;

        EObject lv_subExpressions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:981:6: ( (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:982:1: (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:982:1: (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:983:5: this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation2206);
            this_AndOperation_0=ruleAndOperation();
            _fsp--;

             
                    current = this_AndOperation_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:991:1: ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:991:2: () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:991:2: ()
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:992:5: 
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

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1007:2: (lv_operator_2= ruleOperatorOr )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1010:6: lv_operator_2= ruleOperatorOr
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperatorOr_in_ruleOrOperation2249);
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

            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1028:2: (lv_subExpressions_3= ruleAndOperation )
            	    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1031:6: lv_subExpressions_3= ruleAndOperation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation2287);
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
            	    break loop12;
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


    // $ANTLR start entryRuleParanthesedBooleanExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1056:1: entryRuleParanthesedBooleanExpression returns [EObject current=null] : iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF ;
    public final EObject entryRuleParanthesedBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParanthesedBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1056:70: (iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1057:2: iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParanthesedBooleanExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression2326);
            iv_ruleParanthesedBooleanExpression=ruleParanthesedBooleanExpression();
            _fsp--;

             current =iv_ruleParanthesedBooleanExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression2336); 

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
    // $ANTLR end entryRuleParanthesedBooleanExpression


    // $ANTLR start ruleParanthesedBooleanExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1064:1: ruleParanthesedBooleanExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) ) ;
    public final EObject ruleParanthesedBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_SignalReference_1 = null;

        EObject this_CompareOperation_2 = null;

        EObject this_OrOperation_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1069:6: ( (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1070:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1070:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==EOF||LA13_2==14||LA13_2==17||(LA13_2>=26 && LA13_2<=27)) ) {
                    alt13=2;
                }
                else if ( ((LA13_2>=20 && LA13_2<=24)) ) {
                    alt13=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1070:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case 19:
                {
                alt13=3;
                }
                break;
            case 16:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1070:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1071:5: this_BooleanValue_0= ruleBooleanValue
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleParanthesedBooleanExpression2383);
                    this_BooleanValue_0=ruleBooleanValue();
                    _fsp--;

                     
                            current = this_BooleanValue_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1081:5: this_SignalReference_1= ruleSignalReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSignalReference_in_ruleParanthesedBooleanExpression2410);
                    this_SignalReference_1=ruleSignalReference();
                    _fsp--;

                     
                            current = this_SignalReference_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1091:5: this_CompareOperation_2= ruleCompareOperation
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCompareOperation_in_ruleParanthesedBooleanExpression2437);
                    this_CompareOperation_2=ruleCompareOperation();
                    _fsp--;

                     
                            current = this_CompareOperation_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1100:6: ( '(' this_OrOperation_4= ruleOrOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1100:6: ( '(' this_OrOperation_4= ruleOrOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1100:7: '(' this_OrOperation_4= ruleOrOperation ')'
                    {
                    match(input,16,FOLLOW_16_in_ruleParanthesedBooleanExpression2452); 

                            createLeafNode(grammarAccess.getParanthesedBooleanExpressionAccess().getLeftParenthesisKeyword_3_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getOrOperationParserRuleCall_3_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOrOperation_in_ruleParanthesedBooleanExpression2474);
                    this_OrOperation_4=ruleOrOperation();
                    _fsp--;

                     
                            current = this_OrOperation_4; 
                            currentNode = currentNode.getParent();
                        
                    match(input,17,FOLLOW_17_in_ruleParanthesedBooleanExpression2482); 

                            createLeafNode(grammarAccess.getParanthesedBooleanExpressionAccess().getRightParenthesisKeyword_3_2(), null); 
                        

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
    // $ANTLR end ruleParanthesedBooleanExpression


    // $ANTLR start entryRuleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1124:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1124:59: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1125:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression2516);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression2526); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1132:1: ruleBooleanExpression returns [EObject current=null] : this_OrOperation_0= ruleOrOperation ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrOperation_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1137:6: (this_OrOperation_0= ruleOrOperation )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1139:5: this_OrOperation_0= ruleOrOperation
            {
             
                    currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrOperationParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleOrOperation_in_ruleBooleanExpression2572);
            this_OrOperation_0=ruleOrOperation();
            _fsp--;

             
                    current = this_OrOperation_0; 
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
    // $ANTLR end ruleBooleanExpression


    // $ANTLR start entryRuleHostCode
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1154:1: entryRuleHostCode returns [EObject current=null] : iv_ruleHostCode= ruleHostCode EOF ;
    public final EObject entryRuleHostCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostCode = null;


        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1154:50: (iv_ruleHostCode= ruleHostCode EOF )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1155:2: iv_ruleHostCode= ruleHostCode EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHostCodeRule(), currentNode); 
            pushFollow(FOLLOW_ruleHostCode_in_entryRuleHostCode2603);
            iv_ruleHostCode=ruleHostCode();
            _fsp--;

             current =iv_ruleHostCode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostCode2613); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1162:1: ruleHostCode returns [EObject current=null] : ( (lv_code_0= RULE_STRING ) ( '(' (lv_type_2= RULE_ID ) ')' )? ) ;
    public final EObject ruleHostCode() throws RecognitionException {
        EObject current = null;

        Token lv_code_0=null;
        Token lv_type_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1167:6: ( ( (lv_code_0= RULE_STRING ) ( '(' (lv_type_2= RULE_ID ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1168:1: ( (lv_code_0= RULE_STRING ) ( '(' (lv_type_2= RULE_ID ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1168:1: ( (lv_code_0= RULE_STRING ) ( '(' (lv_type_2= RULE_ID ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1168:2: (lv_code_0= RULE_STRING ) ( '(' (lv_type_2= RULE_ID ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1168:2: (lv_code_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1170:6: lv_code_0= RULE_STRING
            {
            lv_code_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHostCode2660); 

            		createLeafNode(grammarAccess.getHostCodeAccess().getCodeSTRINGTerminalRuleCall_0_0(), "code"); 
            	

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

            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1188:2: ( '(' (lv_type_2= RULE_ID ) ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1188:3: '(' (lv_type_2= RULE_ID ) ')'
                    {
                    match(input,16,FOLLOW_16_in_ruleHostCode2678); 

                            createLeafNode(grammarAccess.getHostCodeAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1192:1: (lv_type_2= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1194:6: lv_type_2= RULE_ID
                    {
                    lv_type_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHostCode2700); 

                    		createLeafNode(grammarAccess.getHostCodeAccess().getTypeIDTerminalRuleCall_1_1_0(), "type"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getHostCodeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_2, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,17,FOLLOW_17_in_ruleHostCode2717); 

                            createLeafNode(grammarAccess.getHostCodeAccess().getRightParenthesisKeyword_1_2(), null); 
                        

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
    // $ANTLR end ruleHostCode


    // $ANTLR start ruleValOperator
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1225:1: ruleValOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1229:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1230:1: ( '?' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1230:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1230:3: '?'
            {
            match(input,19,FOLLOW_19_in_ruleValOperator2767); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1240:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1244:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1245:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1245:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt15=1;
                }
                break;
            case 21:
                {
                alt15=2;
                }
                break;
            case 22:
                {
                alt15=3;
                }
                break;
            case 23:
                {
                alt15=4;
                }
                break;
            case 24:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1245:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1245:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1245:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1245:4: '='
                    {
                    match(input,20,FOLLOW_20_in_ruleCompareOperator2809); 

                            current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1251:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1251:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1251:8: '<'
                    {
                    match(input,21,FOLLOW_21_in_ruleCompareOperator2824); 

                            current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1257:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1257:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1257:8: '<='
                    {
                    match(input,22,FOLLOW_22_in_ruleCompareOperator2839); 

                            current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1263:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1263:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1263:8: '>'
                    {
                    match(input,23,FOLLOW_23_in_ruleCompareOperator2854); 

                            current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1269:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1269:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1269:8: '>='
                    {
                    match(input,24,FOLLOW_24_in_ruleCompareOperator2869); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1279:1: ruleNotOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1283:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1284:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1284:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1284:3: 'not'
            {
            match(input,25,FOLLOW_25_in_ruleNotOperator2911); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1294:1: ruleOperatorOr returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOperatorOr() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1298:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1299:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1299:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1299:3: 'or'
            {
            match(input,26,FOLLOW_26_in_ruleOperatorOr2952); 

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
    // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1309:1: ruleOperatorAnd returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleOperatorAnd() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1313:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1314:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1314:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.labelparser/src-gen/de/cau/cs/kieler/synccharts/parser/antlr/internal/InternalTransitionLabel.g:1314:3: 'and'
            {
            match(input,27,FOLLOW_27_in_ruleOperatorAnd2993); 

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
    public static final BitSet FOLLOW_13_in_ruleAction129 = new BitSet(new long[]{0x00000000020940F2L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAction165 = new BitSet(new long[]{0x00000000020940F2L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAction208 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleAction223 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleAction258 = new BitSet(new long[]{0x0000000000008122L});
    public static final BitSet FOLLOW_15_in_ruleAction272 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_ruleEffect422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission511 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleEmission524 = new BitSet(new long[]{0x0000000000080070L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleEmission558 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEmission571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment663 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssignment675 = new BitSet(new long[]{0x0000000000080070L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleAssignment709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalReference802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_entryRuleValOperation1222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValOperation1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperator_in_ruleValOperation1291 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleValOperation1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_entryRuleValueExpression1366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpression1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValueExpression1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleValueExpression1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_ruleValueExpression1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleValueExpression1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCompareOperation1593 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation1636 = new BitSet(new long[]{0x0000000000080070L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCompareOperation1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperation_in_entryRuleNotOperation1712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperation1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotOperation1781 = new BitSet(new long[]{0x00000000000900F0L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_ruleNotOperation1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrNormalExpression_in_entryRuleNotOrNormalExpression1856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOrNormalExpression1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperation_in_ruleNotOrNormalExpression1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_ruleNotOrNormalExpression1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_entryRuleAndOperation1972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperation1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation2029 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOperatorAnd_in_ruleAndOperation2072 = new BitSet(new long[]{0x00000000020900F0L});
    public static final BitSet FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation2110 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_entryRuleOrOperation2149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperation2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation2206 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOperatorOr_in_ruleOrOperation2249 = new BitSet(new long[]{0x00000000020900F0L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation2287 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression2326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleParanthesedBooleanExpression2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleParanthesedBooleanExpression2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleParanthesedBooleanExpression2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleParanthesedBooleanExpression2452 = new BitSet(new long[]{0x00000000020900F0L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleParanthesedBooleanExpression2474 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleParanthesedBooleanExpression2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression2516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleBooleanExpression2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_entryRuleHostCode2603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostCode2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHostCode2660 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleHostCode2678 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHostCode2700 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHostCode2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleValOperator2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompareOperator2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCompareOperator2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCompareOperator2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCompareOperator2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCompareOperator2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleNotOperator2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOperatorOr2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOperatorAnd2993 = new BitSet(new long[]{0x0000000000000002L});

}